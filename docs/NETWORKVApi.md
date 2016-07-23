# NETWORKVApi

All URIs are relative to *https://localhost/edu-sharing/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRepositories**](NETWORKVApi.md#getRepositories) | **GET** /network/v1/repositories | Get repositories.


<a name="getRepositories"></a>
# **getRepositories**
> RepoEntries getRepositories()

Get repositories.

Get repositories.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.NETWORKVApi;


NETWORKVApi apiInstance = new NETWORKVApi();
try {
    RepoEntries result = apiInstance.getRepositories();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NETWORKVApi#getRepositories");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RepoEntries**](RepoEntries.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

