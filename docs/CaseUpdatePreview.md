

# CaseUpdatePreview


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**caseAPI** | **URI** |  |  |
|**caseId** | **String** | Unique Id for a Case in UniCourt. |  |
|**exception** | [**Exception**](Exception.md) |  |  |
|**_object** | **String** | Name of the object. |  |
|**pacerOptions** | [**CaseUpdatePacerOptionsResponse**](CaseUpdatePacerOptionsResponse.md) |  |  |
|**requestedDate** | **OffsetDateTime** | The date and time when the case was last requested for update  |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the request. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETE | &quot;COMPLETE&quot; |
| FAILURE | &quot;FAILURE&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |



