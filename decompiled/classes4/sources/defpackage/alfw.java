package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alfw extends alad implements albi {
    public static final defpackage.alfw a;
    public int c;
    public java.lang.String b = "";
    public java.lang.String d = "";
    public java.lang.String e = "";
    public java.lang.String f = "";
    public java.lang.String g = "";

    static {
        defpackage.alfw alfwVar = new defpackage.alfw();
        a = alfwVar;
        alad.Q(defpackage.alfw.class, alfwVar);
    }

    private alfw() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001Ȉ\u0003\f\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new java.lang.Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new defpackage.alfw();
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
        return alad.M(defpackage.alfw.class);
    }
}
