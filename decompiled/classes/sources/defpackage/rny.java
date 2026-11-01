package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rny extends defpackage.alad implements defpackage.albi {
    public static final defpackage.rny a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    private int g;

    static {
        defpackage.rny rnyVar = new defpackage.rny();
        a = rnyVar;
        defpackage.alad.Q(defpackage.rny.class, rnyVar);
    }

    private rny() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004\u0004\u0004\u0005င\u0000", new java.lang.Object[]{"g", "b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new defpackage.rny();
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
        return defpackage.alad.M(defpackage.rny.class);
    }
}
