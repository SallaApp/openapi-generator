/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Animal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Cat
 */
@JsonPropertyOrder({
  Cat.JSON_PROPERTY_DECLAWED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", comments = "Generator version: 7.7.0-SNAPSHOT")
public class Cat extends Animal implements Serializable {
  public static final String JSON_PROPERTY_DECLAWED = "declawed";
  @JsonProperty(JSON_PROPERTY_DECLAWED)
  private Boolean declawed;

  public Cat declawed(Boolean declawed) {
    this.declawed = declawed;
    return this;
  }

  /**
   * Get declawed
   * @return declawed
   **/
  @JsonProperty(value = "declawed")
  @ApiModelProperty(value = "")
  
  public Boolean getDeclawed() {
    return declawed;
  }

  public void setDeclawed(Boolean declawed) {
    this.declawed = declawed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cat cat = (Cat) o;
    return super.equals(o) && Objects.equals(this.declawed, cat.declawed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), declawed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cat {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    declawed: ").append(toIndentedString(declawed)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

