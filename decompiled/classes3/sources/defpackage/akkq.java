package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akkq extends alad implements albi {
    public static final defpackage.akkq a;
    public long b;

    static {
        defpackage.akkq akkqVar = new defpackage.akkq();
        a = akkqVar;
        alad.Q(defpackage.akkq.class, akkqVar);
    }

    private akkq() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new java.lang.Object[]{"b"});
        }
        if (i2 == 3) {
            return new defpackage.akkq();
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
        return alad.M(defpackage.akkq.class);
    }
}
