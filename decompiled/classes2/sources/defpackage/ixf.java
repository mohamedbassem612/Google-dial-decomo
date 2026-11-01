package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ixf extends alad implements albi {
    public static final defpackage.ixf a;
    public long d;
    public java.lang.String b = "";
    public java.lang.String c = "";
    public java.lang.String e = "";

    static {
        defpackage.ixf ixfVar = new defpackage.ixf();
        a = ixfVar;
        alad.Q(defpackage.ixf.class, ixfVar);
    }

    private ixf() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004Ȉ", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.ixf();
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
        return alad.M(defpackage.ixf.class);
    }
}
