package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mse extends alad implements albi {
    public static final defpackage.mse a;
    public int b;
    public alat c;
    public alat d;
    public defpackage.msc e;
    public java.lang.String f;
    public int g;
    public int h;
    public int i;
    public defpackage.msd j;
    public boolean k;
    public boolean l;
    public int m;
    public alat n;
    public int o;
    public int p;
    public java.lang.String q;
    public alat r;
    public java.lang.String s;
    public alat t;
    public defpackage.msa u;
    public boolean v;
    private byte w = 2;

    static {
        defpackage.mse mseVar = new defpackage.mse();
        a = mseVar;
        alad.Q(defpackage.mse.class, mseVar);
    }

    private mse() {
        albq albqVar = albq.a;
        this.c = albqVar;
        this.d = albqVar;
        this.f = "";
        this.n = albqVar;
        this.q = "";
        this.r = albqVar;
        this.s = "";
        this.t = albqVar;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.w);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0014\u0000\u0001\u0001\u0016\u0014\u0000\u0005\u0001\u0001\u001b\u0002Л\u0005ဉ\u0000\u0006ဈ\u0001\u0007᠌\u0002\b᠌\u0003\t᠌\u0004\nဉ\u0005\u000bဇ\u0006\fဇ\u0007\r᠌\b\u000e\u001a\u000f᠌\t\u0010င\n\u0011ဈ\u000b\u0012\u001a\u0013ဈ\f\u0014\u001b\u0015ဉ\r\u0016ဇ\u000e", new java.lang.Object[]{"b", "c", defpackage.msb.class, "d", defpackage.mmz.class, "e", "f", "g", defpackage.llm.h, "h", defpackage.llm.p, "i", defpackage.llm.l, "j", "k", "l", "m", defpackage.llm.k, "n", "o", defpackage.llm.o, "p", "q", "r", "s", "t", tvx.class, "u", "v"});
        }
        if (i2 == 3) {
            return new defpackage.mse();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.mse.class);
        }
        this.w = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
