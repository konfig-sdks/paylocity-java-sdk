# EmployeeBenefitSetupApi

All URIs are relative to *https://apisandbox.paylocity.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOrUpdateBenefitSetup**](EmployeeBenefitSetupApi.md#addOrUpdateBenefitSetup) | **PUT** /v2/companies/{companyId}/employees/{employeeId}/benefitSetup | Add/update employee&#39;s benefit setup |


<a name="addOrUpdateBenefitSetup"></a>
# **addOrUpdateBenefitSetup**
> addOrUpdateBenefitSetup(companyId, employeeId, json).execute();

Add/update employee&#39;s benefit setup

Sends new or updated employee benefit setup information directly to Paylocity Payroll/HR solution.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeBenefitSetupApi;
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
    Object benefitClass = null; // Benefit Class code. Values are configured in Paylocity Payroll/HR solution Company > Setup > Benefits > Classes.<br  />Max length: 30
    Object benefitClassEffectiveDate = null; // Date when Benefit Class takes effect. Common formats include *MM-DD-CCYY*, *CCYY-MM-DD*.
    Object benefitSalary = null; // Salary used to configure benefits.<br  />Decimal(12,2)
    Object benefitSalaryEffectiveDate = null; // Date when Benefit Salary takes effect. Common formats include *MM-DD-CCYY*, *CCYY-MM-DD*.
    Object doNotApplyAdministrativePeriod = null; // Applicable only for HR Enhanced clients and Benefit Classes with ACA Employment Type of Full Time.
    Object isMeasureAcaEligibility = null; // Only valid for HR Enhanced clients and Benefit Classes that are ACA Employment Type of Full Time.
    try {
      client
              .employeeBenefitSetup
              .addOrUpdateBenefitSetup(companyId, employeeId)
              .benefitClass(benefitClass)
              .benefitClassEffectiveDate(benefitClassEffectiveDate)
              .benefitSalary(benefitSalary)
              .benefitSalaryEffectiveDate(benefitSalaryEffectiveDate)
              .doNotApplyAdministrativePeriod(doNotApplyAdministrativePeriod)
              .isMeasureAcaEligibility(isMeasureAcaEligibility)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeBenefitSetupApi#addOrUpdateBenefitSetup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .employeeBenefitSetup
              .addOrUpdateBenefitSetup(companyId, employeeId)
              .benefitClass(benefitClass)
              .benefitClassEffectiveDate(benefitClassEffectiveDate)
              .benefitSalary(benefitSalary)
              .benefitSalaryEffectiveDate(benefitSalaryEffectiveDate)
              .doNotApplyAdministrativePeriod(doNotApplyAdministrativePeriod)
              .isMeasureAcaEligibility(isMeasureAcaEligibility)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeBenefitSetupApi#addOrUpdateBenefitSetup");
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
| **json** | [**BenefitSetup**](BenefitSetup.md)| BenefitSetup Model | |

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

