package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amla extends alaa implements alab {
    public static final defpackage.amla a;
    public alat b;
    public alat c;
    public amlg d;
    private int e;
    private amlf f;
    private byte g = 2;

    static {
        defpackage.amla amlaVar = new defpackage.amla();
        a = amlaVar;
        alad.Q(defpackage.amla.class, amlaVar);
    }

    private amla() {
        albq albqVar = albq.a;
        this.b = albqVar;
        this.c = albqVar;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0001\u0001\u001a\u0002ဉ\u0000\u0003ဉ\u0001\u0004Л", new java.lang.Object[]{"e", "b", "f", "d", "c", defpackage.amkz.class});
        }
        if (i2 == 3) {
            return new defpackage.amla();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.amla.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
