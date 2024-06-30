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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import org.openapitools.client.JSON;


/**
 * BananaReq
 */
@JsonPropertyOrder({
  BananaReq.JSON_PROPERTY_LENGTH_CM,
  BananaReq.JSON_PROPERTY_SWEET
})
@JsonTypeName("bananaReq")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0-SNAPSHOT")
public class BananaReq {
  public static final String JSON_PROPERTY_LENGTH_CM = "lengthCm";
  private BigDecimal lengthCm;

  public static final String JSON_PROPERTY_SWEET = "sweet";
  private Boolean sweet;

  public BananaReq() { 
  }

  public BananaReq lengthCm(BigDecimal lengthCm) {
    this.lengthCm = lengthCm;
    return this;
  }

  /**
   * Get lengthCm
   * @return lengthCm
   */
  @jakarta.annotation.Nonnull
  @NotNull
  @Valid

  @JsonProperty(JSON_PROPERTY_LENGTH_CM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getLengthCm() {
    return lengthCm;
  }


  @JsonProperty(JSON_PROPERTY_LENGTH_CM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLengthCm(BigDecimal lengthCm) {
    this.lengthCm = lengthCm;
  }


  public BananaReq sweet(Boolean sweet) {
    this.sweet = sweet;
    return this;
  }

  /**
   * Get sweet
   * @return sweet
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_SWEET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSweet() {
    return sweet;
  }


  @JsonProperty(JSON_PROPERTY_SWEET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSweet(Boolean sweet) {
    this.sweet = sweet;
  }


  /**
   * Return true if this bananaReq object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BananaReq bananaReq = (BananaReq) o;
    return Objects.equals(this.lengthCm, bananaReq.lengthCm) &&
        Objects.equals(this.sweet, bananaReq.sweet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lengthCm, sweet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BananaReq {\n");
    sb.append("    lengthCm: ").append(toIndentedString(lengthCm)).append("\n");
    sb.append("    sweet: ").append(toIndentedString(sweet)).append("\n");
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

