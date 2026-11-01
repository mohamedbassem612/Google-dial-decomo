package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aads extends defpackage.aadw {
    protected final defpackage.aaeb a;

    public aads(int i, defpackage.aaeb aaebVar) {
        super(i);
        this.a = aaebVar;
    }

    @Override // defpackage.aadw
    public final void f(com.google.android.gms.common.api.Status status) {
        try {
            this.a.i(status);
        } catch (java.lang.IllegalStateException e) {
            android.util.Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.aadw
    public final void g(java.lang.Exception exc) {
        if (k(exc)) {
            return;
        }
        try {
            this.a.i(new com.google.android.gms.common.api.Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage(), null, null));
        } catch (java.lang.IllegalStateException e) {
            android.util.Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.aadw
    public final void h(defpackage.aaeo aaeoVar) throws android.os.DeadObjectException {
        try {
            this.a.h(aaeoVar.b);
        } catch (java.lang.RuntimeException e) {
            g(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.aadw
    public final void i(defpackage.acxg acxgVar, boolean z) {
        defpackage.aaeb aaebVar = this.a;
        acxgVar.b.put(aaebVar, java.lang.Boolean.valueOf(z));
        aaebVar.d(new defpackage.aaej(acxgVar, aaebVar));
    }
}
