package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class agvy extends aolj implements kotlinx.coroutines.CoroutineExceptionHandler {
    private final kotlinx.coroutines.CoroutineExceptionHandler a;
    private final kotlinx.coroutines.CoroutineExceptionHandler b;
    private final amwu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agvy(kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler, kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler2, amwu amwuVar) {
        super(kotlinx.coroutines.CoroutineExceptionHandler.c);
        aooh.f(coroutineExceptionHandler, "defaultExceptionHandler");
        aooh.f(coroutineExceptionHandler2, "flagGuardedExceptionHandler");
        this.a = coroutineExceptionHandler;
        this.b = coroutineExceptionHandler2;
        this.d = amwuVar;
    }

    public final void handleException(aolr aolrVar, java.lang.Throwable th) {
        aooh.f(aolrVar, "context");
        aooh.f(th, "exception");
        ((java.lang.Boolean) this.d.a()).booleanValue();
        this.b.handleException(aolrVar, th);
    }
}
