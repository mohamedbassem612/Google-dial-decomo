package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apbj implements defpackage.aoss {
    private final /* synthetic */ int $cid;
    public final defpackage.aolr a;

    public apbj(defpackage.aolr aolrVar, int i, byte[] bArr) {
        this.$cid = i;
        if (aolrVar == null) {
            defpackage.aooh.i("context");
        }
        this.a = aolrVar;
    }

    @Override // defpackage.aoss
    public final defpackage.aolr c() {
        return this.a;
    }

    public final java.lang.String toString() {
        int i = this.$cid;
        defpackage.aolr aolrVar = this.a;
        if (i != 0) {
            return "CoroutineScope(coroutineContext=" + aolrVar + ')';
        }
        return "CoroutineScope(coroutineContext=" + aolrVar + ')';
    }

    public apbj(defpackage.aolr aolrVar, int i) {
        this.$cid = i;
        this.a = aolrVar;
    }
}
