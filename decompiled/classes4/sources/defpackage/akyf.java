package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akyf extends alaa implements alab {
    public static final defpackage.akyf a;
    public java.lang.Object c;
    private java.lang.Object e;
    public int b = 0;
    public int d = 0;
    private byte f = 2;

    static {
        defpackage.akyf akyfVar = new defpackage.akyf();
        a = akyfVar;
        alad.Q(defpackage.akyf.class, akyfVar);
    }

    private akyf() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0005\u0002\u0000\u0001\u0006\u0005\u0000\u0000\u0001\u0001<\u0000\u0002<\u0001\u0003<\u0001\u0004м\u0001\u00067\u0000", new java.lang.Object[]{"c", "b", "e", "d", defpackage.akyb.class, defpackage.akyd.class, defpackage.akyc.class, defpackage.akye.class});
        }
        if (i2 == 3) {
            return new defpackage.akyf();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.akyf.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
