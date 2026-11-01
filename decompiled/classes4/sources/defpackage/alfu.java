package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alfu extends alad implements albi {
    public static final defpackage.alfu a;
    public alat b = albq.a;

    static {
        defpackage.alfu alfuVar = new defpackage.alfu();
        a = alfuVar;
        alad.Q(defpackage.alfu.class, alfuVar);
    }

    private alfu() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"b", defpackage.alft.class});
        }
        if (i2 == 3) {
            return new defpackage.alfu();
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
        return alad.M(defpackage.alfu.class);
    }
}
