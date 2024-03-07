

# Judge


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contact** | [**Contact**](Contact.md) |  |  |
|**firstFetchDate** | **OffsetDateTime** | When was the judge first fetched from the court site. |  |
|**firstName** | **String** | First name of the judge. This is normalized by UniCourt. |  |
|**isVisible** | **Boolean** | Signifies if the judge as this judge type is currently isVisible or not for the case. |  |
|**judgeId** | **String** | ID for the judge in this case. This ID is unique within a case and NOT across cases. If the same Judge were to appear in another case this ID would be different. |  |
|**judgeType** | [**JudgeType**](JudgeType.md) |  |  |
|**lastFetchDate** | **OffsetDateTime** | When was the judge last fetched from the court site. |  |
|**lastName** | **String** | Last name of the judge. This is normalized by UniCourt. |  |
|**middleName** | **String** | Middle name of the judge. This is normalized by UniCourt. |  |
|**name** | **String** | Name of the judge as provided by Court. |  |
|**namePrefix** | **String** |  |  |
|**nameSuffix** | **String** |  |  |
|**_object** | **String** | Name of the object |  |
|**possibleNormJudgeArray** | [**List&lt;PossibleNormJudge&gt;**](PossibleNormJudge.md) |  |  |
|**sourceJudgeType** | **String** |  |  |



