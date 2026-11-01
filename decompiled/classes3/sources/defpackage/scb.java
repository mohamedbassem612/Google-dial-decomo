package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class scb implements defpackage.ahjd {
    public static final aimz a = aimz.i("com/android/dialer/patrick/impl/promo/growthkit/MyCallingCardPromoGrowthKitGateway");
    public final rlv b;
    private final smx c;
    private final aoin d;

    public scb(smx smxVar, rlv rlvVar, aoin aoinVar) {
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "enableMyCallingCardPostCallBottomSheet");
        this.c = smxVar;
        this.b = rlvVar;
        this.d = aoinVar;
    }

    @Override // defpackage.ahjd
    public final defpackage.ahjc a(apjb apjbVar) {
        if (((java.lang.Boolean) this.d.a()).booleanValue() && this.c.a()) {
            return new iwz(this, 7);
        }
        a.b().l("com/android/dialer/patrick/impl/promo/growthkit/MyCallingCardPromoGrowthKitGateway", "getRedirector", 44, "MyCallingCardPromoGrowthKitGateway.kt").v("My Calling Card post-call promo is disabled, not redirecting.");
        return null;
    }
}
