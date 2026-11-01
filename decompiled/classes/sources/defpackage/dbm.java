package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dbm implements defpackage.csj {
    public defpackage.dat a;
    private final defpackage.csh b;

    public dbm(defpackage.csh cshVar) {
        this.b = cshVar;
    }

    @Override // defpackage.csj
    public final void A(defpackage.cpu cpuVar, float f, defpackage.den denVar, defpackage.cqh cqhVar) {
        this.b.A(cpuVar, f, denVar, cqhVar);
    }

    @Override // defpackage.csj
    public final void B(defpackage.cpx cpxVar, long j, float f, defpackage.den denVar) {
        this.b.B(cpxVar, j, f, denVar);
    }

    @Override // defpackage.csj
    public final void C(long j, float f, long j2, float f2, defpackage.den denVar) {
        this.b.C(j, f, j2, f2, denVar);
    }

    public final void D() {
        defpackage.cqf cqfVarB = q().b();
        defpackage.dat datVar = this.a;
        if (datVar == null) {
            defpackage.cwh.b("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
            throw new defpackage.aoiq();
        }
        defpackage.cmv cmvVarX = datVar.L().x;
        if (cmvVarX != null && (cmvVarX.v & 4) != 0) {
            while (true) {
                if (cmvVarX != null) {
                    int i = cmvVarX.u;
                    if ((i & 2) == 0) {
                        if ((i & 4) != 0) {
                            break;
                        } else {
                            cmvVarX = cmvVarX.x;
                        }
                    }
                }
                cmvVarX = null;
                break;
            }
        } else {
            cmvVarX = null;
            break;
        }
        if (cmvVarX == null) {
            defpackage.dck dckVarB = defpackage.cfo.B(datVar, 4);
            if (dckVarB.C() == datVar.L() && (dckVarB = dckVarB.z) == null) {
                defpackage.aooh.g();
            }
            dckVarB.G(cqfVarB, q().a);
            return;
        }
        defpackage.cfc cfcVar = null;
        while (cmvVarX != null) {
            if (cmvVarX instanceof defpackage.dat) {
                defpackage.dat datVar2 = (defpackage.dat) cmvVarX;
                defpackage.cso csoVar = q().a;
                defpackage.dck dckVarB2 = defpackage.cfo.B(datVar2, 4);
                dckVarB2.w.l().E(cqfVarB, defpackage.dpy.l(dckVarB2.c), dckVarB2, datVar2, csoVar);
            } else if ((cmvVarX.u & 4) != 0 && (cmvVarX instanceof defpackage.dap)) {
                int i2 = 0;
                for (defpackage.cmv cmvVar = ((defpackage.dap) cmvVarX).F; cmvVar != null; cmvVar = cmvVar.x) {
                    if ((cmvVar.u & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            cmvVarX = cmvVar;
                        } else {
                            if (cfcVar == null) {
                                cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                            }
                            if (cmvVarX != null) {
                                cfcVar.n(cmvVarX);
                            }
                            cfcVar.n(cmvVar);
                            cmvVarX = null;
                        }
                    }
                }
                if (i2 != 1) {
                }
            }
            cmvVarX = defpackage.cfo.x(cfcVar);
        }
    }

    public final void E(defpackage.cqf cqfVar, long j, defpackage.dck dckVar, defpackage.dat datVar, defpackage.cso csoVar) {
        defpackage.dat datVar2 = this.a;
        this.a = datVar;
        defpackage.csh cshVar = this.b;
        defpackage.csg csgVar = cshVar.b;
        defpackage.dpq dpqVarP = dckVar.p();
        defpackage.dpf dpfVarC = csgVar.c();
        defpackage.dpq dpqVarD = csgVar.d();
        defpackage.cqf cqfVarB = csgVar.b();
        long jA = csgVar.a();
        defpackage.cso csoVar2 = csgVar.a;
        csgVar.f(dckVar);
        csgVar.g(dpqVarP);
        csgVar.e(cqfVar);
        csgVar.h(j);
        csgVar.a = csoVar;
        cqfVar.g();
        try {
            datVar.o(this);
            cqfVar.e();
            defpackage.csg csgVar2 = cshVar.b;
            csgVar2.f(dpfVarC);
            csgVar2.g(dpqVarD);
            csgVar2.e(cqfVarB);
            csgVar2.h(jA);
            csgVar2.a = csoVar2;
            this.a = datVar2;
        } catch (java.lang.Throwable th) {
            cqfVar.e();
            defpackage.csg csgVar3 = cshVar.b;
            csgVar3.f(dpfVarC);
            csgVar3.g(dpqVarD);
            csgVar3.e(cqfVarB);
            csgVar3.h(jA);
            csgVar3.a = csoVar2;
            throw th;
        }
    }

    @Override // defpackage.dpf
    public final float a() {
        return this.b.a();
    }

    @Override // defpackage.dpl
    public final float b() {
        return this.b.b();
    }

    @Override // defpackage.dpl
    public final float dh(long j) {
        return defpackage.dfd.m(this.b, j);
    }

    @Override // defpackage.dpf
    public final float di(float f) {
        return (f / this.b.a()) + 0.0f;
    }

    @Override // defpackage.dpf
    public final float dj(int i) {
        return (i / this.b.a()) + 0.0f;
    }

    @Override // defpackage.dpf
    public final float dk(long j) {
        return defpackage.dfd.o(this.b, j);
    }

    @Override // defpackage.dpf
    public final float dl(float f) {
        return f * this.b.a();
    }

    @Override // defpackage.dpf
    /* JADX INFO: renamed from: do */
    public final int mo1do(long j) {
        throw null;
    }

    @Override // defpackage.dpf
    public final int dp(float f) {
        return defpackage.dfd.p(this.b, f);
    }

    @Override // defpackage.dpf
    public final long dq(long j) {
        return defpackage.dfd.q(this.b, j);
    }

    @Override // defpackage.dpf
    public final long dr(long j) {
        return defpackage.dfd.r(this.b, j);
    }

    @Override // defpackage.dpl
    public final long ds(float f) {
        return defpackage.dfd.n(this.b, f);
    }

    @Override // defpackage.dpf
    public final long dt(float f) {
        defpackage.csh cshVar = this.b;
        return defpackage.dfd.n(cshVar, (f / cshVar.a()) + 0.0f);
    }

    @Override // defpackage.csj
    public final long n() {
        return defpackage.cdh.q(this.b.b.a());
    }

    @Override // defpackage.csj
    public final long o() {
        return this.b.b.a();
    }

    @Override // defpackage.csj
    public final defpackage.dpq p() {
        return this.b.p();
    }

    @Override // defpackage.csj
    public final defpackage.csg q() {
        return this.b.b;
    }

    @Override // defpackage.csj
    public final void r(long j, long j2, long j3, float f, int i) {
        this.b.r(j, j2, j3, f, i);
    }

    @Override // defpackage.csj
    public final void s(long j, long j2, long j3, float f, defpackage.den denVar, defpackage.cqh cqhVar, int i) {
        this.b.s(j, j2, j3, f, denVar, cqhVar, i);
    }

    @Override // defpackage.csj
    public final void t(defpackage.cqd cqdVar, long j, long j2, float f, defpackage.den denVar, int i) {
        this.b.t(cqdVar, j, j2, f, denVar, i);
    }

    @Override // defpackage.csj
    public final void u(long j, float f, float f2, long j2, long j3, defpackage.den denVar) {
        this.b.u(j, f, f2, j2, j3, denVar);
    }

    @Override // defpackage.csj
    public final void v(defpackage.cqd cqdVar, float f, long j, defpackage.den denVar) {
        this.b.v(cqdVar, f, j, denVar);
    }

    @Override // defpackage.csj
    public final void w(defpackage.cqd cqdVar, long j, long j2, long j3, float f, defpackage.den denVar) {
        this.b.w(cqdVar, j, j2, j3, f, denVar);
    }

    @Override // defpackage.csj
    public final void x(long j, long j2, long j3, long j4, defpackage.den denVar, float f) {
        this.b.x(j, j2, j3, j4, denVar, f);
    }

    @Override // defpackage.csj
    public final void y(defpackage.cpx cpxVar, defpackage.cqd cqdVar, float f, defpackage.den denVar, int i) {
        this.b.y(cpxVar, cqdVar, f, denVar, i);
    }

    @Override // defpackage.csj
    public final void z(defpackage.cpu cpuVar, long j, long j2, float f, defpackage.den denVar, defpackage.cqh cqhVar, int i, int i2) {
        this.b.z(cpuVar, j, j2, f, denVar, cqhVar, i, i2);
    }
}
