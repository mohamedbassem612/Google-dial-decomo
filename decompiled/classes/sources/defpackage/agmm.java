package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agmm extends defpackage.alad implements defpackage.albi {
    public static final defpackage.agmm a;
    public boolean b;
    private int c;

    static {
        defpackage.agmm agmmVar = new defpackage.agmm();
        a = agmmVar;
        defpackage.alad.Q(defpackage.agmm.class, agmmVar);
    }

    private agmm() {
        defpackage.albq albqVar = defpackage.albq.a;
        defpackage.alae alaeVar = defpackage.alae.a;
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဇ\u0005", new java.lang.Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new defpackage.agmm();
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
        return defpackage.alad.M(defpackage.agmm.class);
    }
}
