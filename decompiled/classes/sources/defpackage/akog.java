package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akog extends defpackage.alad implements defpackage.albi {
    public static final defpackage.akog a;
    public defpackage.agml b;
    private int c;
    private byte d = 2;

    static {
        defpackage.akog akogVar = new defpackage.akog();
        a = akogVar;
        defpackage.alad.Q(defpackage.akog.class, akogVar);
    }

    private akog() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0001", new java.lang.Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new defpackage.akog();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.akog.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
