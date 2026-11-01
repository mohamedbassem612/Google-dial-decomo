package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajav implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public ajav(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ahpj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.concurrent.Callable] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        if (this.$cid == 0) {
            java.lang.Object obj = this.a;
            ((defpackage.ajbb) obj).a.o(((java.io.Closeable[]) ((defpackage.apnt) this.b).a)[0], defpackage.ajbm.INSTANCE);
            return null;
        }
        defpackage.ahpe ahpeVar = (defpackage.ahpe) defpackage.ahns.d.get();
        defpackage.ahpj ahpjVarD = defpackage.ahns.d(ahpeVar, this.b);
        try {
            java.lang.Object objCall = this.a.call();
            defpackage.ahns.d(ahpeVar, ahpjVarD);
            return objCall;
        } catch (java.lang.Throwable th) {
            try {
                ahnn.b(th);
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.ahns.d(ahpeVar, ahpjVarD);
                throw th2;
            }
        }
    }

    public final java.lang.String toString() {
        if (this.$cid == 0) {
            return ((defpackage.apnt) this.b).toString();
        }
        return "propagating=[" + this.a + ']';
    }
}
