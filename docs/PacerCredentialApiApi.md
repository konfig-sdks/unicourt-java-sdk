# PacerCredentialApiApi

All URIs are relative to *https://enterpriseapi.unicourt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPacerCredential**](PacerCredentialApiApi.md#getPacerCredential) | **GET** /pacerCredential/{pacerUserId} | Get Pacer Credential for a requested pacer User Id. |
| [**listPacerCredentials**](PacerCredentialApiApi.md#listPacerCredentials) | **GET** /pacerCredential | Get Pacer Credential List. |
| [**registerPacerCredential**](PacerCredentialApiApi.md#registerPacerCredential) | **PUT** /pacerCredential | Add Pacer Credential. |
| [**removeForUserId**](PacerCredentialApiApi.md#removeForUserId) | **DELETE** /pacerCredential/{pacerUserId} | Remove Pacer credential for a specific Pacer User Id. |


<a name="getPacerCredential"></a>
# **getPacerCredential**
> PacerCredential getPacerCredential(pacerUserId).execute();

Get Pacer Credential for a requested pacer User Id.

Retrieve the PACER credentials for the specified PACER username.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PacerCredentialApiApi;
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
    String pacerUserId = "URKYwer3tyh5r56gq2"; // The PACER username for which PACER credentials are to be retrieved.
    try {
      PacerCredential result = client
              .pacerCredentialApi
              .getPacerCredential(pacerUserId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDefaultPacerClientCode());
      System.out.println(result.getObject());
      System.out.println(result.getPacerUserId());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerCredentialApiApi#getPacerCredential");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PacerCredential> response = client
              .pacerCredentialApi
              .getPacerCredential(pacerUserId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerCredentialApiApi#getPacerCredential");
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
| **pacerUserId** | **String**| The PACER username for which PACER credentials are to be retrieved. | |

### Return type

[**PacerCredential**](PacerCredential.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listPacerCredentials"></a>
# **listPacerCredentials**
> PacerCredentialListResponse listPacerCredentials().pageNumber(pageNumber).execute();

Get Pacer Credential List.

List registered PACER credentials.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PacerCredentialApiApi;
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
    Integer pageNumber = 1; // The page number of the PACER credentials to be retrieved.<br>   - Minimum: 1 
    try {
      PacerCredentialListResponse result = client
              .pacerCredentialApi
              .listPacerCredentials()
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPacerCredentialArray());
      System.out.println(result.getPageNumber());
      System.out.println(result.getPreviousPageAPI());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerCredentialApiApi#listPacerCredentials");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PacerCredentialListResponse> response = client
              .pacerCredentialApi
              .listPacerCredentials()
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerCredentialApiApi#listPacerCredentials");
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
| **pageNumber** | **Integer**| The page number of the PACER credentials to be retrieved.&lt;br&gt;   - Minimum: 1  | [optional] |

### Return type

[**PacerCredentialListResponse**](PacerCredentialListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="registerPacerCredential"></a>
# **registerPacerCredential**
> Success registerPacerCredential().pacerCredentialRequest(pacerCredentialRequest).execute();

Add Pacer Credential.

Register PACER credentials with UniCourt.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PacerCredentialApiApi;
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
    String pacerUserId = "pacerUserId_example"; // Pacer User Id.
    String password = "password_example"; // Password.
    String defaultPacerClientCode = "defaultPacerClientCode_example"; // Pacer Client Code.
    try {
      Success result = client
              .pacerCredentialApi
              .registerPacerCredential(pacerUserId, password)
              .defaultPacerClientCode(defaultPacerClientCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerCredentialApiApi#registerPacerCredential");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Success> response = client
              .pacerCredentialApi
              .registerPacerCredential(pacerUserId, password)
              .defaultPacerClientCode(defaultPacerClientCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerCredentialApiApi#registerPacerCredential");
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
| **pacerCredentialRequest** | [**PacerCredentialRequest**](PacerCredentialRequest.md)|  | [optional] |

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

<a name="removeForUserId"></a>
# **removeForUserId**
> Success removeForUserId(pacerUserId).execute();

Remove Pacer credential for a specific Pacer User Id.

De-register the PACER credentials for the specified PACER username.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PacerCredentialApiApi;
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
    String pacerUserId = "URKYwer3tyh5r56gq2"; // The PACER username for which PACER credentials are to be retrieved.
    try {
      Success result = client
              .pacerCredentialApi
              .removeForUserId(pacerUserId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerCredentialApiApi#removeForUserId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Success> response = client
              .pacerCredentialApi
              .removeForUserId(pacerUserId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PacerCredentialApiApi#removeForUserId");
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
| **pacerUserId** | **String**| The PACER username for which PACER credentials are to be retrieved. | |

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

