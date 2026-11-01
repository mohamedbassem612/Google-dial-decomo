package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dbx extends defpackage.czc implements defpackage.cyd, defpackage.dah, defpackage.dcb {
    public float A;
    public boolean B;
    public defpackage.aonj C;
    public defpackage.cso D;
    public float F;
    private boolean H;
    private boolean M;
    public final defpackage.dbo f;
    public boolean g;
    public boolean j;
    public boolean k;
    public boolean l;
    public defpackage.aonj n;
    public defpackage.cso o;
    public float p;
    public java.lang.Object r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean y;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public int G = 3;
    public long m = 0;
    public boolean q = true;
    public final defpackage.dag w = new defpackage.dbl(this);
    private final defpackage.cfc I = new defpackage.cfc(new defpackage.dbx[16]);
    public boolean x = true;
    public long z = defpackage.dpe.c(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    private final defpackage.aomy J = new defpackage.bpa(this, 15);
    private final defpackage.aomy K = new defpackage.bpa(this, 16);
    public long E = 0;
    private final defpackage.aomy L = new defpackage.bpa(this, 17);

    public dbx(defpackage.dbo dboVar) {
        this.f = dboVar;
    }

    private final defpackage.dbv J() {
        return this.f.p;
    }

    private final void K() {
        boolean z = this.s;
        this.s = true;
        defpackage.dbk dbkVarR = r();
        if (!z) {
            dbkVarR.o().aq();
            ((defpackage.deg) defpackage.dbn.a(dbkVarR)).o.e(r());
            if (dbkVarR.ak()) {
                dbkVarR.W(true, true, true);
            } else if (dbkVarR.aj()) {
                dbkVarR.U(true, true, true);
            }
        }
        defpackage.dck dckVar = dbkVarR.o().z;
        for (defpackage.dck dckVarP = dbkVarR.p(); !defpackage.aooh.n(dckVarP, dckVar) && dckVarP != null; dckVarP = dckVarP.z) {
            if (dckVarP.K) {
                dckVarP.am();
            }
        }
        defpackage.cfc cfcVarJ = dbkVarR.j();
        java.lang.Object[] objArr = cfcVarJ.a;
        int i = cfcVarJ.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.dbk dbkVar = (defpackage.dbk) objArr[i2];
            if (dbkVar.f() != Integer.MAX_VALUE) {
                dbkVar.n().K();
                dbkVarR.X(dbkVar);
            }
        }
    }

    private final void L() {
        int i = 1;
        r().W(false, true, true);
        defpackage.dbk dbkVarK = r().k();
        if (dbkVarK == null || r().E != 3) {
            return;
        }
        defpackage.dbk dbkVarR = r();
        int iAv = dbkVarK.av();
        int i2 = iAv - 1;
        if (iAv == 0) {
            throw null;
        }
        if (i2 != 0) {
            i = 2;
            if (i2 != 2) {
                i = dbkVarK.E;
            }
        }
        dbkVarR.E = i;
    }

    private final void M(long j, float f, defpackage.aonj aonjVar, defpackage.cso csoVar) throws java.lang.Throwable {
        defpackage.czb cyyVar;
        defpackage.dbk dbkVarR = r();
        try {
            this.t = true;
            if (j != this.m || aonjVar != this.n || this.M) {
                defpackage.dbo dboVar = this.f;
                if (dboVar.j || dboVar.i || this.M) {
                    this.v = true;
                    this.M = false;
                }
            }
            defpackage.dbv dbvVarJ = J();
            if (dbvVarJ != null && dbvVarJ.z == 3 && !defpackage.cfo.s(dbvVarJ.r())) {
                dbvVarJ.f.c = true;
            }
            defpackage.dbv dbvVarJ2 = J();
            if (dbvVarJ2 != null && dbvVarJ2.F()) {
                defpackage.dck dckVar = s().A;
                if (dckVar == null || (cyyVar = dckVar.o) == null) {
                    cyyVar = new defpackage.cyy(defpackage.dbn.a(r()));
                }
                defpackage.dbv dbvVarJ3 = J();
                if (dbvVarJ3 == null) {
                    defpackage.aooh.g();
                }
                defpackage.dbk dbkVarK = r().k();
                if (dbkVarK != null) {
                    dbkVarK.w.g = 0;
                }
                dbvVarJ3.i = Integer.MAX_VALUE;
                cyyVar.s(dbvVarJ3, (int) (j >> 32), (int) (4294967295L & j), 0.0f);
            }
            defpackage.dbv dbvVarJ4 = J();
            if (dbvVarJ4 != null && !dbvVarJ4.k) {
                defpackage.cwh.d("Error: Placement happened before lookahead.");
            }
            E(j, f, aonjVar, csoVar);
        } catch (java.lang.Throwable th) {
            dbkVarR.ar(th);
            throw new defpackage.aoiq();
        }
    }

    public final void B() {
        this.u = true;
    }

    public final void C() {
        if (this.s) {
            this.s = false;
            ((defpackage.deg) defpackage.dbn.a(r())).o.f(r());
            defpackage.dbk dbkVarR = r();
            defpackage.dck dckVar = dbkVarR.o().z;
            for (defpackage.dck dckVarP = dbkVarR.p(); !defpackage.aooh.n(dckVarP, dckVar) && dckVarP != null; dckVarP = dckVarP.z) {
                dckVarP.as();
                dckVarP.aw();
            }
            defpackage.cfc cfcVarJ = r().j();
            java.lang.Object[] objArr = cfcVarJ.a;
            int i = cfcVarJ.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((defpackage.dbk) objArr[i2]).n().C();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    public final void D() {
        this.B = true;
        defpackage.dbk dbkVarK = r().k();
        float f = k().C;
        defpackage.dbk dbkVarR = r();
        defpackage.dck dckVarP = dbkVarR.p();
        defpackage.dck dckVarO = dbkVarR.o();
        while (dckVarP != dckVarO) {
            if (dckVarP == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            }
            defpackage.dbg dbgVar = (defpackage.dbg) dckVarP;
            f += dbgVar.C;
            dckVarP = dbgVar.z;
        }
        if (f != this.A) {
            this.A = f;
            if (dbkVarK != null) {
                dbkVarK.P();
                dbkVarK.F();
            }
        }
        if (!k().n) {
            boolean z = this.s;
            if (!z || this.w.i()) {
                K();
                if (z) {
                    r().o().aq();
                } else {
                    if (dbkVarK != null) {
                        dbkVarK.F();
                    }
                    if (this.g && dbkVarK != null) {
                        dbkVarK.V(false);
                    }
                }
            } else {
                r().o().aq();
            }
        }
        if (dbkVarK == null) {
            this.i = 0;
        } else if (!this.g && dbkVarK.av() == 3) {
            if (this.i != Integer.MAX_VALUE) {
                defpackage.cwh.d("Place was called on a node which was placed already");
            }
            defpackage.dbo dboVar = dbkVarK.w;
            int i = dboVar.h;
            this.i = i;
            dboVar.h = i + 1;
        }
        m();
    }

    public final void E(long j, float f, defpackage.aonj aonjVar, defpackage.cso csoVar) {
        if (r().D) {
            defpackage.cwh.c("place is called on a deactivated node");
        }
        I(3);
        this.m = j;
        this.p = f;
        this.n = aonjVar;
        this.o = csoVar;
        this.B = false;
        defpackage.dcv dcvVarA = defpackage.dbn.a(r());
        if (this.v || !this.s) {
            this.w.g = false;
            this.f.i(false);
            this.C = aonjVar;
            this.E = j;
            this.F = f;
            this.D = csoVar;
            defpackage.dcy dcyVar = ((defpackage.deg) dcvVarA).u;
            defpackage.dbk dbkVarR = r();
            defpackage.aomy aomyVar = this.L;
            dcyVar.a.c(dbkVarR, dcyVar.f, aomyVar);
        } else {
            defpackage.dck dckVarS = s();
            dckVarS.au(defpackage.dpn.d(j, dckVarS.e), f, aonjVar, csoVar);
            D();
        }
        I(5);
        if (s().n) {
            defpackage.dbo dboVar = this.f;
            if (dboVar.j || dboVar.i) {
                n();
            }
        }
        this.k = true;
    }

    public final void F() {
        if (!r().am() || this.f.k <= 0) {
            return;
        }
        defpackage.dbo dboVar = r().w;
        if ((dboVar.i || dboVar.j) && !dboVar.n()) {
            r().V(false);
        }
        defpackage.cfc cfcVarJ = r().j();
        java.lang.Object[] objArr = cfcVarJ.a;
        int i = cfcVarJ.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.dbk) objArr[i2]).n().F();
        }
    }

    public final boolean G(long j) throws java.lang.Throwable {
        defpackage.dbk dbkVarR = r();
        try {
            if (r().D) {
                defpackage.cwh.c("measure is called on a deactivated node");
            }
            defpackage.dcv dcvVarA = defpackage.dbn.a(r());
            defpackage.dbk dbkVarK = r().k();
            r().u = r().u || (dbkVarK != null && dbkVarK.u);
            if (!r().ak() && this.d == j) {
                dcvVarA.v(r(), false);
                r().Z();
                return false;
            }
            this.w.f = false;
            l(new defpackage.ckc(16));
            this.j = true;
            long j2 = s().c;
            A(j);
            if (H() != 5) {
                defpackage.cwh.d("layout state is not idle before measure starts");
            }
            this.z = j;
            I(1);
            this.u = false;
            defpackage.dcy dcyVar = ((defpackage.deg) defpackage.dbn.a(r())).u;
            dcyVar.a.c(r(), dcyVar.c, this.J);
            if (H() == 1) {
                u();
                I(5);
            }
            boolean z = (s().c == j2 && s().a == this.a && s().b == this.b) ? false : true;
            z((((long) s().a) << 32) | (((long) s().b) & 4294967295L));
            return z;
        } catch (java.lang.Throwable th) {
            dbkVarR.ar(th);
            throw new defpackage.aoiq();
        }
    }

    public final int H() {
        return this.f.q;
    }

    public final void I(int i) {
        this.f.q = i;
    }

    @Override // defpackage.dcb
    public final void U(boolean z) {
        if (z != s().l) {
            s().l = z;
            this.M = true;
        }
    }

    @Override // defpackage.cxe
    public final int c(int i) {
        if (!defpackage.cfo.s(r())) {
            L();
            return s().c(i);
        }
        defpackage.dbv dbvVarJ = J();
        if (dbvVarJ == null) {
            defpackage.aooh.g();
        }
        return dbvVarJ.c(i);
    }

    @Override // defpackage.cxe
    public final int d(int i) {
        if (!defpackage.cfo.s(r())) {
            L();
            return s().d(i);
        }
        defpackage.dbv dbvVarJ = J();
        if (dbvVarJ == null) {
            defpackage.aooh.g();
        }
        return dbvVarJ.d(i);
    }

    @Override // defpackage.czc
    public final void dg(long j, float f, defpackage.aonj aonjVar) throws java.lang.Throwable {
        M(j, f, aonjVar, null);
    }

    @Override // defpackage.cyj
    public final int dm(defpackage.cwk cwkVar) {
        defpackage.dbk dbkVarK = r().k();
        if (dbkVarK == null || dbkVarK.av() != 1) {
            defpackage.dbk dbkVarK2 = r().k();
            if (dbkVarK2 != null && dbkVarK2.av() == 3) {
                this.w.d = true;
            }
        } else {
            this.w.c = true;
        }
        this.l = true;
        int iDm = s().dm(cwkVar);
        this.l = false;
        return iDm;
    }

    @Override // defpackage.cxe
    public final int e(int i) {
        if (!defpackage.cfo.s(r())) {
            L();
            return s().e(i);
        }
        defpackage.dbv dbvVarJ = J();
        if (dbvVarJ == null) {
            defpackage.aooh.g();
        }
        return dbvVarJ.e(i);
    }

    @Override // defpackage.cxe
    public final int f(int i) {
        if (!defpackage.cfo.s(r())) {
            L();
            return s().f(i);
        }
        defpackage.dbv dbvVarJ = J();
        if (dbvVarJ == null) {
            defpackage.aooh.g();
        }
        return dbvVarJ.f(i);
    }

    @Override // defpackage.czc, defpackage.cxe
    public final java.lang.Object g() {
        return this.r;
    }

    @Override // defpackage.dah
    public final int h() {
        return this.i;
    }

    @Override // defpackage.dah
    public final defpackage.dag i() {
        return this.w;
    }

    @Override // defpackage.dah
    public final defpackage.dah j() {
        defpackage.dbo dboVar;
        defpackage.dbk dbkVarK = r().k();
        if (dbkVarK == null || (dboVar = dbkVarK.w) == null) {
            return null;
        }
        return dboVar.o;
    }

    @Override // defpackage.dah
    public final defpackage.dck k() {
        return r().o();
    }

    @Override // defpackage.dah
    public final void l(defpackage.aonj aonjVar) {
        defpackage.cfc cfcVarJ = r().j();
        java.lang.Object[] objArr = cfcVarJ.a;
        int i = cfcVarJ.b;
        for (int i2 = 0; i2 < i; i2++) {
            aonjVar.a(((defpackage.dbk) objArr[i2]).w.o);
        }
    }

    @Override // defpackage.dah
    public final void m() {
        this.y = true;
        defpackage.dag dagVar = this.w;
        dagVar.g();
        if (this.v) {
            defpackage.cfc cfcVarJ = r().j();
            java.lang.Object[] objArr = cfcVarJ.a;
            int i = cfcVarJ.b;
            for (int i2 = 0; i2 < i; i2++) {
                defpackage.dbk dbkVar = (defpackage.dbk) objArr[i2];
                if (dbkVar.ak() && dbkVar.aw() == 1 && dbkVar.ap(dbkVar.w.b())) {
                    r().W(false, true, true);
                }
            }
        }
        if (this.H || (!this.l && !k().n && this.v)) {
            this.v = false;
            int iH = H();
            I(3);
            this.f.j(false);
            defpackage.dbk dbkVarR = r();
            defpackage.dcy dcyVar = ((defpackage.deg) defpackage.dbn.a(dbkVarR)).u;
            dcyVar.a.c(dbkVarR, dcyVar.e, this.K);
            I(iH);
            this.H = false;
        }
        if (dagVar.d) {
            dagVar.e = true;
        }
        if (dagVar.b && dagVar.j()) {
            dagVar.f();
        }
        this.y = false;
    }

    @Override // defpackage.dah
    public final void n() {
        r().V(false);
    }

    @Override // defpackage.dah
    public final void o() {
        r().W(false, true, true);
    }

    @Override // defpackage.dah
    public final void p(boolean z) {
        k().n = z;
    }

    @Override // defpackage.dah
    public final boolean q() {
        return k().n;
    }

    public final defpackage.dbk r() {
        return this.f.a;
    }

    public final defpackage.dck s() {
        return this.f.a();
    }

    public final java.util.List t() {
        r().af();
        if (!this.x) {
            return this.I.e();
        }
        defpackage.dbk dbkVarR = r();
        defpackage.cfc cfcVar = this.I;
        defpackage.cfc cfcVarJ = dbkVarR.j();
        java.lang.Object[] objArr = cfcVarJ.a;
        int i = cfcVarJ.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.dbk dbkVar = (defpackage.dbk) objArr[i2];
            if (cfcVar.b <= i2) {
                cfcVar.n(dbkVar.w.o);
            } else {
                cfcVar.d(i2, dbkVar.w.o);
            }
        }
        cfcVar.h(dbkVarR.u().size(), cfcVar.b);
        this.x = false;
        return cfcVar.e();
    }

    public final void u() {
        this.v = true;
        this.H = true;
    }

    @Override // defpackage.cyd
    public final defpackage.czc v(long j) throws java.lang.Throwable {
        int i = 3;
        if (r().E == 3) {
            r().x();
        }
        if (defpackage.cfo.s(r())) {
            defpackage.dbv dbvVarJ = J();
            if (dbvVarJ == null) {
                defpackage.aooh.g();
            }
            dbvVarJ.y = 3;
            dbvVarJ.v(j);
        }
        defpackage.dbk dbkVarR = r();
        defpackage.dbk dbkVarK = dbkVarR.k();
        if (dbkVarK != null) {
            if (this.G != 3 && !dbkVarR.u) {
                defpackage.cwh.d("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iAv = dbkVarK.av();
            int i2 = iAv - 1;
            if (iAv == 0) {
                throw null;
            }
            if (i2 == 0) {
                i = 1;
            } else {
                if (i2 != 2) {
                    int iAv2 = dbkVarK.av();
                    defpackage.cfo.t(iAv2);
                    throw new java.lang.IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(defpackage.cfo.t(iAv2)));
                }
                i = 2;
            }
        }
        this.G = i;
        G(j);
        return this;
    }

    @Override // defpackage.czc
    public final int w() {
        return s().w();
    }

    @Override // defpackage.czc
    public final int x() {
        return s().x();
    }

    @Override // defpackage.czc
    public final void y(long j, float f, defpackage.cso csoVar) throws java.lang.Throwable {
        M(j, f, null, csoVar);
    }
}
