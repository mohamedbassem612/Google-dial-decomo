package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajpc extends defpackage.alad implements defpackage.albi {
    public static final defpackage.ajpc a;
    public int b;
    public defpackage.akzc c = defpackage.akzc.d;

    static {
        defpackage.ajpc ajpcVar = new defpackage.ajpc();
        a = ajpcVar;
        defpackage.alad.Q(defpackage.ajpc.class, ajpcVar);
    }

    private ajpc() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.ajpc();
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
        return defpackage.alad.M(defpackage.ajpc.class);
    }
}
