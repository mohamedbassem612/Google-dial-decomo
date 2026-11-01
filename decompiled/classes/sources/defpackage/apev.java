package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apev extends defpackage.alaa implements defpackage.alab {
    public static final defpackage.apev a;
    private byte b = 2;

    static {
        defpackage.apev apevVar = new defpackage.apev();
        a = apevVar;
        defpackage.alad.Q(defpackage.apev.class, apevVar);
    }

    private apev() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.b);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new defpackage.apev();
        }
        if (i2 == 4) {
            return new defpackage.akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.apev.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
