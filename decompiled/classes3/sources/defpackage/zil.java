package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zil implements defpackage.zkc {
    private static final aimz a = aimz.i("com/google/android/dialershared/crosssurfacefeature/relay/integration/featureplatform/FeaturePlatformInboundEventListener");
    private final defpackage.zij b;
    private final aonj c;

    public zil(defpackage.zij zijVar, aonj aonjVar) {
        this.b = zijVar;
        this.c = aonjVar;
    }

    @Override // defpackage.zkc
    public final void a(defpackage.zki zkiVar) {
        aooh.f(zkiVar, "message");
        albh albhVar = (albh) this.c.a(zkiVar);
        a.b().l("com/google/android/dialershared/crosssurfacefeature/relay/integration/featureplatform/FeaturePlatformInboundEventListener", "onMessage", 41, "FeaturePlatformInboundEventListener.kt").I("Received DFP message: %s, feature event: %s", zkiVar, albhVar);
        if (albhVar != null) {
            defpackage.zij zijVar = this.b;
            zijVar.b(new nhv(albhVar, zijVar, (aoln) null, 11));
        }
    }
}
