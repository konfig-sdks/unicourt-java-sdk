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
 * PossibleNormAttorneyScoreConstituents
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PossibleNormAttorneyScoreConstituents {
  /**
   * Gets or Sets address
   */
  @JsonAdapter(AddressEnum.Adapter.class)
 public enum AddressEnum {
    MATCHED("Matched"),
    
    MISMATCHED("Mismatched"),
    
    NOT_PROVIDED_BY_DATA_SOURCE("Not_Provided_By_Data_Source");

    private String value;

    AddressEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AddressEnum fromValue(String value) {
      for (AddressEnum b : AddressEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AddressEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AddressEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AddressEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AddressEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private AddressEnum address;

  /**
   * Gets or Sets barId
   */
  @JsonAdapter(BarIdEnum.Adapter.class)
 public enum BarIdEnum {
    MATCHED("Matched"),
    
    MISMATCHED("Mismatched"),
    
    NOT_PROVIDED_BY_DATA_SOURCE("Not_Provided_By_Data_Source");

    private String value;

    BarIdEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BarIdEnum fromValue(String value) {
      for (BarIdEnum b : BarIdEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BarIdEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BarIdEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BarIdEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BarIdEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BAR_ID = "barId";
  @SerializedName(SERIALIZED_NAME_BAR_ID)
  private BarIdEnum barId;

  /**
   * Gets or Sets email
   */
  @JsonAdapter(EmailEnum.Adapter.class)
 public enum EmailEnum {
    MATCHED("Matched"),
    
    MISMATCHED("Mismatched"),
    
    NOT_PROVIDED_BY_DATA_SOURCE("Not_Provided_By_Data_Source");

    private String value;

    EmailEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EmailEnum fromValue(String value) {
      for (EmailEnum b : EmailEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EmailEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EmailEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EmailEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EmailEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private EmailEnum email;

  /**
   * Gets or Sets lawFirm
   */
  @JsonAdapter(LawFirmEnum.Adapter.class)
 public enum LawFirmEnum {
    MATCHED("Matched"),
    
    MISMATCHED("Mismatched"),
    
    NOT_PROVIDED_BY_DATA_SOURCE("Not_Provided_By_Data_Source");

    private String value;

    LawFirmEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LawFirmEnum fromValue(String value) {
      for (LawFirmEnum b : LawFirmEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LawFirmEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LawFirmEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LawFirmEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LawFirmEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LAW_FIRM = "lawFirm";
  @SerializedName(SERIALIZED_NAME_LAW_FIRM)
  private LawFirmEnum lawFirm;

  public static final String SERIALIZED_NAME_NAME_SIMILARITY_SCORE = "nameSimilarityScore";
  @SerializedName(SERIALIZED_NAME_NAME_SIMILARITY_SCORE)
  private Float nameSimilarityScore;

  public static final String SERIALIZED_NAME_OTHER_POTENTIAL_NORM_ATTORNEYS = "otherPotentialNormAttorneys";
  @SerializedName(SERIALIZED_NAME_OTHER_POTENTIAL_NORM_ATTORNEYS)
  private Integer otherPotentialNormAttorneys;

  /**
   * Gets or Sets phone
   */
  @JsonAdapter(PhoneEnum.Adapter.class)
 public enum PhoneEnum {
    MATCHED("Matched"),
    
    MISMATCHED("Mismatched"),
    
    NOT_PROVIDED_BY_DATA_SOURCE("Not_Provided_By_Data_Source");

    private String value;

    PhoneEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PhoneEnum fromValue(String value) {
      for (PhoneEnum b : PhoneEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PhoneEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PhoneEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PhoneEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PhoneEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private PhoneEnum phone;

  public PossibleNormAttorneyScoreConstituents() {
  }

  public PossibleNormAttorneyScoreConstituents address(AddressEnum address) {
    
    
    
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AddressEnum getAddress() {
    return address;
  }


  public void setAddress(AddressEnum address) {
    
    
    
    this.address = address;
  }


  public PossibleNormAttorneyScoreConstituents barId(BarIdEnum barId) {
    
    
    
    
    this.barId = barId;
    return this;
  }

   /**
   * Get barId
   * @return barId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BarIdEnum getBarId() {
    return barId;
  }


  public void setBarId(BarIdEnum barId) {
    
    
    
    this.barId = barId;
  }


  public PossibleNormAttorneyScoreConstituents email(EmailEnum email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public EmailEnum getEmail() {
    return email;
  }


  public void setEmail(EmailEnum email) {
    
    
    
    this.email = email;
  }


  public PossibleNormAttorneyScoreConstituents lawFirm(LawFirmEnum lawFirm) {
    
    
    
    
    this.lawFirm = lawFirm;
    return this;
  }

   /**
   * Get lawFirm
   * @return lawFirm
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LawFirmEnum getLawFirm() {
    return lawFirm;
  }


  public void setLawFirm(LawFirmEnum lawFirm) {
    
    
    
    this.lawFirm = lawFirm;
  }


  public PossibleNormAttorneyScoreConstituents nameSimilarityScore(Float nameSimilarityScore) {
    
    
    
    
    this.nameSimilarityScore = nameSimilarityScore;
    return this;
  }

   /**
   * Get nameSimilarityScore
   * @return nameSimilarityScore
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Float getNameSimilarityScore() {
    return nameSimilarityScore;
  }


  public void setNameSimilarityScore(Float nameSimilarityScore) {
    
    
    
    this.nameSimilarityScore = nameSimilarityScore;
  }


  public PossibleNormAttorneyScoreConstituents otherPotentialNormAttorneys(Integer otherPotentialNormAttorneys) {
    
    
    
    
    this.otherPotentialNormAttorneys = otherPotentialNormAttorneys;
    return this;
  }

   /**
   * Get otherPotentialNormAttorneys
   * @return otherPotentialNormAttorneys
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getOtherPotentialNormAttorneys() {
    return otherPotentialNormAttorneys;
  }


  public void setOtherPotentialNormAttorneys(Integer otherPotentialNormAttorneys) {
    
    
    
    this.otherPotentialNormAttorneys = otherPotentialNormAttorneys;
  }


  public PossibleNormAttorneyScoreConstituents phone(PhoneEnum phone) {
    
    
    
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PhoneEnum getPhone() {
    return phone;
  }


  public void setPhone(PhoneEnum phone) {
    
    
    
    this.phone = phone;
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
   * @return the PossibleNormAttorneyScoreConstituents instance itself
   */
  public PossibleNormAttorneyScoreConstituents putAdditionalProperty(String key, Object value) {
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
    PossibleNormAttorneyScoreConstituents possibleNormAttorneyScoreConstituents = (PossibleNormAttorneyScoreConstituents) o;
    return Objects.equals(this.address, possibleNormAttorneyScoreConstituents.address) &&
        Objects.equals(this.barId, possibleNormAttorneyScoreConstituents.barId) &&
        Objects.equals(this.email, possibleNormAttorneyScoreConstituents.email) &&
        Objects.equals(this.lawFirm, possibleNormAttorneyScoreConstituents.lawFirm) &&
        Objects.equals(this.nameSimilarityScore, possibleNormAttorneyScoreConstituents.nameSimilarityScore) &&
        Objects.equals(this.otherPotentialNormAttorneys, possibleNormAttorneyScoreConstituents.otherPotentialNormAttorneys) &&
        Objects.equals(this.phone, possibleNormAttorneyScoreConstituents.phone)&&
        Objects.equals(this.additionalProperties, possibleNormAttorneyScoreConstituents.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, barId, email, lawFirm, nameSimilarityScore, otherPotentialNormAttorneys, phone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PossibleNormAttorneyScoreConstituents {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    barId: ").append(toIndentedString(barId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    lawFirm: ").append(toIndentedString(lawFirm)).append("\n");
    sb.append("    nameSimilarityScore: ").append(toIndentedString(nameSimilarityScore)).append("\n");
    sb.append("    otherPotentialNormAttorneys: ").append(toIndentedString(otherPotentialNormAttorneys)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("barId");
    openapiFields.add("email");
    openapiFields.add("lawFirm");
    openapiFields.add("nameSimilarityScore");
    openapiFields.add("otherPotentialNormAttorneys");
    openapiFields.add("phone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("address");
    openapiRequiredFields.add("barId");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("lawFirm");
    openapiRequiredFields.add("nameSimilarityScore");
    openapiRequiredFields.add("otherPotentialNormAttorneys");
    openapiRequiredFields.add("phone");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PossibleNormAttorneyScoreConstituents
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PossibleNormAttorneyScoreConstituents.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PossibleNormAttorneyScoreConstituents is not found in the empty JSON string", PossibleNormAttorneyScoreConstituents.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PossibleNormAttorneyScoreConstituents.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (!jsonObj.get("barId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `barId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("barId").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (!jsonObj.get("lawFirm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lawFirm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lawFirm").toString()));
      }
      if (!jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PossibleNormAttorneyScoreConstituents.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PossibleNormAttorneyScoreConstituents' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PossibleNormAttorneyScoreConstituents> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PossibleNormAttorneyScoreConstituents.class));

       return (TypeAdapter<T>) new TypeAdapter<PossibleNormAttorneyScoreConstituents>() {
           @Override
           public void write(JsonWriter out, PossibleNormAttorneyScoreConstituents value) throws IOException {
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
           public PossibleNormAttorneyScoreConstituents read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PossibleNormAttorneyScoreConstituents instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PossibleNormAttorneyScoreConstituents given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PossibleNormAttorneyScoreConstituents
  * @throws IOException if the JSON string is invalid with respect to PossibleNormAttorneyScoreConstituents
  */
  public static PossibleNormAttorneyScoreConstituents fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PossibleNormAttorneyScoreConstituents.class);
  }

 /**
  * Convert an instance of PossibleNormAttorneyScoreConstituents to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

