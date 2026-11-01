package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aiui implements java.util.concurrent.Executor {
    final /* synthetic */ java.util.concurrent.Executor a;
    final /* synthetic */ defpackage.aiul b;

    public aiui(defpackage.aiul aiulVar, java.util.concurrent.Executor executor) {
        this.a = executor;
        j$.util.Objects.requireNonNull(aiulVar);
        this.b = aiulVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e) {
            this.b.p(e);
        }
    }
}
