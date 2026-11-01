package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class almz extends alaa implements alab {
    public static final defpackage.almz a;
    public int b;
    public int c;
    public int d;
    private byte e = 2;

    static {
        defpackage.almz almzVar = new defpackage.almz();
        a = almzVar;
        alad.Q(defpackage.almz.class, almzVar);
    }

    private almz() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new java.lang.Object[]{"b", "c", defpackage.aleu.p, "d", defpackage.aloy.a});
        }
        if (i2 == 3) {
            return new defpackage.almz();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.almz.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
