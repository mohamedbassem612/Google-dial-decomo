package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahvj extends alad implements albi {
    public static final defpackage.ahvj a;
    public int b;
    public int c;

    static {
        defpackage.ahvj ahvjVar = new defpackage.ahvj();
        a = ahvjVar;
        alad.Q(defpackage.ahvj.class, ahvjVar);
    }

    private ahvj() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.ahvj();
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
        return alad.M(defpackage.ahvj.class);
    }
}
