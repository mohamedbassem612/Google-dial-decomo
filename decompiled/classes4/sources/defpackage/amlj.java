package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amlj extends alaa implements alab {
    public static final defpackage.amlj a;
    private int b;
    private defpackage.amli c;
    private byte d = 2;

    static {
        defpackage.amlj amljVar = new defpackage.amlj();
        a = amljVar;
        alad.Q(defpackage.amlj.class, amljVar);
    }

    private amlj() {
        alae alaeVar = alae.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0003", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.amlj();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.amlj.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
