

# ModelCase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attorneys** | [**Attorneys**](Attorneys.md) |  |  |
|**caseDocuments** | [**CaseDocuments**](CaseDocuments.md) |  |  |
|**caseId** | **String** | Unique identifier of Case. |  |
|**caseName** | **String** | Case name as provided by Court. |  |
|**caseNumber** | **String** | Case number as provided by Court. |  |
|**caseStats** | [**CaseStats**](CaseStats.md) |  |  |
|**caseStatus** | [**CaseStatus**](CaseStatus.md) |  |  |
|**caseType** | [**CaseType**](CaseType.md) |  |  |
|**causeOfActionArray** | [**List&lt;CaseCauseOfAction&gt;**](CaseCauseOfAction.md) | Array of cause of Actions that are added to this case. |  |
|**chargeArray** | [**List&lt;CaseCharge&gt;**](CaseCharge.md) | Array of charges that are added to this case. |  |
|**court** | [**Court**](Court.md) |  |  |
|**courtLocation** | [**CourtLocation**](CourtLocation.md) |  |  |
|**courtServiceStatusAPI** | **String** | API to get the service statuses of the given case. |  |
|**courtServiceStatusId** | **String** | Court Service Status ID of the requested case where we can use it to get the service status |  |
|**docketEntries** | [**DocketEntries**](DocketEntries.md) |  |  |
|**exportAPI** | **String** | When a case is beyond the threshold of entities we provide this link so that the user can request and get all the data of the case with one additional call. This data will be zipped and sent via a webhoook. |  |
|**filedDate** | **OffsetDateTime** | Filing date for the case provided by the Court. Formatted as YYYY-MM-DDTHH:MM:SS+ZZ:zz |  |
|**firstFetchDate** | **OffsetDateTime** | The date and time when the case was first fetched from the Court. This date and time is in UTC. Formatted as YYYY-MM-DDTHH:MM:SS+ZZ:zz,. |  |
|**hasDocumentsWithPreview** | **Boolean** | This field will be set to TRUE if atleast one document has a preview. |  |
|**hasOnlyMetaInfo** | **Boolean** | This field determines if this case object has only meta information. If the value is true and if the full information is required you would need to call the updateCase API. |  |
|**hearings** | [**Hearings**](Hearings.md) |  |  |
|**judges** | [**Judges**](Judges.md) |  |  |
|**lastFetchDate** | **OffsetDateTime** | The date and time when the case was last fetched from the Court. This date and time is in UTC. Formatted as YYYY-MM-DDTHH:MM:SS+ZZ:zz, Note: It is not necessary that every time the case is fetched from Court we find changes in the case information. It could be that we already have the latest information from the Court and no changes exist. |  |
|**lastFetchDateWithUpdates** | **OffsetDateTime** | The date and time when the case was last fetched from the Court where we found changes in the case information. This date and time is in UTC. Formatted as YYYY-MM-DDTHH:MM:SS+ZZ:zz, |  |
|**_object** | **String** | Name of the object |  |
|**participantsLastFetchDate** | **OffsetDateTime** | The date and time when parties/attorneys were last updated from the Court. Formatted as YYYY-MM-DDTHH:MM:SS+ZZ:zz, Note: This is currently applicable for Federal PACER cases since we have an option to exclude parties and fetch only latest docket entries when updating cases to save PACER fees. |  |
|**parties** | [**Parties**](Parties.md) |  |  |
|**relatedCases** | [**RelatedCases**](RelatedCases.md) |  |  |
|**sourceCaseData** | [**SourceCaseData**](SourceCaseData.md) |  |  |
|**sourceDataStatus** | [**SourceDataStatusEnum**](#SourceDataStatusEnum) | The status of source data of case. If the value of sourceDataStatus is SOURCE_DEPRECATED then it means that the Case has been migrated from old court site to a new court site and the data being shown in the API response is from a old court site. If the sourceDataStatus is NO_LONGER_AVAILABLE_IN_COURT then it means that a particular case is invalid in the court site. |  |
|**url** | **URI** | URL to the case page in UniCourt Application. |  |



## Enum: SourceDataStatusEnum

| Name | Value |
|---- | -----|
| NO_LONGER_AVAILABLE_IN_COURT | &quot;NO_LONGER_AVAILABLE_IN_COURT&quot; |
| SOURCE_DEPRECATED | &quot;SOURCE_DEPRECATED&quot; |
| NULL | &quot;null&quot; |



