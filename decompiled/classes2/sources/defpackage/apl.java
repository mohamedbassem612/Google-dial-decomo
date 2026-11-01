package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class apl implements defpackage.auy {
    final /* synthetic */ defpackage.apy a;
    final /* synthetic */ aonj b;
    final /* synthetic */ aomy c;

    public apl(defpackage.apy apyVar, aonj aonjVar, aomy aomyVar) {
        this.a = apyVar;
        this.b = aonjVar;
        this.c = aomyVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057 A[PHI: r8
      0x0057: PHI (r8v9 java.lang.Object) = (r8v8 java.lang.Object), (r8v17 java.lang.Object) binds: [B:21:0x0051, B:16:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.auy
    public final float a(float f) {
        java.lang.Object objF;
        defpackage.apy apyVar = this.a;
        float fE = apyVar.e();
        defpackage.aqj aqjVarP = apyVar.p();
        if (java.lang.Float.isNaN(fE)) {
            throw new java.lang.IllegalArgumentException("The offset provided to computeTarget must not be NaN.");
        }
        boolean z = java.lang.Math.abs(f) > 0.0f;
        boolean z2 = z && f > 0.0f;
        java.lang.Object objF2 = null;
        if (z) {
            if (java.lang.Math.abs(f) >= java.lang.Math.abs(((java.lang.Number) this.c.a()).floatValue())) {
                objF = aqjVarP.f(fE, z2);
                if (objF == null) {
                    aooh.g();
                } else {
                    objF2 = objF;
                }
            } else {
                objF2 = aqjVarP.f(fE, false);
                if (objF2 == null) {
                    aooh.g();
                }
                float fC = aqjVarP.c(objF2);
                java.lang.Object objF3 = aqjVarP.f(fE, true);
                if (objF3 == null) {
                    aooh.g();
                }
                aonj aonjVar = this.b;
                float fC2 = aqjVarP.c(objF3);
                float fAbs = java.lang.Math.abs(((java.lang.Number) aonjVar.a(java.lang.Float.valueOf(java.lang.Math.abs(fC - fC2)))).floatValue());
                if (true != z2) {
                    fC = fC2;
                }
                if (java.lang.Math.abs(fC - fE) < fAbs ? !z2 : z2) {
                    objF2 = objF3;
                }
            }
        } else {
            objF = aqjVarP.e(fE);
            if (objF == null) {
                aooh.g();
            } else {
                objF2 = objF;
            }
        }
        if (!((java.lang.Boolean) apyVar.a.a(objF2)).booleanValue()) {
            objF2 = apyVar.j();
        }
        return apyVar.p().c(objF2) - fE;
    }
}
