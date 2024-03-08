# AdditionalRatesApi

All URIs are relative to *https://apisandbox.paylocity.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateEmployeeAdditionalRates**](AdditionalRatesApi.md#updateEmployeeAdditionalRates) | **PUT** /v2/companies/{companyId}/employees/{employeeId}/additionalRates | Add/update additional rates |


<a name="updateEmployeeAdditionalRates"></a>
# **updateEmployeeAdditionalRates**
> updateEmployeeAdditionalRates(companyId, employeeId, json).execute();

Add/update additional rates

Sends new or updated employee additional rates information directly to Paylocity Payroll/HR solution.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdditionalRatesApi;
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
    Object changeReason = null; // Not required. If populated, must match one of the system coded values available in the Additional Rates Change Reason drop down.<br />
    Object costCenter1 = null; // Not required. Valid values must match one of the system coded cost centers available in the Additional Rates Cost Center level 1 drop down. This cell must be in a text format.<br />
    Object costCenter2 = null; // Not required. Valid values must match one of the system coded cost centers available in the Additional Rates Cost Center level 2 drop down. This cell must be in a text format.<br />
    Object costCenter3 = null; // Not required. Valid values must match one of the system coded cost centers available in the Additional Rates Cost Center level 3 drop down. This cell must be in a text format.<br />
    Object effectiveDate = null; // Required. Common formats include *MM-DD-CCYY*, *CCYY-MM-DD*.<br />
    Object endCheckDate = null; // Not required. Must match one of the system coded check dates available in the Additional Rates End Check Date drop down. Common formats include *MM-DD-CCYY*, *CCYY-MM-DD*.<br />
    Object job = null; // Not required. If populated, must match one of the system coded values available in the Additional Rates Job drop down.<br />
    Object rate = null; // Required. Enter dollar amount that corresponds to the Per selection.<br />
    Object rateCode = null; // Required. If populated, must match one of the system coded values available in the Additional Rates Rate Code drop down.<br />
    Object rateNotes = null; // Not required.<br  />Max length: 4000<br />
    Object ratePer = null; // Required. Valid values are HOUR or WEEK.<br />
    Object shift = null; // Not required. If populated, must match one of the system coded values available in the Additional Rates Shift drop down.<br />
    try {
      client
              .additionalRates
              .updateEmployeeAdditionalRates(companyId, employeeId)
              .changeReason(changeReason)
              .costCenter1(costCenter1)
              .costCenter2(costCenter2)
              .costCenter3(costCenter3)
              .effectiveDate(effectiveDate)
              .endCheckDate(endCheckDate)
              .job(job)
              .rate(rate)
              .rateCode(rateCode)
              .rateNotes(rateNotes)
              .ratePer(ratePer)
              .shift(shift)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AdditionalRatesApi#updateEmployeeAdditionalRates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .additionalRates
              .updateEmployeeAdditionalRates(companyId, employeeId)
              .changeReason(changeReason)
              .costCenter1(costCenter1)
              .costCenter2(costCenter2)
              .costCenter3(costCenter3)
              .effectiveDate(effectiveDate)
              .endCheckDate(endCheckDate)
              .job(job)
              .rate(rate)
              .rateCode(rateCode)
              .rateNotes(rateNotes)
              .ratePer(ratePer)
              .shift(shift)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AdditionalRatesApi#updateEmployeeAdditionalRates");
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
| **json** | [**AdditionalRate**](AdditionalRate.md)| Additional Rate Model | |

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

