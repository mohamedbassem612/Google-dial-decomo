package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acxs implements java.util.concurrent.Executor {
    private final java.util.concurrent.Executor a;
    private final int b;
    private final java.lang.Object c = new java.lang.Object();
    private int d = 0;
    private final java.util.Queue e = new java.util.ArrayDeque();

    public acxs(java.util.concurrent.Executor executor, int i) {
        this.a = executor;
        this.b = i;
    }

    public final void a() {
        synchronized (this.c) {
            java.lang.Runnable runnable = (java.lang.Runnable) this.e.poll();
            if (runnable == null) {
                this.d--;
                return;
            }
            try {
                this.a.execute(ahqx.h(new defpackage.xwr(this, runnable, 3)));
            } catch (java.lang.Throwable th) {
                adbe.g(th, "%s: Task submission failed: %s", new java.lang.Object[]{"ThrottlingExecutor", runnable});
                synchronized (this.c) {
                    this.d--;
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        ahvr.ci(runnable);
        synchronized (this.c) {
            int i = this.d;
            if (i >= this.b) {
                this.e.add(runnable);
                return;
            }
            this.d = i + 1;
            try {
                this.a.execute(ahqx.h(new defpackage.xwr(this, runnable, 3)));
            } catch (java.lang.Throwable th) {
                synchronized (this.c) {
                    this.d--;
                    throw th;
                }
            }
        }
    }
}
