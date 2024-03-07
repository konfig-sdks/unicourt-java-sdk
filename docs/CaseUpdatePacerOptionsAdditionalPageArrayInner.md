

# CaseUpdatePacerOptionsAdditionalPageArrayInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fetchIfOlderThanDays** | **Integer** | You can limit how often this page information is fetched to reduce your PACER fees.  Min days is 0 and Max days is 100.  Example: 1.  Specifying a value of 0 ensures that this page is fetched from PACER for this case update irrespective of when the page was last fetched. 2.  Specifying a value of 30 ensures that this page is fetched from PACER for this case update only if the last fetch was older than 30 days.  |  [optional] |
|**page** | [**PageEnum**](#PageEnum) |  |  [optional] |



## Enum: PageEnum

| Name | Value |
|---- | -----|
| ASSOCIATEDCASES | &quot;associatedCases&quot; |
| CASESUMMARY | &quot;caseSummary&quot; |
| LISTOFCREDITORS | &quot;listOfCreditors&quot; |



