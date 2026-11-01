package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajbt extends java.util.concurrent.atomic.AtomicReference implements java.util.concurrent.Executor, java.lang.Runnable {
    java.util.concurrent.Executor a;
    defpackage.ajdk b;
    java.lang.Thread c;
    defpackage.ajwr d;

    public ajbt(java.util.concurrent.Executor executor, defpackage.ajwr ajwrVar) {
        super(defpackage.ajbs.a);
        this.a = executor;
        this.d = ajwrVar;
    }

    public final boolean a() {
        return compareAndSet(defpackage.ajbs.a, defpackage.ajbs.b);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        if (get() == defpackage.ajbs.b) {
            this.a = null;
            this.d = null;
            return;
        }
        this.c = java.lang.Thread.currentThread();
        defpackage.ajdk ajdkVar = (defpackage.ajdk) runnable;
        try {
            java.lang.Object obj = ((defpackage.ajwr) j$.util.Objects.requireNonNull(this.d)).a;
            if (((defpackage.ajbu) obj).a == this.c) {
                this.d = null;
                if (((defpackage.ajbu) obj).b != null) {
                    throw new java.lang.IllegalStateException();
                }
                ((defpackage.ajbu) obj).b = ajdkVar;
                ((defpackage.ajbu) obj).c = (java.util.concurrent.Executor) j$.util.Objects.requireNonNull(this.a);
                this.a = null;
            } else {
                java.util.concurrent.Executor executor = (java.util.concurrent.Executor) j$.util.Objects.requireNonNull(this.a);
                this.a = null;
                this.b = ajdkVar;
                try {
                    executor.execute(this);
                } catch (java.util.concurrent.RejectedExecutionException e) {
                    a();
                    ajdkVar.p(e);
                }
            }
            this.c = null;
        } catch (java.lang.Throwable th) {
            this.c = null;
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.Executor executor;
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        if (threadCurrentThread != this.c) {
            java.lang.Runnable runnable = (java.lang.Runnable) j$.util.Objects.requireNonNull(this.b);
            this.b = null;
            runnable.run();
            return;
        }
        defpackage.ajbu ajbuVar = new defpackage.ajbu();
        ajbuVar.a = threadCurrentThread;
        ((defpackage.ajwr) j$.util.Objects.requireNonNull(this.d)).a = ajbuVar;
        this.d = null;
        try {
            java.lang.Runnable runnable2 = (java.lang.Runnable) j$.util.Objects.requireNonNull(this.b);
            this.b = null;
            runnable2.run();
            while (true) {
                defpackage.ajdk ajdkVar = ajbuVar.b;
                if (ajdkVar == null || (executor = ajbuVar.c) == null) {
                    break;
                }
                ajbuVar.b = null;
                ajbuVar.c = null;
                try {
                    executor.execute(ajdkVar);
                } catch (java.util.concurrent.RejectedExecutionException e) {
                    ajdkVar.p(e);
                }
            }
            ajbuVar.a = null;
        } catch (java.lang.Throwable th) {
            ajbuVar.a = null;
            throw th;
        }
    }
}
