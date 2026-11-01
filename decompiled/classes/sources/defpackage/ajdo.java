package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajdo extends defpackage.alad implements defpackage.albi {
    public static final defpackage.alal a = new defpackage.ypn(6);
    public static final defpackage.ajdo b;
    public defpackage.alak c = defpackage.alae.a;

    static {
        defpackage.ajdo ajdoVar = new defpackage.ajdo();
        b = ajdoVar;
        defpackage.alad.Q(defpackage.ajdo.class, ajdoVar);
    }

    private ajdo() {
        defpackage.akzc akzcVar = defpackage.akzc.d;
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new java.lang.Object[]{"c"});
        }
        if (i2 == 3) {
            return new defpackage.ajdo();
        }
        if (i2 == 4) {
            return new defpackage.akzx(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            return null;
        }
        return defpackage.alad.M(defpackage.ajdo.class);
    }
}
