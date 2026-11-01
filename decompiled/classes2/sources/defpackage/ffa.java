package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ffa implements defpackage.fga, defpackage.fct {
    final /* synthetic */ defpackage.ffb a;
    private final java.lang.Object b;
    private alic c;
    private alic d;

    public ffa(defpackage.ffb ffbVar, java.lang.Object obj) {
        j$.util.Objects.requireNonNull(ffbVar);
        this.a = ffbVar;
        this.c = ffbVar.r(null);
        this.d = ffbVar.s(null);
        this.b = obj;
    }

    private final boolean k(defpackage.ffu ffuVar) {
        defpackage.ffu ffuVarT;
        if (ffuVar != null) {
            ffuVarT = this.a.t(this.b, ffuVar);
            if (ffuVarT == null) {
                return false;
            }
        } else {
            ffuVarT = null;
        }
        defpackage.ffb ffbVar = this.a;
        ffbVar.x(this.b);
        alic alicVar = this.c;
        int i = alicVar.a;
        if (!j$.util.Objects.equals(alicVar.b, ffuVarT)) {
            this.c = ffbVar.c.p(ffuVarT);
        }
        alic alicVar2 = this.d;
        int i2 = alicVar2.a;
        if (!j$.util.Objects.equals(alicVar2.b, ffuVarT)) {
            this.d = ffbVar.d.q(ffuVarT);
        }
        return true;
    }

    private final void l(defpackage.ffq ffqVar) {
        defpackage.ffb ffbVar = this.a;
        java.lang.Object obj = this.b;
        ffbVar.y(obj);
        ffbVar.y(obj);
    }

    @Override // defpackage.fga
    public final void I(int i, defpackage.ffu ffuVar, defpackage.ffq ffqVar) {
        if (k(ffuVar)) {
            alic alicVar = this.c;
            l(ffqVar);
            alicVar.f(ffqVar);
        }
    }

    @Override // defpackage.fct
    public final void J(int i, defpackage.ffu ffuVar) {
        if (k(ffuVar)) {
            this.d.k();
        }
    }

    @Override // defpackage.fct
    public final void K(int i, defpackage.ffu ffuVar, int i2) {
        if (k(ffuVar)) {
            this.d.l(i2);
        }
    }

    @Override // defpackage.fct
    public final void L(int i, defpackage.ffu ffuVar, java.lang.Exception exc) {
        if (k(ffuVar)) {
            this.d.m(exc);
        }
    }

    @Override // defpackage.fga
    public final void N(int i, defpackage.ffu ffuVar, defpackage.ffl fflVar, defpackage.ffq ffqVar) {
        if (k(ffuVar)) {
            alic alicVar = this.c;
            l(ffqVar);
            alicVar.g(fflVar, ffqVar);
        }
    }

    @Override // defpackage.fga
    public final void O(int i, defpackage.ffu ffuVar, defpackage.ffl fflVar, defpackage.ffq ffqVar) {
        if (k(ffuVar)) {
            alic alicVar = this.c;
            l(ffqVar);
            alicVar.h(fflVar, ffqVar);
        }
    }

    @Override // defpackage.fct
    public final void R(int i, defpackage.ffu ffuVar, defpackage.hgt hgtVar) {
        if (k(ffuVar)) {
            this.d.r(hgtVar);
        }
    }

    @Override // defpackage.fct
    public final void e(int i, defpackage.ffu ffuVar) {
        if (k(ffuVar)) {
            this.d.n();
        }
    }

    @Override // defpackage.fga
    public final void h(int i, defpackage.ffu ffuVar, defpackage.ffl fflVar, defpackage.ffq ffqVar, java.io.IOException iOException, boolean z) {
        if (k(ffuVar)) {
            alic alicVar = this.c;
            l(ffqVar);
            alicVar.i(fflVar, ffqVar, iOException, z);
        }
    }

    @Override // defpackage.fga
    public final void i(int i, defpackage.ffu ffuVar, defpackage.ffl fflVar, defpackage.ffq ffqVar, int i2) {
        if (k(ffuVar)) {
            alic alicVar = this.c;
            l(ffqVar);
            alicVar.j(fflVar, ffqVar, i2);
        }
    }
}
