package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ambm extends alaa implements alab {
    public static final defpackage.ambm a;
    public static final apdi b;
    private byte c = 2;

    static {
        defpackage.ambm ambmVar = new defpackage.ambm();
        a = ambmVar;
        alad.Q(defpackage.ambm.class, ambmVar);
        b = alad.W(defpackage.alsi.a, ambmVar, ambmVar, 111, alcr.k);
    }

    private ambm() {
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
            return new defpackage.ambm();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.ambm.class);
        }
        this.c = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
