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
import com.konfigthis.client.model.SensitiveData;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SensitiveDataApi
 */
@Disabled
public class SensitiveDataApiTest {

    private static SensitiveDataApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SensitiveDataApi(apiClient);
    }

    /**
     * Add/update sensitive data
     *
     * Sends new or updated employee sensitive data information directly to Paylocity Payroll/HR solution.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addOrUpdateEmployeeSensitiveDataTest() throws ApiException {
        String companyId = null;
        String employeeId = null;
        Object disability = null;
        Object ethnicity = null;
        Object gender = null;
        Object veteran = null;
        api.addOrUpdateEmployeeSensitiveData(companyId, employeeId)
                .disability(disability)
                .ethnicity(ethnicity)
                .gender(gender)
                .veteran(veteran)
                .execute();
        // TODO: test validations
    }

    /**
     * Get sensitive data
     *
     * Gets employee sensitive data information directly from Paylocity Payroll/HR solution.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getEmployeeSensitiveDataTest() throws ApiException {
        String companyId = null;
        String employeeId = null;
        List<SensitiveData> response = api.getEmployeeSensitiveData(companyId, employeeId)
                .execute();
        // TODO: test validations
    }

}
