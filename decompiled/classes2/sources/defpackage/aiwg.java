package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiwg extends alad implements albi {
    public static final defpackage.aiwg a;
    public int b;
    public int f;
    private byte g = 2;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public java.lang.String e = "";

    static {
        defpackage.aiwg aiwgVar = new defpackage.aiwg();
        a = aiwgVar;
        alad.Q(defpackage.aiwg.class, aiwgVar);
    }

    private aiwg() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0003\u0005ᔈ\u0000\u0006ᔈ\u0001\u0007ဈ\u0002\bᔄ\u0003", new java.lang.Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new defpackage.aiwg();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.aiwg.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
