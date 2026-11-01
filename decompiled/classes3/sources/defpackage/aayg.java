package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aayg extends alad implements albi {
    public static final defpackage.aayg a;
    public int b;
    public defpackage.aayf d;
    private byte e = 2;
    public int c = 1;

    static {
        defpackage.aayg aaygVar = new defpackage.aayg();
        a = aaygVar;
        alad.Q(defpackage.aayg.class, aaygVar);
    }

    private aayg() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᴌ\u0000\u0002ᐉ\u0001", new java.lang.Object[]{"b", "c", defpackage.yrl.m, "d"});
        }
        if (i2 == 3) {
            return new defpackage.aayg();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.aayg.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
