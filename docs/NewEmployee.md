

# NewEmployee


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | Employee current job title.&lt;br  /&gt;Max length: 50 |  [optional] |
|**address1** | **String** | Employee home 1st address line. &lt;br  /&gt;Max length: 40 |  [optional] |
|**address2** | **String** | Employee home 2nd address line. &lt;br  /&gt;Max length: 40 |  [optional] |
|**adjSeniorityDate** | **LocalDate** | Adjusted seniority date. Common formats are *MM-DD-CCYY, CCYY-MM-DD*. |  [optional] |
|**annualSalary** | **Double** | Employee annual salary. &lt;br  /&gt;Decimal (12,2) |  [optional] |
|**autoGenerateEmployeeId** | **Boolean** | *True* to have Paylocity Payroll/HR solution automatically assign the next available employee ID.&lt;br  /&gt;*False* when providing a value in the employeeId field. |  [optional] |
|**autoPay** | **Boolean** | If set to *True*, employee will be paid automatically using deafultHours. |  [optional] |
|**autoPayType** | **String** | Valid values are *N, D, S*. (N- employee won&#39;t automatically receive a salary or hours during payroll, D - employee will be automatically paid in defaultHours during payroll, S - employee will be automatically paid Salary |  [optional] |
|**baseRate** | **Double** | Employee base rate, used for Hourly employees. &lt;br  /&gt;Decimal (12,2) |  [optional] |
|**birthDate** | **LocalDate** | Employee birthdate. Common formats are *MM-DD-CCYY, CCYY-MM-DD*. |  [optional] |
|**city** | **String** | Employee home city. &lt;br  /&gt;Max length: 40 |  [optional] |
|**clockBadge** | **String** | Employee clock badge number. Deafults to employeeId. &lt;br  /&gt;Max length: 10 |  [optional] |
|**companyNumber** | **String** | Paylocity assigned company number.&lt;br  /&gt; Max length: 9 |  |
|**costCenter1** | **String** | Employer defined location, like *branch, division, department*, etc. Must match Company setup. &lt;br  /&gt;Max length: 10 |  [optional] |
|**costCenter2** | **String** | Employer defined location, like *branch, division, department*, etc. Must match Company setup. &lt;br  /&gt;Max length: 10 |  [optional] |
|**costCenter3** | **String** | Employer defined location, like *branch, division, department*, etc. Must match Company setup. &lt;br  /&gt;Max length: 10 |  [optional] |
|**country** | **String** | Employee country. &lt;br  /&gt; Max length: 30 |  [optional] |
|**county** | **String** | Employee county.&lt;br  /&gt; Max length: 30  |  [optional] |
|**defaultHours** | **Double** | Employee default hours consistently worked. If autoPayType is set to D, employee will be paid hourly base rate for the defaultHours. &lt;br  /&gt;Decimal (12,2) |  [optional] |
|**disability** | **Boolean** | Indicates if employee has disability status. |  [optional] |
|**eligibleForRehire** | **Boolean** | Indicates if employee eligible for rehire. |  [optional] |
|**employee943** | **Boolean** | Indicates if employee in agriculture or farming. |  [optional] |
|**employeeId** | **String** | Leave blank to have Paylocity Payroll/HR solution automatically assign the next available employee ID.&lt;br  /&gt; Max length: 10 |  [optional] |
|**employeeStatus** | **String** | Employee current work status. Common values are *A* (Active), *L* (Leave of Absence), *T* (Terminated). &lt;br  /&gt;Max length: 20 |  [optional] |
|**employmentType** | **String** | Employee current employment type. Common values *RFT (Regular Full Time), RPT (Regular Part Time), SNL (Seasonal), TFT (Temporary Full Time), TPT (Temporary Part Time)*. &lt;br  /&gt;Max length: 10 |  [optional] |
|**equalEmploymentOpportunityClass** | **String** | Values are configured in Company &gt; Setup &gt; HR &gt; EEO Classes.&lt;br  /&gt; Max length: 10 |  [optional] |
|**ethnicity** | **String** | Employee ethnicity.&lt;br  /&gt; Max length: 10 |  [optional] |
|**firstName** | **String** | Employee first name. &lt;br  /&gt;Max length: 40 |  [optional] |
|**fitwExempt** | **Boolean** | Indicates if employee exempt from federal income tax. |  [optional] |
|**fitwExemptNotes** | **String** | Notes for FITW exempt.&lt;br  /&gt; Max length: 250 |  [optional] |
|**fitwExemptReason** | **String** | Reason code for FITW exemption. Common values are *SE* (Statutory employee), *CR* (clergy/Religious). &lt;br  /&gt; Max length: 30 |  [optional] |
|**futaExempt** | **Boolean** | Indicates if employee is exempt from Federal Unemployment Tax Act. |  [optional] |
|**futaExemptNotes** | **String** | FUTA exempt note. &lt;br  /&gt; Max length: 250 |  [optional] |
|**futaExemptReason** | **String** | Reason code for FUTA exemption. Common values are *501* (5019c)(3) Organization), *IC* (Independent Contractor).&lt;br  /&gt; Max length: 30 |  [optional] |
|**hireDate** | **LocalDate** | Employee hired date. Common formats are *MM-DD-CCYY, CCYY-MM-DD*. |  [optional] |
|**homePhone** | **String** | Employee home phone number.&lt;br  /&gt;Max length: 12 |  [optional] |
|**isSupervisorReviewer** | **Boolean** | Indicates if employee is a supervisor or reviewer. |  [optional] |
|**lastName** | **String** | Employee last name. &lt;br  /&gt;Max length: 40 |  [optional] |
|**maritalStatus** | **String** | Employee marital status. Common values *D (Divorced), M (Married), S (Single), W (Widowed)*. &lt;br  /&gt;Max length: 10 |  [optional] |
|**medExempt** | **Boolean** | Indicates if employee is Medicare exempt. |  [optional] |
|**medExemptNotes** | **String** | Notes for Medicare exempt. |  [optional] |
|**medExemptReason** | **String** | Reason code for Medicare exemption. Common values are *501* (5019c)(3) Organization), *IC* (Independent Contractor).&lt;br  /&gt; Max length: 30 |  [optional] |
|**middleName** | **String** | Employee middle name.&lt;br  /&gt; Max length: 20 |  [optional] |
|**minimumWageExempt** | **Boolean** | Indicates if employee is exempt from minimum wage. |  [optional] |
|**nickname** | **String** | Employee preferred display name.&lt;br  /&gt; Max length: 20 |  [optional] |
|**overrideTitle** | **Boolean** | Indicates override to the default Job Title. Use the title field to enter Employee job title. |  [optional] |
|**overtimeExempt** | **Boolean** | Indicates if employee is exempt from overtime. |  [optional] |
|**payFrequency** | **String** | Employee current pay frequency. Common values are *A (Annual), B (Bi-Weekly), D (Daily), M (Monthly), S (Semi-Monthly), Q (Quarterly), W (Weekly)*. &lt;br  /&gt;Max length: 5 |  [optional] |
|**payGrade** | **String** | Employee pay grade. Must match Company setup. &lt;br  /&gt; Max length: 10 |  [optional] |
|**payGroup** | **String** | Employee pay group. Must match Company setup. &lt;br  /&gt; Max length: 20 |  [optional] |
|**payRateNote** | **String** | Pay rate notes regarding employee.&lt;br  /&gt; Max length: 250 |  [optional] |
|**pension** | **Boolean** | Indicates if employee is eligible for pension. |  [optional] |
|**personalEmailAddress** | **String** | Employee personal email address. &lt;br  /&gt;Max length: 50 |  [optional] |
|**personalMobilePhone** | **String** | Employee personal mobile phone number. &lt;br  /&gt;Max length: 12 |  [optional] |
|**positionCode** | **String** | Employee position code. Must match Company setup.&lt;br  /&gt;Max length: 20 |  [optional] |
|**primaryPayRateEffectiveDate** | **LocalDate** | Primary Pay Rate EffectiveDate |  [optional] |
|**priorLastName** | **String** | Prior last name if applicable.&lt;br  /&gt;Max length: 40 |  [optional] |
|**rateCode** | **String** | Employee rate (pay type) code.  Valid values are *Hourly* or *Salary*. &lt;br  /&gt;Max length: 10 |  [optional] |
|**ratePer** | **String** | Employee base rate frequency used with payType Hourly. Common values are *Hour, Week*. Default is Hour. &lt;br  /&gt;Max length: 10 |  [optional] |
|**reviewerCo** | **String** | Company number of reviewer. &lt;br  /&gt;Max length: 9 |  [optional] |
|**reviewerId** | **String** | Employee id of the reviewer. &lt;br  /&gt;Max length: 10 |  [optional] |
|**salary** | **Double** | Employee gross salary per pay period used with payType Salary.&lt;br  /&gt;Decimal (12,2) |  [optional] |
|**salutation** | **String** | Employee preferred salutation. &lt;br  /&gt;Max length: 10 |  [optional] |
|**sex** | **String** | Employee gender. Common values *M* (Male), *F* (Female). &lt;br  /&gt;Max length: 1 |  [optional] |
|**shift** | **String** | Employee work shift.&lt;br  /&gt;Max length: 255 |  [optional] |
|**sitwExempt** | **Boolean** | Indicates if employee exempt from state income tax. |  [optional] |
|**sitwExemptNotes** | **String** | Notes for SITW exempt.&lt;br  /&gt; Max length: 250 |  [optional] |
|**sitwExemptReason** | **String** | Reason code for SITW exemption. Common values are *SE* (Statutory employee), *CR* (clergy/Religious). &lt;br  /&gt; Max length: 30 |  [optional] |
|**smoker** | **Boolean** | Indicates if employee is a smoker. |  [optional] |
|**ssExempt** | **Boolean** | Indicates if employee is exempt from Social Security taxes. |  [optional] |
|**ssExemptNotes** | **String** | Notes for Socal Security exemptions.&lt;br  /&gt; Max length: 250 |  [optional] |
|**ssExemptReason** | **String** | Reason code for Social Security exemption. Common values are *SE* (Statutory employee), *CR* (clergy/Religious). &lt;br  /&gt; Max length: 30 |  [optional] |
|**ssn** | **String** | Employee social security number. Leave it blank if valid social security number not available. &lt;br  /&gt;Max length: 11 |  [optional] |
|**state** | **String** | Employee home state. &lt;br  /&gt;Max length: 2 |  [optional] |
|**statutory** | **Boolean** | Indicates if employee is statutory. |  [optional] |
|**suffix** | **String** | Employee name suffix. Common values are *Jr, Sr, II*.&lt;br  /&gt;Max length: 30 |  [optional] |
|**suiExempt** | **Boolean** | Indicates if employee is exempt from state unemployment insurance. |  [optional] |
|**suiExemptNotes** | **String** | Notes for SUI exempt.&lt;br  /&gt; Max length: 250 |  [optional] |
|**suiExemptReason** | **String** | Reason code for SUI exemption. Common values are *SE* (Statutory employee), *CR* (clergy/Religious). &lt;br  /&gt; Max length: 30 |  [optional] |
|**suiState** | **String** | Employee SUI (State Unemployment Insurance) state. &lt;br  /&gt;Max length: 2 |  [optional] |
|**supervisorCo** | **String** | Supervisor&#39;s company number. Defaults to employee company number.&lt;br  /&gt;Max length: 9 |  [optional] |
|**supervisorID** | **String** | EmployeeId of the supervisor. &lt;br  /&gt;Max length: 10 |  [optional] |
|**taxDistributionCode1099R** | **String** | Emplopyee 1099R distribution code. Common values are *7* (Normal Distribution), *F* (Charitable Gift Annuity). &lt;br  /&gt;Max length: 1 |  [optional] |
|**taxForm** | **String** | Employee tax form for reporting income. Valid values are *W2, 1099M, 1099R*. Default is W2. &lt;br  /&gt;Max length: 15 |  [optional] |
|**tipped** | **String** | Indicates if employee receives tips. |  [optional] |
|**unionCode** | **String** | Employee union code. Must match Company setup. &lt;br  /&gt;Max length: 10 |  [optional] |
|**unionDate** | **LocalDate** | Employee union affiliation effective date. Common formats are *MM-DD-CCYY, CCYY-MM-DD*. |  [optional] |
|**unionDues** | **Boolean** | Indicates if union dues are collected. |  [optional] |
|**unionInitFees** | **Boolean** | Indicates if initiations fees are collected. |  [optional] |
|**unionPosition** | **String** | Employee union position. Must match Company setup. &lt;br  /&gt;Max length: 30 |  [optional] |
|**veteran** | **Boolean** | Indicates if employee is a veteran. |  [optional] |
|**waliExempt** | **Boolean** | Indicates if employee is exempt from Washington state Liability Insurance. |  [optional] |
|**waliExemptNotes** | **String** | Notes for WALI exemption. |  [optional] |
|**waliExemptReason** | **String** | Reason code for WALI exemption. Common values are *SE* (Statutory employee), *CR* (clergy/Religious). &lt;br  /&gt; Max length: 30 |  [optional] |
|**workAddress1** | **String** | Employee work 1st address line.&lt;br  /&gt; Max length: 40 |  [optional] |
|**workAddress2** | **String** | Employee work 2nd address line. &lt;br  /&gt; Max length: 40 |  [optional] |
|**workCity** | **String** | Employee work city.&lt;br  /&gt; Max length: 40 |  [optional] |
|**workCountry** | **String** | Employee work country.&lt;br  /&gt; Max length: 30 |  [optional] |
|**workCounty** | **String** | Employee work county.&lt;br  /&gt; Max length: 30 |  [optional] |
|**workEmailAddress** | **String** | Employee work email. &lt;br  /&gt;Max length: 50 |  [optional] |
|**workersComp** | **String** | Employee worker compensation code. Must match Company setup.&lt;br  /&gt; Max length: 10 |  [optional] |
|**workExt** | **String** | Employee work phone extension number.&lt;br  /&gt; Max length: 10 |  [optional] |
|**workLocation** | **String** | Employee work location. &lt;br  /&gt; Max length: 50 |  [optional] |
|**workMailStop** | **String** | Employee physical mail box location.&lt;br  /&gt; Max length: 10 |  [optional] |
|**workMobilePhone** | **String** | Employee work mobile phone number.&lt;br  /&gt; Max length: 12 |  [optional] |
|**workPager** | **String** | Employee work pager number.&lt;br  /&gt; Max length: 20 |  [optional] |
|**workPhone** | **String** | Employee work phone number.&lt;br  /&gt; Max length: 12 |  [optional] |
|**workState** | **String** | Employee work state.&lt;br  /&gt; Max length: 2 |  [optional] |
|**workZip** | **String** | Employee work zip code.&lt;br  /&gt; Max length: 10 |  [optional] |
|**zip** | **String** | Employee home zip code. &lt;br  /&gt;Max length: 10 |  [optional] |
|**syncWebTimeRecord** | **Boolean** | If set to *True*, employee will be synced with Web Time. |  [optional] |
|**newBenefitClassSetup** | [**List&lt;NewBenefitClassSetup&gt;**](NewBenefitClassSetup.md) |  |  [optional] |
|**newMainDirectDeposit** | [**List&lt;NewMainDirectDeposit&gt;**](NewMainDirectDeposit.md) |  |  [optional] |
|**newAdditionalDirectDeposit** | [**List&lt;NewAdditionalDirectDeposit&gt;**](NewAdditionalDirectDeposit.md) |  |  [optional] |
|**newFedTax** | [**List&lt;NewFedTax&gt;**](NewFedTax.md) |  |  [optional] |
|**newLocalTax** | [**List&lt;NewLocalTax&gt;**](NewLocalTax.md) |  |  [optional] |
|**newStateTax** | [**List&lt;NewStateTax&gt;**](NewStateTax.md) |  |  [optional] |
|**newWorkEligibility** | [**List&lt;NewWorkEligibility&gt;**](NewWorkEligibility.md) |  |  [optional] |



