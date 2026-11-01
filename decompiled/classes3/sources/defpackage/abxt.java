package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abxt extends alad implements defpackage.abxu {
    public static final defpackage.abxt a;
    public int b;
    public defpackage.abxp c;
    public defpackage.abxr d;
    public java.lang.String e = "";

    static {
        defpackage.abxt abxtVar = new defpackage.abxt();
        a = abxtVar;
        alad.Q(defpackage.abxt.class, abxtVar);
    }

    private abxt() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.abxt();
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
        return alad.M(defpackage.abxt.class);
    }
}
