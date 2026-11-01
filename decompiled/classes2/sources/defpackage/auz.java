package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class auz implements defpackage.aup {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public auz(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [aiq, java.lang.Object] */
    @Override // defpackage.aup
    public final /* synthetic */ java.lang.Object a(asv asvVar, java.lang.Object obj, java.lang.Object obj2, aonj aonjVar, aoln aolnVar) {
        if (this.$cid != 0) {
            java.lang.Object objN = defpackage.rv.n(asvVar, ((java.lang.Number) obj).floatValue(), den.br(0.0f, ((java.lang.Number) obj2).floatValue()), (kaw) this.a, aonjVar, aolnVar);
            return objN != aolu.a ? (vx) objN : objN;
        }
        float fFloatValue = ((java.lang.Number) obj).floatValue();
        float fFloatValue2 = ((java.lang.Number) obj2).floatValue();
        java.lang.Object objF = defpackage.rv.f(asvVar, java.lang.Math.abs(fFloatValue) * java.lang.Math.signum(fFloatValue2), fFloatValue, den.br(0.0f, fFloatValue2), this.a, aonjVar, aolnVar);
        return objF != aolu.a ? (vx) objF : objF;
    }
}
