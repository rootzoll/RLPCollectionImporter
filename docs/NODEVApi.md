# NODEVApi

All URIs are relative to *https://localhost/edu-sharing/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeContentWithVersioning**](NODEVApi.md#changeContentWithVersioning) | **POST** /node/v1/nodes/{repository}/{node}/content | Change content of node (new version).
[**changeMetadata**](NODEVApi.md#changeMetadata) | **PUT** /node/v1/nodes/{repository}/{node}/metadata | Change metadata of node.
[**changeMetadataWithVersioning**](NODEVApi.md#changeMetadataWithVersioning) | **POST** /node/v1/nodes/{repository}/{node}/metadata | Change metadata of node (new version).
[**createChild**](NODEVApi.md#createChild) | **POST** /node/v1/nodes/{repository}/{node}/children | Create a new child.
[**createChildByCopying**](NODEVApi.md#createChildByCopying) | **POST** /node/v1/nodes/{repository}/{node}/children/_copy | Create a new child by copying.
[**createChildByMoving**](NODEVApi.md#createChildByMoving) | **POST** /node/v1/nodes/{repository}/{node}/children/_move | Create a new child by moving.
[**delete**](NODEVApi.md#delete) | **DELETE** /node/v1/nodes/{repository}/{node} | Delete node.
[**getChildren**](NODEVApi.md#getChildren) | **GET** /node/v1/nodes/{repository}/{node}/children | Get children of node.
[**getMetadata**](NODEVApi.md#getMetadata) | **GET** /node/v1/nodes/{repository}/{node}/metadata | Get metadata of node.
[**getNodes**](NODEVApi.md#getNodes) | **GET** /node/v1/nodes/{repository} | Searching nodes.
[**getPermission**](NODEVApi.md#getPermission) | **GET** /node/v1/nodes/{repository}/{node}/permissions | Get all permission of node.
[**getVersionMetadata**](NODEVApi.md#getVersionMetadata) | **GET** /node/v1/nodes/{repository}/{node}/versions/{major}/{minor}/metadata | Get metadata of node version.
[**getVersions**](NODEVApi.md#getVersions) | **GET** /node/v1/nodes/{repository}/{node}/versions | Get all versions of node.
[**revertVersion**](NODEVApi.md#revertVersion) | **PUT** /node/v1/nodes/{repository}/{node}/versions/{major}/{minor}/_revert | Revert to node version.
[**setPermission**](NODEVApi.md#setPermission) | **PUT** /node/v1/nodes/{repository}/{node}/permissions | Set local permissions of node.


<a name="changeContentWithVersioning"></a>
# **changeContentWithVersioning**
> NodeEntry changeContentWithVersioning(repository, node, versionComment, mimetype, file)

Change content of node (new version).

Change content of node (new version).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NODEVApi;


NODEVApi apiInstance = new NODEVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String node = "node_example"; // String | ID of node
String versionComment = "versionComment_example"; // String | comment
String mimetype = "mimetype_example"; // String | MIME-Type
File file = new File("/path/to/file.txt"); // File | 
try {
    NodeEntry result = apiInstance.changeContentWithVersioning(repository, node, versionComment, mimetype, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NODEVApi#changeContentWithVersioning");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **node** | **String**| ID of node |
 **versionComment** | **String**| comment |
 **mimetype** | **String**| MIME-Type |
 **file** | **File**|  | [optional]

### Return type

[**NodeEntry**](NodeEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="changeMetadata"></a>
# **changeMetadata**
> NodeEntry changeMetadata(repository, node, body)

Change metadata of node.

Change metadata of node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NODEVApi;


NODEVApi apiInstance = new NODEVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String node = "node_example"; // String | ID of node
List<NodeProperty> body = Arrays.asList(new NodeProperty()); // List<NodeProperty> | properties
try {
    NodeEntry result = apiInstance.changeMetadata(repository, node, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NODEVApi#changeMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **node** | **String**| ID of node |
 **body** | [**List&lt;NodeProperty&gt;**](NodeProperty.md)| properties |

### Return type

[**NodeEntry**](NodeEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="changeMetadataWithVersioning"></a>
# **changeMetadataWithVersioning**
> NodeEntry changeMetadataWithVersioning(repository, node, versionComment, body)

Change metadata of node (new version).

Change metadata of node (new version).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NODEVApi;


NODEVApi apiInstance = new NODEVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String node = "node_example"; // String | ID of node
String versionComment = "versionComment_example"; // String | comment
List<NodeProperty> body = Arrays.asList(new NodeProperty()); // List<NodeProperty> | properties
try {
    NodeEntry result = apiInstance.changeMetadataWithVersioning(repository, node, versionComment, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NODEVApi#changeMetadataWithVersioning");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **node** | **String**| ID of node |
 **versionComment** | **String**| comment |
 **body** | [**List&lt;NodeProperty&gt;**](NodeProperty.md)| properties |

### Return type

[**NodeEntry**](NodeEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createChild"></a>
# **createChild**
> NodeEntry createChild(repository, node, type, body, aspects)

Create a new child.

Create a new child.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NODEVApi;


NODEVApi apiInstance = new NODEVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String node = "node_example"; // String | ID of parent node
String type = "type_example"; // String | type of node
List<NodeProperty> body = Arrays.asList(new NodeProperty()); // List<NodeProperty> | properties
List<String> aspects = Arrays.asList("aspects_example"); // List<String> | aspects of node
try {
    NodeEntry result = apiInstance.createChild(repository, node, type, body, aspects);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NODEVApi#createChild");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **node** | **String**| ID of parent node |
 **type** | **String**| type of node |
 **body** | [**List&lt;NodeProperty&gt;**](NodeProperty.md)| properties |
 **aspects** | [**List&lt;String&gt;**](String.md)| aspects of node | [optional]

### Return type

[**NodeEntry**](NodeEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createChildByCopying"></a>
# **createChildByCopying**
> NodeEntry createChildByCopying(repository, node, source, withChildren)

Create a new child by copying.

Create a new child by copying.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NODEVApi;


NODEVApi apiInstance = new NODEVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String node = "node_example"; // String | ID of parent node
String source = "source_example"; // String | ID of source node
Boolean withChildren = true; // Boolean | flag for children
try {
    NodeEntry result = apiInstance.createChildByCopying(repository, node, source, withChildren);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NODEVApi#createChildByCopying");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **node** | **String**| ID of parent node |
 **source** | **String**| ID of source node |
 **withChildren** | **Boolean**| flag for children |

### Return type

[**NodeEntry**](NodeEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createChildByMoving"></a>
# **createChildByMoving**
> NodeEntry createChildByMoving(repository, node, source)

Create a new child by moving.

Create a new child by moving.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NODEVApi;


NODEVApi apiInstance = new NODEVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String node = "node_example"; // String | ID of parent node
String source = "source_example"; // String | ID of source node
try {
    NodeEntry result = apiInstance.createChildByMoving(repository, node, source);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NODEVApi#createChildByMoving");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **node** | **String**| ID of parent node |
 **source** | **String**| ID of source node |

### Return type

[**NodeEntry**](NodeEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="delete"></a>
# **delete**
> delete(repository, node)

Delete node.

Delete node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NODEVApi;


NODEVApi apiInstance = new NODEVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String node = "node_example"; // String | ID of node
try {
    apiInstance.delete(repository, node);
} catch (ApiException e) {
    System.err.println("Exception when calling NODEVApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **node** | **String**| ID of node |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getChildren"></a>
# **getChildren**
> NodeEntries getChildren(repository, node, maxItems, skipCount)

Get children of node.

Get children of node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NODEVApi;


NODEVApi apiInstance = new NODEVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String node = "node_example"; // String | ID of parent node
Integer maxItems = 500; // Integer | maximum items per page
Integer skipCount = 0; // Integer | skip a number of items
try {
    NodeEntries result = apiInstance.getChildren(repository, node, maxItems, skipCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NODEVApi#getChildren");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **node** | **String**| ID of parent node |
 **maxItems** | **Integer**| maximum items per page | [optional] [default to 500]
 **skipCount** | **Integer**| skip a number of items | [optional] [default to 0]

### Return type

[**NodeEntries**](NodeEntries.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getMetadata"></a>
# **getMetadata**
> NodeEntry getMetadata(repository, node)

Get metadata of node.

Get metadata of node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NODEVApi;


NODEVApi apiInstance = new NODEVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String node = "node_example"; // String | ID of node
try {
    NodeEntry result = apiInstance.getMetadata(repository, node);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NODEVApi#getMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **node** | **String**| ID of node |

### Return type

[**NodeEntry**](NodeEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getNodes"></a>
# **getNodes**
> SearchResult getNodes(repository, query, facettes, maxItems, skipCount)

Searching nodes.

Searching nodes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NODEVApi;


NODEVApi apiInstance = new NODEVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String query = "query_example"; // String | lucene query
List<String> facettes = Arrays.asList("facettes_example"); // List<String> | facettes
Integer maxItems = 10; // Integer | maximum items per page
Integer skipCount = 0; // Integer | skip a number of items
try {
    SearchResult result = apiInstance.getNodes(repository, query, facettes, maxItems, skipCount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NODEVApi#getNodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **query** | **String**| lucene query |
 **facettes** | [**List&lt;String&gt;**](String.md)| facettes | [optional]
 **maxItems** | **Integer**| maximum items per page | [optional] [default to 10]
 **skipCount** | **Integer**| skip a number of items | [optional] [default to 0]

### Return type

[**SearchResult**](SearchResult.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getPermission"></a>
# **getPermission**
> NodePermissionEntry getPermission(repository, node)

Get all permission of node.

Get all permission of node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NODEVApi;


NODEVApi apiInstance = new NODEVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String node = "node_example"; // String | ID of node
try {
    NodePermissionEntry result = apiInstance.getPermission(repository, node);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NODEVApi#getPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **node** | **String**| ID of node |

### Return type

[**NodePermissionEntry**](NodePermissionEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getVersionMetadata"></a>
# **getVersionMetadata**
> NodeVersionEntry getVersionMetadata(repository, node, major, minor)

Get metadata of node version.

Get metadata of node version.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NODEVApi;


NODEVApi apiInstance = new NODEVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String node = "node_example"; // String | ID of node
Integer major = 56; // Integer | major version
Integer minor = 56; // Integer | minor version
try {
    NodeVersionEntry result = apiInstance.getVersionMetadata(repository, node, major, minor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NODEVApi#getVersionMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **node** | **String**| ID of node |
 **major** | **Integer**| major version |
 **minor** | **Integer**| minor version |

### Return type

[**NodeVersionEntry**](NodeVersionEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getVersions"></a>
# **getVersions**
> NodeVersionRefEntries getVersions(repository, node)

Get all versions of node.

Get all versions of node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NODEVApi;


NODEVApi apiInstance = new NODEVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String node = "node_example"; // String | ID of node
try {
    NodeVersionRefEntries result = apiInstance.getVersions(repository, node);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NODEVApi#getVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **node** | **String**| ID of node |

### Return type

[**NodeVersionRefEntries**](NodeVersionRefEntries.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="revertVersion"></a>
# **revertVersion**
> NodeEntry revertVersion(repository, node, major, minor)

Revert to node version.

Revert to node version.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NODEVApi;


NODEVApi apiInstance = new NODEVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String node = "node_example"; // String | ID of node
Integer major = 56; // Integer | major version
Integer minor = 56; // Integer | minor version
try {
    NodeEntry result = apiInstance.revertVersion(repository, node, major, minor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NODEVApi#revertVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **node** | **String**| ID of node |
 **major** | **Integer**| major version |
 **minor** | **Integer**| minor version |

### Return type

[**NodeEntry**](NodeEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setPermission"></a>
# **setPermission**
> setPermission(repository, node, body)

Set local permissions of node.

Set local permissions of node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NODEVApi;


NODEVApi apiInstance = new NODEVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String node = "node_example"; // String | ID of node
ACL body = new ACL(); // ACL | permissions
try {
    apiInstance.setPermission(repository, node, body);
} catch (ApiException e) {
    System.err.println("Exception when calling NODEVApi#setPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **node** | **String**| ID of node |
 **body** | [**ACL**](ACL.md)| permissions |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

