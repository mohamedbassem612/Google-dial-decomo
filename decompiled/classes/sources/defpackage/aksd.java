package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aksd extends defpackage.alad implements defpackage.albi {
    public static final defpackage.aksd a;

    static {
        defpackage.aksd aksdVar = new defpackage.aksd();
        a = aksdVar;
        defpackage.alad.Q(defpackage.aksd.class, aksdVar);
    }

    private aksd() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new defpackage.aksd();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.aksd.class);
        }
        return null;
    }
}
