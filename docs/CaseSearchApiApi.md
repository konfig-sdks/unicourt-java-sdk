# CaseSearchApiApi

All URIs are relative to *https://enterpriseapi.unicourt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSearchResultsByCaseSearchId**](CaseSearchApiApi.md#getSearchResultsByCaseSearchId) | **GET** /caseSearch/{caseSearchId} | Case search results for a given caseSearchId. |
| [**searchByKeywordExpressions**](CaseSearchApiApi.md#searchByKeywordExpressions) | **GET** /caseSearch | Case search. |


<a name="getSearchResultsByCaseSearchId"></a>
# **getSearchResultsByCaseSearchId**
> CaseSearchResponse getSearchResultsByCaseSearchId(caseSearchId).pageNumber(pageNumber).execute();

Case search results for a given caseSearchId.

Retrieve the search results corresponding to the specified caseSearchId value. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseSearchApiApi;
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
    String caseSearchId = "CSRCU3qFUH8BjLnba5"; // Case Search information for the given caseSearchId.
    Integer pageNumber = 1; // Query parameter specifying the page number of the search results to be retrieved. - Minimum: 1 - Maximum: 1000 
    try {
      CaseSearchResponse result = client
              .caseSearchApi
              .getSearchResultsByCaseSearchId(caseSearchId)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseSearchId());
      System.out.println(result.getCaseSearchResultArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getQ());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseSearchApiApi#getSearchResultsByCaseSearchId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseSearchResponse> response = client
              .caseSearchApi
              .getSearchResultsByCaseSearchId(caseSearchId)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseSearchApiApi#getSearchResultsByCaseSearchId");
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
| **caseSearchId** | **String**| Case Search information for the given caseSearchId. | |
| **pageNumber** | **Integer**| Query parameter specifying the page number of the search results to be retrieved. - Minimum: 1 - Maximum: 1000  | [optional] |

### Return type

[**CaseSearchResponse**](CaseSearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="searchByKeywordExpressions"></a>
# **searchByKeywordExpressions**
> CaseSearchResponse searchByKeywordExpressions(q).sort(sort).order(order).pageNumber(pageNumber).execute();

Case search.

This endpoint retrieves cases according to keyword expressions you provide. &lt;br&gt; Keyword expressions are constructed according to the rules described below. &lt;br&gt;&lt;br&gt; This API supports multiple use cases:   - Search for multiple keywords  &#x60;Google OR Facebook&#x60;.   - Search within particular attributes.   - Relational search using terms and connectors.   - And much more. ----  ## Allowed Connectors in Keyword Expressions | Connector | Description  | Example | | ------| ------|------| | **AND** |Find cases containing each of the terms joined by AND connectors.|**personal AND injury**| | **OR**  |Find cases containing any of the terms joined by OR connectors.|**order OR decision**| | **NOT** |Find cases that do not contain the specified term.|**personal AND NOT injury**.  Find cases with the word “personal” and not “injury”.| | **“[phrase]”** |Find the exact phrase placed between the quotation marks.|**\&quot;personal injury”**| | **~**  |Find cases in which the specified words appear near each other. For example, \&quot;personal injury\&quot; ~ 5 targets cases in which the word \&quot;personal\&quot; appears within 5 words of the word \&quot;injury\&quot;.|**“personal injury” ~ 5** - Find cases with “personal” within five words of “injury”. | | **( … )** |Specifies the order in which connectors are to be appliied in a keyword expression.| **personal AND (injury OR fall)** - Find cases with the word personal injury or personal fall.|  &lt;br&gt;&lt;br&gt; ## Fields and Connectors Searching | Filed | Description  | Example | | ------| ------|------| |**caseNumber** |Find cases with the specified case number (i.e., docket number).| **caseNumber:\&quot;2020-L-007212\&quot;** - Find cases whose case number matches given case number number.| |**caseName** |Find cases with the specified case title.| **caseName:\&quot;THOMAS P. CARNEY, INC. VS BEHLER JAMES Et Al\&quot;** - Find cases whose case name matches given terms.| |**Court**|Find cases in the specified court.|**(Court:(name:(New York)))** - Find cases in New York state.&lt;br&gt;| |**CaseStatus**|Find cases witih the specified case status.|**(CaseStatus:(name:Disposed))** - All disposed cases.&lt;br&gt;| |**CaseType**|Find cases of the specified case type. | **(CaseType:(name:Property))** - Cases with case type “property”.| |**Party** | Find cases involving the specified party.| **(Party:(name:Apple))** - Find cases involving Apple. | |**partyId**|Find cases involving a party with the specified partyId value.|**(Party:(partyId:\&quot;PRTYgu1ffe866484c2\&quot;))**| |**PartyRole** | Find cases in which at least one party has the specified party role. | **(Party:((PartyRole:(name:\&quot;plaintiff\&quot;))))** - Find cases with party role “plaintiff”.&lt;br&gt;&lt;br&gt; **(Party:((PartyRole:(name:defendant)) AND (AttorneyRepresentationType:(name:(Attorney represented)))))** - Find cases where a party is acting as defendant and represented by an attorney.| |**AttorneyRepresentationType**| Find cases in which at least one party has the specified attorney representation type.|**(Party:(AttorneyRepresentationType:(name:\&quot;attorney represented\&quot;)))** - Find cases where a party is represented by an attorney. | |**Attorney** | Find cases involving the specified attorney. | **(Attorney:(name:\&quot;David Boies\&quot;))** - Find cases involving the attorney David Boies. | |**AttorneyType**|Find cases involving at least one attorney of the specified attorney type.|**(Attorney:((AttorneyType:(name:\&quot;Lead Attorney\&quot;))))**| |**Judge** |Find cases involving the specified judge. | **(Judge:(name:\&quot;Posner\&quot;))** - Find cases involving Judge Posner.| |**JudgeType**|Find cases involving at least one judge of the specified judge type.|**(Judge:((JudgeType:(name:\&quot;Magistrate\&quot;))))**| |**CaseStats**|Find cases with the specified case statistics.|**(CaseStats:(partyCount:[10 TO 100]))** - Find cases involving 10 to 100 parties.&lt;br&gt;**(CaseStats:(attorneyCount:[2 TO 40]))** - Find cases involving 2 to 40 attorneys.&lt;br&gt;**(CaseStats:(judgeCount:[\\* TO 2]))** - Find cases involving up to 2 judges. &lt;br&gt;**(CaseStats:(docketEntryCount:[10 TO 100]))** - Find cases having 10 to 100 docket_entries. &lt;br&gt;**(CaseStats:(allCaseDocumentCount:[10 TO 100]))** - Find cases having 10 to 100 documents. | |**filedDate** | Find cases that were filed on the specified date or within the specified date range. | **filedDate:[2020-03-15 TO 2021-12-01]** - Find the most recently filed cases between March 15, 2020 and December 1, 2021 (inclusive). | |**lastFetchDate**| Find cases in which UniCourt last checked for updates on the specified date or within the specified date range. |**(lastFetchDate:[now-60d TO \\*\\])** - Find cases that were updated by UniCourt in the last 60 days. | |**lastFetchDateWithUpdates**|Find cases in which UniCourt last detected an update on the specified date or within the specified date range.|**(lastFetchDateWithUpdates:[now-6d TO \\*\\])** - Find cases for the changes found on court site in last 6 days.| |**participantsLastFetchDate**|Find cases in which information cocnerning participants was last updated on the specified date or within the specified date range.|**(participantsLastFetchDate:[now-6d TO \\*\\])** - Find cases where the participant&#39;s information was updated in last 6 days.| |**DocketEntry**|Find cases in which at least one docket entry contains the specified text.|**(DocketEntry:(text:(Motion to Compel Responses) AND docketEntryDate:[2020-01-01T00:00:00 TO 2020-05-01T00:00:00]))** - Find cases with docket text “Motion to Compel Responses” and action date between 2020-01-01 and 2020-05-01.| |**docketEntryDate**|Find cases in which at least one docket entry was made on the specified date or within the specified date range.|**(DocketEntry:(docketEntryDate:[2020-01-01T00:00:00 TO 2020-05-01T00:00:00])) AND (CaseStats:(allCaseDocumentCount:[0 TO 10]))** - Find cases with docket action date between 2020-01-01 and 2020-05-01 having up to 10 documents associated with it.| |**HearingDate**| Find cases with at least one hearing scheduled for the specified date or within the specified date range.|**(Hearing:(hearingDate:[now TO now+10d]))** - Find cases where hearing is scheduled in next 10 days.| |**HearingDate**| Search for cases where hearing is going to happen in 10 to 20days.|**(Hearing:(hearingDate:[now+10d TO now+20d]))** - Find cases where hearing is scheduled in next 10 to 20 days.| |**JurisdictionGeo**|Find cases in which the law of the specified state governs.|**(JurisdictionGeo:(state:\&quot;New York\&quot;))**- Find cases where Jurisdiction is New York state.| |**Party Address Exists**|Find cases with Party addresses.|**(Party:(Contact:(Address:(stateName:\\*))))**- Returns only those cases that have addresses for parties.| |**Document**|Find cases with specific document name and preview is available for the document.|**(CaseDocument:(name:\&quot;civil case cover sheet\&quot; AND isPreviewAvailable:true))**- Returns cases with document civil case cover sheet and preview is available.|  &lt;br&gt;&lt;br&gt; --- ## Party Sub Filter Examples |Example |Explanation | |---|---| |**(Party:(name:google AND (PartyRole:(name:\&quot;plaintiff\&quot;))))**|Find cases involving at least one plaintiff whose name contains the term \&quot;Google\&quot;.| |**(Party:(name:\&quot;OTELIA PEREIDA\&quot; AND (AttorneyRepresentationType:(name:\&quot;Attorney represented\&quot;)))) AND (Attorney:(name:\&quot;Law Offices of Todd M Friedman\&quot;))**|Find cases where the Party is *OTELIA PEREIDA* and is represented by the attorney *Law Offices of Todd M Friedman*.|  --- ### All query parameters supported for this API can be found in below schema section. Schema --&gt;  CaseSearchQueryObject 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseSearchApiApi;
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
    String q = "caseNumber:\"JP07-22-DC00026818\""; // Query parameter for keyword expressions.</a> 
    String sort = "filedDate"; // Query parameter specifying how results are to be sorted. Results can be sorted according to filedDate or relevancy.
    String order = "asc"; // Query parameter specifying whether search result are sorted in ascending or descending order.
    Integer pageNumber = 1; // Query parameter specifying the page number of the search results to be retrieved. - Minimum: 1 - Maximum: 1000 
    try {
      CaseSearchResponse result = client
              .caseSearchApi
              .searchByKeywordExpressions(q)
              .sort(sort)
              .order(order)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseSearchId());
      System.out.println(result.getCaseSearchResultArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getQ());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseSearchApiApi#searchByKeywordExpressions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseSearchResponse> response = client
              .caseSearchApi
              .searchByKeywordExpressions(q)
              .sort(sort)
              .order(order)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseSearchApiApi#searchByKeywordExpressions");
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
| **q** | **String**| Query parameter for keyword expressions.&lt;/a&gt;  | |
| **sort** | **String**| Query parameter specifying how results are to be sorted. Results can be sorted according to filedDate or relevancy. | [optional] [default to filedDate] [enum: filedDate, relevancy] |
| **order** | **String**| Query parameter specifying whether search result are sorted in ascending or descending order. | [optional] [default to desc] [enum: asc, desc] |
| **pageNumber** | **Integer**| Query parameter specifying the page number of the search results to be retrieved. - Minimum: 1 - Maximum: 1000  | [optional] |

### Return type

[**CaseSearchResponse**](CaseSearchResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

