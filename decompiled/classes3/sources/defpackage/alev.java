package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class alev extends alaa implements alab {
    public static final defpackage.alev a;
    public int b;
    public int d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public aldm j;
    public int m;
    private byte o = 2;
    public java.lang.String c = "";
    public alan k = albd.a;
    public java.lang.String l = "";

    static {
        defpackage.alev alevVar = new defpackage.alev();
        a = alevVar;
        alad.Q(defpackage.alev.class, alevVar);
    }

    private alev() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0002\u0003ဂ\u0003\u0004ဂ\u0004\u0006᠌\u0006\u0007᠌\u0007\t\u0014\u000bဈ\u000b\fင\u0001\rဉ\t\u000eင\f", new java.lang.Object[]{"b", "c", "e", "f", "g", "h", aleu.a, "i", akun.q, "k", "l", "d", "j", "m"});
        }
        if (i2 == 3) {
            return new defpackage.alev();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.alev.class);
        }
        this.o = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
