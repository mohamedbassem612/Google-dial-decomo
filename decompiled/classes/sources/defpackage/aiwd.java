package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiwd extends defpackage.alad implements defpackage.albi {
    public static final defpackage.aiwd a;
    public int b;
    public defpackage.aiwe c;
    public long d;
    private byte e = 2;

    static {
        defpackage.aiwd aiwdVar = new defpackage.aiwd();
        a = aiwdVar;
        defpackage.alad.Q(defpackage.aiwd.class, aiwdVar);
    }

    private aiwd() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.aiwd();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.aiwd.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
