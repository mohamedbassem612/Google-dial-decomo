package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aovn extends defpackage.aosp {
    public static final defpackage.aovn a = new defpackage.aovn();

    @Override // defpackage.aosp
    public final void a(defpackage.aolr aolrVar, java.lang.Runnable runnable) {
        defpackage.aovr aovrVar = (defpackage.aovr) aolrVar.get(defpackage.aovr.b);
        if (aovrVar == null) {
            throw new java.lang.UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        aovrVar.a = true;
    }

    @Override // defpackage.aosp
    public final boolean dB(defpackage.aolr aolrVar) {
        return false;
    }

    @Override // defpackage.aosp
    public final defpackage.aosp e(int i) {
        throw new java.lang.UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.aosp
    public final java.lang.String toString() {
        return "Dispatchers.Unconfined";
    }
}
