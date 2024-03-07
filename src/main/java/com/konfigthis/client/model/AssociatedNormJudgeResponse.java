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
import com.konfigthis.client.model.AssociatedNormJudge;
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
 * AssociatedNormJudgeResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AssociatedNormJudgeResponse {
  public static final String SERIALIZED_NAME_ASSOCIATED_NORM_JUDGE_ARRAY = "associatedNormJudgeArray";
  @SerializedName(SERIALIZED_NAME_ASSOCIATED_NORM_JUDGE_ARRAY)
  private List<AssociatedNormJudge> associatedNormJudgeArray = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_PAGE_A_P_I = "nextPageAPI";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_A_P_I)
  private URI nextPageAPI;

  public static final String SERIALIZED_NAME_PREVIOUS_PAGE_A_P_I = "previousPageAPI";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_PAGE_A_P_I)
  private URI previousPageAPI;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "totalPages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Integer totalPages;

  public AssociatedNormJudgeResponse() {
  }

  public AssociatedNormJudgeResponse associatedNormJudgeArray(List<AssociatedNormJudge> associatedNormJudgeArray) {
    
    
    
    
    this.associatedNormJudgeArray = associatedNormJudgeArray;
    return this;
  }

  public AssociatedNormJudgeResponse addAssociatedNormJudgeArrayItem(AssociatedNormJudge associatedNormJudgeArrayItem) {
    this.associatedNormJudgeArray.add(associatedNormJudgeArrayItem);
    return this;
  }

   /**
   * Get associatedNormJudgeArray
   * @return associatedNormJudgeArray
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<AssociatedNormJudge> getAssociatedNormJudgeArray() {
    return associatedNormJudgeArray;
  }


  public void setAssociatedNormJudgeArray(List<AssociatedNormJudge> associatedNormJudgeArray) {
    
    
    
    this.associatedNormJudgeArray = associatedNormJudgeArray;
  }


  public AssociatedNormJudgeResponse nextPageAPI(URI nextPageAPI) {
    
    
    
    
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


  public AssociatedNormJudgeResponse previousPageAPI(URI previousPageAPI) {
    
    
    
    
    this.previousPageAPI = previousPageAPI;
    return this;
  }

   /**
   * Previous page of results if applicable.
   * @return previousPageAPI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Previous page of results if applicable.")

  public URI getPreviousPageAPI() {
    return previousPageAPI;
  }


  public void setPreviousPageAPI(URI previousPageAPI) {
    
    
    
    this.previousPageAPI = previousPageAPI;
  }


  public AssociatedNormJudgeResponse totalCount(Integer totalCount) {
    
    
    
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total no. of results for this criteria.
   * @return totalCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Total no. of results for this criteria.")

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    
    
    
    this.totalCount = totalCount;
  }


  public AssociatedNormJudgeResponse totalPages(Integer totalPages) {
    
    
    
    
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
   * @return the AssociatedNormJudgeResponse instance itself
   */
  public AssociatedNormJudgeResponse putAdditionalProperty(String key, Object value) {
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
    AssociatedNormJudgeResponse associatedNormJudgeResponse = (AssociatedNormJudgeResponse) o;
    return Objects.equals(this.associatedNormJudgeArray, associatedNormJudgeResponse.associatedNormJudgeArray) &&
        Objects.equals(this.nextPageAPI, associatedNormJudgeResponse.nextPageAPI) &&
        Objects.equals(this.previousPageAPI, associatedNormJudgeResponse.previousPageAPI) &&
        Objects.equals(this.totalCount, associatedNormJudgeResponse.totalCount) &&
        Objects.equals(this.totalPages, associatedNormJudgeResponse.totalPages)&&
        Objects.equals(this.additionalProperties, associatedNormJudgeResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedNormJudgeArray, nextPageAPI, previousPageAPI, totalCount, totalPages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociatedNormJudgeResponse {\n");
    sb.append("    associatedNormJudgeArray: ").append(toIndentedString(associatedNormJudgeArray)).append("\n");
    sb.append("    nextPageAPI: ").append(toIndentedString(nextPageAPI)).append("\n");
    sb.append("    previousPageAPI: ").append(toIndentedString(previousPageAPI)).append("\n");
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
    openapiFields.add("associatedNormJudgeArray");
    openapiFields.add("nextPageAPI");
    openapiFields.add("previousPageAPI");
    openapiFields.add("totalCount");
    openapiFields.add("totalPages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("associatedNormJudgeArray");
    openapiRequiredFields.add("nextPageAPI");
    openapiRequiredFields.add("previousPageAPI");
    openapiRequiredFields.add("totalCount");
    openapiRequiredFields.add("totalPages");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AssociatedNormJudgeResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AssociatedNormJudgeResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssociatedNormJudgeResponse is not found in the empty JSON string", AssociatedNormJudgeResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AssociatedNormJudgeResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("associatedNormJudgeArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `associatedNormJudgeArray` to be an array in the JSON string but got `%s`", jsonObj.get("associatedNormJudgeArray").toString()));
      }

      JsonArray jsonArrayassociatedNormJudgeArray = jsonObj.getAsJsonArray("associatedNormJudgeArray");
      // validate the required field `associatedNormJudgeArray` (array)
      for (int i = 0; i < jsonArrayassociatedNormJudgeArray.size(); i++) {
        AssociatedNormJudge.validateJsonObject(jsonArrayassociatedNormJudgeArray.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("nextPageAPI").isJsonNull() && !jsonObj.get("nextPageAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageAPI").toString()));
      }
      if (!jsonObj.get("previousPageAPI").isJsonNull() && !jsonObj.get("previousPageAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `previousPageAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("previousPageAPI").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssociatedNormJudgeResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssociatedNormJudgeResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssociatedNormJudgeResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssociatedNormJudgeResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AssociatedNormJudgeResponse>() {
           @Override
           public void write(JsonWriter out, AssociatedNormJudgeResponse value) throws IOException {
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
           public AssociatedNormJudgeResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AssociatedNormJudgeResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AssociatedNormJudgeResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssociatedNormJudgeResponse
  * @throws IOException if the JSON string is invalid with respect to AssociatedNormJudgeResponse
  */
  public static AssociatedNormJudgeResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssociatedNormJudgeResponse.class);
  }

 /**
  * Convert an instance of AssociatedNormJudgeResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

