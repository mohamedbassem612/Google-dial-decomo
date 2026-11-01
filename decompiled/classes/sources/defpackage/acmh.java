package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acmh extends defpackage.alaa implements defpackage.alab {
    public static final defpackage.acmh a;
    public int b;
    public int c;
    private byte e = 2;
    public defpackage.alak d = defpackage.alae.a;

    static {
        defpackage.acmh acmhVar = new defpackage.acmh();
        a = acmhVar;
        defpackage.alad.Q(defpackage.acmh.class, acmhVar);
    }

    private acmh() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new java.lang.Object[]{"b", "c", defpackage.udi.t, "d"});
        }
        if (i2 == 3) {
            return new defpackage.acmh();
        }
        if (i2 == 4) {
            return new defpackage.akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.acmh.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
