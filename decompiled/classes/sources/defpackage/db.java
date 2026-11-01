package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class db implements java.util.concurrent.Executor {
    final java.util.concurrent.Executor b;
    java.lang.Runnable c;
    private final java.lang.Object d = new java.lang.Object();
    final java.util.Queue a = new java.util.ArrayDeque();

    public db(java.util.concurrent.Executor executor) {
        this.b = executor;
    }

    public final void a() {
        synchronized (this.d) {
            java.lang.Runnable runnable = (java.lang.Runnable) this.a.poll();
            this.c = runnable;
            if (runnable != null) {
                this.b.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        synchronized (this.d) {
            this.a.add(new defpackage.ad(this, runnable, 6, (byte[]) null));
            if (this.c == null) {
                a();
            }
        }
    }
}
