

# DocketEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**boundary** | [**BoundaryEnum**](#BoundaryEnum) | Determines if it is the first docket entry or the last docket entry. This value will be set only for the first and last docket entry. For other docket entries it will be null. However, this will be set as single_docket_entry when the Case contains only one docket entry. |  |
|**docketBadge** | [**DocketBadgeEnum**](#DocketBadgeEnum) | Docket Badge helps you to know what type of a docket entry it is. |  |
|**docketEntryDate** | **OffsetDateTime** | Docket Action Date |  |
|**docketEntryPrimaryDocuments** | [**DocketEntryPrimaryDocuments**](DocketEntryPrimaryDocuments.md) |  |  |
|**docketEntrySecondaryDocuments** | [**DocketEntrySecondaryDocuments**](DocketEntrySecondaryDocuments.md) |  |  |
|**docketNumber** | **Integer** | The respective docket entry number which is defined in the court website. |  |
|**lastFetchDate** | **String** | When this docket entry was last fetched from the source. |  |
|**_object** | **String** | Name of the object |  |
|**referencedDocketNumberArray** | [**List&lt;ReferencedDocketNumber&gt;**](ReferencedDocketNumber.md) | Other Docket Numbers that referenced for a particular docket entry. |  |
|**sortOrder** | **Integer** | Order number how the dockets have stored in UniCourt. |  |
|**text** | **String** | Source Docket Entry |  |
|**textStructured** | [**SourceStructuredData**](SourceStructuredData.md) |  |  |



## Enum: BoundaryEnum

| Name | Value |
|---- | -----|
| FIRST | &quot;first&quot; |
| LAST | &quot;last&quot; |
| SINGLE_DOCKET_ENTRY | &quot;single_docket_entry&quot; |
| NULL | &quot;null&quot; |



## Enum: DocketBadgeEnum

| Name | Value |
|---- | -----|
| DOCKET | &quot;DOCKET&quot; |
| CHARGE | &quot;CHARGE&quot; |
| HEARING | &quot;HEARING&quot; |
| JUDGEMENT | &quot;JUDGEMENT&quot; |
| FINANCIAL | &quot;FINANCIAL&quot; |
| DISPOSITION | &quot;DISPOSITION&quot; |
| SENTENCE | &quot;SENTENCE&quot; |
| BOND | &quot;BOND&quot; |
| BAIL | &quot;BAIL&quot; |
| CAUSE_OF_ACTION | &quot;CAUSE_OF_ACTION&quot; |
| ARREST | &quot;ARREST&quot; |
| WARRANT | &quot;WARRANT&quot; |
| SUMMON | &quot;SUMMON&quot; |
| TICKLER | &quot;TICKLER&quot; |
| OPINION | &quot;OPINION&quot; |



