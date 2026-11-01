package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apge extends defpackage.alad implements defpackage.albi {
    public static final defpackage.apge a;
    private int b;
    private aiwf c;
    private byte d = 2;

    static {
        defpackage.apge apgeVar = new defpackage.apge();
        a = apgeVar;
        defpackage.alad.Q(defpackage.apge.class, apgeVar);
    }

    private apge() {
        defpackage.albq albqVar = defpackage.albq.a;
        defpackage.albd albdVar = defpackage.albd.a;
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0003", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.apge();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.apge.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
