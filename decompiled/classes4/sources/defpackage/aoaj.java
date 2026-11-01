package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoaj implements defpackage.anom {
    public defpackage.aoan a;
    final /* synthetic */ defpackage.aoap b;

    public aoaj(defpackage.aoap aoapVar) {
        j$.util.Objects.requireNonNull(aoapVar);
        this.b = aoapVar;
    }

    @Override // defpackage.anom
    public final void a(defpackage.anmn anmnVar) {
        defpackage.aoap aoapVar = this.b;
        if (aoapVar.p) {
            defpackage.aoap.f.logp(java.util.logging.Level.WARNING, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Ignoring health status {0} for subchannel {1} as this is not under a petiole policy", new java.lang.Object[]{anmnVar, this.a.a});
            return;
        }
        defpackage.aoap.f.logp(java.util.logging.Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer$HealthListener", "onSubchannelState", "Received health status {0} for subchannel {1}", new java.lang.Object[]{anmnVar, this.a.a});
        this.a.d = anmnVar;
        defpackage.aoak aoakVar = aoapVar.k;
        if (aoakVar.f() && this.a == aoapVar.j.get(aoakVar.b())) {
            aoapVar.i(this.a);
        }
    }
}
