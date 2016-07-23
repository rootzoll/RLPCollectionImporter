# ORGANIZATIONVApi

All URIs are relative to *https://localhost/edu-sharing/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrganizations**](ORGANIZATIONVApi.md#createOrganizations) | **PUT** /organization/v1/organizations/{repository}/{organization} | Set organization of repository.
[**deleteOrganizations**](ORGANIZATIONVApi.md#deleteOrganizations) | **DELETE** /organization/v1/organizations/{repository}/{organization} | Delete organization of repository.
[**getOrganizations**](ORGANIZATIONVApi.md#getOrganizations) | **GET** /organization/v1/organizations/{repository} | Get organizations of repository.


<a name="createOrganizations"></a>
# **createOrganizations**
> createOrganizations(repository, organization, folder)

Set organization of repository.

Set organization of repository.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ORGANIZATIONVApi;


ORGANIZATIONVApi apiInstance = new ORGANIZATIONVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String organization = "organization_example"; // String | groupname
String folder = "folder_example"; // String | ID of shared folder
try {
    apiInstance.createOrganizations(repository, organization, folder);
} catch (ApiException e) {
    System.err.println("Exception when calling ORGANIZATIONVApi#createOrganizations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **organization** | **String**| groupname |
 **folder** | **String**| ID of shared folder |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteOrganizations"></a>
# **deleteOrganizations**
> deleteOrganizations(repository, organization)

Delete organization of repository.

Delete organization of repository.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ORGANIZATIONVApi;


ORGANIZATIONVApi apiInstance = new ORGANIZATIONVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String organization = "organization_example"; // String | groupname
try {
    apiInstance.deleteOrganizations(repository, organization);
} catch (ApiException e) {
    System.err.println("Exception when calling ORGANIZATIONVApi#deleteOrganizations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **organization** | **String**| groupname |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getOrganizations"></a>
# **getOrganizations**
> OrganizationEntries getOrganizations(repository)

Get organizations of repository.

Get organizations of repository.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ORGANIZATIONVApi;


ORGANIZATIONVApi apiInstance = new ORGANIZATIONVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
try {
    OrganizationEntries result = apiInstance.getOrganizations(repository);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ORGANIZATIONVApi#getOrganizations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |

### Return type

[**OrganizationEntries**](OrganizationEntries.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

