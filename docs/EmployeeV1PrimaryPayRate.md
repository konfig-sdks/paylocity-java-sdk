

# EmployeeV1PrimaryPayRate

Primary Pay Rate

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**annualSalary** | **Double** | Employee annual salary. &lt;br  /&gt;Decimal (12,2) |  [optional] |
|**baseRate** | **Double** | Employee base rate, used for Hourly employees. &lt;br  /&gt;Decimal (12,2) |  [optional] |
|**defaultHours** | **Double** | Employee default hours consistently worked. If autoPayType is set to D, employee will be paid hourly base rate for the defaultHours. &lt;br  /&gt;Decimal (12,2) |  [optional] |
|**payFrequency** | **String** | Employee current pay frequency. Common values are *A (Annual), B (Bi-Weekly), D (Daily), M (Monthly), S (Semi-Monthly), Q (Quarterly), W (Weekly)*. &lt;br  /&gt;Max length: 5 |  [optional] |
|**payType** | **String** | Employee pay type (rate code). Valid values are *Hourly* or *Salary*. &lt;br  /&gt;Max length: 10 |  [optional] |
|**primaryPayRateEffectiveDate** | **String** | The date the employee’s pay rate takes effect. (MM-DD-CCYY) |  [optional] |
|**salary** | **Double** | Employee gross salary per pay period used with payType Salary.&lt;br  /&gt;Decimal (12,2) |  [optional] |



