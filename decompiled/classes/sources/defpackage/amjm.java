package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amjm extends defpackage.alaa implements defpackage.alab {
    public static final defpackage.amjm a;
    public int b;
    public defpackage.amjl c;
    public defpackage.akzm d;
    private byte e = 2;

    static {
        defpackage.amjm amjmVar = new defpackage.amjm();
        a = amjmVar;
        defpackage.alad.Q(defpackage.amjm.class, amjmVar);
    }

    private amjm() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0002\u0000\u0001\u0003\u0006\u0002\u0000\u0000\u0000\u0003ဉ\u0002\u0006ဉ\u0001", new java.lang.Object[]{"b", "d", "c"});
        }
        if (i2 == 3) {
            return new defpackage.amjm();
        }
        if (i2 == 4) {
            return new defpackage.akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.amjm.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
