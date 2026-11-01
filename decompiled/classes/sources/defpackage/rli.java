package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rli extends defpackage.alad implements defpackage.albi {
    public static final defpackage.rli a;
    public int b;
    public int f;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public java.lang.String e = "";
    public java.lang.String g = "";

    static {
        defpackage.rli rliVar = new defpackage.rli();
        a = rliVar;
        defpackage.alad.Q(defpackage.rli.class, rliVar);
    }

    private rli() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004င\u0003\u0005ለ\u0004", new java.lang.Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new defpackage.rli();
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
        return defpackage.alad.M(defpackage.rli.class);
    }
}
