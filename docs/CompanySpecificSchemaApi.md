# CompanySpecificSchemaApi

All URIs are relative to *https://apisandbox.paylocity.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOpenApiDoc**](CompanySpecificSchemaApi.md#getOpenApiDoc) | **GET** /v2/companies/{companyId}/openapi | Get Company-Specific Open API Documentation |


<a name="getOpenApiDoc"></a>
# **getOpenApiDoc**
> getOpenApiDoc(companyId).execute();

Get Company-Specific Open API Documentation

The company-specific Open API endpoint allows the client to GET an Open API document for the Paylocity API that is customized with company-specific resource schemas. These customized resource schemas define certain properties as enumerations of pre-defined values that correspond to the company&#39;s setup with Paylocity Payroll/HR solution. The customized schemas also indicate which properties are required by the company within Paylocity Payroll/HR solution.&lt;br  /&gt;To learn more about Open API, click [here](https://www.openapis.org/)

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanySpecificSchemaApi;
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
    try {
      client
              .companySpecificSchema
              .getOpenApiDoc(companyId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanySpecificSchemaApi#getOpenApiDoc");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .companySpecificSchema
              .getOpenApiDoc(companyId)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanySpecificSchemaApi#getOpenApiDoc");
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
| **200** | Successfully retrieved |  -  |
| **403** | Forbidden |  -  |
| **429** | Too Many Requests |  -  |

