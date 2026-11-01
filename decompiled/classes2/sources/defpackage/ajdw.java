package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajdw extends alad implements albi {
    public static final defpackage.ajdw a;
    public int b;
    public int c;
    public java.lang.String d = "";
    public int e;

    static {
        defpackage.ajdw ajdwVar = new defpackage.ajdw();
        a = ajdwVar;
        alad.Q(defpackage.ajdw.class, ajdwVar);
    }

    private ajdw() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0004\u0000\u0000\u0001\u0007\u0004\u0000\u0000\u0000\u0001\f\u0002\f\u0006Ȉ\u0007\f", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.ajdw();
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
        return alad.M(defpackage.ajdw.class);
    }
}
