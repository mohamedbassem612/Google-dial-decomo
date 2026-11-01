package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahvn extends alad implements albi {
    public static final defpackage.ahvn a;
    public int b;

    static {
        defpackage.ahvn ahvnVar = new defpackage.ahvn();
        a = ahvnVar;
        alad.Q(defpackage.ahvn.class, ahvnVar);
    }

    private ahvn() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new java.lang.Object[]{"b"});
        }
        if (i2 == 3) {
            return new defpackage.ahvn();
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
        return alad.M(defpackage.ahvn.class);
    }
}
