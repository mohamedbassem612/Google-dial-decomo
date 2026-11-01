package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alqv extends alad implements albi {
    public static final defpackage.alqv a;
    public static final apdi f;
    public int b;
    public alqu c;
    public defpackage.amle d;
    public int e;
    private byte g = 2;

    static {
        defpackage.alqv alqvVar = new defpackage.alqv();
        a = alqvVar;
        alad.Q(defpackage.alqv.class, alqvVar);
        f = alad.W(defpackage.alro.a, alqvVar, alqvVar, 359077163, alcr.k);
    }

    private alqv() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003᠌\u0002", new java.lang.Object[]{"b", "c", "d", "e", defpackage.aloy.d});
        }
        if (i2 == 3) {
            return new defpackage.alqv();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.alqv.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
