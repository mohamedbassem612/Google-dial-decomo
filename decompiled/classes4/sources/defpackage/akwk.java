package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akwk extends alad implements albi {
    public static final defpackage.akwk a;
    public java.lang.Object c;
    public int b = 0;
    private byte d = 2;

    static {
        defpackage.akwk akwkVar = new defpackage.akwk();
        a = akwkVar;
        alad.Q(defpackage.akwk.class, akwkVar);
    }

    private akwk() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new albr(a, "\u0000\u0003\u0001\u0000\u0002\u0004\u0003\u0000\u0000\u0001\u0002<\u0000\u0003м\u0000\u0004<\u0000", new java.lang.Object[]{"c", "b", defpackage.akwj.class, defpackage.akwi.class, defpackage.akwh.class});
        }
        if (i2 == 3) {
            return new defpackage.akwk();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.akwk.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
