package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class ajby extends defpackage.aiey implements java.util.concurrent.Future, defpackage.ajcq {
    protected ajby() {
    }

    public void c(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        eW().c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return eX().cancel(z);
    }

    protected abstract defpackage.ajcq eW();

    protected /* bridge */ /* synthetic */ java.util.concurrent.Future eX() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return eX().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return eX().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return eX().isDone();
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        return eX().get(j, timeUnit);
    }
}
