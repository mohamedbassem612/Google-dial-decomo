package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xwu implements defpackage.ygh {
    public final defpackage.xwx c;
    public final defpackage.xwv d;
    public defpackage.xuo e;
    public boolean f;
    public defpackage.xxe g;
    defpackage.xuc h;
    public boolean i;
    defpackage.xxa j;
    public boolean k;
    defpackage.xwy l;
    public volatile boolean m;
    private final dxz n;
    private final defpackage.xyn o;
    private final defpackage.xyn p;
    private final defpackage.xyn q;
    private boolean s;
    private defpackage.xwf t;
    final defpackage.xwt a = new defpackage.xwt(new java.util.ArrayList(2));
    public final defpackage.ygk b = new defpackage.ygk();
    private final java.util.concurrent.atomic.AtomicInteger r = new java.util.concurrent.atomic.AtomicInteger();

    public xwu(defpackage.xyn xynVar, defpackage.xyn xynVar2, defpackage.xyn xynVar3, defpackage.xwv xwvVar, defpackage.xwx xwxVar, dxz dxzVar) {
        this.o = xynVar;
        this.p = xynVar2;
        this.q = xynVar3;
        this.d = xwvVar;
        this.c = xwxVar;
        this.n = dxzVar;
    }

    private final boolean j() {
        return this.k || this.i || this.m;
    }

    public final defpackage.xyn b() {
        return this.s ? this.q : this.p;
    }

    public final synchronized void c(defpackage.yeq yeqVar, java.util.concurrent.Executor executor) {
        this.b.a();
        this.a.a.add(new defpackage.xws(yeqVar, executor));
        if (this.i) {
            e(1);
            executor.execute(new defpackage.xwr(this, yeqVar, 2, null));
        } else if (!this.k) {
            defpackage.xfh.s(!this.m, "Cannot add callbacks to a cancelled EngineJob");
        } else {
            e(1);
            executor.execute(new defpackage.xwr(this, yeqVar, 0));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    final void d() {
        defpackage.xwy xwyVar;
        synchronized (this) {
            this.b.a();
            defpackage.xfh.s(j(), "Not yet complete!");
            int iDecrementAndGet = this.r.decrementAndGet();
            defpackage.xfh.s((iDecrementAndGet ^ (-1)) >>> 31, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                xwyVar = this.l;
                f();
            } else {
                xwyVar = null;
            }
        }
        if (xwyVar != null) {
            xwyVar.f();
        }
    }

    final synchronized void e(int i) {
        defpackage.xwy xwyVar;
        defpackage.xfh.s(j(), "Not yet complete!");
        if (this.r.getAndAdd(i) == 0 && (xwyVar = this.l) != null) {
            xwyVar.d();
        }
    }

    @Override // defpackage.ygh
    public final defpackage.ygk ez() {
        return this.b;
    }

    public final synchronized void f() {
        if (this.e == null) {
            throw new java.lang.IllegalArgumentException();
        }
        this.a.a.clear();
        this.e = null;
        this.l = null;
        this.g = null;
        this.k = false;
        this.m = false;
        this.i = false;
        defpackage.xwf xwfVar = this.t;
        if (xwfVar.c.d()) {
            xwfVar.b();
        }
        this.t = null;
        this.j = null;
        this.h = null;
        this.n.b(this);
    }

    public final synchronized void g(defpackage.yeq yeqVar) {
        this.b.a();
        defpackage.xws xwsVar = new defpackage.xws(yeqVar, defpackage.yfu.b);
        defpackage.xwt xwtVar = this.a;
        xwtVar.a.remove(xwsVar);
        if (xwtVar.d()) {
            if (!j()) {
                this.m = true;
                defpackage.xwf xwfVar = this.t;
                xwfVar.p = true;
                defpackage.xwc xwcVar = xwfVar.o;
                if (xwcVar != null) {
                    xwcVar.a();
                }
                this.d.b(this, this.e);
            }
            if ((this.i || this.k) && this.r.get() == 0) {
                f();
            }
        }
    }

    public final synchronized void h(defpackage.xwf xwfVar) {
        this.t = xwfVar;
        int iF = xwfVar.f(1);
        ((iF == 2 || iF == 3) ? this.o : b()).execute(xwfVar);
    }

    public final synchronized void i(defpackage.xuo xuoVar, boolean z, boolean z2) {
        this.e = xuoVar;
        this.f = z;
        this.s = z2;
    }
}
