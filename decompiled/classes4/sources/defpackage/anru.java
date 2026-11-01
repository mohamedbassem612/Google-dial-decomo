package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anru implements defpackage.aocz {
    public final defpackage.aocz a;
    final /* synthetic */ defpackage.anrv b;

    public anru(defpackage.anrv anrvVar, defpackage.aocz aoczVar) {
        j$.util.Objects.requireNonNull(anrvVar);
        this.b = anrvVar;
        this.a = aoczVar;
    }

    @Override // defpackage.aocz
    public final void a() {
        java.lang.Runnable runnableA;
        defpackage.aocs aocsVar = (defpackage.aocs) this.a;
        java.util.concurrent.Future future = aocsVar.a;
        if (future != null) {
            future.cancel(false);
            aocsVar.a = null;
        }
        defpackage.aoct aoctVar = aocsVar.b;
        java.util.Iterator it = aoctVar.g.iterator();
        if (it.hasNext()) {
            throw null;
        }
        defpackage.ansd ansdVar = aocsVar.c;
        synchronized (aoctVar.l) {
            if (!aoctVar.n.remove(ansdVar)) {
                throw new java.lang.AssertionError("Transport already removed");
            }
            anno.c((defpackage.annn) aoctVar.q.g.get(java.lang.Long.valueOf(anno.a(aoctVar))), ansdVar);
            aoctVar.d();
        }
        defpackage.anrv anrvVar = this.b;
        synchronized (anrvVar) {
            anrvVar.c--;
            runnableA = anrvVar.a();
        }
        if (runnableA != null) {
            runnableA.run();
        }
    }
}
