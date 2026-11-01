package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aazj extends defpackage.alad implements defpackage.albi {
    public static final defpackage.aazj a;
    public int b;
    public defpackage.akzm c;
    public defpackage.aazh d;

    static {
        defpackage.aazj aazjVar = new defpackage.aazj();
        a = aazjVar;
        defpackage.alad.Q(defpackage.aazj.class, aazjVar);
    }

    private aazj() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.aazj();
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
        return defpackage.alad.M(defpackage.aazj.class);
    }
}
