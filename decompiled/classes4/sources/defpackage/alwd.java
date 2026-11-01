package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alwd extends alad implements albi {
    public static final defpackage.alwd a;

    static {
        defpackage.alwd alwdVar = new defpackage.alwd();
        a = alwdVar;
        alad.Q(defpackage.alwd.class, alwdVar);
    }

    private alwd() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0000", (java.lang.Object[]) null);
        }
        if (i2 == 3) {
            return new defpackage.alwd();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.alwd.class);
        }
        return null;
    }
}
