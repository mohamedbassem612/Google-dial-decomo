package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wvi extends alad implements albi {
    public static final defpackage.wvi a;
    public int b;
    public long d;
    public long e;
    public long f;
    private byte h = 2;
    public alat c = albq.a;
    public java.lang.String g = "Unknown";

    static {
        defpackage.wvi wviVar = new defpackage.wvi();
        a = wviVar;
        alad.Q(defpackage.wvi.class, wviVar);
    }

    private wvi() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0001\u0001\u0002Л\u0003ဃ\u0001\u0004ဃ\u0002\u0006ဃ\u0003\bဈ\u0005", new java.lang.Object[]{"b", "c", defpackage.wvh.class, "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new defpackage.wvi();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.wvi.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
