# EmployeeStagingApi

All URIs are relative to *https://apisandbox.paylocity.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewEmployeeToWebLink**](EmployeeStagingApi.md#addNewEmployeeToWebLink) | **POST** /v2/weblinkstaging/companies/{companyId}/employees/newemployees | Add new employee to Web Link |


<a name="addNewEmployeeToWebLink"></a>
# **addNewEmployeeToWebLink**
> List&lt;TrackingNumberResponse&gt; addNewEmployeeToWebLink(companyId, json).execute();

Add new employee to Web Link

Add new employee to Web Link will send partially completed or potentially erroneous new hire record to Web Link, where it can be corrected and competed by company administrator or authorized Paylocity Service Bureau employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeStagingApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://apisandbox.paylocity.com/api";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    Paylocity client = new Paylocity(configuration);
    String companyId = "companyId_example"; // The Paylocity Company Identifier. This is the unique value provided by Paylocity to each specific Payroll Entity.                  **Allowable Values:**                  9 char max
    List<Object> additionalDirectDeposit = null; // Add up to 19 direct deposit accounts in addition to the main direct deposit account. IMPORTANT: A direct deposit update will remove ALL existing main and additional direct deposit information in WebPay and replace with information provided on the request. GET API will not return direct deposit data.
    List<Object> benefitSetup = null; // Add setup values used for employee benefits integration, insurance plan settings, and ACA reporting.
    Object birthDate = null; // Employee birthdate. Common formats include *MM-DD-CCYY*, *CCYY-MM-DD*.
    List<Object> customBooleanFields = null; // Up to 8 custom fields of boolean (checkbox) type value.
    List<Object> customDateFields = null; // Up to 8 custom fields of the date type value.
    List<Object> customDropDownFields = null; // Up to 8 custom fields of the dropdown type value.
    List<Object> customNumberFields = null; // Up to 8 custom fields of numeric type value.
    List<Object> customTextFields = null; // Up to 8 custom fields of text type value.
    List<Object> departmentPosition = null; // Add home department cost center, position, supervisor, reviewer, employment type, EEO class, pay settings, and union information.
    Object disabilityDescription = null; // Indicates if employee has disability status.
    Object employeeId = null; // Leave blank to have Paylocity Payroll/HR solution automatically assign the next available employee ID.<br  /> Max length: 10
    Object ethnicity = null; // Employee ethnicity.<br  /> Max length: 10
    List<Object> federalTax = null; // Add federal tax amount type (taxCalculationCode), amount or percentage, filing status, and exemptions.
    Object firstName = null; // Employee first name. <br  />Max length: 40
    Object fitwExemptReason = null; // Reason code for FITW exemption. Common values are *SE* (Statutory employee), *CR* (clergy/Religious). <br  /> Max length: 30
    Object futaExemptReason = null; // Reason code for FUTA exemption. Common values are *501* (5019c)(3) Organization), *IC* (Independent Contractor).<br  /> Max length: 30
    Object gender = null; // Employee gender. Common values *M* (Male), *F* (Female). <br  />Max length: 1
    List<Object> homeAddress = null; // Add employee's home address, personal phone numbers, and personal email.
    Object isEmployee943 = null; // Indicates if employee in agriculture or farming.
    Object isSmoker = null; // Indicates if employee is a smoker.
    Object lastName = null; // Employee last name. <br  />Max length: 40
    List<Object> localTax = null; // Add local tax code, filing status, and exemptions including PA-PSD taxes.
    List<Object> mainDirectDeposit = null; // Add the main direct deposit account. After deposits are made to any additional direct deposit accounts, the remaining net check is deposited in the main direct deposit account. IMPORTANT: A direct deposit update will remove ALL existing main and additional direct deposit information in WebPay and replace with what is provided on the request. GET API will not return direct deposit data.
    Object maritalStatus = null; // Employee marital status. Common values *D (Divorced), M (Married), S (Single), W (Widowed)*. <br  />Max length: 10
    Object medExemptReason = null; // Reason code for Medicare exemption. Common values are *501* (5019c)(3) Organization), *IC* (Independent Contractor).<br  /> Max length: 30
    Object middleName = null; // Employee middle name.<br  /> Max length: 20
    List<Object> nonPrimaryStateTax = null; // Add non-primary state tax code, amount type (taxCalculationCode), amount or percentage, filing status, exemptions, supplemental check (specialCheckCalc), and reciprocity code information.
    Object preferredName = null; // Employee preferred display name.<br  /> Max length: 20
    List<Object> primaryPayRate = null; // Add hourly or salary pay rate, effective date, and pay frequency.
    List<Object> primaryStateTax = null; // Add primary state tax code, amount type (taxCalculationCode), amount or percentage, filing status, exemptions, and supplemental check (specialCheckCalc) information. Only one primary state is allowed.
    Object priorLastName = null; // Prior last name if applicable.<br  />Max length: 40
    Object salutation = null; // Employee preferred salutation. <br  />Max length: 10
    Object sitwExemptReason = null; // Reason code for SITW exemption. Common values are *SE* (Statutory employee), *CR* (clergy/Religious). <br  /> Max length: 30
    Object ssExemptReason = null; // Reason code for Social Security exemption. Common values are *SE* (Statutory employee), *CR* (clergy/Religious). <br  /> Max length: 30
    Object ssn = null; // Employee social security number. Leave it blank if valid social security number not available. <br  />Max length: 11
    List<Object> status = null; // Add employee status, change reason, effective date, and adjusted seniority date. Note that companies that are still in Implementation cannot hire future employees.
    Object suffix = null; // Employee name suffix. Common values are *Jr, Sr, II*.<br  />Max length: 30
    Object suiExemptReason = null; // Reason code for SUI exemption. Common values are *SE* (Statutory employee), *CR* (clergy/Religious). <br  /> Max length: 30
    Object suiState = null; // Employee SUI (State Unemployment Insurance) state. <br  />Max length: 2
    Object taxDistributionCode1099R = null; // Employee 1099R distribution code. Common values are *7* (Normal Distribution), *F* (Charitable Gift Annuity). <br  />Max length: 1
    Object taxForm = null; // Employee tax form for reporting income. Valid values are *W2, 1099M, 1099R*. Default is W2. <br  />Max length: 15
    Object veteranDescription = null; // Indicates if employee is a veteran.
    Object webTime = null; // Add Web Time badge number and charge rate and synchronize Paylocity Payroll/HR solution and Web Time employee data.
    List<Object> workAddress = null; // Add employee's work address, phone numbers, and email. Work Location drop down field is not included.
    List<Object> workEligibility = null; // Add I-9 work authorization information.
    try {
      List<TrackingNumberResponse> result = client
              .employeeStaging
              .addNewEmployeeToWebLink(companyId)
              .additionalDirectDeposit(additionalDirectDeposit)
              .benefitSetup(benefitSetup)
              .birthDate(birthDate)
              .customBooleanFields(customBooleanFields)
              .customDateFields(customDateFields)
              .customDropDownFields(customDropDownFields)
              .customNumberFields(customNumberFields)
              .customTextFields(customTextFields)
              .departmentPosition(departmentPosition)
              .disabilityDescription(disabilityDescription)
              .employeeId(employeeId)
              .ethnicity(ethnicity)
              .federalTax(federalTax)
              .firstName(firstName)
              .fitwExemptReason(fitwExemptReason)
              .futaExemptReason(futaExemptReason)
              .gender(gender)
              .homeAddress(homeAddress)
              .isEmployee943(isEmployee943)
              .isSmoker(isSmoker)
              .lastName(lastName)
              .localTax(localTax)
              .mainDirectDeposit(mainDirectDeposit)
              .maritalStatus(maritalStatus)
              .medExemptReason(medExemptReason)
              .middleName(middleName)
              .nonPrimaryStateTax(nonPrimaryStateTax)
              .preferredName(preferredName)
              .primaryPayRate(primaryPayRate)
              .primaryStateTax(primaryStateTax)
              .priorLastName(priorLastName)
              .salutation(salutation)
              .sitwExemptReason(sitwExemptReason)
              .ssExemptReason(ssExemptReason)
              .ssn(ssn)
              .status(status)
              .suffix(suffix)
              .suiExemptReason(suiExemptReason)
              .suiState(suiState)
              .taxDistributionCode1099R(taxDistributionCode1099R)
              .taxForm(taxForm)
              .veteranDescription(veteranDescription)
              .webTime(webTime)
              .workAddress(workAddress)
              .workEligibility(workEligibility)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeStagingApi#addNewEmployeeToWebLink");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<TrackingNumberResponse>> response = client
              .employeeStaging
              .addNewEmployeeToWebLink(companyId)
              .additionalDirectDeposit(additionalDirectDeposit)
              .benefitSetup(benefitSetup)
              .birthDate(birthDate)
              .customBooleanFields(customBooleanFields)
              .customDateFields(customDateFields)
              .customDropDownFields(customDropDownFields)
              .customNumberFields(customNumberFields)
              .customTextFields(customTextFields)
              .departmentPosition(departmentPosition)
              .disabilityDescription(disabilityDescription)
              .employeeId(employeeId)
              .ethnicity(ethnicity)
              .federalTax(federalTax)
              .firstName(firstName)
              .fitwExemptReason(fitwExemptReason)
              .futaExemptReason(futaExemptReason)
              .gender(gender)
              .homeAddress(homeAddress)
              .isEmployee943(isEmployee943)
              .isSmoker(isSmoker)
              .lastName(lastName)
              .localTax(localTax)
              .mainDirectDeposit(mainDirectDeposit)
              .maritalStatus(maritalStatus)
              .medExemptReason(medExemptReason)
              .middleName(middleName)
              .nonPrimaryStateTax(nonPrimaryStateTax)
              .preferredName(preferredName)
              .primaryPayRate(primaryPayRate)
              .primaryStateTax(primaryStateTax)
              .priorLastName(priorLastName)
              .salutation(salutation)
              .sitwExemptReason(sitwExemptReason)
              .ssExemptReason(ssExemptReason)
              .ssn(ssn)
              .status(status)
              .suffix(suffix)
              .suiExemptReason(suiExemptReason)
              .suiState(suiState)
              .taxDistributionCode1099R(taxDistributionCode1099R)
              .taxForm(taxForm)
              .veteranDescription(veteranDescription)
              .webTime(webTime)
              .workAddress(workAddress)
              .workEligibility(workEligibility)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeStagingApi#addNewEmployeeToWebLink");
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
| **companyId** | **String**| The Paylocity Company Identifier. This is the unique value provided by Paylocity to each specific Payroll Entity.                  **Allowable Values:**                  9 char max | |
| **json** | [**StagedEmployee**](StagedEmployee.md)| StagedEmployee Model | |

### Return type

[**List&lt;TrackingNumberResponse&gt;**](TrackingNumberResponse.md)

### Authorization

[paylocity_auth](../README.md#paylocity_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully Added |  -  |
| **403** | Forbidden |  -  |
| **429** | Too Many Requests |  -  |

