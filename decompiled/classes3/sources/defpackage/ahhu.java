package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahhu implements defpackage.xvb, defpackage.xva {
    public final defpackage.xzg a;
    public final int b;
    public final int c;
    public final defpackage.xus d;
    public final java.util.concurrent.atomic.AtomicBoolean e;
    public final java.lang.Object f;
    public defpackage.xvb g;
    public defpackage.xsm h;
    public final /* synthetic */ defpackage.ahhv i;
    private final com.google.apps.tiktok.account.AccountId j;
    private final java.util.concurrent.atomic.AtomicBoolean k;
    private final java.lang.Object l;
    private ajcq m;
    private defpackage.xva n;

    public ahhu(defpackage.ahhv ahhvVar, defpackage.xzg xzgVar, int i, int i2, defpackage.xus xusVar) {
        j$.util.Objects.requireNonNull(ahhvVar);
        this.i = ahhvVar;
        this.e = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.k = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.l = new java.lang.Object();
        this.f = new java.lang.Object();
        this.a = xzgVar;
        this.b = i;
        this.c = i2;
        this.d = xusVar;
        this.j = (com.google.apps.tiktok.account.AccountId) xusVar.b(defpackage.agqz.a);
    }

    private final void h(ajcq ajcqVar) {
        synchronized (this.l) {
            this.m = ajcqVar;
        }
        ahvr.J(ajcqVar, new defpackage.uwo(this, 14), this.i.d);
    }

    @Override // defpackage.xvb
    public final java.lang.Class a() {
        return java.io.InputStream.class;
    }

    @Override // defpackage.xva
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        this.n.c((java.io.InputStream) obj);
    }

    @Override // defpackage.xvb
    public final void d() {
        defpackage.xvb xvbVar;
        this.e.set(true);
        synchronized (this.l) {
            ajcq ajcqVar = this.m;
            if (ajcqVar != null) {
                ajcqVar.cancel(false);
            }
        }
        synchronized (this.f) {
            xvbVar = this.g;
        }
        if (xvbVar != null) {
            xvbVar.d();
        }
    }

    @Override // defpackage.xvb
    public final void e() {
        defpackage.xvb xvbVar;
        synchronized (this.f) {
            xvbVar = this.g;
            this.g = null;
        }
        if (xvbVar != null) {
            xvbVar.e();
        }
    }

    @Override // defpackage.xvb
    public final defpackage.xuc ey() {
        return defpackage.xuc.b;
    }

    @Override // defpackage.xva
    public final void f(java.lang.Exception exc) {
        if (!(exc instanceof defpackage.xuf) || ((defpackage.xuf) exc).a != 403 || this.e.get() || this.k.getAndSet(true)) {
            d();
            e();
            this.n.f(exc);
        } else {
            defpackage.ahhv ahhvVar = this.i;
            h(ahhvVar.c.a(this.j));
        }
    }

    @Override // defpackage.xvb
    public final void g(defpackage.xsm xsmVar, defpackage.xva xvaVar) {
        this.h = xsmVar;
        this.n = xvaVar;
        defpackage.ahhv ahhvVar = this.i;
        ahok ahokVarA = ahhvVar.b.a(1391, defpackage.ahhu.class, "fetch");
        try {
            h(ahhvVar.c.b(this.j));
            ahokVarA.close();
        } catch (java.lang.Throwable th) {
            try {
                ahokVarA.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
