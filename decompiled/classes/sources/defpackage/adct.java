package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adct extends defpackage.alad implements defpackage.albi {
    public static final defpackage.adct a;
    private defpackage.albe b = defpackage.albe.a;

    static {
        defpackage.adct adctVar = new defpackage.adct();
        a = adctVar;
        defpackage.alad.Q(defpackage.adct.class, adctVar);
    }

    private adct() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"b", new defpackage.ajyk(defpackage.alcr.STRING, "", defpackage.alcr.INT64, 0L)});
        }
        if (i2 == 3) {
            return new defpackage.adct();
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
        return defpackage.alad.M(defpackage.adct.class);
    }
}
