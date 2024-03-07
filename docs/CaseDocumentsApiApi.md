# CaseDocumentsApiApi

All URIs are relative to *https://enterpriseapi.unicourt.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDocumentOrder**](CaseDocumentsApiApi.md#addDocumentOrder) | **PUT** /caseDocumentOrder | Add Case Document Order for requested Document Ids. |
| [**getCallbackById**](CaseDocumentsApiApi.md#getCallbackById) | **GET** /caseDocumentOrder/callbacks/{caseDocumentOrderCallbackId} | Get Case Document Order Callback for a requested Case Document Order Callback Id. |
| [**getDocumentDetailsByDocumentId**](CaseDocumentsApiApi.md#getDocumentDetailsByDocumentId) | **GET** /caseDocument/{caseDocumentId} | Gets details for a requested Document ID. |
| [**getDocumentsForCase**](CaseDocumentsApiApi.md#getDocumentsForCase) | **GET** /case/{caseId}/documents | Gets Documents for a requested Case ID. |
| [**getDownloadableUrlForDocument**](CaseDocumentsApiApi.md#getDownloadableUrlForDocument) | **GET** /caseDocumentDownload/{caseDocumentId} | Gets downloadable URL for a requested Document ID. |
| [**listDocumentOrderCallbacks**](CaseDocumentsApiApi.md#listDocumentOrderCallbacks) | **GET** /caseDocumentOrder/callbacks | Get Case Document Order Callback list for a requested Date. |


<a name="addDocumentOrder"></a>
# **addDocumentOrder**
> CaseDocumentOrderCallback addDocumentOrder().caseDocumentOrderRequest(caseDocumentOrderRequest).execute();

Add Case Document Order for requested Document Ids.

Add Case Document Order for requested Document Ids.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseDocumentsApiApi;
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
    String caseDocumentId = "caseDocumentId_example"; // Document ID which you want to order.
    Boolean isPreviewOnly = true; // Flag value to determine if the document order is a preview order or no.
    CaseDocumentOrderPacerOptions pacerOptions = new CaseDocumentOrderPacerOptions();
    try {
      CaseDocumentOrderCallback result = client
              .caseDocumentsApi
              .addDocumentOrder(caseDocumentId, isPreviewOnly)
              .pacerOptions(pacerOptions)
              .execute();
      System.out.println(result);
      System.out.println(result.getCallbackGeneratedDate());
      System.out.println(result.getCaseDocument());
      System.out.println(result.getCaseDocumentId());
      System.out.println(result.getCaseDocumentOrderCallbackAPI());
      System.out.println(result.getCaseDocumentOrderCallbackId());
      System.out.println(result.getException());
      System.out.println(result.getFile());
      System.out.println(result.getObject());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocumentsApiApi#addDocumentOrder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseDocumentOrderCallback> response = client
              .caseDocumentsApi
              .addDocumentOrder(caseDocumentId, isPreviewOnly)
              .pacerOptions(pacerOptions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocumentsApiApi#addDocumentOrder");
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
| **caseDocumentOrderRequest** | [**CaseDocumentOrderRequest**](CaseDocumentOrderRequest.md)| If the Case Document Order is for Preview, then the value for &#x60;&#x60;isPreviewOnly&#x60;&#x60; should be &#x60;&#x60;true&#x60;&#x60; else &#x60;&#x60;false&#x60;&#x60;.  | [optional] |

### Return type

[**CaseDocumentOrderCallback**](CaseDocumentOrderCallback.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getCallbackById"></a>
# **getCallbackById**
> CaseDocumentOrderCallback getCallbackById(caseDocumentOrderCallbackId).execute();

Get Case Document Order Callback for a requested Case Document Order Callback Id.

Get Case Document Order Callback for a requested Case Document Order Callback Id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseDocumentsApiApi;
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
    String caseDocumentOrderCallbackId = "CBDOnrb63f4808bjO3"; // Unique Id for the Case Document Order Callback.
    try {
      CaseDocumentOrderCallback result = client
              .caseDocumentsApi
              .getCallbackById(caseDocumentOrderCallbackId)
              .execute();
      System.out.println(result);
      System.out.println(result.getCallbackGeneratedDate());
      System.out.println(result.getCaseDocument());
      System.out.println(result.getCaseDocumentId());
      System.out.println(result.getCaseDocumentOrderCallbackAPI());
      System.out.println(result.getCaseDocumentOrderCallbackId());
      System.out.println(result.getException());
      System.out.println(result.getFile());
      System.out.println(result.getObject());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocumentsApiApi#getCallbackById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseDocumentOrderCallback> response = client
              .caseDocumentsApi
              .getCallbackById(caseDocumentOrderCallbackId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocumentsApiApi#getCallbackById");
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
| **caseDocumentOrderCallbackId** | **String**| Unique Id for the Case Document Order Callback. | |

### Return type

[**CaseDocumentOrderCallback**](CaseDocumentOrderCallback.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getDocumentDetailsByDocumentId"></a>
# **getDocumentDetailsByDocumentId**
> CaseDocument getDocumentDetailsByDocumentId(caseDocumentId).execute();

Gets details for a requested Document ID.

Gets details for a requested Document ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseDocumentsApiApi;
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
    String caseDocumentId = "CDOCag3e5eba43b870"; // Specific Case Dcoument ID for which you want the data for.
    try {
      CaseDocument result = client
              .caseDocumentsApi
              .getDocumentDetailsByDocumentId(caseDocumentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getAddedToLibraryDate());
      System.out.println(result.getCaseDocumentId());
      System.out.println(result.getChildDocumentIdArray());
      System.out.println(result.getDocumentFiledDate());
      System.out.println(result.getDownloadAPI());
      System.out.println(result.getEstimatedOrderDuration());
      System.out.println(result.getFirstFetchDate());
      System.out.println(result.getInLibrary());
      System.out.println(result.getIsPreviewAvailable());
      System.out.println(result.getName());
      System.out.println(result.getObject());
      System.out.println(result.getPages());
      System.out.println(result.getParentDocumentId());
      System.out.println(result.getPreviewDocument());
      System.out.println(result.getPrice());
      System.out.println(result.getSortOrder());
      System.out.println(result.getSourceDataStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocumentsApiApi#getDocumentDetailsByDocumentId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseDocument> response = client
              .caseDocumentsApi
              .getDocumentDetailsByDocumentId(caseDocumentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocumentsApiApi#getDocumentDetailsByDocumentId");
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
| **caseDocumentId** | **String**| Specific Case Dcoument ID for which you want the data for. | |

### Return type

[**CaseDocument**](CaseDocument.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="getDocumentsForCase"></a>
# **getDocumentsForCase**
> CaseDocuments getDocumentsForCase(caseId).inLibrary(inLibrary).afterFirstFetchDate(afterFirstFetchDate).libraryDate(libraryDate).firstFetchDate(firstFetchDate).sortBy(sortBy).pageNumber(pageNumber).execute();

Gets Documents for a requested Case ID.

Gets Documents for a requested Case ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseDocumentsApiApi;
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
    String caseId = "CASEgua4c06e119ea8"; // Case ID for which you want the data for.
    Boolean inLibrary = true; // Filter all the documents those are added to the UniCourt library.
    OffsetDateTime afterFirstFetchDate = OffsetDateTime.now(); // Get all the documents which were added to the case on or after a specific date.
    OffsetDateTime libraryDate = OffsetDateTime.now(); // Sort all the documents based on the date when the document was added to the UniCourt Library.
    OffsetDateTime firstFetchDate = OffsetDateTime.now(); // Sort all the documents based on the date it was fetched from the source site.
    String sortBy = "latest to oldest"; // Sort documents with document order.
    Integer pageNumber = 1; // The page for which the result should be retrieved.
    try {
      CaseDocuments result = client
              .caseDocumentsApi
              .getDocumentsForCase(caseId)
              .inLibrary(inLibrary)
              .afterFirstFetchDate(afterFirstFetchDate)
              .libraryDate(libraryDate)
              .firstFetchDate(firstFetchDate)
              .sortBy(sortBy)
              .pageNumber(pageNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getCaseDocumentArray());
      System.out.println(result.getNextPageAPI());
      System.out.println(result.getObject());
      System.out.println(result.getPageNumber());
      System.out.println(result.getTotalCount());
      System.out.println(result.getTotalPages());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocumentsApiApi#getDocumentsForCase");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseDocuments> response = client
              .caseDocumentsApi
              .getDocumentsForCase(caseId)
              .inLibrary(inLibrary)
              .afterFirstFetchDate(afterFirstFetchDate)
              .libraryDate(libraryDate)
              .firstFetchDate(firstFetchDate)
              .sortBy(sortBy)
              .pageNumber(pageNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocumentsApiApi#getDocumentsForCase");
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
| **caseId** | **String**| Case ID for which you want the data for. | |
| **inLibrary** | **Boolean**| Filter all the documents those are added to the UniCourt library. | [optional] |
| **afterFirstFetchDate** | **OffsetDateTime**| Get all the documents which were added to the case on or after a specific date. | [optional] |
| **libraryDate** | **OffsetDateTime**| Sort all the documents based on the date when the document was added to the UniCourt Library. | [optional] |
| **firstFetchDate** | **OffsetDateTime**| Sort all the documents based on the date it was fetched from the source site. | [optional] |
| **sortBy** | **String**| Sort documents with document order. | [optional] [enum: latest to oldest, oldest to latest] |
| **pageNumber** | **Integer**| The page for which the result should be retrieved. | [optional] |

### Return type

[**CaseDocuments**](CaseDocuments.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="getDownloadableUrlForDocument"></a>
# **getDownloadableUrlForDocument**
> Object getDownloadableUrlForDocument(caseDocumentId).isPreviewDocument(isPreviewDocument).execute();

Gets downloadable URL for a requested Document ID.

Gets downloadable URL for a requested Document ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseDocumentsApiApi;
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
    String caseDocumentId = "CDOCaqe42a86394f63"; // Document ID which you want to download.
    Boolean isPreviewDocument = false; // If the document you want to download is a preview of a document.
    try {
      Object result = client
              .caseDocumentsApi
              .getDownloadableUrlForDocument(caseDocumentId)
              .isPreviewDocument(isPreviewDocument)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocumentsApiApi#getDownloadableUrlForDocument");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .caseDocumentsApi
              .getDownloadableUrlForDocument(caseDocumentId)
              .isPreviewDocument(isPreviewDocument)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseDocumentsApiApi#getDownloadableUrlForDocument");
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
| **caseDocumentId** | **String**| Document ID which you want to download. | |
| **isPreviewDocument** | **Boolean**| If the document you want to download is a preview of a document. | [optional] [default to false] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request is recieved. |  -  |

<a name="listDocumentOrderCallbacks"></a>
# **listDocumentOrderCallbacks**
> CaseDocumentOrderCallbackListResponse listDocumentOrderCallbacks().date(date).status(status).pageNumber(pageNumber).execute();

Get Case Document Order Callback list for a requested Date.

Get Case Document Order Callback list for a requested Date.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.UniCourt;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CaseDocumentsApiApi;
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
    OffsetDateTime date = OffsetDateTime.parse("2022-03-08T10:17:56.000Z"); // Date for which fetch the Case Document Order Callback list. By default, the date will be set to current date.
    String status = "IN_PROGRESS"; // Status of Document Order callbacks. Default status will fetch all callbacks.
    Integer pageNumber = 1; // Page to fetch the Case Document Order Callback list.<br>   - Minimum: 1 
    try {
      CaseDocumentOrderCallbackListResponse result = client
              .caseDocumentsApi
              .listDocumentOrderCallbacks()
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
      System.err.println("Exception when calling CaseDocumentsApiApi#listDocumentOrderCallbacks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CaseDocumentOrderCallbackListResponse> response = client
              .caseDocumentsApi
              .listDocumentOrderCallbacks()
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
      System.err.println("Exception when calling CaseDocumentsApiApi#listDocumentOrderCallbacks");
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
| **date** | **OffsetDateTime**| Date for which fetch the Case Document Order Callback list. By default, the date will be set to current date. | [optional] |
| **status** | **String**| Status of Document Order callbacks. Default status will fetch all callbacks. | [optional] [enum: IN_PROGRESS, COMPLETE, FAILURE] |
| **pageNumber** | **Integer**| Page to fetch the Case Document Order Callback list.&lt;br&gt;   - Minimum: 1  | [optional] [default to 1] |

### Return type

[**CaseDocumentOrderCallbackListResponse**](CaseDocumentOrderCallbackListResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

