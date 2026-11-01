package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fjb implements java.util.concurrent.Executor {
    public final /* synthetic */ java.util.concurrent.Executor a;
    public final /* synthetic */ java.util.function.Consumer b;

    public fjb(java.util.concurrent.Executor executor, java.util.function.Consumer consumer) {
        this.a = executor;
        this.b = consumer;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.a.execute(runnable);
    }
}
