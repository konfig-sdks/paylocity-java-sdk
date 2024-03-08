

# PrimaryPayRate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**autoPay** | **Boolean** | If set to *True*, employee will be paid automatically using deafultHours.  |  [optional] |
|**baseRate** | **Double** | Employee base rate, used for Hourly employees. &lt;br  /&gt;Decimal (12,2) |  [optional] |
|**defaultHours** | **Double** | Employee default hours consistently worked. If autoPayType is set to D, employee will be paid hourly base rate for the defaultHours. &lt;br  /&gt;Decimal (12,2) |  [optional] |
|**effectiveDate** | **LocalDate** | The date the employee’s pay rate takes effect. Common formats are *MM-DD-CCYY, CCYY-MM-DD*. |  [optional] |
|**payFrequency** | **String** | Employee current pay frequency. Common values are *A (Annual), B (Bi-Weekly), D (Daily), M (Monthly), S (Semi-Monthly), Q (Quarterly), W (Weekly)*. &lt;br  /&gt;Max length: 5 |  [optional] |
|**payGrade** | **String** | Employee pay grade. Must match Company setup. &lt;br  /&gt; Max length: 10 |  [optional] |
|**payType** | **String** | Employee pay type (rate code). Valid values are *Hourly* or *Salary*. &lt;br  /&gt;Max length: 10 |  [optional] |
|**ratePer** | **String** | Employee base rate frequency used with payType Hourly. Common values are *Hour, Week*. Default is Hour. &lt;br  /&gt;Max length: 10 |  [optional] |
|**reason** | **String** | Primary Pay Rate change reason. Must match Company setup.&lt;br  /&gt;Max length: 15 |  [optional] |
|**salary** | **Double** | Employee gross salary per pay period used with payType Salary.&lt;br  /&gt;Decimal (12,2) |  [optional] |



