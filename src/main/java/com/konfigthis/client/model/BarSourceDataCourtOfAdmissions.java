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
import java.util.ArrayList;
import java.util.List;

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
 * BarSourceDataCourtOfAdmissions
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class BarSourceDataCourtOfAdmissions {
  public static final String SERIALIZED_NAME_COURT_STATE_ARRAY = "courtStateArray";
  @SerializedName(SERIALIZED_NAME_COURT_STATE_ARRAY)
  private List<String> courtStateArray = new ArrayList<>();

  public static final String SERIALIZED_NAME_FEDERAL_ARRAY = "federalArray";
  @SerializedName(SERIALIZED_NAME_FEDERAL_ARRAY)
  private List<String> federalArray = new ArrayList<>();

  public static final String SERIALIZED_NAME_OTHER_COURTS_ARRAY = "otherCourtsArray";
  @SerializedName(SERIALIZED_NAME_OTHER_COURTS_ARRAY)
  private List<String> otherCourtsArray = new ArrayList<>();

  public BarSourceDataCourtOfAdmissions() {
  }

  public BarSourceDataCourtOfAdmissions courtStateArray(List<String> courtStateArray) {
    
    
    
    
    this.courtStateArray = courtStateArray;
    return this;
  }

  public BarSourceDataCourtOfAdmissions addCourtStateArrayItem(String courtStateArrayItem) {
    this.courtStateArray.add(courtStateArrayItem);
    return this;
  }

   /**
   * Get courtStateArray
   * @return courtStateArray
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getCourtStateArray() {
    return courtStateArray;
  }


  public void setCourtStateArray(List<String> courtStateArray) {
    
    
    
    this.courtStateArray = courtStateArray;
  }


  public BarSourceDataCourtOfAdmissions federalArray(List<String> federalArray) {
    
    
    
    
    this.federalArray = federalArray;
    return this;
  }

  public BarSourceDataCourtOfAdmissions addFederalArrayItem(String federalArrayItem) {
    this.federalArray.add(federalArrayItem);
    return this;
  }

   /**
   * Get federalArray
   * @return federalArray
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getFederalArray() {
    return federalArray;
  }


  public void setFederalArray(List<String> federalArray) {
    
    
    
    this.federalArray = federalArray;
  }


  public BarSourceDataCourtOfAdmissions otherCourtsArray(List<String> otherCourtsArray) {
    
    
    
    
    this.otherCourtsArray = otherCourtsArray;
    return this;
  }

  public BarSourceDataCourtOfAdmissions addOtherCourtsArrayItem(String otherCourtsArrayItem) {
    this.otherCourtsArray.add(otherCourtsArrayItem);
    return this;
  }

   /**
   * Get otherCourtsArray
   * @return otherCourtsArray
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getOtherCourtsArray() {
    return otherCourtsArray;
  }


  public void setOtherCourtsArray(List<String> otherCourtsArray) {
    
    
    
    this.otherCourtsArray = otherCourtsArray;
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
   * @return the BarSourceDataCourtOfAdmissions instance itself
   */
  public BarSourceDataCourtOfAdmissions putAdditionalProperty(String key, Object value) {
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
    BarSourceDataCourtOfAdmissions barSourceDataCourtOfAdmissions = (BarSourceDataCourtOfAdmissions) o;
    return Objects.equals(this.courtStateArray, barSourceDataCourtOfAdmissions.courtStateArray) &&
        Objects.equals(this.federalArray, barSourceDataCourtOfAdmissions.federalArray) &&
        Objects.equals(this.otherCourtsArray, barSourceDataCourtOfAdmissions.otherCourtsArray)&&
        Objects.equals(this.additionalProperties, barSourceDataCourtOfAdmissions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courtStateArray, federalArray, otherCourtsArray, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BarSourceDataCourtOfAdmissions {\n");
    sb.append("    courtStateArray: ").append(toIndentedString(courtStateArray)).append("\n");
    sb.append("    federalArray: ").append(toIndentedString(federalArray)).append("\n");
    sb.append("    otherCourtsArray: ").append(toIndentedString(otherCourtsArray)).append("\n");
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
    openapiFields.add("courtStateArray");
    openapiFields.add("federalArray");
    openapiFields.add("otherCourtsArray");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("courtStateArray");
    openapiRequiredFields.add("federalArray");
    openapiRequiredFields.add("otherCourtsArray");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BarSourceDataCourtOfAdmissions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!BarSourceDataCourtOfAdmissions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BarSourceDataCourtOfAdmissions is not found in the empty JSON string", BarSourceDataCourtOfAdmissions.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BarSourceDataCourtOfAdmissions.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("courtStateArray") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("courtStateArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `courtStateArray` to be an array in the JSON string but got `%s`", jsonObj.get("courtStateArray").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("federalArray") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("federalArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `federalArray` to be an array in the JSON string but got `%s`", jsonObj.get("federalArray").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("otherCourtsArray") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("otherCourtsArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `otherCourtsArray` to be an array in the JSON string but got `%s`", jsonObj.get("otherCourtsArray").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BarSourceDataCourtOfAdmissions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BarSourceDataCourtOfAdmissions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BarSourceDataCourtOfAdmissions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BarSourceDataCourtOfAdmissions.class));

       return (TypeAdapter<T>) new TypeAdapter<BarSourceDataCourtOfAdmissions>() {
           @Override
           public void write(JsonWriter out, BarSourceDataCourtOfAdmissions value) throws IOException {
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
           public BarSourceDataCourtOfAdmissions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             BarSourceDataCourtOfAdmissions instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BarSourceDataCourtOfAdmissions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BarSourceDataCourtOfAdmissions
  * @throws IOException if the JSON string is invalid with respect to BarSourceDataCourtOfAdmissions
  */
  public static BarSourceDataCourtOfAdmissions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BarSourceDataCourtOfAdmissions.class);
  }

 /**
  * Convert an instance of BarSourceDataCourtOfAdmissions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

