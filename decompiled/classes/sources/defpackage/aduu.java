package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aduu {
    public final java.lang.String a;
    public final java.lang.String b;
    public final defpackage.adut c;
    public final java.lang.String d;
    public final long e;
    public final java.lang.String f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final defpackage.adur k;
    public final int l;
    private final java.lang.String m;
    private final defpackage.aigf n;

    public aduu(java.lang.String str, java.lang.String str2, defpackage.adut adutVar, java.lang.String str3, long j, java.lang.String str4, java.lang.String str5, boolean z, int i, boolean z2, boolean z3, defpackage.aigf aigfVar, defpackage.adur adurVar) {
        this.a = str;
        this.b = str2;
        this.c = adutVar;
        this.d = str3;
        this.e = j;
        this.m = str4;
        this.f = str5;
        this.g = z;
        this.h = i;
        this.i = z2;
        this.j = z3;
        this.n = aigfVar;
        this.l = 1;
        this.k = adurVar;
    }

    public final boolean equals(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aduu) {
            defpackage.aduu aduuVar = (defpackage.aduu) obj;
            if (this.a.equals(aduuVar.a) && ((str = this.b) != null ? str.equals(aduuVar.b) : aduuVar.b == null) && this.c.equals(aduuVar.c) && this.d.equals(aduuVar.d) && this.e == aduuVar.e && ((str2 = this.m) != null ? str2.equals(aduuVar.m) : aduuVar.m == null) && ((str3 = this.f) != null ? str3.equals(aduuVar.f) : aduuVar.f == null) && this.g == aduuVar.g && this.h == aduuVar.h && this.i == aduuVar.i && this.j == aduuVar.j && defpackage.ahvr.aJ(this.n, aduuVar.n)) {
                int i = this.l;
                int i2 = aduuVar.l;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1 && this.k.equals(aduuVar.k)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        java.lang.String str = this.b;
        int iHashCode2 = ((((((((iHashCode * (-721379959)) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 583896283) ^ this.d.hashCode()) * 1000003) ^ ((int) this.e)) * 1000003;
        java.lang.String str2 = this.m;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        java.lang.String str3 = this.f;
        int iHashCode4 = (((((((((((((((((((((((iHashCode3 ^ (str3 != null ? str3.hashCode() : 0)) * 583896283) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.g ? 1237 : 1231)) * (-721379959)) ^ 1237) * 1000003) ^ this.h) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ this.n.hashCode()) * 1000003) ^ 1237) * 1000003;
        defpackage.anty.aJ(this.l);
        return ((((((((((iHashCode4 ^ 1) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final java.lang.String toString() {
        int i = this.l;
        defpackage.aigf aigfVar = this.n;
        java.lang.String strValueOf = java.lang.String.valueOf(this.c);
        java.lang.String strValueOf2 = java.lang.String.valueOf(aigfVar);
        java.lang.String str = i != 1 ? "null" : "REGISTRATION_API_UNSPECIFIED";
        boolean z = this.j;
        boolean z2 = this.i;
        int i2 = this.h;
        boolean z3 = this.g;
        java.lang.String str2 = this.f;
        java.lang.String str3 = this.m;
        long j = this.e;
        java.lang.String str4 = this.d;
        java.lang.String str5 = this.b;
        return "GnpConfig{clientId=" + this.a + ", selectionTokens=null, gcmSenderProjectId=" + str5 + ", defaultEnvironment=" + strValueOf + ", systemTrayNotificationConfig=null, inAppNotificationConfig=null, deviceName=" + str4 + ", registrationStalenessTimeMs=" + j + ", scheduledTaskService=" + str3 + ", apiKey=" + str2 + ", jobSchedulerAllowedIDsRange=null, firebaseOptions=null, disableEntrypoints=false, useDefaultFirebaseApp=false, useFirebaseReceiver=" + z3 + ", timeToLiveDays=null, enableEndToEndEncryption=false, periodRegistrationIntervalDays=" + i2 + ", enableGrowthKitIfExists=" + z2 + ", enableInAppPushFlow=" + z + ", allowedFromEmbargoedCountries=false, disableRestartReceiverManager=false, additionalRestartReceivers=" + strValueOf2 + ", firebaseInitializedByApp=false, registrationApi=" + str + ", removeNotVcnManagedCapability=false, expeditedJobs=" + java.lang.String.valueOf(this.k) + ", dropNonMatchingClientIds=false, logNonMatchingClientIds=false, additionalIsolatedInstance=false}";
    }

    public aduu() {
        throw null;
    }
}
