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
import com.konfigthis.client.model.CaseStatus;
import com.konfigthis.client.model.CaseType;
import com.konfigthis.client.model.Court;
import com.konfigthis.client.model.CourtLocation;
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
 * CaseSearchResult
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CaseSearchResult {
  public static final String SERIALIZED_NAME_CASE_A_P_I = "caseAPI";
  @SerializedName(SERIALIZED_NAME_CASE_A_P_I)
  private URI caseAPI;

  public static final String SERIALIZED_NAME_CASE_ID = "caseId";
  @SerializedName(SERIALIZED_NAME_CASE_ID)
  private String caseId;

  public static final String SERIALIZED_NAME_CASE_NAME = "caseName";
  @SerializedName(SERIALIZED_NAME_CASE_NAME)
  private String caseName;

  public static final String SERIALIZED_NAME_CASE_NUMBER = "caseNumber";
  @SerializedName(SERIALIZED_NAME_CASE_NUMBER)
  private String caseNumber;

  public static final String SERIALIZED_NAME_CASE_STATUS = "caseStatus";
  @SerializedName(SERIALIZED_NAME_CASE_STATUS)
  private CaseStatus caseStatus;

  public static final String SERIALIZED_NAME_CASE_TYPE = "caseType";
  @SerializedName(SERIALIZED_NAME_CASE_TYPE)
  private CaseType caseType;

  public static final String SERIALIZED_NAME_COURT = "court";
  @SerializedName(SERIALIZED_NAME_COURT)
  private Court court;

  public static final String SERIALIZED_NAME_COURT_LOCATION = "courtLocation";
  @SerializedName(SERIALIZED_NAME_COURT_LOCATION)
  private CourtLocation courtLocation;

  public static final String SERIALIZED_NAME_FILED_DATE = "filedDate";
  @SerializedName(SERIALIZED_NAME_FILED_DATE)
  private OffsetDateTime filedDate;

  public static final String SERIALIZED_NAME_FIRST_FETCH_DATE = "firstFetchDate";
  @SerializedName(SERIALIZED_NAME_FIRST_FETCH_DATE)
  private OffsetDateTime firstFetchDate;

  public static final String SERIALIZED_NAME_LAST_FETCH_DATE = "lastFetchDate";
  @SerializedName(SERIALIZED_NAME_LAST_FETCH_DATE)
  private OffsetDateTime lastFetchDate;

  public static final String SERIALIZED_NAME_LAST_FETCH_DATE_WITH_UPDATES = "lastFetchDateWithUpdates";
  @SerializedName(SERIALIZED_NAME_LAST_FETCH_DATE_WITH_UPDATES)
  private OffsetDateTime lastFetchDateWithUpdates;

  public static final String SERIALIZED_NAME_MATCHED_OBJECT_ARRAY = "matchedObjectArray";
  @SerializedName(SERIALIZED_NAME_MATCHED_OBJECT_ARRAY)
  private List<MatchedObject> matchedObjectArray = new ArrayList<>();

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "CaseSearchResult";

  public static final String SERIALIZED_NAME_PARTICIPANTS_LAST_FETCH_DATE = "participantsLastFetchDate";
  @SerializedName(SERIALIZED_NAME_PARTICIPANTS_LAST_FETCH_DATE)
  private OffsetDateTime participantsLastFetchDate;

  public CaseSearchResult() {
  }

  public CaseSearchResult caseAPI(URI caseAPI) {
    
    
    if (caseAPI != null && caseAPI.length() < 1) {
      throw new IllegalArgumentException("Invalid value for caseAPI. Length must be greater than or equal to 1.");
    }
    
    this.caseAPI = caseAPI;
    return this;
  }

   /**
   * Get caseAPI
   * @return caseAPI
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://enterpriseapi.unicourt.com/case/CASEgq222a2d1239af", required = true, value = "")

  public URI getCaseAPI() {
    return caseAPI;
  }


  public void setCaseAPI(URI caseAPI) {
    
    
    if (caseAPI != null && caseAPI.length() < 1) {
      throw new IllegalArgumentException("Invalid value for caseAPI. Length must be greater than or equal to 1.");
    }
    this.caseAPI = caseAPI;
  }


  public CaseSearchResult caseId(String caseId) {
    
    
    if (caseId != null && caseId.length() < 18) {
      throw new IllegalArgumentException("Invalid value for caseId. Length must be greater than or equal to 18.");
    }
    
    this.caseId = caseId;
    return this;
  }

   /**
   * Get caseId
   * @return caseId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CASEgq222a2d1239af", required = true, value = "")

  public String getCaseId() {
    return caseId;
  }


  public void setCaseId(String caseId) {
    
    
    if (caseId != null && caseId.length() < 18) {
      throw new IllegalArgumentException("Invalid value for caseId. Length must be greater than or equal to 18.");
    }
    this.caseId = caseId;
  }


  public CaseSearchResult caseName(String caseName) {
    
    
    
    
    this.caseName = caseName;
    return this;
  }

   /**
   * Get caseName
   * @return caseName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Salgado v. Midland Funding, LLC et al", required = true, value = "")

  public String getCaseName() {
    return caseName;
  }


  public void setCaseName(String caseName) {
    
    
    
    this.caseName = caseName;
  }


  public CaseSearchResult caseNumber(String caseNumber) {
    
    
    if (caseNumber != null && caseNumber.length() < 1) {
      throw new IllegalArgumentException("Invalid value for caseNumber. Length must be greater than or equal to 1.");
    }
    
    this.caseNumber = caseNumber;
    return this;
  }

   /**
   * Get caseNumber
   * @return caseNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1:18-cv-08559", required = true, value = "")

  public String getCaseNumber() {
    return caseNumber;
  }


  public void setCaseNumber(String caseNumber) {
    
    
    if (caseNumber != null && caseNumber.length() < 1) {
      throw new IllegalArgumentException("Invalid value for caseNumber. Length must be greater than or equal to 1.");
    }
    this.caseNumber = caseNumber;
  }


  public CaseSearchResult caseStatus(CaseStatus caseStatus) {
    
    
    
    
    this.caseStatus = caseStatus;
    return this;
  }

   /**
   * Get caseStatus
   * @return caseStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public CaseStatus getCaseStatus() {
    return caseStatus;
  }


  public void setCaseStatus(CaseStatus caseStatus) {
    
    
    
    this.caseStatus = caseStatus;
  }


  public CaseSearchResult caseType(CaseType caseType) {
    
    
    
    
    this.caseType = caseType;
    return this;
  }

   /**
   * Get caseType
   * @return caseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public CaseType getCaseType() {
    return caseType;
  }


  public void setCaseType(CaseType caseType) {
    
    
    
    this.caseType = caseType;
  }


  public CaseSearchResult court(Court court) {
    
    
    
    
    this.court = court;
    return this;
  }

   /**
   * Get court
   * @return court
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Court getCourt() {
    return court;
  }


  public void setCourt(Court court) {
    
    
    
    this.court = court;
  }


  public CaseSearchResult courtLocation(CourtLocation courtLocation) {
    
    
    
    
    this.courtLocation = courtLocation;
    return this;
  }

   /**
   * Get courtLocation
   * @return courtLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public CourtLocation getCourtLocation() {
    return courtLocation;
  }


  public void setCourtLocation(CourtLocation courtLocation) {
    
    
    
    this.courtLocation = courtLocation;
  }


  public CaseSearchResult filedDate(OffsetDateTime filedDate) {
    
    
    if (filedDate != null && filedDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for filedDate. Length must be greater than or equal to 25.");
    }
    
    this.filedDate = filedDate;
    return this;
  }

   /**
   * Get filedDate
   * @return filedDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2018-12-31T00:00Z", required = true, value = "")

  public OffsetDateTime getFiledDate() {
    return filedDate;
  }


  public void setFiledDate(OffsetDateTime filedDate) {
    
    
    if (filedDate != null && filedDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for filedDate. Length must be greater than or equal to 25.");
    }
    this.filedDate = filedDate;
  }


  public CaseSearchResult firstFetchDate(OffsetDateTime firstFetchDate) {
    
    
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
  @ApiModelProperty(example = "2019-01-01T11:20:09Z", required = true, value = "")

  public OffsetDateTime getFirstFetchDate() {
    return firstFetchDate;
  }


  public void setFirstFetchDate(OffsetDateTime firstFetchDate) {
    
    
    if (firstFetchDate != null && firstFetchDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for firstFetchDate. Length must be greater than or equal to 25.");
    }
    this.firstFetchDate = firstFetchDate;
  }


  public CaseSearchResult lastFetchDate(OffsetDateTime lastFetchDate) {
    
    
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


  public CaseSearchResult lastFetchDateWithUpdates(OffsetDateTime lastFetchDateWithUpdates) {
    
    
    if (lastFetchDateWithUpdates != null && lastFetchDateWithUpdates.length() < 25) {
      throw new IllegalArgumentException("Invalid value for lastFetchDateWithUpdates. Length must be greater than or equal to 25.");
    }
    
    this.lastFetchDateWithUpdates = lastFetchDateWithUpdates;
    return this;
  }

   /**
   * Get lastFetchDateWithUpdates
   * @return lastFetchDateWithUpdates
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-04-25T10:42:46Z", required = true, value = "")

  public OffsetDateTime getLastFetchDateWithUpdates() {
    return lastFetchDateWithUpdates;
  }


  public void setLastFetchDateWithUpdates(OffsetDateTime lastFetchDateWithUpdates) {
    
    
    if (lastFetchDateWithUpdates != null && lastFetchDateWithUpdates.length() < 25) {
      throw new IllegalArgumentException("Invalid value for lastFetchDateWithUpdates. Length must be greater than or equal to 25.");
    }
    this.lastFetchDateWithUpdates = lastFetchDateWithUpdates;
  }


  public CaseSearchResult matchedObjectArray(List<MatchedObject> matchedObjectArray) {
    
    
    
    
    this.matchedObjectArray = matchedObjectArray;
    return this;
  }

  public CaseSearchResult addMatchedObjectArrayItem(MatchedObject matchedObjectArrayItem) {
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


  public CaseSearchResult _object(String _object) {
    
    
    if (_object != null && _object.length() < 16) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 16.");
    }
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CaseSearchResult", required = true, value = "")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    if (_object != null && _object.length() < 16) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 16.");
    }
    this._object = _object;
  }


  public CaseSearchResult participantsLastFetchDate(OffsetDateTime participantsLastFetchDate) {
    
    
    if (participantsLastFetchDate != null && participantsLastFetchDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for participantsLastFetchDate. Length must be greater than or equal to 25.");
    }
    
    this.participantsLastFetchDate = participantsLastFetchDate;
    return this;
  }

   /**
   * Get participantsLastFetchDate
   * @return participantsLastFetchDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-04-25T10:42:46Z", required = true, value = "")

  public OffsetDateTime getParticipantsLastFetchDate() {
    return participantsLastFetchDate;
  }


  public void setParticipantsLastFetchDate(OffsetDateTime participantsLastFetchDate) {
    
    
    if (participantsLastFetchDate != null && participantsLastFetchDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for participantsLastFetchDate. Length must be greater than or equal to 25.");
    }
    this.participantsLastFetchDate = participantsLastFetchDate;
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
   * @return the CaseSearchResult instance itself
   */
  public CaseSearchResult putAdditionalProperty(String key, Object value) {
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
    CaseSearchResult caseSearchResult = (CaseSearchResult) o;
    return Objects.equals(this.caseAPI, caseSearchResult.caseAPI) &&
        Objects.equals(this.caseId, caseSearchResult.caseId) &&
        Objects.equals(this.caseName, caseSearchResult.caseName) &&
        Objects.equals(this.caseNumber, caseSearchResult.caseNumber) &&
        Objects.equals(this.caseStatus, caseSearchResult.caseStatus) &&
        Objects.equals(this.caseType, caseSearchResult.caseType) &&
        Objects.equals(this.court, caseSearchResult.court) &&
        Objects.equals(this.courtLocation, caseSearchResult.courtLocation) &&
        Objects.equals(this.filedDate, caseSearchResult.filedDate) &&
        Objects.equals(this.firstFetchDate, caseSearchResult.firstFetchDate) &&
        Objects.equals(this.lastFetchDate, caseSearchResult.lastFetchDate) &&
        Objects.equals(this.lastFetchDateWithUpdates, caseSearchResult.lastFetchDateWithUpdates) &&
        Objects.equals(this.matchedObjectArray, caseSearchResult.matchedObjectArray) &&
        Objects.equals(this._object, caseSearchResult._object) &&
        Objects.equals(this.participantsLastFetchDate, caseSearchResult.participantsLastFetchDate)&&
        Objects.equals(this.additionalProperties, caseSearchResult.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseAPI, caseId, caseName, caseNumber, caseStatus, caseType, court, courtLocation, filedDate, firstFetchDate, lastFetchDate, lastFetchDateWithUpdates, matchedObjectArray, _object, participantsLastFetchDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseSearchResult {\n");
    sb.append("    caseAPI: ").append(toIndentedString(caseAPI)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    caseName: ").append(toIndentedString(caseName)).append("\n");
    sb.append("    caseNumber: ").append(toIndentedString(caseNumber)).append("\n");
    sb.append("    caseStatus: ").append(toIndentedString(caseStatus)).append("\n");
    sb.append("    caseType: ").append(toIndentedString(caseType)).append("\n");
    sb.append("    court: ").append(toIndentedString(court)).append("\n");
    sb.append("    courtLocation: ").append(toIndentedString(courtLocation)).append("\n");
    sb.append("    filedDate: ").append(toIndentedString(filedDate)).append("\n");
    sb.append("    firstFetchDate: ").append(toIndentedString(firstFetchDate)).append("\n");
    sb.append("    lastFetchDate: ").append(toIndentedString(lastFetchDate)).append("\n");
    sb.append("    lastFetchDateWithUpdates: ").append(toIndentedString(lastFetchDateWithUpdates)).append("\n");
    sb.append("    matchedObjectArray: ").append(toIndentedString(matchedObjectArray)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    participantsLastFetchDate: ").append(toIndentedString(participantsLastFetchDate)).append("\n");
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
    openapiFields.add("caseAPI");
    openapiFields.add("caseId");
    openapiFields.add("caseName");
    openapiFields.add("caseNumber");
    openapiFields.add("caseStatus");
    openapiFields.add("caseType");
    openapiFields.add("court");
    openapiFields.add("courtLocation");
    openapiFields.add("filedDate");
    openapiFields.add("firstFetchDate");
    openapiFields.add("lastFetchDate");
    openapiFields.add("lastFetchDateWithUpdates");
    openapiFields.add("matchedObjectArray");
    openapiFields.add("object");
    openapiFields.add("participantsLastFetchDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("caseAPI");
    openapiRequiredFields.add("caseId");
    openapiRequiredFields.add("caseName");
    openapiRequiredFields.add("caseNumber");
    openapiRequiredFields.add("caseStatus");
    openapiRequiredFields.add("caseType");
    openapiRequiredFields.add("court");
    openapiRequiredFields.add("courtLocation");
    openapiRequiredFields.add("filedDate");
    openapiRequiredFields.add("firstFetchDate");
    openapiRequiredFields.add("lastFetchDate");
    openapiRequiredFields.add("lastFetchDateWithUpdates");
    openapiRequiredFields.add("matchedObjectArray");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("participantsLastFetchDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CaseSearchResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CaseSearchResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CaseSearchResult is not found in the empty JSON string", CaseSearchResult.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CaseSearchResult.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("caseAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseAPI").toString()));
      }
      if (!jsonObj.get("caseId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseId").toString()));
      }
      if (!jsonObj.get("caseName").isJsonNull() && !jsonObj.get("caseName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseName").toString()));
      }
      if (!jsonObj.get("caseNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseNumber").toString()));
      }
      // validate the required field `caseStatus`
      CaseStatus.validateJsonObject(jsonObj.getAsJsonObject("caseStatus"));
      // validate the required field `caseType`
      CaseType.validateJsonObject(jsonObj.getAsJsonObject("caseType"));
      // validate the required field `court`
      Court.validateJsonObject(jsonObj.getAsJsonObject("court"));
      // validate the required field `courtLocation`
      CourtLocation.validateJsonObject(jsonObj.getAsJsonObject("courtLocation"));
      // ensure the json data is an array
      if (!jsonObj.get("matchedObjectArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchedObjectArray` to be an array in the JSON string but got `%s`", jsonObj.get("matchedObjectArray").toString()));
      }

      JsonArray jsonArraymatchedObjectArray = jsonObj.getAsJsonArray("matchedObjectArray");
      // validate the required field `matchedObjectArray` (array)
      for (int i = 0; i < jsonArraymatchedObjectArray.size(); i++) {
        MatchedObject.validateJsonObject(jsonArraymatchedObjectArray.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CaseSearchResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CaseSearchResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CaseSearchResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CaseSearchResult.class));

       return (TypeAdapter<T>) new TypeAdapter<CaseSearchResult>() {
           @Override
           public void write(JsonWriter out, CaseSearchResult value) throws IOException {
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
           public CaseSearchResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CaseSearchResult instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CaseSearchResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CaseSearchResult
  * @throws IOException if the JSON string is invalid with respect to CaseSearchResult
  */
  public static CaseSearchResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CaseSearchResult.class);
  }

 /**
  * Convert an instance of CaseSearchResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

