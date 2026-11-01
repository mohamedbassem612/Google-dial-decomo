package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class alfb extends defpackage.alad implements defpackage.albi {
    public static final defpackage.alfb a;
    public defpackage.alan b = defpackage.albd.a;

    static {
        defpackage.alfb alfbVar = new defpackage.alfb();
        a = alfbVar;
        defpackage.alad.Q(defpackage.alfb.class, alfbVar);
    }

    private alfb() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new java.lang.Object[]{"b"});
        }
        if (i2 == 3) {
            return new defpackage.alfb();
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
        return defpackage.alad.M(defpackage.alfb.class);
    }
}
