package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alsn extends alad implements albi {
    public static final defpackage.alsn a;
    public int b;
    public java.lang.String c = "";
    public defpackage.alsm d;

    static {
        defpackage.alsn alsnVar = new defpackage.alsn();
        a = alsnVar;
        alad.Q(defpackage.alsn.class, alsnVar);
    }

    private alsn() {
        albq albqVar = albq.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဉ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.alsn();
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
        return alad.M(defpackage.alsn.class);
    }
}
