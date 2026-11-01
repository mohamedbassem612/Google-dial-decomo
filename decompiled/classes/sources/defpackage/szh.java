package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class szh implements defpackage.zta {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/revelio/impl/tidepods/impl/precall/RevelioOngoingPrecallIntegration");
    private final defpackage.zjm b;

    public szh(defpackage.zjm zjmVar) {
        this.b = zjmVar;
    }

    @Override // defpackage.zta
    public final al a(zrx zrxVar) {
        defpackage.aooh.f(zrxVar, "callParameter");
        szi sziVar = new szi();
        defpackage.amxr.g(sziVar);
        defpackage.ahgl.b(sziVar, zrxVar);
        return sziVar;
    }

    @Override // defpackage.zta
    public final defpackage.ajcq b(zrx zrxVar) {
        defpackage.aooh.f(zrxVar, "callParameter");
        j$.util.Optional optionalG = this.b.g();
        defpackage.aooh.e(optionalG, "getFeature(...)");
        defpackage.swv swvVar = (defpackage.swv) defpackage.aooh.q(optionalG);
        if (swvVar == null) {
            ((defpackage.aimw) a.b().l("com/android/dialer/revelio/impl/tidepods/impl/precall/RevelioOngoingPrecallIntegration", "requestDecision", 23, "RevelioOngoingPrecallIntegration.kt")).v("Revelio unavailable");
            return defpackage.aiql.z(zsz.b);
        }
        boolean zC = swvVar.c();
        defpackage.aimz aimzVar = a;
        if (zC) {
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/precall/RevelioOngoingPrecallIntegration", "requestDecision", 27, "RevelioOngoingPrecallIntegration.kt")).v("Tidepods Revelio currently running");
            return defpackage.aiql.z(zsz.c);
        }
        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/revelio/impl/tidepods/impl/precall/RevelioOngoingPrecallIntegration", "requestDecision", 30, "RevelioOngoingPrecallIntegration.kt")).v("Revelio not running");
        return defpackage.aiql.z(zsz.b);
    }

    @Override // defpackage.zta
    public final /* synthetic */ defpackage.ajcq c(zrx zrxVar) {
        return defpackage.aiql.z(zrxVar);
    }
}
