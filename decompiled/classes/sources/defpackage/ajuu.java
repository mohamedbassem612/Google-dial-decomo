package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajuu implements java.util.concurrent.Executor {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.ajuu.class.getName());
    private final java.util.concurrent.Executor e;
    public final java.util.Deque b = new java.util.ArrayDeque();
    public int d = 1;
    public long c = 0;
    private final defpackage.ajdb f = new defpackage.ajdb(this, 2);

    public ajuu(java.util.concurrent.Executor executor) {
        defpackage.aais.as(executor);
        this.e = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        defpackage.aais.as(runnable);
        java.util.Deque deque = this.b;
        synchronized (deque) {
            int i = this.d;
            if (i == 4 || i == 3) {
                deque.add(runnable);
                return;
            }
            long j = this.c;
            boolean z = false;
            defpackage.ajut ajutVar = new defpackage.ajut(this, runnable, 0);
            deque.add(ajutVar);
            this.d = 2;
            try {
                this.e.execute(this.f);
                if (this.d == 2) {
                    synchronized (this.b) {
                        if (this.c == j && this.d == 2) {
                            this.d = 3;
                        }
                    }
                }
            } catch (java.lang.Error | java.lang.RuntimeException e) {
                java.util.Deque deque2 = this.b;
                synchronized (deque2) {
                    int i2 = this.d;
                    if ((i2 == 1 || i2 == 2) && deque2.removeLastOccurrence(ajutVar)) {
                        z = true;
                    }
                    if (!(e instanceof java.util.concurrent.RejectedExecutionException) || z) {
                        throw e;
                    }
                }
            }
        }
    }

    public final java.lang.String toString() {
        java.util.concurrent.Executor executor = this.e;
        return "SequentialExecutor@" + java.lang.System.identityHashCode(this) + '{' + java.lang.String.valueOf(executor) + '}';
    }
}
