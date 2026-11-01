package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akds extends alad implements albi {
    public static final defpackage.akds a;
    public int b;
    public int c;

    static {
        defpackage.akds akdsVar = new defpackage.akds();
        a = akdsVar;
        alad.Q(defpackage.akds.class, akdsVar);
    }

    private akds() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006᠌\u0000", new java.lang.Object[]{"b", "c", akdr.a});
        }
        if (i2 == 3) {
            return new defpackage.akds();
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
        return alad.M(defpackage.akds.class);
    }
}
