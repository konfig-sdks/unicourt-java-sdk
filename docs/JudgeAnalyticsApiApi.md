# JudgeAnalyticsApiApi

All URIs are relative to *https://enterpriseapi.unicourt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAssociatedNormParties**](JudgeAnalyticsApiApi.md#getAssociatedNormParties) | **GET** /normJudge/{normJudgeId}/associatedNormParties | Parties Associated with the Judge. |
| [**getNormJudgeDetails**](JudgeAnalyticsApiApi.md#getNormJudgeDetails) | **GET** /normJudge/{normJudgeId} | Norm Judge Details. |
| [**getNormJudgeSearchResultsById**](JudgeAnalyticsApiApi.md#getNormJudgeSearchResultsById) | **GET** /normJudgeSearch/{normJudgeSearchId} | Norm judge search results for a given normJudgeSearchId. |
| [**listAssociatedNormAttorneys**](JudgeAnalyticsApiApi.md#listAssociatedNormAttorneys) | **GET** /normJudge/{normJudgeId}/associatedNormAttorneys | Attorneys Associated with the Judge. |
| [**listLawFirmsAssociatedWithJudge**](JudgeAnalyticsApiApi.md#listLawFirmsAssociatedWithJudge) | **GET** /normJudge/{normJudgeId}/associatedNormLawFirms | Law Firms Associated With the Judge. |
| [**searchNormJudges**](JudgeAnalyticsApiApi.md#searchNormJudges) | **GET** /normJudgeSearch | Judge search. |


<a name="getAssociatedNormParties"></a>
# **getAssociatedNormParties**
> AssociatedNormPartyResponse getAssociatedNormParties(normJudgeId, pageNumber).q(q).execute();

Parties Associated with the Judge.

Returns a list of Parties A Judge has seen. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtLocationId IN (\&quot;COLODj4BBVTho3pKpz\&quot;,\&quot;COLOPUfJRhw5yPxgRi\&quot;)**| | **courtId** | Multiple Ids Allowed  |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed  |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed  |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed  |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed  |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed  |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed  |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed  |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **caseFiledDate** | Single Allowed  |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple Ids Allowed  |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get all Parties associated with judge with norm id NJUDT7jCZyFNeLGpRq of all cases with case type id CTYPATMYyaJekdgj2c and case filed date between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] &lt;br&gt;&lt;br&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JudgeAnalyticsApiApi;
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
    String normJudgeId = "NJUDT7jCZyFNeLGpRq"; // Norm  ID of the Judge.   - minimum: 18   - maximum: 18 
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      AssociatedNormPartyResponse result = client
              .judgeAnalyticsApi
              .getAssociatedNormParties(normJudgeId, pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getAssociatedNormPartyArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling JudgeAnalyticsApiApi#getAssociatedNormParties");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AssociatedNormPartyResponse> response = client
              .judgeAnalyticsApi
              .getAssociatedNormParties(normJudgeId, pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JudgeAnalyticsApiApi#getAssociatedNormParties");
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
| **normJudgeId** | **String**| Norm  ID of the Judge.   - minimum: 18   - maximum: 18  | |
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

<a name="getNormJudgeDetails"></a>
# **getNormJudgeDetails**
> NormJudge getNormJudgeDetails(normJudgeId).execute();

Norm Judge Details.

The Judge API allows you to look up Judge Details by normJudgeId. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JudgeAnalyticsApiApi;
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
    String normJudgeId = "NJUDT7jCZyFNeLGpRq"; // Norm  ID of the Judge.   - minimum: 18   - maximum: 18 
    try {
      NormJudge result = client
              .judgeAnalyticsApi
              .getNormJudgeDetails(normJudgeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseAnalyticsAPI());
      System.out.println(result.getCaseSearchAPI());
      System.out.println(result.getFirstName());
      System.out.println(result.getHasAssociatedPublicData());
      System.out.println(result.getJudgeAnalyticsAPI());
      System.out.println(result.getJudicialDataArray());
      System.out.println(result.getLastName());
      System.out.println(result.getMiddleName());
      System.out.println(result.getName());
      System.out.println(result.getNormJudgeId());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling JudgeAnalyticsApiApi#getNormJudgeDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NormJudge> response = client
              .judgeAnalyticsApi
              .getNormJudgeDetails(normJudgeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JudgeAnalyticsApiApi#getNormJudgeDetails");
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
| **normJudgeId** | **String**| Norm  ID of the Judge.   - minimum: 18   - maximum: 18  | |

### Return type

[**NormJudge**](NormJudge.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getNormJudgeSearchResultsById"></a>
# **getNormJudgeSearchResultsById**
> NormJudgeSearchResponse getNormJudgeSearchResultsById(normJudgeSearchId).pageNumber(pageNumber).execute();

Norm judge search results for a given normJudgeSearchId.

### All query parameters supported for this API can be found in below schema section. Schema --&gt; NormJudgeSearchQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JudgeAnalyticsApiApi;
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
    String normJudgeSearchId = "JSRCNUSK3pLGe48QcU"; // Norm judge Search information for the given normJudgeSearchId.
    Integer pageNumber = 1; // Query parameter specifying the page number of the search results to be retrieved. - Minimum: 1 - Maximum: 1000 
    try {
      NormJudgeSearchResponse result = client
              .judgeAnalyticsApi
              .getNormJudgeSearchResultsById(normJudgeSearchId)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getNormJudgeSearchId());
      System.out.println(result.getNormJudgeSearchResultArray());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getQ());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling JudgeAnalyticsApiApi#getNormJudgeSearchResultsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NormJudgeSearchResponse> response = client
              .judgeAnalyticsApi
              .getNormJudgeSearchResultsById(normJudgeSearchId)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JudgeAnalyticsApiApi#getNormJudgeSearchResultsById");
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
| **normJudgeSearchId** | **String**| Norm judge Search information for the given normJudgeSearchId. | |
| **pageNumber** | **Integer**| Query parameter specifying the page number of the search results to be retrieved. - Minimum: 1 - Maximum: 1000  | [optional] |

### Return type

[**NormJudgeSearchResponse**](NormJudgeSearchResponse.md)

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
> AssociatedNormAttorneyResponse listAssociatedNormAttorneys(normJudgeId, pageNumber).q(q).execute();

Attorneys Associated with the Judge.

Returns a list of attorneys associated with a judge. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtLocationId IN (\&quot;COLODj4BBVTho3pKpz\&quot;,\&quot;COLOPUfJRhw5yPxgRi\&quot;)**| | **courtId** | Multiple Ids Allowed  |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed  |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed  |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed  |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed  |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed  |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed  |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed  |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **caseFiledDate** | Single Allowed |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple Ids Allowed  |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get all attorneys associated with judge with norm id NJUDT7jCZyFNeLGpRq of all cases with case type id CTYPATMYyaJekdgj2c and case filed date between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] &lt;br&gt;&lt;br&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JudgeAnalyticsApiApi;
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
    String normJudgeId = "NJUDT7jCZyFNeLGpRq"; // Norm  ID of the Judge.   - minimum: 18   - maximum: 18 
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      AssociatedNormAttorneyResponse result = client
              .judgeAnalyticsApi
              .listAssociatedNormAttorneys(normJudgeId, pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getAssociatedNormAttorneyArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling JudgeAnalyticsApiApi#listAssociatedNormAttorneys");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AssociatedNormAttorneyResponse> response = client
              .judgeAnalyticsApi
              .listAssociatedNormAttorneys(normJudgeId, pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JudgeAnalyticsApiApi#listAssociatedNormAttorneys");
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
| **normJudgeId** | **String**| Norm  ID of the Judge.   - minimum: 18   - maximum: 18  | |
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

<a name="listLawFirmsAssociatedWithJudge"></a>
# **listLawFirmsAssociatedWithJudge**
> AssociatedNormLawFirmResponse listLawFirmsAssociatedWithJudge(normJudgeId, pageNumber).q(q).execute();

Law Firms Associated With the Judge.

Returns a list of Law Firms a Judge has heard. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLOPUfJRhw5yPxgRi\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtLocationId IN (\&quot;COLODj4BBVTho3pKpz\&quot;,\&quot;COLOPUfJRhw5yPxgRi\&quot;)**| | **courtId** | Multiple Ids Allowed  |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed  |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed  |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed  |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed  |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed  |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed  |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed  |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **caseFiledDate** | Single Allowed  |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo**  | Multiple Ids Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get all Law Firms associated with judge with norm id NJUDT7jCZyFNeLGpRq of all cases with case type id CTYPATMYyaJekdgj2c and case filed date between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] &lt;br&gt;&lt;br&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JudgeAnalyticsApiApi;
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
    String normJudgeId = "NJUDT7jCZyFNeLGpRq"; // Norm  ID of the Judge.   - minimum: 18   - maximum: 18 
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      AssociatedNormLawFirmResponse result = client
              .judgeAnalyticsApi
              .listLawFirmsAssociatedWithJudge(normJudgeId, pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getAssociatedNormLawFirmArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling JudgeAnalyticsApiApi#listLawFirmsAssociatedWithJudge");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AssociatedNormLawFirmResponse> response = client
              .judgeAnalyticsApi
              .listLawFirmsAssociatedWithJudge(normJudgeId, pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JudgeAnalyticsApiApi#listLawFirmsAssociatedWithJudge");
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
| **normJudgeId** | **String**| Norm  ID of the Judge.   - minimum: 18   - maximum: 18  | |
| **pageNumber** | **Integer**| Page number. - minimum: 1  | |
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above. | [optional] |

### Return type

[**AssociatedNormLawFirmResponse**](AssociatedNormLawFirmResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="searchNormJudges"></a>
# **searchNormJudges**
> NormJudgeSearchResponse searchNormJudges().q(q).pageNumber(pageNumber).execute();

Judge search.

### All query parameters supported for this API can be found in below schema section. Schema --&gt; NormJudgeSearchQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JudgeAnalyticsApiApi;
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
    String q = "normJudgeId:\"NJUD5STmDbUZGukfQm\""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters.</a> 
    Integer pageNumber = 1; // Query parameter specifying the page number of the search results to be retrieved. - Minimum: 1 - Maximum: 1000 
    try {
      NormJudgeSearchResponse result = client
              .judgeAnalyticsApi
              .searchNormJudges()
              .q(q)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getNormJudgeSearchId());
      System.out.println(result.getNormJudgeSearchResultArray());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getQ());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling JudgeAnalyticsApiApi#searchNormJudges");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NormJudgeSearchResponse> response = client
              .judgeAnalyticsApi
              .searchNormJudges()
              .q(q)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JudgeAnalyticsApiApi#searchNormJudges");
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

[**NormJudgeSearchResponse**](NormJudgeSearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

