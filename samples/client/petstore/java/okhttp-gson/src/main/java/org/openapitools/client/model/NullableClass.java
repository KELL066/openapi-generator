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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * NullableClass
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.11.0-SNAPSHOT")
public class NullableClass {
  public static final String SERIALIZED_NAME_INTEGER_PROP = "integer_prop";
  @SerializedName(SERIALIZED_NAME_INTEGER_PROP)
  @javax.annotation.Nullable
  private Integer integerProp;

  public static final String SERIALIZED_NAME_NUMBER_PROP = "number_prop";
  @SerializedName(SERIALIZED_NAME_NUMBER_PROP)
  @javax.annotation.Nullable
  private BigDecimal numberProp;

  public static final String SERIALIZED_NAME_BOOLEAN_PROP = "boolean_prop";
  @SerializedName(SERIALIZED_NAME_BOOLEAN_PROP)
  @javax.annotation.Nullable
  private Boolean booleanProp;

  public static final String SERIALIZED_NAME_STRING_PROP = "string_prop";
  @SerializedName(SERIALIZED_NAME_STRING_PROP)
  @javax.annotation.Nullable
  private String stringProp;

  public static final String SERIALIZED_NAME_DATE_PROP = "date_prop";
  @SerializedName(SERIALIZED_NAME_DATE_PROP)
  @javax.annotation.Nullable
  private LocalDate dateProp;

  public static final String SERIALIZED_NAME_DATETIME_PROP = "datetime_prop";
  @SerializedName(SERIALIZED_NAME_DATETIME_PROP)
  @javax.annotation.Nullable
  private OffsetDateTime datetimeProp;

  public static final String SERIALIZED_NAME_ARRAY_NULLABLE_PROP = "array_nullable_prop";
  @SerializedName(SERIALIZED_NAME_ARRAY_NULLABLE_PROP)
  @javax.annotation.Nullable
  private List<Object> arrayNullableProp;

  public static final String SERIALIZED_NAME_ARRAY_AND_ITEMS_NULLABLE_PROP = "array_and_items_nullable_prop";
  @SerializedName(SERIALIZED_NAME_ARRAY_AND_ITEMS_NULLABLE_PROP)
  @javax.annotation.Nullable
  private List<Object> arrayAndItemsNullableProp;

  public static final String SERIALIZED_NAME_ARRAY_ITEMS_NULLABLE = "array_items_nullable";
  @SerializedName(SERIALIZED_NAME_ARRAY_ITEMS_NULLABLE)
  @javax.annotation.Nullable
  private List<Object> arrayItemsNullable = new ArrayList<>();

  public static final String SERIALIZED_NAME_OBJECT_NULLABLE_PROP = "object_nullable_prop";
  @SerializedName(SERIALIZED_NAME_OBJECT_NULLABLE_PROP)
  @javax.annotation.Nullable
  private Map<String, Object> objectNullableProp;

  public static final String SERIALIZED_NAME_OBJECT_AND_ITEMS_NULLABLE_PROP = "object_and_items_nullable_prop";
  @SerializedName(SERIALIZED_NAME_OBJECT_AND_ITEMS_NULLABLE_PROP)
  @javax.annotation.Nullable
  private Map<String, Object> objectAndItemsNullableProp;

  public static final String SERIALIZED_NAME_OBJECT_ITEMS_NULLABLE = "object_items_nullable";
  @SerializedName(SERIALIZED_NAME_OBJECT_ITEMS_NULLABLE)
  @javax.annotation.Nullable
  private Map<String, Object> objectItemsNullable = new HashMap<>();

  public NullableClass() {
  }

  public NullableClass integerProp(@javax.annotation.Nullable Integer integerProp) {
    this.integerProp = integerProp;
    return this;
  }

  /**
   * Get integerProp
   * @return integerProp
   */
  @javax.annotation.Nullable
  public Integer getIntegerProp() {
    return integerProp;
  }

