package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afbs extends alad implements albi {
    public static final defpackage.afbs a;
    public int b;
    private int c;

    static {
        defpackage.afbs afbsVar = new defpackage.afbs();
        a = afbsVar;
        alad.Q(defpackage.afbs.class, afbsVar);
    }

    private afbs() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new java.lang.Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new defpackage.afbs();
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
        return alad.M(defpackage.afbs.class);
    }
}
