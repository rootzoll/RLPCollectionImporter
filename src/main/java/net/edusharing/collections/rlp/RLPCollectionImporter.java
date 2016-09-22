package net.edusharing.collections.rlp;

import java.io.File;
import java.util.List;
import java.util.Vector;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.COLLECTIONVApi;
import io.swagger.client.model.Collection;
import io.swagger.client.model.CollectionEntry;
import io.swagger.client.model.NodeRef;
import net.edusharing.collections.rlp.xmlclasses.Competenceareatype;
import net.edusharing.collections.rlp.xmlclasses.Competencetype;
import net.edusharing.collections.rlp.xmlclasses.Fachtype;
import net.edusharing.collections.rlp.xmlclasses.Standardtype;
import net.edusharing.collections.rlp.xmlclasses.Stufentype;
import net.edusharing.collections.rlp.xmlclasses.Textcontent;
import net.edusharing.collections.rlp.xmlclasses.Themainhalttype;

public class RLPCollectionImporter {

	static ApiClient apiClient;
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		
		/*
		 * Configuration
		 */
		
		// the file path where the XML data of the RLP is
		final String basePathDataXML = "src/main/java/net/edusharing/collections/rlp/xmldata2/";
		
		// the URL of the edu-sharing repository where to import the data
		
		/*
		final String username = "admin";
		final String password = "admin";
		final String eduSharingApiURL = "http://alfresco5.vm:8080/edu-sharing/rest";
		final String lehrplanCollectionId = null; 
		*/

		final String username = "admin";
		final String password = "admin";
		final String eduSharingApiURL = "http://appserver7.metaventis.com:7117/edu-sharing/rest";
		final String lehrplanCollectionId = "ab7332e7-c273-4674-a067-189469943889"; 
		
		
		/*
		 * Init API client
		 */
		
		apiClient = Configuration.getDefaultApiClient();
		apiClient.setPassword(password);
		apiClient.setUsername(username);
		apiClient.setBasePath(eduSharingApiURL);
		
		/*
		 * load xml data
		 * Get all the single "fach" XML files from directory
		 */
        
        // check if folder exists and is valid
        File xmlFolder = new File(basePathDataXML);
        if ((!xmlFolder.exists())) {
        	System.err.println("FAIL - The path '"+basePathDataXML+"' to find XML data does not exist. EXIT");
        	System.exit(-1);
        }
        if (!xmlFolder.isDirectory()) {
        	System.err.println("FAIL - The path '"+basePathDataXML+"' to find XML is no directory. EXIT");
        	System.exit(-1);	
        }
        
        // get all XML files from folder
        System.out.println("**** Chech Data Directory *****");
        File[] directoryFiles = xmlFolder.listFiles();
        Vector<File> xmlFiles = new Vector<File>();
        for (int i=0; i<directoryFiles.length; i++) {
        	File file = directoryFiles[i];
        	System.out.print("Found File: "+file.getName());
        	if (file.getName().toLowerCase().endsWith(".xml")) {
        		xmlFiles.add(file);
            	System.out.println(" YES XML --> MARK FOR PROCESSING");		
        	} else {
            	System.out.println(" NO XML --> IGNORE");	
        	}
        }
        
        // check if any results
        if (xmlFiles.size()==0) {
        	System.err.println("FAIL - In path '"+basePathDataXML+"' no XML files found. EXIT");
        	System.exit(-1);	
        }
        
        // check which XML files are from type "Fach"
        System.out.println("**** XML Conversion *****");
	    JAXBContext jc = JAXBContext.newInstance(Fachtype.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Vector<Fachtype> faecher = new Vector<Fachtype>();
        for (File file : xmlFiles) {
			try {
		        Fachtype fach = (Fachtype) unmarshaller.unmarshal(new File(basePathDataXML+file.getName()));
            	System.out.println("OK '"+file.getName()+"' --> Found XML for Fach '"+fach.getTitle()+"'");
            	faecher.add(fach);
			} catch (Exception e) {
            	System.out.println("FAIL '"+file.getName()+"' --> NOT A FACH XML");
            	//e.printStackTrace();
			}
		}
        
        // check if any results
        if (faecher.size()==0) {
        	System.err.println("FAIL - In path '"+basePathDataXML+"' no XML are from type Fach. EXIT");
        	System.exit(-1);	
        }
        
        
        /*
         * tranverse curriculum and create collections with sub collections  	
         */
        
        NodeRef lehrplanCollectionRef = null;
        if (lehrplanCollectionId==null) {
        	System.out.println("CREATING NEW LEHRPLAN COLLECTION");
        	lehrplanCollectionRef = createCollection(null, "Lehrplan Berlin-Brandenburg", null, "Hackathon Prototype by Henry Freye and Christian Rotzoll");
        } else {
        	System.out.println("ADDING TO EXISTING LEHRPLAN COLLECTION");
        	lehrplanCollectionRef = new NodeRef();
        	lehrplanCollectionRef.setId(lehrplanCollectionId);
        	lehrplanCollectionRef.setRepo("-home-");
        }
        
        int count = 0;
        for (Fachtype fach : faecher) {
        	
        	count++;
        	
        	NodeRef fachCollectionRef = createCollection(lehrplanCollectionRef, fach.getTitle(), fach.getId(), "Fach");
			if (fachCollectionRef==null) continue;
        	
        	for (Competenceareatype area : fach.getC2().getArea()) {
        		
        		NodeRef areaCollectionRef = createCollection(fachCollectionRef, area.getName(), area.getId(), "Kompetenzbereich");
				if (areaCollectionRef==null) continue;
        		
        		// create direct competences if available
        		processCompetences(areaCollectionRef, area.getCompetence());
        		
        		// go into sub areas if available
            	if (area.getSubarea()!=null) for (Competenceareatype subarea : area.getSubarea()) {
            		
            		NodeRef subAreaCollectionRef = createCollection(areaCollectionRef, subarea.getName(), subarea.getId(), "Unterkompetenzbereich");
    				if (subAreaCollectionRef==null) continue;
            		
            		// create sub area competences if available
            		processCompetences(subAreaCollectionRef, subarea.getCompetence());
            		
            	}
            		
            }
        	
        	// also take the 
        	for (Themainhalttype inhalt : fach.getC3().getThemainhalt()) {
        		
        		processThemainhalt(fachCollectionRef, inhalt, 0);
        		
        	}
        	
		}		

	}
	
