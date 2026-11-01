package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class obr {
    public static final aimz a = aimz.i("com/android/dialer/emergencycalling/impl/ui/EmergencyFeatureModalTransitionWithAnimation");
    public final ahpz b;
    public final xm c;
    public final gpd d;
    private final zpm e;
    private final defpackage.nwj f;

    public obr(ahpz ahpzVar, gpd gpdVar, zpm zpmVar, defpackage.nwj nwjVar, xm xmVar) {
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(zpmVar, "callScopes");
        aooh.f(xmVar, "emergencyVoiceFragmentState");
        this.b = ahpzVar;
        this.d = gpdVar;
        this.e = zpmVar;
        this.f = nwjVar;
        this.c = xmVar;
    }

    public static final android.animation.Animator c(android.view.View view, android.content.Context context, long j) {
        android.animation.Animator animatorLoadAnimator = android.animation.AnimatorInflater.loadAnimator(context, 2130837507);
        aooh.d(animatorLoadAnimator, "null cannot be cast to non-null type android.animation.AnimatorSet");
        android.animation.AnimatorSet animatorSet = (android.animation.AnimatorSet) animatorLoadAnimator;
        animatorSet.setTarget(view);
        animatorSet.setStartDelay(j);
        return animatorLoadAnimator;
    }

    public final defpackage.obd a(defpackage.obf obfVar) {
        return this.f.c(obfVar);
    }

    public final qbe b(java.lang.String str) {
        defpackage.obq obqVar;
        j$.util.Optional optionalE = this.e.e(str);
        aooh.e(optionalE, "get(...)");
        apqr apqrVar = (apqr) aooh.q(optionalE);
        if (apqrVar == null || (obqVar = (defpackage.obq) apqrVar.a(defpackage.obq.class)) == null) {
            return null;
        }
        return obqVar.cp();
    }
}
