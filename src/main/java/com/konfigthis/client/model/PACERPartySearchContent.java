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
import com.konfigthis.client.model.PACERCaseSearchContent;
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
 * PACERPartySearchContent
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PACERPartySearchContent {
  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "PACERPartySearchContent";

  public static final String SERIALIZED_NAME_PCL_CASE_ID = "pclCaseId";
  @SerializedName(SERIALIZED_NAME_PCL_CASE_ID)
  private Integer pclCaseId;

  public static final String SERIALIZED_NAME_PCL_CASE_NUMBER = "pclCaseNumber";
  @SerializedName(SERIALIZED_NAME_PCL_CASE_NUMBER)
  private Integer pclCaseNumber;

  public static final String SERIALIZED_NAME_PCL_CASE_NUMBER_FULL = "pclCaseNumberFull";
  @SerializedName(SERIALIZED_NAME_PCL_CASE_NUMBER_FULL)
  private String pclCaseNumberFull;

  public static final String SERIALIZED_NAME_PCL_CASE_OFFICE = "pclCaseOffice";
  @SerializedName(SERIALIZED_NAME_PCL_CASE_OFFICE)
  private String pclCaseOffice;

  public static final String SERIALIZED_NAME_PCL_CASE_TITLE = "pclCaseTitle";
  @SerializedName(SERIALIZED_NAME_PCL_CASE_TITLE)
  private String pclCaseTitle;

  public static final String SERIALIZED_NAME_PCL_CASE_TYPE = "pclCaseType";
  @SerializedName(SERIALIZED_NAME_PCL_CASE_TYPE)
  private String pclCaseType;

  public static final String SERIALIZED_NAME_PCL_CASE_YEAR = "pclCaseYear";
  @SerializedName(SERIALIZED_NAME_PCL_CASE_YEAR)
  private Integer pclCaseYear;

  public static final String SERIALIZED_NAME_PCL_COURT_CASE = "pclCourtCase";
  @SerializedName(SERIALIZED_NAME_PCL_COURT_CASE)
  private PACERCaseSearchContent pclCourtCase;

  public static final String SERIALIZED_NAME_PCL_COURT_ID = "pclCourtId";
  @SerializedName(SERIALIZED_NAME_PCL_COURT_ID)
  private String pclCourtId;

  public static final String SERIALIZED_NAME_PCL_DATE_FILED = "pclDateFiled";
  @SerializedName(SERIALIZED_NAME_PCL_DATE_FILED)
  private String pclDateFiled;

  public static final String SERIALIZED_NAME_PCL_FIRST_NAME = "pclFirstName";
  @SerializedName(SERIALIZED_NAME_PCL_FIRST_NAME)
  private String pclFirstName;

  public static final String SERIALIZED_NAME_PCL_GENERATION = "pclGeneration";
  @SerializedName(SERIALIZED_NAME_PCL_GENERATION)
  private String pclGeneration;

  /**
   * Link to case in the case management/electronic case files (CM/ECF) system at the court.
   */
  @JsonAdapter(PclJurisdictionTypeEnum.Adapter.class)
 public enum PclJurisdictionTypeEnum {
    APPELLATE("Appellate"),
    
    BANKRUPTCY("Bankruptcy"),
    
    CRIMINAL("Criminal"),
    
    CIVIL("Civil"),
    
    MULTI_DISTRICT_LITIGATION("Multi-district Litigation");

    private String value;

    PclJurisdictionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PclJurisdictionTypeEnum fromValue(String value) {
      for (PclJurisdictionTypeEnum b : PclJurisdictionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PclJurisdictionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PclJurisdictionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PclJurisdictionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PclJurisdictionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PCL_JURISDICTION_TYPE = "pclJurisdictionType";
  @SerializedName(SERIALIZED_NAME_PCL_JURISDICTION_TYPE)
  private PclJurisdictionTypeEnum pclJurisdictionType;

  public static final String SERIALIZED_NAME_PCL_LAST_NAME = "pclLastName";
  @SerializedName(SERIALIZED_NAME_PCL_LAST_NAME)
  private String pclLastName;

  public static final String SERIALIZED_NAME_PCL_MIDDLE_NAME = "pclMiddleName";
  @SerializedName(SERIALIZED_NAME_PCL_MIDDLE_NAME)
  private String pclMiddleName;

  public static final String SERIALIZED_NAME_PCL_PARTY_ROLE = "pclPartyRole";
  @SerializedName(SERIALIZED_NAME_PCL_PARTY_ROLE)
  private String pclPartyRole;

  public static final String SERIALIZED_NAME_PCL_PARTY_TYPE = "pclPartyType";
  @SerializedName(SERIALIZED_NAME_PCL_PARTY_TYPE)
  private String pclPartyType;

  public PACERPartySearchContent() {
  }

  public PACERPartySearchContent _object(String _object) {
    
    
    if (_object != null && _object.length() < 23) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 23.");
    }
    
    this._object = _object;
    return this;
  }

   /**
   * Name of the object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "PACERPartySearchContent", required = true, value = "Name of the object")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    if (_object != null && _object.length() < 23) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 23.");
    }
    this._object = _object;
  }


  public PACERPartySearchContent pclCaseId(Integer pclCaseId) {
    
    
    
    
    this.pclCaseId = pclCaseId;
    return this;
  }

   /**
   * Sequentially generated number that identifies the case.
   * @return pclCaseId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12569", required = true, value = "Sequentially generated number that identifies the case.")

  public Integer getPclCaseId() {
    return pclCaseId;
  }


  public void setPclCaseId(Integer pclCaseId) {
    
    
    
    this.pclCaseId = pclCaseId;
  }


  public PACERPartySearchContent pclCaseNumber(Integer pclCaseNumber) {
    
    
    
    
    this.pclCaseNumber = pclCaseNumber;
    return this;
  }

   /**
   * The sequence number of the case.
   * @return pclCaseNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "96", required = true, value = "The sequence number of the case.")

  public Integer getPclCaseNumber() {
    return pclCaseNumber;
  }


  public void setPclCaseNumber(Integer pclCaseNumber) {
    
    
    
    this.pclCaseNumber = pclCaseNumber;
  }


  public PACERPartySearchContent pclCaseNumberFull(String pclCaseNumberFull) {
    
    
    
    
    this.pclCaseNumberFull = pclCaseNumberFull;
    return this;
  }

   /**
   * Case Number.
   * @return pclCaseNumberFull
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1:2002cv00096", required = true, value = "Case Number.")

  public String getPclCaseNumberFull() {
    return pclCaseNumberFull;
  }


  public void setPclCaseNumberFull(String pclCaseNumberFull) {
    
    
    
    this.pclCaseNumberFull = pclCaseNumberFull;
  }


  public PACERPartySearchContent pclCaseOffice(String pclCaseOffice) {
    
    
    
    
    this.pclCaseOffice = pclCaseOffice;
    return this;
  }

   /**
   * The divisional office in which the case was filed.
   * @return pclCaseOffice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", required = true, value = "The divisional office in which the case was filed.")

  public String getPclCaseOffice() {
    return pclCaseOffice;
  }


  public void setPclCaseOffice(String pclCaseOffice) {
    
    
    
    this.pclCaseOffice = pclCaseOffice;
  }


  public PACERPartySearchContent pclCaseTitle(String pclCaseTitle) {
    
    
    
    
    this.pclCaseTitle = pclCaseTitle;
    return this;
  }

   /**
   * Title of the case.
   * @return pclCaseTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "James Kelly v. Maria Poole", required = true, value = "Title of the case.")

  public String getPclCaseTitle() {
    return pclCaseTitle;
  }


  public void setPclCaseTitle(String pclCaseTitle) {
    
    
    
    this.pclCaseTitle = pclCaseTitle;
  }


  public PACERPartySearchContent pclCaseType(String pclCaseType) {
    
    
    
    
    this.pclCaseType = pclCaseType;
    return this;
  }

   /**
   * Code that identifies the type of case.
   * @return pclCaseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cv", required = true, value = "Code that identifies the type of case.")

  public String getPclCaseType() {
    return pclCaseType;
  }


  public void setPclCaseType(String pclCaseType) {
    
    
    
    this.pclCaseType = pclCaseType;
  }


  public PACERPartySearchContent pclCaseYear(Integer pclCaseYear) {
    
    
    
    
    this.pclCaseYear = pclCaseYear;
    return this;
  }

   /**
   * The year in which the case falls. Could be two or four digit.
   * @return pclCaseYear
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2002", required = true, value = "The year in which the case falls. Could be two or four digit.")

  public Integer getPclCaseYear() {
    return pclCaseYear;
  }


  public void setPclCaseYear(Integer pclCaseYear) {
    
    
    
    this.pclCaseYear = pclCaseYear;
  }


  public PACERPartySearchContent pclCourtCase(PACERCaseSearchContent pclCourtCase) {
    
    
    
    
    this.pclCourtCase = pclCourtCase;
    return this;
  }

   /**
   * Get pclCourtCase
   * @return pclCourtCase
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PACERCaseSearchContent getPclCourtCase() {
    return pclCourtCase;
  }


  public void setPclCourtCase(PACERCaseSearchContent pclCourtCase) {
    
    
    
    this.pclCourtCase = pclCourtCase;
  }


  public PACERPartySearchContent pclCourtId(String pclCourtId) {
    
    
    
    
    this.pclCourtId = pclCourtId;
    return this;
  }

   /**
   * The general geographical region or specific court district. The court ID is the abbreviation of the court location combined with the court type (dc or bk). Please refer the Appendix B
   * @return pclCourtId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "jpmldc", required = true, value = "The general geographical region or specific court district. The court ID is the abbreviation of the court location combined with the court type (dc or bk). Please refer the Appendix B")

  public String getPclCourtId() {
    return pclCourtId;
  }


  public void setPclCourtId(String pclCourtId) {
    
    
    
    this.pclCourtId = pclCourtId;
  }


  public PACERPartySearchContent pclDateFiled(String pclDateFiled) {
    
    
    
    
    this.pclDateFiled = pclDateFiled;
    return this;
  }

   /**
   * Filing date of the case.
   * @return pclDateFiled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2002-08-15T00:00:00.000Z", required = true, value = "Filing date of the case.")

  public String getPclDateFiled() {
    return pclDateFiled;
  }


  public void setPclDateFiled(String pclDateFiled) {
    
    
    
    this.pclDateFiled = pclDateFiled;
  }


  public PACERPartySearchContent pclFirstName(String pclFirstName) {
    
    
    
    
    this.pclFirstName = pclFirstName;
    return this;
  }

   /**
   * This parameter represents the first name of the case when it is present
   * @return pclFirstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "William", required = true, value = "This parameter represents the first name of the case when it is present")

  public String getPclFirstName() {
    return pclFirstName;
  }


  public void setPclFirstName(String pclFirstName) {
    
    
    
    this.pclFirstName = pclFirstName;
  }


  public PACERPartySearchContent pclGeneration(String pclGeneration) {
    
    
    
    
    this.pclGeneration = pclGeneration;
    return this;
  }

   /**
   * This parameter represents the generation of the case when it is present
   * @return pclGeneration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "jr", required = true, value = "This parameter represents the generation of the case when it is present")

  public String getPclGeneration() {
    return pclGeneration;
  }


  public void setPclGeneration(String pclGeneration) {
    
    
    
    this.pclGeneration = pclGeneration;
  }


  public PACERPartySearchContent pclJurisdictionType(PclJurisdictionTypeEnum pclJurisdictionType) {
    
    
    
    
    this.pclJurisdictionType = pclJurisdictionType;
    return this;
  }

   /**
   * Link to case in the case management/electronic case files (CM/ECF) system at the court.
   * @return pclJurisdictionType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "APPELLATE", required = true, value = "Link to case in the case management/electronic case files (CM/ECF) system at the court.")

  public PclJurisdictionTypeEnum getPclJurisdictionType() {
    return pclJurisdictionType;
  }


  public void setPclJurisdictionType(PclJurisdictionTypeEnum pclJurisdictionType) {
    
    
    
    this.pclJurisdictionType = pclJurisdictionType;
  }


  public PACERPartySearchContent pclLastName(String pclLastName) {
    
    
    
    
    this.pclLastName = pclLastName;
    return this;
  }

   /**
   * This parameter represents the last name of the case when it is present
   * @return pclLastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Smith", required = true, value = "This parameter represents the last name of the case when it is present")

  public String getPclLastName() {
    return pclLastName;
  }


  public void setPclLastName(String pclLastName) {
    
    
    
    this.pclLastName = pclLastName;
  }


  public PACERPartySearchContent pclMiddleName(String pclMiddleName) {
    
    
    
    
    this.pclMiddleName = pclMiddleName;
    return this;
  }

   /**
   * This parameter represents the middle name of the case when it is present
   * @return pclMiddleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Steven", required = true, value = "This parameter represents the middle name of the case when it is present")

  public String getPclMiddleName() {
    return pclMiddleName;
  }


  public void setPclMiddleName(String pclMiddleName) {
    
    
    
    this.pclMiddleName = pclMiddleName;
  }


  public PACERPartySearchContent pclPartyRole(String pclPartyRole) {
    
    
    
    
    this.pclPartyRole = pclPartyRole;
    return this;
  }

   /**
   * This parameter represents the party role of the case when it is present
   * @return pclPartyRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "dft", required = true, value = "This parameter represents the party role of the case when it is present")

  public String getPclPartyRole() {
    return pclPartyRole;
  }


  public void setPclPartyRole(String pclPartyRole) {
    
    
    
    this.pclPartyRole = pclPartyRole;
  }


  public PACERPartySearchContent pclPartyType(String pclPartyType) {
    
    
    
    
    this.pclPartyType = pclPartyType;
    return this;
  }

   /**
   * This parameter represents the party type of the case when it is present
   * @return pclPartyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "pty", required = true, value = "This parameter represents the party type of the case when it is present")

  public String getPclPartyType() {
    return pclPartyType;
  }


  public void setPclPartyType(String pclPartyType) {
    
    
    
    this.pclPartyType = pclPartyType;
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
   * @return the PACERPartySearchContent instance itself
   */
  public PACERPartySearchContent putAdditionalProperty(String key, Object value) {
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
    PACERPartySearchContent paCERPartySearchContent = (PACERPartySearchContent) o;
    return Objects.equals(this._object, paCERPartySearchContent._object) &&
        Objects.equals(this.pclCaseId, paCERPartySearchContent.pclCaseId) &&
        Objects.equals(this.pclCaseNumber, paCERPartySearchContent.pclCaseNumber) &&
        Objects.equals(this.pclCaseNumberFull, paCERPartySearchContent.pclCaseNumberFull) &&
        Objects.equals(this.pclCaseOffice, paCERPartySearchContent.pclCaseOffice) &&
        Objects.equals(this.pclCaseTitle, paCERPartySearchContent.pclCaseTitle) &&
        Objects.equals(this.pclCaseType, paCERPartySearchContent.pclCaseType) &&
        Objects.equals(this.pclCaseYear, paCERPartySearchContent.pclCaseYear) &&
        Objects.equals(this.pclCourtCase, paCERPartySearchContent.pclCourtCase) &&
        Objects.equals(this.pclCourtId, paCERPartySearchContent.pclCourtId) &&
        Objects.equals(this.pclDateFiled, paCERPartySearchContent.pclDateFiled) &&
        Objects.equals(this.pclFirstName, paCERPartySearchContent.pclFirstName) &&
        Objects.equals(this.pclGeneration, paCERPartySearchContent.pclGeneration) &&
        Objects.equals(this.pclJurisdictionType, paCERPartySearchContent.pclJurisdictionType) &&
        Objects.equals(this.pclLastName, paCERPartySearchContent.pclLastName) &&
        Objects.equals(this.pclMiddleName, paCERPartySearchContent.pclMiddleName) &&
        Objects.equals(this.pclPartyRole, paCERPartySearchContent.pclPartyRole) &&
        Objects.equals(this.pclPartyType, paCERPartySearchContent.pclPartyType)&&
        Objects.equals(this.additionalProperties, paCERPartySearchContent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, pclCaseId, pclCaseNumber, pclCaseNumberFull, pclCaseOffice, pclCaseTitle, pclCaseType, pclCaseYear, pclCourtCase, pclCourtId, pclDateFiled, pclFirstName, pclGeneration, pclJurisdictionType, pclLastName, pclMiddleName, pclPartyRole, pclPartyType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PACERPartySearchContent {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    pclCaseId: ").append(toIndentedString(pclCaseId)).append("\n");
    sb.append("    pclCaseNumber: ").append(toIndentedString(pclCaseNumber)).append("\n");
    sb.append("    pclCaseNumberFull: ").append(toIndentedString(pclCaseNumberFull)).append("\n");
    sb.append("    pclCaseOffice: ").append(toIndentedString(pclCaseOffice)).append("\n");
    sb.append("    pclCaseTitle: ").append(toIndentedString(pclCaseTitle)).append("\n");
    sb.append("    pclCaseType: ").append(toIndentedString(pclCaseType)).append("\n");
    sb.append("    pclCaseYear: ").append(toIndentedString(pclCaseYear)).append("\n");
    sb.append("    pclCourtCase: ").append(toIndentedString(pclCourtCase)).append("\n");
    sb.append("    pclCourtId: ").append(toIndentedString(pclCourtId)).append("\n");
    sb.append("    pclDateFiled: ").append(toIndentedString(pclDateFiled)).append("\n");
    sb.append("    pclFirstName: ").append(toIndentedString(pclFirstName)).append("\n");
    sb.append("    pclGeneration: ").append(toIndentedString(pclGeneration)).append("\n");
    sb.append("    pclJurisdictionType: ").append(toIndentedString(pclJurisdictionType)).append("\n");
    sb.append("    pclLastName: ").append(toIndentedString(pclLastName)).append("\n");
    sb.append("    pclMiddleName: ").append(toIndentedString(pclMiddleName)).append("\n");
    sb.append("    pclPartyRole: ").append(toIndentedString(pclPartyRole)).append("\n");
    sb.append("    pclPartyType: ").append(toIndentedString(pclPartyType)).append("\n");
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
    openapiFields.add("object");
    openapiFields.add("pclCaseId");
    openapiFields.add("pclCaseNumber");
    openapiFields.add("pclCaseNumberFull");
    openapiFields.add("pclCaseOffice");
    openapiFields.add("pclCaseTitle");
    openapiFields.add("pclCaseType");
    openapiFields.add("pclCaseYear");
    openapiFields.add("pclCourtCase");
    openapiFields.add("pclCourtId");
    openapiFields.add("pclDateFiled");
    openapiFields.add("pclFirstName");
    openapiFields.add("pclGeneration");
    openapiFields.add("pclJurisdictionType");
    openapiFields.add("pclLastName");
    openapiFields.add("pclMiddleName");
    openapiFields.add("pclPartyRole");
    openapiFields.add("pclPartyType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("pclCaseId");
    openapiRequiredFields.add("pclCaseNumber");
    openapiRequiredFields.add("pclCaseNumberFull");
    openapiRequiredFields.add("pclCaseOffice");
    openapiRequiredFields.add("pclCaseTitle");
    openapiRequiredFields.add("pclCaseType");
    openapiRequiredFields.add("pclCaseYear");
    openapiRequiredFields.add("pclCourtCase");
    openapiRequiredFields.add("pclCourtId");
    openapiRequiredFields.add("pclDateFiled");
    openapiRequiredFields.add("pclFirstName");
    openapiRequiredFields.add("pclGeneration");
    openapiRequiredFields.add("pclJurisdictionType");
    openapiRequiredFields.add("pclLastName");
    openapiRequiredFields.add("pclMiddleName");
    openapiRequiredFields.add("pclPartyRole");
    openapiRequiredFields.add("pclPartyType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PACERPartySearchContent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PACERPartySearchContent.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PACERPartySearchContent is not found in the empty JSON string", PACERPartySearchContent.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PACERPartySearchContent.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if (!jsonObj.get("pclCaseNumberFull").isJsonNull() && !jsonObj.get("pclCaseNumberFull").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pclCaseNumberFull` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pclCaseNumberFull").toString()));
      }
      if (!jsonObj.get("pclCaseOffice").isJsonNull() && !jsonObj.get("pclCaseOffice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pclCaseOffice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pclCaseOffice").toString()));
      }
      if (!jsonObj.get("pclCaseTitle").isJsonNull() && !jsonObj.get("pclCaseTitle").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pclCaseTitle` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pclCaseTitle").toString()));
      }
      if (!jsonObj.get("pclCaseType").isJsonNull() && !jsonObj.get("pclCaseType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pclCaseType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pclCaseType").toString()));
      }
      // validate the required field `pclCourtCase`
      PACERCaseSearchContent.validateJsonObject(jsonObj.getAsJsonObject("pclCourtCase"));
      if (!jsonObj.get("pclCourtId").isJsonNull() && !jsonObj.get("pclCourtId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pclCourtId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pclCourtId").toString()));
      }
      if (!jsonObj.get("pclDateFiled").isJsonNull() && !jsonObj.get("pclDateFiled").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pclDateFiled` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pclDateFiled").toString()));
      }
      if (!jsonObj.get("pclFirstName").isJsonNull() && !jsonObj.get("pclFirstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pclFirstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pclFirstName").toString()));
      }
      if (!jsonObj.get("pclGeneration").isJsonNull() && !jsonObj.get("pclGeneration").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pclGeneration` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pclGeneration").toString()));
      }
      if (!jsonObj.get("pclJurisdictionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pclJurisdictionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pclJurisdictionType").toString()));
      }
      if (!jsonObj.get("pclLastName").isJsonNull() && !jsonObj.get("pclLastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pclLastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pclLastName").toString()));
      }
      if (!jsonObj.get("pclMiddleName").isJsonNull() && !jsonObj.get("pclMiddleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pclMiddleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pclMiddleName").toString()));
      }
      if (!jsonObj.get("pclPartyRole").isJsonNull() && !jsonObj.get("pclPartyRole").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pclPartyRole` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pclPartyRole").toString()));
      }
      if (!jsonObj.get("pclPartyType").isJsonNull() && !jsonObj.get("pclPartyType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pclPartyType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pclPartyType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PACERPartySearchContent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PACERPartySearchContent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PACERPartySearchContent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PACERPartySearchContent.class));

       return (TypeAdapter<T>) new TypeAdapter<PACERPartySearchContent>() {
           @Override
           public void write(JsonWriter out, PACERPartySearchContent value) throws IOException {
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
           public PACERPartySearchContent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PACERPartySearchContent instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PACERPartySearchContent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PACERPartySearchContent
  * @throws IOException if the JSON string is invalid with respect to PACERPartySearchContent
  */
  public static PACERPartySearchContent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PACERPartySearchContent.class);
  }

 /**
  * Convert an instance of PACERPartySearchContent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
