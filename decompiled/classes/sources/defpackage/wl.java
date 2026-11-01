package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class wl {
    public static final defpackage.cpn a(agx agxVar, agu aguVar) {
        if (aguVar == null) {
            return null;
        }
        defpackage.adq adqVar = agxVar.g;
        java.lang.Object[] objArr = adqVar.a;
        int i = adqVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (defpackage.aooh.n(((agy) objArr[i2]).m, aguVar)) {
                if (aguVar.D) {
                    return !aguVar.d ? aguVar.c : defpackage.cdh.x(aguVar.t().j(defpackage.cfo.y(aguVar), 0L, true), defpackage.dpy.l(defpackage.cfo.y(aguVar).h()));
                }
                return null;
            }
        }
        return null;
    }

    public static final long b(int i) {
        if (i <= 0) {
            avo.c("The span value should be higher than 0");
        }
        return i;
    }

    public static final defpackage.cpn c(bhm bhmVar) {
        return defpackage.cdh.x(defpackage.mni.bl(bhmVar.c(), bhmVar.e()), bhmVar.d());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Type inference failed for: r0v2, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [ccp, java.lang.Object] */
    public static final void d(bhm bhmVar, long j, long j2, long j3, boolean z) {
        if (!defpackage.anty.ah(bhmVar.e(), j3) || !defpackage.anty.ah(bhmVar.d(), j)) {
            bhmVar.d.b(new defpackage.cpp(j));
            bhmVar.a.b(new defpackage.cpm(j3));
            if (z) {
                bhmVar.c.b(new defpackage.cpm(defpackage.mni.aM(defpackage.mni.aM(j2, j3), defpackage.mni.aM(bhmVar.b(), bhmVar.c()))));
            }
        } else if (z) {
            z = true;
            bhmVar.d.b(new defpackage.cpp(j));
            bhmVar.a.b(new defpackage.cpm(j3));
            if (z) {
                bhmVar.c.b(new defpackage.cpm(defpackage.mni.aM(defpackage.mni.aM(j2, j3), defpackage.mni.aM(bhmVar.b(), bhmVar.c()))));
            }
        }
        bhmVar.b.b(new defpackage.cpm(defpackage.mni.aM(j2, j3)));
    }

    public static final long e(float f, boolean z, boolean z2) {
        return (((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (true != z ? 0L : 1L) | (true == z2 ? 2L : 0L);
    }

    public static final android.view.View f(defpackage.dao daoVar) {
        if (!daoVar.L().D) {
            defpackage.cwh.d("Cannot get View because the Modifier node is not currently attached.");
        }
        return (android.view.View) defpackage.dbn.a(defpackage.cfo.A(daoVar));
    }

    public static final defpackage.dac g(defpackage.aoiu aoiuVar) {
        oq oqVar = (oq) aoiuVar.a;
        defpackage.daf dafVar = new defpackage.daf(oqVar);
        dafVar.b(oqVar, aoiuVar.b);
        return dafVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [cmv] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [cmv] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
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
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [dad, dao] */
    /* JADX WARN: Type inference failed for: r8v3, types: [aomy, java.lang.Object] */
    public static java.lang.Object h(defpackage.dad dadVar, oq oqVar) {
        defpackage.dce dceVar;
        defpackage.cmv cmvVar = (defpackage.cmv) dadVar;
        if (!cmvVar.t.D) {
            defpackage.cwh.c("ModifierLocal accessed from an unattached node");
        }
        if (!cmvVar.t.D) {
            defpackage.cwh.d("visitAncestors called on an unattached node");
        }
        defpackage.cmv cmvVar2 = cmvVar.t.w;
        defpackage.dbk dbkVarA = defpackage.cfo.A(dadVar);
        while (dbkVarA != null) {
            if ((dbkVarA.v.f.v & 32) != 0) {
                while (cmvVar2 != null) {
                    if ((cmvVar2.u & 32) != 0) {
                        ?? X = cmvVar2;
                        ?? cfcVar = 0;
                        while (X != 0) {
                            if (X instanceof defpackage.dad) {
                                defpackage.dad dadVar2 = (defpackage.dad) X;
                                if (dadVar2.cN().c(oqVar)) {
                                    return dadVar2.cN().a(oqVar);
                                }
                            } else if ((X.u & 32) != 0 && (X instanceof defpackage.dap)) {
                                defpackage.cmv cmvVar3 = ((defpackage.dap) X).F;
                                int i = 0;
                                X = X;
                                cfcVar = cfcVar;
                                while (cmvVar3 != null) {
                                    if ((cmvVar3.u & 32) != 0) {
                                        i++;
                                        if (i == 1) {
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
                                if (i != 1) {
                                }
                            }
                            X = defpackage.cfo.x(cfcVar);
                        }
                    }
                    cmvVar2 = cmvVar2.w;
                }
            }
            dbkVarA = dbkVarA.k();
            cmvVar2 = (dbkVarA == null || (dceVar = dbkVarA.v) == null) ? null : dceVar.e;
        }
        return oqVar.a.a();
    }

    public static void i(defpackage.dad dadVar, oq oqVar, java.lang.Object obj) {
        if (dadVar.cN() == czz.a) {
            defpackage.cwh.c("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!dadVar.cN().c(oqVar)) {
            defpackage.cwh.c(defpackage.a.bg(oqVar, "Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key ", " was not found."));
        }
        dadVar.cN().b(oqVar, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final defpackage.cmw j(defpackage.cmw cmwVar, boolean z, defpackage.kaw kawVar, defpackage.ans ansVar, boolean z2, defpackage.dib dibVar, defpackage.aonj aonjVar) {
        bft bftVarA;
        if (ansVar instanceof defpackage.any) {
            bftVarA = new bft(z, kawVar, ansVar, z2, dibVar, aonjVar);
        } else if (ansVar == 0) {
            bftVarA = new bft(z, kawVar, (defpackage.any) null, z2, dibVar, aonjVar);
        } else {
            bftVarA = kawVar != null ? defpackage.anu.a(defpackage.cmw.c, kawVar, ansVar).a(new bft(z, kawVar, (defpackage.any) null, z2, dibVar, aonjVar)) : new defpackage.cmr(new bfu(ansVar, z, z2, dibVar, aonjVar));
        }
        return cmwVar.a(bftVarA);
    }
}
