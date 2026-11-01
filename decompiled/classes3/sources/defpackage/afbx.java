package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afbx extends alad implements albi {
    public static final defpackage.afbx a;
    private int c;
    private amlm d;
    private byte e = 2;
    public alat b = albq.a;

    static {
        defpackage.afbx afbxVar = new defpackage.afbx();
        a = afbxVar;
        alad.Q(defpackage.afbx.class, afbxVar);
    }

    private afbx() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001ᐉ\u0000\u0003\u001a", new java.lang.Object[]{"c", "d", "b"});
        }
        if (i2 == 3) {
            return new defpackage.afbx();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.afbx.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
