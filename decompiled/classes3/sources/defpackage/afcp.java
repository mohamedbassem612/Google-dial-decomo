package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afcp extends alaa implements alab {
    public static final defpackage.afcp a;
    public int b;
    public java.lang.Object d;
    public boolean e;
    public defpackage.afby g;
    public int c = 0;
    private byte h = 2;
    public boolean f = true;

    static {
        defpackage.afcp afcpVar = new defpackage.afcp();
        a = afcpVar;
        alad.Q(defpackage.afcp.class, afcpVar);
    }

    private afcp() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0007\u0001\u0001\u0003\t\u0007\u0000\u0000\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new java.lang.Object[]{"d", "c", "b", "e", "f", "g", defpackage.afcj.class, defpackage.afdl.class, afbr.class, defpackage.afdi.class});
        }
        if (i2 == 3) {
            return new defpackage.afcp();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.afcp.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
