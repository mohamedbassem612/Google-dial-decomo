package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akpa extends alad implements albi {
    public static final defpackage.akpa a;
    public int b;
    public int c;

    static {
        defpackage.akpa akpaVar = new defpackage.akpa();
        a = akpaVar;
        alad.Q(defpackage.akpa.class, akpaVar);
    }

    private akpa() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new java.lang.Object[]{"b", "c", alyu.t});
        }
        if (i2 == 3) {
            return new defpackage.akpa();
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
        return alad.M(defpackage.akpa.class);
    }
}
