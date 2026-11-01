package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afdc extends alad implements albi {
    public static final defpackage.afdc a;
    public java.lang.String b = "";
    private int c;

    static {
        defpackage.afdc afdcVar = new defpackage.afdc();
        a = afdcVar;
        alad.Q(defpackage.afdc.class, afdcVar);
    }

    private afdc() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new java.lang.Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new defpackage.afdc();
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
        return alad.M(defpackage.afdc.class);
    }
}
