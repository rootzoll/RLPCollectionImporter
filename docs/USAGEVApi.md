# USAGEVApi

All URIs are relative to *https://localhost/edu-sharing/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsages**](USAGEVApi.md#getUsages) | **GET** /usage/v1/usages/{appId} | Get all usages of an application.
[**getUsagesByCourse**](USAGEVApi.md#getUsagesByCourse) | **GET** /usage/v1/usages/course/{appId}/{courseId} | Get all usages of an course.
[**getUsagesByNode**](USAGEVApi.md#getUsagesByNode) | **GET** /usage/v1/usages/node/{nodeId} | Get all usages of an node.


<a name="getUsages"></a>
# **getUsages**
> Usages getUsages(appId)

Get all usages of an application.

Get all usages of an application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.USAGEVApi;


USAGEVApi apiInstance = new USAGEVApi();
String appId = "appId_example"; // String | ID of application (or \"-home-\" for home repository)
try {
    Usages result = apiInstance.getUsages(appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling USAGEVApi#getUsages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| ID of application (or \&quot;-home-\&quot; for home repository) |

### Return type

[**Usages**](Usages.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getUsagesByCourse"></a>
# **getUsagesByCourse**
> Usages getUsagesByCourse(appId, courseId)

Get all usages of an course.

Get all usages of an course.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.USAGEVApi;


USAGEVApi apiInstance = new USAGEVApi();
String appId = "appId_example"; // String | ID of application (or \"-home-\" for home repository)
String courseId = "courseId_example"; // String | ID of course
try {
    Usages result = apiInstance.getUsagesByCourse(appId, courseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling USAGEVApi#getUsagesByCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| ID of application (or \&quot;-home-\&quot; for home repository) |
 **courseId** | **String**| ID of course |

### Return type

[**Usages**](Usages.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getUsagesByNode"></a>
# **getUsagesByNode**
> Usages getUsagesByNode(nodeId)

Get all usages of an node.

Get all usages of an node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.USAGEVApi;


USAGEVApi apiInstance = new USAGEVApi();
String nodeId = "nodeId_example"; // String | ID of node
try {
    Usages result = apiInstance.getUsagesByNode(nodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling USAGEVApi#getUsagesByNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeId** | **String**| ID of node |

### Return type

[**Usages**](Usages.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

