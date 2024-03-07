

# BarRecord

This contains the Attorney details that is obtained from the State Bar where the attorney is registered.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**admittedDate** | **OffsetDateTime** | The admittedDate is the date when an attorney was admitted to the bar of a given state. |  |
|**barNumber** | **String** |  |  |
|**barSourceData** | [**BarSourceData**](BarSourceData.md) |  |  |
|**barSourceType** | **String** |  |  |
|**contact** | [**Contact**](Contact.md) |  |  |
|**firstFetchDate** | **OffsetDateTime** |  |  |
|**inactivationDate** | **OffsetDateTime** |  |  |
|**lastFetchDate** | **OffsetDateTime** |  |  |
|**lastFetchDateWithUpdates** | **OffsetDateTime** | Last Fetch Date of the Attorney Update. |  |
|**_object** | **String** |  |  |
|**stateCode** | **String** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;Active&quot; |
| INACTIVE | &quot;Inactive&quot; |
| NOT_CLASSIFIED | &quot;Not Classified&quot; |
| UNKNOWN | &quot;Unknown&quot; |



