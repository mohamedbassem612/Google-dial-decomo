package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qxn {
    public final defpackage.qxl a;
    public final java.util.List b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    private final boolean f;

    public qxn(defpackage.qxl qxlVar, java.util.List list, boolean z, boolean z2, boolean z3, boolean z4) {
        aooh.f(qxlVar, "endCallUiData");
        aooh.f(list, "fixedButtonsUiData");
        this.a = qxlVar;
        this.b = list;
        this.f = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qxn) {
            defpackage.qxn qxnVar = (defpackage.qxn) obj;
            if (aooh.n(this.a, qxnVar.a) && aooh.n(this.b, qxnVar.b) && this.f == qxnVar.f && this.c == qxnVar.c && this.d == qxnVar.d && this.e == qxnVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        boolean z = this.e;
        boolean z2 = this.d;
        return (((((((iHashCode * 31) + anty.L(this.f)) * 31) + anty.L(this.c)) * 31) + anty.L(z2)) * 31) + anty.L(z);
    }

    public final java.lang.String toString() {
        return "MainButtonsUiData(endCallUiData=" + this.a + ", fixedButtonsUiData=" + this.b + ", isExpandableSheetVisible=" + this.f + ", isSmallSecondaryWindow=" + this.c + ", shouldShowButtonRow=" + this.d + ", useTwoColumnLayout=" + this.e + ')';
    }
}
