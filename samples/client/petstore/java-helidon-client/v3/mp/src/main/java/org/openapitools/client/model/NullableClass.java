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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.NoSuchElementException;




public class NullableClass extends HashMap<String, Object> {
  
  private Integer integerProp;

  private BigDecimal numberProp;

  private Boolean booleanProp;

  private String stringProp;

  private LocalDate dateProp;

  private OffsetDateTime datetimeProp;

  private List<Object> arrayNullableProp = null;

  private List<Object> arrayAndItemsNullableProp = null;

  private List<Object> arrayItemsNullable = null;

  private Map<String, Object> objectNullableProp = null;

  private Map<String, Object> objectAndItemsNullableProp = null;

  private Map<String, Object> objectItemsNullable = null;

 /**
   * Get integerProp
   * @return integerProp
  **/
  public Integer getIntegerProp() {
    return integerProp;
  }

  /**
    * Set integerProp
  **/
  public void setIntegerProp(Integer integerProp) {
    this.integerProp = integerProp;
  }

  public NullableClass integerProp(Integer integerProp) {
    this.integerProp = integerProp;
    return this;
  }

 /**
   * Get numberProp
   * @return numberProp
  **/
  public BigDecimal getNumberProp() {
    return numberProp;
  }

  /**
    * Set numberProp
  **/
  public void setNumberProp(BigDecimal numberProp) {
    this.numberProp = numberProp;
  }

  public NullableClass numberProp(BigDecimal numberProp) {
    this.numberProp = numberProp;
    return this;
  }

 /**
   * Get booleanProp
   * @return booleanProp
  **/
  public Boolean getBooleanProp() {
    return booleanProp;
  }

  /**
    * Set booleanProp
  **/
  public void setBooleanProp(Boolean booleanProp) {
    this.booleanProp = booleanProp;
  }

  public NullableClass booleanProp(Boolean booleanProp) {
    this.booleanProp = booleanProp;
    return this;
  }

 /**
   * Get stringProp
   * @return stringProp
  **/
  public String getStringProp() {
    return stringProp;
  }

  /**
    * Set stringProp
  **/
  public void setStringProp(String stringProp) {
    this.stringProp = stringProp;
  }

  public NullableClass stringProp(String stringProp) {
    this.stringProp = stringProp;
    return this;
  }

 /**
   * Get dateProp
   * @return dateProp
  **/
  public LocalDate getDateProp() {
    return dateProp;
  }

  /**
    * Set dateProp
  **/
  public void setDateProp(LocalDate dateProp) {
    this.dateProp = dateProp;
  }

  public NullableClass dateProp(LocalDate dateProp) {
    this.dateProp = dateProp;
    return this;
  }

 /**
   * Get datetimeProp
   * @return datetimeProp
  **/
  public OffsetDateTime getDatetimeProp() {
    return datetimeProp;
  }

  /**
    * Set datetimeProp
  **/
  public void setDatetimeProp(OffsetDateTime datetimeProp) {
    this.datetimeProp = datetimeProp;
  }

  public NullableClass datetimeProp(OffsetDateTime datetimeProp) {
    this.datetimeProp = datetimeProp;
    return this;
  }

 /**
   * Get arrayNullableProp
   * @return arrayNullableProp
  **/
  public List<Object> getArrayNullableProp() {
    return arrayNullableProp;
  }

  /**
    * Set arrayNullableProp
  **/
  public void setArrayNullableProp(List<Object> arrayNullableProp) {
    this.arrayNullableProp = arrayNullableProp;
  }

  public NullableClass arrayNullableProp(List<Object> arrayNullableProp) {
    this.arrayNullableProp = arrayNullableProp;
    return this;
  }

  public NullableClass addArrayNullablePropItem(Object arrayNullablePropItem) {
    this.arrayNullableProp.add(arrayNullablePropItem);
    return this;
  }

 /**
   * Get arrayAndItemsNullableProp
   * @return arrayAndItemsNullableProp
  **/
  public List<Object> getArrayAndItemsNullableProp() {
    return arrayAndItemsNullableProp;
  }

  /**
    * Set arrayAndItemsNullableProp
  **/
  public void setArrayAndItemsNullableProp(List<Object> arrayAndItemsNullableProp) {
    this.arrayAndItemsNullableProp = arrayAndItemsNullableProp;
  }

  public NullableClass arrayAndItemsNullableProp(List<Object> arrayAndItemsNullableProp) {
    this.arrayAndItemsNullableProp = arrayAndItemsNullableProp;
    return this;
  }

