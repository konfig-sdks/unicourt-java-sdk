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
import com.konfigthis.client.model.ServiceStatus;
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
 * CourtServiceStatus
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CourtServiceStatus {
  public static final String SERIALIZED_NAME_CASE_CLASS_ID_ARRAY = "caseClassIdArray";
  @SerializedName(SERIALIZED_NAME_CASE_CLASS_ID_ARRAY)
  private List<String> caseClassIdArray = new ArrayList<>();

  public static final String SERIALIZED_NAME_CASE_DOCUMENT_ORDER_SERVICE_STATUS = "caseDocumentOrderServiceStatus";
  @SerializedName(SERIALIZED_NAME_CASE_DOCUMENT_ORDER_SERVICE_STATUS)
  private ServiceStatus caseDocumentOrderServiceStatus;

  public static final String SERIALIZED_NAME_CASE_TRACK_SERVICE_STATUS = "caseTrackServiceStatus";
  @SerializedName(SERIALIZED_NAME_CASE_TRACK_SERVICE_STATUS)
  private ServiceStatus caseTrackServiceStatus;

  public static final String SERIALIZED_NAME_CASE_UPDATE_SERVICE_STATUS = "caseUpdateServiceStatus";
  @SerializedName(SERIALIZED_NAME_CASE_UPDATE_SERVICE_STATUS)
  private ServiceStatus caseUpdateServiceStatus;

  public static final String SERIALIZED_NAME_COURT_ID_ARRAY = "courtIdArray";
  @SerializedName(SERIALIZED_NAME_COURT_ID_ARRAY)
  private List<String> courtIdArray = new ArrayList<>();

  public static final String SERIALIZED_NAME_COURT_LOCATION_ID_ARRAY = "courtLocationIdArray";
  @SerializedName(SERIALIZED_NAME_COURT_LOCATION_ID_ARRAY)
  private List<String> courtLocationIdArray = new ArrayList<>();

  public static final String SERIALIZED_NAME_COURT_SERVICE_STATUS_ID = "courtServiceStatusId";
  @SerializedName(SERIALIZED_NAME_COURT_SERVICE_STATUS_ID)
  private String courtServiceStatusId;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "CourtServiceStatus";

  public static final String SERIALIZED_NAME_SERVICE_STATUS_AS_ON = "serviceStatusAsOn";
  @SerializedName(SERIALIZED_NAME_SERVICE_STATUS_AS_ON)
  private String serviceStatusAsOn;

  public CourtServiceStatus() {
  }

  public CourtServiceStatus caseClassIdArray(List<String> caseClassIdArray) {
    
    
    
    
    this.caseClassIdArray = caseClassIdArray;
    return this;
  }

  public CourtServiceStatus addCaseClassIdArrayItem(String caseClassIdArrayItem) {
    this.caseClassIdArray.add(caseClassIdArrayItem);
    return this;
  }

   /**
   * All the Case class ids associated to the service status
   * @return caseClassIdArray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"CACLf7txmD5m5Y8RyZ\"]", required = true, value = "All the Case class ids associated to the service status")

  public List<String> getCaseClassIdArray() {
    return caseClassIdArray;
  }


  public void setCaseClassIdArray(List<String> caseClassIdArray) {
    
    
    
    this.caseClassIdArray = caseClassIdArray;
  }


  public CourtServiceStatus caseDocumentOrderServiceStatus(ServiceStatus caseDocumentOrderServiceStatus) {
    
    
    
    
    this.caseDocumentOrderServiceStatus = caseDocumentOrderServiceStatus;
    return this;
  }

   /**
   * Get caseDocumentOrderServiceStatus
   * @return caseDocumentOrderServiceStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public ServiceStatus getCaseDocumentOrderServiceStatus() {
    return caseDocumentOrderServiceStatus;
  }


  public void setCaseDocumentOrderServiceStatus(ServiceStatus caseDocumentOrderServiceStatus) {
    
    
    
    this.caseDocumentOrderServiceStatus = caseDocumentOrderServiceStatus;
  }


  public CourtServiceStatus caseTrackServiceStatus(ServiceStatus caseTrackServiceStatus) {
    
    
    
    
    this.caseTrackServiceStatus = caseTrackServiceStatus;
    return this;
  }

   /**
   * Get caseTrackServiceStatus
   * @return caseTrackServiceStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public ServiceStatus getCaseTrackServiceStatus() {
    return caseTrackServiceStatus;
  }


  public void setCaseTrackServiceStatus(ServiceStatus caseTrackServiceStatus) {
    
    
    
    this.caseTrackServiceStatus = caseTrackServiceStatus;
  }


  public CourtServiceStatus caseUpdateServiceStatus(ServiceStatus caseUpdateServiceStatus) {
    
    
    
    
    this.caseUpdateServiceStatus = caseUpdateServiceStatus;
    return this;
  }

   /**
   * Get caseUpdateServiceStatus
   * @return caseUpdateServiceStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public ServiceStatus getCaseUpdateServiceStatus() {
    return caseUpdateServiceStatus;
  }


  public void setCaseUpdateServiceStatus(ServiceStatus caseUpdateServiceStatus) {
    
    
    
    this.caseUpdateServiceStatus = caseUpdateServiceStatus;
  }


  public CourtServiceStatus courtIdArray(List<String> courtIdArray) {
    
    
    
    
    this.courtIdArray = courtIdArray;
    return this;
  }

  public CourtServiceStatus addCourtIdArrayItem(String courtIdArrayItem) {
    this.courtIdArray.add(courtIdArrayItem);
    return this;
  }

   /**
   * All the court ids associated to the service status
   * @return courtIdArray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"CRSCV4vCEaKrhysQPq\"]", required = true, value = "All the court ids associated to the service status")

  public List<String> getCourtIdArray() {
    return courtIdArray;
  }


  public void setCourtIdArray(List<String> courtIdArray) {
    
    
    
    this.courtIdArray = courtIdArray;
  }


  public CourtServiceStatus courtLocationIdArray(List<String> courtLocationIdArray) {
    
    
    
    
    this.courtLocationIdArray = courtLocationIdArray;
    return this;
  }

  public CourtServiceStatus addCourtLocationIdArrayItem(String courtLocationIdArrayItem) {
    this.courtLocationIdArray.add(courtLocationIdArrayItem);
    return this;
  }

   /**
   * All the court location ids associated to the service status
   * @return courtLocationIdArray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"COLO35ekoDzA9iU5x4\"]", required = true, value = "All the court location ids associated to the service status")

  public List<String> getCourtLocationIdArray() {
    return courtLocationIdArray;
  }


  public void setCourtLocationIdArray(List<String> courtLocationIdArray) {
    
    
    
    this.courtLocationIdArray = courtLocationIdArray;
  }


  public CourtServiceStatus courtServiceStatusId(String courtServiceStatusId) {
    
    
    if (courtServiceStatusId != null && courtServiceStatusId.length() < 18) {
      throw new IllegalArgumentException("Invalid value for courtServiceStatusId. Length must be greater than or equal to 18.");
    }
    
    this.courtServiceStatusId = courtServiceStatusId;
    return this;
  }

   /**
   * Court Service Status Object ID
   * @return courtServiceStatusId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CTSSV4vCEaKrhysQPq", required = true, value = "Court Service Status Object ID")

  public String getCourtServiceStatusId() {
    return courtServiceStatusId;
  }


  public void setCourtServiceStatusId(String courtServiceStatusId) {
    
    
    if (courtServiceStatusId != null && courtServiceStatusId.length() < 18) {
      throw new IllegalArgumentException("Invalid value for courtServiceStatusId. Length must be greater than or equal to 18.");
    }
    this.courtServiceStatusId = courtServiceStatusId;
  }


  public CourtServiceStatus _object(String _object) {
    
    
    if (_object != null && _object.length() < 18) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 18.");
    }
    
    this._object = _object;
    return this;
  }

   /**
   * Name of the object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CourtServiceStatus", required = true, value = "Name of the object")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    if (_object != null && _object.length() < 18) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 18.");
    }
    this._object = _object;
  }


  public CourtServiceStatus serviceStatusAsOn(String serviceStatusAsOn) {
    
    
    if (serviceStatusAsOn != null && serviceStatusAsOn.length() < 25) {
      throw new IllegalArgumentException("Invalid value for serviceStatusAsOn. Length must be greater than or equal to 25.");
    }
    
    this.serviceStatusAsOn = serviceStatusAsOn;
    return this;
  }

   /**
   * Date when the service status was last fetched.
   * @return serviceStatusAsOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-10-26T03:22:45.000Z", required = true, value = "Date when the service status was last fetched.")

  public String getServiceStatusAsOn() {
    return serviceStatusAsOn;
  }


  public void setServiceStatusAsOn(String serviceStatusAsOn) {
    
    
    if (serviceStatusAsOn != null && serviceStatusAsOn.length() < 25) {
      throw new IllegalArgumentException("Invalid value for serviceStatusAsOn. Length must be greater than or equal to 25.");
    }
    this.serviceStatusAsOn = serviceStatusAsOn;
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
   * @return the CourtServiceStatus instance itself
   */
  public CourtServiceStatus putAdditionalProperty(String key, Object value) {
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
    CourtServiceStatus courtServiceStatus = (CourtServiceStatus) o;
    return Objects.equals(this.caseClassIdArray, courtServiceStatus.caseClassIdArray) &&
        Objects.equals(this.caseDocumentOrderServiceStatus, courtServiceStatus.caseDocumentOrderServiceStatus) &&
        Objects.equals(this.caseTrackServiceStatus, courtServiceStatus.caseTrackServiceStatus) &&
        Objects.equals(this.caseUpdateServiceStatus, courtServiceStatus.caseUpdateServiceStatus) &&
        Objects.equals(this.courtIdArray, courtServiceStatus.courtIdArray) &&
        Objects.equals(this.courtLocationIdArray, courtServiceStatus.courtLocationIdArray) &&
        Objects.equals(this.courtServiceStatusId, courtServiceStatus.courtServiceStatusId) &&
        Objects.equals(this._object, courtServiceStatus._object) &&
        Objects.equals(this.serviceStatusAsOn, courtServiceStatus.serviceStatusAsOn)&&
        Objects.equals(this.additionalProperties, courtServiceStatus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseClassIdArray, caseDocumentOrderServiceStatus, caseTrackServiceStatus, caseUpdateServiceStatus, courtIdArray, courtLocationIdArray, courtServiceStatusId, _object, serviceStatusAsOn, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourtServiceStatus {\n");
    sb.append("    caseClassIdArray: ").append(toIndentedString(caseClassIdArray)).append("\n");
    sb.append("    caseDocumentOrderServiceStatus: ").append(toIndentedString(caseDocumentOrderServiceStatus)).append("\n");
    sb.append("    caseTrackServiceStatus: ").append(toIndentedString(caseTrackServiceStatus)).append("\n");
    sb.append("    caseUpdateServiceStatus: ").append(toIndentedString(caseUpdateServiceStatus)).append("\n");
    sb.append("    courtIdArray: ").append(toIndentedString(courtIdArray)).append("\n");
    sb.append("    courtLocationIdArray: ").append(toIndentedString(courtLocationIdArray)).append("\n");
    sb.append("    courtServiceStatusId: ").append(toIndentedString(courtServiceStatusId)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    serviceStatusAsOn: ").append(toIndentedString(serviceStatusAsOn)).append("\n");
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
    openapiFields.add("caseClassIdArray");
    openapiFields.add("caseDocumentOrderServiceStatus");
    openapiFields.add("caseTrackServiceStatus");
    openapiFields.add("caseUpdateServiceStatus");
    openapiFields.add("courtIdArray");
    openapiFields.add("courtLocationIdArray");
    openapiFields.add("courtServiceStatusId");
    openapiFields.add("object");
    openapiFields.add("serviceStatusAsOn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("caseClassIdArray");
    openapiRequiredFields.add("caseDocumentOrderServiceStatus");
    openapiRequiredFields.add("caseTrackServiceStatus");
    openapiRequiredFields.add("caseUpdateServiceStatus");
    openapiRequiredFields.add("courtIdArray");
    openapiRequiredFields.add("courtLocationIdArray");
    openapiRequiredFields.add("courtServiceStatusId");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("serviceStatusAsOn");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CourtServiceStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CourtServiceStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CourtServiceStatus is not found in the empty JSON string", CourtServiceStatus.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CourtServiceStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("caseClassIdArray") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("caseClassIdArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseClassIdArray` to be an array in the JSON string but got `%s`", jsonObj.get("caseClassIdArray").toString()));
      }
      // validate the required field `caseDocumentOrderServiceStatus`
      ServiceStatus.validateJsonObject(jsonObj.getAsJsonObject("caseDocumentOrderServiceStatus"));
      // validate the required field `caseTrackServiceStatus`
      ServiceStatus.validateJsonObject(jsonObj.getAsJsonObject("caseTrackServiceStatus"));
      // validate the required field `caseUpdateServiceStatus`
      ServiceStatus.validateJsonObject(jsonObj.getAsJsonObject("caseUpdateServiceStatus"));
      // ensure the required json array is present
      if (jsonObj.get("courtIdArray") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("courtIdArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `courtIdArray` to be an array in the JSON string but got `%s`", jsonObj.get("courtIdArray").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("courtLocationIdArray") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("courtLocationIdArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `courtLocationIdArray` to be an array in the JSON string but got `%s`", jsonObj.get("courtLocationIdArray").toString()));
      }
      if (!jsonObj.get("courtServiceStatusId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `courtServiceStatusId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("courtServiceStatusId").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if (!jsonObj.get("serviceStatusAsOn").isJsonNull() && !jsonObj.get("serviceStatusAsOn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serviceStatusAsOn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serviceStatusAsOn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CourtServiceStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CourtServiceStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CourtServiceStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CourtServiceStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<CourtServiceStatus>() {
           @Override
           public void write(JsonWriter out, CourtServiceStatus value) throws IOException {
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
           public CourtServiceStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CourtServiceStatus instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CourtServiceStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CourtServiceStatus
  * @throws IOException if the JSON string is invalid with respect to CourtServiceStatus
  */
  public static CourtServiceStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CourtServiceStatus.class);
  }

 /**
  * Convert an instance of CourtServiceStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

