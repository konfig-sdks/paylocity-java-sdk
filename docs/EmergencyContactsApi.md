# EmergencyContactsApi

All URIs are relative to *https://apisandbox.paylocity.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOrUpdate**](EmergencyContactsApi.md#addOrUpdate) | **PUT** /v2/companies/{companyId}/employees/{employeeId}/emergencyContacts | Add/update emergency contacts |


<a name="addOrUpdate"></a>
# **addOrUpdate**
> addOrUpdate(companyId, employeeId, json).execute();

Add/update emergency contacts

Sends new or updated employee emergency contacts directly to Paylocity Payroll/HR solution.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmergencyContactsApi;
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
    Object firstName = null; // Required. Contact first name. <br  />Max length: 40
    Object lastName = null; // Required. Contact last name. <br  />Max length: 40
    String companyId = "companyId_example"; // The Paylocity Company Identifier. This is the unique value provided by Paylocity to each specific Payroll Entity.                  **Allowable Values:**                  9 char max
    String employeeId = "employeeId_example"; // The Paylocity Employee ID. This is a unique value per Paylocity Company ID.  **Allowable Values:**  10 char max
    Object address1 = null; // 1st address line.
    Object address2 = null; // 2nd address line.
    Object city = null; // City.
    Object country = null; // County.
    Object county = null; // Country.  Must be a valid 3 character country code.  Common values are *USA* (United States), *CAN* (Canada).
    Object email = null; // Contact email.  Must be valid email address format.
    Object homePhone = null; // Contact Home Phone.  Valid phone format  *(###) #######* or *######-####* or *### ### ####* or *##########* or, if international, starts with *+#*, only spaces and digits allowed.
    Object mobilePhone = null; // Contact Mobile Phone.  Valid phone format  *(###) #######* or *######-####* or *### ### ####* or *##########* or, if international, starts with *+#*, only spaces and digits allowed.
    Object notes = null; // Notes. <br  />Max length: 1000
    Object pager = null; // Contact Pager.  Valid phone format  *(###) #######* or *######-####* or *### ### ####* or *##########* or, if international, starts with *+#*, only spaces and digits allowed.
    Object primaryPhone = null; // Required. Contact primary phone type.  Must match Company setup.  Valid  values are H (Home), M (Mobile), P (Pager), W (Work)
    Object priority = null; // Required. Contact priority. Valid values are *P* (Primary) or *S* (Secondary).
    Object relationship = null; // Required. Contact relationship.  Must match Company setup.  Common values are Spouse, Mother, Father.
    Object state = null; // State or Province.  If U.S. address, must be valid 2 character state code.  Common values are *IL* (Illinois), *CA* (California).
    Boolean syncEmployeeInfo = true; // Valid values are *true* or *false*.
    Object workExtension = null; // Work Extension.
    Object workPhone = null; // Contact Work Phone.  Valid phone format  *(###) #######* or *######-####* or *### ### ####* or *##########* or, if international, starts with *+#*, only spaces and digits allowed.
    Object zip = null; // Postal code.  If U.S. address, must be a valid zip code.
    try {
      client
              .emergencyContacts
              .addOrUpdate(firstName, lastName, companyId, employeeId)
              .address1(address1)
              .address2(address2)
              .city(city)
              .country(country)
              .county(county)
              .email(email)
              .homePhone(homePhone)
              .mobilePhone(mobilePhone)
              .notes(notes)
              .pager(pager)
              .primaryPhone(primaryPhone)
              .priority(priority)
              .relationship(relationship)
              .state(state)
              .syncEmployeeInfo(syncEmployeeInfo)
              .workExtension(workExtension)
              .workPhone(workPhone)
              .zip(zip)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmergencyContactsApi#addOrUpdate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .emergencyContacts
              .addOrUpdate(firstName, lastName, companyId, employeeId)
              .address1(address1)
              .address2(address2)
              .city(city)
              .country(country)
              .county(county)
              .email(email)
              .homePhone(homePhone)
              .mobilePhone(mobilePhone)
              .notes(notes)
              .pager(pager)
              .primaryPhone(primaryPhone)
              .priority(priority)
              .relationship(relationship)
              .state(state)
              .syncEmployeeInfo(syncEmployeeInfo)
              .workExtension(workExtension)
              .workPhone(workPhone)
              .zip(zip)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmergencyContactsApi#addOrUpdate");
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
| **json** | [**EmergencyContact**](EmergencyContact.md)| Emergency Contact Model | |

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

