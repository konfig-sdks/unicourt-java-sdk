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
 * Name of the attorney&#39;s law firm as provided by Court. This can be null as some Courts do not provide this as a separate field.
 */
@ApiModel(description = "Name of the attorney's law firm as provided by Court. This can be null as some Courts do not provide this as a separate field.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AttorneyLawFirm {
  public static final String SERIALIZED_NAME_ATTORNEY_LAW_FIRM_ID = "attorneyLawFirmId";
  @SerializedName(SERIALIZED_NAME_ATTORNEY_LAW_FIRM_ID)
  private String attorneyLawFirmId;

  public static final String SERIALIZED_NAME_FIRST_FETCH_DATE = "firstFetchDate";
  @SerializedName(SERIALIZED_NAME_FIRST_FETCH_DATE)
  private String firstFetchDate;

  public static final String SERIALIZED_NAME_IS_VISIBLE = "isVisible";
  @SerializedName(SERIALIZED_NAME_IS_VISIBLE)
  private Boolean isVisible;

  public static final String SERIALIZED_NAME_LAST_FETCH_DATE = "lastFetchDate";
  @SerializedName(SERIALIZED_NAME_LAST_FETCH_DATE)
  private String lastFetchDate;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "AttorneyLawFirm";

  public AttorneyLawFirm() {
  }

  public AttorneyLawFirm attorneyLawFirmId(String attorneyLawFirmId) {
    
    
    if (attorneyLawFirmId != null && attorneyLawFirmId.length() < 17) {
      throw new IllegalArgumentException("Invalid value for attorneyLawFirmId. Length must be greater than or equal to 17.");
    }
    
    this.attorneyLawFirmId = attorneyLawFirmId;
    return this;
  }

   /**
   * ID for the law firm of an attorney in this case. This ID is unique within a case and NOT across cases. If the same attorney were to appear in another case this ID would be different.
   * @return attorneyLawFirmId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ALFIgu26ce47ad7674", required = true, value = "ID for the law firm of an attorney in this case. This ID is unique within a case and NOT across cases. If the same attorney were to appear in another case this ID would be different.")

  public String getAttorneyLawFirmId() {
    return attorneyLawFirmId;
  }


  public void setAttorneyLawFirmId(String attorneyLawFirmId) {
    
    
    if (attorneyLawFirmId != null && attorneyLawFirmId.length() < 17) {
      throw new IllegalArgumentException("Invalid value for attorneyLawFirmId. Length must be greater than or equal to 17.");
    }
    this.attorneyLawFirmId = attorneyLawFirmId;
  }


  public AttorneyLawFirm firstFetchDate(String firstFetchDate) {
    
    
    if (firstFetchDate != null && firstFetchDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for firstFetchDate. Length must be greater than or equal to 25.");
    }
    
    this.firstFetchDate = firstFetchDate;
    return this;
  }

   /**
   * Is the date when the document was first fetched from the court site.
   * @return firstFetchDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2021-10-10T10:10:24.000Z", required = true, value = "Is the date when the document was first fetched from the court site.")

  public String getFirstFetchDate() {
    return firstFetchDate;
  }


  public void setFirstFetchDate(String firstFetchDate) {
    
    
    if (firstFetchDate != null && firstFetchDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for firstFetchDate. Length must be greater than or equal to 25.");
    }
    this.firstFetchDate = firstFetchDate;
  }


  public AttorneyLawFirm isVisible(Boolean isVisible) {
    
    
    
    
    this.isVisible = isVisible;
    return this;
  }

   /**
   * Signifies if the attorney as this attorney type is currently isVisible or not for the case.
   * @return isVisible
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Signifies if the attorney as this attorney type is currently isVisible or not for the case.")

  public Boolean getIsVisible() {
    return isVisible;
  }


  public void setIsVisible(Boolean isVisible) {
    
    
    
    this.isVisible = isVisible;
  }


  public AttorneyLawFirm lastFetchDate(String lastFetchDate) {
    
    
    if (lastFetchDate != null && lastFetchDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for lastFetchDate. Length must be greater than or equal to 25.");
    }
    
    this.lastFetchDate = lastFetchDate;
    return this;
  }

   /**
   * Is the date when the document was last fetched from the court site.
   * @return lastFetchDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2021-10-10T10:10:24.000Z", required = true, value = "Is the date when the document was last fetched from the court site.")

  public String getLastFetchDate() {
    return lastFetchDate;
  }


  public void setLastFetchDate(String lastFetchDate) {
    
    
    if (lastFetchDate != null && lastFetchDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for lastFetchDate. Length must be greater than or equal to 25.");
    }
    this.lastFetchDate = lastFetchDate;
  }


  public AttorneyLawFirm name(String name) {
    
    
    if (name != null && name.length() < 1) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 1.");
    }
    
    this.name = name;
    return this;
  }

   /**
   * Name of the law firm as provided by Court.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BUTLER & HOSCH PA", required = true, value = "Name of the law firm as provided by Court.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    if (name != null && name.length() < 1) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 1.");
    }
    this.name = name;
  }


  public AttorneyLawFirm _object(String _object) {
    
    
    if (_object != null && _object.length() < 15) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 15.");
    }
    
    this._object = _object;
    return this;
  }

   /**
   * Name of the object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "AttorneyLawFirm", required = true, value = "Name of the object")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    if (_object != null && _object.length() < 15) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 15.");
    }
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
   * @return the AttorneyLawFirm instance itself
   */
  public AttorneyLawFirm putAdditionalProperty(String key, Object value) {
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
    AttorneyLawFirm attorneyLawFirm = (AttorneyLawFirm) o;
    return Objects.equals(this.attorneyLawFirmId, attorneyLawFirm.attorneyLawFirmId) &&
        Objects.equals(this.firstFetchDate, attorneyLawFirm.firstFetchDate) &&
        Objects.equals(this.isVisible, attorneyLawFirm.isVisible) &&
        Objects.equals(this.lastFetchDate, attorneyLawFirm.lastFetchDate) &&
        Objects.equals(this.name, attorneyLawFirm.name) &&
        Objects.equals(this._object, attorneyLawFirm._object)&&
        Objects.equals(this.additionalProperties, attorneyLawFirm.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attorneyLawFirmId, firstFetchDate, isVisible, lastFetchDate, name, _object, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttorneyLawFirm {\n");
    sb.append("    attorneyLawFirmId: ").append(toIndentedString(attorneyLawFirmId)).append("\n");
    sb.append("    firstFetchDate: ").append(toIndentedString(firstFetchDate)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    lastFetchDate: ").append(toIndentedString(lastFetchDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("attorneyLawFirmId");
    openapiFields.add("firstFetchDate");
    openapiFields.add("isVisible");
    openapiFields.add("lastFetchDate");
    openapiFields.add("name");
    openapiFields.add("object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attorneyLawFirmId");
    openapiRequiredFields.add("firstFetchDate");
    openapiRequiredFields.add("isVisible");
    openapiRequiredFields.add("lastFetchDate");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("object");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AttorneyLawFirm
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AttorneyLawFirm.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttorneyLawFirm is not found in the empty JSON string", AttorneyLawFirm.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AttorneyLawFirm.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("attorneyLawFirmId").isJsonNull() && !jsonObj.get("attorneyLawFirmId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attorneyLawFirmId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attorneyLawFirmId").toString()));
      }
      if (!jsonObj.get("firstFetchDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstFetchDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstFetchDate").toString()));
      }
      if (!jsonObj.get("lastFetchDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastFetchDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastFetchDate").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttorneyLawFirm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttorneyLawFirm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttorneyLawFirm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttorneyLawFirm.class));

       return (TypeAdapter<T>) new TypeAdapter<AttorneyLawFirm>() {
           @Override
           public void write(JsonWriter out, AttorneyLawFirm value) throws IOException {
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
           public AttorneyLawFirm read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AttorneyLawFirm instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AttorneyLawFirm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AttorneyLawFirm
  * @throws IOException if the JSON string is invalid with respect to AttorneyLawFirm
  */
  public static AttorneyLawFirm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttorneyLawFirm.class);
  }

 /**
  * Convert an instance of AttorneyLawFirm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

