# MDSVApi

All URIs are relative to *https://localhost/edu-sharing/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMetadataSet**](MDSVApi.md#getMetadataSet) | **GET** /mds/v1/metadatasets/{repository}/{metadataset} | Get metadata set.
[**getMetadataSets**](MDSVApi.md#getMetadataSets) | **GET** /mds/v1/metadatasets/{repository} | Get metadata sets of repository.
[**getValues**](MDSVApi.md#getValues) | **POST** /mds/v1/metadatasets/{repository}/{metadataset}/values | Get values.


<a name="getMetadataSet"></a>
# **getMetadataSet**
> MdsEntry getMetadataSet(repository, metadataset)

Get metadata set.

Get metadata set.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MDSVApi;


MDSVApi apiInstance = new MDSVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String metadataset = "metadataset_example"; // String | ID of metadataset (or \"-default-\" for default metadata set)
try {
    MdsEntry result = apiInstance.getMetadataSet(repository, metadataset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MDSVApi#getMetadataSet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **metadataset** | **String**| ID of metadataset (or \&quot;-default-\&quot; for default metadata set) |

### Return type

[**MdsEntry**](MdsEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getMetadataSets"></a>
# **getMetadataSets**
> MdsEntries getMetadataSets(repository)

Get metadata sets of repository.

Get metadata sets of repository.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MDSVApi;


MDSVApi apiInstance = new MDSVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
try {
    MdsEntries result = apiInstance.getMetadataSets(repository);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MDSVApi#getMetadataSets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |

### Return type

[**MdsEntries**](MdsEntries.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getValues"></a>
# **getValues**
> MdsEntry getValues(repository, metadataset, body)

Get values.

Get values.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MDSVApi;


MDSVApi apiInstance = new MDSVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String metadataset = "metadataset_example"; // String | ID of metadataset (or \"-default-\" for default metadata set)
ValueParameters body = new ValueParameters(); // ValueParameters | value
try {
    MdsEntry result = apiInstance.getValues(repository, metadataset, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MDSVApi#getValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **metadataset** | **String**| ID of metadataset (or \&quot;-default-\&quot; for default metadata set) |
 **body** | [**ValueParameters**](ValueParameters.md)| value |

### Return type

[**MdsEntry**](MdsEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

