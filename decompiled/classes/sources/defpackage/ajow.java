package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajow extends defpackage.alad implements defpackage.albi {
    public static final defpackage.ajow a;
    public int b;
    public defpackage.akzc c = defpackage.akzc.d;

    static {
        defpackage.ajow ajowVar = new defpackage.ajow();
        a = ajowVar;
        defpackage.alad.Q(defpackage.ajow.class, ajowVar);
    }

    private ajow() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.ajow();
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
        return defpackage.alad.M(defpackage.ajow.class);
    }
}
