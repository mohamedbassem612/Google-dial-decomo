package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ajbi extends defpackage.ajbk {
    final /* synthetic */ defpackage.ajbl a;
    private final defpackage.ajas c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajbi(defpackage.ajbl ajblVar, defpackage.ajas ajasVar, java.util.concurrent.Executor executor) {
        super(ajblVar, executor);
        j$.util.Objects.requireNonNull(ajblVar);
        this.a = ajblVar;
        this.c = ajasVar;
    }

    @Override // defpackage.ajco
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        defpackage.ajas ajasVar = this.c;
        defpackage.ajcq ajcqVarA = ajasVar.a();
        defpackage.ahvr.cl(ajcqVarA, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ajasVar);
        return ajcqVarA;
    }

    @Override // defpackage.ajco
    public final java.lang.String b() {
        return this.c.toString();
    }

    @Override // defpackage.ajbk
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        this.a.q((defpackage.ajcq) obj);
    }
}
