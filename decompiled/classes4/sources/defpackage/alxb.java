package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alxb extends alad implements albi {
    public static final defpackage.alxb a;
    public static final apdi d;
    public int b;
    public java.lang.String c = "";

    static {
        defpackage.alxb alxbVar = new defpackage.alxb();
        a = alxbVar;
        alad.Q(defpackage.alxb.class, alxbVar);
        d = alad.W(defpackage.alwp.a, alxbVar, alxbVar, 106, alcr.k);
    }

    private alxb() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.alxb();
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
        return alad.M(defpackage.alxb.class);
    }
}
