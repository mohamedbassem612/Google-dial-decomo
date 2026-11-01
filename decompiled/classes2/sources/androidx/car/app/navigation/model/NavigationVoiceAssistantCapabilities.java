package androidx.car.app.navigation.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class NavigationVoiceAssistantCapabilities {
    public static final int ACTION_ALLOW_AND_AVOID_FERRIES = 1;
    public static final int ACTION_ALLOW_AND_AVOID_HIGHWAYS = 2;
    public static final int ACTION_ALLOW_AND_AVOID_TOLLS = 3;
    public static final int ACTION_CLEAR_SEARCH_RESULTS = 4;
    public static final int ACTION_EXIT_NAVIGATION = 5;
    public static final int ACTION_FOLLOW_MODE = 6;
    public static final int ACTION_MUTE_AND_UNMUTE = 7;
    public static final int ACTION_ROUTE_OVERVIEW = 8;
    public static final int ACTION_SHOW_ALTERNATES = 9;
    public static final int ACTION_SHOW_DIRECTIONS_LIST = 10;
    public static final int ACTION_SHOW_SATELLITE = 11;
    public static final int ACTION_SHOW_TRAFFIC = 12;
    public static final int ACTION_UNDEFINED = 0;
    public static final int DISRUPTION_REPORT_CONSTRUCTION = 1;
    public static final int DISRUPTION_REPORT_CRASH = 2;
    public static final int DISRUPTION_REPORT_FLOODING = 3;
    public static final int DISRUPTION_REPORT_FOG = 4;
    public static final int DISRUPTION_REPORT_OBJECT_ON_ROAD = 5;
    public static final int DISRUPTION_REPORT_POLICE = 6;
    public static final int DISRUPTION_REPORT_POTHOLE = 7;
    public static final int DISRUPTION_REPORT_ROAD_CLOSURE = 8;
    public static final int DISRUPTION_REPORT_SNOW = 9;
    public static final int DISRUPTION_REPORT_TRAFFIC = 10;
    public static final int DISRUPTION_REPORT_UNDEFINED = 0;
    public static final int DISRUPTION_REPORT_VEHICLE = 11;
    private final boolean mIsVoiceAssistantConsentGranted;
    private final java.util.Set mSupportedActions;
    private final java.util.Set mSupportedDisruptions;

    private NavigationVoiceAssistantCapabilities(defpackage.aae aaeVar) {
        boolean z = aaeVar.a;
        this.mIsVoiceAssistantConsentGranted = false;
        java.lang.Object obj = aaeVar.b;
        this.mSupportedActions = j$.util.DesugarCollections.unmodifiableSet(new java.util.HashSet((java.util.Collection) null));
        java.lang.Object obj2 = aaeVar.c;
        this.mSupportedDisruptions = j$.util.DesugarCollections.unmodifiableSet(new java.util.HashSet((java.util.Collection) null));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.navigation.model.NavigationVoiceAssistantCapabilities) {
            androidx.car.app.navigation.model.NavigationVoiceAssistantCapabilities navigationVoiceAssistantCapabilities = (androidx.car.app.navigation.model.NavigationVoiceAssistantCapabilities) obj;
            if (this.mIsVoiceAssistantConsentGranted == navigationVoiceAssistantCapabilities.mIsVoiceAssistantConsentGranted && j$.util.Objects.equals(this.mSupportedActions, navigationVoiceAssistantCapabilities.mSupportedActions) && j$.util.Objects.equals(this.mSupportedDisruptions, navigationVoiceAssistantCapabilities.mSupportedDisruptions)) {
                return true;
            }
        }
        return false;
    }

    public java.util.Set getSupportedActions() {
        return this.mSupportedActions;
    }

    public java.util.Set getSupportedDisruptions() {
        return this.mSupportedDisruptions;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(this.mIsVoiceAssistantConsentGranted), this.mSupportedActions, this.mSupportedDisruptions});
    }

    public boolean isVoiceAssistantConsentGranted() {
        return this.mIsVoiceAssistantConsentGranted;
    }

    public java.lang.String toString() {
        return "NavigationVoiceAssistantCapabilities[ isVoiceAssistantConsentGranted: " + this.mIsVoiceAssistantConsentGranted + ", supportedActions: " + this.mSupportedActions + ", supportedDisruptions: " + this.mSupportedDisruptions + " ]";
    }

    private NavigationVoiceAssistantCapabilities() {
        this.mIsVoiceAssistantConsentGranted = false;
        this.mSupportedActions = java.util.Collections.EMPTY_SET;
        this.mSupportedDisruptions = java.util.Collections.EMPTY_SET;
    }

    /* synthetic */ NavigationVoiceAssistantCapabilities(defpackage.aae aaeVar, defpackage.aaf aafVar) {
        this(aaeVar);
    }
}
