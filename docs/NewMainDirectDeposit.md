

# NewMainDirectDeposit


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountType** | **String** | Account type. Valid values are *C* (Checking), *S* (Saving), *P* (Pay Card). &lt;br   /&gt;Max length: 1&lt;br /&gt;&lt;small&gt;new with Web Link 16.6 release&lt;/small&gt; |  [optional] |
|**routingNumber** | **String** | ABA Transit Routing Number, entered without dashes or spaces. &lt;br  /&gt;Max length: 9&lt;br /&gt;&lt;small&gt;new with Web Link 16.6 release&lt;/small&gt; |  [optional] |
|**accountNumber** | **String** | Account number, entered without special characters and spaces. &lt;br  /&gt;Max length: 17&lt;br /&gt;&lt;small&gt;new with Web Link 16.6 release&lt;/small&gt; |  [optional] |
|**blockSpecial** | **Boolean** | Indicates if direct deposit should be blocked when special check types such as Bonus are processed.&lt;br /&gt;&lt;small&gt;new with Web Link 16.6 release&lt;/small&gt; |  [optional] |
|**nameOnAccount** | **String** | Name on the bank account. Defaults to employee&#39;s name. &lt;br  /&gt;Max length: 30&lt;br /&gt;&lt;small&gt;new with Web Link 16.6 release&lt;/small&gt; |  [optional] |
|**skipPreNote** | **Boolean** | Indicates if account will not pre-note.&lt;br /&gt;&lt;small&gt;new with Web Link 16.6 release&lt;/small&gt; |  [optional] |
|**preNoteDate** | **LocalDate** | Date to end the pre-note of the account. Common formats are *MM-DD-CCYY, CCYY-MM-DD*.&lt;br /&gt;&lt;small&gt;new with Web Link 16.6 release&lt;/small&gt; |  [optional] |



