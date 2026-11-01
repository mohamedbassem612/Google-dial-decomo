package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alea extends alad implements albi {
    public static final defpackage.alea a;

    static {
        defpackage.alea aleaVar = new defpackage.alea();
        a = aleaVar;
        alad.Q(defpackage.alea.class, aleaVar);
    }

    private alea() {
        albq albqVar = albq.a;
        alae alaeVar = alae.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0000", (java.lang.Object[]) null);
        }
        if (i2 == 3) {
            return new defpackage.alea();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.alea.class);
        }
        return null;
    }
}
