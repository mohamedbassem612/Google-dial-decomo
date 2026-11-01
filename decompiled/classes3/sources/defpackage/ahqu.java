package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahqu implements java.util.concurrent.Callable {
    final /* synthetic */ ahpj a;
    final /* synthetic */ java.util.concurrent.Callable b;

    public ahqu(ahpj ahpjVar, java.util.concurrent.Callable callable) {
        this.a = ahpjVar;
        this.b = callable;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        ahpe ahpeVarA = ahns.a();
        ahpj ahpjVarE = ahns.e(ahpeVarA, this.a);
        try {
            java.lang.Object objCall = this.b.call();
            ahns.e(ahpeVarA, ahpjVarE);
            return objCall;
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahnn.b(th);
                throw th;
            } catch (java.lang.Throwable th2) {
                ahns.e(ahpeVarA, ahpjVarE);
                throw th2;
            }
        }
    }

    public final java.lang.String toString() {
        return "propagating=[" + this.b + ']';
    }
}
