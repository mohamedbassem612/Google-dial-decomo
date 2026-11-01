package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajqd extends alad implements albi {
    public static final defpackage.ajqd a;
    public int b;
    public alat c = albq.a;

    static {
        defpackage.ajqd ajqdVar = new defpackage.ajqd();
        a = ajqdVar;
        alad.Q(defpackage.ajqd.class, ajqdVar);
    }

    private ajqd() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new java.lang.Object[]{"b", "c", defpackage.ajqc.class});
        }
        if (i2 == 3) {
            return new defpackage.ajqd();
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
        return alad.M(defpackage.ajqd.class);
    }
}
