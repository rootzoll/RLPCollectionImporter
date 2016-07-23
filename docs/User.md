
# User

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorityName** | **String** |  | 
**authorityType** | [**AuthorityTypeEnum**](#AuthorityTypeEnum) |  |  [optional]
**userName** | **String** |  |  [optional]
**profile** | [**UserProfile**](UserProfile.md) |  |  [optional]
**homeFolder** | [**NodeRef**](NodeRef.md) |  | 
**sharedFolders** | [**List&lt;NodeRef&gt;**](NodeRef.md) |  |  [optional]


<a name="AuthorityTypeEnum"></a>
## Enum: AuthorityTypeEnum
Name | Value
---- | -----
USER | &quot;USER&quot;
GROUP | &quot;GROUP&quot;
OWNER | &quot;OWNER&quot;
EVERYONE | &quot;EVERYONE&quot;
GUEST | &quot;GUEST&quot;



