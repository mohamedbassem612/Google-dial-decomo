package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tcr implements defpackage.rnt {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public tcr(defpackage.tkl tklVar, int i) {
        this.$cid = i;
        if (tklVar == null) {
            defpackage.aooh.i("dialerGlobalContentObserverAsync");
        }
        this.a = tklVar;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.emj
    public final void fn(defpackage.emx emxVar) {
        if (this.$cid == 0) {
            ((defpackage.tcs) ((defpackage.aogc) this.a).b).b();
            return;
        }
        java.lang.Object obj = this.a;
        defpackage.ddv ddvVar = new defpackage.ddv(obj, 12);
        ?? r2 = ((defpackage.tkl) obj).a;
        defpackage.ajdk ajdkVar = new defpackage.ajdk(java.util.concurrent.Executors.callable(defpackage.ahqx.h(ddvVar), null));
        r2.execute(ajdkVar);
        defpackage.agsm.i(414, ajdkVar, "AsyncOnResumeTasks", new java.lang.Object[0]);
    }

    public tcr(defpackage.aogc aogcVar, int i) {
        this.$cid = i;
        this.a = aogcVar;
    }

    @Override // defpackage.emj
    public final /* synthetic */ void a(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void b(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void c(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void e(defpackage.emx emxVar) {
    }

    @Override // defpackage.emj
    public final /* synthetic */ void f(defpackage.emx emxVar) {
    }
}
