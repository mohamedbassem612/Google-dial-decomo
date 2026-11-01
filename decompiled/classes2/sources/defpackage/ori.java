package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ori extends alad implements albi {
    public static final defpackage.ori a;
    public int b;
    public java.lang.String c = "";
    public java.lang.String d = "";

    static {
        defpackage.ori oriVar = new defpackage.ori();
        a = oriVar;
        alad.Q(defpackage.ori.class, oriVar);
    }

    private ori() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005ဈ\u0000\u0006ဈ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.ori();
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
        return alad.M(defpackage.ori.class);
    }
}
