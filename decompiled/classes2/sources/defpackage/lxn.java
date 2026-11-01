package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lxn extends alad implements albi {
    public static final defpackage.lxn a;
    public boolean b;
    public boolean c;

    static {
        defpackage.lxn lxnVar = new defpackage.lxn();
        a = lxnVar;
        alad.Q(defpackage.lxn.class, lxnVar);
    }

    private lxn() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.lxn();
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
        return alad.M(defpackage.lxn.class);
    }
}
