

# EmployeeV1BenefitSetup

Benefit Setup

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**benefitClass** | **String** | Benefit Class code. Values are configured in Paylocity Payroll/HR solution Company &gt; Setup &gt; Benefits &gt; Classes.&lt;br  /&gt;Max length: 30 |  [optional] |
|**benefitClassEffectiveDate** | **String** | Date when Benefit Class takes effect. Common formats are *MM-DD-CCYY, CCYY-MM-DD*. |  [optional] |
|**benefitSalary** | **Double** | Salary used to configure benefits.&lt;br  /&gt;Decimal(12,2) |  [optional] |
|**benefitSalaryEffectiveDate** | **String** | Date when Benefit Salary takes effect. Common formats are *MM-DD-CCYY, CCYY-MM-DD*. |  [optional] |
|**doNotApplyAdministrativePeriod** | **Boolean** | Applicable only for ACA Enhanced clients and Benefit Classes with ACA Employment Type of Full Time. |  [optional] |
|**measureACAEligibility** | **Boolean** | Only valid for ACA Enhanced clients and Benefit Classes that are ACA Employment Type of Full Time. |  [optional] |



