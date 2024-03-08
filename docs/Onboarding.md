

# Onboarding


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**employeeId** | **String** | (optional) The Paylocity Employee ID. This is a unique value per Paylocity Company ID.  **Allowable Values:**  10 char max |  [optional] |
|**address1** | **String** | Employee home 1st address line. &lt;br  /&gt;Max length: 40 |  [optional] |
|**address2** | **String** | Employee home 2nd address line. &lt;br  /&gt;Max length: 40 |  [optional] |
|**autoPayType** | **String** | Valid values are *N, D, S. (N- employee won&#39;t automatically receive a salary or hours during payroll, D - employee will be automatically paid in defaultHours during payroll, S - employee will be automatically paid Salary amount during payroll)*. &lt;br  /&gt;Max length: 3 |  [optional] |
|**baseRate** | **Double** | Employee base rate, used for Hourly employees. &lt;br  /&gt;Decimal (12,2) |  [optional] |
|**city** | **String** | Employee home city. &lt;br  /&gt;Max length: 40 |  [optional] |
|**costCenter1** | **String** | Employer defined location, like *branch, division, department, etc.* Must match Company setup. &lt;br  /&gt;Max length: 10 |  [optional] |
|**costCenter2** | **String** | Employer defined location, like *branch, division, department, etc.* Must match Company setup. &lt;br  /&gt;Max length: 10 |  [optional] |
|**costCenter3** | **String** | Employer defined location, like *branch, division, department, etc.* Must match Company setup. &lt;br  /&gt;Max length: 10 |  [optional] |
|**defaultHours** | **Double** | Employee default hours consistently worked. If autoPayType is set to D, employee will be paid hourly base rate for the defaultHours. &lt;br  /&gt;Decimal (12,2) |  [optional] |
|**employeeStatus** | **String** | Employee current work status. Common values are *A (Active), L (Leave of Absence), T (Terminated)*. &lt;br  /&gt;Max length: 20 |  [optional] |
|**employmentType** | **String** | Employee current employment type. Common values RFT *(Regular Full Time), RPT (Regular Part Time), SNL (Seasonal), TFT (Temporary Full Time), TPT (Temporary Part Time)*. &lt;br  /&gt;Max length: 10 |  [optional] |
|**federalFilingStatus** | **String** | Employee federal filing status. Common values *M (Married), S (Single)*. &lt;br  /&gt;Max length: 10 |  [optional] |
|**firstName** | **String** | Employee first name. &lt;br  /&gt;Max length: 40 |  |
|**sex** | **String** | Employee gender. Common values *M (Male), F (Female)*. &lt;br  /&gt;Max length: 1 |  [optional] |
|**hireDate** | **String** | Employee hired date. Common formats are MM-DD-CCYY, CCYY-MM-DD |  [optional] |
|**homePhone** | **String** | Employee home phone number. &lt;br  /&gt;Max length: 12 |  [optional] |
|**lastName** | **String** | Employee last name. &lt;br  /&gt;Max length: 40 |  |
|**maritalStatus** | **String** | Employee marital status. Common values *D (Divorced), M (Married), S (Single), W (Widowed)*. &lt;br  /&gt;Max length: 10 |  [optional] |
|**personalMobilePhone** | **String** | Employee personal mobile phone number. &lt;br  /&gt;Max length: 12 |  [optional] |
|**payFrequency** | **String** | Employee current pay frequency. Common values are *A (Annual), B (Bi-Weekly), D (Daily), M (Monthly), S (Semi-Monthly), Q (Quarterly), W (Weekly)*. &lt;br  /&gt;Max length: 5 |  [optional] |
|**personalEmailAddress** | **String** | Employee personal email address. &lt;br  /&gt;Max length: 50 |  [optional] |
|**payType** | **String** | Employee pay type. Valid values are *Hourly or Salary*. &lt;br  /&gt;Max length: 10 |  [optional] |
|**ratePer** | **String** | Employee base rate frequency used with payType Hourly. Common values are *Hour or Week*. Default is Hour &lt;br  /&gt;Max length: 10 |  [optional] |
|**salary** | **Double** | Employee gross salary per pay period used with payType Salary. &lt;br  /&gt;Decimal (12,2) |  [optional] |
|**state** | **String** | Employee home state. &lt;br  /&gt;Max length: 2 |  [optional] |
|**ssn** | **String** | Employee social security number. Leave it blank if valid social security number not available. &lt;br  /&gt;Max length: 11 |  [optional] |
|**stateFilingStatus** | **String** | Employee state filing status. Common values are *M (Married), S (Single)*. &lt;br  /&gt;Max length: 50 |  [optional] |
|**suiState** | **String** | Employee SUI (State Unemployment Insurance) state. &lt;br  /&gt;Max length: 2 |  [optional] |
|**taxForm** | **String** | Employee tax form for reporting income. Valid values are *W2, 1099M, 1099R*. Default is W2. &lt;br  /&gt;Max length: 15 |  [optional] |
|**taxState** | **String** | Employee primary tax state. &lt;br  /&gt;Max Length: 2 |  [optional] |
|**userName** | **String** | Required. Employer assigned username to log into Onboarding. Duplicate usernames are not allowed. &lt;br  /&gt;Must be between 3 and 20 characters and cannot have special characters other than . (period) and _ (underscore) |  [optional] |
|**workEmailAddress** | **String** | Employee work email. &lt;br  /&gt;Max length: 50 |  [optional] |
|**zip** | **String** | Employee home zip code. &lt;br  /&gt;Max length: 10 |  [optional] |



