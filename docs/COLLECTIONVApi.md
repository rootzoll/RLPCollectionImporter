# COLLECTIONVApi

All URIs are relative to *https://localhost/edu-sharing/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addToCollection**](COLLECTIONVApi.md#addToCollection) | **PUT** /collection/v1/collections/{repository}/{collection}/references/{node} | Add a node to a collection.
[**createCollection**](COLLECTIONVApi.md#createCollection) | **POST** /collection/v1/collections/{repository}/{collection}/children | Create a new collection.
[**deleteCollection**](COLLECTIONVApi.md#deleteCollection) | **DELETE** /collection/v1/collections/{repository}/{collection} | Delete a collection.
[**deleteFromCollection**](COLLECTIONVApi.md#deleteFromCollection) | **DELETE** /collection/v1/collections/{repository}/{collection}/references/{node} | Delete a node from a collection.
[**getCollection**](COLLECTIONVApi.md#getCollection) | **GET** /collection/v1/collections/{repository}/{collection} | Get a collection.
[**getCollections**](COLLECTIONVApi.md#getCollections) | **GET** /collection/v1/collections/{repository}/{collection}/children | Get collections.
[**updateCollection**](COLLECTIONVApi.md#updateCollection) | **PUT** /collection/v1/collections/{repository}/{collection} | Update a collection.


<a name="addToCollection"></a>
# **addToCollection**
> addToCollection(repository, collection, node)

Add a node to a collection.

Add a node to a collection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.COLLECTIONVApi;


COLLECTIONVApi apiInstance = new COLLECTIONVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String collection = "collection_example"; // String | ID of collection
String node = "node_example"; // String | ID of node
try {
    apiInstance.addToCollection(repository, collection, node);
} catch (ApiException e) {
    System.err.println("Exception when calling COLLECTIONVApi#addToCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **collection** | **String**| ID of collection |
 **node** | **String**| ID of node |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createCollection"></a>
# **createCollection**
> CollectionEntry createCollection(repository, collection, body)

Create a new collection.

Create a new collection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.COLLECTIONVApi;


COLLECTIONVApi apiInstance = new COLLECTIONVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String collection = "collection_example"; // String | ID of parent collection (or \"-root-\" for level0 collections)
Collection body = new Collection(); // Collection | collection
try {
    CollectionEntry result = apiInstance.createCollection(repository, collection, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling COLLECTIONVApi#createCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **collection** | **String**| ID of parent collection (or \&quot;-root-\&quot; for level0 collections) |
 **body** | [**Collection**](Collection.md)| collection |

### Return type

[**CollectionEntry**](CollectionEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteCollection"></a>
# **deleteCollection**
> deleteCollection(repository, collection)

Delete a collection.

Delete a collection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.COLLECTIONVApi;


COLLECTIONVApi apiInstance = new COLLECTIONVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String collection = "collection_example"; // String | ID of collection
try {
    apiInstance.deleteCollection(repository, collection);
} catch (ApiException e) {
    System.err.println("Exception when calling COLLECTIONVApi#deleteCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **collection** | **String**| ID of collection |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteFromCollection"></a>
# **deleteFromCollection**
> deleteFromCollection(repository, collection, node)

Delete a node from a collection.

Delete a node from a collection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.COLLECTIONVApi;


COLLECTIONVApi apiInstance = new COLLECTIONVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String collection = "collection_example"; // String | ID of collection
String node = "node_example"; // String | ID of node
try {
    apiInstance.deleteFromCollection(repository, collection, node);
} catch (ApiException e) {
    System.err.println("Exception when calling COLLECTIONVApi#deleteFromCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **collection** | **String**| ID of collection |
 **node** | **String**| ID of node |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCollection"></a>
# **getCollection**
> CollectionEntry getCollection(repository, collection)

Get a collection.

Get a collection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.COLLECTIONVApi;


COLLECTIONVApi apiInstance = new COLLECTIONVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String collection = "collection_example"; // String | ID of collection
try {
    CollectionEntry result = apiInstance.getCollection(repository, collection);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling COLLECTIONVApi#getCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **collection** | **String**| ID of collection |

### Return type

[**CollectionEntry**](CollectionEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getCollections"></a>
# **getCollections**
> CollectionEntries getCollections(repository, collection, scope)

Get collections.

Get collections.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.COLLECTIONVApi;


COLLECTIONVApi apiInstance = new COLLECTIONVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String collection = "collection_example"; // String | ID of parent collection (or \"-root-\" for level0 collections)
String scope = "MY"; // String | scope
try {
    CollectionEntries result = apiInstance.getCollections(repository, collection, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling COLLECTIONVApi#getCollections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **collection** | **String**| ID of parent collection (or \&quot;-root-\&quot; for level0 collections) |
 **scope** | **String**| scope | [default to MY] [enum: EDU_ALL, EDU_GROUPS, MY]

### Return type

[**CollectionEntries**](CollectionEntries.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="updateCollection"></a>
# **updateCollection**
> updateCollection(repository, body)

Update a collection.

Update a collection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.COLLECTIONVApi;


COLLECTIONVApi apiInstance = new COLLECTIONVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
Collection body = new Collection(); // Collection | collection
try {
    apiInstance.updateCollection(repository, body);
} catch (ApiException e) {
    System.err.println("Exception when calling COLLECTIONVApi#updateCollection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **body** | [**Collection**](Collection.md)| collection |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

