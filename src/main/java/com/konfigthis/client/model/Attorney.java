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
import com.konfigthis.client.model.AttorneyLawFirm;
import com.konfigthis.client.model.AttorneyType;
import com.konfigthis.client.model.Contact;
import com.konfigthis.client.model.PartyAttorneyAssociations;
import com.konfigthis.client.model.PossibleNormAttorney;
import com.konfigthis.client.model.PossibleNormLawFirm;
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
 * Attorney
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Attorney {
  public static final String SERIALIZED_NAME_ATTORNEY_ID = "attorneyId";
  @SerializedName(SERIALIZED_NAME_ATTORNEY_ID)
  private String attorneyId;

  public static final String SERIALIZED_NAME_ATTORNEY_LAW_FIRM_ARRAY = "attorneyLawFirmArray";
  @SerializedName(SERIALIZED_NAME_ATTORNEY_LAW_FIRM_ARRAY)
  private List<AttorneyLawFirm> attorneyLawFirmArray = new ArrayList<>();

  public static final String SERIALIZED_NAME_ATTORNEY_TYPE = "attorneyType";
  @SerializedName(SERIALIZED_NAME_ATTORNEY_TYPE)
  private AttorneyType attorneyType;

  public static final String SERIALIZED_NAME_BAR_NUMBER = "barNumber";
  @SerializedName(SERIALIZED_NAME_BAR_NUMBER)
  private String barNumber;

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private Contact contact;

  public static final String SERIALIZED_NAME_FIRST_FETCH_DATE = "firstFetchDate";
  @SerializedName(SERIALIZED_NAME_FIRST_FETCH_DATE)
  private OffsetDateTime firstFetchDate;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_IS_VISIBLE = "isVisible";
  @SerializedName(SERIALIZED_NAME_IS_VISIBLE)
  private Boolean isVisible;

  public static final String SERIALIZED_NAME_LAST_FETCH_DATE = "lastFetchDate";
  @SerializedName(SERIALIZED_NAME_LAST_FETCH_DATE)
  private OffsetDateTime lastFetchDate;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middleName";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAME_PREFIX = "namePrefix";
  @SerializedName(SERIALIZED_NAME_NAME_PREFIX)
  private String namePrefix;

  public static final String SERIALIZED_NAME_NAME_SUFFIX = "nameSuffix";
  @SerializedName(SERIALIZED_NAME_NAME_SUFFIX)
  private String nameSuffix;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object = "Attorney";

  public static final String SERIALIZED_NAME_PARTY_ATTORNEY_ASSOCIATIONS = "partyAttorneyAssociations";
  @SerializedName(SERIALIZED_NAME_PARTY_ATTORNEY_ASSOCIATIONS)
  private PartyAttorneyAssociations partyAttorneyAssociations;

  public static final String SERIALIZED_NAME_PARTY_ROLE_GROUP_ID_ARRAY = "partyRoleGroupIdArray";
  @SerializedName(SERIALIZED_NAME_PARTY_ROLE_GROUP_ID_ARRAY)
  private List<String> partyRoleGroupIdArray = new ArrayList<>();

  public static final String SERIALIZED_NAME_PARTY_ROLE_ID_ARRAY = "partyRoleIdArray";
  @SerializedName(SERIALIZED_NAME_PARTY_ROLE_ID_ARRAY)
  private List<String> partyRoleIdArray = new ArrayList<>();

  public static final String SERIALIZED_NAME_POSSIBLE_NORM_ATTORNEY_ARRAY = "possibleNormAttorneyArray";
  @SerializedName(SERIALIZED_NAME_POSSIBLE_NORM_ATTORNEY_ARRAY)
  private List<PossibleNormAttorney> possibleNormAttorneyArray = new ArrayList<>();

  public static final String SERIALIZED_NAME_POSSIBLE_NORM_LAW_FIRM_ARRAY = "possibleNormLawFirmArray";
  @SerializedName(SERIALIZED_NAME_POSSIBLE_NORM_LAW_FIRM_ARRAY)
  private List<PossibleNormLawFirm> possibleNormLawFirmArray = new ArrayList<>();

  public static final String SERIALIZED_NAME_SOURCE_ATTORNEY_TYPE = "sourceAttorneyType";
  @SerializedName(SERIALIZED_NAME_SOURCE_ATTORNEY_TYPE)
  private String sourceAttorneyType;

  public Attorney() {
  }

  public Attorney attorneyId(String attorneyId) {
    
    
    if (attorneyId != null && attorneyId.length() < 18) {
      throw new IllegalArgumentException("Invalid value for attorneyId. Length must be greater than or equal to 18.");
    }
    
    this.attorneyId = attorneyId;
    return this;
  }

   /**
   * ID for the attorney in this case. This ID is unique within a case and NOT across cases. If the same attorney were to appear in another case this ID would be different.
   * @return attorneyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ATTYgu01be2e4de654", required = true, value = "ID for the attorney in this case. This ID is unique within a case and NOT across cases. If the same attorney were to appear in another case this ID would be different.")

  public String getAttorneyId() {
    return attorneyId;
  }


  public void setAttorneyId(String attorneyId) {
    
    
    if (attorneyId != null && attorneyId.length() < 18) {
      throw new IllegalArgumentException("Invalid value for attorneyId. Length must be greater than or equal to 18.");
    }
    this.attorneyId = attorneyId;
  }


  public Attorney attorneyLawFirmArray(List<AttorneyLawFirm> attorneyLawFirmArray) {
    
    
    
    
    this.attorneyLawFirmArray = attorneyLawFirmArray;
    return this;
  }

  public Attorney addAttorneyLawFirmArrayItem(AttorneyLawFirm attorneyLawFirmArrayItem) {
    this.attorneyLawFirmArray.add(attorneyLawFirmArrayItem);
    return this;
  }

   /**
   * Get attorneyLawFirmArray
   * @return attorneyLawFirmArray
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<AttorneyLawFirm> getAttorneyLawFirmArray() {
    return attorneyLawFirmArray;
  }


  public void setAttorneyLawFirmArray(List<AttorneyLawFirm> attorneyLawFirmArray) {
    
    
    
    this.attorneyLawFirmArray = attorneyLawFirmArray;
  }


  public Attorney attorneyType(AttorneyType attorneyType) {
    
    
    
    
    this.attorneyType = attorneyType;
    return this;
  }

   /**
   * Get attorneyType
   * @return attorneyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public AttorneyType getAttorneyType() {
    return attorneyType;
  }


  public void setAttorneyType(AttorneyType attorneyType) {
    
    
    
    this.attorneyType = attorneyType;
  }


  public Attorney barNumber(String barNumber) {
    
    
    
    
    this.barNumber = barNumber;
    return this;
  }

   /**
   * The bar enrollment number of an attorney.
   * @return barNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The bar enrollment number of an attorney.")

  public String getBarNumber() {
    return barNumber;
  }


  public void setBarNumber(String barNumber) {
    
    
    
    this.barNumber = barNumber;
  }


  public Attorney contact(Contact contact) {
    
    
    
    
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Contact getContact() {
    return contact;
  }


  public void setContact(Contact contact) {
    
    
    
    this.contact = contact;
  }


  public Attorney firstFetchDate(OffsetDateTime firstFetchDate) {
    
    
    if (firstFetchDate != null && firstFetchDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for firstFetchDate. Length must be greater than or equal to 25.");
    }
    
    this.firstFetchDate = firstFetchDate;
    return this;
  }

   /**
   * When was the attorney first fetched from the court site.
   * @return firstFetchDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2021-10-10T10:10:24Z", required = true, value = "When was the attorney first fetched from the court site.")

  public OffsetDateTime getFirstFetchDate() {
    return firstFetchDate;
  }


  public void setFirstFetchDate(OffsetDateTime firstFetchDate) {
    
    
    if (firstFetchDate != null && firstFetchDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for firstFetchDate. Length must be greater than or equal to 25.");
    }
    this.firstFetchDate = firstFetchDate;
  }


  public Attorney firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the attorney. This is normalized by UniCourt.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "POMERANTZ", required = true, value = "First name of the attorney. This is normalized by UniCourt.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public Attorney isVisible(Boolean isVisible) {
    
    
    
    
    this.isVisible = isVisible;
    return this;
  }

   /**
   * Signifies if the attorney as this attorney type is currently isVisible or not for the case.
   * @return isVisible
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Signifies if the attorney as this attorney type is currently isVisible or not for the case.")

  public Boolean getIsVisible() {
    return isVisible;
  }


  public void setIsVisible(Boolean isVisible) {
    
    
    
    this.isVisible = isVisible;
  }


  public Attorney lastFetchDate(OffsetDateTime lastFetchDate) {
    
    
    if (lastFetchDate != null && lastFetchDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for lastFetchDate. Length must be greater than or equal to 25.");
    }
    
    this.lastFetchDate = lastFetchDate;
    return this;
  }

   /**
   * When was the attorney last fetched from the court site.
   * @return lastFetchDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2021-10-10T10:10:24Z", required = true, value = "When was the attorney last fetched from the court site.")

  public OffsetDateTime getLastFetchDate() {
    return lastFetchDate;
  }


  public void setLastFetchDate(OffsetDateTime lastFetchDate) {
    
    
    if (lastFetchDate != null && lastFetchDate.length() < 25) {
      throw new IllegalArgumentException("Invalid value for lastFetchDate. Length must be greater than or equal to 25.");
    }
    this.lastFetchDate = lastFetchDate;
  }


  public Attorney lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the attorney. This is normalized by UniCourt.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SLONE", required = true, value = "Last name of the attorney. This is normalized by UniCourt.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public Attorney middleName(String middleName) {
    
    
    
    
    this.middleName = middleName;
    return this;
  }

   /**
   * Middle name of the attorney. This is normalized by UniCourt.
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ANDREW", required = true, value = "Middle name of the attorney. This is normalized by UniCourt.")

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    
    
    
    this.middleName = middleName;
  }


  public Attorney name(String name) {
    
    
    if (name != null && name.length() < 1) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 1.");
    }
    
    this.name = name;
    return this;
  }

   /**
   * Name of the attorney as provided by Court.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "POMERANTZ ANDREW SLONE", required = true, value = "Name of the attorney as provided by Court.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    if (name != null && name.length() < 1) {
      throw new IllegalArgumentException("Invalid value for name. Length must be greater than or equal to 1.");
    }
    this.name = name;
  }


  public Attorney namePrefix(String namePrefix) {
    
    
    
    
    this.namePrefix = namePrefix;
    return this;
  }

   /**
   * Get namePrefix
   * @return namePrefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public String getNamePrefix() {
    return namePrefix;
  }


  public void setNamePrefix(String namePrefix) {
    
    
    
    this.namePrefix = namePrefix;
  }


  public Attorney nameSuffix(String nameSuffix) {
    
    
    
    
    this.nameSuffix = nameSuffix;
    return this;
  }

   /**
   * Get nameSuffix
   * @return nameSuffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public String getNameSuffix() {
    return nameSuffix;
  }


  public void setNameSuffix(String nameSuffix) {
    
    
    
    this.nameSuffix = nameSuffix;
  }


  public Attorney _object(String _object) {
    
    
    if (_object != null && _object.length() < 8) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 8.");
    }
    
    this._object = _object;
    return this;
  }

   /**
   * Name of the object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Attorney", required = true, value = "Name of the object")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    if (_object != null && _object.length() < 8) {
      throw new IllegalArgumentException("Invalid value for _object. Length must be greater than or equal to 8.");
    }
    this._object = _object;
  }


  public Attorney partyAttorneyAssociations(PartyAttorneyAssociations partyAttorneyAssociations) {
    
    
    
    
    this.partyAttorneyAssociations = partyAttorneyAssociations;
    return this;
  }

   /**
   * Get partyAttorneyAssociations
   * @return partyAttorneyAssociations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public PartyAttorneyAssociations getPartyAttorneyAssociations() {
    return partyAttorneyAssociations;
  }


  public void setPartyAttorneyAssociations(PartyAttorneyAssociations partyAttorneyAssociations) {
    
    
    
    this.partyAttorneyAssociations = partyAttorneyAssociations;
  }


  public Attorney partyRoleGroupIdArray(List<String> partyRoleGroupIdArray) {
    
    
    
    
    this.partyRoleGroupIdArray = partyRoleGroupIdArray;
    return this;
  }

  public Attorney addPartyRoleGroupIdArrayItem(String partyRoleGroupIdArrayItem) {
    this.partyRoleGroupIdArray.add(partyRoleGroupIdArrayItem);
    return this;
  }

   /**
   * Party Role Group Id for a Attorney.
   * @return partyRoleGroupIdArray
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Party Role Group Id for a Attorney.")

  public List<String> getPartyRoleGroupIdArray() {
    return partyRoleGroupIdArray;
  }


  public void setPartyRoleGroupIdArray(List<String> partyRoleGroupIdArray) {
    
    
    
    this.partyRoleGroupIdArray = partyRoleGroupIdArray;
  }


  public Attorney partyRoleIdArray(List<String> partyRoleIdArray) {
    
    
    
    
    this.partyRoleIdArray = partyRoleIdArray;
    return this;
  }

  public Attorney addPartyRoleIdArrayItem(String partyRoleIdArrayItem) {
    this.partyRoleIdArray.add(partyRoleIdArrayItem);
    return this;
  }

   /**
   * Party Role Id for a Attorney.
   * @return partyRoleIdArray
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Party Role Id for a Attorney.")

  public List<String> getPartyRoleIdArray() {
    return partyRoleIdArray;
  }


  public void setPartyRoleIdArray(List<String> partyRoleIdArray) {
    
    
    
    this.partyRoleIdArray = partyRoleIdArray;
  }


  public Attorney possibleNormAttorneyArray(List<PossibleNormAttorney> possibleNormAttorneyArray) {
    
    
    
    
    this.possibleNormAttorneyArray = possibleNormAttorneyArray;
    return this;
  }

  public Attorney addPossibleNormAttorneyArrayItem(PossibleNormAttorney possibleNormAttorneyArrayItem) {
    this.possibleNormAttorneyArray.add(possibleNormAttorneyArrayItem);
    return this;
  }

   /**
   * Get possibleNormAttorneyArray
   * @return possibleNormAttorneyArray
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<PossibleNormAttorney> getPossibleNormAttorneyArray() {
    return possibleNormAttorneyArray;
  }


  public void setPossibleNormAttorneyArray(List<PossibleNormAttorney> possibleNormAttorneyArray) {
    
    
    
    this.possibleNormAttorneyArray = possibleNormAttorneyArray;
  }


  public Attorney possibleNormLawFirmArray(List<PossibleNormLawFirm> possibleNormLawFirmArray) {
    
    
    
    
    this.possibleNormLawFirmArray = possibleNormLawFirmArray;
    return this;
  }

  public Attorney addPossibleNormLawFirmArrayItem(PossibleNormLawFirm possibleNormLawFirmArrayItem) {
    this.possibleNormLawFirmArray.add(possibleNormLawFirmArrayItem);
    return this;
  }

   /**
   * Possible Norm Lawfirm array for a Attorney.
   * @return possibleNormLawFirmArray
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Possible Norm Lawfirm array for a Attorney.")

  public List<PossibleNormLawFirm> getPossibleNormLawFirmArray() {
    return possibleNormLawFirmArray;
  }


  public void setPossibleNormLawFirmArray(List<PossibleNormLawFirm> possibleNormLawFirmArray) {
    
    
    
    this.possibleNormLawFirmArray = possibleNormLawFirmArray;
  }


  public Attorney sourceAttorneyType(String sourceAttorneyType) {
    
    
    
    
    this.sourceAttorneyType = sourceAttorneyType;
    return this;
  }

   /**
   * Attorney Type as provided by Court.
   * @return sourceAttorneyType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "atty", required = true, value = "Attorney Type as provided by Court.")

  public String getSourceAttorneyType() {
    return sourceAttorneyType;
  }


  public void setSourceAttorneyType(String sourceAttorneyType) {
    
    
    
    this.sourceAttorneyType = sourceAttorneyType;
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
   * @return the Attorney instance itself
   */
  public Attorney putAdditionalProperty(String key, Object value) {
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
    Attorney attorney = (Attorney) o;
    return Objects.equals(this.attorneyId, attorney.attorneyId) &&
        Objects.equals(this.attorneyLawFirmArray, attorney.attorneyLawFirmArray) &&
        Objects.equals(this.attorneyType, attorney.attorneyType) &&
        Objects.equals(this.barNumber, attorney.barNumber) &&
        Objects.equals(this.contact, attorney.contact) &&
        Objects.equals(this.firstFetchDate, attorney.firstFetchDate) &&
        Objects.equals(this.firstName, attorney.firstName) &&
        Objects.equals(this.isVisible, attorney.isVisible) &&
        Objects.equals(this.lastFetchDate, attorney.lastFetchDate) &&
        Objects.equals(this.lastName, attorney.lastName) &&
        Objects.equals(this.middleName, attorney.middleName) &&
        Objects.equals(this.name, attorney.name) &&
        Objects.equals(this.namePrefix, attorney.namePrefix) &&
        Objects.equals(this.nameSuffix, attorney.nameSuffix) &&
        Objects.equals(this._object, attorney._object) &&
        Objects.equals(this.partyAttorneyAssociations, attorney.partyAttorneyAssociations) &&
        Objects.equals(this.partyRoleGroupIdArray, attorney.partyRoleGroupIdArray) &&
        Objects.equals(this.partyRoleIdArray, attorney.partyRoleIdArray) &&
        Objects.equals(this.possibleNormAttorneyArray, attorney.possibleNormAttorneyArray) &&
        Objects.equals(this.possibleNormLawFirmArray, attorney.possibleNormLawFirmArray) &&
        Objects.equals(this.sourceAttorneyType, attorney.sourceAttorneyType)&&
        Objects.equals(this.additionalProperties, attorney.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attorneyId, attorneyLawFirmArray, attorneyType, barNumber, contact, firstFetchDate, firstName, isVisible, lastFetchDate, lastName, middleName, name, namePrefix, nameSuffix, _object, partyAttorneyAssociations, partyRoleGroupIdArray, partyRoleIdArray, possibleNormAttorneyArray, possibleNormLawFirmArray, sourceAttorneyType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attorney {\n");
    sb.append("    attorneyId: ").append(toIndentedString(attorneyId)).append("\n");
    sb.append("    attorneyLawFirmArray: ").append(toIndentedString(attorneyLawFirmArray)).append("\n");
    sb.append("    attorneyType: ").append(toIndentedString(attorneyType)).append("\n");
    sb.append("    barNumber: ").append(toIndentedString(barNumber)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    firstFetchDate: ").append(toIndentedString(firstFetchDate)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    isVisible: ").append(toIndentedString(isVisible)).append("\n");
    sb.append("    lastFetchDate: ").append(toIndentedString(lastFetchDate)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namePrefix: ").append(toIndentedString(namePrefix)).append("\n");
    sb.append("    nameSuffix: ").append(toIndentedString(nameSuffix)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    partyAttorneyAssociations: ").append(toIndentedString(partyAttorneyAssociations)).append("\n");
    sb.append("    partyRoleGroupIdArray: ").append(toIndentedString(partyRoleGroupIdArray)).append("\n");
    sb.append("    partyRoleIdArray: ").append(toIndentedString(partyRoleIdArray)).append("\n");
    sb.append("    possibleNormAttorneyArray: ").append(toIndentedString(possibleNormAttorneyArray)).append("\n");
    sb.append("    possibleNormLawFirmArray: ").append(toIndentedString(possibleNormLawFirmArray)).append("\n");
    sb.append("    sourceAttorneyType: ").append(toIndentedString(sourceAttorneyType)).append("\n");
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
    openapiFields.add("attorneyId");
    openapiFields.add("attorneyLawFirmArray");
    openapiFields.add("attorneyType");
    openapiFields.add("barNumber");
    openapiFields.add("contact");
    openapiFields.add("firstFetchDate");
    openapiFields.add("firstName");
    openapiFields.add("isVisible");
    openapiFields.add("lastFetchDate");
    openapiFields.add("lastName");
    openapiFields.add("middleName");
    openapiFields.add("name");
    openapiFields.add("namePrefix");
    openapiFields.add("nameSuffix");
    openapiFields.add("object");
    openapiFields.add("partyAttorneyAssociations");
    openapiFields.add("partyRoleGroupIdArray");
    openapiFields.add("partyRoleIdArray");
    openapiFields.add("possibleNormAttorneyArray");
    openapiFields.add("possibleNormLawFirmArray");
    openapiFields.add("sourceAttorneyType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attorneyId");
    openapiRequiredFields.add("attorneyLawFirmArray");
    openapiRequiredFields.add("attorneyType");
    openapiRequiredFields.add("barNumber");
    openapiRequiredFields.add("contact");
    openapiRequiredFields.add("firstFetchDate");
    openapiRequiredFields.add("firstName");
    openapiRequiredFields.add("isVisible");
    openapiRequiredFields.add("lastFetchDate");
    openapiRequiredFields.add("lastName");
    openapiRequiredFields.add("middleName");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("namePrefix");
    openapiRequiredFields.add("nameSuffix");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("partyAttorneyAssociations");
    openapiRequiredFields.add("partyRoleGroupIdArray");
    openapiRequiredFields.add("partyRoleIdArray");
    openapiRequiredFields.add("possibleNormAttorneyArray");
    openapiRequiredFields.add("possibleNormLawFirmArray");
    openapiRequiredFields.add("sourceAttorneyType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Attorney
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Attorney.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Attorney is not found in the empty JSON string", Attorney.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Attorney.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("attorneyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `attorneyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("attorneyId").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("attorneyLawFirmArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attorneyLawFirmArray` to be an array in the JSON string but got `%s`", jsonObj.get("attorneyLawFirmArray").toString()));
      }

      JsonArray jsonArrayattorneyLawFirmArray = jsonObj.getAsJsonArray("attorneyLawFirmArray");
      // validate the required field `attorneyLawFirmArray` (array)
      for (int i = 0; i < jsonArrayattorneyLawFirmArray.size(); i++) {
        AttorneyLawFirm.validateJsonObject(jsonArrayattorneyLawFirmArray.get(i).getAsJsonObject());
      };
      // validate the required field `attorneyType`
      AttorneyType.validateJsonObject(jsonObj.getAsJsonObject("attorneyType"));
      if (!jsonObj.get("barNumber").isJsonNull() && !jsonObj.get("barNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `barNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("barNumber").toString()));
      }
      // validate the required field `contact`
      Contact.validateJsonObject(jsonObj.getAsJsonObject("contact"));
      if (!jsonObj.get("firstName").isJsonNull() && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if (!jsonObj.get("lastName").isJsonNull() && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if (!jsonObj.get("middleName").isJsonNull() && !jsonObj.get("middleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `middleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("middleName").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("namePrefix").isJsonNull() && !jsonObj.get("namePrefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `namePrefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("namePrefix").toString()));
      }
      if (!jsonObj.get("nameSuffix").isJsonNull() && !jsonObj.get("nameSuffix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nameSuffix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nameSuffix").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      // validate the required field `partyAttorneyAssociations`
      PartyAttorneyAssociations.validateJsonObject(jsonObj.getAsJsonObject("partyAttorneyAssociations"));
      // ensure the required json array is present
      if (jsonObj.get("partyRoleGroupIdArray") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("partyRoleGroupIdArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `partyRoleGroupIdArray` to be an array in the JSON string but got `%s`", jsonObj.get("partyRoleGroupIdArray").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("partyRoleIdArray") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("partyRoleIdArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `partyRoleIdArray` to be an array in the JSON string but got `%s`", jsonObj.get("partyRoleIdArray").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("possibleNormAttorneyArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `possibleNormAttorneyArray` to be an array in the JSON string but got `%s`", jsonObj.get("possibleNormAttorneyArray").toString()));
      }

      JsonArray jsonArraypossibleNormAttorneyArray = jsonObj.getAsJsonArray("possibleNormAttorneyArray");
      // validate the required field `possibleNormAttorneyArray` (array)
      for (int i = 0; i < jsonArraypossibleNormAttorneyArray.size(); i++) {
        PossibleNormAttorney.validateJsonObject(jsonArraypossibleNormAttorneyArray.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("possibleNormLawFirmArray").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `possibleNormLawFirmArray` to be an array in the JSON string but got `%s`", jsonObj.get("possibleNormLawFirmArray").toString()));
      }

      JsonArray jsonArraypossibleNormLawFirmArray = jsonObj.getAsJsonArray("possibleNormLawFirmArray");
      // validate the required field `possibleNormLawFirmArray` (array)
      for (int i = 0; i < jsonArraypossibleNormLawFirmArray.size(); i++) {
        PossibleNormLawFirm.validateJsonObject(jsonArraypossibleNormLawFirmArray.get(i).getAsJsonObject());
      };
      if (!jsonObj.get("sourceAttorneyType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceAttorneyType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceAttorneyType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Attorney.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Attorney' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Attorney> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Attorney.class));

       return (TypeAdapter<T>) new TypeAdapter<Attorney>() {
           @Override
           public void write(JsonWriter out, Attorney value) throws IOException {
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
           public Attorney read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Attorney instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Attorney given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Attorney
  * @throws IOException if the JSON string is invalid with respect to Attorney
  */
  public static Attorney fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Attorney.class);
  }

 /**
  * Convert an instance of Attorney to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

