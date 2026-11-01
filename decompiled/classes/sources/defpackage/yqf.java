package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class yqf extends defpackage.alad implements defpackage.albi {
    public static final defpackage.yqf a;
    public defpackage.alat b = defpackage.albq.a;

    static {
        defpackage.yqf yqfVar = new defpackage.yqf();
        a = yqfVar;
        defpackage.alad.Q(defpackage.yqf.class, yqfVar);
    }

    private yqf() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"b", defpackage.yqb.class});
        }
        if (i2 == 3) {
            return new defpackage.yqf();
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
        return defpackage.alad.M(defpackage.yqf.class);
    }
}