  public void setIntegerProp(@javax.annotation.Nullable Integer integerProp) {
    this.integerProp = integerProp;
  }


  public NullableClass numberProp(@javax.annotation.Nullable BigDecimal numberProp) {
    this.numberProp = numberProp;
    return this;
  }

  /**
   * Get numberProp
   * @return numberProp
   */
  @javax.annotation.Nullable
  public BigDecimal getNumberProp() {
    return numberProp;
  }

  public void setNumberProp(@javax.annotation.Nullable BigDecimal numberProp) {
    this.numberProp = numberProp;
  }


  public NullableClass booleanProp(@javax.annotation.Nullable Boolean booleanProp) {
    this.booleanProp = booleanProp;
    return this;
  }

  /**
   * Get booleanProp
   * @return booleanProp
   */
  @javax.annotation.Nullable
  public Boolean getBooleanProp() {
    return booleanProp;
  }

  public void setBooleanProp(@javax.annotation.Nullable Boolean booleanProp) {
    this.booleanProp = booleanProp;
  }


  public NullableClass stringProp(@javax.annotation.Nullable String stringProp) {
    this.stringProp = stringProp;
    return this;
  }

  /**
   * Get stringProp
   * @return stringProp
   */
  @javax.annotation.Nullable
  public String getStringProp() {
    return stringProp;
  }

  public void setStringProp(@javax.annotation.Nullable String stringProp) {
    this.stringProp = stringProp;
  }


  public NullableClass dateProp(@javax.annotation.Nullable LocalDate dateProp) {
    this.dateProp = dateProp;
    return this;
  }

  /**
   * Get dateProp
   * @return dateProp
   */
  @javax.annotation.Nullable
  public LocalDate getDateProp() {
    return dateProp;
  }

  public void setDateProp(@javax.annotation.Nullable LocalDate dateProp) {
    this.dateProp = dateProp;
  }


  public NullableClass datetimeProp(@javax.annotation.Nullable OffsetDateTime datetimeProp) {
    this.datetimeProp = datetimeProp;
    return this;
  }

  /**
   * Get datetimeProp
   * @return datetimeProp
   */
  @javax.annotation.Nullable
  public OffsetDateTime getDatetimeProp() {
    return datetimeProp;
  }

  public void setDatetimeProp(@javax.annotation.Nullable OffsetDateTime datetimeProp) {
    this.datetimeProp = datetimeProp;
  }


  public NullableClass arrayNullableProp(@javax.annotation.Nullable List<Object> arrayNullableProp) {
    this.arrayNullableProp = arrayNullableProp;
    return this;
  }

  public NullableClass addArrayNullablePropItem(Object arrayNullablePropItem) {
    if (this.arrayNullableProp == null) {
      this.arrayNullableProp = new ArrayList<>();
    }
    this.arrayNullableProp.add(arrayNullablePropItem);
    return this;
  }

  /**
   * Get arrayNullableProp
   * @return arrayNullableProp
   */
  @javax.annotation.Nullable
  public List<Object> getArrayNullableProp() {
    return arrayNullableProp;
  }

  public void setArrayNullableProp(@javax.annotation.Nullable List<Object> arrayNullableProp) {
    this.arrayNullableProp = arrayNullableProp;
  }


  public NullableClass arrayAndItemsNullableProp(@javax.annotation.Nullable List<Object> arrayAndItemsNullableProp) {
    this.arrayAndItemsNullableProp = arrayAndItemsNullableProp;
    return this;
  }

  public NullableClass addArrayAndItemsNullablePropItem(Object arrayAndItemsNullablePropItem) {
    if (this.arrayAndItemsNullableProp == null) {
      this.arrayAndItemsNullableProp = new ArrayList<>();
    }
    this.arrayAndItemsNullableProp.add(arrayAndItemsNullablePropItem);
    return this;
  }

