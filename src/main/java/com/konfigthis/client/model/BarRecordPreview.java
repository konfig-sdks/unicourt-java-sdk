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
 * BarRecordPreview
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BarRecordPreview {
  public static final String SERIALIZED_NAME_BAR_NUMBER = "barNumber";
  @SerializedName(SERIALIZED_NAME_BAR_NUMBER)
  private String barNumber;

  public static final String SERIALIZED_NAME_BAR_SOURCE_TYPE = "barSourceType";
  @SerializedName(SERIALIZED_NAME_BAR_SOURCE_TYPE)
  private String barSourceType;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "BarRecordPreview";

  public static final String SERIALIZED_NAME_STATE_CODE = "stateCode";
  @SerializedName(SERIALIZED_NAME_STATE_CODE)
  private String stateCode;

  public BarRecordPreview() {
  }

  public BarRecordPreview barNumber(String barNumber) {
    
    
    
    
    this.barNumber = barNumber;
    return this;
  }

   /**
   * Get barNumber
   * @return barNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public String getBarNumber() {
    return barNumber;
  }


  public void setBarNumber(String barNumber) {
    
    
    
    this.barNumber = barNumber;
  }


  public BarRecordPreview barSourceType(String barSourceType) {
    
    
    
    
    this.barSourceType = barSourceType;
    return this;
  }

   /**
   * Get barSourceType
   * @return barSourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public String getBarSourceType() {
    return barSourceType;
  }


  public void setBarSourceType(String barSourceType) {
    
    
    
    this.barSourceType = barSourceType;
  }


  public BarRecordPreview _object(String _object) {
    
    
    
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BarRecordPreview", required = true, value = "")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    
    this._object = _object;
  }


  public BarRecordPreview stateCode(String stateCode) {
    
    
    
    
    this.stateCode = stateCode;
    return this;
  }

   /**
   * Get stateCode
   * @return stateCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getStateCode() {
    return stateCode;
  }


  public void setStateCode(String stateCode) {
    
    
    
    this.stateCode = stateCode;
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
   * @return the BarRecordPreview instance itself
   */
  public BarRecordPreview putAdditionalProperty(String key, Object value) {
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
    BarRecordPreview barRecordPreview = (BarRecordPreview) o;
    return Objects.equals(this.barNumber, barRecordPreview.barNumber) &&
        Objects.equals(this.barSourceType, barRecordPreview.barSourceType) &&
        Objects.equals(this._object, barRecordPreview._object) &&
        Objects.equals(this.stateCode, barRecordPreview.stateCode)&&
        Objects.equals(this.additionalProperties, barRecordPreview.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(barNumber, barSourceType, _object, stateCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarRecordPreview {\n");
    sb.append("    barNumber: ").append(toIndentedString(barNumber)).append("\n");
    sb.append("    barSourceType: ").append(toIndentedString(barSourceType)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
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
    openapiFields.add("barNumber");
    openapiFields.add("barSourceType");
    openapiFields.add("object");
    openapiFields.add("stateCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("barNumber");
    openapiRequiredFields.add("barSourceType");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("stateCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BarRecordPreview
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BarRecordPreview.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BarRecordPreview is not found in the empty JSON string", BarRecordPreview.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BarRecordPreview.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("barNumber").isJsonNull() && !jsonObj.get("barNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `barNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("barNumber").toString()));
      }
      if (!jsonObj.get("barSourceType").isJsonNull() && !jsonObj.get("barSourceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `barSourceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("barSourceType").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if (!jsonObj.get("stateCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stateCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stateCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BarRecordPreview.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BarRecordPreview' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BarRecordPreview> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BarRecordPreview.class));

       return (TypeAdapter<T>) new TypeAdapter<BarRecordPreview>() {
           @Override
           public void write(JsonWriter out, BarRecordPreview value) throws IOException {
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
           public BarRecordPreview read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BarRecordPreview instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BarRecordPreview given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BarRecordPreview
  * @throws IOException if the JSON string is invalid with respect to BarRecordPreview
  */
  public static BarRecordPreview fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BarRecordPreview.class);
  }

 /**
  * Convert an instance of BarRecordPreview to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

