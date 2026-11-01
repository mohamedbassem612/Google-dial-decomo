package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ajdj extends defpackage.ajco {
    final /* synthetic */ defpackage.ajdk a;
    private final java.util.concurrent.Callable b;

    public ajdj(defpackage.ajdk ajdkVar, java.util.concurrent.Callable callable) {
        j$.util.Objects.requireNonNull(ajdkVar);
        this.a = ajdkVar;
        callable.getClass();
        this.b = callable;
    }

    @Override // defpackage.ajco
    public final java.lang.Object a() {
        return this.b.call();
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
    public final void e(java.lang.Object obj) {
        this.a.o(obj);
    }

    @Override // defpackage.ajco
    public final boolean g() {
        return this.a.isDone();
    }
}
