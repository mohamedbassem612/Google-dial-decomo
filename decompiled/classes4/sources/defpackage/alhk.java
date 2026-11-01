package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alhk extends alad implements albi {
    public static final defpackage.alhk a;
    public int b;
    public defpackage.alhj c;
    public defpackage.alhi d;

    static {
        defpackage.alhk alhkVar = new defpackage.alhk();
        a = alhkVar;
        alad.Q(defpackage.alhk.class, alhkVar);
    }

    private alhk() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.alhk();
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
        return alad.M(defpackage.alhk.class);
    }
}
