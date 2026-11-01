package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iyu implements defpackage.hrq {
    public iyu(ahak ahakVar) {
        aooh.f(ahakVar, "adapter");
    }

    @Override // defpackage.hrq
    public final android.view.ViewPropertyAnimator a(ld ldVar) {
        aooh.f(ldVar, "holder");
        android.view.ViewPropertyAnimator duration = ldVar.a.animate().scaleX(1.0f).scaleY(1.0f).setDuration(500L);
        aooh.e(duration, "setDuration(...)");
        return duration;
    }

    @Override // defpackage.hrq
    public final android.view.ViewPropertyAnimator b(ld ldVar) {
        android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = ldVar.a.animate();
        aooh.e(viewPropertyAnimatorAnimate, "animate(...)");
        return viewPropertyAnimatorAnimate;
    }

    @Override // defpackage.hrq
    public final android.view.ViewPropertyAnimator c(ld ldVar) {
        android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = ldVar.a.animate();
        aooh.e(viewPropertyAnimatorAnimate, "animate(...)");
        return viewPropertyAnimatorAnimate;
    }

    @Override // defpackage.hrq
    public final android.view.ViewPropertyAnimator d(ld ldVar, int i, int i2, int i3, int i4) {
        aooh.f(ldVar, "holder");
        android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = ldVar.a.animate();
        if (i3 - i != 0) {
            viewPropertyAnimatorAnimate.translationX(0.0f);
        }
        if (i4 - i2 != 0) {
            viewPropertyAnimatorAnimate.translationY(0.0f);
        }
        aooh.c(viewPropertyAnimatorAnimate);
        return viewPropertyAnimatorAnimate;
    }

    @Override // defpackage.hrq
    public final android.view.ViewPropertyAnimator e(ld ldVar) {
        aooh.f(ldVar, "holder");
        android.view.ViewPropertyAnimator duration = ldVar.a.animate().scaleX(0.0f).scaleY(0.0f).setDuration(500L);
        aooh.e(duration, "setDuration(...)");
        return duration;
    }

    @Override // defpackage.hrq
    public final void f(ld ldVar) {
        aooh.f(ldVar, "holder");
        android.view.View view = ldVar.a;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
    }

    @Override // defpackage.hrq
    public final void g(ld ldVar) {
        aooh.f(ldVar, "holder");
    }

    @Override // defpackage.hrq
    public final void h(ld ldVar) {
        defpackage.hhb.j(ldVar);
    }

    @Override // defpackage.hrq
    public final void i(ld ldVar) {
        defpackage.hhb.j(ldVar);
    }

    @Override // defpackage.hrq
    public final void j(ld ldVar) {
        aooh.f(ldVar, "holder");
    }

    @Override // defpackage.hrq
    public final void k(ld ldVar) {
        aooh.f(ldVar, "holder");
    }

    @Override // defpackage.hrq
    public final void l(ld ldVar) {
        aooh.f(ldVar, "holder");
        android.view.View view = ldVar.a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // defpackage.hrq
    public final void m(ld ldVar) {
        defpackage.hhb.j(ldVar);
    }

    @Override // defpackage.hrq
    public final boolean n(ld ldVar, int i, int i2, int i3, int i4) {
        aooh.f(ldVar, "holder");
        int i5 = i3 - i;
        int i6 = i4 - i2;
        android.view.View view = ldVar.a;
        if (i5 == 0) {
            i5 = 0;
            if (i6 == 0) {
                return false;
            }
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        return true;
    }
}
