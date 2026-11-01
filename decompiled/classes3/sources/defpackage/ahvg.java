package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahvg extends alad implements albi {
    public static final defpackage.ahvg a;
    public int b;

    static {
        defpackage.ahvg ahvgVar = new defpackage.ahvg();
        a = ahvgVar;
        alad.Q(defpackage.ahvg.class, ahvgVar);
    }

    private ahvg() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\f", new java.lang.Object[]{"b"});
        }
        if (i2 == 3) {
            return new defpackage.ahvg();
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
        return alad.M(defpackage.ahvg.class);
    }
}
