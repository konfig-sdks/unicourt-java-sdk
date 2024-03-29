

# CaseUpdatePacerOptions

Applicable for PACER cases.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**additionalPageArray** | [**List&lt;CaseUpdatePacerOptionsAdditionalPageArrayInner&gt;**](CaseUpdatePacerOptionsAdditionalPageArrayInner.md) | Currently this option is only applicable for Federal PACER cases. The default behavior of the Case Update is to fetch the Docket Report from PACER which includes the parties and attorneys too.  However if you need to fetch information for other pages in PACER you will need to specify it here. - associatedCases: &gt; This will fetch the Associated Cases page in PACER if available. This page consists of related cases especially applicable for Multi-District Litigation cases and Member Cases. Including this option will internally link all related cases in our system. Data from this page will be available via the Related Cases API. - caseSummary: &gt; This will fetch the Case Summary page in PACER if available. This page consists of additional case info which is not present in the Docket Report page. Data from this page will be structured and available as response in the Case API’s &#x60;&#x60;&#x60;additional_info&#x60;&#x60;&#x60; field. - listOfCreditors: &gt; This page will fetch the “List Of Creditors” page for PACER Bankruptcy cases of case type \&quot;bk\&quot;. Note that this page cannot be extracted for Bankruptcy cases of case type \&quot;ap\&quot; (Adversary Proceedings). This page consists of the Creditor information like the name and address of the Creditors. Data from this page will be structured and available as response in the Case API.  |  [optional] |
|**fetchParticipantsIfOlderThanDays** | **Integer** | **Currently this option is only applicable for Federal PACER cases. You can limit how often parties and attorneys for a PACER case are fetched to reduce your PACER fees. If you are tracking cases daily or hourly you could easily end up with a large PACER bill.**  **Use Case: Cases are typically updated to check for new docket entry filings. However every update to PACER case costs money. Participants for a case change less often than docket entry filings. So fetching participants for every update might result in unnecessary PACER costs; especially on cases which have a lot of parties and attorneys. So instead of getting charged the minimum cost of $0.10 for an update which might have had few docket entries, you could end up spending $3 for every update because there were a lot of parties for that case that were also fetched.**  **With this option you can choose when to fetch parties for case based on when was it last fetched.** You can limit how often this participants are fetched in a PACER case to keep your PACER costs under control.  Min days is 0 and Max days is 100.  Example: 1.  Specifying a value of 0 ensures that participants are fetched from PACER for this case update irrespective of when the participants were last fetched. 2.  Specifying a value of 30 ensures that participants are fetched from PACER for this case update only if the last fetch was older than 30 days.  |  [optional] |
|**pacerClientCode** | **String** | PACER Client Code. This is mandatory if your setting in PACER website is set to True for required client code. |  [optional] |
|**pacerUserId** | **String** | **Your PACER credentials username. This is mandatory when a PACER Case is being requested in the API. For Non PACER cases this is not mandatory. Suppose your request consists of Non PACER and PACER Cases then this needs to be passed becuase you are requesting a PACER case too.** |  |
|**refreshType** | [**RefreshTypeEnum**](#RefreshTypeEnum) | This flag determines whether to pull only new or pull all the docket entries for a PACER case being requested.  Only one of the two values is allowed: -   fetchNewDocketEntries:     &gt;   Updates the PACER case with only new docket entries that have been added after the previous update of the case being requested. -   fetchAllDocketEntries:     &gt;   Updates the PACER case by re-parsing all dockets from #1 till latest docket entry available.  |  [optional] |



## Enum: RefreshTypeEnum

| Name | Value |
|---- | -----|
| FETCHNEWDOCKETENTRIES | &quot;fetchNewDocketEntries&quot; |
| FETCHALLDOCKETENTRIES | &quot;fetchAllDocketEntries&quot; |



