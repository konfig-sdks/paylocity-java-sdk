<div align="left">

[![Visit Paylocity](./header.png)](https://developer.paylocity.com)

# [Paylocity](https://developer.paylocity.com)

For documentation about this API, please visit https://developer.paylocity.com/integrations/reference/weblink-overview

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Paylocity&serviceName=Weblink&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>paylocity-java-sdk</artifactId>
  <version>v2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:paylocity-java-sdk:v2"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/paylocity-java-sdk-v2.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Paylocity;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AdditionalRatesApi;
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
    Object changeReason = null; // Not required. If populated, must match one of the system coded values available in the Additional Rates Change Reason drop down.<br />
    Object costCenter1 = null; // Not required. Valid values must match one of the system coded cost centers available in the Additional Rates Cost Center level 1 drop down. This cell must be in a text format.<br />
    Object costCenter2 = null; // Not required. Valid values must match one of the system coded cost centers available in the Additional Rates Cost Center level 2 drop down. This cell must be in a text format.<br />
    Object costCenter3 = null; // Not required. Valid values must match one of the system coded cost centers available in the Additional Rates Cost Center level 3 drop down. This cell must be in a text format.<br />
    Object effectiveDate = null; // Required. Common formats include *MM-DD-CCYY*, *CCYY-MM-DD*.<br />
    Object endCheckDate = null; // Not required. Must match one of the system coded check dates available in the Additional Rates End Check Date drop down. Common formats include *MM-DD-CCYY*, *CCYY-MM-DD*.<br />
    Object job = null; // Not required. If populated, must match one of the system coded values available in the Additional Rates Job drop down.<br />
    Object rate = null; // Required. Enter dollar amount that corresponds to the Per selection.<br />
    Object rateCode = null; // Required. If populated, must match one of the system coded values available in the Additional Rates Rate Code drop down.<br />
    Object rateNotes = null; // Not required.<br  />Max length: 4000<br />
    Object ratePer = null; // Required. Valid values are HOUR or WEEK.<br />
    Object shift = null; // Not required. If populated, must match one of the system coded values available in the Additional Rates Shift drop down.<br />
    try {
      client
              .additionalRates
              .updateEmployeeAdditionalRates(companyId, employeeId)
              .changeReason(changeReason)
              .costCenter1(costCenter1)
              .costCenter2(costCenter2)
              .costCenter3(costCenter3)
              .effectiveDate(effectiveDate)
              .endCheckDate(endCheckDate)
              .job(job)
              .rate(rate)
              .rateCode(rateCode)
              .rateNotes(rateNotes)
              .ratePer(ratePer)
              .shift(shift)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AdditionalRatesApi#updateEmployeeAdditionalRates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .additionalRates
              .updateEmployeeAdditionalRates(companyId, employeeId)
              .changeReason(changeReason)
              .costCenter1(costCenter1)
              .costCenter2(costCenter2)
              .costCenter3(costCenter3)
              .effectiveDate(effectiveDate)
              .endCheckDate(endCheckDate)
              .job(job)
              .rate(rate)
              .rateCode(rateCode)
              .rateNotes(rateNotes)
              .ratePer(ratePer)
              .shift(shift)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AdditionalRatesApi#updateEmployeeAdditionalRates");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://apisandbox.paylocity.com/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdditionalRatesApi* | [**updateEmployeeAdditionalRates**](docs/AdditionalRatesApi.md#updateEmployeeAdditionalRates) | **PUT** /v2/companies/{companyId}/employees/{employeeId}/additionalRates | Add/update additional rates
*ClientCredentialsApi* | [**obtainNewClientSecret**](docs/ClientCredentialsApi.md#obtainNewClientSecret) | **POST** /v2/credentials/secrets | Obtain new client secret.
*CompanyCodesApi* | [**getAllByResource**](docs/CompanyCodesApi.md#getAllByResource) | **GET** /v2/companies/{companyId}/codes/{codeResource} | Get All Company Codes
*CompanySpecificSchemaApi* | [**getOpenApiDoc**](docs/CompanySpecificSchemaApi.md#getOpenApiDoc) | **GET** /v2/companies/{companyId}/openapi | Get Company-Specific Open API Documentation
*CustomFieldsApi* | [**getAllByCategory**](docs/CustomFieldsApi.md#getAllByCategory) | **GET** /v2/companies/{companyId}/customfields/{category} | Get All Custom Fields
*DeductionApi* | [**addOrUpdateDeduction**](docs/DeductionApi.md#addOrUpdateDeduction) | **POST** /v1/deduction | Add / Update Deduction
*DeductionApi* | [**getAllDeductions**](docs/DeductionApi.md#getAllDeductions) | **GET** /v1/companies/{companyId}/employees/{employeeId}/deductions | Get All Deductions
*DeductionApi* | [**getByCode**](docs/DeductionApi.md#getByCode) | **GET** /v1/companies/{companyId}/employees/{employeeId}/deductions/{deductionCode} | Get Deduction for Deduction Code
*DeductionApi* | [**removeDeductionByCodeAndStartDate**](docs/DeductionApi.md#removeDeductionByCodeAndStartDate) | **DELETE** /v1/companies/{companyId}/employees/{employeeId}/deductions/{deductionCode}/{startDate} | Delete deduction for deduction code / start date
*DirectDepositApi* | [**getAllDirectDeposits**](docs/DirectDepositApi.md#getAllDirectDeposits) | **GET** /v2/companies/{companyId}/employees/{employeeId}/directDeposit | Get All Direct Deposit
*EarningsApi* | [**addOrUpdateEarning**](docs/EarningsApi.md#addOrUpdateEarning) | **PUT** /v2/companies/{companyId}/employees/{employeeId}/earnings | Add/Update Earning
*EarningsApi* | [**deleteByCodeAndStart**](docs/EarningsApi.md#deleteByCodeAndStart) | **DELETE** /v2/companies/{companyId}/employees/{employeeId}/earnings/{earningCode}/{startDate} | Delete Earning by Earning Code and Start Date
*EarningsApi* | [**getAll**](docs/EarningsApi.md#getAll) | **GET** /v2/companies/{companyId}/employees/{employeeId}/earnings | Get All Earnings
*EarningsApi* | [**getByCodeAndStart**](docs/EarningsApi.md#getByCodeAndStart) | **GET** /v2/companies/{companyId}/employees/{employeeId}/earnings/{earningCode}/{startDate} | Get Earning by Earning Code and Start Date
*EarningsApi* | [**getByEarningCode**](docs/EarningsApi.md#getByEarningCode) | **GET** /v2/companies/{companyId}/employees/{employeeId}/earnings/{earningCode} | Get Earnings by Earning Code
*EmergencyContactsApi* | [**addOrUpdate**](docs/EmergencyContactsApi.md#addOrUpdate) | **PUT** /v2/companies/{companyId}/employees/{employeeId}/emergencyContacts | Add/update emergency contacts
*EmployeeApi* | [**addToPaylocity**](docs/EmployeeApi.md#addToPaylocity) | **POST** /v2/companies/{companyId}/employees | Add new employee
*EmployeeApi* | [**getAllEmployees**](docs/EmployeeApi.md#getAllEmployees) | **GET** /v2/companies/{companyId}/employees | Get all employees
*EmployeeApi* | [**getEmployeeData**](docs/EmployeeApi.md#getEmployeeData) | **GET** /v2/companies/{companyId}/employees/{employeeId} | Get employee
*EmployeeApi* | [**updateEmployeeData**](docs/EmployeeApi.md#updateEmployeeData) | **PATCH** /v2/companies/{companyId}/employees/{employeeId} | Update employee
*EmployeeV1Api* | [**createNewEmployeeRecord**](docs/EmployeeV1Api.md#createNewEmployeeRecord) | **POST** /v1/employee | Add new employee
*EmployeeV1Api* | [**getEmployeeData**](docs/EmployeeV1Api.md#getEmployeeData) | **GET** /v1/company/{companyId}/employee/{employeeId} | Get Employee
*EmployeeV1Api* | [**updateEmployeeDataToPaylocity**](docs/EmployeeV1Api.md#updateEmployeeDataToPaylocity) | **POST** /v1/update-employee | Update employee
*EmployeeBenefitSetupApi* | [**addOrUpdateBenefitSetup**](docs/EmployeeBenefitSetupApi.md#addOrUpdateBenefitSetup) | **PUT** /v2/companies/{companyId}/employees/{employeeId}/benefitSetup | Add/update employee&#39;s benefit setup
*EmployeeStagingApi* | [**addNewEmployeeToWebLink**](docs/EmployeeStagingApi.md#addNewEmployeeToWebLink) | **POST** /v2/weblinkstaging/companies/{companyId}/employees/newemployees | Add new employee to Web Link
*LocalTaxApi* | [**createOrUpdateLocalTaxes**](docs/LocalTaxApi.md#createOrUpdateLocalTaxes) | **POST** /v1/companies/{companyId}/employees/{employeeId}/localTaxes | Add Local Tax
*LocalTaxApi* | [**getAllTaxesForEmployee**](docs/LocalTaxApi.md#getAllTaxesForEmployee) | **GET** /v1/companies/{companyId}/employees/{employeeId}/localTaxes | Get All Local Taxes
*LocalTaxApi* | [**getForTaxCode**](docs/LocalTaxApi.md#getForTaxCode) | **GET** /v1/companies/{companyId}/employees/{employeeId}/localTaxes/{taxCode} | Get Local Tax for Tax Code
*LocalTaxApi* | [**removeForTaxCode**](docs/LocalTaxApi.md#removeForTaxCode) | **DELETE** /v1/companies/{companyId}/employees/{employeeId}/localTaxes/{taxCode} | Delete Local Tax for Tax Code
*LocalTaxApi* | [**updateForTaxCode**](docs/LocalTaxApi.md#updateForTaxCode) | **PUT** /v1/companies/{companyId}/employees/{employeeId}/localTaxes/{taxCode} | Update Local Tax
*LocalTaxesApi* | [**addNewTax**](docs/LocalTaxesApi.md#addNewTax) | **POST** /v2/companies/{companyId}/employees/{employeeId}/localTaxes | Add new local tax
*LocalTaxesApi* | [**deleteByTaxCode**](docs/LocalTaxesApi.md#deleteByTaxCode) | **DELETE** /v2/companies/{companyId}/employees/{employeeId}/localTaxes/{taxCode} | Delete local tax by tax code
*LocalTaxesApi* | [**getAllForEmployee**](docs/LocalTaxesApi.md#getAllForEmployee) | **GET** /v2/companies/{companyId}/employees/{employeeId}/localTaxes | Get all local taxes
*LocalTaxesApi* | [**getByTaxCode**](docs/LocalTaxesApi.md#getByTaxCode) | **GET** /v2/companies/{companyId}/employees/{employeeId}/localTaxes/{taxCode} | Get local taxes by tax code
*NonPrimaryStateTaxApi* | [**addOrUpdateStateTax**](docs/NonPrimaryStateTaxApi.md#addOrUpdateStateTax) | **PUT** /v2/companies/{companyId}/employees/{employeeId}/nonprimaryStateTax | Add/update non-primary state tax
*OnboardingApi* | [**addEmployeeToOnboarding**](docs/OnboardingApi.md#addEmployeeToOnboarding) | **POST** /v1/companies/{companyId}/onboarding/employees | Add Employee to Onboarding
*PayStatementsApi* | [**getDetailsByYear**](docs/PayStatementsApi.md#getDetailsByYear) | **GET** /v2/companies/{companyId}/employees/{employeeId}/paystatement/details/{year} | Get employee pay statement details data for the specified year.
*PayStatementsApi* | [**getDetailsByYearAndCheckDate**](docs/PayStatementsApi.md#getDetailsByYearAndCheckDate) | **GET** /v2/companies/{companyId}/employees/{employeeId}/paystatement/details/{year}/{checkDate} | Get employee pay statement details data for the specified year and check date.
*PayStatementsApi* | [**getSummaryByYear**](docs/PayStatementsApi.md#getSummaryByYear) | **GET** /v2/companies/{companyId}/employees/{employeeId}/paystatement/summary/{year} | Get employee pay statement summary data for the specified year.
*PayStatementsApi* | [**getSummaryData**](docs/PayStatementsApi.md#getSummaryData) | **GET** /v2/companies/{companyId}/employees/{employeeId}/paystatement/summary/{year}/{checkDate} | Get employee pay statement summary data for the specified year and check date.
*PrimaryStateTaxApi* | [**addOrUpdateTax**](docs/PrimaryStateTaxApi.md#addOrUpdateTax) | **PUT** /v2/companies/{companyId}/employees/{employeeId}/primaryStateTax | Add/update primary state tax
*SensitiveDataApi* | [**addOrUpdateEmployeeSensitiveData**](docs/SensitiveDataApi.md#addOrUpdateEmployeeSensitiveData) | **PUT** /v2/companies/{companyId}/employees/{employeeId}/sensitivedata | Add/update sensitive data
*SensitiveDataApi* | [**getEmployeeSensitiveData**](docs/SensitiveDataApi.md#getEmployeeSensitiveData) | **GET** /v2/companies/{companyId}/employees/{employeeId}/sensitivedata | Get sensitive data


## Documentation for Models

 - [AddClientSecret](docs/AddClientSecret.md)
 - [AddUpdateDeduction](docs/AddUpdateDeduction.md)
 - [AdditionalRate](docs/AdditionalRate.md)
 - [BenefitSetup](docs/BenefitSetup.md)
 - [ClientCredentialsResponse](docs/ClientCredentialsResponse.md)
 - [CompanyCodes](docs/CompanyCodes.md)
 - [CustomFieldDefinition](docs/CustomFieldDefinition.md)
 - [CustomFieldDefinitionValuesInner](docs/CustomFieldDefinitionValuesInner.md)
 - [Deduction](docs/Deduction.md)
 - [DeductionAddOrUpdateDeductionRequest](docs/DeductionAddOrUpdateDeductionRequest.md)
 - [DepartmentPosition](docs/DepartmentPosition.md)
 - [DirectDeposit](docs/DirectDeposit.md)
 - [Earning](docs/Earning.md)
 - [EmergencyContact](docs/EmergencyContact.md)
 - [Employee](docs/Employee.md)
 - [EmployeeIdResponse](docs/EmployeeIdResponse.md)
 - [EmployeeInfo](docs/EmployeeInfo.md)
 - [EmployeeV1](docs/EmployeeV1.md)
 - [EmployeeV1BenefitSetup](docs/EmployeeV1BenefitSetup.md)
 - [EmployeeV1CreateNewEmployeeRecordRequest](docs/EmployeeV1CreateNewEmployeeRecordRequest.md)
 - [EmployeeV1DepartmentPosition](docs/EmployeeV1DepartmentPosition.md)
 - [EmployeeV1EmployeeStatus](docs/EmployeeV1EmployeeStatus.md)
 - [EmployeeV1PrimaryPayRate](docs/EmployeeV1PrimaryPayRate.md)
 - [EmployeeV1UpdateEmployeeDataToPaylocityRequest](docs/EmployeeV1UpdateEmployeeDataToPaylocityRequest.md)
 - [Error](docs/Error.md)
 - [ErrorOptionsInner](docs/ErrorOptionsInner.md)
 - [LocalTax](docs/LocalTax.md)
 - [NewAdditionalDirectDeposit](docs/NewAdditionalDirectDeposit.md)
 - [NewBenefitClassSetup](docs/NewBenefitClassSetup.md)
 - [NewEmployee](docs/NewEmployee.md)
 - [NewFedTax](docs/NewFedTax.md)
 - [NewLocalTax](docs/NewLocalTax.md)
 - [NewMainDirectDeposit](docs/NewMainDirectDeposit.md)
 - [NewStateTax](docs/NewStateTax.md)
 - [NewWorkEligibility](docs/NewWorkEligibility.md)
 - [NonPrimaryStateTax](docs/NonPrimaryStateTax.md)
 - [Onboarding](docs/Onboarding.md)
 - [PayStatementDetails](docs/PayStatementDetails.md)
 - [PayStatementSummary](docs/PayStatementSummary.md)
 - [PrimaryPayRate](docs/PrimaryPayRate.md)
 - [SensitiveData](docs/SensitiveData.md)
 - [StagedEmployee](docs/StagedEmployee.md)
 - [StateTax](docs/StateTax.md)
 - [TrackingNumberResponse](docs/TrackingNumberResponse.md)
 - [UpdateEmployee](docs/UpdateEmployee.md)
 - [WebTime](docs/WebTime.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
