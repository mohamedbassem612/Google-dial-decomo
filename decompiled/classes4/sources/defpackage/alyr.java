package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alyr extends alad implements albi {
    public static final defpackage.alyr a;
    public int b;
    public int c;

    static {
        defpackage.alyr alyrVar = new defpackage.alyr();
        a = alyrVar;
        alad.Q(defpackage.alyr.class, alyrVar);
    }

    private alyr() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new java.lang.Object[]{"b", "c", defpackage.alyu.a});
        }
        if (i2 == 3) {
            return new defpackage.alyr();
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
        return alad.M(defpackage.alyr.class);
    }
}
