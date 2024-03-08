package com.konfigthis.client;

import com.konfigthis.client.api.AdditionalRatesApi;
import com.konfigthis.client.api.ClientCredentialsApi;
import com.konfigthis.client.api.CompanyCodesApi;
import com.konfigthis.client.api.CompanySpecificSchemaApi;
import com.konfigthis.client.api.CustomFieldsApi;
import com.konfigthis.client.api.DeductionApi;
import com.konfigthis.client.api.DirectDepositApi;
import com.konfigthis.client.api.EarningsApi;
import com.konfigthis.client.api.EmergencyContactsApi;
import com.konfigthis.client.api.EmployeeApi;
import com.konfigthis.client.api.EmployeeV1Api;
import com.konfigthis.client.api.EmployeeBenefitSetupApi;
import com.konfigthis.client.api.EmployeeStagingApi;
import com.konfigthis.client.api.LocalTaxApi;
import com.konfigthis.client.api.LocalTaxesApi;
import com.konfigthis.client.api.NonPrimaryStateTaxApi;
import com.konfigthis.client.api.OnboardingApi;
import com.konfigthis.client.api.PayStatementsApi;
import com.konfigthis.client.api.PrimaryStateTaxApi;
import com.konfigthis.client.api.SensitiveDataApi;

public class Paylocity {
    private ApiClient apiClient;
    public final AdditionalRatesApi additionalRates;
    public final ClientCredentialsApi clientCredentials;
    public final CompanyCodesApi companyCodes;
    public final CompanySpecificSchemaApi companySpecificSchema;
    public final CustomFieldsApi customFields;
    public final DeductionApi deduction;
    public final DirectDepositApi directDeposit;
    public final EarningsApi earnings;
    public final EmergencyContactsApi emergencyContacts;
    public final EmployeeApi employee;
    public final EmployeeV1Api employeeV1;
    public final EmployeeBenefitSetupApi employeeBenefitSetup;
    public final EmployeeStagingApi employeeStaging;
    public final LocalTaxApi localTax;
    public final LocalTaxesApi localTaxes;
    public final NonPrimaryStateTaxApi nonPrimaryStateTax;
    public final OnboardingApi onboarding;
    public final PayStatementsApi payStatements;
    public final PrimaryStateTaxApi primaryStateTax;
    public final SensitiveDataApi sensitiveData;

    public Paylocity() {
        this(null);
    }

    public Paylocity(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.additionalRates = new AdditionalRatesApi(this.apiClient);
        this.clientCredentials = new ClientCredentialsApi(this.apiClient);
        this.companyCodes = new CompanyCodesApi(this.apiClient);
        this.companySpecificSchema = new CompanySpecificSchemaApi(this.apiClient);
        this.customFields = new CustomFieldsApi(this.apiClient);
        this.deduction = new DeductionApi(this.apiClient);
        this.directDeposit = new DirectDepositApi(this.apiClient);
        this.earnings = new EarningsApi(this.apiClient);
        this.emergencyContacts = new EmergencyContactsApi(this.apiClient);
        this.employee = new EmployeeApi(this.apiClient);
        this.employeeV1 = new EmployeeV1Api(this.apiClient);
        this.employeeBenefitSetup = new EmployeeBenefitSetupApi(this.apiClient);
        this.employeeStaging = new EmployeeStagingApi(this.apiClient);
        this.localTax = new LocalTaxApi(this.apiClient);
        this.localTaxes = new LocalTaxesApi(this.apiClient);
        this.nonPrimaryStateTax = new NonPrimaryStateTaxApi(this.apiClient);
        this.onboarding = new OnboardingApi(this.apiClient);
        this.payStatements = new PayStatementsApi(this.apiClient);
        this.primaryStateTax = new PrimaryStateTaxApi(this.apiClient);
        this.sensitiveData = new SensitiveDataApi(this.apiClient);
    }

}
