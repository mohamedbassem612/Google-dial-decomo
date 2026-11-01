package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apgs extends defpackage.alad implements defpackage.albi {
    public static final defpackage.apgs a;
    public int b;
    public int c;
    private apgr e;
    private byte f = 2;
    public int d = 1;

    static {
        defpackage.apgs apgsVar = new defpackage.apgs();
        a = apgsVar;
        defpackage.alad.Q(defpackage.apgs.class, apgsVar);
    }

    private apgs() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002င\u0001\u0003ᐉ\u0002", new java.lang.Object[]{"b", "c", defpackage.apgx.b, "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.apgs();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.apgs.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
