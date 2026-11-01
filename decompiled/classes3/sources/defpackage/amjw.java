package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amjw extends alad implements albi {
    public static final defpackage.amjw a;
    private int b;
    private int c;
    private byte d = 2;

    static {
        defpackage.amjw amjwVar = new defpackage.amjw();
        a = amjwVar;
        alad.Q(defpackage.amjw.class, amjwVar);
    }

    private amjw() {
        albq albqVar = albq.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᔄ\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.amjw();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.amjw.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
