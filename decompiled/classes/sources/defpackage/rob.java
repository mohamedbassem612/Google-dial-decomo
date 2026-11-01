package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rob extends defpackage.alad implements defpackage.albi {
    public static final defpackage.rob a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;

    static {
        defpackage.rob robVar = new defpackage.rob();
        a = robVar;
        defpackage.alad.Q(defpackage.rob.class, robVar);
    }

    private rob() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0007\u0003င\u0000\u0004\u0007", new java.lang.Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new defpackage.rob();
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
        return defpackage.alad.M(defpackage.rob.class);
    }
}
