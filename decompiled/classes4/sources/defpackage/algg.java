package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class algg extends alad implements albi {
    public static final defpackage.algg a;
    public java.lang.String b = "";

    static {
        defpackage.algg alggVar = new defpackage.algg();
        a = alggVar;
        alad.Q(defpackage.algg.class, alggVar);
    }

    private algg() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new java.lang.Object[]{"b"});
        }
        if (i2 == 3) {
            return new defpackage.algg();
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
        return alad.M(defpackage.algg.class);
    }
}
