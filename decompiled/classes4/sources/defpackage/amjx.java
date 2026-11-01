package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amjx extends alaa implements alab {
    public static final defpackage.amjx a;
    private int b;
    private defpackage.aqae c;
    private byte d = 2;

    static {
        defpackage.amjx amjxVar = new defpackage.amjx();
        a = amjxVar;
        alad.Q(defpackage.amjx.class, amjxVar);
    }

    private amjx() {
        albq albqVar = albq.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0001\u0000\u0001\u001d\u001d\u0001\u0000\u0000\u0000\u001dဉ\u001c", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.amjx();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.amjx.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
