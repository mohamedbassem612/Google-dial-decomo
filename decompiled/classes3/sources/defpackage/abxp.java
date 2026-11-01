package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abxp extends alad implements defpackage.abxq {
    public static final defpackage.abxp a;
    public int b = 0;
    public java.lang.Object c;

    static {
        defpackage.abxp abxpVar = new defpackage.abxp();
        a = abxpVar;
        alad.Q(defpackage.abxp.class, abxpVar);
    }

    private abxp() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new java.lang.Object[]{"c", "b", defpackage.abxs.class});
        }
        if (i2 == 3) {
            return new defpackage.abxp();
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
        return alad.M(defpackage.abxp.class);
    }
}
