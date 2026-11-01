package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akxq extends alaa implements alab {
    public static final defpackage.akxq a;
    public defpackage.akyh b;
    private int e;
    private byte f = 2;
    public alat c = albq.a;
    public alak d = alae.a;

    static {
        defpackage.akxq akxqVar = new defpackage.akxq();
        a = akxqVar;
        alad.Q(defpackage.akxq.class, akxqVar);
    }

    private akxq() {
        albd albdVar = albd.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0003\u0000\u0001\u0001\u000f\u0003\u0000\u0002\u0001\u0001ᐉ\u0000\u0002\u001b\u000f'", new java.lang.Object[]{"e", "b", "c", defpackage.akyb.class, "d"});
        }
        if (i2 == 3) {
            return new defpackage.akxq();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.akxq.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
