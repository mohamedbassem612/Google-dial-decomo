package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acba extends defpackage.alad implements defpackage.albi {
    public static final defpackage.acba a;
    public int b = 0;
    public java.lang.Object c;

    static {
        defpackage.acba acbaVar = new defpackage.acba();
        a = acbaVar;
        defpackage.alad.Q(defpackage.acba.class, acbaVar);
    }

    private acba() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new java.lang.Object[]{"c", "b", defpackage.akiq.class, defpackage.acbc.class});
        }
        if (i2 == 3) {
            return new defpackage.acba();
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
        return defpackage.alad.M(defpackage.acba.class);
    }
}
