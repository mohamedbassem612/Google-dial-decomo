package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class apby implements java.lang.Runnable {
    final /* synthetic */ defpackage.apbz a;
    private java.lang.Runnable b;

    public apby(defpackage.apbz apbzVar, java.lang.Runnable runnable) {
        this.a = apbzVar;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        while (true) {
            try {
                this.b.run();
            } catch (java.lang.Throwable th) {
                defpackage.aosv.t(defpackage.aols.a, th);
            }
            try {
                defpackage.apbz apbzVar = this.a;
                java.lang.Runnable runnableH = apbzVar.h();
                if (runnableH == null) {
                    return;
                }
                this.b = runnableH;
                i++;
                if (i >= 16) {
                    defpackage.aosp aospVar = apbzVar.a;
                    if (defpackage.apbo.c(aospVar, apbzVar)) {
                        defpackage.apbo.b(aospVar, apbzVar, this);
                        return;
                    }
                }
            } catch (java.lang.Throwable th2) {
                defpackage.apbz apbzVar2 = this.a;
                synchronized (apbzVar2.c) {
                    apbzVar2.b.a();
                    throw th2;
                }
            }
        }
    }
}
