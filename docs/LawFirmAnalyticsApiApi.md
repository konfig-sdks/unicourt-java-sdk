# LawFirmAnalyticsApiApi

All URIs are relative to *https://enterpriseapi.unicourt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAssociatedNormJudges**](LawFirmAnalyticsApiApi.md#getAssociatedNormJudges) | **GET** /normLawFirm/{normLawFirmId}/associatedNormJudges | Judges Faced By the Law Firm. |
| [**getNormLawFirmById**](LawFirmAnalyticsApiApi.md#getNormLawFirmById) | **GET** /normLawFirm/{normLawFirmId} | Norm LawFirm Details. |
| [**getNormLawFirmSearchResultById**](LawFirmAnalyticsApiApi.md#getNormLawFirmSearchResultById) | **GET** /normLawFirmSearch/{normLawFirmSearchId} | Norm law firm search result for a given normLawFirmSearchId. |
| [**listAssociatedNormAttorneys**](LawFirmAnalyticsApiApi.md#listAssociatedNormAttorneys) | **GET** /normLawFirm/{normLawFirmId}/associatedNormAttorneys | Attorneys working for the Law Firm. |
| [**listAssociatedNormParties**](LawFirmAnalyticsApiApi.md#listAssociatedNormParties) | **GET** /normLawFirm/{normLawFirmId}/associatedNormParties | Parties Represented by the Law Firm. |
| [**searchLawFirms**](LawFirmAnalyticsApiApi.md#searchLawFirms) | **GET** /normLawFirmSearch | Law firm search. |


<a name="getAssociatedNormJudges"></a>
# **getAssociatedNormJudges**
> AssociatedNormJudgeResponse getAssociatedNormJudges(normLawFirmId, pageNumber).q(q).execute();

Judges Faced By the Law Firm.

Returns list of Judges faced by the Law Firm. &lt;br&gt;&lt;br&gt; ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed  |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed  |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed  |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed  |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed  |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed  |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed  |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed  |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **caseFiledDate** | Single Allowed   |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple Ids Allowed  |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get all judges associated with LawFirm with norm id NORGrPmQyLdx9NGHcT of all cases with case type id CTYPATMYyaJekdgj2c and  case filed date between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] &lt;br&gt;&lt;br&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LawFirmAnalyticsApiApi;
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
    String normLawFirmId = "NORGrPmQyLdx9NGHcT"; // Norm  ID of the Law Firm.   - minimum: 18   - maximum: 18 
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      AssociatedNormJudgeResponse result = client
              .lawFirmAnalyticsApi
              .getAssociatedNormJudges(normLawFirmId, pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getAssociatedNormJudgeArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling LawFirmAnalyticsApiApi#getAssociatedNormJudges");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AssociatedNormJudgeResponse> response = client
              .lawFirmAnalyticsApi
              .getAssociatedNormJudges(normLawFirmId, pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LawFirmAnalyticsApiApi#getAssociatedNormJudges");
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
| **normLawFirmId** | **String**| Norm  ID of the Law Firm.   - minimum: 18   - maximum: 18  | |
| **pageNumber** | **Integer**| Page number. - minimum: 1  | |
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above. | [optional] |

### Return type

[**AssociatedNormJudgeResponse**](AssociatedNormJudgeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getNormLawFirmById"></a>
# **getNormLawFirmById**
> NormLawFirm getNormLawFirmById(normLawFirmId).execute();

Norm LawFirm Details.

The Law Firm API allows you to look up Law Firms by normLawFirmId. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LawFirmAnalyticsApiApi;
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
    String normLawFirmId = "NORGrPmQyLdx9NGHcT"; // Norm  ID of the Law Firm.   - minimum: 18   - maximum: 18 
    try {
      NormLawFirm result = client
              .lawFirmAnalyticsApi
              .getNormLawFirmById(normLawFirmId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseAnalyticsAPI());
      System.out.println(result.getCaseSearchAPI());
      System.out.println(result.getLawFirmAnalyticsAPI());
      System.out.println(result.getName());
      System.out.println(result.getNormLawFirmId());
      System.out.println(result.getNormOrganizationData());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling LawFirmAnalyticsApiApi#getNormLawFirmById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NormLawFirm> response = client
              .lawFirmAnalyticsApi
              .getNormLawFirmById(normLawFirmId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LawFirmAnalyticsApiApi#getNormLawFirmById");
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
| **normLawFirmId** | **String**| Norm  ID of the Law Firm.   - minimum: 18   - maximum: 18  | |

### Return type

[**NormLawFirm**](NormLawFirm.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getNormLawFirmSearchResultById"></a>
# **getNormLawFirmSearchResultById**
> NormLawFirmSearchResponse getNormLawFirmSearchResultById(normLawFirmSearchId).pageNumber(pageNumber).execute();

Norm law firm search result for a given normLawFirmSearchId.

### All query parameters supported for this API can be found in below schema section. Schema --&gt; NormLawFirmSearchQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LawFirmAnalyticsApiApi;
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
    String normLawFirmSearchId = "LSRCeCT9pC3maopkW7"; // Norm law firm search information for the given normLawFirmSearchId.
    Integer pageNumber = 1; // Query parameter specifying the page number of the search results to be retrieved. - Minimum: 1 - Maximum: 1000 
    try {
      NormLawFirmSearchResponse result = client
              .lawFirmAnalyticsApi
              .getNormLawFirmSearchResultById(normLawFirmSearchId)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getNormLawFirmSearchId());
      System.out.println(result.getNormLawFirmSearchResultArray());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getQ());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling LawFirmAnalyticsApiApi#getNormLawFirmSearchResultById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NormLawFirmSearchResponse> response = client
              .lawFirmAnalyticsApi
              .getNormLawFirmSearchResultById(normLawFirmSearchId)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LawFirmAnalyticsApiApi#getNormLawFirmSearchResultById");
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
| **normLawFirmSearchId** | **String**| Norm law firm search information for the given normLawFirmSearchId. | |
| **pageNumber** | **Integer**| Query parameter specifying the page number of the search results to be retrieved. - Minimum: 1 - Maximum: 1000  | [optional] |

### Return type

[**NormLawFirmSearchResponse**](NormLawFirmSearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listAssociatedNormAttorneys"></a>
# **listAssociatedNormAttorneys**
> AssociatedNormAttorneyResponse listAssociatedNormAttorneys(normLawFirmId, pageNumber).q(q).execute();

Attorneys working for the Law Firm.

Returns a list of Attorneys associated to a Law Firm. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed  |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed  |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed  |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed  |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId**  | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed  |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed  |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed  |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed  |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed  |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed  |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed  |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **caseFiledDate**  | Single Allowed |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo**  | Multiple Ids Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt;         ## Example Query Query to get all attorneys associated with LawFirm with norm id NORGrPmQyLdx9NGHcT of all cases with case type id CTYPATMYyaJekdgj2c and  case filed date between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] &lt;br&gt;&lt;br&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LawFirmAnalyticsApiApi;
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
    String normLawFirmId = "NORGrPmQyLdx9NGHcT"; // Norm  ID of the Law Firm.   - minimum: 18   - maximum: 18 
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      AssociatedNormAttorneyResponse result = client
              .lawFirmAnalyticsApi
              .listAssociatedNormAttorneys(normLawFirmId, pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getAssociatedNormAttorneyArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling LawFirmAnalyticsApiApi#listAssociatedNormAttorneys");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AssociatedNormAttorneyResponse> response = client
              .lawFirmAnalyticsApi
              .listAssociatedNormAttorneys(normLawFirmId, pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LawFirmAnalyticsApiApi#listAssociatedNormAttorneys");
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
| **normLawFirmId** | **String**| Norm  ID of the Law Firm.   - minimum: 18   - maximum: 18  | |
| **pageNumber** | **Integer**| Page number. - minimum: 1  | |
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above. | [optional] |

### Return type

[**AssociatedNormAttorneyResponse**](AssociatedNormAttorneyResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listAssociatedNormParties"></a>
# **listAssociatedNormParties**
> AssociatedNormPartyResponse listAssociatedNormParties(normLawFirmId, pageNumber).q(q).execute();

Parties Represented by the Law Firm.

Returns list of Parties represented by the Law Firm. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **caseFiledDate** | Single Allowed  |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get all parties associated with LawFirm with norm id NORGrPmQyLdx9NGHcT of all cases with case type id CTYPATMYyaJekdgj2c and  case filed date between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] &lt;br&gt;&lt;br&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LawFirmAnalyticsApiApi;
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
    String normLawFirmId = "NORGrPmQyLdx9NGHcT"; // Norm  ID of the Law Firm.   - minimum: 18   - maximum: 18 
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      AssociatedNormPartyResponse result = client
              .lawFirmAnalyticsApi
              .listAssociatedNormParties(normLawFirmId, pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getAssociatedNormPartyArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling LawFirmAnalyticsApiApi#listAssociatedNormParties");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AssociatedNormPartyResponse> response = client
              .lawFirmAnalyticsApi
              .listAssociatedNormParties(normLawFirmId, pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LawFirmAnalyticsApiApi#listAssociatedNormParties");
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
| **normLawFirmId** | **String**| Norm  ID of the Law Firm.   - minimum: 18   - maximum: 18  | |
| **pageNumber** | **Integer**| Page number. - minimum: 1  | |
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above. | [optional] |

### Return type

[**AssociatedNormPartyResponse**](AssociatedNormPartyResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="searchLawFirms"></a>
# **searchLawFirms**
> NormLawFirmSearchResponse searchLawFirms().q(q).pageNumber(pageNumber).execute();

Law firm search.

### All query parameters supported for this API can be found in below schema section. Schema --&gt; NormLawFirmSearchQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LawFirmAnalyticsApiApi;
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
    String q = "normLawFirmId:\"NORGDiJQPjeed2mtvx\""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters.</a> 
    Integer pageNumber = 1; // Query parameter specifying the page number of the search results to be retrieved. - Minimum: 1 - Maximum: 1000 
    try {
      NormLawFirmSearchResponse result = client
              .lawFirmAnalyticsApi
              .searchLawFirms()
              .q(q)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getNormLawFirmSearchId());
      System.out.println(result.getNormLawFirmSearchResultArray());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getQ());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling LawFirmAnalyticsApiApi#searchLawFirms");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NormLawFirmSearchResponse> response = client
              .lawFirmAnalyticsApi
              .searchLawFirms()
              .q(q)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LawFirmAnalyticsApiApi#searchLawFirms");
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
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| Query parameter specifying the page number of the search results to be retrieved. - Minimum: 1 - Maximum: 1000  | [optional] |

### Return type

[**NormLawFirmSearchResponse**](NormLawFirmSearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

