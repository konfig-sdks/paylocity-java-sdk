# EmployeeApi

All URIs are relative to *https://apisandbox.paylocity.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addToPaylocity**](EmployeeApi.md#addToPaylocity) | **POST** /v2/companies/{companyId}/employees | Add new employee |
| [**getAllEmployees**](EmployeeApi.md#getAllEmployees) | **GET** /v2/companies/{companyId}/employees | Get all employees |
| [**getEmployeeData**](EmployeeApi.md#getEmployeeData) | **GET** /v2/companies/{companyId}/employees/{employeeId} | Get employee |
| [**updateEmployeeData**](EmployeeApi.md#updateEmployeeData) | **PATCH** /v2/companies/{companyId}/employees/{employeeId} | Update employee |


<a name="addToPaylocity"></a>
# **addToPaylocity**
> List&lt;EmployeeIdResponse&gt; addToPaylocity(companyId, json).execute();

Add new employee

New Employee API sends new employee data directly to Paylocity Payroll/HR solution. Companies who use the New Hire Template in Paylocity Payroll/HR solution may require additional fields when hiring employees. New Employee API Requests will honor these required fields.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeApi;
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
    List<Object> additionalRate = null; // Add Additional Rates.
    Object benefitSetup = null; //  Add or update setup values used for employee benefits integration, insurance plan settings, and ACA reporting.
    Object birthDate = null; // Employee birthdate. Common formats include *MM-DD-CCYY*, *CCYY-MM-DD*.
    Object companyFEIN = null; // Company FEIN as defined in Paylocity Payroll/HR solution, applicable with GET requests only.<br  /> Max length: 20
    Object companyName = null; // Company name as defined in Paylocity Payroll/HR solution, applicable with GET requests only.<br  /> Max length: 50
    Object currency = null; // Employee is paid in this currency. <br  />Max length: 30
    List<Object> customBooleanFields = null; // Up to 8 custom fields of boolean (checkbox) type value.
    List<Object> customDateFields = null; // Up to 8 custom fields of the date type value.
    List<Object> customDropDownFields = null; // Up to 8 custom fields of the dropdown type value.
    List<Object> customNumberFields = null; // Up to 8 custom fields of numeric type value.
    List<Object> customTextFields = null; // Up to 8 custom fields of text type value.
    Object departmentPosition = null; // Add or update home department cost center, position, supervisor, reviewer, employment type, EEO class, pay settings, and union information.
    Object disabilityDescription = null; // Indicates if employee has disability status.
    List<Object> emergencyContacts = null; // Add or update Emergency Contacts.
    Object employeeId = null; // Leave blank to have Paylocity Payroll/HR solution automatically assign the next available employee ID.<br  />Max length: 10
    Object ethnicity = null; // Employee ethnicity.<br  /> Max length: 10
    Object federalTax = null; // Add or update federal tax amount type (taxCalculationCode), amount or percentage, filing status, and exemptions.
    Object firstName = null; // Employee first name. <br  />Max length: 40
    Object gender = null; // Employee gender. Common values *M* (Male), *F* (Female). <br  />Max length: 1
    Object homeAddress = null; // Add or update employee's home address, personal phone numbers, and personal email.
    Boolean isHighlyCompensated = true; // Indicates if employee meets the highly compensated employee criteria.
    Boolean isSmoker = true; // Indicates if employee is a smoker.
    Object lastName = null; // Employee last name. <br  />Max length: 40
    List<Object> localTax = null; // Add, update, or delete local tax code, filing status, and exemptions including  PA-PSD taxes.
    Object mainDirectDeposit = null; // Add the main direct deposit account. After deposits are made to any additional direct deposit accounts, the remaining net check is deposited in the main direct deposit account. IMPORTANT: A direct deposit update will remove ALL existing main and additional direct deposit information in WebPay and replace with what is provided on the request. GET API will not return direct deposit data.
    Object maritalStatus = null; // Employee marital status. Common values *D (Divorced), M (Married), S (Single), W (Widowed)*. <br  />Max length: 10
    Object middleName = null; // Employee middle name.<br  /> Max length: 20
    Object nonPrimaryStateTax = null; // Add or update non-primary state tax code, amount type (taxCalculationCode), amount or percentage, filing status, exemptions, supplemental check (specialCheckCalc), and reciprocity code information.
    Object ownerPercent = null; // Percentage of employee's ownership in the company, entered as a whole number. <br  /> Decimal (12,2)
    Object preferredName = null; // Employee preferred display name.<br  /> Max length: 20
    Object primaryPayRate = null; // Add or update hourly or salary pay rate, effective date, and pay frequency.
    Object primaryStateTax = null; // Add or update primary state tax code, amount type (taxCalculationCode), amount or percentage, filing status, exemptions, and supplemental check (specialCheckCalc) information. Only one primary state is allowed. Sending an updated primary state will replace the current primary state.
    Object priorLastName = null; // Prior last name if applicable.<br  />Max length: 40
    Object salutation = null; // Employee preferred salutation. <br  />Max length: 10
    Object ssn = null; // Employee social security number. Leave it blank if valid social security number not available. <br  />Max length: 11
    Object status = null; // Add or update employee status, change reason, effective date, and adjusted seniority date. Note that companies that are still in Implementation cannot hire future employees.
    Object suffix = null; // Employee name suffix. Common values are *Jr, Sr, II*.<br  />Max length: 30
    Object taxSetup = null; // Add tax form, 1099 exempt reasons and notes, and 943 agricultural employee information. Once the employee receives wages, this information cannot be updated. Add or update SUI tax state, retirement plan, and statutory information.
    Object veteranDescription = null; // Indicates if employee is a veteran.
    Object webTime = null; // Add or update Web Time badge number and charge rate and synchronize Paylocity Payroll/HR solution and Web Time employee data.
    Object workAddress = null; // Add or update employee's work address, phone numbers, and email. Work Location drop down field is not included.
    Object workEligibility = null; // Add or update I-9 work authorization information.
    try {
      List<EmployeeIdResponse> result = client
              .employee
              .addToPaylocity(companyId)
              .additionalDirectDeposit(additionalDirectDeposit)
              .additionalRate(additionalRate)
              .benefitSetup(benefitSetup)
              .birthDate(birthDate)
              .companyFEIN(companyFEIN)
              .companyName(companyName)
              .currency(currency)
              .customBooleanFields(customBooleanFields)
              .customDateFields(customDateFields)
              .customDropDownFields(customDropDownFields)
              .customNumberFields(customNumberFields)
              .customTextFields(customTextFields)
              .departmentPosition(departmentPosition)
              .disabilityDescription(disabilityDescription)
              .emergencyContacts(emergencyContacts)
              .employeeId(employeeId)
              .ethnicity(ethnicity)
              .federalTax(federalTax)
              .firstName(firstName)
              .gender(gender)
              .homeAddress(homeAddress)
              .isHighlyCompensated(isHighlyCompensated)
              .isSmoker(isSmoker)
              .lastName(lastName)
              .localTax(localTax)
              .mainDirectDeposit(mainDirectDeposit)
              .maritalStatus(maritalStatus)
              .middleName(middleName)
              .nonPrimaryStateTax(nonPrimaryStateTax)
              .ownerPercent(ownerPercent)
              .preferredName(preferredName)
              .primaryPayRate(primaryPayRate)
              .primaryStateTax(primaryStateTax)
              .priorLastName(priorLastName)
              .salutation(salutation)
              .ssn(ssn)
              .status(status)
              .suffix(suffix)
              .taxSetup(taxSetup)
              .veteranDescription(veteranDescription)
              .webTime(webTime)
              .workAddress(workAddress)
              .workEligibility(workEligibility)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#addToPaylocity");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeeIdResponse>> response = client
              .employee
              .addToPaylocity(companyId)
              .additionalDirectDeposit(additionalDirectDeposit)
              .additionalRate(additionalRate)
              .benefitSetup(benefitSetup)
              .birthDate(birthDate)
              .companyFEIN(companyFEIN)
              .companyName(companyName)
              .currency(currency)
              .customBooleanFields(customBooleanFields)
              .customDateFields(customDateFields)
              .customDropDownFields(customDropDownFields)
              .customNumberFields(customNumberFields)
              .customTextFields(customTextFields)
              .departmentPosition(departmentPosition)
              .disabilityDescription(disabilityDescription)
              .emergencyContacts(emergencyContacts)
              .employeeId(employeeId)
              .ethnicity(ethnicity)
              .federalTax(federalTax)
              .firstName(firstName)
              .gender(gender)
              .homeAddress(homeAddress)
              .isHighlyCompensated(isHighlyCompensated)
              .isSmoker(isSmoker)
              .lastName(lastName)
              .localTax(localTax)
              .mainDirectDeposit(mainDirectDeposit)
              .maritalStatus(maritalStatus)
              .middleName(middleName)
              .nonPrimaryStateTax(nonPrimaryStateTax)
              .ownerPercent(ownerPercent)
              .preferredName(preferredName)
              .primaryPayRate(primaryPayRate)
              .primaryStateTax(primaryStateTax)
              .priorLastName(priorLastName)
              .salutation(salutation)
              .ssn(ssn)
              .status(status)
              .suffix(suffix)
              .taxSetup(taxSetup)
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
      System.err.println("Exception when calling EmployeeApi#addToPaylocity");
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
| **json** | [**Employee**](Employee.md)| Employee Model | |

### Return type

[**List&lt;EmployeeIdResponse&gt;**](EmployeeIdResponse.md)

### Authorization

[paylocity_auth](../README.md#paylocity_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully added |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **429** | Too Many Requests |  -  |

<a name="getAllEmployees"></a>
# **getAllEmployees**
> List&lt;EmployeeInfo&gt; getAllEmployees(companyId).pagesize(pagesize).pagenumber(pagenumber).includetotalcount(includetotalcount).execute();

Get all employees

Get All Employees API will return employee data currently available in Paylocity Payroll/HR solution. \\ &gt; 🚧 Maintenance Mode &gt;  &gt; _This API is in a limited support mode and certain resources will be moved to a sunset status in the next 18-24 months._ &gt;   &gt; The [Employee Demographic API](ref:get_corehr-v1-companies-companyid-employees) should be used when possible in place of the Employee resources of this API

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeApi;
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
    Integer pagesize = 56; // Number of records per page. Default value is 25.
    Integer pagenumber = 56; // Page number to retrieve; page numbers are 0-based (so to get the first page of results, pass pagenumber=0). Default value is 0.
    Boolean includetotalcount = true; // Whether to include the total record count in the header's X-Pcty-Total-Count property. Default value is true.
    try {
      List<EmployeeInfo> result = client
              .employee
              .getAllEmployees(companyId)
              .pagesize(pagesize)
              .pagenumber(pagenumber)
              .includetotalcount(includetotalcount)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#getAllEmployees");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<EmployeeInfo>> response = client
              .employee
              .getAllEmployees(companyId)
              .pagesize(pagesize)
              .pagenumber(pagenumber)
              .includetotalcount(includetotalcount)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#getAllEmployees");
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
| **pagesize** | **Integer**| Number of records per page. Default value is 25. | [optional] |
| **pagenumber** | **Integer**| Page number to retrieve; page numbers are 0-based (so to get the first page of results, pass pagenumber&#x3D;0). Default value is 0. | [optional] |
| **includetotalcount** | **Boolean**| Whether to include the total record count in the header&#39;s X-Pcty-Total-Count property. Default value is true. | [optional] |

### Return type

[**List&lt;EmployeeInfo&gt;**](EmployeeInfo.md)

### Authorization

[paylocity_auth](../README.md#paylocity_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully Retrieved |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **429** | Too Many Requests |  -  |

<a name="getEmployeeData"></a>
# **getEmployeeData**
> List&lt;Employee&gt; getEmployeeData(companyId, employeeId).execute();

Get employee

Get Employee API will return employee data currently available in Paylocity Payroll/HR solution. \\ &gt; 🚧 Maintenance Mode &gt;  &gt; _This API is in a limited support mode and certain resources will be moved to a sunset status in the next 18-24 months._ &gt;   &gt; The [Employee Demographic API](ref:get_corehr-v1-companies-companyid-employees-employeeid) should be used when possible in place of the Employee resources of this API

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeApi;
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
    String employeeId = "employeeId_example"; // The Paylocity Employee ID. This is a unique value per Paylocity Company ID.  **Allowable Values:**  10 char max
    try {
      List<Employee> result = client
              .employee
              .getEmployeeData(companyId, employeeId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#getEmployeeData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Employee>> response = client
              .employee
              .getEmployeeData(companyId, employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#getEmployeeData");
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
| **employeeId** | **String**| The Paylocity Employee ID. This is a unique value per Paylocity Company ID.  **Allowable Values:**  10 char max | |

### Return type

[**List&lt;Employee&gt;**](Employee.md)

### Authorization

[paylocity_auth](../README.md#paylocity_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully Retrieved |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **429** | Too Many Requests |  -  |

<a name="updateEmployeeData"></a>
# **updateEmployeeData**
> updateEmployeeData(companyId, employeeId, json).execute();

Update employee

Update Employee API will update existing employee data in WebPay.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeApi;
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
    String employeeId = "employeeId_example"; // The Paylocity Employee ID. This is a unique value per Paylocity Company ID.  **Allowable Values:**  10 char max
    List<Object> additionalDirectDeposit = null; // Add up to 19 direct deposit accounts in addition to the main direct deposit account. IMPORTANT: A direct deposit update will remove ALL existing main and additional direct deposit information in WebPay and replace with information provided on the request. GET API will not return direct deposit data.
    List<Object> additionalRate = null; // Add Additional Rates.
    Object benefitSetup = null; //  Add or update setup values used for employee benefits integration, insurance plan settings, and ACA reporting.
    Object birthDate = null; // Employee birthdate. Common formats include *MM-DD-CCYY*, *CCYY-MM-DD*.
    Object companyFEIN = null; // Company FEIN as defined in Paylocity Payroll/HR solution, applicable with GET requests only.<br  /> Max length: 20
    Object companyName = null; // Company name as defined in Paylocity Payroll/HR solution, applicable with GET requests only.<br  /> Max length: 50
    Object currency = null; // Employee is paid in this currency. <br  />Max length: 30
    List<Object> customBooleanFields = null; // Up to 8 custom fields of boolean (checkbox) type value.
    List<Object> customDateFields = null; // Up to 8 custom fields of the date type value.
    List<Object> customDropDownFields = null; // Up to 8 custom fields of the dropdown type value.
    List<Object> customNumberFields = null; // Up to 8 custom fields of numeric type value.
    List<Object> customTextFields = null; // Up to 8 custom fields of text type value.
    Object departmentPosition = null; // Add or update home department cost center, position, supervisor, reviewer, employment type, EEO class, pay settings, and union information.
    Object disabilityDescription = null; // Indicates if employee has disability status.
    List<Object> emergencyContacts = null; // Add or update Emergency Contacts.
    Object employeeId = null; // Leave blank to have Paylocity Payroll/HR solution automatically assign the next available employee ID.<br  />Max length: 10
    Object ethnicity = null; // Employee ethnicity.<br  /> Max length: 10
    Object federalTax = null; // Add or update federal tax amount type (taxCalculationCode), amount or percentage, filing status, and exemptions.
    Object firstName = null; // Employee first name. <br  />Max length: 40
    Object gender = null; // Employee gender. Common values *M* (Male), *F* (Female). <br  />Max length: 1
    Object homeAddress = null; // Add or update employee's home address, personal phone numbers, and personal email.
    Boolean isHighlyCompensated = true; // Indicates if employee meets the highly compensated employee criteria.
    Boolean isSmoker = true; // Indicates if employee is a smoker.
    Object lastName = null; // Employee last name. <br  />Max length: 40
    List<Object> localTax = null; // Add, update, or delete local tax code, filing status, and exemptions including  PA-PSD taxes.
    Object mainDirectDeposit = null; // Add the main direct deposit account. After deposits are made to any additional direct deposit accounts, the remaining net check is deposited in the main direct deposit account. IMPORTANT: A direct deposit update will remove ALL existing main and additional direct deposit information in WebPay and replace with what is provided on the request. GET API will not return direct deposit data.
    Object maritalStatus = null; // Employee marital status. Common values *D (Divorced), M (Married), S (Single), W (Widowed)*. <br  />Max length: 10
    Object middleName = null; // Employee middle name.<br  /> Max length: 20
    Object nonPrimaryStateTax = null; // Add or update non-primary state tax code, amount type (taxCalculationCode), amount or percentage, filing status, exemptions, supplemental check (specialCheckCalc), and reciprocity code information.
    Object ownerPercent = null; // Percentage of employee's ownership in the company, entered as a whole number. <br  /> Decimal (12,2)
    Object preferredName = null; // Employee preferred display name.<br  /> Max length: 20
    Object primaryPayRate = null; // Add or update hourly or salary pay rate, effective date, and pay frequency.
    Object primaryStateTax = null; // Add or update primary state tax code, amount type (taxCalculationCode), amount or percentage, filing status, exemptions, and supplemental check (specialCheckCalc) information. Only one primary state is allowed. Sending an updated primary state will replace the current primary state.
    Object priorLastName = null; // Prior last name if applicable.<br  />Max length: 40
    Object salutation = null; // Employee preferred salutation. <br  />Max length: 10
    Object ssn = null; // Employee social security number. Leave it blank if valid social security number not available. <br  />Max length: 11
    Object status = null; // Add or update employee status, change reason, effective date, and adjusted seniority date. Note that companies that are still in Implementation cannot hire future employees.
    Object suffix = null; // Employee name suffix. Common values are *Jr, Sr, II*.<br  />Max length: 30
    Object taxSetup = null; // Add tax form, 1099 exempt reasons and notes, and 943 agricultural employee information. Once the employee receives wages, this information cannot be updated. Add or update SUI tax state, retirement plan, and statutory information.
    Object veteranDescription = null; // Indicates if employee is a veteran.
    Object webTime = null; // Add or update Web Time badge number and charge rate and synchronize Paylocity Payroll/HR solution and Web Time employee data.
    Object workAddress = null; // Add or update employee's work address, phone numbers, and email. Work Location drop down field is not included.
    Object workEligibility = null; // Add or update I-9 work authorization information.
    try {
      client
              .employee
              .updateEmployeeData(companyId, employeeId)
              .additionalDirectDeposit(additionalDirectDeposit)
              .additionalRate(additionalRate)
              .benefitSetup(benefitSetup)
              .birthDate(birthDate)
              .companyFEIN(companyFEIN)
              .companyName(companyName)
              .currency(currency)
              .customBooleanFields(customBooleanFields)
              .customDateFields(customDateFields)
              .customDropDownFields(customDropDownFields)
              .customNumberFields(customNumberFields)
              .customTextFields(customTextFields)
              .departmentPosition(departmentPosition)
              .disabilityDescription(disabilityDescription)
              .emergencyContacts(emergencyContacts)
              .employeeId(employeeId)
              .ethnicity(ethnicity)
              .federalTax(federalTax)
              .firstName(firstName)
              .gender(gender)
              .homeAddress(homeAddress)
              .isHighlyCompensated(isHighlyCompensated)
              .isSmoker(isSmoker)
              .lastName(lastName)
              .localTax(localTax)
              .mainDirectDeposit(mainDirectDeposit)
              .maritalStatus(maritalStatus)
              .middleName(middleName)
              .nonPrimaryStateTax(nonPrimaryStateTax)
              .ownerPercent(ownerPercent)
              .preferredName(preferredName)
              .primaryPayRate(primaryPayRate)
              .primaryStateTax(primaryStateTax)
              .priorLastName(priorLastName)
              .salutation(salutation)
              .ssn(ssn)
              .status(status)
              .suffix(suffix)
              .taxSetup(taxSetup)
              .veteranDescription(veteranDescription)
              .webTime(webTime)
              .workAddress(workAddress)
              .workEligibility(workEligibility)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#updateEmployeeData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .employee
              .updateEmployeeData(companyId, employeeId)
              .additionalDirectDeposit(additionalDirectDeposit)
              .additionalRate(additionalRate)
              .benefitSetup(benefitSetup)
              .birthDate(birthDate)
              .companyFEIN(companyFEIN)
              .companyName(companyName)
              .currency(currency)
              .customBooleanFields(customBooleanFields)
              .customDateFields(customDateFields)
              .customDropDownFields(customDropDownFields)
              .customNumberFields(customNumberFields)
              .customTextFields(customTextFields)
              .departmentPosition(departmentPosition)
              .disabilityDescription(disabilityDescription)
              .emergencyContacts(emergencyContacts)
              .employeeId(employeeId)
              .ethnicity(ethnicity)
              .federalTax(federalTax)
              .firstName(firstName)
              .gender(gender)
              .homeAddress(homeAddress)
              .isHighlyCompensated(isHighlyCompensated)
              .isSmoker(isSmoker)
              .lastName(lastName)
              .localTax(localTax)
              .mainDirectDeposit(mainDirectDeposit)
              .maritalStatus(maritalStatus)
              .middleName(middleName)
              .nonPrimaryStateTax(nonPrimaryStateTax)
              .ownerPercent(ownerPercent)
              .preferredName(preferredName)
              .primaryPayRate(primaryPayRate)
              .primaryStateTax(primaryStateTax)
              .priorLastName(priorLastName)
              .salutation(salutation)
              .ssn(ssn)
              .status(status)
              .suffix(suffix)
              .taxSetup(taxSetup)
              .veteranDescription(veteranDescription)
              .webTime(webTime)
              .workAddress(workAddress)
              .workEligibility(workEligibility)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeApi#updateEmployeeData");
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
| **employeeId** | **String**| The Paylocity Employee ID. This is a unique value per Paylocity Company ID.  **Allowable Values:**  10 char max | |
| **json** | [**Employee**](Employee.md)| Employee Model | |

### Return type

null (empty response body)

### Authorization

[paylocity_auth](../README.md#paylocity_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully Updated |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **429** | Too Many Requests |  -  |

