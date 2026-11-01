package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahwi extends alaa implements alab {
    public static final defpackage.ahwi a;
    public long c;
    public long d;
    private int e;
    private byte f = 2;
    public java.lang.String b = "";

    static {
        defpackage.ahwi ahwiVar = new defpackage.ahwi();
        a = ahwiVar;
        alad.Q(defpackage.ahwi.class, ahwiVar);
    }

    private ahwi() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new java.lang.Object[]{"e", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.ahwi();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.ahwi.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
