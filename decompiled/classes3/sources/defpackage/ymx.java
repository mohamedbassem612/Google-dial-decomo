package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class ymx implements android.content.ServiceConnection {
    protected final java.lang.Object a;
    protected final ahzp b;
    protected defpackage.ypf c;
    protected defpackage.ypf d;
    protected ajdd e;
    final /* synthetic */ defpackage.yna f;
    protected defpackage.ydy g;
    private boolean h;

    public ymx(defpackage.yna ynaVar) {
        j$.util.Objects.requireNonNull(ynaVar);
        this.f = ynaVar;
        this.a = new java.lang.Object();
        this.c = null;
        this.d = null;
        this.g = new defpackage.ydy();
        this.b = ynaVar.g;
        d();
    }

    private final void h() {
        synchronized (this.a) {
            defpackage.ypf ypfVar = this.d;
            if (ypfVar != null) {
                defpackage.yqm.b(a.S(4), a.R(4), defpackage.yoy.a(defpackage.ypf.a(ypfVar, new defpackage.ypf(this.b)).toMillis()), 0, 0, a.T(4), 0);
                this.d = null;
            }
        }
    }

    final ajcq a() {
        ajdd ajddVar;
        synchronized (this.a) {
            if (this.e.isCancelled()) {
                d();
            }
            ajddVar = this.e;
        }
        return ajddVar;
    }

    public abstract void b();

    public final void c(defpackage.ymi ymiVar) {
        synchronized (this.a) {
            if (this.h) {
                android.util.Log.i(defpackage.yna.a, "Connection was already unbound; ignoring late handleConnectionError.");
                return;
            }
            defpackage.ypf ypfVar = this.c;
            if (ypfVar != null) {
                defpackage.xhp.p(defpackage.ypf.a(ypfVar, new defpackage.ypf(this.b)), 5, ymiVar.b);
                this.c = null;
            }
            this.e.p(ymiVar);
            this.f.l();
        }
    }

    final void d() {
        synchronized (this.a) {
            this.e = new ajdd();
            this.g = new defpackage.ydy();
        }
    }

    final void e() {
        synchronized (this.a) {
            if (this.h) {
                return;
            }
            this.h = true;
            h();
            ajdd ajddVar = this.e;
            if (ajddVar == null || ajddVar.isDone()) {
                ajdd ajddVar2 = this.e;
                if (ajddVar2 != null && ajddVar2.isDone() && !this.e.isCancelled()) {
                    defpackage.yna ynaVar = this.f;
                    if (!ynaVar.n()) {
                        try {
                            ((ylb) ((defpackage.ymc) aiql.H(this.e)).a).a.unlinkToDeath(ynaVar, 0);
                        } catch (java.util.NoSuchElementException e) {
                            android.util.Log.w(defpackage.yna.a, "Attempted to unlink a death recipient that was not registered. This is safe to ignore.", e);
                        } catch (java.lang.RuntimeException e2) {
                            e = e2;
                            android.util.Log.e(defpackage.yna.a, "Failed to get service for unbind, unable to call unlinkToDeath. Cause: ", e);
                        } catch (java.util.concurrent.ExecutionException e3) {
                            e = e3;
                            android.util.Log.e(defpackage.yna.a, "Failed to get service for unbind, unable to call unlinkToDeath. Cause: ", e);
                        }
                    }
                }
            } else {
                this.e.p(new defpackage.ymi(4, 602, "AICore service disconnected: Client unbound before the service connected.", null));
            }
            this.f.d.unbindService(this);
            this.g.f();
        }
    }

    protected final boolean f(android.content.Intent intent) {
        defpackage.yna ynaVar = this.f;
        return ynaVar.d.bindService(intent, this, true == ynaVar.f ? 65 : 1);
    }

    public final void g(defpackage.ylf ylfVar) {
        synchronized (this.a) {
            if (this.h) {
                android.util.Log.i(defpackage.yna.a, "Connection was already unbound; ignoring late AICore service connection.");
                return;
            }
            defpackage.ypf ypfVar = this.c;
            if (ypfVar != null) {
                defpackage.xhp.p(defpackage.ypf.a(ypfVar, new defpackage.ypf(this.b)), 4, 0);
                this.c = null;
            }
            this.d = new defpackage.ypf(this.b);
            this.e.o(new defpackage.ymc(ylfVar, this.g));
            defpackage.yna ynaVar = this.f;
            if (!ynaVar.n()) {
                try {
                    ((ylb) ylfVar).a.linkToDeath(ynaVar, 0);
                } catch (android.os.RemoteException e) {
                    c(new defpackage.ymi(4, 6, "AICore service died before linking death recipient.", e));
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName componentName) {
        h();
        c(new defpackage.ymi(4, 603, "AiCore service binding died.", null));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(android.content.ComponentName componentName) {
        c(new defpackage.ymi(4, 605, "AiCore service returns null on binding.", null));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        synchronized (this.a) {
            if (this.h) {
                android.util.Log.i(defpackage.yna.a, "Connection was already unbound; ignoring late onServiceDisconnected.");
                return;
            }
            h();
            this.g.f();
            this.e.p(new defpackage.ymi(4, 602, "AiCore service disconnected.", null));
            d();
        }
    }
}
