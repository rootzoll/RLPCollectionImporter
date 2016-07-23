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
import io.swagger.client.model.MdsFormPanel;
import java.util.ArrayList;
import java.util.List;


/**
 * MdsForm
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-23T21:01:37.657+02:00")
public class MdsForm   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("panels")
  private List<MdsFormPanel> panels = new ArrayList<MdsFormPanel>();

  public MdsForm id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MdsForm panels(List<MdsFormPanel> panels) {
    this.panels = panels;
    return this;
  }

   /**
   * Get panels
   * @return panels
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<MdsFormPanel> getPanels() {
    return panels;
  }

  public void setPanels(List<MdsFormPanel> panels) {
    this.panels = panels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdsForm mdsForm = (MdsForm) o;
    return Objects.equals(this.id, mdsForm.id) &&
        Objects.equals(this.panels, mdsForm.panels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, panels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MdsForm {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    panels: ").append(toIndentedString(panels)).append("\n");
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

