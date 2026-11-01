package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alxs extends alad implements albi {
    public static final defpackage.alxs a;
    public int b;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public java.lang.String e = "";
    public java.lang.String f = "";

    static {
        defpackage.alxs alxsVar = new defpackage.alxs();
        a = alxsVar;
        alad.Q(defpackage.alxs.class, alxsVar);
    }

    private alxs() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new java.lang.Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new defpackage.alxs();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return alad.M(defpackage.alxs.class);
    }
}
