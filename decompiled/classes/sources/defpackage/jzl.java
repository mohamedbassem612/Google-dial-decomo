package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jzl extends defpackage.alad implements defpackage.albi {
    public static final defpackage.jzl a;
    public int b;
    public defpackage.kiv c;
    public boolean d;

    static {
        defpackage.jzl jzlVar = new defpackage.jzl();
        a = jzlVar;
        defpackage.alad.Q(defpackage.jzl.class, jzlVar);
    }

    private jzl() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.jzl();
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
        return defpackage.alad.M(defpackage.jzl.class);
    }
}
