package net.edusharing.collections.rlpcollection;

import main.java.io.swagger.client.ApiClient;
import main.java.io.swagger.client.ApiException;
import main.java.io.swagger.client.Configuration;
import main.java.io.swagger.client.api.COLLECTIONVApi;
import main.java.io.swagger.client.model.Collection;
import main.java.io.swagger.client.model.CollectionEntry;

public class RLPCollectionImporter {

	public static void main(String[] args) {

		Collection col = new Collection();
		col.setTitle("swaggerstubtest");
		col.setDescription("my description");
		try{
			ApiClient apiClient = Configuration.getDefaultApiClient();
			apiClient.setPassword("admin");
			apiClient.setUsername("admin");
			
			apiClient.setBasePath("http://localhost:8080/edu-sharing/rest");
			CollectionEntry entry = new COLLECTIONVApi(apiClient).createCollection("-home-", "-root-",col);
			System.out.println(entry.getCollection().getTitle());
			//new COLLECTIONVApi(apiClient).getCollection("-home-", "514bef3c-c5b2-4061-beb9-8c3cc7051239");
		}catch(ApiException e){
			e.printStackTrace();
		}
		
	}

}
