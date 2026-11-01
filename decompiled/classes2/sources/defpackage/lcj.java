package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lcj extends alad implements albi {
    public static final defpackage.lcj a;
    public int b;
    public java.lang.String c;

    static {
        defpackage.lcj lcjVar = new defpackage.lcj();
        a = lcjVar;
        alad.Q(defpackage.lcj.class, lcjVar);
    }

    private lcj() {
        akzc akzcVar = akzc.d;
        this.c = "";
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဈ\u0004", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.lcj();
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
        return alad.M(defpackage.lcj.class);
    }
}
