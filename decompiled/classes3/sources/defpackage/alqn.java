package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class alqn extends alad implements albi {
    public static final defpackage.alqn a;
    public int b;
    public java.lang.String c = "";
    public double d;
    public defpackage.amku e;

    static {
        defpackage.alqn alqnVar = new defpackage.alqn();
        a = alqnVar;
        alad.Q(defpackage.alqn.class, alqnVar);
    }

    private alqn() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001\u0003ဉ\u0002", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.alqn();
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
        return alad.M(defpackage.alqn.class);
    }
}
