package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acsw implements crd {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public acsw(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final cqx a(long j, dpq dpqVar, dpf dpfVar) {
        if (this.$cid != 0) {
            return new cqu((cpx) this.a);
        }
        aooh.f(dpqVar, "layoutDirection");
        aooh.f(dpfVar, "density");
        defpackage.acsy acsyVar = (defpackage.acsy) this.a;
        float fFloatValue = ((java.lang.Number) acsyVar.c.d()).floatValue();
        java.lang.Object objP = acsyVar.e;
        if (fFloatValue != acsyVar.d || objP == null) {
            objP = sa.p(acsyVar.a, acsyVar.b, fFloatValue);
            aooh.d(objP, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            acsyVar.d = fFloatValue;
            acsyVar.e = (bfx) objP;
        }
        return ((bfx) objP).a(j, dpqVar, dpfVar);
    }
}