  /**
   * Get arrayAndItemsNullableProp
   * @return arrayAndItemsNullableProp
   */
  @javax.annotation.Nullable
  public List<Object> getArrayAndItemsNullableProp() {
    return arrayAndItemsNullableProp;
  }

  public void setArrayAndItemsNullableProp(@javax.annotation.Nullable List<Object> arrayAndItemsNullableProp) {
    this.arrayAndItemsNullableProp = arrayAndItemsNullableProp;
  }


  public NullableClass arrayItemsNullable(@javax.annotation.Nullable List<Object> arrayItemsNullable) {
    this.arrayItemsNullable = arrayItemsNullable;
    return this;
  }

  public NullableClass addArrayItemsNullableItem(Object arrayItemsNullableItem) {
    if (this.arrayItemsNullable == null) {
      this.arrayItemsNullable = new ArrayList<>();
    }
    this.arrayItemsNullable.add(arrayItemsNullableItem);
    return this;
  }

  /**
   * Get arrayItemsNullable
   * @return arrayItemsNullable
   */
  @javax.annotation.Nullable
  public List<Object> getArrayItemsNullable() {
    return arrayItemsNullable;
  }

  public void setArrayItemsNullable(@javax.annotation.Nullable List<Object> arrayItemsNullable) {
    this.arrayItemsNullable = arrayItemsNullable;
  }


  public NullableClass objectNullableProp(@javax.annotation.Nullable Map<String, Object> objectNullableProp) {
    this.objectNullableProp = objectNullableProp;
    return this;
  }

  public NullableClass putObjectNullablePropItem(String key, Object objectNullablePropItem) {
    if (this.objectNullableProp == null) {
      this.objectNullableProp = new HashMap<>();
    }
    this.objectNullableProp.put(key, objectNullablePropItem);
    return this;
  }

  /**
   * Get objectNullableProp
   * @return objectNullableProp
   */
  @javax.annotation.Nullable
  public Map<String, Object> getObjectNullableProp() {
    return objectNullableProp;
  }

  public void setObjectNullableProp(@javax.annotation.Nullable Map<String, Object> objectNullableProp) {
    this.objectNullableProp = objectNullableProp;
  }


  public NullableClass objectAndItemsNullableProp(@javax.annotation.Nullable Map<String, Object> objectAndItemsNullableProp) {
    this.objectAndItemsNullableProp = objectAndItemsNullableProp;
    return this;
  }

  public NullableClass putObjectAndItemsNullablePropItem(String key, Object objectAndItemsNullablePropItem) {
    if (this.objectAndItemsNullableProp == null) {
      this.objectAndItemsNullableProp = new HashMap<>();
    }
    this.objectAndItemsNullableProp.put(key, objectAndItemsNullablePropItem);
    return this;
  }

  /**
   * Get objectAndItemsNullableProp
   * @return objectAndItemsNullableProp
   */
  @javax.annotation.Nullable
  public Map<String, Object> getObjectAndItemsNullableProp() {
    return objectAndItemsNullableProp;
  }

  public void setObjectAndItemsNullableProp(@javax.annotation.Nullable Map<String, Object> objectAndItemsNullableProp) {
    this.objectAndItemsNullableProp = objectAndItemsNullableProp;
  }


  public NullableClass objectItemsNullable(@javax.annotation.Nullable Map<String, Object> objectItemsNullable) {
    this.objectItemsNullable = objectItemsNullable;
    return this;
  }

  public NullableClass putObjectItemsNullableItem(String key, Object objectItemsNullableItem) {
    if (this.objectItemsNullable == null) {
      this.objectItemsNullable = new HashMap<>();
    }
    this.objectItemsNullable.put(key, objectItemsNullableItem);
    return this;
  }

  /**
   * Get objectItemsNullable
   * @return objectItemsNullable
   */
  @javax.annotation.Nullable
  public Map<String, Object> getObjectItemsNullable() {
    return objectItemsNullable;
  }

