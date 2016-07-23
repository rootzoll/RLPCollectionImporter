package net.edusharing.collections.rlp;

import java.awt.geom.Area;
import java.io.File;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.COLLECTIONVApi;
import io.swagger.client.model.Collection;
import io.swagger.client.model.CollectionEntries;
import io.swagger.client.model.CollectionEntry;
import io.swagger.client.model.NodeRef;
import net.edusharing.collections.rlp.xml.Competenceareatype;
import net.edusharing.collections.rlp.xml.Competencetype;
import net.edusharing.collections.rlp.xml.Fachtype;
import net.edusharing.collections.rlp.xml.Rlp110Type;
import net.edusharing.collections.rlp.xml.Standardtype;
import net.edusharing.collections.rlp.xml.Stufentype;

public class RLPCollectionImporter {

	static ApiClient apiClient;
	
	public static void main(String[] args) throws Exception {
		
		/*
		 * Init API client
		 */
		
		apiClient = Configuration.getDefaultApiClient();
		apiClient.setPassword("admin");
		apiClient.setUsername("admin");
		apiClient.setBasePath("http://repo1.edu-sharing.net:7111/edu-sharing/rest");
		
	
		/*
		 * load xml data
		 */
		
	    JAXBContext jc = JAXBContext.newInstance(Rlp110Type.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Rlp110Type rlp = (Rlp110Type) unmarshaller.unmarshal(new File("src/main/java/net/edusharing/collections/rlp/rlp110.xml"));


        /*
         * tranverse curriculum and create collections with sub collections  	
         */
        
        
        NodeRef lehrplanCollectionRef = createCollection(null, "Lehrplan BB", null, "Lehrplan Berlin-Brandenburg");
        
        for (Fachtype fach : rlp.getC().getFach()) {
        	
        	NodeRef fachCollectionRef = createCollection(lehrplanCollectionRef, fach.getTitle(), fach.getId(), "Fach");
        	
        	for (Competenceareatype area : fach.getC2().getArea()) {
        		
        		NodeRef areaCollectionRef = createCollection(fachCollectionRef, area.getName(), area.getId(), "Kompetenzbereich");
        		
        		// create direct competences if available
        		processCompetences(areaCollectionRef, area.getCompetence());
        		
        		// go into sub areas if available
            	if (area.getSubarea()!=null) for (Competenceareatype subarea : area.getSubarea()) {
            		
            		NodeRef subAreaCollectionRef = createCollection(areaCollectionRef, subarea.getName(), subarea.getId(), "Unterkompetenzbereich");
            		
            		// create sub area competences if available
            		processCompetences(subAreaCollectionRef, subarea.getCompetence());
            		
            	}
            		
            }
        	
		}		

	}
	
	private static NodeRef createCollection(NodeRef parentRef, String name, String id, String desc) {

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
			
			String repo = "-home-";
			String nodeId = "-root-";
			
			if (parentRef!=null) nodeId = parentRef.getId();
			
			CollectionEntry entry = new COLLECTIONVApi(apiClient).createCollection(repo, nodeId ,col);

			System.out.println("**** created *******************************");
			System.out.println("COLLECTION '"+name+"'"); 
			System.out.println(description); 
			
			return entry.getCollection().getRef();
			
		}catch(ApiException e){
			e.printStackTrace();
			System.exit(-1);
			return null;
		}
		
	}
	
	private static void processCompetences(NodeRef parent, List<Competencetype> list) {
		
		if ((list!=null) && (list.size()>0)) {
			
			for (Competencetype competence : list) {
				
				NodeRef competenceCollectionRef = createCollection(parent, competence.getName(), competence.getId(), "Kompetenz");
				
				for (Stufentype stufe : competence.getStufe()) {
					
					NodeRef stufenCollectionRef = createCollection(competenceCollectionRef, stufe.getLevel(), stufe.getId(), "Kompetenzstufe");
					
					int number = 0;
					for (Standardtype standard : stufe.getStandard()) {
						
						number++;
						createCollection(stufenCollectionRef, "Standard "+number, standard.getId(), standard.getContent());
						
					}
					
				}
				
			}
			
		}
	
	}

}
