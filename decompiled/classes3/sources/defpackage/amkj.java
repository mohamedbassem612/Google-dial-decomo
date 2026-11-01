package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amkj extends alad implements albi {
    public static final defpackage.amkj a;
    public int b;
    public defpackage.amjy d;
    private defpackage.amjy e;
    private defpackage.amjy f;
    private byte g = 2;
    public alat c = albq.a;

    static {
        defpackage.amkj amkjVar = new defpackage.amkj();
        a = amkjVar;
        alad.Q(defpackage.amkj.class, amkjVar);
    }

    private amkj() {
        akzc akzcVar = akzc.d;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0001\u0004\u0001Л\u0004ᐉ\u0003\u0005ᐉ\u0004\nᐉ\u0005", new java.lang.Object[]{"b", "c", defpackage.amki.class, "e", "d", "f"});
        }
        if (i2 == 3) {
            return new defpackage.amkj();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.amkj.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
