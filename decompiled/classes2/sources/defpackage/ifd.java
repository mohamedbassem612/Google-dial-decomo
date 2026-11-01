package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ifd extends alad implements albi {
    public static final defpackage.ifd a;
    public int b;

    static {
        defpackage.ifd ifdVar = new defpackage.ifd();
        a = ifdVar;
        alad.Q(defpackage.ifd.class, ifdVar);
    }

    private ifd() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new java.lang.Object[]{"b"});
        }
        if (i2 == 3) {
            return new defpackage.ifd();
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
        return alad.M(defpackage.ifd.class);
    }
}
