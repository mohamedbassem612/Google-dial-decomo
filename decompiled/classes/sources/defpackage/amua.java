package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amua extends defpackage.alaa implements defpackage.alab {
    public static final defpackage.amua a;
    public int b;
    public long c;
    public long d;
    public int e;
    public defpackage.akzc f;
    public long g;
    public defpackage.akzc h;
    public boolean i;
    public java.lang.String j;
    public double k;
    public defpackage.amtz l;
    public defpackage.amuc m;
    private byte o = 2;

    static {
        defpackage.amua amuaVar = new defpackage.amua();
        a = amuaVar;
        defpackage.alad.Q(defpackage.amua.class, amuaVar);
    }

    private amua() {
        defpackage.albq albqVar = defpackage.albq.a;
        defpackage.akzc akzcVar = defpackage.akzc.d;
        defpackage.akzc akzcVar2 = defpackage.akzc.d;
        this.f = akzcVar2;
        this.g = 180000L;
        this.h = akzcVar2;
        defpackage.alae alaeVar = defpackage.alae.a;
        this.j = "";
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u000b\u0000\u0001\u0001#\u000b\u0000\u0000\u0001\u0001ဂ\u0000\u0006ည\u000b\u000bင\u0005\u000fတ\u0011\u0011ဂ\u0001\u0012ည\u0013\u0019ဇ\u0017\u001cဈ\u0018 က\u001a!ᐉ\u001c#ဉ\u001b", new java.lang.Object[]{"b", "c", "f", "e", "g", "d", "h", "i", "j", "k", "m", "l"});
        }
        if (i2 == 3) {
            return new defpackage.amua();
        }
        if (i2 == 4) {
            return new defpackage.akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.amua.class);
        }
        this.o = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
