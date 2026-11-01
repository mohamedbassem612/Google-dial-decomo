package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akrx extends defpackage.alad implements defpackage.albi {
    public static final defpackage.akrx a;

    static {
        defpackage.akrx akrxVar = new defpackage.akrx();
        a = akrxVar;
        defpackage.alad.Q(defpackage.akrx.class, akrxVar);
    }

    private akrx() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new defpackage.akrx();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.akrx.class);
        }
        return null;
    }
}
