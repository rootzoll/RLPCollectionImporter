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
import io.swagger.client.model.MdsQueryCriteria;
import java.util.ArrayList;
import java.util.List;


/**
 * SearchParameters
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-23T18:46:07.581+02:00")
public class SearchParameters   {
  @SerializedName("criterias")
  private List<MdsQueryCriteria> criterias = new ArrayList<MdsQueryCriteria>();

  @SerializedName("facettes")
  private List<String> facettes = new ArrayList<String>();

  public SearchParameters criterias(List<MdsQueryCriteria> criterias) {
    this.criterias = criterias;
    return this;
  }

   /**
   * Get criterias
   * @return criterias
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<MdsQueryCriteria> getCriterias() {
    return criterias;
  }

  public void setCriterias(List<MdsQueryCriteria> criterias) {
    this.criterias = criterias;
  }

  public SearchParameters facettes(List<String> facettes) {
    this.facettes = facettes;
    return this;
  }

   /**
   * Get facettes
   * @return facettes
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<String> getFacettes() {
    return facettes;
  }

  public void setFacettes(List<String> facettes) {
    this.facettes = facettes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchParameters searchParameters = (SearchParameters) o;
    return Objects.equals(this.criterias, searchParameters.criterias) &&
        Objects.equals(this.facettes, searchParameters.facettes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criterias, facettes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchParameters {\n");
    
    sb.append("    criterias: ").append(toIndentedString(criterias)).append("\n");
    sb.append("    facettes: ").append(toIndentedString(facettes)).append("\n");
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

