package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajoi extends defpackage.alad implements defpackage.albi {
    public static final defpackage.ajoi a;
    public int b;
    public int c;
    public ajon d;
    public defpackage.ajpo e;

    static {
        defpackage.ajoi ajoiVar = new defpackage.ajoi();
        a = ajoiVar;
        defpackage.alad.Q(defpackage.ajoi.class, ajoiVar);
    }

    private ajoi() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.ajoi();
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
        return defpackage.alad.M(defpackage.ajoi.class);
    }
}
