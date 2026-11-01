package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bjo extends defpackage.dca {
    private final java.lang.String a;
    private final defpackage.dkz b;
    private final defpackage.dnx d;
    private final int e;
    private final boolean f;
    private final int g;
    private final int h;
    private final defpackage.cqi i = null;
    private final defpackage.gat j;

    public bjo(java.lang.String str, defpackage.dkz dkzVar, defpackage.gat gatVar, defpackage.dnx dnxVar, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = dkzVar;
        this.j = gatVar;
        this.d = dnxVar;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.bjr(this.a, this.b, this.j, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        boolean z;
        defpackage.bjr bjrVar = (defpackage.bjr) cmvVar;
        bjrVar.h = null;
        defpackage.dkz dkzVar = bjrVar.b;
        defpackage.dkz dkzVar2 = this.b;
        boolean zW = dkzVar2.w(dkzVar);
        java.lang.String str = bjrVar.a;
        java.lang.String str2 = this.a;
        boolean z2 = true;
        if (defpackage.aooh.n(str, str2)) {
            z = false;
        } else {
            bjrVar.a = str2;
            bjrVar.g();
            z = true;
        }
        int i = this.h;
        int i2 = this.g;
        boolean z3 = this.f;
        defpackage.gat gatVar = this.j;
        defpackage.dnx dnxVar = this.d;
        int i3 = this.e;
        boolean z4 = !bjrVar.b.x(dkzVar2);
        bjrVar.b = dkzVar2;
        if (bjrVar.g != i) {
            bjrVar.g = i;
            z4 = true;
        }
        if (bjrVar.f != i2) {
            bjrVar.f = i2;
            z4 = true;
        }
        if (bjrVar.e != z3) {
            bjrVar.e = z3;
            z4 = true;
        }
        if (!defpackage.aooh.n(bjrVar.k, gatVar)) {
            bjrVar.k = gatVar;
            z4 = true;
        }
        if (!defpackage.aooh.n(bjrVar.c, dnxVar)) {
            bjrVar.c = dnxVar;
            z4 = true;
        }
        if (bjrVar.d != i3) {
            bjrVar.d = i3;
        } else {
            z2 = z4;
        }
        if (z || z2) {
            bjrVar.d().g(bjrVar.a, bjrVar.b, bjrVar.k, bjrVar.c, bjrVar.d, bjrVar.e, bjrVar.f, bjrVar.g);
        }
        if (bjrVar.D) {
            if (z || (!zW && bjrVar.i != null)) {
                defpackage.cfo.A(bjrVar).I();
            }
            if (z || z2) {
                defpackage.cfo.A(bjrVar).H();
                defpackage.cfo.w(bjrVar);
            }
            if (zW) {
                return;
            }
            defpackage.cfo.w(bjrVar);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.bjo) {
            defpackage.bjo bjoVar = (defpackage.bjo) obj;
            defpackage.cqi cqiVar = bjoVar.i;
            if (defpackage.aooh.n(this.a, bjoVar.a) && defpackage.aooh.n(this.b, bjoVar.b) && defpackage.aooh.n(this.j, bjoVar.j) && defpackage.aooh.n(this.d, bjoVar.d) && this.e == bjoVar.e && this.f == bjoVar.f && this.g == bjoVar.g && this.h == bjoVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.j.hashCode()) * 31) + this.d.hashCode();
        int i = true != this.f ? 1237 : 1231;
        return ((((((((iHashCode * 31) + this.e) * 31) + i) * 31) + this.g) * 31) + this.h) * 31;
    }
}
