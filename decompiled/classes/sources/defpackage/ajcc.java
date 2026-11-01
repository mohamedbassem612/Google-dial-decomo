package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajcc implements java.lang.Runnable {
    final defpackage.ajcq a;
    final defpackage.ajcb b;

    public ajcc(defpackage.ajcq ajcqVar, defpackage.ajcb ajcbVar) {
        this.a = ajcqVar;
        this.b = ajcbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Throwable thJ;
        defpackage.ajcq ajcqVar = this.a;
        if ((ajcqVar instanceof defpackage.ajdm) && (thJ = ((defpackage.ajdm) ajcqVar).j()) != null) {
            this.b.a(thJ);
            return;
        }
        try {
            defpackage.ahvr.cc(ajcqVar.isDone(), "Future was expected to be done: %s", ajcqVar);
            this.b.b(defpackage.a.h(ajcqVar));
        } catch (java.util.concurrent.ExecutionException e) {
            this.b.a(e.getCause());
        } catch (java.lang.Throwable th) {
            this.b.a(th);
        }
    }

    public final java.lang.String toString() {
        defpackage.ahym ahymVarL = defpackage.ahvr.l(this);
        ahymVarL.a(this.b);
        return ahymVarL.toString();
    }
}
