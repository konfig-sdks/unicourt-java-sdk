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


import com.konfigthis.client.model.AccessTokenIdListResponse;
import com.konfigthis.client.model.AccessTokenRequest;
import com.konfigthis.client.model.AccessTokenResponse;
import com.konfigthis.client.model.InvalidateAccessTokenRequest;
import com.konfigthis.client.model.Success;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AuthenticationApiApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AuthenticationApiApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public AuthenticationApiApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call generateNewTokenCall(AccessTokenRequest accessTokenRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = accessTokenRequest;

        // create path and map variables
        String localVarPath = "/generateNewToken";

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call generateNewTokenValidateBeforeCall(AccessTokenRequest accessTokenRequest, final ApiCallback _callback) throws ApiException {
        return generateNewTokenCall(accessTokenRequest, _callback);

    }


    private ApiResponse<AccessTokenResponse> generateNewTokenWithHttpInfo(AccessTokenRequest accessTokenRequest) throws ApiException {
        okhttp3.Call localVarCall = generateNewTokenValidateBeforeCall(accessTokenRequest, null);
        Type localVarReturnType = new TypeToken<AccessTokenResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call generateNewTokenAsync(AccessTokenRequest accessTokenRequest, final ApiCallback<AccessTokenResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = generateNewTokenValidateBeforeCall(accessTokenRequest, _callback);
        Type localVarReturnType = new TypeToken<AccessTokenResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GenerateNewTokenRequestBuilder {
        private final String clientId;
        private final String clientSecret;

        private GenerateNewTokenRequestBuilder(String clientId, String clientSecret) {
            this.clientId = clientId;
            this.clientSecret = clientSecret;
        }

        /**
         * Build call for generateNewToken
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
            AccessTokenRequest accessTokenRequest = buildBodyParams();
            return generateNewTokenCall(accessTokenRequest, _callback);
        }

        private AccessTokenRequest buildBodyParams() {
            AccessTokenRequest accessTokenRequest = new AccessTokenRequest();
            accessTokenRequest.clientId(this.clientId);
            accessTokenRequest.clientSecret(this.clientSecret);
            return accessTokenRequest;
        }

        /**
         * Execute generateNewToken request
         * @return AccessTokenResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public AccessTokenResponse execute() throws ApiException {
            AccessTokenRequest accessTokenRequest = buildBodyParams();
            ApiResponse<AccessTokenResponse> localVarResp = generateNewTokenWithHttpInfo(accessTokenRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute generateNewToken request with HTTP info returned
         * @return ApiResponse&lt;AccessTokenResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AccessTokenResponse> executeWithHttpInfo() throws ApiException {
            AccessTokenRequest accessTokenRequest = buildBodyParams();
            return generateNewTokenWithHttpInfo(accessTokenRequest);
        }

        /**
         * Execute generateNewToken request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AccessTokenResponse> _callback) throws ApiException {
            AccessTokenRequest accessTokenRequest = buildBodyParams();
            return generateNewTokenAsync(accessTokenRequest, _callback);
        }
    }

    /**
     * Generate new token to access API.
     * This endpoint allows you to generate a new access token, which is a required field for all UniCourt API endpoints except for the Authentication API. To generate a new token, you must provide your Client ID and Client Secret ID which you can find by logging into your UniCourt account. At any time, you can have a maximum of 10 active access tokens. The tokens never expire and, if you make a request which would otherwise lead to you having more than 10 active tokens, you will receive an error message.
     * @return GenerateNewTokenRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GenerateNewTokenRequestBuilder generateNewToken(String clientId, String clientSecret) throws IllegalArgumentException {
        if (clientId == null) throw new IllegalArgumentException("\"clientId\" is required but got null");
            if (clientId != null && clientId.length() < 32) {
              throw new IllegalArgumentException("Invalid value for clientId. Length must be greater than or equal to 32.");
            }

        if (clientSecret == null) throw new IllegalArgumentException("\"clientSecret\" is required but got null");
            if (clientSecret != null && clientSecret.length() < 64) {
              throw new IllegalArgumentException("Invalid value for clientSecret. Length must be greater than or equal to 64.");
            }

        return new GenerateNewTokenRequestBuilder(clientId, clientSecret);
    }
    private okhttp3.Call getAllTokenIdsCall(AccessTokenRequest accessTokenRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = accessTokenRequest;

        // create path and map variables
        String localVarPath = "/listAllTokenIds";

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllTokenIdsValidateBeforeCall(AccessTokenRequest accessTokenRequest, final ApiCallback _callback) throws ApiException {
        return getAllTokenIdsCall(accessTokenRequest, _callback);

    }


    private ApiResponse<AccessTokenIdListResponse> getAllTokenIdsWithHttpInfo(AccessTokenRequest accessTokenRequest) throws ApiException {
        okhttp3.Call localVarCall = getAllTokenIdsValidateBeforeCall(accessTokenRequest, null);
        Type localVarReturnType = new TypeToken<AccessTokenIdListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAllTokenIdsAsync(AccessTokenRequest accessTokenRequest, final ApiCallback<AccessTokenIdListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllTokenIdsValidateBeforeCall(accessTokenRequest, _callback);
        Type localVarReturnType = new TypeToken<AccessTokenIdListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAllTokenIdsRequestBuilder {
        private final String clientId;
        private final String clientSecret;

        private GetAllTokenIdsRequestBuilder(String clientId, String clientSecret) {
            this.clientId = clientId;
            this.clientSecret = clientSecret;
        }

        /**
         * Build call for getAllTokenIds
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
            AccessTokenRequest accessTokenRequest = buildBodyParams();
            return getAllTokenIdsCall(accessTokenRequest, _callback);
        }

        private AccessTokenRequest buildBodyParams() {
            AccessTokenRequest accessTokenRequest = new AccessTokenRequest();
            accessTokenRequest.clientId(this.clientId);
            accessTokenRequest.clientSecret(this.clientSecret);
            return accessTokenRequest;
        }

        /**
         * Execute getAllTokenIds request
         * @return AccessTokenIdListResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public AccessTokenIdListResponse execute() throws ApiException {
            AccessTokenRequest accessTokenRequest = buildBodyParams();
            ApiResponse<AccessTokenIdListResponse> localVarResp = getAllTokenIdsWithHttpInfo(accessTokenRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAllTokenIds request with HTTP info returned
         * @return ApiResponse&lt;AccessTokenIdListResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<AccessTokenIdListResponse> executeWithHttpInfo() throws ApiException {
            AccessTokenRequest accessTokenRequest = buildBodyParams();
            return getAllTokenIdsWithHttpInfo(accessTokenRequest);
        }

        /**
         * Execute getAllTokenIds request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<AccessTokenIdListResponse> _callback) throws ApiException {
            AccessTokenRequest accessTokenRequest = buildBodyParams();
            return getAllTokenIdsAsync(accessTokenRequest, _callback);
        }
    }

    /**
     * API to list all the access tokens Id.
     * An endpoint which allows you to view all active access tokens associated with your Client ID and Client Secret ID.
     * @return GetAllTokenIdsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public GetAllTokenIdsRequestBuilder getAllTokenIds(String clientId, String clientSecret) throws IllegalArgumentException {
        if (clientId == null) throw new IllegalArgumentException("\"clientId\" is required but got null");
            if (clientId != null && clientId.length() < 32) {
              throw new IllegalArgumentException("Invalid value for clientId. Length must be greater than or equal to 32.");
            }

        if (clientSecret == null) throw new IllegalArgumentException("\"clientSecret\" is required but got null");
            if (clientSecret != null && clientSecret.length() < 64) {
              throw new IllegalArgumentException("Invalid value for clientSecret. Length must be greater than or equal to 64.");
            }

        return new GetAllTokenIdsRequestBuilder(clientId, clientSecret);
    }
    private okhttp3.Call invalidateAccessTokenCall(InvalidateAccessTokenRequest invalidateAccessTokenRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = invalidateAccessTokenRequest;

        // create path and map variables
        String localVarPath = "/invalidateToken";

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call invalidateAccessTokenValidateBeforeCall(InvalidateAccessTokenRequest invalidateAccessTokenRequest, final ApiCallback _callback) throws ApiException {
        return invalidateAccessTokenCall(invalidateAccessTokenRequest, _callback);

    }


    private ApiResponse<Success> invalidateAccessTokenWithHttpInfo(InvalidateAccessTokenRequest invalidateAccessTokenRequest) throws ApiException {
        okhttp3.Call localVarCall = invalidateAccessTokenValidateBeforeCall(invalidateAccessTokenRequest, null);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call invalidateAccessTokenAsync(InvalidateAccessTokenRequest invalidateAccessTokenRequest, final ApiCallback<Success> _callback) throws ApiException {

        okhttp3.Call localVarCall = invalidateAccessTokenValidateBeforeCall(invalidateAccessTokenRequest, _callback);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class InvalidateAccessTokenRequestBuilder {
        private final String clientId;
        private final String clientSecret;
        private final String tokenId;

        private InvalidateAccessTokenRequestBuilder(String clientId, String clientSecret, String tokenId) {
            this.clientId = clientId;
            this.clientSecret = clientSecret;
            this.tokenId = tokenId;
        }

        /**
         * Build call for invalidateAccessToken
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
            InvalidateAccessTokenRequest invalidateAccessTokenRequest = buildBodyParams();
            return invalidateAccessTokenCall(invalidateAccessTokenRequest, _callback);
        }

        private InvalidateAccessTokenRequest buildBodyParams() {
            InvalidateAccessTokenRequest invalidateAccessTokenRequest = new InvalidateAccessTokenRequest();
            invalidateAccessTokenRequest.clientId(this.clientId);
            invalidateAccessTokenRequest.clientSecret(this.clientSecret);
            invalidateAccessTokenRequest.tokenId(this.tokenId);
            return invalidateAccessTokenRequest;
        }

        /**
         * Execute invalidateAccessToken request
         * @return Success
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public Success execute() throws ApiException {
            InvalidateAccessTokenRequest invalidateAccessTokenRequest = buildBodyParams();
            ApiResponse<Success> localVarResp = invalidateAccessTokenWithHttpInfo(invalidateAccessTokenRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute invalidateAccessToken request with HTTP info returned
         * @return ApiResponse&lt;Success&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Success> executeWithHttpInfo() throws ApiException {
            InvalidateAccessTokenRequest invalidateAccessTokenRequest = buildBodyParams();
            return invalidateAccessTokenWithHttpInfo(invalidateAccessTokenRequest);
        }

        /**
         * Execute invalidateAccessToken request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Success> _callback) throws ApiException {
            InvalidateAccessTokenRequest invalidateAccessTokenRequest = buildBodyParams();
            return invalidateAccessTokenAsync(invalidateAccessTokenRequest, _callback);
        }
    }

    /**
     * API to invalidate the access token.
     * An endpoint which allows you to invalidate a given access token.
     * @return InvalidateAccessTokenRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public InvalidateAccessTokenRequestBuilder invalidateAccessToken(String clientId, String clientSecret, String tokenId) throws IllegalArgumentException {
        if (clientId == null) throw new IllegalArgumentException("\"clientId\" is required but got null");
            if (clientId != null && clientId.length() < 32) {
              throw new IllegalArgumentException("Invalid value for clientId. Length must be greater than or equal to 32.");
            }

        if (clientSecret == null) throw new IllegalArgumentException("\"clientSecret\" is required but got null");
            if (clientSecret != null && clientSecret.length() < 64) {
              throw new IllegalArgumentException("Invalid value for clientSecret. Length must be greater than or equal to 64.");
            }

        if (tokenId == null) throw new IllegalArgumentException("\"tokenId\" is required but got null");
            if (tokenId != null && tokenId.length() < 18) {
              throw new IllegalArgumentException("Invalid value for tokenId. Length must be greater than or equal to 18.");
            }

        return new InvalidateAccessTokenRequestBuilder(clientId, clientSecret, tokenId);
    }
    private okhttp3.Call invalidateAllTokensCall(AccessTokenRequest accessTokenRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = accessTokenRequest;

        // create path and map variables
        String localVarPath = "/invalidateAllTokens";

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call invalidateAllTokensValidateBeforeCall(AccessTokenRequest accessTokenRequest, final ApiCallback _callback) throws ApiException {
        return invalidateAllTokensCall(accessTokenRequest, _callback);

    }


    private ApiResponse<Success> invalidateAllTokensWithHttpInfo(AccessTokenRequest accessTokenRequest) throws ApiException {
        okhttp3.Call localVarCall = invalidateAllTokensValidateBeforeCall(accessTokenRequest, null);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call invalidateAllTokensAsync(AccessTokenRequest accessTokenRequest, final ApiCallback<Success> _callback) throws ApiException {

        okhttp3.Call localVarCall = invalidateAllTokensValidateBeforeCall(accessTokenRequest, _callback);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class InvalidateAllTokensRequestBuilder {
        private final String clientId;
        private final String clientSecret;

        private InvalidateAllTokensRequestBuilder(String clientId, String clientSecret) {
            this.clientId = clientId;
            this.clientSecret = clientSecret;
        }

        /**
         * Build call for invalidateAllTokens
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
            AccessTokenRequest accessTokenRequest = buildBodyParams();
            return invalidateAllTokensCall(accessTokenRequest, _callback);
        }

        private AccessTokenRequest buildBodyParams() {
            AccessTokenRequest accessTokenRequest = new AccessTokenRequest();
            accessTokenRequest.clientId(this.clientId);
            accessTokenRequest.clientSecret(this.clientSecret);
            return accessTokenRequest;
        }

        /**
         * Execute invalidateAllTokens request
         * @return Success
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public Success execute() throws ApiException {
            AccessTokenRequest accessTokenRequest = buildBodyParams();
            ApiResponse<Success> localVarResp = invalidateAllTokensWithHttpInfo(accessTokenRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute invalidateAllTokens request with HTTP info returned
         * @return ApiResponse&lt;Success&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Success> executeWithHttpInfo() throws ApiException {
            AccessTokenRequest accessTokenRequest = buildBodyParams();
            return invalidateAllTokensWithHttpInfo(accessTokenRequest);
        }

        /**
         * Execute invalidateAllTokens request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Success> _callback) throws ApiException {
            AccessTokenRequest accessTokenRequest = buildBodyParams();
            return invalidateAllTokensAsync(accessTokenRequest, _callback);
        }
    }

    /**
     * API to invalidate all access tokens.
     * An endpoint which allows you to invalidate all existing access tokens associated with your UniCourt account.
     * @return InvalidateAllTokensRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public InvalidateAllTokensRequestBuilder invalidateAllTokens(String clientId, String clientSecret) throws IllegalArgumentException {
        if (clientId == null) throw new IllegalArgumentException("\"clientId\" is required but got null");
            if (clientId != null && clientId.length() < 32) {
              throw new IllegalArgumentException("Invalid value for clientId. Length must be greater than or equal to 32.");
            }

        if (clientSecret == null) throw new IllegalArgumentException("\"clientSecret\" is required but got null");
            if (clientSecret != null && clientSecret.length() < 64) {
              throw new IllegalArgumentException("Invalid value for clientSecret. Length must be greater than or equal to 64.");
            }

        return new InvalidateAllTokensRequestBuilder(clientId, clientSecret);
    }
}
