package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aop extends defpackage.dap implements defpackage.dan, defpackage.dcp {
    public defpackage.amo a;
    public defpackage.amn b;
    private defpackage.ati c;
    private defpackage.aso d;
    private boolean e;
    private boolean f;
    private defpackage.ars g;
    private defpackage.aqb h;
    private boolean i;
    private defpackage.ath j;
    private defpackage.dao k;
    private boolean l;
    private defpackage.amn m;
    private defpackage.kaw n;

    public aop(defpackage.ati atiVar, defpackage.aso asoVar, boolean z, boolean z2, defpackage.ars arsVar, defpackage.kaw kawVar, defpackage.aqb aqbVar, boolean z3, defpackage.amn amnVar) {
        this.c = atiVar;
        this.d = asoVar;
        this.e = z;
        this.f = z2;
        this.g = arsVar;
        this.n = kawVar;
        this.h = aqbVar;
        this.i = z3;
        this.m = amnVar;
    }

    private final void f() {
        defpackage.dao daoVar = this.k;
        if (daoVar != null) {
            if (daoVar.L().D) {
                return;
            }
            V(daoVar);
            return;
        }
        if (this.i) {
            defpackage.den.u(this, new mq(this, 17));
        }
        defpackage.amn amnVarD = d();
        if (amnVarD != null) {
            defpackage.dao daoVar2 = amnVarD.g;
            if (daoVar2.L().D) {
                return;
            }
            V(daoVar2);
            this.k = daoVar2;
        }
    }

    public final boolean b() {
        defpackage.dpq dpqVar = defpackage.dpq.a;
        if (this.D) {
            dpqVar = defpackage.cfo.A(this).s;
        }
        defpackage.aso asoVar = this.d;
        boolean z = this.f;
        return (dpqVar != defpackage.dpq.b || asoVar == defpackage.aso.a) ? !z : z;
    }

    @Override // defpackage.cmv
    public final void cL() {
        boolean zB = b();
        if (this.l != zB) {
            this.l = zB;
            e(this.c, this.d, this.i, d(), this.e, this.f, this.g, this.n, this.h);
        }
    }

    @Override // defpackage.cmv
    public final boolean cO() {
        return false;
    }

    public final defpackage.amn d() {
        return this.i ? this.b : this.m;
    }

    @Override // defpackage.cmv
    public final void dc() {
        this.l = b();
        f();
        if (this.j == null) {
            defpackage.ath athVar = new defpackage.ath(this.c, d(), this.g, this.d, this.e, this.l, this.n, this.h);
            V(athVar);
            this.j = athVar;
        }
    }

    public final void e(defpackage.ati atiVar, defpackage.aso asoVar, boolean z, defpackage.amn amnVar, boolean z2, boolean z3, defpackage.ars arsVar, defpackage.kaw kawVar, defpackage.aqb aqbVar) {
        boolean z4;
        this.c = atiVar;
        this.d = asoVar;
        boolean z5 = true;
        if (this.i != z) {
            this.i = z;
            z4 = true;
        } else {
            z4 = false;
        }
        if (defpackage.aooh.n(this.m, amnVar)) {
            z5 = false;
        } else {
            this.m = amnVar;
        }
        if (z4 || (z5 && !z)) {
            defpackage.dao daoVar = this.k;
            if (daoVar != null) {
                U(daoVar);
            }
            this.k = null;
            f();
        }
        this.e = z2;
        this.f = z3;
        this.g = arsVar;
        this.n = kawVar;
        this.h = aqbVar;
        boolean zB = b();
        this.l = zB;
        defpackage.ath athVar = this.j;
        if (athVar != null) {
            athVar.K(atiVar, asoVar, d(), z2, zB, arsVar, kawVar, aqbVar);
        }
    }

    @Override // defpackage.cmv
    public final void u() {
        defpackage.dao daoVar = this.k;
        if (daoVar != null) {
            U(daoVar);
        }
    }

    @Override // defpackage.dcp
    public final void v() {
        defpackage.amo amoVar = (defpackage.amo) defpackage.cfo.G(this, defpackage.aoj.a);
        if (defpackage.aooh.n(amoVar, this.a)) {
            return;
        }
        this.a = amoVar;
        this.b = null;
        defpackage.dao daoVar = this.k;
        if (daoVar != null) {
            U(daoVar);
        }
        this.k = null;
        f();
        defpackage.ath athVar = this.j;
        if (athVar != null) {
            athVar.K(this.c, this.d, d(), this.e, this.l, this.g, this.n, this.h);
        }
    }
}
