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
import com.konfigthis.client.model.CaseCountAnalyticsByNormJudge;
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
 * CaseCountAnalyticsByNormJudgeResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CaseCountAnalyticsByNormJudgeResponse {
  public static final String SERIALIZED_NAME_NEXT_PAGE_A_P_I = "nextPageAPI";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_A_P_I)
  private URI nextPageAPI;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "CaseCountAnalyticsByNormJudgeResponse";

  public static final String SERIALIZED_NAME_PREVIOUS_PAGE_A_P_I = "previousPageAPI";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_PAGE_A_P_I)
  private URI previousPageAPI;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<CaseCountAnalyticsByNormJudge> results = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_CASE_COUNT = "totalCaseCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_CASE_COUNT)
  private Integer totalCaseCount;

  public static final String SERIALIZED_NAME_TOTAL_NORM_JUDGE_COUNT = "totalNormJudgeCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_NORM_JUDGE_COUNT)
  private Integer totalNormJudgeCount;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "totalPages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Integer totalPages;

  public CaseCountAnalyticsByNormJudgeResponse() {
  }

  public CaseCountAnalyticsByNormJudgeResponse nextPageAPI(URI nextPageAPI) {
    
    
    
    
    this.nextPageAPI = nextPageAPI;
    return this;
  }

   /**
   * Next page of results if applicable.
   * @return nextPageAPI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Next page of results if applicable.")

  public URI getNextPageAPI() {
    return nextPageAPI;
  }


  public void setNextPageAPI(URI nextPageAPI) {
    
    
    
    this.nextPageAPI = nextPageAPI;
  }


  public CaseCountAnalyticsByNormJudgeResponse _object(String _object) {
    
    
    
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CaseCountAnalyticsByNormJudgeResponse", required = true, value = "")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    
    this._object = _object;
  }


  public CaseCountAnalyticsByNormJudgeResponse previousPageAPI(URI previousPageAPI) {
    
    
    
    
    this.previousPageAPI = previousPageAPI;
    return this;
  }

   /**
   * Link to previous page of results.
   * @return previousPageAPI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Link to previous page of results.")

  public URI getPreviousPageAPI() {
    return previousPageAPI;
  }


  public void setPreviousPageAPI(URI previousPageAPI) {
    
    
    
    this.previousPageAPI = previousPageAPI;
  }


  public CaseCountAnalyticsByNormJudgeResponse results(List<CaseCountAnalyticsByNormJudge> results) {
    
    
    
    
    this.results = results;
    return this;
  }

  public CaseCountAnalyticsByNormJudgeResponse addResultsItem(CaseCountAnalyticsByNormJudge resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<CaseCountAnalyticsByNormJudge> getResults() {
    return results;
  }


  public void setResults(List<CaseCountAnalyticsByNormJudge> results) {
    
    
    
    this.results = results;
  }


  public CaseCountAnalyticsByNormJudgeResponse totalCaseCount(Integer totalCaseCount) {
    
    
    
    
    this.totalCaseCount = totalCaseCount;
    return this;
  }

   /**
   * Total no. of Cases for this criteria.
   * @return totalCaseCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Total no. of Cases for this criteria.")

  public Integer getTotalCaseCount() {
    return totalCaseCount;
  }


  public void setTotalCaseCount(Integer totalCaseCount) {
    
    
    
    this.totalCaseCount = totalCaseCount;
  }


  public CaseCountAnalyticsByNormJudgeResponse totalNormJudgeCount(Integer totalNormJudgeCount) {
    
    
    
    
    this.totalNormJudgeCount = totalNormJudgeCount;
    return this;
  }

   /**
   * Total no. of NormJudge for this criteria.
   * @return totalNormJudgeCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Total no. of NormJudge for this criteria.")

  public Integer getTotalNormJudgeCount() {
    return totalNormJudgeCount;
  }


  public void setTotalNormJudgeCount(Integer totalNormJudgeCount) {
    
    
    
    this.totalNormJudgeCount = totalNormJudgeCount;
  }


  public CaseCountAnalyticsByNormJudgeResponse totalPages(Integer totalPages) {
    
    
    
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Total no. of pages.
   * @return totalPages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Total no. of pages.")

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
   * @return the CaseCountAnalyticsByNormJudgeResponse instance itself
   */
  public CaseCountAnalyticsByNormJudgeResponse putAdditionalProperty(String key, Object value) {
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
    CaseCountAnalyticsByNormJudgeResponse caseCountAnalyticsByNormJudgeResponse = (CaseCountAnalyticsByNormJudgeResponse) o;
    return Objects.equals(this.nextPageAPI, caseCountAnalyticsByNormJudgeResponse.nextPageAPI) &&
        Objects.equals(this._object, caseCountAnalyticsByNormJudgeResponse._object) &&
        Objects.equals(this.previousPageAPI, caseCountAnalyticsByNormJudgeResponse.previousPageAPI) &&
        Objects.equals(this.results, caseCountAnalyticsByNormJudgeResponse.results) &&
        Objects.equals(this.totalCaseCount, caseCountAnalyticsByNormJudgeResponse.totalCaseCount) &&
        Objects.equals(this.totalNormJudgeCount, caseCountAnalyticsByNormJudgeResponse.totalNormJudgeCount) &&
        Objects.equals(this.totalPages, caseCountAnalyticsByNormJudgeResponse.totalPages)&&
        Objects.equals(this.additionalProperties, caseCountAnalyticsByNormJudgeResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageAPI, _object, previousPageAPI, results, totalCaseCount, totalNormJudgeCount, totalPages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseCountAnalyticsByNormJudgeResponse {\n");
    sb.append("    nextPageAPI: ").append(toIndentedString(nextPageAPI)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    previousPageAPI: ").append(toIndentedString(previousPageAPI)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    totalCaseCount: ").append(toIndentedString(totalCaseCount)).append("\n");
    sb.append("    totalNormJudgeCount: ").append(toIndentedString(totalNormJudgeCount)).append("\n");
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
    openapiFields.add("nextPageAPI");
    openapiFields.add("object");
    openapiFields.add("previousPageAPI");
    openapiFields.add("results");
    openapiFields.add("totalCaseCount");
    openapiFields.add("totalNormJudgeCount");
    openapiFields.add("totalPages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("nextPageAPI");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("previousPageAPI");
    openapiRequiredFields.add("results");
    openapiRequiredFields.add("totalCaseCount");
    openapiRequiredFields.add("totalNormJudgeCount");
    openapiRequiredFields.add("totalPages");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CaseCountAnalyticsByNormJudgeResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CaseCountAnalyticsByNormJudgeResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CaseCountAnalyticsByNormJudgeResponse is not found in the empty JSON string", CaseCountAnalyticsByNormJudgeResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CaseCountAnalyticsByNormJudgeResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("nextPageAPI").isJsonNull() && !jsonObj.get("nextPageAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageAPI").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if (!jsonObj.get("previousPageAPI").isJsonNull() && !jsonObj.get("previousPageAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previousPageAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previousPageAPI").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("results").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
      }

      JsonArray jsonArrayresults = jsonObj.getAsJsonArray("results");
      // validate the required field `results` (array)
      for (int i = 0; i < jsonArrayresults.size(); i++) {
        CaseCountAnalyticsByNormJudge.validateJsonObject(jsonArrayresults.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CaseCountAnalyticsByNormJudgeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CaseCountAnalyticsByNormJudgeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CaseCountAnalyticsByNormJudgeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CaseCountAnalyticsByNormJudgeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CaseCountAnalyticsByNormJudgeResponse>() {
           @Override
           public void write(JsonWriter out, CaseCountAnalyticsByNormJudgeResponse value) throws IOException {
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
           public CaseCountAnalyticsByNormJudgeResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CaseCountAnalyticsByNormJudgeResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CaseCountAnalyticsByNormJudgeResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CaseCountAnalyticsByNormJudgeResponse
  * @throws IOException if the JSON string is invalid with respect to CaseCountAnalyticsByNormJudgeResponse
  */
  public static CaseCountAnalyticsByNormJudgeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CaseCountAnalyticsByNormJudgeResponse.class);
  }

 /**
  * Convert an instance of CaseCountAnalyticsByNormJudgeResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

