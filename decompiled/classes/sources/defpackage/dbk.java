package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dbk implements defpackage.cap, defpackage.dcw, defpackage.dcu {
    public defpackage.aonj A;
    public boolean B;
    public int C;
    public boolean D;
    public int E;
    public defpackage.cje F;
    private final boolean I;
    private int J;
    private defpackage.cfc K;
    private boolean L;
    private defpackage.dbk M;
    private defpackage.die N;
    private final defpackage.cfc O;
    private boolean P;
    private defpackage.dck Q;
    private boolean R;
    private defpackage.cmw S;
    private int T;
    private final defpackage.nf U;
    private defpackage.vx V;
    public int c;
    public boolean d;
    public long e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public defpackage.dbk j;
    public defpackage.dcv k;
    public dqc l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public defpackage.cye q;
    public defpackage.dpf r;
    public defpackage.dpq s;
    public defpackage.dgk t;
    public boolean u;
    public final defpackage.dce v;
    public final defpackage.dbo w;
    public defpackage.cxy x;
    public defpackage.cmw y;
    public defpackage.aonj z;
    private static final defpackage.dbj G = new defpackage.dbi();
    public static final defpackage.aomy a = new defpackage.cbz(11);
    private static final defpackage.dgk H = new defpackage.dbh();
    public static final java.util.Comparator b = new defpackage.beg(3);

    public dbk(boolean z, int i) {
        this.I = z;
        this.c = i;
        this.e = 9223372034707292159L;
        this.f = true;
        this.g = true;
        this.h = -4;
        this.U = new defpackage.nf(new defpackage.cfc(new defpackage.dbk[16]), (defpackage.aomy) new defpackage.bpa(this, 11));
        this.O = new defpackage.cfc(new defpackage.dbk[16]);
        this.P = true;
        this.q = G;
        this.r = defpackage.dbn.a;
        this.s = defpackage.dpq.a;
        this.t = H;
        this.F = defpackage.cbe.a;
        this.E = 3;
        this.T = 3;
        this.v = new defpackage.dce(this);
        this.w = new defpackage.dbo(this);
        this.R = true;
        this.y = defpackage.cmw.c;
    }

    private final java.lang.String aA(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        defpackage.cfc cfcVarJ = j();
        java.lang.Object[] objArr = cfcVarJ.a;
        int i3 = cfcVarJ.b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((defpackage.dbk) objArr[i4]).aA(i + 1));
        }
        java.lang.String string = sb.toString();
        if (i != 0) {
            return string;
        }
        java.lang.String strSubstring = string.substring(0, string.length() - 1);
        defpackage.aooh.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    private final java.lang.String aB(defpackage.dbk dbkVar) {
        java.lang.String strAA = aA(0);
        defpackage.dbk dbkVar2 = dbkVar.M;
        return "Cannot insert " + dbkVar + " because it already has a parent or an owner. This tree: " + strAA + " Other tree: " + (dbkVar2 != null ? dbkVar2.aA(0) : null);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5341. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private final void aC(defpackage.cmw r23) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbk.aC(cmw):void");
    }

    private final void aD() {
        defpackage.dbk dbkVar;
        if (this.J > 0) {
            this.L = true;
        }
        if (!this.I || (dbkVar = this.M) == null) {
            return;
        }
        dbkVar.aD();
    }

    private final void aE(defpackage.dbk dbkVar) {
        if (dbkVar.w.k > 0) {
            defpackage.dbo dboVar = this.w;
            dboVar.g(dboVar.k - 1);
        }
        if (this.k != null) {
            dbkVar.z();
        }
        dbkVar.M = null;
        if (dbkVar.C > 0) {
            ab(this.C - 1);
        }
        dbkVar.p().A = null;
        if (dbkVar.I) {
            this.J--;
            defpackage.cfc cfcVar = (defpackage.cfc) dbkVar.U.b;
            java.lang.Object[] objArr = cfcVar.a;
            int i = cfcVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((defpackage.dbk) objArr[i2]).p().A = null;
            }
        }
        aD();
        P();
    }

    private final void aF() {
        H();
        defpackage.dbk dbkVarK = k();
        if (dbkVarK != null) {
            dbkVarK.F();
        } else {
            defpackage.dcv dcvVar = this.k;
            if (dcvVar != null) {
                ((defpackage.deg) dcvVar).invalidate();
            }
        }
        G();
    }

    private final void aG(defpackage.dbk dbkVar) {
        if (defpackage.aooh.n(dbkVar, this.j)) {
            return;
        }
        this.j = dbkVar;
        defpackage.dbo dboVar = this.w;
        if (dbkVar != null) {
            if (dboVar.p == null) {
                dboVar.p = new defpackage.dbv(dboVar);
            }
            defpackage.dck dckVar = o().z;
            for (defpackage.dck dckVarP = p(); !defpackage.aooh.n(dckVarP, dckVar) && dckVarP != null; dckVarP = dckVarP.z) {
                dckVarP.E();
            }
        } else {
            dboVar.p = null;
            dboVar.e = false;
            dboVar.d = false;
        }
        H();
    }

    public final void A(defpackage.cqf cqfVar, defpackage.cso csoVar) throws java.lang.Throwable {
        try {
            p().aj(cqfVar, csoVar);
        } catch (java.lang.Throwable th) {
            ar(th);
            throw new defpackage.aoiq();
        }
    }

    @Override // defpackage.dcw
    public final boolean B() {
        return al();
    }

    public final void C() {
        if (this.j != null) {
            U(false, false, true);
        } else {
            W(false, false, true);
        }
        defpackage.dpd dpdVarB = this.w.b();
        defpackage.dcv dcvVar = this.k;
        if (dpdVarB != null) {
            if (dcvVar != null) {
                dcvVar.x(this, dpdVarB.a);
            }
        } else if (dcvVar != null) {
            dcvVar.w(true);
        }
    }

    public final void D(long j, defpackage.dax daxVar, int i, boolean z) {
        defpackage.dck dckVarP = p();
        defpackage.aonj aonjVar = defpackage.dck.s;
        p().al(defpackage.dck.u, dckVarP.Z(j, true), daxVar, i, z);
    }

    public final void E(int i, defpackage.dbk dbkVar) {
        if (dbkVar.M != null && dbkVar.k != null) {
            defpackage.cwh.d(aB(dbkVar));
        }
        dbkVar.M = this;
        this.U.I(i, dbkVar);
        P();
        if (dbkVar.I) {
            this.J++;
        }
        aD();
        defpackage.dcv dcvVar = this.k;
        if (dcvVar != null) {
            dbkVar.w(dcvVar);
        }
        if (dbkVar.w.k > 0) {
            defpackage.dbo dboVar = this.w;
            dboVar.g(dboVar.k + 1);
        }
        if (dbkVar.C > 0) {
            ab(this.C + 1);
        }
    }

    public final void F() {
        if (this.R) {
            defpackage.dck dckVarO = o();
            defpackage.dck dckVar = p().A;
            this.Q = null;
            while (!defpackage.aooh.n(dckVarO, dckVar)) {
                if ((dckVarO != null ? dckVarO.L : null) != null) {
                    this.Q = dckVarO;
                    break;
                }
                dckVarO = dckVarO != null ? dckVarO.A : null;
            }
            this.R = false;
        }
        defpackage.dck dckVar2 = this.Q;
        if (dckVar2 != null) {
            if (dckVar2.L != null) {
                dckVar2.am();
                return;
            } else {
                defpackage.cwh.b("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
                throw new defpackage.aoiq();
            }
        }
        defpackage.dbk dbkVarK = k();
        if (dbkVarK != null) {
            dbkVarK.F();
            return;
        }
        defpackage.dcv dcvVar = this.k;
        if (dcvVar != null) {
            ((defpackage.deg) dcvVar).invalidate();
        }
    }

    public final void G() {
        defpackage.dck dckVarP = p();
        defpackage.dck dckVarO = o();
        while (dckVarP != dckVarO) {
            if (dckVarP == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            }
            defpackage.dbg dbgVar = (defpackage.dbg) dckVarP;
            defpackage.dct dctVar = dbgVar.L;
            if (dctVar != null) {
                dctVar.invalidate();
            }
            dckVarP = dbgVar.z;
        }
        defpackage.dct dctVar2 = o().L;
        if (dctVar2 != null) {
            dctVar2.invalidate();
        }
    }

    public final void H() {
        if (this.I) {
            defpackage.dbk dbkVarK = k();
            if (dbkVarK != null) {
                dbkVarK.H();
                return;
            }
            return;
        }
        if (this.j != null) {
            U(false, true, true);
        } else {
            W(false, true, true);
        }
    }

    public final void I() {
        if (this.p) {
            return;
        }
        if (this.v.b.x != null || ag()) {
            this.o = true;
            return;
        }
        defpackage.die dieVar = this.N;
        this.p = true;
        defpackage.aoot aootVar = new defpackage.aoot();
        aootVar.a = new defpackage.die();
        defpackage.dcy dcyVar = ((defpackage.deg) defpackage.dbn.a(this)).u;
        defpackage.bev bevVar = new defpackage.bev(this, aootVar, 6, null);
        dcyVar.a.c(this, dcyVar.d, bevVar);
        this.p = false;
        this.N = (defpackage.die) aootVar.a;
        this.o = false;
        defpackage.dcv dcvVarA = defpackage.dbn.a(this);
        ((defpackage.deg) dcvVarA).p.b(this, dieVar);
        dcvVarA.C();
    }

    public final void J() {
        defpackage.dbk dbkVarK;
        if (this.E == 3) {
            y();
        }
        defpackage.dbv dbvVarM = m();
        if (dbvVarM == null) {
            defpackage.aooh.g();
        }
        try {
            dbvVarM.g = true;
            if (!dbvVarM.k) {
                defpackage.cwh.d("replace() called on item that was not placed");
            }
            dbvVarM.x = false;
            boolean zG = dbvVarM.G();
            dbvVarM.I(dbvVarM.m, dbvVarM.n, dbvVarM.o);
            if (zG && !dbvVarM.x && (dbkVarK = dbvVarM.r().k()) != null) {
                dbkVarK.T(false);
            }
        } finally {
            dbvVarM.g = false;
        }
    }

    public final void K() {
        this.w.o.u();
    }

    public final void L() {
        this.w.d = true;
    }

    public final void M() {
        this.w.o.B();
    }

    public final void N(int i, int i2, int i3) {
        int i4;
        int i5;
        if (i != i2) {
            for (int i6 = 0; i6 < i3; i6++) {
                if (i > i2) {
                    i5 = i + i6;
                    i4 = i2 + i6;
                } else {
                    i4 = (i2 + i3) - 2;
                    i5 = i;
                }
                defpackage.nf nfVar = this.U;
                nfVar.I(i4, (defpackage.dbk) nfVar.H(i5));
            }
            P();
            aD();
            H();
        }
    }

    public final void O(defpackage.dck dckVar) {
        defpackage.dcv dcvVar = this.k;
        defpackage.diw diwVar = dcvVar != null ? ((defpackage.deg) dcvVar).o : null;
        boolean z = av() != 5 || ak() || ah();
        if (this.h != -4 && diwVar != null) {
            if (dckVar == p()) {
                this.g = true;
                if (!z) {
                    diwVar.e(this);
                }
            } else {
                this.f = true;
                defpackage.cfc cfcVarJ = j();
                java.lang.Object[] objArr = cfcVarJ.a;
                int i = cfcVarJ.b;
                for (int i2 = 0; i2 < i; i2++) {
                    defpackage.dbk dbkVar = (defpackage.dbk) objArr[i2];
                    dbkVar.g = true;
                    if (!z) {
                        diwVar.e(dbkVar);
                    }
                }
                if (defpackage.diw.h(this)) {
                    diwVar.d = true;
                    int iA = diwVar.a(this) + 2;
                    long[] jArr = (long[]) diwVar.b.b;
                    long j = jArr[iA];
                    jArr[iA] = j | (((j >> 63) & 1) << 60);
                }
                diwVar.i();
            }
        }
        this.w.o.F();
    }

    public final void P() {
        if (!this.I) {
            this.P = true;
            return;
        }
        defpackage.dbk dbkVarK = k();
        if (dbkVarK != null) {
            dbkVarK.P();
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [aomy, java.lang.Object] */
    public final void Q() {
        defpackage.nf nfVar = this.U;
        defpackage.cfc cfcVar = (defpackage.cfc) nfVar.b;
        int i = cfcVar.b;
        while (true) {
            i--;
            if (i < 0) {
                cfcVar.g();
                nfVar.a.a();
                return;
            }
            aE((defpackage.dbk) cfcVar.a[i]);
        }
    }

    public final void R(int i, int i2) {
        if (i2 < 0) {
            defpackage.cwh.c(defpackage.a.bs(i2, "count (", ") must be greater than 0"));
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            defpackage.nf nfVar = this.U;
            aE((defpackage.dbk) ((defpackage.cfc) nfVar.b).a[i3]);
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void S() {
        defpackage.dbk dbkVarK;
        if (this.E == 3) {
            y();
        }
        defpackage.dbx dbxVarN = n();
        try {
            dbxVarN.g = true;
            if (!dbxVarN.k) {
                defpackage.cwh.d("replace called on unplaced item");
            }
            boolean z = dbxVarN.s;
            dbxVarN.E(dbxVarN.m, dbxVarN.p, dbxVarN.n, dbxVarN.o);
            if (z && !dbxVarN.B && (dbkVarK = dbxVarN.r().k()) != null) {
                dbkVarK.V(false);
            }
            dbxVarN.g = false;
        } catch (java.lang.Throwable th) {
            try {
                dbxVarN.r().ar(th);
                throw new defpackage.aoiq();
            } catch (java.lang.Throwable th2) {
                dbxVarN.g = false;
                throw th2;
            }
        }
    }

    public final void T(boolean z) {
        defpackage.dcv dcvVar;
        if (this.I || (dcvVar = this.k) == null) {
            return;
        }
        dcvVar.B(this, true, z);
    }

    public final void U(boolean z, boolean z2, boolean z3) {
        defpackage.dbk dbkVarK;
        if (this.j == null) {
            defpackage.cwh.d("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        defpackage.dcv dcvVar = this.k;
        if (dcvVar == null || this.n || this.I) {
            return;
        }
        dcvVar.A(this, true, z, z2);
        if (z3) {
            defpackage.dbv dbvVarM = m();
            if (dbvVarM == null) {
                defpackage.aooh.g();
            }
            defpackage.dbk dbkVarK2 = dbvVarM.r().k();
            int i = dbvVarM.r().E;
            if (dbkVarK2 == null || i == 3) {
                return;
            }
            while (dbkVarK2.E == i && (dbkVarK = dbkVarK2.k()) != null) {
                dbkVarK2 = dbkVarK;
            }
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                if (dbkVarK2.j != null) {
                    dbkVarK2.U(z, true, true);
                    return;
                } else {
                    dbkVarK2.W(z, true, true);
                    return;
                }
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (dbkVarK2.j != null) {
                dbkVarK2.T(z);
            } else {
                dbkVarK2.V(z);
            }
        }
    }

    public final void V(boolean z) {
        defpackage.dcv dcvVar;
        if (this.I || (dcvVar = this.k) == null) {
            return;
        }
        dcvVar.B(this, false, z);
    }

    public final void W(boolean z, boolean z2, boolean z3) {
        defpackage.dcv dcvVar;
        defpackage.dbk dbkVarK;
        if (this.n || this.I || (dcvVar = this.k) == null) {
            return;
        }
        dcvVar.A(this, false, z, z2);
        if (z3) {
            defpackage.dbx dbxVarN = n();
            defpackage.dbk dbkVarK2 = dbxVarN.r().k();
            int i = dbxVarN.r().E;
            if (dbkVarK2 == null || i == 3) {
                return;
            }
            while (dbkVarK2.E == i && (dbkVarK = dbkVarK2.k()) != null) {
                dbkVarK2 = dbkVarK;
            }
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                dbkVarK2.W(z, true, true);
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("Intrinsics isn't used by the parent");
                }
                dbkVarK2.V(z);
            }
        }
    }

    public final void X(defpackage.dbk dbkVar) {
        int iAv = dbkVar.av();
        int i = iAv - 1;
        if (iAv == 0) {
            throw null;
        }
        if (i != 4) {
            int iAv2 = dbkVar.av();
            defpackage.cfo.t(iAv2);
            throw new java.lang.IllegalStateException("Unexpected state ".concat(defpackage.cfo.t(iAv2)));
        }
        if (dbkVar.aj()) {
            dbkVar.U(true, true, true);
            return;
        }
        if (dbkVar.ai()) {
            dbkVar.T(true);
        }
        if (dbkVar.ak()) {
            dbkVar.W(true, true, true);
        } else if (dbkVar.ah()) {
            dbkVar.V(true);
        }
    }

    public final void Y() {
        defpackage.dce dceVar = this.v;
        for (defpackage.cmv cmvVar = dceVar.e; cmvVar != null; cmvVar = cmvVar.w) {
            if (cmvVar.D) {
                cmvVar.P();
            }
        }
        dceVar.f();
        dceVar.c();
    }

    public final void Z() {
        defpackage.cfc cfcVarJ = j();
        java.lang.Object[] objArr = cfcVarJ.a;
        int i = cfcVarJ.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.dbk dbkVar = (defpackage.dbk) objArr[i2];
            int i3 = dbkVar.T;
            dbkVar.E = i3;
            if (i3 != 3) {
                dbkVar.Z();
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
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // defpackage.dcu
    public final void a() {
        defpackage.dck dckVarO = o();
        int i = defpackage.dcl.a;
        defpackage.ddf ddfVar = ((defpackage.daz) dckVarO).f;
        for (defpackage.cmv cmvVarAd = dckVarO.ad(true); cmvVarAd != null && (cmvVarAd.v & 4194304) != 0; cmvVarAd = cmvVarAd.x) {
            if ((cmvVarAd.u & 4194304) != 0) {
                ?? X = cmvVarAd;
                ?? cfcVar = 0;
                while (X != 0) {
                    if (X instanceof defpackage.dbb) {
                        ((defpackage.dbb) X).g(o());
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
            if (cmvVarAd == ddfVar) {
                return;
            }
        }
    }

    public final void aa(defpackage.dpf dpfVar) {
        if (defpackage.aooh.n(this.r, dpfVar)) {
            return;
        }
        this.r = dpfVar;
        aF();
        for (defpackage.cmv cmvVar = this.v.f; cmvVar != null; cmvVar = cmvVar.x) {
            cmvVar.cM();
        }
    }

    public final void ab(int i) {
        defpackage.dbk dbkVarK;
        defpackage.dbk dbkVarK2;
        int i2 = this.C;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (dbkVarK2 = k()) != null) {
                dbkVarK2.ab(dbkVarK2.C + 1);
            }
            if (i == 0 && this.C > 0 && (dbkVarK = k()) != null) {
                dbkVarK.ab(dbkVarK.C - 1);
            }
            this.C = i;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ccp, java.lang.Object] */
    public final void ac(defpackage.cye cyeVar) {
        if (defpackage.aooh.n(this.q, cyeVar)) {
            return;
        }
        this.q = cyeVar;
        defpackage.vx vxVar = this.V;
        if (vxVar != null) {
            vxVar.b.b(cyeVar);
        }
        H();
    }

    public final void ad(defpackage.cmw cmwVar) {
        if (this.I && this.y != defpackage.cmw.c) {
            defpackage.cwh.c("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.D) {
            defpackage.cwh.c("modifier is updated when deactivated");
        }
        if (!al()) {
            this.S = cmwVar;
            return;
        }
        aC(cmwVar);
        if (this.o) {
            I();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [cmv] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [cmv] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [cfc] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [cfc] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void ae(defpackage.dgk dgkVar) {
        if (defpackage.aooh.n(this.t, dgkVar)) {
            return;
        }
        this.t = dgkVar;
        defpackage.dce dceVar = this.v;
        if ((dceVar.a() & 16) != 0) {
            for (defpackage.cmv cmvVar = dceVar.f; cmvVar != null; cmvVar = cmvVar.x) {
                if ((cmvVar.u & 16) != 0) {
                    ?? X = cmvVar;
                    ?? cfcVar = 0;
                    while (X != 0) {
                        if (X instanceof defpackage.ddb) {
                            ((defpackage.ddb) X).q();
                        } else if ((X.u & 16) != 0 && (X instanceof defpackage.dap)) {
                            defpackage.cmv cmvVar2 = ((defpackage.dap) X).F;
                            int i = 0;
                            X = X;
                            cfcVar = cfcVar;
                            while (cmvVar2 != null) {
                                if ((cmvVar2.u & 16) != 0) {
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
                if ((cmvVar.v & 16) == 0) {
                    return;
                }
            }
        }
    }

    public final void af() {
        if (this.J <= 0 || !this.L) {
            return;
        }
        this.L = false;
        defpackage.cfc cfcVar = this.K;
        if (cfcVar == null) {
            cfcVar = new defpackage.cfc(new defpackage.dbk[16]);
            this.K = cfcVar;
        }
        cfcVar.g();
        defpackage.cfc cfcVar2 = (defpackage.cfc) this.U.b;
        java.lang.Object[] objArr = cfcVar2.a;
        int i = cfcVar2.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.dbk dbkVar = (defpackage.dbk) objArr[i2];
            if (dbkVar.I) {
                cfcVar.o(cfcVar.b, dbkVar.j());
            } else {
                cfcVar.n(dbkVar);
            }
        }
        this.w.d();
    }

    public final boolean ag() {
        return this.S != null;
    }

    public final boolean ah() {
        return this.w.n();
    }

    public final boolean ai() {
        return this.w.e;
    }

    public final boolean aj() {
        return this.w.d;
    }

    public final boolean ak() {
        return this.w.o.u;
    }

    public final boolean al() {
        return this.k != null;
    }

    public final boolean am() {
        return n().s;
    }

    public final boolean an() {
        return n().t;
    }

    public final boolean ao(defpackage.dpd dpdVar) {
        if (dpdVar == null || this.j == null) {
            return false;
        }
        defpackage.dbv dbvVarM = m();
        if (dbvVarM == null) {
            defpackage.aooh.g();
        }
        return dbvVarM.H(dpdVar.a);
    }

    public final boolean ap(defpackage.dpd dpdVar) {
        if (dpdVar == null) {
            return false;
        }
        if (this.E == 3) {
            x();
        }
        return n().G(dpdVar.a);
    }

    public final void aq(long j, defpackage.dax daxVar, boolean z) {
        defpackage.dck dckVarP = p();
        defpackage.aonj aonjVar = defpackage.dck.s;
        p().al(defpackage.dck.v, dckVarP.Z(j, true), daxVar, 1, z);
    }

    public final void ar(java.lang.Throwable th) throws java.lang.Throwable {
        if (((defpackage.cmc) this.F.h(cmd.a)) == null) {
            throw th;
        }
        defpackage.cmc.c();
        throw th;
    }

    public final void at() {
        this.R = true;
    }

    public final void au() {
        this.f = false;
    }

    public final int av() {
        return this.w.q;
    }

    public final int aw() {
        return n().G;
    }

    public final int ax() {
        int i;
        defpackage.dbv dbvVarM = m();
        if (dbvVarM == null || (i = dbvVarM.y) == 0) {
            return 3;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [cmv] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [cmv] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [cfc] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [cfc] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final void ay(defpackage.cje cjeVar) {
        this.F = cjeVar;
        aa((defpackage.dpf) cjeVar.h(defpackage.dfo.e));
        defpackage.dpq dpqVar = (defpackage.dpq) cjeVar.h(defpackage.dfo.j);
        if (this.s != dpqVar) {
            this.s = dpqVar;
            aF();
            for (defpackage.cmv cmvVar = this.v.f; cmvVar != null; cmvVar = cmvVar.x) {
                cmvVar.cL();
            }
        }
        ae((defpackage.dgk) cjeVar.h(defpackage.dfo.n));
        defpackage.dce dceVar = this.v;
        if ((dceVar.a() & 32768) != 0) {
            for (defpackage.cmv cmvVar2 = dceVar.f; cmvVar2 != null; cmvVar2 = cmvVar2.x) {
                if ((cmvVar2.u & 32768) != 0) {
                    ?? X = cmvVar2;
                    ?? cfcVar = 0;
                    while (X != 0) {
                        if (X instanceof defpackage.dan) {
                            defpackage.cmv cmvVarL = ((defpackage.dan) X).L();
                            if (cmvVarL.D) {
                                defpackage.dcl.g(cmvVarL);
                            } else {
                                cmvVarL.B = true;
                            }
                        } else if ((X.u & 32768) != 0 && (X instanceof defpackage.dap)) {
                            defpackage.cmv cmvVar3 = ((defpackage.dap) X).F;
                            int i = 0;
                            while (cmvVar3 != null) {
                                if ((cmvVar3.u & 32768) != 0) {
                                    i++;
                                    if (i == 1) {
                                        X = X;
                                        cfcVar = cfcVar;
                                        cfcVar = cfcVar;
                                        X = cmvVar3;
                                    } else {
                                        if (cfcVar == 0) {
                                            cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                        }
                                        if (X != 0) {
                                            cfcVar.n(X);
                                        }
                                        cfcVar.n(cmvVar3);
                                        X = 0;
                                    }
                                } else {
                                    X = X;
                                    cfcVar = cfcVar;
                                }
                                cmvVar3 = cmvVar3.x;
                                X = X;
                                cfcVar = cfcVar;
                            }
                            if (i != 1) {
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
                if ((cmvVar2.v & 32768) == 0) {
                    return;
                }
            }
        }
    }

    public final defpackage.vx az() {
        defpackage.vx vxVar = this.V;
        if (vxVar != null) {
            return vxVar;
        }
        defpackage.vx vxVar2 = new defpackage.vx(this, this.q);
        this.V = vxVar2;
        return vxVar2;
    }

    @Override // defpackage.cap
    public final void b() {
        dqc dqcVar = this.l;
        if (dqcVar != null) {
            dqcVar.b();
        }
        defpackage.cxy cxyVar = this.x;
        if (cxyVar != null) {
            cxyVar.k(true);
        }
        this.D = true;
        Y();
        if (al()) {
            this.N = null;
            this.o = false;
        }
        defpackage.dcv dcvVar = this.k;
        if (dcvVar != null) {
            defpackage.deg degVar = (defpackage.deg) dcvVar;
            defpackage.dbw dbwVar = degVar.w;
            dbwVar.i.bz(this);
            dbwVar.d.c(this);
            defpackage.cnf cnfVar = degVar.K;
            if (cnfVar == null || !cnfVar.h.e(this.c)) {
                return;
            }
            cnfVar.g.c(cnfVar.b, this.c, false);
        }
    }

    @Override // defpackage.cap
    public final void c() {
        dqc dqcVar = this.l;
        if (dqcVar != null) {
            dqcVar.c();
        }
        defpackage.cxy cxyVar = this.x;
        if (cxyVar != null) {
            cxyVar.g();
        }
        defpackage.dck dckVar = o().z;
        for (defpackage.dck dckVarP = p(); !defpackage.aooh.n(dckVarP, dckVar) && dckVarP != null; dckVarP = dckVarP.z) {
            dckVarP.ar();
        }
    }

    public final float d() {
        return n().A;
    }

    public final int e() {
        return this.w.o.b;
    }

    public final int f() {
        return n().i;
    }

    public final int g() {
        return this.w.o.a;
    }

    public final android.view.View h() {
        dqc dqcVar = this.l;
        if (dqcVar != null) {
            return dqcVar.c;
        }
        return null;
    }

    public final defpackage.cfc i() {
        if (this.P) {
            defpackage.cfc cfcVar = this.O;
            cfcVar.g();
            cfcVar.o(cfcVar.b, j());
            cfcVar.j(b);
            this.P = false;
        }
        return this.O;
    }

    public final defpackage.cfc j() {
        java.lang.Object obj;
        af();
        if (this.J == 0) {
            obj = this.U.b;
        } else {
            obj = this.K;
            if (obj == null) {
                defpackage.aooh.g();
                return null;
            }
        }
        return (defpackage.cfc) obj;
    }

    public final defpackage.dbk k() {
        do {
            this = this.M;
            if (this == null) {
                break;
            }
        } while (this.I);
        return this;
    }

    public final defpackage.dbm l() {
        return ((defpackage.deg) defpackage.dbn.a(this)).e.h;
    }

    public final defpackage.dbv m() {
        return this.w.p;
    }

    public final defpackage.dbx n() {
        return this.w.o;
    }

    public final defpackage.dck o() {
        return this.v.c;
    }

    public final defpackage.dck p() {
        return this.v.d;
    }

    public final defpackage.die q() {
        if (al() && !this.D && this.v.i(8)) {
            return this.N;
        }
        return null;
    }

    public final java.lang.Boolean r() {
        defpackage.dbv dbvVarM = m();
        if (dbvVarM != null) {
            return java.lang.Boolean.valueOf(dbvVarM.G());
        }
        return null;
    }

    public final java.util.List s() {
        defpackage.dbv dbvVarM = m();
        if (dbvVarM == null) {
            defpackage.aooh.g();
        }
        dbvVarM.r().u();
        if (!dbvVarM.r) {
            return dbvVarM.q.e();
        }
        defpackage.dbk dbkVarR = dbvVarM.r();
        defpackage.cfc cfcVar = dbvVarM.q;
        defpackage.cfc cfcVarJ = dbkVarR.j();
        java.lang.Object[] objArr = cfcVarJ.a;
        int i = cfcVarJ.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.dbk dbkVar = (defpackage.dbk) objArr[i2];
            if (cfcVar.b <= i2) {
                defpackage.dbv dbvVar = dbkVar.w.p;
                if (dbvVar == null) {
                    defpackage.aooh.g();
                }
                cfcVar.n(dbvVar);
            } else {
                defpackage.dbv dbvVar2 = dbkVar.w.p;
                if (dbvVar2 == null) {
                    defpackage.aooh.g();
                }
                cfcVar.d(i2, dbvVar2);
            }
        }
        cfcVar.h(dbkVarR.u().size(), cfcVar.b);
        dbvVarM.r = false;
        return cfcVar.e();
    }

    public final java.util.List t() {
        return n().t();
    }

    public final java.lang.String toString() {
        return dfg.b(this) + " children: " + u().size() + " measurePolicy: " + this.q + " deactivated: " + this.D + " isVirtual: " + this.I + " isPlaced: " + am();
    }

    public final java.util.List u() {
        return j().e();
    }

    public final java.util.List v() {
        return ((defpackage.cfc) this.U.b).e();
    }

    public final void w(defpackage.dcv dcvVar) {
        defpackage.dbk dbkVar;
        defpackage.die dieVarQ;
        if (this.k != null) {
            defpackage.cwh.d("Cannot attach " + this + " as it already is attached.  Tree: " + aA(0));
        }
        defpackage.dbk dbkVar2 = this.M;
        if (dbkVar2 != null && !defpackage.aooh.n(dbkVar2.k, dcvVar)) {
            defpackage.dbk dbkVarK = k();
            defpackage.dcv dcvVar2 = dbkVarK != null ? dbkVarK.k : null;
            java.lang.String strAA = aA(0);
            defpackage.dbk dbkVar3 = this.M;
            defpackage.cwh.d("Attaching to a different owner(" + dcvVar + ") than the parent's owner(" + dcvVar2 + "). This tree: " + strAA + " Parent tree: " + (dbkVar3 != null ? dbkVar3.aA(0) : null));
        }
        defpackage.dbk dbkVarK2 = k();
        if (dbkVarK2 == null) {
            n().s = true;
            ((defpackage.deg) dcvVar).o.e(this);
            defpackage.dbv dbvVarM = m();
            if (dbvVarM != null) {
                dbvVarM.z = 1;
            }
        }
        p().A = dbkVarK2 != null ? dbkVarK2.o() : null;
        this.k = dcvVar;
        this.m = (dbkVarK2 != null ? dbkVarK2.m : -1) + 1;
        defpackage.cmw cmwVar = this.S;
        if (cmwVar != null) {
            aC(cmwVar);
        }
        this.S = null;
        defpackage.deg degVar = (defpackage.deg) dcvVar;
        degVar.H.g(this.c, this);
        if (this.i) {
            aG(this);
        } else {
            defpackage.dbk dbkVar4 = this.M;
            if (dbkVar4 == null || (dbkVar = dbkVar4.j) == null) {
                dbkVar = this.j;
            }
            aG(dbkVar);
            if (this.j == null && this.v.i(512)) {
                aG(this);
            }
        }
        if (!this.D) {
            this.v.b();
        }
        defpackage.cfc cfcVar = (defpackage.cfc) this.U.b;
        java.lang.Object[] objArr = cfcVar.a;
        int i = cfcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.dbk) objArr[i2]).w(dcvVar);
        }
        if (!this.D) {
            this.v.e();
        }
        H();
        if (dbkVarK2 != null) {
            dbkVarK2.H();
        }
        defpackage.aonj aonjVar = this.z;
        if (aonjVar != null) {
            aonjVar.a(dcvVar);
        }
        this.w.m();
        if (!this.D && this.v.i(8)) {
            I();
        }
        defpackage.cnf cnfVar = degVar.K;
        if (cnfVar == null || (dieVarQ = q()) == null || !defpackage.adw.f(dieVarQ.c, defpackage.din.r)) {
            return;
        }
        cnfVar.h.d(this.c);
        cnfVar.g.c(cnfVar.b, this.c, true);
    }

    public final void x() {
        this.T = this.E;
        this.E = 3;
        defpackage.cfc cfcVarJ = j();
        java.lang.Object[] objArr = cfcVarJ.a;
        int i = cfcVarJ.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.dbk dbkVar = (defpackage.dbk) objArr[i2];
            if (dbkVar.E != 3) {
                dbkVar.x();
            }
        }
    }

    public final void y() {
        this.T = this.E;
        this.E = 3;
        defpackage.cfc cfcVarJ = j();
        java.lang.Object[] objArr = cfcVarJ.a;
        int i = cfcVarJ.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.dbk dbkVar = (defpackage.dbk) objArr[i2];
            if (dbkVar.E == 2) {
                dbkVar.y();
            }
        }
    }

    public final void z() {
        defpackage.dag dagVar;
        defpackage.dcv dcvVar = this.k;
        if (dcvVar == null) {
            defpackage.dbk dbkVarK = k();
            defpackage.cwh.b("Cannot detach node that is already detached!  Tree: ".concat(java.lang.String.valueOf(dbkVarK != null ? dbkVarK.aA(0) : null)));
            throw new defpackage.aoiq();
        }
        defpackage.dbk dbkVarK2 = k();
        if (dbkVarK2 != null) {
            dbkVarK2.F();
            dbkVarK2.H();
            n().G = 3;
            defpackage.dbv dbvVarM = m();
            if (dbvVarM != null) {
                dbvVarM.y = 3;
            }
        }
        defpackage.dbo dboVar = this.w;
        dboVar.o.w.h();
        defpackage.dbv dbvVar = dboVar.p;
        if (dbvVar != null && (dagVar = dbvVar.p) != null) {
            dagVar.h();
        }
        defpackage.dck dckVar = o().z;
        for (defpackage.dck dckVarP = p(); !defpackage.aooh.n(dckVarP, dckVar) && dckVarP != null; dckVarP = dckVarP.z) {
            dckVarP.aw();
            if (dckVarP.w.am()) {
                dckVarP.as();
            }
        }
        defpackage.aonj aonjVar = this.A;
        if (aonjVar != null) {
            aonjVar.a(dcvVar);
        }
        defpackage.dce dceVar = this.v;
        dceVar.f();
        this.n = true;
        defpackage.cfc cfcVar = (defpackage.cfc) this.U.b;
        java.lang.Object[] objArr = cfcVar.a;
        int i = cfcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.dbk) objArr[i2]).z();
        }
        this.n = false;
        dceVar.c();
        defpackage.deg degVar = (defpackage.deg) dcvVar;
        degVar.H.d(this.c);
        defpackage.dbw dbwVar = degVar.w;
        dbwVar.i.bz(this);
        dbwVar.d.c(this);
        degVar.t = true;
        defpackage.cnf cnfVar = degVar.K;
        if (cnfVar != null && cnfVar.h.e(this.c)) {
            cnfVar.g.c(cnfVar.b, this.c, false);
        }
        degVar.o.f(this);
        this.k = null;
        aG(null);
        this.m = 0;
        defpackage.dbx dbxVarN = n();
        dbxVarN.i = Integer.MAX_VALUE;
        dbxVarN.h = Integer.MAX_VALUE;
        dbxVarN.s = false;
        defpackage.dbv dbvVarM2 = m();
        if (dbvVarM2 != null) {
            dbvVarM2.i = Integer.MAX_VALUE;
            dbvVarM2.h = Integer.MAX_VALUE;
            dbvVarM2.z = 3;
        }
        if (dceVar.i(8)) {
            defpackage.die dieVar = this.N;
            this.N = null;
            this.o = false;
            degVar.p.b(this, dieVar);
            dcvVar.C();
        }
    }

    public final void as() {
    }

    public dbk() {
        this(false, 3, null);
    }

    public /* synthetic */ dbk(boolean z, int i, byte[] bArr) {
        this(1 == (((i & 1) ^ 1) & (z ? 1 : 0)), defpackage.dig.a.addAndGet(1));
    }
}
