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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * TypeHolderExample
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0-SNAPSHOT")
public class TypeHolderExample {
  public static final String SERIALIZED_NAME_STRING_ITEM = "string_item";
  @SerializedName(SERIALIZED_NAME_STRING_ITEM)
  private String stringItem;

  public static final String SERIALIZED_NAME_NUMBER_ITEM = "number_item";
  @SerializedName(SERIALIZED_NAME_NUMBER_ITEM)
  private BigDecimal numberItem;

  public static final String SERIALIZED_NAME_FLOAT_ITEM = "float_item";
  @SerializedName(SERIALIZED_NAME_FLOAT_ITEM)
  private Float floatItem;

  public static final String SERIALIZED_NAME_INTEGER_ITEM = "integer_item";
  @SerializedName(SERIALIZED_NAME_INTEGER_ITEM)
  private Integer integerItem;

  public static final String SERIALIZED_NAME_BOOL_ITEM = "bool_item";
  @SerializedName(SERIALIZED_NAME_BOOL_ITEM)
  private Boolean boolItem;

  public static final String SERIALIZED_NAME_ARRAY_ITEM = "array_item";
  @SerializedName(SERIALIZED_NAME_ARRAY_ITEM)
  private List<Integer> arrayItem = new ArrayList<>();

  public TypeHolderExample() {
  }

  public TypeHolderExample stringItem(String stringItem) {
    
    this.stringItem = stringItem;
    return this;
  }

   /**
   * Get stringItem
   * @return stringItem
  **/
  @javax.annotation.Nonnull
  @NotNull


  public String getStringItem() {
    return stringItem;
  }


  public void setStringItem(String stringItem) {
    this.stringItem = stringItem;
  }


  public TypeHolderExample numberItem(BigDecimal numberItem) {
    
    this.numberItem = numberItem;
    return this;
  }

   /**
   * Get numberItem
   * @return numberItem
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid


  public BigDecimal getNumberItem() {
    return numberItem;
  }


  public void setNumberItem(BigDecimal numberItem) {
    this.numberItem = numberItem;
  }


  public TypeHolderExample floatItem(Float floatItem) {
    
    this.floatItem = floatItem;
    return this;
  }

   /**
   * Get floatItem
   * @return floatItem
  **/
  @javax.annotation.Nonnull
  @NotNull


  public Float getFloatItem() {
    return floatItem;
  }


  public void setFloatItem(Float floatItem) {
    this.floatItem = floatItem;
  }


  public TypeHolderExample integerItem(Integer integerItem) {
    
    this.integerItem = integerItem;
    return this;
  }

   /**
   * Get integerItem
   * @return integerItem
  **/
  @javax.annotation.Nonnull
  @NotNull


  public Integer getIntegerItem() {
    return integerItem;
  }


  public void setIntegerItem(Integer integerItem) {
    this.integerItem = integerItem;
  }


  public TypeHolderExample boolItem(Boolean boolItem) {
    
    this.boolItem = boolItem;
    return this;
  }

   /**
   * Get boolItem
   * @return boolItem
  **/
  @javax.annotation.Nonnull
  @NotNull


  public Boolean isBoolItem() {
    return boolItem;
  }


  public void setBoolItem(Boolean boolItem) {
    this.boolItem = boolItem;
  }


  public TypeHolderExample arrayItem(List<Integer> arrayItem) {
    
    this.arrayItem = arrayItem;
    return this;
  }

  public TypeHolderExample addArrayItemItem(Integer arrayItemItem) {
    if (this.arrayItem == null) {
      this.arrayItem = new ArrayList<>();
    }
    this.arrayItem.add(arrayItemItem);
    return this;
  }

   /**
   * Get arrayItem
   * @return arrayItem
  **/
  @javax.annotation.Nonnull
  @NotNull


  public List<Integer> getArrayItem() {
    return arrayItem;
  }


  public void setArrayItem(List<Integer> arrayItem) {
    this.arrayItem = arrayItem;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeHolderExample typeHolderExample = (TypeHolderExample) o;
    return Objects.equals(this.stringItem, typeHolderExample.stringItem) &&
        Objects.equals(this.numberItem, typeHolderExample.numberItem) &&
        Objects.equals(this.floatItem, typeHolderExample.floatItem) &&
        Objects.equals(this.integerItem, typeHolderExample.integerItem) &&
        Objects.equals(this.boolItem, typeHolderExample.boolItem) &&
        Objects.equals(this.arrayItem, typeHolderExample.arrayItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringItem, numberItem, floatItem, integerItem, boolItem, arrayItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeHolderExample {\n");
    sb.append("    stringItem: ").append(toIndentedString(stringItem)).append("\n");
    sb.append("    numberItem: ").append(toIndentedString(numberItem)).append("\n");
    sb.append("    floatItem: ").append(toIndentedString(floatItem)).append("\n");
    sb.append("    integerItem: ").append(toIndentedString(integerItem)).append("\n");
    sb.append("    boolItem: ").append(toIndentedString(boolItem)).append("\n");
    sb.append("    arrayItem: ").append(toIndentedString(arrayItem)).append("\n");
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

