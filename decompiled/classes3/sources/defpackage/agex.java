package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agex extends defpackage.ageu {
    final /* synthetic */ defpackage.ageu a;
    final /* synthetic */ defpackage.agfc b;
    final /* synthetic */ zzx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agex(defpackage.agfc agfcVar, zzx zzxVar, zzx zzxVar2, defpackage.ageu ageuVar) {
        super(zzxVar);
        this.d = zzxVar2;
        this.a = ageuVar;
        j$.util.Objects.requireNonNull(agfcVar);
        this.b = agfcVar;
    }

    @Override // defpackage.ageu
    public final void a() {
        defpackage.agfc agfcVar = this.b;
        synchronized (agfcVar.e) {
            zzx zzxVar = this.d;
            agfcVar.d.add(zzxVar);
            ((aaum) zzxVar.a).m(new defpackage.agew(agfcVar, zzxVar, 0));
            if (agfcVar.j.getAndIncrement() > 0) {
                agfcVar.m.E("Already connected to the service.", new java.lang.Object[0]);
            }
            defpackage.ageu ageuVar = this.a;
            if (agfcVar.l == null && !agfcVar.f) {
                xtq xtqVar = agfcVar.m;
                xtqVar.E("Initiate binding to the service.", new java.lang.Object[0]);
                java.util.List list = agfcVar.c;
                list.add(ageuVar);
                agfcVar.k = new defpackage.adsq(agfcVar, 2);
                agfcVar.f = true;
                if (!agfcVar.a.bindService(agfcVar.g, agfcVar.k, 1)) {
                    xtqVar.E("Failed to bind to the service.", new java.lang.Object[0]);
                    agfcVar.f = false;
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((defpackage.ageu) it.next()).b(new defpackage.agfd());
                    }
                    list.clear();
                }
            } else if (agfcVar.f) {
                agfcVar.m.E("Waiting to bind to the service.", new java.lang.Object[0]);
                agfcVar.c.add(ageuVar);
            } else {
                ageuVar.run();
            }
        }
    }
}
