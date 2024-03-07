/*
 * UniCourt Enterprise APIs
 * <button><a href=\"/enterpriseapi/download/UniCourt-Enterprise-API-Spec.yaml\" >Download UniCourt Enterprise APIs Specification</a></button> 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import java.time.OffsetDateTime;
import com.konfigthis.client.model.PACERImportCase;
import com.konfigthis.client.model.PCLCase;
import com.konfigthis.client.model.PCLParty;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PacerApiApi
 */
@Disabled
public class PacerApiApiTest {

    private static PacerApiApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new PacerApiApi(apiClient);
    }

    /**
     * Find PACER Case for a requested Case Number and Court.
     *
     * Import the specified case from PACER.    Workflow:     1.This API will return the Find Case results from the court site in a form of array of UniCourt Case Objects. These case objects will consists only Meta information of the case if not already present in the UniCourt Database.     2.To get the full updated case information one will have to request the caseUpdate API by passing the caseId.    Note:     1.Charges for Find Case in District, Bankruptcy and National Courts is free. Find case for Appeal Courts will be charged at minimum rate of $0.1. The fee charged by the court for find case can be found in the response of this API in the field courtFee.     2.The results of the search has less Meta information in case objects compared to the Meta information of cases found using the PCL search APIs.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importPacerCaseByCourtUsingCaseNumberGetTest() throws ApiException {
        String pacerUserId = null;
        String pacerClientCode = null;
        String caseNumber = null;
        String courtId = null;
        PACERImportCase response = api.importPacerCaseByCourtUsingCaseNumberGet(pacerUserId, pacerClientCode, caseNumber, courtId)
                .execute();
        // TODO: test validations
    }

    /**
     * PACER Case Locator Search API for All Courts.
     *
     * Search all courts within the PACER system for a particular case.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchAllCourtsCasesTest() throws ApiException {
        String pacerUserId = null;
        String pacerClientCode = null;
        String caseNumber = null;
        Integer pacerCaseId = null;
        String caseTitle = null;
        Integer caseOffice = null;
        Integer caseSequenceNumber = null;
        Integer caseYear = null;
        List<String> caseTypeArray = null;
        List<String> courtRegionIdArray = null;
        OffsetDateTime caseFiledStartDate = null;
        OffsetDateTime caseFiledEndDate = null;
        OffsetDateTime caseTerminatedStartDate = null;
        OffsetDateTime caseTerminatedEndDate = null;
        String sortParameterQuery = null;
        String caseStatus = null;
        Integer pageNumber = null;
        PCLCase response = api.searchAllCourtsCases(pacerUserId, pacerClientCode)
                .caseNumber(caseNumber)
                .pacerCaseId(pacerCaseId)
                .caseTitle(caseTitle)
                .caseOffice(caseOffice)
                .caseSequenceNumber(caseSequenceNumber)
                .caseYear(caseYear)
                .caseTypeArray(caseTypeArray)
                .courtRegionIdArray(courtRegionIdArray)
                .caseFiledStartDate(caseFiledStartDate)
                .caseFiledEndDate(caseFiledEndDate)
                .caseTerminatedStartDate(caseTerminatedStartDate)
                .caseTerminatedEndDate(caseTerminatedEndDate)
                .sortParameterQuery(sortParameterQuery)
                .caseStatus(caseStatus)
                .pageNumber(pageNumber)
                .execute();
        // TODO: test validations
    }

    /**
     * PACER Case Locator Search API for All Courts.
     *
     * Search for the specified party across all PACER case filings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchAllCourtsCases_0Test() throws ApiException {
        String pacerUserId = null;
        String pacerClientCode = null;
        String caseNumber = null;
        Integer pacerCaseId = null;
        String lastName = null;
        String firstName = null;
        String middleName = null;
        String generation = null;
        String partyType = null;
        Boolean partyExactNameMatch = null;
        List<String> partyRoleArray = null;
        String caseTitle = null;
        Integer caseOffice = null;
        Integer caseSequenceNumber = null;
        Integer caseYear = null;
        List<String> caseTypeArray = null;
        List<String> courtRegionIdArray = null;
        Integer caseYearFrom = null;
        Integer caseYearTo = null;
        OffsetDateTime caseFiledStartDate = null;
        OffsetDateTime caseFiledEndDate = null;
        OffsetDateTime caseTerminatedStartDate = null;
        OffsetDateTime caseTerminatedEndDate = null;
        String sortParameterQuery = null;
        String caseStatus = null;
        Integer pageNumber = null;
        PCLParty response = api.searchAllCourtsCases_0(pacerUserId, pacerClientCode)
                .caseNumber(caseNumber)
                .pacerCaseId(pacerCaseId)
                .lastName(lastName)
                .firstName(firstName)
                .middleName(middleName)
                .generation(generation)
                .partyType(partyType)
                .partyExactNameMatch(partyExactNameMatch)
                .partyRoleArray(partyRoleArray)
                .caseTitle(caseTitle)
                .caseOffice(caseOffice)
                .caseSequenceNumber(caseSequenceNumber)
                .caseYear(caseYear)
                .caseTypeArray(caseTypeArray)
                .courtRegionIdArray(courtRegionIdArray)
                .caseYearFrom(caseYearFrom)
                .caseYearTo(caseYearTo)
                .caseFiledStartDate(caseFiledStartDate)
                .caseFiledEndDate(caseFiledEndDate)
                .caseTerminatedStartDate(caseTerminatedStartDate)
                .caseTerminatedEndDate(caseTerminatedEndDate)
                .sortParameterQuery(sortParameterQuery)
                .caseStatus(caseStatus)
                .pageNumber(pageNumber)
                .execute();
        // TODO: test validations
    }

    /**
     * PACER Case Locator Search API for All Courts.
     *
     * Search for PACER cases filed in U.S. Courts of Appeals.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchAppealCourtsCasesTest() throws ApiException {
        String pacerUserId = null;
        String pacerClientCode = null;
        String caseNumber = null;
        Integer pacerCaseId = null;
        String caseTitle = null;
        Integer caseOffice = null;
        Integer caseSequenceNumber = null;
        Integer caseYear = null;
        List<String> caseTypeArray = null;
        List<String> natureOfSuitsArray = null;
        List<String> courtRegionIdArray = null;
        OffsetDateTime caseFiledStartDate = null;
        OffsetDateTime caseFiledEndDate = null;
        OffsetDateTime caseTerminatedStartDate = null;
        OffsetDateTime caseTerminatedEndDate = null;
        String sortParameterQuery = null;
        String caseStatus = null;
        Integer pageNumber = null;
        PCLCase response = api.searchAppealCourtsCases(pacerUserId, pacerClientCode)
                .caseNumber(caseNumber)
                .pacerCaseId(pacerCaseId)
                .caseTitle(caseTitle)
                .caseOffice(caseOffice)
                .caseSequenceNumber(caseSequenceNumber)
                .caseYear(caseYear)
                .caseTypeArray(caseTypeArray)
                .natureOfSuitsArray(natureOfSuitsArray)
                .courtRegionIdArray(courtRegionIdArray)
                .caseFiledStartDate(caseFiledStartDate)
                .caseFiledEndDate(caseFiledEndDate)
                .caseTerminatedStartDate(caseTerminatedStartDate)
                .caseTerminatedEndDate(caseTerminatedEndDate)
                .sortParameterQuery(sortParameterQuery)
                .caseStatus(caseStatus)
                .pageNumber(pageNumber)
                .execute();
        // TODO: test validations
    }

    /**
     * PACER Case Locator Search API for All Courts.
     *
     * Search for the specified party across all PACER appeals cases.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchAppealCourtsCases_0Test() throws ApiException {
        String pacerUserId = null;
        String pacerClientCode = null;
        String caseNumber = null;
        Integer pacerCaseId = null;
        String lastName = null;
        String firstName = null;
        String middleName = null;
        String generation = null;
        String partyType = null;
        Boolean partyExactNameMatch = null;
        List<String> partyRoleArray = null;
        String caseTitle = null;
        Integer caseOffice = null;
        Integer caseSequenceNumber = null;
        Integer caseYear = null;
        List<String> caseTypeArray = null;
        List<String> courtRegionIdArray = null;
        Integer caseYearFrom = null;
        Integer caseYearTo = null;
        OffsetDateTime caseFiledStartDate = null;
        OffsetDateTime caseFiledEndDate = null;
        OffsetDateTime caseTerminatedStartDate = null;
        OffsetDateTime caseTerminatedEndDate = null;
        String sortParameterQuery = null;
        String caseStatus = null;
        Integer pageNumber = null;
        PCLParty response = api.searchAppealCourtsCases_0(pacerUserId, pacerClientCode)
                .caseNumber(caseNumber)
                .pacerCaseId(pacerCaseId)
                .lastName(lastName)
                .firstName(firstName)
                .middleName(middleName)
                .generation(generation)
                .partyType(partyType)
                .partyExactNameMatch(partyExactNameMatch)
                .partyRoleArray(partyRoleArray)
                .caseTitle(caseTitle)
                .caseOffice(caseOffice)
                .caseSequenceNumber(caseSequenceNumber)
                .caseYear(caseYear)
                .caseTypeArray(caseTypeArray)
                .courtRegionIdArray(courtRegionIdArray)
                .caseYearFrom(caseYearFrom)
                .caseYearTo(caseYearTo)
                .caseFiledStartDate(caseFiledStartDate)
                .caseFiledEndDate(caseFiledEndDate)
                .caseTerminatedStartDate(caseTerminatedStartDate)
                .caseTerminatedEndDate(caseTerminatedEndDate)
                .sortParameterQuery(sortParameterQuery)
                .caseStatus(caseStatus)
                .pageNumber(pageNumber)
                .execute();
        // TODO: test validations
    }

    /**
     * PACER Case Locator Search API for Bankruptcy Courts.
     *
     * Search for PACER cases filed in U.S. Bankruptcy Courts.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchBankruptcyCasesTest() throws ApiException {
        String pacerUserId = null;
        String pacerClientCode = null;
        String caseNumber = null;
        Integer pacerCaseId = null;
        String caseTitle = null;
        Integer caseOffice = null;
        Integer caseSequenceNumber = null;
        Integer caseYear = null;
        List<String> caseTypeArray = null;
        List<String> federalBankruptcyChapterArray = null;
        List<String> courtRegionIdArray = null;
        OffsetDateTime caseFiledStartDate = null;
        OffsetDateTime caseFiledEndDate = null;
        OffsetDateTime caseTerminatedStartDate = null;
        OffsetDateTime caseTerminatedEndDate = null;
        OffsetDateTime caseDischargedStartDate = null;
        OffsetDateTime caseDischargedEndDate = null;
        OffsetDateTime caseDismissedStartDate = null;
        OffsetDateTime caseDismissedEndDate = null;
        String sortParameterQuery = null;
        String caseStatus = null;
        Integer pageNumber = null;
        PCLCase response = api.searchBankruptcyCases(pacerUserId, pacerClientCode)
                .caseNumber(caseNumber)
                .pacerCaseId(pacerCaseId)
                .caseTitle(caseTitle)
                .caseOffice(caseOffice)
                .caseSequenceNumber(caseSequenceNumber)
                .caseYear(caseYear)
                .caseTypeArray(caseTypeArray)
                .federalBankruptcyChapterArray(federalBankruptcyChapterArray)
                .courtRegionIdArray(courtRegionIdArray)
                .caseFiledStartDate(caseFiledStartDate)
                .caseFiledEndDate(caseFiledEndDate)
                .caseTerminatedStartDate(caseTerminatedStartDate)
                .caseTerminatedEndDate(caseTerminatedEndDate)
                .caseDischargedStartDate(caseDischargedStartDate)
                .caseDischargedEndDate(caseDischargedEndDate)
                .caseDismissedStartDate(caseDismissedStartDate)
                .caseDismissedEndDate(caseDismissedEndDate)
                .sortParameterQuery(sortParameterQuery)
                .caseStatus(caseStatus)
                .pageNumber(pageNumber)
                .execute();
        // TODO: test validations
    }

    /**
     * PACER Case Locator Search API for All Courts.
     *
     * Search for the specified party in PACER bankruptcy filings.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchBankruptcyCourtsTest() throws ApiException {
        String pacerUserId = null;
        String pacerClientCode = null;
        String caseNumber = null;
        Integer pacerCaseId = null;
        String lastName = null;
        String firstName = null;
        String middleName = null;
        String generation = null;
        String partyType = null;
        Boolean partyExactNameMatch = null;
        List<String> partyRoleArray = null;
        String caseTitle = null;
        Integer caseOffice = null;
        Integer caseSequenceNumber = null;
        Integer caseYear = null;
        List<String> caseTypeArray = null;
        List<String> courtRegionIdArray = null;
        Integer caseYearFrom = null;
        Integer caseYearTo = null;
        String ssnOrEin = null;
        String fourDigitSsn = null;
        OffsetDateTime caseFiledStartDate = null;
        OffsetDateTime caseFiledEndDate = null;
        OffsetDateTime caseTerminatedStartDate = null;
        OffsetDateTime caseTerminatedEndDate = null;
        OffsetDateTime caseDischargedStartDate = null;
        OffsetDateTime caseDischargedEndDate = null;
        OffsetDateTime caseDismissedStartDate = null;
        OffsetDateTime caseDismissedEndDate = null;
        String sortParameterQuery = null;
        String caseStatus = null;
        Integer pageNumber = null;
        PCLParty response = api.searchBankruptcyCourts(pacerUserId, pacerClientCode)
                .caseNumber(caseNumber)
                .pacerCaseId(pacerCaseId)
                .lastName(lastName)
                .firstName(firstName)
                .middleName(middleName)
                .generation(generation)
                .partyType(partyType)
                .partyExactNameMatch(partyExactNameMatch)
                .partyRoleArray(partyRoleArray)
                .caseTitle(caseTitle)
                .caseOffice(caseOffice)
                .caseSequenceNumber(caseSequenceNumber)
                .caseYear(caseYear)
                .caseTypeArray(caseTypeArray)
                .courtRegionIdArray(courtRegionIdArray)
                .caseYearFrom(caseYearFrom)
                .caseYearTo(caseYearTo)
                .ssnOrEin(ssnOrEin)
                .fourDigitSsn(fourDigitSsn)
                .caseFiledStartDate(caseFiledStartDate)
                .caseFiledEndDate(caseFiledEndDate)
                .caseTerminatedStartDate(caseTerminatedStartDate)
                .caseTerminatedEndDate(caseTerminatedEndDate)
                .caseDischargedStartDate(caseDischargedStartDate)
                .caseDischargedEndDate(caseDischargedEndDate)
                .caseDismissedStartDate(caseDismissedStartDate)
                .caseDismissedEndDate(caseDismissedEndDate)
                .sortParameterQuery(sortParameterQuery)
                .caseStatus(caseStatus)
                .pageNumber(pageNumber)
                .execute();
        // TODO: test validations
    }

    /**
     * PACER Case Locator Search API for All Courts.
     *
     * Search for civil cases filed in PACER.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchCivilCasesTest() throws ApiException {
        String pacerUserId = null;
        String pacerClientCode = null;
        String caseNumber = null;
        Integer pacerCaseId = null;
        String caseTitle = null;
        Integer caseOffice = null;
        Integer caseSequenceNumber = null;
        Integer caseYear = null;
        List<String> caseTypeArray = null;
        List<String> natureOfSuitsArray = null;
        List<String> courtRegionIdArray = null;
        OffsetDateTime caseFiledStartDate = null;
        OffsetDateTime caseFiledEndDate = null;
        OffsetDateTime caseTerminatedStartDate = null;
        OffsetDateTime caseTerminatedEndDate = null;
        String sortParameterQuery = null;
        String caseStatus = null;
        Integer pageNumber = null;
        PCLCase response = api.searchCivilCases(pacerUserId, pacerClientCode)
                .caseNumber(caseNumber)
                .pacerCaseId(pacerCaseId)
                .caseTitle(caseTitle)
                .caseOffice(caseOffice)
                .caseSequenceNumber(caseSequenceNumber)
                .caseYear(caseYear)
                .caseTypeArray(caseTypeArray)
                .natureOfSuitsArray(natureOfSuitsArray)
                .courtRegionIdArray(courtRegionIdArray)
                .caseFiledStartDate(caseFiledStartDate)
                .caseFiledEndDate(caseFiledEndDate)
                .caseTerminatedStartDate(caseTerminatedStartDate)
                .caseTerminatedEndDate(caseTerminatedEndDate)
                .sortParameterQuery(sortParameterQuery)
                .caseStatus(caseStatus)
                .pageNumber(pageNumber)
                .execute();
        // TODO: test validations
    }

    /**
     * PACER Case Locator Search API for All Courts.
     *
     * Search for the specified party in civil cases filed in PACER.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchCivilCasesInCourtsTest() throws ApiException {
        String pacerUserId = null;
        String pacerClientCode = null;
        String caseNumber = null;
        Integer pacerCaseId = null;
        String lastName = null;
        String firstName = null;
        String middleName = null;
        String generation = null;
        String partyType = null;
        Boolean partyExactNameMatch = null;
        List<String> partyRoleArray = null;
        String caseTitle = null;
        Integer caseOffice = null;
        Integer caseSequenceNumber = null;
        Integer caseYear = null;
        List<String> caseTypeArray = null;
        List<String> courtRegionIdArray = null;
        Integer caseYearFrom = null;
        Integer caseYearTo = null;
        OffsetDateTime caseFiledStartDate = null;
        OffsetDateTime caseFiledEndDate = null;
        OffsetDateTime caseTerminatedStartDate = null;
        OffsetDateTime caseTerminatedEndDate = null;
        String sortParameterQuery = null;
        String caseStatus = null;
        Integer pageNumber = null;
        PCLParty response = api.searchCivilCasesInCourts(pacerUserId, pacerClientCode)
                .caseNumber(caseNumber)
                .pacerCaseId(pacerCaseId)
                .lastName(lastName)
                .firstName(firstName)
                .middleName(middleName)
                .generation(generation)
                .partyType(partyType)
                .partyExactNameMatch(partyExactNameMatch)
                .partyRoleArray(partyRoleArray)
                .caseTitle(caseTitle)
                .caseOffice(caseOffice)
                .caseSequenceNumber(caseSequenceNumber)
                .caseYear(caseYear)
                .caseTypeArray(caseTypeArray)
                .courtRegionIdArray(courtRegionIdArray)
                .caseYearFrom(caseYearFrom)
                .caseYearTo(caseYearTo)
                .caseFiledStartDate(caseFiledStartDate)
                .caseFiledEndDate(caseFiledEndDate)
                .caseTerminatedStartDate(caseTerminatedStartDate)
                .caseTerminatedEndDate(caseTerminatedEndDate)
                .sortParameterQuery(sortParameterQuery)
                .caseStatus(caseStatus)
                .pageNumber(pageNumber)
                .execute();
        // TODO: test validations
    }

    /**
     * PACER Case Locator Search API for All Courts.
     *
     * Search for criminal cases in PACER.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchCriminalCasesTest() throws ApiException {
        String pacerUserId = null;
        String pacerClientCode = null;
        String caseNumber = null;
        Integer pacerCaseId = null;
        String caseTitle = null;
        Integer caseOffice = null;
        Integer caseSequenceNumber = null;
        Integer caseYear = null;
        List<String> caseTypeArray = null;
        List<String> courtRegionIdArray = null;
        OffsetDateTime caseFiledStartDate = null;
        OffsetDateTime caseFiledEndDate = null;
        OffsetDateTime caseTerminatedStartDate = null;
        OffsetDateTime caseTerminatedEndDate = null;
        String sortParameterQuery = null;
        String caseStatus = null;
        Integer pageNumber = null;
        PCLCase response = api.searchCriminalCases(pacerUserId, pacerClientCode)
                .caseNumber(caseNumber)
                .pacerCaseId(pacerCaseId)
                .caseTitle(caseTitle)
                .caseOffice(caseOffice)
                .caseSequenceNumber(caseSequenceNumber)
                .caseYear(caseYear)
                .caseTypeArray(caseTypeArray)
                .courtRegionIdArray(courtRegionIdArray)
                .caseFiledStartDate(caseFiledStartDate)
                .caseFiledEndDate(caseFiledEndDate)
                .caseTerminatedStartDate(caseTerminatedStartDate)
                .caseTerminatedEndDate(caseTerminatedEndDate)
                .sortParameterQuery(sortParameterQuery)
                .caseStatus(caseStatus)
                .pageNumber(pageNumber)
                .execute();
        // TODO: test validations
    }

    /**
     * PACER Case Locator Search API for All Courts.
     *
     * Search for the specified party in PACER criminal cases.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchCriminalCases_0Test() throws ApiException {
        String pacerUserId = null;
        String pacerClientCode = null;
        String caseNumber = null;
        Integer pacerCaseId = null;
        String lastName = null;
        String firstName = null;
        String middleName = null;
        String generation = null;
        String partyType = null;
        Boolean partyExactNameMatch = null;
        List<String> partyRoleArray = null;
        String caseTitle = null;
        Integer caseOffice = null;
        Integer caseSequenceNumber = null;
        Integer caseYear = null;
        List<String> caseTypeArray = null;
        List<String> courtRegionIdArray = null;
        Integer caseYearFrom = null;
        Integer caseYearTo = null;
        OffsetDateTime caseFiledStartDate = null;
        OffsetDateTime caseFiledEndDate = null;
        OffsetDateTime caseTerminatedStartDate = null;
        OffsetDateTime caseTerminatedEndDate = null;
        String sortParameterQuery = null;
        String caseStatus = null;
        Integer pageNumber = null;
        PCLParty response = api.searchCriminalCases_0(pacerUserId, pacerClientCode)
                .caseNumber(caseNumber)
                .pacerCaseId(pacerCaseId)
                .lastName(lastName)
                .firstName(firstName)
                .middleName(middleName)
                .generation(generation)
                .partyType(partyType)
                .partyExactNameMatch(partyExactNameMatch)
                .partyRoleArray(partyRoleArray)
                .caseTitle(caseTitle)
                .caseOffice(caseOffice)
                .caseSequenceNumber(caseSequenceNumber)
                .caseYear(caseYear)
                .caseTypeArray(caseTypeArray)
                .courtRegionIdArray(courtRegionIdArray)
                .caseYearFrom(caseYearFrom)
                .caseYearTo(caseYearTo)
                .caseFiledStartDate(caseFiledStartDate)
                .caseFiledEndDate(caseFiledEndDate)
                .caseTerminatedStartDate(caseTerminatedStartDate)
                .caseTerminatedEndDate(caseTerminatedEndDate)
                .sortParameterQuery(sortParameterQuery)
                .caseStatus(caseStatus)
                .pageNumber(pageNumber)
                .execute();
        // TODO: test validations
    }

    /**
     * PACER Case Locator Search API for All Courts.
     *
     * Search for multidistrict litigation in PACER.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchMultiDistrictCourtCasesTest() throws ApiException {
        String pacerUserId = null;
        String pacerClientCode = null;
        String caseNumber = null;
        Integer jpmlNumber = null;
        Integer pacerCaseId = null;
        String caseTitle = null;
        Integer caseOffice = null;
        Integer caseSequenceNumber = null;
        Integer caseYear = null;
        List<String> caseTypeArray = null;
        List<String> courtRegionIdArray = null;
        OffsetDateTime caseFiledStartDate = null;
        OffsetDateTime caseFiledEndDate = null;
        OffsetDateTime caseTerminatedStartDate = null;
        OffsetDateTime caseTerminatedEndDate = null;
        String sortParameterQuery = null;
        String caseStatus = null;
        Integer pageNumber = null;
        PCLCase response = api.searchMultiDistrictCourtCases(pacerUserId, pacerClientCode)
                .caseNumber(caseNumber)
                .jpmlNumber(jpmlNumber)
                .pacerCaseId(pacerCaseId)
                .caseTitle(caseTitle)
                .caseOffice(caseOffice)
                .caseSequenceNumber(caseSequenceNumber)
                .caseYear(caseYear)
                .caseTypeArray(caseTypeArray)
                .courtRegionIdArray(courtRegionIdArray)
                .caseFiledStartDate(caseFiledStartDate)
                .caseFiledEndDate(caseFiledEndDate)
                .caseTerminatedStartDate(caseTerminatedStartDate)
                .caseTerminatedEndDate(caseTerminatedEndDate)
                .sortParameterQuery(sortParameterQuery)
                .caseStatus(caseStatus)
                .pageNumber(pageNumber)
                .execute();
        // TODO: test validations
    }

    /**
     * PACER Case Locator Search API for All Courts.
     *
     * Search for the specified party in multidistrict litigation in PACER.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchMultiDistrictCourtCases_0Test() throws ApiException {
        String pacerUserId = null;
        String pacerClientCode = null;
        String caseNumber = null;
        Integer jpmlNumber = null;
        Integer pacerCaseId = null;
        String lastName = null;
        String firstName = null;
        String middleName = null;
        String generation = null;
        String partyType = null;
        Boolean partyExactNameMatch = null;
        List<String> partyRoleArray = null;
        String caseTitle = null;
        Integer caseOffice = null;
        Integer caseSequenceNumber = null;
        Integer caseYear = null;
        List<String> caseTypeArray = null;
        List<String> courtRegionIdArray = null;
        Integer caseYearFrom = null;
        Integer caseYearTo = null;
        OffsetDateTime caseFiledStartDate = null;
        OffsetDateTime caseFiledEndDate = null;
        OffsetDateTime caseTerminatedStartDate = null;
        OffsetDateTime caseTerminatedEndDate = null;
        String sortParameterQuery = null;
        String caseStatus = null;
        Integer pageNumber = null;
        PCLParty response = api.searchMultiDistrictCourtCases_0(pacerUserId, pacerClientCode)
                .caseNumber(caseNumber)
                .jpmlNumber(jpmlNumber)
                .pacerCaseId(pacerCaseId)
                .lastName(lastName)
                .firstName(firstName)
                .middleName(middleName)
                .generation(generation)
                .partyType(partyType)
                .partyExactNameMatch(partyExactNameMatch)
                .partyRoleArray(partyRoleArray)
                .caseTitle(caseTitle)
                .caseOffice(caseOffice)
                .caseSequenceNumber(caseSequenceNumber)
                .caseYear(caseYear)
                .caseTypeArray(caseTypeArray)
                .courtRegionIdArray(courtRegionIdArray)
                .caseYearFrom(caseYearFrom)
                .caseYearTo(caseYearTo)
                .caseFiledStartDate(caseFiledStartDate)
                .caseFiledEndDate(caseFiledEndDate)
                .caseTerminatedStartDate(caseTerminatedStartDate)
                .caseTerminatedEndDate(caseTerminatedEndDate)
                .sortParameterQuery(sortParameterQuery)
                .caseStatus(caseStatus)
                .pageNumber(pageNumber)
                .execute();
        // TODO: test validations
    }

}
