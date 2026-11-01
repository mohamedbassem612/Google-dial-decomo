package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acuh extends alaa implements alab {
    public static final defpackage.acuh a;
    public int b;
    public long e;
    public long f;
    public akyp g;
    public boolean h;
    private byte j = 2;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public java.lang.String i = "";

    static {
        defpackage.acuh acuhVar = new defpackage.acuh();
        a = acuhVar;
        alad.Q(defpackage.acuh.class, acuhVar);
    }

    private acuh() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.j);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဈ\u0006", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new defpackage.acuh();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.acuh.class);
        }
        this.j = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
