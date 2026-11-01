package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aiuy extends alad implements albi {
    public static final defpackage.aiuy a;
    public static final apdi c;
    private java.lang.Object d;
    public int b = 0;
    private byte e = 2;

    static {
        defpackage.aiuy aiuyVar = new defpackage.aiuy();
        a = aiuyVar;
        alad.Q(defpackage.aiuy.class, aiuyVar);
        c = alad.W(aivy.a, aiuyVar, aiuyVar, 772, alcr.k);
    }

    private aiuy() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001м\u0000\u0002м\u0000", new java.lang.Object[]{"d", "b", aiwd.class, aiwc.class});
        }
        if (i2 == 3) {
            return new defpackage.aiuy();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.aiuy.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
