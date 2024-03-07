# CaseExportApiApi

All URIs are relative to *https://enterpriseapi.unicourt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCallbackById**](CaseExportApiApi.md#getCallbackById) | **GET** /caseExport/callbacks/{caseExportCallbackId} | Get Case Export Callback for a requested Case Export Callback Id. |
| [**getCallbackListForRequestedDate**](CaseExportApiApi.md#getCallbackListForRequestedDate) | **GET** /caseExport/callbacks | Get Case Export Callback list for a requested Date. |
| [**getCaseExportByCaseId**](CaseExportApiApi.md#getCaseExportByCaseId) | **GET** /caseExport/{caseId} | Gets case exported for a requested Case ID. |


<a name="getCallbackById"></a>
# **getCallbackById**
> CaseExportCallback getCallbackById(caseExportCallbackId).execute();

Get Case Export Callback for a requested Case Export Callback Id.

Retrieve the specified case export callback object.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseExportApiApi;
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
    String caseExportCallbackId = "CBCEG63f4e233eXqD1"; // The caseExportCallbackId value of the case export callback object to be retrieved.
    try {
      CaseExportCallback result = client
              .caseExportApi
              .getCallbackById(caseExportCallbackId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCallbackGeneratedDate());
      System.out.println(result.getCaseExportCallbackAPI());
      System.out.println(result.getCaseExportCallbackId());
      System.out.println(result.getCaseId());
      System.out.println(result.getException());
      System.out.println(result.getFile());
      System.out.println(result.getObject());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseExportApiApi#getCallbackById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseExportCallback> response = client
              .caseExportApi
              .getCallbackById(caseExportCallbackId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseExportApiApi#getCallbackById");
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
| **caseExportCallbackId** | **String**| The caseExportCallbackId value of the case export callback object to be retrieved. | |

### Return type

[**CaseExportCallback**](CaseExportCallback.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCallbackListForRequestedDate"></a>
# **getCallbackListForRequestedDate**
> CaseExportCallbackListResponse getCallbackListForRequestedDate().date(date).status(status).pageNumber(pageNumber).execute();

Get Case Export Callback list for a requested Date.

Retrieve callbacks according to the specified criteria.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseExportApiApi;
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
    OffsetDateTime date = OffsetDateTime.parse("2022-03-08T10:17:56Z"); // The date for which callbacks are to be retrieved.
    String status = "IN_PROGRESS"; // The status code of the callbacks to be retrieved.
    Integer pageNumber = 1; // The page number of the callbacks to be retrieved.<br>   - Minimum: 1 
    try {
      CaseExportCallbackListResponse result = client
              .caseExportApi
              .getCallbackListForRequestedDate()
              .date(date)
              .status(status)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getCallbackArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseExportApiApi#getCallbackListForRequestedDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseExportCallbackListResponse> response = client
              .caseExportApi
              .getCallbackListForRequestedDate()
              .date(date)
              .status(status)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseExportApiApi#getCallbackListForRequestedDate");
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
| **date** | **OffsetDateTime**| The date for which callbacks are to be retrieved. | [optional] |
| **status** | **String**| The status code of the callbacks to be retrieved. | [optional] [enum: IN_PROGRESS, COMPLETE, FAILURE] |
| **pageNumber** | **Integer**| The page number of the callbacks to be retrieved.&lt;br&gt;   - Minimum: 1  | [optional] [default to 1] |

### Return type

[**CaseExportCallbackListResponse**](CaseExportCallbackListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCaseExportByCaseId"></a>
# **getCaseExportByCaseId**
> CaseExportCallback getCaseExportByCaseId(caseId).execute();

Gets case exported for a requested Case ID.

Retrieve information about the specified case export.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseExportApiApi;
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
    String caseId = "CASEhq2c3224900a48"; // The caseId value of the case for which case export information is to be retrieved.
    try {
      CaseExportCallback result = client
              .caseExportApi
              .getCaseExportByCaseId(caseId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCallbackGeneratedDate());
      System.out.println(result.getCaseExportCallbackAPI());
      System.out.println(result.getCaseExportCallbackId());
      System.out.println(result.getCaseId());
      System.out.println(result.getException());
      System.out.println(result.getFile());
      System.out.println(result.getObject());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseExportApiApi#getCaseExportByCaseId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseExportCallback> response = client
              .caseExportApi
              .getCaseExportByCaseId(caseId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseExportApiApi#getCaseExportByCaseId");
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
| **caseId** | **String**| The caseId value of the case for which case export information is to be retrieved. | |

### Return type

[**CaseExportCallback**](CaseExportCallback.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

