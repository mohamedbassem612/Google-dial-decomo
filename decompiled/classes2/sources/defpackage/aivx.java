package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aivx extends alaa implements alab {
    public static final defpackage.aivx a;
    public int b;
    public aiwc c;
    public int e;
    public int f;
    public int g;
    public defpackage.aiuz j;
    private byte k = 2;
    public int d = -1;
    public int h = -1;
    public alat i = albq.a;

    static {
        defpackage.aivx aivxVar = new defpackage.aivx();
        a = aivxVar;
        alad.Q(defpackage.aivx.class, aivxVar);
    }

    private aivx() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0001\u0003\u0001င\u0002\u0003င\u0004\u0004င\u0005\u0005င\u0006\u0006င\u0007\u000eЛ\u000fᐉ\u000e\u0010ᐉ\u0000", new java.lang.Object[]{"b", "d", "e", "f", "g", "h", "i", defpackage.aivy.class, "j", "c"});
        }
        if (i2 == 3) {
            return new defpackage.aivx();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.aivx.class);
        }
        this.k = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
