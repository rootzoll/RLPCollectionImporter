# ABOUTApi

All URIs are relative to *https://localhost/edu-sharing/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**about**](ABOUTApi.md#about) | **GET** /_about | Discover the API.


<a name="about"></a>
# **about**
> About about()

Discover the API.

Get all services provided by this API.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ABOUTApi;


ABOUTApi apiInstance = new ABOUTApi();
try {
    About result = apiInstance.about();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ABOUTApi#about");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**About**](About.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

