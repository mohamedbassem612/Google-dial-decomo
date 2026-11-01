package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class alra extends alad implements albi {
    public static final defpackage.alra a;
    public int b;
    public int c;
    public double d;

    static {
        defpackage.alra alraVar = new defpackage.alra();
        a = alraVar;
        alad.Q(defpackage.alra.class, alraVar);
    }

    private alra() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002က\u0001", new java.lang.Object[]{"b", "c", aloy.e, "d"});
        }
        if (i2 == 3) {
            return new defpackage.alra();
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
        return alad.M(defpackage.alra.class);
    }
}
