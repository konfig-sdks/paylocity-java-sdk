/*
 * WebLink API
 * For documentation about this API, please visit https://developer.paylocity.com/integrations/reference/weblink-overview
 *
 * The version of the OpenAPI document: v2
 * Contact: webservices@paylocity.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.AddClientSecret;
import com.konfigthis.client.model.ClientCredentialsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClientCredentialsApi
 */
@Disabled
public class ClientCredentialsApiTest {

    private static ClientCredentialsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ClientCredentialsApi(apiClient);
    }

    /**
     * Obtain new client secret.
     *
     * Obtain new client secret for Paylocity-issued client id. See Weblink Authentication section for details.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void obtainNewClientSecretTest() throws ApiException {
        String code = null;
        List<ClientCredentialsResponse> response = api.obtainNewClientSecret(code)
                .execute();
        // TODO: test validations
    }

}
