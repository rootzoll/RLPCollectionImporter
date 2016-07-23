/**
 * edu-sharing Repository REST API
 * The public restful API of the edu-sharing repository.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ErrorResponse;
import io.swagger.client.model.Collection;
import io.swagger.client.model.CollectionEntry;
import io.swagger.client.model.CollectionEntries;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for COLLECTIONVApi
 */
public class COLLECTIONVApiTest {

    private final COLLECTIONVApi api = new COLLECTIONVApi();

    
    /**
     * Add a node to a collection.
     *
     * Add a node to a collection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addToCollectionTest() throws ApiException {
        String repository = null;
        String collection = null;
        String node = null;
        // api.addToCollection(repository, collection, node);

        // TODO: test validations
    }
    
    /**
     * Create a new collection.
     *
     * Create a new collection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCollectionTest() throws ApiException {
        String repository = null;
        String collection = null;
        Collection body = null;
        // CollectionEntry response = api.createCollection(repository, collection, body);

        // TODO: test validations
    }
    
    /**
     * Delete a collection.
     *
     * Delete a collection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteCollectionTest() throws ApiException {
        String repository = null;
        String collection = null;
        // api.deleteCollection(repository, collection);

        // TODO: test validations
    }
    
    /**
     * Delete a node from a collection.
     *
     * Delete a node from a collection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFromCollectionTest() throws ApiException {
        String repository = null;
        String collection = null;
        String node = null;
        // api.deleteFromCollection(repository, collection, node);

        // TODO: test validations
    }
    
    /**
     * Get a collection.
     *
     * Get a collection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCollectionTest() throws ApiException {
        String repository = null;
        String collection = null;
        // CollectionEntry response = api.getCollection(repository, collection);

        // TODO: test validations
    }
    
    /**
     * Get collections.
     *
     * Get collections.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCollectionsTest() throws ApiException {
        String repository = null;
        String collection = null;
        String scope = null;
        // CollectionEntries response = api.getCollections(repository, collection, scope);

        // TODO: test validations
    }
    
    /**
     * Update a collection.
     *
     * Update a collection.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCollectionTest() throws ApiException {
        String repository = null;
        Collection body = null;
        // api.updateCollection(repository, body);

        // TODO: test validations
    }
    
}
