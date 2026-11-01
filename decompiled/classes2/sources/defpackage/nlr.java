package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nlr extends alad implements albi {
    public static final defpackage.nlr a;
    public int b;
    public int c;
    public long d;

    static {
        defpackage.nlr nlrVar = new defpackage.nlr();
        a = nlrVar;
        alad.Q(defpackage.nlr.class, nlrVar);
    }

    private nlr() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001\f\u0004ဂ\u0002", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.nlr();
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
        return alad.M(defpackage.nlr.class);
    }
}
