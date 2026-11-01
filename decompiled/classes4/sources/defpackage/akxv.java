package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akxv extends alad implements albi {
    public static final defpackage.akxv a;
    public int b;
    public defpackage.akwk c;
    public int e;
    private byte f = 2;
    public alak d = alae.a;

    static {
        defpackage.akxv akxvVar = new defpackage.akxv();
        a = akxvVar;
        alad.Q(defpackage.akxv.class, akxvVar);
    }

    private akxv() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0003\u0000\u0001\u0004\u000e\u0003\u0000\u0001\u0001\u0004ᐉ\u0000\b'\u000eဌ\u0001", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.akxv();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.akxv.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
