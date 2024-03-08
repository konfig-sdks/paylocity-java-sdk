# DeductionApi

All URIs are relative to *https://apisandbox.paylocity.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOrUpdateDeduction**](DeductionApi.md#addOrUpdateDeduction) | **POST** /v1/deduction | Add / Update Deduction |
| [**getAllDeductions**](DeductionApi.md#getAllDeductions) | **GET** /v1/companies/{companyId}/employees/{employeeId}/deductions | Get All Deductions |
| [**getByCode**](DeductionApi.md#getByCode) | **GET** /v1/companies/{companyId}/employees/{employeeId}/deductions/{deductionCode} | Get Deduction for Deduction Code |
| [**removeDeductionByCodeAndStartDate**](DeductionApi.md#removeDeductionByCodeAndStartDate) | **DELETE** /v1/companies/{companyId}/employees/{employeeId}/deductions/{deductionCode}/{startDate} | Delete deduction for deduction code / start date |


<a name="addOrUpdateDeduction"></a>
# **addOrUpdateDeduction**
> addOrUpdateDeduction(body).execute();

Add / Update Deduction

Add/Update Deduction API sends new or updated employee deduction information directly to Paylocity Payroll/HR solution.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DeductionApi;
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
    AddUpdateDeduction deduction = new AddUpdateDeduction();
    try {
      client
              .deduction
              .addOrUpdateDeduction()
              .deduction(deduction)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DeductionApi#addOrUpdateDeduction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .deduction
              .addOrUpdateDeduction()
              .deduction(deduction)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DeductionApi#addOrUpdateDeduction");
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
| **body** | [**DeductionAddOrUpdateDeductionRequest**](DeductionAddOrUpdateDeductionRequest.md)| Deduction | |

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
| **200** | Successfully processed |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a name="getAllDeductions"></a>
# **getAllDeductions**
> List&lt;Deduction&gt; getAllDeductions(companyId, employeeId).execute();

Get All Deductions

Get All Deductions returns all deductions for the selected employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DeductionApi;
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
      List<Deduction> result = client
              .deduction
              .getAllDeductions(companyId, employeeId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeductionApi#getAllDeductions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Deduction>> response = client
              .deduction
              .getAllDeductions(companyId, employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeductionApi#getAllDeductions");
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

[**List&lt;Deduction&gt;**](Deduction.md)

### Authorization

[paylocity_auth](../README.md#paylocity_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully Retrieved |  -  |
| **403** | Forbidden |  -  |

<a name="getByCode"></a>
# **getByCode**
> Deduction getByCode(companyId, employeeId, deductionCode).execute();

Get Deduction for Deduction Code

Get Deduction for Deduction Code returns records for a specific deduction for the selected employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DeductionApi;
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
    String deductionCode = "deductionCode_example"; // Deduction Code
    try {
      Deduction result = client
              .deduction
              .getByCode(companyId, employeeId, deductionCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getAgency());
      System.out.println(result.getAnnualMaximum());
      System.out.println(result.getCalcCode());
      System.out.println(result.getCaseNo());
      System.out.println(result.getCostCenter1());
      System.out.println(result.getCostCenter2());
      System.out.println(result.getCostCenter3());
      System.out.println(result.getDcode());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getFipsCode());
      System.out.println(result.getFrequency());
      System.out.println(result.getGoal());
      System.out.println(result.getIsSelfInsuredPlan());
      System.out.println(result.getLoanFirstPaymentDate401K());
      System.out.println(result.getLoanIssueDate401K());
      System.out.println(result.getLoanNumber());
      System.out.println(result.getMaximum());
      System.out.println(result.getMedicalSupport());
      System.out.println(result.getMinimum());
      System.out.println(result.getMiscInfo());
      System.out.println(result.getPaidTowardsGoal());
      System.out.println(result.getPriority());
      System.out.println(result.getRate());
      System.out.println(result.getReportTerminated());
      System.out.println(result.getStartDate());
      System.out.println(result.getStateAbbrev());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeductionApi#getByCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Deduction> response = client
              .deduction
              .getByCode(companyId, employeeId, deductionCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DeductionApi#getByCode");
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
| **deductionCode** | **String**| Deduction Code | |

### Return type

[**Deduction**](Deduction.md)

### Authorization

[paylocity_auth](../README.md#paylocity_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully Retrieved |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

<a name="removeDeductionByCodeAndStartDate"></a>
# **removeDeductionByCodeAndStartDate**
> removeDeductionByCodeAndStartDate(companyId, employeeId, deductionCode, startDate).execute();

Delete deduction for deduction code / start date

Delete Deduction API deletes an incorrect deduction from Paylocity Payroll/HR solution.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DeductionApi;
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
    String deductionCode = "deductionCode_example"; // Deduction Code
    String startDate = "startDate_example"; // Start Date
    try {
      client
              .deduction
              .removeDeductionByCodeAndStartDate(companyId, employeeId, deductionCode, startDate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling DeductionApi#removeDeductionByCodeAndStartDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .deduction
              .removeDeductionByCodeAndStartDate(companyId, employeeId, deductionCode, startDate)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling DeductionApi#removeDeductionByCodeAndStartDate");
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
| **deductionCode** | **String**| Deduction Code | |
| **startDate** | **String**| Start Date | |

### Return type

null (empty response body)

### Authorization

[paylocity_auth](../README.md#paylocity_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successfully Deleted |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

