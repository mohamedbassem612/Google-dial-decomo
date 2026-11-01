package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amtp extends alad implements albi {
    public static final defpackage.amtp a;
    public int b;
    public defpackage.amtv c;
    public defpackage.amtt d;

    static {
        defpackage.amtp amtpVar = new defpackage.amtp();
        a = amtpVar;
        alad.Q(defpackage.amtp.class, amtpVar);
    }

    private amtp() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003ဉ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.amtp();
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
        return alad.M(defpackage.amtp.class);
    }
}
