package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aklc extends alad implements albi {
    public static final defpackage.aklc a;
    public akzc b = akzc.d;
    public long c;

    static {
        defpackage.aklc aklcVar = new defpackage.aklc();
        a = aklcVar;
        alad.Q(defpackage.aklc.class, aklcVar);
    }

    private aklc() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0002", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.aklc();
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
        return alad.M(defpackage.aklc.class);
    }
}
