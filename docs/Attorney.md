

# Attorney


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attorneyId** | **String** | ID for the attorney in this case. This ID is unique within a case and NOT across cases. If the same attorney were to appear in another case this ID would be different. |  |
|**attorneyLawFirmArray** | [**List&lt;AttorneyLawFirm&gt;**](AttorneyLawFirm.md) |  |  |
|**attorneyType** | [**AttorneyType**](AttorneyType.md) |  |  |
|**barNumber** | **String** | The bar enrollment number of an attorney. |  |
|**contact** | [**Contact**](Contact.md) |  |  |
|**firstFetchDate** | **OffsetDateTime** | When was the attorney first fetched from the court site. |  |
|**firstName** | **String** | First name of the attorney. This is normalized by UniCourt. |  |
|**isVisible** | **Boolean** | Signifies if the attorney as this attorney type is currently isVisible or not for the case. |  |
|**lastFetchDate** | **OffsetDateTime** | When was the attorney last fetched from the court site. |  |
|**lastName** | **String** | Last name of the attorney. This is normalized by UniCourt. |  |
|**middleName** | **String** | Middle name of the attorney. This is normalized by UniCourt. |  |
|**name** | **String** | Name of the attorney as provided by Court. |  |
|**namePrefix** | **String** |  |  |
|**nameSuffix** | **String** |  |  |
|**_object** | **String** | Name of the object |  |
|**partyAttorneyAssociations** | [**PartyAttorneyAssociations**](PartyAttorneyAssociations.md) |  |  |
|**partyRoleGroupIdArray** | **List&lt;String&gt;** | Party Role Group Id for a Attorney. |  |
|**partyRoleIdArray** | **List&lt;String&gt;** | Party Role Id for a Attorney. |  |
|**possibleNormAttorneyArray** | [**List&lt;PossibleNormAttorney&gt;**](PossibleNormAttorney.md) |  |  |
|**possibleNormLawFirmArray** | [**List&lt;PossibleNormLawFirm&gt;**](PossibleNormLawFirm.md) | Possible Norm Lawfirm array for a Attorney. |  |
|**sourceAttorneyType** | **String** | Attorney Type as provided by Court. |  |



