package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class nxp {
    public final java.lang.String a;
    public final nwx b;
    public final long c;
    public final long d;

    public nxp(java.lang.String str, nwx nwxVar, long j, long j2) {
        defpackage.aooh.f(str, "normalizedPhoneNumber");
        defpackage.aooh.f(nwxVar, "meetReachability");
        this.a = str;
        this.b = nwxVar;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.nxp) {
            defpackage.nxp nxpVar = (defpackage.nxp) obj;
            if (defpackage.aooh.n(this.a, nxpVar.a) && this.b == nxpVar.b && this.c == nxpVar.c && this.d == nxpVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + defpackage.anty.M(this.c)) * 31) + defpackage.anty.M(this.d);
    }

    public final java.lang.String toString() {
        return "MeetReachabilityEntity(normalizedPhoneNumber=" + this.a + ", meetReachability=" + this.b + ", lastQueried=" + this.c + ", revision=" + this.d + ')';
    }
}
