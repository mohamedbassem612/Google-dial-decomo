package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aksc extends alad implements albi {
    public static final defpackage.aksc a;
    public int b;
    public long d;
    public long e;
    public java.lang.String c = "";
    public akzc f = akzc.d;

    static {
        defpackage.aksc akscVar = new defpackage.aksc();
        a = akscVar;
        alad.Q(defpackage.aksc.class, akscVar);
    }

    private aksc() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0000\u0003ဂ\u0001\u0004ဈ\u0000\u0005ဂ\u0002\u0006ည\u0003", new java.lang.Object[]{"b", "d", "c", "e", "f"});
        }
        if (i2 == 3) {
            return new defpackage.aksc();
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
        return alad.M(defpackage.aksc.class);
    }
}
