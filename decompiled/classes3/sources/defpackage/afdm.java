package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afdm extends alad implements albi {
    public static final defpackage.afdm a;
    private albe b = albe.a;

    static {
        defpackage.afdm afdmVar = new defpackage.afdm();
        a = afdmVar;
        alad.Q(defpackage.afdm.class, afdmVar);
    }

    private afdm() {
        albq albqVar = albq.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            alcr alcrVar = alcr.i;
            return new albr(a, "\u0004\u0001\u0000\u0000\u000b\u000b\u0001\u0001\u0000\u0000\u000b2", new java.lang.Object[]{"b", new ajyk(alcrVar, "", alcrVar, "")});
        }
        if (i2 == 3) {
            return new defpackage.afdm();
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
        return alad.M(defpackage.afdm.class);
    }
}
