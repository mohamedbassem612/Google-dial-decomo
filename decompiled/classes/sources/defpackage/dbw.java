package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dbw {
    public final defpackage.dbk a;
    public boolean b;
    public boolean c;
    public defpackage.dpd g;
    public final defpackage.aogc i = new defpackage.aogc((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
    public final defpackage.dcr d = new defpackage.dcr();
    public final defpackage.cfc e = new defpackage.cfc(new defpackage.dcu[16]);
    public final defpackage.cfc f = new defpackage.cfc(new defpackage.agxg[16]);
    public final wo h = null;

    public dbw(defpackage.dbk dbkVar) {
        this.a = dbkVar;
    }

    public static final boolean k(defpackage.dbk dbkVar, defpackage.dpd dpdVar) {
        if (dbkVar.j == null) {
            return false;
        }
        boolean zAo = dpdVar != null ? dbkVar.ao(dpdVar) : dbkVar.ao(dbkVar.w.c());
        defpackage.dbk dbkVarK = dbkVar.k();
        if (zAo && dbkVarK != null) {
            if (dbkVarK.j == null) {
                dbkVarK.W(false, true, false);
            } else if (dbkVar.ax() == 1) {
                dbkVarK.U(false, true, false);
            } else if (dbkVar.ax() == 2) {
                dbkVarK.T(false);
                return true;
            }
        }
        return zAo;
    }

    public static final boolean l(defpackage.dbk dbkVar, defpackage.dpd dpdVar) {
        boolean zAp = dpdVar != null ? dbkVar.ap(dpdVar) : dbkVar.ap(dbkVar.w.b());
        defpackage.dbk dbkVarK = dbkVar.k();
        if (!zAp || dbkVarK == null) {
            return zAp;
        }
        if (dbkVar.aw() == 1) {
            dbkVarK.W(false, true, false);
            return zAp;
        }
        if (dbkVar.aw() != 2) {
            return zAp;
        }
        dbkVarK.V(false);
        return true;
    }

    public static final boolean m(defpackage.dbk dbkVar) {
        defpackage.dbv dbvVar;
        defpackage.dag dagVar;
        if (dbkVar.aj()) {
            return (dbkVar.ax() == 3 && ((dbvVar = dbkVar.w.p) == null || (dagVar = dbvVar.p) == null || !dagVar.j())) ? false : true;
        }
        return false;
    }

    public static final boolean n(defpackage.dbk dbkVar) {
        defpackage.dbk dbkVarK;
        if (dbkVar.ak()) {
            do {
                if ((dbkVar.aw() != 3 || dbkVar.w.o.w.j() || ((dbkVarK = dbkVar.k()) != null && dbkVarK.av() == 1)) && (dbkVar = dbkVar.k()) != null) {
                }
            } while (!dbkVar.am());
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:37:0x0058 A[SYNTHETIC] */
    private final void o(defpackage.dbk dbkVar, boolean z) {
        defpackage.dbv dbvVar;
        defpackage.dag dagVar;
        defpackage.cfc cfcVarJ = dbkVar.j();
        java.lang.Object[] objArr = cfcVarJ.a;
        int i = cfcVarJ.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.dbk dbkVar2 = (defpackage.dbk) objArr[i2];
            if (z) {
                if (dbkVar2.ax() == 1 || ((dbvVar = dbkVar2.w.p) != null && (dagVar = dbvVar.p) != null && dagVar.j())) {
                    if (defpackage.cfo.s(dbkVar2)) {
                        if (dbkVar2.aj()) {
                            e(dbkVar2, true);
                        } else {
                            e(dbkVar2, true);
                        }
                    }
                    p(dbkVar2, z);
                    if (!r(dbkVar2, z)) {
                        o(dbkVar2, z);
                    }
                }
            } else if (q(dbkVar2)) {
                if (defpackage.cfo.s(dbkVar2) && !z) {
                    if (dbkVar2.aj() || !this.i.by(dbkVar2)) {
                        e(dbkVar2, true);
                    } else {
                        s(dbkVar2, true);
                    }
                }
                p(dbkVar2, z);
                if (!r(dbkVar2, z)) {
                    o(dbkVar2, z);
                }
            }
        }
        p(dbkVar, z);
    }

    private final void p(defpackage.dbk dbkVar, boolean z) {
        if (r(dbkVar, z)) {
            s(dbkVar, z);
        }
    }

    private static final boolean q(defpackage.dbk dbkVar) {
        return dbkVar.aw() == 1 || dbkVar.w.o.w.j();
    }

    private static final boolean r(defpackage.dbk dbkVar, boolean z) {
        return z ? dbkVar.aj() : dbkVar.ak();
    }

    private final boolean s(defpackage.dbk dbkVar, boolean z) {
        defpackage.dpd dpdVar;
        boolean zL = false;
        if (!dbkVar.D && t(dbkVar)) {
            if (dbkVar == this.a) {
                dpdVar = this.g;
                if (dpdVar == null) {
                    defpackage.aooh.g();
                }
            } else {
                dpdVar = null;
            }
            if (z) {
                if (dbkVar.aj()) {
                    zL = k(dbkVar, dpdVar);
                }
            } else if (dbkVar.ak()) {
                zL = l(dbkVar, dpdVar);
            }
            c();
        }
        return zL;
    }

    private static final boolean t(defpackage.dbk dbkVar) {
        defpackage.dag dagVar;
        if (dbkVar.am() || dbkVar.an() || n(dbkVar) || defpackage.aooh.n(dbkVar.r(), java.lang.Boolean.TRUE) || m(dbkVar)) {
            return true;
        }
        defpackage.dbo dboVar = dbkVar.w;
        if (dboVar.o.w.j()) {
            return true;
        }
        defpackage.dbv dbvVar = dboVar.p;
        return (dbvVar == null || (dagVar = dbvVar.p) == null || !dagVar.j()) ? false : true;
    }

    public final void a() {
        defpackage.cfc cfcVar = this.e;
        java.lang.Object[] objArr = cfcVar.a;
        int i = cfcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.dcu) objArr[i2]).a();
        }
        cfcVar.g();
    }

    public final void b(boolean z) {
        if (z) {
            defpackage.dcr dcrVar = this.d;
            defpackage.dbk dbkVar = this.a;
            if (dbkVar.C > 0) {
                defpackage.cfc cfcVar = dcrVar.a;
                cfcVar.g();
                cfcVar.n(dbkVar);
                dbkVar.B = true;
            }
        }
        defpackage.dcr dcrVar2 = this.d;
        if (!dcrVar2.d()) {
            return;
        }
        android.os.Trace.beginSection("Compose:onPositionedCallbacks");
        try {
            defpackage.cfc cfcVar2 = dcrVar2.a;
            cfcVar2.j(defpackage.cph.b);
            int i = cfcVar2.b;
            defpackage.dbk[] dbkVarArr = dcrVar2.b;
            if (dbkVarArr == null || dbkVarArr.length < i) {
                dbkVarArr = new defpackage.dbk[java.lang.Math.max(16, i)];
            }
            dcrVar2.b = null;
            for (int i2 = 0; i2 < i; i2++) {
                dbkVarArr[i2] = (defpackage.dbk) cfcVar2.a[i2];
            }
            cfcVar2.g();
            while (true) {
                i--;
                if (i < 0) {
                    dcrVar2.b = dbkVarArr;
                    return;
                }
                defpackage.dbk dbkVar2 = dbkVarArr[i];
                if (dbkVar2 == null) {
                    defpackage.aooh.g();
                }
                if (dbkVar2.B) {
                    dcrVar2.a(dbkVar2);
                }
                dbkVarArr[i] = null;
            }
        } finally {
            android.os.Trace.endSection();
        }
    }

    public final void c() {
        defpackage.cfc cfcVar = this.f;
        int i = cfcVar.b;
        if (i != 0) {
            java.lang.Object[] objArr = cfcVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                defpackage.agxg agxgVar = (defpackage.agxg) objArr[i2];
                defpackage.dbk dbkVar = (defpackage.dbk) agxgVar.c;
                if (dbkVar.al()) {
                    if (agxgVar.b) {
                        dbkVar.U(agxgVar.a, true, false);
                    } else {
                        dbkVar.W(agxgVar.a, true, false);
                    }
                }
            }
            cfcVar.g();
        }
    }

    public final void d(defpackage.dbk dbkVar) {
        defpackage.cfc cfcVarJ = dbkVar.j();
        java.lang.Object[] objArr = cfcVarJ.a;
        int i = cfcVarJ.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.dbk dbkVar2 = (defpackage.dbk) objArr[i2];
            if (defpackage.aooh.n(dbkVar2.r(), java.lang.Boolean.TRUE) && !dbkVar2.D) {
                if (this.i.by(dbkVar2)) {
                    dbkVar2.J();
                }
                d(dbkVar2);
            }
        }
    }

    public final void e(defpackage.dbk dbkVar, boolean z) {
        if (!this.b) {
            defpackage.cwh.d("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (r(dbkVar, z)) {
            defpackage.cwh.c("node not yet measured");
        }
        o(dbkVar, z);
    }

    public final void f(defpackage.dbk dbkVar) {
        defpackage.cfc cfcVarJ = dbkVar.j();
        java.lang.Object[] objArr = cfcVarJ.a;
        int i = cfcVarJ.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.dbk dbkVar2 = (defpackage.dbk) objArr[i2];
            if (q(dbkVar2)) {
                if (defpackage.cfo.s(dbkVar2)) {
                    g(dbkVar2, true);
                } else {
                    f(dbkVar2);
                }
            }
        }
    }

    public final void g(defpackage.dbk dbkVar, boolean z) {
        defpackage.dpd dpdVar;
        if (dbkVar.D) {
            return;
        }
        if (dbkVar == this.a) {
            dpdVar = this.g;
            if (dpdVar == null) {
                defpackage.aooh.g();
            }
        } else {
            dpdVar = null;
        }
        if (z) {
            k(dbkVar, dpdVar);
        } else {
            l(dbkVar, dpdVar);
        }
    }

    public final boolean h() {
        return this.i.bx();
    }

    public final boolean i(defpackage.aomy aomyVar) {
        boolean z;
        defpackage.dbk dbkVarA;
        boolean z2;
        boolean z3;
        boolean zS;
        defpackage.dpd dpdVar;
        defpackage.czb cyyVar;
        defpackage.dbk dbkVar = this.a;
        if (!dbkVar.al()) {
            defpackage.cwh.c("performMeasureAndLayout called with unattached root");
        }
        if (!dbkVar.am()) {
            defpackage.cwh.c("performMeasureAndLayout called with unplaced root");
        }
        if (this.b) {
            defpackage.cwh.c("performMeasureAndLayout called during measure layout");
        }
        boolean z4 = false;
        if (this.g != null) {
            this.b = true;
            this.c = true;
            try {
                defpackage.aogc aogcVar = this.i;
                if (aogcVar.bx()) {
                    z = false;
                    while (true) {
                        java.lang.Object obj = aogcVar.c;
                        if (((defpackage.daq) obj).d()) {
                            java.lang.Object obj2 = aogcVar.b;
                            if (((defpackage.daq) obj2).d()) {
                                java.lang.Object obj3 = aogcVar.a;
                                if (((defpackage.daq) obj3).d()) {
                                    break;
                                }
                                dbkVarA = ((defpackage.daq) obj3).a();
                                z2 = true;
                                z3 = false;
                            } else {
                                dbkVarA = ((defpackage.daq) obj2).a();
                                z3 = dbkVarA.j != null;
                                z2 = true;
                            }
                        } else {
                            dbkVarA = ((defpackage.daq) obj).a();
                            z3 = dbkVarA.j != null;
                            z2 = false;
                        }
                        if (!z2) {
                            zS = s(dbkVarA, z3);
                            if (dbkVarA.ai()) {
                                aogcVar.bA(dbkVarA, 2);
                            }
                            if (dbkVarA.ah()) {
                                aogcVar.bA(dbkVarA, 4);
                            }
                        } else if (dbkVarA.D || !t(dbkVarA)) {
                            zS = false;
                        } else {
                            if (dbkVarA == dbkVar) {
                                dpdVar = this.g;
                                if (dpdVar == null) {
                                    defpackage.aooh.g();
                                }
                            } else {
                                dpdVar = null;
                            }
                            if (z3) {
                                zS = dbkVarA.aj() ? k(dbkVarA, dpdVar) : false;
                                if ((zS || dbkVarA.ai()) && defpackage.aooh.n(dbkVarA.r(), java.lang.Boolean.TRUE)) {
                                    dbkVarA.J();
                                }
                            } else {
                                zS = dbkVarA.ak() ? l(dbkVarA, dpdVar) : false;
                                if (dbkVarA.ah()) {
                                    if (dbkVarA != dbkVar) {
                                        defpackage.dbk dbkVarK = dbkVarA.k();
                                        if (dbkVarK != null && dbkVarK.am() && dbkVarA.an()) {
                                            dbkVarA.S();
                                        }
                                    } else {
                                        if (dbkVarA.E == 3) {
                                            dbkVarA.y();
                                        }
                                        defpackage.dbk dbkVarK2 = dbkVarA.k();
                                        if (dbkVarK2 == null || (cyyVar = dbkVarK2.o().o) == null) {
                                            cyyVar = new defpackage.cyy(defpackage.dbn.a(dbkVarA));
                                        }
                                        cyyVar.u(dbkVarA.n(), 0, 0, 0.0f);
                                    }
                                    this.d.b(dbkVarA);
                                }
                            }
                            c();
                        }
                        if (dbkVarA == dbkVar && zS) {
                            z = true;
                        }
                    }
                    if (aomyVar != null) {
                        aomyVar.a();
                    }
                } else {
                    z = false;
                }
                this.b = false;
                this.c = false;
                z4 = z;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    this.b = false;
                    this.c = false;
                    throw th2;
                }
            }
        }
        a();
        return z4;
    }

    public final boolean j(defpackage.dbk dbkVar, boolean z) {
        int iAv = dbkVar.av();
        int i = iAv - 1;
        if (iAv == 0) {
            throw null;
        }
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2 || i == 3) {
            this.f.n(new defpackage.agxg(dbkVar, false, z));
            return false;
        }
        if (i != 4) {
            throw new defpackage.aois();
        }
        if (dbkVar.ak() && !z) {
            return false;
        }
        dbkVar.M();
        if (dbkVar.D) {
            return false;
        }
        if (!dbkVar.am() && !n(dbkVar)) {
            return false;
        }
        defpackage.dbk dbkVarK = dbkVar.k();
        if (dbkVarK == null || !dbkVarK.ak()) {
            this.i.bA(dbkVar, 3);
        }
        return !this.c;
    }
}
