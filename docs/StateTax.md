

# StateTax

The State Tax model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **Object** | State tax code.&lt;br  /&gt; Max length: 50 |  [optional] |
|**deductionsAmount** | **Double** | Box 4(b) on form W4 (year 2020 or later): Deductions amount. &lt;br  /&gt;Decimal (12,2) |  [optional] |
|**dependentsAmount** | **Double** | Box 3 on form W4 (year 2020 or later): Total dependents amount. &lt;br  /&gt;Decimal (12,2) |  [optional] |
|**exemptions** | **Object** | State tax exemptions value.&lt;br  /&gt;Decimal (12,2) |  [optional] |
|**exemptions2** | **Object** | State tax exemptions 2 value.&lt;br  /&gt;Decimal (12,2) |  [optional] |
|**filingStatus** | **Object** | Employee state tax filing status. Common values are *S* (Single), *M* (Married).&lt;br  /&gt;Max length: 50 |  [optional] |
|**higherRate** | **Boolean** | Box 2(c) on form W4 (year 2020 or later): Multiple Jobs or Spouse Works. &lt;br  /&gt;Boolean |  [optional] |
|**otherIncomeAmount** | **Double** | Box 4(a) on form W4 (year 2020 or later): Other income amount. &lt;br  /&gt;Decimal (12,2) |  [optional] |
|**percentage** | **Object** | State Tax percentage. &lt;br  /&gt;Decimal (12,2) |  [optional] |
|**specialCheckCalc** | **Object** | Supplemental check calculation code. Common values are *Blocked* (Taxes blocked on Supplemental checks), *Supp* (Use supplemental Tax Rate-Code). &lt;br  /&gt;Max length: 10 |  [optional] |
|**taxCalculationCode** | **Object** | Tax calculation code. Common values are *F* (Flat), *P* (Percentage), *FDFP* (Flat Dollar Amount plus Fixed Percentage). &lt;br  /&gt;Max length: 10 |  [optional] |
|**taxCode** | **Object** | State tax code.&lt;br  /&gt; Max length: 50 |  [optional] |
|**w4FormYear** | **Integer** | The state W4 form year &lt;br  /&gt;Integer |  [optional] |



