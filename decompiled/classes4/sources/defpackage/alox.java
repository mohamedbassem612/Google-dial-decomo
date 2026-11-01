package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alox extends alaa implements alab {
    public static final defpackage.alox a;
    public static final apdi b;
    private byte c = 2;

    static {
        defpackage.alox aloxVar = new defpackage.alox();
        a = aloxVar;
        alad.Q(defpackage.alox.class, aloxVar);
        b = alad.W(defpackage.almz.a, aloxVar, aloxVar, 106, alcr.k);
    }

    private alox() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0000", (java.lang.Object[]) null);
        }
        if (i2 == 3) {
            return new defpackage.alox();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.alox.class);
        }
        this.c = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
