package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afde extends alaa implements alab {
    public static final defpackage.afde a;
    public java.lang.Object c;
    public int b = 0;
    private byte d = 2;

    static {
        defpackage.afde afdeVar = new defpackage.afde();
        a = afdeVar;
        alad.Q(defpackage.afde.class, afdeVar);
    }

    private afde() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0001\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u00057\u0000\u0006м\u0000", new java.lang.Object[]{"c", "b", defpackage.afdd.class, defpackage.afdc.class, defpackage.afda.class, defpackage.afdb.class, amle.class});
        }
        if (i2 == 3) {
            return new defpackage.afde();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.afde.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
