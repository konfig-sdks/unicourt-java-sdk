/*
 * UniCourt Enterprise APIs
 * <button><a href=\"/enterpriseapi/download/UniCourt-Enterprise-API-Spec.yaml\" >Download UniCourt Enterprise APIs Specification</a></button> 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.CaseUpdate;
import com.konfigthis.client.model.CaseUpdateListResponse;
import com.konfigthis.client.model.CaseUpdatePacerOptions;
import com.konfigthis.client.model.CaseUpdateRequest;
import java.time.OffsetDateTime;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CaseUpdateApiApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CaseUpdateApiApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public CaseUpdateApiApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call addCaseUpdateForCaseIdCall(CaseUpdateRequest caseUpdateRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = caseUpdateRequest;

        // create path and map variables
        String localVarPath = "/caseUpdate";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addCaseUpdateForCaseIdValidateBeforeCall(CaseUpdateRequest caseUpdateRequest, final ApiCallback _callback) throws ApiException {
        return addCaseUpdateForCaseIdCall(caseUpdateRequest, _callback);

    }


    private ApiResponse<CaseUpdate> addCaseUpdateForCaseIdWithHttpInfo(CaseUpdateRequest caseUpdateRequest) throws ApiException {
        okhttp3.Call localVarCall = addCaseUpdateForCaseIdValidateBeforeCall(caseUpdateRequest, null);
        Type localVarReturnType = new TypeToken<CaseUpdate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call addCaseUpdateForCaseIdAsync(CaseUpdateRequest caseUpdateRequest, final ApiCallback<CaseUpdate> _callback) throws ApiException {

        okhttp3.Call localVarCall = addCaseUpdateForCaseIdValidateBeforeCall(caseUpdateRequest, _callback);
        Type localVarReturnType = new TypeToken<CaseUpdate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class AddCaseUpdateForCaseIdRequestBuilder {
        private final String caseId;
        private CaseUpdatePacerOptions pacerOptions;

        private AddCaseUpdateForCaseIdRequestBuilder(String caseId) {
            this.caseId = caseId;
        }

        /**
         * Set pacerOptions
         * @param pacerOptions  (optional)
         * @return AddCaseUpdateForCaseIdRequestBuilder
         */
        public AddCaseUpdateForCaseIdRequestBuilder pacerOptions(CaseUpdatePacerOptions pacerOptions) {
            this.pacerOptions = pacerOptions;
            return this;
        }
        
        /**
         * Build call for addCaseUpdateForCaseId
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            CaseUpdateRequest caseUpdateRequest = buildBodyParams();
            return addCaseUpdateForCaseIdCall(caseUpdateRequest, _callback);
        }

        private CaseUpdateRequest buildBodyParams() {
            CaseUpdateRequest caseUpdateRequest = new CaseUpdateRequest();
            caseUpdateRequest.caseId(this.caseId);
            caseUpdateRequest.pacerOptions(this.pacerOptions);
            return caseUpdateRequest;
        }

        /**
         * Execute addCaseUpdateForCaseId request
         * @return CaseUpdate
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public CaseUpdate execute() throws ApiException {
            CaseUpdateRequest caseUpdateRequest = buildBodyParams();
            ApiResponse<CaseUpdate> localVarResp = addCaseUpdateForCaseIdWithHttpInfo(caseUpdateRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute addCaseUpdateForCaseId request with HTTP info returned
         * @return ApiResponse&lt;CaseUpdate&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CaseUpdate> executeWithHttpInfo() throws ApiException {
            CaseUpdateRequest caseUpdateRequest = buildBodyParams();
            return addCaseUpdateForCaseIdWithHttpInfo(caseUpdateRequest);
        }

        /**
         * Execute addCaseUpdateForCaseId request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CaseUpdate> _callback) throws ApiException {
            CaseUpdateRequest caseUpdateRequest = buildBodyParams();
            return addCaseUpdateForCaseIdAsync(caseUpdateRequest, _callback);
        }
    }

    /**
     * Add Case Update for the requested Case Id.
     * Request case updates for the specified case.
     * @return AddCaseUpdateForCaseIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AddCaseUpdateForCaseIdRequestBuilder addCaseUpdateForCaseId(String caseId) throws IllegalArgumentException {
        if (caseId == null) throw new IllegalArgumentException("\"caseId\" is required but got null");
            if (caseId != null && caseId.length() < 18) {
              throw new IllegalArgumentException("Invalid value for caseId. Length must be greater than or equal to 18.");
            }

        return new AddCaseUpdateForCaseIdRequestBuilder(caseId);
    }
    private okhttp3.Call getCaseUpdatesCall(String caseId, OffsetDateTime requestedDate, String status, Integer pageNumber, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/caseUpdates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (caseId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("caseId", caseId));
        }

        if (requestedDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("requestedDate", requestedDate));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (pageNumber != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageNumber", pageNumber));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCaseUpdatesValidateBeforeCall(String caseId, OffsetDateTime requestedDate, String status, Integer pageNumber, final ApiCallback _callback) throws ApiException {
        return getCaseUpdatesCall(caseId, requestedDate, status, pageNumber, _callback);

    }


    private ApiResponse<CaseUpdateListResponse> getCaseUpdatesWithHttpInfo(String caseId, OffsetDateTime requestedDate, String status, Integer pageNumber) throws ApiException {
        okhttp3.Call localVarCall = getCaseUpdatesValidateBeforeCall(caseId, requestedDate, status, pageNumber, null);
        Type localVarReturnType = new TypeToken<CaseUpdateListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getCaseUpdatesAsync(String caseId, OffsetDateTime requestedDate, String status, Integer pageNumber, final ApiCallback<CaseUpdateListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCaseUpdatesValidateBeforeCall(caseId, requestedDate, status, pageNumber, _callback);
        Type localVarReturnType = new TypeToken<CaseUpdateListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetCaseUpdatesRequestBuilder {
        private String caseId;
        private OffsetDateTime requestedDate;
        private String status;
        private Integer pageNumber;

        private GetCaseUpdatesRequestBuilder() {
        }

        /**
         * Set caseId
         * @param caseId The caseId value of the case for which updates should be retrieved. (optional)
         * @return GetCaseUpdatesRequestBuilder
         */
        public GetCaseUpdatesRequestBuilder caseId(String caseId) {
            this.caseId = caseId;
            return this;
        }
        
        /**
         * Set requestedDate
         * @param requestedDate The date for which case updates are to be retrieved. (optional)
         * @return GetCaseUpdatesRequestBuilder
         */
        public GetCaseUpdatesRequestBuilder requestedDate(OffsetDateTime requestedDate) {
            this.requestedDate = requestedDate;
            return this;
        }
        
        /**
         * Set status
         * @param status Status of the case updates to be retrieved. (optional)
         * @return GetCaseUpdatesRequestBuilder
         */
        public GetCaseUpdatesRequestBuilder status(String status) {
            this.status = status;
            return this;
        }
        
        /**
         * Set pageNumber
         * @param pageNumber The page number of the callbacks to be retrieved.&lt;br&gt;   - Minimum: 1  (optional, default to 1)
         * @return GetCaseUpdatesRequestBuilder
         */
        public GetCaseUpdatesRequestBuilder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        
        /**
         * Build call for getCaseUpdates
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getCaseUpdatesCall(caseId, requestedDate, status, pageNumber, _callback);
        }


        /**
         * Execute getCaseUpdates request
         * @return CaseUpdateListResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public CaseUpdateListResponse execute() throws ApiException {
            ApiResponse<CaseUpdateListResponse> localVarResp = getCaseUpdatesWithHttpInfo(caseId, requestedDate, status, pageNumber);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getCaseUpdates request with HTTP info returned
         * @return ApiResponse&lt;CaseUpdateListResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CaseUpdateListResponse> executeWithHttpInfo() throws ApiException {
            return getCaseUpdatesWithHttpInfo(caseId, requestedDate, status, pageNumber);
        }

        /**
         * Execute getCaseUpdates request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CaseUpdateListResponse> _callback) throws ApiException {
            return getCaseUpdatesAsync(caseId, requestedDate, status, pageNumber, _callback);
        }
    }

    /**
     * Get Case Update  list for a requested Date.
     * Retrieve case updates for the specified date.
     * @return GetCaseUpdatesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetCaseUpdatesRequestBuilder getCaseUpdates() throws IllegalArgumentException {
        return new GetCaseUpdatesRequestBuilder();
    }
    private okhttp3.Call getCaseUpdatesByCaseIdCall(String caseId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/caseUpdate/{caseId}"
            .replace("{" + "caseId" + "}", localVarApiClient.escapeString(caseId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCaseUpdatesByCaseIdValidateBeforeCall(String caseId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'caseId' is set
        if (caseId == null) {
            throw new ApiException("Missing the required parameter 'caseId' when calling getCaseUpdatesByCaseId(Async)");
        }

        return getCaseUpdatesByCaseIdCall(caseId, _callback);

    }


    private ApiResponse<CaseUpdate> getCaseUpdatesByCaseIdWithHttpInfo(String caseId) throws ApiException {
        okhttp3.Call localVarCall = getCaseUpdatesByCaseIdValidateBeforeCall(caseId, null);
        Type localVarReturnType = new TypeToken<CaseUpdate>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getCaseUpdatesByCaseIdAsync(String caseId, final ApiCallback<CaseUpdate> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCaseUpdatesByCaseIdValidateBeforeCall(caseId, _callback);
        Type localVarReturnType = new TypeToken<CaseUpdate>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetCaseUpdatesByCaseIdRequestBuilder {
        private final String caseId;

        private GetCaseUpdatesByCaseIdRequestBuilder(String caseId) {
            this.caseId = caseId;
        }

        /**
         * Build call for getCaseUpdatesByCaseId
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getCaseUpdatesByCaseIdCall(caseId, _callback);
        }


        /**
         * Execute getCaseUpdatesByCaseId request
         * @return CaseUpdate
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public CaseUpdate execute() throws ApiException {
            ApiResponse<CaseUpdate> localVarResp = getCaseUpdatesByCaseIdWithHttpInfo(caseId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getCaseUpdatesByCaseId request with HTTP info returned
         * @return ApiResponse&lt;CaseUpdate&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CaseUpdate> executeWithHttpInfo() throws ApiException {
            return getCaseUpdatesByCaseIdWithHttpInfo(caseId);
        }

        /**
         * Execute getCaseUpdatesByCaseId request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<CaseUpdate> _callback) throws ApiException {
            return getCaseUpdatesByCaseIdAsync(caseId, _callback);
        }
    }

    /**
     * Get Case Updates for a requested CaseId.
     * Retrieve case updates for the specified case object.
     * @param caseId The caseId value of the case object for which updates are to be retrieved. (required)
     * @return GetCaseUpdatesByCaseIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetCaseUpdatesByCaseIdRequestBuilder getCaseUpdatesByCaseId(String caseId) throws IllegalArgumentException {
        if (caseId == null) throw new IllegalArgumentException("\"caseId\" is required but got null");
            if (caseId != null && caseId.length() < 18) {
              throw new IllegalArgumentException("Invalid value for caseId. Length must be greater than or equal to 18.");
            }

        return new GetCaseUpdatesByCaseIdRequestBuilder(caseId);
    }
}