  public void setObjectItemsNullable(@javax.annotation.Nullable Map<String, Object> objectItemsNullable) {
    this.objectItemsNullable = objectItemsNullable;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the NullableClass instance itself
   */
  public NullableClass putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NullableClass nullableClass = (NullableClass) o;
    return Objects.equals(this.integerProp, nullableClass.integerProp) &&
        Objects.equals(this.numberProp, nullableClass.numberProp) &&
        Objects.equals(this.booleanProp, nullableClass.booleanProp) &&
        Objects.equals(this.stringProp, nullableClass.stringProp) &&
        Objects.equals(this.dateProp, nullableClass.dateProp) &&
        Objects.equals(this.datetimeProp, nullableClass.datetimeProp) &&
        Objects.equals(this.arrayNullableProp, nullableClass.arrayNullableProp) &&
        Objects.equals(this.arrayAndItemsNullableProp, nullableClass.arrayAndItemsNullableProp) &&
        Objects.equals(this.arrayItemsNullable, nullableClass.arrayItemsNullable) &&
        Objects.equals(this.objectNullableProp, nullableClass.objectNullableProp) &&
        Objects.equals(this.objectAndItemsNullableProp, nullableClass.objectAndItemsNullableProp) &&
        Objects.equals(this.objectItemsNullable, nullableClass.objectItemsNullable)&&
        Objects.equals(this.additionalProperties, nullableClass.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(integerProp, numberProp, booleanProp, stringProp, dateProp, datetimeProp, arrayNullableProp, arrayAndItemsNullableProp, arrayItemsNullable, objectNullableProp, objectAndItemsNullableProp, objectItemsNullable, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NullableClass {\n");
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
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("integer_prop");
    openapiFields.add("number_prop");
    openapiFields.add("boolean_prop");
    openapiFields.add("string_prop");
    openapiFields.add("date_prop");
    openapiFields.add("datetime_prop");
    openapiFields.add("array_nullable_prop");
    openapiFields.add("array_and_items_nullable_prop");
    openapiFields.add("array_items_nullable");
    openapiFields.add("object_nullable_prop");
    openapiFields.add("object_and_items_nullable_prop");
    openapiFields.add("object_items_nullable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to NullableClass
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NullableClass.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NullableClass is not found in the empty JSON string", NullableClass.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("string_prop") != null && !jsonObj.get("string_prop").isJsonNull()) && !jsonObj.get("string_prop").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `string_prop` to be a primitive type in the JSON string but got `%s`", jsonObj.get("string_prop").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("array_nullable_prop") != null && !jsonObj.get("array_nullable_prop").isJsonNull() && !jsonObj.get("array_nullable_prop").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_nullable_prop` to be an array in the JSON string but got `%s`", jsonObj.get("array_nullable_prop").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("array_and_items_nullable_prop") != null && !jsonObj.get("array_and_items_nullable_prop").isJsonNull() && !jsonObj.get("array_and_items_nullable_prop").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_and_items_nullable_prop` to be an array in the JSON string but got `%s`", jsonObj.get("array_and_items_nullable_prop").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("array_items_nullable") != null && !jsonObj.get("array_items_nullable").isJsonNull() && !jsonObj.get("array_items_nullable").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `array_items_nullable` to be an array in the JSON string but got `%s`", jsonObj.get("array_items_nullable").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NullableClass.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NullableClass' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NullableClass> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NullableClass.class));

       return (TypeAdapter<T>) new TypeAdapter<NullableClass>() {
           @Override
           public void write(JsonWriter out, NullableClass value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public NullableClass read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             NullableClass instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of NullableClass given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of NullableClass
   * @throws IOException if the JSON string is invalid with respect to NullableClass
   */
  public static NullableClass fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NullableClass.class);
  }

  /**
   * Convert an instance of NullableClass to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

