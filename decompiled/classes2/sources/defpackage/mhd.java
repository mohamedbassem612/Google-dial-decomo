package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mhd extends alad implements albi {
    public static final defpackage.mhd a;
    public int b;
    public java.lang.String c = "";
    public mhc d;

    static {
        defpackage.mhd mhdVar = new defpackage.mhd();
        a = mhdVar;
        alad.Q(defpackage.mhd.class, mhdVar);
    }

    private mhd() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.mhd();
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
        return alad.M(defpackage.mhd.class);
    }
}
