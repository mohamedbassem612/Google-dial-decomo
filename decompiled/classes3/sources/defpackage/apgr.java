package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class apgr extends alad implements albi {
    public static final defpackage.apgr a;
    private int b;
    private apgi c;
    private byte d = 2;

    static {
        defpackage.apgr apgrVar = new defpackage.apgr();
        a = apgrVar;
        alad.Q(defpackage.apgr.class, apgrVar);
    }

    private apgr() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.apgr();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.apgr.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
