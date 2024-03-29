/*
 * UniCourt Enterprise APIs
 * <button><a href=\"/enterpriseapi/download/UniCourt-Enterprise-API-Spec.yaml\" >Download UniCourt Enterprise APIs Specification</a></button> 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * PACERSearchPageInfo
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PACERSearchPageInfo {
  public static final String SERIALIZED_NAME_FIRST = "first";
  @SerializedName(SERIALIZED_NAME_FIRST)
  private Boolean first;

  public static final String SERIALIZED_NAME_LAST = "last";
  @SerializedName(SERIALIZED_NAME_LAST)
  private Boolean last;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Integer number;

  public static final String SERIALIZED_NAME_NUMBER_OF_ELEMENTS = "numberOfElements";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_ELEMENTS)
  private Integer numberOfElements;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "PACERSearchPageInfo";

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_TOTAL_ELEMENTS = "totalElements";
  @SerializedName(SERIALIZED_NAME_TOTAL_ELEMENTS)
  private Integer totalElements;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "totalPages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Integer totalPages;

  public PACERSearchPageInfo() {
  }

  public PACERSearchPageInfo first(Boolean first) {
    
    
    
    
    this.first = first;
    return this;
  }

   /**
   * Indicates if the current page is the first page.
   * @return first
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Indicates if the current page is the first page.")

  public Boolean getFirst() {
    return first;
  }


  public void setFirst(Boolean first) {
    
    
    
    this.first = first;
  }


  public PACERSearchPageInfo last(Boolean last) {
    
    
    
    
    this.last = last;
    return this;
  }

   /**
   * Indicates if the current page is the last page.
   * @return last
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Indicates if the current page is the last page.")

  public Boolean getLast() {
    return last;
  }


  public void setLast(Boolean last) {
    
    
    
    this.last = last;
  }


  public PACERSearchPageInfo number(Integer number) {
    
    
    
    
    this.number = number;
    return this;
  }

   /**
   * Current Page number.
   * @return number
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "Current Page number.")

  public Integer getNumber() {
    return number;
  }


  public void setNumber(Integer number) {
    
    
    
    this.number = number;
  }


  public PACERSearchPageInfo numberOfElements(Integer numberOfElements) {
    
    
    
    
    this.numberOfElements = numberOfElements;
    return this;
  }

   /**
   * Number of records returned.
   * @return numberOfElements
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "54", required = true, value = "Number of records returned.")

  public Integer getNumberOfElements() {
    return numberOfElements;
  }


  public void setNumberOfElements(Integer numberOfElements) {
    
    
    
    this.numberOfElements = numberOfElements;
  }


  public PACERSearchPageInfo _object(String _object) {
    
    
    if (_object != null && _object.length() < 19) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 19.");
    }
    
    this._object = _object;
    return this;
  }

   /**
   * Name of the object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "PACERSearchPageInfo", required = true, value = "Name of the object")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    if (_object != null && _object.length() < 19) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 19.");
    }
    this._object = _object;
  }


  public PACERSearchPageInfo size(Integer size) {
    
    
    
    
    this.size = size;
    return this;
  }

   /**
   * Number of results obtained in a page..
   * @return size
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "54", required = true, value = "Number of results obtained in a page..")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    
    
    
    this.size = size;
  }


  public PACERSearchPageInfo totalElements(Integer totalElements) {
    
    
    
    
    this.totalElements = totalElements;
    return this;
  }

   /**
   * Total number of records available
   * @return totalElements
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "487", required = true, value = "Total number of records available")

  public Integer getTotalElements() {
    return totalElements;
  }


  public void setTotalElements(Integer totalElements) {
    
    
    
    this.totalElements = totalElements;
  }


  public PACERSearchPageInfo totalPages(Integer totalPages) {
    
    
    
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Total pages of data available.
   * @return totalPages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Total pages of data available.")

  public Integer getTotalPages() {
    return totalPages;
  }


  public void setTotalPages(Integer totalPages) {
    
    
    
    this.totalPages = totalPages;
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
   * @return the PACERSearchPageInfo instance itself
   */
  public PACERSearchPageInfo putAdditionalProperty(String key, Object value) {
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
    PACERSearchPageInfo paCERSearchPageInfo = (PACERSearchPageInfo) o;
    return Objects.equals(this.first, paCERSearchPageInfo.first) &&
        Objects.equals(this.last, paCERSearchPageInfo.last) &&
        Objects.equals(this.number, paCERSearchPageInfo.number) &&
        Objects.equals(this.numberOfElements, paCERSearchPageInfo.numberOfElements) &&
        Objects.equals(this._object, paCERSearchPageInfo._object) &&
        Objects.equals(this.size, paCERSearchPageInfo.size) &&
        Objects.equals(this.totalElements, paCERSearchPageInfo.totalElements) &&
        Objects.equals(this.totalPages, paCERSearchPageInfo.totalPages)&&
        Objects.equals(this.additionalProperties, paCERSearchPageInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, last, number, numberOfElements, _object, size, totalElements, totalPages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PACERSearchPageInfo {\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
    openapiFields.add("first");
    openapiFields.add("last");
    openapiFields.add("number");
    openapiFields.add("numberOfElements");
    openapiFields.add("object");
    openapiFields.add("size");
    openapiFields.add("totalElements");
    openapiFields.add("totalPages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("first");
    openapiRequiredFields.add("last");
    openapiRequiredFields.add("number");
    openapiRequiredFields.add("numberOfElements");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("size");
    openapiRequiredFields.add("totalElements");
    openapiRequiredFields.add("totalPages");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PACERSearchPageInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PACERSearchPageInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PACERSearchPageInfo is not found in the empty JSON string", PACERSearchPageInfo.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PACERSearchPageInfo.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PACERSearchPageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PACERSearchPageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PACERSearchPageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PACERSearchPageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PACERSearchPageInfo>() {
           @Override
           public void write(JsonWriter out, PACERSearchPageInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
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
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PACERSearchPageInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PACERSearchPageInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PACERSearchPageInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PACERSearchPageInfo
  * @throws IOException if the JSON string is invalid with respect to PACERSearchPageInfo
  */
  public static PACERSearchPageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PACERSearchPageInfo.class);
  }

 /**
  * Convert an instance of PACERSearchPageInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

