package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aivy extends alaa implements alab {
    public static final defpackage.aivy a;
    public int b;
    public int c;
    public int g;
    public alfd h;
    public int i;
    public defpackage.aivh k;
    private byte l = 2;
    public int d = -1;
    public alak e = alae.a;
    public java.lang.String f = "";
    public int j = -1;

    static {
        defpackage.aivy aivyVar = new defpackage.aivy();
        a = aivyVar;
        alad.Q(defpackage.aivy.class, aivyVar);
    }

    private aivy() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\t\u0000\u0001\u0001è\t\u0000\u0001\u0002\u0001င\u0000\u0003င\u0001\u0004\u0016\u0005ဈ\u0002\u0006᠌\u0005\u0007င\u0003\u000bᐉ\u0004\u0095င\bèᐉ\t", new java.lang.Object[]{"b", "c", "d", "e", "f", "i", udi.s, "g", "h", "j", "k"});
        }
        if (i2 == 3) {
            return new defpackage.aivy();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.aivy.class);
        }
        this.l = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
