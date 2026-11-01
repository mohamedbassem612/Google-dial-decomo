package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alnj extends alad implements albi {
    public static final defpackage.alnj a;
    public static final apdi f;
    public int b;
    public alqu c;
    public defpackage.amle d;
    public int e;
    private byte g = 2;

    static {
        defpackage.alnj alnjVar = new defpackage.alnj();
        a = alnjVar;
        alad.Q(defpackage.alnj.class, alnjVar);
        f = alad.W(defpackage.almz.a, alnjVar, alnjVar, 101, alcr.k);
    }

    private alnj() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0003ᐉ\u0002\u0004᠌\u0003", new java.lang.Object[]{"b", "c", "d", "e", defpackage.aloy.d});
        }
        if (i2 == 3) {
            return new defpackage.alnj();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.alnj.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
