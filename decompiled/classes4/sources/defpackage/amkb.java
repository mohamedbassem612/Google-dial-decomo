package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amkb extends alad implements albi {
    public static final defpackage.amkb a;
    private int b;
    private defpackage.amka c;

    static {
        defpackage.amkb amkbVar = new defpackage.amkb();
        a = amkbVar;
        alad.Q(defpackage.amkb.class, amkbVar);
    }

    private amkb() {
        akzc akzcVar = akzc.d;
        albq albqVar = albq.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0001\u0000\u0001HH\u0001\u0000\u0000\u0000Hဉ\u0006", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.amkb();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return alad.M(defpackage.amkb.class);
    }
}
