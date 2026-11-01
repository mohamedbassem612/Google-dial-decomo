package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eoy implements java.lang.AutoCloseable, aoss {
    private final aolr a;

    public eoy(aolr aolrVar) {
        aooh.f(aolrVar, "coroutineContext");
        this.a = aolrVar;
    }

    public final aolr c() {
        return this.a;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        aooc.W(this.a, (java.util.concurrent.CancellationException) null);
    }
}
