package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nlo extends alad implements albi {
    public static final defpackage.nlo a;
    public int b;
    public boolean c;
    public long d;

    static {
        defpackage.nlo nloVar = new defpackage.nlo();
        a = nloVar;
        alad.Q(defpackage.nlo.class, nloVar);
    }

    private nlo() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002ဂ\u0000", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.nlo();
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
        return alad.M(defpackage.nlo.class);
    }
}
