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
import com.konfigthis.client.model.CaseSearchResult;
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
 * CaseSearchResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CaseSearchResponse {
  public static final String SERIALIZED_NAME_CASE_SEARCH_ID = "caseSearchId";
  @SerializedName(SERIALIZED_NAME_CASE_SEARCH_ID)
  private String caseSearchId;

  public static final String SERIALIZED_NAME_CASE_SEARCH_RESULT_ARRAY = "caseSearchResultArray";
  @SerializedName(SERIALIZED_NAME_CASE_SEARCH_RESULT_ARRAY)
  private List<CaseSearchResult> caseSearchResultArray = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_PAGE_A_P_I = "nextPageAPI";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_A_P_I)
  private URI nextPageAPI;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "CaseSearchResponse";

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "pageNumber";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  private Integer pageNumber;

  public static final String SERIALIZED_NAME_PREVIOUS_PAGE_A_P_I = "previousPageAPI";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_PAGE_A_P_I)
  private URI previousPageAPI;

  public static final String SERIALIZED_NAME_Q = "q";
  @SerializedName(SERIALIZED_NAME_Q)
  private String q;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "totalPages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Integer totalPages;

  public CaseSearchResponse() {
  }

  public CaseSearchResponse caseSearchId(String caseSearchId) {
    
    
    if (caseSearchId != null && caseSearchId.length() < 18) {
      throw new IllegalArgumentException("Invalid value for caseSearchId. Length must be greater than or equal to 18.");
    }
    
    this.caseSearchId = caseSearchId;
    return this;
  }

   /**
   * Query been sent by client
   * @return caseSearchId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CSRCg78ofjDLzhjRpW", required = true, value = "Query been sent by client")

  public String getCaseSearchId() {
    return caseSearchId;
  }


  public void setCaseSearchId(String caseSearchId) {
    
    
    if (caseSearchId != null && caseSearchId.length() < 18) {
      throw new IllegalArgumentException("Invalid value for caseSearchId. Length must be greater than or equal to 18.");
    }
    this.caseSearchId = caseSearchId;
  }


  public CaseSearchResponse caseSearchResultArray(List<CaseSearchResult> caseSearchResultArray) {
    
    
    
    
    this.caseSearchResultArray = caseSearchResultArray;
    return this;
  }

  public CaseSearchResponse addCaseSearchResultArrayItem(CaseSearchResult caseSearchResultArrayItem) {
    this.caseSearchResultArray.add(caseSearchResultArrayItem);
    return this;
  }

   /**
   * Get caseSearchResultArray
   * @return caseSearchResultArray
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<CaseSearchResult> getCaseSearchResultArray() {
    return caseSearchResultArray;
  }


  public void setCaseSearchResultArray(List<CaseSearchResult> caseSearchResultArray) {
    
    
    
    this.caseSearchResultArray = caseSearchResultArray;
  }


  public CaseSearchResponse nextPageAPI(URI nextPageAPI) {
    
    
    if (nextPageAPI != null && nextPageAPI.length() < 1) {
      throw new IllegalArgumentException("Invalid value for nextPageAPI. Length must be greater than or equal to 1.");
    }
    
    this.nextPageAPI = nextPageAPI;
    return this;
  }

   /**
   * Link to next page.
   * @return nextPageAPI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Link to next page.")

  public URI getNextPageAPI() {
    return nextPageAPI;
  }


  public void setNextPageAPI(URI nextPageAPI) {
    
    
    if (nextPageAPI != null && nextPageAPI.length() < 1) {
      throw new IllegalArgumentException("Invalid value for nextPageAPI. Length must be greater than or equal to 1.");
    }
    this.nextPageAPI = nextPageAPI;
  }


  public CaseSearchResponse _object(String _object) {
    
    
    if (_object != null && _object.length() < 18) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 18.");
    }
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CaseSearchResponse", required = true, value = "")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    if (_object != null && _object.length() < 18) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 18.");
    }
    this._object = _object;
  }


  public CaseSearchResponse pageNumber(Integer pageNumber) {
    
    
    
    
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")

  public Integer getPageNumber() {
    return pageNumber;
  }


  public void setPageNumber(Integer pageNumber) {
    
    
    
    this.pageNumber = pageNumber;
  }


  public CaseSearchResponse previousPageAPI(URI previousPageAPI) {
    
    
    if (previousPageAPI != null && previousPageAPI.length() < 1) {
      throw new IllegalArgumentException("Invalid value for previousPageAPI. Length must be greater than or equal to 1.");
    }
    
    this.previousPageAPI = previousPageAPI;
    return this;
  }

   /**
   * Link to previous page.
   * @return previousPageAPI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Link to previous page.")

  public URI getPreviousPageAPI() {
    return previousPageAPI;
  }


  public void setPreviousPageAPI(URI previousPageAPI) {
    
    
    if (previousPageAPI != null && previousPageAPI.length() < 1) {
      throw new IllegalArgumentException("Invalid value for previousPageAPI. Length must be greater than or equal to 1.");
    }
    this.previousPageAPI = previousPageAPI;
  }


  public CaseSearchResponse q(String q) {
    
    
    if (q != null && q.length() < 3) {
      throw new IllegalArgumentException("Invalid value for q. Length must be greater than or equal to 3.");
    }
    
    this.q = q;
    return this;
  }

   /**
   * Query been sent by client
   * @return q
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "caseId%3A%22CASEgq222a2d1239af%22", required = true, value = "Query been sent by client")

  public String getQ() {
    return q;
  }


  public void setQ(String q) {
    
    
    if (q != null && q.length() < 3) {
      throw new IllegalArgumentException("Invalid value for q. Length must be greater than or equal to 3.");
    }
    this.q = q;
  }


  public CaseSearchResponse totalCount(Integer totalCount) {
    
    
    
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The number of matches that were found in the index.
   * @return totalCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The number of matches that were found in the index.")

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    
    
    
    this.totalCount = totalCount;
  }


  public CaseSearchResponse totalPages(Integer totalPages) {
    
    
    
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Total pages for matches that were found in the index.
   * @return totalPages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Total pages for matches that were found in the index.")

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
   * @return the CaseSearchResponse instance itself
   */
  public CaseSearchResponse putAdditionalProperty(String key, Object value) {
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
    CaseSearchResponse caseSearchResponse = (CaseSearchResponse) o;
    return Objects.equals(this.caseSearchId, caseSearchResponse.caseSearchId) &&
        Objects.equals(this.caseSearchResultArray, caseSearchResponse.caseSearchResultArray) &&
        Objects.equals(this.nextPageAPI, caseSearchResponse.nextPageAPI) &&
        Objects.equals(this._object, caseSearchResponse._object) &&
        Objects.equals(this.pageNumber, caseSearchResponse.pageNumber) &&
        Objects.equals(this.previousPageAPI, caseSearchResponse.previousPageAPI) &&
        Objects.equals(this.q, caseSearchResponse.q) &&
        Objects.equals(this.totalCount, caseSearchResponse.totalCount) &&
        Objects.equals(this.totalPages, caseSearchResponse.totalPages)&&
        Objects.equals(this.additionalProperties, caseSearchResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseSearchId, caseSearchResultArray, nextPageAPI, _object, pageNumber, previousPageAPI, q, totalCount, totalPages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseSearchResponse {\n");
    sb.append("    caseSearchId: ").append(toIndentedString(caseSearchId)).append("\n");
    sb.append("    caseSearchResultArray: ").append(toIndentedString(caseSearchResultArray)).append("\n");
    sb.append("    nextPageAPI: ").append(toIndentedString(nextPageAPI)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    previousPageAPI: ").append(toIndentedString(previousPageAPI)).append("\n");
    sb.append("    q: ").append(toIndentedString(q)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
    openapiFields.add("caseSearchId");
    openapiFields.add("caseSearchResultArray");
    openapiFields.add("nextPageAPI");
    openapiFields.add("object");
    openapiFields.add("pageNumber");
    openapiFields.add("previousPageAPI");
    openapiFields.add("q");
    openapiFields.add("totalCount");
    openapiFields.add("totalPages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("caseSearchId");
    openapiRequiredFields.add("caseSearchResultArray");
    openapiRequiredFields.add("nextPageAPI");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("pageNumber");
    openapiRequiredFields.add("previousPageAPI");
    openapiRequiredFields.add("q");
    openapiRequiredFields.add("totalCount");
    openapiRequiredFields.add("totalPages");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CaseSearchResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CaseSearchResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CaseSearchResponse is not found in the empty JSON string", CaseSearchResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CaseSearchResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("caseSearchId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseSearchId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseSearchId").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("caseSearchResultArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseSearchResultArray` to be an array in the JSON string but got `%s`", jsonObj.get("caseSearchResultArray").toString()));
      }

      JsonArray jsonArraycaseSearchResultArray = jsonObj.getAsJsonArray("caseSearchResultArray");
      // validate the required field `caseSearchResultArray` (array)
      for (int i = 0; i < jsonArraycaseSearchResultArray.size(); i++) {
        CaseSearchResult.validateJsonObject(jsonArraycaseSearchResultArray.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("nextPageAPI").isJsonNull() && !jsonObj.get("nextPageAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageAPI").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if (!jsonObj.get("previousPageAPI").isJsonNull() && !jsonObj.get("previousPageAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previousPageAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previousPageAPI").toString()));
      }
      if (!jsonObj.get("q").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `q` to be a primitive type in the JSON string but got `%s`", jsonObj.get("q").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CaseSearchResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CaseSearchResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CaseSearchResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CaseSearchResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CaseSearchResponse>() {
           @Override
           public void write(JsonWriter out, CaseSearchResponse value) throws IOException {
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
           public CaseSearchResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CaseSearchResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CaseSearchResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CaseSearchResponse
  * @throws IOException if the JSON string is invalid with respect to CaseSearchResponse
  */
  public static CaseSearchResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CaseSearchResponse.class);
  }

 /**
  * Convert an instance of CaseSearchResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

