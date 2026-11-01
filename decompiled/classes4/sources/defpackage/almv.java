package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class almv extends alad implements albi {
    public static final defpackage.almv a;
    public static final apdi e;
    public int b;
    public akzm c;
    public java.lang.String d = "";

    static {
        defpackage.almv almvVar = new defpackage.almv();
        a = almvVar;
        alad.Q(defpackage.almv.class, almvVar);
        e = alad.W(defpackage.almz.a, almvVar, almvVar, 108, alcr.k);
    }

    private almv() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.almv();
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
        return alad.M(defpackage.almv.class);
    }
}
