package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amlc extends alaa implements alab {
    public static final defpackage.amlc a;
    public defpackage.amlg c;
    private int d;
    private defpackage.amlf e;
    private byte f = 2;
    public alat b = albq.a;

    static {
        defpackage.amlc amlcVar = new defpackage.amlc();
        a = amlcVar;
        alad.Q(defpackage.amlc.class, amlcVar);
    }

    private amlc() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0000\u0001\u001a\u0004ဉ\u0003\u0005ဉ\u0004", new java.lang.Object[]{"d", "b", "c", "e"});
        }
        if (i2 == 3) {
            return new defpackage.amlc();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.amlc.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
