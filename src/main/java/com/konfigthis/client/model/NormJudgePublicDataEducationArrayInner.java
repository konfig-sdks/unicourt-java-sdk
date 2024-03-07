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
 * NormJudgePublicDataEducationArrayInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class NormJudgePublicDataEducationArrayInner {
  public static final String SERIALIZED_NAME_DEGREE = "degree";
  @SerializedName(SERIALIZED_NAME_DEGREE)
  private String degree;

  public static final String SERIALIZED_NAME_SCHOOL = "school";
  @SerializedName(SERIALIZED_NAME_SCHOOL)
  private String school;

  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private Integer year;

  public NormJudgePublicDataEducationArrayInner() {
  }

  public NormJudgePublicDataEducationArrayInner degree(String degree) {
    
    
    
    
    this.degree = degree;
    return this;
  }

   /**
   * The Degree Awarded to the Judge
   * @return degree
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The Degree Awarded to the Judge")

  public String getDegree() {
    return degree;
  }


  public void setDegree(String degree) {
    
    
    
    this.degree = degree;
  }


  public NormJudgePublicDataEducationArrayInner school(String school) {
    
    
    
    
    this.school = school;
    return this;
  }

   /**
   * The University which awarded the degree to the Judge.
   * @return school
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The University which awarded the degree to the Judge.")

  public String getSchool() {
    return school;
  }


  public void setSchool(String school) {
    
    
    
    this.school = school;
  }


  public NormJudgePublicDataEducationArrayInner year(Integer year) {
    
    
    
    
    this.year = year;
    return this;
  }

   /**
   * The year when the degree was awarded.
   * @return year
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The year when the degree was awarded.")

  public Integer getYear() {
    return year;
  }


  public void setYear(Integer year) {
    
    
    
    this.year = year;
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
   * @return the NormJudgePublicDataEducationArrayInner instance itself
   */
  public NormJudgePublicDataEducationArrayInner putAdditionalProperty(String key, Object value) {
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
    NormJudgePublicDataEducationArrayInner normJudgePublicDataEducationArrayInner = (NormJudgePublicDataEducationArrayInner) o;
    return Objects.equals(this.degree, normJudgePublicDataEducationArrayInner.degree) &&
        Objects.equals(this.school, normJudgePublicDataEducationArrayInner.school) &&
        Objects.equals(this.year, normJudgePublicDataEducationArrayInner.year)&&
        Objects.equals(this.additionalProperties, normJudgePublicDataEducationArrayInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(degree, school, year, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NormJudgePublicDataEducationArrayInner {\n");
    sb.append("    degree: ").append(toIndentedString(degree)).append("\n");
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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
    openapiFields.add("degree");
    openapiFields.add("school");
    openapiFields.add("year");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("degree");
    openapiRequiredFields.add("school");
    openapiRequiredFields.add("year");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NormJudgePublicDataEducationArrayInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NormJudgePublicDataEducationArrayInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NormJudgePublicDataEducationArrayInner is not found in the empty JSON string", NormJudgePublicDataEducationArrayInner.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NormJudgePublicDataEducationArrayInner.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("degree").isJsonNull() && !jsonObj.get("degree").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `degree` to be a primitive type in the JSON string but got `%s`", jsonObj.get("degree").toString()));
      }
      if (!jsonObj.get("school").isJsonNull() && !jsonObj.get("school").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `school` to be a primitive type in the JSON string but got `%s`", jsonObj.get("school").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NormJudgePublicDataEducationArrayInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NormJudgePublicDataEducationArrayInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NormJudgePublicDataEducationArrayInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NormJudgePublicDataEducationArrayInner.class));

       return (TypeAdapter<T>) new TypeAdapter<NormJudgePublicDataEducationArrayInner>() {
           @Override
           public void write(JsonWriter out, NormJudgePublicDataEducationArrayInner value) throws IOException {
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
           public NormJudgePublicDataEducationArrayInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NormJudgePublicDataEducationArrayInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of NormJudgePublicDataEducationArrayInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NormJudgePublicDataEducationArrayInner
  * @throws IOException if the JSON string is invalid with respect to NormJudgePublicDataEducationArrayInner
  */
  public static NormJudgePublicDataEducationArrayInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NormJudgePublicDataEducationArrayInner.class);
  }

 /**
  * Convert an instance of NormJudgePublicDataEducationArrayInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
