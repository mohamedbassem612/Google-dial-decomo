package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aivj extends alaa implements alab {
    public static final defpackage.aivj a;
    public int b;
    public defpackage.aivl c;
    public int d;
    public defpackage.aivl e;
    public long f;
    public boolean g;
    private byte h = 2;

    static {
        defpackage.aivj aivjVar = new defpackage.aivj();
        a = aivjVar;
        alad.Q(defpackage.aivj.class, aivjVar);
    }

    private aivj() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002᠌\u0001\u0003ᐉ\u0002\u0004ဂ\u0004\u0006ဇ\u0005", new java.lang.Object[]{"b", "c", "d", agek.f, "e", "f", "g"});
        }
        if (i2 == 3) {
            return new defpackage.aivj();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.aivj.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
