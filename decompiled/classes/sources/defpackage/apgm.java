package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apgm extends defpackage.alaa implements defpackage.alab {
    public static final defpackage.apgm a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public apgq j;
    public int l;
    public int m;
    public int o;
    public apgq p;
    private byte q = 2;
    public defpackage.alat k = defpackage.albq.a;

    static {
        defpackage.apgm apgmVar = new defpackage.apgm();
        a = apgmVar;
        defpackage.alad.Q(defpackage.apgm.class, apgmVar);
    }

    private apgm() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.q);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0006\u0005\u001b\u0006င\b\u0007င\u0002\bင\u0004\tင\u0005\nဉ\u0007\u000bင\t\fင\n\rဉ\u000b", new java.lang.Object[]{"b", "c", "d", "f", "i", "k", apgl.class, "l", "e", "g", "h", "j", "m", "o", "p"});
        }
        if (i2 == 3) {
            return new defpackage.apgm();
        }
        if (i2 == 4) {
            return new defpackage.akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.apgm.class);
        }
        this.q = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
