package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amuc extends defpackage.alaa implements defpackage.alab {
    public static final defpackage.amuc a;
    public int b;
    public alfq c;
    public int d;
    public akkp e;
    private byte f = 2;

    static {
        defpackage.amuc amucVar = new defpackage.amuc();
        a = amucVar;
        defpackage.alad.Q(defpackage.amuc.class, amucVar);
    }

    private amuc() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new java.lang.Object[]{"b", "c", "d", defpackage.amub.a, "e"});
        }
        if (i2 == 3) {
            return new defpackage.amuc();
        }
        if (i2 == 4) {
            return new defpackage.akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.amuc.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
