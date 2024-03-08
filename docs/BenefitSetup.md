

# BenefitSetup

The benefit setup model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**benefitClass** | **Object** | Benefit Class code. Values are configured in Paylocity Payroll/HR solution Company &gt; Setup &gt; Benefits &gt; Classes.&lt;br  /&gt;Max length: 30 |  [optional] |
|**benefitClassEffectiveDate** | **Object** | Date when Benefit Class takes effect. Common formats include *MM-DD-CCYY*, *CCYY-MM-DD*. |  [optional] |
|**benefitSalary** | **Object** | Salary used to configure benefits.&lt;br  /&gt;Decimal(12,2) |  [optional] |
|**benefitSalaryEffectiveDate** | **Object** | Date when Benefit Salary takes effect. Common formats include *MM-DD-CCYY*, *CCYY-MM-DD*. |  [optional] |
|**doNotApplyAdministrativePeriod** | **Object** | Applicable only for HR Enhanced clients and Benefit Classes with ACA Employment Type of Full Time. |  [optional] |
|**isMeasureAcaEligibility** | **Object** | Only valid for HR Enhanced clients and Benefit Classes that are ACA Employment Type of Full Time. |  [optional] |



