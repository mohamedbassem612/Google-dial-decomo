package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mhb extends defpackage.alad implements defpackage.albi {
    public static final defpackage.mhb a;
    public defpackage.albe b = defpackage.albe.a;

    static {
        defpackage.mhb mhbVar = new defpackage.mhb();
        a = mhbVar;
        defpackage.alad.Q(defpackage.mhb.class, mhbVar);
    }

    private mhb() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"b", new defpackage.ajyk(defpackage.alcr.STRING, "", defpackage.alcr.MESSAGE, defpackage.mhc.a)});
        }
        if (i2 == 3) {
            return new defpackage.mhb();
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
        return defpackage.alad.M(defpackage.mhb.class);
    }
}
