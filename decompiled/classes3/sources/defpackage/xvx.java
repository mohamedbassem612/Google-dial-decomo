package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xvx {
    final java.util.Map a;
    public final java.lang.ref.ReferenceQueue b;
    public volatile boolean c;
    public volatile defpackage.xvv d;

    public xvx() {
        java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor(new defpackage.xyl(1));
        this.a = new java.util.HashMap();
        this.b = new java.lang.ref.ReferenceQueue();
        executorServiceNewSingleThreadExecutor.execute(new defpackage.vet(this, 17));
    }

    public final synchronized defpackage.xwy a(defpackage.xuo xuoVar) {
        defpackage.xvw xvwVar = (defpackage.xvw) this.a.get(xuoVar);
        if (xvwVar == null) {
            return null;
        }
        defpackage.xwy xwyVar = (defpackage.xwy) xvwVar.get();
        if (xwyVar == null) {
            c(xvwVar);
        }
        return xwyVar;
    }

    public final synchronized void b(defpackage.xuo xuoVar, defpackage.xwy xwyVar) {
        defpackage.xvw xvwVar = (defpackage.xvw) this.a.put(xuoVar, new defpackage.xvw(xuoVar, xwyVar, this.b));
        if (xvwVar != null) {
            xvwVar.a();
        }
    }

    public final void c(defpackage.xvw xvwVar) {
        synchronized (this) {
            this.a.remove(xvwVar.a);
            if (xvwVar.b) {
                defpackage.xxe xxeVar = xvwVar.c;
            }
        }
    }

    final synchronized void d(defpackage.xuo xuoVar) {
        defpackage.xvw xvwVar = (defpackage.xvw) this.a.remove(xuoVar);
        if (xvwVar != null) {
            xvwVar.a();
        }
    }
}
