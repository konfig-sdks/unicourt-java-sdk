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
import com.konfigthis.client.model.PossibleNormLawFirmScoreConstituents;
import com.konfigthis.client.model.PossibleNormLawFirmSourceDetails;
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
 * PossibleNormLawFirm
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PossibleNormLawFirm {
  public static final String SERIALIZED_NAME_ASSOCIATED_NORM_ATTORNEY_A_P_I = "associatedNormAttorneyAPI";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_NORM_ATTORNEY_A_P_I)
  private URI associatedNormAttorneyAPI;

  public static final String SERIALIZED_NAME_ASSOCIATED_NORM_JUDGE_A_P_I = "associatedNormJudgeAPI";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_NORM_JUDGE_A_P_I)
  private URI associatedNormJudgeAPI;

  public static final String SERIALIZED_NAME_ASSOCIATED_NORM_PARTIES_A_P_I = "associatedNormPartiesAPI";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_NORM_PARTIES_A_P_I)
  private URI associatedNormPartiesAPI;

  public static final String SERIALIZED_NAME_BEST_MATCH = "bestMatch";
  @SerializedName(SERIALIZED_NAME_BEST_MATCH)
  private Boolean bestMatch = false;

  public static final String SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_NORM_LAW_FIRM_A_P_I = "caseCountAnalyticsByNormLawFirmAPI";
  @SerializedName(SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_NORM_LAW_FIRM_A_P_I)
  private URI caseCountAnalyticsByNormLawFirmAPI;

  public static final String SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_OPPOSING_NORM_LAW_FIRM_A_P_I = "caseCountAnalyticsByOpposingNormLawFirmAPI";
  @SerializedName(SERIALIZED_NAME_CASE_COUNT_ANALYTICS_BY_OPPOSING_NORM_LAW_FIRM_A_P_I)
  private URI caseCountAnalyticsByOpposingNormLawFirmAPI;

  public static final String SERIALIZED_NAME_CONFIDENCE_SCORE = "confidenceScore";
  @SerializedName(SERIALIZED_NAME_CONFIDENCE_SCORE)
  private Float confidenceScore;

  public static final String SERIALIZED_NAME_NORM_LAW_FIRM_A_P_I = "normLawFirmAPI";
  @SerializedName(SERIALIZED_NAME_NORM_LAW_FIRM_A_P_I)
  private URI normLawFirmAPI;

  public static final String SERIALIZED_NAME_NORM_LAW_FIRM_ID = "normLawFirmId";
  @SerializedName(SERIALIZED_NAME_NORM_LAW_FIRM_ID)
  private String normLawFirmId;

  public static final String SERIALIZED_NAME_NORM_LAW_FIRM_NAME = "normLawFirmName";
  @SerializedName(SERIALIZED_NAME_NORM_LAW_FIRM_NAME)
  private String normLawFirmName;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "PossibleNormLawFirm";

  public static final String SERIALIZED_NAME_SCORE_CONSTITUENTS = "scoreConstituents";
  @SerializedName(SERIALIZED_NAME_SCORE_CONSTITUENTS)
  private PossibleNormLawFirmScoreConstituents scoreConstituents;

  public static final String SERIALIZED_NAME_SOURCE_DETAILS = "sourceDetails";
  @SerializedName(SERIALIZED_NAME_SOURCE_DETAILS)
  private PossibleNormLawFirmSourceDetails sourceDetails;

  public PossibleNormLawFirm() {
  }

  public PossibleNormLawFirm associatedNormAttorneyAPI(URI associatedNormAttorneyAPI) {
    
    
    
    
    this.associatedNormAttorneyAPI = associatedNormAttorneyAPI;
    return this;
  }

   /**
   * Get associatedNormAttorneyAPI
   * @return associatedNormAttorneyAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public URI getAssociatedNormAttorneyAPI() {
    return associatedNormAttorneyAPI;
  }


  public void setAssociatedNormAttorneyAPI(URI associatedNormAttorneyAPI) {
    
    
    
    this.associatedNormAttorneyAPI = associatedNormAttorneyAPI;
  }


  public PossibleNormLawFirm associatedNormJudgeAPI(URI associatedNormJudgeAPI) {
    
    
    
    
    this.associatedNormJudgeAPI = associatedNormJudgeAPI;
    return this;
  }

   /**
   * Get associatedNormJudgeAPI
   * @return associatedNormJudgeAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public URI getAssociatedNormJudgeAPI() {
    return associatedNormJudgeAPI;
  }


  public void setAssociatedNormJudgeAPI(URI associatedNormJudgeAPI) {
    
    
    
    this.associatedNormJudgeAPI = associatedNormJudgeAPI;
  }


  public PossibleNormLawFirm associatedNormPartiesAPI(URI associatedNormPartiesAPI) {
    
    
    
    
    this.associatedNormPartiesAPI = associatedNormPartiesAPI;
    return this;
  }

   /**
   * Get associatedNormPartiesAPI
   * @return associatedNormPartiesAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public URI getAssociatedNormPartiesAPI() {
    return associatedNormPartiesAPI;
  }


  public void setAssociatedNormPartiesAPI(URI associatedNormPartiesAPI) {
    
    
    
    this.associatedNormPartiesAPI = associatedNormPartiesAPI;
  }


  public PossibleNormLawFirm bestMatch(Boolean bestMatch) {
    
    
    
    
    this.bestMatch = bestMatch;
    return this;
  }

   /**
   * Get bestMatch
   * @return bestMatch
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "")

  public Boolean getBestMatch() {
    return bestMatch;
  }


  public void setBestMatch(Boolean bestMatch) {
    
    
    
    this.bestMatch = bestMatch;
  }


  public PossibleNormLawFirm caseCountAnalyticsByNormLawFirmAPI(URI caseCountAnalyticsByNormLawFirmAPI) {
    
    
    
    
    this.caseCountAnalyticsByNormLawFirmAPI = caseCountAnalyticsByNormLawFirmAPI;
    return this;
  }

   /**
   * Get caseCountAnalyticsByNormLawFirmAPI
   * @return caseCountAnalyticsByNormLawFirmAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public URI getCaseCountAnalyticsByNormLawFirmAPI() {
    return caseCountAnalyticsByNormLawFirmAPI;
  }


  public void setCaseCountAnalyticsByNormLawFirmAPI(URI caseCountAnalyticsByNormLawFirmAPI) {
    
    
    
    this.caseCountAnalyticsByNormLawFirmAPI = caseCountAnalyticsByNormLawFirmAPI;
  }


  public PossibleNormLawFirm caseCountAnalyticsByOpposingNormLawFirmAPI(URI caseCountAnalyticsByOpposingNormLawFirmAPI) {
    
    
    
    
    this.caseCountAnalyticsByOpposingNormLawFirmAPI = caseCountAnalyticsByOpposingNormLawFirmAPI;
    return this;
  }

   /**
   * Get caseCountAnalyticsByOpposingNormLawFirmAPI
   * @return caseCountAnalyticsByOpposingNormLawFirmAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public URI getCaseCountAnalyticsByOpposingNormLawFirmAPI() {
    return caseCountAnalyticsByOpposingNormLawFirmAPI;
  }


  public void setCaseCountAnalyticsByOpposingNormLawFirmAPI(URI caseCountAnalyticsByOpposingNormLawFirmAPI) {
    
    
    
    this.caseCountAnalyticsByOpposingNormLawFirmAPI = caseCountAnalyticsByOpposingNormLawFirmAPI;
  }


  public PossibleNormLawFirm confidenceScore(Float confidenceScore) {
    
    
    
    
    this.confidenceScore = confidenceScore;
    return this;
  }

   /**
   * Get confidenceScore
   * @return confidenceScore
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Float getConfidenceScore() {
    return confidenceScore;
  }


  public void setConfidenceScore(Float confidenceScore) {
    
    
    
    this.confidenceScore = confidenceScore;
  }


  public PossibleNormLawFirm normLawFirmAPI(URI normLawFirmAPI) {
    
    
    
    
    this.normLawFirmAPI = normLawFirmAPI;
    return this;
  }

   /**
   * Get normLawFirmAPI
   * @return normLawFirmAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public URI getNormLawFirmAPI() {
    return normLawFirmAPI;
  }


  public void setNormLawFirmAPI(URI normLawFirmAPI) {
    
    
    
    this.normLawFirmAPI = normLawFirmAPI;
  }


  public PossibleNormLawFirm normLawFirmId(String normLawFirmId) {
    
    
    if (normLawFirmId != null && normLawFirmId.length() < 18) {
      throw new IllegalArgumentException("Invalid value for normLawFirmId. Length must be greater than or equal to 18.");
    }
    
    this.normLawFirmId = normLawFirmId;
    return this;
  }

   /**
   * Get normLawFirmId
   * @return normLawFirmId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNormLawFirmId() {
    return normLawFirmId;
  }


  public void setNormLawFirmId(String normLawFirmId) {
    
    
    if (normLawFirmId != null && normLawFirmId.length() < 18) {
      throw new IllegalArgumentException("Invalid value for normLawFirmId. Length must be greater than or equal to 18.");
    }
    this.normLawFirmId = normLawFirmId;
  }


  public PossibleNormLawFirm normLawFirmName(String normLawFirmName) {
    
    
    
    
    this.normLawFirmName = normLawFirmName;
    return this;
  }

   /**
   * Get normLawFirmName
   * @return normLawFirmName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getNormLawFirmName() {
    return normLawFirmName;
  }


  public void setNormLawFirmName(String normLawFirmName) {
    
    
    
    this.normLawFirmName = normLawFirmName;
  }


  public PossibleNormLawFirm _object(String _object) {
    
    
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
  @ApiModelProperty(example = "PossibleNormLawFirm", required = true, value = "Name of the object")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    if (_object != null && _object.length() < 19) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 19.");
    }
    this._object = _object;
  }


  public PossibleNormLawFirm scoreConstituents(PossibleNormLawFirmScoreConstituents scoreConstituents) {
    
    
    
    
    this.scoreConstituents = scoreConstituents;
    return this;
  }

   /**
   * Get scoreConstituents
   * @return scoreConstituents
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PossibleNormLawFirmScoreConstituents getScoreConstituents() {
    return scoreConstituents;
  }


  public void setScoreConstituents(PossibleNormLawFirmScoreConstituents scoreConstituents) {
    
    
    
    this.scoreConstituents = scoreConstituents;
  }


  public PossibleNormLawFirm sourceDetails(PossibleNormLawFirmSourceDetails sourceDetails) {
    
    
    
    
    this.sourceDetails = sourceDetails;
    return this;
  }

   /**
   * Get sourceDetails
   * @return sourceDetails
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PossibleNormLawFirmSourceDetails getSourceDetails() {
    return sourceDetails;
  }


  public void setSourceDetails(PossibleNormLawFirmSourceDetails sourceDetails) {
    
    
    
    this.sourceDetails = sourceDetails;
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
   * @return the PossibleNormLawFirm instance itself
   */
  public PossibleNormLawFirm putAdditionalProperty(String key, Object value) {
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
    PossibleNormLawFirm possibleNormLawFirm = (PossibleNormLawFirm) o;
    return Objects.equals(this.associatedNormAttorneyAPI, possibleNormLawFirm.associatedNormAttorneyAPI) &&
        Objects.equals(this.associatedNormJudgeAPI, possibleNormLawFirm.associatedNormJudgeAPI) &&
        Objects.equals(this.associatedNormPartiesAPI, possibleNormLawFirm.associatedNormPartiesAPI) &&
        Objects.equals(this.bestMatch, possibleNormLawFirm.bestMatch) &&
        Objects.equals(this.caseCountAnalyticsByNormLawFirmAPI, possibleNormLawFirm.caseCountAnalyticsByNormLawFirmAPI) &&
        Objects.equals(this.caseCountAnalyticsByOpposingNormLawFirmAPI, possibleNormLawFirm.caseCountAnalyticsByOpposingNormLawFirmAPI) &&
        Objects.equals(this.confidenceScore, possibleNormLawFirm.confidenceScore) &&
        Objects.equals(this.normLawFirmAPI, possibleNormLawFirm.normLawFirmAPI) &&
        Objects.equals(this.normLawFirmId, possibleNormLawFirm.normLawFirmId) &&
        Objects.equals(this.normLawFirmName, possibleNormLawFirm.normLawFirmName) &&
        Objects.equals(this._object, possibleNormLawFirm._object) &&
        Objects.equals(this.scoreConstituents, possibleNormLawFirm.scoreConstituents) &&
        Objects.equals(this.sourceDetails, possibleNormLawFirm.sourceDetails)&&
        Objects.equals(this.additionalProperties, possibleNormLawFirm.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedNormAttorneyAPI, associatedNormJudgeAPI, associatedNormPartiesAPI, bestMatch, caseCountAnalyticsByNormLawFirmAPI, caseCountAnalyticsByOpposingNormLawFirmAPI, confidenceScore, normLawFirmAPI, normLawFirmId, normLawFirmName, _object, scoreConstituents, sourceDetails, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PossibleNormLawFirm {\n");
    sb.append("    associatedNormAttorneyAPI: ").append(toIndentedString(associatedNormAttorneyAPI)).append("\n");
    sb.append("    associatedNormJudgeAPI: ").append(toIndentedString(associatedNormJudgeAPI)).append("\n");
    sb.append("    associatedNormPartiesAPI: ").append(toIndentedString(associatedNormPartiesAPI)).append("\n");
    sb.append("    bestMatch: ").append(toIndentedString(bestMatch)).append("\n");
    sb.append("    caseCountAnalyticsByNormLawFirmAPI: ").append(toIndentedString(caseCountAnalyticsByNormLawFirmAPI)).append("\n");
    sb.append("    caseCountAnalyticsByOpposingNormLawFirmAPI: ").append(toIndentedString(caseCountAnalyticsByOpposingNormLawFirmAPI)).append("\n");
    sb.append("    confidenceScore: ").append(toIndentedString(confidenceScore)).append("\n");
    sb.append("    normLawFirmAPI: ").append(toIndentedString(normLawFirmAPI)).append("\n");
    sb.append("    normLawFirmId: ").append(toIndentedString(normLawFirmId)).append("\n");
    sb.append("    normLawFirmName: ").append(toIndentedString(normLawFirmName)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    scoreConstituents: ").append(toIndentedString(scoreConstituents)).append("\n");
    sb.append("    sourceDetails: ").append(toIndentedString(sourceDetails)).append("\n");
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
    openapiFields.add("associatedNormAttorneyAPI");
    openapiFields.add("associatedNormJudgeAPI");
    openapiFields.add("associatedNormPartiesAPI");
    openapiFields.add("bestMatch");
    openapiFields.add("caseCountAnalyticsByNormLawFirmAPI");
    openapiFields.add("caseCountAnalyticsByOpposingNormLawFirmAPI");
    openapiFields.add("confidenceScore");
    openapiFields.add("normLawFirmAPI");
    openapiFields.add("normLawFirmId");
    openapiFields.add("normLawFirmName");
    openapiFields.add("object");
    openapiFields.add("scoreConstituents");
    openapiFields.add("sourceDetails");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("associatedNormAttorneyAPI");
    openapiRequiredFields.add("associatedNormJudgeAPI");
    openapiRequiredFields.add("associatedNormPartiesAPI");
    openapiRequiredFields.add("bestMatch");
    openapiRequiredFields.add("caseCountAnalyticsByNormLawFirmAPI");
    openapiRequiredFields.add("caseCountAnalyticsByOpposingNormLawFirmAPI");
    openapiRequiredFields.add("confidenceScore");
    openapiRequiredFields.add("normLawFirmAPI");
    openapiRequiredFields.add("normLawFirmId");
    openapiRequiredFields.add("normLawFirmName");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("scoreConstituents");
    openapiRequiredFields.add("sourceDetails");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PossibleNormLawFirm
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PossibleNormLawFirm.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PossibleNormLawFirm is not found in the empty JSON string", PossibleNormLawFirm.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PossibleNormLawFirm.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("associatedNormAttorneyAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `associatedNormAttorneyAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("associatedNormAttorneyAPI").toString()));
      }
      if (!jsonObj.get("associatedNormJudgeAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `associatedNormJudgeAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("associatedNormJudgeAPI").toString()));
      }
      if (!jsonObj.get("associatedNormPartiesAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `associatedNormPartiesAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("associatedNormPartiesAPI").toString()));
      }
      if (!jsonObj.get("caseCountAnalyticsByNormLawFirmAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseCountAnalyticsByNormLawFirmAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseCountAnalyticsByNormLawFirmAPI").toString()));
      }
      if (!jsonObj.get("caseCountAnalyticsByOpposingNormLawFirmAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseCountAnalyticsByOpposingNormLawFirmAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseCountAnalyticsByOpposingNormLawFirmAPI").toString()));
      }
      if (!jsonObj.get("normLawFirmAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `normLawFirmAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("normLawFirmAPI").toString()));
      }
      if (!jsonObj.get("normLawFirmId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `normLawFirmId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("normLawFirmId").toString()));
      }
      if (!jsonObj.get("normLawFirmName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `normLawFirmName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("normLawFirmName").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      // validate the required field `scoreConstituents`
      PossibleNormLawFirmScoreConstituents.validateJsonObject(jsonObj.getAsJsonObject("scoreConstituents"));
      // validate the required field `sourceDetails`
      PossibleNormLawFirmSourceDetails.validateJsonObject(jsonObj.getAsJsonObject("sourceDetails"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PossibleNormLawFirm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PossibleNormLawFirm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PossibleNormLawFirm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PossibleNormLawFirm.class));

       return (TypeAdapter<T>) new TypeAdapter<PossibleNormLawFirm>() {
           @Override
           public void write(JsonWriter out, PossibleNormLawFirm value) throws IOException {
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
           public PossibleNormLawFirm read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PossibleNormLawFirm instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PossibleNormLawFirm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PossibleNormLawFirm
  * @throws IOException if the JSON string is invalid with respect to PossibleNormLawFirm
  */
  public static PossibleNormLawFirm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PossibleNormLawFirm.class);
  }

 /**
  * Convert an instance of PossibleNormLawFirm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

