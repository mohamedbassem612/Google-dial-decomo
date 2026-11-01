package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amkl extends alaa implements alab {
    public static final defpackage.amkl a;
    public int b;
    public int c;
    public defpackage.amkn d;
    public amkj e;
    public long f;
    private defpackage.amkn g;
    private defpackage.amkn h;
    private defpackage.amkk i;
    private byte j = 2;

    static {
        defpackage.amkl amklVar = new defpackage.amkl();
        a = amklVar;
        alad.Q(defpackage.amkl.class, amklVar);
    }

    private amkl() {
        albq albqVar = albq.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.j);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0004\u0001᠌\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0005\nဉ\n\u000bဂ\r", new java.lang.Object[]{"b", "c", amjv.d, "d", "e", "g", "h", "i", "f"});
        }
        if (i2 == 3) {
            return new defpackage.amkl();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.amkl.class);
        }
        this.j = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
