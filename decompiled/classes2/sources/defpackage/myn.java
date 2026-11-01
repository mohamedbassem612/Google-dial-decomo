package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class myn {
    public final java.lang.String a;
    public final int b;
    public final java.lang.String c;
    public final boolean d;
    public final abwd e;
    public final java.lang.String f;
    public final wcq g;
    public final zjd h;

    public myn(java.lang.String str, int i, java.lang.String str2, boolean z, abwd abwdVar, java.lang.String str3, wcq wcqVar, zjd zjdVar) {
        aooh.f(abwdVar, "photoInfo");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = z;
        this.e = abwdVar;
        this.f = str3;
        this.g = wcqVar;
        this.h = zjdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.myn) {
            defpackage.myn mynVar = (defpackage.myn) obj;
            if (aooh.n(this.a, mynVar.a) && this.b == mynVar.b && aooh.n(this.c, mynVar.c) && this.d == mynVar.d && aooh.n(this.e, mynVar.e) && aooh.n(this.f, mynVar.f) && this.g == mynVar.g && aooh.n(this.h, mynVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.b;
        java.lang.String str2 = this.c;
        int iHashCode2 = (((((((iHashCode * 31) + i) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + anty.L(this.d)) * 31) + this.e.hashCode();
        java.lang.String str3 = this.f;
        int iHashCode3 = ((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31;
        wcq wcqVar = this.g;
        int iHashCode4 = (iHashCode3 + (wcqVar == null ? 0 : wcqVar.hashCode())) * 31;
        zjd zjdVar = this.h;
        return iHashCode4 + (zjdVar != null ? zjdVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "MissedCallNotificationContent(number=" + this.a + ", presentation=" + this.b + ", transcriptionSummary=" + this.c + ", isLowConfidence=" + this.d + ", photoInfo=" + this.e + ", uniqueCallId=" + this.f + ", syncedSmartNotificationPhoneFeatureType=" + this.g + ", smartNotificationAssetMetadata=" + this.h + ')';
    }
}
