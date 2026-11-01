package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akof extends defpackage.alad implements defpackage.albi {
    public static final defpackage.akof a;
    private byte c = 2;
    public defpackage.alat b = defpackage.albq.a;

    static {
        defpackage.akof akofVar = new defpackage.akof();
        a = akofVar;
        defpackage.alad.Q(defpackage.akof.class, akofVar);
    }

    private akof() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new java.lang.Object[]{"b", defpackage.akog.class});
        }
        if (i2 == 3) {
            return new defpackage.akof();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.akof.class);
        }
        this.c = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
