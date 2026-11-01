package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akku extends alad implements albi {
    public static final defpackage.akku a;
    public akzc b;
    public akzc c;
    public int d;
    public akzc e;

    static {
        defpackage.akku akkuVar = new defpackage.akku();
        a = akkuVar;
        alad.Q(defpackage.akku.class, akkuVar);
    }

    private akku() {
        akzc akzcVar = akzc.d;
        this.b = akzcVar;
        this.c = akzcVar;
        this.e = akzcVar;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\n\u0002\n\u0003\f\u0006\n", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.akku();
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
        return alad.M(defpackage.akku.class);
    }
}
