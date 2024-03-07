

# CaseExportCallback


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callbackGeneratedDate** | **OffsetDateTime** | Date when the job is run. |  |
|**caseExportCallbackAPI** | **URI** |  |  |
|**caseExportCallbackId** | **String** | Unique Id for the Case Export Callback. |  |
|**caseId** | **String** | Unique Id for a Case in UniCourt. |  |
|**exception** | [**Exception**](Exception.md) |  |  |
|**_file** | [**ExportFile**](ExportFile.md) |  |  |
|**_object** | **String** | Name of the object. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the request. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| COMPLETE | &quot;COMPLETE&quot; |
| FAILURE | &quot;FAILURE&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |



