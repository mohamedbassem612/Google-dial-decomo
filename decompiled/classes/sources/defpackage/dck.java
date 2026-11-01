package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class dck extends defpackage.dbt implements defpackage.cyd, defpackage.cxi, defpackage.dcw {
    public static final defpackage.dcj u;
    public static final defpackage.dcj v;
    public defpackage.dck A;
    public float C;
    public defpackage.cpn E;
    public defpackage.cpn F;
    public boolean G;
    public boolean H;
    public defpackage.cso I;
    public defpackage.cqf J;
    public boolean K;
    public defpackage.dct L;
    private boolean M;
    private defpackage.aonj N;
    private defpackage.dpf O;
    private defpackage.dpq P;
    private defpackage.cyf R;
    private defpackage.cpl S;
    private defpackage.dba T;
    private defpackage.aonn U;
    private final defpackage.aomy V;
    private defpackage.cso W;
    private defpackage.ado X;
    private boolean h;
    public final defpackage.dbk w;
    public boolean x;
    public boolean y;
    public defpackage.dck z;
    private static final defpackage.aonj f = new defpackage.ckc(17);
    public static final defpackage.aonj s = new defpackage.ckc(18);
    public static final defpackage.cra t = new defpackage.cra();
    private static final defpackage.dba g = new defpackage.dba();
    private float Q = 1.0f;
    public long B = 0;
    public defpackage.crd D = defpackage.cqz.a;

    static {
        defpackage.cqt.e();
        u = new defpackage.dch();
        v = new defpackage.dci();
    }

    public dck(defpackage.dbk dbkVar) {
        this.w = dbkVar;
        this.O = dbkVar.r;
        this.P = dbkVar.s;
        defpackage.cpn cpnVar = defpackage.cpn.a;
        this.E = cpnVar;
        this.F = cpnVar;
        this.V = new defpackage.bpa(this, 19);
    }

    private final long H(defpackage.dck dckVar, long j, boolean z) {
        if (dckVar == this) {
            return j;
        }
        defpackage.dck dckVar2 = this.A;
        return (dckVar2 == null || defpackage.aooh.n(dckVar, dckVar2)) ? Z(j, z) : Z(dckVar2.H(dckVar, j, z), z);
    }

    private final defpackage.aonn I() {
        defpackage.aonn aonnVar = this.U;
        if (aonnVar != null) {
            return aonnVar;
        }
        defpackage.bec becVar = new defpackage.bec(this, new defpackage.bpa(this, 18), 7, null);
        this.U = becVar;
        return becVar;
    }

    private final void aD(defpackage.dck dckVar, defpackage.cpl cplVar, boolean z) {
        if (dckVar != this) {
            defpackage.dck dckVar2 = this.A;
            if (dckVar2 != null) {
                dckVar2.aD(dckVar, cplVar, z);
            }
            long j = this.B;
            float f2 = (int) (j >> 32);
            cplVar.a -= f2;
            cplVar.c -= f2;
            float f3 = (int) (j & 4294967295L);
            cplVar.b -= f3;
            cplVar.d -= f3;
            defpackage.dct dctVar = this.L;
            if (dctVar != null) {
                dctVar.d(cplVar, true);
                if (this.M && z) {
                    long j2 = this.c;
                    cplVar.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
            }
        }
    }

    private final void aE(defpackage.cmv cmvVar, defpackage.dcj dcjVar, long j, defpackage.dax daxVar, int i, boolean z) {
        if (cmvVar == null) {
            F(dcjVar, j, daxVar, i, z);
            return;
        }
        if (!dcjVar.d(cmvVar)) {
            aE(defpackage.cfo.q(cmvVar, dcjVar.a()), dcjVar, j, daxVar, i, z);
            return;
        }
        int i2 = daxVar.a;
        daxVar.d(i2 + 1, daxVar.a());
        daxVar.a++;
        daxVar.b.q(cmvVar);
        daxVar.c.b(defpackage.wl.e(-1.0f, z, false));
        aE(defpackage.cfo.q(cmvVar, dcjVar.a()), dcjVar, j, daxVar, i, z);
        daxVar.a = i2;
    }

    private final void aF(defpackage.cmv cmvVar, defpackage.dcj dcjVar, long j, defpackage.dax daxVar, int i, boolean z, float f2) {
        if (cmvVar == null) {
            F(dcjVar, j, daxVar, i, z);
            return;
        }
        if (!dcjVar.d(cmvVar)) {
            aF(defpackage.cfo.q(cmvVar, dcjVar.a()), dcjVar, j, daxVar, i, z, f2);
            return;
        }
        int i2 = daxVar.a;
        daxVar.d(i2 + 1, daxVar.a());
        daxVar.a++;
        daxVar.b.q(cmvVar);
        daxVar.c.b(defpackage.wl.e(f2, z, false));
        at(defpackage.cfo.q(cmvVar, dcjVar.a()), dcjVar, j, daxVar, i, z, f2, true);
        daxVar.a = i2;
    }

    private final void aG(defpackage.cmv cmvVar, defpackage.dcj dcjVar, long j, defpackage.dax daxVar, int i, boolean z, float f2) {
        if (cmvVar == null) {
            F(dcjVar, j, daxVar, i, z);
        } else if (!dcjVar.d(cmvVar)) {
            aG(defpackage.cfo.q(cmvVar, dcjVar.a()), dcjVar, j, daxVar, i, z, f2);
        } else {
            dcjVar.f(cmvVar);
            at(defpackage.cfo.q(cmvVar, dcjVar.a()), dcjVar, j, daxVar, i, z, f2, false);
        }
    }

    private final boolean aH() {
        return this.G && !this.E.i();
    }

    private final boolean aI(int i) {
        int i2 = defpackage.dcl.a;
        defpackage.cmv cmvVarAd = ad((i & 128) != 0);
        return (cmvVarAd == null || (cmvVarAd.L().v & i) == 0) ? false : true;
    }

    private static final defpackage.dck aJ(defpackage.cxi cxiVar) {
        defpackage.dck dckVarA;
        defpackage.cya cyaVar = cxiVar instanceof defpackage.cya ? (defpackage.cya) cxiVar : null;
        if (cyaVar != null && (dckVarA = cyaVar.a()) != null) {
            return dckVarA;
        }
        if (cxiVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        }
        return (defpackage.dck) cxiVar;
    }

    @Override // defpackage.dbt, defpackage.dcw
    public final boolean B() {
        return (this.L == null || this.h || !this.w.al()) ? false : true;
    }

    public abstract defpackage.cmv C();

    public abstract defpackage.dbu D();

    public abstract void E();

    public void F(defpackage.dcj dcjVar, long j, defpackage.dax daxVar, int i, boolean z) {
        defpackage.dck dckVar = this.z;
        if (dckVar != null) {
            dckVar.al(dcjVar, dckVar.Z(j, true), daxVar, i, z);
        }
    }

    public void G(defpackage.cqf cqfVar, defpackage.cso csoVar) {
        throw null;
    }

    @Override // defpackage.dbt
    public final long J() {
        return this.B;
    }

    @Override // defpackage.dbt
    public final defpackage.cyf L() {
        defpackage.cyf cyfVar = this.R;
        if (cyfVar != null) {
            return cyfVar;
        }
        throw new java.lang.IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // defpackage.dbt, defpackage.dby
    public final defpackage.dbk M() {
        return this.w;
    }

    @Override // defpackage.dbt
    public final defpackage.dbt N() {
        return this.z;
    }

    @Override // defpackage.dbt
    public final defpackage.dbt O() {
        return this.A;
    }

    @Override // defpackage.dbt
    public final void R() {
        defpackage.cso csoVar = this.W;
        long j = this.B;
        if (csoVar != null) {
            y(j, this.C, csoVar);
        } else {
            dg(j, this.C, this.N);
        }
    }

    @Override // defpackage.dbt
    public final boolean V() {
        return this.R != null;
    }

    protected final float X(long j, long j2) {
        if (x() < java.lang.Float.intBitsToFloat((int) (j2 >> 32)) || w() < java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            long jY = Y(j2);
            float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jY >> 32));
            float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (jY & 4294967295L));
            float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j >> 32));
            float fMax = java.lang.Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - x());
            float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
            float fMax2 = java.lang.Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - w());
            long jFloatToRawIntBits = ((long) java.lang.Float.floatToRawIntBits(fMax)) << 32;
            long jFloatToRawIntBits2 = ((long) java.lang.Float.floatToRawIntBits(fMax2)) & 4294967295L;
            if (fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) {
                long j3 = jFloatToRawIntBits | jFloatToRawIntBits2;
                int i = (int) (j3 >> 32);
                if (java.lang.Float.intBitsToFloat(i) <= fIntBitsToFloat) {
                    int i2 = (int) (j3 & 4294967295L);
                    if (java.lang.Float.intBitsToFloat(i2) <= fIntBitsToFloat2) {
                        float fIntBitsToFloat5 = java.lang.Float.intBitsToFloat(i);
                        float fIntBitsToFloat6 = java.lang.Float.intBitsToFloat(i2);
                        return (fIntBitsToFloat5 * fIntBitsToFloat5) + (fIntBitsToFloat6 * fIntBitsToFloat6);
                    }
                }
            }
        }
        return Float.POSITIVE_INFINITY;
    }

    protected final long Y(long j) {
        float fX;
        float fW;
        if (aH()) {
            defpackage.cpn cpnVar = this.E;
            fX = cpnVar.d - cpnVar.b;
        } else {
            fX = x();
        }
        if (aH()) {
            defpackage.cpn cpnVar2 = this.E;
            fW = cpnVar2.e - cpnVar2.c;
        } else {
            fW = w();
        }
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) - fX;
        float fIntBitsToFloat2 = (java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - fW) / 2.0f;
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Math.max(0.0f, fIntBitsToFloat / 2.0f))) << 32) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Math.max(0.0f, fIntBitsToFloat2))) & 4294967295L);
    }

    public final long Z(long j, boolean z) {
        if (z || !this.l) {
            long j2 = this.B;
            j = (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32);
        }
        defpackage.dct dctVar = this.L;
        return dctVar != null ? dctVar.a(j, true) : j;
    }

    @Override // defpackage.dpf
    public final float a() {
        return this.w.r.a();
    }

    public final boolean aA() {
        float fA;
        defpackage.cso csoVar = this.W;
        if (csoVar != null) {
            fA = csoVar.a();
        } else {
            fA = this.L != null ? this.Q : 1.0f;
        }
        if (fA <= 0.0f) {
            return true;
        }
        defpackage.dck dckVar = this.A;
        if (dckVar != null) {
            return dckVar.aA();
        }
        return false;
    }

    protected final boolean aB(long j) {
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        defpackage.dct dctVar = this.L;
        return dctVar == null || !this.M || dctVar.j(j);
    }

    protected final void aC(defpackage.cqf cqfVar, defpackage.cpv cpvVar) {
        long j = this.c;
        cqfVar.l(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, cpvVar);
    }

    public final long aa() {
        return this.O.dr(this.w.t.e());
    }

    public final long ab(long j, boolean z) {
        defpackage.dct dctVar = this.L;
        if (dctVar != null) {
            j = dctVar.a(j, false);
        }
        return (z || !this.l) ? defpackage.dfd.k(j, this.B) : j;
    }

    public final defpackage.cmv ac(int i) {
        int i2 = defpackage.dcl.a;
        defpackage.cmv cmvVar = C().w;
        if (cmvVar != null) {
            for (defpackage.cmv cmvVarAd = ad(false); cmvVarAd != null && (cmvVarAd.v & i) != 0; cmvVarAd = cmvVarAd.x) {
                if ((cmvVarAd.u & i) != 0) {
                    return cmvVarAd;
                }
                if (cmvVarAd == cmvVar) {
                    break;
                }
            }
        }
        return null;
    }

    public final defpackage.cmv ad(boolean z) {
        defpackage.cmv cmvVarC;
        defpackage.dbk dbkVar = this.w;
        if (dbkVar.p() == this) {
            return dbkVar.v.f;
        }
        defpackage.dck dckVar = this.A;
        if (z) {
            if (dckVar != null && (cmvVarC = dckVar.C()) != null) {
                return cmvVarC.x;
            }
        } else if (dckVar != null) {
            return dckVar.C();
        }
        return null;
    }

    protected final defpackage.cpl ae() {
        defpackage.cpl cplVar = this.S;
        if (cplVar != null) {
            return cplVar;
        }
        defpackage.cpl cplVar2 = new defpackage.cpl();
        this.S = cplVar2;
        return cplVar2;
    }

    public final defpackage.cpn af(boolean z) {
        if (u()) {
            defpackage.cxi cxiVarG = defpackage.den.G(this);
            defpackage.cpl cplVarAe = ae();
            long jY = Y(aa());
            float f2 = aH() ? this.E.b : 0.0f;
            float f3 = aH() ? this.E.c : 0.0f;
            float fX = aH() ? this.E.d : x();
            float fW = aH() ? this.E.e : w();
            int i = (int) (jY >> 32);
            cplVarAe.a = f2 - java.lang.Float.intBitsToFloat(i);
            int i2 = (int) (jY & 4294967295L);
            cplVarAe.b = f3 - java.lang.Float.intBitsToFloat(i2);
            cplVarAe.c = fX + java.lang.Float.intBitsToFloat(i);
            cplVarAe.d = fW + java.lang.Float.intBitsToFloat(i2);
            while (this != cxiVarG) {
                this.av(cplVarAe, false, true, z);
                if (!cplVarAe.c()) {
                    this = this.A;
                    if (this == null) {
                        defpackage.aooh.g();
                    }
                }
            }
            return defpackage.cdh.y(cplVarAe);
        }
        return defpackage.cpn.a;
    }

    public final defpackage.dah ag() {
        return this.w.w.o;
    }

    public final defpackage.dck ah(defpackage.dck dckVar) {
        defpackage.dbk dbkVar = dckVar.w;
        defpackage.dbk dbkVar2 = this.w;
        if (dbkVar == dbkVar2) {
            defpackage.cmv cmvVarC = dckVar.C();
            defpackage.cmv cmvVarC2 = C();
            if (!cmvVarC2.L().D) {
                defpackage.cwh.d("visitLocalAncestors called on an unattached node");
            }
            defpackage.cmv cmvVarL = cmvVarC2.L();
            while (true) {
                cmvVarL = cmvVarL.w;
                if (cmvVarL == null) {
                    return this;
                }
                if ((cmvVarL.u & 2) == 0 || cmvVarL != cmvVarC) {
                }
            }
        } else {
            defpackage.dbk dbkVarK = dbkVar;
            while (dbkVarK.m > dbkVar2.m) {
                dbkVarK = dbkVarK.k();
                if (dbkVarK == null) {
                    defpackage.aooh.g();
                }
            }
            defpackage.dbk dbkVarK2 = dbkVar2;
            while (dbkVarK2.m > dbkVarK.m) {
                dbkVarK2 = dbkVarK2.k();
                if (dbkVarK2 == null) {
                    defpackage.aooh.g();
                }
            }
            while (dbkVarK != dbkVarK2) {
                dbkVarK = dbkVarK.k();
                dbkVarK2 = dbkVarK2.k();
                if (dbkVarK == null || dbkVarK2 == null) {
                    throw new java.lang.IllegalArgumentException("layouts are not part of the same hierarchy");
                }
            }
            if (dbkVarK2 == dbkVar2) {
                return this;
            }
            if (dbkVarK != dbkVar) {
                return dbkVarK.o();
            }
        }
        return dckVar;
    }

    public final defpackage.dcy ai() {
        return ((defpackage.deg) defpackage.dbn.a(this.w)).u;
    }

    public final void aj(defpackage.cqf cqfVar, defpackage.cso csoVar) {
        defpackage.dct dctVar = this.L;
        if (dctVar != null) {
            dctVar.c(cqfVar, csoVar);
            return;
        }
        long j = this.B;
        float f2 = (int) (j >> 32);
        float f3 = (int) (j & 4294967295L);
        cqfVar.i(f2, f3);
        ak(cqfVar, csoVar);
        cqfVar.i(-f2, -f3);
    }

    public final void ak(defpackage.cqf cqfVar, defpackage.cso csoVar) {
        defpackage.dck dckVar;
        defpackage.cqf cqfVar2;
        defpackage.cso csoVar2;
        defpackage.cmv cmvVarAc = ac(4);
        if (cmvVarAc == null) {
            G(cqfVar, csoVar);
            return;
        }
        defpackage.dbm dbmVarL = this.w.l();
        long jL = defpackage.dpy.l(this.c);
        defpackage.cfc cfcVar = null;
        while (cmvVarAc != null) {
            if (cmvVarAc instanceof defpackage.dat) {
                dckVar = this;
                cqfVar2 = cqfVar;
                csoVar2 = csoVar;
                dbmVarL.E(cqfVar2, jL, dckVar, (defpackage.dat) cmvVarAc, csoVar2);
            } else {
                dckVar = this;
                cqfVar2 = cqfVar;
                csoVar2 = csoVar;
                if ((cmvVarAc.u & 4) != 0 && (cmvVarAc instanceof defpackage.dap)) {
                    int i = 0;
                    for (defpackage.cmv cmvVar = ((defpackage.dap) cmvVarAc).F; cmvVar != null; cmvVar = cmvVar.x) {
                        if ((cmvVar.u & 4) != 0) {
                            i++;
                            if (i == 1) {
                                cmvVarAc = cmvVar;
                            } else {
                                if (cfcVar == null) {
                                    cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                }
                                if (cmvVarAc != null) {
                                    cfcVar.n(cmvVarAc);
                                }
                                cfcVar.n(cmvVar);
                                cmvVarAc = null;
                            }
                        }
                    }
                    if (i != 1) {
                    }
                }
                cqfVar = cqfVar2;
                this = dckVar;
                csoVar = csoVar2;
            }
            cmvVarAc = defpackage.cfo.x(cfcVar);
            cqfVar = cqfVar2;
            this = dckVar;
            csoVar = csoVar2;
        }
    }

    public final void al(defpackage.dcj dcjVar, long j, defpackage.dax daxVar, int i, boolean z) {
        float fX;
        defpackage.dck dckVar;
        long j2;
        boolean z2;
        boolean z3;
        int i2 = i;
        defpackage.cmv cmvVarAc = ac(dcjVar.a());
        if (!aB(j)) {
            if (i2 == 1) {
                float fX2 = X(j, aa());
                if ((java.lang.Float.floatToRawIntBits(fX2) & Integer.MAX_VALUE) >= 2139095040 || !daxVar.e(fX2, false)) {
                    return;
                }
                aF(cmvVarAc, dcjVar, j, daxVar, 1, false, fX2);
                return;
            }
            return;
        }
        if (cmvVarAc == null) {
            F(dcjVar, j, daxVar, i, z);
            return;
        }
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (4294967295L & j));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < x() && fIntBitsToFloat2 < w()) {
            aE(cmvVarAc, dcjVar, j, daxVar, i2, z);
            return;
        }
        if (i2 == 1) {
            fX = X(j, aa());
            i2 = 1;
        } else {
            fX = Float.POSITIVE_INFINITY;
        }
        if ((java.lang.Float.floatToRawIntBits(fX) & Integer.MAX_VALUE) < 2139095040) {
            z2 = z;
            dckVar = this;
            j2 = j;
            if (daxVar.e(fX, z2)) {
                z3 = true;
            }
            dckVar.at(cmvVarAc, dcjVar, j2, daxVar, i2, z2, fX, z3);
        }
        dckVar = this;
        j2 = j;
        z2 = z;
        z3 = false;
        dckVar.at(cmvVarAc, dcjVar, j2, daxVar, i2, z2, fX, z3);
    }

    public final void am() {
        defpackage.dct dctVar = this.L;
        if (dctVar != null) {
            dctVar.invalidate();
            return;
        }
        defpackage.dck dckVar = this.A;
        if (dckVar != null) {
            dckVar.am();
        }
    }

    public final void an() {
        this.w.w.f();
    }

    public final void ao() {
        defpackage.dct dctVar = this.L;
        if (dctVar != null) {
            dctVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [cmv] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [cmv] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [cfc] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [cfc] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void ap() {
        if (aI(128)) {
            defpackage.cko ckoVar = (defpackage.cko) defpackage.ckw.i.i();
            defpackage.aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
            defpackage.cko ckoVarH = defpackage.cfd.h(ckoVar);
            try {
                int i = defpackage.dcl.a;
                defpackage.cmv cmvVarC = C();
                for (defpackage.cmv cmvVarAd = ad(true); cmvVarAd != null && (cmvVarAd.v & 128) != 0; cmvVarAd = cmvVarAd.x) {
                    if ((cmvVarAd.u & 128) != 0) {
                        ?? cfcVar = 0;
                        ?? X = cmvVarAd;
                        while (X != 0) {
                            if (X instanceof defpackage.dbz) {
                                ((defpackage.dbz) X).h(this.c);
                            } else if ((X.u & 128) != 0 && (X instanceof defpackage.dap)) {
                                defpackage.cmv cmvVar = ((defpackage.dap) X).F;
                                int i2 = 0;
                                while (cmvVar != null) {
                                    if ((cmvVar.u & 128) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            X = X;
                                            cfcVar = cfcVar;
                                            cfcVar = cfcVar;
                                            X = cmvVar;
                                        } else {
                                            if (cfcVar == 0) {
                                                cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                            }
                                            if (X != 0) {
                                                cfcVar.n(X);
                                            }
                                            cfcVar.n(cmvVar);
                                            X = 0;
                                        }
                                    } else {
                                        X = X;
                                        cfcVar = cfcVar;
                                    }
                                    cmvVar = cmvVar.x;
                                    X = X;
                                    cfcVar = cfcVar;
                                }
                                if (i2 != 1) {
                                    X = X;
                                    cfcVar = cfcVar;
                                } else {
                                    X = X;
                                    cfcVar = cfcVar;
                                }
                            }
                            X = defpackage.cfo.x(cfcVar);
                        }
                    }
                    if (cmvVarAd == cmvVarC) {
                        break;
                    }
                }
            } finally {
                defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [cmv] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [cmv] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [cfc] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [cfc] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public final void aq() {
        int i = defpackage.dcl.a;
        defpackage.cmv cmvVarC = C();
        for (defpackage.cmv cmvVarAd = ad(true); cmvVarAd != null && (cmvVarAd.v & 4194304) != 0; cmvVarAd = cmvVarAd.x) {
            if ((cmvVarAd.u & 4194304) != 0) {
                ?? X = cmvVarAd;
                ?? cfcVar = 0;
                while (X != 0) {
                    if (X instanceof defpackage.dbb) {
                        ((defpackage.dbb) X).g(this);
                    } else if ((X.u & 4194304) != 0 && (X instanceof defpackage.dap)) {
                        defpackage.cmv cmvVar = ((defpackage.dap) X).F;
                        int i2 = 0;
                        while (cmvVar != null) {
                            if ((cmvVar.u & 4194304) != 0) {
                                i2++;
                                if (i2 == 1) {
                                    X = X;
                                    cfcVar = cfcVar;
                                    cfcVar = cfcVar;
                                    X = cmvVar;
                                } else {
                                    if (cfcVar == 0) {
                                        cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                    }
                                    if (X != 0) {
                                        cfcVar.n(X);
                                    }
                                    cfcVar.n(cmvVar);
                                    X = 0;
                                }
                            } else {
                                X = X;
                                cfcVar = cfcVar;
                            }
                            cmvVar = cmvVar.x;
                            X = X;
                            cfcVar = cfcVar;
                        }
                        if (i2 != 1) {
                            X = X;
                            cfcVar = cfcVar;
                        } else {
                            X = X;
                            cfcVar = cfcVar;
                        }
                    }
                    X = defpackage.cfo.x(cfcVar);
                }
            }
            if (cmvVarAd == cmvVarC) {
                return;
            }
        }
    }

    public final void ar() {
        this.h = true;
        this.V.a();
        aw();
        if (this.B != 0) {
            this.w.O(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [cmv] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [cmv] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [cfc] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [cfc] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void as() {
        if (aI(1048576)) {
            int i = defpackage.dcl.a;
            defpackage.cmv cmvVar = C().w;
            if (cmvVar != null) {
                for (defpackage.cmv cmvVarAd = ad(false); cmvVarAd != null && (cmvVarAd.v & 1048576) != 0; cmvVarAd = cmvVarAd.x) {
                    if ((cmvVarAd.u & 1048576) != 0) {
                        ?? X = cmvVarAd;
                        ?? cfcVar = 0;
                        while (X != 0) {
                            if (X instanceof defpackage.ddj) {
                                ((defpackage.ddj) X).d();
                            } else if ((X.u & 1048576) != 0 && (X instanceof defpackage.dap)) {
                                defpackage.cmv cmvVar2 = ((defpackage.dap) X).F;
                                int i2 = 0;
                                X = X;
                                cfcVar = cfcVar;
                                while (cmvVar2 != null) {
                                    if ((cmvVar2.u & 1048576) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cfcVar = cfcVar;
                                            X = cmvVar2;
                                        } else {
                                            if (cfcVar == 0) {
                                                cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                            }
                                            if (X != 0) {
                                                cfcVar.n(X);
                                            }
                                            cfcVar.n(cmvVar2);
                                            X = 0;
                                        }
                                    }
                                    cmvVar2 = cmvVar2.x;
                                    X = X;
                                    cfcVar = cfcVar;
                                }
                                if (i2 != 1) {
                                }
                            }
                            X = defpackage.cfo.x(cfcVar);
                        }
                    }
                    if (cmvVarAd == cmvVar) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x015c A[PHI: r3
      0x015c: PHI (r3v8 ??) = (r3v2 ??), (r3v2 ??), (r3v10 ??) binds: [B:38:0x012c, B:40:0x0130, B:54:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [cmv] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [cmv] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [cfc] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8, types: [cfc] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final void at(defpackage.cmv cmvVar, defpackage.dcj dcjVar, long j, defpackage.dax daxVar, int i, boolean z, float f2, boolean z2) {
        ?? X;
        if (cmvVar == null) {
            F(dcjVar, j, daxVar, i, z);
            return;
        }
        defpackage.dcj dcjVar2 = dcjVar;
        int i2 = i;
        if (!dcjVar2.d(cmvVar)) {
            at(defpackage.cfo.q(cmvVar, dcjVar.a()), dcjVar, j, daxVar, i, z, f2, z2);
            return;
        }
        if (i2 == 3 || i2 == 4) {
            ?? r0 = cmvVar;
            ?? cfcVar = 0;
            while (r0 != 0) {
                if (r0 instanceof defpackage.ddb) {
                    int i3 = (int) (j >> 32);
                    float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i3);
                    p();
                    defpackage.dpq dpqVar = defpackage.dpq.a;
                    if (fIntBitsToFloat < 0.0f) {
                        break;
                    }
                    float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i3);
                    int iX = x();
                    p();
                    if (fIntBitsToFloat2 >= iX) {
                        break;
                    }
                    int i4 = (int) (j & 4294967295L);
                    if (java.lang.Float.intBitsToFloat(i4) < 0.0f || java.lang.Float.intBitsToFloat(i4) >= w()) {
                        break;
                        break;
                    }
                    dcf dcfVar = new dcf(this, cmvVar, dcjVar2, j, daxVar, i2, z, f2, z2);
                    int i5 = daxVar.a;
                    if (i5 == daxVar.a() - 1) {
                        daxVar.d(i5 + 1, daxVar.a());
                        daxVar.a++;
                        daxVar.b.q(cmvVar);
                        daxVar.c.b(defpackage.wl.e(0.0f, z, true));
                        dcfVar.a();
                        daxVar.a = i5;
                        return;
                    }
                    long jB = daxVar.b();
                    int i6 = daxVar.a;
                    if (!das.b(jB)) {
                        if (java.lang.Float.intBitsToFloat((int) (jB >> 32)) > 0.0f) {
                            int i7 = daxVar.a;
                            daxVar.d(i7 + 1, daxVar.a());
                            daxVar.a++;
                            daxVar.b.q(cmvVar);
                            daxVar.c.b(defpackage.wl.e(0.0f, z, true));
                            dcfVar.a();
                            daxVar.a = i7;
                            return;
                        }
                        return;
                    }
                    int iA = daxVar.a();
                    int i8 = iA - 1;
                    daxVar.a = i8;
                    daxVar.d(iA, daxVar.a());
                    daxVar.a++;
                    daxVar.b.q(cmvVar);
                    daxVar.c.b(defpackage.wl.e(0.0f, z, true));
                    dcfVar.a();
                    daxVar.a = i8;
                    if (java.lang.Float.intBitsToFloat((int) (daxVar.b() >> 32)) < 0.0f) {
                        daxVar.d(i6 + 1, daxVar.a + 1);
                    }
                    daxVar.a = i6;
                    return;
                }
                if ((r0.u & 16) == 0 || !(r0 instanceof defpackage.dap)) {
                    X = r0;
                    cfcVar = cfcVar;
                    X = defpackage.cfo.x(cfcVar);
                } else {
                    defpackage.cmv cmvVar2 = ((defpackage.dap) r0).F;
                    int i9 = 0;
                    while (cmvVar2 != null) {
                        if ((cmvVar2.u & 16) != 0) {
                            i9++;
                            if (i9 == 1) {
                                X = r0;
                                cfcVar = cfcVar;
                                cfcVar = cfcVar;
                                X = cmvVar2;
                            } else {
                                if (cfcVar == 0) {
                                    cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                }
                                if (X != 0) {
                                    cfcVar.n(X);
                                }
                                cfcVar.n(cmvVar2);
                                X = 0;
                            }
                        } else {
                            X = r0;
                            cfcVar = cfcVar;
                        }
                        cmvVar2 = cmvVar2.x;
                        X = X;
                        cfcVar = cfcVar;
                    }
                    if (i9 != 1) {
                        X = r0;
                        cfcVar = cfcVar;
                        X = defpackage.cfo.x(cfcVar);
                    } else {
                        X = r0;
                        cfcVar = cfcVar;
                    }
                }
                dcjVar2 = dcjVar;
                i2 = i;
                r0 = X;
                cfcVar = cfcVar;
            }
        }
        if (z2) {
            aF(cmvVar, dcjVar, j, daxVar, i, z, f2);
        } else {
            aG(cmvVar, dcjVar, j, daxVar, i, z, f2);
        }
    }

    public final void au(long j, float f2, defpackage.aonj aonjVar, defpackage.cso csoVar) {
        if (csoVar != null) {
            if (aonjVar != null) {
                defpackage.cwh.c("both ways to create layers shouldn't be used together");
            }
            if (this.W != csoVar) {
                this.W = null;
                ay(null, false);
                this.W = csoVar;
            }
            if (this.L == null) {
                defpackage.dbk dbkVar = this.w;
                defpackage.dcv dcvVarA = defpackage.dbn.a(dbkVar);
                defpackage.aonn aonnVarI = I();
                defpackage.aomy aomyVar = this.V;
                defpackage.dct dctVarO = dcvVarA.o(aonnVarI, aomyVar, csoVar);
                dctVarO.f(this.c);
                dctVarO.e(j);
                this.L = dctVarO;
                dbkVar.at();
                aomyVar.a();
            }
        } else {
            if (this.W != null) {
                this.W = null;
                ay(null, false);
            }
            ay(aonjVar, false);
        }
        if (this.B != j) {
            defpackage.dbk dbkVar2 = this.w;
            defpackage.dbn.a(dbkVar2).F(-4.0f);
            this.B = j;
            defpackage.dct dctVar = this.L;
            if (dctVar != null) {
                dctVar.e(j);
            } else {
                defpackage.dck dckVar = this.A;
                if (dckVar != null) {
                    dckVar.am();
                }
            }
            dbkVar2.O(this);
            W(this);
            defpackage.dcv dcvVar = dbkVar2.k;
            if (dcvVar != null) {
                dcvVar.z(dbkVar2);
            }
        }
        this.C = f2;
        defpackage.dbk dbkVar3 = this.w;
        if (this == dbkVar3.p() && !this.n) {
            ((defpackage.deg) defpackage.dbn.a(dbkVar3)).o.e(dbkVar3);
        }
        if (this.n) {
            return;
        }
        Q(L());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    public final void av(defpackage.cpl cplVar, boolean z, boolean z2, boolean z3) {
        long jFloatToRawIntBits;
        float fMax;
        float fMax2;
        defpackage.dct dctVar = this.L;
        if (dctVar != null) {
            if (this.M) {
                if (z2) {
                    long jAa = aa();
                    long j = jAa >> 32;
                    float f2 = cplVar.a;
                    float f3 = cplVar.b;
                    int i = (int) (jAa & 4294967295L);
                    int i2 = (int) j;
                    if (cplVar.c >= 0.0f) {
                        long j2 = this.c;
                        if (f2 > ((int) (j2 >> 32)) || cplVar.d < 0.0f || f3 > ((int) (j2 & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = java.lang.Float.intBitsToFloat(i2);
                            float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i);
                            float f4 = cplVar.c;
                            float f5 = (fIntBitsToFloat - (f4 - cplVar.a)) / 2.0f;
                            if (f5 > 0.0f) {
                                fMax = f2 - f5;
                            } else {
                                fMax = java.lang.Math.max(f2, java.lang.Math.min(0.0f, f4 - fIntBitsToFloat));
                                float f6 = (-fIntBitsToFloat) / 2.0f;
                                if (fMax < f6) {
                                    fMax = f6;
                                }
                            }
                            float f7 = cplVar.d;
                            float f8 = (fIntBitsToFloat2 - (f7 - cplVar.b)) / 2.0f;
                            if (f8 > 0.0f) {
                                fMax2 = f3 - f8;
                            } else {
                                fMax2 = java.lang.Math.max(f3, java.lang.Math.min(0.0f, f7 - fIntBitsToFloat2));
                                float f9 = (-fIntBitsToFloat2) / 2.0f;
                                if (fMax2 < f9) {
                                    fMax2 = f9;
                                }
                            }
                            jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits(fMax)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fMax2)) & 4294967295L);
                        }
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    float fIntBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    long j3 = this.c;
                    float f10 = (int) (j3 >> 32);
                    float fMin = java.lang.Math.min(java.lang.Float.intBitsToFloat(i2) + f10, java.lang.Math.max(f10, java.lang.Float.intBitsToFloat(i2) + fIntBitsToFloat3));
                    float f11 = (int) (j3 & 4294967295L);
                    float fMin2 = java.lang.Math.min(java.lang.Float.intBitsToFloat(i) + f11, java.lang.Math.max(f11, java.lang.Float.intBitsToFloat(i) + fIntBitsToFloat4));
                    if (z3 && f10 >= java.lang.Float.intBitsToFloat(i2)) {
                        fIntBitsToFloat3 = 0.0f;
                    }
                    float f12 = (!z3 || f11 < java.lang.Float.intBitsToFloat(i)) ? fIntBitsToFloat4 : 0.0f;
                    if (!z3 || f10 < java.lang.Float.intBitsToFloat(i2)) {
                        f10 = fMin;
                    }
                    if (!z3 || f11 < java.lang.Float.intBitsToFloat(i)) {
                        f11 = fMin2;
                    }
                    cplVar.a(fIntBitsToFloat3, f12, f10, f11);
                } else if (z) {
                    long j4 = this.c;
                    cplVar.a(0.0f, 0.0f, (int) (j4 >> 32), (int) (j4 & 4294967295L));
                }
                if (cplVar.c()) {
                    return;
                }
            }
            dctVar.d(cplVar, false);
        }
        long j5 = this.B;
        float f13 = (int) (j5 >> 32);
        cplVar.a += f13;
        cplVar.c += f13;
        float f14 = (int) (j5 & 4294967295L);
        cplVar.b += f14;
        cplVar.d += f14;
    }

    public final void aw() {
        if (this.L != null) {
            if (this.W != null) {
                this.W = null;
            }
            ay(null, false);
            this.w.V(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [cmv] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [cmv] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [cfc] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [cfc] */
    /* JADX WARN: Type inference failed for: r8v6 */
    public final void ax(defpackage.cyf cyfVar) {
        defpackage.dck dckVar;
        defpackage.cyf cyfVar2 = this.R;
        if (cyfVar != cyfVar2) {
            this.R = cyfVar;
            if (cyfVar2 == null || cyfVar.c() != cyfVar2.c() || cyfVar.b() != cyfVar2.b()) {
                long jC = cyfVar.c();
                long jB = cyfVar.b();
                defpackage.dct dctVar = this.L;
                long j = (jC << 32) | (jB & 4294967295L);
                if (dctVar != null) {
                    dctVar.f(j);
                } else if (this.w.am() && (dckVar = this.A) != null) {
                    dckVar.am();
                }
                z(j);
                if (this.N != null) {
                    az(false);
                }
                int i = defpackage.dcl.a;
                defpackage.cmv cmvVar = C().w;
                if (cmvVar != null) {
                    for (defpackage.cmv cmvVarAd = ad(false); cmvVarAd != null && (cmvVarAd.v & 4) != 0; cmvVarAd = cmvVarAd.x) {
                        if ((cmvVarAd.u & 4) != 0) {
                            ?? X = cmvVarAd;
                            ?? cfcVar = 0;
                            while (X != 0) {
                                if (X instanceof defpackage.dat) {
                                    ((defpackage.dat) X).m();
                                } else if ((X.u & 4) != 0 && (X instanceof defpackage.dap)) {
                                    defpackage.cmv cmvVar2 = ((defpackage.dap) X).F;
                                    int i2 = 0;
                                    X = X;
                                    cfcVar = cfcVar;
                                    while (cmvVar2 != null) {
                                        if ((cmvVar2.u & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cfcVar = cfcVar;
                                                X = cmvVar2;
                                            } else {
                                                if (cfcVar == 0) {
                                                    cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                                }
                                                if (X != 0) {
                                                    cfcVar.n(X);
                                                }
                                                cfcVar.n(cmvVar2);
                                                X = 0;
                                            }
                                        }
                                        cmvVar2 = cmvVar2.x;
                                        X = X;
                                        cfcVar = cfcVar;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                X = defpackage.cfo.x(cfcVar);
                            }
                        }
                        if (cmvVarAd == cmvVar) {
                            break;
                        }
                    }
                }
                defpackage.dbk dbkVar = this.w;
                defpackage.dcv dcvVar = dbkVar.k;
                if (dcvVar != null) {
                    dcvVar.z(dbkVar);
                }
                dbkVar.O(this);
            }
            defpackage.ado adoVar = this.X;
            if ((adoVar == null || !adoVar.d()) && cyfVar.f().isEmpty()) {
                return;
            }
            defpackage.ado adoVar2 = this.X;
            java.util.Map mapF = cyfVar.f();
            if (adoVar2 != null && adoVar2.e == mapF.size()) {
                java.lang.Object[] objArr = adoVar2.b;
                int[] iArr = adoVar2.c;
                long[] jArr = adoVar2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j2 = jArr[i3];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = i3 - length;
                        int i5 = 0;
                        while (true) {
                            int i6 = 8 - ((~i4) >>> 31);
                            if (i5 >= i6) {
                                if (i6 == 8) {
                                    break;
                                } else {
                                    return;
                                }
                            }
                            if ((255 & j2) < 128) {
                                int i7 = (i3 << 3) + i5;
                                java.lang.Object obj = objArr[i7];
                                int i8 = iArr[i7];
                                java.lang.Integer num = (java.lang.Integer) mapF.get((defpackage.cwk) obj);
                                if (num == null || num.intValue() != i8) {
                                    break loop0;
                                }
                            }
                            j2 >>= 8;
                            i5++;
                        }
                    }
                    if (i3 == length) {
                        return;
                    } else {
                        i3++;
                    }
                }
            }
            ((defpackage.dbx) ag()).w.e();
            defpackage.ado adoVar3 = this.X;
            if (adoVar3 == null) {
                defpackage.ado adoVar4 = defpackage.adp.a;
                adoVar3 = new defpackage.ado(6);
                this.X = adoVar3;
            }
            adoVar3.f();
            for (java.util.Map.Entry entry : cyfVar.f().entrySet()) {
                adoVar3.h(entry.getKey(), ((java.lang.Number) entry.getValue()).intValue());
            }
        }
    }

    public final void ay(defpackage.aonj aonjVar, boolean z) {
        defpackage.dcv dcvVar;
        if (aonjVar != null && this.W != null) {
            defpackage.cwh.c("layerBlock can't be provided when explicitLayer is provided");
        }
        defpackage.dbk dbkVar = this.w;
        boolean z2 = (!z && this.N == aonjVar && defpackage.aooh.n(this.O, dbkVar.r) && this.P == dbkVar.s) ? false : true;
        this.O = dbkVar.r;
        this.P = dbkVar.s;
        if (!dbkVar.al() || aonjVar == null) {
            this.N = null;
            defpackage.dct dctVar = this.L;
            if (dctVar != null) {
                if (!defpackage.cfd.I(dctVar.k())) {
                    dbkVar.O(this);
                }
                dctVar.b();
                this.L = null;
                dbkVar.at();
                this.V.a();
                if (u() && dbkVar.am() && (dcvVar = dbkVar.k) != null) {
                    dcvVar.z(dbkVar);
                }
            }
            this.K = false;
            return;
        }
        this.N = aonjVar;
        if (this.L != null) {
            if (z2) {
                az(true);
                return;
            }
            return;
        }
        defpackage.dcv dcvVarA = defpackage.dbn.a(dbkVar);
        defpackage.aonn aonnVarI = I();
        defpackage.aomy aomyVar = this.V;
        defpackage.dct dctVarO = dcvVarA.o(aonnVarI, aomyVar, null);
        dctVarO.f(this.c);
        dctVarO.e(this.B);
        this.L = dctVarO;
        az(true);
        dbkVar.at();
        aomyVar.a();
    }

    public final void az(boolean z) {
        if (this.W == null) {
            defpackage.dct dctVar = this.L;
            defpackage.aonj aonjVar = this.N;
            if (dctVar == null) {
                if (aonjVar != null) {
                    defpackage.cwh.d("null layer with a non-null layerBlock");
                    return;
                }
                return;
            }
            if (aonjVar == null) {
                defpackage.cwh.b("updateLayerParameters requires a non-null layerBlock");
                throw new defpackage.aoiq();
            }
            defpackage.cra craVar = t;
            craVar.n();
            defpackage.dbk dbkVar = this.w;
            craVar.r = dbkVar.r;
            craVar.s = dbkVar.s;
            craVar.p = defpackage.dpy.l(this.c);
            defpackage.aoop aoopVar = new defpackage.aoop();
            defpackage.dcy dcyVarAi = ai();
            int i = 0;
            dcyVarAi.a.c(this, f, new defpackage.dcg(aonjVar, this, aoopVar, i));
            defpackage.dba dbaVar = this.T;
            if (dbaVar == null) {
                dbaVar = new defpackage.dba();
                this.T = dbaVar;
            }
            defpackage.dba dbaVar2 = g;
            dbaVar2.a = dbaVar.a;
            dbaVar2.b = dbaVar.b;
            dbaVar2.c = dbaVar.c;
            dbaVar2.d = 0.0f;
            dbaVar2.e = dbaVar.e;
            dbaVar2.f = dbaVar.f;
            dbaVar2.g = dbaVar.g;
            dbaVar.a = craVar.b;
            dbaVar.b = craVar.c;
            dbaVar.c = craVar.e;
            float f2 = craVar.f;
            dbaVar.d = 0.0f;
            dbaVar.e = craVar.j;
            dbaVar.f = craVar.k;
            dbaVar.g = craVar.l;
            dctVar.i(craVar);
            boolean z2 = this.M;
            boolean z3 = craVar.n;
            this.M = z3;
            this.Q = craVar.d;
            if (dbaVar2.a == dbaVar.a && dbaVar2.b == dbaVar.b && dbaVar2.c == dbaVar.c) {
                float f3 = dbaVar2.d;
                if (dbaVar2.e == dbaVar.e && dbaVar2.f == dbaVar.f && dbaVar2.g == dbaVar.g) {
                    i = 1;
                }
            }
            if (z) {
                if (i != 0 && z2 == z3 && !aoopVar.a) {
                    return;
                }
                defpackage.dcv dcvVar = dbkVar.k;
                if (dcvVar != null) {
                    dcvVar.z(dbkVar);
                }
            }
            if (i == 0) {
                dbkVar.O(this);
                if (dbkVar.C > 0) {
                    defpackage.dbn.a(dbkVar).E(dbkVar);
                }
            }
        }
    }

    @Override // defpackage.dpl
    public final float b() {
        return this.w.r.b();
    }

    @Override // defpackage.czc
    public void dg(long j, float f2, defpackage.aonj aonjVar) {
        if (!this.x) {
            au(j, f2, aonjVar, null);
            return;
        }
        defpackage.dbu dbuVarD = D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        au(dbuVarD.h, f2, aonjVar, null);
    }

    @Override // defpackage.cxi
    public final defpackage.cxi dn() {
        if (!u()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (defpackage.dbk dbkVarK = this.w; dbkVarK != null; dbkVarK = dbkVarK.k()) {
                sb.append("\n|");
                sb.append(dbkVarK);
                sb.append(" isAttached=");
                sb.append(dbkVarK.al());
                sb.append(" modifier=");
                sb.append(dbkVarK.y);
                sb.append(" tail=");
                sb.append(C());
            }
            defpackage.cwh.d(sb.toString());
        }
        an();
        return this.w.p().A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [cmv] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [cmv] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [cfc] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [cfc] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // defpackage.czc, defpackage.cxe
    public final java.lang.Object g() {
        defpackage.dbk dbkVar = this.w;
        defpackage.dce dceVar = dbkVar.v;
        if (!dceVar.i(64)) {
            return null;
        }
        C();
        defpackage.aoot aootVar = new defpackage.aoot();
        for (defpackage.cmv cmvVar = dceVar.e; cmvVar != null; cmvVar = cmvVar.w) {
            if ((cmvVar.u & 64) != 0) {
                ?? X = cmvVar;
                ?? cfcVar = 0;
                while (X != 0) {
                    if (X instanceof defpackage.dcz) {
                        aootVar.a = ((defpackage.dcz) X).cW(dbkVar.r, aootVar.a);
                    } else if ((X.u & 64) != 0 && (X instanceof defpackage.dap)) {
                        defpackage.cmv cmvVar2 = ((defpackage.dap) X).F;
                        int i = 0;
                        X = X;
                        cfcVar = cfcVar;
                        while (cmvVar2 != null) {
                            if ((cmvVar2.u & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    cfcVar = cfcVar;
                                    X = cmvVar2;
                                } else {
                                    if (cfcVar == 0) {
                                        cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                    }
                                    if (X != 0) {
                                        cfcVar.n(X);
                                    }
                                    cfcVar.n(cmvVar2);
                                    X = 0;
                                }
                            }
                            cmvVar2 = cmvVar2.x;
                            X = X;
                            cfcVar = cfcVar;
                        }
                        if (i != 1) {
                        }
                    }
                    X = defpackage.cfo.x(cfcVar);
                }
            }
        }
        return aootVar.a;
    }

    @Override // defpackage.cxi
    public final long h() {
        return this.c;
    }

    @Override // defpackage.cxi
    public final long i(defpackage.cxi cxiVar, long j) {
        return j(cxiVar, j, true);
    }

    @Override // defpackage.cxi
    public final long j(defpackage.cxi cxiVar, long j, boolean z) {
        if (cxiVar instanceof defpackage.cya) {
            defpackage.cya cyaVar = (defpackage.cya) cxiVar;
            cyaVar.a().an();
            return cyaVar.j(this, j ^ (-9223372034707292160L), z) ^ (-9223372034707292160L);
        }
        defpackage.dck dckVarAJ = aJ(cxiVar);
        dckVarAJ.an();
        defpackage.dck dckVarAh = ah(dckVarAJ);
        while (dckVarAJ != dckVarAh) {
            j = dckVarAJ.ab(j, z);
            dckVarAJ = dckVarAJ.A;
            if (dckVarAJ == null) {
                defpackage.aooh.g();
            }
        }
        return H(dckVarAh, j, z);
    }

    @Override // defpackage.cxi
    public final long k(long j) {
        if (!u()) {
            defpackage.cwh.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        an();
        while (this != null) {
            defpackage.dbk dbkVar = this.w;
            if (this == dbkVar.p() && !dbkVar.d) {
                long jB = ((defpackage.deg) defpackage.dbn.a(dbkVar)).o.b(dbkVar);
                if (jB != 9223372034707292159L) {
                    return defpackage.dfd.k(j, jB);
                }
            }
            j = this.ab(j, true);
            this = this.A;
        }
        return j;
    }

    @Override // defpackage.cxi
    public final long l(long j) {
        if (!u()) {
            defpackage.cwh.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return defpackage.dbn.a(this.w).k(k(j));
    }

    @Override // defpackage.cxi
    public final long m(long j) {
        defpackage.dbk dbkVar = this.w;
        long jK = k(j);
        defpackage.deg degVar = (defpackage.deg) defpackage.dbn.a(dbkVar);
        degVar.ah();
        return defpackage.cqt.a(degVar.x, jK);
    }

    @Override // defpackage.cxi
    public final long n(long j) {
        if (!u()) {
            defpackage.cwh.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return j(defpackage.den.G(this), defpackage.dbn.a(this.w).l(j), true);
    }

    @Override // defpackage.cxi
    public final long o(long j) {
        if (!u()) {
            defpackage.cwh.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        defpackage.cxi cxiVarG = defpackage.den.G(this);
        defpackage.deg degVar = (defpackage.deg) defpackage.dbn.a(this.w);
        degVar.ah();
        return j(cxiVarG, defpackage.mni.aM(defpackage.cqt.a(degVar.y, j), cxiVarG.k(0L)), true);
    }

    @Override // defpackage.cxf
    public final defpackage.dpq p() {
        return this.w.s;
    }

    @Override // defpackage.cxi
    public final defpackage.cpn q(defpackage.cxi cxiVar, boolean z) {
        if (!u()) {
            defpackage.cwh.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!cxiVar.u()) {
            defpackage.cwh.d(defpackage.a.bg(cxiVar, "LayoutCoordinates ", " is not attached!"));
        }
        defpackage.dck dckVarAJ = aJ(cxiVar);
        dckVarAJ.an();
        defpackage.dck dckVarAh = ah(dckVarAJ);
        defpackage.cpl cplVarAe = ae();
        cplVarAe.a = 0.0f;
        cplVarAe.b = 0.0f;
        cplVarAe.c = (int) (cxiVar.h() >> 32);
        cplVarAe.d = (int) (cxiVar.h() & 4294967295L);
        while (dckVarAJ != dckVarAh) {
            dckVarAJ.av(cplVarAe, z, false, false);
            if (cplVarAe.c()) {
                return defpackage.cpn.a;
            }
            dckVarAJ = dckVarAJ.A;
            if (dckVarAJ == null) {
                defpackage.aooh.g();
            }
        }
        aD(dckVarAh, cplVarAe, z);
        return defpackage.cdh.y(cplVarAe);
    }

    @Override // defpackage.cxi
    public final defpackage.cxi r() {
        if (!u()) {
            defpackage.cwh.d("LayoutCoordinate operations are only valid when isAttached is true");
        }
        an();
        return this.A;
    }

    @Override // defpackage.cxi
    public final boolean t() {
        return this.l;
    }

    @Override // defpackage.cxi
    public final boolean u() {
        return C().D;
    }

    @Override // defpackage.czc
    public void y(long j, float f2, defpackage.cso csoVar) {
        if (!this.x) {
            au(j, f2, null, csoVar);
            return;
        }
        defpackage.dbu dbuVarD = D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        au(dbuVarD.h, f2, null, csoVar);
    }

    @Override // defpackage.dbt
    public final defpackage.cxi K() {
        return this;
    }
}
