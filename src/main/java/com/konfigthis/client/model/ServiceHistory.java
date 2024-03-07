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
 * A timeline of courts where the judge has been employed.
 */
@ApiModel(description = "A timeline of courts where the judge has been employed.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ServiceHistory {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_APPOINTED_BY = "appointedBy";
  @SerializedName(SERIALIZED_NAME_APPOINTED_BY)
  private String appointedBy;

  public static final String SERIALIZED_NAME_FROM_DATE = "fromDate";
  @SerializedName(SERIALIZED_NAME_FROM_DATE)
  private OffsetDateTime fromDate;

  public static final String SERIALIZED_NAME_FROM_YEAR = "fromYear";
  @SerializedName(SERIALIZED_NAME_FROM_YEAR)
  private Integer fromYear;

  public static final String SERIALIZED_NAME_IS_VISIBLE = "isVisible";
  @SerializedName(SERIALIZED_NAME_IS_VISIBLE)
  private Boolean isVisible;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "ServiceHistory";

  public static final String SERIALIZED_NAME_REASON_FOR_TERMINATION = "reasonForTermination";
  @SerializedName(SERIALIZED_NAME_REASON_FOR_TERMINATION)
  private String reasonForTermination;

  public static final String SERIALIZED_NAME_SOURCE_COURT = "sourceCourt";
  @SerializedName(SERIALIZED_NAME_SOURCE_COURT)
  private String sourceCourt;

  public static final String SERIALIZED_NAME_TO_DATE = "toDate";
  @SerializedName(SERIALIZED_NAME_TO_DATE)
  private OffsetDateTime toDate;

  public static final String SERIALIZED_NAME_TO_YEAR = "toYear";
  @SerializedName(SERIALIZED_NAME_TO_YEAR)
  private Integer toYear;

  public ServiceHistory() {
  }

  public ServiceHistory title(String title) {
    
    
    
    
    this.title = title;
    return this;
  }

   /**
   * Title held by the Judge.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Title held by the Judge.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    
    
    
    this.title = title;
  }


  public ServiceHistory appointedBy(String appointedBy) {
    
    
    
    
    this.appointedBy = appointedBy;
    return this;
  }

   /**
   * The President-in-charge of the Judges appointment.
   * @return appointedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The President-in-charge of the Judges appointment.")

  public String getAppointedBy() {
    return appointedBy;
  }


  public void setAppointedBy(String appointedBy) {
    
    
    
    this.appointedBy = appointedBy;
  }


  public ServiceHistory fromDate(OffsetDateTime fromDate) {
    
    
    
    
    this.fromDate = fromDate;
    return this;
  }

   /**
   * The year in which the Judge began practicing in his current service.
   * @return fromDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The year in which the Judge began practicing in his current service.")

  public OffsetDateTime getFromDate() {
    return fromDate;
  }


  public void setFromDate(OffsetDateTime fromDate) {
    
    
    
    this.fromDate = fromDate;
  }


  public ServiceHistory fromYear(Integer fromYear) {
    
    
    
    
    this.fromYear = fromYear;
    return this;
  }

   /**
   * The year in which the Judge began practicing in his current service.
   * @return fromYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The year in which the Judge began practicing in his current service.")

  public Integer getFromYear() {
    return fromYear;
  }


  public void setFromYear(Integer fromYear) {
    
    
    
    this.fromYear = fromYear;
  }


  public ServiceHistory isVisible(Boolean isVisible) {
    
    
    
    
    this.isVisible = isVisible;
    return this;
  }

   /**
   * Boolean indicating if the service history  is visible or not.
   * @return isVisible
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Boolean indicating if the service history  is visible or not.")

  public Boolean getIsVisible() {
    return isVisible;
  }


  public void setIsVisible(Boolean isVisible) {
    
    
    
    this.isVisible = isVisible;
  }


  public ServiceHistory _object(String _object) {
    
    
    
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ServiceHistory", required = true, value = "")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    
    this._object = _object;
  }


  public ServiceHistory reasonForTermination(String reasonForTermination) {
    
    
    
    
    this.reasonForTermination = reasonForTermination;
    return this;
  }

   /**
   * The reason for the Judges termination for the current position.
   * @return reasonForTermination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The reason for the Judges termination for the current position.")

  public String getReasonForTermination() {
    return reasonForTermination;
  }


  public void setReasonForTermination(String reasonForTermination) {
    
    
    
    this.reasonForTermination = reasonForTermination;
  }


  public ServiceHistory sourceCourt(String sourceCourt) {
    
    
    
    
    this.sourceCourt = sourceCourt;
    return this;
  }

   /**
   * The court served by the Judge. The court is taken from source.
   * @return sourceCourt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The court served by the Judge. The court is taken from source.")

  public String getSourceCourt() {
    return sourceCourt;
  }


  public void setSourceCourt(String sourceCourt) {
    
    
    
    this.sourceCourt = sourceCourt;
  }


  public ServiceHistory toDate(OffsetDateTime toDate) {
    
    
    
    
    this.toDate = toDate;
    return this;
  }

   /**
   * The year in which the Judge stoped practicing in his current service.
   * @return toDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The year in which the Judge stoped practicing in his current service.")

  public OffsetDateTime getToDate() {
    return toDate;
  }


  public void setToDate(OffsetDateTime toDate) {
    
    
    
    this.toDate = toDate;
  }


  public ServiceHistory toYear(Integer toYear) {
    
    
    
    
    this.toYear = toYear;
    return this;
  }

   /**
   * The year in which the Judge stoped practicing in his current service.
   * @return toYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The year in which the Judge stoped practicing in his current service.")

  public Integer getToYear() {
    return toYear;
  }


  public void setToYear(Integer toYear) {
    
    
    
    this.toYear = toYear;
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
   * @return the ServiceHistory instance itself
   */
  public ServiceHistory putAdditionalProperty(String key, Object value) {
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
    ServiceHistory serviceHistory = (ServiceHistory) o;
    return Objects.equals(this.title, serviceHistory.title) &&
        Objects.equals(this.appointedBy, serviceHistory.appointedBy) &&
        Objects.equals(this.fromDate, serviceHistory.fromDate) &&
        Objects.equals(this.fromYear, serviceHistory.fromYear) &&
        Objects.equals(this.isVisible, serviceHistory.isVisible) &&
        Objects.equals(this._object, serviceHistory._object) &&
        Objects.equals(this.reasonForTermination, serviceHistory.reasonForTermination) &&
        Objects.equals(this.sourceCourt, serviceHistory.sourceCourt) &&
        Objects.equals(this.toDate, serviceHistory.toDate) &&
        Objects.equals(this.toYear, serviceHistory.toYear)&&
        Objects.equals(this.additionalProperties, serviceHistory.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, appointedBy, fromDate, fromYear, isVisible, _object, reasonForTermination, sourceCourt, toDate, toYear, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceHistory {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    appointedBy: ").append(toIndentedString(appointedBy)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    fromYear: ").append(toIndentedString(fromYear)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    reasonForTermination: ").append(toIndentedString(reasonForTermination)).append("\n");
    sb.append("    sourceCourt: ").append(toIndentedString(sourceCourt)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    toYear: ").append(toIndentedString(toYear)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("appointedBy");
    openapiFields.add("fromDate");
    openapiFields.add("fromYear");
    openapiFields.add("isVisible");
    openapiFields.add("object");
    openapiFields.add("reasonForTermination");
    openapiFields.add("sourceCourt");
    openapiFields.add("toDate");
    openapiFields.add("toYear");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("appointedBy");
    openapiRequiredFields.add("fromDate");
    openapiRequiredFields.add("fromYear");
    openapiRequiredFields.add("isVisible");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("reasonForTermination");
    openapiRequiredFields.add("sourceCourt");
    openapiRequiredFields.add("toDate");
    openapiRequiredFields.add("toYear");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceHistory
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ServiceHistory.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceHistory is not found in the empty JSON string", ServiceHistory.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ServiceHistory.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonNull() && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("appointedBy").isJsonNull() && !jsonObj.get("appointedBy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appointedBy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appointedBy").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if (!jsonObj.get("reasonForTermination").isJsonNull() && !jsonObj.get("reasonForTermination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reasonForTermination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reasonForTermination").toString()));
      }
      if (!jsonObj.get("sourceCourt").isJsonNull() && !jsonObj.get("sourceCourt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceCourt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceCourt").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceHistory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceHistory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceHistory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceHistory.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceHistory>() {
           @Override
           public void write(JsonWriter out, ServiceHistory value) throws IOException {
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
           public ServiceHistory read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ServiceHistory instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ServiceHistory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceHistory
  * @throws IOException if the JSON string is invalid with respect to ServiceHistory
  */
  public static ServiceHistory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceHistory.class);
  }

 /**
  * Convert an instance of ServiceHistory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

