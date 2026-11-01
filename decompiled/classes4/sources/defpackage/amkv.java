package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amkv extends alaa implements alab {
    public static final defpackage.amkv a;
    public int b;
    public defpackage.amlg c;
    private int d;
    private byte e = 2;

    static {
        defpackage.amkv amkvVar = new defpackage.amkv();
        a = amkvVar;
        alad.Q(defpackage.amkv.class, amkvVar);
    }

    private amkv() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new java.lang.Object[]{"d", "b", amjv.h, "c"});
        }
        if (i2 == 3) {
            return new defpackage.amkv();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.amkv.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
