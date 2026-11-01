package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kfq extends defpackage.alad implements defpackage.albi {
    public static final defpackage.kfq a;
    public boolean b;

    static {
        defpackage.kfq kfqVar = new defpackage.kfq();
        a = kfqVar;
        defpackage.alad.Q(defpackage.kfq.class, kfqVar);
    }

    private kfq() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new java.lang.Object[]{"b"});
        }
        if (i2 == 3) {
            return new defpackage.kfq();
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
        return defpackage.alad.M(defpackage.kfq.class);
    }
}
