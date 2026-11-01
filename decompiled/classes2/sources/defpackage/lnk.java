package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lnk extends alad implements albi {
    public static final defpackage.lnk a;
    public int b = 0;
    public java.lang.Object c;

    static {
        defpackage.lnk lnkVar = new defpackage.lnk();
        a = lnkVar;
        alad.Q(defpackage.lnk.class, lnkVar);
    }

    private lnk() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000", new java.lang.Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new defpackage.lnk();
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
        return alad.M(defpackage.lnk.class);
    }
}
