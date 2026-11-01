package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeri extends defpackage.alad implements defpackage.albi {
    public static final defpackage.aeri a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public float f;
    private int g;

    static {
        defpackage.aeri aeriVar = new defpackage.aeri();
        a = aeriVar;
        defpackage.alad.Q(defpackage.aeri.class, aeriVar);
    }

    private aeri() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ခ\u0004", new java.lang.Object[]{"g", "b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new defpackage.aeri();
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
        return defpackage.alad.M(defpackage.aeri.class);
    }
}
