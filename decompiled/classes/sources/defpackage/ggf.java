package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ggf implements java.util.concurrent.Executor {
    private final java.util.concurrent.Executor a;
    private final java.util.ArrayDeque b;
    private java.lang.Runnable c;
    private final java.lang.Object d;

    public ggf(java.util.concurrent.Executor executor) {
        if (executor == null) {
            defpackage.aooh.i("executor");
        }
        this.a = executor;
        this.b = new java.util.ArrayDeque();
        this.d = new java.lang.Object();
    }

    public final void a() {
        synchronized (this.d) {
            java.lang.Object objPoll = this.b.poll();
            java.lang.Runnable runnable = (java.lang.Runnable) objPoll;
            this.c = runnable;
            if (objPoll != null) {
                this.a.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (runnable == null) {
            defpackage.aooh.i("command");
        }
        synchronized (this.d) {
            this.b.offer(new defpackage.an(runnable, this, 7));
            if (this.c == null) {
                a();
            }
        }
    }
}
