package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dbv extends defpackage.czc implements defpackage.cyd, defpackage.dah, defpackage.dcb {
    private boolean A;
    public final defpackage.dbo f;
    public boolean g;
    public boolean j;
    public boolean k;
    public defpackage.dpd l;
    public defpackage.aonj n;
    public defpackage.cso o;
    public boolean s;
    public boolean x;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public int y = 3;
    public long m = 0;
    public int z = 3;
    public final defpackage.dag p = new defpackage.dbp(this);
    public final defpackage.cfc q = new defpackage.cfc(new defpackage.dbv[16]);
    public boolean r = true;
    private final defpackage.aomy B = new defpackage.bpa(this, 12);
    public boolean t = true;
    public java.lang.Object u = s().r;
    public long v = defpackage.dpe.c(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    public final defpackage.aomy w = new defpackage.bpa(this, 13);
    private final defpackage.aomy C = new defpackage.bpa(this, 14);

    public dbv(defpackage.dbo dboVar) {
        this.f = dboVar;
    }

    private final void L() {
        int i = this.z;
        if (N()) {
            this.z = 2;
        } else {
            this.z = 1;
        }
        if (i != 1 && this.f.d) {
            r().U(true, true, true);
        }
        defpackage.cfc cfcVarJ = r().j();
        java.lang.Object[] objArr = cfcVarJ.a;
        int i2 = cfcVarJ.b;
        for (int i3 = 0; i3 < i2; i3++) {
            defpackage.dbk dbkVar = (defpackage.dbk) objArr[i3];
            defpackage.dbv dbvVarM = dbkVar.m();
            if (dbvVarM == null) {
                throw new java.lang.IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (dbvVarM.i != Integer.MAX_VALUE) {
                dbvVarM.L();
                dbkVar.X(dbkVar);
            }
        }
    }

    private final void M() {
        int i = 1;
        r().U(false, true, true);
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

    private final boolean N() {
        return this.f.c;
    }

    private final boolean O() {
        return this.f.e;
    }

    public final void B() {
        if (this.f.n > 0) {
            defpackage.cfc cfcVarJ = r().j();
            java.lang.Object[] objArr = cfcVarJ.a;
            int i = cfcVarJ.b;
            for (int i2 = 0; i2 < i; i2++) {
                defpackage.dbk dbkVar = (defpackage.dbk) objArr[i2];
                defpackage.dbo dboVar = dbkVar.w;
                if ((dboVar.l || dboVar.m) && !dboVar.e) {
                    dbkVar.T(false);
                }
                defpackage.dbv dbvVar = dboVar.p;
                if (dbvVar != null) {
                    dbvVar.B();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public final void C() {
        this.x = true;
        defpackage.dbk dbkVarK = r().k();
        int i = this.z;
        if (i == 1) {
            if (N()) {
                L();
                if (this.g && dbkVarK != null) {
                    dbkVarK.T(false);
                }
            }
        } else if (!N()) {
            L();
            if (this.g) {
                dbkVarK.T(false);
            }
        } else if (i != 2) {
            if (N()) {
                L();
                if (this.g) {
                    dbkVarK.T(false);
                }
            }
        }
        if (dbkVarK == null) {
            this.i = 0;
        } else if (!this.g && (dbkVarK.av() == 3 || dbkVarK.av() == 4)) {
            if (this.i != Integer.MAX_VALUE) {
                defpackage.cwh.d("Place was called on a node which was placed already");
            }
            defpackage.dbo dboVar = dbkVarK.w;
            int i2 = dboVar.g;
            this.i = i2;
            dboVar.g = i2 + 1;
        }
        m();
    }

    public final void D(boolean z) {
        this.f.e = z;
    }

    public final void E(boolean z) {
        this.f.f = z;
    }

    public final boolean F() {
        return defpackage.cfo.s(r()) || N();
    }

    public final boolean G() {
        return this.z != 3;
    }

    public final boolean H(long j) throws java.lang.Throwable {
        defpackage.dpd dpdVar;
        defpackage.dbk dbkVarR = r();
        try {
            if (r().D) {
                defpackage.cwh.c("measure is called on a deactivated node");
            }
            defpackage.dbk dbkVarK = r().k();
            r().u = r().u || (dbkVarK != null && dbkVarK.u);
            if (!r().aj() && (dpdVar = this.l) != null && dpdVar.a == j) {
                defpackage.dcv dcvVar = r().k;
                if (dcvVar != null) {
                    dcvVar.v(r(), true);
                }
                r().Z();
                return false;
            }
            this.l = new defpackage.dpd(j);
            A(j);
            this.p.f = false;
            l(new defpackage.ckc(11));
            long j2 = this.A ? this.c : -9223372034707292160L;
            this.A = true;
            defpackage.dbu dbuVarD = t().D();
            if (dbuVarD == null) {
                defpackage.cwh.d("Lookahead result from lookaheadRemeasure cannot be null");
            }
            defpackage.dbv dbvVar = this.f.p;
            if (dbvVar != null) {
                dbvVar.K(2);
                dbvVar.f.d = false;
                dbvVar.v = j;
                defpackage.dcy dcyVar = ((defpackage.deg) defpackage.dbn.a(dbvVar.r())).u;
                dcyVar.a.c(dbvVar.r(), dcyVar.b, dbvVar.w);
                dbvVar.D(true);
                dbvVar.E(true);
                if (defpackage.cfo.s(dbvVar.r())) {
                    dbvVar.s().u();
                } else {
                    dbvVar.s().B();
                }
                dbvVar.K(5);
            }
            z((((long) dbuVarD.a) << 32) | (((long) dbuVarD.b) & 4294967295L));
            if (((int) (j2 >> 32)) == dbuVarD.a) {
                if (((int) (j2 & 4294967295L)) == dbuVarD.b) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Throwable th) {
            dbkVarR.ar(th);
            throw new defpackage.aoiq();
        }
    }

    public final void I(long j, defpackage.aonj aonjVar, defpackage.cso csoVar) throws java.lang.Throwable {
        defpackage.dbk dbkVarR = r();
        try {
            defpackage.dbk dbkVarK = r().k();
            if (dbkVarK != null && dbkVarK.av() == 4) {
                this.f.c = false;
            }
            if (r().D) {
                defpackage.cwh.c("place is called on a deactivated node");
            }
            K(4);
            this.k = true;
            this.x = false;
            if (j != this.m) {
                defpackage.dbo dboVar = this.f;
                if (dboVar.m || dboVar.l) {
                    D(true);
                }
                B();
            }
            defpackage.dcv dcvVarA = defpackage.dbn.a(r());
            this.m = j;
            if (O() || !G()) {
                this.f.k(false);
                this.p.g = false;
                defpackage.dcy dcyVar = ((defpackage.deg) dcvVarA).u;
                defpackage.dbk dbkVarR2 = r();
                defpackage.aomy aomyVar = this.C;
                dcyVar.a.c(dbkVarR2, dcyVar.g, aomyVar);
            } else {
                defpackage.dbu dbuVarD = t().D();
                if (dbuVarD == null) {
                    defpackage.aooh.g();
                }
                dbuVarD.E(defpackage.dpn.d(j, dbuVarD.e));
                C();
            }
            this.n = aonjVar;
            this.o = csoVar;
            K(5);
        } catch (java.lang.Throwable th) {
            dbkVarR.ar(th);
            throw new defpackage.aoiq();
        }
    }

    public final int J() {
        return this.f.q;
    }

    public final void K(int i) {
        this.f.q = i;
    }

    @Override // defpackage.dcb
    public final void U(boolean z) {
        defpackage.dbu dbuVarD;
        defpackage.dbu dbuVarD2 = t().D();
        if (defpackage.aooh.n(java.lang.Boolean.valueOf(z), dbuVarD2 != null ? java.lang.Boolean.valueOf(dbuVarD2.l) : null) || (dbuVarD = t().D()) == null) {
            return;
        }
        dbuVarD.l = z;
    }

    @Override // defpackage.cxe
    public final int c(int i) {
        M();
        defpackage.dbu dbuVarD = t().D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        return dbuVarD.c(i);
    }

    @Override // defpackage.cxe
    public final int d(int i) {
        M();
        defpackage.dbu dbuVarD = t().D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        return dbuVarD.d(i);
    }

    @Override // defpackage.czc
    public final void dg(long j, float f, defpackage.aonj aonjVar) throws java.lang.Throwable {
        I(j, aonjVar, null);
    }

    @Override // defpackage.cyj
    public final int dm(defpackage.cwk cwkVar) {
        defpackage.dbk dbkVarK = r().k();
        if (dbkVarK == null || dbkVarK.av() != 2) {
            defpackage.dbk dbkVarK2 = r().k();
            if (dbkVarK2 != null && dbkVarK2.av() == 4) {
                this.p.d = true;
            }
        } else {
            this.p.c = true;
        }
        this.j = true;
        defpackage.dbu dbuVarD = t().D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        int iDm = dbuVarD.dm(cwkVar);
        this.j = false;
        return iDm;
    }

    @Override // defpackage.cxe
    public final int e(int i) {
        M();
        defpackage.dbu dbuVarD = t().D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        return dbuVarD.e(i);
    }

    @Override // defpackage.cxe
    public final int f(int i) {
        M();
        defpackage.dbu dbuVarD = t().D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        return dbuVarD.f(i);
    }

    @Override // defpackage.czc, defpackage.cxe
    public final java.lang.Object g() {
        return this.u;
    }

    @Override // defpackage.dah
    public final int h() {
        return this.i;
    }

    @Override // defpackage.dah
    public final defpackage.dag i() {
        return this.p;
    }

    @Override // defpackage.dah
    public final defpackage.dah j() {
        defpackage.dbo dboVar;
        defpackage.dbk dbkVarK = r().k();
        if (dbkVarK == null || (dboVar = dbkVarK.w) == null) {
            return null;
        }
        return dboVar.p;
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
            defpackage.dbv dbvVar = ((defpackage.dbk) objArr[i2]).w.p;
            if (dbvVar == null) {
                defpackage.aooh.g();
            }
            aonjVar.a(dbvVar);
        }
    }

    @Override // defpackage.dah
    public final void m() {
        this.s = true;
        defpackage.dag dagVar = this.p;
        dagVar.g();
        if (O()) {
            defpackage.cfc cfcVarJ = r().j();
            java.lang.Object[] objArr = cfcVarJ.a;
            int i = cfcVarJ.b;
            for (int i2 = 0; i2 < i; i2++) {
                defpackage.dbk dbkVar = (defpackage.dbk) objArr[i2];
                if (dbkVar.aj() && dbkVar.ax() == 1) {
                    defpackage.dbo dboVar = dbkVar.w;
                    defpackage.dbv dbvVar = dboVar.p;
                    if (dbvVar == null) {
                        defpackage.aooh.g();
                    }
                    defpackage.dpd dpdVarC = dboVar.c();
                    if (dpdVarC == null) {
                        defpackage.aooh.g();
                    }
                    if (dbvVar.H(dpdVarC.a)) {
                        r().U(false, true, true);
                    }
                }
            }
        }
        defpackage.dbu dbuVar = ((defpackage.daz) k()).g;
        if (dbuVar == null) {
            defpackage.aooh.g();
        }
        defpackage.dbo dboVar2 = this.f;
        if (dboVar2.f || (!this.j && !dbuVar.n && O())) {
            D(false);
            int iJ = J();
            K(4);
            dboVar2.l(false);
            defpackage.dcy dcyVar = ((defpackage.deg) defpackage.dbn.a(r())).u;
            dcyVar.a.c(r(), dcyVar.h, this.B);
            K(iJ);
            if (dboVar2.l && dbuVar.n) {
                n();
            }
            E(false);
        }
        if (dagVar.d) {
            dagVar.e = true;
        }
        if (dagVar.b && dagVar.j()) {
            dagVar.f();
        }
        this.s = false;
    }

    @Override // defpackage.dah
    public final void n() {
        r().T(false);
    }

    @Override // defpackage.dah
    public final void o() {
        r().U(false, true, true);
    }

    @Override // defpackage.dah
    public final void p(boolean z) {
        defpackage.dbu dbuVar = ((defpackage.daz) k()).g;
        if (dbuVar != null) {
            dbuVar.n = z;
        }
    }

    @Override // defpackage.dah
    public final boolean q() {
        defpackage.dbu dbuVar = ((defpackage.daz) k()).g;
        return dbuVar != null && dbuVar.n;
    }

    public final defpackage.dbk r() {
        return this.f.a;
    }

    public final defpackage.dbx s() {
        return this.f.o;
    }

    public final defpackage.dck t() {
        return this.f.a();
    }

    public final void u(boolean z) {
        if (z) {
            if (F()) {
                return;
            }
        } else if (!F()) {
            return;
        }
        this.z = 3;
        defpackage.cfc cfcVarJ = r().j();
        java.lang.Object[] objArr = cfcVarJ.a;
        int i = cfcVarJ.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.dbv dbvVar = ((defpackage.dbk) objArr[i2]).w.p;
            if (dbvVar == null) {
                defpackage.aooh.g();
            }
            dbvVar.u(true);
        }
    }

    @Override // defpackage.cyd
    public final defpackage.czc v(long j) {
        defpackage.dbk dbkVarK;
        defpackage.dbk dbkVarK2 = r().k();
        int i = 2;
        if ((dbkVarK2 != null && dbkVarK2.av() == 2) || ((dbkVarK = r().k()) != null && dbkVarK.av() == 4)) {
            this.f.b = false;
        }
        defpackage.dbk dbkVarR = r();
        defpackage.dbk dbkVarK3 = dbkVarR.k();
        if (dbkVarK3 != null) {
            if (this.y != 3 && !dbkVarR.u) {
                defpackage.cwh.d("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iAv = dbkVarK3.av();
            int i2 = iAv - 1;
            if (iAv == 0) {
                throw null;
            }
            if (i2 == 0 || i2 == 1) {
                i = 1;
            } else if (i2 != 2 && i2 != 3) {
                int iAv2 = dbkVarK3.av();
                defpackage.cfo.t(iAv2);
                throw new java.lang.IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(defpackage.cfo.t(iAv2)));
            }
            this.y = i;
        } else {
            this.y = 3;
        }
        if (r().E == 3) {
            r().x();
        }
        H(j);
        return this;
    }

    @Override // defpackage.czc
    public final int w() {
        defpackage.dbu dbuVarD = t().D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        return dbuVarD.w();
    }

    @Override // defpackage.czc
    public final int x() {
        defpackage.dbu dbuVarD = t().D();
        if (dbuVarD == null) {
            defpackage.aooh.g();
        }
        return dbuVarD.x();
    }

    @Override // defpackage.czc
    public final void y(long j, float f, defpackage.cso csoVar) throws java.lang.Throwable {
        I(j, null, csoVar);
    }
}
