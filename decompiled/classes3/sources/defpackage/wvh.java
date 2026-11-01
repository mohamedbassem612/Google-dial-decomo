package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wvh extends alad implements albi {
    public static final defpackage.wvh a;
    public int b;
    public defpackage.wwf c;
    public long d;
    public long e;
    private byte f = 2;

    static {
        defpackage.wvh wvhVar = new defpackage.wvh();
        a = wvhVar;
        alad.Q(defpackage.wvh.class, wvhVar);
    }

    private wvh() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0003\u0000\u0001\u0006\t\u0003\u0000\u0000\u0001\u0006ᐉ\u0000\bဃ\u0001\tဃ\u0002", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.wvh();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.wvh.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
