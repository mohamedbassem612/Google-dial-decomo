package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ypy extends defpackage.alad implements defpackage.albi {
    public static final defpackage.ypy a;
    public defpackage.albe b = defpackage.albe.a;

    static {
        defpackage.ypy ypyVar = new defpackage.ypy();
        a = ypyVar;
        defpackage.alad.Q(defpackage.ypy.class, ypyVar);
    }

    private ypy() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            defpackage.alcr alcrVar = defpackage.alcr.STRING;
            return new defpackage.albr(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"b", new defpackage.ajyk(alcrVar, "", alcrVar, "")});
        }
        if (i2 == 3) {
            return new defpackage.ypy();
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
        return defpackage.alad.M(defpackage.ypy.class);
    }
}
