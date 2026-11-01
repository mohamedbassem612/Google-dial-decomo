package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mna extends alad implements albi {
    public static final defpackage.mna a;
    public int b;
    public java.lang.String c = "";
    public int d = 1;

    static {
        defpackage.mna mnaVar = new defpackage.mna();
        a = mnaVar;
        alad.Q(defpackage.mna.class, mnaVar);
    }

    private mna() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new java.lang.Object[]{"b", "c", "d", aloy.q});
        }
        if (i2 == 3) {
            return new defpackage.mna();
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
        return alad.M(defpackage.mna.class);
    }
}
