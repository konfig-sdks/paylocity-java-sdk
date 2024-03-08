

# Employee

The employee model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalDirectDeposit** | **List&lt;Object&gt;** | Add up to 19 direct deposit accounts in addition to the main direct deposit account. IMPORTANT: A direct deposit update will remove ALL existing main and additional direct deposit information in WebPay and replace with information provided on the request. GET API will not return direct deposit data. |  [optional] |
|**additionalRate** | **List&lt;Object&gt;** | Add Additional Rates. |  [optional] |
|**benefitSetup** | **Object** |  Add or update setup values used for employee benefits integration, insurance plan settings, and ACA reporting. |  [optional] |
|**birthDate** | **Object** | Employee birthdate. Common formats include *MM-DD-CCYY*, *CCYY-MM-DD*. |  [optional] |
|**companyFEIN** | **Object** | Company FEIN as defined in Paylocity Payroll/HR solution, applicable with GET requests only.&lt;br  /&gt; Max length: 20 |  [optional] |
|**companyName** | **Object** | Company name as defined in Paylocity Payroll/HR solution, applicable with GET requests only.&lt;br  /&gt; Max length: 50 |  [optional] |
|**currency** | **Object** | Employee is paid in this currency. &lt;br  /&gt;Max length: 30 |  [optional] |
|**customBooleanFields** | **List&lt;Object&gt;** | Up to 8 custom fields of boolean (checkbox) type value. |  [optional] |
|**customDateFields** | **List&lt;Object&gt;** | Up to 8 custom fields of the date type value. |  [optional] |
|**customDropDownFields** | **List&lt;Object&gt;** | Up to 8 custom fields of the dropdown type value. |  [optional] |
|**customNumberFields** | **List&lt;Object&gt;** | Up to 8 custom fields of numeric type value. |  [optional] |
|**customTextFields** | **List&lt;Object&gt;** | Up to 8 custom fields of text type value. |  [optional] |
|**departmentPosition** | **Object** | Add or update home department cost center, position, supervisor, reviewer, employment type, EEO class, pay settings, and union information. |  [optional] |
|**disabilityDescription** | **Object** | Indicates if employee has disability status. |  [optional] |
|**emergencyContacts** | **List&lt;Object&gt;** | Add or update Emergency Contacts. |  [optional] |
|**employeeId** | **Object** | Leave blank to have Paylocity Payroll/HR solution automatically assign the next available employee ID.&lt;br  /&gt;Max length: 10 |  [optional] |
|**ethnicity** | **Object** | Employee ethnicity.&lt;br  /&gt; Max length: 10 |  [optional] |
|**federalTax** | **Object** | Add or update federal tax amount type (taxCalculationCode), amount or percentage, filing status, and exemptions. |  [optional] |
|**firstName** | **Object** | Employee first name. &lt;br  /&gt;Max length: 40 |  [optional] |
|**gender** | **Object** | Employee gender. Common values *M* (Male), *F* (Female). &lt;br  /&gt;Max length: 1 |  [optional] |
|**homeAddress** | **Object** | Add or update employee&#39;s home address, personal phone numbers, and personal email. |  [optional] |
|**isHighlyCompensated** | **Boolean** | Indicates if employee meets the highly compensated employee criteria. |  [optional] |
|**isSmoker** | **Boolean** | Indicates if employee is a smoker. |  [optional] |
|**lastName** | **Object** | Employee last name. &lt;br  /&gt;Max length: 40 |  [optional] |
|**localTax** | **List&lt;Object&gt;** | Add, update, or delete local tax code, filing status, and exemptions including  PA-PSD taxes. |  [optional] |
|**mainDirectDeposit** | **Object** | Add the main direct deposit account. After deposits are made to any additional direct deposit accounts, the remaining net check is deposited in the main direct deposit account. IMPORTANT: A direct deposit update will remove ALL existing main and additional direct deposit information in WebPay and replace with what is provided on the request. GET API will not return direct deposit data. |  [optional] |
|**maritalStatus** | **Object** | Employee marital status. Common values *D (Divorced), M (Married), S (Single), W (Widowed)*. &lt;br  /&gt;Max length: 10 |  [optional] |
|**middleName** | **Object** | Employee middle name.&lt;br  /&gt; Max length: 20 |  [optional] |
|**nonPrimaryStateTax** | **Object** | Add or update non-primary state tax code, amount type (taxCalculationCode), amount or percentage, filing status, exemptions, supplemental check (specialCheckCalc), and reciprocity code information. |  [optional] |
|**ownerPercent** | **Object** | Percentage of employee&#39;s ownership in the company, entered as a whole number. &lt;br  /&gt; Decimal (12,2) |  [optional] |
|**preferredName** | **Object** | Employee preferred display name.&lt;br  /&gt; Max length: 20 |  [optional] |
|**primaryPayRate** | **Object** | Add or update hourly or salary pay rate, effective date, and pay frequency. |  [optional] |
|**primaryStateTax** | **Object** | Add or update primary state tax code, amount type (taxCalculationCode), amount or percentage, filing status, exemptions, and supplemental check (specialCheckCalc) information. Only one primary state is allowed. Sending an updated primary state will replace the current primary state. |  [optional] |
|**priorLastName** | **Object** | Prior last name if applicable.&lt;br  /&gt;Max length: 40 |  [optional] |
|**salutation** | **Object** | Employee preferred salutation. &lt;br  /&gt;Max length: 10 |  [optional] |
|**ssn** | **Object** | Employee social security number. Leave it blank if valid social security number not available. &lt;br  /&gt;Max length: 11 |  [optional] |
|**status** | **Object** | Add or update employee status, change reason, effective date, and adjusted seniority date. Note that companies that are still in Implementation cannot hire future employees. |  [optional] |
|**suffix** | **Object** | Employee name suffix. Common values are *Jr, Sr, II*.&lt;br  /&gt;Max length: 30 |  [optional] |
|**taxSetup** | **Object** | Add tax form, 1099 exempt reasons and notes, and 943 agricultural employee information. Once the employee receives wages, this information cannot be updated. Add or update SUI tax state, retirement plan, and statutory information. |  [optional] |
|**veteranDescription** | **Object** | Indicates if employee is a veteran. |  [optional] |
|**webTime** | **Object** | Add or update Web Time badge number and charge rate and synchronize Paylocity Payroll/HR solution and Web Time employee data. |  [optional] |
|**workAddress** | **Object** | Add or update employee&#39;s work address, phone numbers, and email. Work Location drop down field is not included. |  [optional] |
|**workEligibility** | **Object** | Add or update I-9 work authorization information. |  [optional] |



