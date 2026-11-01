package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tdb {
    public final tcp a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final defpackage.tde e;
    public final boolean f;

    public tdb(tcp tcpVar, boolean z, boolean z2, boolean z3, defpackage.tde tdeVar, boolean z4) {
        this.a = tcpVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = tdeVar;
        this.f = z4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.tdb) {
            defpackage.tdb tdbVar = (defpackage.tdb) obj;
            if (this.a == tdbVar.a && this.b == tdbVar.b && this.c == tdbVar.c && this.d == tdbVar.d && this.e == tdbVar.e && this.f == tdbVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        defpackage.tde tdeVar = this.e;
        boolean z = this.d;
        return ((((((((iHashCode + anty.L(this.b)) * 31) + anty.L(this.c)) * 31) + anty.L(z)) * 31) + tdeVar.hashCode()) * 31) + anty.L(this.f);
    }

    public final java.lang.String toString() {
        return "AccessibilitySettingsModel(rttConfiguration=" + this.a + ", shouldShowHearingAidPreference=" + this.b + ", isHearingAidEnabled=" + this.c + ", shouldShowTtyPreference=" + this.d + ", ttyModeConfiguration=" + this.e + ", shouldHideHcoAndVco=" + this.f + ')';
    }
}
