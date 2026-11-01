package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiwj extends alad implements albi {
    public static final defpackage.aiwj a;
    public int b;
    public defpackage.aiwh c;
    public int d;
    private byte f = 2;
    public alak e = alae.a;

    static {
        defpackage.aiwj aiwjVar = new defpackage.aiwj();
        a = aiwjVar;
        alad.Q(defpackage.aiwj.class, aiwjVar);
    }

    private aiwj() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003'", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.aiwj();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.aiwj.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
