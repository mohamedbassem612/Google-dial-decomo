package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abqj extends defpackage.abql {
    final /* synthetic */ defpackage.ajcu a;
    final /* synthetic */ defpackage.aoin b;

    public abqj(defpackage.ajcu ajcuVar, defpackage.aoin aoinVar) {
        this.a = ajcuVar;
        this.b = aoinVar;
    }

    @Override // defpackage.ajbw, java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.a.execute(new defpackage.abqk(runnable, this.b));
    }

    @Override // defpackage.abql, defpackage.ajca
    public final /* synthetic */ defpackage.ajct f() {
        return this.a;
    }

    @Override // defpackage.aiey
    public final /* synthetic */ java.lang.Object fp() {
        return this.a;
    }

    @Override // defpackage.ajca, defpackage.ajbw
    public final /* synthetic */ java.util.concurrent.ExecutorService g() {
        return this.a;
    }

    @Override // defpackage.abql
    public final defpackage.ajcu h() {
        return this.a;
    }

    @Override // defpackage.ajbw, java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.ajbw, java.util.concurrent.ExecutorService
    public final java.util.List shutdownNow() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // defpackage.aiey
    public final java.lang.String toString() {
        return "ExceptionHandling[" + super.toString() + ']';
    }
}
