# PartyAnalyticsApiApi

All URIs are relative to *https://enterpriseapi.unicourt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAssociatedNormAttorneys**](PartyAnalyticsApiApi.md#getAssociatedNormAttorneys) | **GET** /normParty/{normPartyId}/associatedNormAttorneys | Attorneys that represented the Party. |
| [**getNormPartyDetails**](PartyAnalyticsApiApi.md#getNormPartyDetails) | **GET** /normParty/{normPartyId} | Norm Party Details. |
| [**getNormPartySearchResultsById**](PartyAnalyticsApiApi.md#getNormPartySearchResultsById) | **GET** /normPartySearch/{normPartySearchId} | Norm party search results for a given normPartySearchId. |
| [**listAssociatedNormLawFirms**](PartyAnalyticsApiApi.md#listAssociatedNormLawFirms) | **GET** /normParty/{normPartyId}/associatedNormLawFirms | Law Firms that represented the Party. |
| [**listJudgesAssociatedWithNormParty**](PartyAnalyticsApiApi.md#listJudgesAssociatedWithNormParty) | **GET** /normParty/{normPartyId}/associatedNormJudges | Judges Faced By the Party. |
| [**searchNormParties**](PartyAnalyticsApiApi.md#searchNormParties) | **GET** /normPartySearch | Party search. |


<a name="getAssociatedNormAttorneys"></a>
# **getAssociatedNormAttorneys**
> AssociatedNormAttorneyResponse getAssociatedNormAttorneys(normPartyId, pageNumber).q(q).execute();

Attorneys that represented the Party.

Returns a list of  Attorneys the Party has been represented by. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTV4vCEaKrhystBz\&quot;,\&quot;CORTYsomR6GiiiPovp\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **caseFiledDate** | Single Allowed  |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get all attorneys associated with Party with norm id NORGrPmQyLdx9NGHcT of all cases with case type id CTYPATMYyaJekdgj2c and  case filed date between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] &lt;br&gt;&lt;br&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartyAnalyticsApiApi;
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
    String normPartyId = "NORGrPmQyLdx9NGHcT"; // Norm ID of the Party.   - minimum: 18   - maximum: 18 
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      AssociatedNormAttorneyResponse result = client
              .partyAnalyticsApi
              .getAssociatedNormAttorneys(normPartyId, pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getAssociatedNormAttorneyArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartyAnalyticsApiApi#getAssociatedNormAttorneys");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AssociatedNormAttorneyResponse> response = client
              .partyAnalyticsApi
              .getAssociatedNormAttorneys(normPartyId, pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartyAnalyticsApiApi#getAssociatedNormAttorneys");
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
| **normPartyId** | **String**| Norm ID of the Party.   - minimum: 18   - maximum: 18  | |
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

<a name="getNormPartyDetails"></a>
# **getNormPartyDetails**
> NormParty getNormPartyDetails(normPartyId).execute();

Norm Party Details.

The Party Details API allows you to look up Parties by normPartyId. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartyAnalyticsApiApi;
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
    String normPartyId = "NORGrPmQyLdx9NGHcT"; // Norm ID of the Party.   - minimum: 18   - maximum: 18 
    try {
      NormParty result = client
              .partyAnalyticsApi
              .getNormPartyDetails(normPartyId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseAnalyticsAPI());
      System.out.println(result.getCaseSearchAPI());
      System.out.println(result.getIndividualData());
      System.out.println(result.getName());
      System.out.println(result.getNormOrganizationData());
      System.out.println(result.getNormPartyId());
      System.out.println(result.getObject());
      System.out.println(result.getPartyAnalyticsAPI());
      System.out.println(result.getPartyClassificationType());
      System.out.println(result.getRelatedNormPartyArray());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartyAnalyticsApiApi#getNormPartyDetails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NormParty> response = client
              .partyAnalyticsApi
              .getNormPartyDetails(normPartyId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartyAnalyticsApiApi#getNormPartyDetails");
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
| **normPartyId** | **String**| Norm ID of the Party.   - minimum: 18   - maximum: 18  | |

### Return type

[**NormParty**](NormParty.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getNormPartySearchResultsById"></a>
# **getNormPartySearchResultsById**
> NormPartySearchResponse getNormPartySearchResultsById(normPartySearchId).pageNumber(pageNumber).execute();

Norm party search results for a given normPartySearchId.

### All query parameters supported for this API can be found in below schema section. Schema --&gt; NormPartySearchQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartyAnalyticsApiApi;
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
    String normPartySearchId = "PSRCUoacNCGj9ezvqf"; // Norm Party Search information for the given normPartySearchId.
    Integer pageNumber = 1; // Query parameter specifying the page number of the search results to be retrieved. - Minimum: 1 - Maximum: 1000 
    try {
      NormPartySearchResponse result = client
              .partyAnalyticsApi
              .getNormPartySearchResultsById(normPartySearchId)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getNormPartySearchId());
      System.out.println(result.getNormPartySearchResultArray());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getQ());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartyAnalyticsApiApi#getNormPartySearchResultsById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NormPartySearchResponse> response = client
              .partyAnalyticsApi
              .getNormPartySearchResultsById(normPartySearchId)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartyAnalyticsApiApi#getNormPartySearchResultsById");
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
| **normPartySearchId** | **String**| Norm Party Search information for the given normPartySearchId. | |
| **pageNumber** | **Integer**| Query parameter specifying the page number of the search results to be retrieved. - Minimum: 1 - Maximum: 1000  | [optional] |

### Return type

[**NormPartySearchResponse**](NormPartySearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listAssociatedNormLawFirms"></a>
# **listAssociatedNormLawFirms**
> AssociatedNormLawFirmResponse listAssociatedNormLawFirms(normPartyId, pageNumber).q(q).execute();

Law Firms that represented the Party.

Returns a list of Law Firms the Party has been represented by. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTV4vCEaKrhystBz\&quot;,\&quot;CORTYsomR6GiiiPovp\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **caseFiledDate** | Single Allowed |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get all lawfirms associated with Party with norm id NORGrPmQyLdx9NGHcT of all cases with case type id CTYPATMYyaJekdgj2c and  case filed date between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartyAnalyticsApiApi;
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
    String normPartyId = "NORGrPmQyLdx9NGHcT"; // Norm ID of the Party.   - minimum: 18   - maximum: 18 
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      AssociatedNormLawFirmResponse result = client
              .partyAnalyticsApi
              .listAssociatedNormLawFirms(normPartyId, pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getAssociatedNormLawFirmArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartyAnalyticsApiApi#listAssociatedNormLawFirms");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AssociatedNormLawFirmResponse> response = client
              .partyAnalyticsApi
              .listAssociatedNormLawFirms(normPartyId, pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartyAnalyticsApiApi#listAssociatedNormLawFirms");
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
| **normPartyId** | **String**| Norm ID of the Party.   - minimum: 18   - maximum: 18  | |
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

<a name="listJudgesAssociatedWithNormParty"></a>
# **listJudgesAssociatedWithNormParty**
> AssociatedNormJudgeResponse listJudgesAssociatedWithNormParty(normPartyId, pageNumber).q(q).execute();

Judges Faced By the Party.

Returns a list of Judges the party has faced. &lt;br&gt;&lt;br&gt; ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTV4vCEaKrhystBz\&quot;,\&quot;CORTYsomR6GiiiPovp\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **caseFiledDate** | Single Allowed  |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get all judges associated with Party with norm id NORGrPmQyLdx9NGHcT of all cases with case type id CTYPATMYyaJekdgj2c and  case filed date between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] &lt;br&gt;&lt;br&gt; 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartyAnalyticsApiApi;
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
    String normPartyId = "NORGrPmQyLdx9NGHcT"; // Norm ID of the Party.   - minimum: 18   - maximum: 18 
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      AssociatedNormJudgeResponse result = client
              .partyAnalyticsApi
              .listJudgesAssociatedWithNormParty(normPartyId, pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getAssociatedNormJudgeArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartyAnalyticsApiApi#listJudgesAssociatedWithNormParty");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AssociatedNormJudgeResponse> response = client
              .partyAnalyticsApi
              .listJudgesAssociatedWithNormParty(normPartyId, pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartyAnalyticsApiApi#listJudgesAssociatedWithNormParty");
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
| **normPartyId** | **String**| Norm ID of the Party.   - minimum: 18   - maximum: 18  | |
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

<a name="searchNormParties"></a>
# **searchNormParties**
> NormPartySearchResponse searchNormParties().q(q).pageNumber(pageNumber).execute();

Party search.

### All query parameters supported for this API can be found in below schema section. Schema --&gt; NormPartySearchQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PartyAnalyticsApiApi;
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
    String q = "normPartyId:\"NORGJWPpNLekV7dKTm\""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters.</a> 
    Integer pageNumber = 1; // Query parameter specifying the page number of the search results to be retrieved. - Minimum: 1 - Maximum: 1000 
    try {
      NormPartySearchResponse result = client
              .partyAnalyticsApi
              .searchNormParties()
              .q(q)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getNormPartySearchId());
      System.out.println(result.getNormPartySearchResultArray());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getQ());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartyAnalyticsApiApi#searchNormParties");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NormPartySearchResponse> response = client
              .partyAnalyticsApi
              .searchNormParties()
              .q(q)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PartyAnalyticsApiApi#searchNormParties");
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

[**NormPartySearchResponse**](NormPartySearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

