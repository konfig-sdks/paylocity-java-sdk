

# EmployeeV1

Employee

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address1** | **String** | Employee home 1st address line. &lt;br  /&gt;Max length: 40 |  [optional] |
|**address2** | **String** | Employee home 2nd address line. &lt;br  /&gt;Max length: 40 |  [optional] |
|**benefitSetup** | [**EmployeeV1BenefitSetup**](EmployeeV1BenefitSetup.md) |  |  [optional] |
|**birthDate** | **String** | Employee birthdate. Common formats are *MM-DD-CCYY, CCYY-MM-DD*. |  [optional] |
|**city** | **String** | Employee home city. &lt;br  /&gt;Max length: 40 |  [optional] |
|**companyNumber** | **String** | Paylocity assigned company number. &lt;br  /&gt; Max length: 9 |  [optional] |
|**departmentPosition** | [**EmployeeV1DepartmentPosition**](EmployeeV1DepartmentPosition.md) |  |  [optional] |
|**employeeId** | **String** | Leave blank to have Paylocity Payroll/HR solution automatically assign the next available employee ID.&lt;br  /&gt; Max length: 10 |  [optional] |
|**employeeStatus** | [**EmployeeV1EmployeeStatus**](EmployeeV1EmployeeStatus.md) |  |  [optional] |
|**ethnicity** | **String** | Employee ethnicity.&lt;br  /&gt; Max length: 10 |  [optional] |
|**firstName** | **String** | Employee first name. &lt;br  /&gt;Max length: 40 |  [optional] |
|**gender** | **String** | Employee gender. Common values *M* (Male), *F* (Female). &lt;br  /&gt;Max length: 1 |  [optional] |
|**highlyCompensatedEmployee** | **Boolean** | Indicates if employee meets the highly compensated employee criteria. |  [optional] |
|**hireDate** | **String** | Employee hired date. Common formats are *MM-DD-CCYY, CCYY-MM-DD*. |  [optional] |
|**homePhone** | **String** | Employee home phone number.  &lt;br  /&gt;Max length: 12 |  [optional] |
|**lastName** | **String** | Employee last name. &lt;br  /&gt;Max length: 40 |  [optional] |
|**maritalStatus** | **String** | Employee marital status. Common values *D (Divorced), M (Married), S (Single), W (Widowed)*. &lt;br  /&gt;Max length: 10 |  [optional] |
|**middleName** | **String** | Employee middle name.&lt;br  /&gt; Max length: 20 |  [optional] |
|**nickname** | **String** | Employee preferred display name. &lt;br  /&gt; Max length: 20 |  [optional] |
|**ownerPercent** | **Double** | Percentage of employee&#39;s ownership in the company, entered as a whole number . &lt;br  /&gt; Decimal (12,2) |  [optional] |
|**personalEmailAddress** | **String** | Employee personal email address. &lt;br  /&gt;Max length: 50 |  [optional] |
|**personalMobilePhone** | **String** | Employee personal mobile phone number. &lt;br  /&gt;Max length: 12 |  [optional] |
|**position** | **String** | Employee position code. Must match Company setup.&lt;br  /&gt;Max length: 20  |  [optional] |
|**postalCode** | **String** | Employee work zip code.&lt;br  /&gt; Max length: 10 |  [optional] |
|**primaryPayRate** | [**EmployeeV1PrimaryPayRate**](EmployeeV1PrimaryPayRate.md) |  |  [optional] |
|**reHireDate** | **String** | Rehire date if employee is rehired. Common formats are *MM-DD-CCYY, CCYY-MM-DD*. |  [optional] |
|**ssn** | **String** | Employee social security number. Leave it blank if valid social security number not available. &lt;br  /&gt;Max length: 11 |  [optional] |
|**state** | **String** | Employee home state. &lt;br  /&gt;Max length: 2 |  [optional] |
|**statutory** | **Boolean** | Indicates if employee is statutory. |  [optional] |
|**supervisorCompanyNumber** | **String** | Supervisor&#39;s company number. Defaults to employee company number.&lt;br  /&gt;Max length: 9 |  [optional] |
|**supervisorEmployeeId** | **String** | EmployeeId of the supervisor. &lt;br  /&gt;Max length: 10 |  [optional] |
|**taxForm** | **String** | Employee tax form for reporting income. Valid values are *W2, 1099M, 1099R*. Default is W2. &lt;br  /&gt;Max length: 15 |  [optional] |
|**terminationDate** | **String** | Date of emplyee termination. Common formats are *MM-DD-CCYY, CCYY-MM-DD*. |  [optional] |
|**terminationReason** | **String** | Employee termination reason. Must match Company setup for employee status.&lt;br  /&gt;Max length: 15 |  [optional] |
|**workEmailAddress** | **String** | Employee work email. &lt;br  /&gt;Max length: 50 |  [optional] |
|**workPhone** | **String** | Employee work phone number.&lt;br  /&gt; Max length: 12 |  [optional] |
|**workPhoneExt** | **String** | Employee work phone extension number.&lt;br  /&gt; Max length: 10 |  [optional] |



