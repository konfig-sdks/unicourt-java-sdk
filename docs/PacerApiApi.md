# PacerApiApi

All URIs are relative to *https://enterpriseapi.unicourt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**importPacerCaseByCourtUsingCaseNumberGet**](PacerApiApi.md#importPacerCaseByCourtUsingCaseNumberGet) | **GET** /pacer/importCaseByCourtUsingCaseNumber | Find PACER Case for a requested Case Number and Court. |
| [**searchAllCourtsCases**](PacerApiApi.md#searchAllCourtsCases) | **GET** /pacerCaseLocator/caseSearch/allCourts | PACER Case Locator Search API for All Courts. |
| [**searchAllCourtsCases_0**](PacerApiApi.md#searchAllCourtsCases_0) | **GET** /pacerCaseLocator/partySearch/allCourts | PACER Case Locator Search API for All Courts. |
| [**searchAppealCourtsCases**](PacerApiApi.md#searchAppealCourtsCases) | **GET** /pacerCaseLocator/caseSearch/appealCourts | PACER Case Locator Search API for All Courts. |
| [**searchAppealCourtsCases_0**](PacerApiApi.md#searchAppealCourtsCases_0) | **GET** /pacerCaseLocator/partySearch/appealCourts | PACER Case Locator Search API for All Courts. |
| [**searchBankruptcyCases**](PacerApiApi.md#searchBankruptcyCases) | **GET** /pacerCaseLocator/caseSearch/bankruptcyCourts | PACER Case Locator Search API for Bankruptcy Courts. |
| [**searchBankruptcyCourts**](PacerApiApi.md#searchBankruptcyCourts) | **GET** /pacerCaseLocator/partySearch/bankruptcyCourts | PACER Case Locator Search API for All Courts. |
| [**searchCivilCases**](PacerApiApi.md#searchCivilCases) | **GET** /pacerCaseLocator/caseSearch/civilCourts | PACER Case Locator Search API for All Courts. |
| [**searchCivilCasesInCourts**](PacerApiApi.md#searchCivilCasesInCourts) | **GET** /pacerCaseLocator/partySearch/civilCourts | PACER Case Locator Search API for All Courts. |
| [**searchCriminalCases**](PacerApiApi.md#searchCriminalCases) | **GET** /pacerCaseLocator/caseSearch/criminalCourts | PACER Case Locator Search API for All Courts. |
| [**searchCriminalCases_0**](PacerApiApi.md#searchCriminalCases_0) | **GET** /pacerCaseLocator/partySearch/criminalCourts | PACER Case Locator Search API for All Courts. |
| [**searchMultiDistrictCourtCases**](PacerApiApi.md#searchMultiDistrictCourtCases) | **GET** /pacerCaseLocator/caseSearch/multiDistrictCourts | PACER Case Locator Search API for All Courts. |
| [**searchMultiDistrictCourtCases_0**](PacerApiApi.md#searchMultiDistrictCourtCases_0) | **GET** /pacerCaseLocator/partySearch/multiDistrictCourts | PACER Case Locator Search API for All Courts. |


<a name="importPacerCaseByCourtUsingCaseNumberGet"></a>
# **importPacerCaseByCourtUsingCaseNumberGet**
> PACERImportCase importPacerCaseByCourtUsingCaseNumberGet(pacerUserId, pacerClientCode, caseNumber, courtId).execute();

Find PACER Case for a requested Case Number and Court.

Import the specified case from PACER.    Workflow:     1.This API will return the Find Case results from the court site in a form of array of UniCourt Case Objects. These case objects will consists only Meta information of the case if not already present in the UniCourt Database.     2.To get the full updated case information one will have to request the caseUpdate API by passing the caseId.    Note:     1.Charges for Find Case in District, Bankruptcy and National Courts is free. Find case for Appeal Courts will be charged at minimum rate of $0.1. The fee charged by the court for find case can be found in the response of this API in the field courtFee.     2.The results of the search has less Meta information in case objects compared to the Meta information of cases found using the PCL search APIs.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PacerApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://enterpriseapi.unicourt.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    UniCourt client = new UniCourt(configuration);
    String pacerUserId = "johndoe"; // The PACER username of the PACER account under which the case should be imported.
    String pacerClientCode = "john"; // The PACER client code under which the case should be imported.
    String caseNumber = "2:15-mc-12345"; // The case number of the case to be imported.
    String courtId = "CORTjF63b8Z4d2i9UB"; // The courtId value of the court from which the case is to be imported.
    try {
      PACERImportCase result = client
              .pacerApi
              .importPacerCaseByCourtUsingCaseNumberGet(pacerUserId, pacerClientCode, caseNumber, courtId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCourtFee());
      System.out.println(result.getObject());
      System.out.println(result.getPacerImportCaseResultsArray());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#importPacerCaseByCourtUsingCaseNumberGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PACERImportCase> response = client
              .pacerApi
              .importPacerCaseByCourtUsingCaseNumberGet(pacerUserId, pacerClientCode, caseNumber, courtId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#importPacerCaseByCourtUsingCaseNumberGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pacerUserId** | **String**| The PACER username of the PACER account under which the case should be imported. | |
| **pacerClientCode** | **String**| The PACER client code under which the case should be imported. | |
| **caseNumber** | **String**| The case number of the case to be imported. | |
| **courtId** | **String**| The courtId value of the court from which the case is to be imported. | |

### Return type

[**PACERImportCase**](PACERImportCase.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="searchAllCourtsCases"></a>
# **searchAllCourtsCases**
> PCLCase searchAllCourtsCases(pacerUserId, pacerClientCode).caseNumber(caseNumber).pacerCaseId(pacerCaseId).caseTitle(caseTitle).caseOffice(caseOffice).caseSequenceNumber(caseSequenceNumber).caseYear(caseYear).caseTypeArray(caseTypeArray).courtRegionIdArray(courtRegionIdArray).caseFiledStartDate(caseFiledStartDate).caseFiledEndDate(caseFiledEndDate).caseTerminatedStartDate(caseTerminatedStartDate).caseTerminatedEndDate(caseTerminatedEndDate).sortParameterQuery(sortParameterQuery).caseStatus(caseStatus).pageNumber(pageNumber).execute();

PACER Case Locator Search API for All Courts.

Search all courts within the PACER system for a particular case.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PacerApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://enterpriseapi.unicourt.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    UniCourt client = new UniCourt(configuration);
    String pacerUserId = "johndoe"; // The username of the PACER account under which the search is to be performed.
    String pacerClientCode = "john"; // The PACER client code under which the search is to be performed.
    String caseNumber = "12-1234"; // The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit).
    Integer pacerCaseId = 17118; // The PACER-assigned identifier of the target case.
    String caseTitle = "caseTitle_example"; // The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc.
    Integer caseOffice = 56; // The divisional office in which the case was filed.
    Integer caseSequenceNumber = 56; // The PACER-assigned sequence number of the target case. Ex 12345
    Integer caseYear = 56; // The two- or four-digit year in which the target case was filed.
    List<String> caseTypeArray = Arrays.asList(); // The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray=cv&caseTypeArray=cr
    List<String> courtRegionIdArray = Arrays.asList(); // The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray=cac&courtRegionIdArray=cae
    OffsetDateTime caseFiledStartDate = OffsetDateTime.now(); // The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseFiledEndDate = OffsetDateTime.now(); // The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedStartDate = OffsetDateTime.now(); // The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedEndDate = OffsetDateTime.now(); // The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    String sortParameterQuery = "sort=caseYear,DESC"; // How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery=courtId,ASC&caseId,ASC
    String caseStatus = "open"; // Whether the target case is marked as 'open' or 'closed' within PACER.
    Integer pageNumber = 1; // The page number of the search results to be retrieved.
    try {
      PCLCase result = client
              .pacerApi
              .searchAllCourtsCases(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .pacerCaseId(pacerCaseId)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPacerPageInfo());
      System.out.println(result.getPacerReceipt());
      System.out.println(result.getPacerSearchResultsArray());
      System.out.println(result.getPageNumber());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchAllCourtsCases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PCLCase> response = client
              .pacerApi
              .searchAllCourtsCases(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .pacerCaseId(pacerCaseId)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchAllCourtsCases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pacerUserId** | **String**| The username of the PACER account under which the search is to be performed. | |
| **pacerClientCode** | **String**| The PACER client code under which the search is to be performed. | |
| **caseNumber** | **String**| The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit). | [optional] |
| **pacerCaseId** | **Integer**| The PACER-assigned identifier of the target case. | [optional] |
| **caseTitle** | **String**| The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc. | [optional] |
| **caseOffice** | **Integer**| The divisional office in which the case was filed. | [optional] |
| **caseSequenceNumber** | **Integer**| The PACER-assigned sequence number of the target case. Ex 12345 | [optional] |
| **caseYear** | **Integer**| The two- or four-digit year in which the target case was filed. | [optional] |
| **caseTypeArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray&#x3D;cv&amp;caseTypeArray&#x3D;cr | [optional] |
| **courtRegionIdArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray&#x3D;cac&amp;courtRegionIdArray&#x3D;cae | [optional] |
| **caseFiledStartDate** | **OffsetDateTime**| The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseFiledEndDate** | **OffsetDateTime**| The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedStartDate** | **OffsetDateTime**| The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedEndDate** | **OffsetDateTime**| The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **sortParameterQuery** | **String**| How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery&#x3D;courtId,ASC&amp;caseId,ASC | [optional] [default to sort&#x3D;caseYear,DESC] |
| **caseStatus** | **String**| Whether the target case is marked as &#39;open&#39; or &#39;closed&#39; within PACER. | [optional] [enum: open, closed] |
| **pageNumber** | **Integer**| The page number of the search results to be retrieved. | [optional] |

### Return type

[**PCLCase**](PCLCase.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="searchAllCourtsCases_0"></a>
# **searchAllCourtsCases_0**
> PCLParty searchAllCourtsCases_0(pacerUserId, pacerClientCode).caseNumber(caseNumber).pacerCaseId(pacerCaseId).lastName(lastName).firstName(firstName).middleName(middleName).generation(generation).partyType(partyType).partyExactNameMatch(partyExactNameMatch).partyRoleArray(partyRoleArray).caseTitle(caseTitle).caseOffice(caseOffice).caseSequenceNumber(caseSequenceNumber).caseYear(caseYear).caseTypeArray(caseTypeArray).courtRegionIdArray(courtRegionIdArray).caseYearFrom(caseYearFrom).caseYearTo(caseYearTo).caseFiledStartDate(caseFiledStartDate).caseFiledEndDate(caseFiledEndDate).caseTerminatedStartDate(caseTerminatedStartDate).caseTerminatedEndDate(caseTerminatedEndDate).sortParameterQuery(sortParameterQuery).caseStatus(caseStatus).pageNumber(pageNumber).execute();

PACER Case Locator Search API for All Courts.

Search for the specified party across all PACER case filings.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PacerApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://enterpriseapi.unicourt.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    UniCourt client = new UniCourt(configuration);
    String pacerUserId = "johndoe"; // The username of the PACER account under which the search is to be performed.
    String pacerClientCode = "john"; // The PACER client code under which the search is to be performed.
    String caseNumber = "12-1234"; // The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit).
    Integer pacerCaseId = 56; // The PACER-assigned identifier of the target case.
    String lastName = "John"; // The last name (for an individual) or the entity name (for a business entity) of the target party.
    String firstName = "John"; // The first name of the target party.
    String middleName = "Doe"; // The middle name of the target party.
    String generation = "III"; // The suffix (e.g., Jr., III) of the target party's name.
    String partyType = "ptf"; // The court-assigned party type for a party involved in a case. Party type codes are created and assigned by individual courts, and as such, their meanings can vary from court to court.
    Boolean partyExactNameMatch = true; // Specify whether the search string must match the name of the target party exactly.
    List<String> partyRoleArray = Arrays.asList(); // The court-assigned role for a party to a case. Party role codes are created and assigned by individual courts, and as such, their meanings can vary from court to court.
    String caseTitle = "caseTitle_example"; // The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc.
    Integer caseOffice = 56; // The divisional office in which the case was filed.
    Integer caseSequenceNumber = 56; // The PACER-assigned sequence number of the target case.
    Integer caseYear = 56; // The two- or four-digit year in which the target case was filed.
    List<String> caseTypeArray = Arrays.asList(); // The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray=cv&caseTypeArray=cr
    List<String> courtRegionIdArray = Arrays.asList(); // The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray=cac&courtRegionIdArray=cae
    Integer caseYearFrom = 56; // Limit the results of the search to those cases from the year specified or later
    Integer caseYearTo = 56; // Limit the results of the search to those cases from the year specified or earlier
    OffsetDateTime caseFiledStartDate = OffsetDateTime.now(); // The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseFiledEndDate = OffsetDateTime.now(); // The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedStartDate = OffsetDateTime.now(); // The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedEndDate = OffsetDateTime.now(); // The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    String sortParameterQuery = "sort=caseYear,DESC"; // How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario 1: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery=courtId,ASC&caseId,ASC    Scenario 2: When you want to sort the response using the case parameters in the party search.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of caseOffice and descending order of caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery=courtCase.caseOffice,ASC&caseid,DESC
    String caseStatus = "open"; // Whether the target case is marked as 'open' or 'closed' within PACER.
    Integer pageNumber = 1; // The page number of the search results to be retrieved.
    try {
      PCLParty result = client
              .pacerApi
              .searchAllCourtsCases_0(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .pacerCaseId(pacerCaseId)
              .lastName(lastName)
              .firstName(firstName)
              .middleName(middleName)
              .generation(generation)
              .partyType(partyType)
              .partyExactNameMatch(partyExactNameMatch)
              .partyRoleArray(partyRoleArray)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseYearFrom(caseYearFrom)
              .caseYearTo(caseYearTo)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPacerPageInfo());
      System.out.println(result.getPacerReceipt());
      System.out.println(result.getPacerSearchResultsArray());
      System.out.println(result.getPageNumber());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchAllCourtsCases_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PCLParty> response = client
              .pacerApi
              .searchAllCourtsCases_0(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .pacerCaseId(pacerCaseId)
              .lastName(lastName)
              .firstName(firstName)
              .middleName(middleName)
              .generation(generation)
              .partyType(partyType)
              .partyExactNameMatch(partyExactNameMatch)
              .partyRoleArray(partyRoleArray)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseYearFrom(caseYearFrom)
              .caseYearTo(caseYearTo)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchAllCourtsCases_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pacerUserId** | **String**| The username of the PACER account under which the search is to be performed. | |
| **pacerClientCode** | **String**| The PACER client code under which the search is to be performed. | |
| **caseNumber** | **String**| The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit). | [optional] |
| **pacerCaseId** | **Integer**| The PACER-assigned identifier of the target case. | [optional] |
| **lastName** | **String**| The last name (for an individual) or the entity name (for a business entity) of the target party. | [optional] |
| **firstName** | **String**| The first name of the target party. | [optional] |
| **middleName** | **String**| The middle name of the target party. | [optional] |
| **generation** | **String**| The suffix (e.g., Jr., III) of the target party&#39;s name. | [optional] |
| **partyType** | **String**| The court-assigned party type for a party involved in a case. Party type codes are created and assigned by individual courts, and as such, their meanings can vary from court to court. | [optional] |
| **partyExactNameMatch** | **Boolean**| Specify whether the search string must match the name of the target party exactly. | [optional] |
| **partyRoleArray** | [**List&lt;String&gt;**](String.md)| The court-assigned role for a party to a case. Party role codes are created and assigned by individual courts, and as such, their meanings can vary from court to court. | [optional] |
| **caseTitle** | **String**| The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc. | [optional] |
| **caseOffice** | **Integer**| The divisional office in which the case was filed. | [optional] |
| **caseSequenceNumber** | **Integer**| The PACER-assigned sequence number of the target case. | [optional] |
| **caseYear** | **Integer**| The two- or four-digit year in which the target case was filed. | [optional] |
| **caseTypeArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray&#x3D;cv&amp;caseTypeArray&#x3D;cr | [optional] |
| **courtRegionIdArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray&#x3D;cac&amp;courtRegionIdArray&#x3D;cae | [optional] |
| **caseYearFrom** | **Integer**| Limit the results of the search to those cases from the year specified or later | [optional] |
| **caseYearTo** | **Integer**| Limit the results of the search to those cases from the year specified or earlier | [optional] |
| **caseFiledStartDate** | **OffsetDateTime**| The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseFiledEndDate** | **OffsetDateTime**| The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedStartDate** | **OffsetDateTime**| The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedEndDate** | **OffsetDateTime**| The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **sortParameterQuery** | **String**| How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario 1: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery&#x3D;courtId,ASC&amp;caseId,ASC    Scenario 2: When you want to sort the response using the case parameters in the party search.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of caseOffice and descending order of caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery&#x3D;courtCase.caseOffice,ASC&amp;caseid,DESC | [optional] [default to sort&#x3D;caseYear,DESC] |
| **caseStatus** | **String**| Whether the target case is marked as &#39;open&#39; or &#39;closed&#39; within PACER. | [optional] [enum: open, closed] |
| **pageNumber** | **Integer**| The page number of the search results to be retrieved. | [optional] |

### Return type

[**PCLParty**](PCLParty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="searchAppealCourtsCases"></a>
# **searchAppealCourtsCases**
> PCLCase searchAppealCourtsCases(pacerUserId, pacerClientCode).caseNumber(caseNumber).pacerCaseId(pacerCaseId).caseTitle(caseTitle).caseOffice(caseOffice).caseSequenceNumber(caseSequenceNumber).caseYear(caseYear).caseTypeArray(caseTypeArray).natureOfSuitsArray(natureOfSuitsArray).courtRegionIdArray(courtRegionIdArray).caseFiledStartDate(caseFiledStartDate).caseFiledEndDate(caseFiledEndDate).caseTerminatedStartDate(caseTerminatedStartDate).caseTerminatedEndDate(caseTerminatedEndDate).sortParameterQuery(sortParameterQuery).caseStatus(caseStatus).pageNumber(pageNumber).execute();

PACER Case Locator Search API for All Courts.

Search for PACER cases filed in U.S. Courts of Appeals.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PacerApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://enterpriseapi.unicourt.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    UniCourt client = new UniCourt(configuration);
    String pacerUserId = "johndoe"; // The username of the PACER account under which the search is to be performed.
    String pacerClientCode = "john"; // The PACER client code under which the search is to be performed.
    String caseNumber = "12-1234"; // The case number of the target case. You may use the following case-number formats:    yy-nnnnn    where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits).
    Integer pacerCaseId = 56; // The PACER-assigned identifier of the target case.
    String caseTitle = "caseTitle_example"; // The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc.
    Integer caseOffice = 56; // The divisional office in which the case was filed.
    Integer caseSequenceNumber = 56; // The PACER-assigned sequence number of the target case. Ex 12345
    Integer caseYear = 56; // The two- or four-digit year in which the target case was filed.
    List<String> caseTypeArray = Arrays.asList(); // The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray=cv&caseTypeArray=cr
    List<String> natureOfSuitsArray = Arrays.asList(); // The PACER-assigned nature of suit classification of the target case. Please see Appendix E for valid nature-of-suit classifications for cases in U.S. Courts of Appeals.    Scenario: When mulitple nature of suits needs to be requested.    Imagine for a given case number 12-1234 I would like to search with the nature of suit 1110 (Insurance) and 1150 (Overpayments & Enforc. of Judgments), My query in the request will look like the example mentioned below.    Example: natureOfSuitsArray=1110&natureOfSuitsArray=1150
    List<String> courtRegionIdArray = Arrays.asList(); // The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray=cac&courtRegionIdArray=cae
    OffsetDateTime caseFiledStartDate = OffsetDateTime.now(); // The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseFiledEndDate = OffsetDateTime.now(); // The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedStartDate = OffsetDateTime.now(); // The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedEndDate = OffsetDateTime.now(); // The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    String sortParameterQuery = "sort=caseYear,DESC"; // How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery=courtId,ASC&caseId,ASC
    String caseStatus = "open"; // Whether the target case is marked as 'open' or 'closed' within PACER.
    Integer pageNumber = 1; // The page number of the search results to be retrieved.
    try {
      PCLCase result = client
              .pacerApi
              .searchAppealCourtsCases(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .pacerCaseId(pacerCaseId)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .natureOfSuitsArray(natureOfSuitsArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPacerPageInfo());
      System.out.println(result.getPacerReceipt());
      System.out.println(result.getPacerSearchResultsArray());
      System.out.println(result.getPageNumber());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchAppealCourtsCases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PCLCase> response = client
              .pacerApi
              .searchAppealCourtsCases(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .pacerCaseId(pacerCaseId)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .natureOfSuitsArray(natureOfSuitsArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchAppealCourtsCases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pacerUserId** | **String**| The username of the PACER account under which the search is to be performed. | |
| **pacerClientCode** | **String**| The PACER client code under which the search is to be performed. | |
| **caseNumber** | **String**| The case number of the target case. You may use the following case-number formats:    yy-nnnnn    where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits). | [optional] |
| **pacerCaseId** | **Integer**| The PACER-assigned identifier of the target case. | [optional] |
| **caseTitle** | **String**| The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc. | [optional] |
| **caseOffice** | **Integer**| The divisional office in which the case was filed. | [optional] |
| **caseSequenceNumber** | **Integer**| The PACER-assigned sequence number of the target case. Ex 12345 | [optional] |
| **caseYear** | **Integer**| The two- or four-digit year in which the target case was filed. | [optional] |
| **caseTypeArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray&#x3D;cv&amp;caseTypeArray&#x3D;cr | [optional] |
| **natureOfSuitsArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned nature of suit classification of the target case. Please see Appendix E for valid nature-of-suit classifications for cases in U.S. Courts of Appeals.    Scenario: When mulitple nature of suits needs to be requested.    Imagine for a given case number 12-1234 I would like to search with the nature of suit 1110 (Insurance) and 1150 (Overpayments &amp; Enforc. of Judgments), My query in the request will look like the example mentioned below.    Example: natureOfSuitsArray&#x3D;1110&amp;natureOfSuitsArray&#x3D;1150 | [optional] |
| **courtRegionIdArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray&#x3D;cac&amp;courtRegionIdArray&#x3D;cae | [optional] |
| **caseFiledStartDate** | **OffsetDateTime**| The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseFiledEndDate** | **OffsetDateTime**| The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedStartDate** | **OffsetDateTime**| The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedEndDate** | **OffsetDateTime**| The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **sortParameterQuery** | **String**| How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery&#x3D;courtId,ASC&amp;caseId,ASC | [optional] [default to sort&#x3D;caseYear,DESC] |
| **caseStatus** | **String**| Whether the target case is marked as &#39;open&#39; or &#39;closed&#39; within PACER. | [optional] [enum: open, closed] |
| **pageNumber** | **Integer**| The page number of the search results to be retrieved. | [optional] |

### Return type

[**PCLCase**](PCLCase.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="searchAppealCourtsCases_0"></a>
# **searchAppealCourtsCases_0**
> PCLParty searchAppealCourtsCases_0(pacerUserId, pacerClientCode).caseNumber(caseNumber).pacerCaseId(pacerCaseId).lastName(lastName).firstName(firstName).middleName(middleName).generation(generation).partyType(partyType).partyExactNameMatch(partyExactNameMatch).partyRoleArray(partyRoleArray).caseTitle(caseTitle).caseOffice(caseOffice).caseSequenceNumber(caseSequenceNumber).caseYear(caseYear).caseTypeArray(caseTypeArray).courtRegionIdArray(courtRegionIdArray).caseYearFrom(caseYearFrom).caseYearTo(caseYearTo).caseFiledStartDate(caseFiledStartDate).caseFiledEndDate(caseFiledEndDate).caseTerminatedStartDate(caseTerminatedStartDate).caseTerminatedEndDate(caseTerminatedEndDate).sortParameterQuery(sortParameterQuery).caseStatus(caseStatus).pageNumber(pageNumber).execute();

PACER Case Locator Search API for All Courts.

Search for the specified party across all PACER appeals cases.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PacerApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://enterpriseapi.unicourt.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    UniCourt client = new UniCourt(configuration);
    String pacerUserId = "johndoe"; // The username of the PACER account under which the search is to be performed.
    String pacerClientCode = "john"; // The PACER client code under which the search is to be performed.
    String caseNumber = "12-1234"; // The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit).
    Integer pacerCaseId = 56; // The PACER-assigned identifier of the target case.
    String lastName = "John"; // The last name (for an individual) or the entity name (for a business entity) of the target party.
    String firstName = "John"; // The first name of the target party.
    String middleName = "Doe"; // The middle name of the target party.
    String generation = "III"; // The suffix (e.g., Jr., III) of the target party's name.
    String partyType = "ptf"; // The court-assigned party type for a party involved in a case. Party type codes are created and assigned by individual courts, and as such, their meanings can vary from court to court.
    Boolean partyExactNameMatch = true; // Specify whether the search string must match the name of the target party exactly.
    List<String> partyRoleArray = Arrays.asList(); // The court-assigned role for a party to a case. Party role codes are created and assigned by individual courts, and as such, their meanings can vary from court to court.
    String caseTitle = "caseTitle_example"; // The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc.
    Integer caseOffice = 56; // The divisional office in which the case was filed.
    Integer caseSequenceNumber = 56; // The PACER-assigned sequence number of the target case. Ex 12345
    Integer caseYear = 56; // The two- or four-digit year in which the target case was filed.
    List<String> caseTypeArray = Arrays.asList(); // The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray=cv&caseTypeArray=cr
    List<String> courtRegionIdArray = Arrays.asList(); // The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray=cac&courtRegionIdArray=cae
    Integer caseYearFrom = 56; // Limit the results of the search to those cases from the year specified or later
    Integer caseYearTo = 56; // Limit the results of the search to those cases from the year specified or earlier
    OffsetDateTime caseFiledStartDate = OffsetDateTime.now(); // The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseFiledEndDate = OffsetDateTime.now(); // The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedStartDate = OffsetDateTime.now(); // The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedEndDate = OffsetDateTime.now(); // The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    String sortParameterQuery = "sort=caseYear,DESC"; // How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario 1: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery=courtId,ASC&caseId,ASC    Scenario 2: When you want to sort the response using the case parameters in the party search.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of caseOffice and descending order of caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery=courtCase.caseOffice,ASC&caseid,DESC
    String caseStatus = "open"; // Whether the target case is marked as 'open' or 'closed' within PACER.
    Integer pageNumber = 1; // The page number of the search results to be retrieved.
    try {
      PCLParty result = client
              .pacerApi
              .searchAppealCourtsCases_0(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .pacerCaseId(pacerCaseId)
              .lastName(lastName)
              .firstName(firstName)
              .middleName(middleName)
              .generation(generation)
              .partyType(partyType)
              .partyExactNameMatch(partyExactNameMatch)
              .partyRoleArray(partyRoleArray)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseYearFrom(caseYearFrom)
              .caseYearTo(caseYearTo)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPacerPageInfo());
      System.out.println(result.getPacerReceipt());
      System.out.println(result.getPacerSearchResultsArray());
      System.out.println(result.getPageNumber());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchAppealCourtsCases_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PCLParty> response = client
              .pacerApi
              .searchAppealCourtsCases_0(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .pacerCaseId(pacerCaseId)
              .lastName(lastName)
              .firstName(firstName)
              .middleName(middleName)
              .generation(generation)
              .partyType(partyType)
              .partyExactNameMatch(partyExactNameMatch)
              .partyRoleArray(partyRoleArray)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseYearFrom(caseYearFrom)
              .caseYearTo(caseYearTo)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchAppealCourtsCases_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pacerUserId** | **String**| The username of the PACER account under which the search is to be performed. | |
| **pacerClientCode** | **String**| The PACER client code under which the search is to be performed. | |
| **caseNumber** | **String**| The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit). | [optional] |
| **pacerCaseId** | **Integer**| The PACER-assigned identifier of the target case. | [optional] |
| **lastName** | **String**| The last name (for an individual) or the entity name (for a business entity) of the target party. | [optional] |
| **firstName** | **String**| The first name of the target party. | [optional] |
| **middleName** | **String**| The middle name of the target party. | [optional] |
| **generation** | **String**| The suffix (e.g., Jr., III) of the target party&#39;s name. | [optional] |
| **partyType** | **String**| The court-assigned party type for a party involved in a case. Party type codes are created and assigned by individual courts, and as such, their meanings can vary from court to court. | [optional] |
| **partyExactNameMatch** | **Boolean**| Specify whether the search string must match the name of the target party exactly. | [optional] |
| **partyRoleArray** | [**List&lt;String&gt;**](String.md)| The court-assigned role for a party to a case. Party role codes are created and assigned by individual courts, and as such, their meanings can vary from court to court. | [optional] |
| **caseTitle** | **String**| The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc. | [optional] |
| **caseOffice** | **Integer**| The divisional office in which the case was filed. | [optional] |
| **caseSequenceNumber** | **Integer**| The PACER-assigned sequence number of the target case. Ex 12345 | [optional] |
| **caseYear** | **Integer**| The two- or four-digit year in which the target case was filed. | [optional] |
| **caseTypeArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray&#x3D;cv&amp;caseTypeArray&#x3D;cr | [optional] |
| **courtRegionIdArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray&#x3D;cac&amp;courtRegionIdArray&#x3D;cae | [optional] |
| **caseYearFrom** | **Integer**| Limit the results of the search to those cases from the year specified or later | [optional] |
| **caseYearTo** | **Integer**| Limit the results of the search to those cases from the year specified or earlier | [optional] |
| **caseFiledStartDate** | **OffsetDateTime**| The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseFiledEndDate** | **OffsetDateTime**| The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedStartDate** | **OffsetDateTime**| The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedEndDate** | **OffsetDateTime**| The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **sortParameterQuery** | **String**| How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario 1: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery&#x3D;courtId,ASC&amp;caseId,ASC    Scenario 2: When you want to sort the response using the case parameters in the party search.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of caseOffice and descending order of caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery&#x3D;courtCase.caseOffice,ASC&amp;caseid,DESC | [optional] [default to sort&#x3D;caseYear,DESC] |
| **caseStatus** | **String**| Whether the target case is marked as &#39;open&#39; or &#39;closed&#39; within PACER. | [optional] [enum: open, closed] |
| **pageNumber** | **Integer**| The page number of the search results to be retrieved. | [optional] |

### Return type

[**PCLParty**](PCLParty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="searchBankruptcyCases"></a>
# **searchBankruptcyCases**
> PCLCase searchBankruptcyCases(pacerUserId, pacerClientCode).caseNumber(caseNumber).pacerCaseId(pacerCaseId).caseTitle(caseTitle).caseOffice(caseOffice).caseSequenceNumber(caseSequenceNumber).caseYear(caseYear).caseTypeArray(caseTypeArray).federalBankruptcyChapterArray(federalBankruptcyChapterArray).courtRegionIdArray(courtRegionIdArray).caseFiledStartDate(caseFiledStartDate).caseFiledEndDate(caseFiledEndDate).caseTerminatedStartDate(caseTerminatedStartDate).caseTerminatedEndDate(caseTerminatedEndDate).caseDischargedStartDate(caseDischargedStartDate).caseDischargedEndDate(caseDischargedEndDate).caseDismissedStartDate(caseDismissedStartDate).caseDismissedEndDate(caseDismissedEndDate).sortParameterQuery(sortParameterQuery).caseStatus(caseStatus).pageNumber(pageNumber).execute();

PACER Case Locator Search API for Bankruptcy Courts.

Search for PACER cases filed in U.S. Bankruptcy Courts.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PacerApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://enterpriseapi.unicourt.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    UniCourt client = new UniCourt(configuration);
    String pacerUserId = "johndoe"; // The username of the PACER account under which the search is to be performed.
    String pacerClientCode = "john"; // The PACER client code under which the search is to be performed.
    String caseNumber = "12-1234"; // The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit).
    Integer pacerCaseId = 56; // The PACER-assigned identifier of the target case.
    String caseTitle = "caseTitle_example"; // The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc.
    Integer caseOffice = 56; // The divisional office in which the case was filed.
    Integer caseSequenceNumber = 56; // The PACER-assigned sequence number of the target case. Ex 12345
    Integer caseYear = 56; // The two- or four-digit year in which the target case was filed.
    List<String> caseTypeArray = Arrays.asList(); // The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray=cv&caseTypeArray=cr
    List<String> federalBankruptcyChapterArray = Arrays.asList(); // The chapter of the U.S. Bankruptcy Code under which the target case was filed. Please see Appendix D for a list of valid chapter numbers.    Scenario: When mulitple Federal Bankruptcy Chapters needs to be requested.    Imagine for a given case number 12-1234 I would like to search with the Federal Bankruptcy Chapters 7 (Chapter 7) and 11 (Chapter 11), My query in the request will look like the example mentioned below.    Example: federalBankruptcyChapterArray=7&federalBankruptcyChapterArray=11
    List<String> courtRegionIdArray = Arrays.asList(); // The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray=cac&courtRegionIdArray=cae
    OffsetDateTime caseFiledStartDate = OffsetDateTime.now(); // The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseFiledEndDate = OffsetDateTime.now(); // The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedStartDate = OffsetDateTime.now(); // The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedEndDate = OffsetDateTime.now(); // The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseDischargedStartDate = OffsetDateTime.now(); // The date on which or after which the target case was marked as discharged within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).    Note: This parameter is applicable since we only perform this search for Bankruptcy Court type.
    OffsetDateTime caseDischargedEndDate = OffsetDateTime.now(); // The date on which or before which the target case was marked as discharged within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).    Note: This parameter is applicable since we only perform this search for Bankruptcy Court type.
    OffsetDateTime caseDismissedStartDate = OffsetDateTime.now(); // The date on which or after which the target case was marked as dismissed within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).    Note: This parameter is applicable since we only perform this search for Bankruptcy Court type.
    OffsetDateTime caseDismissedEndDate = OffsetDateTime.now(); // The date on which or before which the target case was marked as dismissed within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    String sortParameterQuery = "sort=caseYear,DESC"; // How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery=courtId,ASC&caseId,ASC
    String caseStatus = "open"; // Whether the target case is marked as 'open' or 'closed' within PACER.
    Integer pageNumber = 1; // The page number of the search results to be retrieved.
    try {
      PCLCase result = client
              .pacerApi
              .searchBankruptcyCases(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .pacerCaseId(pacerCaseId)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .federalBankruptcyChapterArray(federalBankruptcyChapterArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .caseDischargedStartDate(caseDischargedStartDate)
              .caseDischargedEndDate(caseDischargedEndDate)
              .caseDismissedStartDate(caseDismissedStartDate)
              .caseDismissedEndDate(caseDismissedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPacerPageInfo());
      System.out.println(result.getPacerReceipt());
      System.out.println(result.getPacerSearchResultsArray());
      System.out.println(result.getPageNumber());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchBankruptcyCases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PCLCase> response = client
              .pacerApi
              .searchBankruptcyCases(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .pacerCaseId(pacerCaseId)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .federalBankruptcyChapterArray(federalBankruptcyChapterArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .caseDischargedStartDate(caseDischargedStartDate)
              .caseDischargedEndDate(caseDischargedEndDate)
              .caseDismissedStartDate(caseDismissedStartDate)
              .caseDismissedEndDate(caseDismissedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchBankruptcyCases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pacerUserId** | **String**| The username of the PACER account under which the search is to be performed. | |
| **pacerClientCode** | **String**| The PACER client code under which the search is to be performed. | |
| **caseNumber** | **String**| The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit). | [optional] |
| **pacerCaseId** | **Integer**| The PACER-assigned identifier of the target case. | [optional] |
| **caseTitle** | **String**| The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc. | [optional] |
| **caseOffice** | **Integer**| The divisional office in which the case was filed. | [optional] |
| **caseSequenceNumber** | **Integer**| The PACER-assigned sequence number of the target case. Ex 12345 | [optional] |
| **caseYear** | **Integer**| The two- or four-digit year in which the target case was filed. | [optional] |
| **caseTypeArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray&#x3D;cv&amp;caseTypeArray&#x3D;cr | [optional] |
| **federalBankruptcyChapterArray** | [**List&lt;String&gt;**](String.md)| The chapter of the U.S. Bankruptcy Code under which the target case was filed. Please see Appendix D for a list of valid chapter numbers.    Scenario: When mulitple Federal Bankruptcy Chapters needs to be requested.    Imagine for a given case number 12-1234 I would like to search with the Federal Bankruptcy Chapters 7 (Chapter 7) and 11 (Chapter 11), My query in the request will look like the example mentioned below.    Example: federalBankruptcyChapterArray&#x3D;7&amp;federalBankruptcyChapterArray&#x3D;11 | [optional] |
| **courtRegionIdArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray&#x3D;cac&amp;courtRegionIdArray&#x3D;cae | [optional] |
| **caseFiledStartDate** | **OffsetDateTime**| The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseFiledEndDate** | **OffsetDateTime**| The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedStartDate** | **OffsetDateTime**| The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedEndDate** | **OffsetDateTime**| The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseDischargedStartDate** | **OffsetDateTime**| The date on which or after which the target case was marked as discharged within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).    Note: This parameter is applicable since we only perform this search for Bankruptcy Court type. | [optional] |
| **caseDischargedEndDate** | **OffsetDateTime**| The date on which or before which the target case was marked as discharged within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).    Note: This parameter is applicable since we only perform this search for Bankruptcy Court type. | [optional] |
| **caseDismissedStartDate** | **OffsetDateTime**| The date on which or after which the target case was marked as dismissed within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).    Note: This parameter is applicable since we only perform this search for Bankruptcy Court type. | [optional] |
| **caseDismissedEndDate** | **OffsetDateTime**| The date on which or before which the target case was marked as dismissed within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **sortParameterQuery** | **String**| How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery&#x3D;courtId,ASC&amp;caseId,ASC | [optional] [default to sort&#x3D;caseYear,DESC] |
| **caseStatus** | **String**| Whether the target case is marked as &#39;open&#39; or &#39;closed&#39; within PACER. | [optional] [enum: open, closed] |
| **pageNumber** | **Integer**| The page number of the search results to be retrieved. | [optional] |

### Return type

[**PCLCase**](PCLCase.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="searchBankruptcyCourts"></a>
# **searchBankruptcyCourts**
> PCLParty searchBankruptcyCourts(pacerUserId, pacerClientCode).caseNumber(caseNumber).pacerCaseId(pacerCaseId).lastName(lastName).firstName(firstName).middleName(middleName).generation(generation).partyType(partyType).partyExactNameMatch(partyExactNameMatch).partyRoleArray(partyRoleArray).caseTitle(caseTitle).caseOffice(caseOffice).caseSequenceNumber(caseSequenceNumber).caseYear(caseYear).caseTypeArray(caseTypeArray).courtRegionIdArray(courtRegionIdArray).caseYearFrom(caseYearFrom).caseYearTo(caseYearTo).ssnOrEin(ssnOrEin).fourDigitSsn(fourDigitSsn).caseFiledStartDate(caseFiledStartDate).caseFiledEndDate(caseFiledEndDate).caseTerminatedStartDate(caseTerminatedStartDate).caseTerminatedEndDate(caseTerminatedEndDate).caseDischargedStartDate(caseDischargedStartDate).caseDischargedEndDate(caseDischargedEndDate).caseDismissedStartDate(caseDismissedStartDate).caseDismissedEndDate(caseDismissedEndDate).sortParameterQuery(sortParameterQuery).caseStatus(caseStatus).pageNumber(pageNumber).execute();

PACER Case Locator Search API for All Courts.

Search for the specified party in PACER bankruptcy filings.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PacerApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://enterpriseapi.unicourt.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    UniCourt client = new UniCourt(configuration);
    String pacerUserId = "johndoe"; // The username of the PACER account under which the search is to be performed.
    String pacerClientCode = "john"; // The PACER client code under which the search is to be performed.
    String caseNumber = "12-1234"; // The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit).
    Integer pacerCaseId = 56; // The PACER-assigned identifier of the target case.
    String lastName = "John"; // The last name (for an individual) or the entity name (for a business entity) of the target party.
    String firstName = "John"; // The first name of the target party.
    String middleName = "Doe"; // The middle name of the target party.
    String generation = "III"; // The suffix (e.g., Jr., III) of the target party's name.
    String partyType = "ptf"; // The court-assigned party type for a party involved in a case. Party type codes are created and assigned by individual courts, and as such, their meanings can vary from court to court.
    Boolean partyExactNameMatch = true; // Specify whether the search string must match the name of the target party exactly.
    List<String> partyRoleArray = Arrays.asList(); // The court-assigned role for a party to a case. Party role codes are created and assigned by individual courts, and as such, their meanings can vary from court to court.
    String caseTitle = "caseTitle_example"; // The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc.
    Integer caseOffice = 56; // The divisional office in which the case was filed.
    Integer caseSequenceNumber = 56; // The PACER-assigned sequence number of the target case. Ex 12345
    Integer caseYear = 56; // The two- or four-digit year in which the target case was filed.
    List<String> caseTypeArray = Arrays.asList(); // The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray=cv&caseTypeArray=cr
    List<String> courtRegionIdArray = Arrays.asList(); // The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray=cac&courtRegionIdArray=cae
    Integer caseYearFrom = 56; // Limit the results of the search to those cases from the year specified or later
    Integer caseYearTo = 56; // Limit the results of the search to those cases from the year specified or earlier
    String ssnOrEin = "ssnOrEin_example"; // The Social Security number or the federal Employer Identification Number of the target party. Either number can be entered with or without dashes.
    String fourDigitSsn = "fourDigitSsn_example"; // The last four digits of the Social Security number of the target party.   Note: When specified, a last name/entity name must also be specified.
    OffsetDateTime caseFiledStartDate = OffsetDateTime.now(); // The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseFiledEndDate = OffsetDateTime.now(); // The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedStartDate = OffsetDateTime.now(); // The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedEndDate = OffsetDateTime.now(); // The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseDischargedStartDate = OffsetDateTime.now(); // The date on which or after which the target case was marked as discharged within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).    Note: This parameter is applicable since we only perform this search for Bankruptcy Court type.
    OffsetDateTime caseDischargedEndDate = OffsetDateTime.now(); // The date on which or before which the target case was marked as discharged within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).    Note: This parameter is applicable since we only perform this search for Bankruptcy Court type.
    OffsetDateTime caseDismissedStartDate = OffsetDateTime.now(); // The date on which or after which the target case was marked as dismissed within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).    Note: This parameter is applicable since we only perform this search for Bankruptcy Court type.
    OffsetDateTime caseDismissedEndDate = OffsetDateTime.now(); // The date on which or before which the target case was marked as dismissed within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    String sortParameterQuery = "sort=caseYear,DESC"; // How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario 1: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery=courtId,ASC&caseId,ASC    Scenario 2: When you want to sort the response using the case parameters in the party search.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of caseOffice and descending order of caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery=courtCase.caseOffice,ASC&caseid,DESC
    String caseStatus = "open"; // Whether the target case is marked as 'open' or 'closed' within PACER.
    Integer pageNumber = 1; // The page number of the search results to be retrieved.
    try {
      PCLParty result = client
              .pacerApi
              .searchBankruptcyCourts(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .pacerCaseId(pacerCaseId)
              .lastName(lastName)
              .firstName(firstName)
              .middleName(middleName)
              .generation(generation)
              .partyType(partyType)
              .partyExactNameMatch(partyExactNameMatch)
              .partyRoleArray(partyRoleArray)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseYearFrom(caseYearFrom)
              .caseYearTo(caseYearTo)
              .ssnOrEin(ssnOrEin)
              .fourDigitSsn(fourDigitSsn)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .caseDischargedStartDate(caseDischargedStartDate)
              .caseDischargedEndDate(caseDischargedEndDate)
              .caseDismissedStartDate(caseDismissedStartDate)
              .caseDismissedEndDate(caseDismissedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPacerPageInfo());
      System.out.println(result.getPacerReceipt());
      System.out.println(result.getPacerSearchResultsArray());
      System.out.println(result.getPageNumber());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchBankruptcyCourts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PCLParty> response = client
              .pacerApi
              .searchBankruptcyCourts(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .pacerCaseId(pacerCaseId)
              .lastName(lastName)
              .firstName(firstName)
              .middleName(middleName)
              .generation(generation)
              .partyType(partyType)
              .partyExactNameMatch(partyExactNameMatch)
              .partyRoleArray(partyRoleArray)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseYearFrom(caseYearFrom)
              .caseYearTo(caseYearTo)
              .ssnOrEin(ssnOrEin)
              .fourDigitSsn(fourDigitSsn)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .caseDischargedStartDate(caseDischargedStartDate)
              .caseDischargedEndDate(caseDischargedEndDate)
              .caseDismissedStartDate(caseDismissedStartDate)
              .caseDismissedEndDate(caseDismissedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchBankruptcyCourts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pacerUserId** | **String**| The username of the PACER account under which the search is to be performed. | |
| **pacerClientCode** | **String**| The PACER client code under which the search is to be performed. | |
| **caseNumber** | **String**| The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit). | [optional] |
| **pacerCaseId** | **Integer**| The PACER-assigned identifier of the target case. | [optional] |
| **lastName** | **String**| The last name (for an individual) or the entity name (for a business entity) of the target party. | [optional] |
| **firstName** | **String**| The first name of the target party. | [optional] |
| **middleName** | **String**| The middle name of the target party. | [optional] |
| **generation** | **String**| The suffix (e.g., Jr., III) of the target party&#39;s name. | [optional] |
| **partyType** | **String**| The court-assigned party type for a party involved in a case. Party type codes are created and assigned by individual courts, and as such, their meanings can vary from court to court. | [optional] |
| **partyExactNameMatch** | **Boolean**| Specify whether the search string must match the name of the target party exactly. | [optional] |
| **partyRoleArray** | [**List&lt;String&gt;**](String.md)| The court-assigned role for a party to a case. Party role codes are created and assigned by individual courts, and as such, their meanings can vary from court to court. | [optional] |
| **caseTitle** | **String**| The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc. | [optional] |
| **caseOffice** | **Integer**| The divisional office in which the case was filed. | [optional] |
| **caseSequenceNumber** | **Integer**| The PACER-assigned sequence number of the target case. Ex 12345 | [optional] |
| **caseYear** | **Integer**| The two- or four-digit year in which the target case was filed. | [optional] |
| **caseTypeArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray&#x3D;cv&amp;caseTypeArray&#x3D;cr | [optional] |
| **courtRegionIdArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray&#x3D;cac&amp;courtRegionIdArray&#x3D;cae | [optional] |
| **caseYearFrom** | **Integer**| Limit the results of the search to those cases from the year specified or later | [optional] |
| **caseYearTo** | **Integer**| Limit the results of the search to those cases from the year specified or earlier | [optional] |
| **ssnOrEin** | **String**| The Social Security number or the federal Employer Identification Number of the target party. Either number can be entered with or without dashes. | [optional] |
| **fourDigitSsn** | **String**| The last four digits of the Social Security number of the target party.   Note: When specified, a last name/entity name must also be specified. | [optional] |
| **caseFiledStartDate** | **OffsetDateTime**| The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseFiledEndDate** | **OffsetDateTime**| The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedStartDate** | **OffsetDateTime**| The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedEndDate** | **OffsetDateTime**| The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseDischargedStartDate** | **OffsetDateTime**| The date on which or after which the target case was marked as discharged within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).    Note: This parameter is applicable since we only perform this search for Bankruptcy Court type. | [optional] |
| **caseDischargedEndDate** | **OffsetDateTime**| The date on which or before which the target case was marked as discharged within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).    Note: This parameter is applicable since we only perform this search for Bankruptcy Court type. | [optional] |
| **caseDismissedStartDate** | **OffsetDateTime**| The date on which or after which the target case was marked as dismissed within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).    Note: This parameter is applicable since we only perform this search for Bankruptcy Court type. | [optional] |
| **caseDismissedEndDate** | **OffsetDateTime**| The date on which or before which the target case was marked as dismissed within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **sortParameterQuery** | **String**| How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario 1: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery&#x3D;courtId,ASC&amp;caseId,ASC    Scenario 2: When you want to sort the response using the case parameters in the party search.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of caseOffice and descending order of caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery&#x3D;courtCase.caseOffice,ASC&amp;caseid,DESC | [optional] [default to sort&#x3D;caseYear,DESC] |
| **caseStatus** | **String**| Whether the target case is marked as &#39;open&#39; or &#39;closed&#39; within PACER. | [optional] [enum: open, closed] |
| **pageNumber** | **Integer**| The page number of the search results to be retrieved. | [optional] |

### Return type

[**PCLParty**](PCLParty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="searchCivilCases"></a>
# **searchCivilCases**
> PCLCase searchCivilCases(pacerUserId, pacerClientCode).caseNumber(caseNumber).pacerCaseId(pacerCaseId).caseTitle(caseTitle).caseOffice(caseOffice).caseSequenceNumber(caseSequenceNumber).caseYear(caseYear).caseTypeArray(caseTypeArray).natureOfSuitsArray(natureOfSuitsArray).courtRegionIdArray(courtRegionIdArray).caseFiledStartDate(caseFiledStartDate).caseFiledEndDate(caseFiledEndDate).caseTerminatedStartDate(caseTerminatedStartDate).caseTerminatedEndDate(caseTerminatedEndDate).sortParameterQuery(sortParameterQuery).caseStatus(caseStatus).pageNumber(pageNumber).execute();

PACER Case Locator Search API for All Courts.

Search for civil cases filed in PACER.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PacerApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://enterpriseapi.unicourt.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    UniCourt client = new UniCourt(configuration);
    String pacerUserId = "johndoe"; // The username of the PACER account under which the search is to be performed.
    String pacerClientCode = "john"; // The PACER client code under which the search is to be performed.
    String caseNumber = "12-1234"; // The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit).
    Integer pacerCaseId = 56; // The PACER-assigned identifier of the target case.
    String caseTitle = "caseTitle_example"; // The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc.
    Integer caseOffice = 56; // The divisional office in which the case was filed.
    Integer caseSequenceNumber = 56; // The PACER-assigned sequence number of the target case.
    Integer caseYear = 56; // The two- or four-digit year in which the target case was filed.
    List<String> caseTypeArray = Arrays.asList(); // The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray=cv&caseTypeArray=cr
    List<String> natureOfSuitsArray = Arrays.asList(); // The PACER-assigned nature of suit classification of the target case. Please see Appendix E for valid nature-of-suit classifications for cases.    Scenario: When mulitple nature of suits needs to be requested.    Imagine for a given case number 12-1234 I would like to search with the nature of suit 110 (Insurance) and 140 (Negotiable Instrument), My query in the request will look like the example mentioned below.    Example: natureOfSuitsArray=110&natureOfSuitsArray=140
    List<String> courtRegionIdArray = Arrays.asList(); // The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray=cac&courtRegionIdArray=cae
    OffsetDateTime caseFiledStartDate = OffsetDateTime.now(); // The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseFiledEndDate = OffsetDateTime.now(); // The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedStartDate = OffsetDateTime.now(); // The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedEndDate = OffsetDateTime.now(); // The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    String sortParameterQuery = "sort=caseYear,DESC"; // How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery=courtId,ASC&caseId,ASC
    String caseStatus = "open"; // Whether the target case is marked as 'open' or 'closed' within PACER.
    Integer pageNumber = 1; // The page number of the search results to be retrieved.
    try {
      PCLCase result = client
              .pacerApi
              .searchCivilCases(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .pacerCaseId(pacerCaseId)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .natureOfSuitsArray(natureOfSuitsArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPacerPageInfo());
      System.out.println(result.getPacerReceipt());
      System.out.println(result.getPacerSearchResultsArray());
      System.out.println(result.getPageNumber());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchCivilCases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PCLCase> response = client
              .pacerApi
              .searchCivilCases(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .pacerCaseId(pacerCaseId)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .natureOfSuitsArray(natureOfSuitsArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchCivilCases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pacerUserId** | **String**| The username of the PACER account under which the search is to be performed. | |
| **pacerClientCode** | **String**| The PACER client code under which the search is to be performed. | |
| **caseNumber** | **String**| The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit). | [optional] |
| **pacerCaseId** | **Integer**| The PACER-assigned identifier of the target case. | [optional] |
| **caseTitle** | **String**| The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc. | [optional] |
| **caseOffice** | **Integer**| The divisional office in which the case was filed. | [optional] |
| **caseSequenceNumber** | **Integer**| The PACER-assigned sequence number of the target case. | [optional] |
| **caseYear** | **Integer**| The two- or four-digit year in which the target case was filed. | [optional] |
| **caseTypeArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray&#x3D;cv&amp;caseTypeArray&#x3D;cr | [optional] |
| **natureOfSuitsArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned nature of suit classification of the target case. Please see Appendix E for valid nature-of-suit classifications for cases.    Scenario: When mulitple nature of suits needs to be requested.    Imagine for a given case number 12-1234 I would like to search with the nature of suit 110 (Insurance) and 140 (Negotiable Instrument), My query in the request will look like the example mentioned below.    Example: natureOfSuitsArray&#x3D;110&amp;natureOfSuitsArray&#x3D;140 | [optional] |
| **courtRegionIdArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray&#x3D;cac&amp;courtRegionIdArray&#x3D;cae | [optional] |
| **caseFiledStartDate** | **OffsetDateTime**| The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseFiledEndDate** | **OffsetDateTime**| The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedStartDate** | **OffsetDateTime**| The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedEndDate** | **OffsetDateTime**| The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **sortParameterQuery** | **String**| How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery&#x3D;courtId,ASC&amp;caseId,ASC | [optional] [default to sort&#x3D;caseYear,DESC] |
| **caseStatus** | **String**| Whether the target case is marked as &#39;open&#39; or &#39;closed&#39; within PACER. | [optional] [enum: open, closed] |
| **pageNumber** | **Integer**| The page number of the search results to be retrieved. | [optional] |

### Return type

[**PCLCase**](PCLCase.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="searchCivilCasesInCourts"></a>
# **searchCivilCasesInCourts**
> PCLParty searchCivilCasesInCourts(pacerUserId, pacerClientCode).caseNumber(caseNumber).pacerCaseId(pacerCaseId).lastName(lastName).firstName(firstName).middleName(middleName).generation(generation).partyType(partyType).partyExactNameMatch(partyExactNameMatch).partyRoleArray(partyRoleArray).caseTitle(caseTitle).caseOffice(caseOffice).caseSequenceNumber(caseSequenceNumber).caseYear(caseYear).caseTypeArray(caseTypeArray).courtRegionIdArray(courtRegionIdArray).caseYearFrom(caseYearFrom).caseYearTo(caseYearTo).caseFiledStartDate(caseFiledStartDate).caseFiledEndDate(caseFiledEndDate).caseTerminatedStartDate(caseTerminatedStartDate).caseTerminatedEndDate(caseTerminatedEndDate).sortParameterQuery(sortParameterQuery).caseStatus(caseStatus).pageNumber(pageNumber).execute();

PACER Case Locator Search API for All Courts.

Search for the specified party in civil cases filed in PACER.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PacerApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://enterpriseapi.unicourt.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    UniCourt client = new UniCourt(configuration);
    String pacerUserId = "johndoe"; // The username of the PACER account under which the search is to be performed.
    String pacerClientCode = "john"; // The PACER client code under which the search is to be performed.
    String caseNumber = "12-1234"; // The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit).
    Integer pacerCaseId = 56; // The PACER-assigned identifier of the target case.
    String lastName = "John"; // The last name (for an individual) or the entity name (for a business entity) of the target party.
    String firstName = "John"; // The first name of the target party.
    String middleName = "Doe"; // The middle name of the target party.
    String generation = "III"; // The name suffix (e.g., III, MD).
    String partyType = "ptf"; // The court-assigned party type for a party involved in a case. Party type codes are created and assigned by individual courts, and as such, their meanings can vary from court to court.
    Boolean partyExactNameMatch = true; // Specify whether the search string must match the name of the target party exactly.
    List<String> partyRoleArray = Arrays.asList(); // The court-assigned role for a party to a case. Party role codes are created and assigned by individual courts, and as such, their meanings can vary from court to court.
    String caseTitle = "caseTitle_example"; // The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc.
    Integer caseOffice = 56; // The divisional office in which the case was filed.
    Integer caseSequenceNumber = 56; // The PACER-assigned sequence number of the target case. Ex 12345
    Integer caseYear = 56; // The two- or four-digit year in which the target case was filed.
    List<String> caseTypeArray = Arrays.asList(); // The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray=cv&caseTypeArray=cr
    List<String> courtRegionIdArray = Arrays.asList(); // The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray=cac&courtRegionIdArray=cae
    Integer caseYearFrom = 56; // Limit the results of the search to those cases from the year specified or later
    Integer caseYearTo = 56; // Limit the results of the search to those cases from the year specified or earlier
    OffsetDateTime caseFiledStartDate = OffsetDateTime.now(); // The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseFiledEndDate = OffsetDateTime.now(); // The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedStartDate = OffsetDateTime.now(); // The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedEndDate = OffsetDateTime.now(); // The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    String sortParameterQuery = "sort=caseYear,DESC"; // How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario 1: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery=courtId,ASC&caseId,ASC    Scenario 2: When you want to sort the response using the case parameters in the party search.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of caseOffice and descending order of caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery=courtCase.caseOffice,ASC&caseid,DESC
    String caseStatus = "open"; // Whether the target case is marked as 'open' or 'closed' within PACER.
    Integer pageNumber = 1; // The page number of the search results to be retrieved.
    try {
      PCLParty result = client
              .pacerApi
              .searchCivilCasesInCourts(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .pacerCaseId(pacerCaseId)
              .lastName(lastName)
              .firstName(firstName)
              .middleName(middleName)
              .generation(generation)
              .partyType(partyType)
              .partyExactNameMatch(partyExactNameMatch)
              .partyRoleArray(partyRoleArray)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseYearFrom(caseYearFrom)
              .caseYearTo(caseYearTo)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPacerPageInfo());
      System.out.println(result.getPacerReceipt());
      System.out.println(result.getPacerSearchResultsArray());
      System.out.println(result.getPageNumber());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchCivilCasesInCourts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PCLParty> response = client
              .pacerApi
              .searchCivilCasesInCourts(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .pacerCaseId(pacerCaseId)
              .lastName(lastName)
              .firstName(firstName)
              .middleName(middleName)
              .generation(generation)
              .partyType(partyType)
              .partyExactNameMatch(partyExactNameMatch)
              .partyRoleArray(partyRoleArray)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseYearFrom(caseYearFrom)
              .caseYearTo(caseYearTo)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchCivilCasesInCourts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pacerUserId** | **String**| The username of the PACER account under which the search is to be performed. | |
| **pacerClientCode** | **String**| The PACER client code under which the search is to be performed. | |
| **caseNumber** | **String**| The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit). | [optional] |
| **pacerCaseId** | **Integer**| The PACER-assigned identifier of the target case. | [optional] |
| **lastName** | **String**| The last name (for an individual) or the entity name (for a business entity) of the target party. | [optional] |
| **firstName** | **String**| The first name of the target party. | [optional] |
| **middleName** | **String**| The middle name of the target party. | [optional] |
| **generation** | **String**| The name suffix (e.g., III, MD). | [optional] |
| **partyType** | **String**| The court-assigned party type for a party involved in a case. Party type codes are created and assigned by individual courts, and as such, their meanings can vary from court to court. | [optional] |
| **partyExactNameMatch** | **Boolean**| Specify whether the search string must match the name of the target party exactly. | [optional] |
| **partyRoleArray** | [**List&lt;String&gt;**](String.md)| The court-assigned role for a party to a case. Party role codes are created and assigned by individual courts, and as such, their meanings can vary from court to court. | [optional] |
| **caseTitle** | **String**| The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc. | [optional] |
| **caseOffice** | **Integer**| The divisional office in which the case was filed. | [optional] |
| **caseSequenceNumber** | **Integer**| The PACER-assigned sequence number of the target case. Ex 12345 | [optional] |
| **caseYear** | **Integer**| The two- or four-digit year in which the target case was filed. | [optional] |
| **caseTypeArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray&#x3D;cv&amp;caseTypeArray&#x3D;cr | [optional] |
| **courtRegionIdArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray&#x3D;cac&amp;courtRegionIdArray&#x3D;cae | [optional] |
| **caseYearFrom** | **Integer**| Limit the results of the search to those cases from the year specified or later | [optional] |
| **caseYearTo** | **Integer**| Limit the results of the search to those cases from the year specified or earlier | [optional] |
| **caseFiledStartDate** | **OffsetDateTime**| The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseFiledEndDate** | **OffsetDateTime**| The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedStartDate** | **OffsetDateTime**| The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedEndDate** | **OffsetDateTime**| The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **sortParameterQuery** | **String**| How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario 1: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery&#x3D;courtId,ASC&amp;caseId,ASC    Scenario 2: When you want to sort the response using the case parameters in the party search.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of caseOffice and descending order of caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery&#x3D;courtCase.caseOffice,ASC&amp;caseid,DESC | [optional] [default to sort&#x3D;caseYear,DESC] |
| **caseStatus** | **String**| Whether the target case is marked as &#39;open&#39; or &#39;closed&#39; within PACER. | [optional] [enum: open, closed] |
| **pageNumber** | **Integer**| The page number of the search results to be retrieved. | [optional] |

### Return type

[**PCLParty**](PCLParty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="searchCriminalCases"></a>
# **searchCriminalCases**
> PCLCase searchCriminalCases(pacerUserId, pacerClientCode).caseNumber(caseNumber).pacerCaseId(pacerCaseId).caseTitle(caseTitle).caseOffice(caseOffice).caseSequenceNumber(caseSequenceNumber).caseYear(caseYear).caseTypeArray(caseTypeArray).courtRegionIdArray(courtRegionIdArray).caseFiledStartDate(caseFiledStartDate).caseFiledEndDate(caseFiledEndDate).caseTerminatedStartDate(caseTerminatedStartDate).caseTerminatedEndDate(caseTerminatedEndDate).sortParameterQuery(sortParameterQuery).caseStatus(caseStatus).pageNumber(pageNumber).execute();

PACER Case Locator Search API for All Courts.

Search for criminal cases in PACER.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PacerApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://enterpriseapi.unicourt.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    UniCourt client = new UniCourt(configuration);
    String pacerUserId = "johndoe"; // The username of the PACER account under which the search is to be performed.
    String pacerClientCode = "john"; // The PACER client code under which the search is to be performed.
    String caseNumber = "12-1234"; // The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit).
    Integer pacerCaseId = 56; // The PACER-assigned identifier of the target case.
    String caseTitle = "caseTitle_example"; // The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc.
    Integer caseOffice = 56; // The divisional office in which the case was filed.
    Integer caseSequenceNumber = 56; // The PACER-assigned sequence number of the target case. Ex 12345
    Integer caseYear = 56; // The two- or four-digit year in which the target case was filed.
    List<String> caseTypeArray = Arrays.asList(); // The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray=cv&caseTypeArray=cr
    List<String> courtRegionIdArray = Arrays.asList(); // The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray=cac&courtRegionIdArray=cae
    OffsetDateTime caseFiledStartDate = OffsetDateTime.now(); // The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseFiledEndDate = OffsetDateTime.now(); // The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedStartDate = OffsetDateTime.now(); // The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedEndDate = OffsetDateTime.now(); // The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    String sortParameterQuery = "sort=caseYear,DESC"; // How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery=courtId,ASC&caseId,ASC
    String caseStatus = "open"; // Whether the target case is marked as 'open' or 'closed' within PACER.
    Integer pageNumber = 1; // The page number of the search results to be retrieved.
    try {
      PCLCase result = client
              .pacerApi
              .searchCriminalCases(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .pacerCaseId(pacerCaseId)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPacerPageInfo());
      System.out.println(result.getPacerReceipt());
      System.out.println(result.getPacerSearchResultsArray());
      System.out.println(result.getPageNumber());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchCriminalCases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PCLCase> response = client
              .pacerApi
              .searchCriminalCases(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .pacerCaseId(pacerCaseId)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchCriminalCases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pacerUserId** | **String**| The username of the PACER account under which the search is to be performed. | |
| **pacerClientCode** | **String**| The PACER client code under which the search is to be performed. | |
| **caseNumber** | **String**| The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit). | [optional] |
| **pacerCaseId** | **Integer**| The PACER-assigned identifier of the target case. | [optional] |
| **caseTitle** | **String**| The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc. | [optional] |
| **caseOffice** | **Integer**| The divisional office in which the case was filed. | [optional] |
| **caseSequenceNumber** | **Integer**| The PACER-assigned sequence number of the target case. Ex 12345 | [optional] |
| **caseYear** | **Integer**| The two- or four-digit year in which the target case was filed. | [optional] |
| **caseTypeArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray&#x3D;cv&amp;caseTypeArray&#x3D;cr | [optional] |
| **courtRegionIdArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray&#x3D;cac&amp;courtRegionIdArray&#x3D;cae | [optional] |
| **caseFiledStartDate** | **OffsetDateTime**| The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseFiledEndDate** | **OffsetDateTime**| The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedStartDate** | **OffsetDateTime**| The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedEndDate** | **OffsetDateTime**| The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **sortParameterQuery** | **String**| How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery&#x3D;courtId,ASC&amp;caseId,ASC | [optional] [default to sort&#x3D;caseYear,DESC] |
| **caseStatus** | **String**| Whether the target case is marked as &#39;open&#39; or &#39;closed&#39; within PACER. | [optional] [enum: open, closed] |
| **pageNumber** | **Integer**| The page number of the search results to be retrieved. | [optional] |

### Return type

[**PCLCase**](PCLCase.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="searchCriminalCases_0"></a>
# **searchCriminalCases_0**
> PCLParty searchCriminalCases_0(pacerUserId, pacerClientCode).caseNumber(caseNumber).pacerCaseId(pacerCaseId).lastName(lastName).firstName(firstName).middleName(middleName).generation(generation).partyType(partyType).partyExactNameMatch(partyExactNameMatch).partyRoleArray(partyRoleArray).caseTitle(caseTitle).caseOffice(caseOffice).caseSequenceNumber(caseSequenceNumber).caseYear(caseYear).caseTypeArray(caseTypeArray).courtRegionIdArray(courtRegionIdArray).caseYearFrom(caseYearFrom).caseYearTo(caseYearTo).caseFiledStartDate(caseFiledStartDate).caseFiledEndDate(caseFiledEndDate).caseTerminatedStartDate(caseTerminatedStartDate).caseTerminatedEndDate(caseTerminatedEndDate).sortParameterQuery(sortParameterQuery).caseStatus(caseStatus).pageNumber(pageNumber).execute();

PACER Case Locator Search API for All Courts.

Search for the specified party in PACER criminal cases.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PacerApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://enterpriseapi.unicourt.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    UniCourt client = new UniCourt(configuration);
    String pacerUserId = "johndoe"; // The username of the PACER account under which the search is to be performed.
    String pacerClientCode = "john"; // The PACER client code under which the search is to be performed.
    String caseNumber = "12-1234"; // The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit).
    Integer pacerCaseId = 56; // The PACER-assigned identifier of the target case.
    String lastName = "John"; // The last name (for an individual) or the entity name (for a business entity) of the target party.
    String firstName = "John"; // The first name of the target party.
    String middleName = "Doe"; // The middle name of the target party.
    String generation = "III"; // The suffix (e.g., Jr., III) of the target party's name.
    String partyType = "ptf"; // The court-assigned party type for a party involved in a case. Party type codes are created and assigned by individual courts, and as such, their meanings can vary from court to court.
    Boolean partyExactNameMatch = true; // Specify whether the search string must match the name of the target party exactly.
    List<String> partyRoleArray = Arrays.asList(); // The court-assigned role for a party to a case. Party role codes are created and assigned by individual courts, and as such, their meanings can vary from court to court.
    String caseTitle = "caseTitle_example"; // The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc.
    Integer caseOffice = 56; // The divisional office in which the case was filed.
    Integer caseSequenceNumber = 56; // The PACER-assigned sequence number of the target case. Ex 12345
    Integer caseYear = 56; // The two- or four-digit year in which the target case was filed.
    List<String> caseTypeArray = Arrays.asList(); // The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray=cv&caseTypeArray=cr
    List<String> courtRegionIdArray = Arrays.asList(); // The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray=cac&courtRegionIdArray=cae
    Integer caseYearFrom = 56; // Limit the results of the search to those cases from the year specified or later
    Integer caseYearTo = 56; // Limit the results of the search to those cases from the year specified or earlier
    OffsetDateTime caseFiledStartDate = OffsetDateTime.now(); // The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseFiledEndDate = OffsetDateTime.now(); // The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedStartDate = OffsetDateTime.now(); // The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedEndDate = OffsetDateTime.now(); // The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    String sortParameterQuery = "sort=caseYear,DESC"; // How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario 1: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery=courtId,ASC&caseId,ASC    Scenario 2: When you want to sort the response using the case parameters in the party search.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of caseOffice and descending order of caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery=courtCase.caseOffice,ASC&caseid,DESC
    String caseStatus = "open"; // Whether the target case is marked as 'open' or 'closed' within PACER.
    Integer pageNumber = 1; // The page number of the search results to be retrieved.
    try {
      PCLParty result = client
              .pacerApi
              .searchCriminalCases_0(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .pacerCaseId(pacerCaseId)
              .lastName(lastName)
              .firstName(firstName)
              .middleName(middleName)
              .generation(generation)
              .partyType(partyType)
              .partyExactNameMatch(partyExactNameMatch)
              .partyRoleArray(partyRoleArray)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseYearFrom(caseYearFrom)
              .caseYearTo(caseYearTo)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPacerPageInfo());
      System.out.println(result.getPacerReceipt());
      System.out.println(result.getPacerSearchResultsArray());
      System.out.println(result.getPageNumber());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchCriminalCases_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PCLParty> response = client
              .pacerApi
              .searchCriminalCases_0(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .pacerCaseId(pacerCaseId)
              .lastName(lastName)
              .firstName(firstName)
              .middleName(middleName)
              .generation(generation)
              .partyType(partyType)
              .partyExactNameMatch(partyExactNameMatch)
              .partyRoleArray(partyRoleArray)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseYearFrom(caseYearFrom)
              .caseYearTo(caseYearTo)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchCriminalCases_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pacerUserId** | **String**| The username of the PACER account under which the search is to be performed. | |
| **pacerClientCode** | **String**| The PACER client code under which the search is to be performed. | |
| **caseNumber** | **String**| The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit). | [optional] |
| **pacerCaseId** | **Integer**| The PACER-assigned identifier of the target case. | [optional] |
| **lastName** | **String**| The last name (for an individual) or the entity name (for a business entity) of the target party. | [optional] |
| **firstName** | **String**| The first name of the target party. | [optional] |
| **middleName** | **String**| The middle name of the target party. | [optional] |
| **generation** | **String**| The suffix (e.g., Jr., III) of the target party&#39;s name. | [optional] |
| **partyType** | **String**| The court-assigned party type for a party involved in a case. Party type codes are created and assigned by individual courts, and as such, their meanings can vary from court to court. | [optional] |
| **partyExactNameMatch** | **Boolean**| Specify whether the search string must match the name of the target party exactly. | [optional] |
| **partyRoleArray** | [**List&lt;String&gt;**](String.md)| The court-assigned role for a party to a case. Party role codes are created and assigned by individual courts, and as such, their meanings can vary from court to court. | [optional] |
| **caseTitle** | **String**| The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc. | [optional] |
| **caseOffice** | **Integer**| The divisional office in which the case was filed. | [optional] |
| **caseSequenceNumber** | **Integer**| The PACER-assigned sequence number of the target case. Ex 12345 | [optional] |
| **caseYear** | **Integer**| The two- or four-digit year in which the target case was filed. | [optional] |
| **caseTypeArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray&#x3D;cv&amp;caseTypeArray&#x3D;cr | [optional] |
| **courtRegionIdArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray&#x3D;cac&amp;courtRegionIdArray&#x3D;cae | [optional] |
| **caseYearFrom** | **Integer**| Limit the results of the search to those cases from the year specified or later | [optional] |
| **caseYearTo** | **Integer**| Limit the results of the search to those cases from the year specified or earlier | [optional] |
| **caseFiledStartDate** | **OffsetDateTime**| The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseFiledEndDate** | **OffsetDateTime**| The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedStartDate** | **OffsetDateTime**| The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedEndDate** | **OffsetDateTime**| The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **sortParameterQuery** | **String**| How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario 1: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery&#x3D;courtId,ASC&amp;caseId,ASC    Scenario 2: When you want to sort the response using the case parameters in the party search.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of caseOffice and descending order of caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery&#x3D;courtCase.caseOffice,ASC&amp;caseid,DESC | [optional] [default to sort&#x3D;caseYear,DESC] |
| **caseStatus** | **String**| Whether the target case is marked as &#39;open&#39; or &#39;closed&#39; within PACER. | [optional] [enum: open, closed] |
| **pageNumber** | **Integer**| The page number of the search results to be retrieved. | [optional] |

### Return type

[**PCLParty**](PCLParty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="searchMultiDistrictCourtCases"></a>
# **searchMultiDistrictCourtCases**
> PCLCase searchMultiDistrictCourtCases(pacerUserId, pacerClientCode).caseNumber(caseNumber).jpmlNumber(jpmlNumber).pacerCaseId(pacerCaseId).caseTitle(caseTitle).caseOffice(caseOffice).caseSequenceNumber(caseSequenceNumber).caseYear(caseYear).caseTypeArray(caseTypeArray).courtRegionIdArray(courtRegionIdArray).caseFiledStartDate(caseFiledStartDate).caseFiledEndDate(caseFiledEndDate).caseTerminatedStartDate(caseTerminatedStartDate).caseTerminatedEndDate(caseTerminatedEndDate).sortParameterQuery(sortParameterQuery).caseStatus(caseStatus).pageNumber(pageNumber).execute();

PACER Case Locator Search API for All Courts.

Search for multidistrict litigation in PACER.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PacerApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://enterpriseapi.unicourt.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    UniCourt client = new UniCourt(configuration);
    String pacerUserId = "johndoe"; // The username of the PACER account under which the search is to be performed.
    String pacerClientCode = "john"; // The PACER client code under which the search is to be performed.
    String caseNumber = "12-1234"; // The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit).
    Integer jpmlNumber = 875; // Master JPML Case Number.
    Integer pacerCaseId = 56; // The PACER-assigned identifier of the target case.
    String caseTitle = "caseTitle_example"; // The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc.
    Integer caseOffice = 56; // The divisional office in which the case was filed.
    Integer caseSequenceNumber = 56; // The PACER-assigned sequence number of the target case. Ex 12345
    Integer caseYear = 56; // The two- or four-digit year in which the target case was filed.
    List<String> caseTypeArray = Arrays.asList(); // The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray=cv&caseTypeArray=cr
    List<String> courtRegionIdArray = Arrays.asList(); // The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray=cac&courtRegionIdArray=cae
    OffsetDateTime caseFiledStartDate = OffsetDateTime.now(); // The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseFiledEndDate = OffsetDateTime.now(); // The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedStartDate = OffsetDateTime.now(); // The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedEndDate = OffsetDateTime.now(); // The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    String sortParameterQuery = "sort=caseYear,DESC"; // How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery=courtId,ASC&caseId,ASC
    String caseStatus = "open"; // Whether the target case is marked as 'open' or 'closed' within PACER.
    Integer pageNumber = 1; // The page number of the search results to be retrieved.
    try {
      PCLCase result = client
              .pacerApi
              .searchMultiDistrictCourtCases(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .jpmlNumber(jpmlNumber)
              .pacerCaseId(pacerCaseId)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPacerPageInfo());
      System.out.println(result.getPacerReceipt());
      System.out.println(result.getPacerSearchResultsArray());
      System.out.println(result.getPageNumber());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchMultiDistrictCourtCases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PCLCase> response = client
              .pacerApi
              .searchMultiDistrictCourtCases(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .jpmlNumber(jpmlNumber)
              .pacerCaseId(pacerCaseId)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchMultiDistrictCourtCases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pacerUserId** | **String**| The username of the PACER account under which the search is to be performed. | |
| **pacerClientCode** | **String**| The PACER client code under which the search is to be performed. | |
| **caseNumber** | **String**| The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit). | [optional] |
| **jpmlNumber** | **Integer**| Master JPML Case Number. | [optional] |
| **pacerCaseId** | **Integer**| The PACER-assigned identifier of the target case. | [optional] |
| **caseTitle** | **String**| The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc. | [optional] |
| **caseOffice** | **Integer**| The divisional office in which the case was filed. | [optional] |
| **caseSequenceNumber** | **Integer**| The PACER-assigned sequence number of the target case. Ex 12345 | [optional] |
| **caseYear** | **Integer**| The two- or four-digit year in which the target case was filed. | [optional] |
| **caseTypeArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray&#x3D;cv&amp;caseTypeArray&#x3D;cr | [optional] |
| **courtRegionIdArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray&#x3D;cac&amp;courtRegionIdArray&#x3D;cae | [optional] |
| **caseFiledStartDate** | **OffsetDateTime**| The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseFiledEndDate** | **OffsetDateTime**| The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedStartDate** | **OffsetDateTime**| The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedEndDate** | **OffsetDateTime**| The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **sortParameterQuery** | **String**| How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery&#x3D;courtId,ASC&amp;caseId,ASC | [optional] [default to sort&#x3D;caseYear,DESC] |
| **caseStatus** | **String**| Whether the target case is marked as &#39;open&#39; or &#39;closed&#39; within PACER. | [optional] [enum: open, closed] |
| **pageNumber** | **Integer**| The page number of the search results to be retrieved. | [optional] |

### Return type

[**PCLCase**](PCLCase.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="searchMultiDistrictCourtCases_0"></a>
# **searchMultiDistrictCourtCases_0**
> PCLParty searchMultiDistrictCourtCases_0(pacerUserId, pacerClientCode).caseNumber(caseNumber).jpmlNumber(jpmlNumber).pacerCaseId(pacerCaseId).lastName(lastName).firstName(firstName).middleName(middleName).generation(generation).partyType(partyType).partyExactNameMatch(partyExactNameMatch).partyRoleArray(partyRoleArray).caseTitle(caseTitle).caseOffice(caseOffice).caseSequenceNumber(caseSequenceNumber).caseYear(caseYear).caseTypeArray(caseTypeArray).courtRegionIdArray(courtRegionIdArray).caseYearFrom(caseYearFrom).caseYearTo(caseYearTo).caseFiledStartDate(caseFiledStartDate).caseFiledEndDate(caseFiledEndDate).caseTerminatedStartDate(caseTerminatedStartDate).caseTerminatedEndDate(caseTerminatedEndDate).sortParameterQuery(sortParameterQuery).caseStatus(caseStatus).pageNumber(pageNumber).execute();

PACER Case Locator Search API for All Courts.

Search for the specified party in multidistrict litigation in PACER.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PacerApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://enterpriseapi.unicourt.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    UniCourt client = new UniCourt(configuration);
    String pacerUserId = "johndoe"; // The username of the PACER account under which the search is to be performed.
    String pacerClientCode = "john"; // The PACER client code under which the search is to be performed.
    String caseNumber = "12-1234"; // The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit).
    Integer jpmlNumber = 56; // Master JPML Case Number.
    Integer pacerCaseId = 56; // The PACER-assigned identifier of the target case.
    String lastName = "John"; // The last name (for an individual) or the entity name (for a business entity) of the target party.
    String firstName = "John"; // The first name of the target party.
    String middleName = "Doe"; // The middle name of the target party.
    String generation = "III"; // The suffix (e.g., Jr., III) of the target party's name.
    String partyType = "ptf"; // The court-assigned party type for a party involved in a case. Party type codes are created and assigned by individual courts, and as such, their meanings can vary from court to court.
    Boolean partyExactNameMatch = true; // Specify whether the search string must match the name of the target party exactly.
    List<String> partyRoleArray = Arrays.asList(); // The court-assigned role for a party to a case. Party role codes are created and assigned by individual courts, and as such, their meanings can vary from court to court.
    String caseTitle = "caseTitle_example"; // The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc.
    Integer caseOffice = 56; // The divisional office in which the case was filed.
    Integer caseSequenceNumber = 56; // The PACER-assigned sequence number of the target case. Ex 12345
    Integer caseYear = 56; // The two- or four-digit year in which the target case was filed.
    List<String> caseTypeArray = Arrays.asList(); // The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray=cv&caseTypeArray=cr
    List<String> courtRegionIdArray = Arrays.asList(); // The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray=cac&courtRegionIdArray=cae
    Integer caseYearFrom = 56; // Limit the results of the search to those cases from the year specified or later
    Integer caseYearTo = 56; // Limit the results of the search to those cases from the year specified or earlier
    OffsetDateTime caseFiledStartDate = OffsetDateTime.now(); // The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseFiledEndDate = OffsetDateTime.now(); // The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedStartDate = OffsetDateTime.now(); // The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    OffsetDateTime caseTerminatedEndDate = OffsetDateTime.now(); // The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00).
    String sortParameterQuery = "sort=caseYear,DESC"; // How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario 1: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery=courtId,ASC&caseId,ASC    Scenario 2: When you want to sort the response using the case parameters in the party search.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of caseOffice and descending order of caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery=courtCase.caseOffice,ASC&caseid,DESC
    String caseStatus = "open"; // Whether the target case is marked as 'open' or 'closed' within PACER.
    Integer pageNumber = 1; // The page number of the search results to be retrieved.
    try {
      PCLParty result = client
              .pacerApi
              .searchMultiDistrictCourtCases_0(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .jpmlNumber(jpmlNumber)
              .pacerCaseId(pacerCaseId)
              .lastName(lastName)
              .firstName(firstName)
              .middleName(middleName)
              .generation(generation)
              .partyType(partyType)
              .partyExactNameMatch(partyExactNameMatch)
              .partyRoleArray(partyRoleArray)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseYearFrom(caseYearFrom)
              .caseYearTo(caseYearTo)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPacerPageInfo());
      System.out.println(result.getPacerReceipt());
      System.out.println(result.getPacerSearchResultsArray());
      System.out.println(result.getPageNumber());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchMultiDistrictCourtCases_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PCLParty> response = client
              .pacerApi
              .searchMultiDistrictCourtCases_0(pacerUserId, pacerClientCode)
              .caseNumber(caseNumber)
              .jpmlNumber(jpmlNumber)
              .pacerCaseId(pacerCaseId)
              .lastName(lastName)
              .firstName(firstName)
              .middleName(middleName)
              .generation(generation)
              .partyType(partyType)
              .partyExactNameMatch(partyExactNameMatch)
              .partyRoleArray(partyRoleArray)
              .caseTitle(caseTitle)
              .caseOffice(caseOffice)
              .caseSequenceNumber(caseSequenceNumber)
              .caseYear(caseYear)
              .caseTypeArray(caseTypeArray)
              .courtRegionIdArray(courtRegionIdArray)
              .caseYearFrom(caseYearFrom)
              .caseYearTo(caseYearTo)
              .caseFiledStartDate(caseFiledStartDate)
              .caseFiledEndDate(caseFiledEndDate)
              .caseTerminatedStartDate(caseTerminatedStartDate)
              .caseTerminatedEndDate(caseTerminatedEndDate)
              .sortParameterQuery(sortParameterQuery)
              .caseStatus(caseStatus)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerApiApi#searchMultiDistrictCourtCases_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pacerUserId** | **String**| The username of the PACER account under which the search is to be performed. | |
| **pacerClientCode** | **String**| The PACER client code under which the search is to be performed. | |
| **caseNumber** | **String**| The case number of the target case. You may use the following case-number formats:    yy-nnnnn    yy-tp-nnnnn    yy tp nnnnn    yytpnnnnn    o:yy-nnnnn    o:yy-tp-nnnnn    o:yy tp nnnnn    o:yytpnnnnn   where:   yy  case year (may be 2 or 4 digits)   nnnnn  case number (up to 5 digits)   tp  case type (up to 2 characters)   o  office where the case was filed (1 digit). | [optional] |
| **jpmlNumber** | **Integer**| Master JPML Case Number. | [optional] |
| **pacerCaseId** | **Integer**| The PACER-assigned identifier of the target case. | [optional] |
| **lastName** | **String**| The last name (for an individual) or the entity name (for a business entity) of the target party. | [optional] |
| **firstName** | **String**| The first name of the target party. | [optional] |
| **middleName** | **String**| The middle name of the target party. | [optional] |
| **generation** | **String**| The suffix (e.g., Jr., III) of the target party&#39;s name. | [optional] |
| **partyType** | **String**| The court-assigned party type for a party involved in a case. Party type codes are created and assigned by individual courts, and as such, their meanings can vary from court to court. | [optional] |
| **partyExactNameMatch** | **Boolean**| Specify whether the search string must match the name of the target party exactly. | [optional] |
| **partyRoleArray** | [**List&lt;String&gt;**](String.md)| The court-assigned role for a party to a case. Party role codes are created and assigned by individual courts, and as such, their meanings can vary from court to court. | [optional] |
| **caseTitle** | **String**| The title of the target case.    Examples:    A search for case title john doe v will result in all cases with the case title John Doe v.    A search for case title Acme, Inc. will result in all case titles starting with Acme, Inc. | [optional] |
| **caseOffice** | **Integer**| The divisional office in which the case was filed. | [optional] |
| **caseSequenceNumber** | **Integer**| The PACER-assigned sequence number of the target case. Ex 12345 | [optional] |
| **caseYear** | **Integer**| The two- or four-digit year in which the target case was filed. | [optional] |
| **caseTypeArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned case type of the target case. Please see Appendix A for valid case-type values.    Scenario: When mulitple case types needs to be requested.    Imagine for a given case number 12-1234 I would like to search only with the case type civil(cv) and criminal(cr), My query in the request will look like the example mentioned below.    Example: caseTypeArray&#x3D;cv&amp;caseTypeArray&#x3D;cr | [optional] |
| **courtRegionIdArray** | [**List&lt;String&gt;**](String.md)| The PACER-assigned court region in which the target case was filed. Please see Appendix B for valid court-region values.    Scenario: When mulitple court region ids needs to be requested.    Imagine for a given case number 12-1234 I would like to search in the court regions California Central (cac) and California Eastern (cae), My query in the request will look like the example mentioned below.    Example: courtRegionIdArray&#x3D;cac&amp;courtRegionIdArray&#x3D;cae | [optional] |
| **caseYearFrom** | **Integer**| Limit the results of the search to those cases from the year specified or later | [optional] |
| **caseYearTo** | **Integer**| Limit the results of the search to those cases from the year specified or earlier | [optional] |
| **caseFiledStartDate** | **OffsetDateTime**| The date on which or after which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseFiledEndDate** | **OffsetDateTime**| The date on which or before which the target case was filed. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedStartDate** | **OffsetDateTime**| The date on which or after which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **caseTerminatedEndDate** | **OffsetDateTime**| The date on which or before which the target case was marked as terminated within PACER. The date format must be YYYY-MM-DDTHH:MM:SS+ZZ:zz, (e.g., 2017-12-20T12:54:24+00:00). | [optional] |
| **sortParameterQuery** | **String**| How search results from PACER are to be sorted. Please see Appendix C for valid sort-related settings.    Scenario 1: When mulitple sort paramters needs to be requested.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of courtId and caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery&#x3D;courtId,ASC&amp;caseId,ASC    Scenario 2: When you want to sort the response using the case parameters in the party search.    Imagine for a given case number 12-1234 I would like to sort the results in the Ascending order of caseOffice and descending order of caseId, My query in the request will look like the example mentioned below.    Example: sortParameterQuery&#x3D;courtCase.caseOffice,ASC&amp;caseid,DESC | [optional] [default to sort&#x3D;caseYear,DESC] |
| **caseStatus** | **String**| Whether the target case is marked as &#39;open&#39; or &#39;closed&#39; within PACER. | [optional] [enum: open, closed] |
| **pageNumber** | **Integer**| The page number of the search results to be retrieved. | [optional] |

### Return type

[**PCLParty**](PCLParty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

