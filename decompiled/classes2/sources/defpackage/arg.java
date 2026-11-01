package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class arg implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ float a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ arg(float f, aoop aoopVar, int i) {
        this.$cid = i;
        this.a = f;
        this.b = aoopVar;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        boolean zC;
        int i = this.$cid;
        boolean z = false;
        if (i == 0) {
            arn arnVar = (arn) obj;
            boolean zN = aooh.n(arnVar.b(), "waiting");
            if (arnVar.m() == null) {
                zC = false;
            } else {
                aso asoVarM = arnVar.m();
                if (asoVarM == null) {
                    aooh.g();
                }
                zC = defpackage.arp.c(asoVarM, this.a);
            }
            aoop aoopVar = (aoop) this.b;
            if (aoopVar.a || (zN && zC)) {
                z = true;
            }
            aoopVar.a = z;
            return java.lang.Boolean.valueOf(!z);
        }
        if (i == 1) {
            long jLongValue = ((java.lang.Long) obj).longValue();
            alg algVar = (alg) this.b;
            if (!algVar.C()) {
                if (algVar.c() == Long.MIN_VALUE) {
                    algVar.n(jLongValue);
                }
                float f = this.a;
                long jC = jLongValue - algVar.c();
                if (f > 0.0f && !java.lang.Float.isNaN(f)) {
                    jC = aopc.j(jC / ((double) f));
                }
                algVar.s(jC);
                algVar.l(jC, f <= 0.0f || java.lang.Float.isNaN(f));
            }
            return aojh.a;
        }
        if (i != 2) {
            if (i == 3) {
                czb czbVar = (czb) obj;
                aooh.f(czbVar, "$this$layout");
                czb.A(czbVar, (czc) this.b, 0L, new defpackage.abkr(this.a, 0), 2);
                return aojh.a;
            }
            android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) obj;
            aooh.f(valueAnimator, "$this$animate");
            java.lang.Object obj2 = this.b;
            valueAnimator.setFloatValues(((abpu) obj2).b, this.a);
            valueAnimator.addUpdateListener(new defpackage.mh(obj2, 12, null));
            return aojh.a;
        }
        cra craVar = (cra) obj;
        float fC = ((defpackage.btt) this.b).d.c();
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (craVar.p & 4294967295L));
        if (!java.lang.Float.isNaN(fC) && !java.lang.Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
            float f2 = this.a;
            craVar.w(pf.c(craVar, f2));
            craVar.x(pf.d(craVar, f2));
            craVar.B(mni.bj(0.5f, (fC + fIntBitsToFloat) / fIntBitsToFloat));
        }
        return aojh.a;
    }

    public /* synthetic */ arg(java.lang.Object obj, float f, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = f;
    }
}
