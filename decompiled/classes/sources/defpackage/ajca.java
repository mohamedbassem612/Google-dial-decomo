package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class ajca extends defpackage.ajbw implements java.lang.AutoCloseable, defpackage.ajct {
    protected ajca() {
    }

    @Override // defpackage.ajbw, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        defpackage.anty.aj(this);
    }

    @Override // defpackage.ajbw, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: eT */
    public final defpackage.ajcq submit(java.lang.Runnable runnable) {
        return f().submit(runnable);
    }

    @Override // defpackage.ajbw, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: eU */
    public final defpackage.ajcq submit(java.util.concurrent.Callable callable) {
        return f().submit(callable);
    }

    @Override // defpackage.ajbw, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: eV */
    public final defpackage.ajcq submit(java.lang.Runnable runnable, java.lang.Object obj) {
        return f().submit(runnable, obj);
    }

    protected abstract defpackage.ajct f();

    @Override // defpackage.ajbw
    protected /* bridge */ /* synthetic */ java.util.concurrent.ExecutorService g() {
        throw null;
    }
}
