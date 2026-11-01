package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ezv implements erg, defpackage.fga, defpackage.fct {
    public final defpackage.etc a;
    public final defpackage.ezu b;
    public final android.util.SparseArray c;
    public defpackage.eto d;
    public defpackage.eri e;
    public defpackage.etk f;
    public boolean g;
    private final defpackage.erk h;
    private final defpackage.erl i;

    public ezv(defpackage.etc etcVar) {
        ahvr.ci(etcVar);
        this.a = etcVar;
        this.d = new defpackage.eto(eum.E().getThread());
        defpackage.erk erkVar = new defpackage.erk();
        this.h = erkVar;
        this.i = new defpackage.erl();
        this.b = new defpackage.ezu(erkVar);
        this.c = new android.util.SparseArray();
    }

    private final defpackage.ezm G(int i, defpackage.ffu ffuVar) {
        ahvr.ci(this.e);
        if (ffuVar != null) {
            return this.b.a(ffuVar) != null ? B(ffuVar) : C(defpackage.erm.a, i, ffuVar);
        }
        defpackage.erm ermVarQ = this.e.q();
        if (i >= ermVarQ.c()) {
            ermVarQ = defpackage.erm.a;
        }
        return C(ermVarQ, i, null);
    }

    private final defpackage.ezm H(defpackage.erb erbVar) {
        defpackage.ffu ffuVar;
        return (!(erbVar instanceof defpackage.exl) || (ffuVar = ((defpackage.exl) erbVar).h) == null) ? A() : B(ffuVar);
    }

    public final defpackage.ezm A() {
        return B(this.b.c);
    }

    public final defpackage.ezm B(defpackage.ffu ffuVar) {
        ahvr.ci(this.e);
        defpackage.erm ermVarA = ffuVar == null ? null : this.b.a(ffuVar);
        if (ffuVar != null && ermVarA != null) {
            return C(ermVarA, ermVarA.m(ffuVar.a, this.h).c, ffuVar);
        }
        int i = this.e.i();
        defpackage.erm ermVarQ = this.e.q();
        if (i >= ermVarQ.c()) {
            ermVarQ = defpackage.erm.a;
        }
        return C(ermVarQ, i, null);
    }

    protected final defpackage.ezm C(defpackage.erm ermVar, int i, defpackage.ffu ffuVar) {
        defpackage.ffu ffuVar2 = true == ermVar.n() ? null : ffuVar;
        long jA = this.a.a();
        boolean z = ermVar.equals(this.e.q()) && i == this.e.i();
        long jA2 = 0;
        if (ffuVar2 == null || !ffuVar2.c()) {
            if (z) {
                defpackage.eyc eycVar = (defpackage.eyc) this.e;
                eycVar.L();
                jA2 = eycVar.C(eycVar.w);
            } else if (!ermVar.n()) {
                jA2 = ermVar.e(i, this.i, 0L).a();
            }
        } else if (z && this.e.g() == ffuVar2.b && this.e.h() == ffuVar2.c) {
            jA2 = this.e.n();
        }
        return new defpackage.ezm(jA, ermVar, i, ffuVar2, jA2, this.e.q(), this.e.i(), this.b.c, this.e.n(), this.e.p());
    }

    public final defpackage.ezm D() {
        return B(this.b.d);
    }

    public final defpackage.ezm E() {
        return B(this.b.e);
    }

    public final void F(defpackage.ezm ezmVar, int i, defpackage.etl etlVar) {
        this.c.put(i, ezmVar);
        this.d.e(i, etlVar);
    }

    @Override // defpackage.fga
    public final void I(int i, defpackage.ffu ffuVar, final defpackage.ffq ffqVar) {
        final defpackage.ezm ezmVarG = G(i, ffuVar);
        F(ezmVarG, 1004, new defpackage.etl() { // from class: ezq
            @Override // defpackage.etl
            public final void a(java.lang.Object obj) {
                defpackage.ezm ezmVar = ezmVarG;
                defpackage.ffu ffuVar2 = ezmVar.d;
                defpackage.fad fadVar = (defpackage.fad) obj;
                if (ffuVar2 != null) {
                    defpackage.ffq ffqVar2 = ffqVar;
                    defpackage.eqg eqgVar = ffqVar2.c;
                    ahvr.ci(eqgVar);
                    alic alicVar = new alic(eqgVar, fadVar.c.d(ezmVar.b, ffuVar2));
                    int i2 = ffqVar2.b;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            fadVar.v = alicVar;
                            return;
                        } else if (i2 != 2) {
                            if (i2 == 3) {
                                fadVar.w = alicVar;
                                return;
                            }
                            return;
                        }
                    }
                    fadVar.u = alicVar;
                }
            }
        });
    }

    @Override // defpackage.fct
    public final void J(int i, defpackage.ffu ffuVar) {
        F(G(i, ffuVar), 1025, new defpackage.ezp(16));
    }

    @Override // defpackage.fct
    public final void K(int i, defpackage.ffu ffuVar, int i2) {
        F(G(i, ffuVar), 1022, new defpackage.ezp(11));
    }

    @Override // defpackage.fct
    public final void L(int i, defpackage.ffu ffuVar, java.lang.Exception exc) {
        F(G(i, ffuVar), 1024, new defpackage.ezp(12));
    }

    @Override // defpackage.fga
    public final void N(int i, defpackage.ffu ffuVar, defpackage.ffl fflVar, defpackage.ffq ffqVar) {
        F(G(i, ffuVar), 1002, new defpackage.ezp(8));
    }

    @Override // defpackage.fga
    public final void O(int i, defpackage.ffu ffuVar, defpackage.ffl fflVar, defpackage.ffq ffqVar) {
        F(G(i, ffuVar), 1001, new defpackage.ezp(13));
    }

    public final void Q(defpackage.eqt eqtVar, int i) {
        F(A(), 1, new defpackage.exv(9));
    }

    @Override // defpackage.fct
    public final void R(int i, defpackage.ffu ffuVar, defpackage.hgt hgtVar) {
        F(G(i, ffuVar), 1023, new defpackage.exv(18));
    }

    public final void a(int i) {
        F(E(), 21, new defpackage.ezp(17));
    }

    public final void b(defpackage.ere ereVar) {
        F(A(), 13, new defpackage.exv(7));
    }

    public final void c(defpackage.est estVar) {
        F(A(), 27, new defpackage.ezp(20));
    }

    public final void d(java.util.List list) {
        F(A(), 27, new defpackage.ezp(5));
    }

    @Override // defpackage.fct
    public final void e(int i, defpackage.ffu ffuVar) {
        F(G(i, ffuVar), 1027, new defpackage.ezt(4));
    }

    public final void f(boolean z) {
        F(A(), 3, new defpackage.exv(5));
    }

    public final void g(boolean z) {
        F(A(), 7, new defpackage.exv(16));
    }

    @Override // defpackage.fga
    public final void h(int i, defpackage.ffu ffuVar, defpackage.ffl fflVar, defpackage.ffq ffqVar, java.io.IOException iOException, boolean z) {
        F(G(i, ffuVar), 1003, new defpackage.exq(ffqVar, 17));
    }

    @Override // defpackage.fga
    public final void i(int i, defpackage.ffu ffuVar, defpackage.ffl fflVar, defpackage.ffq ffqVar, int i2) {
        F(G(i, ffuVar), 1000, new defpackage.ezt(8));
    }

    public final void j(defpackage.eqw eqwVar) {
        F(A(), 14, new defpackage.ezt(6));
    }

    public final void k(defpackage.eqy eqyVar) {
        F(A(), 28, new defpackage.exv(14));
    }

    public final void l(boolean z, int i) {
        F(A(), 5, new defpackage.ezp(3));
    }

    public final void m(defpackage.erc ercVar) {
        F(A(), 12, new defpackage.exv(2));
    }

    public final void n(int i) {
        F(A(), 4, new defpackage.ezp(10));
    }

    public final void o(int i) {
        F(A(), 6, new defpackage.exv(20));
    }

    public final void p(defpackage.erb erbVar) {
        F(H(erbVar), 10, new defpackage.exq(erbVar, 18));
    }

    public final void q(defpackage.erb erbVar) {
        F(H(erbVar), 10, new defpackage.ezp(2));
    }

    public final void r(boolean z, int i) {
        F(A(), -1, new defpackage.exv(13));
    }

    public final void t(defpackage.erh erhVar, defpackage.erh erhVar2, int i) {
        int i2 = 0;
        if (i == 1) {
            this.g = false;
            i = 1;
        }
        defpackage.ezu ezuVar = this.b;
        defpackage.eri eriVar = this.e;
        ahvr.ci(eriVar);
        ezuVar.c = defpackage.ezu.b(eriVar, ezuVar.b, ezuVar.d, ezuVar.a);
        F(A(), 11, new defpackage.ezr(i, i2));
    }

    public final void v(boolean z) {
        F(E(), 23, new defpackage.exv(10));
    }

    public final void w(int i, int i2) {
        F(E(), 24, new defpackage.ezt(7));
    }

    public final void x(defpackage.erm ermVar, int i) {
        defpackage.eri eriVar = this.e;
        ahvr.ci(eriVar);
        defpackage.ezu ezuVar = this.b;
        ezuVar.c = defpackage.ezu.b(eriVar, ezuVar.b, ezuVar.d, ezuVar.a);
        ezuVar.c(eriVar.q());
        F(A(), 0, new defpackage.exv(8));
    }

    public final void y(defpackage.ert ertVar) {
        F(A(), 2, new defpackage.exv(17));
    }

    public final void z(defpackage.ery eryVar) {
        F(E(), 25, new defpackage.exq(eryVar, 20));
    }

    public final void u() {
    }

    public final void P(boolean z) {
    }

    public final void s(int i) {
    }

    public final void M(defpackage.eri eriVar, defpackage.erf erfVar) {
    }
}
