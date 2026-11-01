package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abfz implements defpackage.auy {
    final /* synthetic */ defpackage.apy a;
    final /* synthetic */ float b;
    final /* synthetic */ aonj c;

    public abfz(defpackage.apy apyVar, float f, aonj aonjVar) {
        this.a = apyVar;
        this.b = f;
        this.c = aonjVar;
    }

    @Override // defpackage.auy
    public final float a(float f) {
        java.lang.Object objE;
        defpackage.apy apyVar = this.a;
        defpackage.aqj aqjVarP = apyVar.p();
        float fE = apyVar.e();
        if (java.lang.Float.isNaN(fE)) {
            throw new java.lang.IllegalArgumentException("The offset provided to computeTarget must be valid.");
        }
        boolean z = java.lang.Math.abs(f) > 0.0f;
        boolean z2 = z && f > 0.0f;
        if (z) {
            java.lang.Object objF = aqjVarP.f(fE, false);
            if (objF == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.");
            }
            float fC = aqjVarP.c(objF);
            java.lang.Object objF2 = aqjVarP.f(fE, true);
            if (objF2 == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.");
            }
            float fC2 = aqjVarP.c(objF2);
            float f2 = fC - fC2;
            if (true != z2) {
                fC = fC2;
            }
            objE = (java.lang.Math.abs(fC - fE) < java.lang.Math.abs(java.lang.Math.abs(f2) * 0.5f) ? !z2 : z2) ? objF2 : objF;
        } else {
            objE = aqjVarP.e(fE);
            if (objE == null) {
                throw new java.lang.IllegalArgumentException("Required value was null.");
            }
        }
        this.c.a(new abgz(objE, fE / apyVar.p().a()));
        return apyVar.p().c(objE) - fE;
    }
}
