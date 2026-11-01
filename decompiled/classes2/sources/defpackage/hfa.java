package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hfa implements defpackage.hfw {
    private final /* synthetic */ int $cid;
    public static final defpackage.hfa f = new defpackage.hfa(5);
    public static final defpackage.hfa e = new defpackage.hfa(4);
    public static final defpackage.hfa d = new defpackage.hfa(3);
    public static final defpackage.hfa c = new defpackage.hfa(2);
    public static final defpackage.hfa b = new defpackage.hfa(1);
    public static final defpackage.hfa a = new defpackage.hfa(0);

    private hfa(int i) {
        this.$cid = i;
    }

    @Override // defpackage.hfw
    public final /* synthetic */ java.lang.Object a(defpackage.hfz hfzVar, float f2) {
        boolean z;
        int i = this.$cid;
        if (i == 0) {
            return java.lang.Float.valueOf(defpackage.hfg.a(hfzVar) * f2);
        }
        if (i == 1) {
            z = hfzVar.p() == 1;
            if (z) {
                hfzVar.g();
            }
            double dA = hfzVar.a();
            double dA2 = hfzVar.a();
            double dA3 = hfzVar.a();
            double dA4 = hfzVar.p() == 7 ? hfzVar.a() : 1.0d;
            if (z) {
                hfzVar.i();
            }
            if (dA <= 1.0d && dA2 <= 1.0d && dA3 <= 1.0d) {
                dA *= 255.0d;
                dA2 *= 255.0d;
                dA3 *= 255.0d;
                if (dA4 <= 1.0d) {
                    dA4 *= 255.0d;
                }
            }
            return java.lang.Integer.valueOf(android.graphics.Color.argb((int) dA4, (int) dA, (int) dA2, (int) dA3));
        }
        if (i == 2) {
            return java.lang.Integer.valueOf(java.lang.Math.round(defpackage.hfg.a(hfzVar) * f2));
        }
        if (i == 3) {
            return defpackage.hfg.c(hfzVar, f2);
        }
        if (i != 4) {
            z = hfzVar.p() == 1;
            if (z) {
                hfzVar.g();
            }
            float fA = (float) hfzVar.a();
            float fA2 = (float) hfzVar.a();
            while (hfzVar.n()) {
                hfzVar.m();
            }
            if (z) {
                hfzVar.i();
            }
            return new defpackage.hgq((fA / 100.0f) * f2, (fA2 / 100.0f) * f2);
        }
        int iP = hfzVar.p();
        if (iP == 1) {
            return defpackage.hfg.c(hfzVar, f2);
        }
        if (iP == 3) {
            return defpackage.hfg.c(hfzVar, f2);
        }
        if (iP != 7) {
            throw new java.lang.IllegalArgumentException("Cannot convert json to point. Next token is ".concat(anty.ap(iP)));
        }
        android.graphics.PointF pointF = new android.graphics.PointF(((float) hfzVar.a()) * f2, ((float) hfzVar.a()) * f2);
        while (hfzVar.n()) {
            hfzVar.m();
        }
        return pointF;
    }
}
