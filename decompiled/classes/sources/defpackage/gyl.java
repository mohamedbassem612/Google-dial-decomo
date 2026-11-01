package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gyl implements defpackage.gyt {
    private static final java.lang.String b = defpackage.gsh.b("SerialExecutorImpl");
    private final java.util.concurrent.Executor d;
    private java.lang.Runnable e;
    private final java.util.ArrayDeque c = new java.util.ArrayDeque();
    final java.lang.Object a = new java.lang.Object();

    public gyl(java.util.concurrent.Executor executor) {
        this.d = executor;
    }

    final void a() {
        java.lang.Runnable runnable = (java.lang.Runnable) this.c.poll();
        this.e = runnable;
        if (runnable != null) {
            try {
                this.d.execute(runnable);
            } catch (java.lang.Throwable th) {
                defpackage.gsh.a();
                android.util.Log.e(b, "Delegate executor failed to execute", th);
                this.e = null;
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        synchronized (this.a) {
            this.c.add(new defpackage.gyk(this, runnable, 0));
            if (this.e == null) {
                a();
            }
        }
    }
}
