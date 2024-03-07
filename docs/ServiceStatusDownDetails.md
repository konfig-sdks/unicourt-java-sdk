

# ServiceStatusDownDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**details** | **String** | Details of the reason. |  |
|**eta** | **String** | Estimated Time this Service could be Up again for the use. |  |
|**_object** | **String** | Name of the object |  |
|**reason** | [**ReasonEnum**](#ReasonEnum) | This field determines the reason behind status being down. Following are the possible reason for the service to be down:   underMaintenance: It means that the site is under scheduled maintenance.   notIntegrated: When an court with specific case type is not integrated in UniCourt.   brokenIntegration: Due to some updates made to the court site our existing Integration has broken and will require a fix to be made to support this court again for a spcific case type category.   sourceMigrated: When a source is migrated from one site to another for a specific case type category. |  |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| UNDERMAINTENANCE | &quot;underMaintenance&quot; |
| NOTINTEGRATED | &quot;notIntegrated&quot; |
| BROKENINTEGRATION | &quot;brokenIntegration&quot; |
| SOURCEMIGRATED | &quot;sourceMigrated&quot; |



