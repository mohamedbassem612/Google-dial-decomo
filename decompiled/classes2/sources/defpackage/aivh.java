package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aivh extends alad implements albi {
    public static final defpackage.aivh a;
    private byte b = 2;

    static {
        defpackage.aivh aivhVar = new defpackage.aivh();
        a = aivhVar;
        alad.Q(defpackage.aivh.class, aivhVar);
    }

    private aivh() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.b);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0000", (java.lang.Object[]) null);
        }
        if (i2 == 3) {
            return new defpackage.aivh();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.aivh.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
