package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dab {
    public boolean a;
    public defpackage.adq b;
    public defpackage.adq c;
    public defpackage.adq d;
    public defpackage.adq e;
    private final defpackage.dcv f;

    public dab(defpackage.dcv dcvVar) {
        this.f = dcvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [cmv] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [cmv] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
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
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void e(defpackage.cmv cmvVar, oq oqVar, java.util.Set set) {
        if (!cmvVar.L().D) {
            defpackage.cwh.d("visitSubtreeIf called on an unattached node");
        }
        defpackage.cfc cfcVar = new defpackage.cfc(new defpackage.cmv[16]);
        defpackage.cmv cmvVar2 = cmvVar.L().x;
        if (cmvVar2 == null) {
            defpackage.cfo.F(cfcVar, cmvVar.L());
        } else {
            cfcVar.n(cmvVar2);
        }
        while (true) {
            int i = cfcVar.b;
            if (i == 0) {
                return;
            }
            defpackage.cmv cmvVar3 = (defpackage.cmv) cfcVar.c(i - 1);
            if ((cmvVar3.v & 32) != 0) {
                defpackage.cmv cmvVar4 = cmvVar3;
                while (true) {
                    if (cmvVar4 != null && cmvVar4.D) {
                        if ((cmvVar4.u & 32) != 0) {
                            ?? X = cmvVar4;
                            ?? cfcVar2 = 0;
                            while (X != 0) {
                                if (X instanceof defpackage.dad) {
                                    defpackage.dad dadVar = (defpackage.dad) X;
                                    if (dadVar instanceof defpackage.daj) {
                                        defpackage.daj dajVar = (defpackage.daj) dadVar;
                                        if ((dajVar.a instanceof defpackage.daa) && dajVar.c.contains(oqVar)) {
                                            set.add(dadVar);
                                        }
                                    }
                                    if (dadVar.cN().c(oqVar)) {
                                        break;
                                    }
                                } else if ((X.u & 32) != 0 && (X instanceof defpackage.dap)) {
                                    defpackage.cmv cmvVar5 = ((defpackage.dap) X).F;
                                    int i2 = 0;
                                    X = X;
                                    cfcVar2 = cfcVar2;
                                    while (cmvVar5 != null) {
                                        if ((cmvVar5.u & 32) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cfcVar2 = cfcVar2;
                                                X = cmvVar5;
                                            } else {
                                                if (cfcVar2 == 0) {
                                                    cfcVar2 = new defpackage.cfc(new defpackage.cmv[16]);
                                                }
                                                if (X != 0) {
                                                    cfcVar2.n(X);
                                                }
                                                cfcVar2.n(cmvVar5);
                                                X = 0;
                                            }
                                        }
                                        cmvVar5 = cmvVar5.x;
                                        X = X;
                                        cfcVar2 = cfcVar2;
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                X = defpackage.cfo.x(cfcVar2);
                            }
                        }
                        cmvVar4 = cmvVar4.x;
                    }
                }
            }
            defpackage.cfo.F(cfcVar, cmvVar3);
        }
    }

    public final void a() {
        if (this.a) {
            return;
        }
        this.a = true;
        this.f.D(new bup(this, 13));
    }

    public final defpackage.adq b() {
        defpackage.adq adqVar = this.b;
        if (adqVar != null) {
            return adqVar;
        }
        defpackage.adq adqVar2 = new defpackage.adq(16);
        this.b = adqVar2;
        return adqVar2;
    }

    public final defpackage.adq c() {
        defpackage.adq adqVar = this.c;
        if (adqVar != null) {
            return adqVar;
        }
        defpackage.adq adqVar2 = new defpackage.adq(16);
        this.c = adqVar2;
        return adqVar2;
    }

    public final defpackage.adq d() {
        defpackage.adq adqVar = this.e;
        if (adqVar != null) {
            return adqVar;
        }
        defpackage.adq adqVar2 = new defpackage.adq(16);
        this.e = adqVar2;
        return adqVar2;
    }
}
