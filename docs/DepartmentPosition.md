

# DepartmentPosition


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**changeReason** | **String** | Employee department/position change reason. Must match Company setup.&lt;br  /&gt;Max length: 15 |  [optional] |
|**clockBadgeNumber** | **String** | Employee clock badge number. Deafults to employeeId. &lt;br  /&gt;Max length: 10 |  [optional] |
|**costCenter1** | **String** | Employer defined location, like *branch, division, department*, etc. Must match Company setup. &lt;br  /&gt;Max length: 10 |  [optional] |
|**costCenter2** | **String** | Employer defined location, like *branch, division, department*, etc. Must match Company setup. &lt;br  /&gt;Max length: 10 |  [optional] |
|**costCenter3** | **String** | Employer defined location, like *branch, division, department*, etc. Must match Company setup. &lt;br  /&gt;Max length: 10 |  [optional] |
|**effectiveDate** | **LocalDate** | The date the position takes effect. (MM-DD-CCYY) |  [optional] |
|**employeeType** | **String** | Employee current employment type. Common values *RFT (Regular Full Time), RPT (Regular Part Time), SNL (Seasonal), TFT (Temporary Full Time), TPT (Temporary Part Time)*. &lt;br  /&gt;Max length: 10 |  [optional] |
|**equalEmploymentOpportunityClass** | **String** | Values are configured in Company &gt; Setup &gt; HR &gt; EEO Classes.&lt;br  /&gt; Max length: 10 |  [optional] |
|**isSupervisorReviewer** | **Boolean** | Indicates if employee is a supervisor or reviewer. |  [optional] |
|**jobTitle** | **String** | Employee current job title. &lt;br  /&gt;Max length: 50 |  [optional] |
|**minimumWageExempt** | **Boolean** | Indicates if employee is exempt from minimum wage. |  [optional] |
|**overtimeExempt** | **Boolean** | Indicates if employee is exempt from overtime. |  [optional] |
|**payGroup** | **String** | Employee pay group. Must match Company setup. &lt;br  /&gt; Max length: 20 |  [optional] |
|**positionCode** | **String** | Employee position code. Must match Company setup.&lt;br  /&gt;Max length: 20 |  [optional] |
|**shift** | **String** | Employee work shift.&lt;br  /&gt;Max length: 255 |  [optional] |
|**supervisorCompanyNumber** | **String** | Supervisor&#39;s company number. Defaults to employee company number.&lt;br  /&gt;Max length: 9 |  [optional] |
|**supervisorEmployeeId** | **String** | EmployeeId of the supervisor. &lt;br  /&gt;Max length: 10 |  [optional] |
|**tipped** | **String** | Indicates if employee receives tips. |  [optional] |
|**unionAffiliationDate** | **LocalDate** | Employee union affiliation effective date. Common formats are *MM-DD-CCYY, CCYY-MM-DD*. |  [optional] |
|**unionCode** | **String** | Employee union code. Must match Company setup. &lt;br  /&gt;Max length: 10 |  [optional] |
|**unionDuesCollected** | **Boolean** | Indicates if union dues are collected. |  [optional] |
|**unionInitiationCollected** | **Boolean** | Indicates if union initiation fees are collected |  [optional] |
|**unionPosition** | **String** | Employee union position. Must match Company setup. &lt;br  /&gt;Max length: 30 |  [optional] |
|**workersComp** | **String** | Employee worker compensation code. Must match Company setup.&lt;br  /&gt; Max length: 10 |  [optional] |



