package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akwi extends alad implements albi {
    public static final defpackage.akwi a;
    private int b;
    private defpackage.akwm c;
    private byte d = 2;

    static {
        defpackage.akwi akwiVar = new defpackage.akwi();
        a = akwiVar;
        alad.Q(defpackage.akwi.class, akwiVar);
    }

    private akwi() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new albr(a, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0003", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.akwi();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.akwi.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