	private static void processThemainhalt(NodeRef parentRef, Themainhalttype inhalt, int recursiveLevel) {
		
		if (recursiveLevel>10) {
			System.err.println("TOO MUCH Recursion - SAFTY EXIT");
			System.exit(0);
		}
		
		// concatenate all contents to description
		String desc = "";
		for (String cont : inhalt.getContent()) desc += (" " + cont);
		desc = desc.trim();
		
		NodeRef newCollectionRef = createCollection(parentRef, inhalt.getTitle(), inhalt.getId(), desc);
		
		for (Themainhalttype subInhalt : inhalt.getInhalt()) {
			processThemainhalt(newCollectionRef, subInhalt, recursiveLevel+1);
		}
		
	}
	
	private static NodeRef createCollection(NodeRef parentRef, String name, String id, String desc) {

		// if a name is not set - dont make an extra collection
		if ((name==null) || (name.trim().length()==0)) return parentRef;
				
		// create full description
		String description = "";
		if (id!=null) description += "("+id+") ";
		if (desc!=null) description += desc;
		
		// set data on collection
		Collection col = new Collection();
		col.setTitle(name);
		col.setDescription(description);
		
		// try to create collection
		try{
			
			// courtesy delay
			try {
				Thread.sleep(250);
			} catch (Exception e) {}
			
			String repo = "-home-";
			String nodeId = "-root-";
			
			if (parentRef!=null) nodeId = parentRef.getId();

			System.out.println("**** created *******************************");
			System.out.println("COLLECTION '"+name+"'"); 
			System.out.println(description); 
			
			CollectionEntry entry = new COLLECTIONVApi(apiClient).createCollection(repo, nodeId ,col);
			
			return entry.getCollection().getRef();
			
		}catch(ApiException e){
			e.printStackTrace();
			return null;
		}
		
	}
	
	private static void processCompetences(NodeRef parent, List<Competencetype> list) {
		
		if ((list!=null) && (list.size()>0)) {
			
			for (Competencetype competence : list) {
				
				NodeRef competenceCollectionRef =  createCollection(parent, competence.getName(), competence.getId(), "Kompetenz");
				if (competenceCollectionRef==null) continue;
				
				for (Stufentype stufe : competence.getStufe()) {
					
					String stufenDescription = getDescription(stufe.getLevel());
					NodeRef stufenCollectionRef = createCollection(competenceCollectionRef, stufe.getLevel(), stufe.getId(), stufenDescription);
					if (stufenCollectionRef==null) continue;
					
					int number = 0;
					for (Standardtype standard : stufe.getStandard()) {
						
						number++;
						if (createCollection(stufenCollectionRef, "Standard "+number, standard.getId(), standard.getContent()) == null) continue;
						
					}
					
				}
				
			}
			
		}
	
	}
	
	/*
     * Beschreibungstexte für die Stufen
     */
    private static String getDescription (String level){
    	String descr = "";
    	if (level.contains("A")){ 
    		descr += "Die Niveaustufe A orientiert sich an einem Niveau, das Schülerinnen und Schüler im Allgemeinen am Ende der Jahrgangsstufe 1 erreichen. ";
    	}
    	if (level.contains("B")){ 
    		descr += "Die Niveaustufe B orientiert sich an einem Niveau, das Schülerinnen und Schüler im Allgemeinen am Ende der Schuleingansphase erreichen. ";
    	}
    	if (level.contains("C")){ 
    		descr += "Die Niveaustufe C orientiert sich an einem Niveau, das Schülerinnen und Schüler im Allgemeinen am Ende der Jahrgangsstufe 4 erreichen. ";
    	}
    	if (level.contains("D")){ 
    		descr += "Die Niveaustufe D orientiert sich an einem Niveau, das Schülerinnen und Schüler im Allgemeinen am Ende der Jahrgangsstufe 6 erreichen. ";
    	}
    	if (level.contains("E")){ 
    		descr += "Die Niveaustufe E orientiert sich an einem Niveau, das Schülerinnen und Schüler im Allgemeinen am Ende der Jahrgangsstufe 8 erreichen. ";
    	}
    	if (level.contains("F")){ 
    		descr += "Die Niveaustufe F orientiert sich an einem Niveau, das Schülerinnen und Schüler im Allgemeinen am Ende der Jahrgangsstufe 9 erreichen. (Entsprechend KMK-Standards für Hauptschulabschluss) ";
    	}
    	if (level.contains("G")){ 
    		descr += "Die Niveaustufe G orientiert sich an einem Niveau, das Schülerinnen und Schüler im Allgemeinen am Ende der Jahrgangsstufe 10 erreichen. (Entsprechend KMK-Standards für den MSA) ";
    	}
    	if (level.contains("H")){ 
    		descr += "Die Niveaustufe H orientiert sich an einem Niveau orientieren, das Schülerinnen und Schüler am Gymnasium im Allgemeinen am Ende der Jahrgangsstufe 10 erreichen. (orientiert sich an den Eingangsvoraussetzungen der Rahmenlehrpläne für die gymnasiale Oberstufe) ";
    	}
    	return descr;   	
    }

}
