package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mgy extends alad implements albi {
    public static final defpackage.mgy a;
    public java.lang.String b = "";
    public java.lang.String c = "";
    private int d;

    static {
        defpackage.mgy mgyVar = new defpackage.mgy();
        a = mgyVar;
        alad.Q(defpackage.mgy.class, mgyVar);
    }

    private mgy() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new java.lang.Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.mgy();
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
        return alad.M(defpackage.mgy.class);
    }
}
