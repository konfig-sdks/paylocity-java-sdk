

# NewWorkEligibility


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**alienOrAdmissionDocumentNbr** | **String** | Employee USCIS or Admission Number. &lt;br  /&gt; Must be 7-10 characters and may begin with an &#39;A&#39; |  [optional] |
|**i9DateVerified** | **LocalDate** | The date Employee I9 was verified by the employer. Common formats are *MM-DD-CCYY, CCYY-MM-DD*. |  [optional] |
|**i9Notes** | **String** | Notes regarding employee&#39;s I9.&lt;br  /&gt; Max length: 4000 |  [optional] |
|**i9Verified** | **Boolean** | Indicates if employee I9 is verified. |  [optional] |
|**sSNDateVerified** | **LocalDate** | The date of employer verification of employee SSN. Common formats are *MM-DD-CCYY, CCYY-MM-DD*. |  [optional] |
|**sSNNotes** | **String** | Notes regarding employee&#39;s SSN.&lt;br  /&gt; Max length: 4000 |  [optional] |
|**sSNVerified** | **Boolean** | Indicates if employee SSN is verified. |  [optional] |
|**visaType** | **String** | Employee Visa type. Must match one of the system coded values.&lt;br  /&gt; Max length: 100 |  [optional] |
|**workAuthorization** | **String** | Employee work authorization. Must match one of the system coded values.&lt;br  /&gt; Max length: 100 |  [optional] |
|**workUntil** | **LocalDate** | End date of employee work eligibility. Common formats are *MM-DD-CCYY, CCYY-MM-DD*. |  [optional] |
|**attestedDate** | **LocalDate** | The date the I-9 Verification form was attested by Employer or Authorized representative. Common formats are *MM-DD-CCYY, CCYY-MM-DD*. |  [optional] |
|**i94AdmissionNumber** | **String** | Form I-94 admission number.&lt;br  /&gt; Must be 11 numeric characters. |  [optional] |
|**foreignPassportNumber** | **String** | Foreign Passport Number.&lt;br  /&gt; Max length: 50 |  [optional] |
|**countryOfIssuance** | **String** | If Foreign Passport number is provided, provide its country of issuance. Must match Paylocity setup.&lt;br  /&gt; Max length: 30 |  [optional] |



