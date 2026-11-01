package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akwd extends alad implements albi {
    public static final defpackage.akwd a;
    private byte b = 2;

    static {
        defpackage.akwd akwdVar = new defpackage.akwd();
        a = akwdVar;
        alad.Q(defpackage.akwd.class, akwdVar);
    }

    private akwd() {
        albq albqVar = albq.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.b);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0000", (java.lang.Object[]) null);
        }
        if (i2 == 3) {
            return new defpackage.akwd();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.akwd.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
