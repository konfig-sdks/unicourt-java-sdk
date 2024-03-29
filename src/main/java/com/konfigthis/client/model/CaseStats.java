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
 * Count of each entitiy of a case is mentioned here so that you can calculate the number of requests needs to be done to obtain each entity results completely.
 */
@ApiModel(description = "Count of each entitiy of a case is mentioned here so that you can calculate the number of requests needs to be done to obtain each entity results completely.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CaseStats {
  public static final String SERIALIZED_NAME_ALL_CASE_DOCUMENT_COUNT = "allCaseDocumentCount";
  @SerializedName(SERIALIZED_NAME_ALL_CASE_DOCUMENT_COUNT)
  private Integer allCaseDocumentCount;

  public static final String SERIALIZED_NAME_ATTORNEY_COUNT = "attorneyCount";
  @SerializedName(SERIALIZED_NAME_ATTORNEY_COUNT)
  private Integer attorneyCount;

  public static final String SERIALIZED_NAME_CASE_DOCUMENT_IN_LIBRARY_COUNT = "caseDocumentInLibraryCount";
  @SerializedName(SERIALIZED_NAME_CASE_DOCUMENT_IN_LIBRARY_COUNT)
  private Integer caseDocumentInLibraryCount;

  public static final String SERIALIZED_NAME_DOCKET_ENTRY_COUNT = "docketEntryCount";
  @SerializedName(SERIALIZED_NAME_DOCKET_ENTRY_COUNT)
  private Integer docketEntryCount;

  public static final String SERIALIZED_NAME_FREE_CASE_DOCUMENT_COUNT = "freeCaseDocumentCount";
  @SerializedName(SERIALIZED_NAME_FREE_CASE_DOCUMENT_COUNT)
  private Integer freeCaseDocumentCount;

  public static final String SERIALIZED_NAME_HEARING_COUNT = "hearingCount";
  @SerializedName(SERIALIZED_NAME_HEARING_COUNT)
  private Integer hearingCount;

  public static final String SERIALIZED_NAME_JUDGE_COUNT = "judgeCount";
  @SerializedName(SERIALIZED_NAME_JUDGE_COUNT)
  private Integer judgeCount;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "CaseStats";

  public static final String SERIALIZED_NAME_PAID_CASE_DOCUMENT_COUNT = "paidCaseDocumentCount";
  @SerializedName(SERIALIZED_NAME_PAID_CASE_DOCUMENT_COUNT)
  private Integer paidCaseDocumentCount;

  public static final String SERIALIZED_NAME_PARTY_COUNT = "partyCount";
  @SerializedName(SERIALIZED_NAME_PARTY_COUNT)
  private Integer partyCount;

  public static final String SERIALIZED_NAME_RELATED_CASE_COUNT = "relatedCaseCount";
  @SerializedName(SERIALIZED_NAME_RELATED_CASE_COUNT)
  private Integer relatedCaseCount;

  public CaseStats() {
  }

  public CaseStats allCaseDocumentCount(Integer allCaseDocumentCount) {
    
    
    
    
    this.allCaseDocumentCount = allCaseDocumentCount;
    return this;
  }

   /**
   * Count which includes the freeCaseDocumentCount and paidCaseDocumentCount.
   * @return allCaseDocumentCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "379", required = true, value = "Count which includes the freeCaseDocumentCount and paidCaseDocumentCount.")

  public Integer getAllCaseDocumentCount() {
    return allCaseDocumentCount;
  }


  public void setAllCaseDocumentCount(Integer allCaseDocumentCount) {
    
    
    
    this.allCaseDocumentCount = allCaseDocumentCount;
  }


  public CaseStats attorneyCount(Integer attorneyCount) {
    
    
    
    
    this.attorneyCount = attorneyCount;
    return this;
  }

   /**
   * Count of number of attornies available in the case being requested for.
   * @return attorneyCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "232", required = true, value = "Count of number of attornies available in the case being requested for.")

  public Integer getAttorneyCount() {
    return attorneyCount;
  }


  public void setAttorneyCount(Integer attorneyCount) {
    
    
    
    this.attorneyCount = attorneyCount;
  }


  public CaseStats caseDocumentInLibraryCount(Integer caseDocumentInLibraryCount) {
    
    
    
    
    this.caseDocumentInLibraryCount = caseDocumentInLibraryCount;
    return this;
  }

   /**
   * Count of number of documents that are available in the UniCourt CrowdSourced Library for the case being requested for.
   * @return caseDocumentInLibraryCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "13", required = true, value = "Count of number of documents that are available in the UniCourt CrowdSourced Library for the case being requested for.")

  public Integer getCaseDocumentInLibraryCount() {
    return caseDocumentInLibraryCount;
  }


  public void setCaseDocumentInLibraryCount(Integer caseDocumentInLibraryCount) {
    
    
    
    this.caseDocumentInLibraryCount = caseDocumentInLibraryCount;
  }


  public CaseStats docketEntryCount(Integer docketEntryCount) {
    
    
    
    
    this.docketEntryCount = docketEntryCount;
    return this;
  }

   /**
   * Count of number of docket entries available in the case being requested for.
   * @return docketEntryCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8503", required = true, value = "Count of number of docket entries available in the case being requested for.")

  public Integer getDocketEntryCount() {
    return docketEntryCount;
  }


  public void setDocketEntryCount(Integer docketEntryCount) {
    
    
    
    this.docketEntryCount = docketEntryCount;
  }


  public CaseStats freeCaseDocumentCount(Integer freeCaseDocumentCount) {
    
    
    
    
    this.freeCaseDocumentCount = freeCaseDocumentCount;
    return this;
  }

   /**
   * Count of number of free documents available in the case being requested for.
   * @return freeCaseDocumentCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "254", required = true, value = "Count of number of free documents available in the case being requested for.")

  public Integer getFreeCaseDocumentCount() {
    return freeCaseDocumentCount;
  }


  public void setFreeCaseDocumentCount(Integer freeCaseDocumentCount) {
    
    
    
    this.freeCaseDocumentCount = freeCaseDocumentCount;
  }


  public CaseStats hearingCount(Integer hearingCount) {
    
    
    
    
    this.hearingCount = hearingCount;
    return this;
  }

   /**
   * Count of number of hearings available in the case being requested for.
   * @return hearingCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "Count of number of hearings available in the case being requested for.")

  public Integer getHearingCount() {
    return hearingCount;
  }


  public void setHearingCount(Integer hearingCount) {
    
    
    
    this.hearingCount = hearingCount;
  }


  public CaseStats judgeCount(Integer judgeCount) {
    
    
    
    
    this.judgeCount = judgeCount;
    return this;
  }

   /**
   * Count of number of judges available in the case being requested for.
   * @return judgeCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Count of number of judges available in the case being requested for.")

  public Integer getJudgeCount() {
    return judgeCount;
  }


  public void setJudgeCount(Integer judgeCount) {
    
    
    
    this.judgeCount = judgeCount;
  }


  public CaseStats _object(String _object) {
    
    
    if (_object != null && _object.length() < 9) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 9.");
    }
    
    this._object = _object;
    return this;
  }

   /**
   * Name of the object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CaseStats", required = true, value = "Name of the object")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    if (_object != null && _object.length() < 9) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 9.");
    }
    this._object = _object;
  }


  public CaseStats paidCaseDocumentCount(Integer paidCaseDocumentCount) {
    
    
    
    
    this.paidCaseDocumentCount = paidCaseDocumentCount;
    return this;
  }

   /**
   * Count of number of paid documents available in the case being requested for.
   * @return paidCaseDocumentCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "125", required = true, value = "Count of number of paid documents available in the case being requested for.")

  public Integer getPaidCaseDocumentCount() {
    return paidCaseDocumentCount;
  }


  public void setPaidCaseDocumentCount(Integer paidCaseDocumentCount) {
    
    
    
    this.paidCaseDocumentCount = paidCaseDocumentCount;
  }


  public CaseStats partyCount(Integer partyCount) {
    
    
    
    
    this.partyCount = partyCount;
    return this;
  }

   /**
   * Count of number of parties available in the case being requested for.
   * @return partyCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "860", required = true, value = "Count of number of parties available in the case being requested for.")

  public Integer getPartyCount() {
    return partyCount;
  }


  public void setPartyCount(Integer partyCount) {
    
    
    
    this.partyCount = partyCount;
  }


  public CaseStats relatedCaseCount(Integer relatedCaseCount) {
    
    
    
    
    this.relatedCaseCount = relatedCaseCount;
    return this;
  }

   /**
   * Count of related cases that are available in the case being requested.
   * @return relatedCaseCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Count of related cases that are available in the case being requested.")

  public Integer getRelatedCaseCount() {
    return relatedCaseCount;
  }


  public void setRelatedCaseCount(Integer relatedCaseCount) {
    
    
    
    this.relatedCaseCount = relatedCaseCount;
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
   * @return the CaseStats instance itself
   */
  public CaseStats putAdditionalProperty(String key, Object value) {
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
    CaseStats caseStats = (CaseStats) o;
    return Objects.equals(this.allCaseDocumentCount, caseStats.allCaseDocumentCount) &&
        Objects.equals(this.attorneyCount, caseStats.attorneyCount) &&
        Objects.equals(this.caseDocumentInLibraryCount, caseStats.caseDocumentInLibraryCount) &&
        Objects.equals(this.docketEntryCount, caseStats.docketEntryCount) &&
        Objects.equals(this.freeCaseDocumentCount, caseStats.freeCaseDocumentCount) &&
        Objects.equals(this.hearingCount, caseStats.hearingCount) &&
        Objects.equals(this.judgeCount, caseStats.judgeCount) &&
        Objects.equals(this._object, caseStats._object) &&
        Objects.equals(this.paidCaseDocumentCount, caseStats.paidCaseDocumentCount) &&
        Objects.equals(this.partyCount, caseStats.partyCount) &&
        Objects.equals(this.relatedCaseCount, caseStats.relatedCaseCount)&&
        Objects.equals(this.additionalProperties, caseStats.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allCaseDocumentCount, attorneyCount, caseDocumentInLibraryCount, docketEntryCount, freeCaseDocumentCount, hearingCount, judgeCount, _object, paidCaseDocumentCount, partyCount, relatedCaseCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseStats {\n");
    sb.append("    allCaseDocumentCount: ").append(toIndentedString(allCaseDocumentCount)).append("\n");
    sb.append("    attorneyCount: ").append(toIndentedString(attorneyCount)).append("\n");
    sb.append("    caseDocumentInLibraryCount: ").append(toIndentedString(caseDocumentInLibraryCount)).append("\n");
    sb.append("    docketEntryCount: ").append(toIndentedString(docketEntryCount)).append("\n");
    sb.append("    freeCaseDocumentCount: ").append(toIndentedString(freeCaseDocumentCount)).append("\n");
    sb.append("    hearingCount: ").append(toIndentedString(hearingCount)).append("\n");
    sb.append("    judgeCount: ").append(toIndentedString(judgeCount)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    paidCaseDocumentCount: ").append(toIndentedString(paidCaseDocumentCount)).append("\n");
    sb.append("    partyCount: ").append(toIndentedString(partyCount)).append("\n");
    sb.append("    relatedCaseCount: ").append(toIndentedString(relatedCaseCount)).append("\n");
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
    openapiFields.add("allCaseDocumentCount");
    openapiFields.add("attorneyCount");
    openapiFields.add("caseDocumentInLibraryCount");
    openapiFields.add("docketEntryCount");
    openapiFields.add("freeCaseDocumentCount");
    openapiFields.add("hearingCount");
    openapiFields.add("judgeCount");
    openapiFields.add("object");
    openapiFields.add("paidCaseDocumentCount");
    openapiFields.add("partyCount");
    openapiFields.add("relatedCaseCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("allCaseDocumentCount");
    openapiRequiredFields.add("attorneyCount");
    openapiRequiredFields.add("caseDocumentInLibraryCount");
    openapiRequiredFields.add("docketEntryCount");
    openapiRequiredFields.add("freeCaseDocumentCount");
    openapiRequiredFields.add("hearingCount");
    openapiRequiredFields.add("judgeCount");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("paidCaseDocumentCount");
    openapiRequiredFields.add("partyCount");
    openapiRequiredFields.add("relatedCaseCount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CaseStats
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CaseStats.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CaseStats is not found in the empty JSON string", CaseStats.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CaseStats.openapiRequiredFields) {
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
       if (!CaseStats.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CaseStats' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CaseStats> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CaseStats.class));

       return (TypeAdapter<T>) new TypeAdapter<CaseStats>() {
           @Override
           public void write(JsonWriter out, CaseStats value) throws IOException {
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
           public CaseStats read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CaseStats instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CaseStats given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CaseStats
  * @throws IOException if the JSON string is invalid with respect to CaseStats
  */
  public static CaseStats fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CaseStats.class);
  }

 /**
  * Convert an instance of CaseStats to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

