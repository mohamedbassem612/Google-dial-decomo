package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kow extends alad implements albi {
    public static final defpackage.kow a;
    public int b;
    public amle c;
    public long e;
    public int f;
    private byte g = 2;
    public java.lang.String d = "";

    static {
        defpackage.kow kowVar = new defpackage.kow();
        a = kowVar;
        alad.Q(defpackage.kow.class, kowVar);
    }

    private kow() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new albr(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ለ\u0001\u0003ဂ\u0002\u0004ဌ\u0003", new java.lang.Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new defpackage.kow();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.kow.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
