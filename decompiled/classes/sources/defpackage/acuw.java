package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acuw extends defpackage.alaa implements defpackage.alab {
    public static final defpackage.acuw a;
    public int b;
    public long e;
    private byte h = 2;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public java.lang.String f = "";
    public defpackage.alat g = defpackage.albq.a;

    static {
        defpackage.acuw acuwVar = new defpackage.acuw();
        a = acuwVar;
        defpackage.alad.Q(defpackage.acuw.class, acuwVar);
    }

    private acuw() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0005\u0000\u0001\u0002\r\u0005\u0000\u0001\u0000\u0002ဈ\u0001\u0004ဂ\u0002\u0005ဈ\u0004\u0007ဈ\u0000\r\u001b", new java.lang.Object[]{"b", "d", "e", "f", "c", "g", defpackage.acuy.class});
        }
        if (i2 == 3) {
            return new defpackage.acuw();
        }
        if (i2 == 4) {
            return new defpackage.akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.acuw.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
