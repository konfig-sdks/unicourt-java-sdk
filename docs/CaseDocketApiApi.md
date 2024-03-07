# CaseDocketApiApi

All URIs are relative to *https://enterpriseapi.unicourt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAssociatedAttorneyDetails**](CaseDocketApiApi.md#getAssociatedAttorneyDetails) | **GET** /party/{partyId}/associatedAttorneys | Gets Associated Attorney details for a requested Party ID. |
| [**getAssociatedParties**](CaseDocketApiApi.md#getAssociatedParties) | **GET** /attorney/{attorneyId}/associatedParties | Gets Associated Party details for a requested Attorney ID. |
| [**getAttorneyDetails**](CaseDocketApiApi.md#getAttorneyDetails) | **GET** /attorney/{attorneyId} | Gets details for a requested Attorney ID. |
| [**getAttorneysByCaseId**](CaseDocketApiApi.md#getAttorneysByCaseId) | **GET** /case/{caseId}/attorneys | Gets Attorneys for a requested Case ID. |
| [**getCaseInfo**](CaseDocketApiApi.md#getCaseInfo) | **GET** /case/{caseId} | Gets case information for a requested Case ID. |
| [**getCaseParties**](CaseDocketApiApi.md#getCaseParties) | **GET** /case/{caseId}/parties | Gets Parties for a requested Case ID. |
| [**getDocketEntries**](CaseDocketApiApi.md#getDocketEntries) | **GET** /case/{caseId}/docketEntries | Gets Docket Entries for a requested Case ID. |
| [**getHearingsForCase**](CaseDocketApiApi.md#getHearingsForCase) | **GET** /case/{caseId}/hearings | Gets Hearings for a requested Case ID. |
| [**getJudgeDetails**](CaseDocketApiApi.md#getJudgeDetails) | **GET** /judge/{judgeId} | Gets details for a requested Judge ID. |
| [**getJudgesForCase**](CaseDocketApiApi.md#getJudgesForCase) | **GET** /case/{caseId}/judges | Gets Judges for a requested Case ID. |
| [**getPartyDetails**](CaseDocketApiApi.md#getPartyDetails) | **GET** /party/{partyId} | Gets details for a requested Party ID. |
| [**getPrimaryDocuments**](CaseDocketApiApi.md#getPrimaryDocuments) | **GET** /case/{caseId}/docketEntries/primaryDocuments | Gets Primary Documents of Docket Entries. |
| [**getRelatedCases**](CaseDocketApiApi.md#getRelatedCases) | **GET** /case/{caseId}/relatedCases | Gets Related Cases for a requested Case ID. |
| [**getSecondaryDocumentsForDocketEntries**](CaseDocketApiApi.md#getSecondaryDocumentsForDocketEntries) | **GET** /case/{caseId}/docketEntries/secondaryDocuments | Gets Secondary Documents of Docket Entries. |


<a name="getAssociatedAttorneyDetails"></a>
# **getAssociatedAttorneyDetails**
> PartyAttorneyAssociations getAssociatedAttorneyDetails(partyId).pageNumber(pageNumber).execute();

Gets Associated Attorney details for a requested Party ID.

Retrieve the attorneys in the case with the specified partyId value.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseDocketApiApi;
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
    String partyId = "PRTYgu537f3901f406"; // Retrieve the party with the specified partyId value.
    Integer pageNumber = 1; // Query parameter specifying the page number of the search results to be retrieved.
    try {
      PartyAttorneyAssociations result = client
              .caseDocketApi
              .getAssociatedAttorneyDetails(partyId)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPartyAttorneyAssociationArray());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getAssociatedAttorneyDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PartyAttorneyAssociations> response = client
              .caseDocketApi
              .getAssociatedAttorneyDetails(partyId)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getAssociatedAttorneyDetails");
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
| **partyId** | **String**| Retrieve the party with the specified partyId value. | |
| **pageNumber** | **Integer**| Query parameter specifying the page number of the search results to be retrieved. | [optional] |

### Return type

[**PartyAttorneyAssociations**](PartyAttorneyAssociations.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="getAssociatedParties"></a>
# **getAssociatedParties**
> PartyAttorneyAssociations getAssociatedParties(attorneyId).pageNumber(pageNumber).execute();

Gets Associated Party details for a requested Attorney ID.

Retrieve the parties represented by the attorney with the specified attorneyId value.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseDocketApiApi;
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
    String attorneyId = "ATTYgu01be2e4de654"; // Retrieve the parties represented by the attorney with the specified attorneyId value.
    Integer pageNumber = 1; // Query parameter specifying the page number of the search results to be retrieved.
    try {
      PartyAttorneyAssociations result = client
              .caseDocketApi
              .getAssociatedParties(attorneyId)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPartyAttorneyAssociationArray());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getAssociatedParties");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PartyAttorneyAssociations> response = client
              .caseDocketApi
              .getAssociatedParties(attorneyId)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getAssociatedParties");
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
| **attorneyId** | **String**| Retrieve the parties represented by the attorney with the specified attorneyId value. | |
| **pageNumber** | **Integer**| Query parameter specifying the page number of the search results to be retrieved. | [optional] |

### Return type

[**PartyAttorneyAssociations**](PartyAttorneyAssociations.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="getAttorneyDetails"></a>
# **getAttorneyDetails**
> Attorney getAttorneyDetails(attorneyId).execute();

Gets details for a requested Attorney ID.

Retrieve the attorney with the specified attorneyId value.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseDocketApiApi;
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
    String attorneyId = "ATTYgu01be2e4de654"; // Retrieve the attorney with the specified attorneyId value.
    try {
      Attorney result = client
              .caseDocketApi
              .getAttorneyDetails(attorneyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAttorneyId());
      System.out.println(result.getAttorneyLawFirmArray());
      System.out.println(result.getAttorneyType());
      System.out.println(result.getBarNumber());
      System.out.println(result.getContact());
      System.out.println(result.getFirstFetchDate());
      System.out.println(result.getFirstName());
      System.out.println(result.getIsVisible());
      System.out.println(result.getLastFetchDate());
      System.out.println(result.getLastName());
      System.out.println(result.getMiddleName());
      System.out.println(result.getName());
      System.out.println(result.getNamePrefix());
      System.out.println(result.getNameSuffix());
      System.out.println(result.getObject());
      System.out.println(result.getPartyAttorneyAssociations());
      System.out.println(result.getPartyRoleGroupIdArray());
      System.out.println(result.getPartyRoleIdArray());
      System.out.println(result.getPossibleNormAttorneyArray());
      System.out.println(result.getPossibleNormLawFirmArray());
      System.out.println(result.getSourceAttorneyType());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getAttorneyDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Attorney> response = client
              .caseDocketApi
              .getAttorneyDetails(attorneyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getAttorneyDetails");
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
| **attorneyId** | **String**| Retrieve the attorney with the specified attorneyId value. | |

### Return type

[**Attorney**](Attorney.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="getAttorneysByCaseId"></a>
# **getAttorneysByCaseId**
> Attorneys getAttorneysByCaseId(caseId).isVisible(isVisible).pageNumber(pageNumber).execute();

Gets Attorneys for a requested Case ID.

Retrieve the attorneys in the case with the specified caseId value.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseDocketApiApi;
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
    String caseId = "CASEgq5943bd47a6d2"; // Retrieve the case with the specified caseId value.
    Boolean isVisible = true; // Retrieve attorneys in the case with the specified caseId value whose isVisible flag is set to the specified value.
    Integer pageNumber = 1; // Query parameter specifying the page number of the search results to be retrieved.
    try {
      Attorneys result = client
              .caseDocketApi
              .getAttorneysByCaseId(caseId)
              .isVisible(isVisible)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getAttorneyArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getAttorneysByCaseId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Attorneys> response = client
              .caseDocketApi
              .getAttorneysByCaseId(caseId)
              .isVisible(isVisible)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getAttorneysByCaseId");
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
| **caseId** | **String**| Retrieve the case with the specified caseId value. | |
| **isVisible** | **Boolean**| Retrieve attorneys in the case with the specified caseId value whose isVisible flag is set to the specified value. | [optional] |
| **pageNumber** | **Integer**| Query parameter specifying the page number of the search results to be retrieved. | [optional] |

### Return type

[**Attorneys**](Attorneys.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="getCaseInfo"></a>
# **getCaseInfo**
> ModelCase getCaseInfo(caseId).execute();

Gets case information for a requested Case ID.

Retrieve the case with the specified caseId value.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseDocketApiApi;
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
    String caseId = "CASEgr45196c84f3ff"; // Retrieve the case with the specified caseId value.
    try {
      ModelCase result = client
              .caseDocketApi
              .getCaseInfo(caseId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAttorneys());
      System.out.println(result.getCaseDocuments());
      System.out.println(result.getCaseId());
      System.out.println(result.getCaseName());
      System.out.println(result.getCaseNumber());
      System.out.println(result.getCaseStats());
      System.out.println(result.getCaseStatus());
      System.out.println(result.getCaseType());
      System.out.println(result.getCauseOfActionArray());
      System.out.println(result.getChargeArray());
      System.out.println(result.getCourt());
      System.out.println(result.getCourtLocation());
      System.out.println(result.getCourtServiceStatusAPI());
      System.out.println(result.getCourtServiceStatusId());
      System.out.println(result.getDocketEntries());
      System.out.println(result.getExportAPI());
      System.out.println(result.getFiledDate());
      System.out.println(result.getFirstFetchDate());
      System.out.println(result.getHasDocumentsWithPreview());
      System.out.println(result.getHasOnlyMetaInfo());
      System.out.println(result.getHearings());
      System.out.println(result.getJudges());
      System.out.println(result.getLastFetchDate());
      System.out.println(result.getLastFetchDateWithUpdates());
      System.out.println(result.getObject());
      System.out.println(result.getParticipantsLastFetchDate());
      System.out.println(result.getParties());
      System.out.println(result.getRelatedCases());
      System.out.println(result.getSourceCaseData());
      System.out.println(result.getSourceDataStatus());
      System.out.println(result.getUrl());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getCaseInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ModelCase> response = client
              .caseDocketApi
              .getCaseInfo(caseId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getCaseInfo");
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
| **caseId** | **String**| Retrieve the case with the specified caseId value. | |

### Return type

[**ModelCase**](ModelCase.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="getCaseParties"></a>
# **getCaseParties**
> Parties getCaseParties(caseId).isVisible(isVisible).pageNumber(pageNumber).partyRoleId(partyRoleId).partyRoleGroupId(partyRoleGroupId).attorneyRepresentationTypeId(attorneyRepresentationTypeId).partyClassificationType(partyClassificationType).execute();

Gets Parties for a requested Case ID.

Retrieve the parties involved in the case with the specified caseId value.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseDocketApiApi;
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
    String caseId = "CASEgq8f4cea2d8e1a"; // Retrieve the case with the specified caseId value.
    Boolean isVisible = true; // Retrieve parties in the case with the specified caseId value whose isVisible flag is set to the specified value.
    Integer pageNumber = 1; // Query parameter specifying the page number of the search results to be retrieved.
    String partyRoleId = "partyRoleId_example"; // Retrieve all parties with the specified partyRoleId value in the case with the specified caseId value.
    String partyRoleGroupId = "partyRoleGroupId_example"; // Retrieve all parties with the specified partyRoleGroupId value in the case with the specified caseId value.
    String attorneyRepresentationTypeId = "attorneyRepresentationTypeId_example"; // Retrieve all parties with the specified attorneyRepresentationTypeId value in the case with the specified caseId value.
    String partyClassificationType = "INDIVIDUAL"; // Retrieve all parties with the specified partyClassificationType value in the case with the specified caseId value.
    try {
      Parties result = client
              .caseDocketApi
              .getCaseParties(caseId)
              .isVisible(isVisible)
              .pageNumber(pageNumber)
              .partyRoleId(partyRoleId)
              .partyRoleGroupId(partyRoleGroupId)
              .attorneyRepresentationTypeId(attorneyRepresentationTypeId)
              .partyClassificationType(partyClassificationType)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPartyArray());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getCaseParties");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Parties> response = client
              .caseDocketApi
              .getCaseParties(caseId)
              .isVisible(isVisible)
              .pageNumber(pageNumber)
              .partyRoleId(partyRoleId)
              .partyRoleGroupId(partyRoleGroupId)
              .attorneyRepresentationTypeId(attorneyRepresentationTypeId)
              .partyClassificationType(partyClassificationType)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getCaseParties");
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
| **caseId** | **String**| Retrieve the case with the specified caseId value. | |
| **isVisible** | **Boolean**| Retrieve parties in the case with the specified caseId value whose isVisible flag is set to the specified value. | [optional] |
| **pageNumber** | **Integer**| Query parameter specifying the page number of the search results to be retrieved. | [optional] |
| **partyRoleId** | **String**| Retrieve all parties with the specified partyRoleId value in the case with the specified caseId value. | [optional] |
| **partyRoleGroupId** | **String**| Retrieve all parties with the specified partyRoleGroupId value in the case with the specified caseId value. | [optional] |
| **attorneyRepresentationTypeId** | **String**| Retrieve all parties with the specified attorneyRepresentationTypeId value in the case with the specified caseId value. | [optional] |
| **partyClassificationType** | **String**| Retrieve all parties with the specified partyClassificationType value in the case with the specified caseId value. | [optional] [enum: INDIVIDUAL, COMPANY, OTHER] |

### Return type

[**Parties**](Parties.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="getDocketEntries"></a>
# **getDocketEntries**
> DocketEntries getDocketEntries(caseId).docketNumber(docketNumber).sortBy(sortBy).pageNumber(pageNumber).execute();

Gets Docket Entries for a requested Case ID.

Retrieve the docket entries in the case with the specified caseId value.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseDocketApiApi;
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
    String caseId = "CASEgle0bf14b74a96"; // Retrieve the case with the specified caseId value.
    Integer docketNumber = 56; // Retrieve the docket entry witih the specified docket number in the case with the specified caseId value.
    String sortBy = "latest to oldest"; // Sort the retrieved docket entries in ascending order or descending order of date.
    Integer pageNumber = 1; // Query parameter specifying the page number of the search results to be retrieved.
    try {
      DocketEntries result = client
              .caseDocketApi
              .getDocketEntries(caseId)
              .docketNumber(docketNumber)
              .sortBy(sortBy)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getDocketEntryArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getDocketEntries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DocketEntries> response = client
              .caseDocketApi
              .getDocketEntries(caseId)
              .docketNumber(docketNumber)
              .sortBy(sortBy)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getDocketEntries");
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
| **caseId** | **String**| Retrieve the case with the specified caseId value. | |
| **docketNumber** | **Integer**| Retrieve the docket entry witih the specified docket number in the case with the specified caseId value. | [optional] |
| **sortBy** | **String**| Sort the retrieved docket entries in ascending order or descending order of date. | [optional] [enum: latest to oldest, oldest to latest] |
| **pageNumber** | **Integer**| Query parameter specifying the page number of the search results to be retrieved. | [optional] |

### Return type

[**DocketEntries**](DocketEntries.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="getHearingsForCase"></a>
# **getHearingsForCase**
> Hearings getHearingsForCase(caseId).sortBy(sortBy).pageNumber(pageNumber).execute();

Gets Hearings for a requested Case ID.

Gets Hearings for a requested Case ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseDocketApiApi;
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
    String caseId = "CASEar3c45901ef267"; // Retrieve the case with the specified caseId value.
    String sortBy = "latest to oldest"; // Specify the sort order of hearings in the case with the specified caseId.
    Integer pageNumber = 1; // Query parameter specifying the page number of the search results to be retrieved.
    try {
      Hearings result = client
              .caseDocketApi
              .getHearingsForCase(caseId)
              .sortBy(sortBy)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getHearingArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getHearingsForCase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Hearings> response = client
              .caseDocketApi
              .getHearingsForCase(caseId)
              .sortBy(sortBy)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getHearingsForCase");
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
| **caseId** | **String**| Retrieve the case with the specified caseId value. | |
| **sortBy** | **String**| Specify the sort order of hearings in the case with the specified caseId. | [optional] [enum: latest to oldest, oldest to latest] |
| **pageNumber** | **Integer**| Query parameter specifying the page number of the search results to be retrieved. | [optional] |

### Return type

[**Hearings**](Hearings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="getJudgeDetails"></a>
# **getJudgeDetails**
> Judge getJudgeDetails(judgeId).execute();

Gets details for a requested Judge ID.

Retrieve the judge with the specified judgeId value.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseDocketApiApi;
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
    String judgeId = "JUDGgue04d2894de7a"; // Retrieve the judge with the specified judgeId value.
    try {
      Judge result = client
              .caseDocketApi
              .getJudgeDetails(judgeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getContact());
      System.out.println(result.getFirstFetchDate());
      System.out.println(result.getFirstName());
      System.out.println(result.getIsVisible());
      System.out.println(result.getJudgeId());
      System.out.println(result.getJudgeType());
      System.out.println(result.getLastFetchDate());
      System.out.println(result.getLastName());
      System.out.println(result.getMiddleName());
      System.out.println(result.getName());
      System.out.println(result.getNamePrefix());
      System.out.println(result.getNameSuffix());
      System.out.println(result.getObject());
      System.out.println(result.getPossibleNormJudgeArray());
      System.out.println(result.getSourceJudgeType());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getJudgeDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Judge> response = client
              .caseDocketApi
              .getJudgeDetails(judgeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getJudgeDetails");
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
| **judgeId** | **String**| Retrieve the judge with the specified judgeId value. | |

### Return type

[**Judge**](Judge.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="getJudgesForCase"></a>
# **getJudgesForCase**
> Judges getJudgesForCase(caseId).isVisible(isVisible).pageNumber(pageNumber).execute();

Gets Judges for a requested Case ID.

Retrieve the judges involved in the specified case.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseDocketApiApi;
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
    String caseId = "CASEgq6e6ea66cd91d"; // Retrieve the case with the specified caseId value.
    Boolean isVisible = true; // Retrieve attorneys judges in the case with the specified caseId value whose isVisible flag is set to the specified value.
    Integer pageNumber = 1; // Query parameter specifying the page number of the search results to be retrieved.
    try {
      Judges result = client
              .caseDocketApi
              .getJudgesForCase(caseId)
              .isVisible(isVisible)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getJudgeArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getJudgesForCase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Judges> response = client
              .caseDocketApi
              .getJudgesForCase(caseId)
              .isVisible(isVisible)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getJudgesForCase");
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
| **caseId** | **String**| Retrieve the case with the specified caseId value. | |
| **isVisible** | **Boolean**| Retrieve attorneys judges in the case with the specified caseId value whose isVisible flag is set to the specified value. | [optional] |
| **pageNumber** | **Integer**| Query parameter specifying the page number of the search results to be retrieved. | [optional] |

### Return type

[**Judges**](Judges.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="getPartyDetails"></a>
# **getPartyDetails**
> Party getPartyDetails(partyId).execute();

Gets details for a requested Party ID.

Retrieve the party with the specified partyId value.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseDocketApiApi;
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
    String partyId = "PRTYgla171a8952aed"; // Retrieve the party with the specified partyId value.
    try {
      Party result = client
              .caseDocketApi
              .getPartyDetails(partyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAttorneyRepresentationType());
      System.out.println(result.getContact());
      System.out.println(result.getFirstFetchDate());
      System.out.println(result.getFirstName());
      System.out.println(result.getIsVisible());
      System.out.println(result.getLastFetchDate());
      System.out.println(result.getLastName());
      System.out.println(result.getMiddleName());
      System.out.println(result.getName());
      System.out.println(result.getNamePrefix());
      System.out.println(result.getNameSuffix());
      System.out.println(result.getObject());
      System.out.println(result.getPartyAttorneyAssociations());
      System.out.println(result.getPartyClassificationType());
      System.out.println(result.getPartyId());
      System.out.println(result.getPartyRole());
      System.out.println(result.getPossibleNormPartyArray());
      System.out.println(result.getSourcePartyRole());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getPartyDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Party> response = client
              .caseDocketApi
              .getPartyDetails(partyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getPartyDetails");
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
| **partyId** | **String**| Retrieve the party with the specified partyId value. | |

### Return type

[**Party**](Party.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="getPrimaryDocuments"></a>
# **getPrimaryDocuments**
> DocketEntryPrimaryDocuments getPrimaryDocuments(caseId, docketNumber).inLibrary(inLibrary).afterFirstFetchDate(afterFirstFetchDate).libraryDate(libraryDate).pageNumber(pageNumber).execute();

Gets Primary Documents of Docket Entries.

Retrieve the primary documents in the case with the specified caseId value.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseDocketApiApi;
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
    String caseId = "CASEgued96d541f794"; // Retrieve the case with the specified caseId value.
    Integer docketNumber = 1; // Retrieve the primary documents associated with the specified docket number in the case with the specified caseId value.
    Boolean inLibrary = true; // Retrieve the primary documents in the with the specified inLibrary flag in the case with the specified caseId value.
    OffsetDateTime afterFirstFetchDate = OffsetDateTime.now(); // Retrieve all primary documents in the case with the specified caseId value that were first fetched by UniCourt on the specified date or within the specified date.
    OffsetDateTime libraryDate = OffsetDateTime.now(); // Retrieve all primary documents in the case with the specified caseId value that were added to the Crowdsourced Library on the specified date or within the specified date.
    Integer pageNumber = 1; // Query parameter specifying the page number of the search results to be retrieved.
    try {
      DocketEntryPrimaryDocuments result = client
              .caseDocketApi
              .getPrimaryDocuments(caseId, docketNumber)
              .inLibrary(inLibrary)
              .afterFirstFetchDate(afterFirstFetchDate)
              .libraryDate(libraryDate)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseDocumentArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getPrimaryDocuments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DocketEntryPrimaryDocuments> response = client
              .caseDocketApi
              .getPrimaryDocuments(caseId, docketNumber)
              .inLibrary(inLibrary)
              .afterFirstFetchDate(afterFirstFetchDate)
              .libraryDate(libraryDate)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getPrimaryDocuments");
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
| **caseId** | **String**| Retrieve the case with the specified caseId value. | |
| **docketNumber** | **Integer**| Retrieve the primary documents associated with the specified docket number in the case with the specified caseId value. | |
| **inLibrary** | **Boolean**| Retrieve the primary documents in the with the specified inLibrary flag in the case with the specified caseId value. | [optional] |
| **afterFirstFetchDate** | **OffsetDateTime**| Retrieve all primary documents in the case with the specified caseId value that were first fetched by UniCourt on the specified date or within the specified date. | [optional] |
| **libraryDate** | **OffsetDateTime**| Retrieve all primary documents in the case with the specified caseId value that were added to the Crowdsourced Library on the specified date or within the specified date. | [optional] |
| **pageNumber** | **Integer**| Query parameter specifying the page number of the search results to be retrieved. | [optional] |

### Return type

[**DocketEntryPrimaryDocuments**](DocketEntryPrimaryDocuments.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="getRelatedCases"></a>
# **getRelatedCases**
> RelatedCases getRelatedCases(caseId).pageNumber(pageNumber).execute();

Gets Related Cases for a requested Case ID.

Retrieve cases that UniCourt has identified as related to the case with the specified caseId value.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseDocketApiApi;
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
    String caseId = "CASEba328623913f9f"; // Retrieve the case with the specified caseId value.
    Integer pageNumber = 1; // Query parameter specifying the page number of the search results to be retrieved.
    try {
      RelatedCases result = client
              .caseDocketApi
              .getRelatedCases(caseId)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getRelatedCaseArray());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getRelatedCases");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RelatedCases> response = client
              .caseDocketApi
              .getRelatedCases(caseId)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getRelatedCases");
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
| **caseId** | **String**| Retrieve the case with the specified caseId value. | |
| **pageNumber** | **Integer**| Query parameter specifying the page number of the search results to be retrieved. | [optional] |

### Return type

[**RelatedCases**](RelatedCases.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="getSecondaryDocumentsForDocketEntries"></a>
# **getSecondaryDocumentsForDocketEntries**
> DocketEntrySecondaryDocuments getSecondaryDocumentsForDocketEntries(caseId, docketNumber).inLibrary(inLibrary).afterFirstFetchDate(afterFirstFetchDate).libraryDate(libraryDate).pageNumber(pageNumber).execute();

Gets Secondary Documents of Docket Entries.

Retrieve the secondary documents in the case with the specified caseId value.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseDocketApiApi;
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
    String caseId = "CASEgq5da86597e9a4"; // Retrieve the case with the specified caseId value.
    Integer docketNumber = 1; // Retrieve the secondary documents associated with the specified docket number in the case with the specified caseId value.
    Boolean inLibrary = true; // Retrieve the secondary documents in the with the specified inLibrary flag in the case with the specified caseId value.
    OffsetDateTime afterFirstFetchDate = OffsetDateTime.now(); // Retrieve all secondary documents in the case with the specified caseId value that were first fetched by UniCourt on the specified date or within the specified date.
    OffsetDateTime libraryDate = OffsetDateTime.now(); // Retrieve all secondary documents in the case with the specified caseId value that were added to the Crowdsourced Library on the specified date or within the specified date.
    Integer pageNumber = 1; // Query parameter specifying the page number of the search results to be retrieved.
    try {
      DocketEntrySecondaryDocuments result = client
              .caseDocketApi
              .getSecondaryDocumentsForDocketEntries(caseId, docketNumber)
              .inLibrary(inLibrary)
              .afterFirstFetchDate(afterFirstFetchDate)
              .libraryDate(libraryDate)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseDocumentArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getSecondaryDocumentsForDocketEntries");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DocketEntrySecondaryDocuments> response = client
              .caseDocketApi
              .getSecondaryDocumentsForDocketEntries(caseId, docketNumber)
              .inLibrary(inLibrary)
              .afterFirstFetchDate(afterFirstFetchDate)
              .libraryDate(libraryDate)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocketApiApi#getSecondaryDocumentsForDocketEntries");
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
| **caseId** | **String**| Retrieve the case with the specified caseId value. | |
| **docketNumber** | **Integer**| Retrieve the secondary documents associated with the specified docket number in the case with the specified caseId value. | |
| **inLibrary** | **Boolean**| Retrieve the secondary documents in the with the specified inLibrary flag in the case with the specified caseId value. | [optional] |
| **afterFirstFetchDate** | **OffsetDateTime**| Retrieve all secondary documents in the case with the specified caseId value that were first fetched by UniCourt on the specified date or within the specified date. | [optional] |
| **libraryDate** | **OffsetDateTime**| Retrieve all secondary documents in the case with the specified caseId value that were added to the Crowdsourced Library on the specified date or within the specified date. | [optional] |
| **pageNumber** | **Integer**| Query parameter specifying the page number of the search results to be retrieved. | [optional] |

### Return type

[**DocketEntrySecondaryDocuments**](DocketEntrySecondaryDocuments.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

