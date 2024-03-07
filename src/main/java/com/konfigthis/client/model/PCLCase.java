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
import com.konfigthis.client.model.PACERCaseSearchResults;
import com.konfigthis.client.model.PACERSearchPageInfo;
import com.konfigthis.client.model.PACERSearchReceipt;
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
 * PCLCase
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PCLCase {
  public static final String SERIALIZED_NAME_NEXT_PAGE_A_P_I = "nextPageAPI";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_A_P_I)
  private String nextPageAPI;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "PCLCase";

  public static final String SERIALIZED_NAME_PACER_PAGE_INFO = "pacerPageInfo";
  @SerializedName(SERIALIZED_NAME_PACER_PAGE_INFO)
  private PACERSearchPageInfo pacerPageInfo;

  public static final String SERIALIZED_NAME_PACER_RECEIPT = "pacerReceipt";
  @SerializedName(SERIALIZED_NAME_PACER_RECEIPT)
  private PACERSearchReceipt pacerReceipt;

  public static final String SERIALIZED_NAME_PACER_SEARCH_RESULTS_ARRAY = "pacerSearchResultsArray";
  @SerializedName(SERIALIZED_NAME_PACER_SEARCH_RESULTS_ARRAY)
  private List<PACERCaseSearchResults> pacerSearchResultsArray = new ArrayList<>();

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "pageNumber";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  private Integer pageNumber;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "totalPages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Integer totalPages;

  public PCLCase() {
  }

  public PCLCase nextPageAPI(String nextPageAPI) {
    
    
    
    
    this.nextPageAPI = nextPageAPI;
    return this;
  }

   /**
   * Link to next page of the PCL Search Results.
   * @return nextPageAPI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://enterpriseapi.unicourt.com/pacerCaseLocator/partySearch/civilCourts?pageNumber=2&jobId=PCLJ3Ygn4ooAvNenww", required = true, value = "Link to next page of the PCL Search Results.")

  public String getNextPageAPI() {
    return nextPageAPI;
  }


  public void setNextPageAPI(String nextPageAPI) {
    
    
    
    this.nextPageAPI = nextPageAPI;
  }


  public PCLCase _object(String _object) {
    
    
    if (_object != null && _object.length() < 7) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 7.");
    }
    
    this._object = _object;
    return this;
  }

   /**
   * Name of the object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "PCLCase", required = true, value = "Name of the object")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    if (_object != null && _object.length() < 7) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 7.");
    }
    this._object = _object;
  }


  public PCLCase pacerPageInfo(PACERSearchPageInfo pacerPageInfo) {
    
    
    
    
    this.pacerPageInfo = pacerPageInfo;
    return this;
  }

   /**
   * Get pacerPageInfo
   * @return pacerPageInfo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PACERSearchPageInfo getPacerPageInfo() {
    return pacerPageInfo;
  }


  public void setPacerPageInfo(PACERSearchPageInfo pacerPageInfo) {
    
    
    
    this.pacerPageInfo = pacerPageInfo;
  }


  public PCLCase pacerReceipt(PACERSearchReceipt pacerReceipt) {
    
    
    
    
    this.pacerReceipt = pacerReceipt;
    return this;
  }

   /**
   * Get pacerReceipt
   * @return pacerReceipt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PACERSearchReceipt getPacerReceipt() {
    return pacerReceipt;
  }


  public void setPacerReceipt(PACERSearchReceipt pacerReceipt) {
    
    
    
    this.pacerReceipt = pacerReceipt;
  }


  public PCLCase pacerSearchResultsArray(List<PACERCaseSearchResults> pacerSearchResultsArray) {
    
    
    
    
    this.pacerSearchResultsArray = pacerSearchResultsArray;
    return this;
  }

  public PCLCase addPacerSearchResultsArrayItem(PACERCaseSearchResults pacerSearchResultsArrayItem) {
    this.pacerSearchResultsArray.add(pacerSearchResultsArrayItem);
    return this;
  }

   /**
   * Get pacerSearchResultsArray
   * @return pacerSearchResultsArray
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<PACERCaseSearchResults> getPacerSearchResultsArray() {
    return pacerSearchResultsArray;
  }


  public void setPacerSearchResultsArray(List<PACERCaseSearchResults> pacerSearchResultsArray) {
    
    
    
    this.pacerSearchResultsArray = pacerSearchResultsArray;
  }


  public PCLCase pageNumber(Integer pageNumber) {
    
    
    
    
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Page number for which results where obtained.
   * @return pageNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Page number for which results where obtained.")

  public Integer getPageNumber() {
    return pageNumber;
  }


  public void setPageNumber(Integer pageNumber) {
    
    
    
    this.pageNumber = pageNumber;
  }


  public PCLCase totalCount(Integer totalCount) {
    
    
    
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total number of records available for this Search.
   * @return totalCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "125", required = true, value = "Total number of records available for this Search.")

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    
    
    
    this.totalCount = totalCount;
  }


  public PCLCase totalPages(Integer totalPages) {
    
    
    
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Total number of pages to obtain all the objects the current PCL Search.
   * @return totalPages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "Total number of pages to obtain all the objects the current PCL Search.")

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
   * @return the PCLCase instance itself
   */
  public PCLCase putAdditionalProperty(String key, Object value) {
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
    PCLCase pcLCase = (PCLCase) o;
    return Objects.equals(this.nextPageAPI, pcLCase.nextPageAPI) &&
        Objects.equals(this._object, pcLCase._object) &&
        Objects.equals(this.pacerPageInfo, pcLCase.pacerPageInfo) &&
        Objects.equals(this.pacerReceipt, pcLCase.pacerReceipt) &&
        Objects.equals(this.pacerSearchResultsArray, pcLCase.pacerSearchResultsArray) &&
        Objects.equals(this.pageNumber, pcLCase.pageNumber) &&
        Objects.equals(this.totalCount, pcLCase.totalCount) &&
        Objects.equals(this.totalPages, pcLCase.totalPages)&&
        Objects.equals(this.additionalProperties, pcLCase.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageAPI, _object, pacerPageInfo, pacerReceipt, pacerSearchResultsArray, pageNumber, totalCount, totalPages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PCLCase {\n");
    sb.append("    nextPageAPI: ").append(toIndentedString(nextPageAPI)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    pacerPageInfo: ").append(toIndentedString(pacerPageInfo)).append("\n");
    sb.append("    pacerReceipt: ").append(toIndentedString(pacerReceipt)).append("\n");
    sb.append("    pacerSearchResultsArray: ").append(toIndentedString(pacerSearchResultsArray)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
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
    openapiFields.add("nextPageAPI");
    openapiFields.add("object");
    openapiFields.add("pacerPageInfo");
    openapiFields.add("pacerReceipt");
    openapiFields.add("pacerSearchResultsArray");
    openapiFields.add("pageNumber");
    openapiFields.add("totalCount");
    openapiFields.add("totalPages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("nextPageAPI");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("pacerPageInfo");
    openapiRequiredFields.add("pacerReceipt");
    openapiRequiredFields.add("pacerSearchResultsArray");
    openapiRequiredFields.add("pageNumber");
    openapiRequiredFields.add("totalCount");
    openapiRequiredFields.add("totalPages");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PCLCase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PCLCase.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PCLCase is not found in the empty JSON string", PCLCase.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PCLCase.openapiRequiredFields) {
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
      // validate the required field `pacerPageInfo`
      PACERSearchPageInfo.validateJsonObject(jsonObj.getAsJsonObject("pacerPageInfo"));
      // validate the required field `pacerReceipt`
      PACERSearchReceipt.validateJsonObject(jsonObj.getAsJsonObject("pacerReceipt"));
      // ensure the json data is an array
      if (!jsonObj.get("pacerSearchResultsArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pacerSearchResultsArray` to be an array in the JSON string but got `%s`", jsonObj.get("pacerSearchResultsArray").toString()));
      }

      JsonArray jsonArraypacerSearchResultsArray = jsonObj.getAsJsonArray("pacerSearchResultsArray");
      // validate the required field `pacerSearchResultsArray` (array)
      for (int i = 0; i < jsonArraypacerSearchResultsArray.size(); i++) {
        PACERCaseSearchResults.validateJsonObject(jsonArraypacerSearchResultsArray.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PCLCase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PCLCase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PCLCase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PCLCase.class));

       return (TypeAdapter<T>) new TypeAdapter<PCLCase>() {
           @Override
           public void write(JsonWriter out, PCLCase value) throws IOException {
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
           public PCLCase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PCLCase instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PCLCase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PCLCase
  * @throws IOException if the JSON string is invalid with respect to PCLCase
  */
  public static PCLCase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PCLCase.class);
  }

 /**
  * Convert an instance of PCLCase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

