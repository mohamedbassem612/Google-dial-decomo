package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agql extends defpackage.alad implements defpackage.albi {
    public static final defpackage.agql a;
    private defpackage.albe b = defpackage.albe.a;

    static {
        defpackage.agql agqlVar = new defpackage.agql();
        a = agqlVar;
        defpackage.alad.Q(defpackage.agql.class, agqlVar);
    }

    private agql() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"b", new defpackage.ajyk(defpackage.alcr.STRING, "", defpackage.alcr.BOOL, java.lang.Boolean.FALSE)});
        }
        if (i2 == 3) {
            return new defpackage.agql();
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
        return defpackage.alad.M(defpackage.agql.class);
    }
}
