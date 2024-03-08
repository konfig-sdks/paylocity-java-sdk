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


import com.konfigthis.client.model.Onboarding;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class OnboardingApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OnboardingApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public OnboardingApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call addEmployeeToOnboardingCall(String companyId, Onboarding body, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/v1/companies/{companyId}/onboarding/employees"
            .replace("{" + "companyId" + "}", localVarApiClient.escapeString(companyId.toString()));

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
    private okhttp3.Call addEmployeeToOnboardingValidateBeforeCall(String companyId, Onboarding body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling addEmployeeToOnboarding(Async)");
        }

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addEmployeeToOnboarding(Async)");
        }

        return addEmployeeToOnboardingCall(companyId, body, _callback);

    }


    private ApiResponse<Void> addEmployeeToOnboardingWithHttpInfo(String companyId, Onboarding body) throws ApiException {
        okhttp3.Call localVarCall = addEmployeeToOnboardingValidateBeforeCall(companyId, body, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call addEmployeeToOnboardingAsync(String companyId, Onboarding body, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = addEmployeeToOnboardingValidateBeforeCall(companyId, body, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class AddEmployeeToOnboardingRequestBuilder {
        private final String firstName;
        private final String lastName;
        private final String companyId;
        private String employeeId;
        private String address1;
        private String address2;
        private String autoPayType;
        private Double baseRate;
        private String city;
        private String costCenter1;
        private String costCenter2;
        private String costCenter3;
        private Double defaultHours;
        private String employeeStatus;
        private String employmentType;
        private String federalFilingStatus;
        private String sex;
        private String hireDate;
        private String homePhone;
        private String maritalStatus;
        private String personalMobilePhone;
        private String payFrequency;
        private String personalEmailAddress;
        private String payType;
        private String ratePer;
        private Double salary;
        private String state;
        private String ssn;
        private String stateFilingStatus;
        private String suiState;
        private String taxForm;
        private String taxState;
        private String userName;
        private String workEmailAddress;
        private String zip;

        private AddEmployeeToOnboardingRequestBuilder(String firstName, String lastName, String companyId) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.companyId = companyId;
        }

        /**
         * Set employeeId
         * @param employeeId (optional) The Paylocity Employee ID. This is a unique value per Paylocity Company ID.  **Allowable Values:**  10 char max (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder employeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }
        
        /**
         * Set address1
         * @param address1 Employee home 1st address line. &lt;br  /&gt;Max length: 40 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder address1(String address1) {
            this.address1 = address1;
            return this;
        }
        
        /**
         * Set address2
         * @param address2 Employee home 2nd address line. &lt;br  /&gt;Max length: 40 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder address2(String address2) {
            this.address2 = address2;
            return this;
        }
        
        /**
         * Set autoPayType
         * @param autoPayType Valid values are *N, D, S. (N- employee won&#39;t automatically receive a salary or hours during payroll, D - employee will be automatically paid in defaultHours during payroll, S - employee will be automatically paid Salary amount during payroll)*. &lt;br  /&gt;Max length: 3 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder autoPayType(String autoPayType) {
            this.autoPayType = autoPayType;
            return this;
        }
        
        /**
         * Set baseRate
         * @param baseRate Employee base rate, used for Hourly employees. &lt;br  /&gt;Decimal (12,2) (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder baseRate(Double baseRate) {
            this.baseRate = baseRate;
            return this;
        }
        
        /**
         * Set city
         * @param city Employee home city. &lt;br  /&gt;Max length: 40 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder city(String city) {
            this.city = city;
            return this;
        }
        
        /**
         * Set costCenter1
         * @param costCenter1 Employer defined location, like *branch, division, department, etc.* Must match Company setup. &lt;br  /&gt;Max length: 10 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder costCenter1(String costCenter1) {
            this.costCenter1 = costCenter1;
            return this;
        }
        
        /**
         * Set costCenter2
         * @param costCenter2 Employer defined location, like *branch, division, department, etc.* Must match Company setup. &lt;br  /&gt;Max length: 10 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder costCenter2(String costCenter2) {
            this.costCenter2 = costCenter2;
            return this;
        }
        
        /**
         * Set costCenter3
         * @param costCenter3 Employer defined location, like *branch, division, department, etc.* Must match Company setup. &lt;br  /&gt;Max length: 10 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder costCenter3(String costCenter3) {
            this.costCenter3 = costCenter3;
            return this;
        }
        
        /**
         * Set defaultHours
         * @param defaultHours Employee default hours consistently worked. If autoPayType is set to D, employee will be paid hourly base rate for the defaultHours. &lt;br  /&gt;Decimal (12,2) (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder defaultHours(Double defaultHours) {
            this.defaultHours = defaultHours;
            return this;
        }
        
        /**
         * Set employeeStatus
         * @param employeeStatus Employee current work status. Common values are *A (Active), L (Leave of Absence), T (Terminated)*. &lt;br  /&gt;Max length: 20 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder employeeStatus(String employeeStatus) {
            this.employeeStatus = employeeStatus;
            return this;
        }
        
        /**
         * Set employmentType
         * @param employmentType Employee current employment type. Common values RFT *(Regular Full Time), RPT (Regular Part Time), SNL (Seasonal), TFT (Temporary Full Time), TPT (Temporary Part Time)*. &lt;br  /&gt;Max length: 10 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder employmentType(String employmentType) {
            this.employmentType = employmentType;
            return this;
        }
        
        /**
         * Set federalFilingStatus
         * @param federalFilingStatus Employee federal filing status. Common values *M (Married), S (Single)*. &lt;br  /&gt;Max length: 10 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder federalFilingStatus(String federalFilingStatus) {
            this.federalFilingStatus = federalFilingStatus;
            return this;
        }
        
        /**
         * Set sex
         * @param sex Employee gender. Common values *M (Male), F (Female)*. &lt;br  /&gt;Max length: 1 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder sex(String sex) {
            this.sex = sex;
            return this;
        }
        
        /**
         * Set hireDate
         * @param hireDate Employee hired date. Common formats are MM-DD-CCYY, CCYY-MM-DD (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder hireDate(String hireDate) {
            this.hireDate = hireDate;
            return this;
        }
        
        /**
         * Set homePhone
         * @param homePhone Employee home phone number. &lt;br  /&gt;Max length: 12 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder homePhone(String homePhone) {
            this.homePhone = homePhone;
            return this;
        }
        
        /**
         * Set maritalStatus
         * @param maritalStatus Employee marital status. Common values *D (Divorced), M (Married), S (Single), W (Widowed)*. &lt;br  /&gt;Max length: 10 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder maritalStatus(String maritalStatus) {
            this.maritalStatus = maritalStatus;
            return this;
        }
        
        /**
         * Set personalMobilePhone
         * @param personalMobilePhone Employee personal mobile phone number. &lt;br  /&gt;Max length: 12 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder personalMobilePhone(String personalMobilePhone) {
            this.personalMobilePhone = personalMobilePhone;
            return this;
        }
        
        /**
         * Set payFrequency
         * @param payFrequency Employee current pay frequency. Common values are *A (Annual), B (Bi-Weekly), D (Daily), M (Monthly), S (Semi-Monthly), Q (Quarterly), W (Weekly)*. &lt;br  /&gt;Max length: 5 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder payFrequency(String payFrequency) {
            this.payFrequency = payFrequency;
            return this;
        }
        
        /**
         * Set personalEmailAddress
         * @param personalEmailAddress Employee personal email address. &lt;br  /&gt;Max length: 50 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder personalEmailAddress(String personalEmailAddress) {
            this.personalEmailAddress = personalEmailAddress;
            return this;
        }
        
        /**
         * Set payType
         * @param payType Employee pay type. Valid values are *Hourly or Salary*. &lt;br  /&gt;Max length: 10 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder payType(String payType) {
            this.payType = payType;
            return this;
        }
        
        /**
         * Set ratePer
         * @param ratePer Employee base rate frequency used with payType Hourly. Common values are *Hour or Week*. Default is Hour &lt;br  /&gt;Max length: 10 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder ratePer(String ratePer) {
            this.ratePer = ratePer;
            return this;
        }
        
        /**
         * Set salary
         * @param salary Employee gross salary per pay period used with payType Salary. &lt;br  /&gt;Decimal (12,2) (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder salary(Double salary) {
            this.salary = salary;
            return this;
        }
        
        /**
         * Set state
         * @param state Employee home state. &lt;br  /&gt;Max length: 2 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder state(String state) {
            this.state = state;
            return this;
        }
        
        /**
         * Set ssn
         * @param ssn Employee social security number. Leave it blank if valid social security number not available. &lt;br  /&gt;Max length: 11 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder ssn(String ssn) {
            this.ssn = ssn;
            return this;
        }
        
        /**
         * Set stateFilingStatus
         * @param stateFilingStatus Employee state filing status. Common values are *M (Married), S (Single)*. &lt;br  /&gt;Max length: 50 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder stateFilingStatus(String stateFilingStatus) {
            this.stateFilingStatus = stateFilingStatus;
            return this;
        }
        
        /**
         * Set suiState
         * @param suiState Employee SUI (State Unemployment Insurance) state. &lt;br  /&gt;Max length: 2 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder suiState(String suiState) {
            this.suiState = suiState;
            return this;
        }
        
        /**
         * Set taxForm
         * @param taxForm Employee tax form for reporting income. Valid values are *W2, 1099M, 1099R*. Default is W2. &lt;br  /&gt;Max length: 15 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder taxForm(String taxForm) {
            this.taxForm = taxForm;
            return this;
        }
        
        /**
         * Set taxState
         * @param taxState Employee primary tax state. &lt;br  /&gt;Max Length: 2 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder taxState(String taxState) {
            this.taxState = taxState;
            return this;
        }
        
        /**
         * Set userName
         * @param userName Required. Employer assigned username to log into Onboarding. Duplicate usernames are not allowed. &lt;br  /&gt;Must be between 3 and 20 characters and cannot have special characters other than . (period) and _ (underscore) (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }
        
        /**
         * Set workEmailAddress
         * @param workEmailAddress Employee work email. &lt;br  /&gt;Max length: 50 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder workEmailAddress(String workEmailAddress) {
            this.workEmailAddress = workEmailAddress;
            return this;
        }
        
        /**
         * Set zip
         * @param zip Employee home zip code. &lt;br  /&gt;Max length: 10 (optional)
         * @return AddEmployeeToOnboardingRequestBuilder
         */
        public AddEmployeeToOnboardingRequestBuilder zip(String zip) {
            this.zip = zip;
            return this;
        }
        
        /**
         * Build call for addEmployeeToOnboarding
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successfully Added </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            Onboarding body = buildBodyParams();
            return addEmployeeToOnboardingCall(companyId, body, _callback);
        }

        private Onboarding buildBodyParams() {
            Onboarding body = new Onboarding();
            body.employeeId(this.employeeId);
            body.address1(this.address1);
            body.address2(this.address2);
            body.autoPayType(this.autoPayType);
            body.baseRate(this.baseRate);
            body.city(this.city);
            body.costCenter1(this.costCenter1);
            body.costCenter2(this.costCenter2);
            body.costCenter3(this.costCenter3);
            body.defaultHours(this.defaultHours);
            body.employeeStatus(this.employeeStatus);
            body.employmentType(this.employmentType);
            body.federalFilingStatus(this.federalFilingStatus);
            body.firstName(this.firstName);
            body.sex(this.sex);
            body.hireDate(this.hireDate);
            body.homePhone(this.homePhone);
            body.lastName(this.lastName);
            body.maritalStatus(this.maritalStatus);
            body.personalMobilePhone(this.personalMobilePhone);
            body.payFrequency(this.payFrequency);
            body.personalEmailAddress(this.personalEmailAddress);
            body.payType(this.payType);
            body.ratePer(this.ratePer);
            body.salary(this.salary);
            body.state(this.state);
            body.ssn(this.ssn);
            body.stateFilingStatus(this.stateFilingStatus);
            body.suiState(this.suiState);
            body.taxForm(this.taxForm);
            body.taxState(this.taxState);
            body.userName(this.userName);
            body.workEmailAddress(this.workEmailAddress);
            body.zip(this.zip);
            return body;
        }

        /**
         * Execute addEmployeeToOnboarding request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successfully Added </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            Onboarding body = buildBodyParams();
            addEmployeeToOnboardingWithHttpInfo(companyId, body);
        }

        /**
         * Execute addEmployeeToOnboarding request with HTTP info returned
         * @return ApiResponse&lt;Void&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successfully Added </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            Onboarding body = buildBodyParams();
            return addEmployeeToOnboardingWithHttpInfo(companyId, body);
        }

        /**
         * Execute addEmployeeToOnboarding request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successfully Added </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            Onboarding body = buildBodyParams();
            return addEmployeeToOnboardingAsync(companyId, body, _callback);
        }
    }

    /**
     * Add Employee to Onboarding
     * Onboarding API sends employee data into Paylocity Onboarding to help ensure an easy and accurate hiring process for subsequent completion into Paylocity Payroll/HR solution.
     * @param companyId The Paylocity Company Identifier. This is the unique value provided by Paylocity to each specific Payroll Entity.                  **Allowable Values:**                  9 char max (required)
     * @param body onboarding Model (required)
     * @return AddEmployeeToOnboardingRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successfully Added </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
     </table>
     */
    public AddEmployeeToOnboardingRequestBuilder addEmployeeToOnboarding(String firstName, String lastName, String companyId) throws IllegalArgumentException {
        if (firstName == null) throw new IllegalArgumentException("\"firstName\" is required but got null");
            

        if (lastName == null) throw new IllegalArgumentException("\"lastName\" is required but got null");
            

        if (companyId == null) throw new IllegalArgumentException("\"companyId\" is required but got null");
            

        return new AddEmployeeToOnboardingRequestBuilder(firstName, lastName, companyId);
    }
}
