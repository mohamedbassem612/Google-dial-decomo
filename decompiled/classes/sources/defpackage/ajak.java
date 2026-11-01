package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class ajak extends java.util.concurrent.AbstractExecutorService implements java.lang.AutoCloseable, defpackage.ajct {
    protected ajak() {
    }

    public /* synthetic */ void close() {
        defpackage.anty.aj(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: eT, reason: merged with bridge method [inline-methods] */
    public final defpackage.ajcq submit(java.lang.Runnable runnable) {
        return (defpackage.ajcq) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: eU, reason: merged with bridge method [inline-methods] */
    public final defpackage.ajcq submit(java.util.concurrent.Callable callable) {
        return (defpackage.ajcq) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: eV, reason: merged with bridge method [inline-methods] */
    public final defpackage.ajcq submit(java.lang.Runnable runnable, java.lang.Object obj) {
        return (defpackage.ajcq) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final java.util.concurrent.RunnableFuture newTaskFor(java.lang.Runnable runnable, java.lang.Object obj) {
        return new defpackage.ajdk(java.util.concurrent.Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final java.util.concurrent.RunnableFuture newTaskFor(java.util.concurrent.Callable callable) {
        return new defpackage.ajdk(callable);
    }
}
