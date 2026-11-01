package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class twj extends alad implements albi {
    public static final defpackage.twj a;
    public java.lang.Object c;
    public int b = 0;
    private byte d = 2;

    static {
        defpackage.twj twjVar = new defpackage.twj();
        a = twjVar;
        alad.Q(defpackage.twj.class, twjVar);
    }

    private twj() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001;\u0000\u0002м\u0000", new java.lang.Object[]{"c", "b", amle.class});
        }
        if (i2 == 3) {
            return new defpackage.twj();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.twj.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
