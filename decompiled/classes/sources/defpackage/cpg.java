package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cpg extends defpackage.cmv implements defpackage.dan, defpackage.dcp, defpackage.dad, defpackage.ddj, defpackage.dao {
    public final boolean a;
    public boolean b;
    public boolean c;
    private final defpackage.aonn d;
    private int e;

    public /* synthetic */ cpg(int i, boolean z, defpackage.aonn aonnVar, int i2) {
        this.a = ((i2 & 2) == 0) & z;
        this.d = (i2 & 4) != 0 ? null : aonnVar;
        this.e = 1 == (i2 & 1) ? 1 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [cmv] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [cmv] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [cfc] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [cfc] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final cow b() {
        boolean z;
        defpackage.dce dceVar;
        cow coxVar = new cox();
        int i = this.e;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((defpackage.cud) ((defpackage.kaw) defpackage.cfo.G(this, defpackage.dfo.i)).a.a()).a == 1);
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("Unknown Focusability");
            }
            z = false;
        }
        ((cox) coxVar).a = z;
        defpackage.cmv cmvVar = this.t;
        if (!cmvVar.D) {
            defpackage.cwh.d("visitAncestors called on an unattached node");
        }
        defpackage.cmv cmvVar2 = this.t;
        defpackage.dbk dbkVarA = defpackage.cfo.A(this);
        loop0: while (dbkVarA != null) {
            if ((dbkVarA.v.f.v & 3072) != 0) {
                while (cmvVar2 != null) {
                    int i2 = cmvVar2.u;
                    if ((i2 & 3072) != 0) {
                        if (cmvVar2 != cmvVar && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? X = cmvVar2;
                            ?? cfcVar = 0;
                            while (X != 0) {
                                if (X instanceof defpackage.coy) {
                                    ((defpackage.coy) X).c(coxVar);
                                } else if ((X.u & 2048) != 0 && (X instanceof defpackage.dap)) {
                                    defpackage.cmv cmvVar3 = ((defpackage.dap) X).F;
                                    int i3 = 0;
                                    while (cmvVar3 != null) {
                                        if ((cmvVar3.u & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
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
                                    if (i3 != 1) {
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
                    }
                    cmvVar2 = cmvVar2.w;
                }
            }
            dbkVarA = dbkVarA.k();
            cmvVar2 = (dbkVarA == null || (dceVar = dbkVarA.v) == null) ? null : dceVar.e;
        }
        return coxVar;
    }

    @Override // defpackage.dad
    public final /* synthetic */ defpackage.dac cN() {
        return czz.a;
    }

    @Override // defpackage.cmv
    public final boolean cO() {
        return false;
    }

    @Override // defpackage.cmv
    public final void cZ() {
        if (e().b()) {
            ((defpackage.deg) defpackage.cfo.C(this)).F.j(true, true, 8);
        }
    }

    public final defpackage.cpe e() {
        defpackage.cpg cpgVarB;
        defpackage.dce dceVar;
        if (!this.D || (cpgVarB = ((defpackage.deg) defpackage.cfo.C(this)).F.b()) == null) {
            return defpackage.cpe.d;
        }
        if (this == cpgVarB) {
            return defpackage.cpe.a;
        }
        if (cpgVarB.D) {
            if (!cpgVarB.t.D) {
                defpackage.cwh.d("visitAncestors called on an unattached node");
            }
            defpackage.cmv cmvVar = cpgVarB.t.w;
            defpackage.dbk dbkVarA = defpackage.cfo.A(cpgVarB);
            while (dbkVarA != null) {
                if ((dbkVarA.v.f.v & 1024) != 0) {
                    while (cmvVar != null) {
                        if ((cmvVar.u & 1024) != 0) {
                            defpackage.cmv cmvVarX = cmvVar;
                            defpackage.cfc cfcVar = null;
                            while (cmvVarX != null) {
                                if (cmvVarX instanceof defpackage.cpg) {
                                    if (this == ((defpackage.cpg) cmvVarX)) {
                                        return defpackage.cpe.b;
                                    }
                                } else if ((cmvVarX.u & 1024) != 0 && (cmvVarX instanceof defpackage.dap)) {
                                    int i = 0;
                                    for (defpackage.cmv cmvVar2 = ((defpackage.dap) cmvVarX).F; cmvVar2 != null; cmvVar2 = cmvVar2.x) {
                                        if ((cmvVar2.u & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cmvVarX = cmvVar2;
                                            } else {
                                                if (cfcVar == null) {
                                                    cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                                                }
                                                if (cmvVarX != null) {
                                                    cfcVar.n(cmvVarX);
                                                }
                                                cfcVar.n(cmvVar2);
                                                cmvVarX = null;
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                cmvVarX = defpackage.cfo.x(cfcVar);
                            }
                        }
                        cmvVar = cmvVar.w;
                    }
                }
                dbkVarA = dbkVarA.k();
                cmvVar = (dbkVarA == null || (dceVar = dbkVarA.v) == null) ? null : dceVar.e;
            }
        }
        return defpackage.cpe.d;
    }

    public final defpackage.cpn f(defpackage.cxi cxiVar) {
        defpackage.cpn cpnVar = b().l;
        if (cpnVar != cov.a) {
            return cxiVar != null ? cpnVar.g(cxiVar.j(defpackage.cfo.y(this), 0L, true)) : cpnVar;
        }
        return cxiVar != null ? cxiVar.q(defpackage.cfo.y(this), false) : defpackage.cdh.x(0L, defpackage.dpy.l(defpackage.cfo.y(this).h()));
    }

    public final void g() {
        cow cowVar;
        int iOrdinal = e().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new defpackage.aois();
                }
                return;
            }
        }
        defpackage.aoot aootVar = new defpackage.aoot();
        defpackage.den.u(this, new bxq(aootVar, this, 4));
        java.lang.Object obj = aootVar.a;
        if (obj == null) {
            defpackage.aooh.j("focusProperties");
            cowVar = null;
        } else {
            cowVar = (cow) obj;
        }
        if (!cowVar.e() || rx.w(this)) {
            ((defpackage.deg) defpackage.cfo.C(this)).F.j(true, true, 8);
        }
    }

    public final boolean h(int i) {
        int iA = rx.A(this, i);
        int i2 = iA - 1;
        if (iA == 0) {
            throw null;
        }
        if (i2 == 0) {
            return rx.x(this);
        }
        if (i2 == 1) {
            return false;
        }
        if (i2 != 2) {
            throw new defpackage.aois();
        }
        return true;
    }

    public final boolean i(int i) {
        android.os.Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return b().a ? h(i) : defpackage.rz.l(this, i, new cos(i, 2));
        } finally {
            android.os.Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [cmv] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [cmv] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [cfc] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [cfc] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void j(defpackage.cpe cpeVar, defpackage.cpe cpeVar2) {
        defpackage.dce dceVar;
        defpackage.aonn aonnVar;
        defpackage.cou couVar = ((defpackage.deg) defpackage.cfo.C(this)).F;
        defpackage.cpg cpgVarB = couVar.b();
        if (!defpackage.aooh.n(cpeVar, cpeVar2) && (aonnVar = this.d) != null) {
            aonnVar.a(cpeVar, cpeVar2);
        }
        defpackage.cmv cmvVar = this.t;
        if (!cmvVar.D) {
            defpackage.cwh.d("visitAncestors called on an unattached node");
        }
        defpackage.cmv cmvVar2 = this.t;
        defpackage.dbk dbkVarA = defpackage.cfo.A(this);
        while (dbkVarA != null) {
            if ((dbkVarA.v.f.v & 5120) != 0) {
                while (cmvVar2 != null) {
                    int i = cmvVar2.u;
                    if ((i & 5120) != 0) {
                        if (cmvVar2 != cmvVar && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? X = cmvVar2;
                            ?? cfcVar = 0;
                            while (X != 0) {
                                if (X instanceof defpackage.com) {
                                    defpackage.com comVar = (defpackage.com) X;
                                    if (cpgVarB == couVar.b()) {
                                        comVar.b(cpeVar2);
                                    }
                                } else if ((X.u & 4096) != 0 && (X instanceof defpackage.dap)) {
                                    defpackage.cmv cmvVar3 = ((defpackage.dap) X).F;
                                    int i2 = 0;
                                    X = X;
                                    cfcVar = cfcVar;
                                    while (cmvVar3 != null) {
                                        if ((cmvVar3.u & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
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
                                        }
                                        cmvVar3 = cmvVar3.x;
                                        X = X;
                                        cfcVar = cfcVar;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                X = defpackage.cfo.x(cfcVar);
                            }
                        }
                    }
                    cmvVar2 = cmvVar2.w;
                }
            }
            dbkVarA = dbkVarA.k();
            cmvVar2 = (dbkVarA == null || (dceVar = dbkVarA.v) == null) ? null : dceVar.e;
        }
    }

    @Override // defpackage.cmv
    public final void u() {
        int iOrdinal = e().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                defpackage.cou couVar = ((defpackage.deg) defpackage.cfo.C(this)).F;
                defpackage.cpg cpgVarS = rx.s(this);
                if (cpgVarS == null || !cpgVarS.a) {
                    return;
                }
                couVar.k();
                couVar.f();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new defpackage.aois();
                }
                return;
            }
        }
        defpackage.cou couVar2 = ((defpackage.deg) defpackage.cfo.C(this)).F;
        couVar2.j(true, false, 8);
        if (this.a) {
            couVar2.k();
        }
        couVar2.f();
    }

    @Override // defpackage.dcp
    public final void v() {
        g();
    }

    @Override // defpackage.ddj
    public final void d() {
    }

    @Override // defpackage.cmv
    public final void dc() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cpg() {
        this(0, 0 == true ? 1 : 0, null, 15);
    }
}
