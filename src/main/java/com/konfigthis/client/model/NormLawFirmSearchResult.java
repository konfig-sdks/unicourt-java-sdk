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
import com.konfigthis.client.model.MatchedObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;
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
 * NormLawFirmSearchResult
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class NormLawFirmSearchResult {
  public static final String SERIALIZED_NAME_FIRST_FETCH_DATE = "firstFetchDate";
  @SerializedName(SERIALIZED_NAME_FIRST_FETCH_DATE)
  private OffsetDateTime firstFetchDate;

  public static final String SERIALIZED_NAME_LAST_FETCH_DATE = "lastFetchDate";
  @SerializedName(SERIALIZED_NAME_LAST_FETCH_DATE)
  private OffsetDateTime lastFetchDate;

  public static final String SERIALIZED_NAME_MATCHED_OBJECT_ARRAY = "matchedObjectArray";
  @SerializedName(SERIALIZED_NAME_MATCHED_OBJECT_ARRAY)
  private List<MatchedObject> matchedObjectArray = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NORM_LAW_FIRM_DETAILS_A_P_I = "normLawFirmDetailsAPI";
  @SerializedName(SERIALIZED_NAME_NORM_LAW_FIRM_DETAILS_A_P_I)
  private URI normLawFirmDetailsAPI;

  public static final String SERIALIZED_NAME_NORM_LAW_FIRM_ID = "normLawFirmId";
  @SerializedName(SERIALIZED_NAME_NORM_LAW_FIRM_ID)
  private String normLawFirmId;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "NormLawFirmSearchResult";

  public NormLawFirmSearchResult() {
  }

  public NormLawFirmSearchResult firstFetchDate(OffsetDateTime firstFetchDate) {
    
    
    if (firstFetchDate != null && firstFetchDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for firstFetchDate. Length must be greater than or equal to 25.");
    }
    
    this.firstFetchDate = firstFetchDate;
    return this;
  }

   /**
   * Get firstFetchDate
   * @return firstFetchDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-04-25T10:42:46Z", required = true, value = "")

  public OffsetDateTime getFirstFetchDate() {
    return firstFetchDate;
  }


  public void setFirstFetchDate(OffsetDateTime firstFetchDate) {
    
    
    if (firstFetchDate != null && firstFetchDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for firstFetchDate. Length must be greater than or equal to 25.");
    }
    this.firstFetchDate = firstFetchDate;
  }


  public NormLawFirmSearchResult lastFetchDate(OffsetDateTime lastFetchDate) {
    
    
    if (lastFetchDate != null && lastFetchDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for lastFetchDate. Length must be greater than or equal to 25.");
    }
    
    this.lastFetchDate = lastFetchDate;
    return this;
  }

   /**
   * Get lastFetchDate
   * @return lastFetchDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-04-25T10:42:46Z", required = true, value = "")

  public OffsetDateTime getLastFetchDate() {
    return lastFetchDate;
  }


  public void setLastFetchDate(OffsetDateTime lastFetchDate) {
    
    
    if (lastFetchDate != null && lastFetchDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for lastFetchDate. Length must be greater than or equal to 25.");
    }
    this.lastFetchDate = lastFetchDate;
  }


  public NormLawFirmSearchResult matchedObjectArray(List<MatchedObject> matchedObjectArray) {
    
    
    
    
    this.matchedObjectArray = matchedObjectArray;
    return this;
  }

  public NormLawFirmSearchResult addMatchedObjectArrayItem(MatchedObject matchedObjectArrayItem) {
    this.matchedObjectArray.add(matchedObjectArrayItem);
    return this;
  }

   /**
   * Get matchedObjectArray
   * @return matchedObjectArray
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<MatchedObject> getMatchedObjectArray() {
    return matchedObjectArray;
  }


  public void setMatchedObjectArray(List<MatchedObject> matchedObjectArray) {
    
    
    
    this.matchedObjectArray = matchedObjectArray;
  }


  public NormLawFirmSearchResult name(String name) {
    
    
    if (name != null && name.length() < 1) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 1.");
    }
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "MIDLAND CREDIT MANAGEMENT, INC.", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    if (name != null && name.length() < 1) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 1.");
    }
    this.name = name;
  }


  public NormLawFirmSearchResult normLawFirmDetailsAPI(URI normLawFirmDetailsAPI) {
    
    
    if (normLawFirmDetailsAPI != null && normLawFirmDetailsAPI.length() < 1) {
      throw new IllegalArgumentException("Invalid value for normLawFirmDetailsAPI. Length must be greater than or equal to 1.");
    }
    
    this.normLawFirmDetailsAPI = normLawFirmDetailsAPI;
    return this;
  }

   /**
   * Get normLawFirmDetailsAPI
   * @return normLawFirmDetailsAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://enterpriseapi.unicourt.com/normLawFirm/NORGgooQKwAYeRhcv/", required = true, value = "")

  public URI getNormLawFirmDetailsAPI() {
    return normLawFirmDetailsAPI;
  }


  public void setNormLawFirmDetailsAPI(URI normLawFirmDetailsAPI) {
    
    
    if (normLawFirmDetailsAPI != null && normLawFirmDetailsAPI.length() < 1) {
      throw new IllegalArgumentException("Invalid value for normLawFirmDetailsAPI. Length must be greater than or equal to 1.");
    }
    this.normLawFirmDetailsAPI = normLawFirmDetailsAPI;
  }


  public NormLawFirmSearchResult normLawFirmId(String normLawFirmId) {
    
    
    if (normLawFirmId != null && normLawFirmId.length() < 17) {
      throw new IllegalArgumentException("Invalid value for normLawFirmId. Length must be greater than or equal to 17.");
    }
    
    this.normLawFirmId = normLawFirmId;
    return this;
  }

   /**
   * Get normLawFirmId
   * @return normLawFirmId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "NORGgooQKwAYeRhcv", required = true, value = "")

  public String getNormLawFirmId() {
    return normLawFirmId;
  }


  public void setNormLawFirmId(String normLawFirmId) {
    
    
    if (normLawFirmId != null && normLawFirmId.length() < 17) {
      throw new IllegalArgumentException("Invalid value for normLawFirmId. Length must be greater than or equal to 17.");
    }
    this.normLawFirmId = normLawFirmId;
  }


  public NormLawFirmSearchResult _object(String _object) {
    
    
    if (_object != null && _object.length() < 23) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 23.");
    }
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "NormLawFirmSearchResult", required = true, value = "")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    if (_object != null && _object.length() < 23) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 23.");
    }
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
   * @return the NormLawFirmSearchResult instance itself
   */
  public NormLawFirmSearchResult putAdditionalProperty(String key, Object value) {
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
    NormLawFirmSearchResult normLawFirmSearchResult = (NormLawFirmSearchResult) o;
    return Objects.equals(this.firstFetchDate, normLawFirmSearchResult.firstFetchDate) &&
        Objects.equals(this.lastFetchDate, normLawFirmSearchResult.lastFetchDate) &&
        Objects.equals(this.matchedObjectArray, normLawFirmSearchResult.matchedObjectArray) &&
        Objects.equals(this.name, normLawFirmSearchResult.name) &&
        Objects.equals(this.normLawFirmDetailsAPI, normLawFirmSearchResult.normLawFirmDetailsAPI) &&
        Objects.equals(this.normLawFirmId, normLawFirmSearchResult.normLawFirmId) &&
        Objects.equals(this._object, normLawFirmSearchResult._object)&&
        Objects.equals(this.additionalProperties, normLawFirmSearchResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstFetchDate, lastFetchDate, matchedObjectArray, name, normLawFirmDetailsAPI, normLawFirmId, _object, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NormLawFirmSearchResult {\n");
    sb.append("    firstFetchDate: ").append(toIndentedString(firstFetchDate)).append("\n");
    sb.append("    lastFetchDate: ").append(toIndentedString(lastFetchDate)).append("\n");
    sb.append("    matchedObjectArray: ").append(toIndentedString(matchedObjectArray)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    normLawFirmDetailsAPI: ").append(toIndentedString(normLawFirmDetailsAPI)).append("\n");
    sb.append("    normLawFirmId: ").append(toIndentedString(normLawFirmId)).append("\n");
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
    openapiFields.add("firstFetchDate");
    openapiFields.add("lastFetchDate");
    openapiFields.add("matchedObjectArray");
    openapiFields.add("name");
    openapiFields.add("normLawFirmDetailsAPI");
    openapiFields.add("normLawFirmId");
    openapiFields.add("object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("firstFetchDate");
    openapiRequiredFields.add("lastFetchDate");
    openapiRequiredFields.add("matchedObjectArray");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("normLawFirmDetailsAPI");
    openapiRequiredFields.add("normLawFirmId");
    openapiRequiredFields.add("object");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NormLawFirmSearchResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NormLawFirmSearchResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NormLawFirmSearchResult is not found in the empty JSON string", NormLawFirmSearchResult.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NormLawFirmSearchResult.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("matchedObjectArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchedObjectArray` to be an array in the JSON string but got `%s`", jsonObj.get("matchedObjectArray").toString()));
      }

      JsonArray jsonArraymatchedObjectArray = jsonObj.getAsJsonArray("matchedObjectArray");
      // validate the required field `matchedObjectArray` (array)
      for (int i = 0; i < jsonArraymatchedObjectArray.size(); i++) {
        MatchedObject.validateJsonObject(jsonArraymatchedObjectArray.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("normLawFirmDetailsAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `normLawFirmDetailsAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("normLawFirmDetailsAPI").toString()));
      }
      if (!jsonObj.get("normLawFirmId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `normLawFirmId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("normLawFirmId").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NormLawFirmSearchResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NormLawFirmSearchResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NormLawFirmSearchResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NormLawFirmSearchResult.class));

       return (TypeAdapter<T>) new TypeAdapter<NormLawFirmSearchResult>() {
           @Override
           public void write(JsonWriter out, NormLawFirmSearchResult value) throws IOException {
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
           public NormLawFirmSearchResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NormLawFirmSearchResult instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of NormLawFirmSearchResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NormLawFirmSearchResult
  * @throws IOException if the JSON string is invalid with respect to NormLawFirmSearchResult
  */
  public static NormLawFirmSearchResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NormLawFirmSearchResult.class);
  }

 /**
  * Convert an instance of NormLawFirmSearchResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

