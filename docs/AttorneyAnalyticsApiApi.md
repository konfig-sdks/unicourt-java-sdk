# AttorneyAnalyticsApiApi

All URIs are relative to *https://enterpriseapi.unicourt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAssociatedLawFirms**](AttorneyAnalyticsApiApi.md#getAssociatedLawFirms) | **GET** /normAttorney/{normAttorneyId}/associatedNormLawFirms | Law Firms the attorney has worked for. |
| [**getJudgesAssociatedWithAttorney**](AttorneyAnalyticsApiApi.md#getJudgesAssociatedWithAttorney) | **GET** /normAttorney/{normAttorneyId}/associatedNormJudges | Judges faced by the Attorney. |
| [**getNormAttorneyById**](AttorneyAnalyticsApiApi.md#getNormAttorneyById) | **GET** /normAttorney/{normAttorneyId} | Norm Attorney Details. |
| [**getNormAttorneySearchResults**](AttorneyAnalyticsApiApi.md#getNormAttorneySearchResults) | **GET** /normAttorneySearch/{normAttorneySearchId} | Norm attorney search results for a given normAttorneySearchId. |
| [**listAssociatedNormParties**](AttorneyAnalyticsApiApi.md#listAssociatedNormParties) | **GET** /normAttorney/{normAttorneyId}/associatedNormParties | Parties Represented By the Attorney. |
| [**searchAttorneyInfo**](AttorneyAnalyticsApiApi.md#searchAttorneyInfo) | **GET** /normAttorneySearch | Attorney search. |


<a name="getAssociatedLawFirms"></a>
# **getAssociatedLawFirms**
> AssociatedNormLawFirmResponse getAssociatedLawFirms(normAttorneyId, pageNumber).q(q).execute();

Law Firms the attorney has worked for.

Returns a list of Law Firms the norm Attorney has worked for. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot;  AND  courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTV4vCEaKrhystBz\&quot;, \&quot;CORTKQiA4LJuv54tEj\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed  |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed  |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed  |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed  |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed  |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed  |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed  |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed  |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed  |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed  |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed  |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **caseFiledDate** | Single Allowed  |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple Ids Allowed  |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get all LawFirms associated with attorney with norm id NATYfwmXwRHS279WPY of all cases with case type id CTYPATMYyaJekdgj2c and  case filed date between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] &lt;br&gt;&lt;br&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttorneyAnalyticsApiApi;
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
    String normAttorneyId = "NATYfwmXwRHS279WPY"; // Norm ID of Attorney.    - minimum: 18   - maximum: 18 
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      AssociatedNormLawFirmResponse result = client
              .attorneyAnalyticsApi
              .getAssociatedLawFirms(normAttorneyId, pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getAssociatedNormLawFirmArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttorneyAnalyticsApiApi#getAssociatedLawFirms");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AssociatedNormLawFirmResponse> response = client
              .attorneyAnalyticsApi
              .getAssociatedLawFirms(normAttorneyId, pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttorneyAnalyticsApiApi#getAssociatedLawFirms");
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
| **normAttorneyId** | **String**| Norm ID of Attorney.    - minimum: 18   - maximum: 18  | |
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

<a name="getJudgesAssociatedWithAttorney"></a>
# **getJudgesAssociatedWithAttorney**
> AssociatedNormJudgeResponse getJudgesAssociatedWithAttorney(normAttorneyId, pageNumber).q(q).execute();

Judges faced by the Attorney.

This endpoint returns information on all judges which have appeared in cases with the attorney specified by the normAttorneyId. The returned judges are ordered in descending order of number of cases shared with the relevant attorney. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot;  AND  courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTV4vCEaKrhystBz\&quot;, \&quot;CORTKQiA4LJuv54tEj\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed  |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed  |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed  |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed  |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed  |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed  |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **caseFiledDate** | Single Allowed |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get all judges associated with attorney with norm id NATYfwmXwRHS279WPY of all cases with case type id CTYPATMYyaJekdgj2c and  case filed date between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] &lt;br&gt;&lt;br&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttorneyAnalyticsApiApi;
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
    String normAttorneyId = "NATYfwmXwRHS279WPY"; // Norm ID of Attorney.    - minimum: 18   - maximum: 18 
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      AssociatedNormJudgeResponse result = client
              .attorneyAnalyticsApi
              .getJudgesAssociatedWithAttorney(normAttorneyId, pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getAssociatedNormJudgeArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttorneyAnalyticsApiApi#getJudgesAssociatedWithAttorney");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AssociatedNormJudgeResponse> response = client
              .attorneyAnalyticsApi
              .getJudgesAssociatedWithAttorney(normAttorneyId, pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttorneyAnalyticsApiApi#getJudgesAssociatedWithAttorney");
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
| **normAttorneyId** | **String**| Norm ID of Attorney.    - minimum: 18   - maximum: 18  | |
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

<a name="getNormAttorneyById"></a>
# **getNormAttorneyById**
> NormAttorney getNormAttorneyById(normAttorneyId).execute();

Norm Attorney Details.

This endpoint retrieves information on the attorney in our normalized attorney database which matches the normAttorneyId specified in the request.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttorneyAnalyticsApiApi;
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
    String normAttorneyId = "NATYs4P6kDBkhKL8CF"; // Norm ID of Attorney.    - minimum: 18   - maximum: 18 
    try {
      NormAttorney result = client
              .attorneyAnalyticsApi
              .getNormAttorneyById(normAttorneyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAttorneyAnalyticsAPI());
      System.out.println(result.getBarRecordArray());
      System.out.println(result.getCaseAnalyticsAPI());
      System.out.println(result.getCaseSearchAPI());
      System.out.println(result.getFirstName());
      System.out.println(result.getHasAssociatedPublicData());
      System.out.println(result.getLastName());
      System.out.println(result.getMiddleName());
      System.out.println(result.getName());
      System.out.println(result.getNormAttorneyId());
      System.out.println(result.getObject());
      System.out.println(result.getSimilarNormAttorneyArray());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttorneyAnalyticsApiApi#getNormAttorneyById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NormAttorney> response = client
              .attorneyAnalyticsApi
              .getNormAttorneyById(normAttorneyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttorneyAnalyticsApiApi#getNormAttorneyById");
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
| **normAttorneyId** | **String**| Norm ID of Attorney.    - minimum: 18   - maximum: 18  | |

### Return type

[**NormAttorney**](NormAttorney.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getNormAttorneySearchResults"></a>
# **getNormAttorneySearchResults**
> NormAttorneySearchResponse getNormAttorneySearchResults(normAttorneySearchId).pageNumber(pageNumber).execute();

Norm attorney search results for a given normAttorneySearchId.

### All query parameters supported for this API can be found in below schema section. Schema --&gt; NormAttorneySearchQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttorneyAnalyticsApiApi;
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
    String normAttorneySearchId = "ASRCJxUHYsgddr4Hc5"; // Norm Attorney Search information for the given normAttorneySearchId.
    Integer pageNumber = 1; // Query parameter specifying the page number of the search results to be retrieved. - Minimum: 1 - Maximum: 1000 
    try {
      NormAttorneySearchResponse result = client
              .attorneyAnalyticsApi
              .getNormAttorneySearchResults(normAttorneySearchId)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getNormAttorneySearchId());
      System.out.println(result.getNormAttorneySearchResultArray());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getQ());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttorneyAnalyticsApiApi#getNormAttorneySearchResults");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NormAttorneySearchResponse> response = client
              .attorneyAnalyticsApi
              .getNormAttorneySearchResults(normAttorneySearchId)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttorneyAnalyticsApiApi#getNormAttorneySearchResults");
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
| **normAttorneySearchId** | **String**| Norm Attorney Search information for the given normAttorneySearchId. | |
| **pageNumber** | **Integer**| Query parameter specifying the page number of the search results to be retrieved. - Minimum: 1 - Maximum: 1000  | [optional] |

### Return type

[**NormAttorneySearchResponse**](NormAttorneySearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listAssociatedNormParties"></a>
# **listAssociatedNormParties**
> AssociatedNormPartyResponse listAssociatedNormParties(normAttorneyId, pageNumber).q(q).execute();

Parties Represented By the Attorney.

Returns a list of Parties the Attorney has represented. &lt;br&gt;&lt;br&gt; ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot;  AND  courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTV4vCEaKrhystBz\&quot;, \&quot;CORTKQiA4LJuv54tEj\&quot;)**| | **courtId** | Multiple Ids Allowed  |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed  |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed  |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed  |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed  |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed  |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed  |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed  |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed  |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed  |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed  |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed  |Find Analytics for a particular Attorney Party Type Group Object.. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **caseFiledDate** | Single Allowed   |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple Ids Allowed  |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get all parties associated with attorney with norm id NATYfwmXwRHS279WPY of all cases with case type id CTYPATMYyaJekdgj2c and  case filed date between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] &lt;br&gt;&lt;br&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttorneyAnalyticsApiApi;
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
    String normAttorneyId = "NATYfwmXwRHS279WPY"; // Norm ID of Attorney.    - minimum: 18   - maximum: 18 
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      AssociatedNormPartyResponse result = client
              .attorneyAnalyticsApi
              .listAssociatedNormParties(normAttorneyId, pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getAssociatedNormPartyArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttorneyAnalyticsApiApi#listAssociatedNormParties");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AssociatedNormPartyResponse> response = client
              .attorneyAnalyticsApi
              .listAssociatedNormParties(normAttorneyId, pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttorneyAnalyticsApiApi#listAssociatedNormParties");
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
| **normAttorneyId** | **String**| Norm ID of Attorney.    - minimum: 18   - maximum: 18  | |
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

<a name="searchAttorneyInfo"></a>
# **searchAttorneyInfo**
> NormAttorneySearchResponse searchAttorneyInfo().q(q).pageNumber(pageNumber).execute();

Attorney search.

### This endpoint retrieves information, including the normAttorneyId, on all attorneys in our normalized attorney database which match the request parameters. All query parameters supported by this API can be found in the schema section below. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttorneyAnalyticsApiApi;
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
    String q = "normAttorneyId:\"NATYhUvNaef3b2iP8D\""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters.</a> 
    Integer pageNumber = 1; // Query parameter specifying the page number of the search results to be retrieved. - Minimum: 1 - Maximum: 1000 
    try {
      NormAttorneySearchResponse result = client
              .attorneyAnalyticsApi
              .searchAttorneyInfo()
              .q(q)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getNormAttorneySearchId());
      System.out.println(result.getNormAttorneySearchResultArray());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getQ());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttorneyAnalyticsApiApi#searchAttorneyInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NormAttorneySearchResponse> response = client
              .attorneyAnalyticsApi
              .searchAttorneyInfo()
              .q(q)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttorneyAnalyticsApiApi#searchAttorneyInfo");
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

[**NormAttorneySearchResponse**](NormAttorneySearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

