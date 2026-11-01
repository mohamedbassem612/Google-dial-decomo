package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aiuj implements java.lang.Runnable {
    final /* synthetic */ defpackage.ajdd a;
    final /* synthetic */ defpackage.aiul b;

    public aiuj(defpackage.aiul aiulVar, defpackage.ajdd ajddVar) {
        this.a = ajddVar;
        j$.util.Objects.requireNonNull(aiulVar);
        this.b = aiulVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            defpackage.ajdd ajddVar = this.a;
            if (!ajddVar.isCancelled()) {
                defpackage.ahvr.cc(ajddVar.isDone(), "Future was expected to be done: %s", ajddVar);
                if (defpackage.a.h(ajddVar) == defpackage.aiul.a) {
                    return;
                }
            }
        } catch (java.util.concurrent.ExecutionException unused) {
        }
        this.b.q(this.a);
    }
}
