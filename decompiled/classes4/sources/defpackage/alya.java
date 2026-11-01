package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alya extends alad implements albi {
    public static final defpackage.alya a;
    public static final apdi c;
    public java.lang.String b = "";
    private int d;

    static {
        defpackage.alya alyaVar = new defpackage.alya();
        a = alyaVar;
        alad.Q(defpackage.alya.class, alyaVar);
        c = alad.W(defpackage.almb.a, alyaVar, alyaVar, 100, alcr.k);
    }

    private alya() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new java.lang.Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new defpackage.alya();
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
        return alad.M(defpackage.alya.class);
    }
}
