

# Deduction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agency** | **String** | Used to produce third-party checks for a specific agency. Must match Company setup.&lt;br  /&gt;Max length: 5 |  [optional] |
|**annualMaximum** | **Double** | Year to Date dollar amount not to be exceeded for a deduction in the calendar year. &lt;br  /&gt;Decimal(12,2) |  [optional] |
|**calcCode** | **String** | Defines how deductions are calculated. Common values are *% (percentage of gross), flat (flat dollar amount)*. Defaulted to the Company setup calcCode for deduction. &lt;br  /&gt;Max length: 15 |  [optional] |
|**caseNo** | **String** | Child Support Case Identifier number, case number or court order number.&lt;br  /&gt;Max length: 20 |  [optional] |
|**costCenter1** | **String** | Cost Center associated with deduction. Must match Company setup.&lt;br  /&gt; Max length: 10 |  [optional] |
|**costCenter2** | **String** | Cost Center associated with deduction. Must match Company setup.&lt;br  /&gt; Max length: 10 |  [optional] |
|**costCenter3** | **String** | Cost Center associated with deduction. Must match Company setup.&lt;br  /&gt; Max length: 10 |  [optional] |
|**dcode** | **String** | Deduction code. Must match Company setup. &lt;br  /&gt;Max length: 5 |  [optional] |
|**effectiveDate** | **LocalDate** | Date deduction or benefit is active. Defaulted to run date or check date based on Company setup. Common formats are MM-DD-CCYY, CCYY-MM-DD |  [optional] |
|**endDate** | **LocalDate** | Stop date of a deduction or benefit. Common formats are MM-DD-CCYY, CCYY-MM-DD. |  [optional] |
|**fipsCode** | **String** | Child support Federal Information Process Standard (FIPS) code. &lt;br  /&gt;Max length: 7 |  [optional] |
|**frequency** | **String** | Needed if deduction is applied differently from the payroll frequency (one time deduction for example).&lt;br  /&gt; Max length: 5 |  [optional] |
|**goal** | **Double** | Dollar amount. The employee deduction will stop when the goal amount is reached.&lt;br  /&gt; Decimal(12,2) |  [optional] |
|**isSelfInsuredPlan** | **Boolean** | Used for ACA. If not entered, defaulted to Company deduction setup |  [optional] |
|**loanFirstPaymentDate401K** | **LocalDate** | 401K loan first payment date. Common formats are MM-DD-CCYY, CCYY-MM-DD |  [optional] |
|**loanIssueDate401K** | **LocalDate** | 401K loan issue date. Common formats are MM-DD-CCYY, CCYY-MM-DD |  [optional] |
|**loanNumber** | **String** | 401K Loan number, required for 401K Loan deduction types. &lt;br  /&gt; Max length: 50 |  [optional] |
|**maximum** | **Double** | Maximum amount of the deduction on a single paycheck. &lt;br  /&gt; Decimal(12,2) |  [optional] |
|**medicalSupport** | **Boolean** | Indicates if the employee qualifies for medical benefits that can be used to cover the child |  [optional] |
|**minimum** | **Double** | Minimum amount of the deduction on a single paycheck. &lt;br  /&gt; Decimal(12,2) |  [optional] |
|**miscInfo** | **String** | Information to print on the check stub if agency check is set up for this deduction. &lt;br  /&gt;Max length: 50 |  [optional] |
|**paidTowardsGoal** | **Double** | Amount already paid toward goal.&lt;br  /&gt; Decimal(12,2) |  [optional] |
|**priority** | **Integer** | Priority of a deduction within the deduction category. Common values are *0,1,2. &lt;br  /&gt; Max length: 2 |  [optional] |
|**rate** | **Double** | Value to match the calcCode (percentage or amount). For example if calcCode &#x3D; %, enter 10.00 to indicate 10%. &lt;br  /&gt; Decimal(12,2) |  [optional] |
|**reportTerminated** | **Boolean** | Indicates whether agency needs to be reported on terminated employee |  [optional] |
|**startDate** | **LocalDate** | Start date of a deduction based on payroll calendar. Common formats are MM-DD-CCYY, CCYY-MM-DD |  [optional] |
|**stateAbbrev** | **String** | State for child support.&lt;br  /&gt; Max length: 2 |  [optional] |



