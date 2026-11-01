package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cdx extends aolj implements kotlinx.coroutines.CoroutineExceptionHandler {
    final /* synthetic */ cmc a;
    final /* synthetic */ cdy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdx(cch cchVar, cmc cmcVar, cdy cdyVar) {
        super(cchVar);
        this.a = cmcVar;
        this.b = cdyVar;
    }

    public final void handleException(aolr aolrVar, java.lang.Throwable th) throws java.lang.Throwable {
        cmc.c();
        kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler = this.b.b.get(kotlinx.coroutines.CoroutineExceptionHandler.c);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(aolrVar, th);
    }
}
