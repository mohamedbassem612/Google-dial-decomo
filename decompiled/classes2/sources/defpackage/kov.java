package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kov extends alad implements albi {
    public static final defpackage.kov a;
    private byte c = 2;
    public alat b = albq.a;

    static {
        defpackage.kov kovVar = new defpackage.kov();
        a = kovVar;
        alad.Q(defpackage.kov.class, kovVar);
    }

    private kov() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new java.lang.Object[]{"b", defpackage.kot.class});
        }
        if (i2 == 3) {
            return new defpackage.kov();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.kov.class);
        }
        this.c = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
