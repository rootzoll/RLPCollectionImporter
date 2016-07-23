# IAMVApi

All URIs are relative to *https://localhost/edu-sharing/rest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMembership**](IAMVApi.md#addMembership) | **PUT** /iam/v1/groups/{repository}/{group}/members/{member} | Add member to the group.
[**changeGroupProfile**](IAMVApi.md#changeGroupProfile) | **PUT** /iam/v1/groups/{repository}/{group}/profile | Set profile of the group.
[**changeUserPassword**](IAMVApi.md#changeUserPassword) | **PUT** /iam/v1/people/{repository}/{person}/credential | Change/Set password of the user.
[**changeUserProfile**](IAMVApi.md#changeUserProfile) | **PUT** /iam/v1/people/{repository}/{person}/profile | Set profile of the user.
[**createGroup**](IAMVApi.md#createGroup) | **POST** /iam/v1/groups/{repository}/{group} | Create a new group.
[**createUser**](IAMVApi.md#createUser) | **POST** /iam/v1/people/{repository}/{person} | Create a new user.
[**deleteGroup**](IAMVApi.md#deleteGroup) | **DELETE** /iam/v1/groups/{repository}/{group} | Delete the group.
[**deleteMembership**](IAMVApi.md#deleteMembership) | **DELETE** /iam/v1/groups/{repository}/{group}/members/{member} | Delete member from the group.
[**deleteUser**](IAMVApi.md#deleteUser) | **DELETE** /iam/v1/people/{repository}/{person} | Delete the user.
[**getGroup**](IAMVApi.md#getGroup) | **GET** /iam/v1/groups/{repository}/{group} | Get the group.
[**getMembership**](IAMVApi.md#getMembership) | **GET** /iam/v1/groups/{repository}/{group}/members | Get all members of the group.
[**getUser**](IAMVApi.md#getUser) | **GET** /iam/v1/people/{repository}/{person} | Get the user.
[**searchGroup**](IAMVApi.md#searchGroup) | **GET** /iam/v1/groups/{repository} | Search groups.
[**searchUser**](IAMVApi.md#searchUser) | **GET** /iam/v1/people/{repository} | Search users.


<a name="addMembership"></a>
# **addMembership**
> addMembership(repository, group, member)

Add member to the group.

Add member to the group. (admin rights are required.)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IAMVApi;


IAMVApi apiInstance = new IAMVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String group = "group_example"; // String | groupname
String member = "member_example"; // String | authorityName of member
try {
    apiInstance.addMembership(repository, group, member);
} catch (ApiException e) {
    System.err.println("Exception when calling IAMVApi#addMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **group** | **String**| groupname |
 **member** | **String**| authorityName of member |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="changeGroupProfile"></a>
# **changeGroupProfile**
> changeGroupProfile(repository, group, body)

Set profile of the group.

Set profile of the group. (admin rights are required.)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IAMVApi;


IAMVApi apiInstance = new IAMVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String group = "group_example"; // String | groupname
GroupProfile body = new GroupProfile(); // GroupProfile | properties
try {
    apiInstance.changeGroupProfile(repository, group, body);
} catch (ApiException e) {
    System.err.println("Exception when calling IAMVApi#changeGroupProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **group** | **String**| groupname |
 **body** | [**GroupProfile**](GroupProfile.md)| properties |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="changeUserPassword"></a>
# **changeUserPassword**
> changeUserPassword(repository, person, body)

Change/Set password of the user.

Change/Set password of the user. (To change foreign passwords or set passwords, admin rights are required.)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IAMVApi;


IAMVApi apiInstance = new IAMVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String person = "person_example"; // String | username (or \"-me-\" for current user)
UserCredential body = new UserCredential(); // UserCredential | credential
try {
    apiInstance.changeUserPassword(repository, person, body);
} catch (ApiException e) {
    System.err.println("Exception when calling IAMVApi#changeUserPassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **person** | **String**| username (or \&quot;-me-\&quot; for current user) |
 **body** | [**UserCredential**](UserCredential.md)| credential |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="changeUserProfile"></a>
# **changeUserProfile**
> changeUserProfile(repository, person, body)

Set profile of the user.

Set profile of the user. (To set foreign profiles, admin rights are required.)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IAMVApi;


IAMVApi apiInstance = new IAMVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String person = "person_example"; // String | username (or \"-me-\" for current user)
UserProfile body = new UserProfile(); // UserProfile | properties
try {
    apiInstance.changeUserProfile(repository, person, body);
} catch (ApiException e) {
    System.err.println("Exception when calling IAMVApi#changeUserProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **person** | **String**| username (or \&quot;-me-\&quot; for current user) |
 **body** | [**UserProfile**](UserProfile.md)| properties |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createGroup"></a>
# **createGroup**
> createGroup(repository, group, body)

Create a new group.

Create a new group. (admin rights are required.)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IAMVApi;


IAMVApi apiInstance = new IAMVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String group = "group_example"; // String | groupname
GroupProfile body = new GroupProfile(); // GroupProfile | properties
try {
    apiInstance.createGroup(repository, group, body);
} catch (ApiException e) {
    System.err.println("Exception when calling IAMVApi#createGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **group** | **String**| groupname |
 **body** | [**GroupProfile**](GroupProfile.md)| properties |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="createUser"></a>
# **createUser**
> createUser(repository, person, body)

Create a new user.

Create a new user. (admin rights are required.)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IAMVApi;


IAMVApi apiInstance = new IAMVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String person = "person_example"; // String | username
UserProfile body = new UserProfile(); // UserProfile | profile
try {
    apiInstance.createUser(repository, person, body);
} catch (ApiException e) {
    System.err.println("Exception when calling IAMVApi#createUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **person** | **String**| username |
 **body** | [**UserProfile**](UserProfile.md)| profile |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteGroup"></a>
# **deleteGroup**
> deleteGroup(repository, group)

Delete the group.

Delete the group. (admin rights are required.)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IAMVApi;


IAMVApi apiInstance = new IAMVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String group = "group_example"; // String | groupname
try {
    apiInstance.deleteGroup(repository, group);
} catch (ApiException e) {
    System.err.println("Exception when calling IAMVApi#deleteGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **group** | **String**| groupname |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteMembership"></a>
# **deleteMembership**
> deleteMembership(repository, group, member)

Delete member from the group.

Delete member from the group. (admin rights are required.)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IAMVApi;


IAMVApi apiInstance = new IAMVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String group = "group_example"; // String | groupname
String member = "member_example"; // String | authorityName of member
try {
    apiInstance.deleteMembership(repository, group, member);
} catch (ApiException e) {
    System.err.println("Exception when calling IAMVApi#deleteMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **group** | **String**| groupname |
 **member** | **String**| authorityName of member |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteUser"></a>
# **deleteUser**
> deleteUser(repository, person)

Delete the user.

Delete the user. (admin rights are required.)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IAMVApi;


IAMVApi apiInstance = new IAMVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String person = "person_example"; // String | username
try {
    apiInstance.deleteUser(repository, person);
} catch (ApiException e) {
    System.err.println("Exception when calling IAMVApi#deleteUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **person** | **String**| username |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getGroup"></a>
# **getGroup**
> GroupEntry getGroup(repository, group)

Get the group.

Get the group. (To get foreign profiles, admin rights are required.)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IAMVApi;


IAMVApi apiInstance = new IAMVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String group = "group_example"; // String | groupname
try {
    GroupEntry result = apiInstance.getGroup(repository, group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IAMVApi#getGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **group** | **String**| groupname |

### Return type

[**GroupEntry**](GroupEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getMembership"></a>
# **getMembership**
> AuthorityEntries getMembership(repository, group)

Get all members of the group.

Get all members of the group. (admin rights are required.)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IAMVApi;


IAMVApi apiInstance = new IAMVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String group = "group_example"; // String | groupname
try {
    AuthorityEntries result = apiInstance.getMembership(repository, group);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IAMVApi#getMembership");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **group** | **String**| groupname |

### Return type

[**AuthorityEntries**](AuthorityEntries.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getUser"></a>
# **getUser**
> UserEntry getUser(repository, person)

Get the user.

Get the user. (To get foreign profiles, admin rights are required.)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IAMVApi;


IAMVApi apiInstance = new IAMVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String person = "person_example"; // String | username (or \"-me-\" for current user)
try {
    UserEntry result = apiInstance.getUser(repository, person);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IAMVApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **person** | **String**| username (or \&quot;-me-\&quot; for current user) |

### Return type

[**UserEntry**](UserEntry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="searchGroup"></a>
# **searchGroup**
> GroupEntries searchGroup(repository, pattern)

Search groups.

Search groups. (admin rights are required.)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IAMVApi;


IAMVApi apiInstance = new IAMVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String pattern = "pattern_example"; // String | pattern
try {
    GroupEntries result = apiInstance.searchGroup(repository, pattern);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IAMVApi#searchGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **pattern** | **String**| pattern |

### Return type

[**GroupEntries**](GroupEntries.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="searchUser"></a>
# **searchUser**
> UserEntries searchUser(repository, pattern)

Search users.

Search users. (admin rights are required.)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.IAMVApi;


IAMVApi apiInstance = new IAMVApi();
String repository = "repository_example"; // String | ID of repository (or \"-home-\" for home repository)
String pattern = "pattern_example"; // String | pattern
try {
    UserEntries result = apiInstance.searchUser(repository, pattern);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IAMVApi#searchUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **repository** | **String**| ID of repository (or \&quot;-home-\&quot; for home repository) |
 **pattern** | **String**| pattern |

### Return type

[**UserEntries**](UserEntries.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

