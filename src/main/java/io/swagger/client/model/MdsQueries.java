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
import io.swagger.client.model.MdsQuery;
import java.util.ArrayList;
import java.util.List;


/**
 * MdsQueries
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-23T18:46:07.581+02:00")
public class MdsQueries   {
  @SerializedName("baseQuery")
  private String baseQuery = null;

  @SerializedName("queries")
  private List<MdsQuery> queries = new ArrayList<MdsQuery>();

  public MdsQueries baseQuery(String baseQuery) {
    this.baseQuery = baseQuery;
    return this;
  }

   /**
   * Get baseQuery
   * @return baseQuery
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getBaseQuery() {
    return baseQuery;
  }

  public void setBaseQuery(String baseQuery) {
    this.baseQuery = baseQuery;
  }

  public MdsQueries queries(List<MdsQuery> queries) {
    this.queries = queries;
    return this;
  }

   /**
   * Get queries
   * @return queries
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<MdsQuery> getQueries() {
    return queries;
  }

  public void setQueries(List<MdsQuery> queries) {
    this.queries = queries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdsQueries mdsQueries = (MdsQueries) o;
    return Objects.equals(this.baseQuery, mdsQueries.baseQuery) &&
        Objects.equals(this.queries, mdsQueries.queries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseQuery, queries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MdsQueries {\n");
    
    sb.append("    baseQuery: ").append(toIndentedString(baseQuery)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
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

