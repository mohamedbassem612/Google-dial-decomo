package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akww extends alad implements albi {
    public static final defpackage.akww a;
    private byte c = 2;
    public alat b = albq.a;

    static {
        defpackage.akww akwwVar = new defpackage.akww();
        a = akwwVar;
        alad.Q(defpackage.akww.class, akwwVar);
    }

    private akww() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new java.lang.Object[]{"b", akwv.class});
        }
        if (i2 == 3) {
            return new defpackage.akww();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.akww.class);
        }
        this.c = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
