package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amkm extends alad implements albi {
    public static final defpackage.amkm a;
    private int b;
    private amkh c;
    private byte d = 2;

    static {
        defpackage.amkm amkmVar = new defpackage.amkm();
        a = amkmVar;
        alad.Q(defpackage.amkm.class, amkmVar);
    }

    private amkm() {
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
            return new defpackage.amkm();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.amkm.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
