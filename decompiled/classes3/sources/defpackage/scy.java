package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class scy {
    public final java.lang.String a;
    public final defpackage.scx b;
    public final j$.time.Instant c;
    private final java.lang.String d;

    public scy(java.lang.String str, java.lang.String str2, defpackage.scx scxVar, j$.time.Instant instant) {
        aooh.f(str, "accountName");
        aooh.f(str2, "accountE164PhoneNumber");
        aooh.f(scxVar, "verificationStatus");
        aooh.f(instant, "timestamp");
        this.d = str;
        this.a = str2;
        this.b = scxVar;
        this.c = instant;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.scy) {
            defpackage.scy scyVar = (defpackage.scy) obj;
            if (aooh.n(this.d, scyVar.d) && aooh.n(this.a, scyVar.a) && this.b == scyVar.b && aooh.n(this.c, scyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.d.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "WhitePagesStorageData(accountName=" + this.d + ", accountE164PhoneNumber=" + this.a + ", verificationStatus=" + this.b + ", timestamp=" + this.c + ')';
    }
}
