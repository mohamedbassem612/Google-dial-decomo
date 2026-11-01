package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akfv extends alad implements albi {
    public static final defpackage.akfv a;
    public int b;
    public akzc c = akzc.d;
    public alak d;
    public alak e;

    static {
        defpackage.akfv akfvVar = new defpackage.akfv();
        a = akfvVar;
        alad.Q(defpackage.akfv.class, akfvVar);
    }

    private akfv() {
        alae alaeVar = alae.a;
        this.d = alaeVar;
        this.e = alaeVar;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0003\u0000\u0001\u0007\n\u0003\u0000\u0002\u0000\u0007ည\u0001\t\u0016\n\u0016", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.akfv();
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
        return alad.M(defpackage.akfv.class);
    }
}
