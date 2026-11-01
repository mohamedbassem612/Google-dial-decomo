package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class csh implements defpackage.csj {
    public final defpackage.csf a = new defpackage.csf(null);
    public final defpackage.csg b = new defpackage.csg(this);
    private defpackage.cpv c;
    private defpackage.cpv d;

    private final defpackage.cpv D() {
        defpackage.cpv cpvVar = this.d;
        if (cpvVar != null) {
            return cpvVar;
        }
        defpackage.cpv cpvVar2 = new defpackage.cpv();
        cpvVar2.r(1);
        this.d = cpvVar2;
        return cpvVar2;
    }

    private final defpackage.cpv E(defpackage.cqd cqdVar, defpackage.den denVar, float f, defpackage.cqh cqhVar, int i, int i2) {
        defpackage.cpv cpvVarF = F(denVar);
        if (cqdVar != null) {
            cqdVar.a(this.b.a(), cpvVarF, f);
        } else {
            if (cpvVarF.c != null) {
                cpvVarF.m(null);
            }
            if (cpvVarF.g() != -72057594037927936L) {
                cpvVarF.j(-72057594037927936L);
            }
            if (cpvVarF.a() != f) {
                cpvVarF.h(f);
            }
        }
        if (!defpackage.aooh.n(cpvVarF.d, cqhVar)) {
            cpvVarF.k(cqhVar);
        }
        if (cpvVarF.b != i) {
            cpvVarF.i(i);
        }
        if (cpvVarF.d() != i2) {
            cpvVarF.l(i2);
        }
        return cpvVarF;
    }

    private final defpackage.cpv F(defpackage.den denVar) {
        if (defpackage.aooh.n(denVar, defpackage.csl.a)) {
            defpackage.cpv cpvVar = this.c;
            if (cpvVar != null) {
                return cpvVar;
            }
            defpackage.cpv cpvVar2 = new defpackage.cpv();
            cpvVar2.r(0);
            this.c = cpvVar2;
            return cpvVar2;
        }
        if (!(denVar instanceof defpackage.csm)) {
            throw new defpackage.aois();
        }
        defpackage.cpv cpvVarD = D();
        float fC = cpvVarD.c();
        defpackage.csm csmVar = (defpackage.csm) denVar;
        float f = csmVar.a;
        if (fC != f) {
            cpvVarD.q(f);
        }
        int iE = cpvVarD.e();
        int i = csmVar.c;
        if (iE != i) {
            cpvVarD.n(i);
        }
        float fB = cpvVarD.b();
        float f2 = csmVar.b;
        if (fB != f2) {
            cpvVarD.p(f2);
        }
        int iF = cpvVarD.f();
        int i2 = csmVar.d;
        if (iF != i2) {
            cpvVarD.o(i2);
        }
        cpy cpyVar = csmVar.e;
        return cpvVarD;
    }

    private final defpackage.cpv G(long j, defpackage.den denVar, float f, defpackage.cqh cqhVar, int i) {
        defpackage.cpv cpvVarF = F(denVar);
        if (f != 1.0f) {
            float fA = defpackage.cqg.a(j) * f;
            float fD = defpackage.cqg.d(j);
            float fC = defpackage.cqg.c(j);
            float fB = defpackage.cqg.b(j);
            float[] fArr = defpackage.crp.a;
            j = defpackage.cfd.N(fD, fC, fB, fA, defpackage.crp.y[(int) (j & 63)]);
        }
        if (cpvVarF.g() != j) {
            cpvVarF.j(j);
        }
        if (cpvVarF.c != null) {
            cpvVarF.m(null);
        }
        if (!defpackage.aooh.n(cpvVarF.d, cqhVar)) {
            cpvVarF.k(cqhVar);
        }
        if (cpvVarF.b != i) {
            cpvVarF.i(i);
        }
        if (cpvVarF.d() != 1) {
            cpvVarF.l(1);
        }
        return cpvVarF;
    }

    @Override // defpackage.csj
    public final void A(defpackage.cpu cpuVar, float f, defpackage.den denVar, defpackage.cqh cqhVar) {
        this.a.c.r(cpuVar, E(null, denVar, f, cqhVar, 3, 1));
    }

    @Override // defpackage.csj
    public final void B(defpackage.cpx cpxVar, long j, float f, defpackage.den denVar) {
        this.a.c.p(cpxVar, G(j, denVar, f, null, 3));
    }

    @Override // defpackage.csj
    public final void C(long j, float f, long j2, float f2, defpackage.den denVar) {
        this.a.c.j(j2, f, G(j, denVar, f2, null, 3));
    }

    @Override // defpackage.dpf
    public final float a() {
        return this.a.a.a();
    }

    @Override // defpackage.dpl
    public final float b() {
        return this.a.a.b();
    }

    @Override // defpackage.dpl
    public final /* synthetic */ float dh(long j) {
        return defpackage.dfd.m(this, j);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float di(float f) {
        return (f / a()) + 0.0f;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dj(int i) {
        return (i / a()) + 0.0f;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dk(long j) {
        return defpackage.dfd.o(this, j);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ float dl(float f) {
        return f * a();
    }

    @Override // defpackage.dpf
    /* JADX INFO: renamed from: do */
    public final /* synthetic */ int mo1do(long j) {
        throw null;
    }

    @Override // defpackage.dpf
    public final /* synthetic */ int dp(float f) {
        return defpackage.dfd.p(this, f);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dq(long j) {
        return defpackage.dfd.q(this, j);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dr(long j) {
        return defpackage.dfd.r(this, j);
    }

    @Override // defpackage.dpl
    public final /* synthetic */ long ds(float f) {
        return defpackage.dfd.n(this, f);
    }

    @Override // defpackage.dpf
    public final /* synthetic */ long dt(float f) {
        return defpackage.dfd.n(this, (f / a()) + 0.0f);
    }

    @Override // defpackage.csj
    public final /* synthetic */ long n() {
        return defpackage.cdh.q(this.b.a());
    }

    @Override // defpackage.csj
    public final /* synthetic */ long o() {
        return this.b.a();
    }

    @Override // defpackage.csj
    public final defpackage.dpq p() {
        return this.a.b;
    }

    @Override // defpackage.csj
    public final defpackage.csg q() {
        return this.b;
    }

    @Override // defpackage.csj
    public final void r(long j, long j2, long j3, float f, int i) {
        defpackage.cqf cqfVar = this.a.c;
        defpackage.cpv cpvVarD = D();
        if (cpvVarD.g() != j) {
            cpvVarD.j(j);
        }
        if (cpvVarD.c != null) {
            cpvVarD.m(null);
        }
        if (!defpackage.aooh.n(cpvVarD.d, null)) {
            cpvVarD.k(null);
        }
        if (cpvVarD.b != 3) {
            cpvVarD.i(3);
        }
        if (cpvVarD.c() != f) {
            cpvVarD.q(f);
        }
        if (cpvVarD.b() != 4.0f) {
            cpvVarD.p(4.0f);
        }
        if (cpvVarD.e() != i) {
            cpvVarD.n(i);
        }
        if (cpvVarD.f() != 0) {
            cpvVarD.o(0);
        }
        if (cpvVarD.d() != 1) {
            cpvVarD.l(1);
        }
        cqfVar.k(j2, j3, cpvVarD);
    }

    @Override // defpackage.csj
    public final void s(long j, long j2, long j3, float f, defpackage.den denVar, defpackage.cqh cqhVar, int i) {
        int i2 = (int) (j2 & 4294967295L);
        int i3 = (int) (j2 >> 32);
        this.a.c.l(java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i3) + java.lang.Float.intBitsToFloat((int) (j3 >> 32)), java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L)), G(j, denVar, f, cqhVar, i));
    }

    @Override // defpackage.csj
    public final void t(defpackage.cqd cqdVar, long j, long j2, float f, defpackage.den denVar, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = (int) (j >> 32);
        this.a.c.l(java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i3) + java.lang.Float.intBitsToFloat((int) (j2 >> 32)), java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)), E(cqdVar, denVar, f, null, i, 1));
    }

    @Override // defpackage.csj
    public final void u(long j, float f, float f2, long j2, long j3, defpackage.den denVar) {
        int i = (int) (j2 & 4294967295L);
        int i2 = (int) (j2 >> 32);
        this.a.c.n(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2) + java.lang.Float.intBitsToFloat((int) (j3 >> 32)), java.lang.Float.intBitsToFloat(i) + java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L)), f, f2, G(j, denVar, 1.0f, null, 3));
    }

    @Override // defpackage.csj
    public final void v(defpackage.cqd cqdVar, float f, long j, defpackage.den denVar) {
        this.a.c.j(j, f, E(cqdVar, denVar, 1.0f, null, 3, 1));
    }

    @Override // defpackage.csj
    public final void w(defpackage.cqd cqdVar, long j, long j2, long j3, float f, defpackage.den denVar) {
        int i = (int) (j & 4294967295L);
        int i2 = (int) (j >> 32);
        this.a.c.m(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat((int) (j2 >> 32)) + java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i) + java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j3 >> 32)), java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L)), E(cqdVar, denVar, f, null, 3, 1));
    }

    @Override // defpackage.csj
    public final void x(long j, long j2, long j3, long j4, defpackage.den denVar, float f) {
        int i = (int) (j2 & 4294967295L);
        int i2 = (int) (j2 >> 32);
        this.a.c.m(java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat((int) (j3 >> 32)) + java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i) + java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j4 >> 32)), java.lang.Float.intBitsToFloat((int) (j4 & 4294967295L)), G(j, denVar, f, null, 3));
    }

    @Override // defpackage.csj
    public final void y(defpackage.cpx cpxVar, defpackage.cqd cqdVar, float f, defpackage.den denVar, int i) {
        this.a.c.p(cpxVar, E(cqdVar, denVar, f, null, i, 1));
    }

    @Override // defpackage.csj
    public final void z(defpackage.cpu cpuVar, long j, long j2, float f, defpackage.den denVar, defpackage.cqh cqhVar, int i, int i2) {
        this.a.c.s(cpuVar, j, j2, E(null, denVar, f, cqhVar, i, i2));
    }
}
