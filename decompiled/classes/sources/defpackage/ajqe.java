package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajqe extends defpackage.alad implements defpackage.albi {
    public static final defpackage.ajqe a;
    public int b;
    public int c;
    public ajqf d;

    static {
        defpackage.ajqe ajqeVar = new defpackage.ajqe();
        a = ajqeVar;
        defpackage.alad.Q(defpackage.ajqe.class, ajqeVar);
    }

    private ajqe() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.ajqe();
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
        return defpackage.alad.M(defpackage.ajqe.class);
    }
}
