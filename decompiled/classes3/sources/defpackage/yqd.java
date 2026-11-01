package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yqd extends alad implements albi {
    public static final defpackage.yqd a;
    public int b;
    public int c;

    static {
        defpackage.yqd yqdVar = new defpackage.yqd();
        a = yqdVar;
        alad.Q(defpackage.yqd.class, yqdVar);
    }

    private yqd() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.yqd();
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
        return alad.M(defpackage.yqd.class);
    }
}
