

# CaseTrack


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_case** | [**ModelCase**](ModelCase.md) |  |  |
|**caseAPI** | **URI** |  |  |
|**caseId** | **String** | Unique Id for a Case in UniCourt. |  |
|**lastFetchDate** | **OffsetDateTime** | The date and time when the case was last fetched from the Court. This date and time is in UTC. Formatted as YYYY-MM-DDTHH:MM:SS+ZZ:zz, Note: It is not necessary that every time the case is fetched from Court we find changes in the case information. It could be that we already have the latest information from the Court and no changes exist. |  |
|**lastFetchDateWithUpdates** | **OffsetDateTime** | The date and time when the case was last fetched from the Court where we found changes in the case information. This date and time is in UTC. Formatted as YYYY-MM-DDTHH:MM:SS+ZZ:zz, |  |
|**lastTrackedDetails** | [**LastTrackedDetails**](LastTrackedDetails.md) |  |  |
|**_object** | **String** | Name of the object. |  |
|**pacerOptions** | [**CaseUpdatePacerOptionsResponse**](CaseUpdatePacerOptionsResponse.md) |  |  |
|**schedule** | [**Schedule**](Schedule.md) |  |  |



