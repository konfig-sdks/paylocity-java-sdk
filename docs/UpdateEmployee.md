

# UpdateEmployee


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address1** | **String** | Employee home 1st address line. &lt;br  /&gt;Max length: 40 |  [optional] |
|**address2** | **String** | Employee home 2nd address line. &lt;br  /&gt;Max length: 40 |  [optional] |
|**adjSeniorityDate** | **LocalDate** | Adjusted seniority date. Common formats are *MM-DD-CCYY, CCYY-MM-DD*. |  [optional] |
|**birthDate** | **LocalDate** | Employee birthdate. Common formats are *MM-DD-CCYY, CCYY-MM-DD*. |  [optional] |
|**city** | **String** | Employee home city. &lt;br  /&gt;Max length: 40 |  [optional] |
|**companyNumber** | **String** | Paylocity assigned company number. &lt;br  /&gt; Max length: 9 |  [optional] |
|**country** | **String** | Employee country. &lt;br  /&gt; Max length: 30 |  [optional] |
|**county** | **String** | Employee county.&lt;br  /&gt; Max length: 30 |  [optional] |
|**disability** | **String** | Indicates if employee has disability status. |  [optional] |
|**eligibleForRehire** | **Boolean** | Indicates if employee eligible for rehire. |  [optional] |
|**employeeId** | **String** | The Paylocity Employee ID. This is a unique value per Paylocity Company ID.  **Allowable Values:**  10 char max |  [optional] |
|**employeeStatus** | **String** | Employee current work status. Common values are *A* (Active), *L* (Leave of Absence), *T* (Terminated). &lt;br  /&gt;Max length: 20 |  [optional] |
|**empStatusChangeReason** | **String** | Employee status change reason. Must match Company setup.&lt;br  /&gt;Max length: 15 |  [optional] |
|**empStatusEffectiveDate** | **String** | Effective date of employee status change, can be in the future. Common formats are *MM-DD-CCYY, CCYY-MM-DD*. |  [optional] |
|**ethnicity** | **String** | Employee ethnicity.&lt;br  /&gt; Max length: 10 |  [optional] |
|**firstName** | **String** | Employee first name. &lt;br  /&gt;Max length: 40 |  [optional] |
|**homePhone** | **String** | Employee home phone number.  &lt;br  /&gt;Max length: 12 |  [optional] |
|**lastName** | **String** | Employee last name. &lt;br  /&gt;Max length: 40 |  [optional] |
|**maritalStatus** | **String** | Employee marital status. Common values *D (Divorced), M (Married), S (Single), W (Widowed)*. &lt;br  /&gt;Max length: 10 |  [optional] |
|**middleName** | **String** | Employee middle name.&lt;br  /&gt; Max length: 20 |  [optional] |
|**nickname** | **String** | Employee preferred display name. &lt;br  /&gt; Max length: 20 |  [optional] |
|**pager** | **String** | Employee work pager number.&lt;br  /&gt; Max length: 20 |  [optional] |
|**personalEmailAddress** | **String** | Employee personal email address. &lt;br  /&gt;Max length: 50 |  [optional] |
|**personalMobilePhone** | **String** | Employee personal mobile phone number. &lt;br  /&gt;Max length: 12 |  [optional] |
|**priorLastName** | **String** | Prior last name if applicable.&lt;br  /&gt;Max length: 40 |  [optional] |
|**salutation** | **String** | Employee preferred salutation. &lt;br  /&gt;Max length: 10 |  [optional] |
|**sex** | **String** | Employee gender. Common values *M* (Male), *F* (Female). &lt;br  /&gt;Max length: 1 |  [optional] |
|**smoker** | **Boolean** | Indicates if employee is a smoker. |  [optional] |
|**ssn** | **String** | Employee social security number. Leave it blank if valid social security number not available. &lt;br  /&gt;Max length: 11 |  [optional] |
|**state** | **String** | Employee home state. &lt;br  /&gt;Max length: 2 |  [optional] |
|**suffix** | **String** | Employee name suffix. Common values are *Jr, Sr, II*.&lt;br  /&gt;Max length: 30 |  [optional] |
|**suiExempt** | **Boolean** | Indicates if employee is exempt from state unemployment insurance. |  [optional] |
|**suiExemptNotes** | **String** | Notes for SUI exempt.&lt;br  /&gt; Max length: 250 |  [optional] |
|**suiExemptReason** | **String** | Reason code for SUI exemption. Common values are *SE* (Statutory employee), *CR* (Clergy/Religious). &lt;br  /&gt; Max length: 30 |  [optional] |
|**veteran** | **String** | Indicates if employee is a veteran. |  [optional] |
|**workAddress1** | **String** | Employee work 1st address line.&lt;br  /&gt; Max length: 40 |  [optional] |
|**workAddress2** | **String** | Employee work 2nd address line. &lt;br  /&gt; Max length: 40 |  [optional] |
|**workCity** | **String** | Employee work city.&lt;br  /&gt; Max length: 40 |  [optional] |
|**workCountry** | **String** | Employee work country.&lt;br  /&gt; Max length: 30 |  [optional] |
|**workCounty** | **String** | Employee work county.&lt;br  /&gt; Max length: 30 |  [optional] |
|**workEmailAddress** | **String** | Employee work email. &lt;br  /&gt;Max length: 50 |  [optional] |
|**workMailStop** | **String** | Employee physical mail box location.&lt;br  /&gt; Max length: 10 |  [optional] |
|**workMobilePhone** | **String** | Employee work mobile phone number.&lt;br  /&gt; Max length: 12 |  [optional] |
|**workPager** | **String** | Employee work pager number.&lt;br  /&gt; Max length: 20 |  [optional] |
|**workPhone** | **String** | Employee work phone number.&lt;br  /&gt; Max length: 12 |  [optional] |
|**workPhoneExt** | **String** | Employee work phone extension number.&lt;br  /&gt; Max length: 10 |  [optional] |
|**workState** | **String** | Employee work state.&lt;br  /&gt; Max length: 2 |  [optional] |
|**workZip** | **String** | Employee work zip code.&lt;br  /&gt; Max length: 10 |  [optional] |
|**zip** | **String** | Employee home zip code. &lt;br  /&gt;Max length: 10 |  [optional] |
|**benefitSetup** | [**List&lt;BenefitSetup&gt;**](BenefitSetup.md) |  |  [optional] |
|**departmentPosition** | [**List&lt;DepartmentPosition&gt;**](DepartmentPosition.md) |  |  [optional] |
|**primaryPayRate** | [**List&lt;PrimaryPayRate&gt;**](PrimaryPayRate.md) |  |  [optional] |
|**webTime** | [**List&lt;WebTime&gt;**](WebTime.md) |  |  [optional] |



