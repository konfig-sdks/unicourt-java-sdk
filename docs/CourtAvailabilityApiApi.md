# CourtAvailabilityApiApi

All URIs are relative to *https://enterpriseapi.unicourt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCourtCoverageByCourtId**](CourtAvailabilityApiApi.md#getCourtCoverageByCourtId) | **GET** /courtCoverage/{courtId} | Gets Court Coverage of all courts of specific type. |


<a name="getCourtCoverageByCourtId"></a>
# **getCourtCoverageByCourtId**
> CourtCoverage getCourtCoverageByCourtId(courtId).execute();

Gets Court Coverage of all courts of specific type.

Determine whether the specified court is covered by UniCourt.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CourtAvailabilityApiApi;
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
    String courtId = "CORTV4vCEaKrhystBz"; // The courtId value of the target court.
    try {
      CourtCoverage result = client
              .courtAvailabilityApi
              .getCourtCoverageByCourtId(courtId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseClassCoverageArray());
      System.out.println(result.getCourt());
      System.out.println(result.getLastUpdateCountDate());
      System.out.println(result.getObject());
      System.out.println(result.getTotalCaseCount());
      System.out.println(result.getTotalCaseDocumentInLibraryCount());
      System.out.println(result.getTotalCaseDocumentInLibraryInLastThirtyDaysCount());
      System.out.println(result.getTotalCasesInLastThirtyDaysCount());
      System.out.println(result.getTotalFreeCaseDocumentCount());
      System.out.println(result.getTotalFreeCaseDocumentsInLastThirtyDaysCount());
      System.out.println(result.getTotalPaidCaseDocumentCount());
      System.out.println(result.getTotalPaidCaseDocumentsInLastThirtyDaysCount());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtAvailabilityApiApi#getCourtCoverageByCourtId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CourtCoverage> response = client
              .courtAvailabilityApi
              .getCourtCoverageByCourtId(courtId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CourtAvailabilityApiApi#getCourtCoverageByCourtId");
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

[**CourtCoverage**](CourtCoverage.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is received. |  -  |

