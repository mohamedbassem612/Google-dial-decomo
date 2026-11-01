package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akzv extends alad implements albi {
    public static final defpackage.akzv a;
    public float b;

    static {
        defpackage.akzv akzvVar = new defpackage.akzv();
        a = akzvVar;
        alad.Q(defpackage.akzv.class, akzvVar);
    }

    private akzv() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new java.lang.Object[]{"b"});
        }
        if (i2 == 3) {
            return new defpackage.akzv();
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
        return alad.M(defpackage.akzv.class);
    }
}
