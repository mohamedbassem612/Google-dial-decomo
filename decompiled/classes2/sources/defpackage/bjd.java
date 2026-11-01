package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bjd extends dca {
    private final dji a;
    private final dkz b;
    private final dnx d;
    private final aonj e;
    private final int f;
    private final boolean g;
    private final int h;
    private final int i;
    private final java.util.List j;
    private final aonj k;
    private final defpackage.bjf l;
    private final cqi m = null;
    private final defpackage.bgu n = null;
    private final gat o;

    public bjd(dji djiVar, dkz dkzVar, gat gatVar, dnx dnxVar, aonj aonjVar, int i, boolean z, int i2, int i3, java.util.List list, aonj aonjVar2, defpackage.bjf bjfVar) {
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
        this.l = bjfVar;
    }

    public final /* bridge */ /* synthetic */ cmv d() {
        return new defpackage.bje(this.a, this.b, this.o, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    public final /* bridge */ /* synthetic */ void e(cmv cmvVar) {
        defpackage.bje bjeVar = (defpackage.bje) cmvVar;
        bjn bjnVar = bjeVar.b;
        dkz dkzVar = this.b;
        boolean zQ = bjnVar.q(dkzVar);
        boolean zP = bjnVar.p(this.a);
        boolean zR = bjnVar.r(dkzVar, this.j, this.i, this.h, this.g, this.o, this.d, this.f);
        aonj aonjVar = this.e;
        aonj aonjVar2 = this.k;
        defpackage.bjf bjfVar = this.l;
        bjnVar.h(zQ, zP, zR, bjnVar.n(aonjVar, aonjVar2, bjfVar, (aonj) null));
        if (bjeVar.c && !aooh.n(bjfVar, bjeVar.a)) {
            defpackage.bjf bjfVar2 = bjeVar.a;
            if (bjfVar2 != null) {
                bjfVar2.b();
            }
            bjfVar.a();
        }
        bjfVar.c(bjeVar.k());
        bjeVar.a = bjfVar;
        cfo.A(bjeVar).H();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bjd) {
            defpackage.bjd bjdVar = (defpackage.bjd) obj;
            cqi cqiVar = bjdVar.m;
            if (aooh.n(this.a, bjdVar.a) && aooh.n(this.b, bjdVar.b) && aooh.n(this.j, bjdVar.j) && aooh.n(this.o, bjdVar.o) && aooh.n(this.d, bjdVar.d)) {
                defpackage.bgu bguVar = bjdVar.n;
                if (this.e == bjdVar.e && this.f == bjdVar.f && this.g == bjdVar.g && this.h == bjdVar.h && this.i == bjdVar.i && this.k == bjdVar.k && aooh.n(this.l, bjdVar.l)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.o.hashCode()) * 31) + this.d.hashCode();
        aonj aonjVar = this.e;
        int iHashCode2 = ((((((((((iHashCode * 31) + (aonjVar != null ? aonjVar.hashCode() : 0)) * 31) + this.f) * 31) + (true != this.g ? 1237 : 1231)) * 31) + this.h) * 31) + this.i) * 31;
        java.util.List list = this.j;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        aonj aonjVar2 = this.k;
        return (((iHashCode3 + (aonjVar2 != null ? aonjVar2.hashCode() : 0)) * 31) + this.l.hashCode()) * 961;
    }
}
