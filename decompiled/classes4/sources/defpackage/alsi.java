package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alsi extends alaa implements alab {
    public static final defpackage.alsi a;
    public int b;
    private byte d = 2;
    public java.lang.String c = "";

    static {
        defpackage.alsi alsiVar = new defpackage.alsi();
        a = alsiVar;
        alad.Q(defpackage.alsi.class, alsiVar);
    }

    private alsi() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.alsi();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.alsi.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
