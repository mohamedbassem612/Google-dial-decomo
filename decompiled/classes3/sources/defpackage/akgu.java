package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akgu extends alad implements albi {
    public static final defpackage.akgu a;
    public int b;
    public int c;
    public long d;
    public boolean f;
    public int i;
    private byte k = 2;
    public java.lang.String e = "";
    public int g = 1;
    public java.lang.String h = "";
    public java.lang.String j = "";

    static {
        defpackage.akgu akguVar = new defpackage.akgu();
        a = akguVar;
        alad.Q(defpackage.akgu.class, akguVar);
    }

    private akgu() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0002\u0001ᔄ\u0000\u0002ᔃ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0005\u0006᠌\u0006\u0007ဈ\u0007\bင\u0004", new java.lang.Object[]{"b", "c", "d", "e", "f", "h", "i", akdr.e, "j", "g"});
        }
        if (i2 == 3) {
            return new defpackage.akgu();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.akgu.class);
        }
        this.k = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
