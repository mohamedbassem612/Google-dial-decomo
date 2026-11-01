package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
abstract class ajbk extends defpackage.ajco {
    private final java.util.concurrent.Executor a;
    final /* synthetic */ defpackage.ajbl b;

    public ajbk(defpackage.ajbl ajblVar, java.util.concurrent.Executor executor) {
        j$.util.Objects.requireNonNull(ajblVar);
        this.b = ajblVar;
        executor.getClass();
        this.a = executor;
    }

    public abstract void c(java.lang.Object obj);

    @Override // defpackage.ajco
    public final void d(java.lang.Throwable th) {
        defpackage.ajbl ajblVar = this.b;
        ajblVar.c = null;
        if (th instanceof java.util.concurrent.ExecutionException) {
            ajblVar.p(((java.util.concurrent.ExecutionException) th).getCause());
        } else if (th instanceof java.util.concurrent.CancellationException) {
            ajblVar.cancel(false);
        } else {
            ajblVar.p(th);
        }
    }

    @Override // defpackage.ajco
    public final void e(java.lang.Object obj) {
        this.b.c = null;
        c(obj);
    }

    final void f() {
        try {
            this.a.execute(this);
        } catch (java.util.concurrent.RejectedExecutionException e) {
            this.b.p(e);
        }
    }

    @Override // defpackage.ajco
    public final boolean g() {
        return this.b.isDone();
    }
}
