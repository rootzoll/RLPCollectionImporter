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
import io.swagger.client.model.NodeRef;
import net.edusharing.collections.rlp.xml.Competenceareatype;
import net.edusharing.collections.rlp.xml.Competencetype;
import net.edusharing.collections.rlp.xml.Fachtype;
import net.edusharing.collections.rlp.xml.Rlp110Type;
import net.edusharing.collections.rlp.xml.Standardtype;
import net.edusharing.collections.rlp.xml.Stufentype;

public class RLPCollectionImporter {

	public static void main(String[] args) throws Exception {
		
	    JAXBContext jc = JAXBContext.newInstance(Rlp110Type.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Rlp110Type rlp = (Rlp110Type) unmarshaller.unmarshal(new File("src/main/java/net/edusharing/collections/rlp/rlp110.xml"));


        /*
         * tranverse curriculum and create collections with sub collections  	
         */
        
        for (Fachtype fach : rlp.getC().getFach()) {
        	
        	NodeRef fachCollectionRef = createCollection(null, fach.getTitle(), fach.getId(), "Fach");
        	
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
        
		/*
		 *  connection to edu-sharing
		 */
		
		try{
			ApiClient apiClient = Configuration.getDefaultApiClient();
			apiClient.setPassword("admin");
			apiClient.setUsername("admin");
			apiClient.setBasePath("http://repo1.edu-sharing.net:7111/edu-sharing/rest");
			
			CollectionEntries collections = new COLLECTIONVApi(apiClient).getCollections("-home-", "-root-", "EDU_ALL");

			Iterator<Collection> intItr = collections.getCollections().iterator();
			while(intItr.hasNext())  {
			   System.out.println("root collection in edu-sharing: " + intItr.next().getTitle());
			}
			
		}catch(ApiException e){
			e.printStackTrace();
		}
	}
	
	private static NodeRef createCollection(NodeRef parentRef, String name, String id, String desc) {
		if (desc==null) desc = "";
		System.out.println("*******************************");
		System.out.println("COLLECTION '"+name+"'"); 
		System.out.println("("+id+") '"+desc+"'"); 
		return null;
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
