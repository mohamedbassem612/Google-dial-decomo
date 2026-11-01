package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amak extends alad implements albi {
    public static final defpackage.amak a;
    public int b;
    public int c;
    public albe d;
    public albe e;

    static {
        defpackage.amak amakVar = new defpackage.amak();
        a = amakVar;
        alad.Q(defpackage.amak.class, amakVar);
    }

    private amak() {
        albe albeVar = albe.a;
        this.d = albeVar;
        this.e = albeVar;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            alcr alcrVar = alcr.i;
            alcr alcrVar2 = alcr.b;
            java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
            return new albr(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0002\u0000\u0000\u0001\u0004\u00022\u0003\u0004\u00042", new java.lang.Object[]{"b", "d", new ajyk(alcrVar, "", alcrVar2, fValueOf), "c", "e", new ajyk(alcrVar, "", alcrVar2, fValueOf)});
        }
        if (i2 == 3) {
            return new defpackage.amak();
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
        return alad.M(defpackage.amak.class);
    }
}
