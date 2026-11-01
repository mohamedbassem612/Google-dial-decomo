package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wcr {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final defpackage.wcq d;
    public final defpackage.zjd e;

    public wcr(java.lang.String str, java.lang.String str2, java.lang.String str3, defpackage.wcq wcqVar, defpackage.zjd zjdVar) {
        aooh.f(str2, "notificationTitle");
        aooh.f(wcqVar, "notificationType");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = wcqVar;
        this.e = zjdVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.wcr) {
            defpackage.wcr wcrVar = (defpackage.wcr) obj;
            if (aooh.n(this.a, wcrVar.a) && aooh.n(this.b, wcrVar.b) && aooh.n(this.c, wcrVar.c) && this.d == wcrVar.d && aooh.n(this.e, wcrVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
        java.lang.String str2 = this.c;
        int iHashCode2 = ((((iHashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d.hashCode()) * 31;
        defpackage.zjd zjdVar = this.e;
        return iHashCode2 + (zjdVar != null ? zjdVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "SmartNotificationPhoneModel(phoneNumber=" + this.a + ", notificationTitle=" + this.b + ", notificationContent=" + this.c + ", notificationType=" + this.d + ", smartNotificationAssetMetadata=" + this.e + ')';
    }
}
