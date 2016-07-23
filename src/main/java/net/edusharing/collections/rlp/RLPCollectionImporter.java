package net.edusharing.collections.rlp;

import java.util.Iterator;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.COLLECTIONVApi;
import io.swagger.client.model.Collection;
import io.swagger.client.model.CollectionEntries;
import io.swagger.client.model.CollectionEntry;

public class RLPCollectionImporter {

	public static void main(String[] args) {
		
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
