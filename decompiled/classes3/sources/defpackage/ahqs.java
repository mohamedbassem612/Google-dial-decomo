package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahqs implements java.lang.Runnable {
    final /* synthetic */ ahpm a;
    final /* synthetic */ java.lang.Runnable b;

    public ahqs(ahpm ahpmVar, java.lang.Runnable runnable) {
        this.a = ahpmVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ahpm ahpmVar = this.a;
        aooh.d(ahpmVar, "null cannot be cast to non-null type com.google.apps.tiktok.tracing.Trace");
        ahpe ahpeVarA = ahns.a();
        ahpj ahpjVarD = ahns.d(ahpeVarA, ahpmVar);
        try {
            this.b.run();
            ahns.d(ahpeVarA, ahpjVarD);
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahnn.b(th);
                throw th;
            } catch (java.lang.Throwable th2) {
                ahns.d(ahpeVarA, ahpjVarD);
                throw th2;
            }
        }
    }

    public final java.lang.String toString() {
        return "propagating=[" + this.b + ']';
    }
}
