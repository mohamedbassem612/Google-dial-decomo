package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class wtw implements hrq {
    private final defpackage.ahak a;

    public wtw(defpackage.ahak ahakVar) {
        this.a = ahakVar;
    }

    private final boolean o(ld ldVar) {
        return this.a.w(ldVar.b()) instanceof defpackage.wsm;
    }

    public final android.view.ViewPropertyAnimator a(ld ldVar) {
        android.view.ViewPropertyAnimator duration = ldVar.a.animate().alpha(1.0f).setDuration(150L);
        if (o(ldVar)) {
            duration.translationY(0.0f);
        }
        return duration;
    }

    public final android.view.ViewPropertyAnimator b(ld ldVar) {
        return ldVar.a.animate();
    }

    public final android.view.ViewPropertyAnimator c(ld ldVar) {
        return ldVar.a.animate();
    }

    public final android.view.ViewPropertyAnimator d(ld ldVar, int i, int i2, int i3, int i4) {
        android.view.ViewPropertyAnimator viewPropertyAnimatorAnimate = ldVar.a.animate();
        if (i3 - i != 0) {
            viewPropertyAnimatorAnimate.translationX(0.0f);
        }
        if (i4 - i2 != 0) {
            viewPropertyAnimatorAnimate.translationY(0.0f);
        }
        return viewPropertyAnimatorAnimate;
    }

    public final android.view.ViewPropertyAnimator e(ld ldVar) {
        return ldVar.a.animate().alpha(0.0f).setDuration(200L);
    }

    public final void f(ld ldVar) {
        android.view.View view = ldVar.a;
        view.setAlpha(0.0f);
        if (o(ldVar)) {
            view.setTranslationY(view.getContext().getResources().getDimensionPixelSize(2131168032));
        }
    }

    public final void h(ld ldVar) {
        ldVar.a.setAlpha(1.0f);
    }

    public final void i(ld ldVar) {
        android.view.View view = ldVar.a;
        view.setAlpha(1.0f);
        if (o(ldVar)) {
            view.setTranslationY(0.0f);
        }
    }

    public final void l(ld ldVar) {
        android.view.View view = ldVar.a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public final void m(ld ldVar) {
        ldVar.a.setAlpha(0.0f);
    }

    public final boolean n(ld ldVar, int i, int i2, int i3, int i4) {
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

    public final void g(ld ldVar) {
    }

    public final void j(ld ldVar) {
    }

    public final void k(ld ldVar) {
    }
}
