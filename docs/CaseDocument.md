

# CaseDocument


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Description of the document. |  |
|**addedToLibraryDate** | **String** | Date and time when the document was downloaded and added to the UniCourt Crowd Source Library. |  |
|**caseDocumentId** | **String** | UniCourt&#39;s Case Document ID. |  |
|**childDocumentIdArray** | **List&lt;String&gt;** | List of child document ID&#39;s if exists or else it will be an empty lsit. |  |
|**documentFiledDate** | **String** | Document Date when it was filed. The document date will be either explicitly provided byt the court or if the document is associatated to a docket entry then the document date will be of docket entry date. |  |
|**downloadAPI** | **String** | Link to either view the document if it is downloaded and already present in the UniCourt CrowdSourced Library. |  |
|**estimatedOrderDuration** | [**EstimatedOrderDurationEnum**](#EstimatedOrderDurationEnum) | Estimated duration of a Order. |  |
|**firstFetchDate** | **String** | Is the date when the document was first fetched from the court site. |  |
|**inLibrary** | **Boolean** | Determines if the document is present in the UniCourt Library or not. |  |
|**isPreviewAvailable** | **Boolean** | Determines if a preview is available for the case document. |  |
|**name** | **String** | Document name. |  |
|**_object** | **String** | Name of the object |  |
|**pages** | **Integer** | Total number of pages in the document. |  |
|**parentDocumentId** | **String** | Document ID which is the parent document for the current document. This will be null if the current document is a parent document. |  |
|**previewDocument** | [**PreviewDocument**](PreviewDocument.md) |  |  |
|**price** | **Double** | Price of the document. |  |
|**sortOrder** | **Integer** | Order of documents how it is being stored in UniCourt. |  |
|**sourceDataStatus** | [**SourceDataStatusEnum**](#SourceDataStatusEnum) | The status of source data of document. If the value of sourceDataStatus is SOURCE_DEPRECATED then it means that the Document has been migrated from old court site to a new court site and the data being shown in the API response is from a old court site. If the sourceDataStatus is NO_LONGER_AVAILABLE_IN_COURT then it means that a particular case is invalid in the court site. |  |



## Enum: EstimatedOrderDurationEnum

| Name | Value |
|---- | -----|
| ESTIMATEUNAVAILABLE | &quot;estimateUnavailable&quot; |
| WITHINMINUTES | &quot;withinMinutes&quot; |
| WITHINHOURS | &quot;withinHours&quot; |
| WITHINDAYS | &quot;withinDays&quot; |
| WITHINWEEKS | &quot;withinWeeks&quot; |



## Enum: SourceDataStatusEnum

| Name | Value |
|---- | -----|
| NO_LONGER_AVAILABLE_IN_COURT | &quot;NO_LONGER_AVAILABLE_IN_COURT&quot; |
| SOURCE_DEPRECATED | &quot;SOURCE_DEPRECATED&quot; |
| SEALED | &quot;SEALED&quot; |
| NULL | &quot;null&quot; |



