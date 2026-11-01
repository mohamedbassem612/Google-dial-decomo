package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class abkr implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ float a;

    public /* synthetic */ abkr(float f, int i) {
        this.$cid = i;
        this.a = f;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            cra craVar = (cra) obj;
            aooh.f(craVar, "$this$placeWithLayer");
            craVar.B(mni.bj(0.0f, 0.0f));
            float f = this.a;
            craVar.w(f);
            craVar.x(f);
            return aojh.a;
        }
        if (i != 1) {
            aonj aonjVar = (aonj) obj;
            aooh.f(aonjVar, "it");
            java.lang.Boolean bool = (java.lang.Boolean) aonjVar.a(java.lang.Float.valueOf(this.a));
            bool.booleanValue();
            return bool;
        }
        cra craVar2 = (cra) obj;
        float f2 = this.a;
        float fC = pf.c(craVar2, f2);
        float fD = pf.d(craVar2, f2);
        craVar2.x(fD == 0.0f ? 1.0f : fC / fD);
        craVar2.B(mni.bj(0.5f, 0.0f));
        return aojh.a;
    }
}
