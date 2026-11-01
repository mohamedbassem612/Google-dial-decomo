package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aevu extends alaa implements alab {
    public static final defpackage.aevu a;
    public int b;
    public apgu c;
    private byte d = 2;

    static {
        defpackage.aevu aevuVar = new defpackage.aevu();
        a = aevuVar;
        alad.Q(defpackage.aevu.class, aevuVar);
    }

    private aevu() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.aevu();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.aevu.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
