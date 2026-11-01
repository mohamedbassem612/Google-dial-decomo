package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jbp extends defpackage.alad implements defpackage.albi {
    public static final defpackage.jbp a;
    public int b;
    public defpackage.alcf c;
    public tyz d;
    public igp e;
    public boolean f;
    public boolean g;

    static {
        defpackage.jbp jbpVar = new defpackage.jbp();
        a = jbpVar;
        defpackage.alad.Q(defpackage.jbp.class, jbpVar);
    }

    private jbp() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0007\u0005\u0007", new java.lang.Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new defpackage.jbp();
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
        return defpackage.alad.M(defpackage.jbp.class);
    }
}
