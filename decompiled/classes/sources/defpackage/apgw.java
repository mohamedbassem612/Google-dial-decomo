package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apgw extends defpackage.alad implements defpackage.albi {
    public static final defpackage.apgw a;
    public int b;
    public java.lang.Object d;
    public apha e;
    public int c = 0;
    private byte f = 2;

    static {
        defpackage.apgw apgwVar = new defpackage.apgw();
        a = apgwVar;
        defpackage.alad.Q(defpackage.apgw.class, apgwVar);
    }

    private apgw() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001<\u0000\u0002ᐉ\u0000\u0003м\u0000", new java.lang.Object[]{"d", "c", "b", defpackage.apfr.class, "e", defpackage.aphg.class});
        }
        if (i2 == 3) {
            return new defpackage.apgw();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.apgw.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
