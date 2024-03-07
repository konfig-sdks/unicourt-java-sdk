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
import com.konfigthis.client.model.CauseOfAction;
import com.konfigthis.client.model.CauseOfActionAdditionalData;
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
 * CaseCauseOfAction
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CaseCauseOfAction {
  public static final String SERIALIZED_NAME_CAUSE_OF_ACTION = "causeOfAction";
  @SerializedName(SERIALIZED_NAME_CAUSE_OF_ACTION)
  private CauseOfAction causeOfAction;

  public static final String SERIALIZED_NAME_CAUSE_OF_ACTION_ADDITIONAL_DATA_ARRAY = "causeOfActionAdditionalDataArray";
  @SerializedName(SERIALIZED_NAME_CAUSE_OF_ACTION_ADDITIONAL_DATA_ARRAY)
  private List<CauseOfActionAdditionalData> causeOfActionAdditionalDataArray = new ArrayList<>();

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "CaseCauseOfAction";

  public CaseCauseOfAction() {
  }

  public CaseCauseOfAction causeOfAction(CauseOfAction causeOfAction) {
    
    
    
    
    this.causeOfAction = causeOfAction;
    return this;
  }

   /**
   * Get causeOfAction
   * @return causeOfAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public CauseOfAction getCauseOfAction() {
    return causeOfAction;
  }


  public void setCauseOfAction(CauseOfAction causeOfAction) {
    
    
    
    this.causeOfAction = causeOfAction;
  }


  public CaseCauseOfAction causeOfActionAdditionalDataArray(List<CauseOfActionAdditionalData> causeOfActionAdditionalDataArray) {
    
    
    
    
    this.causeOfActionAdditionalDataArray = causeOfActionAdditionalDataArray;
    return this;
  }

  public CaseCauseOfAction addCauseOfActionAdditionalDataArrayItem(CauseOfActionAdditionalData causeOfActionAdditionalDataArrayItem) {
    this.causeOfActionAdditionalDataArray.add(causeOfActionAdditionalDataArrayItem);
    return this;
  }

   /**
   * Get causeOfActionAdditionalDataArray
   * @return causeOfActionAdditionalDataArray
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<CauseOfActionAdditionalData> getCauseOfActionAdditionalDataArray() {
    return causeOfActionAdditionalDataArray;
  }


  public void setCauseOfActionAdditionalDataArray(List<CauseOfActionAdditionalData> causeOfActionAdditionalDataArray) {
    
    
    
    this.causeOfActionAdditionalDataArray = causeOfActionAdditionalDataArray;
  }


  public CaseCauseOfAction _object(String _object) {
    
    
    if (_object != null && _object.length() < 17) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 17.");
    }
    
    this._object = _object;
    return this;
  }

   /**
   * Name of the object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CaseCauseOfAction", required = true, value = "Name of the object")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    if (_object != null && _object.length() < 17) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 17.");
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
   * @return the CaseCauseOfAction instance itself
   */
  public CaseCauseOfAction putAdditionalProperty(String key, Object value) {
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
    CaseCauseOfAction caseCauseOfAction = (CaseCauseOfAction) o;
    return Objects.equals(this.causeOfAction, caseCauseOfAction.causeOfAction) &&
        Objects.equals(this.causeOfActionAdditionalDataArray, caseCauseOfAction.causeOfActionAdditionalDataArray) &&
        Objects.equals(this._object, caseCauseOfAction._object)&&
        Objects.equals(this.additionalProperties, caseCauseOfAction.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(causeOfAction, causeOfActionAdditionalDataArray, _object, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseCauseOfAction {\n");
    sb.append("    causeOfAction: ").append(toIndentedString(causeOfAction)).append("\n");
    sb.append("    causeOfActionAdditionalDataArray: ").append(toIndentedString(causeOfActionAdditionalDataArray)).append("\n");
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
    openapiFields.add("causeOfAction");
    openapiFields.add("causeOfActionAdditionalDataArray");
    openapiFields.add("object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("causeOfAction");
    openapiRequiredFields.add("causeOfActionAdditionalDataArray");
    openapiRequiredFields.add("object");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CaseCauseOfAction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CaseCauseOfAction.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CaseCauseOfAction is not found in the empty JSON string", CaseCauseOfAction.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CaseCauseOfAction.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `causeOfAction`
      CauseOfAction.validateJsonObject(jsonObj.getAsJsonObject("causeOfAction"));
      // ensure the json data is an array
      if (!jsonObj.get("causeOfActionAdditionalDataArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `causeOfActionAdditionalDataArray` to be an array in the JSON string but got `%s`", jsonObj.get("causeOfActionAdditionalDataArray").toString()));
      }

      JsonArray jsonArraycauseOfActionAdditionalDataArray = jsonObj.getAsJsonArray("causeOfActionAdditionalDataArray");
      // validate the required field `causeOfActionAdditionalDataArray` (array)
      for (int i = 0; i < jsonArraycauseOfActionAdditionalDataArray.size(); i++) {
        CauseOfActionAdditionalData.validateJsonObject(jsonArraycauseOfActionAdditionalDataArray.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CaseCauseOfAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CaseCauseOfAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CaseCauseOfAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CaseCauseOfAction.class));

       return (TypeAdapter<T>) new TypeAdapter<CaseCauseOfAction>() {
           @Override
           public void write(JsonWriter out, CaseCauseOfAction value) throws IOException {
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
           public CaseCauseOfAction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CaseCauseOfAction instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CaseCauseOfAction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CaseCauseOfAction
  * @throws IOException if the JSON string is invalid with respect to CaseCauseOfAction
  */
  public static CaseCauseOfAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CaseCauseOfAction.class);
  }

 /**
  * Convert an instance of CaseCauseOfAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

