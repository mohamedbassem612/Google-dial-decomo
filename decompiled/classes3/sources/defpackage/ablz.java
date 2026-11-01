package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ablz implements defpackage.abmf, defpackage.abmh {
    public final java.lang.String a;
    public final boolean b;
    public final java.lang.String c;
    public final java.util.List d;
    public final boolean e;
    public final aonj f;
    public final aomy g;
    public final defpackage.abfr h;
    private final abja i;

    public /* synthetic */ ablz(java.lang.String str, boolean z, java.lang.String str2, boolean z2, aonj aonjVar, aomy aomyVar, defpackage.abfr abfrVar, int i) {
        aokc aokcVar = (i & 16) != 0 ? aokc.a : null;
        int i2 = i & 8;
        boolean z3 = !((i & 2) == 0);
        str2 = i2 != 0 ? null : str2;
        boolean z4 = z3 | z;
        aomyVar = (i & 128) != 0 ? null : aomyVar;
        abfrVar = (i & 256) != 0 ? null : abfrVar;
        aooh.f(str, "title");
        aooh.f(aokcVar, "descriptionAnnotations");
        this.a = str;
        this.b = z4;
        this.i = null;
        this.c = str2;
        this.d = aokcVar;
        this.e = z2;
        this.f = aonjVar;
        this.g = aomyVar;
        this.h = abfrVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ablz) {
            defpackage.ablz ablzVar = (defpackage.ablz) obj;
            if (aooh.n(this.a, ablzVar.a) && this.b == ablzVar.b) {
                abja abjaVar = ablzVar.i;
                if (aooh.n(this.c, ablzVar.c) && aooh.n(this.d, ablzVar.d) && this.e == ablzVar.e && aooh.n(this.f, ablzVar.f) && aooh.n(this.g, ablzVar.g) && aooh.n(this.h, ablzVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        java.lang.String str = this.c;
        int iL = (((((((((iHashCode + anty.L(this.b)) * 961) + (str == null ? 0 : str.hashCode())) * 31) + 1) * 31) + anty.L(this.e)) * 31) + this.f.hashCode()) * 31;
        aomy aomyVar = this.g;
        int iHashCode2 = (iL + (aomyVar == null ? 0 : aomyVar.hashCode())) * 31;
        defpackage.abfr abfrVar = this.h;
        return iHashCode2 + (abfrVar != null ? abfrVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Switch(title=" + this.a + ", enabled=" + this.b + ", icon=null, description=" + this.c + ", descriptionAnnotations=" + this.d + ", checked=" + this.e + ", onCheckChanged=" + this.f + ", onDisabledClick=" + this.g + ", footer=" + this.h + ')';
    }
}
