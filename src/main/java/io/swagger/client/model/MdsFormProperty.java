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
import io.swagger.client.model.MdsFormPropertyParameter;
import io.swagger.client.model.MdsFormPropertyValue;
import java.util.ArrayList;
import java.util.List;


/**
 * MdsFormProperty
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-23T21:01:37.657+02:00")
public class MdsFormProperty   {
  @SerializedName("name")
  private String name = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("labelHint")
  private String labelHint = null;

  @SerializedName("formHeight")
  private String formHeight = null;

  @SerializedName("formLength")
  private String formLength = null;

  @SerializedName("widget")
  private String widget = null;

  @SerializedName("widgetTitle")
  private String widgetTitle = null;

  @SerializedName("copyFrom")
  private List<String> copyFrom = new ArrayList<String>();

  @SerializedName("validators")
  private List<String> validators = new ArrayList<String>();

  @SerializedName("parameters")
  private List<MdsFormPropertyParameter> parameters = new ArrayList<MdsFormPropertyParameter>();

  @SerializedName("values")
  private List<MdsFormPropertyValue> values = new ArrayList<MdsFormPropertyValue>();

  @SerializedName("defaultValues")
  private List<String> defaultValues = new ArrayList<String>();

  @SerializedName("multiple")
  private Boolean multiple = false;

  @SerializedName("placeHolder")
  private String placeHolder = null;

  @SerializedName("styleName")
  private String styleName = null;

  @SerializedName("styleNameLabel")
  private String styleNameLabel = null;

  @SerializedName("type")
  private String type = null;

  public MdsFormProperty name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MdsFormProperty label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public MdsFormProperty labelHint(String labelHint) {
    this.labelHint = labelHint;
    return this;
  }

   /**
   * Get labelHint
   * @return labelHint
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getLabelHint() {
    return labelHint;
  }

  public void setLabelHint(String labelHint) {
    this.labelHint = labelHint;
  }

  public MdsFormProperty formHeight(String formHeight) {
    this.formHeight = formHeight;
    return this;
  }

   /**
   * Get formHeight
   * @return formHeight
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getFormHeight() {
    return formHeight;
  }

  public void setFormHeight(String formHeight) {
    this.formHeight = formHeight;
  }

  public MdsFormProperty formLength(String formLength) {
    this.formLength = formLength;
    return this;
  }

   /**
   * Get formLength
   * @return formLength
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getFormLength() {
    return formLength;
  }

  public void setFormLength(String formLength) {
    this.formLength = formLength;
  }

  public MdsFormProperty widget(String widget) {
    this.widget = widget;
    return this;
  }

   /**
   * Get widget
   * @return widget
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getWidget() {
    return widget;
  }

  public void setWidget(String widget) {
    this.widget = widget;
  }

  public MdsFormProperty widgetTitle(String widgetTitle) {
    this.widgetTitle = widgetTitle;
    return this;
  }

   /**
   * Get widgetTitle
   * @return widgetTitle
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getWidgetTitle() {
    return widgetTitle;
  }

  public void setWidgetTitle(String widgetTitle) {
    this.widgetTitle = widgetTitle;
  }

  public MdsFormProperty copyFrom(List<String> copyFrom) {
    this.copyFrom = copyFrom;
    return this;
  }

   /**
   * Get copyFrom
   * @return copyFrom
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<String> getCopyFrom() {
    return copyFrom;
  }

  public void setCopyFrom(List<String> copyFrom) {
    this.copyFrom = copyFrom;
  }

  public MdsFormProperty validators(List<String> validators) {
    this.validators = validators;
    return this;
  }

   /**
   * Get validators
   * @return validators
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<String> getValidators() {
    return validators;
  }

  public void setValidators(List<String> validators) {
    this.validators = validators;
  }

  public MdsFormProperty parameters(List<MdsFormPropertyParameter> parameters) {
    this.parameters = parameters;
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<MdsFormPropertyParameter> getParameters() {
    return parameters;
  }

  public void setParameters(List<MdsFormPropertyParameter> parameters) {
    this.parameters = parameters;
  }

  public MdsFormProperty values(List<MdsFormPropertyValue> values) {
    this.values = values;
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<MdsFormPropertyValue> getValues() {
    return values;
  }

  public void setValues(List<MdsFormPropertyValue> values) {
    this.values = values;
  }

  public MdsFormProperty defaultValues(List<String> defaultValues) {
    this.defaultValues = defaultValues;
    return this;
  }

   /**
   * Get defaultValues
   * @return defaultValues
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<String> getDefaultValues() {
    return defaultValues;
  }

  public void setDefaultValues(List<String> defaultValues) {
    this.defaultValues = defaultValues;
  }

  public MdsFormProperty multiple(Boolean multiple) {
    this.multiple = multiple;
    return this;
  }

   /**
   * Get multiple
   * @return multiple
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getMultiple() {
    return multiple;
  }

  public void setMultiple(Boolean multiple) {
    this.multiple = multiple;
  }

  public MdsFormProperty placeHolder(String placeHolder) {
    this.placeHolder = placeHolder;
    return this;
  }

   /**
   * Get placeHolder
   * @return placeHolder
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getPlaceHolder() {
    return placeHolder;
  }

  public void setPlaceHolder(String placeHolder) {
    this.placeHolder = placeHolder;
  }

  public MdsFormProperty styleName(String styleName) {
    this.styleName = styleName;
    return this;
  }

   /**
   * Get styleName
   * @return styleName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getStyleName() {
    return styleName;
  }

  public void setStyleName(String styleName) {
    this.styleName = styleName;
  }

  public MdsFormProperty styleNameLabel(String styleNameLabel) {
    this.styleNameLabel = styleNameLabel;
    return this;
  }

   /**
   * Get styleNameLabel
   * @return styleNameLabel
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getStyleNameLabel() {
    return styleNameLabel;
  }

  public void setStyleNameLabel(String styleNameLabel) {
    this.styleNameLabel = styleNameLabel;
  }

  public MdsFormProperty type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MdsFormProperty mdsFormProperty = (MdsFormProperty) o;
    return Objects.equals(this.name, mdsFormProperty.name) &&
        Objects.equals(this.label, mdsFormProperty.label) &&
        Objects.equals(this.labelHint, mdsFormProperty.labelHint) &&
        Objects.equals(this.formHeight, mdsFormProperty.formHeight) &&
        Objects.equals(this.formLength, mdsFormProperty.formLength) &&
        Objects.equals(this.widget, mdsFormProperty.widget) &&
        Objects.equals(this.widgetTitle, mdsFormProperty.widgetTitle) &&
        Objects.equals(this.copyFrom, mdsFormProperty.copyFrom) &&
        Objects.equals(this.validators, mdsFormProperty.validators) &&
        Objects.equals(this.parameters, mdsFormProperty.parameters) &&
        Objects.equals(this.values, mdsFormProperty.values) &&
        Objects.equals(this.defaultValues, mdsFormProperty.defaultValues) &&
        Objects.equals(this.multiple, mdsFormProperty.multiple) &&
        Objects.equals(this.placeHolder, mdsFormProperty.placeHolder) &&
        Objects.equals(this.styleName, mdsFormProperty.styleName) &&
        Objects.equals(this.styleNameLabel, mdsFormProperty.styleNameLabel) &&
        Objects.equals(this.type, mdsFormProperty.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, label, labelHint, formHeight, formLength, widget, widgetTitle, copyFrom, validators, parameters, values, defaultValues, multiple, placeHolder, styleName, styleNameLabel, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MdsFormProperty {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    labelHint: ").append(toIndentedString(labelHint)).append("\n");
    sb.append("    formHeight: ").append(toIndentedString(formHeight)).append("\n");
    sb.append("    formLength: ").append(toIndentedString(formLength)).append("\n");
    sb.append("    widget: ").append(toIndentedString(widget)).append("\n");
    sb.append("    widgetTitle: ").append(toIndentedString(widgetTitle)).append("\n");
    sb.append("    copyFrom: ").append(toIndentedString(copyFrom)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    defaultValues: ").append(toIndentedString(defaultValues)).append("\n");
    sb.append("    multiple: ").append(toIndentedString(multiple)).append("\n");
    sb.append("    placeHolder: ").append(toIndentedString(placeHolder)).append("\n");
    sb.append("    styleName: ").append(toIndentedString(styleName)).append("\n");
    sb.append("    styleNameLabel: ").append(toIndentedString(styleNameLabel)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

