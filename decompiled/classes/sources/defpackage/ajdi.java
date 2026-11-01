package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ajdi extends defpackage.ajco {
    final /* synthetic */ defpackage.ajdk a;
    private final defpackage.ajas b;

    public ajdi(defpackage.ajdk ajdkVar, defpackage.ajas ajasVar) {
        j$.util.Objects.requireNonNull(ajdkVar);
        this.a = ajdkVar;
        ajasVar.getClass();
        this.b = ajasVar;
    }

    @Override // defpackage.ajco
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        defpackage.ajas ajasVar = this.b;
        defpackage.ajcq ajcqVarA = ajasVar.a();
        defpackage.ahvr.cl(ajcqVarA, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ajasVar);
        return ajcqVarA;
    }

    @Override // defpackage.ajco
    public final java.lang.String b() {
        return this.b.toString();
    }

    @Override // defpackage.ajco
    public final void d(java.lang.Throwable th) {
        this.a.p(th);
    }

    @Override // defpackage.ajco
    public final /* bridge */ /* synthetic */ void e(java.lang.Object obj) {
        this.a.q((defpackage.ajcq) obj);
    }

    @Override // defpackage.ajco
    public final boolean g() {
        return this.a.isDone();
    }
}
