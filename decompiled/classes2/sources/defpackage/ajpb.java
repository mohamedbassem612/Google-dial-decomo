package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajpb extends alad implements albi {
    public static final defpackage.ajpb a;
    public int b;
    public int c;

    static {
        defpackage.ajpb ajpbVar = new defpackage.ajpb();
        a = ajpbVar;
        alad.Q(defpackage.ajpb.class, ajpbVar);
    }

    private ajpb() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.ajpb();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return alad.M(defpackage.ajpb.class);
    }
}
