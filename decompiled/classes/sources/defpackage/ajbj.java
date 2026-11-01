package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ajbj extends defpackage.ajbk {
    final /* synthetic */ defpackage.ajbl a;
    private final java.util.concurrent.Callable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajbj(defpackage.ajbl ajblVar, java.util.concurrent.Callable callable, java.util.concurrent.Executor executor) {
        super(ajblVar, executor);
        j$.util.Objects.requireNonNull(ajblVar);
        this.a = ajblVar;
        callable.getClass();
        this.c = callable;
    }

    @Override // defpackage.ajco
    public final java.lang.Object a() {
        return this.c.call();
    }

    @Override // defpackage.ajco
    public final java.lang.String b() {
        return this.c.toString();
    }

    @Override // defpackage.ajbk
    public final void c(java.lang.Object obj) {
        this.a.o(obj);
    }
}
