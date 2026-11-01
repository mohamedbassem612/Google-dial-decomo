package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alro extends alaa implements alab {
    public static final defpackage.alro a;
    public int b;
    public long c;
    private byte d = 2;

    static {
        defpackage.alro alroVar = new defpackage.alro();
        a = alroVar;
        alad.Q(defpackage.alro.class, alroVar);
    }

    private alro() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.alro();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.alro.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
