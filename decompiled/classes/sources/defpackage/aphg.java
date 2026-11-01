package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aphg extends defpackage.alad implements defpackage.albi {
    public static final defpackage.aphg a;
    public int b;
    public long c;
    public defpackage.alat d;
    public defpackage.alcf e;
    public defpackage.akzm f;
    public aphe g;
    public int h;
    public boolean i;
    public defpackage.alat j;
    public defpackage.alat k;
    public float l;
    public defpackage.alat m;
    private byte n = 2;

    static {
        defpackage.aphg aphgVar = new defpackage.aphg();
        a = aphgVar;
        defpackage.alad.Q(defpackage.aphg.class, aphgVar);
    }

    private aphg() {
        defpackage.albq albqVar = defpackage.albq.a;
        this.d = albqVar;
        this.j = albqVar;
        this.k = albqVar;
        this.m = albqVar;
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u000b\u0000\u0001\u0001\r\u000b\u0000\u0004\u0001\u0001စ\u0000\u0003Л\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007᠌\u0004\bဇ\u0005\n\u001a\u000b\u001a\fခ\u0006\r\u001b", new java.lang.Object[]{"b", "c", "d", aphf.class, "e", "f", "g", "h", defpackage.apgx.d, "i", "j", "k", "l", "m", apes.class});
        }
        if (i2 == 3) {
            return new defpackage.aphg();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.aphg.class);
        }
        this.n = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
