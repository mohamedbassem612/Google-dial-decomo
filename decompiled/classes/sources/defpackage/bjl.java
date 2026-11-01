package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bjl extends defpackage.dca {
    private final defpackage.dji a;
    private final defpackage.dkz b;
    private final defpackage.dnx d;
    private final defpackage.aonj e;
    private final int f;
    private final boolean g;
    private final int h;
    private final int i;
    private final java.util.List j;
    private final defpackage.aonj k;
    private final bjf l = null;
    private final defpackage.cqi m = null;
    private final defpackage.aonj n;
    private final defpackage.gat o;

    public bjl(defpackage.dji djiVar, defpackage.dkz dkzVar, defpackage.gat gatVar, defpackage.dnx dnxVar, defpackage.aonj aonjVar, int i, boolean z, int i2, int i3, java.util.List list, defpackage.aonj aonjVar2, defpackage.aonj aonjVar3) {
        this.a = djiVar;
        this.b = dkzVar;
        this.o = gatVar;
        this.d = dnxVar;
        this.e = aonjVar;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.j = list;
        this.k = aonjVar2;
        this.n = aonjVar3;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.bjn(this.a, this.b, this.o, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, null, this.n);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        defpackage.bjn bjnVar = (defpackage.bjn) cmvVar;
        defpackage.dkz dkzVar = this.b;
        bjnVar.h(bjnVar.q(dkzVar), bjnVar.p(this.a), bjnVar.r(dkzVar, this.j, this.i, this.h, this.g, this.o, this.d, this.f), bjnVar.n(this.e, this.k, null, this.n));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bjl) {
            defpackage.bjl bjlVar = (defpackage.bjl) obj;
            defpackage.cqi cqiVar = bjlVar.m;
            if (defpackage.aooh.n(this.a, bjlVar.a) && defpackage.aooh.n(this.b, bjlVar.b) && defpackage.aooh.n(this.j, bjlVar.j) && defpackage.aooh.n(this.o, bjlVar.o) && defpackage.aooh.n(this.d, bjlVar.d) && this.e == bjlVar.e && this.n == bjlVar.n && this.f == bjlVar.f && this.g == bjlVar.g && this.h == bjlVar.h && this.i == bjlVar.i && this.k == bjlVar.k) {
                bjf bjfVar = bjlVar.l;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.o.hashCode()) * 31) + this.d.hashCode();
        defpackage.aonj aonjVar = this.e;
        int iHashCode2 = ((((((((((iHashCode * 31) + (aonjVar != null ? aonjVar.hashCode() : 0)) * 31) + this.f) * 31) + (true != this.g ? 1237 : 1231)) * 31) + this.h) * 31) + this.i) * 31;
        java.util.List list = this.j;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        defpackage.aonj aonjVar2 = this.k;
        int iHashCode4 = iHashCode3 + (aonjVar2 != null ? aonjVar2.hashCode() : 0);
        defpackage.aonj aonjVar3 = this.n;
        return (iHashCode4 * 29791) + (aonjVar3 != null ? aonjVar3.hashCode() : 0);
    }
}
