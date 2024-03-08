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
import com.konfigthis.client.model.LocalTax;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LocalTaxApi
 */
@Disabled
public class LocalTaxApiTest {

    private static LocalTaxApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new LocalTaxApi(apiClient);
    }

    /**
     * Add Local Tax
     *
     * Add Local Tax sends new local tax information directly to Paylocity Payroll/HR solution.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createOrUpdateLocalTaxesTest() throws ApiException {
        String companyId = null;
        String employeeId = null;
        Object exemptions = null;
        Object exemptions2 = null;
        Object filingStatus = null;
        Object residentPSD = null;
        Object taxCode = null;
        Object workPSD = null;
        api.createOrUpdateLocalTaxes(companyId, employeeId)
                .exemptions(exemptions)
                .exemptions2(exemptions2)
                .filingStatus(filingStatus)
                .residentPSD(residentPSD)
                .taxCode(taxCode)
                .workPSD(workPSD)
                .execute();
        // TODO: test validations
    }

    /**
     * Get All Local Taxes
     *
     * Get All Local Taxes returns all local tax information for the selected employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTaxesForEmployeeTest() throws ApiException {
        String companyId = null;
        String employeeId = null;
        List<LocalTax> response = api.getAllTaxesForEmployee(companyId, employeeId)
                .execute();
        // TODO: test validations
    }

    /**
     * Get Local Tax for Tax Code
     *
     * Get Local Tax for Tax Code returns local tax information for the specific tax code for the selected employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getForTaxCodeTest() throws ApiException {
        String companyId = null;
        String employeeId = null;
        String taxCode = null;
        LocalTax response = api.getForTaxCode(companyId, employeeId, taxCode)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete Local Tax for Tax Code
     *
     * Delete Local Tax for Tax Code deletes the local tax code from Paylocity Payroll/HR solution.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeForTaxCodeTest() throws ApiException {
        String companyId = null;
        String employeeId = null;
        String taxCode = null;
        api.removeForTaxCode(companyId, employeeId, taxCode)
                .execute();
        // TODO: test validations
    }

    /**
     * Update Local Tax
     *
     * Update Local Tax sends updated local tax code information for the selected employee.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateForTaxCodeTest() throws ApiException {
        String companyId = null;
        String employeeId = null;
        String taxCode = null;
        Object exemptions = null;
        Object exemptions2 = null;
        Object filingStatus = null;
        Object residentPSD = null;
        Object taxCode = null;
        Object workPSD = null;
        api.updateForTaxCode(companyId, employeeId, taxCode)
                .exemptions(exemptions)
                .exemptions2(exemptions2)
                .filingStatus(filingStatus)
                .residentPSD(residentPSD)
                .taxCode(taxCode)
                .workPSD(workPSD)
                .execute();
        // TODO: test validations
    }

}
