package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiwe extends defpackage.alad implements defpackage.albi {
    public static final defpackage.aiwe a;
    public int b;
    public long c;
    public int d;
    public int e;
    private byte f = 2;

    static {
        defpackage.aiwe aiweVar = new defpackage.aiwe();
        a = aiweVar;
        defpackage.alad.Q(defpackage.aiwe.class, aiweVar);
    }

    private aiwe() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔆ\u0001\u0003ᔆ\u0002", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.aiwe();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.aiwe.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
