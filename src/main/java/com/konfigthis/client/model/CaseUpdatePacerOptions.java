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
import com.konfigthis.client.model.CaseUpdatePacerOptionsAdditionalPageArrayInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Applicable for PACER cases.
 */
@ApiModel(description = "Applicable for PACER cases.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class CaseUpdatePacerOptions {
  public static final String SERIALIZED_NAME_ADDITIONAL_PAGE_ARRAY = "additionalPageArray";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_PAGE_ARRAY)
  private List<CaseUpdatePacerOptionsAdditionalPageArrayInner> additionalPageArray = null;

  public static final String SERIALIZED_NAME_FETCH_PARTICIPANTS_IF_OLDER_THAN_DAYS = "fetchParticipantsIfOlderThanDays";
  @SerializedName(SERIALIZED_NAME_FETCH_PARTICIPANTS_IF_OLDER_THAN_DAYS)
  private Integer fetchParticipantsIfOlderThanDays = 0;

  public static final String SERIALIZED_NAME_PACER_CLIENT_CODE = "pacerClientCode";
  @SerializedName(SERIALIZED_NAME_PACER_CLIENT_CODE)
  private String pacerClientCode;

  public static final String SERIALIZED_NAME_PACER_USER_ID = "pacerUserId";
  @SerializedName(SERIALIZED_NAME_PACER_USER_ID)
  private String pacerUserId;

  /**
   * This flag determines whether to pull only new or pull all the docket entries for a PACER case being requested.  Only one of the two values is allowed: -   fetchNewDocketEntries:     &gt;   Updates the PACER case with only new docket entries that have been added after the previous update of the case being requested. -   fetchAllDocketEntries:     &gt;   Updates the PACER case by re-parsing all dockets from #1 till latest docket entry available. 
   */
  @JsonAdapter(RefreshTypeEnum.Adapter.class)
 public enum RefreshTypeEnum {
    FETCHNEWDOCKETENTRIES("fetchNewDocketEntries"),
    
    FETCHALLDOCKETENTRIES("fetchAllDocketEntries");

    private String value;

    RefreshTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RefreshTypeEnum fromValue(String value) {
      for (RefreshTypeEnum b : RefreshTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<RefreshTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RefreshTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RefreshTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RefreshTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REFRESH_TYPE = "refreshType";
  @SerializedName(SERIALIZED_NAME_REFRESH_TYPE)
  private RefreshTypeEnum refreshType = RefreshTypeEnum.FETCHNEWDOCKETENTRIES;

  public CaseUpdatePacerOptions() {
  }

  public CaseUpdatePacerOptions additionalPageArray(List<CaseUpdatePacerOptionsAdditionalPageArrayInner> additionalPageArray) {
    
    
    
    
    this.additionalPageArray = additionalPageArray;
    return this;
  }

  public CaseUpdatePacerOptions addAdditionalPageArrayItem(CaseUpdatePacerOptionsAdditionalPageArrayInner additionalPageArrayItem) {
    if (this.additionalPageArray == null) {
      this.additionalPageArray = new ArrayList<>();
    }
    this.additionalPageArray.add(additionalPageArrayItem);
    return this;
  }

   /**
   * Currently this option is only applicable for Federal PACER cases. The default behavior of the Case Update is to fetch the Docket Report from PACER which includes the parties and attorneys too.  However if you need to fetch information for other pages in PACER you will need to specify it here. - associatedCases: &gt; This will fetch the Associated Cases page in PACER if available. This page consists of related cases especially applicable for Multi-District Litigation cases and Member Cases. Including this option will internally link all related cases in our system. Data from this page will be available via the Related Cases API. - caseSummary: &gt; This will fetch the Case Summary page in PACER if available. This page consists of additional case info which is not present in the Docket Report page. Data from this page will be structured and available as response in the Case API’s &#x60;&#x60;&#x60;additional_info&#x60;&#x60;&#x60; field. - listOfCreditors: &gt; This page will fetch the “List Of Creditors” page for PACER Bankruptcy cases of case type \&quot;bk\&quot;. Note that this page cannot be extracted for Bankruptcy cases of case type \&quot;ap\&quot; (Adversary Proceedings). This page consists of the Creditor information like the name and address of the Creditors. Data from this page will be structured and available as response in the Case API. 
   * @return additionalPageArray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"fetchIfOlderThanDays\":30,\"page\":\"associatedCases\"},{\"fetchIfOlderThanDays\":15,\"page\":\"caseSummary\"},{\"fetchIfOlderThanDays\":15,\"page\":\"listOfCreditors\"}]", value = "Currently this option is only applicable for Federal PACER cases. The default behavior of the Case Update is to fetch the Docket Report from PACER which includes the parties and attorneys too.  However if you need to fetch information for other pages in PACER you will need to specify it here. - associatedCases: > This will fetch the Associated Cases page in PACER if available. This page consists of related cases especially applicable for Multi-District Litigation cases and Member Cases. Including this option will internally link all related cases in our system. Data from this page will be available via the Related Cases API. - caseSummary: > This will fetch the Case Summary page in PACER if available. This page consists of additional case info which is not present in the Docket Report page. Data from this page will be structured and available as response in the Case API’s ```additional_info``` field. - listOfCreditors: > This page will fetch the “List Of Creditors” page for PACER Bankruptcy cases of case type \"bk\". Note that this page cannot be extracted for Bankruptcy cases of case type \"ap\" (Adversary Proceedings). This page consists of the Creditor information like the name and address of the Creditors. Data from this page will be structured and available as response in the Case API. ")

  public List<CaseUpdatePacerOptionsAdditionalPageArrayInner> getAdditionalPageArray() {
    return additionalPageArray;
  }


  public void setAdditionalPageArray(List<CaseUpdatePacerOptionsAdditionalPageArrayInner> additionalPageArray) {
    
    
    
    this.additionalPageArray = additionalPageArray;
  }


  public CaseUpdatePacerOptions fetchParticipantsIfOlderThanDays(Integer fetchParticipantsIfOlderThanDays) {
    if (fetchParticipantsIfOlderThanDays != null && fetchParticipantsIfOlderThanDays < 0) {
      throw new IllegalArgumentException("Invalid value for fetchParticipantsIfOlderThanDays. Must be greater than or equal to 0.");
    }
    if (fetchParticipantsIfOlderThanDays != null && fetchParticipantsIfOlderThanDays > 100) {
      throw new IllegalArgumentException("Invalid value for fetchParticipantsIfOlderThanDays. Must be less than or equal to 100.");
    }
    
    
    this.fetchParticipantsIfOlderThanDays = fetchParticipantsIfOlderThanDays;
    return this;
  }

   /**
   * **Currently this option is only applicable for Federal PACER cases. You can limit how often parties and attorneys for a PACER case are fetched to reduce your PACER fees. If you are tracking cases daily or hourly you could easily end up with a large PACER bill.**  **Use Case: Cases are typically updated to check for new docket entry filings. However every update to PACER case costs money. Participants for a case change less often than docket entry filings. So fetching participants for every update might result in unnecessary PACER costs; especially on cases which have a lot of parties and attorneys. So instead of getting charged the minimum cost of $0.10 for an update which might have had few docket entries, you could end up spending $3 for every update because there were a lot of parties for that case that were also fetched.**  **With this option you can choose when to fetch parties for case based on when was it last fetched.** You can limit how often this participants are fetched in a PACER case to keep your PACER costs under control.  Min days is 0 and Max days is 100.  Example: 1.  Specifying a value of 0 ensures that participants are fetched from PACER for this case update irrespective of when the participants were last fetched. 2.  Specifying a value of 30 ensures that participants are fetched from PACER for this case update only if the last fetch was older than 30 days. 
   * minimum: 0
   * maximum: 100
   * @return fetchParticipantsIfOlderThanDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30", value = "**Currently this option is only applicable for Federal PACER cases. You can limit how often parties and attorneys for a PACER case are fetched to reduce your PACER fees. If you are tracking cases daily or hourly you could easily end up with a large PACER bill.**  **Use Case: Cases are typically updated to check for new docket entry filings. However every update to PACER case costs money. Participants for a case change less often than docket entry filings. So fetching participants for every update might result in unnecessary PACER costs; especially on cases which have a lot of parties and attorneys. So instead of getting charged the minimum cost of $0.10 for an update which might have had few docket entries, you could end up spending $3 for every update because there were a lot of parties for that case that were also fetched.**  **With this option you can choose when to fetch parties for case based on when was it last fetched.** You can limit how often this participants are fetched in a PACER case to keep your PACER costs under control.  Min days is 0 and Max days is 100.  Example: 1.  Specifying a value of 0 ensures that participants are fetched from PACER for this case update irrespective of when the participants were last fetched. 2.  Specifying a value of 30 ensures that participants are fetched from PACER for this case update only if the last fetch was older than 30 days. ")

  public Integer getFetchParticipantsIfOlderThanDays() {
    return fetchParticipantsIfOlderThanDays;
  }


  public void setFetchParticipantsIfOlderThanDays(Integer fetchParticipantsIfOlderThanDays) {
    if (fetchParticipantsIfOlderThanDays != null && fetchParticipantsIfOlderThanDays < 0) {
      throw new IllegalArgumentException("Invalid value for fetchParticipantsIfOlderThanDays. Must be greater than or equal to 0.");
    }
    if (fetchParticipantsIfOlderThanDays != null && fetchParticipantsIfOlderThanDays > 100) {
      throw new IllegalArgumentException("Invalid value for fetchParticipantsIfOlderThanDays. Must be less than or equal to 100.");
    }
    
    this.fetchParticipantsIfOlderThanDays = fetchParticipantsIfOlderThanDays;
  }


  public CaseUpdatePacerOptions pacerClientCode(String pacerClientCode) {
    
    
    if (pacerClientCode != null && pacerClientCode.length() < 0) {
      throw new IllegalArgumentException("Invalid value for pacerClientCode. Length must be greater than or equal to 0.");
    }
    
    this.pacerClientCode = pacerClientCode;
    return this;
  }

   /**
   * PACER Client Code. This is mandatory if your setting in PACER website is set to True for required client code.
   * @return pacerClientCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Test UniCourt API", value = "PACER Client Code. This is mandatory if your setting in PACER website is set to True for required client code.")

  public String getPacerClientCode() {
    return pacerClientCode;
  }


  public void setPacerClientCode(String pacerClientCode) {
    
    
    if (pacerClientCode != null && pacerClientCode.length() < 0) {
      throw new IllegalArgumentException("Invalid value for pacerClientCode. Length must be greater than or equal to 0.");
    }
    this.pacerClientCode = pacerClientCode;
  }


  public CaseUpdatePacerOptions pacerUserId(String pacerUserId) {
    
    
    if (pacerUserId != null && pacerUserId.length() < 6) {
      throw new IllegalArgumentException("Invalid value for pacerUserId. Length must be greater than or equal to 6.");
    }
    
    this.pacerUserId = pacerUserId;
    return this;
  }

   /**
   * **Your PACER credentials username. This is mandatory when a PACER Case is being requested in the API. For Non PACER cases this is not mandatory. Suppose your request consists of Non PACER and PACER Cases then this needs to be passed becuase you are requesting a PACER case too.**
   * @return pacerUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "URKYwer3tyh5r56gq2", required = true, value = "**Your PACER credentials username. This is mandatory when a PACER Case is being requested in the API. For Non PACER cases this is not mandatory. Suppose your request consists of Non PACER and PACER Cases then this needs to be passed becuase you are requesting a PACER case too.**")

  public String getPacerUserId() {
    return pacerUserId;
  }


  public void setPacerUserId(String pacerUserId) {
    
    
    if (pacerUserId != null && pacerUserId.length() < 6) {
      throw new IllegalArgumentException("Invalid value for pacerUserId. Length must be greater than or equal to 6.");
    }
    this.pacerUserId = pacerUserId;
  }


  public CaseUpdatePacerOptions refreshType(RefreshTypeEnum refreshType) {
    
    
    if (refreshType != null && refreshType.length() < 21) {
      throw new IllegalArgumentException("Invalid value for refreshType. Length must be greater than or equal to 21.");
    }
    
    this.refreshType = refreshType;
    return this;
  }

   /**
   * This flag determines whether to pull only new or pull all the docket entries for a PACER case being requested.  Only one of the two values is allowed: -   fetchNewDocketEntries:     &gt;   Updates the PACER case with only new docket entries that have been added after the previous update of the case being requested. -   fetchAllDocketEntries:     &gt;   Updates the PACER case by re-parsing all dockets from #1 till latest docket entry available. 
   * @return refreshType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FETCHNEWDOCKETENTRIES", value = "This flag determines whether to pull only new or pull all the docket entries for a PACER case being requested.  Only one of the two values is allowed: -   fetchNewDocketEntries:     >   Updates the PACER case with only new docket entries that have been added after the previous update of the case being requested. -   fetchAllDocketEntries:     >   Updates the PACER case by re-parsing all dockets from #1 till latest docket entry available. ")

  public RefreshTypeEnum getRefreshType() {
    return refreshType;
  }


  public void setRefreshType(RefreshTypeEnum refreshType) {
    
    
    if (refreshType != null && refreshType.length() < 21) {
      throw new IllegalArgumentException("Invalid value for refreshType. Length must be greater than or equal to 21.");
    }
    this.refreshType = refreshType;
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
   * @return the CaseUpdatePacerOptions instance itself
   */
  public CaseUpdatePacerOptions putAdditionalProperty(String key, Object value) {
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
    CaseUpdatePacerOptions caseUpdatePacerOptions = (CaseUpdatePacerOptions) o;
    return Objects.equals(this.additionalPageArray, caseUpdatePacerOptions.additionalPageArray) &&
        Objects.equals(this.fetchParticipantsIfOlderThanDays, caseUpdatePacerOptions.fetchParticipantsIfOlderThanDays) &&
        Objects.equals(this.pacerClientCode, caseUpdatePacerOptions.pacerClientCode) &&
        Objects.equals(this.pacerUserId, caseUpdatePacerOptions.pacerUserId) &&
        Objects.equals(this.refreshType, caseUpdatePacerOptions.refreshType)&&
        Objects.equals(this.additionalProperties, caseUpdatePacerOptions.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalPageArray, fetchParticipantsIfOlderThanDays, pacerClientCode, pacerUserId, refreshType, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseUpdatePacerOptions {\n");
    sb.append("    additionalPageArray: ").append(toIndentedString(additionalPageArray)).append("\n");
    sb.append("    fetchParticipantsIfOlderThanDays: ").append(toIndentedString(fetchParticipantsIfOlderThanDays)).append("\n");
    sb.append("    pacerClientCode: ").append(toIndentedString(pacerClientCode)).append("\n");
    sb.append("    pacerUserId: ").append(toIndentedString(pacerUserId)).append("\n");
    sb.append("    refreshType: ").append(toIndentedString(refreshType)).append("\n");
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
    openapiFields.add("additionalPageArray");
    openapiFields.add("fetchParticipantsIfOlderThanDays");
    openapiFields.add("pacerClientCode");
    openapiFields.add("pacerUserId");
    openapiFields.add("refreshType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pacerUserId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CaseUpdatePacerOptions
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CaseUpdatePacerOptions.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CaseUpdatePacerOptions is not found in the empty JSON string", CaseUpdatePacerOptions.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CaseUpdatePacerOptions.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("additionalPageArray") != null && !jsonObj.get("additionalPageArray").isJsonNull()) {
        JsonArray jsonArrayadditionalPageArray = jsonObj.getAsJsonArray("additionalPageArray");
        if (jsonArrayadditionalPageArray != null) {
          // ensure the json data is an array
          if (!jsonObj.get("additionalPageArray").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `additionalPageArray` to be an array in the JSON string but got `%s`", jsonObj.get("additionalPageArray").toString()));
          }

          // validate the optional field `additionalPageArray` (array)
          for (int i = 0; i < jsonArrayadditionalPageArray.size(); i++) {
            CaseUpdatePacerOptionsAdditionalPageArrayInner.validateJsonObject(jsonArrayadditionalPageArray.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("pacerClientCode").isJsonNull() && (jsonObj.get("pacerClientCode") != null && !jsonObj.get("pacerClientCode").isJsonNull()) && !jsonObj.get("pacerClientCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pacerClientCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pacerClientCode").toString()));
      }
      if (!jsonObj.get("pacerUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pacerUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pacerUserId").toString()));
      }
      if (!jsonObj.get("refreshType").isJsonNull() && (jsonObj.get("refreshType") != null && !jsonObj.get("refreshType").isJsonNull()) && !jsonObj.get("refreshType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refreshType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refreshType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CaseUpdatePacerOptions.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CaseUpdatePacerOptions' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CaseUpdatePacerOptions> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CaseUpdatePacerOptions.class));

       return (TypeAdapter<T>) new TypeAdapter<CaseUpdatePacerOptions>() {
           @Override
           public void write(JsonWriter out, CaseUpdatePacerOptions value) throws IOException {
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
           public CaseUpdatePacerOptions read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             CaseUpdatePacerOptions instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CaseUpdatePacerOptions given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CaseUpdatePacerOptions
  * @throws IOException if the JSON string is invalid with respect to CaseUpdatePacerOptions
  */
  public static CaseUpdatePacerOptions fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CaseUpdatePacerOptions.class);
  }

 /**
  * Convert an instance of CaseUpdatePacerOptions to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
