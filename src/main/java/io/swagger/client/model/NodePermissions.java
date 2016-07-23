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
import io.swagger.client.model.ACE;
import io.swagger.client.model.ACL;
import java.util.ArrayList;
import java.util.List;


/**
 * NodePermissions
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-23T21:01:37.657+02:00")
public class NodePermissions   {
  @SerializedName("localPermissions")
  private ACL localPermissions = null;

  @SerializedName("inheritedPermissions")
  private List<ACE> inheritedPermissions = new ArrayList<ACE>();

  public NodePermissions localPermissions(ACL localPermissions) {
    this.localPermissions = localPermissions;
    return this;
  }

   /**
   * Get localPermissions
   * @return localPermissions
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ACL getLocalPermissions() {
    return localPermissions;
  }

  public void setLocalPermissions(ACL localPermissions) {
    this.localPermissions = localPermissions;
  }

  public NodePermissions inheritedPermissions(List<ACE> inheritedPermissions) {
    this.inheritedPermissions = inheritedPermissions;
    return this;
  }

   /**
   * Get inheritedPermissions
   * @return inheritedPermissions
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<ACE> getInheritedPermissions() {
    return inheritedPermissions;
  }

  public void setInheritedPermissions(List<ACE> inheritedPermissions) {
    this.inheritedPermissions = inheritedPermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodePermissions nodePermissions = (NodePermissions) o;
    return Objects.equals(this.localPermissions, nodePermissions.localPermissions) &&
        Objects.equals(this.inheritedPermissions, nodePermissions.inheritedPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localPermissions, inheritedPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodePermissions {\n");
    
    sb.append("    localPermissions: ").append(toIndentedString(localPermissions)).append("\n");
    sb.append("    inheritedPermissions: ").append(toIndentedString(inheritedPermissions)).append("\n");
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

