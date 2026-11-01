package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class xsx implements android.content.ComponentCallbacks2, defpackage.ydm {
    private static final defpackage.yep e;
    private static final defpackage.yep f;
    protected final defpackage.xrr a;
    protected final android.content.Context b;
    public final defpackage.ydl c;
    public final java.util.concurrent.CopyOnWriteArrayList d;
    private final defpackage.ydu g;
    private final defpackage.ydt h;
    private final defpackage.ydz i;
    private final java.lang.Runnable j;
    private final defpackage.ydj k;
    private defpackage.yep l;

    static {
        defpackage.yep yepVarA = defpackage.yep.a(android.graphics.Bitmap.class);
        yepVarA.Q();
        e = yepVarA;
        defpackage.yep.a(defpackage.ycv.class).Q();
        f = (defpackage.yep) ((defpackage.yep) defpackage.yep.b(defpackage.xwm.d).B(defpackage.xsm.d)).N();
    }

    public xsx(defpackage.xrr xrrVar, defpackage.ydl ydlVar, defpackage.ydt ydtVar, android.content.Context context) {
        defpackage.ydu yduVar = new defpackage.ydu();
        defpackage.xfh xfhVar = xrrVar.f;
        this.i = new defpackage.ydz();
        defpackage.vet vetVar = new defpackage.vet(this, 15);
        this.j = vetVar;
        this.a = xrrVar;
        this.c = ydlVar;
        this.h = ydtVar;
        this.g = yduVar;
        this.b = context;
        android.content.Context applicationContext = context.getApplicationContext();
        defpackage.xsw xswVar = new defpackage.xsw(this, yduVar);
        int iC = dvx.c(applicationContext, "android.permission.ACCESS_NETWORK_STATE");
        if (android.util.Log.isLoggable("ConnectivityMonitor", 3)) {
            android.util.Log.d("ConnectivityMonitor", iC == 0 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        defpackage.ydj ydkVar = iC == 0 ? new defpackage.ydk(applicationContext, xswVar) : new defpackage.ydp();
        this.k = ydkVar;
        synchronized (xrrVar.d) {
            if (xrrVar.d.contains(this)) {
                throw new java.lang.IllegalStateException("Cannot register already registered manager");
            }
            xrrVar.d.add(this);
        }
        if (defpackage.ygc.i()) {
            defpackage.ygc.h(vetVar);
        } else {
            ydlVar.a(this);
        }
        ydlVar.a(ydkVar);
        this.d = new java.util.concurrent.CopyOnWriteArrayList(xrrVar.c.b);
        o(xrrVar.c.b());
    }

    private final synchronized void r() {
        java.util.Set set = this.i.a;
        java.util.Iterator it = defpackage.ygc.e(set).iterator();
        while (it.hasNext()) {
            h((defpackage.yfa) it.next());
        }
        set.clear();
    }

    public defpackage.xsv a(java.lang.Class cls) {
        return new defpackage.xsv(this.a, this, cls, this.b);
    }

    public defpackage.xsv b() {
        return a(android.graphics.Bitmap.class).i(e);
    }

    public defpackage.xsv c() {
        return a(android.graphics.drawable.Drawable.class);
    }

    public defpackage.xsv d() {
        return a(java.io.File.class).i(f);
    }

    public defpackage.xsv e(android.net.Uri uri) {
        return c().e(uri);
    }

    public defpackage.xsv f(java.lang.Object obj) {
        return c().f(obj);
    }

    final synchronized defpackage.yep g() {
        return this.l;
    }

    public final void h(defpackage.yfa yfaVar) {
        if (yfaVar != null) {
            boolean zQ = q(yfaVar);
            defpackage.yek yekVarF = yfaVar.f();
            if (zQ) {
                return;
            }
            java.util.List list = this.a.d;
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((defpackage.xsx) it.next()).q(yfaVar)) {
                    }
                }
                if (yekVarF != null) {
                    yfaVar.m(null);
                    yekVarF.c();
                }
            }
        }
    }

    @Override // defpackage.ydm
    public final synchronized void i() {
        this.i.i();
        r();
        defpackage.ydu yduVar = this.g;
        java.util.Iterator it = defpackage.ygc.e(yduVar.a).iterator();
        while (it.hasNext()) {
            yduVar.a((defpackage.yek) it.next());
        }
        yduVar.b.clear();
        defpackage.ydl ydlVar = this.c;
        ydlVar.b(this);
        ydlVar.b(this.k);
        defpackage.ygc.d().removeCallbacks(this.j);
        java.util.List list = this.a.d;
        synchronized (list) {
            try {
                if (!list.contains(this)) {
                    throw new java.lang.IllegalStateException("Cannot unregister not yet registered manager");
                }
                list.remove(this);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ydm
    public final synchronized void j() {
        n();
        this.i.j();
    }

    @Override // defpackage.ydm
    public final synchronized void k() {
        this.i.k();
        m();
    }

    public final synchronized void l() {
        defpackage.ydu yduVar = this.g;
        yduVar.c = true;
        for (defpackage.yek yekVar : defpackage.ygc.e(yduVar.a)) {
            if (yekVar.n() || yekVar.l()) {
                yekVar.c();
                yduVar.b.add(yekVar);
            }
        }
    }

    public final synchronized void m() {
        defpackage.ydu yduVar = this.g;
        yduVar.c = true;
        for (defpackage.yek yekVar : defpackage.ygc.e(yduVar.a)) {
            if (yekVar.n()) {
                yekVar.f();
                yduVar.b.add(yekVar);
            }
        }
    }

    public final synchronized void n() {
        defpackage.ydu yduVar = this.g;
        yduVar.c = false;
        for (defpackage.yek yekVar : defpackage.ygc.e(yduVar.a)) {
            if (!yekVar.l() && !yekVar.n()) {
                yekVar.b();
            }
        }
        yduVar.b.clear();
    }

    protected synchronized void o(defpackage.yep yepVar) {
        this.l = (defpackage.yep) ((defpackage.yep) yepVar.j()).n();
    }

    final synchronized void p(defpackage.yfa yfaVar, defpackage.yek yekVar) {
        this.i.a.add(yfaVar);
        defpackage.ydu yduVar = this.g;
        yduVar.a.add(yekVar);
        if (!yduVar.c) {
            yekVar.b();
            return;
        }
        yekVar.c();
        if (android.util.Log.isLoggable("RequestTracker", 2)) {
            android.util.Log.v("RequestTracker", "Paused, delaying request");
        }
        yduVar.b.add(yekVar);
    }

    final synchronized boolean q(defpackage.yfa yfaVar) {
        defpackage.yek yekVarF = yfaVar.f();
        if (yekVarF == null) {
            return true;
        }
        if (!this.g.a(yekVarF)) {
            return false;
        }
        this.i.a.remove(yfaVar);
        yfaVar.m(null);
        return true;
    }

    public final synchronized java.lang.String toString() {
        defpackage.ydt ydtVar;
        defpackage.ydu yduVar;
        ydtVar = this.h;
        yduVar = this.g;
        return super.toString() + "{tracker=" + java.lang.String.valueOf(yduVar) + ", treeNode=" + java.lang.String.valueOf(ydtVar) + '}';
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
