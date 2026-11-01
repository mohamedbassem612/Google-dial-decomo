package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amal extends alaa implements alab {
    public static final defpackage.amal a;
    private byte b = 2;

    static {
        defpackage.amal amalVar = new defpackage.amal();
        a = amalVar;
        alad.Q(defpackage.amal.class, amalVar);
    }

    private amal() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.b);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0000", (java.lang.Object[]) null);
        }
        if (i2 == 3) {
            return new defpackage.amal();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.amal.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
