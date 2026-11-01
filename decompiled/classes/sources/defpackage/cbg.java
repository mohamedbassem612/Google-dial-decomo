package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cbg implements defpackage.ckg {
    private final defpackage.aomy a;

    public cbg(defpackage.aomy aomyVar) {
        this.a = aomyVar;
    }

    @Override // defpackage.cer
    public final java.lang.Object a() {
        defpackage.cko ckoVarW;
        java.lang.Object objA;
        defpackage.aonj aonjVarI = defpackage.ckw.b().i();
        if (aonjVarI != null) {
            aonjVarI.a(this);
            defpackage.cko ckoVarC = defpackage.ckw.c(defpackage.ckw.b());
            ckoVarW = ckoVarC != null ? ckoVarC.w() : null;
            try {
                defpackage.aomy aomyVar = this.a;
                defpackage.cfc cfcVarA = defpackage.ckh.a();
                java.lang.Object[] objArr = cfcVarA.a;
                int i = cfcVarA.b;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    ((defpackage.ckj) objArr[i3]).b(this);
                }
                defpackage.cki ckiVar = defpackage.cki.a;
                try {
                    objA = aomyVar.a();
                    java.lang.Object[] objArr2 = cfcVarA.a;
                    int i4 = cfcVarA.b;
                    while (i2 < i4) {
                        ((defpackage.ckj) objArr2[i2]).a(this, objA);
                        i2++;
                    }
                    if (ckoVarC != null) {
                        defpackage.ckw.i.j(ckoVarW);
                        ckoVarC.d();
                    }
                } catch (java.lang.Throwable th) {
                    java.lang.Object[] objArr3 = cfcVarA.a;
                    int i5 = cfcVarA.b;
                    while (i2 < i5) {
                        ((defpackage.ckj) objArr3[i2]).a(this, ckiVar);
                        i2++;
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                if (ckoVarC != null) {
                    defpackage.ckw.i.j(ckoVarW);
                    ckoVarC.d();
                }
                throw th2;
            }
        } else {
            defpackage.aomy aomyVar2 = this.a;
            defpackage.cko ckoVarC2 = defpackage.ckw.c(defpackage.ckw.b());
            ckoVarW = ckoVarC2 != null ? ckoVarC2.w() : null;
            try {
                objA = aomyVar2.a();
            } finally {
                if (ckoVarC2 != null) {
                    defpackage.ckw.i.j(ckoVarW);
                    ckoVarC2.d();
                }
            }
        }
        return objA;
    }

    @Override // defpackage.ckg
    public final boolean b(java.lang.Object obj) {
        defpackage.cko ckoVar = (defpackage.cko) defpackage.ckw.i.i();
        defpackage.aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
        defpackage.cko ckoVarH = defpackage.cfd.h(ckoVar);
        try {
            defpackage.aomy aomyVar = this.a;
            defpackage.cko ckoVarC = defpackage.ckw.c(defpackage.ckw.b());
            defpackage.cko ckoVarW = ckoVarC != null ? ckoVarC.w() : null;
            try {
                java.lang.Object objA = aomyVar.a();
                if (ckoVarC != null) {
                    defpackage.ckw.i.j(ckoVarW);
                    ckoVarC.d();
                }
                defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
                return !defpackage.aooh.n(objA, obj);
            } catch (java.lang.Throwable th) {
                if (ckoVarC != null) {
                    defpackage.ckw.i.j(ckoVarW);
                    ckoVarC.d();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
            throw th2;
        }
    }

    public final java.lang.String toString() {
        defpackage.cko ckoVar = (defpackage.cko) defpackage.ckw.i.i();
        defpackage.aomy aomyVar = this.a;
        defpackage.aonj aonjVarI = ckoVar != null ? ckoVar.i() : null;
        defpackage.cko ckoVarH = defpackage.cfd.h(ckoVar);
        try {
            java.lang.Object objA = aomyVar.a();
            defpackage.aomy aomyVar2 = this.a;
            defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
            return "ComputedState(calculation=" + aomyVar2 + ": " + objA + ")@" + hashCode();
        } catch (java.lang.Throwable th) {
            defpackage.cfd.i(ckoVar, ckoVarH, aonjVarI);
            throw th;
        }
    }
}
