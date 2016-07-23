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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.swagger.client.model.ErrorResponse;
import io.swagger.client.model.MdsEntry;
import io.swagger.client.model.MdsEntries;
import io.swagger.client.model.ValueParameters;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MDSVApi {
    private ApiClient apiClient;

    public MDSVApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MDSVApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getMetadataSet */
    private com.squareup.okhttp.Call getMetadataSetCall(String repository, String metadataset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'repository' is set
        if (repository == null) {
            throw new ApiException("Missing the required parameter 'repository' when calling getMetadataSet(Async)");
        }
        
        // verify the required parameter 'metadataset' is set
        if (metadataset == null) {
            throw new ApiException("Missing the required parameter 'metadataset' when calling getMetadataSet(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/mds/v1/metadatasets/{repository}/{metadataset}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "repository" + "\\}", apiClient.escapeString(repository.toString()))
        .replaceAll("\\{" + "metadataset" + "\\}", apiClient.escapeString(metadataset.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get metadata set.
     * Get metadata set.
     * @param repository ID of repository (or \&quot;-home-\&quot; for home repository) (required)
     * @param metadataset ID of metadataset (or \&quot;-default-\&quot; for default metadata set) (required)
     * @return MdsEntry
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MdsEntry getMetadataSet(String repository, String metadataset) throws ApiException {
        ApiResponse<MdsEntry> resp = getMetadataSetWithHttpInfo(repository, metadataset);
        return resp.getData();
    }

    /**
     * Get metadata set.
     * Get metadata set.
     * @param repository ID of repository (or \&quot;-home-\&quot; for home repository) (required)
     * @param metadataset ID of metadataset (or \&quot;-default-\&quot; for default metadata set) (required)
     * @return ApiResponse&lt;MdsEntry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MdsEntry> getMetadataSetWithHttpInfo(String repository, String metadataset) throws ApiException {
        com.squareup.okhttp.Call call = getMetadataSetCall(repository, metadataset, null, null);
        Type localVarReturnType = new TypeToken<MdsEntry>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get metadata set. (asynchronously)
     * Get metadata set.
     * @param repository ID of repository (or \&quot;-home-\&quot; for home repository) (required)
     * @param metadataset ID of metadataset (or \&quot;-default-\&quot; for default metadata set) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMetadataSetAsync(String repository, String metadataset, final ApiCallback<MdsEntry> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getMetadataSetCall(repository, metadataset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MdsEntry>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getMetadataSets */
    private com.squareup.okhttp.Call getMetadataSetsCall(String repository, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'repository' is set
        if (repository == null) {
            throw new ApiException("Missing the required parameter 'repository' when calling getMetadataSets(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/mds/v1/metadatasets/{repository}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "repository" + "\\}", apiClient.escapeString(repository.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get metadata sets of repository.
     * Get metadata sets of repository.
     * @param repository ID of repository (or \&quot;-home-\&quot; for home repository) (required)
     * @return MdsEntries
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MdsEntries getMetadataSets(String repository) throws ApiException {
        ApiResponse<MdsEntries> resp = getMetadataSetsWithHttpInfo(repository);
        return resp.getData();
    }

    /**
     * Get metadata sets of repository.
     * Get metadata sets of repository.
     * @param repository ID of repository (or \&quot;-home-\&quot; for home repository) (required)
     * @return ApiResponse&lt;MdsEntries&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MdsEntries> getMetadataSetsWithHttpInfo(String repository) throws ApiException {
        com.squareup.okhttp.Call call = getMetadataSetsCall(repository, null, null);
        Type localVarReturnType = new TypeToken<MdsEntries>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get metadata sets of repository. (asynchronously)
     * Get metadata sets of repository.
     * @param repository ID of repository (or \&quot;-home-\&quot; for home repository) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMetadataSetsAsync(String repository, final ApiCallback<MdsEntries> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getMetadataSetsCall(repository, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MdsEntries>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getValues */
    private com.squareup.okhttp.Call getValuesCall(String repository, String metadataset, ValueParameters body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'repository' is set
        if (repository == null) {
            throw new ApiException("Missing the required parameter 'repository' when calling getValues(Async)");
        }
        
        // verify the required parameter 'metadataset' is set
        if (metadataset == null) {
            throw new ApiException("Missing the required parameter 'metadataset' when calling getValues(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling getValues(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/mds/v1/metadatasets/{repository}/{metadataset}/values".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "repository" + "\\}", apiClient.escapeString(repository.toString()))
        .replaceAll("\\{" + "metadataset" + "\\}", apiClient.escapeString(metadataset.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Get values.
     * Get values.
     * @param repository ID of repository (or \&quot;-home-\&quot; for home repository) (required)
     * @param metadataset ID of metadataset (or \&quot;-default-\&quot; for default metadata set) (required)
     * @param body value (required)
     * @return MdsEntry
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MdsEntry getValues(String repository, String metadataset, ValueParameters body) throws ApiException {
        ApiResponse<MdsEntry> resp = getValuesWithHttpInfo(repository, metadataset, body);
        return resp.getData();
    }

    /**
     * Get values.
     * Get values.
     * @param repository ID of repository (or \&quot;-home-\&quot; for home repository) (required)
     * @param metadataset ID of metadataset (or \&quot;-default-\&quot; for default metadata set) (required)
     * @param body value (required)
     * @return ApiResponse&lt;MdsEntry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MdsEntry> getValuesWithHttpInfo(String repository, String metadataset, ValueParameters body) throws ApiException {
        com.squareup.okhttp.Call call = getValuesCall(repository, metadataset, body, null, null);
        Type localVarReturnType = new TypeToken<MdsEntry>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get values. (asynchronously)
     * Get values.
     * @param repository ID of repository (or \&quot;-home-\&quot; for home repository) (required)
     * @param metadataset ID of metadataset (or \&quot;-default-\&quot; for default metadata set) (required)
     * @param body value (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getValuesAsync(String repository, String metadataset, ValueParameters body, final ApiCallback<MdsEntry> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getValuesCall(repository, metadataset, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MdsEntry>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
