package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aerp extends defpackage.alad implements defpackage.albi {
    public static final defpackage.aerp a;
    public int b;
    public int c;
    private int d;

    static {
        defpackage.aerp aerpVar = new defpackage.aerp();
        a = aerpVar;
        defpackage.alad.Q(defpackage.aerp.class, aerpVar);
    }

    private aerp() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new java.lang.Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.aerp();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return defpackage.alad.M(defpackage.aerp.class);
    }
}
