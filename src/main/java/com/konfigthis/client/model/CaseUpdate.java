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
import com.konfigthis.client.model.CaseUpdatePacerOptionsResponse;
import com.konfigthis.client.model.Exception;
import com.konfigthis.client.model.ModelCase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;

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
 * CaseUpdate
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CaseUpdate {
  public static final String SERIALIZED_NAME_CASE = "case";
  @SerializedName(SERIALIZED_NAME_CASE)
  private ModelCase _case;

  public static final String SERIALIZED_NAME_CASE_A_P_I = "caseAPI";
  @SerializedName(SERIALIZED_NAME_CASE_A_P_I)
  private URI caseAPI;

  public static final String SERIALIZED_NAME_CASE_ID = "caseId";
  @SerializedName(SERIALIZED_NAME_CASE_ID)
  private String caseId;

  public static final String SERIALIZED_NAME_EXCEPTION = "exception";
  @SerializedName(SERIALIZED_NAME_EXCEPTION)
  private Exception exception;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "CaseUpdate";

  public static final String SERIALIZED_NAME_PACER_OPTIONS = "pacerOptions";
  @SerializedName(SERIALIZED_NAME_PACER_OPTIONS)
  private CaseUpdatePacerOptionsResponse pacerOptions;

  public static final String SERIALIZED_NAME_REQUESTED_DATE = "requestedDate";
  @SerializedName(SERIALIZED_NAME_REQUESTED_DATE)
  private OffsetDateTime requestedDate;

  /**
   * Status of the request.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    COMPLETE("COMPLETE"),
    
    FAILURE("FAILURE"),
    
    IN_PROGRESS("IN_PROGRESS");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public CaseUpdate() {
  }

  public CaseUpdate _case(ModelCase _case) {
    
    
    
    
    this._case = _case;
    return this;
  }

   /**
   * Get _case
   * @return _case
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public ModelCase getCase() {
    return _case;
  }


  public void setCase(ModelCase _case) {
    
    
    
    this._case = _case;
  }


  public CaseUpdate caseAPI(URI caseAPI) {
    
    
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


  public CaseUpdate caseId(String caseId) {
    
    
    if (caseId != null && caseId.length() < 18) {
      throw new IllegalArgumentException("Invalid value for caseId. Length must be greater than or equal to 18.");
    }
    
    this.caseId = caseId;
    return this;
  }

   /**
   * Unique Id for a Case in UniCourt.
   * @return caseId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CASEhq9d8b72d0800c", required = true, value = "Unique Id for a Case in UniCourt.")

  public String getCaseId() {
    return caseId;
  }


  public void setCaseId(String caseId) {
    
    
    if (caseId != null && caseId.length() < 18) {
      throw new IllegalArgumentException("Invalid value for caseId. Length must be greater than or equal to 18.");
    }
    this.caseId = caseId;
  }


  public CaseUpdate exception(Exception exception) {
    
    
    
    
    this.exception = exception;
    return this;
  }

   /**
   * Get exception
   * @return exception
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public Exception getException() {
    return exception;
  }


  public void setException(Exception exception) {
    
    
    
    this.exception = exception;
  }


  public CaseUpdate _object(String _object) {
    
    
    if (_object != null && _object.length() < 10) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 10.");
    }
    
    this._object = _object;
    return this;
  }

   /**
   * Name of the object.
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CaseUpdate", required = true, value = "Name of the object.")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    if (_object != null && _object.length() < 10) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 10.");
    }
    this._object = _object;
  }


  public CaseUpdate pacerOptions(CaseUpdatePacerOptionsResponse pacerOptions) {
    
    
    
    
    this.pacerOptions = pacerOptions;
    return this;
  }

   /**
   * Get pacerOptions
   * @return pacerOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public CaseUpdatePacerOptionsResponse getPacerOptions() {
    return pacerOptions;
  }


  public void setPacerOptions(CaseUpdatePacerOptionsResponse pacerOptions) {
    
    
    
    this.pacerOptions = pacerOptions;
  }


  public CaseUpdate requestedDate(OffsetDateTime requestedDate) {
    
    
    if (requestedDate != null && requestedDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for requestedDate. Length must be greater than or equal to 25.");
    }
    
    this.requestedDate = requestedDate;
    return this;
  }

   /**
   * The date and time when the case was last requested for update 
   * @return requestedDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-05-16T11:51:27Z", required = true, value = "The date and time when the case was last requested for update ")

  public OffsetDateTime getRequestedDate() {
    return requestedDate;
  }


  public void setRequestedDate(OffsetDateTime requestedDate) {
    
    
    if (requestedDate != null && requestedDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for requestedDate. Length must be greater than or equal to 25.");
    }
    this.requestedDate = requestedDate;
  }


  public CaseUpdate status(StatusEnum status) {
    
    
    if (status != null && status.length() < 7) {
      throw new IllegalArgumentException("Invalid value for status. Length must be greater than or equal to 7.");
    }
    
    this.status = status;
    return this;
  }

   /**
   * Status of the request.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "COMPLETE", required = true, value = "Status of the request.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    if (status != null && status.length() < 7) {
      throw new IllegalArgumentException("Invalid value for status. Length must be greater than or equal to 7.");
    }
    this.status = status;
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
   * @return the CaseUpdate instance itself
   */
  public CaseUpdate putAdditionalProperty(String key, Object value) {
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
    CaseUpdate caseUpdate = (CaseUpdate) o;
    return Objects.equals(this._case, caseUpdate._case) &&
        Objects.equals(this.caseAPI, caseUpdate.caseAPI) &&
        Objects.equals(this.caseId, caseUpdate.caseId) &&
        Objects.equals(this.exception, caseUpdate.exception) &&
        Objects.equals(this._object, caseUpdate._object) &&
        Objects.equals(this.pacerOptions, caseUpdate.pacerOptions) &&
        Objects.equals(this.requestedDate, caseUpdate.requestedDate) &&
        Objects.equals(this.status, caseUpdate.status)&&
        Objects.equals(this.additionalProperties, caseUpdate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_case, caseAPI, caseId, exception, _object, pacerOptions, requestedDate, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseUpdate {\n");
    sb.append("    _case: ").append(toIndentedString(_case)).append("\n");
    sb.append("    caseAPI: ").append(toIndentedString(caseAPI)).append("\n");
    sb.append("    caseId: ").append(toIndentedString(caseId)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    pacerOptions: ").append(toIndentedString(pacerOptions)).append("\n");
    sb.append("    requestedDate: ").append(toIndentedString(requestedDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("case");
    openapiFields.add("caseAPI");
    openapiFields.add("caseId");
    openapiFields.add("exception");
    openapiFields.add("object");
    openapiFields.add("pacerOptions");
    openapiFields.add("requestedDate");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("case");
    openapiRequiredFields.add("caseAPI");
    openapiRequiredFields.add("caseId");
    openapiRequiredFields.add("exception");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("pacerOptions");
    openapiRequiredFields.add("requestedDate");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CaseUpdate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CaseUpdate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CaseUpdate is not found in the empty JSON string", CaseUpdate.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CaseUpdate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `case`
      ModelCase.validateJsonObject(jsonObj.getAsJsonObject("case"));
      if (!jsonObj.get("caseAPI").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseAPI` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseAPI").toString()));
      }
      if (!jsonObj.get("caseId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `caseId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("caseId").toString()));
      }
      // validate the required field `exception`
      Exception.validateJsonObject(jsonObj.getAsJsonObject("exception"));
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      // validate the required field `pacerOptions`
      CaseUpdatePacerOptionsResponse.validateJsonObject(jsonObj.getAsJsonObject("pacerOptions"));
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CaseUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CaseUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CaseUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CaseUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<CaseUpdate>() {
           @Override
           public void write(JsonWriter out, CaseUpdate value) throws IOException {
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
           public CaseUpdate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CaseUpdate instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CaseUpdate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CaseUpdate
  * @throws IOException if the JSON string is invalid with respect to CaseUpdate
  */
  public static CaseUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CaseUpdate.class);
  }

 /**
  * Convert an instance of CaseUpdate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

