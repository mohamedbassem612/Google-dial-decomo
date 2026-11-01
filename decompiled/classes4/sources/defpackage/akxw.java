package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akxw extends alad implements albi {
    public static final defpackage.akxw a;
    public int b;
    public defpackage.akxo c;

    static {
        defpackage.akxw akxwVar = new defpackage.akxw();
        a = akxwVar;
        alad.Q(defpackage.akxw.class, akxwVar);
    }

    private akxw() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဉ\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.akxw();
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
        return alad.M(defpackage.akxw.class);
    }
}
