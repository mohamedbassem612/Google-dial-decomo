package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apwl implements java.util.concurrent.Executor {
    private final java.util.concurrent.Executor a;
    private final java.lang.Runnable b = new defpackage.aobd(this, 20);
    private final java.util.ArrayDeque c = new java.util.ArrayDeque();
    private boolean d;

    public apwl(java.util.concurrent.Executor executor) {
        this.a = executor;
    }

    public final void a() {
        java.util.ArrayDeque arrayDeque = this.c;
        synchronized (arrayDeque) {
            if (this.d) {
                return;
            }
            java.lang.Runnable runnable = (java.lang.Runnable) arrayDeque.pollFirst();
            this.d = runnable != null;
            while (runnable != null) {
                try {
                    runnable.run();
                    synchronized (arrayDeque) {
                        runnable = (java.lang.Runnable) arrayDeque.pollFirst();
                        this.d = runnable != null;
                    }
                } catch (java.lang.Throwable th) {
                    synchronized (this.c) {
                        this.d = false;
                        try {
                            this.a.execute(this.b);
                        } catch (java.util.concurrent.RejectedExecutionException unused) {
                        }
                        throw th;
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        java.util.ArrayDeque arrayDeque = this.c;
        synchronized (arrayDeque) {
            arrayDeque.addLast(runnable);
            try {
                this.a.execute(this.b);
            } catch (java.util.concurrent.RejectedExecutionException unused) {
                this.c.removeLast();
            }
        }
    }
}
