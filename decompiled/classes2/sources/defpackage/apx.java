package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class apx {
    final /* synthetic */ defpackage.apy a;
    private java.lang.Object b;
    private java.lang.Object c;
    private float d = Float.NaN;

    public apx(defpackage.apy apyVar) {
        this.a = apyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public final void a(float f, float f2) {
        defpackage.apy apyVar = this.a;
        float fC = apyVar.c();
        apyVar.c.h(f);
        apyVar.d.h(f2);
        if (java.lang.Float.isNaN(fC)) {
            return;
        }
        int i = (f > fC ? 1 : (f == fC ? 0 : -1));
        int i2 = i ^ (-1);
        ?? r1 = i2 >>> 31;
        if (apyVar.c() == apyVar.p().c(apyVar.h())) {
            java.lang.Object objF = apyVar.p().f(apyVar.c() + (i >= 0 ? 1.0f : -1.0f), r1);
            if (objF == null) {
                objF = apyVar.h();
            }
            if (i2 < 0) {
                this.b = apyVar.h();
                this.c = objF;
            } else {
                this.b = objF;
                this.c = apyVar.h();
            }
        } else {
            java.lang.Object objF2 = apyVar.p().f(apyVar.c(), false);
            if (objF2 == null) {
                objF2 = apyVar.h();
            }
            java.lang.Object objF3 = apyVar.p().f(apyVar.c(), true);
            if (objF3 == null) {
                objF3 = apyVar.h();
            }
            this.b = objF2;
            this.c = objF3;
        }
        defpackage.aqj aqjVarP = apyVar.p();
        java.lang.Object obj = this.b;
        if (obj == null) {
            aooh.g();
        }
        float fC2 = aqjVarP.c(obj);
        defpackage.aqj aqjVarP2 = apyVar.p();
        java.lang.Object obj2 = this.c;
        if (obj2 == null) {
            aooh.g();
        }
        this.d = java.lang.Math.abs(fC2 - aqjVarP2.c(obj2));
        if (java.lang.Math.abs(apyVar.c() - apyVar.p().c(apyVar.h())) >= this.d / 2.0f) {
            java.lang.Object objH = i2 < 0 ? this.c : this.b;
            if (objH == null) {
                objH = apyVar.h();
            }
            if (((java.lang.Boolean) apyVar.a.a(objH)).booleanValue()) {
                apyVar.l(objH);
            }
        }
    }
}
