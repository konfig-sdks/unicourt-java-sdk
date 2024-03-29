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
import java.net.URI;

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
 * CaseCountAnalyticsByNormParty
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CaseCountAnalyticsByNormParty {
  public static final String SERIALIZED_NAME_CASE_COUNT = "caseCount";
  @SerializedName(SERIALIZED_NAME_CASE_COUNT)
  private Integer caseCount;

  public static final String SERIALIZED_NAME_CASE_SEARCH_A_P_I = "caseSearchAPI";
  @SerializedName(SERIALIZED_NAME_CASE_SEARCH_A_P_I)
  private URI caseSearchAPI;

  public static final String SERIALIZED_NAME_NORM_PARTY_ID = "normPartyId";
  @SerializedName(SERIALIZED_NAME_NORM_PARTY_ID)
  private String normPartyId;

  public static final String SERIALIZED_NAME_NORM_PARTY_NAME = "normPartyName";
  @SerializedName(SERIALIZED_NAME_NORM_PARTY_NAME)
  private String normPartyName;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "CaseCountAnalyticsByNormParty";

  public CaseCountAnalyticsByNormParty() {
  }

  public CaseCountAnalyticsByNormParty caseCount(Integer caseCount) {
    
    
    
    
    this.caseCount = caseCount;
    return this;
  }

   /**
   * Get caseCount
   * @return caseCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getCaseCount() {
    return caseCount;
  }


  public void setCaseCount(Integer caseCount) {
    
    
    
    this.caseCount = caseCount;
  }


  public CaseCountAnalyticsByNormParty caseSearchAPI(URI caseSearchAPI) {
    
    
    
    
    this.caseSearchAPI = caseSearchAPI;
    return this;
  }

   /**
   * Link to cases for this criteria.
   * @return caseSearchAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Link to cases for this criteria.")

  public URI getCaseSearchAPI() {
    return caseSearchAPI;
  }


  public void setCaseSearchAPI(URI caseSearchAPI) {
    
    
    
    this.caseSearchAPI = caseSearchAPI;
  }


  public CaseCountAnalyticsByNormParty normPartyId(String normPartyId) {
    
    
    if (normPartyId != null && normPartyId.length() < 18) {
      throw new IllegalArgumentException("Invalid value for normPartyId. Length must be greater than or equal to 18.");
    }
    
    this.normPartyId = normPartyId;
    return this;
  }

   /**
   * Get normPartyId
   * @return normPartyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNormPartyId() {
    return normPartyId;
  }


  public void setNormPartyId(String normPartyId) {
    
    
    if (normPartyId != null && normPartyId.length() < 18) {
      throw new IllegalArgumentException("Invalid value for normPartyId. Length must be greater than or equal to 18.");
    }
    this.normPartyId = normPartyId;
  }


  public CaseCountAnalyticsByNormParty normPartyName(String normPartyName) {
    
    
    
    
    this.normPartyName = normPartyName;
    return this;
  }

   /**
   * Get normPartyName
   * @return normPartyName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNormPartyName() {
    return normPartyName;
  }


  public void setNormPartyName(String normPartyName) {
    
    
    
    this.normPartyName = normPartyName;
  }


  public CaseCountAnalyticsByNormParty _object(String _object) {
    
    
    
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CaseCountAnalyticsByNormParty", required = true, value = "")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    
    this._object = _object;
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
   * @return the CaseCountAnalyticsByNormParty instance itself
   */
  public CaseCountAnalyticsByNormParty putAdditionalProperty(String key, Object value) {
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
    CaseCountAnalyticsByNormParty caseCountAnalyticsByNormParty = (CaseCountAnalyticsByNormParty) o;
    return Objects.equals(this.caseCount, caseCountAnalyticsByNormParty.caseCount) &&
        Objects.equals(this.caseSearchAPI, caseCountAnalyticsByNormParty.caseSearchAPI) &&
        Objects.equals(this.normPartyId, caseCountAnalyticsByNormParty.normPartyId) &&
        Objects.equals(this.normPartyName, caseCountAnalyticsByNormParty.normPartyName) &&
        Objects.equals(this._object, caseCountAnalyticsByNormParty._object)&&
        Objects.equals(this.additionalProperties, caseCountAnalyticsByNormParty.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseCount, caseSearchAPI, normPartyId, normPartyName, _object, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseCountAnalyticsByNormParty {\n");
    sb.append("    caseCount: ").append(toIndentedString(caseCount)).append("\n");
    sb.append("    caseSearchAPI: ").append(toIndentedString(caseSearchAPI)).append("\n");
    sb.append("    normPartyId: ").append(toIndentedString(normPartyId)).append("\n");
    sb.append("    normPartyName: ").append(toIndentedString(normPartyName)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
    openapiFields.add("caseCount");
    openapiFields.add("caseSearchAPI");
    openapiFields.add("normPartyId");
    openapiFields.add("normPartyName");
    openapiFields.add("object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("caseCount");
    openapiRequiredFields.add("caseSearchAPI");
    openapiRequiredFields.add("normPartyId");
    openapiRequiredFields.add("normPartyName");
    openapiRequiredFields.add("object");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CaseCountAnalyticsByNormParty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CaseCountAnalyticsByNormParty.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CaseCountAnalyticsByNormParty is not found in the empty JSON string", CaseCountAnalyticsByNormParty.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CaseCountAnalyticsByNormParty.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("caseSearchAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseSearchAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseSearchAPI").toString()));
      }
      if (!jsonObj.get("normPartyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `normPartyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("normPartyId").toString()));
      }
      if (!jsonObj.get("normPartyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `normPartyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("normPartyName").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CaseCountAnalyticsByNormParty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CaseCountAnalyticsByNormParty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CaseCountAnalyticsByNormParty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CaseCountAnalyticsByNormParty.class));

       return (TypeAdapter<T>) new TypeAdapter<CaseCountAnalyticsByNormParty>() {
           @Override
           public void write(JsonWriter out, CaseCountAnalyticsByNormParty value) throws IOException {
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
           public CaseCountAnalyticsByNormParty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CaseCountAnalyticsByNormParty instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CaseCountAnalyticsByNormParty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CaseCountAnalyticsByNormParty
  * @throws IOException if the JSON string is invalid with respect to CaseCountAnalyticsByNormParty
  */
  public static CaseCountAnalyticsByNormParty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CaseCountAnalyticsByNormParty.class);
  }

 /**
  * Convert an instance of CaseCountAnalyticsByNormParty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

