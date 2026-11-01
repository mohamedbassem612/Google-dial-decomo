package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amlf extends alad implements albi {
    public static final defpackage.amlf a;
    private albe b;
    private albe c;

    static {
        defpackage.amlf amlfVar = new defpackage.amlf();
        a = amlfVar;
        alad.Q(defpackage.amlf.class, amlfVar);
    }

    private amlf() {
        albe albeVar = albe.a;
        this.b = albeVar;
        this.c = albeVar;
        albq albqVar = albq.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            alcr alcrVar = alcr.i;
            return new albr(a, "\u0001\u0002\u0000\u0000\u0006\u0007\u0002\u0002\u0000\u0000\u00062\u00072", new java.lang.Object[]{"b", new ajyk(alcrVar, "", alcr.b, java.lang.Float.valueOf(0.0f)), "c", new ajyk(alcrVar, "", alcr.k, defpackage.amlb.a)});
        }
        if (i2 == 3) {
            return new defpackage.amlf();
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
        return alad.M(defpackage.amlf.class);
    }
}
