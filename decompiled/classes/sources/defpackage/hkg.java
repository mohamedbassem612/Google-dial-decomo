package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hkg implements defpackage.ahfa, defpackage.ahfd, defpackage.ahfj, defpackage.ahgj, defpackage.ahqb, defpackage.ahti, defpackage.amxb, defpackage.amxe, defpackage.amxx, defpackage.amyo {
    public final android.app.Activity a;
    public final him b;
    public final defpackage.amyz c;
    final defpackage.amyz d;
    final defpackage.amyz e;
    final defpackage.amyz f;
    final defpackage.amyz g;
    final defpackage.amyz h;
    final defpackage.amyz i;
    final defpackage.amyz j;
    final defpackage.amyz k;
    final defpackage.amyz l;
    final defpackage.amyz m;
    final defpackage.amyz n;
    final defpackage.amyz o;
    final defpackage.amyz p;
    final defpackage.amyz q;
    final defpackage.amyz r;
    final defpackage.amyz s;
    final defpackage.amyz t;
    final defpackage.amyz u;
    final defpackage.amyz v;
    private final defpackage.hkh w;
    private final defpackage.hkg x = this;

    public hkg(him himVar, defpackage.hkh hkhVar, android.app.Activity activity) {
        this.b = himVar;
        this.w = hkhVar;
        this.a = activity;
        this.c = defpackage.amzc.b(new defpackage.hhz(himVar, hkhVar, this, 0));
        this.d = defpackage.amzc.b(new defpackage.hhz(himVar, hkhVar, this, 2));
        defpackage.amyz amyzVar = defpackage.hka.a;
        this.e = defpackage.amyu.c(new defpackage.hhz(himVar, hkhVar, this, 1));
        this.f = defpackage.amyu.c(new defpackage.hhz(himVar, hkhVar, this, 3));
        this.g = new defpackage.hhz(himVar, hkhVar, this, 4);
        this.h = defpackage.amyu.c(new defpackage.hhz(himVar, hkhVar, this, 5));
        this.i = new defpackage.hhz(himVar, hkhVar, this, 6);
        this.j = defpackage.amzc.b(new defpackage.hhz(himVar, hkhVar, this, 8));
        this.k = defpackage.amyu.c(new defpackage.hhz(himVar, hkhVar, this, 7));
        this.l = defpackage.amyu.c(new defpackage.hhz(himVar, hkhVar, this, 10));
        this.m = defpackage.amyu.c(new defpackage.hhz(himVar, hkhVar, this, 9));
        this.n = defpackage.amyu.c(new defpackage.hhz(himVar, hkhVar, this, 11));
        this.o = defpackage.amyu.c(new defpackage.hhz(himVar, hkhVar, this, 12));
        this.p = defpackage.amyu.c(new defpackage.hhz(himVar, hkhVar, this, 13));
        this.q = new defpackage.hhz(himVar, hkhVar, this, 14);
        this.r = defpackage.amzc.b(new defpackage.hhz(himVar, hkhVar, this, 15));
        this.s = defpackage.amyu.c(new defpackage.hhz(himVar, hkhVar, this, 16));
        this.t = defpackage.amyu.c(new defpackage.hhz(himVar, hkhVar, this, 17));
        this.u = new defpackage.hhz(himVar, hkhVar, this, 18);
        this.v = defpackage.amyu.c(new defpackage.hhz(himVar, hkhVar, this, 19));
    }

    public final android.app.Activity a() {
        android.app.Activity activity = this.a;
        if (activity != null) {
            return activity;
        }
        throw new java.lang.IllegalStateException("Attempted use of the activity when it is null");
    }

    @Override // defpackage.ahti
    public final defpackage.ajwr b() {
        return this.b.a.cl();
    }

    @Override // defpackage.ahfj
    public final ahfp c() {
        return new ahfp((apjb) this.b.a.fW.a(), d(), (defpackage.ahgd) this.c.a());
    }

    public final defpackage.ahyn d() {
        return defpackage.ahyn.g(this.a);
    }

    public final java.lang.Object e() {
        return new defpackage.zjm(a(), (defpackage.tvn) this.b.fY());
    }

    @Override // defpackage.amxe
    public final java.util.Map f() {
        defpackage.aigb aigbVar = new defpackage.aigb(10);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        aigbVar.i("agmz", bool);
        aigbVar.i("jzu", bool);
        aigbVar.i("agyt", bool);
        aigbVar.i("agoi", bool);
        aigbVar.i("agtn", bool);
        aigbVar.i("afov", bool);
        aigbVar.i("ahaa", bool);
        aigbVar.i("afow", bool);
        aigbVar.i("jlq", bool);
        aigbVar.i("agyj", bool);
        return new defpackage.amyx(aigbVar.e(true));
    }

    @Override // defpackage.ahqe
    public final defpackage.ahpz fh() {
        return (defpackage.ahpz) this.b.bb.a();
    }

    @Override // defpackage.amxx
    public final defpackage.hjb g() {
        return new defpackage.hjb(this.b, this.w, this.x);
    }

    @Override // defpackage.amxe
    public final defpackage.hjo h() {
        return new defpackage.hjo(this.b, this.w);
    }

    @Override // defpackage.ahqe
    public final java.util.Set hu() {
        return defpackage.aikn.a;
    }

    @Override // defpackage.ahgj
    public final defpackage.aewl i() {
        return (defpackage.aewl) this.f.a();
    }

    @Override // defpackage.amxb
    public final defpackage.apni j() {
        return new defpackage.apni(f(), new defpackage.hjo(this.b, this.w));
    }

    @Override // defpackage.ahfa, defpackage.ahfd
    public final aljf k() {
        return (aljf) this.e.a();
    }
}
