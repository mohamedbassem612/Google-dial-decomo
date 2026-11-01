package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class csa implements cru {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ csc a;

    public /* synthetic */ csa(csc cscVar, int i) {
        this.$cid = i;
        this.a = cscVar;
    }

    public final double a(double d) {
        int i = this.$cid;
        if (i == 0) {
            float[] fArr = crp.a;
            return crp.c(this.a, d);
        }
        if (i == 1) {
            float[] fArr2 = crp.a;
            return crp.a(this.a, d);
        }
        if (i == 2) {
            csc cscVar = this.a;
            if (d < cscVar.e) {
                return (cscVar.d * d) + cscVar.g;
            }
            double d2 = cscVar.a;
            return java.lang.Math.pow((cscVar.b * d) + cscVar.c, d2) + cscVar.f;
        }
        if (i == 3) {
            float[] fArr3 = crp.a;
            return crp.b(this.a, d);
        }
        if (i == 4) {
            float[] fArr4 = crp.a;
            return crp.d(this.a, d);
        }
        csc cscVar2 = this.a;
        double d3 = cscVar2.e;
        double d4 = cscVar2.d;
        if (d < d3 * d4) {
            return (d - cscVar2.g) / d4;
        }
        double d5 = cscVar2.a;
        double d6 = cscVar2.f;
        double d7 = cscVar2.c;
        return (java.lang.Math.pow(d - d6, 1.0d / d5) - d7) / cscVar2.b;
    }
}
