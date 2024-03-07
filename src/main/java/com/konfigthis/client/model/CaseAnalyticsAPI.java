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
 * Provides Court Data per State Jurisdiction for an entity.
 */
@ApiModel(description = "Provides Court Data per State Jurisdiction for an entity.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CaseAnalyticsAPI {
  public static final String SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_AREA_OF_LAW_A_P_I = "caseCountAnalyticsByAreaOfLawAPI";
  @SerializedName(SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_AREA_OF_LAW_A_P_I)
  private URI caseCountAnalyticsByAreaOfLawAPI;

  public static final String SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_CASE_CLASS_A_P_I = "caseCountAnalyticsByCaseClassAPI";
  @SerializedName(SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_CASE_CLASS_A_P_I)
  private URI caseCountAnalyticsByCaseClassAPI;

  public static final String SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_CASE_TYPE_A_P_I = "caseCountAnalyticsByCaseTypeAPI";
  @SerializedName(SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_CASE_TYPE_A_P_I)
  private URI caseCountAnalyticsByCaseTypeAPI;

  public static final String SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_CASE_TYPE_GROUP_A_P_I = "caseCountAnalyticsByCaseTypeGroupAPI";
  @SerializedName(SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_CASE_TYPE_GROUP_A_P_I)
  private URI caseCountAnalyticsByCaseTypeGroupAPI;

  public static final String SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_COURT_A_P_I = "caseCountAnalyticsByCourtAPI";
  @SerializedName(SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_COURT_A_P_I)
  private URI caseCountAnalyticsByCourtAPI;

  public static final String SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_COURT_LOCATION_A_P_I = "caseCountAnalyticsByCourtLocationAPI";
  @SerializedName(SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_COURT_LOCATION_A_P_I)
  private URI caseCountAnalyticsByCourtLocationAPI;

  public static final String SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_COURT_SYSTEM_A_P_I = "caseCountAnalyticsByCourtSystemAPI";
  @SerializedName(SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_COURT_SYSTEM_A_P_I)
  private URI caseCountAnalyticsByCourtSystemAPI;

  public static final String SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_COURT_TYPE_A_P_I = "caseCountAnalyticsByCourtTypeAPI";
  @SerializedName(SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_COURT_TYPE_A_P_I)
  private URI caseCountAnalyticsByCourtTypeAPI;

  public static final String SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_JURISDICTION_GEO_A_P_I = "caseCountAnalyticsByJurisdictionGeoAPI";
  @SerializedName(SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_JURISDICTION_GEO_A_P_I)
  private URI caseCountAnalyticsByJurisdictionGeoAPI;

  public static final String SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_PARTY_ROLE_A_P_I = "caseCountAnalyticsByPartyRoleAPI";
  @SerializedName(SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_PARTY_ROLE_A_P_I)
  private URI caseCountAnalyticsByPartyRoleAPI;

  public static final String SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_PARTY_ROLE_GROUP_A_P_I = "caseCountAnalyticsByPartyRoleGroupAPI";
  @SerializedName(SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_PARTY_ROLE_GROUP_A_P_I)
  private URI caseCountAnalyticsByPartyRoleGroupAPI;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "CaseAnalyticsAPI";

  public static final String SERIALIZED_NAME_TOTAL_CASES = "totalCases";
  @SerializedName(SERIALIZED_NAME_TOTAL_CASES)
  private Integer totalCases;

  public CaseAnalyticsAPI() {
  }

  public CaseAnalyticsAPI caseCountAnalyticsByAreaOfLawAPI(URI caseCountAnalyticsByAreaOfLawAPI) {
    
    
    
    
    this.caseCountAnalyticsByAreaOfLawAPI = caseCountAnalyticsByAreaOfLawAPI;
    return this;
  }

   /**
   * Get caseCountAnalyticsByAreaOfLawAPI
   * @return caseCountAnalyticsByAreaOfLawAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public URI getCaseCountAnalyticsByAreaOfLawAPI() {
    return caseCountAnalyticsByAreaOfLawAPI;
  }


  public void setCaseCountAnalyticsByAreaOfLawAPI(URI caseCountAnalyticsByAreaOfLawAPI) {
    
    
    
    this.caseCountAnalyticsByAreaOfLawAPI = caseCountAnalyticsByAreaOfLawAPI;
  }


  public CaseAnalyticsAPI caseCountAnalyticsByCaseClassAPI(URI caseCountAnalyticsByCaseClassAPI) {
    
    
    
    
    this.caseCountAnalyticsByCaseClassAPI = caseCountAnalyticsByCaseClassAPI;
    return this;
  }

   /**
   * Get caseCountAnalyticsByCaseClassAPI
   * @return caseCountAnalyticsByCaseClassAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public URI getCaseCountAnalyticsByCaseClassAPI() {
    return caseCountAnalyticsByCaseClassAPI;
  }


  public void setCaseCountAnalyticsByCaseClassAPI(URI caseCountAnalyticsByCaseClassAPI) {
    
    
    
    this.caseCountAnalyticsByCaseClassAPI = caseCountAnalyticsByCaseClassAPI;
  }


  public CaseAnalyticsAPI caseCountAnalyticsByCaseTypeAPI(URI caseCountAnalyticsByCaseTypeAPI) {
    
    
    
    
    this.caseCountAnalyticsByCaseTypeAPI = caseCountAnalyticsByCaseTypeAPI;
    return this;
  }

   /**
   * Get caseCountAnalyticsByCaseTypeAPI
   * @return caseCountAnalyticsByCaseTypeAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public URI getCaseCountAnalyticsByCaseTypeAPI() {
    return caseCountAnalyticsByCaseTypeAPI;
  }


  public void setCaseCountAnalyticsByCaseTypeAPI(URI caseCountAnalyticsByCaseTypeAPI) {
    
    
    
    this.caseCountAnalyticsByCaseTypeAPI = caseCountAnalyticsByCaseTypeAPI;
  }


  public CaseAnalyticsAPI caseCountAnalyticsByCaseTypeGroupAPI(URI caseCountAnalyticsByCaseTypeGroupAPI) {
    
    
    
    
    this.caseCountAnalyticsByCaseTypeGroupAPI = caseCountAnalyticsByCaseTypeGroupAPI;
    return this;
  }

   /**
   * Get caseCountAnalyticsByCaseTypeGroupAPI
   * @return caseCountAnalyticsByCaseTypeGroupAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public URI getCaseCountAnalyticsByCaseTypeGroupAPI() {
    return caseCountAnalyticsByCaseTypeGroupAPI;
  }


  public void setCaseCountAnalyticsByCaseTypeGroupAPI(URI caseCountAnalyticsByCaseTypeGroupAPI) {
    
    
    
    this.caseCountAnalyticsByCaseTypeGroupAPI = caseCountAnalyticsByCaseTypeGroupAPI;
  }


  public CaseAnalyticsAPI caseCountAnalyticsByCourtAPI(URI caseCountAnalyticsByCourtAPI) {
    
    
    
    
    this.caseCountAnalyticsByCourtAPI = caseCountAnalyticsByCourtAPI;
    return this;
  }

   /**
   * Get caseCountAnalyticsByCourtAPI
   * @return caseCountAnalyticsByCourtAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public URI getCaseCountAnalyticsByCourtAPI() {
    return caseCountAnalyticsByCourtAPI;
  }


  public void setCaseCountAnalyticsByCourtAPI(URI caseCountAnalyticsByCourtAPI) {
    
    
    
    this.caseCountAnalyticsByCourtAPI = caseCountAnalyticsByCourtAPI;
  }


  public CaseAnalyticsAPI caseCountAnalyticsByCourtLocationAPI(URI caseCountAnalyticsByCourtLocationAPI) {
    
    
    
    
    this.caseCountAnalyticsByCourtLocationAPI = caseCountAnalyticsByCourtLocationAPI;
    return this;
  }

   /**
   * Get caseCountAnalyticsByCourtLocationAPI
   * @return caseCountAnalyticsByCourtLocationAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public URI getCaseCountAnalyticsByCourtLocationAPI() {
    return caseCountAnalyticsByCourtLocationAPI;
  }


  public void setCaseCountAnalyticsByCourtLocationAPI(URI caseCountAnalyticsByCourtLocationAPI) {
    
    
    
    this.caseCountAnalyticsByCourtLocationAPI = caseCountAnalyticsByCourtLocationAPI;
  }


  public CaseAnalyticsAPI caseCountAnalyticsByCourtSystemAPI(URI caseCountAnalyticsByCourtSystemAPI) {
    
    
    
    
    this.caseCountAnalyticsByCourtSystemAPI = caseCountAnalyticsByCourtSystemAPI;
    return this;
  }

   /**
   * Get caseCountAnalyticsByCourtSystemAPI
   * @return caseCountAnalyticsByCourtSystemAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public URI getCaseCountAnalyticsByCourtSystemAPI() {
    return caseCountAnalyticsByCourtSystemAPI;
  }


  public void setCaseCountAnalyticsByCourtSystemAPI(URI caseCountAnalyticsByCourtSystemAPI) {
    
    
    
    this.caseCountAnalyticsByCourtSystemAPI = caseCountAnalyticsByCourtSystemAPI;
  }


  public CaseAnalyticsAPI caseCountAnalyticsByCourtTypeAPI(URI caseCountAnalyticsByCourtTypeAPI) {
    
    
    
    
    this.caseCountAnalyticsByCourtTypeAPI = caseCountAnalyticsByCourtTypeAPI;
    return this;
  }

   /**
   * Get caseCountAnalyticsByCourtTypeAPI
   * @return caseCountAnalyticsByCourtTypeAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public URI getCaseCountAnalyticsByCourtTypeAPI() {
    return caseCountAnalyticsByCourtTypeAPI;
  }


  public void setCaseCountAnalyticsByCourtTypeAPI(URI caseCountAnalyticsByCourtTypeAPI) {
    
    
    
    this.caseCountAnalyticsByCourtTypeAPI = caseCountAnalyticsByCourtTypeAPI;
  }


  public CaseAnalyticsAPI caseCountAnalyticsByJurisdictionGeoAPI(URI caseCountAnalyticsByJurisdictionGeoAPI) {
    
    
    
    
    this.caseCountAnalyticsByJurisdictionGeoAPI = caseCountAnalyticsByJurisdictionGeoAPI;
    return this;
  }

   /**
   * Get caseCountAnalyticsByJurisdictionGeoAPI
   * @return caseCountAnalyticsByJurisdictionGeoAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public URI getCaseCountAnalyticsByJurisdictionGeoAPI() {
    return caseCountAnalyticsByJurisdictionGeoAPI;
  }


  public void setCaseCountAnalyticsByJurisdictionGeoAPI(URI caseCountAnalyticsByJurisdictionGeoAPI) {
    
    
    
    this.caseCountAnalyticsByJurisdictionGeoAPI = caseCountAnalyticsByJurisdictionGeoAPI;
  }


  public CaseAnalyticsAPI caseCountAnalyticsByPartyRoleAPI(URI caseCountAnalyticsByPartyRoleAPI) {
    
    
    
    
    this.caseCountAnalyticsByPartyRoleAPI = caseCountAnalyticsByPartyRoleAPI;
    return this;
  }

   /**
   * Get caseCountAnalyticsByPartyRoleAPI
   * @return caseCountAnalyticsByPartyRoleAPI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public URI getCaseCountAnalyticsByPartyRoleAPI() {
    return caseCountAnalyticsByPartyRoleAPI;
  }


  public void setCaseCountAnalyticsByPartyRoleAPI(URI caseCountAnalyticsByPartyRoleAPI) {
    
    
    
    this.caseCountAnalyticsByPartyRoleAPI = caseCountAnalyticsByPartyRoleAPI;
  }


  public CaseAnalyticsAPI caseCountAnalyticsByPartyRoleGroupAPI(URI caseCountAnalyticsByPartyRoleGroupAPI) {
    
    
    
    
    this.caseCountAnalyticsByPartyRoleGroupAPI = caseCountAnalyticsByPartyRoleGroupAPI;
    return this;
  }

   /**
   * Get caseCountAnalyticsByPartyRoleGroupAPI
   * @return caseCountAnalyticsByPartyRoleGroupAPI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public URI getCaseCountAnalyticsByPartyRoleGroupAPI() {
    return caseCountAnalyticsByPartyRoleGroupAPI;
  }


  public void setCaseCountAnalyticsByPartyRoleGroupAPI(URI caseCountAnalyticsByPartyRoleGroupAPI) {
    
    
    
    this.caseCountAnalyticsByPartyRoleGroupAPI = caseCountAnalyticsByPartyRoleGroupAPI;
  }


  public CaseAnalyticsAPI _object(String _object) {
    
    
    
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CaseAnalyticsAPI", required = true, value = "")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    
    this._object = _object;
  }


  public CaseAnalyticsAPI totalCases(Integer totalCases) {
    
    
    
    
    this.totalCases = totalCases;
    return this;
  }

   /**
   * Get totalCases
   * @return totalCases
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTotalCases() {
    return totalCases;
  }


  public void setTotalCases(Integer totalCases) {
    
    
    
    this.totalCases = totalCases;
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
   * @return the CaseAnalyticsAPI instance itself
   */
  public CaseAnalyticsAPI putAdditionalProperty(String key, Object value) {
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
    CaseAnalyticsAPI caseAnalyticsAPI = (CaseAnalyticsAPI) o;
    return Objects.equals(this.caseCountAnalyticsByAreaOfLawAPI, caseAnalyticsAPI.caseCountAnalyticsByAreaOfLawAPI) &&
        Objects.equals(this.caseCountAnalyticsByCaseClassAPI, caseAnalyticsAPI.caseCountAnalyticsByCaseClassAPI) &&
        Objects.equals(this.caseCountAnalyticsByCaseTypeAPI, caseAnalyticsAPI.caseCountAnalyticsByCaseTypeAPI) &&
        Objects.equals(this.caseCountAnalyticsByCaseTypeGroupAPI, caseAnalyticsAPI.caseCountAnalyticsByCaseTypeGroupAPI) &&
        Objects.equals(this.caseCountAnalyticsByCourtAPI, caseAnalyticsAPI.caseCountAnalyticsByCourtAPI) &&
        Objects.equals(this.caseCountAnalyticsByCourtLocationAPI, caseAnalyticsAPI.caseCountAnalyticsByCourtLocationAPI) &&
        Objects.equals(this.caseCountAnalyticsByCourtSystemAPI, caseAnalyticsAPI.caseCountAnalyticsByCourtSystemAPI) &&
        Objects.equals(this.caseCountAnalyticsByCourtTypeAPI, caseAnalyticsAPI.caseCountAnalyticsByCourtTypeAPI) &&
        Objects.equals(this.caseCountAnalyticsByJurisdictionGeoAPI, caseAnalyticsAPI.caseCountAnalyticsByJurisdictionGeoAPI) &&
        Objects.equals(this.caseCountAnalyticsByPartyRoleAPI, caseAnalyticsAPI.caseCountAnalyticsByPartyRoleAPI) &&
        Objects.equals(this.caseCountAnalyticsByPartyRoleGroupAPI, caseAnalyticsAPI.caseCountAnalyticsByPartyRoleGroupAPI) &&
        Objects.equals(this._object, caseAnalyticsAPI._object) &&
        Objects.equals(this.totalCases, caseAnalyticsAPI.totalCases)&&
        Objects.equals(this.additionalProperties, caseAnalyticsAPI.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseCountAnalyticsByAreaOfLawAPI, caseCountAnalyticsByCaseClassAPI, caseCountAnalyticsByCaseTypeAPI, caseCountAnalyticsByCaseTypeGroupAPI, caseCountAnalyticsByCourtAPI, caseCountAnalyticsByCourtLocationAPI, caseCountAnalyticsByCourtSystemAPI, caseCountAnalyticsByCourtTypeAPI, caseCountAnalyticsByJurisdictionGeoAPI, caseCountAnalyticsByPartyRoleAPI, caseCountAnalyticsByPartyRoleGroupAPI, _object, totalCases, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseAnalyticsAPI {\n");
    sb.append("    caseCountAnalyticsByAreaOfLawAPI: ").append(toIndentedString(caseCountAnalyticsByAreaOfLawAPI)).append("\n");
    sb.append("    caseCountAnalyticsByCaseClassAPI: ").append(toIndentedString(caseCountAnalyticsByCaseClassAPI)).append("\n");
    sb.append("    caseCountAnalyticsByCaseTypeAPI: ").append(toIndentedString(caseCountAnalyticsByCaseTypeAPI)).append("\n");
    sb.append("    caseCountAnalyticsByCaseTypeGroupAPI: ").append(toIndentedString(caseCountAnalyticsByCaseTypeGroupAPI)).append("\n");
    sb.append("    caseCountAnalyticsByCourtAPI: ").append(toIndentedString(caseCountAnalyticsByCourtAPI)).append("\n");
    sb.append("    caseCountAnalyticsByCourtLocationAPI: ").append(toIndentedString(caseCountAnalyticsByCourtLocationAPI)).append("\n");
    sb.append("    caseCountAnalyticsByCourtSystemAPI: ").append(toIndentedString(caseCountAnalyticsByCourtSystemAPI)).append("\n");
    sb.append("    caseCountAnalyticsByCourtTypeAPI: ").append(toIndentedString(caseCountAnalyticsByCourtTypeAPI)).append("\n");
    sb.append("    caseCountAnalyticsByJurisdictionGeoAPI: ").append(toIndentedString(caseCountAnalyticsByJurisdictionGeoAPI)).append("\n");
    sb.append("    caseCountAnalyticsByPartyRoleAPI: ").append(toIndentedString(caseCountAnalyticsByPartyRoleAPI)).append("\n");
    sb.append("    caseCountAnalyticsByPartyRoleGroupAPI: ").append(toIndentedString(caseCountAnalyticsByPartyRoleGroupAPI)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    totalCases: ").append(toIndentedString(totalCases)).append("\n");
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
    openapiFields.add("caseCountAnalyticsByAreaOfLawAPI");
    openapiFields.add("caseCountAnalyticsByCaseClassAPI");
    openapiFields.add("caseCountAnalyticsByCaseTypeAPI");
    openapiFields.add("caseCountAnalyticsByCaseTypeGroupAPI");
    openapiFields.add("caseCountAnalyticsByCourtAPI");
    openapiFields.add("caseCountAnalyticsByCourtLocationAPI");
    openapiFields.add("caseCountAnalyticsByCourtSystemAPI");
    openapiFields.add("caseCountAnalyticsByCourtTypeAPI");
    openapiFields.add("caseCountAnalyticsByJurisdictionGeoAPI");
    openapiFields.add("caseCountAnalyticsByPartyRoleAPI");
    openapiFields.add("caseCountAnalyticsByPartyRoleGroupAPI");
    openapiFields.add("object");
    openapiFields.add("totalCases");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("caseCountAnalyticsByAreaOfLawAPI");
    openapiRequiredFields.add("caseCountAnalyticsByCaseClassAPI");
    openapiRequiredFields.add("caseCountAnalyticsByCaseTypeAPI");
    openapiRequiredFields.add("caseCountAnalyticsByCaseTypeGroupAPI");
    openapiRequiredFields.add("caseCountAnalyticsByCourtAPI");
    openapiRequiredFields.add("caseCountAnalyticsByCourtLocationAPI");
    openapiRequiredFields.add("caseCountAnalyticsByCourtSystemAPI");
    openapiRequiredFields.add("caseCountAnalyticsByCourtTypeAPI");
    openapiRequiredFields.add("caseCountAnalyticsByJurisdictionGeoAPI");
    openapiRequiredFields.add("caseCountAnalyticsByPartyRoleAPI");
    openapiRequiredFields.add("caseCountAnalyticsByPartyRoleGroupAPI");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("totalCases");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CaseAnalyticsAPI
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CaseAnalyticsAPI.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CaseAnalyticsAPI is not found in the empty JSON string", CaseAnalyticsAPI.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CaseAnalyticsAPI.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("caseCountAnalyticsByAreaOfLawAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseCountAnalyticsByAreaOfLawAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseCountAnalyticsByAreaOfLawAPI").toString()));
      }
      if (!jsonObj.get("caseCountAnalyticsByCaseClassAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseCountAnalyticsByCaseClassAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseCountAnalyticsByCaseClassAPI").toString()));
      }
      if (!jsonObj.get("caseCountAnalyticsByCaseTypeAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseCountAnalyticsByCaseTypeAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseCountAnalyticsByCaseTypeAPI").toString()));
      }
      if (!jsonObj.get("caseCountAnalyticsByCaseTypeGroupAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseCountAnalyticsByCaseTypeGroupAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseCountAnalyticsByCaseTypeGroupAPI").toString()));
      }
      if (!jsonObj.get("caseCountAnalyticsByCourtAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseCountAnalyticsByCourtAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseCountAnalyticsByCourtAPI").toString()));
      }
      if (!jsonObj.get("caseCountAnalyticsByCourtLocationAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseCountAnalyticsByCourtLocationAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseCountAnalyticsByCourtLocationAPI").toString()));
      }
      if (!jsonObj.get("caseCountAnalyticsByCourtSystemAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseCountAnalyticsByCourtSystemAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseCountAnalyticsByCourtSystemAPI").toString()));
      }
      if (!jsonObj.get("caseCountAnalyticsByCourtTypeAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseCountAnalyticsByCourtTypeAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseCountAnalyticsByCourtTypeAPI").toString()));
      }
      if (!jsonObj.get("caseCountAnalyticsByJurisdictionGeoAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseCountAnalyticsByJurisdictionGeoAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseCountAnalyticsByJurisdictionGeoAPI").toString()));
      }
      if (!jsonObj.get("caseCountAnalyticsByPartyRoleAPI").isJsonNull() && !jsonObj.get("caseCountAnalyticsByPartyRoleAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseCountAnalyticsByPartyRoleAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseCountAnalyticsByPartyRoleAPI").toString()));
      }
      if (!jsonObj.get("caseCountAnalyticsByPartyRoleGroupAPI").isJsonNull() && !jsonObj.get("caseCountAnalyticsByPartyRoleGroupAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseCountAnalyticsByPartyRoleGroupAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseCountAnalyticsByPartyRoleGroupAPI").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CaseAnalyticsAPI.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CaseAnalyticsAPI' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CaseAnalyticsAPI> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CaseAnalyticsAPI.class));

       return (TypeAdapter<T>) new TypeAdapter<CaseAnalyticsAPI>() {
           @Override
           public void write(JsonWriter out, CaseAnalyticsAPI value) throws IOException {
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
           public CaseAnalyticsAPI read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CaseAnalyticsAPI instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CaseAnalyticsAPI given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CaseAnalyticsAPI
  * @throws IOException if the JSON string is invalid with respect to CaseAnalyticsAPI
  */
  public static CaseAnalyticsAPI fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CaseAnalyticsAPI.class);
  }

 /**
  * Convert an instance of CaseAnalyticsAPI to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
