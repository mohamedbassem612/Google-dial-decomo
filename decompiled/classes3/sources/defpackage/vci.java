package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vci extends alad implements albi {
    public static final defpackage.vci a;
    public long d;
    public java.lang.String b = "";
    public java.lang.String c = "";
    public akzc e = akzc.d;

    static {
        defpackage.vci vciVar = new defpackage.vci();
        a = vciVar;
        alad.Q(defpackage.vci.class, vciVar);
    }

    private vci() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004\n", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.vci();
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
        return alad.M(defpackage.vci.class);
    }
}
