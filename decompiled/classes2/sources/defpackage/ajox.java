package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajox extends alad implements albi {
    public static final defpackage.ajox a;
    public int b;
    public int c;

    static {
        defpackage.ajox ajoxVar = new defpackage.ajox();
        a = ajoxVar;
        alad.Q(defpackage.ajox.class, ajoxVar);
    }

    private ajox() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.ajox();
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
        return alad.M(defpackage.ajox.class);
    }
}
