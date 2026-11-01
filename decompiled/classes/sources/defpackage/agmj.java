package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agmj extends defpackage.alad implements defpackage.albi {
    public static final defpackage.agmj a;
    public int b = 1;
    private int c;

    static {
        defpackage.agmj agmjVar = new defpackage.agmj();
        a = agmjVar;
        defpackage.alad.Q(defpackage.agmj.class, agmjVar);
    }

    private agmj() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0003", new java.lang.Object[]{"c", "b", defpackage.udi.m});
        }
        if (i2 == 3) {
            return new defpackage.agmj();
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
        return defpackage.alad.M(defpackage.agmj.class);
    }
}
