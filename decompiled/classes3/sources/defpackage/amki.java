package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amki extends alad implements albi {
    public static final defpackage.amki a;
    private int c;
    private byte d = 2;
    public java.lang.String b = "";

    static {
        defpackage.amki amkiVar = new defpackage.amki();
        a = amkiVar;
        alad.Q(defpackage.amki.class, amkiVar);
    }

    private amki() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new java.lang.Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new defpackage.amki();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.amki.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
