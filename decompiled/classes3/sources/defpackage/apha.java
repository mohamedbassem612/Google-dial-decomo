package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class apha extends alad implements albi {
    public static final defpackage.apha a;
    public int b;
    public akzm d;
    public boolean e;
    private byte f = 2;
    public alat c = albq.a;

    static {
        defpackage.apha aphaVar = new defpackage.apha();
        a = aphaVar;
        alad.Q(defpackage.apha.class, aphaVar);
    }

    private apha() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003ဇ\u0001", new java.lang.Object[]{"b", "c", apgz.class, "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.apha();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.apha.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
