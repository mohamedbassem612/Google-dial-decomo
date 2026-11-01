package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aobz implements java.util.concurrent.Executor {
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.aobz.class.getName());
    private boolean b;
    private java.util.ArrayDeque c;

    private final void a() {
        while (true) {
            java.lang.Runnable runnable = (java.lang.Runnable) this.c.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (java.lang.Throwable th) {
                a.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "completeQueuedTasks", "Exception while executing runnable ".concat(runnable.toString()), th);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c A[DONT_GENERATE] */
    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        ahvr.cj(runnable, "'task' must not be null.");
        if (this.b) {
            java.util.ArrayDeque arrayDeque = this.c;
            if (arrayDeque == null) {
                arrayDeque = new java.util.ArrayDeque(4);
                this.c = arrayDeque;
            }
            arrayDeque.add(runnable);
            return;
        }
        this.b = true;
        try {
            runnable.run();
            if (this.c != null) {
            }
        } catch (java.lang.Throwable th) {
            try {
                a.logp(java.util.logging.Level.SEVERE, "io.grpc.internal.SerializeReentrantCallsDirectExecutor", "execute", a.bH(runnable, "Exception while executing runnable "), th);
            } finally {
                if (this.c != null) {
                    a();
                }
                this.b = false;
            }
        }
    }
}
