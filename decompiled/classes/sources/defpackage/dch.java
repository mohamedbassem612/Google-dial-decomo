package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dch implements defpackage.dcj {
    @Override // defpackage.dcj
    public final int a() {
        return 16;
    }

    @Override // defpackage.dcj
    public final void b(defpackage.dbk dbkVar, long j, defpackage.dax daxVar, int i, boolean z) {
        dbkVar.D(j, daxVar, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [cmv] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [cmv] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [cfc] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [cfc] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // defpackage.dcj
    public final boolean c(defpackage.dax daxVar, defpackage.dbk dbkVar) {
        defpackage.dck dckVarP = dbkVar.p();
        int i = defpackage.dcl.a;
        defpackage.cmv cmvVarAd = dckVarP.ad(false);
        if (cmvVarAd == null || !cmvVarAd.D) {
            return false;
        }
        if (!cmvVarAd.L().D) {
            defpackage.cwh.d("visitLocalDescendants called on an unattached node");
        }
        defpackage.cmv cmvVarL = cmvVarAd.L();
        if ((cmvVarL.v & 16) == 0) {
            return false;
        }
        while (cmvVarL != null) {
            if ((cmvVarL.u & 16) != 0) {
                ?? X = cmvVarL;
                ?? cfcVar = 0;
                while (X != 0) {
                    if (X instanceof defpackage.ddb) {
                        if (((defpackage.ddb) X).C()) {
                            daxVar.a = daxVar.a() - 1;
                            return true;
                        }
                    } else if ((X.u & 16) != 0 && (X instanceof defpackage.dap)) {
                        defpackage.cmv cmvVar = ((defpackage.dap) X).F;
                        int i2 = 0;
                        while (cmvVar != null) {
                            if ((cmvVar.u & 16) != 0) {
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
            cmvVarL = cmvVarL.x;
        }
        return false;
    }

    @Override // defpackage.dcj
    public final /* synthetic */ boolean d(defpackage.cmv cmvVar) {
        return true;
    }

    @Override // defpackage.dcj
    public final boolean e(defpackage.dbk dbkVar) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [cfc] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [cfc] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [cmv] */
    /* JADX WARN: Type inference failed for: r7v1, types: [cmv] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [cmv] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.dcj
    public final void f(defpackage.cmv cmvVar) {
        ?? cfcVar = 0;
        while (cmvVar != 0) {
            if (cmvVar instanceof defpackage.ddb) {
                ((defpackage.ddb) cmvVar).D();
            } else if ((cmvVar.u & 16) != 0 && (cmvVar instanceof defpackage.dap)) {
                defpackage.cmv cmvVar2 = ((defpackage.dap) cmvVar).F;
                int i = 0;
                cfcVar = cfcVar;
                cmvVar = cmvVar;
                while (cmvVar2 != null) {
                    if ((cmvVar2.u & 16) != 0) {
                        i++;
                        if (i == 1) {
                            cfcVar = cfcVar;
                            cmvVar = cmvVar2;
                        } else {
                            if (cfcVar == 0) {
                                cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
                            }
                            if (cmvVar != 0) {
                                cfcVar.n(cmvVar);
                            }
                            cfcVar.n(cmvVar2);
                            cmvVar = 0;
                        }
                    }
                    cmvVar2 = cmvVar2.x;
                    cfcVar = cfcVar;
                    cmvVar = cmvVar;
                }
                if (i != 1) {
                }
            }
            cmvVar = defpackage.cfo.x(cfcVar);
        }
    }
}
