# EmployeeV1Api

All URIs are relative to *https://apisandbox.paylocity.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewEmployeeRecord**](EmployeeV1Api.md#createNewEmployeeRecord) | **POST** /v1/employee | Add new employee |
| [**getEmployeeData**](EmployeeV1Api.md#getEmployeeData) | **GET** /v1/company/{companyId}/employee/{employeeId} | Get Employee |
| [**updateEmployeeDataToPaylocity**](EmployeeV1Api.md#updateEmployeeDataToPaylocity) | **POST** /v1/update-employee | Update employee |


<a name="createNewEmployeeRecord"></a>
# **createNewEmployeeRecord**
> createNewEmployeeRecord(body).execute();

Add new employee

This resource allows for the creation of a new employee record for a specified companyID.  Additional field objects may need to be added for companies that use the New Hire Template in the Paylocity HCM solution when hiring employees and have additional required fields.   &gt; 🚧 Maintenance Mode &gt;  &gt; _This resource version is in a limited support mode and should not be used for new integrations.  Please use the latest version._ 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeV1Api;
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
    NewEmployee newEmployee = new NewEmployee();
    try {
      client
              .employeeV1
              .createNewEmployeeRecord()
              .newEmployee(newEmployee)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeV1Api#createNewEmployeeRecord");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .employeeV1
              .createNewEmployeeRecord()
              .newEmployee(newEmployee)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeV1Api#createNewEmployeeRecord");
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
| **body** | [**EmployeeV1CreateNewEmployeeRecordRequest**](EmployeeV1CreateNewEmployeeRecordRequest.md)| New Employee | |

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
| **201** | Successfully added |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

<a name="getEmployeeData"></a>
# **getEmployeeData**
> EmployeeV1 getEmployeeData(companyId, employeeId).execute();

Get Employee

Get Employee API will return employee data currently available in Paylocity Payroll/HR solution.   &gt; 🚧 Maintenance Mode &gt;  &gt; _This resource version is in a limited support mode and should not be used for new integrations.  Please use the latest version._ 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeV1Api;
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
      EmployeeV1 result = client
              .employeeV1
              .getEmployeeData(companyId, employeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAddress1());
      System.out.println(result.getAddress2());
      System.out.println(result.getBenefitSetup());
      System.out.println(result.getBirthDate());
      System.out.println(result.getCity());
      System.out.println(result.getCompanyNumber());
      System.out.println(result.getDepartmentPosition());
      System.out.println(result.getEmployeeId());
      System.out.println(result.getEmployeeStatus());
      System.out.println(result.getEthnicity());
      System.out.println(result.getFirstName());
      System.out.println(result.getGender());
      System.out.println(result.getHighlyCompensatedEmployee());
      System.out.println(result.getHireDate());
      System.out.println(result.getHomePhone());
      System.out.println(result.getLastName());
      System.out.println(result.getMaritalStatus());
      System.out.println(result.getMiddleName());
      System.out.println(result.getNickname());
      System.out.println(result.getOwnerPercent());
      System.out.println(result.getPersonalEmailAddress());
      System.out.println(result.getPersonalMobilePhone());
      System.out.println(result.getPosition());
      System.out.println(result.getPostalCode());
      System.out.println(result.getPrimaryPayRate());
      System.out.println(result.getReHireDate());
      System.out.println(result.getSsn());
      System.out.println(result.getState());
      System.out.println(result.getStatutory());
      System.out.println(result.getSupervisorCompanyNumber());
      System.out.println(result.getSupervisorEmployeeId());
      System.out.println(result.getTaxForm());
      System.out.println(result.getTerminationDate());
      System.out.println(result.getTerminationReason());
      System.out.println(result.getWorkEmailAddress());
      System.out.println(result.getWorkPhone());
      System.out.println(result.getWorkPhoneExt());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeV1Api#getEmployeeData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeeV1> response = client
              .employeeV1
              .getEmployeeData(companyId, employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeV1Api#getEmployeeData");
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

[**EmployeeV1**](EmployeeV1.md)

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

<a name="updateEmployeeDataToPaylocity"></a>
# **updateEmployeeDataToPaylocity**
> updateEmployeeDataToPaylocity(body).execute();

Update employee

Update Employee API sends updates to employee data to Paylocity Payroll/HR solution.   &gt; 🚧 Maintenance Mode &gt;  &gt; _This resource version is in a limited support mode and should not be used for new integrations.  Please use the latest version._ 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeeV1Api;
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
    UpdateEmployee updateEmployee = new UpdateEmployee();
    try {
      client
              .employeeV1
              .updateEmployeeDataToPaylocity()
              .updateEmployee(updateEmployee)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeV1Api#updateEmployeeDataToPaylocity");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .employeeV1
              .updateEmployeeDataToPaylocity()
              .updateEmployee(updateEmployee)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeeV1Api#updateEmployeeDataToPaylocity");
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
| **body** | [**EmployeeV1UpdateEmployeeDataToPaylocityRequest**](EmployeeV1UpdateEmployeeDataToPaylocityRequest.md)| UpdateEmployee | |

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
| **200** | Successfully updated |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

