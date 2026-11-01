package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajdk extends defpackage.ajbv implements java.util.concurrent.RunnableFuture {
    private volatile defpackage.ajco a;

    public ajdk(defpackage.ajas ajasVar) {
        this.a = new defpackage.ajdi(this, ajasVar);
    }

    @Override // defpackage.ajac
    protected final void a() {
        defpackage.ajco ajcoVar;
        if (r() && (ajcoVar = this.a) != null) {
            ajcoVar.h();
        }
        this.a = null;
    }

    @Override // defpackage.ajac
    protected final java.lang.String b() {
        defpackage.ajco ajcoVar = this.a;
        return ajcoVar != null ? defpackage.a.bG((byte) 93, ajcoVar, "task=[") : super.b();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        defpackage.ajco ajcoVar = this.a;
        if (ajcoVar != null) {
            ajcoVar.run();
        }
        this.a = null;
    }

    public ajdk(java.util.concurrent.Callable callable) {
        this.a = new defpackage.ajdj(this, callable);
    }
}
