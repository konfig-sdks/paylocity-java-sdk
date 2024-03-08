# EarningsApi

All URIs are relative to *https://apisandbox.paylocity.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOrUpdateEarning**](EarningsApi.md#addOrUpdateEarning) | **PUT** /v2/companies/{companyId}/employees/{employeeId}/earnings | Add/Update Earning |
| [**deleteByCodeAndStart**](EarningsApi.md#deleteByCodeAndStart) | **DELETE** /v2/companies/{companyId}/employees/{employeeId}/earnings/{earningCode}/{startDate} | Delete Earning by Earning Code and Start Date |
| [**getAll**](EarningsApi.md#getAll) | **GET** /v2/companies/{companyId}/employees/{employeeId}/earnings | Get All Earnings |
| [**getByCodeAndStart**](EarningsApi.md#getByCodeAndStart) | **GET** /v2/companies/{companyId}/employees/{employeeId}/earnings/{earningCode}/{startDate} | Get Earning by Earning Code and Start Date |
| [**getByEarningCode**](EarningsApi.md#getByEarningCode) | **GET** /v2/companies/{companyId}/employees/{employeeId}/earnings/{earningCode} | Get Earnings by Earning Code |


<a name="addOrUpdateEarning"></a>
# **addOrUpdateEarning**
> addOrUpdateEarning(companyId, employeeId, json).execute();

Add/Update Earning

Add/Update Earning API sends new or updated employee earnings information directly to Paylocity Payroll/HR solution.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EarningsApi;
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
    Object earningCode = null; // Earning code. Must match Company setup. <br  />Max length: 10
    Object startDate = null; // Start date of an earning based on payroll calendar. Common formats are MM-DD-CCYY, CCYY-MM-DD.
    String companyId = "companyId_example"; // The Paylocity Company Identifier. This is the unique value provided by Paylocity to each specific Payroll Entity.                  **Allowable Values:**                  9 char max
    String employeeId = "employeeId_example"; // The Paylocity Employee ID. This is a unique value per Paylocity Company ID.  **Allowable Values:**  10 char max
    Object agency = null; // Third-party agency associated with earning. Must match Company setup.<br  />Max length: 10
    Object amount = null; // Value that matches CalculationCode to add to gross wages. For percentage (%), enter whole number (10 = 10%).  <br  />Decimal(12,2)
    Object annualMaximum = null; // Year to Date dollar amount not to be exceeded for an earning in the calendar year. Used only with company driven maximums. <br  />Decimal(12,2)
    Object calculationCode = null; // Defines how earnings are calculated. Common values are *% (percentage of gross), flat (flat dollar amount)*. Defaulted to the Company setup calcCode for earning. <br  />Max length: 20
    Object costCenter1 = null; // Cost Center associated with earning. Must match Company setup.<br  /> Max length: 10
    Object costCenter2 = null; // Cost Center associated with earning. Must match Company setup.<br  /> Max length: 10
    Object costCenter3 = null; // Cost Center associated with earning. Must match Company setup.<br  /> Max length: 10
    Object effectiveDate = null; // Date earning is active. Defaulted to run date or check date based on Company setup. Common formats are MM-DD-CCYY, CCYY-MM-DD.
    Object endDate = null; // Stop date of an earning. Common formats are MM-DD-CCYY, CCYY-MM-DD.
    Object frequency = null; // Needed if earning is applied differently from the payroll frequency (one time earning for example).<br  /> Max length: 5
    Object goal = null; // Dollar amount. The employee earning will stop when the goal amount is reached.<br  /> Decimal(12,2)
    Object hoursOrUnits = null; // The value is used in conjunction with the Rate field. When entering Group Term Life Insurance (GTL), it should contain the full amount of the group term life insurance policy. <br  /> Decimal(12,2)
    Object isSelfInsured = null; // Used for ACA. If not entered, defaulted to Company earning setup.
    Object jobCode = null; // Job code associated with earnings. Must match Company setup.<br  /> Max length: 20
    Object miscellaneousInfo = null; // Information to print on the check stub if agency is set up for this earning. <br  />Max length: 50
    Object paidTowardsGoal = null; // Amount already paid to employee toward goal. <br  /> Decimal(12,2)
    Object payPeriodMaximum = null; // Maximum amount of the earning on a single paycheck. <br  /> Decimal(12,2)
    Object payPeriodMinimum = null; // Minimum amount of the earning on a single paycheck. <br  /> Decimal(12,2)
    Object rate = null; // Rate is used in conjunction with the hoursOrUnits field. <br  /> Decimal(12,2)
    Object rateCode = null; // Rate Code applies to additional pay rates entered for an employee. Must match Company setup. <br  /> Max length: 10
    try {
      client
              .earnings
              .addOrUpdateEarning(earningCode, startDate, companyId, employeeId)
              .agency(agency)
              .amount(amount)
              .annualMaximum(annualMaximum)
              .calculationCode(calculationCode)
              .costCenter1(costCenter1)
              .costCenter2(costCenter2)
              .costCenter3(costCenter3)
              .effectiveDate(effectiveDate)
              .endDate(endDate)
              .frequency(frequency)
              .goal(goal)
              .hoursOrUnits(hoursOrUnits)
              .isSelfInsured(isSelfInsured)
              .jobCode(jobCode)
              .miscellaneousInfo(miscellaneousInfo)
              .paidTowardsGoal(paidTowardsGoal)
              .payPeriodMaximum(payPeriodMaximum)
              .payPeriodMinimum(payPeriodMinimum)
              .rate(rate)
              .rateCode(rateCode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#addOrUpdateEarning");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .earnings
              .addOrUpdateEarning(earningCode, startDate, companyId, employeeId)
              .agency(agency)
              .amount(amount)
              .annualMaximum(annualMaximum)
              .calculationCode(calculationCode)
              .costCenter1(costCenter1)
              .costCenter2(costCenter2)
              .costCenter3(costCenter3)
              .effectiveDate(effectiveDate)
              .endDate(endDate)
              .frequency(frequency)
              .goal(goal)
              .hoursOrUnits(hoursOrUnits)
              .isSelfInsured(isSelfInsured)
              .jobCode(jobCode)
              .miscellaneousInfo(miscellaneousInfo)
              .paidTowardsGoal(paidTowardsGoal)
              .payPeriodMaximum(payPeriodMaximum)
              .payPeriodMinimum(payPeriodMinimum)
              .rate(rate)
              .rateCode(rateCode)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#addOrUpdateEarning");
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
| **json** | [**Earning**](Earning.md)| Earning Model | |

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

<a name="deleteByCodeAndStart"></a>
# **deleteByCodeAndStart**
> deleteByCodeAndStart(companyId, employeeId, earningCode, startDate).execute();

Delete Earning by Earning Code and Start Date

Delete Earning by Earning Code and Start Date

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EarningsApi;
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
    String earningCode = "earningCode_example"; // Earning Code
    String startDate = "startDate_example"; // Start Date
    try {
      client
              .earnings
              .deleteByCodeAndStart(companyId, employeeId, earningCode, startDate)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#deleteByCodeAndStart");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .earnings
              .deleteByCodeAndStart(companyId, employeeId, earningCode, startDate)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#deleteByCodeAndStart");
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
| **earningCode** | **String**| Earning Code | |
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
| **204** | Successfully deleted |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | The employee does not exist, or the specified earningCode-startDate combination does not exist |  -  |
| **429** | Too Many Requests |  -  |

<a name="getAll"></a>
# **getAll**
> List&lt;Earning&gt; getAll(companyId, employeeId).execute();

Get All Earnings

Get All Earnings returns all earnings for the selected employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EarningsApi;
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
      List<Earning> result = client
              .earnings
              .getAll(companyId, employeeId)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Earning>> response = client
              .earnings
              .getAll(companyId, employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#getAll");
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

[**List&lt;Earning&gt;**](Earning.md)

### Authorization

[paylocity_auth](../README.md#paylocity_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | The employee does not exist |  -  |
| **429** | Too Many Requests |  -  |

<a name="getByCodeAndStart"></a>
# **getByCodeAndStart**
> Earning getByCodeAndStart(companyId, employeeId, earningCode, startDate).execute();

Get Earning by Earning Code and Start Date

Get Earnings returns the single earning with the provided earning code and start date for the selected employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EarningsApi;
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
    String earningCode = "earningCode_example"; // Earning Code
    String startDate = "startDate_example"; // Start Date
    try {
      Earning result = client
              .earnings
              .getByCodeAndStart(companyId, employeeId, earningCode, startDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getAgency());
      System.out.println(result.getAmount());
      System.out.println(result.getAnnualMaximum());
      System.out.println(result.getCalculationCode());
      System.out.println(result.getCostCenter1());
      System.out.println(result.getCostCenter2());
      System.out.println(result.getCostCenter3());
      System.out.println(result.getEarningCode());
      System.out.println(result.getEffectiveDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getFrequency());
      System.out.println(result.getGoal());
      System.out.println(result.getHoursOrUnits());
      System.out.println(result.getIsSelfInsured());
      System.out.println(result.getJobCode());
      System.out.println(result.getMiscellaneousInfo());
      System.out.println(result.getPaidTowardsGoal());
      System.out.println(result.getPayPeriodMaximum());
      System.out.println(result.getPayPeriodMinimum());
      System.out.println(result.getRate());
      System.out.println(result.getRateCode());
      System.out.println(result.getStartDate());
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#getByCodeAndStart");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Earning> response = client
              .earnings
              .getByCodeAndStart(companyId, employeeId, earningCode, startDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#getByCodeAndStart");
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
| **earningCode** | **String**| Earning Code | |
| **startDate** | **String**| Start Date | |

### Return type

[**Earning**](Earning.md)

### Authorization

[paylocity_auth](../README.md#paylocity_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | The employee does not exist, or the specified earningCode-startDate combination does not exist |  -  |
| **429** | Too Many Requests |  -  |

<a name="getByEarningCode"></a>
# **getByEarningCode**
> List&lt;Earning&gt; getByEarningCode(companyId, employeeId, earningCode).execute();

Get Earnings by Earning Code

Get Earnings returns all earnings with the provided earning code for the selected employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EarningsApi;
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
    String earningCode = "earningCode_example"; // Earning Code
    try {
      List<Earning> result = client
              .earnings
              .getByEarningCode(companyId, employeeId, earningCode)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#getByEarningCode");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<Earning>> response = client
              .earnings
              .getByEarningCode(companyId, employeeId, earningCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EarningsApi#getByEarningCode");
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
| **earningCode** | **String**| Earning Code | |

### Return type

[**List&lt;Earning&gt;**](Earning.md)

### Authorization

[paylocity_auth](../README.md#paylocity_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | The employee does not exist |  -  |
| **429** | Too Many Requests |  -  |

