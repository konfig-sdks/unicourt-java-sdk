# CaseUpdateApiApi

All URIs are relative to *https://enterpriseapi.unicourt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCaseUpdateForCaseId**](CaseUpdateApiApi.md#addCaseUpdateForCaseId) | **PUT** /caseUpdate | Add Case Update for the requested Case Id. |
| [**getCaseUpdates**](CaseUpdateApiApi.md#getCaseUpdates) | **GET** /caseUpdates | Get Case Update  list for a requested Date. |
| [**getCaseUpdatesByCaseId**](CaseUpdateApiApi.md#getCaseUpdatesByCaseId) | **GET** /caseUpdate/{caseId} | Get Case Updates for a requested CaseId. |


<a name="addCaseUpdateForCaseId"></a>
# **addCaseUpdateForCaseId**
> CaseUpdate addCaseUpdateForCaseId().caseUpdateRequest(caseUpdateRequest).execute();

Add Case Update for the requested Case Id.

Request case updates for the specified case.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseUpdateApiApi;
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
    String caseId = "caseId_example"; // UniCourt's Case Id for update.
    CaseUpdatePacerOptions pacerOptions = new CaseUpdatePacerOptions();
    try {
      CaseUpdate result = client
              .caseUpdateApi
              .addCaseUpdateForCaseId(caseId)
              .pacerOptions(pacerOptions)
              .execute();
      System.out.println(result);
      System.out.println(result.getCase());
      System.out.println(result.getCaseAPI());
      System.out.println(result.getCaseId());
      System.out.println(result.getException());
      System.out.println(result.getObject());
      System.out.println(result.getPacerOptions());
      System.out.println(result.getRequestedDate());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseUpdateApiApi#addCaseUpdateForCaseId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseUpdate> response = client
              .caseUpdateApi
              .addCaseUpdateForCaseId(caseId)
              .pacerOptions(pacerOptions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseUpdateApiApi#addCaseUpdateForCaseId");
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
| **caseUpdateRequest** | [**CaseUpdateRequest**](CaseUpdateRequest.md)|  | [optional] |

### Return type

[**CaseUpdate**](CaseUpdate.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseUpdates"></a>
# **getCaseUpdates**
> CaseUpdateListResponse getCaseUpdates().caseId(caseId).requestedDate(requestedDate).status(status).pageNumber(pageNumber).execute();

Get Case Update  list for a requested Date.

Retrieve case updates for the specified date.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseUpdateApiApi;
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
    String caseId = "CASEak99a698ea5413"; // The caseId value of the case for which updates should be retrieved.
    OffsetDateTime requestedDate = OffsetDateTime.parse("2022-03-08T10:17:56.000Z"); // The date for which case updates are to be retrieved.
    String status = "IN_PROGRESS"; // Status of the case updates to be retrieved.
    Integer pageNumber = 1; // The page number of the callbacks to be retrieved.<br>   - Minimum: 1 
    try {
      CaseUpdateListResponse result = client
              .caseUpdateApi
              .getCaseUpdates()
              .caseId(caseId)
              .requestedDate(requestedDate)
              .status(status)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseUpdatePreviewArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseUpdateApiApi#getCaseUpdates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseUpdateListResponse> response = client
              .caseUpdateApi
              .getCaseUpdates()
              .caseId(caseId)
              .requestedDate(requestedDate)
              .status(status)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseUpdateApiApi#getCaseUpdates");
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
| **caseId** | **String**| The caseId value of the case for which updates should be retrieved. | [optional] |
| **requestedDate** | **OffsetDateTime**| The date for which case updates are to be retrieved. | [optional] |
| **status** | **String**| Status of the case updates to be retrieved. | [optional] [enum: IN_PROGRESS, COMPLETE, FAILURE] |
| **pageNumber** | **Integer**| The page number of the callbacks to be retrieved.&lt;br&gt;   - Minimum: 1  | [optional] [default to 1] |

### Return type

[**CaseUpdateListResponse**](CaseUpdateListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseUpdatesByCaseId"></a>
# **getCaseUpdatesByCaseId**
> CaseUpdate getCaseUpdatesByCaseId(caseId).execute();

Get Case Updates for a requested CaseId.

Retrieve case updates for the specified case object.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseUpdateApiApi;
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
    String caseId = "CASEeqfb72ba4726f1"; // The caseId value of the case object for which updates are to be retrieved.
    try {
      CaseUpdate result = client
              .caseUpdateApi
              .getCaseUpdatesByCaseId(caseId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCase());
      System.out.println(result.getCaseAPI());
      System.out.println(result.getCaseId());
      System.out.println(result.getException());
      System.out.println(result.getObject());
      System.out.println(result.getPacerOptions());
      System.out.println(result.getRequestedDate());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseUpdateApiApi#getCaseUpdatesByCaseId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseUpdate> response = client
              .caseUpdateApi
              .getCaseUpdatesByCaseId(caseId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseUpdateApiApi#getCaseUpdatesByCaseId");
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
| **caseId** | **String**| The caseId value of the case object for which updates are to be retrieved. | |

### Return type

[**CaseUpdate**](CaseUpdate.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

