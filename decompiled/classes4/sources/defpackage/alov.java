package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alov extends alad implements albi {
    public static final defpackage.alov a;
    public java.lang.String b = "";
    public defpackage.almd c;
    private int d;

    static {
        defpackage.alov alovVar = new defpackage.alov();
        a = alovVar;
        alad.Q(defpackage.alov.class, alovVar);
    }

    private alov() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new java.lang.Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.alov();
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
        return alad.M(defpackage.alov.class);
    }
}
