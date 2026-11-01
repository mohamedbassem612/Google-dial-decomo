package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alwm extends alad implements albi {
    public static final defpackage.alwm a;
    public int b;
    public int c;

    static {
        defpackage.alwm alwmVar = new defpackage.alwm();
        a = alwmVar;
        alad.Q(defpackage.alwm.class, alwmVar);
    }

    private alwm() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new java.lang.Object[]{"b", "c", defpackage.aloy.u});
        }
        if (i2 == 3) {
            return new defpackage.alwm();
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
        return alad.M(defpackage.alwm.class);
    }
}
