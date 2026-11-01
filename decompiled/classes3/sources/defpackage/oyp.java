package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oyp {
    public static final aimz a = aimz.i("com/android/dialer/incall/answer/method/ui/TwoButtonAnswerLargeScreenMethodFragmentPeer");
    public final defpackage.oym b;
    public final ems c;
    public final ahpz d;
    public final defpackage.agzc e;
    public final odo f;
    public defpackage.oyf g;
    public defpackage.own h;
    public final iyh i;
    public final gpd j;
    public final defpackage.afpl k;

    public oyp(defpackage.oym oymVar, ems emsVar, defpackage.afpl afplVar, ahpz ahpzVar, gpd gpdVar, defpackage.agzc agzcVar, odo odoVar) {
        aooh.f(emsVar, "lifecycle");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(agzcVar, "localSubscriptionMixin");
        this.b = oymVar;
        this.c = emsVar;
        this.k = afplVar;
        this.d = ahpzVar;
        this.j = gpdVar;
        this.e = agzcVar;
        this.f = odoVar;
        this.i = new iyh(this, 13);
    }

    public static final boolean n(defpackage.own ownVar) {
        return (ownVar.h || ownVar.i || !ownVar.k) ? false : true;
    }

    public static final void o(android.view.View view) {
        view.setAlpha(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    private static final android.animation.ObjectAnimator p(android.view.View view) {
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.ALPHA, 0.0f);
        aooh.e(objectAnimatorOfFloat, "ofFloat(...)");
        return objectAnimatorOfFloat;
    }

    private static final android.animation.ObjectAnimator q(android.view.View view) {
        android.animation.ObjectAnimator objectAnimatorOfPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder(view, android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.SCALE_X, 0.0f), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.SCALE_Y, 0.0f));
        aooh.e(objectAnimatorOfPropertyValuesHolder, "ofPropertyValuesHolder(...)");
        return objectAnimatorOfPropertyValuesHolder;
    }

    public final android.widget.TextView a() {
        android.view.View viewFindViewById = this.b.N().findViewById(2131428440);
        aooh.e(viewFindViewById, "findViewById(...)");
        return (android.widget.TextView) viewFindViewById;
    }

    public final android.widget.TextView b() {
        android.view.View viewFindViewById = this.b.N().findViewById(2131429262);
        aooh.e(viewFindViewById, "findViewById(...)");
        return (android.widget.TextView) viewFindViewById;
    }

    public final android.widget.TextView c() {
        android.view.View viewFindViewById = this.b.N().findViewById(2131429264);
        aooh.e(viewFindViewById, "findViewById(...)");
        return (android.widget.TextView) viewFindViewById;
    }

    public final android.widget.TextView d() {
        android.view.View viewFindViewById = this.b.N().findViewById(2131429266);
        aooh.e(viewFindViewById, "findViewById(...)");
        return (android.widget.TextView) viewFindViewById;
    }

    public final com.google.android.material.button.MaterialButton e() {
        java.lang.Object objFindViewById = this.b.N().findViewById(2131429261);
        aooh.e(objFindViewById, "findViewById(...)");
        return (com.google.android.material.button.MaterialButton) objFindViewById;
    }

    public final com.google.android.material.button.MaterialButton f() {
        java.lang.Object objFindViewById = this.b.N().findViewById(2131429263);
        aooh.e(objFindViewById, "findViewById(...)");
        return (com.google.android.material.button.MaterialButton) objFindViewById;
    }

    public final com.google.android.material.button.MaterialButton g() {
        java.lang.Object objFindViewById = this.b.N().findViewById(2131429265);
        aooh.e(objFindViewById, "findViewById(...)");
        return (com.google.android.material.button.MaterialButton) objFindViewById;
    }

    public final com.google.android.material.button.MaterialButton h() {
        java.lang.Object objFindViewById = this.b.N().findViewById(2131429336);
        aooh.e(objFindViewById, "findViewById(...)");
        return (com.google.android.material.button.MaterialButton) objFindViewById;
    }

    public final com.google.android.material.button.MaterialButton i() {
        java.lang.Object objFindViewById = this.b.N().findViewById(2131429337);
        aooh.e(objFindViewById, "findViewById(...)");
        return (com.google.android.material.button.MaterialButton) objFindViewById;
    }

    public final void j(java.lang.String str, aonj aonjVar) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, -1.0f);
        valueAnimatorOfFloat.addUpdateListener(new mh(this, 7, (byte[]) null));
        valueAnimatorOfFloat.addListener(new defpackage.ahpv(hrz.a(this.c, new obo(this, aonjVar, 2)), this.d, 447, str));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        android.animation.AnimatorSet.Builder builderPlay = animatorSet.play(valueAnimatorOfFloat);
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        defpackage.own ownVar = this.h;
        if (ownVar == null || !n(ownVar)) {
            animatorSet2.play(q(h())).with(q(i())).with(p(a()));
        } else {
            animatorSet2.play(q(e())).with(p(b())).with(q(g())).with(p(d())).with(q(f())).with(p(c())).with(p(a()));
        }
        builderPlay.with(animatorSet2);
        animatorSet.start();
    }

    public final void k() {
        ahoq ahoqVarW = ahvr.W(446, "TwoButtonAnswerLargeScreenMethodFragmentPeer_answerCall");
        try {
            defpackage.own ownVar = this.h;
            if (ownVar != null) {
                zas zasVarI = this.j.i(ownVar.a);
                if (ownVar.h) {
                    zasVarI.b(mce.aH);
                } else if (ownVar.l) {
                    zasVarI.b(mce.aq);
                } else if (!ownVar.f && !ownVar.i) {
                    zasVarI.b(mce.ap);
                    zasVarI.b(mce.ar);
                }
            }
            j("answer animation finished", new opy(this, 4));
            ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahoqVarW, th);
                throw th2;
            }
        }
    }

    public final void l() {
        defpackage.own ownVar = this.h;
        this.j.i(ownVar != null ? ownVar.a : null).b(mce.aj);
        j("reject Animation finished", new opy(this, 3));
    }

    public final void m(boolean z) {
        defpackage.oym oymVar = this.b;
        android.view.View viewFindViewById = oymVar.N().findViewById(2131428442);
        aooh.e(viewFindViewById, "findViewById(...)");
        int i = true != z ? 0 : 8;
        viewFindViewById.setVisibility(i);
        i().setVisibility(i);
        h().setVisibility(i);
        android.view.View viewFindViewById2 = oymVar.N().findViewById(2131428441);
        aooh.e(viewFindViewById2, "findViewById(...)");
        viewFindViewById2.setVisibility(true != z ? 8 : 0);
    }
}
