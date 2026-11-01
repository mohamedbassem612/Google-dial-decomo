package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agoq extends defpackage.alaa implements defpackage.alab {
    public static final defpackage.agoq a;
    public int b;
    public boolean i;
    private byte k = 2;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public java.lang.String e = "";
    public java.lang.String f = "";
    public java.lang.String g = "";
    public java.lang.String h = "";
    public java.lang.String j = "";

    static {
        defpackage.agoq agoqVar = new defpackage.agoq();
        a = agoqVar;
        defpackage.alad.Q(defpackage.agoq.class, agoqVar);
    }

    private agoq() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0004\u0004ဈ\u0005\u0005ဇ\u0006\u0007ဈ\b\bဈ\u0002\tဈ\u0003", new java.lang.Object[]{"b", "c", "d", "g", "h", "i", "j", "e", "f"});
        }
        if (i2 == 3) {
            return new defpackage.agoq();
        }
        if (i2 == 4) {
            return new defpackage.akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.agoq.class);
        }
        this.k = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
