# PayStatementsApi

All URIs are relative to *https://apisandbox.paylocity.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDetailsByYear**](PayStatementsApi.md#getDetailsByYear) | **GET** /v2/companies/{companyId}/employees/{employeeId}/paystatement/details/{year} | Get employee pay statement details data for the specified year. |
| [**getDetailsByYearAndCheckDate**](PayStatementsApi.md#getDetailsByYearAndCheckDate) | **GET** /v2/companies/{companyId}/employees/{employeeId}/paystatement/details/{year}/{checkDate} | Get employee pay statement details data for the specified year and check date. |
| [**getSummaryByYear**](PayStatementsApi.md#getSummaryByYear) | **GET** /v2/companies/{companyId}/employees/{employeeId}/paystatement/summary/{year} | Get employee pay statement summary data for the specified year. |
| [**getSummaryData**](PayStatementsApi.md#getSummaryData) | **GET** /v2/companies/{companyId}/employees/{employeeId}/paystatement/summary/{year}/{checkDate} | Get employee pay statement summary data for the specified year and check date. |


<a name="getDetailsByYear"></a>
# **getDetailsByYear**
> List&lt;PayStatementDetails&gt; getDetailsByYear(companyId, employeeId, year).pagesize(pagesize).pagenumber(pagenumber).includetotalcount(includetotalcount).codegroup(codegroup).execute();

Get employee pay statement details data for the specified year.

Get pay statement details API will return employee pay statement details data currently available in Paylocity Payroll/HR solution for the specified year.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayStatementsApi;
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
    String year = "year_example"; // The year for which to retrieve pay statement data
    Integer pagesize = 56; // Number of records per page. Default value is 25.
    Integer pagenumber = 56; // Page number to retrieve; page numbers are 0-based (so to get the first page of results, pass pagenumber=0). Default value is 0.
    Boolean includetotalcount = true; // Whether to include the total record count in the header's X-Pcty-Total-Count property. Default value is true.
    String codegroup = "codegroup_example"; // Retrieve pay statement details related to specific deduction, earning or tax types. Common values include 401k, Memo, Reg, OT, Cash Tips, FED and SITW.
    try {
      List<PayStatementDetails> result = client
              .payStatements
              .getDetailsByYear(companyId, employeeId, year)
              .pagesize(pagesize)
              .pagenumber(pagenumber)
              .includetotalcount(includetotalcount)
              .codegroup(codegroup)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayStatementsApi#getDetailsByYear");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PayStatementDetails>> response = client
              .payStatements
              .getDetailsByYear(companyId, employeeId, year)
              .pagesize(pagesize)
              .pagenumber(pagenumber)
              .includetotalcount(includetotalcount)
              .codegroup(codegroup)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayStatementsApi#getDetailsByYear");
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
| **year** | **String**| The year for which to retrieve pay statement data | |
| **pagesize** | **Integer**| Number of records per page. Default value is 25. | [optional] |
| **pagenumber** | **Integer**| Page number to retrieve; page numbers are 0-based (so to get the first page of results, pass pagenumber&#x3D;0). Default value is 0. | [optional] |
| **includetotalcount** | **Boolean**| Whether to include the total record count in the header&#39;s X-Pcty-Total-Count property. Default value is true. | [optional] |
| **codegroup** | **String**| Retrieve pay statement details related to specific deduction, earning or tax types. Common values include 401k, Memo, Reg, OT, Cash Tips, FED and SITW. | [optional] |

### Return type

[**List&lt;PayStatementDetails&gt;**](PayStatementDetails.md)

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

<a name="getDetailsByYearAndCheckDate"></a>
# **getDetailsByYearAndCheckDate**
> List&lt;PayStatementDetails&gt; getDetailsByYearAndCheckDate(companyId, employeeId, year, checkDate).pagesize(pagesize).pagenumber(pagenumber).includetotalcount(includetotalcount).codegroup(codegroup).execute();

Get employee pay statement details data for the specified year and check date.

Get pay statement details API will return employee pay statement detail data currently available in Paylocity Payroll/HR solution for the specified year and check date.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayStatementsApi;
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
    String year = "year_example"; // The year for which to retrieve pay statement data
    String checkDate = "checkDate_example"; // The check date for which to retrieve pay statement data
    Integer pagesize = 56; // Number of records per page. Default value is 25.
    Integer pagenumber = 56; // Page number to retrieve; page numbers are 0-based (so to get the first page of results, pass pagenumber=0). Default value is 0.
    Boolean includetotalcount = true; // Whether to include the total record count in the header's X-Pcty-Total-Count property. Default value is true.
    String codegroup = "codegroup_example"; // Retrieve pay statement details related to specific deduction, earning or tax types. Common values include 401k, Memo, Reg, OT, Cash Tips, FED and SITW.
    try {
      List<PayStatementDetails> result = client
              .payStatements
              .getDetailsByYearAndCheckDate(companyId, employeeId, year, checkDate)
              .pagesize(pagesize)
              .pagenumber(pagenumber)
              .includetotalcount(includetotalcount)
              .codegroup(codegroup)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayStatementsApi#getDetailsByYearAndCheckDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PayStatementDetails>> response = client
              .payStatements
              .getDetailsByYearAndCheckDate(companyId, employeeId, year, checkDate)
              .pagesize(pagesize)
              .pagenumber(pagenumber)
              .includetotalcount(includetotalcount)
              .codegroup(codegroup)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayStatementsApi#getDetailsByYearAndCheckDate");
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
| **year** | **String**| The year for which to retrieve pay statement data | |
| **checkDate** | **String**| The check date for which to retrieve pay statement data | |
| **pagesize** | **Integer**| Number of records per page. Default value is 25. | [optional] |
| **pagenumber** | **Integer**| Page number to retrieve; page numbers are 0-based (so to get the first page of results, pass pagenumber&#x3D;0). Default value is 0. | [optional] |
| **includetotalcount** | **Boolean**| Whether to include the total record count in the header&#39;s X-Pcty-Total-Count property. Default value is true. | [optional] |
| **codegroup** | **String**| Retrieve pay statement details related to specific deduction, earning or tax types. Common values include 401k, Memo, Reg, OT, Cash Tips, FED and SITW. | [optional] |

### Return type

[**List&lt;PayStatementDetails&gt;**](PayStatementDetails.md)

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

<a name="getSummaryByYear"></a>
# **getSummaryByYear**
> List&lt;PayStatementSummary&gt; getSummaryByYear(companyId, employeeId, year).pagesize(pagesize).pagenumber(pagenumber).includetotalcount(includetotalcount).codegroup(codegroup).execute();

Get employee pay statement summary data for the specified year.

Get pay statement summary API will return employee pay statement summary data currently available in Paylocity Payroll/HR solution for the specified year.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayStatementsApi;
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
    String year = "year_example"; // The year for which to retrieve pay statement data
    Integer pagesize = 56; // Number of records per page. Default value is 25.
    Integer pagenumber = 56; // Page number to retrieve; page numbers are 0-based (so to get the first page of results, pass pagenumber=0). Default value is 0.
    Boolean includetotalcount = true; // Whether to include the total record count in the header's X-Pcty-Total-Count property. Default value is true.
    String codegroup = "codegroup_example"; // Retrieve pay statement details related to specific deduction, earning or tax types. Common values include 401k, Memo, Reg, OT, Cash Tips, FED and SITW.
    try {
      List<PayStatementSummary> result = client
              .payStatements
              .getSummaryByYear(companyId, employeeId, year)
              .pagesize(pagesize)
              .pagenumber(pagenumber)
              .includetotalcount(includetotalcount)
              .codegroup(codegroup)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayStatementsApi#getSummaryByYear");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PayStatementSummary>> response = client
              .payStatements
              .getSummaryByYear(companyId, employeeId, year)
              .pagesize(pagesize)
              .pagenumber(pagenumber)
              .includetotalcount(includetotalcount)
              .codegroup(codegroup)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayStatementsApi#getSummaryByYear");
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
| **year** | **String**| The year for which to retrieve pay statement data | |
| **pagesize** | **Integer**| Number of records per page. Default value is 25. | [optional] |
| **pagenumber** | **Integer**| Page number to retrieve; page numbers are 0-based (so to get the first page of results, pass pagenumber&#x3D;0). Default value is 0. | [optional] |
| **includetotalcount** | **Boolean**| Whether to include the total record count in the header&#39;s X-Pcty-Total-Count property. Default value is true. | [optional] |
| **codegroup** | **String**| Retrieve pay statement details related to specific deduction, earning or tax types. Common values include 401k, Memo, Reg, OT, Cash Tips, FED and SITW. | [optional] |

### Return type

[**List&lt;PayStatementSummary&gt;**](PayStatementSummary.md)

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

<a name="getSummaryData"></a>
# **getSummaryData**
> List&lt;PayStatementSummary&gt; getSummaryData(companyId, employeeId, year, checkDate).pagesize(pagesize).pagenumber(pagenumber).includetotalcount(includetotalcount).codegroup(codegroup).execute();

Get employee pay statement summary data for the specified year and check date.

Get pay statement summary API will return employee pay statement summary data currently available in Paylocity Payroll/HR solution for the specified year and check date.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PayStatementsApi;
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
    String year = "year_example"; // The year for which to retrieve pay statement data
    String checkDate = "checkDate_example"; // The check date for which to retrieve pay statement data
    Integer pagesize = 56; // Number of records per page. Default value is 25.
    Integer pagenumber = 56; // Page number to retrieve; page numbers are 0-based (so to get the first page of results, pass pagenumber=0). Default value is 0.
    Boolean includetotalcount = true; // Whether to include the total record count in the header's X-Pcty-Total-Count property. Default value is true.
    String codegroup = "codegroup_example"; // Retrieve pay statement details related to specific deduction, earning or tax types. Common values include 401k, Memo, Reg, OT, Cash Tips, FED and SITW.
    try {
      List<PayStatementSummary> result = client
              .payStatements
              .getSummaryData(companyId, employeeId, year, checkDate)
              .pagesize(pagesize)
              .pagenumber(pagenumber)
              .includetotalcount(includetotalcount)
              .codegroup(codegroup)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayStatementsApi#getSummaryData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<PayStatementSummary>> response = client
              .payStatements
              .getSummaryData(companyId, employeeId, year, checkDate)
              .pagesize(pagesize)
              .pagenumber(pagenumber)
              .includetotalcount(includetotalcount)
              .codegroup(codegroup)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling PayStatementsApi#getSummaryData");
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
| **year** | **String**| The year for which to retrieve pay statement data | |
| **checkDate** | **String**| The check date for which to retrieve pay statement data | |
| **pagesize** | **Integer**| Number of records per page. Default value is 25. | [optional] |
| **pagenumber** | **Integer**| Page number to retrieve; page numbers are 0-based (so to get the first page of results, pass pagenumber&#x3D;0). Default value is 0. | [optional] |
| **includetotalcount** | **Boolean**| Whether to include the total record count in the header&#39;s X-Pcty-Total-Count property. Default value is true. | [optional] |
| **codegroup** | **String**| Retrieve pay statement details related to specific deduction, earning or tax types. Common values include 401k, Memo, Reg, OT, Cash Tips, FED and SITW. | [optional] |

### Return type

[**List&lt;PayStatementSummary&gt;**](PayStatementSummary.md)

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

