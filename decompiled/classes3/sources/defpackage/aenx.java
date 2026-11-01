package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aenx extends alad implements albi {
    public static final defpackage.aenx a;
    public int b;
    public alcf d;
    public int e;
    private byte f = 2;
    public alat c = albq.a;

    static {
        defpackage.aenx aenxVar = new defpackage.aenx();
        a = aenxVar;
        alad.Q(defpackage.aenx.class, aenxVar);
    }

    private aenx() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003᠌\u0001", new java.lang.Object[]{"b", "c", apgw.class, "d", "e", defpackage.acvt.j});
        }
        if (i2 == 3) {
            return new defpackage.aenx();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.aenx.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
