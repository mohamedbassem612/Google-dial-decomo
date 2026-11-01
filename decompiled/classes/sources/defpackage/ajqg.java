package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajqg extends defpackage.alad implements defpackage.albi {
    public static final defpackage.ajqg a;
    public int b;
    public int c;
    public ajqh d;

    static {
        defpackage.ajqg ajqgVar = new defpackage.ajqg();
        a = ajqgVar;
        defpackage.alad.Q(defpackage.ajqg.class, ajqgVar);
    }

    private ajqg() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.ajqg();
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
        return defpackage.alad.M(defpackage.ajqg.class);
    }
}
