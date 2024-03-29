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
import com.konfigthis.client.model.DocketEntryPrimaryDocuments;
import com.konfigthis.client.model.DocketEntrySecondaryDocuments;
import com.konfigthis.client.model.ReferencedDocketNumber;
import com.konfigthis.client.model.SourceStructuredData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * DocketEntry
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class DocketEntry {
  /**
   * Determines if it is the first docket entry or the last docket entry. This value will be set only for the first and last docket entry. For other docket entries it will be null. However, this will be set as single_docket_entry when the Case contains only one docket entry.
   */
  @JsonAdapter(BoundaryEnum.Adapter.class)
 public enum BoundaryEnum {
    FIRST("first"),
    
    LAST("last"),
    
    SINGLE_DOCKET_ENTRY("single_docket_entry"),
    
    NULL("null");

    private String value;

    BoundaryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BoundaryEnum fromValue(String value) {
      for (BoundaryEnum b : BoundaryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<BoundaryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BoundaryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BoundaryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BoundaryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BOUNDARY = "boundary";
  @SerializedName(SERIALIZED_NAME_BOUNDARY)
  private BoundaryEnum boundary;

  /**
   * Docket Badge helps you to know what type of a docket entry it is.
   */
  @JsonAdapter(DocketBadgeEnum.Adapter.class)
 public enum DocketBadgeEnum {
    DOCKET("DOCKET"),
    
    CHARGE("CHARGE"),
    
    HEARING("HEARING"),
    
    JUDGEMENT("JUDGEMENT"),
    
    FINANCIAL("FINANCIAL"),
    
    DISPOSITION("DISPOSITION"),
    
    SENTENCE("SENTENCE"),
    
    BOND("BOND"),
    
    BAIL("BAIL"),
    
    CAUSE_OF_ACTION("CAUSE_OF_ACTION"),
    
    ARREST("ARREST"),
    
    WARRANT("WARRANT"),
    
    SUMMON("SUMMON"),
    
    TICKLER("TICKLER"),
    
    OPINION("OPINION");

    private String value;

    DocketBadgeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocketBadgeEnum fromValue(String value) {
      for (DocketBadgeEnum b : DocketBadgeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DocketBadgeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DocketBadgeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DocketBadgeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DocketBadgeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DOCKET_BADGE = "docketBadge";
  @SerializedName(SERIALIZED_NAME_DOCKET_BADGE)
  private DocketBadgeEnum docketBadge;

  public static final String SERIALIZED_NAME_DOCKET_ENTRY_DATE = "docketEntryDate";
  @SerializedName(SERIALIZED_NAME_DOCKET_ENTRY_DATE)
  private OffsetDateTime docketEntryDate;

  public static final String SERIALIZED_NAME_DOCKET_ENTRY_PRIMARY_DOCUMENTS = "docketEntryPrimaryDocuments";
  @SerializedName(SERIALIZED_NAME_DOCKET_ENTRY_PRIMARY_DOCUMENTS)
  private DocketEntryPrimaryDocuments docketEntryPrimaryDocuments;

  public static final String SERIALIZED_NAME_DOCKET_ENTRY_SECONDARY_DOCUMENTS = "docketEntrySecondaryDocuments";
  @SerializedName(SERIALIZED_NAME_DOCKET_ENTRY_SECONDARY_DOCUMENTS)
  private DocketEntrySecondaryDocuments docketEntrySecondaryDocuments;

  public static final String SERIALIZED_NAME_DOCKET_NUMBER = "docketNumber";
  @SerializedName(SERIALIZED_NAME_DOCKET_NUMBER)
  private Integer docketNumber;

  public static final String SERIALIZED_NAME_LAST_FETCH_DATE = "lastFetchDate";
  @SerializedName(SERIALIZED_NAME_LAST_FETCH_DATE)
  private String lastFetchDate;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "DocketEntry";

  public static final String SERIALIZED_NAME_REFERENCED_DOCKET_NUMBER_ARRAY = "referencedDocketNumberArray";
  @SerializedName(SERIALIZED_NAME_REFERENCED_DOCKET_NUMBER_ARRAY)
  private List<ReferencedDocketNumber> referencedDocketNumberArray = new ArrayList<>();

  public static final String SERIALIZED_NAME_SORT_ORDER = "sortOrder";
  @SerializedName(SERIALIZED_NAME_SORT_ORDER)
  private Integer sortOrder;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_TEXT_STRUCTURED = "textStructured";
  @SerializedName(SERIALIZED_NAME_TEXT_STRUCTURED)
  private SourceStructuredData textStructured;

  public DocketEntry() {
  }

  public DocketEntry boundary(BoundaryEnum boundary) {
    
    
    
    
    this.boundary = boundary;
    return this;
  }

   /**
   * Determines if it is the first docket entry or the last docket entry. This value will be set only for the first and last docket entry. For other docket entries it will be null. However, this will be set as single_docket_entry when the Case contains only one docket entry.
   * @return boundary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "LAST", required = true, value = "Determines if it is the first docket entry or the last docket entry. This value will be set only for the first and last docket entry. For other docket entries it will be null. However, this will be set as single_docket_entry when the Case contains only one docket entry.")

  public BoundaryEnum getBoundary() {
    return boundary;
  }


  public void setBoundary(BoundaryEnum boundary) {
    
    
    
    this.boundary = boundary;
  }


  public DocketEntry docketBadge(DocketBadgeEnum docketBadge) {
    
    
    
    
    this.docketBadge = docketBadge;
    return this;
  }

   /**
   * Docket Badge helps you to know what type of a docket entry it is.
   * @return docketBadge
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "DOCKET", required = true, value = "Docket Badge helps you to know what type of a docket entry it is.")

  public DocketBadgeEnum getDocketBadge() {
    return docketBadge;
  }


  public void setDocketBadge(DocketBadgeEnum docketBadge) {
    
    
    
    this.docketBadge = docketBadge;
  }


  public DocketEntry docketEntryDate(OffsetDateTime docketEntryDate) {
    
    
    if (docketEntryDate != null && docketEntryDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for docketEntryDate. Length must be greater than or equal to 25.");
    }
    
    this.docketEntryDate = docketEntryDate;
    return this;
  }

   /**
   * Docket Action Date
   * @return docketEntryDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-04-28T11:51:27Z", required = true, value = "Docket Action Date")

  public OffsetDateTime getDocketEntryDate() {
    return docketEntryDate;
  }


  public void setDocketEntryDate(OffsetDateTime docketEntryDate) {
    
    
    if (docketEntryDate != null && docketEntryDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for docketEntryDate. Length must be greater than or equal to 25.");
    }
    this.docketEntryDate = docketEntryDate;
  }


  public DocketEntry docketEntryPrimaryDocuments(DocketEntryPrimaryDocuments docketEntryPrimaryDocuments) {
    
    
    
    
    this.docketEntryPrimaryDocuments = docketEntryPrimaryDocuments;
    return this;
  }

   /**
   * Get docketEntryPrimaryDocuments
   * @return docketEntryPrimaryDocuments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public DocketEntryPrimaryDocuments getDocketEntryPrimaryDocuments() {
    return docketEntryPrimaryDocuments;
  }


  public void setDocketEntryPrimaryDocuments(DocketEntryPrimaryDocuments docketEntryPrimaryDocuments) {
    
    
    
    this.docketEntryPrimaryDocuments = docketEntryPrimaryDocuments;
  }


  public DocketEntry docketEntrySecondaryDocuments(DocketEntrySecondaryDocuments docketEntrySecondaryDocuments) {
    
    
    
    
    this.docketEntrySecondaryDocuments = docketEntrySecondaryDocuments;
    return this;
  }

   /**
   * Get docketEntrySecondaryDocuments
   * @return docketEntrySecondaryDocuments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public DocketEntrySecondaryDocuments getDocketEntrySecondaryDocuments() {
    return docketEntrySecondaryDocuments;
  }


  public void setDocketEntrySecondaryDocuments(DocketEntrySecondaryDocuments docketEntrySecondaryDocuments) {
    
    
    
    this.docketEntrySecondaryDocuments = docketEntrySecondaryDocuments;
  }


  public DocketEntry docketNumber(Integer docketNumber) {
    
    
    
    
    this.docketNumber = docketNumber;
    return this;
  }

   /**
   * The respective docket entry number which is defined in the court website.
   * @return docketNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "204", required = true, value = "The respective docket entry number which is defined in the court website.")

  public Integer getDocketNumber() {
    return docketNumber;
  }


  public void setDocketNumber(Integer docketNumber) {
    
    
    
    this.docketNumber = docketNumber;
  }


  public DocketEntry lastFetchDate(String lastFetchDate) {
    
    
    if (lastFetchDate != null && lastFetchDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for lastFetchDate. Length must be greater than or equal to 25.");
    }
    
    this.lastFetchDate = lastFetchDate;
    return this;
  }

   /**
   * When this docket entry was last fetched from the source.
   * @return lastFetchDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2020-04-28T11:51:27.000Z", required = true, value = "When this docket entry was last fetched from the source.")

  public String getLastFetchDate() {
    return lastFetchDate;
  }


  public void setLastFetchDate(String lastFetchDate) {
    
    
    if (lastFetchDate != null && lastFetchDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for lastFetchDate. Length must be greater than or equal to 25.");
    }
    this.lastFetchDate = lastFetchDate;
  }


  public DocketEntry _object(String _object) {
    
    
    if (_object != null && _object.length() < 11) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 11.");
    }
    
    this._object = _object;
    return this;
  }

   /**
   * Name of the object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "DocketEntry", required = true, value = "Name of the object")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    if (_object != null && _object.length() < 11) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 11.");
    }
    this._object = _object;
  }


  public DocketEntry referencedDocketNumberArray(List<ReferencedDocketNumber> referencedDocketNumberArray) {
    
    
    
    
    this.referencedDocketNumberArray = referencedDocketNumberArray;
    return this;
  }

  public DocketEntry addReferencedDocketNumberArrayItem(ReferencedDocketNumber referencedDocketNumberArrayItem) {
    this.referencedDocketNumberArray.add(referencedDocketNumberArrayItem);
    return this;
  }

   /**
   * Other Docket Numbers that referenced for a particular docket entry.
   * @return referencedDocketNumberArray
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Other Docket Numbers that referenced for a particular docket entry.")

  public List<ReferencedDocketNumber> getReferencedDocketNumberArray() {
    return referencedDocketNumberArray;
  }


  public void setReferencedDocketNumberArray(List<ReferencedDocketNumber> referencedDocketNumberArray) {
    
    
    
    this.referencedDocketNumberArray = referencedDocketNumberArray;
  }


  public DocketEntry sortOrder(Integer sortOrder) {
    
    
    
    
    this.sortOrder = sortOrder;
    return this;
  }

   /**
   * Order number how the dockets have stored in UniCourt.
   * @return sortOrder
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Order number how the dockets have stored in UniCourt.")

  public Integer getSortOrder() {
    return sortOrder;
  }


  public void setSortOrder(Integer sortOrder) {
    
    
    
    this.sortOrder = sortOrder;
  }


  public DocketEntry text(String text) {
    
    
    
    
    this.text = text;
    return this;
  }

   /**
   * Source Docket Entry
   * @return text
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "STIPULATION for Extension of Time to File Answer to 01/15/2020 re Answer to Complaint (Attorney Civil Case Opening),,,,,, Crossclaim,,,,,, Counterclaim,,,,, #172 filed by Cross-Complainant TW Tedesco Properties, L.P.. (Attachments: #1 Proposed Order)(Hamrick, Alpheus) (Entered: 12/05/2019)", required = true, value = "Source Docket Entry")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    
    
    
    this.text = text;
  }


  public DocketEntry textStructured(SourceStructuredData textStructured) {
    
    
    
    
    this.textStructured = textStructured;
    return this;
  }

   /**
   * Get textStructured
   * @return textStructured
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public SourceStructuredData getTextStructured() {
    return textStructured;
  }


  public void setTextStructured(SourceStructuredData textStructured) {
    
    
    
    this.textStructured = textStructured;
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
   * @return the DocketEntry instance itself
   */
  public DocketEntry putAdditionalProperty(String key, Object value) {
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
    DocketEntry docketEntry = (DocketEntry) o;
    return Objects.equals(this.boundary, docketEntry.boundary) &&
        Objects.equals(this.docketBadge, docketEntry.docketBadge) &&
        Objects.equals(this.docketEntryDate, docketEntry.docketEntryDate) &&
        Objects.equals(this.docketEntryPrimaryDocuments, docketEntry.docketEntryPrimaryDocuments) &&
        Objects.equals(this.docketEntrySecondaryDocuments, docketEntry.docketEntrySecondaryDocuments) &&
        Objects.equals(this.docketNumber, docketEntry.docketNumber) &&
        Objects.equals(this.lastFetchDate, docketEntry.lastFetchDate) &&
        Objects.equals(this._object, docketEntry._object) &&
        Objects.equals(this.referencedDocketNumberArray, docketEntry.referencedDocketNumberArray) &&
        Objects.equals(this.sortOrder, docketEntry.sortOrder) &&
        Objects.equals(this.text, docketEntry.text) &&
        Objects.equals(this.textStructured, docketEntry.textStructured)&&
        Objects.equals(this.additionalProperties, docketEntry.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boundary, docketBadge, docketEntryDate, docketEntryPrimaryDocuments, docketEntrySecondaryDocuments, docketNumber, lastFetchDate, _object, referencedDocketNumberArray, sortOrder, text, textStructured, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocketEntry {\n");
    sb.append("    boundary: ").append(toIndentedString(boundary)).append("\n");
    sb.append("    docketBadge: ").append(toIndentedString(docketBadge)).append("\n");
    sb.append("    docketEntryDate: ").append(toIndentedString(docketEntryDate)).append("\n");
    sb.append("    docketEntryPrimaryDocuments: ").append(toIndentedString(docketEntryPrimaryDocuments)).append("\n");
    sb.append("    docketEntrySecondaryDocuments: ").append(toIndentedString(docketEntrySecondaryDocuments)).append("\n");
    sb.append("    docketNumber: ").append(toIndentedString(docketNumber)).append("\n");
    sb.append("    lastFetchDate: ").append(toIndentedString(lastFetchDate)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    referencedDocketNumberArray: ").append(toIndentedString(referencedDocketNumberArray)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    textStructured: ").append(toIndentedString(textStructured)).append("\n");
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
    openapiFields.add("boundary");
    openapiFields.add("docketBadge");
    openapiFields.add("docketEntryDate");
    openapiFields.add("docketEntryPrimaryDocuments");
    openapiFields.add("docketEntrySecondaryDocuments");
    openapiFields.add("docketNumber");
    openapiFields.add("lastFetchDate");
    openapiFields.add("object");
    openapiFields.add("referencedDocketNumberArray");
    openapiFields.add("sortOrder");
    openapiFields.add("text");
    openapiFields.add("textStructured");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("boundary");
    openapiRequiredFields.add("docketBadge");
    openapiRequiredFields.add("docketEntryDate");
    openapiRequiredFields.add("docketEntryPrimaryDocuments");
    openapiRequiredFields.add("docketEntrySecondaryDocuments");
    openapiRequiredFields.add("docketNumber");
    openapiRequiredFields.add("lastFetchDate");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("referencedDocketNumberArray");
    openapiRequiredFields.add("sortOrder");
    openapiRequiredFields.add("text");
    openapiRequiredFields.add("textStructured");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DocketEntry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DocketEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DocketEntry is not found in the empty JSON string", DocketEntry.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DocketEntry.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("boundary").isJsonNull() && !jsonObj.get("boundary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `boundary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("boundary").toString()));
      }
      if (!jsonObj.get("docketBadge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `docketBadge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("docketBadge").toString()));
      }
      // validate the required field `docketEntryPrimaryDocuments`
      DocketEntryPrimaryDocuments.validateJsonObject(jsonObj.getAsJsonObject("docketEntryPrimaryDocuments"));
      // validate the required field `docketEntrySecondaryDocuments`
      DocketEntrySecondaryDocuments.validateJsonObject(jsonObj.getAsJsonObject("docketEntrySecondaryDocuments"));
      if (!jsonObj.get("lastFetchDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastFetchDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastFetchDate").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("referencedDocketNumberArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `referencedDocketNumberArray` to be an array in the JSON string but got `%s`", jsonObj.get("referencedDocketNumberArray").toString()));
      }

      JsonArray jsonArrayreferencedDocketNumberArray = jsonObj.getAsJsonArray("referencedDocketNumberArray");
      // validate the required field `referencedDocketNumberArray` (array)
      for (int i = 0; i < jsonArrayreferencedDocketNumberArray.size(); i++) {
        ReferencedDocketNumber.validateJsonObject(jsonArrayreferencedDocketNumberArray.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      // validate the required field `textStructured`
      SourceStructuredData.validateJsonObject(jsonObj.getAsJsonObject("textStructured"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DocketEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DocketEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DocketEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DocketEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<DocketEntry>() {
           @Override
           public void write(JsonWriter out, DocketEntry value) throws IOException {
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
           public DocketEntry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             DocketEntry instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of DocketEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DocketEntry
  * @throws IOException if the JSON string is invalid with respect to DocketEntry
  */
  public static DocketEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DocketEntry.class);
  }

 /**
  * Convert an instance of DocketEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

