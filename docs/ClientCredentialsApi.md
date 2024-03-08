# ClientCredentialsApi

All URIs are relative to *https://apisandbox.paylocity.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**obtainNewClientSecret**](ClientCredentialsApi.md#obtainNewClientSecret) | **POST** /v2/credentials/secrets | Obtain new client secret. |


<a name="obtainNewClientSecret"></a>
# **obtainNewClientSecret**
> List&lt;ClientCredentialsResponse&gt; obtainNewClientSecret(json).execute();

Obtain new client secret.

Obtain new client secret for Paylocity-issued client id. See Weblink Authentication section for details.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ClientCredentialsApi;
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
    String code = "code_example"; // A value sent with the 'ACTION NEEDED: Web Link API Credentials Expiring Soon.' email notification.
    try {
      List<ClientCredentialsResponse> result = client
              .clientCredentials
              .obtainNewClientSecret(code)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientCredentialsApi#obtainNewClientSecret");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<ClientCredentialsResponse>> response = client
              .clientCredentials
              .obtainNewClientSecret(code)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ClientCredentialsApi#obtainNewClientSecret");
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
| **json** | [**AddClientSecret**](AddClientSecret.md)| Add Client Secret Model | |

### Return type

[**List&lt;ClientCredentialsResponse&gt;**](ClientCredentialsResponse.md)

### Authorization

[paylocity_auth](../README.md#paylocity_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully added |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **429** | Too Many Requests |  -  |

