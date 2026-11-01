package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aldp extends alad implements albi {
    public static final defpackage.aldp a;
    private int b;
    private defpackage.aldt c;

    static {
        defpackage.aldp aldpVar = new defpackage.aldp();
        a = aldpVar;
        alad.Q(defpackage.aldp.class, aldpVar);
    }

    private aldp() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0000\tဉ\b", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.aldp();
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
        return alad.M(defpackage.aldp.class);
    }
}
