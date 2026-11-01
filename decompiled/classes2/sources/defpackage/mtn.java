package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mtn {
    public final java.lang.String a;
    public final boolean b;
    public final java.lang.String c;
    public final boolean d;
    public final boolean e;

    public mtn(java.lang.String str, boolean z, java.lang.String str2, boolean z2, boolean z3) {
        aooh.f(str, "summary");
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.mtn) {
            defpackage.mtn mtnVar = (defpackage.mtn) obj;
            if (aooh.n(this.a, mtnVar.a) && this.b == mtnVar.b && aooh.n(this.c, mtnVar.c) && this.d == mtnVar.d && this.e == mtnVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.c;
        return ((((((iHashCode + anty.L(this.b)) * 31) + (str == null ? 0 : str.hashCode())) * 31) + anty.L(this.d)) * 31) + anty.L(this.e);
    }

    public final java.lang.String toString() {
        return "DobbyInCallSummaryUiModel(summary=" + this.a + ", isLowConfidence=" + this.b + ", titleText=" + this.c + ", useGeminiBranding=" + this.d + ", showEnergyShader=" + this.e + ')';
    }
}
