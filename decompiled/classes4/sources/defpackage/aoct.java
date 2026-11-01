package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoct extends defpackage.anqk implements annr {
    public static final java.util.logging.Logger b = java.util.logging.Logger.getLogger(defpackage.aoct.class.getName());
    public static final defpackage.aocy c = new defpackage.aocn();
    public java.util.concurrent.Executor d;
    public final defpackage.anxw e;
    public final defpackage.anni f;
    public final java.util.List g;
    public final defpackage.anqn[] h;
    public final long i;
    public anqw j;
    public boolean k;
    public boolean m;
    public final defpackage.anmv o;
    public final anmy p;
    public final anno q;
    public final anve r;
    public final ajsz s;
    private final anns t;
    private final aoag u;
    private boolean v;
    private boolean w;
    private boolean x;
    private final defpackage.anxx y;
    public final java.lang.Object l = new java.lang.Object();
    public final java.util.Set n = new java.util.HashSet();

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    public aoct(defpackage.aocv aocvVar, defpackage.anxx anxxVar, defpackage.anmv anmvVar) {
        java.util.List listUnmodifiableList;
        aoag aoagVar = aocvVar.i;
        ahvr.cj(aoagVar, "executorPool");
        this.u = aoagVar;
        vqf vqfVar = aocvVar.s;
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = ((java.util.HashMap) vqfVar.a).values().iterator();
        while (it.hasNext()) {
            for (defpackage.apjb apjbVar : ((defpackage.apjb) it.next()).b.values()) {
                map.put(((defpackage.anpk) apjbVar.a).b, apjbVar);
            }
        }
        j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(((java.util.HashMap) vqfVar.a).values()));
        this.e = new defpackage.anxw(j$.util.DesugarCollections.unmodifiableMap(map));
        defpackage.anni anniVar = aocvVar.h;
        ahvr.cj(anniVar, "fallbackRegistry");
        this.f = anniVar;
        this.y = anxxVar;
        synchronized (this.l) {
            listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(aify.p(((defpackage.ansc) anxxVar).b));
        }
        this.t = anns.b("Server", java.lang.String.valueOf(listUnmodifiableList));
        ahvr.cj(anmvVar, "rootContext");
        this.o = new defpackage.anmv(anmvVar.f, anmvVar.g + 1).l(defpackage.annv.a, this);
        this.p = aocvVar.j;
        this.g = j$.util.DesugarCollections.unmodifiableList(new java.util.ArrayList(aocvVar.d));
        java.util.List list = aocvVar.e;
        this.h = (defpackage.anqn[]) list.toArray(new defpackage.anqn[list.size()]);
        this.i = aocvVar.l;
        anno annoVar = aocvVar.q;
        this.q = annoVar;
        this.r = new anve(aodo.a);
        ajsz ajszVar = aocvVar.t;
        ahvr.cj(ajszVar, "ticker");
        this.s = ajszVar;
        anno.b(annoVar.c, this);
    }

    @Override // defpackage.anqk
    public final /* bridge */ /* synthetic */ void a() {
        synchronized (this.l) {
            if (!this.w) {
                this.w = true;
                boolean z = this.v;
                if (!z) {
                    this.m = true;
                    d();
                }
                if (z) {
                    this.y.c();
                }
            }
        }
        anqw anqwVarF = anqw.l.f("Server shutdownNow invoked");
        synchronized (this.l) {
            if (this.j != null) {
                return;
            }
            this.j = anqwVarF;
            java.util.ArrayList arrayList = new java.util.ArrayList(this.n);
            boolean z2 = this.k;
            if (z2) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((defpackage.ansd) arrayList.get(i)).f(anqwVarF);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.anqk
    public final /* bridge */ /* synthetic */ void b() {
        synchronized (this.l) {
            ahvr.bZ(!this.v, "Already started");
            ahvr.bZ(!this.w, "Shutting down");
            this.y.d(new defpackage.aoco(this));
            ?? A = this.u.a();
            ahvr.cj((java.lang.Object) A, "executor");
            this.d = A;
            this.v = true;
        }
    }

    public final anns c() {
        return this.t;
    }

    public final void d() {
        java.lang.Object obj = this.l;
        synchronized (obj) {
            if (this.w && this.n.isEmpty() && this.m) {
                if (this.x) {
                    throw new java.lang.AssertionError("Server already terminated");
                }
                this.x = true;
                anno annoVar = this.q;
                anno.c(annoVar.c, this);
                java.util.concurrent.Executor executor = this.d;
                if (executor != null) {
                    this.u.b(executor);
                    this.d = null;
                }
                obj.notifyAll();
            }
        }
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.f("logId", this.t.b);
        ahymVarL.b("transportServer", this.y);
        return ahymVarL.toString();
    }
}
