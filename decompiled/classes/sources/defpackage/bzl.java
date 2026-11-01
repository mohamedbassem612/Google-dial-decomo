package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class bzl extends defpackage.cmv implements defpackage.dcp, defpackage.dat, defpackage.dbb {
    public final defpackage.aomy a;
    public float b;
    public boolean d;
    public bzi g;
    public defpackage.bzx h;
    public final defpackage.kaw j;
    public long c = 0;
    public final defpackage.adq i = new defpackage.adq(16);
    public final defpackage.aii e = defpackage.aij.a(0.0f);
    public final defpackage.aii f = defpackage.aij.a(0.0f);

    public bzl(defpackage.kaw kawVar, defpackage.aomy aomyVar) {
        this.j = kawVar;
        this.a = aomyVar;
    }

    private final boolean j(defpackage.bzx bzxVar) {
        float fDl;
        if (!this.d) {
            return false;
        }
        defpackage.dpf dpfVar = defpackage.cfo.A(this).r;
        float f = bzxVar.b;
        if (java.lang.Float.isNaN(f)) {
            boolean z = bzxVar.a;
            long j = this.c;
            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
            float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
            fDl = defpackage.cpm.a((((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)) / 2.0f;
            if (z) {
                fDl += dpfVar.dl(10.0f);
            }
        } else {
            fDl = dpfVar.dl(f);
        }
        if (this.b == fDl) {
            return false;
        }
        this.b = fDl;
        return true;
    }

    public abstract void b(defpackage.avl avlVar, long j, float f);

    @Override // defpackage.cmv
    public final boolean cO() {
        return false;
    }

    public abstract void d(defpackage.csj csjVar);

    @Override // defpackage.cmv
    public final void dc() {
        f(false);
        defpackage.aoov.an(M(), null, 0, new defpackage.eee(this, (defpackage.aoln) null, 1), 3);
    }

    public abstract void e();

    public final defpackage.bzx f(boolean z) {
        defpackage.bzx bzxVar;
        boolean z2;
        defpackage.bzx bzxVar2;
        defpackage.bzx bzxVar3;
        defpackage.bzx bzxVar4 = this.h;
        defpackage.aoot aootVar = new defpackage.aoot();
        if (z || bzxVar4 == null) {
            defpackage.den.u(this, new defpackage.bev(aootVar, this, 2));
            java.lang.Object obj = aootVar.a;
            if (obj == null) {
                defpackage.aooh.j("resolvedConfiguration");
                bzxVar = null;
            } else {
                bzxVar = (defpackage.bzx) obj;
            }
            z2 = !defpackage.aooh.n(bzxVar, bzxVar4);
        } else {
            aootVar.a = bzxVar4;
            z2 = false;
        }
        java.lang.Object obj2 = aootVar.a;
        if (obj2 == null) {
            defpackage.aooh.j("resolvedConfiguration");
            bzxVar2 = null;
        } else {
            bzxVar2 = (defpackage.bzx) obj2;
        }
        this.h = bzxVar2;
        if (z2) {
            java.lang.Object obj3 = aootVar.a;
            if (obj3 == null) {
                defpackage.aooh.j("resolvedConfiguration");
                bzxVar3 = null;
            } else {
                bzxVar3 = (defpackage.bzx) obj3;
            }
            j(bzxVar3);
            defpackage.cfo.w(this);
        }
        java.lang.Object obj4 = aootVar.a;
        if (obj4 != null) {
            return (defpackage.bzx) obj4;
        }
        defpackage.aooh.j("resolvedConfiguration");
        return null;
    }

    @Override // defpackage.dbz
    public final void h(long j) {
        this.d = true;
        this.c = defpackage.dpy.l(j);
        if (j(f(false))) {
            defpackage.cfo.w(this);
        }
        defpackage.adq adqVar = this.i;
        java.lang.Object[] objArr = adqVar.a;
        int i = adqVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            i((defpackage.avn) objArr[i2]);
        }
        adqVar.l();
    }

    public final void i(defpackage.avn avnVar) {
        if (avnVar instanceof defpackage.avl) {
            b((defpackage.avl) avnVar, this.c, this.b);
            return;
        }
        if (avnVar instanceof avm) {
            defpackage.avl avlVar = ((avm) avnVar).a;
            e();
        } else if (avnVar instanceof avk) {
            defpackage.avl avlVar2 = ((avk) avnVar).a;
            e();
        }
    }

    @Override // defpackage.dat
    public final void o(defpackage.dbm dbmVar) {
        dbmVar.D();
        d(dbmVar);
        float fFloatValue = ((java.lang.Number) this.e.d()).floatValue();
        if (fFloatValue > 0.0f) {
            defpackage.bzx bzxVarF = f(false);
            long jA = bzxVarF.c.a();
            float fD = defpackage.cqg.d(jA);
            float fC = defpackage.cqg.c(jA);
            float fB = defpackage.cqg.b(jA);
            float[] fArr = defpackage.crp.a;
            long jN = defpackage.cfd.N(fD, fC, fB, fFloatValue, defpackage.crp.y[(int) (jA & 63)]);
            if (bzxVarF.a) {
                float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (dbmVar.o() >> 32));
                float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (dbmVar.o() & 4294967295L));
                defpackage.csg csgVarQ = dbmVar.q();
                long jA2 = csgVarQ.a();
                csgVarQ.b().g();
                try {
                    csgVarQ.c.o(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, 1);
                    defpackage.den.R(dbmVar, jN, this.b, 0L, null, 124);
                    csgVarQ.b().e();
                    csgVarQ.h(jA2);
                } catch (java.lang.Throwable th) {
                    csgVarQ.b().e();
                    csgVarQ.h(jA2);
                    throw th;
                }
            } else {
                defpackage.den.R(dbmVar, jN, this.b, 0L, null, 124);
            }
        }
        if (((java.lang.Number) this.f.d()).floatValue() > 0.0f) {
            bzi bziVar = this.g;
            if (bziVar == null) {
                bziVar = new bzi(this);
            }
            this.g = bziVar;
            bzo bzoVar = f(false).e;
            if ((bzoVar instanceof bzo ? bzoVar : null) != null) {
                dbmVar.o();
                throw null;
            }
        }
    }

    @Override // defpackage.dcp
    public final void v() {
        f(true);
    }

    @Override // defpackage.dat
    public final /* synthetic */ void m() {
    }

    @Override // defpackage.dbb
    public final /* synthetic */ void g(defpackage.cxi cxiVar) {
    }
}
