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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.dataformat.xml.annotation.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.*;
import io.github.threetenjaxb.core.*;

/**
 * OuterComposite
 */
@JsonPropertyOrder({
  OuterComposite.JSON_PROPERTY_MY_NUMBER,
  OuterComposite.JSON_PROPERTY_MY_STRING,
  OuterComposite.JSON_PROPERTY_MY_BOOLEAN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
@XmlRootElement(name = "OuterComposite")
@XmlAccessorType(XmlAccessType.FIELD)
@JacksonXmlRootElement(localName = "OuterComposite")
public class OuterComposite {
  public static final String JSON_PROPERTY_MY_NUMBER = "my_number";
  @XmlElement(name = "my_number")
  @javax.annotation.Nullable
  private BigDecimal myNumber;

  public static final String JSON_PROPERTY_MY_STRING = "my_string";
  @XmlElement(name = "my_string")
  @javax.annotation.Nullable
  private String myString;

  public static final String JSON_PROPERTY_MY_BOOLEAN = "my_boolean";
  @XmlElement(name = "my_boolean")
  @javax.annotation.Nullable
  private Boolean myBoolean;

  public OuterComposite() {
  }

  public OuterComposite myNumber(@javax.annotation.Nullable BigDecimal myNumber) {
    
    this.myNumber = myNumber;
    return this;
  }

  /**
   * Get myNumber
   * @return myNumber
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "my_number")

  public BigDecimal getMyNumber() {
    return myNumber;
  }


  @JsonProperty(JSON_PROPERTY_MY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "my_number")
  public void setMyNumber(@javax.annotation.Nullable BigDecimal myNumber) {
    this.myNumber = myNumber;
  }

  public OuterComposite myString(@javax.annotation.Nullable String myString) {
    
    this.myString = myString;
    return this;
  }

  /**
   * Get myString
   * @return myString
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "my_string")

  public String getMyString() {
    return myString;
  }


  @JsonProperty(JSON_PROPERTY_MY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "my_string")
  public void setMyString(@javax.annotation.Nullable String myString) {
    this.myString = myString;
  }

  public OuterComposite myBoolean(@javax.annotation.Nullable Boolean myBoolean) {
    
    this.myBoolean = myBoolean;
    return this;
  }

  /**
   * Get myBoolean
   * @return myBoolean
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MY_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "my_boolean")

  public Boolean getMyBoolean() {
    return myBoolean;
  }


  @JsonProperty(JSON_PROPERTY_MY_BOOLEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  @JacksonXmlProperty(localName = "my_boolean")
  public void setMyBoolean(@javax.annotation.Nullable Boolean myBoolean) {
    this.myBoolean = myBoolean;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OuterComposite outerComposite = (OuterComposite) o;
    return Objects.equals(this.myNumber, outerComposite.myNumber) &&
        Objects.equals(this.myString, outerComposite.myString) &&
        Objects.equals(this.myBoolean, outerComposite.myBoolean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(myNumber, myString, myBoolean);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OuterComposite {\n");
    sb.append("    myNumber: ").append(toIndentedString(myNumber)).append("\n");
    sb.append("    myString: ").append(toIndentedString(myString)).append("\n");
    sb.append("    myBoolean: ").append(toIndentedString(myBoolean)).append("\n");
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

