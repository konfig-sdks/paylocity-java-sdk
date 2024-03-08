# PrimaryStateTaxApi

All URIs are relative to *https://apisandbox.paylocity.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOrUpdateTax**](PrimaryStateTaxApi.md#addOrUpdateTax) | **PUT** /v2/companies/{companyId}/employees/{employeeId}/primaryStateTax | Add/update primary state tax |


<a name="addOrUpdateTax"></a>
# **addOrUpdateTax**
> addOrUpdateTax(companyId, employeeId, json).execute();

Add/update primary state tax

Sends new or updated employee primary state tax information directly to Paylocity Payroll/HR solution.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PrimaryStateTaxApi;
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
    Object amount = null; // State tax code.<br  /> Max length: 50
    Double deductionsAmount = 3.4D; // Box 4(b) on form W4 (year 2020 or later): Deductions amount. <br  />Decimal (12,2)
    Double dependentsAmount = 3.4D; // Box 3 on form W4 (year 2020 or later): Total dependents amount. <br  />Decimal (12,2)
    Object exemptions = null; // State tax exemptions value.<br  />Decimal (12,2)
    Object exemptions2 = null; // State tax exemptions 2 value.<br  />Decimal (12,2)
    Object filingStatus = null; // Employee state tax filing status. Common values are *S* (Single), *M* (Married).<br  />Max length: 50
    Boolean higherRate = true; // Box 2(c) on form W4 (year 2020 or later): Multiple Jobs or Spouse Works. <br  />Boolean
    Double otherIncomeAmount = 3.4D; // Box 4(a) on form W4 (year 2020 or later): Other income amount. <br  />Decimal (12,2)
    Object percentage = null; // State Tax percentage. <br  />Decimal (12,2)
    Object specialCheckCalc = null; // Supplemental check calculation code. Common values are *Blocked* (Taxes blocked on Supplemental checks), *Supp* (Use supplemental Tax Rate-Code). <br  />Max length: 10
    Object taxCalculationCode = null; // Tax calculation code. Common values are *F* (Flat), *P* (Percentage), *FDFP* (Flat Dollar Amount plus Fixed Percentage). <br  />Max length: 10
    Object taxCode = null; // State tax code.<br  /> Max length: 50
    Integer w4FormYear = 56; // The state W4 form year <br  />Integer
    try {
      client
              .primaryStateTax
              .addOrUpdateTax(companyId, employeeId)
              .amount(amount)
              .deductionsAmount(deductionsAmount)
              .dependentsAmount(dependentsAmount)
              .exemptions(exemptions)
              .exemptions2(exemptions2)
              .filingStatus(filingStatus)
              .higherRate(higherRate)
              .otherIncomeAmount(otherIncomeAmount)
              .percentage(percentage)
              .specialCheckCalc(specialCheckCalc)
              .taxCalculationCode(taxCalculationCode)
              .taxCode(taxCode)
              .w4FormYear(w4FormYear)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PrimaryStateTaxApi#addOrUpdateTax");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .primaryStateTax
              .addOrUpdateTax(companyId, employeeId)
              .amount(amount)
              .deductionsAmount(deductionsAmount)
              .dependentsAmount(dependentsAmount)
              .exemptions(exemptions)
              .exemptions2(exemptions2)
              .filingStatus(filingStatus)
              .higherRate(higherRate)
              .otherIncomeAmount(otherIncomeAmount)
              .percentage(percentage)
              .specialCheckCalc(specialCheckCalc)
              .taxCalculationCode(taxCalculationCode)
              .taxCode(taxCode)
              .w4FormYear(w4FormYear)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PrimaryStateTaxApi#addOrUpdateTax");
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
| **json** | [**StateTax**](StateTax.md)| Primary State Tax Model | |

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
| **200** | Successfully added or updated |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **429** | Too Many Requests |  -  |

