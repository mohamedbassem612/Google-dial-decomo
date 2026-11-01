package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jwz {
    public static final aimz a = aimz.i("com/android/dialer/callintent/CallIntent");
    public final android.net.Uri b;
    public final defpackage.hue c;
    public final defpackage.jxb d;
    public final android.telecom.PhoneAccountHandle e;
    public final boolean f;
    public final java.lang.String g;
    public final aigf h;
    public final aigf i;
    public final aigf j;
    public final android.os.Bundle k;
    public final j$.util.Optional l;
    private final boolean m;
    private final j$.util.Optional n;
    private final int o;

    public jwz(android.net.Uri uri, defpackage.hue hueVar, defpackage.jxb jxbVar, android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z, int i, java.lang.String str, boolean z2, aigf aigfVar, aigf aigfVar2, aigf aigfVar3, android.os.Bundle bundle, j$.util.Optional optional, j$.util.Optional optional2) {
        this.b = uri;
        this.c = hueVar;
        this.d = jxbVar;
        this.e = phoneAccountHandle;
        this.f = z;
        this.o = i;
        this.g = str;
        this.m = z2;
        this.h = aigfVar;
        this.i = aigfVar2;
        this.j = aigfVar3;
        this.k = bundle;
        this.l = optional;
        this.n = optional2;
    }

    public static com.android.dialer.callintent.CallIntent$Builder a() {
        com.android.dialer.callintent.AutoValue_CallIntent$Builder autoValue_CallIntent$Builder = new com.android.dialer.callintent.AutoValue_CallIntent$Builder();
        autoValue_CallIntent$Builder.k = (byte) (autoValue_CallIntent$Builder.k | 1);
        autoValue_CallIntent$Builder.t(false);
        autoValue_CallIntent$Builder.p(false);
        autoValue_CallIntent$Builder.q(1);
        autoValue_CallIntent$Builder.v(j$.util.Optional.empty());
        return autoValue_CallIntent$Builder;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.hue hueVar;
        android.telecom.PhoneAccountHandle phoneAccountHandle;
        java.lang.String str;
        android.os.Bundle bundle;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.jwz) {
            defpackage.jwz jwzVar = (defpackage.jwz) obj;
            if (this.b.equals(jwzVar.b) && ((hueVar = this.c) != null ? hueVar.equals(jwzVar.c) : jwzVar.c == null) && this.d.equals(jwzVar.d) && ((phoneAccountHandle = this.e) != null ? phoneAccountHandle.equals(jwzVar.e) : jwzVar.e == null) && this.f == jwzVar.f) {
                int i = this.o;
                int i2 = jwzVar.o;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && ((str = this.g) != null ? str.equals(jwzVar.g) : jwzVar.g == null) && this.m == jwzVar.m && ahvr.aJ(this.h, jwzVar.h) && ahvr.aJ(this.i, jwzVar.i) && ahvr.aJ(this.j, jwzVar.j) && ((bundle = this.k) != null ? bundle.equals(jwzVar.k) : jwzVar.k == null) && this.l.equals(jwzVar.l) && this.n.equals(jwzVar.n)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() ^ 1000003;
        defpackage.hue hueVar = this.c;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (hueVar == null ? 0 : hueVar.hashCode())) * 1000003) ^ this.d.hashCode()) * 1000003;
        android.telecom.PhoneAccountHandle phoneAccountHandle = this.e;
        int iHashCode3 = (((((iHashCode2 ^ (phoneAccountHandle == null ? 0 : phoneAccountHandle.hashCode())) * 1000003) ^ 1237) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        int i = this.o;
        anty.aJ(i);
        int i2 = (iHashCode3 ^ i) * 1000003;
        java.lang.String str = this.g;
        int iHashCode4 = (((((((((i2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true == this.m ? 1231 : 1237)) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003;
        android.os.Bundle bundle = this.k;
        return ((((iHashCode4 ^ (bundle != null ? bundle.hashCode() : 0)) * (-721379959)) ^ this.l.hashCode()) * 1000003) ^ this.n.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String str;
        int i = this.o;
        android.telecom.PhoneAccountHandle phoneAccountHandle = this.e;
        defpackage.jxb jxbVar = this.d;
        defpackage.hue hueVar = this.c;
        java.lang.String strValueOf = java.lang.String.valueOf(this.b);
        java.lang.String strValueOf2 = java.lang.String.valueOf(hueVar);
        java.lang.String strValueOf3 = java.lang.String.valueOf(jxbVar);
        java.lang.String strValueOf4 = java.lang.String.valueOf(phoneAccountHandle);
        if (i == 1) {
            str = "UNKNOWN";
        } else if (i != 2) {
            str = i != 3 ? "null" : "NOT_BLOCKED";
        } else {
            str = "BLOCKED";
        }
        boolean z = this.f;
        java.lang.String str2 = this.g;
        boolean z2 = this.m;
        aigf aigfVar = this.h;
        aigf aigfVar2 = this.i;
        aigf aigfVar3 = this.j;
        android.os.Bundle bundle = this.k;
        j$.util.Optional optional = this.l;
        j$.util.Optional optional2 = this.n;
        return "CallIntent{number=" + strValueOf + ", assistedDialingExtras=" + strValueOf2 + ", callSpecificAppData=" + strValueOf3 + ", phoneAccountHandle=" + strValueOf4 + ", isEmergencyNumber=false, isVideoCall=" + z + ", blockedState=" + str + ", callSubject=" + str2 + ", allowAssistedDial=" + z2 + ", stringInCallUiIntentExtras=" + java.lang.String.valueOf(aigfVar) + ", longInCallUiIntentExtras=" + java.lang.String.valueOf(aigfVar2) + ", booleanInCallUiIntentExtras=" + java.lang.String.valueOf(aigfVar3) + ", externalInCallUiIntentExtras=" + java.lang.String.valueOf(bundle) + ", externalPlaceCallExtras=null, calleeId=" + java.lang.String.valueOf(optional) + ", outgoingCallRequestId=" + java.lang.String.valueOf(optional2) + '}';
    }

    public jwz() {
        throw null;
    }
}
