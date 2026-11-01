package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amsg extends defpackage.alad implements defpackage.albi {
    public static final defpackage.amsg a;
    public int b;
    public java.lang.String c = "";
    public int d;
    public long e;

    static {
        defpackage.amsg amsgVar = new defpackage.amsg();
        a = amsgVar;
        defpackage.alad.Q(defpackage.amsg.class, amsgVar);
    }

    private amsg() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002", new java.lang.Object[]{"b", "c", "d", amrx.e, "e"});
        }
        if (i2 == 3) {
            return new defpackage.amsg();
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
        return defpackage.alad.M(defpackage.amsg.class);
    }
}
