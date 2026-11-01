package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amjy extends alaa implements alab {
    public static final defpackage.amjy a;
    public float b;
    private int c;
    private float d;
    private float e;
    private float f;
    private byte g = 2;

    static {
        defpackage.amjy amjyVar = new defpackage.amjy();
        a = amjyVar;
        alad.Q(defpackage.amjy.class, amjyVar);
    }

    private amjy() {
        albq albqVar = albq.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔁ\u0003", new java.lang.Object[]{"c", "d", "e", "b", "f"});
        }
        if (i2 == 3) {
            return new defpackage.amjy();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.amjy.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
