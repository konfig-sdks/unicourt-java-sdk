# CourtStandardsApiApi

All URIs are relative to *https://enterpriseapi.unicourt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**associatedCourtForJurisdictionGeo**](CourtStandardsApiApi.md#associatedCourtForJurisdictionGeo) | **GET** /masterData/jurisdictionGeo/{jurisdictionGeoId}/courts | Associated Court for given Jurisdiction Geo. |
| [**getAdditionalChargeInfo**](CourtStandardsApiApi.md#getAdditionalChargeInfo) | **GET** /masterData/chargeAdditionalData | Charge Additional Data Object. |
| [**getAppealCourtsForCourt**](CourtStandardsApiApi.md#getAppealCourtsForCourt) | **GET** /masterData/court/{courtId}/appealCourts | Appeal Court Objects for given courtId. |
| [**getAreaOfLaw**](CourtStandardsApiApi.md#getAreaOfLaw) | **GET** /masterData/areaOfLaw/{areaOfLawId} | AreaOfLaw Object for the given AreaOfLaw Id. |
| [**getAttorneyRepType**](CourtStandardsApiApi.md#getAttorneyRepType) | **GET** /masterData/attorneyRepresentationType | Attorney Representation Type Object. |
| [**getAttorneyRepType_0**](CourtStandardsApiApi.md#getAttorneyRepType_0) | **GET** /masterData/attorneyRepresentationType/{attorneyRepresentationTypeId} | Attorney Representation Type Object for the given attorneyRepresentationTypeId. |
| [**getAttorneyTypeObject**](CourtStandardsApiApi.md#getAttorneyTypeObject) | **GET** /masterData/attorneyType/{attorneyTypeId} | Attorney Type Object for given Attorney Type Id. |
| [**getAttorneyTypeUsingKeywordExpression**](CourtStandardsApiApi.md#getAttorneyTypeUsingKeywordExpression) | **GET** /masterData/attorneyType | Attorney Type Object. |
| [**getCaseClassById**](CourtStandardsApiApi.md#getCaseClassById) | **GET** /masterData/caseClass/{caseClassId} | Case Class Object for the given Case Class Id. |
| [**getCaseClassByKeyword**](CourtStandardsApiApi.md#getCaseClassByKeyword) | **GET** /masterData/caseClass | Case Class Object. |
| [**getCaseRelationshipTypeById**](CourtStandardsApiApi.md#getCaseRelationshipTypeById) | **GET** /masterData/caseRelationshipType/{caseRelationshipTypeId} | Case Relationship Type Object for the given caseRelationshipTypeId. |
| [**getCaseRelationshipTypes**](CourtStandardsApiApi.md#getCaseRelationshipTypes) | **GET** /masterData/caseRelationshipType | Case Relationship Type Object. |
| [**getCaseStatusById**](CourtStandardsApiApi.md#getCaseStatusById) | **GET** /masterData/caseStatus/{caseStatusId} | Returns the caseStatus information for the given caseStatusId. |
| [**getCaseStatusByKeyword**](CourtStandardsApiApi.md#getCaseStatusByKeyword) | **GET** /masterData/caseStatus | Case Status Object. |
| [**getCaseStatusGroup**](CourtStandardsApiApi.md#getCaseStatusGroup) | **GET** /masterData/caseStatusGroup/{caseStatusGroupId} | Returns the caseStatusGroup information for the given caseStatusGroupId. |
| [**getCaseStatusGroupUsingKeywordExpression**](CourtStandardsApiApi.md#getCaseStatusGroupUsingKeywordExpression) | **GET** /masterData/caseStatusGroup | Case Status Group Object. |
| [**getCaseType**](CourtStandardsApiApi.md#getCaseType) | **GET** /masterData/caseType/{caseTypeId} | CaseType Object for given Case Type Id. |
| [**getCaseTypeGroup**](CourtStandardsApiApi.md#getCaseTypeGroup) | **GET** /masterData/caseTypeGroup/{caseTypeGroupId} | CaseType Group for the given CaseType Group Id. |
| [**getCaseTypesByKeyword**](CourtStandardsApiApi.md#getCaseTypesByKeyword) | **GET** /masterData/caseType | Case Type Object. |
| [**getCauseOfAction**](CourtStandardsApiApi.md#getCauseOfAction) | **GET** /masterData/causeOfAction/{causeOfActionId} | CauseOfAction Object for the given causeOfActionId. |
| [**getCauseOfActionAdditionalData**](CourtStandardsApiApi.md#getCauseOfActionAdditionalData) | **GET** /masterData/causeOfActionAdditionalData | CauseOfActionAdditionaData Object. |
| [**getCauseOfActionAdditionalData_0**](CourtStandardsApiApi.md#getCauseOfActionAdditionalData_0) | **GET** /masterData/causeOfActionAdditionalData/{causeOfActionAdditionalDataId} | CauseOfActionAdditionalData Object for the given causeOfActionAdditionalDataId. |
| [**getCauseOfActionByKeyword**](CourtStandardsApiApi.md#getCauseOfActionByKeyword) | **GET** /masterData/causeOfAction | CauseOfAction Object. |
| [**getCauseOfActionGroup**](CourtStandardsApiApi.md#getCauseOfActionGroup) | **GET** /masterData/causeOfActionGroup | CauseOfActionGroup Object. |
| [**getCauseOfActionGroup_0**](CourtStandardsApiApi.md#getCauseOfActionGroup_0) | **GET** /masterData/causeOfActionGroup/{causeOfActionGroupId} | CauseOfActionGroup Object for the given causeOfActionGroupId. |
| [**getChargeAdditionalData**](CourtStandardsApiApi.md#getChargeAdditionalData) | **GET** /masterData/chargeAdditionalData/{chargeAdditionalDataId} | Charge Additional Data Object for the given chargeAdditionalDataId. |
| [**getChargeById**](CourtStandardsApiApi.md#getChargeById) | **GET** /masterData/charge/{chargeId} | Charge Object for the given chargeId. |
| [**getChargeDegreeById**](CourtStandardsApiApi.md#getChargeDegreeById) | **GET** /masterData/chargeDegree/{chargeDegreeId} | ChargeDegree Object for the given chargeDegreeId. |
| [**getChargeDegreeUsingKeywordExpression**](CourtStandardsApiApi.md#getChargeDegreeUsingKeywordExpression) | **GET** /masterData/chargeDegree | ChargeDegree Object. |
| [**getChargeGroup**](CourtStandardsApiApi.md#getChargeGroup) | **GET** /masterData/chargeGroup/{chargeGroupId} | Charge Group Object for the given chargeGroupId. |
| [**getChargeGroupsByKeyword**](CourtStandardsApiApi.md#getChargeGroupsByKeyword) | **GET** /masterData/chargeGroup | Charge Group Object. |
| [**getChargeSeverity**](CourtStandardsApiApi.md#getChargeSeverity) | **GET** /masterData/chargeSeverity/{chargeSeverityId} | ChargeSeverity Object for the given chargeSeverityId. |
| [**getChargeSeverityByKeyword**](CourtStandardsApiApi.md#getChargeSeverityByKeyword) | **GET** /masterData/chargeSeverity | ChargeSeverity Object. |
| [**getChargesUsingKeyword**](CourtStandardsApiApi.md#getChargesUsingKeyword) | **GET** /masterData/charge | Charge Object. |
| [**getCourtLocation**](CourtStandardsApiApi.md#getCourtLocation) | **GET** /masterData/courtLocation | Courthouse Object. |
| [**getCourtLocationObject**](CourtStandardsApiApi.md#getCourtLocationObject) | **GET** /masterData/courtLocation/{courtLocationId} | Courthouse Object for given Court Location Id. |
| [**getCourtLocations**](CourtStandardsApiApi.md#getCourtLocations) | **GET** /masterData/court/{courtId}/courtLocations | Associated Court Location for given courtId. |
| [**getCourtObject**](CourtStandardsApiApi.md#getCourtObject) | **GET** /masterData/court/{courtId} | Court Object for given courtId. |
| [**getCourtServiceStatus**](CourtStandardsApiApi.md#getCourtServiceStatus) | **GET** /masterData/courtServiceStatus | Court Service Status Object. |
| [**getCourtServiceStatusById**](CourtStandardsApiApi.md#getCourtServiceStatusById) | **GET** /masterData/courtServiceStatus/{courtServiceStatusId} | Court Service Status Object for the given courtServiceStatusId. |
| [**getCourtSystem**](CourtStandardsApiApi.md#getCourtSystem) | **GET** /masterData/courtSystem/{courtSystemId} | Court System Object for given courtSystemId. |
| [**getCourtTypeObject**](CourtStandardsApiApi.md#getCourtTypeObject) | **GET** /masterData/courtType/{courtTypeId} | Court Type Object for given courtTypeId. |
| [**getCourtTypes**](CourtStandardsApiApi.md#getCourtTypes) | **GET** /masterData/courtType | Court Type Objects. |
| [**getCourts**](CourtStandardsApiApi.md#getCourts) | **GET** /masterData/court | Court Objects. |
| [**getCourtsByLocation**](CourtStandardsApiApi.md#getCourtsByLocation) | **GET** /masterData/courtLocation/{courtLocationId}/courts | Associated Court for given Court Location. |
| [**getJudgeTypeObject**](CourtStandardsApiApi.md#getJudgeTypeObject) | **GET** /masterData/judgeType | Judge Type Object. |
| [**getJudgeTypeObjectById**](CourtStandardsApiApi.md#getJudgeTypeObjectById) | **GET** /masterData/judgeType/{judgeTypeId} | Judge Type Object for the given judgeTypeId. |
| [**getJurisdictionGeo**](CourtStandardsApiApi.md#getJurisdictionGeo) | **GET** /masterData/jurisdictionGeo/{jurisdictionGeoId} | Jurisdiction Geo Object for given Jurisdiction Geo Id. |
| [**getJurisdictionGeoForCourt**](CourtStandardsApiApi.md#getJurisdictionGeoForCourt) | **GET** /masterData/jurisdictionGeo | Jurisdiction Geo Object. |
| [**getJurisdictionGeoObjectsForCourt**](CourtStandardsApiApi.md#getJurisdictionGeoObjectsForCourt) | **GET** /masterData/court/{courtId}/jurisdictionGeo | Jurisdiction Geo Objects for given courtId. |
| [**getPartyRole**](CourtStandardsApiApi.md#getPartyRole) | **GET** /masterData/partyRole/{partyRoleId} | Party Role Object. |
| [**getPartyRoleGroup**](CourtStandardsApiApi.md#getPartyRoleGroup) | **GET** /masterData/partyRoleGroup/{partyRoleGroupId} | Party Role Group Object. |
| [**getPartyRoleGroups**](CourtStandardsApiApi.md#getPartyRoleGroups) | **GET** /masterData/partyRoleGroup | Party Role Group Object. |
| [**getPartyRolesByKeyword**](CourtStandardsApiApi.md#getPartyRolesByKeyword) | **GET** /masterData/partyRole | Party Role Object. |
| [**listAreaOfLaw**](CourtStandardsApiApi.md#listAreaOfLaw) | **GET** /masterData/areaOfLaw | AreaOfLaw Object. |
| [**listCaseTypeGroups**](CourtStandardsApiApi.md#listCaseTypeGroups) | **GET** /masterData/caseTypeGroup | CaseTypeGroup Object. |
| [**listCourtSystems**](CourtStandardsApiApi.md#listCourtSystems) | **GET** /masterData/courtSystem | Court System Objects. |


<a name="associatedCourtForJurisdictionGeo"></a>
# **associatedCourtForJurisdictionGeo**
> CourtResponse associatedCourtForJurisdictionGeo(jurisdictionGeoId).pageNumber(pageNumber).sort(sort).order(order).execute();

Associated Court for given Jurisdiction Geo.

Returns Associated Court for given Jurisdiction Geo. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String jurisdictionGeoId = "JUGO8s7HvM84dLvVMu"; // jurisdictionGeoId
    Integer pageNumber = 1; // Page number. - minimum: 1 - maximum: 100 
    String sort = "name"; // Sort field.
    String order = "asc"; // Sort order.
    try {
      CourtResponse result = client
              .courtStandardsApi
              .associatedCourtForJurisdictionGeo(jurisdictionGeoId)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getCourtArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#associatedCourtForJurisdictionGeo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CourtResponse> response = client
              .courtStandardsApi
              .associatedCourtForJurisdictionGeo(jurisdictionGeoId)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#associatedCourtForJurisdictionGeo");
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
| **jurisdictionGeoId** | **String**| jurisdictionGeoId | |
| **pageNumber** | **Integer**| Page number. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| Sort field. | [optional] [default to name] [enum: name] |
| **order** | **String**| Sort order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**CourtResponse**](CourtResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAdditionalChargeInfo"></a>
# **getAdditionalChargeInfo**
> ChargeAdditionalDataResponse getAdditionalChargeInfo().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

Charge Additional Data Object.

Retrieve additional information on a charge using a keyword expression. Keyword expressions should be constructed according to the rules given above.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; ChargeAdditionalDataQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "chargeAdditionalDataId:\"CHADoLU7sWaGjWtkBx\""; // The keyword expression targeting the desired charge additional data.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      ChargeAdditionalDataResponse result = client
              .courtStandardsApi
              .getAdditionalChargeInfo()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getChargeAdditionalDataArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getAdditionalChargeInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChargeAdditionalDataResponse> response = client
              .courtStandardsApi
              .getAdditionalChargeInfo()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getAdditionalChargeInfo");
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
| **q** | **String**| The keyword expression targeting the desired charge additional data.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**ChargeAdditionalDataResponse**](ChargeAdditionalDataResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAppealCourtsForCourt"></a>
# **getAppealCourtsForCourt**
> CourtResponse getAppealCourtsForCourt(courtId).pageNumber(pageNumber).sort(sort).order(order).execute();

Appeal Court Objects for given courtId.

Retrieve the appeals courts associated with the specified court. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String courtId = "CORThSxcef8eGUSkuC"; // The courtId value of the target court.
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      CourtResponse result = client
              .courtStandardsApi
              .getAppealCourtsForCourt(courtId)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getCourtArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getAppealCourtsForCourt");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CourtResponse> response = client
              .courtStandardsApi
              .getAppealCourtsForCourt(courtId)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getAppealCourtsForCourt");
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
| **courtId** | **String**| The courtId value of the target court. | |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**CourtResponse**](CourtResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAreaOfLaw"></a>
# **getAreaOfLaw**
> AreaOfLaw getAreaOfLaw(areaOfLawId).execute();

AreaOfLaw Object for the given AreaOfLaw Id.

Retrieve the specified area of law. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String areaOfLawId = "AOFLGAd9Ah5qkTRNw9"; // The areaOfLawId value of the desired area of law.
    try {
      AreaOfLaw result = client
              .courtStandardsApi
              .getAreaOfLaw(areaOfLawId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAreaOfLawId());
      System.out.println(result.getCaseClass());
      System.out.println(result.getCaseClassId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getName());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getAreaOfLaw");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AreaOfLaw> response = client
              .courtStandardsApi
              .getAreaOfLaw(areaOfLawId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getAreaOfLaw");
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
| **areaOfLawId** | **String**| The areaOfLawId value of the desired area of law. | |

### Return type

[**AreaOfLaw**](AreaOfLaw.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAttorneyRepType"></a>
# **getAttorneyRepType**
> AttorneyRepresentationTypeResponse getAttorneyRepType().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

Attorney Representation Type Object.

Retrieve an attorney representation type using a keyword expression. Keyword expressions should be constructed according to the rules given above. ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below Schema section. Schema --&gt; AttorneyRepresentationTypeQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "attorneyRepresentationTypeId: \"ATRPYgPMGJufoCsR6Q\""; // The keyword expression targeting the attorney representation type.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      AttorneyRepresentationTypeResponse result = client
              .courtStandardsApi
              .getAttorneyRepType()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getAttorneyRepresentationTypeArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getAttorneyRepType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AttorneyRepresentationTypeResponse> response = client
              .courtStandardsApi
              .getAttorneyRepType()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getAttorneyRepType");
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
| **q** | **String**| The keyword expression targeting the attorney representation type.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**AttorneyRepresentationTypeResponse**](AttorneyRepresentationTypeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAttorneyRepType_0"></a>
# **getAttorneyRepType_0**
> AttorneyRepresentationType getAttorneyRepType_0(attorneyRepresentationTypeId).execute();

Attorney Representation Type Object for the given attorneyRepresentationTypeId.

Retrieve the specified attorney representation type. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String attorneyRepresentationTypeId = "ATRPYgPMGJufoCsR6Q"; // The attorneyRepresentationTypeId value of the desired attorney representation type.
    try {
      AttorneyRepresentationType result = client
              .courtStandardsApi
              .getAttorneyRepType_0(attorneyRepresentationTypeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAttorneyRepresentationTypeId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getName());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getAttorneyRepType_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AttorneyRepresentationType> response = client
              .courtStandardsApi
              .getAttorneyRepType_0(attorneyRepresentationTypeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getAttorneyRepType_0");
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
| **attorneyRepresentationTypeId** | **String**| The attorneyRepresentationTypeId value of the desired attorney representation type. | |

### Return type

[**AttorneyRepresentationType**](AttorneyRepresentationType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAttorneyTypeObject"></a>
# **getAttorneyTypeObject**
> AttorneyType getAttorneyTypeObject(attorneyTypeId).execute();

Attorney Type Object for given Attorney Type Id.

Retrieve a specified attorney type object. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String attorneyTypeId = "ATYPWXtARwvzu5HLcf"; // The attorneyTypeId value of the desired attorney type.
    try {
      AttorneyType result = client
              .courtStandardsApi
              .getAttorneyTypeObject(attorneyTypeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAttorneyTypeId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getName());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getAttorneyTypeObject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AttorneyType> response = client
              .courtStandardsApi
              .getAttorneyTypeObject(attorneyTypeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getAttorneyTypeObject");
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
| **attorneyTypeId** | **String**| The attorneyTypeId value of the desired attorney type. | |

### Return type

[**AttorneyType**](AttorneyType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getAttorneyTypeUsingKeywordExpression"></a>
# **getAttorneyTypeUsingKeywordExpression**
> AttorneyTypeResponse getAttorneyTypeUsingKeywordExpression().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

Attorney Type Object.

Retrieve an attorney type using a keyword expression. Keyword expressions should be constructed according to the rules given above.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below Schema section. Schema --&gt; AttorneyTypeQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "attorneyTypeId:\"ATYPWXtARwvzu5HLcf\""; // The keyword expression targeting the attorney type.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      AttorneyTypeResponse result = client
              .courtStandardsApi
              .getAttorneyTypeUsingKeywordExpression()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getAttorneyTypeArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getAttorneyTypeUsingKeywordExpression");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AttorneyTypeResponse> response = client
              .courtStandardsApi
              .getAttorneyTypeUsingKeywordExpression()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getAttorneyTypeUsingKeywordExpression");
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
| **q** | **String**| The keyword expression targeting the attorney type.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**AttorneyTypeResponse**](AttorneyTypeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCaseClassById"></a>
# **getCaseClassById**
> CaseClass getCaseClassById(caseClassId).execute();

Case Class Object for the given Case Class Id.

Retrieve the specified case class. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String caseClassId = "CSCLNjbKTN7Yfo2wdb"; // The caseClassId value of the desired case class.
    try {
      CaseClass result = client
              .courtStandardsApi
              .getCaseClassById(caseClassId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseClassId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getName());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseClassById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseClass> response = client
              .courtStandardsApi
              .getCaseClassById(caseClassId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseClassById");
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
| **caseClassId** | **String**| The caseClassId value of the desired case class. | |

### Return type

[**CaseClass**](CaseClass.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCaseClassByKeyword"></a>
# **getCaseClassByKeyword**
> CaseClassResponse getCaseClassByKeyword().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

Case Class Object.

Retrieve one or more case classes using a keyword expression. Keyword expressions should be constructed according to the rules given above.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; CaseClassQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "caseClassId:\"CSCLNjbKTN7Yfo2wdb\""; // The keyword expression targeting the desired case class.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      CaseClassResponse result = client
              .courtStandardsApi
              .getCaseClassByKeyword()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseClassArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseClassByKeyword");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseClassResponse> response = client
              .courtStandardsApi
              .getCaseClassByKeyword()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseClassByKeyword");
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
| **q** | **String**| The keyword expression targeting the desired case class.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**CaseClassResponse**](CaseClassResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCaseRelationshipTypeById"></a>
# **getCaseRelationshipTypeById**
> CaseRelationshipType getCaseRelationshipTypeById(caseRelationshipTypeId).execute();

Case Relationship Type Object for the given caseRelationshipTypeId.

Retrieve the specified case relationship type. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String caseRelationshipTypeId = "CRTPgkmnzpiBXstT3s"; // The caseRelationshipTypeId value of the desired case relationship type.
    try {
      CaseRelationshipType result = client
              .courtStandardsApi
              .getCaseRelationshipTypeById(caseRelationshipTypeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseRelationshipTypeId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getName());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseRelationshipTypeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseRelationshipType> response = client
              .courtStandardsApi
              .getCaseRelationshipTypeById(caseRelationshipTypeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseRelationshipTypeById");
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
| **caseRelationshipTypeId** | **String**| The caseRelationshipTypeId value of the desired case relationship type. | |

### Return type

[**CaseRelationshipType**](CaseRelationshipType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCaseRelationshipTypes"></a>
# **getCaseRelationshipTypes**
> CaseRelationshipTypeResponse getCaseRelationshipTypes().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

Case Relationship Type Object.

Retrieve an case relationship type using a keyword expression. Keyword expressions should be constructed according to the rules given above.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; CaseRelationshipTypeQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "caseRelationshipTypeId: \"CRTPgkmnzpiBXstT3s\""; // The keyword expression targeting the case relationship type.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      CaseRelationshipTypeResponse result = client
              .courtStandardsApi
              .getCaseRelationshipTypes()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseRelationshipTypeArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseRelationshipTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseRelationshipTypeResponse> response = client
              .courtStandardsApi
              .getCaseRelationshipTypes()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseRelationshipTypes");
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
| **q** | **String**| The keyword expression targeting the case relationship type.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**CaseRelationshipTypeResponse**](CaseRelationshipTypeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCaseStatusById"></a>
# **getCaseStatusById**
> CaseStatus getCaseStatusById(caseStatusId).execute();

Returns the caseStatus information for the given caseStatusId.

Retrieve the specified case status. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String caseStatusId = "CSSTBtqf3R2LYFt4j4"; // The caseStatusId value of the desired case status.
    try {
      CaseStatus result = client
              .courtStandardsApi
              .getCaseStatusById(caseStatusId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseClassArray());
      System.out.println(result.getCaseStatusGroup());
      System.out.println(result.getCaseStatusGroupId());
      System.out.println(result.getCaseStatusId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getName());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseStatusById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseStatus> response = client
              .courtStandardsApi
              .getCaseStatusById(caseStatusId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseStatusById");
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
| **caseStatusId** | **String**| The caseStatusId value of the desired case status. | |

### Return type

[**CaseStatus**](CaseStatus.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCaseStatusByKeyword"></a>
# **getCaseStatusByKeyword**
> CaseStatusResponse getCaseStatusByKeyword().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

Case Status Object.

Retrieve a case status using a keyword expression. Keyword expressions should be constructed according to the rules given above.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below Schema section. Schema --&gt; CaseStatusQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "caseStatusId: \"CSSTBtqf3R2LYFt4j4\""; // The keyword expression targeting the desired case status.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      CaseStatusResponse result = client
              .courtStandardsApi
              .getCaseStatusByKeyword()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseStatusArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseStatusByKeyword");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseStatusResponse> response = client
              .courtStandardsApi
              .getCaseStatusByKeyword()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseStatusByKeyword");
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
| **q** | **String**| The keyword expression targeting the desired case status.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**CaseStatusResponse**](CaseStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCaseStatusGroup"></a>
# **getCaseStatusGroup**
> CaseStatusGroup getCaseStatusGroup(caseStatusGroupId).execute();

Returns the caseStatusGroup information for the given caseStatusGroupId.

Retrieve the specified case status group. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String caseStatusGroupId = "CSSG6ERqyFdydo52WK"; // The caseStatusGroupId value of the desired case status group.
    try {
      CaseStatusGroup result = client
              .courtStandardsApi
              .getCaseStatusGroup(caseStatusGroupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseStatusGroupId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getName());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseStatusGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseStatusGroup> response = client
              .courtStandardsApi
              .getCaseStatusGroup(caseStatusGroupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseStatusGroup");
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
| **caseStatusGroupId** | **String**| The caseStatusGroupId value of the desired case status group. | |

### Return type

[**CaseStatusGroup**](CaseStatusGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCaseStatusGroupUsingKeywordExpression"></a>
# **getCaseStatusGroupUsingKeywordExpression**
> CaseStatusGroupResponse getCaseStatusGroupUsingKeywordExpression().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

Case Status Group Object.

Retrieve a case status group using a keyword expression. Keyword expressions should be constructed according to the rules given above.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; CaseStatusGroupQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "caseStatusGroupId:\"CSSG6ERqyFdydo52WK\""; // The keyword expression targeting the desired case status group.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      CaseStatusGroupResponse result = client
              .courtStandardsApi
              .getCaseStatusGroupUsingKeywordExpression()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseStatusGroupArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseStatusGroupUsingKeywordExpression");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseStatusGroupResponse> response = client
              .courtStandardsApi
              .getCaseStatusGroupUsingKeywordExpression()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseStatusGroupUsingKeywordExpression");
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
| **q** | **String**| The keyword expression targeting the desired case status group.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**CaseStatusGroupResponse**](CaseStatusGroupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCaseType"></a>
# **getCaseType**
> CaseType getCaseType(caseTypeId).execute();

CaseType Object for given Case Type Id.

Retrieve the specified case type. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String caseTypeId = "CTYPoLU7sWaGjWtkBx"; // The caseTypeId value of the desired case type.
    try {
      CaseType result = client
              .courtStandardsApi
              .getCaseType(caseTypeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAreaOfLaw());
      System.out.println(result.getAreaOfLawId());
      System.out.println(result.getCaseClass());
      System.out.println(result.getCaseClassId());
      System.out.println(result.getCaseTypeGroup());
      System.out.println(result.getCaseTypeGroupId());
      System.out.println(result.getCaseTypeId());
      System.out.println(result.getCaseTypeTag());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getName());
      System.out.println(result.getObject());
      System.out.println(result.getSaliCode());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseType");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseType> response = client
              .courtStandardsApi
              .getCaseType(caseTypeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseType");
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
| **caseTypeId** | **String**| The caseTypeId value of the desired case type. | |

### Return type

[**CaseType**](CaseType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCaseTypeGroup"></a>
# **getCaseTypeGroup**
> CaseTypeGroup getCaseTypeGroup(caseTypeGroupId).execute();

CaseType Group for the given CaseType Group Id.

Retrieve the specified case type group. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String caseTypeGroupId = "CTYGSpWaVityBQndsv"; // caseTypeGroupId
    try {
      CaseTypeGroup result = client
              .courtStandardsApi
              .getCaseTypeGroup(caseTypeGroupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAreaOfLaw());
      System.out.println(result.getAreaOfLawId());
      System.out.println(result.getCaseClass());
      System.out.println(result.getCaseClassId());
      System.out.println(result.getCaseTypeGroupId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getName());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseTypeGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseTypeGroup> response = client
              .courtStandardsApi
              .getCaseTypeGroup(caseTypeGroupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseTypeGroup");
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
| **caseTypeGroupId** | **String**| caseTypeGroupId | |

### Return type

[**CaseTypeGroup**](CaseTypeGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCaseTypesByKeyword"></a>
# **getCaseTypesByKeyword**
> CaseTypeResponse getCaseTypesByKeyword().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

Case Type Object.

Retrieve one or more case types using a keyword expression. Keyword expressions should be constructed according to the rules given above.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; CaseTypeQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "caseTypeId: \"CTYPoLU7sWaGjWtkBx\""; // Retrieve one or more case types using a keyword expression. Keyword expressions should be constructed according to the rules given above.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      CaseTypeResponse result = client
              .courtStandardsApi
              .getCaseTypesByKeyword()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseTypeArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseTypesByKeyword");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseTypeResponse> response = client
              .courtStandardsApi
              .getCaseTypesByKeyword()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCaseTypesByKeyword");
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
| **q** | **String**| Retrieve one or more case types using a keyword expression. Keyword expressions should be constructed according to the rules given above.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**CaseTypeResponse**](CaseTypeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCauseOfAction"></a>
# **getCauseOfAction**
> CauseOfAction getCauseOfAction(causeOfActionId).execute();

CauseOfAction Object for the given causeOfActionId.

Retrieve the specified cause of action. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String causeOfActionId = "CATNoLU7sWaGjWtkBx"; // The causeOfActionId value of the desired cause of action.
    try {
      CauseOfAction result = client
              .courtStandardsApi
              .getCauseOfAction(causeOfActionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCauseOfActionGroup());
      System.out.println(result.getCauseOfActionGroupId());
      System.out.println(result.getCauseOfActionId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getName());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCauseOfAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CauseOfAction> response = client
              .courtStandardsApi
              .getCauseOfAction(causeOfActionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCauseOfAction");
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
| **causeOfActionId** | **String**| The causeOfActionId value of the desired cause of action. | |

### Return type

[**CauseOfAction**](CauseOfAction.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCauseOfActionAdditionalData"></a>
# **getCauseOfActionAdditionalData**
> CauseOfActionAdditionalDataResponse getCauseOfActionAdditionalData().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

CauseOfActionAdditionaData Object.

Retrieve a cause of action additional data using a keyword expression. Keyword expressions should be constructed according to the rules given above.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; CauseOfActionAdditionalDataQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "causeOfActionAdditionalDataId:\"CAADiHoKn66p3bkcNs\""; // The keyword expression targeting the desired cause of action additional data.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      CauseOfActionAdditionalDataResponse result = client
              .courtStandardsApi
              .getCauseOfActionAdditionalData()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getCauseOfActionAdditionalDataArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCauseOfActionAdditionalData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CauseOfActionAdditionalDataResponse> response = client
              .courtStandardsApi
              .getCauseOfActionAdditionalData()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCauseOfActionAdditionalData");
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
| **q** | **String**| The keyword expression targeting the desired cause of action additional data.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**CauseOfActionAdditionalDataResponse**](CauseOfActionAdditionalDataResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCauseOfActionAdditionalData_0"></a>
# **getCauseOfActionAdditionalData_0**
> CauseOfActionAdditionalData getCauseOfActionAdditionalData_0(causeOfActionAdditionalDataId).execute();

CauseOfActionAdditionalData Object for the given causeOfActionAdditionalDataId.

Retrieve the specified cause of action additional data. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String causeOfActionAdditionalDataId = "CAADoLU7sWaGjWtkBx"; // The causeOfActionAdditionalDataId value of the desired cause of action additional data.
    try {
      CauseOfActionAdditionalData result = client
              .courtStandardsApi
              .getCauseOfActionAdditionalData_0(causeOfActionAdditionalDataId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCauseOfActionAdditionalDataId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getObject());
      System.out.println(result.getType());
      System.out.println(result.getValue());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCauseOfActionAdditionalData_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CauseOfActionAdditionalData> response = client
              .courtStandardsApi
              .getCauseOfActionAdditionalData_0(causeOfActionAdditionalDataId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCauseOfActionAdditionalData_0");
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
| **causeOfActionAdditionalDataId** | **String**| The causeOfActionAdditionalDataId value of the desired cause of action additional data. | |

### Return type

[**CauseOfActionAdditionalData**](CauseOfActionAdditionalData.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCauseOfActionByKeyword"></a>
# **getCauseOfActionByKeyword**
> CauseOfActionResponse getCauseOfActionByKeyword().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

CauseOfAction Object.

Retrieve a cause of action using a keyword expression. Keyword expressions should be constructed according to the rules given above.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; CauseOfActionQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "causeOfActionId:\"CATNiHoKn66p3bkcNs\""; // The keyword expression targeting the desired cause of action.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      CauseOfActionResponse result = client
              .courtStandardsApi
              .getCauseOfActionByKeyword()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getCauseOfActionArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCauseOfActionByKeyword");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CauseOfActionResponse> response = client
              .courtStandardsApi
              .getCauseOfActionByKeyword()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCauseOfActionByKeyword");
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
| **q** | **String**| The keyword expression targeting the desired cause of action.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**CauseOfActionResponse**](CauseOfActionResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCauseOfActionGroup"></a>
# **getCauseOfActionGroup**
> CauseOfActionGroupResponse getCauseOfActionGroup().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

CauseOfActionGroup Object.

Retrieve a cause of action group using a keyword expression. Keyword expressions should be constructed according to the rules given above.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; CauseOfActionGroupQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "causeOfActionGroupId:\"CAGPiHoKn66p3bkcNs\""; // The keyword expression targeting the desired cause of action group.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      CauseOfActionGroupResponse result = client
              .courtStandardsApi
              .getCauseOfActionGroup()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getCauseOfActionGroupArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCauseOfActionGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CauseOfActionGroupResponse> response = client
              .courtStandardsApi
              .getCauseOfActionGroup()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCauseOfActionGroup");
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
| **q** | **String**| The keyword expression targeting the desired cause of action group.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**CauseOfActionGroupResponse**](CauseOfActionGroupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCauseOfActionGroup_0"></a>
# **getCauseOfActionGroup_0**
> CauseOfActionGroup getCauseOfActionGroup_0(causeOfActionGroupId).execute();

CauseOfActionGroup Object for the given causeOfActionGroupId.

Retrieve the specified cause of action group. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String causeOfActionGroupId = "CAGPoLU7sWaGjWtkBx"; // causeOfActionGroupId
    try {
      CauseOfActionGroup result = client
              .courtStandardsApi
              .getCauseOfActionGroup_0(causeOfActionGroupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCauseOfActionGroupId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getName());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCauseOfActionGroup_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CauseOfActionGroup> response = client
              .courtStandardsApi
              .getCauseOfActionGroup_0(causeOfActionGroupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCauseOfActionGroup_0");
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
| **causeOfActionGroupId** | **String**| causeOfActionGroupId | |

### Return type

[**CauseOfActionGroup**](CauseOfActionGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getChargeAdditionalData"></a>
# **getChargeAdditionalData**
> ChargeAdditionalData getChargeAdditionalData(chargeAdditionalDataId).execute();

Charge Additional Data Object for the given chargeAdditionalDataId.

Retrieve the specified charge additional data. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String chargeAdditionalDataId = "CHADiHoKn66p3bkcNs"; // The chargeAdditionalDataId value of the desired charge additional data.
    try {
      ChargeAdditionalData result = client
              .courtStandardsApi
              .getChargeAdditionalData(chargeAdditionalDataId)
              .execute();
      System.out.println(result);
      System.out.println(result.getChargeAdditionalDataId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getObject());
      System.out.println(result.getType());
      System.out.println(result.getValue());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getChargeAdditionalData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChargeAdditionalData> response = client
              .courtStandardsApi
              .getChargeAdditionalData(chargeAdditionalDataId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getChargeAdditionalData");
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
| **chargeAdditionalDataId** | **String**| The chargeAdditionalDataId value of the desired charge additional data. | |

### Return type

[**ChargeAdditionalData**](ChargeAdditionalData.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getChargeById"></a>
# **getChargeById**
> Charge getChargeById(chargeId).execute();

Charge Object for the given chargeId.

Retrieve the specified charge. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String chargeId = "CHRGiHoKn66p3bkcNs"; // The chargeId value of the desired charge.
    try {
      Charge result = client
              .courtStandardsApi
              .getChargeById(chargeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getChargeGroup());
      System.out.println(result.getChargeGroupId());
      System.out.println(result.getChargeId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getName());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getChargeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Charge> response = client
              .courtStandardsApi
              .getChargeById(chargeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getChargeById");
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
| **chargeId** | **String**| The chargeId value of the desired charge. | |

### Return type

[**Charge**](Charge.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getChargeDegreeById"></a>
# **getChargeDegreeById**
> ChargeDegree getChargeDegreeById(chargeDegreeId).execute();

ChargeDegree Object for the given chargeDegreeId.

Retrieve the specified charge degree. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String chargeDegreeId = "CHDGiHoKn66p3bkcNs"; // The chargeDegreeId value of the desired charge degree.
    try {
      ChargeDegree result = client
              .courtStandardsApi
              .getChargeDegreeById(chargeDegreeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getChargeDegreeId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getName());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getChargeDegreeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChargeDegree> response = client
              .courtStandardsApi
              .getChargeDegreeById(chargeDegreeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getChargeDegreeById");
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
| **chargeDegreeId** | **String**| The chargeDegreeId value of the desired charge degree. | |

### Return type

[**ChargeDegree**](ChargeDegree.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getChargeDegreeUsingKeywordExpression"></a>
# **getChargeDegreeUsingKeywordExpression**
> ChargeDegreeResponse getChargeDegreeUsingKeywordExpression().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

ChargeDegree Object.

Retrieve a charge degree using a keyword expression. Keyword expressions should be constructed according to the rules given above.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; ChargeDegreeQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "chargeDegreeId:\"CHDGiHoKn66p3bkcNs\""; // The keyword expression targeting the desired charge degree.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      ChargeDegreeResponse result = client
              .courtStandardsApi
              .getChargeDegreeUsingKeywordExpression()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getChargeDegreeArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getChargeDegreeUsingKeywordExpression");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChargeDegreeResponse> response = client
              .courtStandardsApi
              .getChargeDegreeUsingKeywordExpression()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getChargeDegreeUsingKeywordExpression");
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
| **q** | **String**| The keyword expression targeting the desired charge degree.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**ChargeDegreeResponse**](ChargeDegreeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getChargeGroup"></a>
# **getChargeGroup**
> ChargeGroup getChargeGroup(chargeGroupId).execute();

Charge Group Object for the given chargeGroupId.

Retrieve the specified charge group. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String chargeGroupId = "CHGPiHoKn66p3bkcNs"; // The chargeGroupId value of the desired charge group.
    try {
      ChargeGroup result = client
              .courtStandardsApi
              .getChargeGroup(chargeGroupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getChargeGroupId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getName());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getChargeGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChargeGroup> response = client
              .courtStandardsApi
              .getChargeGroup(chargeGroupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getChargeGroup");
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
| **chargeGroupId** | **String**| The chargeGroupId value of the desired charge group. | |

### Return type

[**ChargeGroup**](ChargeGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getChargeGroupsByKeyword"></a>
# **getChargeGroupsByKeyword**
> ChargeGroupResponse getChargeGroupsByKeyword().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

Charge Group Object.

Retrieve one or more charge groups using a keyword expression. Keyword expressions should be constructed according to the rules given above.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; ChargeGroupQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "chargeGroupId:\"CHRGoLU7sWaGjWtkBx\""; // The keyword expression targeting the desired charge group.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      ChargeGroupResponse result = client
              .courtStandardsApi
              .getChargeGroupsByKeyword()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getChargeGroupArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getChargeGroupsByKeyword");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChargeGroupResponse> response = client
              .courtStandardsApi
              .getChargeGroupsByKeyword()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getChargeGroupsByKeyword");
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
| **q** | **String**| The keyword expression targeting the desired charge group.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**ChargeGroupResponse**](ChargeGroupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getChargeSeverity"></a>
# **getChargeSeverity**
> ChargeSeverity getChargeSeverity(chargeSeverityId).execute();

ChargeSeverity Object for the given chargeSeverityId.

Retrieve the specified charge severity. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String chargeSeverityId = "CHSEiHoKn66p3bkcNs"; // The chargeSeverityId value of the desired charge severity.
    try {
      ChargeSeverity result = client
              .courtStandardsApi
              .getChargeSeverity(chargeSeverityId)
              .execute();
      System.out.println(result);
      System.out.println(result.getChargeSeverityId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getName());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getChargeSeverity");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChargeSeverity> response = client
              .courtStandardsApi
              .getChargeSeverity(chargeSeverityId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getChargeSeverity");
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
| **chargeSeverityId** | **String**| The chargeSeverityId value of the desired charge severity. | |

### Return type

[**ChargeSeverity**](ChargeSeverity.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getChargeSeverityByKeyword"></a>
# **getChargeSeverityByKeyword**
> ChargeSeverityResponse getChargeSeverityByKeyword().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

ChargeSeverity Object.

Retrieve a charge severity using a keyword expression. Keyword expressions should be constructed according to the rules given above.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; ChargeSeverityQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "chargeSeverityId:\"CHSEiHoKn66p3bkcNs\""; // The keyword expression targeting the desired charge severity.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      ChargeSeverityResponse result = client
              .courtStandardsApi
              .getChargeSeverityByKeyword()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getChargeSeverityArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getChargeSeverityByKeyword");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChargeSeverityResponse> response = client
              .courtStandardsApi
              .getChargeSeverityByKeyword()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getChargeSeverityByKeyword");
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
| **q** | **String**| The keyword expression targeting the desired charge severity.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**ChargeSeverityResponse**](ChargeSeverityResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getChargesUsingKeyword"></a>
# **getChargesUsingKeyword**
> ChargeResponse getChargesUsingKeyword().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

Charge Object.

Retrieve one or more charges using a keyword expression. Keyword expressions should be constructed according to the rules given above.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; ChargeQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "chargeId:\"CHRGoLU7sWaGjWtkBx\""; // The keyword expression targeting the desired charge.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      ChargeResponse result = client
              .courtStandardsApi
              .getChargesUsingKeyword()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getChargeArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getChargesUsingKeyword");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ChargeResponse> response = client
              .courtStandardsApi
              .getChargesUsingKeyword()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getChargesUsingKeyword");
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
| **q** | **String**| The keyword expression targeting the desired charge.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**ChargeResponse**](ChargeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCourtLocation"></a>
# **getCourtLocation**
> CourtLocationResponse getCourtLocation().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

Courthouse Object.

Retrieve the specified court location or court locations.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; CourtLocationQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "courtLocationId:\"COLO9g3fhYM4bmxveA\""; // The keyword expression that sets forth the criteria concerning the court location or court locations to target. Keyword expressions should be constructed according to the rules shown above.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      CourtLocationResponse result = client
              .courtStandardsApi
              .getCourtLocation()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getCourtLocationArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourtLocation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CourtLocationResponse> response = client
              .courtStandardsApi
              .getCourtLocation()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourtLocation");
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
| **q** | **String**| The keyword expression that sets forth the criteria concerning the court location or court locations to target. Keyword expressions should be constructed according to the rules shown above.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**CourtLocationResponse**](CourtLocationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCourtLocationObject"></a>
# **getCourtLocationObject**
> CourtLocation getCourtLocationObject(courtLocationId).execute();

Courthouse Object for given Court Location Id.

Contains the Court Location Object. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String courtLocationId = "COLOV75AKgqMqnfVhM"; // courtLocationId
    try {
      CourtLocation result = client
              .courtStandardsApi
              .getCourtLocationObject(courtLocationId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCity());
      System.out.println(result.getCourtLocationId());
      System.out.println(result.getCourtServiceStatusAPI());
      System.out.println(result.getCourtsForCourtLocationAPI());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getName());
      System.out.println(result.getObject());
      System.out.println(result.getStateName());
      System.out.println(result.getStreetAddress1());
      System.out.println(result.getStreetAddress2());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourtLocationObject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CourtLocation> response = client
              .courtStandardsApi
              .getCourtLocationObject(courtLocationId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourtLocationObject");
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
| **courtLocationId** | **String**| courtLocationId | |

### Return type

[**CourtLocation**](CourtLocation.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCourtLocations"></a>
# **getCourtLocations**
> CourtLocationResponse getCourtLocations(courtId).pageNumber(pageNumber).sort(sort).order(order).execute();

Associated Court Location for given courtId.

Retrieve the court locations associated with the specified court. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String courtId = "CORThSxcef8eGUSkuC"; // The courtId value of the target court.
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      CourtLocationResponse result = client
              .courtStandardsApi
              .getCourtLocations(courtId)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getCourtLocationArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourtLocations");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CourtLocationResponse> response = client
              .courtStandardsApi
              .getCourtLocations(courtId)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourtLocations");
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
| **courtId** | **String**| The courtId value of the target court. | |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**CourtLocationResponse**](CourtLocationResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCourtObject"></a>
# **getCourtObject**
> Court getCourtObject(courtId).execute();

Court Object for given courtId.

Retrieve information about a specified court. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String courtId = "CORThSxcef8eGUSkuC"; // The courtId value of the target court.
    try {
      Court result = client
              .courtStandardsApi
              .getCourtObject(courtId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAdditionalLevels());
      System.out.println(result.getAppealCourtsForCourtAPI());
      System.out.println(result.getContainer());
      System.out.println(result.getContainerType());
      System.out.println(result.getCourtId());
      System.out.println(result.getCourtLocationsForCourtAPI());
      System.out.println(result.getCourtServiceStatusAPI());
      System.out.println(result.getCourtSystemId());
      System.out.println(result.getCourtTypeId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getJurisdictionGeoForCourtAPI());
      System.out.println(result.getName());
      System.out.println(result.getNameAka());
      System.out.println(result.getObject());
      System.out.println(result.getSystem());
      System.out.println(result.getType());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourtObject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Court> response = client
              .courtStandardsApi
              .getCourtObject(courtId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourtObject");
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
| **courtId** | **String**| The courtId value of the target court. | |

### Return type

[**Court**](Court.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCourtServiceStatus"></a>
# **getCourtServiceStatus**
> CourtServiceStatusResponse getCourtServiceStatus().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

Court Service Status Object.

Retrieve the status of one or more courts using a keyword expression.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; CourtServiceStatusQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "courtServiceStatusId: \"CTSSf45fd1bd792e97\""; // The keyword expression targeting the desired court. Keyword expressions should be constructed according to the rules given above.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      CourtServiceStatusResponse result = client
              .courtStandardsApi
              .getCourtServiceStatus()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getCourtServiceStatusArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourtServiceStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CourtServiceStatusResponse> response = client
              .courtStandardsApi
              .getCourtServiceStatus()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourtServiceStatus");
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
| **q** | **String**| The keyword expression targeting the desired court. Keyword expressions should be constructed according to the rules given above.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**CourtServiceStatusResponse**](CourtServiceStatusResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCourtServiceStatusById"></a>
# **getCourtServiceStatusById**
> CourtServiceStatus getCourtServiceStatusById(courtServiceStatusId).execute();

Court Service Status Object for the given courtServiceStatusId.

Retrieve the court status of the specified court. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String courtServiceStatusId = "CTSSf45fd1bd792e97"; // The courtServiceStatusId value of the desired court.
    try {
      CourtServiceStatus result = client
              .courtStandardsApi
              .getCourtServiceStatusById(courtServiceStatusId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseClassIdArray());
      System.out.println(result.getCaseDocumentOrderServiceStatus());
      System.out.println(result.getCaseTrackServiceStatus());
      System.out.println(result.getCaseUpdateServiceStatus());
      System.out.println(result.getCourtIdArray());
      System.out.println(result.getCourtLocationIdArray());
      System.out.println(result.getCourtServiceStatusId());
      System.out.println(result.getObject());
      System.out.println(result.getServiceStatusAsOn());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourtServiceStatusById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CourtServiceStatus> response = client
              .courtStandardsApi
              .getCourtServiceStatusById(courtServiceStatusId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourtServiceStatusById");
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
| **courtServiceStatusId** | **String**| The courtServiceStatusId value of the desired court. | |

### Return type

[**CourtServiceStatus**](CourtServiceStatus.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCourtSystem"></a>
# **getCourtSystem**
> CourtSystem getCourtSystem(courtSystemId).execute();

Court System Object for given courtSystemId.

Retrieve the specified court system. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String courtSystemId = "COSY4vuCtGQeAmdDdN"; // The courtSystemId value of the court system to be retrieved.
    try {
      CourtSystem result = client
              .courtStandardsApi
              .getCourtSystem(courtSystemId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCourtSystemId());
      System.out.println(result.getCourtType());
      System.out.println(result.getCourtTypeId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getName());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourtSystem");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CourtSystem> response = client
              .courtStandardsApi
              .getCourtSystem(courtSystemId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourtSystem");
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
| **courtSystemId** | **String**| The courtSystemId value of the court system to be retrieved. | |

### Return type

[**CourtSystem**](CourtSystem.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCourtTypeObject"></a>
# **getCourtTypeObject**
> CourtType getCourtTypeObject(courtTypeId).execute();

Court Type Object for given courtTypeId.

Retrieve the information concerning the specific court type. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String courtTypeId = "COTPm8jjc2PAydpFhq"; // The courtTypeId value of the court type to be retrieved.
    try {
      CourtType result = client
              .courtStandardsApi
              .getCourtTypeObject(courtTypeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCourtTypeId());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getName());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourtTypeObject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CourtType> response = client
              .courtStandardsApi
              .getCourtTypeObject(courtTypeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourtTypeObject");
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
| **courtTypeId** | **String**| The courtTypeId value of the court type to be retrieved. | |

### Return type

[**CourtType**](CourtType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCourtTypes"></a>
# **getCourtTypes**
> CourtTypeResponse getCourtTypes().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

Court Type Objects.

Retrieve court types recognized by UniCourt.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------|         | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; CourtTypeQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "courtTypeId:\"COTPm8jjc2PAydpFhq\""; // The keyword expression that sets forth the criteria concerning the court type or court types. Keyword expressions should be constructed according to the rules shown above.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      CourtTypeResponse result = client
              .courtStandardsApi
              .getCourtTypes()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getCourtTypeArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourtTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CourtTypeResponse> response = client
              .courtStandardsApi
              .getCourtTypes()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourtTypes");
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
| **q** | **String**| The keyword expression that sets forth the criteria concerning the court type or court types. Keyword expressions should be constructed according to the rules shown above.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**CourtTypeResponse**](CourtTypeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCourts"></a>
# **getCourts**
> CourtResponse getCourts().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

Court Objects.

Retrieve information about a specified court or courts.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------|         | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; CourtQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "courtId:\"CORThSxcef8eGUSkuC\""; // The keyword expression that sets forth the criteria concerning the court or courts to be retrieved. Keyword expressions should be constructed according to the rules shown above.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      CourtResponse result = client
              .courtStandardsApi
              .getCourts()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getCourtArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CourtResponse> response = client
              .courtStandardsApi
              .getCourts()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourts");
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
| **q** | **String**| The keyword expression that sets forth the criteria concerning the court or courts to be retrieved. Keyword expressions should be constructed according to the rules shown above.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**CourtResponse**](CourtResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getCourtsByLocation"></a>
# **getCourtsByLocation**
> CourtResponse getCourtsByLocation(courtLocationId).pageNumber(pageNumber).sort(sort).order(order).execute();

Associated Court for given Court Location.

Retrieve the courts associated with the specified court location. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String courtLocationId = "COLOV75AKgqMqnfVhM"; // The courtLocationId value of the court location for which courts are to be retrieved.
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      CourtResponse result = client
              .courtStandardsApi
              .getCourtsByLocation(courtLocationId)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getCourtArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourtsByLocation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CourtResponse> response = client
              .courtStandardsApi
              .getCourtsByLocation(courtLocationId)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getCourtsByLocation");
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
| **courtLocationId** | **String**| The courtLocationId value of the court location for which courts are to be retrieved. | |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**CourtResponse**](CourtResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getJudgeTypeObject"></a>
# **getJudgeTypeObject**
> JudgeTypeResponse getJudgeTypeObject().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

Judge Type Object.

Retrieve a judge type using a keyword expression. Keyword expressions should be constructed according to the rules given above.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; JudgeTypeQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "judgeTypeId: \"JGTPkwrfzkDJUvxpN9\""; // The keyword expression targeting the judge type.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      JudgeTypeResponse result = client
              .courtStandardsApi
              .getJudgeTypeObject()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getJudgeTypeArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getJudgeTypeObject");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JudgeTypeResponse> response = client
              .courtStandardsApi
              .getJudgeTypeObject()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getJudgeTypeObject");
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
| **q** | **String**| The keyword expression targeting the judge type.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**JudgeTypeResponse**](JudgeTypeResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getJudgeTypeObjectById"></a>
# **getJudgeTypeObjectById**
> JudgeType getJudgeTypeObjectById(judgeTypeId).execute();

Judge Type Object for the given judgeTypeId.

Retrieve the specified judge type. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String judgeTypeId = "JGTPkwrfzkDJUvxpN9"; // The judgeTypeId of the desired judge type.
    try {
      JudgeType result = client
              .courtStandardsApi
              .getJudgeTypeObjectById(judgeTypeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCreatedDate());
      System.out.println(result.getJudgeTypeId());
      System.out.println(result.getName());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getJudgeTypeObjectById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JudgeType> response = client
              .courtStandardsApi
              .getJudgeTypeObjectById(judgeTypeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getJudgeTypeObjectById");
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
| **judgeTypeId** | **String**| The judgeTypeId of the desired judge type. | |

### Return type

[**JudgeType**](JudgeType.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getJurisdictionGeo"></a>
# **getJurisdictionGeo**
> JurisdictionGeo getJurisdictionGeo(jurisdictionGeoId).execute();

Jurisdiction Geo Object for given Jurisdiction Geo Id.

Retrieve the specified jurisdiction geography. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String jurisdictionGeoId = "JUGO8s7HvM84dLvVMu"; // The jurisdictionGeoId value of the desired jurisdiction geography.
    try {
      JurisdictionGeo result = client
              .courtStandardsApi
              .getJurisdictionGeo(jurisdictionGeoId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCity());
      System.out.println(result.getCountry());
      System.out.println(result.getCounty());
      System.out.println(result.getCourtsForJurisdictionGeoAPI());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getFipsCode());
      System.out.println(result.getJurisdictionGeoId());
      System.out.println(result.getObject());
      System.out.println(result.getState());
      System.out.println(result.getZipCodeArray());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getJurisdictionGeo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JurisdictionGeo> response = client
              .courtStandardsApi
              .getJurisdictionGeo(jurisdictionGeoId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getJurisdictionGeo");
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
| **jurisdictionGeoId** | **String**| The jurisdictionGeoId value of the desired jurisdiction geography. | |

### Return type

[**JurisdictionGeo**](JurisdictionGeo.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getJurisdictionGeoForCourt"></a>
# **getJurisdictionGeoForCourt**
> JurisdictionGeoResponse getJurisdictionGeoForCourt().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

Jurisdiction Geo Object.

Retrieve one or more jurisdiction geographies using a keyword expression.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; JurisdictionGeoQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "jurisdictionGeoId:\"JUGO8s7HvM84dLvVMu\""; // The keyword expression targeting the desired jurisdiction geography. Keyword expressions should be constructed according to the rules given above.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "state"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      JurisdictionGeoResponse result = client
              .courtStandardsApi
              .getJurisdictionGeoForCourt()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getJurisdictionGeoArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getJurisdictionGeoForCourt");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JurisdictionGeoResponse> response = client
              .courtStandardsApi
              .getJurisdictionGeoForCourt()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getJurisdictionGeoForCourt");
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
| **q** | **String**| The keyword expression targeting the desired jurisdiction geography. Keyword expressions should be constructed according to the rules given above.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to state] [enum: state] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**JurisdictionGeoResponse**](JurisdictionGeoResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getJurisdictionGeoObjectsForCourt"></a>
# **getJurisdictionGeoObjectsForCourt**
> JurisdictionGeoResponse getJurisdictionGeoObjectsForCourt(courtId).pageNumber(pageNumber).sort(sort).order(order).execute();

Jurisdiction Geo Objects for given courtId.

Retrieve the jurisdiction geography object for the specified court. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String courtId = "CORThSxcef8eGUSkuC"; // The courtId value of the target court.
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "state"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      JurisdictionGeoResponse result = client
              .courtStandardsApi
              .getJurisdictionGeoObjectsForCourt(courtId)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getJurisdictionGeoArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getJurisdictionGeoObjectsForCourt");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JurisdictionGeoResponse> response = client
              .courtStandardsApi
              .getJurisdictionGeoObjectsForCourt(courtId)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getJurisdictionGeoObjectsForCourt");
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
| **courtId** | **String**| The courtId value of the target court. | |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to state] [enum: state] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**JurisdictionGeoResponse**](JurisdictionGeoResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPartyRole"></a>
# **getPartyRole**
> PartyRole getPartyRole(partyRoleId).execute();

Party Role Object.

Retrieve the specified party role. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String partyRoleId = "PTYRVRgMKueGmhnxRN"; // The partyRoleId value of the desired party role.
    try {
      PartyRole result = client
              .courtStandardsApi
              .getPartyRole(partyRoleId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getName());
      System.out.println(result.getObject());
      System.out.println(result.getPartyRoleGroup());
      System.out.println(result.getPartyRoleGroupId());
      System.out.println(result.getPartyRoleId());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getPartyRole");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PartyRole> response = client
              .courtStandardsApi
              .getPartyRole(partyRoleId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getPartyRole");
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
| **partyRoleId** | **String**| The partyRoleId value of the desired party role. | |

### Return type

[**PartyRole**](PartyRole.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPartyRoleGroup"></a>
# **getPartyRoleGroup**
> PartyRoleGroup getPartyRoleGroup(partyRoleGroupId).execute();

Party Role Group Object.

Retrieve the specified party role group. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String partyRoleGroupId = "PTYGBnjxbx6tKNfVEP"; // The partyRoleGroupId value of the desired party role group.
    try {
      PartyRoleGroup result = client
              .courtStandardsApi
              .getPartyRoleGroup(partyRoleGroupId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getCreatedDate());
      System.out.println(result.getName());
      System.out.println(result.getObject());
      System.out.println(result.getPartyRoleGroupId());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getPartyRoleGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PartyRoleGroup> response = client
              .courtStandardsApi
              .getPartyRoleGroup(partyRoleGroupId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getPartyRoleGroup");
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
| **partyRoleGroupId** | **String**| The partyRoleGroupId value of the desired party role group. | |

### Return type

[**PartyRoleGroup**](PartyRoleGroup.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPartyRoleGroups"></a>
# **getPartyRoleGroups**
> PartyRoleGroupResponse getPartyRoleGroups().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

Party Role Group Object.

Retrieve a party role group using a keyword expression. Keyword expressions should be constructed according to the rules given above.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; PartyRoleGroupQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "partyRoleGroupId: \"PTYGBnjxbx6tKNfVEP\""; // The keyword expression targeting the desired party role group.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      PartyRoleGroupResponse result = client
              .courtStandardsApi
              .getPartyRoleGroups()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPartyRoleGroupArray());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getPartyRoleGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PartyRoleGroupResponse> response = client
              .courtStandardsApi
              .getPartyRoleGroups()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getPartyRoleGroups");
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
| **q** | **String**| The keyword expression targeting the desired party role group.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**PartyRoleGroupResponse**](PartyRoleGroupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getPartyRolesByKeyword"></a>
# **getPartyRolesByKeyword**
> PartyRoleResponse getPartyRolesByKeyword().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

Party Role Object.

Retrieve a party role using a keyword expression. Keyword expressions should be constructed according to the rules given above.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; PartyRoleQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "partyRoleId: \"PTYRVRgMKueGmhnxRN\""; // The keyword expression targeting the desired party role.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      PartyRoleResponse result = client
              .courtStandardsApi
              .getPartyRolesByKeyword()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPartyRoleArray());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getPartyRolesByKeyword");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PartyRoleResponse> response = client
              .courtStandardsApi
              .getPartyRolesByKeyword()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#getPartyRolesByKeyword");
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
| **q** | **String**| The keyword expression targeting the desired party role.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**PartyRoleResponse**](PartyRoleResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listAreaOfLaw"></a>
# **listAreaOfLaw**
> AreaOfLawResponse listAreaOfLaw().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

AreaOfLaw Object.

The keyword expression targeting the desired area of law.   ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; AreaOfLawQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "areaOfLawId: \"AOFLGAd9Ah5qkTRNw9\""; // Retrieve one or more areas of law using a keyword expression. Keyword expressions should be constructed according to the rules given above.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      AreaOfLawResponse result = client
              .courtStandardsApi
              .listAreaOfLaw()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getAreaOfLawArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#listAreaOfLaw");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AreaOfLawResponse> response = client
              .courtStandardsApi
              .listAreaOfLaw()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#listAreaOfLaw");
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
| **q** | **String**| Retrieve one or more areas of law using a keyword expression. Keyword expressions should be constructed according to the rules given above.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**AreaOfLawResponse**](AreaOfLawResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listCaseTypeGroups"></a>
# **listCaseTypeGroups**
> CaseTypeGroupResponse listCaseTypeGroups().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

CaseTypeGroup Object.

Retrieve one or more case type groups using a keyword expression. Keyword expressions should be constructed according to the rules given above.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------| | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; CaseTypeGroupQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "caseTypeGroupId: \"CTYGSpWaVityBQndsv\""; // Retrieve one or more case type groups using a keyword expression. Keyword expressions should be constructed according to the rules given above.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      CaseTypeGroupResponse result = client
              .courtStandardsApi
              .listCaseTypeGroups()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseTypeGroupArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#listCaseTypeGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseTypeGroupResponse> response = client
              .courtStandardsApi
              .listCaseTypeGroups()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#listCaseTypeGroups");
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
| **q** | **String**| Retrieve one or more case type groups using a keyword expression. Keyword expressions should be constructed according to the rules given above.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**CaseTypeGroupResponse**](CaseTypeGroupResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="listCourtSystems"></a>
# **listCourtSystems**
> CourtSystemResponse listCourtSystems().q(q).pageNumber(pageNumber).sort(sort).order(order).execute();

Court System Objects.

Retrieve information about the specified court system or court systems.  ## Logical Operators | Connector | Description  | Example | | ------| ------|------|         | **AND** |Find data containing all connected terms.|**google AND facebook**| | **OR**  |Find data containing any connected term.| **order OR decision**| | **NOT** |Exclude data.| **google NOT apple**.| | **“[phrase]”** |Find an exact phrase.| **\&quot;Google Inc”** | | **( … )** |Parenthesis may be used to group sets of terms of connectors.| **google (facebook OR apple)**.|  ### All Filter Query parameters supported for this API can be found in below schema section. Schema --&gt; CourtSystemQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtStandardsApiApi;
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
    String q = "courtSystemId:\"COSY4vuCtGQeAmdDdN\""; // The keyword expression that sets forth the criteria concerning the court system or court systems. Keyword expressions should be constructed according to the rules shown above.</a> 
    Integer pageNumber = 1; // The page number of the results to be retrieved. - minimum: 1 - maximum: 100 
    String sort = "name"; // The field according to which search results are to be sorted.
    String order = "asc"; // Whether search results are to be shown in ascending or descending order.
    try {
      CourtSystemResponse result = client
              .courtStandardsApi
              .listCourtSystems()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getCourtSystemArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#listCourtSystems");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CourtSystemResponse> response = client
              .courtStandardsApi
              .listCourtSystems()
              .q(q)
              .pageNumber(pageNumber)
              .sort(sort)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtStandardsApiApi#listCourtSystems");
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
| **q** | **String**| The keyword expression that sets forth the criteria concerning the court system or court systems. Keyword expressions should be constructed according to the rules shown above.&lt;/a&gt;  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved. - minimum: 1 - maximum: 100  | [optional] |
| **sort** | **String**| The field according to which search results are to be sorted. | [optional] [default to name] [enum: name] |
| **order** | **String**| Whether search results are to be shown in ascending or descending order. | [optional] [default to asc] [enum: asc, desc] |

### Return type

[**CourtSystemResponse**](CourtSystemResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

