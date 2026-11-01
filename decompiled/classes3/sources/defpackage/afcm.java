package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afcm extends alaa implements alab {
    public static final defpackage.afcm a;
    public int b;
    public java.lang.Object d;
    public defpackage.afby e;
    public int f;
    public int c = 0;
    private byte g = 2;

    static {
        defpackage.afcm afcmVar = new defpackage.afcm();
        a = afcmVar;
        alad.Q(defpackage.afcm.class, afcmVar);
    }

    private afcm() {
        alae alaeVar = alae.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0006\u0001\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new java.lang.Object[]{"d", "c", "b", "e", "f", defpackage.amjv.f, defpackage.afcl.class, defpackage.afdn.class, defpackage.afbt.class, defpackage.afdj.class});
        }
        if (i2 == 3) {
            return new defpackage.afcm();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.afcm.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
