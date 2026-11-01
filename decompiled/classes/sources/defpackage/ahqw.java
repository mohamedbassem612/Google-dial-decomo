package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahqw implements java.lang.Runnable {
    final /* synthetic */ defpackage.aoot a;
    final /* synthetic */ defpackage.ahpj b;
    final /* synthetic */ java.lang.Runnable c;

    public ahqw(defpackage.aoot aootVar, defpackage.ahpj ahpjVar, java.lang.Runnable runnable) {
        this.a = aootVar;
        this.b = ahpjVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((defpackage.ahrp) this.a.a) != null) {
            throw null;
        }
        defpackage.ahpj ahpjVar = this.b;
        java.lang.Runnable runnable = this.c;
        defpackage.ahpe ahpeVar = (defpackage.ahpe) defpackage.ahns.d.get();
        defpackage.ahpj ahpjVarD = defpackage.ahns.d(ahpeVar, ahpjVar);
        try {
            runnable.run();
            defpackage.ahns.d(ahpeVar, ahpjVarD);
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
        return "propagating=[" + this.c + ']';
    }
}
