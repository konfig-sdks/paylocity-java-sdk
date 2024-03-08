# SensitiveDataApi

All URIs are relative to *https://apisandbox.paylocity.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOrUpdateEmployeeSensitiveData**](SensitiveDataApi.md#addOrUpdateEmployeeSensitiveData) | **PUT** /v2/companies/{companyId}/employees/{employeeId}/sensitivedata | Add/update sensitive data |
| [**getEmployeeSensitiveData**](SensitiveDataApi.md#getEmployeeSensitiveData) | **GET** /v2/companies/{companyId}/employees/{employeeId}/sensitivedata | Get sensitive data |


<a name="addOrUpdateEmployeeSensitiveData"></a>
# **addOrUpdateEmployeeSensitiveData**
> addOrUpdateEmployeeSensitiveData(companyId, employeeId, json).execute();

Add/update sensitive data

Sends new or updated employee sensitive data information directly to Paylocity Payroll/HR solution.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SensitiveDataApi;
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
    Object disability = null; // Add or update disability data.
    Object ethnicity = null; // Add or update ethnicity data.
    Object gender = null; // Add or update gender data.
    Object veteran = null; // Add or update veteran data.
    try {
      client
              .sensitiveData
              .addOrUpdateEmployeeSensitiveData(companyId, employeeId)
              .disability(disability)
              .ethnicity(ethnicity)
              .gender(gender)
              .veteran(veteran)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveDataApi#addOrUpdateEmployeeSensitiveData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .sensitiveData
              .addOrUpdateEmployeeSensitiveData(companyId, employeeId)
              .disability(disability)
              .ethnicity(ethnicity)
              .gender(gender)
              .veteran(veteran)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveDataApi#addOrUpdateEmployeeSensitiveData");
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
| **json** | [**SensitiveData**](SensitiveData.md)| Sensitive Data Model | |

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

<a name="getEmployeeSensitiveData"></a>
# **getEmployeeSensitiveData**
> List&lt;SensitiveData&gt; getEmployeeSensitiveData(companyId, employeeId).execute();

Get sensitive data

Gets employee sensitive data information directly from Paylocity Payroll/HR solution.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SensitiveDataApi;
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
      List<SensitiveData> result = client
              .sensitiveData
              .getEmployeeSensitiveData(companyId, employeeId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveDataApi#getEmployeeSensitiveData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<SensitiveData>> response = client
              .sensitiveData
              .getEmployeeSensitiveData(companyId, employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SensitiveDataApi#getEmployeeSensitiveData");
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

[**List&lt;SensitiveData&gt;**](SensitiveData.md)

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

