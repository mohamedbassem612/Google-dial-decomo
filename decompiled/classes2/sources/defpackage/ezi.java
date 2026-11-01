package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ezi {
    public final defpackage.ezf a;
    public final defpackage.ezf b;
    public int c = 0;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public defpackage.fgv h;
    public defpackage.fgv i;
    private final int j;

    public ezi(defpackage.ezf ezfVar, defpackage.ezf ezfVar2, int i) {
        this.a = ezfVar;
        this.j = i;
        this.b = ezfVar2;
    }

    public static final void A(defpackage.ezf ezfVar) {
        if (ezfVar.dF() == 2) {
            ezfVar.I();
        }
    }

    public static final void B(defpackage.ezf ezfVar, long j) {
        ezfVar.E();
        if (ezfVar instanceof defpackage.fhp) {
            defpackage.fhp fhpVar = (defpackage.fhp) ezfVar;
            ahvr.bY(fhpVar.f);
            fhpVar.k = j;
        }
    }

    private final int C(defpackage.ezf ezfVar, defpackage.eyq eyqVar, defpackage.fin finVar, defpackage.exj exjVar) {
        if (ezfVar == null || !w(ezfVar)) {
            return 1;
        }
        defpackage.ezf ezfVar2 = this.a;
        boolean z = ezfVar != ezfVar2;
        if (ezfVar == ezfVar2 && t()) {
            return 1;
        }
        if (ezfVar == this.b && y()) {
            return 1;
        }
        defpackage.fgv fgvVarL = ezfVar.l();
        defpackage.fgv[] fgvVarArr = eyqVar.c;
        int i = this.j;
        defpackage.fgv fgvVar = fgvVarArr[i];
        boolean zB = finVar.b(i);
        if (zB && fgvVarL == fgvVar) {
            return 1;
        }
        if (!ezfVar.K()) {
            defpackage.eqg[] eqgVarArrZ = z(finVar.c[i]);
            defpackage.fgv fgvVar2 = fgvVarArr[i];
            ahvr.ci(fgvVar2);
            ezfVar.B(eqgVarArrZ, fgvVar2, eyqVar.d(), eyqVar.k, eyqVar.g.a);
            return 3;
        }
        if (!ezfVar.W()) {
            return 0;
        }
        e(ezfVar, exjVar);
        if (zB && !r()) {
            return 1;
        }
        g(!z);
        return 1;
    }

    private final boolean D(defpackage.eyq eyqVar, defpackage.ezf ezfVar) {
        if (ezfVar != null) {
            defpackage.fgv fgvVar = eyqVar.c[this.j];
            if (ezfVar.l() != null) {
                if (ezfVar.l() == fgvVar) {
                    if (fgvVar != null && !ezfVar.J()) {
                        defpackage.eyq eyqVar2 = eyqVar.h;
                        boolean z = eyqVar.g.f;
                    }
                }
                return x(eyqVar, ezfVar.l());
            }
        }
        return true;
    }

    public static boolean w(defpackage.ezf ezfVar) {
        return ezfVar.dF() != 0;
    }

    public static defpackage.eqg[] z(defpackage.fii fiiVar) {
        int iH = fiiVar != null ? fiiVar.h() : 0;
        defpackage.eqg[] eqgVarArr = new defpackage.eqg[iH];
        for (int i = 0; i < iH; i++) {
            ahvr.ci(fiiVar);
            eqgVarArr[i] = fiiVar.a(i);
        }
        return eqgVarArr;
    }

    public final int a() {
        defpackage.ezf ezfVar = this.b;
        boolean zW = w(this.a);
        int i = 0;
        if (ezfVar != null && w(ezfVar)) {
            i = 1;
        }
        return (zW ? 1 : 0) + i;
    }

    public final int b() {
        return this.a.dG();
    }

    public final int c(defpackage.eyq eyqVar, defpackage.fin finVar, defpackage.exj exjVar) {
        int iC = C(this.a, eyqVar, finVar, exjVar);
        return iC == 1 ? C(this.b, eyqVar, finVar, exjVar) : iC;
    }

    public final defpackage.ezf d(defpackage.eyq eyqVar) {
        if (eyqVar == null) {
            return null;
        }
        int i = this.j;
        defpackage.fgv[] fgvVarArr = eyqVar.c;
        if (fgvVarArr[i] == null) {
            return null;
        }
        defpackage.ezf ezfVar = this.a;
        defpackage.fgv fgvVarL = ezfVar.l();
        defpackage.fgv fgvVar = fgvVarArr[i];
        if (fgvVarL == fgvVar) {
            return ezfVar;
        }
        defpackage.ezf ezfVar2 = this.b;
        if (ezfVar2 == null || ezfVar2.l() != fgvVar) {
            return null;
        }
        return ezfVar2;
    }

    public final void e(defpackage.ezf ezfVar, defpackage.exj exjVar) {
        defpackage.ezf ezfVar2 = this.a;
        ahvr.bY(ezfVar2 == ezfVar || this.b == ezfVar);
        if (w(ezfVar)) {
            if (ezfVar == exjVar.c) {
                exjVar.d = null;
                exjVar.c = null;
                exjVar.e = true;
            }
            A(ezfVar);
            if (ezfVar == ezfVar2) {
                this.f = false;
                this.h = null;
            } else {
                this.g = false;
                this.i = null;
            }
            ezfVar.n();
        }
    }

    public final void f(defpackage.ezf ezfVar, defpackage.fgv fgvVar, defpackage.exj exjVar, long j, boolean z) {
        if (w(ezfVar)) {
            if (fgvVar != ezfVar.l()) {
                e(ezfVar, exjVar);
            } else if (z) {
                ezfVar.D(j, true);
            }
        }
    }

    public final void g(boolean z) {
        if (z) {
            if (this.d) {
                this.a.C();
                this.d = false;
                return;
            }
            return;
        }
        if (this.e) {
            defpackage.ezf ezfVar = this.b;
            ahvr.ci(ezfVar);
            ezfVar.C();
            this.e = false;
        }
    }

    public final void h(defpackage.fin finVar, defpackage.fin finVar2, long j) {
        int i;
        int i2 = this.j;
        boolean zB = finVar.b(i2);
        boolean zB2 = finVar2.b(i2);
        defpackage.ezf ezfVar = this.b;
        if (ezfVar == null || (i = this.c) == 4 || i == 3 || (i == 0 && w(this.a))) {
            ezfVar = this.a;
        }
        if (!zB || ezfVar.K()) {
            return;
        }
        b();
        defpackage.ezh ezhVar = finVar.b[i2];
        defpackage.ezh ezhVar2 = finVar2.b[i2];
        if (zB2 && j$.util.Objects.equals(ezhVar2, ezhVar) && !r()) {
            return;
        }
        B(ezfVar, j);
    }

    public final void i() {
        if (!w(this.a)) {
            g(true);
        }
        defpackage.ezf ezfVar = this.b;
        if (ezfVar == null || w(ezfVar)) {
            return;
        }
        g(false);
    }

    public final void j(defpackage.eyq eyqVar, long j) {
        defpackage.ezf ezfVarD = d(eyqVar);
        ahvr.ci(ezfVarD);
        B(ezfVarD, j);
    }

    public final void k() {
        defpackage.ezf ezfVar = this.a;
        if (ezfVar.dF() == 1 && this.f && !t()) {
            ezfVar.H();
        }
        defpackage.ezf ezfVar2 = this.b;
        if (ezfVar2 == null || ezfVar2.dF() != 1 || !this.g || y()) {
            return;
        }
        ezfVar2.H();
    }

    public final void l() {
        int i;
        ahvr.bY(!r());
        if (w(this.a)) {
            i = 4;
        } else {
            defpackage.ezf ezfVar = this.b;
            if (ezfVar == null || !w(ezfVar)) {
                i = this.c == 0 ? 2 : 3;
            } else {
                i = 5;
            }
        }
        this.c = i;
    }

    public final void m(boolean z) {
        if (z) {
            defpackage.ezf ezfVar = this.b;
            ahvr.ci(ezfVar);
            ezfVar.p(17, this.a);
        } else {
            defpackage.ezf ezfVar2 = this.a;
            defpackage.ezf ezfVar3 = this.b;
            ahvr.ci(ezfVar3);
            ezfVar2.p(17, ezfVar3);
        }
    }

    public final boolean n(defpackage.eyq eyqVar) {
        if (v()) {
            return D(eyqVar, this.a) && D(eyqVar, this.b);
        }
        return eyqVar.m(this.j);
    }

    public final boolean o(defpackage.eyq eyqVar) {
        defpackage.ezf ezfVarD = d(eyqVar);
        ahvr.ci(ezfVarD);
        return ezfVarD.J();
    }

    public final boolean p() {
        return this.b != null;
    }

    public final boolean q() {
        defpackage.ezf ezfVar = this.a;
        boolean zW = w(ezfVar) ? ezfVar.W() : true;
        defpackage.ezf ezfVar2 = this.b;
        return (ezfVar2 == null || !w(ezfVar2)) ? zW : zW & ezfVar2.W();
    }

    public final boolean r() {
        return t() || y();
    }

    public final boolean s(defpackage.eyq eyqVar) {
        return (t() && d(eyqVar) == this.a) || (y() && d(eyqVar) == this.b);
    }

    public final boolean t() {
        int i = this.c;
        return i == 2 || i == 5;
    }

    public final boolean u(defpackage.eyq eyqVar) {
        return d(eyqVar) != null;
    }

    public final boolean v() {
        int i = this.c;
        if (i == 0 || i == 2 || i == 5) {
            return w(this.a);
        }
        defpackage.ezf ezfVar = this.b;
        ahvr.ci(ezfVar);
        return w(ezfVar);
    }

    public final boolean x(defpackage.eyq eyqVar, defpackage.fgv fgvVar) {
        if (fgvVar == null) {
            return false;
        }
        defpackage.fgv[] fgvVarArr = eyqVar.c;
        int i = this.j;
        if (j$.util.Objects.equals(fgvVarArr[i], fgvVar)) {
            return false;
        }
        for (defpackage.eyq eyqVar2 = eyqVar.h; eyqVar2 != null; eyqVar2 = eyqVar2.h) {
            if (j$.util.Objects.equals(eyqVar2.c[i], fgvVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean y() {
        int i = this.c;
        return i == 3 || i == 4;
    }
}
