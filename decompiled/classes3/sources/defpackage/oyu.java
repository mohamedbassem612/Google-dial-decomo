package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oyu {
    public static final aimz a = aimz.i("com/android/dialer/incall/answer/method/ui/TwoButtonAnswerMethodFragmentPeer");
    public final android.content.Context b;
    public final defpackage.oyr c;
    public final ems d;
    public final ahpz e;
    public final defpackage.agzc f;
    public final odo g;
    public j$.util.Optional h = j$.util.Optional.empty();
    public j$.util.Optional i = j$.util.Optional.empty();
    public final odm j = new iyh(this, 14);
    public final gpd k;
    public final defpackage.afpl l;

    public oyu(android.content.Context context, defpackage.oyr oyrVar, ems emsVar, defpackage.afpl afplVar, ahpz ahpzVar, gpd gpdVar, defpackage.agzc agzcVar, odo odoVar) {
        this.b = context;
        this.c = oyrVar;
        this.d = emsVar;
        this.l = afplVar;
        this.e = ahpzVar;
        this.k = gpdVar;
        this.f = agzcVar;
        this.g = odoVar;
    }

    private final android.view.View k() {
        return this.c.N().findViewById(2131429332);
    }

    private final android.widget.TextView l() {
        return (android.widget.TextView) this.c.N().findViewById(2131429331);
    }

    public final android.animation.Animator a() {
        android.animation.ObjectAnimator objectAnimatorOfPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder(e(), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.SCALE_X, 0.0f), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.SCALE_Y, 0.0f));
        android.animation.ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = android.animation.ObjectAnimator.ofPropertyValuesHolder(d(), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.SCALE_X, 0.0f), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.SCALE_Y, 0.0f));
        android.animation.ObjectAnimator objectAnimatorOfPropertyValuesHolder3 = android.animation.ObjectAnimator.ofPropertyValuesHolder(f(), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.SCALE_X, 0.0f), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.SCALE_Y, 0.0f));
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(b(), (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.ALPHA, 0.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(l(), (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.ALPHA, 0.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat3 = android.animation.ObjectAnimator.ofFloat(c(), (android.util.Property<android.widget.TextView, java.lang.Float>) android.view.View.ALPHA, 0.0f);
        android.animation.ObjectAnimator objectAnimatorOfFloat4 = android.animation.ObjectAnimator.ofFloat(this.c.N().findViewById(2131429335), (android.util.Property<android.view.View, java.lang.Float>) android.view.View.ALPHA, 0.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.play(objectAnimatorOfPropertyValuesHolder).with(objectAnimatorOfPropertyValuesHolder3).with(objectAnimatorOfFloat).with(objectAnimatorOfFloat3).with(objectAnimatorOfPropertyValuesHolder2).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat4);
        return animatorSet;
    }

    public final android.widget.TextView b() {
        return (android.widget.TextView) this.c.N().findViewById(2131429328);
    }

    public final android.widget.TextView c() {
        return (android.widget.TextView) this.c.N().findViewById(2131429334);
    }

    public final com.google.android.material.button.MaterialButton d() {
        return (com.google.android.material.button.MaterialButton) this.c.N().findViewById(2131429330);
    }

    public final com.google.android.material.button.MaterialButton e() {
        return (com.google.android.material.button.MaterialButton) this.c.N().findViewById(2131429327);
    }

    public final com.google.android.material.button.MaterialButton f() {
        return (com.google.android.material.button.MaterialButton) this.c.N().findViewById(2131429333);
    }

    public final void g() {
        ahoq ahoqVarW = ahvr.W(454, "TwoButtonAnswerMethodFragmentPeer_answerCall");
        try {
            j$.util.Optional optional = this.i;
            defpackage.oys oysVar = new defpackage.oys(this, 4);
            if (true == optional.isPresent()) {
                defpackage.own ownVar = (defpackage.own) optional.get();
                zas zasVarI = ((defpackage.oyu) oysVar.a).k.i(ownVar.a);
                if (ownVar.h) {
                    zasVarI.b(mce.aH);
                } else if (ownVar.l) {
                    zasVarI.b(mce.aq);
                } else if (!ownVar.i && !ownVar.f) {
                    zasVarI.b(mce.ap);
                    zasVarI.b(mce.ar);
                }
            }
            android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new mh(this, 8, (byte[]) null));
            valueAnimatorOfFloat.addListener(new defpackage.ahpv(hrz.a(this.d, new defpackage.oxr(this, 9)), this.e, 455, "answer animation finished"));
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.play(valueAnimatorOfFloat).with(a());
            animatorSet.start();
            ahoqVarW.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void h() {
        j$.util.Optional optionalOfNullable = this.i;
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(((defpackage.own) optionalOfNullable.get()).a);
        }
        this.k.i((java.lang.String) optionalOfNullable.orElse((java.lang.Object) null)).b(mce.aj);
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, -1.0f);
        valueAnimatorOfFloat.addUpdateListener(new mh(this, 8, (byte[]) null));
        valueAnimatorOfFloat.addListener(new defpackage.ahpv(hrz.a(this.d, new defpackage.oxr(this, 8)), this.e, 460, "reject Animation finished"));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.play(valueAnimatorOfFloat).with(a());
        animatorSet.start();
    }

    public final void i() {
        j$.util.Optional optional = this.i;
        defpackage.oys oysVar = new defpackage.oys(this, 5);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            java.lang.Object obj2 = oysVar.a;
            defpackage.own ownVar = (defpackage.own) obj;
            defpackage.oyu oyuVar = (defpackage.oyu) obj2;
            oyuVar.e().m(ownVar.e);
            if (ownVar.m) {
                java.lang.String string = oyuVar.b.getString(2132017661);
                oyuVar.b().setText(string);
                oyuVar.e().setContentDescription(string);
            }
        }
    }

    public final void j() {
        if (!this.i.isPresent() || ((defpackage.own) this.i.orElseThrow()).h || ((defpackage.own) this.i.orElseThrow()).i || !((defpackage.own) this.i.orElseThrow()).j) {
            k().setVisibility(8);
            com.google.android.material.button.MaterialButton materialButtonE = e();
            android.content.Context context = this.b;
            materialButtonE.setContentDescription(context.getString(2132017162));
            b().setText(context.getString(2132017660));
            return;
        }
        android.widget.TextView textViewL = l();
        android.content.Context context2 = this.b;
        textViewL.setVisibility(true == context2.getResources().getBoolean(2131034168) ? 0 : 8);
        k().setVisibility(0);
        e().setContentDescription(context2.getString(2132017663));
        b().setText(context2.getString(2132017663));
    }
}
