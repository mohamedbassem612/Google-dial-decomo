package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajds extends alad implements albi {
    public static final defpackage.ajds a;
    public int b;
    public int c;
    public int d;
    public defpackage.ajdr e;
    private byte f = 2;

    static {
        defpackage.ajds ajdsVar = new defpackage.ajds();
        a = ajdsVar;
        alad.Q(defpackage.ajds.class, ajdsVar);
    }

    private ajds() {
        alae alaeVar = alae.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0003\u0000\u0001\u0005\n\u0003\u0000\u0000\u0000\u0005\f\u0007\f\nဉ\u0000", new java.lang.Object[]{"b", "d", "c", "e"});
        }
        if (i2 == 3) {
            return new defpackage.ajds();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.ajds.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
