

# PACERCaseSearchContent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_object** | **String** | Name of the object |  |
|**pclBankruptcyChapter** | **String** | This parameter represents the bankruptcy chapter of the case when it is present |  |
|**pclCaseId** | **Integer** | Sequentially generated number that identifies the case. |  |
|**pclCaseLink** | **String** | Link to case in the case management/electronic case files (CM/ECF) system at the court. |  |
|**pclCaseNumber** | **Integer** | The sequence number of the case. |  |
|**pclCaseNumberFull** | **String** | Case Number. |  |
|**pclCaseOffice** | **String** | The divisional office in which the case was filed. |  |
|**pclCaseTitle** | **String** | Title of the case. |  |
|**pclCaseType** | **String** | Code that identifies the type of case. |  |
|**pclCaseYear** | **Integer** | The year in which the case falls. Could be two or four digit. |  |
|**pclCivilCtoNumber** | **String** | This parameter represents the civil cto number of the case when it is present |  |
|**pclCivilDateDisposition** | **String** | This parameter represents the civil disposition date of the case when it is present |  |
|**pclCivilDateInitiated** | **String** | This parameter represents the civil initiated date of the case when it is present |  |
|**pclCivilDateTerminated** | **String** | This parameter represents the civil terminated date of the case when it is present |  |
|**pclCivilStatDisposition** | **String** | This parameter represents the civil stat disposition of the case when it is present |  |
|**pclCivilStatInitiated** | **String** | This parameter represents the civil stat initiated of the case when it is present |  |
|**pclCivilStatTerminated** | **String** | This parameter represents the civil stat terminated of the case when it is present |  |
|**pclCivilTransferee** | **String** | This parameter represents the civil transferee of the case when it is present |  |
|**pclCourtId** | **String** | The general geographical region or specific court district. The court ID is the abbreviation of the court location combined with the court type (dc or bk). Please refer the Appendix B |  |
|**pclDateDischarged** | **String** | This parameter represents the date discharged of the case when it is present |  |
|**pclDateDismissed** | **String** | This parameter represents the date dismissed of the case when it is present |  |
|**pclDateFiled** | **String** | Filing date of the case. |  |
|**pclDateReopened** | **String** | This parameter represents the date reopened of the case when it is present |  |
|**pclDateTermed** | **String** | This parameter represents the date termed of the case when it is present |  |
|**pclDisposition** | **String** | This parameter represents the disposition of the case when it is present |  |
|**pclDispositionMethod** | **String** | This parameter represents the disposition method of the case when it is present |  |
|**pclJointBankruptcyFlag** | **String** | This parameter represents the joint bankruptcy flag of the case when it is present |  |
|**pclJointDischargedDate** | **String** | This parameter represents the joint discharged date of the case when it is present |  |
|**pclJointDismissedDate** | **String** | This parameter represents the joint dismissed date of the case when it is present |  |
|**pclJointDispositionMethod** | **String** | This parameter represents the joint disposition method of the case when it is present |  |
|**pclJpmlNumber** | **Integer** | JPML Case Seed number. |  |
|**pclJurisdictionType** | [**PclJurisdictionTypeEnum**](#PclJurisdictionTypeEnum) | Link to case in the case management/electronic case files (CM/ECF) system at the court. |  |
|**pclMdlCourtId** | **String** | Which court does this mdl belongs too. |  |
|**pclMdlDateOrdered** | **String** | This parameter represents the mdl date ordered of the case when it is present |  |
|**pclMdlDateReceived** | **String** | This parameter represents the mdl date received of the case when it is present |  |
|**pclMdlExtension** | **String** | This parameter represents the mdl extension of the case when it is present |  |
|**pclMdlJudgeLastName** | **String** | This parameter represents the mdl judge lastname of the case when it is present |  |
|**pclMdlLittype** | **String** | This parameter represents the mdl lit type of the case when it is present |  |
|**pclMdlStatus** | **String** | This parameter represents the mdl status of the case when it is present |  |
|**pclMdlTransferee** | **String** | This parameter represents the mdl transferee of the case when it is present |  |
|**pclMdlTransfereeDistrict** | **String** | This parameter represents the mdl transferee district of the case when it is present |  |
|**pclNatureOfSuit** | **String** | This parameter represents the nature of suit of the case when it is present |  |



## Enum: PclJurisdictionTypeEnum

| Name | Value |
|---- | -----|
| APPELLATE | &quot;Appellate&quot; |
| BANKRUPTCY | &quot;Bankruptcy&quot; |
| CRIMINAL | &quot;Criminal&quot; |
| CIVIL | &quot;Civil&quot; |
| MULTI_DISTRICT_LITIGATION | &quot;Multi-district Litigation&quot; |



