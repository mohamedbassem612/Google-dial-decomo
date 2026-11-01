package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amkh extends alaa implements alab {
    public static final defpackage.amkh a;
    public int b;
    public float d;
    public float e;
    private defpackage.amjy f;
    private defpackage.amjy g;
    private defpackage.amjy h;
    private defpackage.amjy i;
    private defpackage.amjw j;
    private byte k = 2;
    public java.lang.String c = "";

    static {
        defpackage.amkh amkhVar = new defpackage.amkh();
        a = amkhVar;
        alad.Q(defpackage.amkh.class, amkhVar);
    }

    private amkh() {
        albq albqVar = albq.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\b\u0000\u0001\u0001\u0015\b\u0000\u0000\u0005\u0001ဈ\u0000\u0002ခ\u0003\u0003ᐉ\u0007\u0004ᐉ\b\u0006ᐉ\u000b\nᐉ\u0006\u0014ခ\u0012\u0015ᐉ\t", new java.lang.Object[]{"b", "c", "d", "g", "h", "j", "f", "e", "i"});
        }
        if (i2 == 3) {
            return new defpackage.amkh();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.amkh.class);
        }
        this.k = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
