<div align="left">

[![Visit Unicourt](./header.png)](https://unicourt.com)

# [Unicourt](https://unicourt.com)

<button><a href="/enterpriseapi/download/UniCourt-Enterprise-API-Spec.yaml" >Download UniCourt Enterprise APIs Specification</a></button>


</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=UniCourt&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>unicourt-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:unicourt-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/unicourt-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://enterpriseapi.unicourt.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AttorneyAnalyticsApiApi* | [**getAssociatedLawFirms**](docs/AttorneyAnalyticsApiApi.md#getAssociatedLawFirms) | **GET** /normAttorney/{normAttorneyId}/associatedNormLawFirms | Law Firms the attorney has worked for.
*AttorneyAnalyticsApiApi* | [**getJudgesAssociatedWithAttorney**](docs/AttorneyAnalyticsApiApi.md#getJudgesAssociatedWithAttorney) | **GET** /normAttorney/{normAttorneyId}/associatedNormJudges | Judges faced by the Attorney.
*AttorneyAnalyticsApiApi* | [**getNormAttorneyById**](docs/AttorneyAnalyticsApiApi.md#getNormAttorneyById) | **GET** /normAttorney/{normAttorneyId} | Norm Attorney Details.
*AttorneyAnalyticsApiApi* | [**getNormAttorneySearchResults**](docs/AttorneyAnalyticsApiApi.md#getNormAttorneySearchResults) | **GET** /normAttorneySearch/{normAttorneySearchId} | Norm attorney search results for a given normAttorneySearchId.
*AttorneyAnalyticsApiApi* | [**listAssociatedNormParties**](docs/AttorneyAnalyticsApiApi.md#listAssociatedNormParties) | **GET** /normAttorney/{normAttorneyId}/associatedNormParties | Parties Represented By the Attorney.
*AttorneyAnalyticsApiApi* | [**searchAttorneyInfo**](docs/AttorneyAnalyticsApiApi.md#searchAttorneyInfo) | **GET** /normAttorneySearch | Attorney search.
*AuthenticationApiApi* | [**generateNewToken**](docs/AuthenticationApiApi.md#generateNewToken) | **POST** /generateNewToken | Generate new token to access API.
*AuthenticationApiApi* | [**getAllTokenIds**](docs/AuthenticationApiApi.md#getAllTokenIds) | **PUT** /listAllTokenIds | API to list all the access tokens Id.
*AuthenticationApiApi* | [**invalidateAccessToken**](docs/AuthenticationApiApi.md#invalidateAccessToken) | **PUT** /invalidateToken | API to invalidate the access token.
*AuthenticationApiApi* | [**invalidateAllTokens**](docs/AuthenticationApiApi.md#invalidateAllTokens) | **PUT** /invalidateAllTokens | API to invalidate all access tokens.
*CallbackApiApi* | [**listCallbacksWithCount**](docs/CallbackApiApi.md#listCallbacksWithCount) | **GET** /callbacks | Get list of callback types with count for a requested Date.
*CaseAnalyticsApiApi* | [**getCaseCountAnalyticsByCaseClass**](docs/CaseAnalyticsApiApi.md#getCaseCountAnalyticsByCaseClass) | **GET** /caseCountAnalyticsByCaseClass | Case Count Analytics by Case Class.
*CaseAnalyticsApiApi* | [**getCaseCountAnalyticsByCaseFiledDate**](docs/CaseAnalyticsApiApi.md#getCaseCountAnalyticsByCaseFiledDate) | **GET** /caseCountAnalyticsByCaseFiledDate | Case Count Analytics by Case Filed Date.
*CaseAnalyticsApiApi* | [**getCaseCountAnalyticsByCaseTypeGroup**](docs/CaseAnalyticsApiApi.md#getCaseCountAnalyticsByCaseTypeGroup) | **GET** /caseCountAnalyticsByCaseTypeGroup | Case Count Analytics by Case Type Group.
*CaseAnalyticsApiApi* | [**getCaseCountAnalyticsByCourt**](docs/CaseAnalyticsApiApi.md#getCaseCountAnalyticsByCourt) | **GET** /caseCountAnalyticsByCourt | Case Count Analytics by Court.
*CaseAnalyticsApiApi* | [**getCaseCountAnalyticsByCourtLocation**](docs/CaseAnalyticsApiApi.md#getCaseCountAnalyticsByCourtLocation) | **GET** /caseCountAnalyticsByCourtLocation | Case Count Analytics by Court Location.
*CaseAnalyticsApiApi* | [**getCaseCountAnalyticsByCourtSystem**](docs/CaseAnalyticsApiApi.md#getCaseCountAnalyticsByCourtSystem) | **GET** /caseCountAnalyticsByCourtSystem | Case Count Analytics by Court System.
*CaseAnalyticsApiApi* | [**getCaseCountAnalyticsByCourtType**](docs/CaseAnalyticsApiApi.md#getCaseCountAnalyticsByCourtType) | **GET** /caseCountAnalyticsByCourtType | Case Count Analytics by CourtType.
*CaseAnalyticsApiApi* | [**getCaseCountAnalyticsByJurisdictionGeo**](docs/CaseAnalyticsApiApi.md#getCaseCountAnalyticsByJurisdictionGeo) | **GET** /caseCountAnalyticsByJurisdictionGeo | Case Count Analytics by Jurisdiction Geo.
*CaseAnalyticsApiApi* | [**getCaseCountAnalyticsByNormAttorney**](docs/CaseAnalyticsApiApi.md#getCaseCountAnalyticsByNormAttorney) | **GET** /caseCountAnalyticsByNormAttorney | Case Count Analytics by Attorney.
*CaseAnalyticsApiApi* | [**getCaseCountAnalyticsByNormJudge**](docs/CaseAnalyticsApiApi.md#getCaseCountAnalyticsByNormJudge) | **GET** /caseCountAnalyticsByNormJudge | Case Count Analytics by Judge.
*CaseAnalyticsApiApi* | [**getCaseCountAnalyticsByNormLawFirm**](docs/CaseAnalyticsApiApi.md#getCaseCountAnalyticsByNormLawFirm) | **GET** /caseCountAnalyticsByNormLawFirm | Case Count Analytics by Norm Law Firm.
*CaseAnalyticsApiApi* | [**getCaseCountAnalyticsByNormParty**](docs/CaseAnalyticsApiApi.md#getCaseCountAnalyticsByNormParty) | **GET** /caseCountAnalyticsByNormParty | Case Count Analytics by Party.
*CaseAnalyticsApiApi* | [**getCaseCountAnalyticsByOpposingNormAttorneyForNormAttorney**](docs/CaseAnalyticsApiApi.md#getCaseCountAnalyticsByOpposingNormAttorneyForNormAttorney) | **GET** /normAttorney/{normAttorneyId}/caseCountAnalyticsByOpposingNormAttorney | Case Count Analytics by Opposing Norm Attorney.
*CaseAnalyticsApiApi* | [**getCaseCountAnalyticsByOpposingNormLawFirmForANormLawFirm**](docs/CaseAnalyticsApiApi.md#getCaseCountAnalyticsByOpposingNormLawFirmForANormLawFirm) | **GET** /normLawFirm/{normLawFirmId}/caseCountAnalyticsByOpposingNormLawFirm | Case Count Analytics by Opposing Norm Law Firm.
*CaseAnalyticsApiApi* | [**getCaseCountAnalyticsByOpposingNormPartyForANormParty**](docs/CaseAnalyticsApiApi.md#getCaseCountAnalyticsByOpposingNormPartyForANormParty) | **GET** /normParty/{normPartyId}/caseCountAnalyticsByOpposingNormParty | Case Count Analytics by Opposing Norm Party.
*CaseAnalyticsApiApi* | [**getCaseCountAnalyticsByPartyRole**](docs/CaseAnalyticsApiApi.md#getCaseCountAnalyticsByPartyRole) | **GET** /caseCountAnalyticsByPartyRole | Case Count Analytics by Party Role.
*CaseAnalyticsApiApi* | [**getCaseCountAnalyticsByPartyRoleGroup**](docs/CaseAnalyticsApiApi.md#getCaseCountAnalyticsByPartyRoleGroup) | **GET** /caseCountAnalyticsByPartyRoleGroup | Case Count Analytics by Party Role Group.
*CaseAnalyticsApiApi* | [**getCaseCountByAreaOfLaw**](docs/CaseAnalyticsApiApi.md#getCaseCountByAreaOfLaw) | **GET** /caseCountAnalyticsByAreaOfLaw | Case Count Analytics by Area Of Law.
*CaseAnalyticsApiApi* | [**getCaseCountByCaseType**](docs/CaseAnalyticsApiApi.md#getCaseCountByCaseType) | **GET** /caseCountAnalyticsByCaseType | Case Count Analytics by Case Type.
*CaseDocketApiApi* | [**getAssociatedAttorneyDetails**](docs/CaseDocketApiApi.md#getAssociatedAttorneyDetails) | **GET** /party/{partyId}/associatedAttorneys | Gets Associated Attorney details for a requested Party ID.
*CaseDocketApiApi* | [**getAssociatedParties**](docs/CaseDocketApiApi.md#getAssociatedParties) | **GET** /attorney/{attorneyId}/associatedParties | Gets Associated Party details for a requested Attorney ID.
*CaseDocketApiApi* | [**getAttorneyDetails**](docs/CaseDocketApiApi.md#getAttorneyDetails) | **GET** /attorney/{attorneyId} | Gets details for a requested Attorney ID.
*CaseDocketApiApi* | [**getAttorneysByCaseId**](docs/CaseDocketApiApi.md#getAttorneysByCaseId) | **GET** /case/{caseId}/attorneys | Gets Attorneys for a requested Case ID.
*CaseDocketApiApi* | [**getCaseInfo**](docs/CaseDocketApiApi.md#getCaseInfo) | **GET** /case/{caseId} | Gets case information for a requested Case ID.
*CaseDocketApiApi* | [**getCaseParties**](docs/CaseDocketApiApi.md#getCaseParties) | **GET** /case/{caseId}/parties | Gets Parties for a requested Case ID.
*CaseDocketApiApi* | [**getDocketEntries**](docs/CaseDocketApiApi.md#getDocketEntries) | **GET** /case/{caseId}/docketEntries | Gets Docket Entries for a requested Case ID.
*CaseDocketApiApi* | [**getHearingsForCase**](docs/CaseDocketApiApi.md#getHearingsForCase) | **GET** /case/{caseId}/hearings | Gets Hearings for a requested Case ID.
*CaseDocketApiApi* | [**getJudgeDetails**](docs/CaseDocketApiApi.md#getJudgeDetails) | **GET** /judge/{judgeId} | Gets details for a requested Judge ID.
*CaseDocketApiApi* | [**getJudgesForCase**](docs/CaseDocketApiApi.md#getJudgesForCase) | **GET** /case/{caseId}/judges | Gets Judges for a requested Case ID.
*CaseDocketApiApi* | [**getPartyDetails**](docs/CaseDocketApiApi.md#getPartyDetails) | **GET** /party/{partyId} | Gets details for a requested Party ID.
*CaseDocketApiApi* | [**getPrimaryDocuments**](docs/CaseDocketApiApi.md#getPrimaryDocuments) | **GET** /case/{caseId}/docketEntries/primaryDocuments | Gets Primary Documents of Docket Entries.
*CaseDocketApiApi* | [**getRelatedCases**](docs/CaseDocketApiApi.md#getRelatedCases) | **GET** /case/{caseId}/relatedCases | Gets Related Cases for a requested Case ID.
*CaseDocketApiApi* | [**getSecondaryDocumentsForDocketEntries**](docs/CaseDocketApiApi.md#getSecondaryDocumentsForDocketEntries) | **GET** /case/{caseId}/docketEntries/secondaryDocuments | Gets Secondary Documents of Docket Entries.
*CaseDocumentsApiApi* | [**addDocumentOrder**](docs/CaseDocumentsApiApi.md#addDocumentOrder) | **PUT** /caseDocumentOrder | Add Case Document Order for requested Document Ids.
*CaseDocumentsApiApi* | [**getCallbackById**](docs/CaseDocumentsApiApi.md#getCallbackById) | **GET** /caseDocumentOrder/callbacks/{caseDocumentOrderCallbackId} | Get Case Document Order Callback for a requested Case Document Order Callback Id.
*CaseDocumentsApiApi* | [**getDocumentDetailsByDocumentId**](docs/CaseDocumentsApiApi.md#getDocumentDetailsByDocumentId) | **GET** /caseDocument/{caseDocumentId} | Gets details for a requested Document ID.
*CaseDocumentsApiApi* | [**getDocumentsForCase**](docs/CaseDocumentsApiApi.md#getDocumentsForCase) | **GET** /case/{caseId}/documents | Gets Documents for a requested Case ID.
*CaseDocumentsApiApi* | [**getDownloadableUrlForDocument**](docs/CaseDocumentsApiApi.md#getDownloadableUrlForDocument) | **GET** /caseDocumentDownload/{caseDocumentId} | Gets downloadable URL for a requested Document ID.
*CaseDocumentsApiApi* | [**listDocumentOrderCallbacks**](docs/CaseDocumentsApiApi.md#listDocumentOrderCallbacks) | **GET** /caseDocumentOrder/callbacks | Get Case Document Order Callback list for a requested Date.
*CaseExportApiApi* | [**getCallbackById**](docs/CaseExportApiApi.md#getCallbackById) | **GET** /caseExport/callbacks/{caseExportCallbackId} | Get Case Export Callback for a requested Case Export Callback Id.
*CaseExportApiApi* | [**getCallbackListForRequestedDate**](docs/CaseExportApiApi.md#getCallbackListForRequestedDate) | **GET** /caseExport/callbacks | Get Case Export Callback list for a requested Date.
*CaseExportApiApi* | [**getCaseExportByCaseId**](docs/CaseExportApiApi.md#getCaseExportByCaseId) | **GET** /caseExport/{caseId} | Gets case exported for a requested Case ID.
*CaseSearchApiApi* | [**getSearchResultsByCaseSearchId**](docs/CaseSearchApiApi.md#getSearchResultsByCaseSearchId) | **GET** /caseSearch/{caseSearchId} | Case search results for a given caseSearchId.
*CaseSearchApiApi* | [**searchByKeywordExpressions**](docs/CaseSearchApiApi.md#searchByKeywordExpressions) | **GET** /caseSearch | Case search.
*CaseTrackingApiApi* | [**addCaseTrack**](docs/CaseTrackingApiApi.md#addCaseTrack) | **PUT** /caseTrack | Add Case Track for the requested Case Id.
*CaseTrackingApiApi* | [**getCaseTrack**](docs/CaseTrackingApiApi.md#getCaseTrack) | **GET** /caseTrack/{caseId} | Get Case Track for a requested Case Id.
*CaseTrackingApiApi* | [**getCaseTrackList**](docs/CaseTrackingApiApi.md#getCaseTrackList) | **GET** /caseTracks | Get Case Track list.
*CaseTrackingApiApi* | [**removeCaseTrackById**](docs/CaseTrackingApiApi.md#removeCaseTrackById) | **DELETE** /caseTrack/{caseId} | Remove Case Track for a specific Case Id.
*CaseUpdateApiApi* | [**addCaseUpdateForCaseId**](docs/CaseUpdateApiApi.md#addCaseUpdateForCaseId) | **PUT** /caseUpdate | Add Case Update for the requested Case Id.
*CaseUpdateApiApi* | [**getCaseUpdates**](docs/CaseUpdateApiApi.md#getCaseUpdates) | **GET** /caseUpdates | Get Case Update  list for a requested Date.
*CaseUpdateApiApi* | [**getCaseUpdatesByCaseId**](docs/CaseUpdateApiApi.md#getCaseUpdatesByCaseId) | **GET** /caseUpdate/{caseId} | Get Case Updates for a requested CaseId.
*CourtAvailabilityApiApi* | [**getCourtCoverageByCourtId**](docs/CourtAvailabilityApiApi.md#getCourtCoverageByCourtId) | **GET** /courtCoverage/{courtId} | Gets Court Coverage of all courts of specific type.
*CourtStandardsApiApi* | [**associatedCourtForJurisdictionGeo**](docs/CourtStandardsApiApi.md#associatedCourtForJurisdictionGeo) | **GET** /masterData/jurisdictionGeo/{jurisdictionGeoId}/courts | Associated Court for given Jurisdiction Geo.
*CourtStandardsApiApi* | [**getAdditionalChargeInfo**](docs/CourtStandardsApiApi.md#getAdditionalChargeInfo) | **GET** /masterData/chargeAdditionalData | Charge Additional Data Object.
*CourtStandardsApiApi* | [**getAppealCourtsForCourt**](docs/CourtStandardsApiApi.md#getAppealCourtsForCourt) | **GET** /masterData/court/{courtId}/appealCourts | Appeal Court Objects for given courtId.
*CourtStandardsApiApi* | [**getAreaOfLaw**](docs/CourtStandardsApiApi.md#getAreaOfLaw) | **GET** /masterData/areaOfLaw/{areaOfLawId} | AreaOfLaw Object for the given AreaOfLaw Id.
*CourtStandardsApiApi* | [**getAttorneyRepType**](docs/CourtStandardsApiApi.md#getAttorneyRepType) | **GET** /masterData/attorneyRepresentationType | Attorney Representation Type Object.
*CourtStandardsApiApi* | [**getAttorneyRepType_0**](docs/CourtStandardsApiApi.md#getAttorneyRepType_0) | **GET** /masterData/attorneyRepresentationType/{attorneyRepresentationTypeId} | Attorney Representation Type Object for the given attorneyRepresentationTypeId.
*CourtStandardsApiApi* | [**getAttorneyTypeObject**](docs/CourtStandardsApiApi.md#getAttorneyTypeObject) | **GET** /masterData/attorneyType/{attorneyTypeId} | Attorney Type Object for given Attorney Type Id.
*CourtStandardsApiApi* | [**getAttorneyTypeUsingKeywordExpression**](docs/CourtStandardsApiApi.md#getAttorneyTypeUsingKeywordExpression) | **GET** /masterData/attorneyType | Attorney Type Object.
*CourtStandardsApiApi* | [**getCaseClassById**](docs/CourtStandardsApiApi.md#getCaseClassById) | **GET** /masterData/caseClass/{caseClassId} | Case Class Object for the given Case Class Id.
*CourtStandardsApiApi* | [**getCaseClassByKeyword**](docs/CourtStandardsApiApi.md#getCaseClassByKeyword) | **GET** /masterData/caseClass | Case Class Object.
*CourtStandardsApiApi* | [**getCaseRelationshipTypeById**](docs/CourtStandardsApiApi.md#getCaseRelationshipTypeById) | **GET** /masterData/caseRelationshipType/{caseRelationshipTypeId} | Case Relationship Type Object for the given caseRelationshipTypeId.
*CourtStandardsApiApi* | [**getCaseRelationshipTypes**](docs/CourtStandardsApiApi.md#getCaseRelationshipTypes) | **GET** /masterData/caseRelationshipType | Case Relationship Type Object.
*CourtStandardsApiApi* | [**getCaseStatusById**](docs/CourtStandardsApiApi.md#getCaseStatusById) | **GET** /masterData/caseStatus/{caseStatusId} | Returns the caseStatus information for the given caseStatusId.
*CourtStandardsApiApi* | [**getCaseStatusByKeyword**](docs/CourtStandardsApiApi.md#getCaseStatusByKeyword) | **GET** /masterData/caseStatus | Case Status Object.
*CourtStandardsApiApi* | [**getCaseStatusGroup**](docs/CourtStandardsApiApi.md#getCaseStatusGroup) | **GET** /masterData/caseStatusGroup/{caseStatusGroupId} | Returns the caseStatusGroup information for the given caseStatusGroupId.
*CourtStandardsApiApi* | [**getCaseStatusGroupUsingKeywordExpression**](docs/CourtStandardsApiApi.md#getCaseStatusGroupUsingKeywordExpression) | **GET** /masterData/caseStatusGroup | Case Status Group Object.
*CourtStandardsApiApi* | [**getCaseType**](docs/CourtStandardsApiApi.md#getCaseType) | **GET** /masterData/caseType/{caseTypeId} | CaseType Object for given Case Type Id.
*CourtStandardsApiApi* | [**getCaseTypeGroup**](docs/CourtStandardsApiApi.md#getCaseTypeGroup) | **GET** /masterData/caseTypeGroup/{caseTypeGroupId} | CaseType Group for the given CaseType Group Id.
*CourtStandardsApiApi* | [**getCaseTypesByKeyword**](docs/CourtStandardsApiApi.md#getCaseTypesByKeyword) | **GET** /masterData/caseType | Case Type Object.
*CourtStandardsApiApi* | [**getCauseOfAction**](docs/CourtStandardsApiApi.md#getCauseOfAction) | **GET** /masterData/causeOfAction/{causeOfActionId} | CauseOfAction Object for the given causeOfActionId.
*CourtStandardsApiApi* | [**getCauseOfActionAdditionalData**](docs/CourtStandardsApiApi.md#getCauseOfActionAdditionalData) | **GET** /masterData/causeOfActionAdditionalData | CauseOfActionAdditionaData Object.
*CourtStandardsApiApi* | [**getCauseOfActionAdditionalData_0**](docs/CourtStandardsApiApi.md#getCauseOfActionAdditionalData_0) | **GET** /masterData/causeOfActionAdditionalData/{causeOfActionAdditionalDataId} | CauseOfActionAdditionalData Object for the given causeOfActionAdditionalDataId.
*CourtStandardsApiApi* | [**getCauseOfActionByKeyword**](docs/CourtStandardsApiApi.md#getCauseOfActionByKeyword) | **GET** /masterData/causeOfAction | CauseOfAction Object.
*CourtStandardsApiApi* | [**getCauseOfActionGroup**](docs/CourtStandardsApiApi.md#getCauseOfActionGroup) | **GET** /masterData/causeOfActionGroup | CauseOfActionGroup Object.
*CourtStandardsApiApi* | [**getCauseOfActionGroup_0**](docs/CourtStandardsApiApi.md#getCauseOfActionGroup_0) | **GET** /masterData/causeOfActionGroup/{causeOfActionGroupId} | CauseOfActionGroup Object for the given causeOfActionGroupId.
*CourtStandardsApiApi* | [**getChargeAdditionalData**](docs/CourtStandardsApiApi.md#getChargeAdditionalData) | **GET** /masterData/chargeAdditionalData/{chargeAdditionalDataId} | Charge Additional Data Object for the given chargeAdditionalDataId.
*CourtStandardsApiApi* | [**getChargeById**](docs/CourtStandardsApiApi.md#getChargeById) | **GET** /masterData/charge/{chargeId} | Charge Object for the given chargeId.
*CourtStandardsApiApi* | [**getChargeDegreeById**](docs/CourtStandardsApiApi.md#getChargeDegreeById) | **GET** /masterData/chargeDegree/{chargeDegreeId} | ChargeDegree Object for the given chargeDegreeId.
*CourtStandardsApiApi* | [**getChargeDegreeUsingKeywordExpression**](docs/CourtStandardsApiApi.md#getChargeDegreeUsingKeywordExpression) | **GET** /masterData/chargeDegree | ChargeDegree Object.
*CourtStandardsApiApi* | [**getChargeGroup**](docs/CourtStandardsApiApi.md#getChargeGroup) | **GET** /masterData/chargeGroup/{chargeGroupId} | Charge Group Object for the given chargeGroupId.
*CourtStandardsApiApi* | [**getChargeGroupsByKeyword**](docs/CourtStandardsApiApi.md#getChargeGroupsByKeyword) | **GET** /masterData/chargeGroup | Charge Group Object.
*CourtStandardsApiApi* | [**getChargeSeverity**](docs/CourtStandardsApiApi.md#getChargeSeverity) | **GET** /masterData/chargeSeverity/{chargeSeverityId} | ChargeSeverity Object for the given chargeSeverityId.
*CourtStandardsApiApi* | [**getChargeSeverityByKeyword**](docs/CourtStandardsApiApi.md#getChargeSeverityByKeyword) | **GET** /masterData/chargeSeverity | ChargeSeverity Object.
*CourtStandardsApiApi* | [**getChargesUsingKeyword**](docs/CourtStandardsApiApi.md#getChargesUsingKeyword) | **GET** /masterData/charge | Charge Object.
*CourtStandardsApiApi* | [**getCourtLocation**](docs/CourtStandardsApiApi.md#getCourtLocation) | **GET** /masterData/courtLocation | Courthouse Object.
*CourtStandardsApiApi* | [**getCourtLocationObject**](docs/CourtStandardsApiApi.md#getCourtLocationObject) | **GET** /masterData/courtLocation/{courtLocationId} | Courthouse Object for given Court Location Id.
*CourtStandardsApiApi* | [**getCourtLocations**](docs/CourtStandardsApiApi.md#getCourtLocations) | **GET** /masterData/court/{courtId}/courtLocations | Associated Court Location for given courtId.
*CourtStandardsApiApi* | [**getCourtObject**](docs/CourtStandardsApiApi.md#getCourtObject) | **GET** /masterData/court/{courtId} | Court Object for given courtId.
*CourtStandardsApiApi* | [**getCourtServiceStatus**](docs/CourtStandardsApiApi.md#getCourtServiceStatus) | **GET** /masterData/courtServiceStatus | Court Service Status Object.
*CourtStandardsApiApi* | [**getCourtServiceStatusById**](docs/CourtStandardsApiApi.md#getCourtServiceStatusById) | **GET** /masterData/courtServiceStatus/{courtServiceStatusId} | Court Service Status Object for the given courtServiceStatusId.
*CourtStandardsApiApi* | [**getCourtSystem**](docs/CourtStandardsApiApi.md#getCourtSystem) | **GET** /masterData/courtSystem/{courtSystemId} | Court System Object for given courtSystemId.
*CourtStandardsApiApi* | [**getCourtTypeObject**](docs/CourtStandardsApiApi.md#getCourtTypeObject) | **GET** /masterData/courtType/{courtTypeId} | Court Type Object for given courtTypeId.
*CourtStandardsApiApi* | [**getCourtTypes**](docs/CourtStandardsApiApi.md#getCourtTypes) | **GET** /masterData/courtType | Court Type Objects.
*CourtStandardsApiApi* | [**getCourts**](docs/CourtStandardsApiApi.md#getCourts) | **GET** /masterData/court | Court Objects.
*CourtStandardsApiApi* | [**getCourtsByLocation**](docs/CourtStandardsApiApi.md#getCourtsByLocation) | **GET** /masterData/courtLocation/{courtLocationId}/courts | Associated Court for given Court Location.
*CourtStandardsApiApi* | [**getJudgeTypeObject**](docs/CourtStandardsApiApi.md#getJudgeTypeObject) | **GET** /masterData/judgeType | Judge Type Object.
*CourtStandardsApiApi* | [**getJudgeTypeObjectById**](docs/CourtStandardsApiApi.md#getJudgeTypeObjectById) | **GET** /masterData/judgeType/{judgeTypeId} | Judge Type Object for the given judgeTypeId.
*CourtStandardsApiApi* | [**getJurisdictionGeo**](docs/CourtStandardsApiApi.md#getJurisdictionGeo) | **GET** /masterData/jurisdictionGeo/{jurisdictionGeoId} | Jurisdiction Geo Object for given Jurisdiction Geo Id.
*CourtStandardsApiApi* | [**getJurisdictionGeoForCourt**](docs/CourtStandardsApiApi.md#getJurisdictionGeoForCourt) | **GET** /masterData/jurisdictionGeo | Jurisdiction Geo Object.
*CourtStandardsApiApi* | [**getJurisdictionGeoObjectsForCourt**](docs/CourtStandardsApiApi.md#getJurisdictionGeoObjectsForCourt) | **GET** /masterData/court/{courtId}/jurisdictionGeo | Jurisdiction Geo Objects for given courtId.
*CourtStandardsApiApi* | [**getPartyRole**](docs/CourtStandardsApiApi.md#getPartyRole) | **GET** /masterData/partyRole/{partyRoleId} | Party Role Object.
*CourtStandardsApiApi* | [**getPartyRoleGroup**](docs/CourtStandardsApiApi.md#getPartyRoleGroup) | **GET** /masterData/partyRoleGroup/{partyRoleGroupId} | Party Role Group Object.
*CourtStandardsApiApi* | [**getPartyRoleGroups**](docs/CourtStandardsApiApi.md#getPartyRoleGroups) | **GET** /masterData/partyRoleGroup | Party Role Group Object.
*CourtStandardsApiApi* | [**getPartyRolesByKeyword**](docs/CourtStandardsApiApi.md#getPartyRolesByKeyword) | **GET** /masterData/partyRole | Party Role Object.
*CourtStandardsApiApi* | [**listAreaOfLaw**](docs/CourtStandardsApiApi.md#listAreaOfLaw) | **GET** /masterData/areaOfLaw | AreaOfLaw Object.
*CourtStandardsApiApi* | [**listCaseTypeGroups**](docs/CourtStandardsApiApi.md#listCaseTypeGroups) | **GET** /masterData/caseTypeGroup | CaseTypeGroup Object.
*CourtStandardsApiApi* | [**listCourtSystems**](docs/CourtStandardsApiApi.md#listCourtSystems) | **GET** /masterData/courtSystem | Court System Objects.
*JudgeAnalyticsApiApi* | [**getAssociatedNormParties**](docs/JudgeAnalyticsApiApi.md#getAssociatedNormParties) | **GET** /normJudge/{normJudgeId}/associatedNormParties | Parties Associated with the Judge.
*JudgeAnalyticsApiApi* | [**getNormJudgeDetails**](docs/JudgeAnalyticsApiApi.md#getNormJudgeDetails) | **GET** /normJudge/{normJudgeId} | Norm Judge Details.
*JudgeAnalyticsApiApi* | [**getNormJudgeSearchResultsById**](docs/JudgeAnalyticsApiApi.md#getNormJudgeSearchResultsById) | **GET** /normJudgeSearch/{normJudgeSearchId} | Norm judge search results for a given normJudgeSearchId.
*JudgeAnalyticsApiApi* | [**listAssociatedNormAttorneys**](docs/JudgeAnalyticsApiApi.md#listAssociatedNormAttorneys) | **GET** /normJudge/{normJudgeId}/associatedNormAttorneys | Attorneys Associated with the Judge.
*JudgeAnalyticsApiApi* | [**listLawFirmsAssociatedWithJudge**](docs/JudgeAnalyticsApiApi.md#listLawFirmsAssociatedWithJudge) | **GET** /normJudge/{normJudgeId}/associatedNormLawFirms | Law Firms Associated With the Judge.
*JudgeAnalyticsApiApi* | [**searchNormJudges**](docs/JudgeAnalyticsApiApi.md#searchNormJudges) | **GET** /normJudgeSearch | Judge search.
*LawFirmAnalyticsApiApi* | [**getAssociatedNormJudges**](docs/LawFirmAnalyticsApiApi.md#getAssociatedNormJudges) | **GET** /normLawFirm/{normLawFirmId}/associatedNormJudges | Judges Faced By the Law Firm.
*LawFirmAnalyticsApiApi* | [**getNormLawFirmById**](docs/LawFirmAnalyticsApiApi.md#getNormLawFirmById) | **GET** /normLawFirm/{normLawFirmId} | Norm LawFirm Details.
*LawFirmAnalyticsApiApi* | [**getNormLawFirmSearchResultById**](docs/LawFirmAnalyticsApiApi.md#getNormLawFirmSearchResultById) | **GET** /normLawFirmSearch/{normLawFirmSearchId} | Norm law firm search result for a given normLawFirmSearchId.
*LawFirmAnalyticsApiApi* | [**listAssociatedNormAttorneys**](docs/LawFirmAnalyticsApiApi.md#listAssociatedNormAttorneys) | **GET** /normLawFirm/{normLawFirmId}/associatedNormAttorneys | Attorneys working for the Law Firm.
*LawFirmAnalyticsApiApi* | [**listAssociatedNormParties**](docs/LawFirmAnalyticsApiApi.md#listAssociatedNormParties) | **GET** /normLawFirm/{normLawFirmId}/associatedNormParties | Parties Represented by the Law Firm.
*LawFirmAnalyticsApiApi* | [**searchLawFirms**](docs/LawFirmAnalyticsApiApi.md#searchLawFirms) | **GET** /normLawFirmSearch | Law firm search.
*PacerApiApi* | [**importPacerCaseByCourtUsingCaseNumberGet**](docs/PacerApiApi.md#importPacerCaseByCourtUsingCaseNumberGet) | **GET** /pacer/importCaseByCourtUsingCaseNumber | Find PACER Case for a requested Case Number and Court.
*PacerApiApi* | [**searchAllCourtsCases**](docs/PacerApiApi.md#searchAllCourtsCases) | **GET** /pacerCaseLocator/caseSearch/allCourts | PACER Case Locator Search API for All Courts.
*PacerApiApi* | [**searchAllCourtsCases_0**](docs/PacerApiApi.md#searchAllCourtsCases_0) | **GET** /pacerCaseLocator/partySearch/allCourts | PACER Case Locator Search API for All Courts.
*PacerApiApi* | [**searchAppealCourtsCases**](docs/PacerApiApi.md#searchAppealCourtsCases) | **GET** /pacerCaseLocator/caseSearch/appealCourts | PACER Case Locator Search API for All Courts.
*PacerApiApi* | [**searchAppealCourtsCases_0**](docs/PacerApiApi.md#searchAppealCourtsCases_0) | **GET** /pacerCaseLocator/partySearch/appealCourts | PACER Case Locator Search API for All Courts.
*PacerApiApi* | [**searchBankruptcyCases**](docs/PacerApiApi.md#searchBankruptcyCases) | **GET** /pacerCaseLocator/caseSearch/bankruptcyCourts | PACER Case Locator Search API for Bankruptcy Courts.
*PacerApiApi* | [**searchBankruptcyCourts**](docs/PacerApiApi.md#searchBankruptcyCourts) | **GET** /pacerCaseLocator/partySearch/bankruptcyCourts | PACER Case Locator Search API for All Courts.
*PacerApiApi* | [**searchCivilCases**](docs/PacerApiApi.md#searchCivilCases) | **GET** /pacerCaseLocator/caseSearch/civilCourts | PACER Case Locator Search API for All Courts.
*PacerApiApi* | [**searchCivilCasesInCourts**](docs/PacerApiApi.md#searchCivilCasesInCourts) | **GET** /pacerCaseLocator/partySearch/civilCourts | PACER Case Locator Search API for All Courts.
*PacerApiApi* | [**searchCriminalCases**](docs/PacerApiApi.md#searchCriminalCases) | **GET** /pacerCaseLocator/caseSearch/criminalCourts | PACER Case Locator Search API for All Courts.
*PacerApiApi* | [**searchCriminalCases_0**](docs/PacerApiApi.md#searchCriminalCases_0) | **GET** /pacerCaseLocator/partySearch/criminalCourts | PACER Case Locator Search API for All Courts.
*PacerApiApi* | [**searchMultiDistrictCourtCases**](docs/PacerApiApi.md#searchMultiDistrictCourtCases) | **GET** /pacerCaseLocator/caseSearch/multiDistrictCourts | PACER Case Locator Search API for All Courts.
*PacerApiApi* | [**searchMultiDistrictCourtCases_0**](docs/PacerApiApi.md#searchMultiDistrictCourtCases_0) | **GET** /pacerCaseLocator/partySearch/multiDistrictCourts | PACER Case Locator Search API for All Courts.
*PacerCredentialApiApi* | [**getPacerCredential**](docs/PacerCredentialApiApi.md#getPacerCredential) | **GET** /pacerCredential/{pacerUserId} | Get Pacer Credential for a requested pacer User Id.
*PacerCredentialApiApi* | [**listPacerCredentials**](docs/PacerCredentialApiApi.md#listPacerCredentials) | **GET** /pacerCredential | Get Pacer Credential List.
*PacerCredentialApiApi* | [**registerPacerCredential**](docs/PacerCredentialApiApi.md#registerPacerCredential) | **PUT** /pacerCredential | Add Pacer Credential.
*PacerCredentialApiApi* | [**removeForUserId**](docs/PacerCredentialApiApi.md#removeForUserId) | **DELETE** /pacerCredential/{pacerUserId} | Remove Pacer credential for a specific Pacer User Id.
*PartyAnalyticsApiApi* | [**getAssociatedNormAttorneys**](docs/PartyAnalyticsApiApi.md#getAssociatedNormAttorneys) | **GET** /normParty/{normPartyId}/associatedNormAttorneys | Attorneys that represented the Party.
*PartyAnalyticsApiApi* | [**getNormPartyDetails**](docs/PartyAnalyticsApiApi.md#getNormPartyDetails) | **GET** /normParty/{normPartyId} | Norm Party Details.
*PartyAnalyticsApiApi* | [**getNormPartySearchResultsById**](docs/PartyAnalyticsApiApi.md#getNormPartySearchResultsById) | **GET** /normPartySearch/{normPartySearchId} | Norm party search results for a given normPartySearchId.
*PartyAnalyticsApiApi* | [**listAssociatedNormLawFirms**](docs/PartyAnalyticsApiApi.md#listAssociatedNormLawFirms) | **GET** /normParty/{normPartyId}/associatedNormLawFirms | Law Firms that represented the Party.
*PartyAnalyticsApiApi* | [**listJudgesAssociatedWithNormParty**](docs/PartyAnalyticsApiApi.md#listJudgesAssociatedWithNormParty) | **GET** /normParty/{normPartyId}/associatedNormJudges | Judges Faced By the Party.
*PartyAnalyticsApiApi* | [**searchNormParties**](docs/PartyAnalyticsApiApi.md#searchNormParties) | **GET** /normPartySearch | Party search.
*UsageApiApi* | [**getApiUsageByBillingCycle**](docs/UsageApiApi.md#getApiUsageByBillingCycle) | **GET** /billingCycleUsage/{billingCycle} | Specify the billing cycle to know the API usage.
*UsageApiApi* | [**getApiUsageByDate**](docs/UsageApiApi.md#getApiUsageByDate) | **GET** /dailyUsage/{date} | Get API usage for a requested Date.
*UsageApiApi* | [**listPreviousBillingCycles**](docs/UsageApiApi.md#listPreviousBillingCycles) | **GET** /billingCycles | Get all the previous 12 billing cycles.


## Documentation for Models

 - [AccessTokenIdListResponse](docs/AccessTokenIdListResponse.md)
 - [AccessTokenIdResponse](docs/AccessTokenIdResponse.md)
 - [AccessTokenRequest](docs/AccessTokenRequest.md)
 - [AccessTokenResponse](docs/AccessTokenResponse.md)
 - [AdditionalLevels](docs/AdditionalLevels.md)
 - [Address](docs/Address.md)
 - [AreaOfLaw](docs/AreaOfLaw.md)
 - [AreaOfLawResponse](docs/AreaOfLawResponse.md)
 - [AssociatedNormAttorney](docs/AssociatedNormAttorney.md)
 - [AssociatedNormAttorneyResponse](docs/AssociatedNormAttorneyResponse.md)
 - [AssociatedNormJudge](docs/AssociatedNormJudge.md)
 - [AssociatedNormJudgeResponse](docs/AssociatedNormJudgeResponse.md)
 - [AssociatedNormLawFirm](docs/AssociatedNormLawFirm.md)
 - [AssociatedNormLawFirmResponse](docs/AssociatedNormLawFirmResponse.md)
 - [AssociatedNormParty](docs/AssociatedNormParty.md)
 - [AssociatedNormPartyResponse](docs/AssociatedNormPartyResponse.md)
 - [AssociatedSoSPerson](docs/AssociatedSoSPerson.md)
 - [Attorney](docs/Attorney.md)
 - [AttorneyAnalyticsAPI](docs/AttorneyAnalyticsAPI.md)
 - [AttorneyLawFirm](docs/AttorneyLawFirm.md)
 - [AttorneyRepresentationType](docs/AttorneyRepresentationType.md)
 - [AttorneyRepresentationTypeResponse](docs/AttorneyRepresentationTypeResponse.md)
 - [AttorneyType](docs/AttorneyType.md)
 - [AttorneyTypeResponse](docs/AttorneyTypeResponse.md)
 - [Attorneys](docs/Attorneys.md)
 - [BarRecord](docs/BarRecord.md)
 - [BarRecordPreview](docs/BarRecordPreview.md)
 - [BarSourceData](docs/BarSourceData.md)
 - [BarSourceDataAdministrativeActionsArrayInner](docs/BarSourceDataAdministrativeActionsArrayInner.md)
 - [BarSourceDataAdvancedDegreeArrayInner](docs/BarSourceDataAdvancedDegreeArrayInner.md)
 - [BarSourceDataBarStatusArrayInner](docs/BarSourceDataBarStatusArrayInner.md)
 - [BarSourceDataBoardCertificationsArrayInner](docs/BarSourceDataBoardCertificationsArrayInner.md)
 - [BarSourceDataCommitteesArrayInner](docs/BarSourceDataCommitteesArrayInner.md)
 - [BarSourceDataCourtHistoryArrayInner](docs/BarSourceDataCourtHistoryArrayInner.md)
 - [BarSourceDataCourtOfAdmissions](docs/BarSourceDataCourtOfAdmissions.md)
 - [BarSourceDataDisciplinaryHistoryArrayInner](docs/BarSourceDataDisciplinaryHistoryArrayInner.md)
 - [BarSourceDataDisciplineSummariesArrayInner](docs/BarSourceDataDisciplineSummariesArrayInner.md)
 - [BarSourceDataEmploymentHistoryArrayInner](docs/BarSourceDataEmploymentHistoryArrayInner.md)
 - [BarSourceDataFeesOptionsArrayInner](docs/BarSourceDataFeesOptionsArrayInner.md)
 - [BarSourceDataInvolvementsArrayInner](docs/BarSourceDataInvolvementsArrayInner.md)
 - [BarSourceDataLawSchoolArrayInner](docs/BarSourceDataLawSchoolArrayInner.md)
 - [BarSourceDataName](docs/BarSourceDataName.md)
 - [BarSourceDataOpenActionStatusArrayInner](docs/BarSourceDataOpenActionStatusArrayInner.md)
 - [BarSourceDataOtherJurisdictionArrayInner](docs/BarSourceDataOtherJurisdictionArrayInner.md)
 - [BarSourceDataPublicHearingArrayInner](docs/BarSourceDataPublicHearingArrayInner.md)
 - [BarSourceDataReasonForInactivation](docs/BarSourceDataReasonForInactivation.md)
 - [BarSourceDataRelatedCasesArrayInner](docs/BarSourceDataRelatedCasesArrayInner.md)
 - [BarSourceDataSourceInfo](docs/BarSourceDataSourceInfo.md)
 - [BarSourceDataStatewideGrievanceCommitteeHistoryArrayInner](docs/BarSourceDataStatewideGrievanceCommitteeHistoryArrayInner.md)
 - [BarSourceDataStatusHistoryArrayInner](docs/BarSourceDataStatusHistoryArrayInner.md)
 - [BarSourceDataTenYearDisciplineArrayInner](docs/BarSourceDataTenYearDisciplineArrayInner.md)
 - [BillingCycleUsageResponse](docs/BillingCycleUsageResponse.md)
 - [BillingCycleUsageResponseApiCallsBillable](docs/BillingCycleUsageResponseApiCallsBillable.md)
 - [BillingCycleUsageResponseApiCallsCredited](docs/BillingCycleUsageResponseApiCallsCredited.md)
 - [BillingCycleUsageResponseApiCallsMade](docs/BillingCycleUsageResponseApiCallsMade.md)
 - [BillingCycleUsageResponseBillingCycle](docs/BillingCycleUsageResponseBillingCycle.md)
 - [BillingCyclesResponse](docs/BillingCyclesResponse.md)
 - [CallbackListResponse](docs/CallbackListResponse.md)
 - [CallbackListResponseCaseDocumentOrderCallbacks](docs/CallbackListResponseCaseDocumentOrderCallbacks.md)
 - [CallbackListResponseCaseExportCallbacks](docs/CallbackListResponseCaseExportCallbacks.md)
 - [CaseAnalyticsAPI](docs/CaseAnalyticsAPI.md)
 - [CaseCauseOfAction](docs/CaseCauseOfAction.md)
 - [CaseCharge](docs/CaseCharge.md)
 - [CaseClass](docs/CaseClass.md)
 - [CaseClassCoverage](docs/CaseClassCoverage.md)
 - [CaseClassResponse](docs/CaseClassResponse.md)
 - [CaseCountAnalyticsByAreaOfLaw](docs/CaseCountAnalyticsByAreaOfLaw.md)
 - [CaseCountAnalyticsByAreaOfLawResponse](docs/CaseCountAnalyticsByAreaOfLawResponse.md)
 - [CaseCountAnalyticsByCaseClass](docs/CaseCountAnalyticsByCaseClass.md)
 - [CaseCountAnalyticsByCaseClassResponse](docs/CaseCountAnalyticsByCaseClassResponse.md)
 - [CaseCountAnalyticsByCaseFiledDate](docs/CaseCountAnalyticsByCaseFiledDate.md)
 - [CaseCountAnalyticsByCaseFiledDateResponse](docs/CaseCountAnalyticsByCaseFiledDateResponse.md)
 - [CaseCountAnalyticsByCaseType](docs/CaseCountAnalyticsByCaseType.md)
 - [CaseCountAnalyticsByCaseTypeGroup](docs/CaseCountAnalyticsByCaseTypeGroup.md)
 - [CaseCountAnalyticsByCaseTypeGroupResponse](docs/CaseCountAnalyticsByCaseTypeGroupResponse.md)
 - [CaseCountAnalyticsByCaseTypeResponse](docs/CaseCountAnalyticsByCaseTypeResponse.md)
 - [CaseCountAnalyticsByCourt](docs/CaseCountAnalyticsByCourt.md)
 - [CaseCountAnalyticsByCourtGeo](docs/CaseCountAnalyticsByCourtGeo.md)
 - [CaseCountAnalyticsByCourtLocation](docs/CaseCountAnalyticsByCourtLocation.md)
 - [CaseCountAnalyticsByCourtLocationResponse](docs/CaseCountAnalyticsByCourtLocationResponse.md)
 - [CaseCountAnalyticsByCourtResponse](docs/CaseCountAnalyticsByCourtResponse.md)
 - [CaseCountAnalyticsByCourtSystem](docs/CaseCountAnalyticsByCourtSystem.md)
 - [CaseCountAnalyticsByCourtSystemResponse](docs/CaseCountAnalyticsByCourtSystemResponse.md)
 - [CaseCountAnalyticsByCourtType](docs/CaseCountAnalyticsByCourtType.md)
 - [CaseCountAnalyticsByCourtTypeResponse](docs/CaseCountAnalyticsByCourtTypeResponse.md)
 - [CaseCountAnalyticsByJurisdictionGeo](docs/CaseCountAnalyticsByJurisdictionGeo.md)
 - [CaseCountAnalyticsByJurisdictionGeoResponse](docs/CaseCountAnalyticsByJurisdictionGeoResponse.md)
 - [CaseCountAnalyticsByNormAttorney](docs/CaseCountAnalyticsByNormAttorney.md)
 - [CaseCountAnalyticsByNormAttorneyResponse](docs/CaseCountAnalyticsByNormAttorneyResponse.md)
 - [CaseCountAnalyticsByNormJudge](docs/CaseCountAnalyticsByNormJudge.md)
 - [CaseCountAnalyticsByNormJudgeResponse](docs/CaseCountAnalyticsByNormJudgeResponse.md)
 - [CaseCountAnalyticsByNormLawFirm](docs/CaseCountAnalyticsByNormLawFirm.md)
 - [CaseCountAnalyticsByNormLawFirmResponse](docs/CaseCountAnalyticsByNormLawFirmResponse.md)
 - [CaseCountAnalyticsByNormParty](docs/CaseCountAnalyticsByNormParty.md)
 - [CaseCountAnalyticsByNormPartyResponse](docs/CaseCountAnalyticsByNormPartyResponse.md)
 - [CaseCountAnalyticsByPartyRole](docs/CaseCountAnalyticsByPartyRole.md)
 - [CaseCountAnalyticsByPartyRoleGroup](docs/CaseCountAnalyticsByPartyRoleGroup.md)
 - [CaseCountAnalyticsByPartyRoleGroupResponse](docs/CaseCountAnalyticsByPartyRoleGroupResponse.md)
 - [CaseCountAnalyticsByPartyRoleResponse](docs/CaseCountAnalyticsByPartyRoleResponse.md)
 - [CaseDocument](docs/CaseDocument.md)
 - [CaseDocumentOrderCallback](docs/CaseDocumentOrderCallback.md)
 - [CaseDocumentOrderCallbackListResponse](docs/CaseDocumentOrderCallbackListResponse.md)
 - [CaseDocumentOrderPacerOptions](docs/CaseDocumentOrderPacerOptions.md)
 - [CaseDocumentOrderRequest](docs/CaseDocumentOrderRequest.md)
 - [CaseDocuments](docs/CaseDocuments.md)
 - [CaseExportCallback](docs/CaseExportCallback.md)
 - [CaseExportCallbackListResponse](docs/CaseExportCallbackListResponse.md)
 - [CaseRelationshipType](docs/CaseRelationshipType.md)
 - [CaseRelationshipTypeResponse](docs/CaseRelationshipTypeResponse.md)
 - [CaseSearchResponse](docs/CaseSearchResponse.md)
 - [CaseSearchResult](docs/CaseSearchResult.md)
 - [CaseStats](docs/CaseStats.md)
 - [CaseStatus](docs/CaseStatus.md)
 - [CaseStatusGroup](docs/CaseStatusGroup.md)
 - [CaseStatusGroupResponse](docs/CaseStatusGroupResponse.md)
 - [CaseStatusResponse](docs/CaseStatusResponse.md)
 - [CaseTimeline](docs/CaseTimeline.md)
 - [CaseTrack](docs/CaseTrack.md)
 - [CaseTrackListResponse](docs/CaseTrackListResponse.md)
 - [CaseTrackPreview](docs/CaseTrackPreview.md)
 - [CaseTrackRequest](docs/CaseTrackRequest.md)
 - [CaseTrackSchedule](docs/CaseTrackSchedule.md)
 - [CaseType](docs/CaseType.md)
 - [CaseTypeGroup](docs/CaseTypeGroup.md)
 - [CaseTypeGroupResponse](docs/CaseTypeGroupResponse.md)
 - [CaseTypeResponse](docs/CaseTypeResponse.md)
 - [CaseUpdate](docs/CaseUpdate.md)
 - [CaseUpdateListResponse](docs/CaseUpdateListResponse.md)
 - [CaseUpdatePacerOptions](docs/CaseUpdatePacerOptions.md)
 - [CaseUpdatePacerOptionsAdditionalPageArrayInner](docs/CaseUpdatePacerOptionsAdditionalPageArrayInner.md)
 - [CaseUpdatePacerOptionsResponse](docs/CaseUpdatePacerOptionsResponse.md)
 - [CaseUpdatePacerOptionsResponseAdditionalPageArrayInner](docs/CaseUpdatePacerOptionsResponseAdditionalPageArrayInner.md)
 - [CaseUpdatePreview](docs/CaseUpdatePreview.md)
 - [CaseUpdateRequest](docs/CaseUpdateRequest.md)
 - [CauseOfAction](docs/CauseOfAction.md)
 - [CauseOfActionAdditionalData](docs/CauseOfActionAdditionalData.md)
 - [CauseOfActionAdditionalDataResponse](docs/CauseOfActionAdditionalDataResponse.md)
 - [CauseOfActionGroup](docs/CauseOfActionGroup.md)
 - [CauseOfActionGroupResponse](docs/CauseOfActionGroupResponse.md)
 - [CauseOfActionResponse](docs/CauseOfActionResponse.md)
 - [Charge](docs/Charge.md)
 - [ChargeAdditionalData](docs/ChargeAdditionalData.md)
 - [ChargeAdditionalDataResponse](docs/ChargeAdditionalDataResponse.md)
 - [ChargeDegree](docs/ChargeDegree.md)
 - [ChargeDegreeResponse](docs/ChargeDegreeResponse.md)
 - [ChargeGroup](docs/ChargeGroup.md)
 - [ChargeGroupResponse](docs/ChargeGroupResponse.md)
 - [ChargeResponse](docs/ChargeResponse.md)
 - [ChargeSeverity](docs/ChargeSeverity.md)
 - [ChargeSeverityResponse](docs/ChargeSeverityResponse.md)
 - [Contact](docs/Contact.md)
 - [Court](docs/Court.md)
 - [CourtCoverage](docs/CourtCoverage.md)
 - [CourtLocation](docs/CourtLocation.md)
 - [CourtLocationResponse](docs/CourtLocationResponse.md)
 - [CourtResponse](docs/CourtResponse.md)
 - [CourtServiceStatus](docs/CourtServiceStatus.md)
 - [CourtServiceStatusResponse](docs/CourtServiceStatusResponse.md)
 - [CourtSystem](docs/CourtSystem.md)
 - [CourtSystemResponse](docs/CourtSystemResponse.md)
 - [CourtType](docs/CourtType.md)
 - [CourtTypeResponse](docs/CourtTypeResponse.md)
 - [DailyUsageResponse](docs/DailyUsageResponse.md)
 - [DailyUsageResponseApiCallsBillable](docs/DailyUsageResponseApiCallsBillable.md)
 - [DailyUsageResponseApiCallsCredited](docs/DailyUsageResponseApiCallsCredited.md)
 - [DailyUsageResponseApiCallsMade](docs/DailyUsageResponseApiCallsMade.md)
 - [DocketEntries](docs/DocketEntries.md)
 - [DocketEntry](docs/DocketEntry.md)
 - [DocketEntryPrimaryDocuments](docs/DocketEntryPrimaryDocuments.md)
 - [DocketEntrySecondaryDocuments](docs/DocketEntrySecondaryDocuments.md)
 - [DocumentDownload](docs/DocumentDownload.md)
 - [Email](docs/Email.md)
 - [ExportFile](docs/ExportFile.md)
 - [ExtractedFields](docs/ExtractedFields.md)
 - [Hearing](docs/Hearing.md)
 - [Hearings](docs/Hearings.md)
 - [IndividualProperty](docs/IndividualProperty.md)
 - [InvalidateAccessTokenRequest](docs/InvalidateAccessTokenRequest.md)
 - [Judge](docs/Judge.md)
 - [JudgeAnalyticsAPI](docs/JudgeAnalyticsAPI.md)
 - [JudgeType](docs/JudgeType.md)
 - [JudgeTypeResponse](docs/JudgeTypeResponse.md)
 - [Judges](docs/Judges.md)
 - [JurisdictionGeo](docs/JurisdictionGeo.md)
 - [JurisdictionGeoResponse](docs/JurisdictionGeoResponse.md)
 - [LastTrackedDetails](docs/LastTrackedDetails.md)
 - [LawFirmAnalyticsAPI](docs/LawFirmAnalyticsAPI.md)
 - [MatchedObject](docs/MatchedObject.md)
 - [ModelCase](docs/ModelCase.md)
 - [NatureOfSuit](docs/NatureOfSuit.md)
 - [NormAttorney](docs/NormAttorney.md)
 - [NormAttorneySearchResponse](docs/NormAttorneySearchResponse.md)
 - [NormAttorneySearchResult](docs/NormAttorneySearchResult.md)
 - [NormCorporateGroup](docs/NormCorporateGroup.md)
 - [NormJudge](docs/NormJudge.md)
 - [NormJudgePublicData](docs/NormJudgePublicData.md)
 - [NormJudgePublicDataAbaRatings](docs/NormJudgePublicDataAbaRatings.md)
 - [NormJudgePublicDataBio](docs/NormJudgePublicDataBio.md)
 - [NormJudgePublicDataEducationArrayInner](docs/NormJudgePublicDataEducationArrayInner.md)
 - [NormJudgePublicDataJudicialSource](docs/NormJudgePublicDataJudicialSource.md)
 - [NormJudgePublicDataNameHistoryArrayInner](docs/NormJudgePublicDataNameHistoryArrayInner.md)
 - [NormJudgeSearchResponse](docs/NormJudgeSearchResponse.md)
 - [NormJudgeSearchResult](docs/NormJudgeSearchResult.md)
 - [NormLawFirm](docs/NormLawFirm.md)
 - [NormLawFirmSearchResponse](docs/NormLawFirmSearchResponse.md)
 - [NormLawFirmSearchResult](docs/NormLawFirmSearchResult.md)
 - [NormOrganization](docs/NormOrganization.md)
 - [NormOrganizationTickerArrayInner](docs/NormOrganizationTickerArrayInner.md)
 - [NormParty](docs/NormParty.md)
 - [NormPartySearchResponse](docs/NormPartySearchResponse.md)
 - [NormPartySearchResult](docs/NormPartySearchResult.md)
 - [PACERCaseSearchContent](docs/PACERCaseSearchContent.md)
 - [PACERCaseSearchResults](docs/PACERCaseSearchResults.md)
 - [PACERImportCase](docs/PACERImportCase.md)
 - [PACERImportCaseResults](docs/PACERImportCaseResults.md)
 - [PACERPartySearchContent](docs/PACERPartySearchContent.md)
 - [PACERPartySearchResults](docs/PACERPartySearchResults.md)
 - [PACERSearchPageInfo](docs/PACERSearchPageInfo.md)
 - [PACERSearchReceipt](docs/PACERSearchReceipt.md)
 - [PCLCase](docs/PCLCase.md)
 - [PCLParty](docs/PCLParty.md)
 - [PacerCredential](docs/PacerCredential.md)
 - [PacerCredentialListResponse](docs/PacerCredentialListResponse.md)
 - [PacerCredentialRequest](docs/PacerCredentialRequest.md)
 - [Parties](docs/Parties.md)
 - [Party](docs/Party.md)
 - [PartyAnalyticsAPI](docs/PartyAnalyticsAPI.md)
 - [PartyAttorneyAssociation](docs/PartyAttorneyAssociation.md)
 - [PartyAttorneyAssociations](docs/PartyAttorneyAssociations.md)
 - [PartyRole](docs/PartyRole.md)
 - [PartyRoleGroup](docs/PartyRoleGroup.md)
 - [PartyRoleGroupResponse](docs/PartyRoleGroupResponse.md)
 - [PartyRoleResponse](docs/PartyRoleResponse.md)
 - [Phone](docs/Phone.md)
 - [PossibleNormAttorney](docs/PossibleNormAttorney.md)
 - [PossibleNormAttorneyScoreConstituents](docs/PossibleNormAttorneyScoreConstituents.md)
 - [PossibleNormJudge](docs/PossibleNormJudge.md)
 - [PossibleNormJudgeScoreConstituents](docs/PossibleNormJudgeScoreConstituents.md)
 - [PossibleNormLawFirm](docs/PossibleNormLawFirm.md)
 - [PossibleNormLawFirmScoreConstituents](docs/PossibleNormLawFirmScoreConstituents.md)
 - [PossibleNormLawFirmSourceDetails](docs/PossibleNormLawFirmSourceDetails.md)
 - [PossibleNormParty](docs/PossibleNormParty.md)
 - [PossibleNormPartyScoreConstituents](docs/PossibleNormPartyScoreConstituents.md)
 - [PreviewDocument](docs/PreviewDocument.md)
 - [RawOrderedData](docs/RawOrderedData.md)
 - [RawOrderedDataChild](docs/RawOrderedDataChild.md)
 - [RawOrderedDataChildChildArrayInner](docs/RawOrderedDataChildChildArrayInner.md)
 - [ReferencedDocketNumber](docs/ReferencedDocketNumber.md)
 - [RelatedCase](docs/RelatedCase.md)
 - [RelatedCases](docs/RelatedCases.md)
 - [RelatedNormParty](docs/RelatedNormParty.md)
 - [SOSAssociatedNormOrganization](docs/SOSAssociatedNormOrganization.md)
 - [SOSData](docs/SOSData.md)
 - [SOSDataPreview](docs/SOSDataPreview.md)
 - [SOSNameChange](docs/SOSNameChange.md)
 - [Schedule](docs/Schedule.md)
 - [ServiceHistory](docs/ServiceHistory.md)
 - [ServiceStatus](docs/ServiceStatus.md)
 - [ServiceStatusDownDetails](docs/ServiceStatusDownDetails.md)
 - [SimilarNormAttorney](docs/SimilarNormAttorney.md)
 - [SourceCaseData](docs/SourceCaseData.md)
 - [SourceCauseOfAction](docs/SourceCauseOfAction.md)
 - [SourceCharge](docs/SourceCharge.md)
 - [SourceChargeAdditionalData](docs/SourceChargeAdditionalData.md)
 - [SourcePageData](docs/SourcePageData.md)
 - [SourceStructuredData](docs/SourceStructuredData.md)
 - [Success](docs/Success.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
