package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class anyw implements java.util.concurrent.Executor {
    private final defpackage.aoag a;
    private java.util.concurrent.Executor b;

    public anyw(defpackage.aoag aoagVar) {
        this.a = aoagVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    final synchronized java.util.concurrent.Executor a() {
        if (this.b == null) {
            ?? A = this.a.a();
            defpackage.ahvr.cl(A, "%s.getObject()", this.b);
            this.b = A;
        }
        return this.b;
    }

    final synchronized void b() {
        java.util.concurrent.Executor executor = this.b;
        if (executor != null) {
            this.a.b(executor);
            this.b = null;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        a().execute(runnable);
    }
}
