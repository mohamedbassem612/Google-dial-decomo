package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajal extends defpackage.ajan {
    public ajal(defpackage.ajcq ajcqVar, defpackage.ajat ajatVar) {
        super(ajcqVar, ajatVar);
    }

    @Override // defpackage.ajan
    public final /* bridge */ /* synthetic */ java.lang.Object d(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ajat ajatVar = (defpackage.ajat) obj;
        defpackage.ajcq ajcqVarA = ajatVar.a(obj2);
        defpackage.ahvr.cl(ajcqVarA, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ajatVar);
        return ajcqVarA;
    }

    @Override // defpackage.ajan
    public final /* synthetic */ void e(java.lang.Object obj) {
        q((defpackage.ajcq) obj);
    }
}
