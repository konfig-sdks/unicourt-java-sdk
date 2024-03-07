

# CaseDocumentOrderCallback


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callbackGeneratedDate** | **OffsetDateTime** | Date when the job is run. |  |
|**caseDocument** | [**CaseDocument**](CaseDocument.md) |  |  |
|**caseDocumentId** | **String** | UniCourt&#39;s Case Document ID. |  |
|**caseDocumentOrderCallbackAPI** | **URI** |  |  |
|**caseDocumentOrderCallbackId** | **String** | Unique Id for the Case Document Order Callback. |  |
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



