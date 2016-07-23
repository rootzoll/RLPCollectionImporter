/**
 * edu-sharing Repository REST API
 * The public restful API of the edu-sharing repository.
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.GroupProfile;
import io.swagger.client.model.NodeRef;


/**
 * Organization
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-23T19:08:31.348+02:00")
public class Organization   {
  @SerializedName("authorityName")
  private String authorityName = null;

  /**
   * Gets or Sets authorityType
   */
  public enum AuthorityTypeEnum {
    @SerializedName("USER")
    USER("USER"),
    
    @SerializedName("GROUP")
    GROUP("GROUP"),
    
    @SerializedName("OWNER")
    OWNER("OWNER"),
    
    @SerializedName("EVERYONE")
    EVERYONE("EVERYONE"),
    
    @SerializedName("GUEST")
    GUEST("GUEST");

    private String value;

    AuthorityTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("authorityType")
  private AuthorityTypeEnum authorityType = null;

  @SerializedName("groupName")
  private String groupName = null;

  @SerializedName("profile")
  private GroupProfile profile = null;

  @SerializedName("sharedFolder")
  private NodeRef sharedFolder = null;

  public Organization authorityName(String authorityName) {
    this.authorityName = authorityName;
    return this;
  }

   /**
   * Get authorityName
   * @return authorityName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getAuthorityName() {
    return authorityName;
  }

  public void setAuthorityName(String authorityName) {
    this.authorityName = authorityName;
  }

  public Organization authorityType(AuthorityTypeEnum authorityType) {
    this.authorityType = authorityType;
    return this;
  }

   /**
   * Get authorityType
   * @return authorityType
  **/
  @ApiModelProperty(example = "null", value = "")
  public AuthorityTypeEnum getAuthorityType() {
    return authorityType;
  }

  public void setAuthorityType(AuthorityTypeEnum authorityType) {
    this.authorityType = authorityType;
  }

  public Organization groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public Organization profile(GroupProfile profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @ApiModelProperty(example = "null", value = "")
  public GroupProfile getProfile() {
    return profile;
  }

  public void setProfile(GroupProfile profile) {
    this.profile = profile;
  }

  public Organization sharedFolder(NodeRef sharedFolder) {
    this.sharedFolder = sharedFolder;
    return this;
  }

   /**
   * Get sharedFolder
   * @return sharedFolder
  **/
  @ApiModelProperty(example = "null", value = "")
  public NodeRef getSharedFolder() {
    return sharedFolder;
  }

  public void setSharedFolder(NodeRef sharedFolder) {
    this.sharedFolder = sharedFolder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.authorityName, organization.authorityName) &&
        Objects.equals(this.authorityType, organization.authorityType) &&
        Objects.equals(this.groupName, organization.groupName) &&
        Objects.equals(this.profile, organization.profile) &&
        Objects.equals(this.sharedFolder, organization.sharedFolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorityName, authorityType, groupName, profile, sharedFolder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    authorityName: ").append(toIndentedString(authorityName)).append("\n");
    sb.append("    authorityType: ").append(toIndentedString(authorityType)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    sharedFolder: ").append(toIndentedString(sharedFolder)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

