package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lcg extends alad implements albi {
    public static final defpackage.lcg a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    static {
        defpackage.lcg lcgVar = new defpackage.lcg();
        a = lcgVar;
        alad.Q(defpackage.lcg.class, lcgVar);
    }

    private lcg() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003᠌\u0002\u0004ဇ\u0003", new java.lang.Object[]{"b", "c", "d", "e", defpackage.jxq.l, "f"});
        }
        if (i2 == 3) {
            return new defpackage.lcg();
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
        return alad.M(defpackage.lcg.class);
    }
}
