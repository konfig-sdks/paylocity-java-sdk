# OnboardingApi

All URIs are relative to *https://apisandbox.paylocity.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addEmployeeToOnboarding**](OnboardingApi.md#addEmployeeToOnboarding) | **POST** /v1/companies/{companyId}/onboarding/employees | Add Employee to Onboarding |


<a name="addEmployeeToOnboarding"></a>
# **addEmployeeToOnboarding**
> addEmployeeToOnboarding(companyId, body).execute();

Add Employee to Onboarding

Onboarding API sends employee data into Paylocity Onboarding to help ensure an easy and accurate hiring process for subsequent completion into Paylocity Payroll/HR solution.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OnboardingApi;
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
    String firstName = "firstName_example"; // Employee first name. <br  />Max length: 40
    String lastName = "lastName_example"; // Employee last name. <br  />Max length: 40
    String companyId = "companyId_example"; // The Paylocity Company Identifier. This is the unique value provided by Paylocity to each specific Payroll Entity.                  **Allowable Values:**                  9 char max
    String employeeId = "employeeId_example"; // (optional) The Paylocity Employee ID. This is a unique value per Paylocity Company ID.  **Allowable Values:**  10 char max
    String address1 = "address1_example"; // Employee home 1st address line. <br  />Max length: 40
    String address2 = "address2_example"; // Employee home 2nd address line. <br  />Max length: 40
    String autoPayType = "autoPayType_example"; // Valid values are *N, D, S. (N- employee won't automatically receive a salary or hours during payroll, D - employee will be automatically paid in defaultHours during payroll, S - employee will be automatically paid Salary amount during payroll)*. <br  />Max length: 3
    Double baseRate = 3.4D; // Employee base rate, used for Hourly employees. <br  />Decimal (12,2)
    String city = "city_example"; // Employee home city. <br  />Max length: 40
    String costCenter1 = "costCenter1_example"; // Employer defined location, like *branch, division, department, etc.* Must match Company setup. <br  />Max length: 10
    String costCenter2 = "costCenter2_example"; // Employer defined location, like *branch, division, department, etc.* Must match Company setup. <br  />Max length: 10
    String costCenter3 = "costCenter3_example"; // Employer defined location, like *branch, division, department, etc.* Must match Company setup. <br  />Max length: 10
    Double defaultHours = 3.4D; // Employee default hours consistently worked. If autoPayType is set to D, employee will be paid hourly base rate for the defaultHours. <br  />Decimal (12,2)
    String employeeStatus = "employeeStatus_example"; // Employee current work status. Common values are *A (Active), L (Leave of Absence), T (Terminated)*. <br  />Max length: 20
    String employmentType = "employmentType_example"; // Employee current employment type. Common values RFT *(Regular Full Time), RPT (Regular Part Time), SNL (Seasonal), TFT (Temporary Full Time), TPT (Temporary Part Time)*. <br  />Max length: 10
    String federalFilingStatus = "federalFilingStatus_example"; // Employee federal filing status. Common values *M (Married), S (Single)*. <br  />Max length: 10
    String sex = "sex_example"; // Employee gender. Common values *M (Male), F (Female)*. <br  />Max length: 1
    String hireDate = "hireDate_example"; // Employee hired date. Common formats are MM-DD-CCYY, CCYY-MM-DD
    String homePhone = "homePhone_example"; // Employee home phone number. <br  />Max length: 12
    String maritalStatus = "maritalStatus_example"; // Employee marital status. Common values *D (Divorced), M (Married), S (Single), W (Widowed)*. <br  />Max length: 10
    String personalMobilePhone = "personalMobilePhone_example"; // Employee personal mobile phone number. <br  />Max length: 12
    String payFrequency = "payFrequency_example"; // Employee current pay frequency. Common values are *A (Annual), B (Bi-Weekly), D (Daily), M (Monthly), S (Semi-Monthly), Q (Quarterly), W (Weekly)*. <br  />Max length: 5
    String personalEmailAddress = "personalEmailAddress_example"; // Employee personal email address. <br  />Max length: 50
    String payType = "payType_example"; // Employee pay type. Valid values are *Hourly or Salary*. <br  />Max length: 10
    String ratePer = "ratePer_example"; // Employee base rate frequency used with payType Hourly. Common values are *Hour or Week*. Default is Hour <br  />Max length: 10
    Double salary = 3.4D; // Employee gross salary per pay period used with payType Salary. <br  />Decimal (12,2)
    String state = "state_example"; // Employee home state. <br  />Max length: 2
    String ssn = "ssn_example"; // Employee social security number. Leave it blank if valid social security number not available. <br  />Max length: 11
    String stateFilingStatus = "stateFilingStatus_example"; // Employee state filing status. Common values are *M (Married), S (Single)*. <br  />Max length: 50
    String suiState = "suiState_example"; // Employee SUI (State Unemployment Insurance) state. <br  />Max length: 2
    String taxForm = "taxForm_example"; // Employee tax form for reporting income. Valid values are *W2, 1099M, 1099R*. Default is W2. <br  />Max length: 15
    String taxState = "taxState_example"; // Employee primary tax state. <br  />Max Length: 2
    String userName = "userName_example"; // Required. Employer assigned username to log into Onboarding. Duplicate usernames are not allowed. <br  />Must be between 3 and 20 characters and cannot have special characters other than . (period) and _ (underscore)
    String workEmailAddress = "workEmailAddress_example"; // Employee work email. <br  />Max length: 50
    String zip = "zip_example"; // Employee home zip code. <br  />Max length: 10
    try {
      client
              .onboarding
              .addEmployeeToOnboarding(firstName, lastName, companyId)
              .employeeId(employeeId)
              .address1(address1)
              .address2(address2)
              .autoPayType(autoPayType)
              .baseRate(baseRate)
              .city(city)
              .costCenter1(costCenter1)
              .costCenter2(costCenter2)
              .costCenter3(costCenter3)
              .defaultHours(defaultHours)
              .employeeStatus(employeeStatus)
              .employmentType(employmentType)
              .federalFilingStatus(federalFilingStatus)
              .sex(sex)
              .hireDate(hireDate)
              .homePhone(homePhone)
              .maritalStatus(maritalStatus)
              .personalMobilePhone(personalMobilePhone)
              .payFrequency(payFrequency)
              .personalEmailAddress(personalEmailAddress)
              .payType(payType)
              .ratePer(ratePer)
              .salary(salary)
              .state(state)
              .ssn(ssn)
              .stateFilingStatus(stateFilingStatus)
              .suiState(suiState)
              .taxForm(taxForm)
              .taxState(taxState)
              .userName(userName)
              .workEmailAddress(workEmailAddress)
              .zip(zip)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OnboardingApi#addEmployeeToOnboarding");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .onboarding
              .addEmployeeToOnboarding(firstName, lastName, companyId)
              .employeeId(employeeId)
              .address1(address1)
              .address2(address2)
              .autoPayType(autoPayType)
              .baseRate(baseRate)
              .city(city)
              .costCenter1(costCenter1)
              .costCenter2(costCenter2)
              .costCenter3(costCenter3)
              .defaultHours(defaultHours)
              .employeeStatus(employeeStatus)
              .employmentType(employmentType)
              .federalFilingStatus(federalFilingStatus)
              .sex(sex)
              .hireDate(hireDate)
              .homePhone(homePhone)
              .maritalStatus(maritalStatus)
              .personalMobilePhone(personalMobilePhone)
              .payFrequency(payFrequency)
              .personalEmailAddress(personalEmailAddress)
              .payType(payType)
              .ratePer(ratePer)
              .salary(salary)
              .state(state)
              .ssn(ssn)
              .stateFilingStatus(stateFilingStatus)
              .suiState(suiState)
              .taxForm(taxForm)
              .taxState(taxState)
              .userName(userName)
              .workEmailAddress(workEmailAddress)
              .zip(zip)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OnboardingApi#addEmployeeToOnboarding");
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
| **body** | [**Onboarding**](Onboarding.md)| onboarding Model | |

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
| **201** | Successfully Added |  -  |
| **403** | Forbidden |  -  |

