# CaseAnalyticsApiApi

All URIs are relative to *https://enterpriseapi.unicourt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCaseCountAnalyticsByCaseClass**](CaseAnalyticsApiApi.md#getCaseCountAnalyticsByCaseClass) | **GET** /caseCountAnalyticsByCaseClass | Case Count Analytics by Case Class. |
| [**getCaseCountAnalyticsByCaseFiledDate**](CaseAnalyticsApiApi.md#getCaseCountAnalyticsByCaseFiledDate) | **GET** /caseCountAnalyticsByCaseFiledDate | Case Count Analytics by Case Filed Date. |
| [**getCaseCountAnalyticsByCaseTypeGroup**](CaseAnalyticsApiApi.md#getCaseCountAnalyticsByCaseTypeGroup) | **GET** /caseCountAnalyticsByCaseTypeGroup | Case Count Analytics by Case Type Group. |
| [**getCaseCountAnalyticsByCourt**](CaseAnalyticsApiApi.md#getCaseCountAnalyticsByCourt) | **GET** /caseCountAnalyticsByCourt | Case Count Analytics by Court. |
| [**getCaseCountAnalyticsByCourtLocation**](CaseAnalyticsApiApi.md#getCaseCountAnalyticsByCourtLocation) | **GET** /caseCountAnalyticsByCourtLocation | Case Count Analytics by Court Location. |
| [**getCaseCountAnalyticsByCourtSystem**](CaseAnalyticsApiApi.md#getCaseCountAnalyticsByCourtSystem) | **GET** /caseCountAnalyticsByCourtSystem | Case Count Analytics by Court System. |
| [**getCaseCountAnalyticsByCourtType**](CaseAnalyticsApiApi.md#getCaseCountAnalyticsByCourtType) | **GET** /caseCountAnalyticsByCourtType | Case Count Analytics by CourtType. |
| [**getCaseCountAnalyticsByJurisdictionGeo**](CaseAnalyticsApiApi.md#getCaseCountAnalyticsByJurisdictionGeo) | **GET** /caseCountAnalyticsByJurisdictionGeo | Case Count Analytics by Jurisdiction Geo. |
| [**getCaseCountAnalyticsByNormAttorney**](CaseAnalyticsApiApi.md#getCaseCountAnalyticsByNormAttorney) | **GET** /caseCountAnalyticsByNormAttorney | Case Count Analytics by Attorney. |
| [**getCaseCountAnalyticsByNormJudge**](CaseAnalyticsApiApi.md#getCaseCountAnalyticsByNormJudge) | **GET** /caseCountAnalyticsByNormJudge | Case Count Analytics by Judge. |
| [**getCaseCountAnalyticsByNormLawFirm**](CaseAnalyticsApiApi.md#getCaseCountAnalyticsByNormLawFirm) | **GET** /caseCountAnalyticsByNormLawFirm | Case Count Analytics by Norm Law Firm. |
| [**getCaseCountAnalyticsByNormParty**](CaseAnalyticsApiApi.md#getCaseCountAnalyticsByNormParty) | **GET** /caseCountAnalyticsByNormParty | Case Count Analytics by Party. |
| [**getCaseCountAnalyticsByOpposingNormAttorneyForNormAttorney**](CaseAnalyticsApiApi.md#getCaseCountAnalyticsByOpposingNormAttorneyForNormAttorney) | **GET** /normAttorney/{normAttorneyId}/caseCountAnalyticsByOpposingNormAttorney | Case Count Analytics by Opposing Norm Attorney. |
| [**getCaseCountAnalyticsByOpposingNormLawFirmForANormLawFirm**](CaseAnalyticsApiApi.md#getCaseCountAnalyticsByOpposingNormLawFirmForANormLawFirm) | **GET** /normLawFirm/{normLawFirmId}/caseCountAnalyticsByOpposingNormLawFirm | Case Count Analytics by Opposing Norm Law Firm. |
| [**getCaseCountAnalyticsByOpposingNormPartyForANormParty**](CaseAnalyticsApiApi.md#getCaseCountAnalyticsByOpposingNormPartyForANormParty) | **GET** /normParty/{normPartyId}/caseCountAnalyticsByOpposingNormParty | Case Count Analytics by Opposing Norm Party. |
| [**getCaseCountAnalyticsByPartyRole**](CaseAnalyticsApiApi.md#getCaseCountAnalyticsByPartyRole) | **GET** /caseCountAnalyticsByPartyRole | Case Count Analytics by Party Role. |
| [**getCaseCountAnalyticsByPartyRoleGroup**](CaseAnalyticsApiApi.md#getCaseCountAnalyticsByPartyRoleGroup) | **GET** /caseCountAnalyticsByPartyRoleGroup | Case Count Analytics by Party Role Group. |
| [**getCaseCountByAreaOfLaw**](CaseAnalyticsApiApi.md#getCaseCountByAreaOfLaw) | **GET** /caseCountAnalyticsByAreaOfLaw | Case Count Analytics by Area Of Law. |
| [**getCaseCountByCaseType**](CaseAnalyticsApiApi.md#getCaseCountByCaseType) | **GET** /caseCountAnalyticsByCaseType | Case Count Analytics by Case Type. |


<a name="getCaseCountAnalyticsByCaseClass"></a>
# **getCaseCountAnalyticsByCaseClass**
> CaseCountAnalyticsByCaseClassResponse getCaseCountAnalyticsByCaseClass(pageNumber).q(q).execute();

Case Count Analytics by Case Class.

Get Analytics by Case Class. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **normAttorneyId** | Multiple Ids Allowed |Find Analytics for a particular norm Attorney Object. | **normAttorneyId:\&quot;NATYfwmXwRHS279WPY\&quot;** | | **normPartyId** | Multiple Ids Allowed |Find Analytics for a particular Party Object. | **normPartyId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normLawFirmId** | Multiple Ids Allowed |Find Analytics for a particular Norm LawFirm Object. | **normLawFirmId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normJudgeId** | Multiple Ids Allowed |Find Analytics for a particular Judge Object. | **normJudgeId:\&quot;NJUDT7jCZyFNeLGpRq\&quot;** | | **caseFiledDate** | Single Allowed   |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get case count grouped by Case Class  of all cases with case type id CTYPATMYyaJekdgj2c and filed between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseAnalyticsApiApi;
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
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      CaseCountAnalyticsByCaseClassResponse result = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByCaseClass(pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getResults());
      System.out.println(result.getTotalCaseClassCount());
      System.out.println(result.getTotalCaseCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByCaseClass");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseCountAnalyticsByCaseClassResponse> response = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByCaseClass(pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByCaseClass");
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
| **pageNumber** | **Integer**| Page number. - minimum: 1  | |
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above. | [optional] |

### Return type

[**CaseCountAnalyticsByCaseClassResponse**](CaseCountAnalyticsByCaseClassResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseCountAnalyticsByCaseFiledDate"></a>
# **getCaseCountAnalyticsByCaseFiledDate**
> CaseCountAnalyticsByCaseFiledDateResponse getCaseCountAnalyticsByCaseFiledDate(pageNumber, groupBy).q(q).execute();

Case Count Analytics by Case Filed Date.

Get Case Count Analytics grouped by Filing Date. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **normAttorneyId** | Multiple Ids Allowed |Find Analytics for a particular norm Attorney Object. | **normAttorneyId:\&quot;NATYfwmXwRHS279WPY\&quot;** | | **normPartyId** | Multiple Ids Allowed |Find Analytics for a particular Party Object. | **normPartyId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normLawFirmId** | Multiple Ids Allowed |Find Analytics for a particular Norm LawFirm Object. | **normLawFirmId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normJudgeId** | Multiple Ids Allowed |Find Analytics for a particular Judge Object. | **normJudgeId:\&quot;NJUDT7jCZyFNeLGpRq\&quot;** | | **caseFiledDate** | Single Allowed  |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get case count grouped by case filed date of all cases with case type id CTYPATMYyaJekdgj2c and filed between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseAnalyticsApiApi;
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
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String groupBy = "Yearly"; // GroupBy
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      CaseCountAnalyticsByCaseFiledDateResponse result = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByCaseFiledDate(pageNumber, groupBy)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getResults());
      System.out.println(result.getTotalCaseCount());
      System.out.println(result.getTotalCaseFiledDateCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByCaseFiledDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseCountAnalyticsByCaseFiledDateResponse> response = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByCaseFiledDate(pageNumber, groupBy)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByCaseFiledDate");
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
| **pageNumber** | **Integer**| Page number. - minimum: 1  | |
| **groupBy** | **String**| GroupBy | [enum: Yearly, Quarterly, Monthly, Weekly] |
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above. | [optional] |

### Return type

[**CaseCountAnalyticsByCaseFiledDateResponse**](CaseCountAnalyticsByCaseFiledDateResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseCountAnalyticsByCaseTypeGroup"></a>
# **getCaseCountAnalyticsByCaseTypeGroup**
> CaseCountAnalyticsByCaseTypeGroupResponse getCaseCountAnalyticsByCaseTypeGroup(pageNumber).q(q).execute();

Case Count Analytics by Case Type Group.

Get Analytics by Case Type Group. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **normAttorneyId** | Multiple Ids Allowed  |Find Analytics for a particular norm Attorney Object. | **normAttorneyId:\&quot;NATYfwmXwRHS279WPY\&quot;** | | **normPartyId** | Multiple Ids Allowed  |Find Analytics for a particular Party Object. | **normPartyId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normLawFirmId** | Multiple Ids Allowed  |Find Analytics for a particular Norm LawFirm Object. | **normLawFirmId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normJudgeId** | Multiple Ids Allowed  |Find Analytics for a particular Judge Object. | **normJudgeId:\&quot;NJUDT7jCZyFNeLGpRq\&quot;** | | **caseFiledDate** | Single Allowed   |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get case count grouped by case type catgeory of all cases with case type id CTYPATMYyaJekdgj2c and filed between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseAnalyticsApiApi;
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
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      CaseCountAnalyticsByCaseTypeGroupResponse result = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByCaseTypeGroup(pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getResults());
      System.out.println(result.getTotalCaseCount());
      System.out.println(result.getTotalCaseTypeGroupCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByCaseTypeGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseCountAnalyticsByCaseTypeGroupResponse> response = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByCaseTypeGroup(pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByCaseTypeGroup");
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
| **pageNumber** | **Integer**| Page number. - minimum: 1  | |
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above. | [optional] |

### Return type

[**CaseCountAnalyticsByCaseTypeGroupResponse**](CaseCountAnalyticsByCaseTypeGroupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseCountAnalyticsByCourt"></a>
# **getCaseCountAnalyticsByCourt**
> CaseCountAnalyticsByCourtResponse getCaseCountAnalyticsByCourt(pageNumber).q(q).execute();

Case Count Analytics by Court.

Get Case Count Analytics grouped by Court. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **normAttorneyId** | Multiple Ids Allowed  |Find Analytics for a particular norm Attorney Object. | **normAttorneyId:\&quot;NATYfwmXwRHS279WPY\&quot;** | | **normPartyId** | Multiple Ids Allowed |Find Analytics for a particular Party Object. | **normPartyId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normLawFirmId** | Multiple Ids Allowed  |Find Analytics for a particular Norm LawFirm Object. | **normLawFirmId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normJudgeId** | Multiple Ids Allowed  |Find Analytics for a particular Judge Object. | **normJudgeId:\&quot;NJUDT7jCZyFNeLGpRq\&quot;** | | **caseFiledDate** | Single Allowed  |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get case count grouped by Court of all cases with case type id CTYPATMYyaJekdgj2c and filed between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseAnalyticsApiApi;
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
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      CaseCountAnalyticsByCourtResponse result = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByCourt(pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getResults());
      System.out.println(result.getTotalCaseCount());
      System.out.println(result.getTotalCourtCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByCourt");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseCountAnalyticsByCourtResponse> response = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByCourt(pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByCourt");
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
| **pageNumber** | **Integer**| Page number. - minimum: 1  | |
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above. | [optional] |

### Return type

[**CaseCountAnalyticsByCourtResponse**](CaseCountAnalyticsByCourtResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseCountAnalyticsByCourtLocation"></a>
# **getCaseCountAnalyticsByCourtLocation**
> CaseCountAnalyticsByCourtLocationResponse getCaseCountAnalyticsByCourtLocation(pageNumber).q(q).execute();

Case Count Analytics by Court Location.

Get Case Count Analytics grouped by Court Location. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **normAttorneyId** | Multiple Ids Allowed  |Find Analytics for a particular norm Attorney Object. | **normAttorneyId:\&quot;NATYfwmXwRHS279WPY\&quot;** | | **normPartyId** | Multiple Ids Allowed |Find Analytics for a particular Party Object. | **normPartyId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normLawFirmId** | Multiple Ids Allowed  |Find Analytics for a particular Norm LawFirm Object. | **normLawFirmId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normJudgeId** | Multiple Ids Allowed  |Find Analytics for a particular Judge Object. | **normJudgeId:\&quot;NJUDT7jCZyFNeLGpRq\&quot;** | | **caseFiledDate** | Single Allowed |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get case count grouped by court location  of all cases with court id CORTV4vCEaKrhystBz and filed between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseAnalyticsApiApi;
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
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      CaseCountAnalyticsByCourtLocationResponse result = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByCourtLocation(pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getResults());
      System.out.println(result.getTotalCaseCount());
      System.out.println(result.getTotalCourtLocationCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByCourtLocation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseCountAnalyticsByCourtLocationResponse> response = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByCourtLocation(pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByCourtLocation");
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
| **pageNumber** | **Integer**| Page number. - minimum: 1  | |
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above. | [optional] |

### Return type

[**CaseCountAnalyticsByCourtLocationResponse**](CaseCountAnalyticsByCourtLocationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseCountAnalyticsByCourtSystem"></a>
# **getCaseCountAnalyticsByCourtSystem**
> CaseCountAnalyticsByCourtSystemResponse getCaseCountAnalyticsByCourtSystem(pageNumber).q(q).execute();

Case Count Analytics by Court System.

Get Case Count Analytics grouped by Court System. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **normAttorneyId** | Multiple Ids Allowed  |Find Analytics for a particular norm Attorney Object. | **normAttorneyId:\&quot;NATYfwmXwRHS279WPY\&quot;** | | **normPartyId** | Multiple Ids Allowed |Find Analytics for a particular Party Object. | **normPartyId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normLawFirmId** | Multiple Ids Allowed |Find Analytics for a particular Norm LawFirm Object. | **normLawFirmId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normJudgeId** | Multiple Ids Allowed |Find Analytics for a particular Judge Object. | **normJudgeId:\&quot;NJUDT7jCZyFNeLGpRq\&quot;** | | **caseFiledDate** | Single Allowed  |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed  |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get case count grouped by court system of all cases with case type id CTYPATMYyaJekdgj2c and filed between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseAnalyticsApiApi;
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
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      CaseCountAnalyticsByCourtSystemResponse result = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByCourtSystem(pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getResults());
      System.out.println(result.getTotalCaseCount());
      System.out.println(result.getTotalCourtSystemCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByCourtSystem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseCountAnalyticsByCourtSystemResponse> response = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByCourtSystem(pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByCourtSystem");
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
| **pageNumber** | **Integer**| Page number. - minimum: 1  | |
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above. | [optional] |

### Return type

[**CaseCountAnalyticsByCourtSystemResponse**](CaseCountAnalyticsByCourtSystemResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseCountAnalyticsByCourtType"></a>
# **getCaseCountAnalyticsByCourtType**
> CaseCountAnalyticsByCourtTypeResponse getCaseCountAnalyticsByCourtType(pageNumber).q(q).execute();

Case Count Analytics by CourtType.

Get Case Count Analytics grouped by Court Type. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **normAttorneyId** | Multiple Ids Allowed |Find Analytics for a particular norm Attorney Object. | **normAttorneyId:\&quot;NATYfwmXwRHS279WPY\&quot;** | | **normPartyId** | Multiple Ids Allowed |Find Analytics for a particular Party Object. | **normPartyId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normLawFirmId** | Multiple Ids Allowed |Find Analytics for a particular Norm LawFirm Object. | **normLawFirmId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normJudgeId** | Multiple Ids Allowed  |Find Analytics for a particular Judge Object. | **normJudgeId:\&quot;NJUDT7jCZyFNeLGpRq\&quot;** | | **caseFiledDate** | Single Allowed   |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed  |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get case count grouped by court type  of all cases with case type id CTYPATMYyaJekdgj2c and filed between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseAnalyticsApiApi;
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
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      CaseCountAnalyticsByCourtTypeResponse result = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByCourtType(pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getResults());
      System.out.println(result.getTotalCaseCount());
      System.out.println(result.getTotalCourtTypeCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByCourtType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseCountAnalyticsByCourtTypeResponse> response = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByCourtType(pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByCourtType");
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
| **pageNumber** | **Integer**| Page number. - minimum: 1  | |
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above. | [optional] |

### Return type

[**CaseCountAnalyticsByCourtTypeResponse**](CaseCountAnalyticsByCourtTypeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseCountAnalyticsByJurisdictionGeo"></a>
# **getCaseCountAnalyticsByJurisdictionGeo**
> CaseCountAnalyticsByJurisdictionGeoResponse getCaseCountAnalyticsByJurisdictionGeo(pageNumber).q(q).execute();

Case Count Analytics by Jurisdiction Geo.

Get Case Count Analytics grouped by Jurisdiction Geo. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **normAttorneyId** | Multiple Ids Allowed  |Find Analytics for a particular norm Attorney Object. | **normAttorneyId:\&quot;NATYfwmXwRHS279WPY\&quot;** | | **normPartyId** | Multiple Ids Allowed |Find Analytics for a particular Party Object. | **normPartyId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normLawFirmId** | Multiple Ids Allowed |Find Analytics for a particular Norm LawFirm Object. | **normLawFirmId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normJudgeId** | Multiple Ids Allowed |Find Analytics for a particular Judge Object. | **normJudgeId:\&quot;NJUDT7jCZyFNeLGpRq\&quot;** | | **caseFiledDate** | Single Allowed  |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed  |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get case count grouped by jurisdiction geo of all cases with case type id CTYPATMYyaJekdgj2c and filed between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseAnalyticsApiApi;
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
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      CaseCountAnalyticsByJurisdictionGeoResponse result = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByJurisdictionGeo(pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getResults());
      System.out.println(result.getTotalCaseCount());
      System.out.println(result.getTotalJurisdictionGeoCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByJurisdictionGeo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseCountAnalyticsByJurisdictionGeoResponse> response = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByJurisdictionGeo(pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByJurisdictionGeo");
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
| **pageNumber** | **Integer**| Page number. - minimum: 1  | |
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above. | [optional] |

### Return type

[**CaseCountAnalyticsByJurisdictionGeoResponse**](CaseCountAnalyticsByJurisdictionGeoResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseCountAnalyticsByNormAttorney"></a>
# **getCaseCountAnalyticsByNormAttorney**
> CaseCountAnalyticsByNormAttorneyResponse getCaseCountAnalyticsByNormAttorney(pageNumber).q(q).execute();

Case Count Analytics by Attorney.

Returns Case Analytics by Attorney. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **normAttorneyId** | Multiple Ids Allowed  |Find Analytics for a particular norm Attorney Object. | **normAttorneyId:\&quot;NATYfwmXwRHS279WPY\&quot;** | | **normPartyId** | Multiple Ids Allowed  |Find Analytics for a particular Party Object. | **normPartyId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normLawFirmId** | Multiple Ids Allowed |Find Analytics for a particular Norm LawFirm Object. | **normLawFirmId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normJudgeId** | Multiple Ids Allowed |Find Analytics for a particular Judge Object. | **normJudgeId:\&quot;NJUDT7jCZyFNeLGpRq\&quot;** | | **caseFiledDate** | Single Allowed |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get case count grouped by norm attorney of all cases with case type id CTYPATMYyaJekdgj2c and filed between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseAnalyticsApiApi;
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
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      CaseCountAnalyticsByNormAttorneyResponse result = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByNormAttorney(pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getResults());
      System.out.println(result.getTotalCaseCount());
      System.out.println(result.getTotalNormAttorneyCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByNormAttorney");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseCountAnalyticsByNormAttorneyResponse> response = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByNormAttorney(pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByNormAttorney");
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
| **pageNumber** | **Integer**| Page number. - minimum: 1  | |
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above. | [optional] |

### Return type

[**CaseCountAnalyticsByNormAttorneyResponse**](CaseCountAnalyticsByNormAttorneyResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseCountAnalyticsByNormJudge"></a>
# **getCaseCountAnalyticsByNormJudge**
> CaseCountAnalyticsByNormJudgeResponse getCaseCountAnalyticsByNormJudge(pageNumber).q(q).execute();

Case Count Analytics by Judge.

Returns Case Analytics by Judge. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **normAttorneyId** | Multiple Ids Allowed |Find Analytics for a particular norm Attorney Object. | **normAttorneyId:\&quot;NATYfwmXwRHS279WPY\&quot;** | | **normPartyId** | Multiple Ids Allowed  |Find Analytics for a particular Party Object. | **normPartyId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normLawFirmId** | Multiple Ids Allowed  |Find Analytics for a particular Norm LawFirm Object. | **normLawFirmId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normJudgeId** | Multiple Ids Allowed  |Find Analytics for a particular Judge Object. | **normJudgeId:\&quot;NJUDT7jCZyFNeLGpRq\&quot;** | | **caseFiledDate** | Single Allowed  |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get case count grouped by norm judge of all cases with case type id CTYPATMYyaJekdgj2c and filed between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseAnalyticsApiApi;
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
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      CaseCountAnalyticsByNormJudgeResponse result = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByNormJudge(pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getResults());
      System.out.println(result.getTotalCaseCount());
      System.out.println(result.getTotalNormJudgeCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByNormJudge");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseCountAnalyticsByNormJudgeResponse> response = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByNormJudge(pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByNormJudge");
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
| **pageNumber** | **Integer**| Page number. - minimum: 1  | |
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above. | [optional] |

### Return type

[**CaseCountAnalyticsByNormJudgeResponse**](CaseCountAnalyticsByNormJudgeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseCountAnalyticsByNormLawFirm"></a>
# **getCaseCountAnalyticsByNormLawFirm**
> CaseCountAnalyticsByNormLawFirmResponse getCaseCountAnalyticsByNormLawFirm(pageNumber).q(q).execute();

Case Count Analytics by Norm Law Firm.

Returns Case Analytics by Norm Law Firm. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **normAttorneyId** | Multiple Ids Allowed  |Find Analytics for a particular norm Attorney Object. | **normAttorneyId:\&quot;NATYfwmXwRHS279WPY\&quot;** | | **normLawFirmId** | Multiple Ids Allowed  |Find Analytics for a particular Norm LawFirm Object. | **normLawFirmId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normPartyId** | Multiple Ids Allowed |Find Analytics for a particular Party Object. | **normPartyId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normJudgeId** | Multiple Ids Allowed  |Find Analytics for a particular Judge Object. | **normJudgeId:\&quot;NJUDT7jCZyFNeLGpRq\&quot;** | | **caseFiledDate** | Single Allowed  |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get case count grouped by norm lawfirm  of all cases with case type id CTYPATMYyaJekdgj2c and filed between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseAnalyticsApiApi;
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
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      CaseCountAnalyticsByNormLawFirmResponse result = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByNormLawFirm(pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getResults());
      System.out.println(result.getTotalCaseCount());
      System.out.println(result.getTotalNormLawFirmCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByNormLawFirm");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseCountAnalyticsByNormLawFirmResponse> response = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByNormLawFirm(pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByNormLawFirm");
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
| **pageNumber** | **Integer**| Page number. - minimum: 1  | |
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above. | [optional] |

### Return type

[**CaseCountAnalyticsByNormLawFirmResponse**](CaseCountAnalyticsByNormLawFirmResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseCountAnalyticsByNormParty"></a>
# **getCaseCountAnalyticsByNormParty**
> CaseCountAnalyticsByNormPartyResponse getCaseCountAnalyticsByNormParty(pageNumber).q(q).execute();

Case Count Analytics by Party.

Returns Case Analytics by Party. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **normAttorneyId** | Multiple Ids Allowed  |Find Analytics for a particular norm Attorney Object. | **normAttorneyId:\&quot;NATYfwmXwRHS279WPY\&quot;** | | **normLawFirmId** | Multiple Ids Allowed  |Find Analytics for a particular Norm LawFirm Object. | **normLawFirmId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normPartyId** | Multiple Ids Allowed |Find Analytics for a particular Party Object. | **normPartyId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normJudgeId** | Multiple Ids Allowed  |Find Analytics for a particular Judge Object. | **normJudgeId:\&quot;NJUDT7jCZyFNeLGpRq\&quot;** | | **caseFiledDate** | Single Allowed  |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get case count grouped by norm party of all cases with case type id CTYPATMYyaJekdgj2c and filed between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseAnalyticsApiApi;
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
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      CaseCountAnalyticsByNormPartyResponse result = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByNormParty(pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getResults());
      System.out.println(result.getTotalCaseCount());
      System.out.println(result.getTotalNormPartyCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByNormParty");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseCountAnalyticsByNormPartyResponse> response = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByNormParty(pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByNormParty");
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
| **pageNumber** | **Integer**| Page number. - minimum: 1  | |
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above. | [optional] |

### Return type

[**CaseCountAnalyticsByNormPartyResponse**](CaseCountAnalyticsByNormPartyResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseCountAnalyticsByOpposingNormAttorneyForNormAttorney"></a>
# **getCaseCountAnalyticsByOpposingNormAttorneyForNormAttorney**
> CaseCountAnalyticsByNormAttorneyResponse getCaseCountAnalyticsByOpposingNormAttorneyForNormAttorney(normAttorneyId, pageNumber).q(q).execute();

Case Count Analytics by Opposing Norm Attorney.

Returns Case Analytics by Attorney. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **normPartyId** | Single Allowed  |Find Analytics for a particular Party Object. | **normPartyId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normLawFirmId** | Single Allowed |Find Analytics for a particular Norm LawFirm Object. | **normLawFirmId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normJudgeId** | Single Allowed |Find Analytics for a particular Judge Object. | **normJudgeId:\&quot;NJUDiNU45NWikKVxSH\&quot;** | | **caseFiledDate** | Single Allowed |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get case count grouped by norm attorney with norm id NATYY29p78c7UoyJJ of all cases with case type id CTYPATMYyaJekdgj2c and filed between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseAnalyticsApiApi;
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
      CaseCountAnalyticsByNormAttorneyResponse result = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByOpposingNormAttorneyForNormAttorney(normAttorneyId, pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getResults());
      System.out.println(result.getTotalCaseCount());
      System.out.println(result.getTotalNormAttorneyCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByOpposingNormAttorneyForNormAttorney");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseCountAnalyticsByNormAttorneyResponse> response = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByOpposingNormAttorneyForNormAttorney(normAttorneyId, pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByOpposingNormAttorneyForNormAttorney");
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

[**CaseCountAnalyticsByNormAttorneyResponse**](CaseCountAnalyticsByNormAttorneyResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseCountAnalyticsByOpposingNormLawFirmForANormLawFirm"></a>
# **getCaseCountAnalyticsByOpposingNormLawFirmForANormLawFirm**
> CaseCountAnalyticsByNormLawFirmResponse getCaseCountAnalyticsByOpposingNormLawFirmForANormLawFirm(normLawFirmId, pageNumber).q(q).execute();

Case Count Analytics by Opposing Norm Law Firm.

Returns Case Analytics by Norm Law Firm. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **normAttorneyId** | Single Allowed  |Find Analytics for a particular norm Attorney Object. | **normAttorneyId:\&quot;NATYp7kmEQtt8jQ3eQ\&quot;** | | **normPartyId** | Single Allowed |Find Analytics for a particular Party Object. | **normPartyId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normJudgeId** | Single Allowed  |Find Analytics for a particular Judge Object. | **normJudgeId:\&quot;NJUDT7jCZyFNeLGpRq\&quot;** | | **caseFiledDate** | Single Allowed  |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get case count grouped by norm lawfirm with norm id NORGrPmQyLdx9NGHcT of all cases with case type id CTYPATMYyaJekdgj2c and filed between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseAnalyticsApiApi;
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
      CaseCountAnalyticsByNormLawFirmResponse result = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByOpposingNormLawFirmForANormLawFirm(normLawFirmId, pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getResults());
      System.out.println(result.getTotalCaseCount());
      System.out.println(result.getTotalNormLawFirmCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByOpposingNormLawFirmForANormLawFirm");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseCountAnalyticsByNormLawFirmResponse> response = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByOpposingNormLawFirmForANormLawFirm(normLawFirmId, pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByOpposingNormLawFirmForANormLawFirm");
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

[**CaseCountAnalyticsByNormLawFirmResponse**](CaseCountAnalyticsByNormLawFirmResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseCountAnalyticsByOpposingNormPartyForANormParty"></a>
# **getCaseCountAnalyticsByOpposingNormPartyForANormParty**
> CaseCountAnalyticsByNormPartyResponse getCaseCountAnalyticsByOpposingNormPartyForANormParty(normPartyId, pageNumber).q(q).execute();

Case Count Analytics by Opposing Norm Party.

Returns Case Analytics by Opposing Norm Party. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **normAttorneyId** | Single Allowed  |Find Analytics for a particular norm Attorney Object. | **normAttorneyId:\&quot;NATYfwmXwRHS279WPY\&quot;** | | **normLawFirmId** | Single Allowed |Find Analytics for a particular Norm LawFirm Object. | **normLawFirmId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normJudgeId** | Single Allowed  |Find Analytics for a particular Judge Object. | **normJudgeId:\&quot;NJUDT7jCZyFNeLGpRq\&quot;** | | **caseFiledDate** | Single Allowed  |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get case count grouped by norm party with norm id NORGrPmQyLdx9NGHcT of all cases with case type id CTYPATMYyaJekdgj2c and filed between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseAnalyticsApiApi;
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
      CaseCountAnalyticsByNormPartyResponse result = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByOpposingNormPartyForANormParty(normPartyId, pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getResults());
      System.out.println(result.getTotalCaseCount());
      System.out.println(result.getTotalNormPartyCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByOpposingNormPartyForANormParty");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseCountAnalyticsByNormPartyResponse> response = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByOpposingNormPartyForANormParty(normPartyId, pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByOpposingNormPartyForANormParty");
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

[**CaseCountAnalyticsByNormPartyResponse**](CaseCountAnalyticsByNormPartyResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseCountAnalyticsByPartyRole"></a>
# **getCaseCountAnalyticsByPartyRole**
> CaseCountAnalyticsByPartyRoleResponse getCaseCountAnalyticsByPartyRole(pageNumber).q(q).execute();

Case Count Analytics by Party Role.

Returns Case Analytics by Party Type. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **normPartyId** | Multiple Ids Allowed  |Find Analytics for a particular Party Object. | **normPartyId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **caseFiledDate** | Single Allowed  |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get case count grouped by party role of all cases with case type id CTYPATMYyaJekdgj2c and filed between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseAnalyticsApiApi;
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
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      CaseCountAnalyticsByPartyRoleResponse result = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByPartyRole(pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getResults());
      System.out.println(result.getTotalCaseCount());
      System.out.println(result.getTotalPages());
      System.out.println(result.getTotalPartyRoleCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByPartyRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseCountAnalyticsByPartyRoleResponse> response = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByPartyRole(pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByPartyRole");
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
| **pageNumber** | **Integer**| Page number. - minimum: 1  | |
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above. | [optional] |

### Return type

[**CaseCountAnalyticsByPartyRoleResponse**](CaseCountAnalyticsByPartyRoleResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseCountAnalyticsByPartyRoleGroup"></a>
# **getCaseCountAnalyticsByPartyRoleGroup**
> CaseCountAnalyticsByPartyRoleGroupResponse getCaseCountAnalyticsByPartyRoleGroup(pageNumber).q(q).execute();

Case Count Analytics by Party Role Group.

Returns Case Analytics by Party Type Group. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **normPartyId** | Multiple Ids Allowed  |Find Analytics for a particular Party Object. | **normPartyId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **caseFiledDate** | Single Allowed  |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get case count grouped by Party Role Group of all cases with case type id CTYPATMYyaJekdgj2c and filed between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseAnalyticsApiApi;
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
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      CaseCountAnalyticsByPartyRoleGroupResponse result = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByPartyRoleGroup(pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getResults());
      System.out.println(result.getTotalCaseCount());
      System.out.println(result.getTotalPages());
      System.out.println(result.getTotalPartyRoleGroupCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByPartyRoleGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseCountAnalyticsByPartyRoleGroupResponse> response = client
              .caseAnalyticsApi
              .getCaseCountAnalyticsByPartyRoleGroup(pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountAnalyticsByPartyRoleGroup");
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
| **pageNumber** | **Integer**| Page number. - minimum: 1  | |
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above. | [optional] |

### Return type

[**CaseCountAnalyticsByPartyRoleGroupResponse**](CaseCountAnalyticsByPartyRoleGroupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseCountByAreaOfLaw"></a>
# **getCaseCountByAreaOfLaw**
> CaseCountAnalyticsByAreaOfLawResponse getCaseCountByAreaOfLaw(pageNumber).q(q).execute();

Case Count Analytics by Area Of Law.

Get Case Count Analytics by Area Of Law. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **normAttorneyId** | Multiple Ids Allowed  |Find Analytics for a particular norm Attorney Object. | **normAttorneyId:\&quot;NATYfwmXwRHS279WPY\&quot;** | | **normPartyId** | Multiple Ids Allowed |Find Analytics for a particular Party Object. | **normPartyId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normLawFirmId** | Multiple Ids Allowed |Find Analytics for a particular Norm LawFirm Object. | **normLawFirmId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normJudgeId** | Multiple Ids Allowed |Find Analytics for a particular Judge Object. | **normJudgeId:\&quot;NJUDT7jCZyFNeLGpRq\&quot;** | | **caseFiledDate** | Single Allowed  |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get case count grouped by Area Of Law of all cases with case type id CTYPATMYyaJekdgj2c and filed between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseAnalyticsApiApi;
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
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      CaseCountAnalyticsByAreaOfLawResponse result = client
              .caseAnalyticsApi
              .getCaseCountByAreaOfLaw(pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getResults());
      System.out.println(result.getTotalAreaOfLawCount());
      System.out.println(result.getTotalCaseCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountByAreaOfLaw");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseCountAnalyticsByAreaOfLawResponse> response = client
              .caseAnalyticsApi
              .getCaseCountByAreaOfLaw(pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountByAreaOfLaw");
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
| **pageNumber** | **Integer**| Page number. - minimum: 1  | |
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above. | [optional] |

### Return type

[**CaseCountAnalyticsByAreaOfLawResponse**](CaseCountAnalyticsByAreaOfLawResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseCountByCaseType"></a>
# **getCaseCountByCaseType**
> CaseCountAnalyticsByCaseTypeResponse getCaseCountByCaseType(pageNumber).q(q).execute();

Case Count Analytics by Case Type.

Get Case Count Analytics by Case Type. ## Terms and Connectors | Connector | Schema   | Description  | Example | | ------| ------| ------|------| | **AND** ||Find analytics containing all connected terms. The word AND does not have to be capitalized.|**courtId:\&quot;CORTV4vCEaKrhystBz\&quot; AND courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;**| | **IN()** || Allows you to specify multiple values, for a limit of up to 10.| **courtId IN (\&quot;CORTKQiA4LJuv54tEj\&quot;,\&quot;CORTV4vCEaKrhystBz\&quot;)**| | **courtId** | Multiple Ids Allowed |Find Analytics for a particular Court Object. | **courtId:\&quot;CORTV4vCEaKrhystBz\&quot;** | | **courtSystemId** | Multiple Ids Allowed |Find Analytics for a particular Court System Object. | **courtSystemId:\&quot;COSYACHBdMewtaG5DY\&quot;** | | **courtTypeId** | Multiple Ids Allowed |Find Analytics for a particular Court Type Object. | **courtTypeId:\&quot;COTPm8jjc2PAydpFhq\&quot;** | | **courtLocationId** | Multiple Ids Allowed |Find Analytics for a particular Court Location Object. | **courtLocationId:\&quot;COLO6b82CkRqS846hx\&quot;** | | **caseTypeId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Object. | **caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot;** | | **caseTypeGroupId** | Multiple Ids Allowed |Find Analytics for a particular Case Type Group Object. | **caseTypeGroupId:\&quot;CTYG8gZ6hPRKhhYi4Y\&quot;** | | **areaOfLawId** | Multiple Ids Allowed |Find Analytics for a particular Area Of Law Object. | **areaOfLawId:\&quot;AOFL2UxEWfVmTPMyqf\&quot;** | | **caseClassId** | Multiple Ids Allowed |Find Analytics for a particular Case Class Category Object. | **caseClassId:\&quot;CSCLNjbKTN7Yfo2wdb\&quot;** | | **partyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Object. | **partyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **partyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Party Type Group Object. | **partyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **attorneyPartyRoleId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Object. | **attorneyPartyRoleId:\&quot;PTYRiP8nMgPxBsPc5i\&quot;** | | **attorneyPartyRoleGroupId** | Multiple Ids Allowed |Find Analytics for a particular Attorney Party Type Group Object. | **attorneyPartyRoleGroupId:\&quot;PTYGBnjxbx6tKNfVEP\&quot;** | | **normAttorneyId** | Multiple Ids Allowed  |Find Analytics for a particular norm Attorney Object. | **normAttorneyId:\&quot;NATYfwmXwRHS279WPY\&quot;** | | **normPartyId** | Multiple Ids Allowed |Find Analytics for a particular Party Object. | **normPartyId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normLawFirmId** | Multiple Ids Allowed  |Find Analytics for a particular Norm LawFirm Object. | **normLawFirmId:\&quot;NORGrPmQyLdx9NGHcT\&quot;** | | **normJudgeId** | Multiple Ids Allowed |Find Analytics for a particular Judge Object. | **normJudgeId:\&quot;NJUDT7jCZyFNeLGpRq\&quot;** | | **caseFiledDate** | Single Allowed |Find Analytics within a particular date range. | **caseFiledDate:[2018-05-08T00:00:00+00:00TO2019-05-08T00:00:00+00:00]** | | **JurisdictionGeo** | Multiple filters Allowed |Find Analytics within a particular Jurisdiction Geo. | **(JurisdictionGeo:(state:\&quot;California\&quot;))** | | **confidenceScore** | Single Allowed |Find Analytics for a given ConfidenceScore  | **confidenceScore:[0.5 TO \\*]** | | **bestMatch** | Single Allowed |True if the normEntity has the highest Confidence Score of all possible normEntities | **bestMatch:true** | &lt;br&gt; ## Example Query Query to get case count grouped by case types  of all cases with case type id CTYPATMYyaJekdgj2c and filed between Jan 1st, 2017 to Nov 30th,2021&lt;br&gt; q&#x3D;caseTypeId:\&quot;CTYPATMYyaJekdgj2c\&quot; AND caseFiledDate:[2017-01-01T00:00:00+00:00TO2021-11-30T00:00:00+00:00] 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseAnalyticsApiApi;
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
    Integer pageNumber = 1; // Page number. - minimum: 1 
    String q = ""; // The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above.
    try {
      CaseCountAnalyticsByCaseTypeResponse result = client
              .caseAnalyticsApi
              .getCaseCountByCaseType(pageNumber)
              .q(q)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getResults());
      System.out.println(result.getTotalCaseCount());
      System.out.println(result.getTotalCaseTypeCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountByCaseType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseCountAnalyticsByCaseTypeResponse> response = client
              .caseAnalyticsApi
              .getCaseCountByCaseType(pageNumber)
              .q(q)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseAnalyticsApiApi#getCaseCountByCaseType");
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
| **pageNumber** | **Integer**| Page number. - minimum: 1  | |
| **q** | **String**| The URL encoded query you are searching for. The query can be as simple as a keyword, but supports many additional options and filters. All options are documented above. | [optional] |

### Return type

[**CaseCountAnalyticsByCaseTypeResponse**](CaseCountAnalyticsByCaseTypeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

