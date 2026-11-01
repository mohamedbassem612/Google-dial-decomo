package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class dsk implements defpackage.ajcq, defpackage.aoln {
    private final defpackage.aosy a;
    private final defpackage.dsj b = new defpackage.dsj();

    public dsk(defpackage.aosy aosyVar) {
        this.a = aosyVar;
    }

    @Override // defpackage.ajcq
    public final void c(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        if (runnable == null) {
            defpackage.aooh.i("listener");
        }
        if (executor == null) {
            defpackage.aooh.i("executor");
        }
        this.b.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = this.b.cancel(z);
        if (zCancel) {
            this.a.s(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        defpackage.aooh.f(timeUnit, "unit");
        return this.b.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    @Override // defpackage.aoln
    public final defpackage.aolr u() {
        return defpackage.dsn.a;
    }

    @Override // defpackage.aoln
    public final void w(java.lang.Object obj) {
        java.lang.Throwable thC = defpackage.aoiw.c(obj);
        if (thC == null) {
            this.b.f(obj);
            return;
        }
        boolean z = thC instanceof java.util.concurrent.CancellationException;
        defpackage.dsj dsjVar = this.b;
        if (z) {
            dsjVar.cancel(false);
        } else {
            dsjVar.g(thC);
        }
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.b.get();
    }
}
