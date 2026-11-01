package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class acvb extends alad implements albi {
    public static final defpackage.acvb a;
    public int b;
    public defpackage.acva c;
    public acux d;
    private byte e = 2;

    static {
        defpackage.acvb acvbVar = new defpackage.acvb();
        a = acvbVar;
        alad.Q(defpackage.acvb.class, acvbVar);
    }

    private acvb() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.acvb();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.acvb.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
