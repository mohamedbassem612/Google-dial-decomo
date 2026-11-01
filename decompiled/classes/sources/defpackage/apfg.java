package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apfg extends defpackage.alad implements defpackage.albi {
    public static final defpackage.apfg a;
    public int b;
    public long c;
    public int d;
    public defpackage.apfj f;
    private byte g = 2;
    public defpackage.alat e = defpackage.albq.a;

    static {
        defpackage.apfg apfgVar = new defpackage.apfg();
        a = apfgVar;
        defpackage.alad.Q(defpackage.apfg.class, apfgVar);
    }

    private apfg() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001စ\u0000\u0002Л\u0003᠌\u0001\u0006ဉ\u0004", new java.lang.Object[]{"b", "c", "e", apfh.class, "d", defpackage.amub.n, "f"});
        }
        if (i2 == 3) {
            return new defpackage.apfg();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.apfg.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
