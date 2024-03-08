/*
 * WebLink API
 * For documentation about this API, please visit https://developer.paylocity.com/integrations/reference/weblink-overview
 *
 * The version of the OpenAPI document: v2
 * Contact: webservices@paylocity.com
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


import com.konfigthis.client.model.AddUpdateDeduction;
import com.konfigthis.client.model.Deduction;
import com.konfigthis.client.model.DeductionAddOrUpdateDeductionRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DeductionApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DeductionApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public DeductionApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call addOrUpdateDeductionCall(DeductionAddOrUpdateDeductionRequest body, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v1/deduction";

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

        String[] localVarAuthNames = new String[] { "paylocity_auth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addOrUpdateDeductionValidateBeforeCall(DeductionAddOrUpdateDeductionRequest body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addOrUpdateDeduction(Async)");
        }

        return addOrUpdateDeductionCall(body, _callback);

    }


    private ApiResponse<Void> addOrUpdateDeductionWithHttpInfo(DeductionAddOrUpdateDeductionRequest body) throws ApiException {
        okhttp3.Call localVarCall = addOrUpdateDeductionValidateBeforeCall(body, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call addOrUpdateDeductionAsync(DeductionAddOrUpdateDeductionRequest body, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = addOrUpdateDeductionValidateBeforeCall(body, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class AddOrUpdateDeductionRequestBuilder {
        private AddUpdateDeduction deduction;

        private AddOrUpdateDeductionRequestBuilder() {
        }

        /**
         * Set deduction
         * @param deduction  (optional)
         * @return AddOrUpdateDeductionRequestBuilder
         */
        public AddOrUpdateDeductionRequestBuilder deduction(AddUpdateDeduction deduction) {
            this.deduction = deduction;
            return this;
        }
        
        /**
         * Build call for addOrUpdateDeduction
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully processed </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            DeductionAddOrUpdateDeductionRequest body = buildBodyParams();
            return addOrUpdateDeductionCall(body, _callback);
        }

        private DeductionAddOrUpdateDeductionRequest buildBodyParams() {
            DeductionAddOrUpdateDeductionRequest body = new DeductionAddOrUpdateDeductionRequest();
            body.deduction(this.deduction);
            return body;
        }

        /**
         * Execute addOrUpdateDeduction request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully processed </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            DeductionAddOrUpdateDeductionRequest body = buildBodyParams();
            addOrUpdateDeductionWithHttpInfo(body);
        }

        /**
         * Execute addOrUpdateDeduction request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully processed </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            DeductionAddOrUpdateDeductionRequest body = buildBodyParams();
            return addOrUpdateDeductionWithHttpInfo(body);
        }

        /**
         * Execute addOrUpdateDeduction request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully processed </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            DeductionAddOrUpdateDeductionRequest body = buildBodyParams();
            return addOrUpdateDeductionAsync(body, _callback);
        }
    }

    /**
     * Add / Update Deduction
     * Add/Update Deduction API sends new or updated employee deduction information directly to Paylocity Payroll/HR solution.
     * @param body Deduction (required)
     * @return AddOrUpdateDeductionRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully processed </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public AddOrUpdateDeductionRequestBuilder addOrUpdateDeduction() throws IllegalArgumentException {
        return new AddOrUpdateDeductionRequestBuilder();
    }
    private okhttp3.Call getAllDeductionsCall(String companyId, String employeeId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/companies/{companyId}/employees/{employeeId}/deductions"
            .replace("{" + "companyId" + "}", localVarApiClient.escapeString(companyId.toString()))
            .replace("{" + "employeeId" + "}", localVarApiClient.escapeString(employeeId.toString()));

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

        String[] localVarAuthNames = new String[] { "paylocity_auth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllDeductionsValidateBeforeCall(String companyId, String employeeId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling getAllDeductions(Async)");
        }

        // verify the required parameter 'employeeId' is set
        if (employeeId == null) {
            throw new ApiException("Missing the required parameter 'employeeId' when calling getAllDeductions(Async)");
        }

        return getAllDeductionsCall(companyId, employeeId, _callback);

    }


    private ApiResponse<List<Deduction>> getAllDeductionsWithHttpInfo(String companyId, String employeeId) throws ApiException {
        okhttp3.Call localVarCall = getAllDeductionsValidateBeforeCall(companyId, employeeId, null);
        Type localVarReturnType = new TypeToken<List<Deduction>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAllDeductionsAsync(String companyId, String employeeId, final ApiCallback<List<Deduction>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllDeductionsValidateBeforeCall(companyId, employeeId, _callback);
        Type localVarReturnType = new TypeToken<List<Deduction>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAllDeductionsRequestBuilder {
        private final String companyId;
        private final String employeeId;

        private GetAllDeductionsRequestBuilder(String companyId, String employeeId) {
            this.companyId = companyId;
            this.employeeId = employeeId;
        }

        /**
         * Build call for getAllDeductions
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully Retrieved </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAllDeductionsCall(companyId, employeeId, _callback);
        }


        /**
         * Execute getAllDeductions request
         * @return List&lt;Deduction&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully Retrieved </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public List<Deduction> execute() throws ApiException {
            ApiResponse<List<Deduction>> localVarResp = getAllDeductionsWithHttpInfo(companyId, employeeId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAllDeductions request with HTTP info returned
         * @return ApiResponse&lt;List&lt;Deduction&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully Retrieved </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<Deduction>> executeWithHttpInfo() throws ApiException {
            return getAllDeductionsWithHttpInfo(companyId, employeeId);
        }

        /**
         * Execute getAllDeductions request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully Retrieved </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<Deduction>> _callback) throws ApiException {
            return getAllDeductionsAsync(companyId, employeeId, _callback);
        }
    }

    /**
     * Get All Deductions
     * Get All Deductions returns all deductions for the selected employee.
     * @param companyId The Paylocity Company Identifier. This is the unique value provided by Paylocity to each specific Payroll Entity.                  **Allowable Values:**                  9 char max (required)
     * @param employeeId The Paylocity Employee ID. This is a unique value per Paylocity Company ID.  **Allowable Values:**  10 char max (required)
     * @return GetAllDeductionsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully Retrieved </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public GetAllDeductionsRequestBuilder getAllDeductions(String companyId, String employeeId) throws IllegalArgumentException {
        if (companyId == null) throw new IllegalArgumentException("\"companyId\" is required but got null");
            

        if (employeeId == null) throw new IllegalArgumentException("\"employeeId\" is required but got null");
            

        return new GetAllDeductionsRequestBuilder(companyId, employeeId);
    }
    private okhttp3.Call getByCodeCall(String companyId, String employeeId, String deductionCode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/companies/{companyId}/employees/{employeeId}/deductions/{deductionCode}"
            .replace("{" + "companyId" + "}", localVarApiClient.escapeString(companyId.toString()))
            .replace("{" + "employeeId" + "}", localVarApiClient.escapeString(employeeId.toString()))
            .replace("{" + "deductionCode" + "}", localVarApiClient.escapeString(deductionCode.toString()));

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

        String[] localVarAuthNames = new String[] { "paylocity_auth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getByCodeValidateBeforeCall(String companyId, String employeeId, String deductionCode, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling getByCode(Async)");
        }

        // verify the required parameter 'employeeId' is set
        if (employeeId == null) {
            throw new ApiException("Missing the required parameter 'employeeId' when calling getByCode(Async)");
        }

        // verify the required parameter 'deductionCode' is set
        if (deductionCode == null) {
            throw new ApiException("Missing the required parameter 'deductionCode' when calling getByCode(Async)");
        }

        return getByCodeCall(companyId, employeeId, deductionCode, _callback);

    }


    private ApiResponse<Deduction> getByCodeWithHttpInfo(String companyId, String employeeId, String deductionCode) throws ApiException {
        okhttp3.Call localVarCall = getByCodeValidateBeforeCall(companyId, employeeId, deductionCode, null);
        Type localVarReturnType = new TypeToken<Deduction>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getByCodeAsync(String companyId, String employeeId, String deductionCode, final ApiCallback<Deduction> _callback) throws ApiException {

        okhttp3.Call localVarCall = getByCodeValidateBeforeCall(companyId, employeeId, deductionCode, _callback);
        Type localVarReturnType = new TypeToken<Deduction>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetByCodeRequestBuilder {
        private final String companyId;
        private final String employeeId;
        private final String deductionCode;

        private GetByCodeRequestBuilder(String companyId, String employeeId, String deductionCode) {
            this.companyId = companyId;
            this.employeeId = employeeId;
            this.deductionCode = deductionCode;
        }

        /**
         * Build call for getByCode
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully Retrieved </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getByCodeCall(companyId, employeeId, deductionCode, _callback);
        }


        /**
         * Execute getByCode request
         * @return Deduction
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully Retrieved </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
         </table>
         */
        public Deduction execute() throws ApiException {
            ApiResponse<Deduction> localVarResp = getByCodeWithHttpInfo(companyId, employeeId, deductionCode);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getByCode request with HTTP info returned
         * @return ApiResponse&lt;Deduction&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully Retrieved </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Deduction> executeWithHttpInfo() throws ApiException {
            return getByCodeWithHttpInfo(companyId, employeeId, deductionCode);
        }

        /**
         * Execute getByCode request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully Retrieved </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Deduction> _callback) throws ApiException {
            return getByCodeAsync(companyId, employeeId, deductionCode, _callback);
        }
    }

    /**
     * Get Deduction for Deduction Code
     * Get Deduction for Deduction Code returns records for a specific deduction for the selected employee.
     * @param companyId The Paylocity Company Identifier. This is the unique value provided by Paylocity to each specific Payroll Entity.                  **Allowable Values:**                  9 char max (required)
     * @param employeeId The Paylocity Employee ID. This is a unique value per Paylocity Company ID.  **Allowable Values:**  10 char max (required)
     * @param deductionCode Deduction Code (required)
     * @return GetByCodeRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully Retrieved </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public GetByCodeRequestBuilder getByCode(String companyId, String employeeId, String deductionCode) throws IllegalArgumentException {
        if (companyId == null) throw new IllegalArgumentException("\"companyId\" is required but got null");
            

        if (employeeId == null) throw new IllegalArgumentException("\"employeeId\" is required but got null");
            

        if (deductionCode == null) throw new IllegalArgumentException("\"deductionCode\" is required but got null");
            

        return new GetByCodeRequestBuilder(companyId, employeeId, deductionCode);
    }
    private okhttp3.Call removeDeductionByCodeAndStartDateCall(String companyId, String employeeId, String deductionCode, String startDate, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/companies/{companyId}/employees/{employeeId}/deductions/{deductionCode}/{startDate}"
            .replace("{" + "companyId" + "}", localVarApiClient.escapeString(companyId.toString()))
            .replace("{" + "employeeId" + "}", localVarApiClient.escapeString(employeeId.toString()))
            .replace("{" + "deductionCode" + "}", localVarApiClient.escapeString(deductionCode.toString()))
            .replace("{" + "startDate" + "}", localVarApiClient.escapeString(startDate.toString()));

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

        String[] localVarAuthNames = new String[] { "paylocity_auth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call removeDeductionByCodeAndStartDateValidateBeforeCall(String companyId, String employeeId, String deductionCode, String startDate, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling removeDeductionByCodeAndStartDate(Async)");
        }

        // verify the required parameter 'employeeId' is set
        if (employeeId == null) {
            throw new ApiException("Missing the required parameter 'employeeId' when calling removeDeductionByCodeAndStartDate(Async)");
        }

        // verify the required parameter 'deductionCode' is set
        if (deductionCode == null) {
            throw new ApiException("Missing the required parameter 'deductionCode' when calling removeDeductionByCodeAndStartDate(Async)");
        }

        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling removeDeductionByCodeAndStartDate(Async)");
        }

        return removeDeductionByCodeAndStartDateCall(companyId, employeeId, deductionCode, startDate, _callback);

    }


    private ApiResponse<Void> removeDeductionByCodeAndStartDateWithHttpInfo(String companyId, String employeeId, String deductionCode, String startDate) throws ApiException {
        okhttp3.Call localVarCall = removeDeductionByCodeAndStartDateValidateBeforeCall(companyId, employeeId, deductionCode, startDate, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call removeDeductionByCodeAndStartDateAsync(String companyId, String employeeId, String deductionCode, String startDate, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeDeductionByCodeAndStartDateValidateBeforeCall(companyId, employeeId, deductionCode, startDate, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class RemoveDeductionByCodeAndStartDateRequestBuilder {
        private final String companyId;
        private final String employeeId;
        private final String deductionCode;
        private final String startDate;

        private RemoveDeductionByCodeAndStartDateRequestBuilder(String companyId, String employeeId, String deductionCode, String startDate) {
            this.companyId = companyId;
            this.employeeId = employeeId;
            this.deductionCode = deductionCode;
            this.startDate = startDate;
        }

        /**
         * Build call for removeDeductionByCodeAndStartDate
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Successfully Deleted </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return removeDeductionByCodeAndStartDateCall(companyId, employeeId, deductionCode, startDate, _callback);
        }


        /**
         * Execute removeDeductionByCodeAndStartDate request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Successfully Deleted </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            removeDeductionByCodeAndStartDateWithHttpInfo(companyId, employeeId, deductionCode, startDate);
        }

        /**
         * Execute removeDeductionByCodeAndStartDate request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Successfully Deleted </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return removeDeductionByCodeAndStartDateWithHttpInfo(companyId, employeeId, deductionCode, startDate);
        }

        /**
         * Execute removeDeductionByCodeAndStartDate request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Successfully Deleted </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return removeDeductionByCodeAndStartDateAsync(companyId, employeeId, deductionCode, startDate, _callback);
        }
    }

    /**
     * Delete deduction for deduction code / start date
     * Delete Deduction API deletes an incorrect deduction from Paylocity Payroll/HR solution.
     * @param companyId The Paylocity Company Identifier. This is the unique value provided by Paylocity to each specific Payroll Entity.                  **Allowable Values:**                  9 char max (required)
     * @param employeeId The Paylocity Employee ID. This is a unique value per Paylocity Company ID.  **Allowable Values:**  10 char max (required)
     * @param deductionCode Deduction Code (required)
     * @param startDate Start Date (required)
     * @return RemoveDeductionByCodeAndStartDateRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Successfully Deleted </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public RemoveDeductionByCodeAndStartDateRequestBuilder removeDeductionByCodeAndStartDate(String companyId, String employeeId, String deductionCode, String startDate) throws IllegalArgumentException {
        if (companyId == null) throw new IllegalArgumentException("\"companyId\" is required but got null");
            

        if (employeeId == null) throw new IllegalArgumentException("\"employeeId\" is required but got null");
            

        if (deductionCode == null) throw new IllegalArgumentException("\"deductionCode\" is required but got null");
            

        if (startDate == null) throw new IllegalArgumentException("\"startDate\" is required but got null");
            

        return new RemoveDeductionByCodeAndStartDateRequestBuilder(companyId, employeeId, deductionCode, startDate);
    }
}
