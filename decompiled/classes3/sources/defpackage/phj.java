package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class phj {
    public final android.telecom.Call.Details a;
    public final ajcq b;

    public phj(android.telecom.Call.Details details, ajcq ajcqVar) {
        aooh.f(details, "callDetails");
        aooh.f(ajcqVar, "direction");
        this.a = details;
        this.b = ajcqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.phj) {
            defpackage.phj phjVar = (defpackage.phj) obj;
            if (aooh.n(this.a, phjVar.a) && aooh.n(this.b, phjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "PhoneLookupParams(callDetails=" + this.a + ", direction=" + this.b + ')';
    }
}
