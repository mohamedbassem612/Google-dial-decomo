package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aexx extends defpackage.alad implements defpackage.albi {
    public static final defpackage.aexx a;
    public java.lang.String b = "";
    public long c;
    private int d;

    static {
        defpackage.aexx aexxVar = new defpackage.aexx();
        a = aexxVar;
        defpackage.alad.Q(defpackage.aexx.class, aexxVar);
    }

    private aexx() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new java.lang.Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.aexx();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return defpackage.alad.M(defpackage.aexx.class);
    }
}
