package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiwc extends defpackage.alad implements defpackage.albi {
    public static final defpackage.aiwc a;
    public int b;
    public int d;
    public defpackage.aiwd e;
    private byte f = 2;
    public int c = -1;

    static {
        defpackage.aiwc aiwcVar = new defpackage.aiwc();
        a = aiwcVar;
        defpackage.alad.Q(defpackage.aiwc.class, aiwcVar);
    }

    private aiwc() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0003\u0000\u0001\u0001\r\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0003\rᐉ\u000b", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.aiwc();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.aiwc.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
