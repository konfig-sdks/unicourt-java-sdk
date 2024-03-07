

# Phone

Phone object data schema.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstFetchDate** | **OffsetDateTime** | Date at which this record is created in UniCourt. |  |
|**isVisible** | **Boolean** | Boolean indicating if the phone is visible or not. |  |
|**lastFetchDate** | **OffsetDateTime** | Date at which this record was updated in UniCourt. |  |
|**_object** | **String** |  |  |
|**phoneNumber** | **String** | Phone Number |  |
|**phoneType** | [**PhoneTypeEnum**](#PhoneTypeEnum) | Resolved phone type (ideally from master data). |  |



## Enum: PhoneTypeEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;DEFAULT&quot; |
| OFFICE | &quot;OFFICE&quot; |
| FAX | &quot;FAX&quot; |
| PHONE | &quot;PHONE&quot; |



