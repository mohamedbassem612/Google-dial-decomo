package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nsk extends alad implements albi {
    public static final defpackage.nsk a;
    public int b;
    public int c;

    static {
        defpackage.nsk nskVar = new defpackage.nsk();
        a = nskVar;
        alad.Q(defpackage.nsk.class, nskVar);
    }

    private nsk() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.nsk();
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
        return alad.M(defpackage.nsk.class);
    }
}
