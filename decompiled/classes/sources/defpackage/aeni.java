package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeni implements java.util.concurrent.Executor, defpackage.aepo {
    public final defpackage.ajcu a;
    private final defpackage.aoin d;
    private final defpackage.tvn f;
    private final j$.util.concurrent.ConcurrentLinkedQueue b = new j$.util.concurrent.ConcurrentLinkedQueue();
    private volatile boolean c = false;
    private final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean();

    public aeni(defpackage.ajcu ajcuVar, defpackage.tvn tvnVar, defpackage.aoin aoinVar) {
        this.a = ajcuVar;
        this.f = tvnVar;
        this.d = aoinVar;
        defpackage.aepq aepqVar = ((defpackage.aepr) tvnVar.a).a;
        int i = defpackage.aepq.c;
        if (aepqVar.b.get() > 0) {
            k();
        } else {
            tvnVar.w(this);
        }
    }

    private final void j() {
        while (true) {
            java.lang.Runnable runnable = (java.lang.Runnable) this.b.poll();
            if (runnable == null) {
                return;
            } else {
                this.a.execute(runnable);
            }
        }
    }

    private final void k() {
        this.a.schedule(new defpackage.vcz(this, 13), 3000L, java.util.concurrent.TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.aepo
    public final void c(android.app.Activity activity) {
        this.f.x(this);
        k();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (this.c) {
            this.a.execute(runnable);
            return;
        }
        this.b.add(runnable);
        if (this.c) {
            j();
        } else {
            if (this.e.getAndSet(true)) {
                return;
            }
            if (((java.lang.Boolean) ((defpackage.ahyn) ((defpackage.amyw) this.d).b).d(java.lang.Boolean.FALSE)).booleanValue()) {
                android.os.Looper.getMainLooper().getQueue().addIdleHandler(new ahdj(this, 1));
            } else {
                this.a.schedule(new defpackage.vcz(this, 12), 7000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void g() {
        this.c = true;
        j();
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void a(android.app.Activity activity) {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void b(android.app.Activity activity) {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void d(android.app.Activity activity) {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void e(android.app.Activity activity) {
    }

    @Override // defpackage.aepo
    public final /* synthetic */ void f(int i) {
    }
}
