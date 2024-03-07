package com.konfigthis.client;

import com.konfigthis.client.api.AttorneyAnalyticsApiApi;
import com.konfigthis.client.api.AuthenticationApiApi;
import com.konfigthis.client.api.CallbackApiApi;
import com.konfigthis.client.api.CaseAnalyticsApiApi;
import com.konfigthis.client.api.CaseDocketApiApi;
import com.konfigthis.client.api.CaseDocumentsApiApi;
import com.konfigthis.client.api.CaseExportApiApi;
import com.konfigthis.client.api.CaseSearchApiApi;
import com.konfigthis.client.api.CaseTrackingApiApi;
import com.konfigthis.client.api.CaseUpdateApiApi;
import com.konfigthis.client.api.CourtAvailabilityApiApi;
import com.konfigthis.client.api.CourtStandardsApiApi;
import com.konfigthis.client.api.JudgeAnalyticsApiApi;
import com.konfigthis.client.api.LawFirmAnalyticsApiApi;
import com.konfigthis.client.api.PacerApiApi;
import com.konfigthis.client.api.PacerCredentialApiApi;
import com.konfigthis.client.api.PartyAnalyticsApiApi;
import com.konfigthis.client.api.UsageApiApi;

public class UniCourt {
    private ApiClient apiClient;
    public final AttorneyAnalyticsApiApi attorneyAnalyticsApi;
    public final AuthenticationApiApi authenticationApi;
    public final CallbackApiApi callbackApi;
    public final CaseAnalyticsApiApi caseAnalyticsApi;
    public final CaseDocketApiApi caseDocketApi;
    public final CaseDocumentsApiApi caseDocumentsApi;
    public final CaseExportApiApi caseExportApi;
    public final CaseSearchApiApi caseSearchApi;
    public final CaseTrackingApiApi caseTrackingApi;
    public final CaseUpdateApiApi caseUpdateApi;
    public final CourtAvailabilityApiApi courtAvailabilityApi;
    public final CourtStandardsApiApi courtStandardsApi;
    public final JudgeAnalyticsApiApi judgeAnalyticsApi;
    public final LawFirmAnalyticsApiApi lawFirmAnalyticsApi;
    public final PacerApiApi pacerApi;
    public final PacerCredentialApiApi pacerCredentialApi;
    public final PartyAnalyticsApiApi partyAnalyticsApi;
    public final UsageApiApi usageApi;

    public UniCourt() {
        this(null);
    }

    public UniCourt(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.attorneyAnalyticsApi = new AttorneyAnalyticsApiApi(this.apiClient);
        this.authenticationApi = new AuthenticationApiApi(this.apiClient);
        this.callbackApi = new CallbackApiApi(this.apiClient);
        this.caseAnalyticsApi = new CaseAnalyticsApiApi(this.apiClient);
        this.caseDocketApi = new CaseDocketApiApi(this.apiClient);
        this.caseDocumentsApi = new CaseDocumentsApiApi(this.apiClient);
        this.caseExportApi = new CaseExportApiApi(this.apiClient);
        this.caseSearchApi = new CaseSearchApiApi(this.apiClient);
        this.caseTrackingApi = new CaseTrackingApiApi(this.apiClient);
        this.caseUpdateApi = new CaseUpdateApiApi(this.apiClient);
        this.courtAvailabilityApi = new CourtAvailabilityApiApi(this.apiClient);
        this.courtStandardsApi = new CourtStandardsApiApi(this.apiClient);
        this.judgeAnalyticsApi = new JudgeAnalyticsApiApi(this.apiClient);
        this.lawFirmAnalyticsApi = new LawFirmAnalyticsApiApi(this.apiClient);
        this.pacerApi = new PacerApiApi(this.apiClient);
        this.pacerCredentialApi = new PacerCredentialApiApi(this.apiClient);
        this.partyAnalyticsApi = new PartyAnalyticsApiApi(this.apiClient);
        this.usageApi = new UsageApiApi(this.apiClient);
    }

}
