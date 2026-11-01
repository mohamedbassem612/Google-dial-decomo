package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahtv extends defpackage.alaa implements defpackage.alab {
    public static final defpackage.ahtv a;
    public int b;
    public int c;
    private byte d = 2;

    static {
        defpackage.ahtv ahtvVar = new defpackage.ahtv();
        a = ahtvVar;
        defpackage.alad.Q(defpackage.ahtv.class, ahtvVar);
    }

    private ahtv() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003င\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.ahtv();
        }
        if (i2 == 4) {
            return new defpackage.akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.ahtv.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
