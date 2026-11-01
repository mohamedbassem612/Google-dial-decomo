package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dsh implements defpackage.ajcq {
    final java.lang.ref.WeakReference a;
    public final defpackage.dsc b = new defpackage.dsg(this);

    public dsh(defpackage.dsd dsdVar) {
        this.a = new java.lang.ref.WeakReference(dsdVar);
    }

    public final boolean a(java.lang.Throwable th) {
        return this.b.g(th);
    }

    @Override // defpackage.ajcq
    public final void c(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.b.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        defpackage.dsd dsdVar = (defpackage.dsd) this.a.get();
        boolean zCancel = this.b.cancel(z);
        if (!zCancel || dsdVar == null) {
            return zCancel;
        }
        dsdVar.a = null;
        dsdVar.b = null;
        dsdVar.c.f(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final java.lang.String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
