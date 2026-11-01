package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class liq extends alad implements albi {
    public static final defpackage.liq a;
    public int c;
    public int d;
    public int e;
    public java.lang.String b = "";
    public java.lang.String f = "";

    static {
        defpackage.liq liqVar = new defpackage.liq();
        a = liqVar;
        alad.Q(defpackage.liq.class, liqVar);
    }

    private liq() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0000\u0000\u0001Ȉ\u0003\f\u0004\f\u0005\f\u0006Ȉ", new java.lang.Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new defpackage.liq();
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
        return alad.M(defpackage.liq.class);
    }
}
