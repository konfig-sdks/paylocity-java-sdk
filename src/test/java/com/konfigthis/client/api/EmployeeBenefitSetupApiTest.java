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
import com.konfigthis.client.model.BenefitSetup;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmployeeBenefitSetupApi
 */
@Disabled
public class EmployeeBenefitSetupApiTest {

    private static EmployeeBenefitSetupApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new EmployeeBenefitSetupApi(apiClient);
    }

    /**
     * Add/update employee&#39;s benefit setup
     *
     * Sends new or updated employee benefit setup information directly to Paylocity Payroll/HR solution.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addOrUpdateBenefitSetupTest() throws ApiException {
        String companyId = null;
        String employeeId = null;
        Object benefitClass = null;
        Object benefitClassEffectiveDate = null;
        Object benefitSalary = null;
        Object benefitSalaryEffectiveDate = null;
        Object doNotApplyAdministrativePeriod = null;
        Object isMeasureAcaEligibility = null;
        api.addOrUpdateBenefitSetup(companyId, employeeId)
                .benefitClass(benefitClass)
                .benefitClassEffectiveDate(benefitClassEffectiveDate)
                .benefitSalary(benefitSalary)
                .benefitSalaryEffectiveDate(benefitSalaryEffectiveDate)
                .doNotApplyAdministrativePeriod(doNotApplyAdministrativePeriod)
                .isMeasureAcaEligibility(isMeasureAcaEligibility)
                .execute();
        // TODO: test validations
    }

}