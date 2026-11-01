package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ammc extends defpackage.alad implements defpackage.albi {
    public static final defpackage.ammc a;
    public int b;
    public int c;
    public int d;

    static {
        defpackage.ammc ammcVar = new defpackage.ammc();
        a = ammcVar;
        defpackage.alad.Q(defpackage.ammc.class, ammcVar);
    }

    private ammc() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.ammc();
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
        return defpackage.alad.M(defpackage.ammc.class);
    }
}
