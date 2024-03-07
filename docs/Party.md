

# Party


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attorneyRepresentationType** | [**AttorneyRepresentationType**](AttorneyRepresentationType.md) |  |  |
|**contact** | [**Contact**](Contact.md) |  |  |
|**firstFetchDate** | **OffsetDateTime** | When was the party first fetched from the court site. |  |
|**firstName** | **String** | First name of the party. This is normalized by UniCourt. |  |
|**isVisible** | **Boolean** | Signifies if the party as this party type is currently isVisible or not for the case. |  |
|**lastFetchDate** | **OffsetDateTime** | When was the party last fetched from the court site. |  |
|**lastName** | **String** | Last name of the party. This is normalized by UniCourt. |  |
|**middleName** | **String** | Middle name of the party. This is normalized by UniCourt. |  |
|**name** | **String** | Name of the party as provided by Court. |  |
|**namePrefix** | **String** |  |  |
|**nameSuffix** | **String** |  |  |
|**_object** | **String** | Name of the object |  |
|**partyAttorneyAssociations** | [**PartyAttorneyAssociations**](PartyAttorneyAssociations.md) |  |  |
|**partyClassificationType** | [**PartyClassificationTypeEnum**](#PartyClassificationTypeEnum) | To know the type of an entity in a case, if it is an Individual, Company or Other. An entity to a case could be the parties, attorneys or judges involved. |  |
|**partyId** | **String** | ID for the party in this case. This ID is unique within a case and NOT across cases. If the same party were to appear in another case this ID would be different. |  |
|**partyRole** | [**PartyRole**](PartyRole.md) |  |  |
|**possibleNormPartyArray** | [**List&lt;PossibleNormParty&gt;**](PossibleNormParty.md) |  |  |
|**sourcePartyRole** | **String** | Party Type as provided by Court. |  |



## Enum: PartyClassificationTypeEnum

| Name | Value |
|---- | -----|
| INDIVIDUAL | &quot;INDIVIDUAL&quot; |
| COMPANY | &quot;COMPANY&quot; |
| OTHER | &quot;OTHER&quot; |



