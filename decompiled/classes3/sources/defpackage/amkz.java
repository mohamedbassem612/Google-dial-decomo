package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amkz extends alaa implements alab {
    public static final defpackage.amkz a;
    public alat b;
    public defpackage.amku c;
    public int d;
    public alat e;
    private int f;
    private byte g = 2;

    static {
        defpackage.amkz amkzVar = new defpackage.amkz();
        a = amkzVar;
        alad.Q(defpackage.amkz.class, amkzVar);
    }

    private amkz() {
        albq albqVar = albq.a;
        this.b = albqVar;
        this.e = albqVar;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0004\u0000\u0001\u0001\u0012\u0004\u0000\u0002\u0000\u0001\u001a\u0003ဉ\u0001\u0005᠌\u0003\u0012\u001b", new java.lang.Object[]{"f", "b", "c", "d", defpackage.amjv.j, "e", defpackage.amlh.class});
        }
        if (i2 == 3) {
            return new defpackage.amkz();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.amkz.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
