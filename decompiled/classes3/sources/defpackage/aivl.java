package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aivl extends alad implements albi {
    public static final defpackage.aivl a;
    public java.lang.Object c;
    public java.lang.Object e;
    public int b = 0;
    public int d = 0;
    private byte f = 2;

    static {
        defpackage.aivl aivlVar = new defpackage.aivl();
        a = aivlVar;
        alad.Q(defpackage.aivl.class, aivlVar);
    }

    private aivl() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0005\u0002\u0000\u0001\u0005\u0005\u0000\u0000\u0003\u0001м\u0000\u0002м\u0001\u0003м\u0000\u0004;\u0000\u0005;\u0001", new java.lang.Object[]{"c", "b", "e", "d", aiwe.class, aiwc.class, aiwd.class});
        }
        if (i2 == 3) {
            return new defpackage.aivl();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.aivl.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
