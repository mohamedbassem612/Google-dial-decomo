package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pbx {
    public final java.util.List a;
    public final aonj b;
    public final aomy c;
    public final aonj d;
    public final boolean e;

    public pbx(java.util.List list, aonj aonjVar, aomy aomyVar, aonj aonjVar2, boolean z) {
        aooh.f(list, "chips");
        aooh.f(aonjVar, "onChipClicked");
        aooh.f(aomyVar, "onRowRendered");
        aooh.f(aonjVar2, "onChipRendered");
        this.a = list;
        this.b = aonjVar;
        this.c = aomyVar;
        this.d = aonjVar2;
        this.e = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.pbx) {
            defpackage.pbx pbxVar = (defpackage.pbx) obj;
            if (aooh.n(this.a, pbxVar.a) && aooh.n(this.b, pbxVar.b) && aooh.n(this.c, pbxVar.c) && aooh.n(this.d, pbxVar.d) && this.e == pbxVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + anty.L(this.e);
    }

    public final java.lang.String toString() {
        return "IncomingChipRowUiData(chips=" + this.a + ", onChipClicked=" + this.b + ", onRowRendered=" + this.c + ", onChipRendered=" + this.d + ", isSmallSecondaryWindow=" + this.e + ')';
    }
}
