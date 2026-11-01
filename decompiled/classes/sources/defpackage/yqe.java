package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class yqe extends defpackage.alad implements defpackage.albi {
    public static final defpackage.yqe a;
    private defpackage.albe b = defpackage.albe.a;

    static {
        defpackage.yqe yqeVar = new defpackage.yqe();
        a = yqeVar;
        defpackage.alad.Q(defpackage.yqe.class, yqeVar);
    }

    private yqe() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"b", new defpackage.ajyk(defpackage.alcr.INT32, 0, defpackage.alcr.MESSAGE, defpackage.yqf.a)});
        }
        if (i2 == 3) {
            return new defpackage.yqe();
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
        return defpackage.alad.M(defpackage.yqe.class);
    }
}
