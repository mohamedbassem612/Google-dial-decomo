package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class alqz extends alad implements albi {
    public static final defpackage.alqz a;
    public static final apdi d;
    public int b;
    public defpackage.ahwi c;
    private byte e = 2;

    static {
        defpackage.alqz alqzVar = new defpackage.alqz();
        a = alqzVar;
        alad.Q(defpackage.alqz.class, alqzVar);
        d = alad.W(alro.a, alqzVar, alqzVar, 425635880, alcr.k);
    }

    private alqz() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.alqz();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.alqz.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
