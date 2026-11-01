package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class alfo extends alad implements albi {
    public static final defpackage.alfo a;
    public albe b = albe.a;

    static {
        defpackage.alfo alfoVar = new defpackage.alfo();
        a = alfoVar;
        alad.Q(defpackage.alfo.class, alfoVar);
    }

    private alfo() {
        albq albqVar = albq.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            alcr alcrVar = alcr.i;
            return new albr(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"b", new ajyk(alcrVar, "", alcrVar, "")});
        }
        if (i2 == 3) {
            return new defpackage.alfo();
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
        return alad.M(defpackage.alfo.class);
    }
}
