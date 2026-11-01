package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xju extends alad implements albi {
    public static final defpackage.xju a;
    private albe b = albe.a;

    static {
        defpackage.xju xjuVar = new defpackage.xju();
        a = xjuVar;
        alad.Q(defpackage.xju.class, xjuVar);
    }

    private xju() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            alcr alcrVar = alcr.i;
            return new albr(a, "\u0001\u0001\u0000\u0000\u0006\u0006\u0001\u0001\u0000\u0000\u00062", new java.lang.Object[]{"b", new ajyk(alcrVar, "", alcrVar, "")});
        }
        if (i2 == 3) {
            return new defpackage.xju();
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
        return alad.M(defpackage.xju.class);
    }
}
