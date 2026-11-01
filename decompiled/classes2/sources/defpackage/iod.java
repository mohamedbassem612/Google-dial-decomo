package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class iod {
    public final java.lang.String a;
    public final java.lang.String b;
    private final java.lang.String c;

    public iod(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.iod) {
            defpackage.iod iodVar = (defpackage.iod) obj;
            if (aooh.n(this.a, iodVar.a) && aooh.n(this.b, iodVar.b) && aooh.n(this.c, iodVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "SatelliteTelephonyConstants(displayEmergencyMessageEvent=" + this.a + ", handoverTypeEventKey=" + this.b + ", launchIntentEventKey=" + this.c + ')';
    }
}
