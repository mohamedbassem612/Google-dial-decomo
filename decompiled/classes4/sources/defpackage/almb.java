package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class almb extends alaa implements alab {
    public static final defpackage.almb a;
    public int b;
    private byte o = 2;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public java.lang.String e = "";
    public java.lang.String f = "";
    public java.lang.String g = "";
    public java.lang.String h = "";
    public java.lang.String i = "";
    public java.lang.String j = "";
    public java.lang.String k = "";
    public java.lang.String l = "";
    public java.lang.String m = "";

    static {
        defpackage.almb almbVar = new defpackage.almb();
        a = almbVar;
        alad.Q(defpackage.almb.class, almbVar);
    }

    private almb() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        }
        if (i2 == 3) {
            return new defpackage.almb();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.almb.class);
        }
        this.o = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
