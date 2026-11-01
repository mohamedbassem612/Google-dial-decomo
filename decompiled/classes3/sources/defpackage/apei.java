package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class apei extends alad implements albi {
    public static final defpackage.apei a;
    public int b;
    public int c;
    public long d;
    public apev g;
    public int h;
    public long i;
    public aper j;
    public long k;
    public long l;
    private byte m = 2;
    public java.lang.String e = "";
    public java.lang.String f = "";

    static {
        defpackage.apei apeiVar = new defpackage.apei();
        a = apeiVar;
        alad.Q(defpackage.apei.class, apeiVar);
    }

    private apei() {
        albq albqVar = albq.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            alai alaiVar = amub.e;
            return new albr(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001᠌\u0000\u0002᠌\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004\fဂ\t", new java.lang.Object[]{"b", "c", alaiVar, "h", alaiVar, "i", "j", "k", "d", "e", "f", "g", "l"});
        }
        if (i2 == 3) {
            return new defpackage.apei();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.apei.class);
        }
        this.m = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
