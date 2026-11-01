package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajon extends alad implements albi {
    public static final defpackage.ajon a;
    public int b;
    public int c;
    public defpackage.ajop d;
    public akzc e = akzc.d;

    static {
        defpackage.ajon ajonVar = new defpackage.ajon();
        a = ajonVar;
        alad.Q(defpackage.ajon.class, ajonVar);
    }

    private ajon() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.ajon();
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
        return alad.M(defpackage.ajon.class);
    }
}
