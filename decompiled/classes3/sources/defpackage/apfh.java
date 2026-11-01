package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class apfh extends alaa implements alab {
    public static final defpackage.apfh a;
    public int b;
    public long d;
    private byte f = 2;
    public java.lang.String c = "";
    public java.lang.String e = "";

    static {
        defpackage.apfh apfhVar = new defpackage.apfh();
        a = apfhVar;
        alad.Q(defpackage.apfh.class, apfhVar);
    }

    private apfh() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0000\u0001ဈ\u0000\bစ\u0001\tဈ\u0002", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.apfh();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.apfh.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
