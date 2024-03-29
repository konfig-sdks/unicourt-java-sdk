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
import com.konfigthis.client.model.CaseAnalyticsAPI;
import com.konfigthis.client.model.JudgeAnalyticsAPI;
import com.konfigthis.client.model.NormJudgePublicData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
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
 * Norm Judge
 */
@ApiModel(description = "Norm Judge")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class NormJudge {
  public static final String SERIALIZED_NAME_CASE_ANALYTICS_A_P_I = "caseAnalyticsAPI";
  @SerializedName(SERIALIZED_NAME_CASE_ANALYTICS_A_P_I)
  private CaseAnalyticsAPI caseAnalyticsAPI;

  public static final String SERIALIZED_NAME_CASE_SEARCH_A_P_I = "caseSearchAPI";
  @SerializedName(SERIALIZED_NAME_CASE_SEARCH_A_P_I)
  private URI caseSearchAPI;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_HAS_ASSOCIATED_PUBLIC_DATA = "hasAssociatedPublicData";
  @SerializedName(SERIALIZED_NAME_HAS_ASSOCIATED_PUBLIC_DATA)
  private Boolean hasAssociatedPublicData;

  public static final String SERIALIZED_NAME_JUDGE_ANALYTICS_A_P_I = "judgeAnalyticsAPI";
  @SerializedName(SERIALIZED_NAME_JUDGE_ANALYTICS_A_P_I)
  private JudgeAnalyticsAPI judgeAnalyticsAPI;

  public static final String SERIALIZED_NAME_JUDICIAL_DATA_ARRAY = "judicialDataArray";
  @SerializedName(SERIALIZED_NAME_JUDICIAL_DATA_ARRAY)
  private List<NormJudgePublicData> judicialDataArray = new ArrayList<>();

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NORM_JUDGE_ID = "normJudgeId";
  @SerializedName(SERIALIZED_NAME_NORM_JUDGE_ID)
  private String normJudgeId;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "NormJudge";

  public NormJudge() {
  }

  public NormJudge caseAnalyticsAPI(CaseAnalyticsAPI caseAnalyticsAPI) {
    
    
    
    
    this.caseAnalyticsAPI = caseAnalyticsAPI;
    return this;
  }

   /**
   * Get caseAnalyticsAPI
   * @return caseAnalyticsAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CaseAnalyticsAPI getCaseAnalyticsAPI() {
    return caseAnalyticsAPI;
  }


  public void setCaseAnalyticsAPI(CaseAnalyticsAPI caseAnalyticsAPI) {
    
    
    
    this.caseAnalyticsAPI = caseAnalyticsAPI;
  }


  public NormJudge caseSearchAPI(URI caseSearchAPI) {
    
    
    
    
    this.caseSearchAPI = caseSearchAPI;
    return this;
  }

   /**
   * Get caseSearchAPI
   * @return caseSearchAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public URI getCaseSearchAPI() {
    return caseSearchAPI;
  }


  public void setCaseSearchAPI(URI caseSearchAPI) {
    
    
    
    this.caseSearchAPI = caseSearchAPI;
  }


  public NormJudge firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public NormJudge hasAssociatedPublicData(Boolean hasAssociatedPublicData) {
    
    
    
    
    this.hasAssociatedPublicData = hasAssociatedPublicData;
    return this;
  }

   /**
   * Get hasAssociatedPublicData
   * @return hasAssociatedPublicData
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getHasAssociatedPublicData() {
    return hasAssociatedPublicData;
  }


  public void setHasAssociatedPublicData(Boolean hasAssociatedPublicData) {
    
    
    
    this.hasAssociatedPublicData = hasAssociatedPublicData;
  }


  public NormJudge judgeAnalyticsAPI(JudgeAnalyticsAPI judgeAnalyticsAPI) {
    
    
    
    
    this.judgeAnalyticsAPI = judgeAnalyticsAPI;
    return this;
  }

   /**
   * Get judgeAnalyticsAPI
   * @return judgeAnalyticsAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JudgeAnalyticsAPI getJudgeAnalyticsAPI() {
    return judgeAnalyticsAPI;
  }


  public void setJudgeAnalyticsAPI(JudgeAnalyticsAPI judgeAnalyticsAPI) {
    
    
    
    this.judgeAnalyticsAPI = judgeAnalyticsAPI;
  }


  public NormJudge judicialDataArray(List<NormJudgePublicData> judicialDataArray) {
    
    
    
    
    this.judicialDataArray = judicialDataArray;
    return this;
  }

  public NormJudge addJudicialDataArrayItem(NormJudgePublicData judicialDataArrayItem) {
    this.judicialDataArray.add(judicialDataArrayItem);
    return this;
  }

   /**
   * Get judicialDataArray
   * @return judicialDataArray
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<NormJudgePublicData> getJudicialDataArray() {
    return judicialDataArray;
  }


  public void setJudicialDataArray(List<NormJudgePublicData> judicialDataArray) {
    
    
    
    this.judicialDataArray = judicialDataArray;
  }


  public NormJudge lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public NormJudge middleName(String middleName) {
    
    
    
    
    this.middleName = middleName;
    return this;
  }

   /**
   * Get middleName
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    
    
    
    this.middleName = middleName;
  }


  public NormJudge name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public NormJudge normJudgeId(String normJudgeId) {
    
    
    if (normJudgeId != null && normJudgeId.length() < 18) {
      throw new IllegalArgumentException("Invalid value for normJudgeId. Length must be greater than or equal to 18.");
    }
    
    this.normJudgeId = normJudgeId;
    return this;
  }

   /**
   * Get normJudgeId
   * @return normJudgeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNormJudgeId() {
    return normJudgeId;
  }


  public void setNormJudgeId(String normJudgeId) {
    
    
    if (normJudgeId != null && normJudgeId.length() < 18) {
      throw new IllegalArgumentException("Invalid value for normJudgeId. Length must be greater than or equal to 18.");
    }
    this.normJudgeId = normJudgeId;
  }


  public NormJudge _object(String _object) {
    
    
    
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "NormJudge", required = true, value = "")

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
   * @return the NormJudge instance itself
   */
  public NormJudge putAdditionalProperty(String key, Object value) {
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
    NormJudge normJudge = (NormJudge) o;
    return Objects.equals(this.caseAnalyticsAPI, normJudge.caseAnalyticsAPI) &&
        Objects.equals(this.caseSearchAPI, normJudge.caseSearchAPI) &&
        Objects.equals(this.firstName, normJudge.firstName) &&
        Objects.equals(this.hasAssociatedPublicData, normJudge.hasAssociatedPublicData) &&
        Objects.equals(this.judgeAnalyticsAPI, normJudge.judgeAnalyticsAPI) &&
        Objects.equals(this.judicialDataArray, normJudge.judicialDataArray) &&
        Objects.equals(this.lastName, normJudge.lastName) &&
        Objects.equals(this.middleName, normJudge.middleName) &&
        Objects.equals(this.name, normJudge.name) &&
        Objects.equals(this.normJudgeId, normJudge.normJudgeId) &&
        Objects.equals(this._object, normJudge._object)&&
        Objects.equals(this.additionalProperties, normJudge.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseAnalyticsAPI, caseSearchAPI, firstName, hasAssociatedPublicData, judgeAnalyticsAPI, judicialDataArray, lastName, middleName, name, normJudgeId, _object, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NormJudge {\n");
    sb.append("    caseAnalyticsAPI: ").append(toIndentedString(caseAnalyticsAPI)).append("\n");
    sb.append("    caseSearchAPI: ").append(toIndentedString(caseSearchAPI)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    hasAssociatedPublicData: ").append(toIndentedString(hasAssociatedPublicData)).append("\n");
    sb.append("    judgeAnalyticsAPI: ").append(toIndentedString(judgeAnalyticsAPI)).append("\n");
    sb.append("    judicialDataArray: ").append(toIndentedString(judicialDataArray)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    normJudgeId: ").append(toIndentedString(normJudgeId)).append("\n");
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
    openapiFields.add("caseAnalyticsAPI");
    openapiFields.add("caseSearchAPI");
    openapiFields.add("firstName");
    openapiFields.add("hasAssociatedPublicData");
    openapiFields.add("judgeAnalyticsAPI");
    openapiFields.add("judicialDataArray");
    openapiFields.add("lastName");
    openapiFields.add("middleName");
    openapiFields.add("name");
    openapiFields.add("normJudgeId");
    openapiFields.add("object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("caseAnalyticsAPI");
    openapiRequiredFields.add("caseSearchAPI");
    openapiRequiredFields.add("firstName");
    openapiRequiredFields.add("hasAssociatedPublicData");
    openapiRequiredFields.add("judgeAnalyticsAPI");
    openapiRequiredFields.add("judicialDataArray");
    openapiRequiredFields.add("lastName");
    openapiRequiredFields.add("middleName");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("normJudgeId");
    openapiRequiredFields.add("object");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NormJudge
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NormJudge.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NormJudge is not found in the empty JSON string", NormJudge.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NormJudge.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `caseAnalyticsAPI`
      CaseAnalyticsAPI.validateJsonObject(jsonObj.getAsJsonObject("caseAnalyticsAPI"));
      if (!jsonObj.get("caseSearchAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseSearchAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseSearchAPI").toString()));
      }
      if (!jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      // validate the required field `judgeAnalyticsAPI`
      JudgeAnalyticsAPI.validateJsonObject(jsonObj.getAsJsonObject("judgeAnalyticsAPI"));
      // ensure the json data is an array
      if (!jsonObj.get("judicialDataArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `judicialDataArray` to be an array in the JSON string but got `%s`", jsonObj.get("judicialDataArray").toString()));
      }

      JsonArray jsonArrayjudicialDataArray = jsonObj.getAsJsonArray("judicialDataArray");
      // validate the required field `judicialDataArray` (array)
      for (int i = 0; i < jsonArrayjudicialDataArray.size(); i++) {
        NormJudgePublicData.validateJsonObject(jsonArrayjudicialDataArray.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if (!jsonObj.get("middleName").isJsonNull() && !jsonObj.get("middleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middleName").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("normJudgeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `normJudgeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("normJudgeId").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NormJudge.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NormJudge' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NormJudge> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NormJudge.class));

       return (TypeAdapter<T>) new TypeAdapter<NormJudge>() {
           @Override
           public void write(JsonWriter out, NormJudge value) throws IOException {
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
           public NormJudge read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NormJudge instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of NormJudge given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NormJudge
  * @throws IOException if the JSON string is invalid with respect to NormJudge
  */
  public static NormJudge fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NormJudge.class);
  }

 /**
  * Convert an instance of NormJudge to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

