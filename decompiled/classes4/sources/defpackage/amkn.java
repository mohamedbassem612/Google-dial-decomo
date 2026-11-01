package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amkn extends alaa implements alab {
    public static final defpackage.amkn a;
    public int b;
    public long c;
    public long d;
    private defpackage.amkm f;
    private byte g = 2;
    public alat e = albq.a;

    static {
        defpackage.amkn amknVar = new defpackage.amkn();
        a = amknVar;
        alad.Q(defpackage.amkn.class, amknVar);
    }

    private amkn() {
        akzc akzcVar = akzc.d;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0002\u0001ဂ\u0002\u0002ဂ\u0003\u0003Л\u0005ᐉ\u0004", new java.lang.Object[]{"b", "c", "d", "e", amkh.class, "f"});
        }
        if (i2 == 3) {
            return new defpackage.amkn();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.amkn.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
