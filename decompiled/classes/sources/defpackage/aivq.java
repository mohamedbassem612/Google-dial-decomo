package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aivq extends defpackage.alad implements defpackage.albi {
    public static final defpackage.aivq a;
    public static final defpackage.apdi d;
    public int b;
    public defpackage.amjm c;
    private byte e = 2;

    static {
        defpackage.aivq aivqVar = new defpackage.aivq();
        a = aivqVar;
        defpackage.alad.Q(defpackage.aivq.class, aivqVar);
        d = defpackage.alad.W(aiuz.a, aivqVar, aivqVar, 120, defpackage.alcr.MESSAGE);
    }

    private aivq() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.aivq();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.aivq.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
