package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apah implements defpackage.aolr {
    public final java.lang.Throwable a;
    private final /* synthetic */ defpackage.aolr b;

    public apah(java.lang.Throwable th, defpackage.aolr aolrVar) {
        this.b = aolrVar;
        this.a = th;
    }

    @Override // defpackage.aolr
    public final java.lang.Object fold(java.lang.Object obj, defpackage.aonn aonnVar) {
        return this.b.fold(obj, aonnVar);
    }

    @Override // defpackage.aolr
    public final defpackage.aolp get(defpackage.aolq aolqVar) {
        return this.b.get(aolqVar);
    }

    @Override // defpackage.aolr
    public final defpackage.aolr minusKey(defpackage.aolq aolqVar) {
        return this.b.minusKey(aolqVar);
    }

    @Override // defpackage.aolr
    public final defpackage.aolr plus(defpackage.aolr aolrVar) {
        return this.b.plus(aolrVar);
    }
}
