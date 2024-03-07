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
 * Charge
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Charge {
  public static final String SERIALIZED_NAME_CHARGE_GROUP = "chargeGroup";
  @SerializedName(SERIALIZED_NAME_CHARGE_GROUP)
  private String chargeGroup;

  public static final String SERIALIZED_NAME_CHARGE_GROUP_ID = "chargeGroupId";
  @SerializedName(SERIALIZED_NAME_CHARGE_GROUP_ID)
  private String chargeGroupId;

  public static final String SERIALIZED_NAME_CHARGE_ID = "chargeId";
  @SerializedName(SERIALIZED_NAME_CHARGE_ID)
  private String chargeId;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private OffsetDateTime createdDate;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "Charge";

  public Charge() {
  }

  public Charge chargeGroup(String chargeGroup) {
    
    
    if (chargeGroup != null && chargeGroup.length() < 1) {
      throw new IllegalArgumentException("Invalid value for chargeGroup. Length must be greater than or equal to 1.");
    }
    
    this.chargeGroup = chargeGroup;
    return this;
  }

   /**
   * Get chargeGroup
   * @return chargeGroup
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Burglary", required = true, value = "")

  public String getChargeGroup() {
    return chargeGroup;
  }


  public void setChargeGroup(String chargeGroup) {
    
    
    if (chargeGroup != null && chargeGroup.length() < 1) {
      throw new IllegalArgumentException("Invalid value for chargeGroup. Length must be greater than or equal to 1.");
    }
    this.chargeGroup = chargeGroup;
  }


  public Charge chargeGroupId(String chargeGroupId) {
    
    
    if (chargeGroupId != null && chargeGroupId.length() < 18) {
      throw new IllegalArgumentException("Invalid value for chargeGroupId. Length must be greater than or equal to 18.");
    }
    
    this.chargeGroupId = chargeGroupId;
    return this;
  }

   /**
   * Get chargeGroupId
   * @return chargeGroupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CHGPiHoKn66p3bkcNs", required = true, value = "")

  public String getChargeGroupId() {
    return chargeGroupId;
  }


  public void setChargeGroupId(String chargeGroupId) {
    
    
    if (chargeGroupId != null && chargeGroupId.length() < 18) {
      throw new IllegalArgumentException("Invalid value for chargeGroupId. Length must be greater than or equal to 18.");
    }
    this.chargeGroupId = chargeGroupId;
  }


  public Charge chargeId(String chargeId) {
    
    
    if (chargeId != null && chargeId.length() < 18) {
      throw new IllegalArgumentException("Invalid value for chargeId. Length must be greater than or equal to 18.");
    }
    
    this.chargeId = chargeId;
    return this;
  }

   /**
   * Get chargeId
   * @return chargeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CHRGiHoKn66p3bkcNs", required = true, value = "")

  public String getChargeId() {
    return chargeId;
  }


  public void setChargeId(String chargeId) {
    
    
    if (chargeId != null && chargeId.length() < 18) {
      throw new IllegalArgumentException("Invalid value for chargeId. Length must be greater than or equal to 18.");
    }
    this.chargeId = chargeId;
  }


  public Charge createdDate(OffsetDateTime createdDate) {
    
    
    if (createdDate != null && createdDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for createdDate. Length must be greater than or equal to 25.");
    }
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * The date and time when it was first created. This date and time is in UTC. Formatted as YYYY-MM-DD HH:MM:SS.
   * @return createdDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-05-07T10:17:56Z", required = true, value = "The date and time when it was first created. This date and time is in UTC. Formatted as YYYY-MM-DD HH:MM:SS.")

  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(OffsetDateTime createdDate) {
    
    
    if (createdDate != null && createdDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for createdDate. Length must be greater than or equal to 25.");
    }
    this.createdDate = createdDate;
  }


  public Charge name(String name) {
    
    
    if (name != null && name.length() < 1) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 1.");
    }
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Assault Battery", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    if (name != null && name.length() < 1) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 1.");
    }
    this.name = name;
  }


  public Charge _object(String _object) {
    
    
    if (_object != null && _object.length() < 6) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 6.");
    }
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Charge", required = true, value = "")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    if (_object != null && _object.length() < 6) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 6.");
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
   * @return the Charge instance itself
   */
  public Charge putAdditionalProperty(String key, Object value) {
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
    Charge charge = (Charge) o;
    return Objects.equals(this.chargeGroup, charge.chargeGroup) &&
        Objects.equals(this.chargeGroupId, charge.chargeGroupId) &&
        Objects.equals(this.chargeId, charge.chargeId) &&
        Objects.equals(this.createdDate, charge.createdDate) &&
        Objects.equals(this.name, charge.name) &&
        Objects.equals(this._object, charge._object)&&
        Objects.equals(this.additionalProperties, charge.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeGroup, chargeGroupId, chargeId, createdDate, name, _object, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Charge {\n");
    sb.append("    chargeGroup: ").append(toIndentedString(chargeGroup)).append("\n");
    sb.append("    chargeGroupId: ").append(toIndentedString(chargeGroupId)).append("\n");
    sb.append("    chargeId: ").append(toIndentedString(chargeId)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
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
    openapiFields.add("chargeGroup");
    openapiFields.add("chargeGroupId");
    openapiFields.add("chargeId");
    openapiFields.add("createdDate");
    openapiFields.add("name");
    openapiFields.add("object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("chargeGroup");
    openapiRequiredFields.add("chargeGroupId");
    openapiRequiredFields.add("chargeId");
    openapiRequiredFields.add("createdDate");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("object");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Charge
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Charge.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Charge is not found in the empty JSON string", Charge.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Charge.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("chargeGroup").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chargeGroup` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chargeGroup").toString()));
      }
      if (!jsonObj.get("chargeGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chargeGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chargeGroupId").toString()));
      }
      if (!jsonObj.get("chargeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chargeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chargeId").toString()));
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
       if (!Charge.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Charge' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Charge> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Charge.class));

       return (TypeAdapter<T>) new TypeAdapter<Charge>() {
           @Override
           public void write(JsonWriter out, Charge value) throws IOException {
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
           public Charge read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Charge instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Charge given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Charge
  * @throws IOException if the JSON string is invalid with respect to Charge
  */
  public static Charge fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Charge.class);
  }

 /**
  * Convert an instance of Charge to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

