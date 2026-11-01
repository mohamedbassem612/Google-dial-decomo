package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vbu extends defpackage.alad implements defpackage.albi {
    public static final defpackage.vbu a;
    public int b;
    public int c;
    public java.lang.String d = "";
    public boolean e;
    public defpackage.alat f;
    public defpackage.alat g;
    public java.lang.String h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public java.lang.String n;
    public boolean o;
    public boolean p;
    public boolean q;
    public java.lang.String r;
    public boolean s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public defpackage.alat y;
    public boolean z;

    static {
        defpackage.vbu vbuVar = new defpackage.vbu();
        a = vbuVar;
        defpackage.alad.Q(defpackage.vbu.class, vbuVar);
    }

    private vbu() {
        defpackage.albq albqVar = defpackage.albq.a;
        this.f = albqVar;
        this.g = albqVar;
        this.h = "";
        this.n = "";
        this.r = "";
        this.y = albqVar;
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0018\u0000\u0001\u0001\u0019\u0018\u0000\u0003\u0000\u0001င\u0000\u0002ለ\u0001\u0003ဇ\u0002\u0004Ț\u0005Ț\u0006ለ\u0003\u0007ဇ\u0005\tင\t\nለ\n\u000bဇ\u000b\fဇ\f\rဇ\r\u000eဇ\u0004\u000fለ\u000e\u0010ဇ\u000f\u0011င\u0011\u0012ဇ\u0014\u0013ဇ\u0012\u0014ဇ\u0013\u0015Ț\u0016ဌ\u0010\u0017ဇ\u0007\u0018ဇ\b\u0019ဇ\u0015", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h", "j", "m", "n", "o", "p", "q", "i", "r", "s", "u", "x", "v", "w", "y", "t", "k", "l", "z"});
        }
        if (i2 == 3) {
            return new defpackage.vbu();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return defpackage.alad.M(defpackage.vbu.class);
    }

    public final void b() {
        defpackage.alat alatVar = this.g;
        if (alatVar.c()) {
            return;
        }
        this.g = alatVar.d(alatVar.size() << 1);
    }

    public final void c() {
        defpackage.alat alatVar = this.f;
        if (alatVar.c()) {
            return;
        }
        this.f = alatVar.d(alatVar.size() << 1);
    }
}
