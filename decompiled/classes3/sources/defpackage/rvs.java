package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rvs {
    public final aify a;
    public final defpackage.ruu b;
    private final boolean c;

    public rvs(aify aifyVar, defpackage.ruu ruuVar) {
        aooh.f(aifyVar, "prefDataList");
        this.a = aifyVar;
        this.b = ruuVar;
        this.c = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.rvs) {
            defpackage.rvs rvsVar = (defpackage.rvs) obj;
            if (aooh.n(this.a, rvsVar.a) && aooh.n(this.b, rvsVar.b)) {
                boolean z = rvsVar.c;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.ruu ruuVar = this.b;
        return ((iHashCode + (ruuVar == null ? 0 : ruuVar.hashCode())) * 31) + 1237;
    }

    public final java.lang.String toString() {
        return "DialerMainSettingsUiModel(prefDataList=" + this.a + ", bannerData=" + this.b + ", isAapmEnabled=false)";
    }
}
