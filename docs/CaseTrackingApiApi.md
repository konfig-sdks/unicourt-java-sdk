# CaseTrackingApiApi

All URIs are relative to *https://enterpriseapi.unicourt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCaseTrack**](CaseTrackingApiApi.md#addCaseTrack) | **PUT** /caseTrack | Add Case Track for the requested Case Id. |
| [**getCaseTrack**](CaseTrackingApiApi.md#getCaseTrack) | **GET** /caseTrack/{caseId} | Get Case Track for a requested Case Id. |
| [**getCaseTrackList**](CaseTrackingApiApi.md#getCaseTrackList) | **GET** /caseTracks | Get Case Track list. |
| [**removeCaseTrackById**](CaseTrackingApiApi.md#removeCaseTrackById) | **DELETE** /caseTrack/{caseId} | Remove Case Track for a specific Case Id. |


<a name="addCaseTrack"></a>
# **addCaseTrack**
> Success addCaseTrack().caseTrackRequest(caseTrackRequest).execute();

Add Case Track for the requested Case Id.

Track the specified case.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseTrackingApiApi;
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
    CaseUpdateRequest caseTrackParams = new CaseUpdateRequest();
    CaseTrackSchedule schedule = new CaseTrackSchedule();
    try {
      Success result = client
              .caseTrackingApi
              .addCaseTrack(caseTrackParams, schedule)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseTrackingApiApi#addCaseTrack");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Success> response = client
              .caseTrackingApi
              .addCaseTrack(caseTrackParams, schedule)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseTrackingApiApi#addCaseTrack");
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
| **caseTrackRequest** | [**CaseTrackRequest**](CaseTrackRequest.md)|  | [optional] |

### Return type

[**Success**](Success.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseTrack"></a>
# **getCaseTrack**
> CaseTrack getCaseTrack(caseId).execute();

Get Case Track for a requested Case Id.

Retrieve case tracking information for the specified caseId value.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseTrackingApiApi;
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
    String caseId = "CASEak99a698ea5413"; // The caseId value for which case tracking information is to be retrieved.
    try {
      CaseTrack result = client
              .caseTrackingApi
              .getCaseTrack(caseId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCase());
      System.out.println(result.getCaseAPI());
      System.out.println(result.getCaseId());
      System.out.println(result.getLastFetchDate());
      System.out.println(result.getLastFetchDateWithUpdates());
      System.out.println(result.getLastTrackedDetails());
      System.out.println(result.getObject());
      System.out.println(result.getPacerOptions());
      System.out.println(result.getSchedule());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseTrackingApiApi#getCaseTrack");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseTrack> response = client
              .caseTrackingApi
              .getCaseTrack(caseId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseTrackingApiApi#getCaseTrack");
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
| **caseId** | **String**| The caseId value for which case tracking information is to be retrieved. | |

### Return type

[**CaseTrack**](CaseTrack.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseTrackList"></a>
# **getCaseTrackList**
> CaseTrackListResponse getCaseTrackList().lastFetchDate(lastFetchDate).lastFetchDateWithUpdates(lastFetchDateWithUpdates).pageNumber(pageNumber).execute();

Get Case Track list.

Retrieve a list of all tracked cases.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseTrackingApiApi;
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
    OffsetDateTime lastFetchDate = OffsetDateTime.parse("2022-03-08T10:17:56Z"); // The lastFetchDate value of the tracked case. The date value should be entered in the format YYYY-MM-DDTHH:MM:SS+ZZ:zz. 
    OffsetDateTime lastFetchDateWithUpdates = OffsetDateTime.parse("2022-03-08T10:17:56Z"); // The date on which changes were last found in the case information. 
    Integer pageNumber = 1; // The page number of the results to be retrieved.<br>   - Minimum: 1 
    try {
      CaseTrackListResponse result = client
              .caseTrackingApi
              .getCaseTrackList()
              .lastFetchDate(lastFetchDate)
              .lastFetchDateWithUpdates(lastFetchDateWithUpdates)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseTrackPreviewArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseTrackingApiApi#getCaseTrackList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseTrackListResponse> response = client
              .caseTrackingApi
              .getCaseTrackList()
              .lastFetchDate(lastFetchDate)
              .lastFetchDateWithUpdates(lastFetchDateWithUpdates)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseTrackingApiApi#getCaseTrackList");
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
| **lastFetchDate** | **OffsetDateTime**| The lastFetchDate value of the tracked case. The date value should be entered in the format YYYY-MM-DDTHH:MM:SS+ZZ:zz.  | [optional] |
| **lastFetchDateWithUpdates** | **OffsetDateTime**| The date on which changes were last found in the case information.  | [optional] |
| **pageNumber** | **Integer**| The page number of the results to be retrieved.&lt;br&gt;   - Minimum: 1  | [optional] |

### Return type

[**CaseTrackListResponse**](CaseTrackListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeCaseTrackById"></a>
# **removeCaseTrackById**
> Success removeCaseTrackById(caseId).execute();

Remove Case Track for a specific Case Id.

Remove Case Track for a specific Case Id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseTrackingApiApi;
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
    String caseId = "CASEak99a698ea5413"; // The caseId value for which case tracking information is to be retrieved.
    try {
      Success result = client
              .caseTrackingApi
              .removeCaseTrackById(caseId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseTrackingApiApi#removeCaseTrackById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Success> response = client
              .caseTrackingApi
              .removeCaseTrackById(caseId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseTrackingApiApi#removeCaseTrackById");
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
| **caseId** | **String**| The caseId value for which case tracking information is to be retrieved. | |

### Return type

[**Success**](Success.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

