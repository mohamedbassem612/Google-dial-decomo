package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dcr {
    public final defpackage.cfc a = new defpackage.cfc(new defpackage.dbk[16]);
    public defpackage.dbk[] b;

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
    /* JADX WARN: Type inference failed for: r6v5 */
    public final void a(defpackage.dbk dbkVar) {
        if (dbkVar.C > 0) {
            if (dbkVar.av() == 5 && !dbkVar.ah() && !dbkVar.ak() && !dbkVar.D && dbkVar.am()) {
                defpackage.dce dceVar = dbkVar.v;
                if ((dceVar.a() & 256) != 0) {
                    for (defpackage.cmv cmvVar = dceVar.f; cmvVar != null; cmvVar = cmvVar.x) {
                        if ((cmvVar.u & 256) != 0) {
                            ?? X = cmvVar;
                            ?? cfcVar = 0;
                            while (X != 0) {
                                if (X instanceof defpackage.dau) {
                                    defpackage.dau dauVar = (defpackage.dau) X;
                                    dauVar.a(defpackage.cfo.B(dauVar, 256));
                                } else if ((X.u & 256) != 0 && (X instanceof defpackage.dap)) {
                                    defpackage.cmv cmvVar2 = ((defpackage.dap) X).F;
                                    int i = 0;
                                    X = X;
                                    cfcVar = cfcVar;
                                    while (cmvVar2 != null) {
                                        if ((cmvVar2.u & 256) != 0) {
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
                        if ((cmvVar.v & 256) == 0) {
                            break;
                        }
                    }
                }
            }
            dbkVar.B = false;
            defpackage.cfc cfcVarJ = dbkVar.j();
            java.lang.Object[] objArr = cfcVarJ.a;
            int i2 = cfcVarJ.b;
            for (int i3 = 0; i3 < i2; i3++) {
                a((defpackage.dbk) objArr[i3]);
            }
        }
    }

    public final void b(defpackage.dbk dbkVar) {
        if (dbkVar.C > 0) {
            this.a.n(dbkVar);
            dbkVar.B = true;
        }
    }

    public final void c(defpackage.dbk dbkVar) {
        this.a.m(dbkVar);
    }

    public final boolean d() {
        return this.a.b != 0;
    }
}
