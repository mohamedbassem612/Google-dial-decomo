package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiwh extends alad implements albi {
    public static final defpackage.aiwh a;
    public int b;
    public long e;
    private byte g = 2;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public alat f = albq.a;

    static {
        defpackage.aiwh aiwhVar = new defpackage.aiwh();
        a = aiwhVar;
        alad.Q(defpackage.aiwh.class, aiwhVar);
    }

    private aiwh() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004б", new java.lang.Object[]{"b", "c", "d", "e", "f", defpackage.aiwg.class});
        }
        if (i2 == 3) {
            return new defpackage.aiwh();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.aiwh.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
