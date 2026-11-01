package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alqk extends alaa implements alab {
    public static final defpackage.alqk a;
    public int b;
    public defpackage.alqj c;
    public boolean d;
    public boolean e;
    private byte f = 2;

    static {
        defpackage.alqk alqkVar = new defpackage.alqk();
        a = alqkVar;
        alad.Q(defpackage.alqk.class, alqkVar);
    }

    private alqk() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.alqk();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.alqk.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
