package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajdc implements java.util.concurrent.Executor {
    public static final defpackage.ajcp a = new defpackage.ajcp(defpackage.ajdc.class);
    private final java.util.concurrent.Executor e;
    public final java.util.Deque b = new java.util.ArrayDeque();
    public int d = 1;
    public long c = 0;
    private final defpackage.ajdb f = new defpackage.ajdb(this, 0);

    public ajdc(java.util.concurrent.Executor executor) {
        executor.getClass();
        this.e = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        runnable.getClass();
        java.util.Deque deque = this.b;
        synchronized (deque) {
            int i = this.d;
            if (i == 4 || i == 3) {
                deque.add(runnable);
                return;
            }
            long j = this.c;
            defpackage.ajut ajutVar = new defpackage.ajut(this, runnable, 1);
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
            } catch (java.lang.Throwable th) {
                java.util.Deque deque2 = this.b;
                synchronized (deque2) {
                    int i2 = this.d;
                    boolean z = (i2 == 1 || i2 == 2) && deque2.removeLastOccurrence(ajutVar);
                    if (!(th instanceof java.util.concurrent.RejectedExecutionException) || z) {
                        throw th;
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
