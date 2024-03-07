# CallbackApiApi

All URIs are relative to *https://enterpriseapi.unicourt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listCallbacksWithCount**](CallbackApiApi.md#listCallbacksWithCount) | **GET** /callbacks | Get list of callback types with count for a requested Date. |


<a name="listCallbacksWithCount"></a>
# **listCallbacksWithCount**
> CallbackListResponse listCallbacksWithCount().date(date).status(status).execute();

Get list of callback types with count for a requested Date.

Get list of callback types with count for a requested Date.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CallbackApiApi;
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
    OffsetDateTime date = OffsetDateTime.parse("2022-03-08T00:00:00.000Z"); // Date for which fetch the callback type list. By default, the date will be set to current date.
    String status = "IN_PROGRESS"; // Status of the callbacks. Default status will fetch all callbacks.
    try {
      CallbackListResponse result = client
              .callbackApi
              .listCallbacksWithCount()
              .date(date)
              .status(status)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseDocumentOrderCallbacks());
      System.out.println(result.getCaseExportCallbacks());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallbackApiApi#listCallbacksWithCount");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CallbackListResponse> response = client
              .callbackApi
              .listCallbacksWithCount()
              .date(date)
              .status(status)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CallbackApiApi#listCallbacksWithCount");
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
| **date** | **OffsetDateTime**| Date for which fetch the callback type list. By default, the date will be set to current date. | [optional] |
| **status** | **String**| Status of the callbacks. Default status will fetch all callbacks. | [optional] [enum: IN_PROGRESS, COMPLETE, FAILURE] |

### Return type

[**CallbackListResponse**](CallbackListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

