package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class slc implements agtk {
    final /* synthetic */ defpackage.sle a;

    public slc(defpackage.sle sleVar) {
        this.a = sleVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        defpackage.sle sleVar = this.a;
        sleVar.K.u(false);
        defpackage.sle.a.c().k(th).l("com/android/dialer/patrick/onboarding/ui/OnboardingFlowFragmentPeer$deleteSelfMyCallingCardCallback$<anonymous>", "onFailure", 225, "OnboardingFlowFragmentPeer.kt").v("Failed to delete self My Calling Card.");
        java.lang.String strY = sleVar.e.Y(2132019741);
        aooh.e(strY, "getString(...)");
        sleVar.g(strY);
        if (((java.lang.Boolean) sleVar.l.a()).booleanValue() && sleVar.t.a().e == defpackage.sjj.b) {
            sleVar.a().a(mcd.bj);
        }
    }

    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        this.a.K.u(true);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        boolean zBooleanValue = ((java.lang.Boolean) obj2).booleanValue();
        defpackage.sle sleVar = this.a;
        sleVar.K.u(false);
        if (zBooleanValue) {
            defpackage.sle.a.b().l("com/android/dialer/patrick/onboarding/ui/OnboardingFlowFragmentPeer$deleteSelfMyCallingCardCallback$<anonymous>", "onSuccess", 204, "OnboardingFlowFragmentPeer.kt").v("Successfully deleted self My Calling Card.");
            if (((java.lang.Boolean) sleVar.l.a()).booleanValue() && sleVar.t.a().e == defpackage.sjj.b) {
                sleVar.a().b(mce.hN);
            }
            sleVar.c();
            return;
        }
        java.lang.String strY = sleVar.e.Y(2132019741);
        aooh.e(strY, "getString(...)");
        sleVar.g(strY);
        if (((java.lang.Boolean) sleVar.l.a()).booleanValue() && sleVar.t.a().e == defpackage.sjj.b) {
            sleVar.a().a(mcd.bj);
        }
    }
}
