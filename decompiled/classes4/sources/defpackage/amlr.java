package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amlr extends alad implements albi {
    public static final defpackage.amlr a;
    public int b = 0;
    public java.lang.Object c;

    static {
        defpackage.amlr amlrVar = new defpackage.amlr();
        a = amlrVar;
        alad.Q(defpackage.amlr.class, amlrVar);
    }

    private amlr() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002;\u0000", new java.lang.Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new defpackage.amlr();
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
        return alad.M(defpackage.amlr.class);
    }
}
