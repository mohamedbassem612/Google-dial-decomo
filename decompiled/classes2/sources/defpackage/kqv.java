package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kqv extends alad implements albi {
    public static final defpackage.kqv a;
    public int b;
    public java.lang.String c = "";
    public java.lang.String d = "";

    static {
        defpackage.kqv kqvVar = new defpackage.kqv();
        a = kqvVar;
        alad.Q(defpackage.kqv.class, kqvVar);
    }

    private kqv() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0000\u0003ဈ\u0002\u0005ဈ\u0004", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.kqv();
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
        return alad.M(defpackage.kqv.class);
    }
}
