package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agey extends defpackage.ageu {
    final /* synthetic */ defpackage.agfc a;

    public agey(defpackage.agfc agfcVar) {
        j$.util.Objects.requireNonNull(agfcVar);
        this.a = agfcVar;
    }

    @Override // defpackage.ageu
    public final void a() {
        defpackage.agfc agfcVar = this.a;
        synchronized (agfcVar.e) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger = agfcVar.j;
            if (atomicInteger.get() > 0 && atomicInteger.decrementAndGet() > 0) {
                agfcVar.m.E("Leaving the connection open for other ongoing calls.", new java.lang.Object[0]);
                return;
            }
            if (agfcVar.l != null) {
                agfcVar.m.E("Unbind from service.", new java.lang.Object[0]);
                agfcVar.a.unbindService(agfcVar.k);
                agfcVar.f = false;
                agfcVar.l = null;
                agfcVar.k = null;
            }
            agfcVar.b();
        }
    }
}
