package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amjz extends alad implements albi {
    public static final defpackage.amjz a;
    private albe b;
    private albe c;
    private albe d;
    private albe e;

    static {
        defpackage.amjz amjzVar = new defpackage.amjz();
        a = amjzVar;
        alad.Q(defpackage.amjz.class, amjzVar);
    }

    private amjz() {
        albe albeVar = albe.a;
        this.b = albeVar;
        this.c = albeVar;
        this.d = albeVar;
        this.e = albeVar;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            alcr alcrVar = alcr.i;
            alcr alcrVar2 = alcr.c;
            return new albr(a, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0004\u0000\u0000\u00012\u00022\u00032\u00042", new java.lang.Object[]{"b", new ajyk(alcrVar, "", alcrVar2, 0L), "c", new ajyk(alcrVar, "", alcrVar2, 0L), "d", new ajyk(alcrVar, "", alcrVar2, 0L), "e", new ajyk(alcrVar, "", alcrVar2, 0L)});
        }
        if (i2 == 3) {
            return new defpackage.amjz();
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
        return alad.M(defpackage.amjz.class);
    }
}
