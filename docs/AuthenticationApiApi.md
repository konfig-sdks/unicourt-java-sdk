# AuthenticationApiApi

All URIs are relative to *https://enterpriseapi.unicourt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateNewToken**](AuthenticationApiApi.md#generateNewToken) | **POST** /generateNewToken | Generate new token to access API. |
| [**getAllTokenIds**](AuthenticationApiApi.md#getAllTokenIds) | **PUT** /listAllTokenIds | API to list all the access tokens Id. |
| [**invalidateAccessToken**](AuthenticationApiApi.md#invalidateAccessToken) | **PUT** /invalidateToken | API to invalidate the access token. |
| [**invalidateAllTokens**](AuthenticationApiApi.md#invalidateAllTokens) | **PUT** /invalidateAllTokens | API to invalidate all access tokens. |


<a name="generateNewToken"></a>
# **generateNewToken**
> AccessTokenResponse generateNewToken().accessTokenRequest(accessTokenRequest).execute();

Generate new token to access API.

This endpoint allows you to generate a new access token, which is a required field for all UniCourt API endpoints except for the Authentication API. To generate a new token, you must provide your Client ID and Client Secret ID which you can find by logging into your UniCourt account. At any time, you can have a maximum of 10 active access tokens. The tokens never expire and, if you make a request which would otherwise lead to you having more than 10 active tokens, you will receive an error message.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://enterpriseapi.unicourt.com";
    UniCourt client = new UniCourt(configuration);
    String clientId = "clientId_example"; // Your Client ID obtainable by logging into your UniCourt account.
    String clientSecret = "clientSecret_example"; // Your Client Secret ID obtainable by logging into your UniCourt account.
    try {
      AccessTokenResponse result = client
              .authenticationApi
              .generateNewToken(clientId, clientSecret)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessToken());
      System.out.println(result.getObject());
      System.out.println(result.getTokenId());
      System.out.println(result.getTokenType());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApiApi#generateNewToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccessTokenResponse> response = client
              .authenticationApi
              .generateNewToken(clientId, clientSecret)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApiApi#generateNewToken");
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
| **accessTokenRequest** | [**AccessTokenRequest**](AccessTokenRequest.md)| The endpoint accepts your Client ID and Client Secret ID as part of the request. | [optional] |

### Return type

[**AccessTokenResponse**](AccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getAllTokenIds"></a>
# **getAllTokenIds**
> AccessTokenIdListResponse getAllTokenIds().accessTokenRequest(accessTokenRequest).execute();

API to list all the access tokens Id.

An endpoint which allows you to view all active access tokens associated with your Client ID and Client Secret ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://enterpriseapi.unicourt.com";
    UniCourt client = new UniCourt(configuration);
    String clientId = "clientId_example"; // Your Client ID obtainable by logging into your UniCourt account.
    String clientSecret = "clientSecret_example"; // Your Client Secret ID obtainable by logging into your UniCourt account.
    try {
      AccessTokenIdListResponse result = client
              .authenticationApi
              .getAllTokenIds(clientId, clientSecret)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccessTokenIdArray());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApiApi#getAllTokenIds");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccessTokenIdListResponse> response = client
              .authenticationApi
              .getAllTokenIds(clientId, clientSecret)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApiApi#getAllTokenIds");
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
| **accessTokenRequest** | [**AccessTokenRequest**](AccessTokenRequest.md)| The endpoint accepts your Client ID and Client Secret ID as part of the request. | [optional] |

### Return type

[**AccessTokenIdListResponse**](AccessTokenIdListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="invalidateAccessToken"></a>
# **invalidateAccessToken**
> Success invalidateAccessToken().invalidateAccessTokenRequest(invalidateAccessTokenRequest).execute();

API to invalidate the access token.

An endpoint which allows you to invalidate a given access token.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://enterpriseapi.unicourt.com";
    UniCourt client = new UniCourt(configuration);
    String clientId = "clientId_example"; // Your Client ID obtainable by logging into your UniCourt account.
    String clientSecret = "clientSecret_example"; // Your Client Secret ID obtainable by logging into your UniCourt account.
    String tokenId = "tokenId_example"; // The Token ID of token being invalidated
    try {
      Success result = client
              .authenticationApi
              .invalidateAccessToken(clientId, clientSecret, tokenId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApiApi#invalidateAccessToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Success> response = client
              .authenticationApi
              .invalidateAccessToken(clientId, clientSecret, tokenId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApiApi#invalidateAccessToken");
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
| **invalidateAccessTokenRequest** | [**InvalidateAccessTokenRequest**](InvalidateAccessTokenRequest.md)| The endpoint accepts your Client ID, Client Secret ID and the Token ID for the access token you wish to invalidate as part of the request. You can obtain a list of all Token IDs from the /listAllTokenIds endpoint within this API. | [optional] |

### Return type

[**Success**](Success.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="invalidateAllTokens"></a>
# **invalidateAllTokens**
> Success invalidateAllTokens().accessTokenRequest(accessTokenRequest).execute();

API to invalidate all access tokens.

An endpoint which allows you to invalidate all existing access tokens associated with your UniCourt account.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApiApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://enterpriseapi.unicourt.com";
    UniCourt client = new UniCourt(configuration);
    String clientId = "clientId_example"; // Your Client ID obtainable by logging into your UniCourt account.
    String clientSecret = "clientSecret_example"; // Your Client Secret ID obtainable by logging into your UniCourt account.
    try {
      Success result = client
              .authenticationApi
              .invalidateAllTokens(clientId, clientSecret)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getObject());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApiApi#invalidateAllTokens");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Success> response = client
              .authenticationApi
              .invalidateAllTokens(clientId, clientSecret)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApiApi#invalidateAllTokens");
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
| **accessTokenRequest** | [**AccessTokenRequest**](AccessTokenRequest.md)| The endpoint accepts your Client ID and Secret Client ID as part of the request. | [optional] |

### Return type

[**Success**](Success.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

