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
import com.konfigthis.client.model.AreaOfLaw;
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
 * AreaOfLawResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AreaOfLawResponse {
  public static final String SERIALIZED_NAME_AREA_OF_LAW_ARRAY = "areaOfLawArray";
  @SerializedName(SERIALIZED_NAME_AREA_OF_LAW_ARRAY)
  private List<AreaOfLaw> areaOfLawArray = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_PAGE_A_P_I = "nextPageAPI";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_A_P_I)
  private URI nextPageAPI;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "AreaOfLawResponse";

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "pageNumber";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  private Integer pageNumber;

  public static final String SERIALIZED_NAME_PREVIOUS_PAGE_A_P_I = "previousPageAPI";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_PAGE_A_P_I)
  private URI previousPageAPI;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "totalPages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Integer totalPages;

  public AreaOfLawResponse() {
  }

  public AreaOfLawResponse areaOfLawArray(List<AreaOfLaw> areaOfLawArray) {
    
    
    
    
    this.areaOfLawArray = areaOfLawArray;
    return this;
  }

  public AreaOfLawResponse addAreaOfLawArrayItem(AreaOfLaw areaOfLawArrayItem) {
    this.areaOfLawArray.add(areaOfLawArrayItem);
    return this;
  }

   /**
   * Get areaOfLawArray
   * @return areaOfLawArray
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<AreaOfLaw> getAreaOfLawArray() {
    return areaOfLawArray;
  }


  public void setAreaOfLawArray(List<AreaOfLaw> areaOfLawArray) {
    
    
    
    this.areaOfLawArray = areaOfLawArray;
  }


  public AreaOfLawResponse nextPageAPI(URI nextPageAPI) {
    
    
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


  public AreaOfLawResponse _object(String _object) {
    
    
    if (_object != null && _object.length() < 17) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 17.");
    }
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "AreaOfLawResponse", required = true, value = "")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    if (_object != null && _object.length() < 17) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 17.");
    }
    this._object = _object;
  }


  public AreaOfLawResponse pageNumber(Integer pageNumber) {
    
    
    
    
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


  public AreaOfLawResponse previousPageAPI(URI previousPageAPI) {
    
    
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


  public AreaOfLawResponse totalCount(Integer totalCount) {
    
    
    
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total number of matches found.
   * @return totalCount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Total number of matches found.")

  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    
    
    
    this.totalCount = totalCount;
  }


  public AreaOfLawResponse totalPages(Integer totalPages) {
    
    
    
    
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Total number of pages to obtain all the objects.
   * @return totalPages
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Total number of pages to obtain all the objects.")

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
   * @return the AreaOfLawResponse instance itself
   */
  public AreaOfLawResponse putAdditionalProperty(String key, Object value) {
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
    AreaOfLawResponse areaOfLawResponse = (AreaOfLawResponse) o;
    return Objects.equals(this.areaOfLawArray, areaOfLawResponse.areaOfLawArray) &&
        Objects.equals(this.nextPageAPI, areaOfLawResponse.nextPageAPI) &&
        Objects.equals(this._object, areaOfLawResponse._object) &&
        Objects.equals(this.pageNumber, areaOfLawResponse.pageNumber) &&
        Objects.equals(this.previousPageAPI, areaOfLawResponse.previousPageAPI) &&
        Objects.equals(this.totalCount, areaOfLawResponse.totalCount) &&
        Objects.equals(this.totalPages, areaOfLawResponse.totalPages)&&
        Objects.equals(this.additionalProperties, areaOfLawResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaOfLawArray, nextPageAPI, _object, pageNumber, previousPageAPI, totalCount, totalPages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AreaOfLawResponse {\n");
    sb.append("    areaOfLawArray: ").append(toIndentedString(areaOfLawArray)).append("\n");
    sb.append("    nextPageAPI: ").append(toIndentedString(nextPageAPI)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
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
    openapiFields.add("areaOfLawArray");
    openapiFields.add("nextPageAPI");
    openapiFields.add("object");
    openapiFields.add("pageNumber");
    openapiFields.add("previousPageAPI");
    openapiFields.add("totalCount");
    openapiFields.add("totalPages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("areaOfLawArray");
    openapiRequiredFields.add("nextPageAPI");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("pageNumber");
    openapiRequiredFields.add("previousPageAPI");
    openapiRequiredFields.add("totalCount");
    openapiRequiredFields.add("totalPages");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AreaOfLawResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AreaOfLawResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AreaOfLawResponse is not found in the empty JSON string", AreaOfLawResponse.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AreaOfLawResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("areaOfLawArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `areaOfLawArray` to be an array in the JSON string but got `%s`", jsonObj.get("areaOfLawArray").toString()));
      }

      JsonArray jsonArrayareaOfLawArray = jsonObj.getAsJsonArray("areaOfLawArray");
      // validate the required field `areaOfLawArray` (array)
      for (int i = 0; i < jsonArrayareaOfLawArray.size(); i++) {
        AreaOfLaw.validateJsonObject(jsonArrayareaOfLawArray.get(i).getAsJsonObject());
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AreaOfLawResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AreaOfLawResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AreaOfLawResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AreaOfLawResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<AreaOfLawResponse>() {
           @Override
           public void write(JsonWriter out, AreaOfLawResponse value) throws IOException {
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
           public AreaOfLawResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AreaOfLawResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AreaOfLawResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AreaOfLawResponse
  * @throws IOException if the JSON string is invalid with respect to AreaOfLawResponse
  */
  public static AreaOfLawResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AreaOfLawResponse.class);
  }

 /**
  * Convert an instance of AreaOfLawResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

