# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.ABOUTApi;

import java.io.File;
import java.util.*;

public class ABOUTApiExample {

    public static void main(String[] args) {
        
        ABOUTApi apiInstance = new ABOUTApi();
        try {
            About result = apiInstance.about();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ABOUTApi#about");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/edu-sharing/rest*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ABOUTApi* | [**about**](docs/ABOUTApi.md#about) | **GET** /_about | Discover the API.
*COLLECTIONVApi* | [**addToCollection**](docs/COLLECTIONVApi.md#addToCollection) | **PUT** /collection/v1/collections/{repository}/{collection}/references/{node} | Add a node to a collection.
*COLLECTIONVApi* | [**createCollection**](docs/COLLECTIONVApi.md#createCollection) | **POST** /collection/v1/collections/{repository}/{collection}/children | Create a new collection.
*COLLECTIONVApi* | [**deleteCollection**](docs/COLLECTIONVApi.md#deleteCollection) | **DELETE** /collection/v1/collections/{repository}/{collection} | Delete a collection.
*COLLECTIONVApi* | [**deleteFromCollection**](docs/COLLECTIONVApi.md#deleteFromCollection) | **DELETE** /collection/v1/collections/{repository}/{collection}/references/{node} | Delete a node from a collection.
*COLLECTIONVApi* | [**getCollection**](docs/COLLECTIONVApi.md#getCollection) | **GET** /collection/v1/collections/{repository}/{collection} | Get a collection.
*COLLECTIONVApi* | [**getCollections**](docs/COLLECTIONVApi.md#getCollections) | **GET** /collection/v1/collections/{repository}/{collection}/children | Get collections.
*COLLECTIONVApi* | [**updateCollection**](docs/COLLECTIONVApi.md#updateCollection) | **PUT** /collection/v1/collections/{repository}/{collection} | Update a collection.
*IAMVApi* | [**addMembership**](docs/IAMVApi.md#addMembership) | **PUT** /iam/v1/groups/{repository}/{group}/members/{member} | Add member to the group.
*IAMVApi* | [**changeGroupProfile**](docs/IAMVApi.md#changeGroupProfile) | **PUT** /iam/v1/groups/{repository}/{group}/profile | Set profile of the group.
*IAMVApi* | [**changeUserPassword**](docs/IAMVApi.md#changeUserPassword) | **PUT** /iam/v1/people/{repository}/{person}/credential | Change/Set password of the user.
*IAMVApi* | [**changeUserProfile**](docs/IAMVApi.md#changeUserProfile) | **PUT** /iam/v1/people/{repository}/{person}/profile | Set profile of the user.
*IAMVApi* | [**createGroup**](docs/IAMVApi.md#createGroup) | **POST** /iam/v1/groups/{repository}/{group} | Create a new group.
*IAMVApi* | [**createUser**](docs/IAMVApi.md#createUser) | **POST** /iam/v1/people/{repository}/{person} | Create a new user.
*IAMVApi* | [**deleteGroup**](docs/IAMVApi.md#deleteGroup) | **DELETE** /iam/v1/groups/{repository}/{group} | Delete the group.
*IAMVApi* | [**deleteMembership**](docs/IAMVApi.md#deleteMembership) | **DELETE** /iam/v1/groups/{repository}/{group}/members/{member} | Delete member from the group.
*IAMVApi* | [**deleteUser**](docs/IAMVApi.md#deleteUser) | **DELETE** /iam/v1/people/{repository}/{person} | Delete the user.
*IAMVApi* | [**getGroup**](docs/IAMVApi.md#getGroup) | **GET** /iam/v1/groups/{repository}/{group} | Get the group.
*IAMVApi* | [**getMembership**](docs/IAMVApi.md#getMembership) | **GET** /iam/v1/groups/{repository}/{group}/members | Get all members of the group.
*IAMVApi* | [**getUser**](docs/IAMVApi.md#getUser) | **GET** /iam/v1/people/{repository}/{person} | Get the user.
*IAMVApi* | [**searchGroup**](docs/IAMVApi.md#searchGroup) | **GET** /iam/v1/groups/{repository} | Search groups.
*IAMVApi* | [**searchUser**](docs/IAMVApi.md#searchUser) | **GET** /iam/v1/people/{repository} | Search users.
*MDSVApi* | [**getMetadataSet**](docs/MDSVApi.md#getMetadataSet) | **GET** /mds/v1/metadatasets/{repository}/{metadataset} | Get metadata set.
*MDSVApi* | [**getMetadataSets**](docs/MDSVApi.md#getMetadataSets) | **GET** /mds/v1/metadatasets/{repository} | Get metadata sets of repository.
*MDSVApi* | [**getValues**](docs/MDSVApi.md#getValues) | **POST** /mds/v1/metadatasets/{repository}/{metadataset}/values | Get values.
*NETWORKVApi* | [**getRepositories**](docs/NETWORKVApi.md#getRepositories) | **GET** /network/v1/repositories | Get repositories.
*NODEVApi* | [**changeContentWithVersioning**](docs/NODEVApi.md#changeContentWithVersioning) | **POST** /node/v1/nodes/{repository}/{node}/content | Change content of node (new version).
*NODEVApi* | [**changeMetadata**](docs/NODEVApi.md#changeMetadata) | **PUT** /node/v1/nodes/{repository}/{node}/metadata | Change metadata of node.
*NODEVApi* | [**changeMetadataWithVersioning**](docs/NODEVApi.md#changeMetadataWithVersioning) | **POST** /node/v1/nodes/{repository}/{node}/metadata | Change metadata of node (new version).
*NODEVApi* | [**createChild**](docs/NODEVApi.md#createChild) | **POST** /node/v1/nodes/{repository}/{node}/children | Create a new child.
*NODEVApi* | [**createChildByCopying**](docs/NODEVApi.md#createChildByCopying) | **POST** /node/v1/nodes/{repository}/{node}/children/_copy | Create a new child by copying.
*NODEVApi* | [**createChildByMoving**](docs/NODEVApi.md#createChildByMoving) | **POST** /node/v1/nodes/{repository}/{node}/children/_move | Create a new child by moving.
*NODEVApi* | [**delete**](docs/NODEVApi.md#delete) | **DELETE** /node/v1/nodes/{repository}/{node} | Delete node.
*NODEVApi* | [**getChildren**](docs/NODEVApi.md#getChildren) | **GET** /node/v1/nodes/{repository}/{node}/children | Get children of node.
*NODEVApi* | [**getMetadata**](docs/NODEVApi.md#getMetadata) | **GET** /node/v1/nodes/{repository}/{node}/metadata | Get metadata of node.
*NODEVApi* | [**getNodes**](docs/NODEVApi.md#getNodes) | **GET** /node/v1/nodes/{repository} | Searching nodes.
*NODEVApi* | [**getPermission**](docs/NODEVApi.md#getPermission) | **GET** /node/v1/nodes/{repository}/{node}/permissions | Get all permission of node.
*NODEVApi* | [**getVersionMetadata**](docs/NODEVApi.md#getVersionMetadata) | **GET** /node/v1/nodes/{repository}/{node}/versions/{major}/{minor}/metadata | Get metadata of node version.
*NODEVApi* | [**getVersions**](docs/NODEVApi.md#getVersions) | **GET** /node/v1/nodes/{repository}/{node}/versions | Get all versions of node.
*NODEVApi* | [**revertVersion**](docs/NODEVApi.md#revertVersion) | **PUT** /node/v1/nodes/{repository}/{node}/versions/{major}/{minor}/_revert | Revert to node version.
*NODEVApi* | [**setPermission**](docs/NODEVApi.md#setPermission) | **PUT** /node/v1/nodes/{repository}/{node}/permissions | Set local permissions of node.
*ORGANIZATIONVApi* | [**createOrganizations**](docs/ORGANIZATIONVApi.md#createOrganizations) | **PUT** /organization/v1/organizations/{repository}/{organization} | Set organization of repository.
*ORGANIZATIONVApi* | [**deleteOrganizations**](docs/ORGANIZATIONVApi.md#deleteOrganizations) | **DELETE** /organization/v1/organizations/{repository}/{organization} | Delete organization of repository.
*ORGANIZATIONVApi* | [**getOrganizations**](docs/ORGANIZATIONVApi.md#getOrganizations) | **GET** /organization/v1/organizations/{repository} | Get organizations of repository.
*SEARCHVApi* | [**search**](docs/SEARCHVApi.md#search) | **POST** /search/v1/queries/{repository}/{metadataset}/{query} | Perform queries based on metadata sets.
*USAGEVApi* | [**getUsages**](docs/USAGEVApi.md#getUsages) | **GET** /usage/v1/usages/{appId} | Get all usages of an application.
*USAGEVApi* | [**getUsagesByCourse**](docs/USAGEVApi.md#getUsagesByCourse) | **GET** /usage/v1/usages/course/{appId}/{courseId} | Get all usages of an course.
*USAGEVApi* | [**getUsagesByNode**](docs/USAGEVApi.md#getUsagesByNode) | **GET** /usage/v1/usages/node/{nodeId} | Get all usages of an node.


## Documentation for Models

 - [ACE](docs/ACE.md)
 - [ACL](docs/ACL.md)
 - [About](docs/About.md)
 - [Authority](docs/Authority.md)
 - [AuthorityEntries](docs/AuthorityEntries.md)
 - [Collection](docs/Collection.md)
 - [CollectionEntries](docs/CollectionEntries.md)
 - [CollectionEntry](docs/CollectionEntry.md)
 - [CollectionReference](docs/CollectionReference.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [Facette](docs/Facette.md)
 - [Group](docs/Group.md)
 - [GroupEntries](docs/GroupEntries.md)
 - [GroupEntry](docs/GroupEntry.md)
 - [GroupProfile](docs/GroupProfile.md)
 - [Mds](docs/Mds.md)
 - [MdsDesc](docs/MdsDesc.md)
 - [MdsEntries](docs/MdsEntries.md)
 - [MdsEntry](docs/MdsEntry.md)
 - [MdsForm](docs/MdsForm.md)
 - [MdsFormPanel](docs/MdsFormPanel.md)
 - [MdsFormProperty](docs/MdsFormProperty.md)
 - [MdsFormPropertyParameter](docs/MdsFormPropertyParameter.md)
 - [MdsFormPropertyValue](docs/MdsFormPropertyValue.md)
 - [MdsList](docs/MdsList.md)
 - [MdsListProperty](docs/MdsListProperty.md)
 - [MdsListPropertyParameter](docs/MdsListPropertyParameter.md)
 - [MdsListPropertyValue](docs/MdsListPropertyValue.md)
 - [MdsProperty](docs/MdsProperty.md)
 - [MdsQueries](docs/MdsQueries.md)
 - [MdsQuery](docs/MdsQuery.md)
 - [MdsQueryCriteria](docs/MdsQueryCriteria.md)
 - [MdsQueryProperty](docs/MdsQueryProperty.md)
 - [MdsQueryPropertyParameter](docs/MdsQueryPropertyParameter.md)
 - [MdsQueryPropertyValue](docs/MdsQueryPropertyValue.md)
 - [MdsRef](docs/MdsRef.md)
 - [MdsType](docs/MdsType.md)
 - [MdsView](docs/MdsView.md)
 - [MdsViewProperty](docs/MdsViewProperty.md)
 - [MdsViewPropertyParameter](docs/MdsViewPropertyParameter.md)
 - [MdsViewPropertyValue](docs/MdsViewPropertyValue.md)
 - [Node](docs/Node.md)
 - [NodeAccess](docs/NodeAccess.md)
 - [NodeEntries](docs/NodeEntries.md)
 - [NodeEntry](docs/NodeEntry.md)
 - [NodePermissionEntry](docs/NodePermissionEntry.md)
 - [NodePermissions](docs/NodePermissions.md)
 - [NodeProperty](docs/NodeProperty.md)
 - [NodeRef](docs/NodeRef.md)
 - [NodeVersion](docs/NodeVersion.md)
 - [NodeVersionEntry](docs/NodeVersionEntry.md)
 - [NodeVersionRef](docs/NodeVersionRef.md)
 - [NodeVersionRefEntries](docs/NodeVersionRefEntries.md)
 - [Organization](docs/Organization.md)
 - [OrganizationEntries](docs/OrganizationEntries.md)
 - [Pagination](docs/Pagination.md)
 - [Person](docs/Person.md)
 - [Preview](docs/Preview.md)
 - [Repo](docs/Repo.md)
 - [RepoEntries](docs/RepoEntries.md)
 - [SearchParameters](docs/SearchParameters.md)
 - [SearchResult](docs/SearchResult.md)
 - [Service](docs/Service.md)
 - [ServiceInstance](docs/ServiceInstance.md)
 - [ServiceVersion](docs/ServiceVersion.md)
 - [Usage](docs/Usage.md)
 - [Usages](docs/Usages.md)
 - [User](docs/User.md)
 - [UserCredential](docs/UserCredential.md)
 - [UserEntries](docs/UserEntries.md)
 - [UserEntry](docs/UserEntry.md)
 - [UserProfile](docs/UserProfile.md)
 - [Value](docs/Value.md)
 - [ValueParameters](docs/ValueParameters.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



