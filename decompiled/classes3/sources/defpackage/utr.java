package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class utr extends alad implements albi {
    public static final defpackage.utr a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    static {
        defpackage.utr utrVar = new defpackage.utr();
        a = utrVar;
        alad.Q(defpackage.utr.class, utrVar);
    }

    private utr() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0003ဇ\u0002\u0004ဇ\u0003", new java.lang.Object[]{"b", "c", uzl.b, "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.utr();
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
        return alad.M(defpackage.utr.class);
    }
}
