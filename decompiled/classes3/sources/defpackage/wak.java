package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wak {
    public final boolean a;
    public final amrs b;

    public wak(boolean z, amrs amrsVar) {
        aooh.f(amrsVar, "tetheredDialerWearMetrics");
        this.a = z;
        this.b = amrsVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.wak) {
            defpackage.wak wakVar = (defpackage.wak) obj;
            if (this.a == wakVar.a && aooh.n(this.b, wakVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (anty.L(this.a) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "WearMetricsInformation(isLoggingConsentGranted=" + this.a + ", tetheredDialerWearMetrics=" + this.b + ')';
    }
}
