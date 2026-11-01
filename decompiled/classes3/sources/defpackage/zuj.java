package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zuj extends alad implements albi {
    public static final defpackage.zuj a;
    public int b;
    public java.lang.String c = "";
    public java.lang.String d = "";

    static {
        defpackage.zuj zujVar = new defpackage.zuj();
        a = zujVar;
        alad.Q(defpackage.zuj.class, zujVar);
    }

    private zuj() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.zuj();
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
        return alad.M(defpackage.zuj.class);
    }
}
