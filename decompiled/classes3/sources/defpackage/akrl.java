package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akrl extends alad implements albi {
    public static final defpackage.akrl a;
    public long d;
    private int e;
    private byte f = 2;
    public alat b = albq.a;
    public java.lang.String c = "";

    static {
        defpackage.akrl akrlVar = new defpackage.akrl();
        a = akrlVar;
        alad.Q(defpackage.akrl.class, akrlVar);
    }

    private akrl() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000\u0007ဂ\u0001", new java.lang.Object[]{"e", "b", akrk.class, "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.akrl();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.akrl.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
