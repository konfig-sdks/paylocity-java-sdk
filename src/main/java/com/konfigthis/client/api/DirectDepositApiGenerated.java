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


import com.konfigthis.client.model.DirectDeposit;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DirectDepositApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DirectDepositApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public DirectDepositApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getAllDirectDepositsCall(String companyId, String employeeId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v2/companies/{companyId}/employees/{employeeId}/directDeposit"
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
    private okhttp3.Call getAllDirectDepositsValidateBeforeCall(String companyId, String employeeId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling getAllDirectDeposits(Async)");
        }

        // verify the required parameter 'employeeId' is set
        if (employeeId == null) {
            throw new ApiException("Missing the required parameter 'employeeId' when calling getAllDirectDeposits(Async)");
        }

        return getAllDirectDepositsCall(companyId, employeeId, _callback);

    }


    private ApiResponse<List<DirectDeposit>> getAllDirectDepositsWithHttpInfo(String companyId, String employeeId) throws ApiException {
        okhttp3.Call localVarCall = getAllDirectDepositsValidateBeforeCall(companyId, employeeId, null);
        Type localVarReturnType = new TypeToken<List<DirectDeposit>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAllDirectDepositsAsync(String companyId, String employeeId, final ApiCallback<List<DirectDeposit>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllDirectDepositsValidateBeforeCall(companyId, employeeId, _callback);
        Type localVarReturnType = new TypeToken<List<DirectDeposit>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAllDirectDepositsRequestBuilder {
        private final String companyId;
        private final String employeeId;

        private GetAllDirectDepositsRequestBuilder(String companyId, String employeeId) {
            this.companyId = companyId;
            this.employeeId = employeeId;
        }

        /**
         * Build call for getAllDirectDeposits
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully Retrieved </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAllDirectDepositsCall(companyId, employeeId, _callback);
        }


        /**
         * Execute getAllDirectDeposits request
         * @return List&lt;DirectDeposit&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully Retrieved </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
         </table>
         */
        public List<DirectDeposit> execute() throws ApiException {
            ApiResponse<List<DirectDeposit>> localVarResp = getAllDirectDepositsWithHttpInfo(companyId, employeeId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAllDirectDeposits request with HTTP info returned
         * @return ApiResponse&lt;List&lt;DirectDeposit&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully Retrieved </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<DirectDeposit>> executeWithHttpInfo() throws ApiException {
            return getAllDirectDepositsWithHttpInfo(companyId, employeeId);
        }

        /**
         * Execute getAllDirectDeposits request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successfully Retrieved </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<DirectDeposit>> _callback) throws ApiException {
            return getAllDirectDepositsAsync(companyId, employeeId, _callback);
        }
    }

    /**
     * Get All Direct Deposit
     * Get All Direct Deposit returns main direct deposit and all additional direct depositsfor the selected employee.
     * @param companyId The Paylocity Company Identifier. This is the unique value provided by Paylocity to each specific Payroll Entity.                  **Allowable Values:**                  9 char max (required)
     * @param employeeId The Paylocity Employee ID. This is a unique value per Paylocity Company ID.  **Allowable Values:**  10 char max (required)
     * @return GetAllDirectDepositsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully Retrieved </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public GetAllDirectDepositsRequestBuilder getAllDirectDeposits(String companyId, String employeeId) throws IllegalArgumentException {
        if (companyId == null) throw new IllegalArgumentException("\"companyId\" is required but got null");
            

        if (employeeId == null) throw new IllegalArgumentException("\"employeeId\" is required but got null");
            

        return new GetAllDirectDepositsRequestBuilder(companyId, employeeId);
    }
}