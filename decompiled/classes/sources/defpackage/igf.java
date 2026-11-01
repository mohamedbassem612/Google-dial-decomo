package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class igf extends defpackage.alad implements defpackage.albi {
    public static final defpackage.igf a;
    public int b;
    public int c;
    public defpackage.ige d;
    public defpackage.ifz e;
    public defpackage.igs f;
    public defpackage.igj g;
    private byte h = 2;

    static {
        defpackage.igf igfVar = new defpackage.igf();
        a = igfVar;
        defpackage.alad.Q(defpackage.igf.class, igfVar);
    }

    private igf() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001\u0004ᐉ\u0002\u0005ဉ\u0003", new java.lang.Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new defpackage.igf();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.igf.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
