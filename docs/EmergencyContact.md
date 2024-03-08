

# EmergencyContact

The emergency contact model

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address1** | **Object** | 1st address line. |  [optional] |
|**address2** | **Object** | 2nd address line. |  [optional] |
|**city** | **Object** | City. |  [optional] |
|**country** | **Object** | County. |  [optional] |
|**county** | **Object** | Country.  Must be a valid 3 character country code.  Common values are *USA* (United States), *CAN* (Canada). |  [optional] |
|**email** | **Object** | Contact email.  Must be valid email address format. |  [optional] |
|**firstName** | **Object** | Required. Contact first name. &lt;br  /&gt;Max length: 40 |  |
|**homePhone** | **Object** | Contact Home Phone.  Valid phone format  *(###) #######* or *######-####* or *### ### ####* or *##########* or, if international, starts with *+#*, only spaces and digits allowed. |  [optional] |
|**lastName** | **Object** | Required. Contact last name. &lt;br  /&gt;Max length: 40 |  |
|**mobilePhone** | **Object** | Contact Mobile Phone.  Valid phone format  *(###) #######* or *######-####* or *### ### ####* or *##########* or, if international, starts with *+#*, only spaces and digits allowed. |  [optional] |
|**notes** | **Object** | Notes. &lt;br  /&gt;Max length: 1000 |  [optional] |
|**pager** | **Object** | Contact Pager.  Valid phone format  *(###) #######* or *######-####* or *### ### ####* or *##########* or, if international, starts with *+#*, only spaces and digits allowed. |  [optional] |
|**primaryPhone** | **Object** | Required. Contact primary phone type.  Must match Company setup.  Valid  values are H (Home), M (Mobile), P (Pager), W (Work) |  [optional] |
|**priority** | **Object** | Required. Contact priority. Valid values are *P* (Primary) or *S* (Secondary). |  [optional] |
|**relationship** | **Object** | Required. Contact relationship.  Must match Company setup.  Common values are Spouse, Mother, Father. |  [optional] |
|**state** | **Object** | State or Province.  If U.S. address, must be valid 2 character state code.  Common values are *IL* (Illinois), *CA* (California). |  [optional] |
|**syncEmployeeInfo** | **Boolean** | Valid values are *true* or *false*. |  [optional] |
|**workExtension** | **Object** | Work Extension. |  [optional] |
|**workPhone** | **Object** | Contact Work Phone.  Valid phone format  *(###) #######* or *######-####* or *### ### ####* or *##########* or, if international, starts with *+#*, only spaces and digits allowed. |  [optional] |
|**zip** | **Object** | Postal code.  If U.S. address, must be a valid zip code. |  [optional] |



