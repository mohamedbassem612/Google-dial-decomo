package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yer implements defpackage.yek, defpackage.yez, defpackage.yeq {
    private static final boolean a = android.util.Log.isLoggable("GlideRequest", 2);
    private java.lang.RuntimeException A;
    private int B;
    private final java.lang.String b;
    private final defpackage.ygk c;
    private final java.lang.Object d;
    private final defpackage.yeo e;
    private final defpackage.yem f;
    private final defpackage.xsk g;
    private final java.lang.Object h;
    private final java.lang.Class i;
    private final defpackage.yeh j;
    private final int k;
    private final int l;
    private final defpackage.xsm m;
    private final defpackage.yfa n;
    private final java.util.List o;
    private final defpackage.yfj p;
    private final java.util.concurrent.Executor q;
    private defpackage.xxe r;
    private defpackage.xwp s;
    private long t;
    private volatile defpackage.xwq u;
    private android.graphics.drawable.Drawable v;
    private android.graphics.drawable.Drawable w;
    private int x;
    private int y;
    private boolean z;

    public yer(defpackage.xsk xskVar, java.lang.Object obj, java.lang.Object obj2, java.lang.Class cls, defpackage.yeh yehVar, int i, int i2, defpackage.xsm xsmVar, defpackage.yfa yfaVar, defpackage.yeo yeoVar, java.util.List list, defpackage.yem yemVar, defpackage.xwq xwqVar, defpackage.yfj yfjVar, java.util.concurrent.Executor executor) {
        this.b = a ? java.lang.String.valueOf(java.lang.System.identityHashCode(this)) : null;
        this.c = new defpackage.ygk();
        this.d = obj;
        this.g = xskVar;
        this.h = obj2;
        this.i = cls;
        this.j = yehVar;
        this.k = i;
        this.l = i2;
        this.m = xsmVar;
        this.n = yfaVar;
        this.e = yeoVar;
        this.o = list;
        this.f = yemVar;
        this.u = xwqVar;
        this.p = yfjVar;
        this.q = executor;
        this.B = 1;
        if (this.A == null && xskVar.g.a(defpackage.xsa.class)) {
            this.A = new java.lang.RuntimeException("Glide request origin trace");
        }
    }

    private static int h(int i, float f) {
        if (i != Integer.MIN_VALUE) {
            return java.lang.Math.round(f * i);
        }
        return Integer.MIN_VALUE;
    }

    private final android.graphics.drawable.Drawable i() {
        android.graphics.drawable.Drawable drawable = this.w;
        if (drawable != null) {
            return drawable;
        }
        android.graphics.drawable.Drawable drawable2 = this.j.p;
        this.w = drawable2;
        return drawable2;
    }

    private final android.graphics.drawable.Drawable o() {
        android.graphics.drawable.Drawable drawable = this.v;
        if (drawable != null) {
            return drawable;
        }
        defpackage.yeh yehVar = this.j;
        android.graphics.drawable.Drawable drawable2 = yehVar.h;
        this.v = drawable2;
        if (drawable2 != null) {
            return drawable2;
        }
        int i = yehVar.i;
        return null;
    }

    private final void p() {
        if (this.z) {
            throw new java.lang.IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private final void q(java.lang.String str) {
        android.util.Log.v("GlideRequest", str + " this: " + this.b);
    }

    private final boolean r() {
        defpackage.yem yemVar = this.f;
        return yemVar == null || yemVar.h(this);
    }

    private final void s() {
        defpackage.yem yemVar = this.f;
        if (yemVar != null) {
            yemVar.a().j();
        }
    }

    @Override // defpackage.yeq
    public final java.lang.Object a() {
        this.c.a();
        return this.d;
    }

    @Override // defpackage.yek
    public final void b() {
        synchronized (this.d) {
            p();
            this.c.a();
            int i = defpackage.yfx.a;
            this.t = android.os.SystemClock.elapsedRealtimeNanos();
            if (this.h == null) {
                int i2 = this.k;
                int i3 = this.l;
                if (defpackage.ygc.l(i2, i3)) {
                    this.x = i2;
                    this.y = i3;
                }
                e(new defpackage.xxa("Received null model"), i() == null ? 5 : 3);
                return;
            }
            int i4 = this.B;
            if (i4 == 2) {
                throw new java.lang.IllegalArgumentException("Cannot restart a running request");
            }
            if (i4 == 4) {
                d(this.r, defpackage.xuc.e);
                return;
            }
            java.util.List<defpackage.yeo> list = this.o;
            if (list != null) {
                for (defpackage.yeo yeoVar : list) {
                    if (yeoVar instanceof defpackage.yej) {
                        throw null;
                    }
                }
            }
            this.B = 3;
            int i5 = this.k;
            int i6 = this.l;
            if (defpackage.ygc.l(i5, i6)) {
                g(i5, i6);
            } else {
                this.n.g(this);
            }
            int i7 = this.B;
            if ((i7 == 2 || i7 == 3) && r()) {
                this.n.h(o());
            }
            if (a) {
                q("finished run method in " + defpackage.yfx.a(this.t));
            }
        }
    }

    @Override // defpackage.yek
    public final void c() {
        synchronized (this.d) {
            p();
            defpackage.ygk ygkVar = this.c;
            ygkVar.a();
            if (this.B == 6) {
                return;
            }
            p();
            ygkVar.a();
            this.n.l(this);
            defpackage.xwp xwpVar = this.s;
            defpackage.xxe xxeVar = null;
            if (xwpVar != null) {
                synchronized (xwpVar.c) {
                    try {
                        xwpVar.a.g(xwpVar.b);
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                this.s = null;
            }
            defpackage.xxe xxeVar2 = this.r;
            if (xxeVar2 != null) {
                this.r = null;
                xxeVar = xxeVar2;
            }
            defpackage.yem yemVar = this.f;
            if (yemVar == null || yemVar.g(this)) {
                this.n.ei(o());
            }
            this.B = 6;
            if (xxeVar != null) {
                defpackage.xwq xwqVar = this.u;
                ((defpackage.xwy) xxeVar).f();
            }
        }
    }

    @Override // defpackage.yeq
    public final void d(defpackage.xxe xxeVar, defpackage.xuc xucVar) throws java.lang.Throwable {
        java.lang.Throwable th;
        boolean zE;
        this.c.a();
        defpackage.xxe xxeVar2 = null;
        try {
            try {
                synchronized (this.d) {
                    try {
                        this.s = null;
                        if (xxeVar == null) {
                            e(new defpackage.xxa("Expected to receive a Resource<R> with an object of " + java.lang.String.valueOf(this.i) + " inside, but instead got null."), 5);
                            return;
                        }
                        java.lang.Object objC = xxeVar.c();
                        if (objC == null || !this.i.isAssignableFrom(objC.getClass())) {
                            this.r = null;
                            e(new defpackage.xxa("Expected to receive an object of " + java.lang.String.valueOf(this.i) + " but instead got " + java.lang.String.valueOf(objC != null ? objC.getClass() : "") + '{' + java.lang.String.valueOf(objC) + "} inside Resource{" + xxeVar.toString() + "}." + (objC != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.")), 5);
                        } else {
                            defpackage.yem yemVar = this.f;
                            if (yemVar == null || yemVar.i(this)) {
                                s();
                                this.B = 4;
                                this.r = xxeVar;
                                if (this.g.e <= 3) {
                                    android.util.Log.d("Glide", "Finished loading " + objC.getClass().getSimpleName() + " from " + java.lang.String.valueOf(xucVar) + " for " + java.lang.String.valueOf(this.h) + " with size [" + this.x + 'x' + this.y + "] in " + defpackage.yfx.a(this.t) + " ms");
                                }
                                if (yemVar != null) {
                                    yemVar.e(this);
                                }
                                this.z = true;
                                try {
                                    java.util.List<defpackage.yeo> list = this.o;
                                    if (list != null) {
                                        zE = false;
                                        for (defpackage.yeo yeoVar : list) {
                                            zE |= yeoVar.e(objC, this.n, xucVar);
                                            if (yeoVar instanceof defpackage.yej) {
                                                zE |= ((defpackage.yej) yeoVar).a();
                                            }
                                        }
                                    } else {
                                        zE = false;
                                    }
                                    defpackage.yeo yeoVar2 = this.e;
                                    if (!(zE | (yeoVar2 != null && yeoVar2.e(objC, this.n, xucVar)))) {
                                        this.n.c(objC, this.p.a(xucVar));
                                    }
                                    this.z = false;
                                    return;
                                } catch (java.lang.Throwable th2) {
                                    this.z = false;
                                    throw th2;
                                }
                            }
                            this.r = null;
                            this.B = 4;
                        }
                        defpackage.xwq xwqVar = this.u;
                        ((defpackage.xwy) xxeVar).f();
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        xxeVar = null;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            xxeVar2 = xxeVar;
                            if (xxeVar2 == null) {
                                throw th;
                            }
                            defpackage.xwq xwqVar2 = this.u;
                            ((defpackage.xwy) xxeVar2).f();
                            throw th;
                        }
                    }
                }
                defpackage.xwq xwqVar3 = this.u;
                ((defpackage.xwy) xxeVar).f();
            } catch (java.lang.Throwable th5) {
                th = th5;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a5  */
    public final void e(defpackage.xxa xxaVar, int i) {
        boolean zD;
        boolean z;
        this.c.a();
        synchronized (this.d) {
            if (this.g.e <= i) {
                android.util.Log.w("Glide", "Load failed for [" + java.lang.String.valueOf(this.h) + "] with dimensions [" + this.x + 'x' + this.y + ']', xxaVar);
                java.util.List listA = xxaVar.a();
                int size = listA.size();
                int i2 = 0;
                while (i2 < size) {
                    int i3 = i2 + 1;
                    android.util.Log.i("Glide", a.bv((byte) 41, size, i3, "Root cause (", " of "), (java.lang.Throwable) listA.get(i2));
                    i2 = i3;
                }
            }
            android.graphics.drawable.Drawable drawableO = null;
            this.s = null;
            this.B = 5;
            defpackage.yem yemVar = this.f;
            if (yemVar != null) {
                yemVar.d(this);
            }
            this.z = true;
            try {
                java.util.List<defpackage.yeo> list = this.o;
                if (list != null) {
                    zD = false;
                    for (defpackage.yeo yeoVar : list) {
                        defpackage.yfa yfaVar = this.n;
                        s();
                        zD |= yeoVar.d(xxaVar, yfaVar);
                    }
                } else {
                    zD = false;
                }
                defpackage.yeo yeoVar2 = this.e;
                if (yeoVar2 != null) {
                    defpackage.yfa yfaVar2 = this.n;
                    s();
                    z = yeoVar2.d(xxaVar, yfaVar2);
                }
                if (!(zD | z) && r()) {
                    android.graphics.drawable.Drawable drawableI = this.h == null ? i() : null;
                    if (drawableI == null) {
                        defpackage.yeh yehVar = this.j;
                        android.graphics.drawable.Drawable drawable = yehVar.f;
                        int i4 = yehVar.g;
                    } else {
                        drawableO = drawableI;
                    }
                    if (drawableO == null) {
                        drawableO = o();
                    }
                    this.n.a(drawableO);
                }
                this.z = false;
            } catch (java.lang.Throwable th) {
                this.z = false;
                throw th;
            }
        }
    }

    @Override // defpackage.yek
    public final void f() {
        synchronized (this.d) {
            if (n()) {
                c();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0153 A[Catch: all -> 0x0231, TryCatch #0 {all -> 0x0231, blocks: (B:59:0x0153, B:61:0x015f, B:63:0x0164, B:64:0x0169, B:69:0x0201, B:65:0x0170, B:67:0x01f5, B:68:0x01fc, B:71:0x0203, B:26:0x00d1, B:29:0x00db, B:37:0x00f2, B:39:0x00fc, B:41:0x0107, B:43:0x010f, B:51:0x0131, B:53:0x0139, B:55:0x0143, B:57:0x014c, B:46:0x011d, B:48:0x0121, B:49:0x0126, B:32:0x00e5), top: B:90:0x00d1, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x015f A[Catch: all -> 0x0231, TryCatch #0 {all -> 0x0231, blocks: (B:59:0x0153, B:61:0x015f, B:63:0x0164, B:64:0x0169, B:69:0x0201, B:65:0x0170, B:67:0x01f5, B:68:0x01fc, B:71:0x0203, B:26:0x00d1, B:29:0x00db, B:37:0x00f2, B:39:0x00fc, B:41:0x0107, B:43:0x010f, B:51:0x0131, B:53:0x0139, B:55:0x0143, B:57:0x014c, B:46:0x011d, B:48:0x0121, B:49:0x0126, B:32:0x00e5), top: B:90:0x00d1, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164 A[Catch: all -> 0x0231, TryCatch #0 {all -> 0x0231, blocks: (B:59:0x0153, B:61:0x015f, B:63:0x0164, B:64:0x0169, B:69:0x0201, B:65:0x0170, B:67:0x01f5, B:68:0x01fc, B:71:0x0203, B:26:0x00d1, B:29:0x00db, B:37:0x00f2, B:39:0x00fc, B:41:0x0107, B:43:0x010f, B:51:0x0131, B:53:0x0139, B:55:0x0143, B:57:0x014c, B:46:0x011d, B:48:0x0121, B:49:0x0126, B:32:0x00e5), top: B:90:0x00d1, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0170 A[Catch: all -> 0x0231, TryCatch #0 {all -> 0x0231, blocks: (B:59:0x0153, B:61:0x015f, B:63:0x0164, B:64:0x0169, B:69:0x0201, B:65:0x0170, B:67:0x01f5, B:68:0x01fc, B:71:0x0203, B:26:0x00d1, B:29:0x00db, B:37:0x00f2, B:39:0x00fc, B:41:0x0107, B:43:0x010f, B:51:0x0131, B:53:0x0139, B:55:0x0143, B:57:0x014c, B:46:0x011d, B:48:0x0121, B:49:0x0126, B:32:0x00e5), top: B:90:0x00d1, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01f5 A[Catch: all -> 0x0231, TryCatch #0 {all -> 0x0231, blocks: (B:59:0x0153, B:61:0x015f, B:63:0x0164, B:64:0x0169, B:69:0x0201, B:65:0x0170, B:67:0x01f5, B:68:0x01fc, B:71:0x0203, B:26:0x00d1, B:29:0x00db, B:37:0x00f2, B:39:0x00fc, B:41:0x0107, B:43:0x010f, B:51:0x0131, B:53:0x0139, B:55:0x0143, B:57:0x014c, B:46:0x011d, B:48:0x0121, B:49:0x0126, B:32:0x00e5), top: B:90:0x00d1, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0203 A[Catch: all -> 0x0231, DONT_GENERATE, TRY_LEAVE, TryCatch #0 {all -> 0x0231, blocks: (B:59:0x0153, B:61:0x015f, B:63:0x0164, B:64:0x0169, B:69:0x0201, B:65:0x0170, B:67:0x01f5, B:68:0x01fc, B:71:0x0203, B:26:0x00d1, B:29:0x00db, B:37:0x00f2, B:39:0x00fc, B:41:0x0107, B:43:0x010f, B:51:0x0131, B:53:0x0139, B:55:0x0143, B:57:0x014c, B:46:0x011d, B:48:0x0121, B:49:0x0126, B:32:0x00e5), top: B:90:0x00d1, outer: #2 }] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v2, types: [dxz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v22, types: [dxz, java.lang.Object] */
    @Override // defpackage.yez
    public final void g(int i, int i2) throws java.lang.Throwable {
        java.lang.Object obj;
        long jElapsedRealtimeNanos;
        defpackage.xwy xwyVar;
        java.lang.Class cls;
        defpackage.xwp xwpVar;
        ?? r6;
        defpackage.xwu xwuVar;
        defpackage.yer yerVar = this;
        yerVar.c.a();
        java.lang.Object obj2 = yerVar.d;
        synchronized (obj2) {
            try {
                boolean z = a;
                if (z) {
                    yerVar.q("Got onSizeReady in " + defpackage.yfx.a(yerVar.t));
                }
                if (yerVar.B == 3) {
                    yerVar.B = 2;
                    defpackage.yeh yehVar = yerVar.j;
                    float f = yehVar.c;
                    yerVar.x = h(i, f);
                    yerVar.y = h(i2, f);
                    if (z) {
                        yerVar.q("finished setup for calling load in " + defpackage.yfx.a(yerVar.t));
                    }
                    defpackage.xwq xwqVar = yerVar.u;
                    defpackage.xsk xskVar = yerVar.g;
                    java.lang.Object obj3 = yerVar.h;
                    defpackage.xuo xuoVar = yehVar.m;
                    int i3 = yerVar.x;
                    int i4 = yerVar.y;
                    java.lang.Class cls2 = yehVar.s;
                    java.lang.Class cls3 = yerVar.i;
                    defpackage.xsm xsmVar = yerVar.m;
                    defpackage.xwm xwmVar = yehVar.d;
                    java.util.Map map = yehVar.r;
                    boolean z2 = yehVar.n;
                    boolean z3 = yehVar.v;
                    defpackage.xus xusVar = yehVar.q;
                    boolean z4 = yehVar.j;
                    boolean z5 = yehVar.w;
                    java.util.concurrent.Executor executor = yerVar.q;
                    boolean z6 = defpackage.xwq.a;
                    if (z6) {
                        int i5 = defpackage.yfx.a;
                        jElapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
                    } else {
                        jElapsedRealtimeNanos = 0;
                    }
                    obj = obj2;
                    long j = jElapsedRealtimeNanos;
                    try {
                        defpackage.xff xffVar = xwqVar.g;
                        defpackage.xww xwwVar = new defpackage.xww(obj3, xuoVar, i3, i4, map, cls2, cls3, xusVar);
                        xtq xtqVar = xskVar.g;
                        boolean zA = xtqVar.a(defpackage.xru.class);
                        synchronized (xwqVar) {
                            if (z4) {
                                try {
                                    defpackage.xvx xvxVar = xwqVar.c;
                                    defpackage.xwy xwyVarA = xvxVar.a(xwwVar);
                                    if (xwyVarA == null) {
                                        xwyVar = xwyVarA;
                                    } else {
                                        if (!zA) {
                                            xwyVarA.d();
                                        } else if (!xwyVarA.g()) {
                                            xwyVar = null;
                                        }
                                        xwyVar = xwyVarA;
                                    }
                                    if (xwyVar != null) {
                                        if (z6) {
                                            defpackage.xwq.a("Loaded resource from active resources", j, xwwVar);
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        cls = cls2;
                                        if (android.util.Log.isLoggable("GlideMemoryTracking", 3)) {
                                            defpackage.xwq.d("active", xwyVar);
                                        }
                                        i4 = i4;
                                    } else {
                                        cls = cls2;
                                        defpackage.xxe xxeVarB = xwqVar.d.b(xwwVar);
                                        if (xxeVarB == null) {
                                            xwyVar = null;
                                        } else {
                                            xwyVar = xxeVarB instanceof defpackage.xwy ? (defpackage.xwy) xxeVarB : new defpackage.xwy(xxeVarB, true, xwwVar, xwqVar);
                                        }
                                        if (xwyVar != null) {
                                            xwyVar.d();
                                            xvxVar.b(xwwVar, xwyVar);
                                            if (z6) {
                                                defpackage.xwq.a("Loaded resource from cache", j, xwwVar);
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            if (android.util.Log.isLoggable("GlideMemoryTracking", 3)) {
                                                defpackage.xwq.d("cache", xwyVar);
                                            }
                                        }
                                    }
                                    if (xwyVar == null) {
                                        r6 = xwqVar.h.a;
                                        xwuVar = (defpackage.xwu) r6.get(xwwVar);
                                        if (xwuVar != null) {
                                            xwuVar.c(yerVar, executor);
                                            if (z6) {
                                                defpackage.xwq.a("Added to existing load", j, xwwVar);
                                            }
                                            xwpVar = new defpackage.xwp(xwqVar, yerVar, xwuVar);
                                        } else {
                                            defpackage.xwu xwuVar2 = (defpackage.xwu) xwqVar.i.b.a();
                                            xwuVar2.i(xwwVar, z4, z5);
                                            akbx akbxVar = xwqVar.f;
                                            defpackage.xwf xwfVar = (defpackage.xwf) akbxVar.a.a();
                                            int i6 = akbxVar.b;
                                            akbxVar.b = i6 + 1;
                                            defpackage.xwd xwdVar = xwfVar.b;
                                            defpackage.xwo xwoVar = xwfVar.r;
                                            xwdVar.c = xskVar;
                                            xwdVar.d = obj3;
                                            xwdVar.m = xuoVar;
                                            xwdVar.e = i3;
                                            int i7 = i4;
                                            xwdVar.f = i7;
                                            xwdVar.o = xwmVar;
                                            xwdVar.g = cls;
                                            xwdVar.r = xwoVar;
                                            xwdVar.j = cls3;
                                            xwdVar.n = xsmVar;
                                            xwdVar.h = xusVar;
                                            xwdVar.i = map;
                                            xwdVar.p = z2;
                                            xwdVar.q = z3;
                                            xwfVar.d = xskVar;
                                            xwfVar.e = xuoVar;
                                            xwfVar.f = xsmVar;
                                            xwfVar.g = xwwVar;
                                            xwfVar.h = i3;
                                            xwfVar.i = i7;
                                            xwfVar.j = xwmVar;
                                            xwfVar.k = xusVar;
                                            xwfVar.s = xwuVar2;
                                            xwfVar.l = i6;
                                            xwfVar.q = 1;
                                            xwfVar.t = xtqVar;
                                            xwfVar.m = fh$.ExternalSyntheticApiModelOutline0.m(xusVar.b(defpackage.xwf.a));
                                            r6.put(xwwVar, xwuVar2);
                                            yerVar = this;
                                            xwuVar2.c(yerVar, executor);
                                            xwuVar2.h(xwfVar);
                                            if (z6) {
                                                defpackage.xwq.a("Started new load", j, xwwVar);
                                            }
                                            xwpVar = new defpackage.xwp(xwqVar, yerVar, xwuVar2);
                                        }
                                    } else {
                                        yerVar.d(xwyVar, defpackage.xuc.e);
                                        xwpVar = null;
                                    }
                                } catch (java.lang.Throwable th) {
                                    throw th;
                                }
                            } else {
                                xtqVar = xtqVar;
                                i4 = i4;
                                cls = cls2;
                            }
                            xwyVar = null;
                            if (xwyVar == null) {
                                r6 = xwqVar.h.a;
                                xwuVar = (defpackage.xwu) r6.get(xwwVar);
                                if (xwuVar != null) {
                                    xwuVar.c(yerVar, executor);
                                    if (z6) {
                                        defpackage.xwq.a("Added to existing load", j, xwwVar);
                                    }
                                    xwpVar = new defpackage.xwp(xwqVar, yerVar, xwuVar);
                                } else {
                                    defpackage.xwu xwuVar3 = (defpackage.xwu) xwqVar.i.b.a();
                                    xwuVar3.i(xwwVar, z4, z5);
                                    akbx akbxVar2 = xwqVar.f;
                                    defpackage.xwf xwfVar2 = (defpackage.xwf) akbxVar2.a.a();
                                    int i8 = akbxVar2.b;
                                    akbxVar2.b = i8 + 1;
                                    defpackage.xwd xwdVar2 = xwfVar2.b;
                                    defpackage.xwo xwoVar2 = xwfVar2.r;
                                    xwdVar2.c = xskVar;
                                    xwdVar2.d = obj3;
                                    xwdVar2.m = xuoVar;
                                    xwdVar2.e = i3;
                                    int i9 = i4;
                                    xwdVar2.f = i9;
                                    xwdVar2.o = xwmVar;
                                    xwdVar2.g = cls;
                                    xwdVar2.r = xwoVar2;
                                    xwdVar2.j = cls3;
                                    xwdVar2.n = xsmVar;
                                    xwdVar2.h = xusVar;
                                    xwdVar2.i = map;
                                    xwdVar2.p = z2;
                                    xwdVar2.q = z3;
                                    xwfVar2.d = xskVar;
                                    xwfVar2.e = xuoVar;
                                    xwfVar2.f = xsmVar;
                                    xwfVar2.g = xwwVar;
                                    xwfVar2.h = i3;
                                    xwfVar2.i = i9;
                                    xwfVar2.j = xwmVar;
                                    xwfVar2.k = xusVar;
                                    xwfVar2.s = xwuVar3;
                                    xwfVar2.l = i8;
                                    xwfVar2.q = 1;
                                    xwfVar2.t = xtqVar;
                                    xwfVar2.m = fh$.ExternalSyntheticApiModelOutline0.m(xusVar.b(defpackage.xwf.a));
                                    r6.put(xwwVar, xwuVar3);
                                    yerVar = this;
                                    xwuVar3.c(yerVar, executor);
                                    xwuVar3.h(xwfVar2);
                                    if (z6) {
                                        defpackage.xwq.a("Started new load", j, xwwVar);
                                    }
                                    xwpVar = new defpackage.xwp(xwqVar, yerVar, xwuVar3);
                                }
                            } else {
                                yerVar.d(xwyVar, defpackage.xuc.e);
                                xwpVar = null;
                            }
                        }
                        yerVar.s = xwpVar;
                        if (yerVar.B != 2) {
                            yerVar.s = null;
                        }
                        if (z) {
                            yerVar.q("finished onSizeReady in " + defpackage.yfx.a(yerVar.t));
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
    }

    @Override // defpackage.yek
    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = this.B == 4;
        }
        return z;
    }

    @Override // defpackage.yek
    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.B == 6;
        }
        return z;
    }

    @Override // defpackage.yek
    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = this.B == 4;
        }
        return z;
    }

    @Override // defpackage.yek
    public final boolean m(defpackage.yek yekVar) {
        int i;
        int i2;
        java.lang.Object obj;
        java.lang.Class cls;
        defpackage.yeh yehVar;
        defpackage.xsm xsmVar;
        int size;
        int i3;
        int i4;
        java.lang.Object obj2;
        java.lang.Class cls2;
        defpackage.yeh yehVar2;
        defpackage.xsm xsmVar2;
        int size2;
        if (!(yekVar instanceof defpackage.yer)) {
            return false;
        }
        synchronized (this.d) {
            i = this.k;
            i2 = this.l;
            obj = this.h;
            cls = this.i;
            yehVar = this.j;
            xsmVar = this.m;
            java.util.List list = this.o;
            size = list != null ? list.size() : 0;
        }
        defpackage.yer yerVar = (defpackage.yer) yekVar;
        synchronized (yerVar.d) {
            i3 = yerVar.k;
            i4 = yerVar.l;
            obj2 = yerVar.h;
            cls2 = yerVar.i;
            yehVar2 = yerVar.j;
            xsmVar2 = yerVar.m;
            java.util.List list2 = yerVar.o;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i != i3 || i2 != i4) {
            return false;
        }
        char[] cArr = defpackage.ygc.a;
        if (obj != null) {
            if (!(obj instanceof defpackage.xzm ? ((defpackage.xzm) obj).a() : obj.equals(obj2))) {
                return false;
            }
        } else if (obj2 != null) {
            return false;
        }
        if (!cls.equals(cls2)) {
            return false;
        }
        if (yehVar == null) {
            if (yehVar2 != null) {
                return false;
            }
        } else if (!yehVar.K(yehVar2)) {
            return false;
        }
        return xsmVar == xsmVar2 && size == size2;
    }

    @Override // defpackage.yek
    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            int i = this.B;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final java.lang.String toString() {
        java.lang.Object obj;
        java.lang.Class cls;
        synchronized (this.d) {
            obj = this.h;
            cls = this.i;
        }
        return super.toString() + "[model=" + java.lang.String.valueOf(obj) + ", transcodeClass=" + java.lang.String.valueOf(cls) + ']';
    }
}
