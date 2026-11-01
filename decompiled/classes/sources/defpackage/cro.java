package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class cro implements defpackage.cru {
    private final /* synthetic */ int $cid;

    public /* synthetic */ cro(int i) {
        this.$cid = i;
    }

    @Override // defpackage.cru
    public final double a(double d) {
        int i = this.$cid;
        if (i == 0) {
            float[] fArr = defpackage.crp.a;
            return java.lang.Math.copySign(defpackage.cfd.s(d < 0.0d ? -d : d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d), d);
        }
        if (i == 1) {
            float[] fArr2 = defpackage.crp.a;
            return java.lang.Math.copySign(defpackage.cfd.r(d < 0.0d ? -d : d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d), d);
        }
        if (i == 2) {
            return defpackage.crp.b(defpackage.crp.c, d);
        }
        if (i == 3) {
            return defpackage.crp.a(defpackage.crp.c, d);
        }
        if (i != 4) {
            return i == 5 ? defpackage.crp.c(defpackage.crp.d, d) : d;
        }
        return defpackage.crp.d(defpackage.crp.d, d);
    }
}
