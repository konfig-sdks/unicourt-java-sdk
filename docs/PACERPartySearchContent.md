

# PACERPartySearchContent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | **String** | Name of the object |  |
|**pclCaseId** | **Integer** | Sequentially generated number that identifies the case. |  |
|**pclCaseNumber** | **Integer** | The sequence number of the case. |  |
|**pclCaseNumberFull** | **String** | Case Number. |  |
|**pclCaseOffice** | **String** | The divisional office in which the case was filed. |  |
|**pclCaseTitle** | **String** | Title of the case. |  |
|**pclCaseType** | **String** | Code that identifies the type of case. |  |
|**pclCaseYear** | **Integer** | The year in which the case falls. Could be two or four digit. |  |
|**pclCourtCase** | [**PACERCaseSearchContent**](PACERCaseSearchContent.md) |  |  |
|**pclCourtId** | **String** | The general geographical region or specific court district. The court ID is the abbreviation of the court location combined with the court type (dc or bk). Please refer the Appendix B |  |
|**pclDateFiled** | **String** | Filing date of the case. |  |
|**pclFirstName** | **String** | This parameter represents the first name of the case when it is present |  |
|**pclGeneration** | **String** | This parameter represents the generation of the case when it is present |  |
|**pclJurisdictionType** | [**PclJurisdictionTypeEnum**](#PclJurisdictionTypeEnum) | Link to case in the case management/electronic case files (CM/ECF) system at the court. |  |
|**pclLastName** | **String** | This parameter represents the last name of the case when it is present |  |
|**pclMiddleName** | **String** | This parameter represents the middle name of the case when it is present |  |
|**pclPartyRole** | **String** | This parameter represents the party role of the case when it is present |  |
|**pclPartyType** | **String** | This parameter represents the party type of the case when it is present |  |



## Enum: PclJurisdictionTypeEnum

| Name | Value |
|---- | -----|
| APPELLATE | &quot;Appellate&quot; |
| BANKRUPTCY | &quot;Bankruptcy&quot; |
| CRIMINAL | &quot;Criminal&quot; |
| CIVIL | &quot;Civil&quot; |
| MULTI_DISTRICT_LITIGATION | &quot;Multi-district Litigation&quot; |



