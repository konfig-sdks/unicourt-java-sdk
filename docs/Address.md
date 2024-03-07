

# Address

Address object Data Schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**city** | **String** | City |  |
|**countryCode** | **String** | ISO 3166-1 alpha-3 (https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3#Officially_assigned_code_elements). Code of the country if country name is present. |  |
|**countryName** | **String** | Country Name if present else default value. |  |
|**firstFetchDate** | **OffsetDateTime** | Date at which this record is created in UniCourt. |  |
|**isVisible** | **Boolean** | Boolean indicating if the address is visible or not. |  |
|**lastFetchDate** | **OffsetDateTime** | Date at which this record was updated in UniCourt. |  |
|**latitude** | **Double** | Coordinates at geographic coordinate system. |  |
|**longitude** | **Double** | Coordinates at geographic coordinate system. |  |
|**_object** | **String** |  |  |
|**stateCode** | **String** | State Code if the state is a US state else contains null. |  |
|**stateName** | **String** | State Name if present else default value. |  |
|**streetAddress1** | **String** | 1st part of the street address. |  |
|**streetAddress2** | **String** | 2nd part of the street address. |  |
|**zip** | **String** | Zip code of the address. |  |
|**zip4** | **String** | 4 digit extension of the zip code if the address is a US address. |  |



