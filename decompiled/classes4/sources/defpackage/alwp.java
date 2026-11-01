package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alwp extends alaa implements alab {
    public static final defpackage.alwp a;
    public static final apdi b;
    private byte c = 2;

    static {
        defpackage.alwp alwpVar = new defpackage.alwp();
        a = alwpVar;
        alad.Q(defpackage.alwp.class, alwpVar);
        b = alad.W(defpackage.alsi.a, alwpVar, alwpVar, 106, alcr.k);
    }

    private alwp() {
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
            return new defpackage.alwp();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.alwp.class);
        }
        this.c = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
