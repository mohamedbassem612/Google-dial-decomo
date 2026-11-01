package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akwj extends alad implements albi {
    public static final defpackage.akwj a;
    private int b;
    private defpackage.akwm c;

    static {
        defpackage.akwj akwjVar = new defpackage.akwj();
        a = akwjVar;
        alad.Q(defpackage.akwj.class, akwjVar);
    }

    private akwj() {
        albq albqVar = albq.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0002", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.akwj();
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
        return alad.M(defpackage.akwj.class);
    }
}
