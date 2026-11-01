package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajsx extends defpackage.alaa implements defpackage.alab {
    public static final defpackage.ajsx a;
    private byte b = 2;

    static {
        defpackage.ajsx ajsxVar = new defpackage.ajsx();
        a = ajsxVar;
        defpackage.alad.Q(defpackage.ajsx.class, ajsxVar);
    }

    private ajsx() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.b);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new defpackage.ajsx();
        }
        if (i2 == 4) {
            return new defpackage.akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.ajsx.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
