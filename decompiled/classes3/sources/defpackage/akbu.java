package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akbu implements java.util.concurrent.Executor {
    private volatile java.util.concurrent.Executor a;

    public akbu(java.util.concurrent.Executor executor) {
        this.a = executor;
    }

    public final void a() {
        this.a = ajbm.a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.a.execute(runnable);
    }
}
