package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sla implements agtk {
    final /* synthetic */ defpackage.sle a;

    public sla(defpackage.sle sleVar) {
        this.a = sleVar;
    }

    public final /* bridge */ /* synthetic */ void a(java.lang.Object obj, java.lang.Throwable th) {
        defpackage.sle.a.c().k(th).l("com/android/dialer/patrick/onboarding/ui/OnboardingFlowFragmentPeer$cameraLaunchCallback$<anonymous>", "onFailure", 282, "OnboardingFlowFragmentPeer.kt").v("Failed to prepare camera intent.");
        defpackage.sle sleVar = this.a;
        java.lang.String strY = sleVar.e.Y(2132019696);
        aooh.e(strY, "getString(...)");
        sleVar.g(strY);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Exception {
        com.android.dialer.patrick.onboarding.service.CameraUriState cameraUriState = (com.android.dialer.patrick.onboarding.service.CameraUriState) obj2;
        aooh.f(cameraUriState, "state");
        j$.util.Objects.checkIndex(0, 3);
        if (cameraUriState != null) {
            ok okVar = null;
            if (cameraUriState instanceof com.android.dialer.patrick.onboarding.service.CameraUriState.Success) {
                android.net.Uri uri = ((com.android.dialer.patrick.onboarding.service.CameraUriState.Success) cameraUriState).a;
                defpackage.sle sleVar = this.a;
                if (((java.lang.Boolean) sleVar.u.a()).booleanValue()) {
                    sleVar.t.c(uri);
                } else {
                    sleVar.D = uri;
                }
                android.content.Intent intent = new android.content.Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("output", uri);
                intent.addFlags(1);
                if (((java.lang.Boolean) sleVar.p.a()).booleanValue()) {
                    intent.addFlags(2);
                }
                try {
                    ok okVar2 = sleVar.A;
                    if (okVar2 == null) {
                        aooh.j("cameraPickMediaLauncher");
                    } else {
                        okVar = okVar2;
                    }
                    okVar.b(intent);
                    return;
                } catch (java.lang.Exception e) {
                    j$.util.Objects.checkIndex(0, 3);
                    if (!(e instanceof android.content.ActivityNotFoundException) && !(e instanceof java.lang.SecurityException)) {
                        throw e;
                    }
                    defpackage.sle.a.c().k(e).l("com/android/dialer/patrick/onboarding/ui/OnboardingFlowFragmentPeer$cameraLaunchCallback$<anonymous>", "onSuccess", 268, "OnboardingFlowFragmentPeer.kt").v("Failed to launch camera.");
                    defpackage.sle sleVar2 = this.a;
                    java.lang.String strY = sleVar2.e.Y(2132019696);
                    aooh.e(strY, "getString(...)");
                    sleVar2.g(strY);
                    return;
                }
            }
            if (cameraUriState instanceof com.android.dialer.patrick.onboarding.service.CameraUriState.NoPermission) {
                ok okVar3 = this.a.B;
                if (okVar3 == null) {
                    aooh.j("cameraPermissionLauncher");
                } else {
                    okVar = okVar3;
                }
                okVar.b("android.permission.CAMERA");
                return;
            }
        }
        throw new aois();
    }

    public final /* synthetic */ void b(java.lang.Object obj) {
    }
}
