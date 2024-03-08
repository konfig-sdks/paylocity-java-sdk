# LocalTaxApi

All URIs are relative to *https://apisandbox.paylocity.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrUpdateLocalTaxes**](LocalTaxApi.md#createOrUpdateLocalTaxes) | **POST** /v1/companies/{companyId}/employees/{employeeId}/localTaxes | Add Local Tax |
| [**getAllTaxesForEmployee**](LocalTaxApi.md#getAllTaxesForEmployee) | **GET** /v1/companies/{companyId}/employees/{employeeId}/localTaxes | Get All Local Taxes |
| [**getForTaxCode**](LocalTaxApi.md#getForTaxCode) | **GET** /v1/companies/{companyId}/employees/{employeeId}/localTaxes/{taxCode} | Get Local Tax for Tax Code |
| [**removeForTaxCode**](LocalTaxApi.md#removeForTaxCode) | **DELETE** /v1/companies/{companyId}/employees/{employeeId}/localTaxes/{taxCode} | Delete Local Tax for Tax Code |
| [**updateForTaxCode**](LocalTaxApi.md#updateForTaxCode) | **PUT** /v1/companies/{companyId}/employees/{employeeId}/localTaxes/{taxCode} | Update Local Tax |


<a name="createOrUpdateLocalTaxes"></a>
# **createOrUpdateLocalTaxes**
> createOrUpdateLocalTaxes(companyId, employeeId, body).execute();

Add Local Tax

Add Local Tax sends new local tax information directly to Paylocity Payroll/HR solution.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocalTaxApi;
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
    Object exemptions = null; // Local tax exemptions value.<br  />Decimal (12,2)
    Object exemptions2 = null; // Local tax exemptions 2 value.<br  />Decimal (12,2)
    Object filingStatus = null; // Employee local tax filing status. Must match specific local tax setup. <br  /> Max length: 50
    Object residentPSD = null; // Resident PSD (political subdivision code) applicable in PA. Must match Company setup.<br  /> Max length: 9
    Object taxCode = null; // Local tax code.<br  />Max length: 50
    Object workPSD = null; // Work location PSD. Must match Company setup. <br  /> Max length: 9
    try {
      client
              .localTax
              .createOrUpdateLocalTaxes(companyId, employeeId)
              .exemptions(exemptions)
              .exemptions2(exemptions2)
              .filingStatus(filingStatus)
              .residentPSD(residentPSD)
              .taxCode(taxCode)
              .workPSD(workPSD)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalTaxApi#createOrUpdateLocalTaxes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .localTax
              .createOrUpdateLocalTaxes(companyId, employeeId)
              .exemptions(exemptions)
              .exemptions2(exemptions2)
              .filingStatus(filingStatus)
              .residentPSD(residentPSD)
              .taxCode(taxCode)
              .workPSD(workPSD)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalTaxApi#createOrUpdateLocalTaxes");
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
| **body** | [**LocalTax**](LocalTax.md)| localTax Model | |

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
| **201** | Successfully Added |  * location - The URI to the newly created local tax <br>  |
| **403** | Forbidden |  -  |

<a name="getAllTaxesForEmployee"></a>
# **getAllTaxesForEmployee**
> List&lt;LocalTax&gt; getAllTaxesForEmployee(companyId, employeeId).execute();

Get All Local Taxes

Get All Local Taxes returns all local tax information for the selected employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocalTaxApi;
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
      List<LocalTax> result = client
              .localTax
              .getAllTaxesForEmployee(companyId, employeeId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalTaxApi#getAllTaxesForEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<LocalTax>> response = client
              .localTax
              .getAllTaxesForEmployee(companyId, employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalTaxApi#getAllTaxesForEmployee");
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

[**List&lt;LocalTax&gt;**](LocalTax.md)

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

<a name="getForTaxCode"></a>
# **getForTaxCode**
> LocalTax getForTaxCode(companyId, employeeId, taxCode).execute();

Get Local Tax for Tax Code

Get Local Tax for Tax Code returns local tax information for the specific tax code for the selected employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocalTaxApi;
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
    String taxCode = "taxCode_example"; // Tax Code
    try {
      LocalTax result = client
              .localTax
              .getForTaxCode(companyId, employeeId, taxCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getExemptions());
      System.out.println(result.getExemptions2());
      System.out.println(result.getFilingStatus());
      System.out.println(result.getResidentPSD());
      System.out.println(result.getTaxCode());
      System.out.println(result.getWorkPSD());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalTaxApi#getForTaxCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<LocalTax> response = client
              .localTax
              .getForTaxCode(companyId, employeeId, taxCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalTaxApi#getForTaxCode");
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
| **taxCode** | **String**| Tax Code | |

### Return type

[**LocalTax**](LocalTax.md)

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

<a name="removeForTaxCode"></a>
# **removeForTaxCode**
> removeForTaxCode(companyId, employeeId, taxCode).execute();

Delete Local Tax for Tax Code

Delete Local Tax for Tax Code deletes the local tax code from Paylocity Payroll/HR solution.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocalTaxApi;
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
    String taxCode = "taxCode_example"; // Tax Code
    try {
      client
              .localTax
              .removeForTaxCode(companyId, employeeId, taxCode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalTaxApi#removeForTaxCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .localTax
              .removeForTaxCode(companyId, employeeId, taxCode)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalTaxApi#removeForTaxCode");
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
| **taxCode** | **String**| Tax Code | |

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

<a name="updateForTaxCode"></a>
# **updateForTaxCode**
> updateForTaxCode(companyId, employeeId, taxCode, body).execute();

Update Local Tax

Update Local Tax sends updated local tax code information for the selected employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LocalTaxApi;
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
    String taxCode = "taxCode_example"; // Tax Code
    Object exemptions = null; // Local tax exemptions value.<br  />Decimal (12,2)
    Object exemptions2 = null; // Local tax exemptions 2 value.<br  />Decimal (12,2)
    Object filingStatus = null; // Employee local tax filing status. Must match specific local tax setup. <br  /> Max length: 50
    Object residentPSD = null; // Resident PSD (political subdivision code) applicable in PA. Must match Company setup.<br  /> Max length: 9
    Object taxCode = null; // Local tax code.<br  />Max length: 50
    Object workPSD = null; // Work location PSD. Must match Company setup. <br  /> Max length: 9
    try {
      client
              .localTax
              .updateForTaxCode(companyId, employeeId, taxCode)
              .exemptions(exemptions)
              .exemptions2(exemptions2)
              .filingStatus(filingStatus)
              .residentPSD(residentPSD)
              .taxCode(taxCode)
              .workPSD(workPSD)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalTaxApi#updateForTaxCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .localTax
              .updateForTaxCode(companyId, employeeId, taxCode)
              .exemptions(exemptions)
              .exemptions2(exemptions2)
              .filingStatus(filingStatus)
              .residentPSD(residentPSD)
              .taxCode(taxCode)
              .workPSD(workPSD)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling LocalTaxApi#updateForTaxCode");
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
| **taxCode** | **String**| Tax Code | |
| **body** | [**LocalTax**](LocalTax.md)| localTax Model (Note: taxCode can be included in the localTax model but will be ignored) | |

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
| **204** | Successfully Updated |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