  public NullableClass addArrayAndItemsNullablePropItem(Object arrayAndItemsNullablePropItem) {
    this.arrayAndItemsNullableProp.add(arrayAndItemsNullablePropItem);
    return this;
  }

 /**
   * Get arrayItemsNullable
   * @return arrayItemsNullable
  **/
  public List<Object> getArrayItemsNullable() {
    return arrayItemsNullable;
  }

  /**
    * Set arrayItemsNullable
  **/
  public void setArrayItemsNullable(List<Object> arrayItemsNullable) {
    this.arrayItemsNullable = arrayItemsNullable;
  }

  public NullableClass arrayItemsNullable(List<Object> arrayItemsNullable) {
    this.arrayItemsNullable = arrayItemsNullable;
    return this;
  }

  public NullableClass addArrayItemsNullableItem(Object arrayItemsNullableItem) {
    this.arrayItemsNullable.add(arrayItemsNullableItem);
    return this;
  }

 /**
   * Get objectNullableProp
   * @return objectNullableProp
  **/
  public Map<String, Object> getObjectNullableProp() {
    return objectNullableProp;
  }

  /**
    * Set objectNullableProp
  **/
  public void setObjectNullableProp(Map<String, Object> objectNullableProp) {
    this.objectNullableProp = objectNullableProp;
  }

  public NullableClass objectNullableProp(Map<String, Object> objectNullableProp) {
    this.objectNullableProp = objectNullableProp;
    return this;
  }

  public NullableClass putObjectNullablePropItem(String key, Object objectNullablePropItem) {
    this.objectNullableProp.put(key, objectNullablePropItem);
    return this;
  }

 /**
   * Get objectAndItemsNullableProp
   * @return objectAndItemsNullableProp
  **/
  public Map<String, Object> getObjectAndItemsNullableProp() {
    return objectAndItemsNullableProp;
  }

  /**
    * Set objectAndItemsNullableProp
  **/
  public void setObjectAndItemsNullableProp(Map<String, Object> objectAndItemsNullableProp) {
    this.objectAndItemsNullableProp = objectAndItemsNullableProp;
  }

  public NullableClass objectAndItemsNullableProp(Map<String, Object> objectAndItemsNullableProp) {
    this.objectAndItemsNullableProp = objectAndItemsNullableProp;
    return this;
  }

  public NullableClass putObjectAndItemsNullablePropItem(String key, Object objectAndItemsNullablePropItem) {
    this.objectAndItemsNullableProp.put(key, objectAndItemsNullablePropItem);
    return this;
  }

 /**
   * Get objectItemsNullable
   * @return objectItemsNullable
  **/
  public Map<String, Object> getObjectItemsNullable() {
    return objectItemsNullable;
  }

  /**
    * Set objectItemsNullable
  **/
  public void setObjectItemsNullable(Map<String, Object> objectItemsNullable) {
    this.objectItemsNullable = objectItemsNullable;
  }

  public NullableClass objectItemsNullable(Map<String, Object> objectItemsNullable) {
    this.objectItemsNullable = objectItemsNullable;
    return this;
  }

  public NullableClass putObjectItemsNullableItem(String key, Object objectItemsNullableItem) {
    this.objectItemsNullable.put(key, objectItemsNullableItem);
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NullableClass {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    integerProp: ").append(toIndentedString(integerProp)).append("\n");
    sb.append("    numberProp: ").append(toIndentedString(numberProp)).append("\n");
    sb.append("    booleanProp: ").append(toIndentedString(booleanProp)).append("\n");
    sb.append("    stringProp: ").append(toIndentedString(stringProp)).append("\n");
    sb.append("    dateProp: ").append(toIndentedString(dateProp)).append("\n");
    sb.append("    datetimeProp: ").append(toIndentedString(datetimeProp)).append("\n");
    sb.append("    arrayNullableProp: ").append(toIndentedString(arrayNullableProp)).append("\n");
    sb.append("    arrayAndItemsNullableProp: ").append(toIndentedString(arrayAndItemsNullableProp)).append("\n");
    sb.append("    arrayItemsNullable: ").append(toIndentedString(arrayItemsNullable)).append("\n");
    sb.append("    objectNullableProp: ").append(toIndentedString(objectNullableProp)).append("\n");
    sb.append("    objectAndItemsNullableProp: ").append(toIndentedString(objectAndItemsNullableProp)).append("\n");
    sb.append("    objectItemsNullable: ").append(toIndentedString(objectItemsNullable)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

