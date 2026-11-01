package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aizs extends defpackage.aizu {
    public aizs(defpackage.ajcq ajcqVar, java.lang.Class cls, defpackage.ajat ajatVar) {
        super(ajcqVar, cls, ajatVar);
    }

    @Override // defpackage.aizu
    public final /* bridge */ /* synthetic */ java.lang.Object d(java.lang.Object obj, java.lang.Throwable th) {
        defpackage.ajat ajatVar = (defpackage.ajat) obj;
        defpackage.ajcq ajcqVarA = ajatVar.a(th);
        defpackage.ahvr.cl(ajcqVarA, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", ajatVar);
        return ajcqVarA;
    }

    @Override // defpackage.aizu
    public final /* synthetic */ void e(java.lang.Object obj) {
        q((defpackage.ajcq) obj);
    }
}
