package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gzz extends java.util.concurrent.FutureTask {
    private haa a;

    public gzz(haa haaVar, java.util.concurrent.Callable callable) {
        super(callable);
        this.a = haaVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        try {
            if (!isCancelled()) {
                try {
                    haa haaVar = this.a;
                    defpackage.gzy gzyVar = (defpackage.gzy) get();
                    java.util.concurrent.Executor executor = haa.a;
                    haaVar.b(gzyVar);
                } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                    haa haaVar2 = this.a;
                    defpackage.gzy gzyVar2 = new defpackage.gzy(e);
                    java.util.concurrent.Executor executor2 = haa.a;
                    haaVar2.b(gzyVar2);
                }
            }
        } finally {
            this.a = null;
        }
    }
}
