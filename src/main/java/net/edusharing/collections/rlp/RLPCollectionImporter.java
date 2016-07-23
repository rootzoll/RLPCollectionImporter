package net.edusharing.collections.rlp;

import java.io.File;
import java.util.Iterator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.COLLECTIONVApi;
import io.swagger.client.model.Collection;
import io.swagger.client.model.CollectionEntries;
import net.edusharing.collections.rlp.xml.Rlp110Type;

public class RLPCollectionImporter {

	public static void main(String[] args) throws Exception {
		
	    JAXBContext jc = JAXBContext.newInstance(Rlp110Type.class);

        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Rlp110Type rlp = (Rlp110Type) unmarshaller.unmarshal(new File("src/main/java/net/edusharing/collections/rlp/rlp110.xml"));

        /*
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(rlp, System.out);
        */
        
        System.out.println(rlp.getA().getKapitel().get(0).getId());
		
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

}
