package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class almy extends alad implements albi {
    public static final defpackage.almy a;
    public int b;
    public alcf c;
    public akzm d;
    public defpackage.almz h;
    private byte i = 2;
    public java.lang.String e = "";
    public java.lang.String f = "";
    public java.lang.String g = "";

    static {
        defpackage.almy almyVar = new defpackage.almy();
        a = almyVar;
        alad.Q(defpackage.almy.class, almyVar);
    }

    private almy() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0001\u0002ဉ\u0000\u0003ဈ\u0002\u0004ဈ\u0004\u0005ᐉ\u0005\u0006ဈ\u0003\bဉ\u0001", new java.lang.Object[]{"b", "c", "e", "g", "h", "f", "d"});
        }
        if (i2 == 3) {
            return new defpackage.almy();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.almy.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
