package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adfl extends defpackage.alad implements defpackage.albi {
    public static final defpackage.adfl a;
    public defpackage.akof b;
    public defpackage.adfk c;
    private int d;
    private byte e = 2;

    static {
        defpackage.adfl adflVar = new defpackage.adfl();
        a = adflVar;
        defpackage.alad.Q(defpackage.adfl.class, adflVar);
    }

    private adfl() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.adfl();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.adfl.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
