package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class oco {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;

    public oco(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.oco) {
            defpackage.oco ocoVar = (defpackage.oco) obj;
            if (aooh.n(this.a, ocoVar.a) && aooh.n(this.b, ocoVar.b) && aooh.n(this.c, ocoVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "SatelliteTelephonyConstants(displayEmergencyMessageEvent=" + this.a + ", handoverTypeKey=" + this.b + ", launchIntentKey=" + this.c + ')';
    }
}
