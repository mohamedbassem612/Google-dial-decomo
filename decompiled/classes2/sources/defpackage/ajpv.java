package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajpv extends alad implements albi {
    public static final defpackage.ajpv a;
    public int b;
    public int c;
    public int d;

    static {
        defpackage.ajpv ajpvVar = new defpackage.ajpv();
        a = ajpvVar;
        alad.Q(defpackage.ajpv.class, ajpvVar);
    }

    private ajpv() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.ajpv();
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
        return alad.M(defpackage.ajpv.class);
    }
}
