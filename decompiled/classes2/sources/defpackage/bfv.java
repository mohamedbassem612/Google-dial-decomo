package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class bfv implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ bfv(java.lang.Object obj, boolean z, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [erg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [erg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [erg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [erg, java.lang.Object] */
    public final java.lang.Object a() {
        int i = this.$cid;
        if (i == 0) {
            this.b.a(java.lang.Boolean.valueOf(!this.a));
            return aojh.a;
        }
        if (i == 1) {
            defpackage.aox aoxVar = defpackage.apa.a;
            if (this.a) {
                this.b.a();
            }
            return aojh.a;
        }
        if (i == 2) {
            float fFloatValue = ((java.lang.Number) this.b.a()).floatValue();
            float f = 1.0f;
            float fBs = 1.0f - afsq.bs(1.0f, java.lang.Math.abs(fFloatValue), 0.0f, 0.5f, 32);
            boolean z = this.a;
            float f2 = fFloatValue >= 0.0f ? 1.0f : fBs;
            if (!z) {
                f = f2;
            } else if (fFloatValue >= 0.0f) {
                f = fBs;
            }
            return java.lang.Float.valueOf(f);
        }
        if (i == 3) {
            this.b.f(this.a);
            return aojh.a;
        }
        if (i == 4) {
            this.b.v(this.a);
            return aojh.a;
        }
        boolean z2 = this.a;
        if (i != 5) {
            this.b.P(z2);
            return aojh.a;
        }
        this.b.g(z2);
        return aojh.a;
    }

    public /* synthetic */ bfv(boolean z, aomy aomyVar, int i) {
        this.$cid = i;
        this.a = z;
        this.b = aomyVar;
    }
}
