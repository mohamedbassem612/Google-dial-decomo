package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uyl extends alad implements albi {
    public static final defpackage.uyl a;
    public boolean b;
    public boolean c;
    private int d;

    static {
        defpackage.uyl uylVar = new defpackage.uyl();
        a = uylVar;
        alad.Q(defpackage.uyl.class, uylVar);
    }

    private uyl() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new java.lang.Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.uyl();
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
        return alad.M(defpackage.uyl.class);
    }
}
