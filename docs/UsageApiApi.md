# UsageApiApi

All URIs are relative to *https://enterpriseapi.unicourt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApiUsageByBillingCycle**](UsageApiApi.md#getApiUsageByBillingCycle) | **GET** /billingCycleUsage/{billingCycle} | Specify the billing cycle to know the API usage. |
| [**getApiUsageByDate**](UsageApiApi.md#getApiUsageByDate) | **GET** /dailyUsage/{date} | Get API usage for a requested Date. |
| [**listPreviousBillingCycles**](UsageApiApi.md#listPreviousBillingCycles) | **GET** /billingCycles | Get all the previous 12 billing cycles. |


<a name="getApiUsageByBillingCycle"></a>
# **getApiUsageByBillingCycle**
> BillingCycleUsageResponse getApiUsageByBillingCycle(billingCycle).execute();

Specify the billing cycle to know the API usage.

An endpoint to obtain information on API usage for a specific billing cycle.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsageApiApi;
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
    String billingCycle = "2023-01-25to2023-02-25"; // The date obtainable from the /billingCycles endpoint which is used as an identifier for the specific billing cycle you wish to obtain information on.
    try {
      BillingCycleUsageResponse result = client
              .usageApi
              .getApiUsageByBillingCycle(billingCycle)
              .execute();
      System.out.println(result);
      System.out.println(result.getApiCallsBillable());
      System.out.println(result.getApiCallsCredited());
      System.out.println(result.getApiCallsMade());
      System.out.println(result.getApiUsage());
      System.out.println(result.getBillingCycle());
      System.out.println(result.getDays());
      System.out.println(result.getObject());
      System.out.println(result.getTotalCasesTracked());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApiApi#getApiUsageByBillingCycle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BillingCycleUsageResponse> response = client
              .usageApi
              .getApiUsageByBillingCycle(billingCycle)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApiApi#getApiUsageByBillingCycle");
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
| **billingCycle** | **String**| The date obtainable from the /billingCycles endpoint which is used as an identifier for the specific billing cycle you wish to obtain information on. | |

### Return type

[**BillingCycleUsageResponse**](BillingCycleUsageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getApiUsageByDate"></a>
# **getApiUsageByDate**
> DailyUsageResponse getApiUsageByDate(date).execute();

Get API usage for a requested Date.

An endpoint to obtain information on API usage for a specific day.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsageApiApi;
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
    LocalDate date = LocalDate.parse("2023-02-21T00:00:00.000Z"); // The specific date for which you wish to obtain information on API usage.
    try {
      DailyUsageResponse result = client
              .usageApi
              .getApiUsageByDate(date)
              .execute();
      System.out.println(result);
      System.out.println(result.getApiCallsBillable());
      System.out.println(result.getApiCallsCredited());
      System.out.println(result.getApiCallsMade());
      System.out.println(result.getApiUsage());
      System.out.println(result.getObject());
      System.out.println(result.getUsageEndTime());
      System.out.println(result.getUsageStartTime());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApiApi#getApiUsageByDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<DailyUsageResponse> response = client
              .usageApi
              .getApiUsageByDate(date)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApiApi#getApiUsageByDate");
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
| **date** | **LocalDate**| The specific date for which you wish to obtain information on API usage. | |

### Return type

[**DailyUsageResponse**](DailyUsageResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listPreviousBillingCycles"></a>
# **listPreviousBillingCycles**
> BillingCyclesResponse listPreviousBillingCycles().execute();

Get all the previous 12 billing cycles.

An endpoint to obtain information on the previous 12 billing cycles.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UsageApiApi;
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
    try {
      BillingCyclesResponse result = client
              .usageApi
              .listPreviousBillingCycles()
              .execute();
      System.out.println(result);
      System.out.println(result.getBillingCycleArray());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApiApi#listPreviousBillingCycles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BillingCyclesResponse> response = client
              .usageApi
              .listPreviousBillingCycles()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageApiApi#listPreviousBillingCycles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BillingCyclesResponse**](BillingCyclesResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

