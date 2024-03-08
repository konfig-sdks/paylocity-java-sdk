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


import com.konfigthis.client.model.StagedEmployee;
import com.konfigthis.client.model.TrackingNumberResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class EmployeeStagingApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EmployeeStagingApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public EmployeeStagingApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call addNewEmployeeToWebLinkCall(String companyId, StagedEmployee json, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = json;

        // create path and map variables
        String localVarPath = "/v2/weblinkstaging/companies/{companyId}/employees/newemployees"
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
    private okhttp3.Call addNewEmployeeToWebLinkValidateBeforeCall(String companyId, StagedEmployee json, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'companyId' is set
        if (companyId == null) {
            throw new ApiException("Missing the required parameter 'companyId' when calling addNewEmployeeToWebLink(Async)");
        }

        // verify the required parameter 'json' is set
        if (json == null) {
            throw new ApiException("Missing the required parameter 'json' when calling addNewEmployeeToWebLink(Async)");
        }

        return addNewEmployeeToWebLinkCall(companyId, json, _callback);

    }


    private ApiResponse<List<TrackingNumberResponse>> addNewEmployeeToWebLinkWithHttpInfo(String companyId, StagedEmployee json) throws ApiException {
        okhttp3.Call localVarCall = addNewEmployeeToWebLinkValidateBeforeCall(companyId, json, null);
        Type localVarReturnType = new TypeToken<List<TrackingNumberResponse>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call addNewEmployeeToWebLinkAsync(String companyId, StagedEmployee json, final ApiCallback<List<TrackingNumberResponse>> _callback) throws ApiException {

        okhttp3.Call localVarCall = addNewEmployeeToWebLinkValidateBeforeCall(companyId, json, _callback);
        Type localVarReturnType = new TypeToken<List<TrackingNumberResponse>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class AddNewEmployeeToWebLinkRequestBuilder {
        private final String companyId;
        private List<Object> additionalDirectDeposit;
        private List<Object> benefitSetup;
        private Object birthDate;
        private List<Object> customBooleanFields;
        private List<Object> customDateFields;
        private List<Object> customDropDownFields;
        private List<Object> customNumberFields;
        private List<Object> customTextFields;
        private List<Object> departmentPosition;
        private Object disabilityDescription;
        private Object employeeId;
        private Object ethnicity;
        private List<Object> federalTax;
        private Object firstName;
        private Object fitwExemptReason;
        private Object futaExemptReason;
        private Object gender;
        private List<Object> homeAddress;
        private Object isEmployee943;
        private Object isSmoker;
        private Object lastName;
        private List<Object> localTax;
        private List<Object> mainDirectDeposit;
        private Object maritalStatus;
        private Object medExemptReason;
        private Object middleName;
        private List<Object> nonPrimaryStateTax;
        private Object preferredName;
        private List<Object> primaryPayRate;
        private List<Object> primaryStateTax;
        private Object priorLastName;
        private Object salutation;
        private Object sitwExemptReason;
        private Object ssExemptReason;
        private Object ssn;
        private List<Object> status;
        private Object suffix;
        private Object suiExemptReason;
        private Object suiState;
        private Object taxDistributionCode1099R;
        private Object taxForm;
        private Object veteranDescription;
        private Object webTime;
        private List<Object> workAddress;
        private List<Object> workEligibility;

        private AddNewEmployeeToWebLinkRequestBuilder(String companyId) {
            this.companyId = companyId;
        }

        /**
         * Set additionalDirectDeposit
         * @param additionalDirectDeposit Add up to 19 direct deposit accounts in addition to the main direct deposit account. IMPORTANT: A direct deposit update will remove ALL existing main and additional direct deposit information in WebPay and replace with information provided on the request. GET API will not return direct deposit data. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder additionalDirectDeposit(List<Object> additionalDirectDeposit) {
            this.additionalDirectDeposit = additionalDirectDeposit;
            return this;
        }
        
        /**
         * Set benefitSetup
         * @param benefitSetup Add setup values used for employee benefits integration, insurance plan settings, and ACA reporting. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder benefitSetup(List<Object> benefitSetup) {
            this.benefitSetup = benefitSetup;
            return this;
        }
        
        /**
         * Set birthDate
         * @param birthDate Employee birthdate. Common formats include *MM-DD-CCYY*, *CCYY-MM-DD*. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder birthDate(Object birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        
        /**
         * Set customBooleanFields
         * @param customBooleanFields Up to 8 custom fields of boolean (checkbox) type value. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder customBooleanFields(List<Object> customBooleanFields) {
            this.customBooleanFields = customBooleanFields;
            return this;
        }
        
        /**
         * Set customDateFields
         * @param customDateFields Up to 8 custom fields of the date type value. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder customDateFields(List<Object> customDateFields) {
            this.customDateFields = customDateFields;
            return this;
        }
        
        /**
         * Set customDropDownFields
         * @param customDropDownFields Up to 8 custom fields of the dropdown type value. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder customDropDownFields(List<Object> customDropDownFields) {
            this.customDropDownFields = customDropDownFields;
            return this;
        }
        
        /**
         * Set customNumberFields
         * @param customNumberFields Up to 8 custom fields of numeric type value. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder customNumberFields(List<Object> customNumberFields) {
            this.customNumberFields = customNumberFields;
            return this;
        }
        
        /**
         * Set customTextFields
         * @param customTextFields Up to 8 custom fields of text type value. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder customTextFields(List<Object> customTextFields) {
            this.customTextFields = customTextFields;
            return this;
        }
        
        /**
         * Set departmentPosition
         * @param departmentPosition Add home department cost center, position, supervisor, reviewer, employment type, EEO class, pay settings, and union information. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder departmentPosition(List<Object> departmentPosition) {
            this.departmentPosition = departmentPosition;
            return this;
        }
        
        /**
         * Set disabilityDescription
         * @param disabilityDescription Indicates if employee has disability status. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder disabilityDescription(Object disabilityDescription) {
            this.disabilityDescription = disabilityDescription;
            return this;
        }
        
        /**
         * Set employeeId
         * @param employeeId Leave blank to have Paylocity Payroll/HR solution automatically assign the next available employee ID.&lt;br  /&gt; Max length: 10 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder employeeId(Object employeeId) {
            this.employeeId = employeeId;
            return this;
        }
        
        /**
         * Set ethnicity
         * @param ethnicity Employee ethnicity.&lt;br  /&gt; Max length: 10 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder ethnicity(Object ethnicity) {
            this.ethnicity = ethnicity;
            return this;
        }
        
        /**
         * Set federalTax
         * @param federalTax Add federal tax amount type (taxCalculationCode), amount or percentage, filing status, and exemptions. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder federalTax(List<Object> federalTax) {
            this.federalTax = federalTax;
            return this;
        }
        
        /**
         * Set firstName
         * @param firstName Employee first name. &lt;br  /&gt;Max length: 40 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder firstName(Object firstName) {
            this.firstName = firstName;
            return this;
        }
        
        /**
         * Set fitwExemptReason
         * @param fitwExemptReason Reason code for FITW exemption. Common values are *SE* (Statutory employee), *CR* (clergy/Religious). &lt;br  /&gt; Max length: 30 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder fitwExemptReason(Object fitwExemptReason) {
            this.fitwExemptReason = fitwExemptReason;
            return this;
        }
        
        /**
         * Set futaExemptReason
         * @param futaExemptReason Reason code for FUTA exemption. Common values are *501* (5019c)(3) Organization), *IC* (Independent Contractor).&lt;br  /&gt; Max length: 30 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder futaExemptReason(Object futaExemptReason) {
            this.futaExemptReason = futaExemptReason;
            return this;
        }
        
        /**
         * Set gender
         * @param gender Employee gender. Common values *M* (Male), *F* (Female). &lt;br  /&gt;Max length: 1 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder gender(Object gender) {
            this.gender = gender;
            return this;
        }
        
        /**
         * Set homeAddress
         * @param homeAddress Add employee&#39;s home address, personal phone numbers, and personal email. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder homeAddress(List<Object> homeAddress) {
            this.homeAddress = homeAddress;
            return this;
        }
        
        /**
         * Set isEmployee943
         * @param isEmployee943 Indicates if employee in agriculture or farming. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder isEmployee943(Object isEmployee943) {
            this.isEmployee943 = isEmployee943;
            return this;
        }
        
        /**
         * Set isSmoker
         * @param isSmoker Indicates if employee is a smoker. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder isSmoker(Object isSmoker) {
            this.isSmoker = isSmoker;
            return this;
        }
        
        /**
         * Set lastName
         * @param lastName Employee last name. &lt;br  /&gt;Max length: 40 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder lastName(Object lastName) {
            this.lastName = lastName;
            return this;
        }
        
        /**
         * Set localTax
         * @param localTax Add local tax code, filing status, and exemptions including PA-PSD taxes. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder localTax(List<Object> localTax) {
            this.localTax = localTax;
            return this;
        }
        
        /**
         * Set mainDirectDeposit
         * @param mainDirectDeposit Add the main direct deposit account. After deposits are made to any additional direct deposit accounts, the remaining net check is deposited in the main direct deposit account. IMPORTANT: A direct deposit update will remove ALL existing main and additional direct deposit information in WebPay and replace with what is provided on the request. GET API will not return direct deposit data. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder mainDirectDeposit(List<Object> mainDirectDeposit) {
            this.mainDirectDeposit = mainDirectDeposit;
            return this;
        }
        
        /**
         * Set maritalStatus
         * @param maritalStatus Employee marital status. Common values *D (Divorced), M (Married), S (Single), W (Widowed)*. &lt;br  /&gt;Max length: 10 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder maritalStatus(Object maritalStatus) {
            this.maritalStatus = maritalStatus;
            return this;
        }
        
        /**
         * Set medExemptReason
         * @param medExemptReason Reason code for Medicare exemption. Common values are *501* (5019c)(3) Organization), *IC* (Independent Contractor).&lt;br  /&gt; Max length: 30 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder medExemptReason(Object medExemptReason) {
            this.medExemptReason = medExemptReason;
            return this;
        }
        
        /**
         * Set middleName
         * @param middleName Employee middle name.&lt;br  /&gt; Max length: 20 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder middleName(Object middleName) {
            this.middleName = middleName;
            return this;
        }
        
        /**
         * Set nonPrimaryStateTax
         * @param nonPrimaryStateTax Add non-primary state tax code, amount type (taxCalculationCode), amount or percentage, filing status, exemptions, supplemental check (specialCheckCalc), and reciprocity code information. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder nonPrimaryStateTax(List<Object> nonPrimaryStateTax) {
            this.nonPrimaryStateTax = nonPrimaryStateTax;
            return this;
        }
        
        /**
         * Set preferredName
         * @param preferredName Employee preferred display name.&lt;br  /&gt; Max length: 20 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder preferredName(Object preferredName) {
            this.preferredName = preferredName;
            return this;
        }
        
        /**
         * Set primaryPayRate
         * @param primaryPayRate Add hourly or salary pay rate, effective date, and pay frequency. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder primaryPayRate(List<Object> primaryPayRate) {
            this.primaryPayRate = primaryPayRate;
            return this;
        }
        
        /**
         * Set primaryStateTax
         * @param primaryStateTax Add primary state tax code, amount type (taxCalculationCode), amount or percentage, filing status, exemptions, and supplemental check (specialCheckCalc) information. Only one primary state is allowed. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder primaryStateTax(List<Object> primaryStateTax) {
            this.primaryStateTax = primaryStateTax;
            return this;
        }
        
        /**
         * Set priorLastName
         * @param priorLastName Prior last name if applicable.&lt;br  /&gt;Max length: 40 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder priorLastName(Object priorLastName) {
            this.priorLastName = priorLastName;
            return this;
        }
        
        /**
         * Set salutation
         * @param salutation Employee preferred salutation. &lt;br  /&gt;Max length: 10 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder salutation(Object salutation) {
            this.salutation = salutation;
            return this;
        }
        
        /**
         * Set sitwExemptReason
         * @param sitwExemptReason Reason code for SITW exemption. Common values are *SE* (Statutory employee), *CR* (clergy/Religious). &lt;br  /&gt; Max length: 30 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder sitwExemptReason(Object sitwExemptReason) {
            this.sitwExemptReason = sitwExemptReason;
            return this;
        }
        
        /**
         * Set ssExemptReason
         * @param ssExemptReason Reason code for Social Security exemption. Common values are *SE* (Statutory employee), *CR* (clergy/Religious). &lt;br  /&gt; Max length: 30 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder ssExemptReason(Object ssExemptReason) {
            this.ssExemptReason = ssExemptReason;
            return this;
        }
        
        /**
         * Set ssn
         * @param ssn Employee social security number. Leave it blank if valid social security number not available. &lt;br  /&gt;Max length: 11 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder ssn(Object ssn) {
            this.ssn = ssn;
            return this;
        }
        
        /**
         * Set status
         * @param status Add employee status, change reason, effective date, and adjusted seniority date. Note that companies that are still in Implementation cannot hire future employees. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder status(List<Object> status) {
            this.status = status;
            return this;
        }
        
        /**
         * Set suffix
         * @param suffix Employee name suffix. Common values are *Jr, Sr, II*.&lt;br  /&gt;Max length: 30 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder suffix(Object suffix) {
            this.suffix = suffix;
            return this;
        }
        
        /**
         * Set suiExemptReason
         * @param suiExemptReason Reason code for SUI exemption. Common values are *SE* (Statutory employee), *CR* (clergy/Religious). &lt;br  /&gt; Max length: 30 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder suiExemptReason(Object suiExemptReason) {
            this.suiExemptReason = suiExemptReason;
            return this;
        }
        
        /**
         * Set suiState
         * @param suiState Employee SUI (State Unemployment Insurance) state. &lt;br  /&gt;Max length: 2 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder suiState(Object suiState) {
            this.suiState = suiState;
            return this;
        }
        
        /**
         * Set taxDistributionCode1099R
         * @param taxDistributionCode1099R Employee 1099R distribution code. Common values are *7* (Normal Distribution), *F* (Charitable Gift Annuity). &lt;br  /&gt;Max length: 1 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder taxDistributionCode1099R(Object taxDistributionCode1099R) {
            this.taxDistributionCode1099R = taxDistributionCode1099R;
            return this;
        }
        
        /**
         * Set taxForm
         * @param taxForm Employee tax form for reporting income. Valid values are *W2, 1099M, 1099R*. Default is W2. &lt;br  /&gt;Max length: 15 (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder taxForm(Object taxForm) {
            this.taxForm = taxForm;
            return this;
        }
        
        /**
         * Set veteranDescription
         * @param veteranDescription Indicates if employee is a veteran. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder veteranDescription(Object veteranDescription) {
            this.veteranDescription = veteranDescription;
            return this;
        }
        
        /**
         * Set webTime
         * @param webTime Add Web Time badge number and charge rate and synchronize Paylocity Payroll/HR solution and Web Time employee data. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder webTime(Object webTime) {
            this.webTime = webTime;
            return this;
        }
        
        /**
         * Set workAddress
         * @param workAddress Add employee&#39;s work address, phone numbers, and email. Work Location drop down field is not included. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder workAddress(List<Object> workAddress) {
            this.workAddress = workAddress;
            return this;
        }
        
        /**
         * Set workEligibility
         * @param workEligibility Add I-9 work authorization information. (optional)
         * @return AddNewEmployeeToWebLinkRequestBuilder
         */
        public AddNewEmployeeToWebLinkRequestBuilder workEligibility(List<Object> workEligibility) {
            this.workEligibility = workEligibility;
            return this;
        }
        
        /**
         * Build call for addNewEmployeeToWebLink
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successfully Added </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            StagedEmployee json = buildBodyParams();
            return addNewEmployeeToWebLinkCall(companyId, json, _callback);
        }

        private StagedEmployee buildBodyParams() {
            StagedEmployee json = new StagedEmployee();
            json.additionalDirectDeposit(this.additionalDirectDeposit);
            json.benefitSetup(this.benefitSetup);
            json.birthDate(this.birthDate);
            json.customBooleanFields(this.customBooleanFields);
            json.customDateFields(this.customDateFields);
            json.customDropDownFields(this.customDropDownFields);
            json.customNumberFields(this.customNumberFields);
            json.customTextFields(this.customTextFields);
            json.departmentPosition(this.departmentPosition);
            json.disabilityDescription(this.disabilityDescription);
            json.employeeId(this.employeeId);
            json.ethnicity(this.ethnicity);
            json.federalTax(this.federalTax);
            json.firstName(this.firstName);
            json.fitwExemptReason(this.fitwExemptReason);
            json.futaExemptReason(this.futaExemptReason);
            json.gender(this.gender);
            json.homeAddress(this.homeAddress);
            json.isEmployee943(this.isEmployee943);
            json.isSmoker(this.isSmoker);
            json.lastName(this.lastName);
            json.localTax(this.localTax);
            json.mainDirectDeposit(this.mainDirectDeposit);
            json.maritalStatus(this.maritalStatus);
            json.medExemptReason(this.medExemptReason);
            json.middleName(this.middleName);
            json.nonPrimaryStateTax(this.nonPrimaryStateTax);
            json.preferredName(this.preferredName);
            json.primaryPayRate(this.primaryPayRate);
            json.primaryStateTax(this.primaryStateTax);
            json.priorLastName(this.priorLastName);
            json.salutation(this.salutation);
            json.sitwExemptReason(this.sitwExemptReason);
            json.ssExemptReason(this.ssExemptReason);
            json.ssn(this.ssn);
            json.status(this.status);
            json.suffix(this.suffix);
            json.suiExemptReason(this.suiExemptReason);
            json.suiState(this.suiState);
            json.taxDistributionCode1099R(this.taxDistributionCode1099R);
            json.taxForm(this.taxForm);
            json.veteranDescription(this.veteranDescription);
            json.webTime(this.webTime);
            json.workAddress(this.workAddress);
            json.workEligibility(this.workEligibility);
            return json;
        }

        /**
         * Execute addNewEmployeeToWebLink request
         * @return List&lt;TrackingNumberResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successfully Added </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
         </table>
         */
        public List<TrackingNumberResponse> execute() throws ApiException {
            StagedEmployee json = buildBodyParams();
            ApiResponse<List<TrackingNumberResponse>> localVarResp = addNewEmployeeToWebLinkWithHttpInfo(companyId, json);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute addNewEmployeeToWebLink request with HTTP info returned
         * @return ApiResponse&lt;List&lt;TrackingNumberResponse&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successfully Added </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<TrackingNumberResponse>> executeWithHttpInfo() throws ApiException {
            StagedEmployee json = buildBodyParams();
            return addNewEmployeeToWebLinkWithHttpInfo(companyId, json);
        }

        /**
         * Execute addNewEmployeeToWebLink request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> Successfully Added </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
            <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<TrackingNumberResponse>> _callback) throws ApiException {
            StagedEmployee json = buildBodyParams();
            return addNewEmployeeToWebLinkAsync(companyId, json, _callback);
        }
    }

    /**
     * Add new employee to Web Link
     * Add new employee to Web Link will send partially completed or potentially erroneous new hire record to Web Link, where it can be corrected and competed by company administrator or authorized Paylocity Service Bureau employee.
     * @param companyId The Paylocity Company Identifier. This is the unique value provided by Paylocity to each specific Payroll Entity.                  **Allowable Values:**                  9 char max (required)
     * @param json StagedEmployee Model (required)
     * @return AddNewEmployeeToWebLinkRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successfully Added </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public AddNewEmployeeToWebLinkRequestBuilder addNewEmployeeToWebLink(String companyId) throws IllegalArgumentException {
        if (companyId == null) throw new IllegalArgumentException("\"companyId\" is required but got null");
            

        return new AddNewEmployeeToWebLinkRequestBuilder(companyId);
    }
}