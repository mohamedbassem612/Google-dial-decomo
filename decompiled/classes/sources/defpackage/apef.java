package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apef extends defpackage.alad implements defpackage.albi {
    public static final defpackage.apef a;
    public int b;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public aped l;
    public defpackage.apev m;
    public apgy n;
    public aphb o;
    public alfl p;
    private byte r = 2;
    public java.lang.String c = "";
    public defpackage.alat q = defpackage.albq.a;

    static {
        defpackage.apef apefVar = new defpackage.apef();
        a = apefVar;
        defpackage.alad.Q(defpackage.apef.class, apefVar);
    }

    private apef() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.r);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0001\u0002\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005ဂ\u0004\u0006ဂ\u0006\u0007ဂ\u0007\bဇ\b\tဉ\t\nဂ\u0005\u000bᐉ\n\fᐉ\u000b\rဉ\f\u000eဉ\r\u000f\u001b", new java.lang.Object[]{"b", "c", "d", defpackage.amub.d, "e", "f", defpackage.amub.c, "g", "i", "j", "k", "l", "h", "m", "n", "o", "p", "q", apee.class});
        }
        if (i2 == 3) {
            return new defpackage.apef();
        }
        if (i2 == 4) {
            return new defpackage.akzx((boolean[][]) null, (byte[]) null);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.apef.class);
        }
        this.r = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final void b() {
        defpackage.alat alatVar = this.q;
        if (alatVar.c()) {
            return;
        }
        this.q = defpackage.alad.J(alatVar);
    }
}
