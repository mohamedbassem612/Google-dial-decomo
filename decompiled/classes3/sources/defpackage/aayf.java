package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aayf extends alad implements albi {
    public static final defpackage.aayf a;
    public int b;
    public double e;
    public float f;
    public long g;
    public int h;
    public int i;
    public boolean j;
    public alat k;
    public alat l;
    public alat m;
    public alan n;
    public alaj o;
    public long p;
    private byte q = 2;
    public akzc c = akzc.d;
    public java.lang.String d = "";

    static {
        defpackage.aayf aayfVar = new defpackage.aayf();
        a = aayfVar;
        alad.Q(defpackage.aayf.class, aayfVar);
    }

    private aayf() {
        albq albqVar = albq.a;
        this.k = albqVar;
        this.l = albqVar;
        this.m = albqVar;
        this.n = albd.a;
        this.o = akzu.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.q);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0002\u0001ည\u0000\u0002ဈ\u0001\u0003က\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဏ\u0006\bဇ\u0007\tЛ\nЛ\u000b\u001a\f\u0014\rဂ\b\u000e\u0013", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", defpackage.aayh.class, "l", defpackage.aayg.class, "m", "n", "p", "o"});
        }
        if (i2 == 3) {
            return new defpackage.aayf();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.aayf.class);
        }
        this.q = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
