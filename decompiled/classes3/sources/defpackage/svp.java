package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class svp {
    public final android.telecom.Call.Details a;
    public final long b;
    public final ajcq c;
    public final java.lang.String d;

    public svp(android.telecom.Call.Details details, long j, ajcq ajcqVar, java.lang.String str) {
        aooh.f(details, "callDetails");
        aooh.f(ajcqVar, "callDirection");
        this.a = details;
        this.b = j;
        this.c = ajcqVar;
        this.d = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.svp) {
            defpackage.svp svpVar = (defpackage.svp) obj;
            if (aooh.n(this.a, svpVar.a) && this.b == svpVar.b && aooh.n(this.c, svpVar.c) && aooh.n(this.d, svpVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + anty.M(this.b)) * 31) + this.c.hashCode();
        java.lang.String str = this.d;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final java.lang.String toString() {
        return "PrefetchedCallDetails(callDetails=" + this.a + ", callCreationTime=" + this.b + ", callDirection=" + this.c + ", callId=" + this.d + ')';
    }
}
