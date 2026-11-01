package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahpv implements android.animation.Animator.AnimatorListener {
    final /* synthetic */ android.animation.Animator.AnimatorListener a;
    final /* synthetic */ ahpz b;
    final /* synthetic */ int c;
    final /* synthetic */ java.lang.String d;

    public ahpv(android.animation.Animator.AnimatorListener animatorListener, ahpz ahpzVar, int i, java.lang.String str) {
        this.a = animatorListener;
        this.b = ahpzVar;
        this.c = i;
        this.d = str;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        aooh.f(animator, "animation");
        this.a.onAnimationCancel(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        aooh.f(animator, "animation");
        android.animation.Animator.AnimatorListener animatorListener = this.a;
        if (!agab.aw()) {
            animatorListener.onAnimationEnd(animator);
            return;
        }
        java.lang.String str = this.d;
        ahok ahokVarF = this.b.f(this.c, str);
        try {
            animatorListener.onAnimationEnd(animator);
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
        aooh.f(animator, "animation");
        android.animation.Animator.AnimatorListener animatorListener = this.a;
        ahok ahokVarF = this.b.f(this.c, this.d);
        try {
            animatorListener.onAnimationRepeat(animator);
            ajsz.ak(ahokVarF, (java.lang.Throwable) null);
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(ahokVarF, th);
                throw th2;
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        aooh.f(animator, "animation");
        this.a.onAnimationStart(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator, boolean z) {
        aooh.f(animator, "animation");
        this.a.onAnimationStart(animator, z);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator, boolean z) {
        aooh.f(animator, "animation");
        android.animation.Animator.AnimatorListener animatorListener = this.a;
        if (agab.aw()) {
            java.lang.String str = this.d;
            ahok ahokVarF = this.b.f(this.c, str);
            try {
                animatorListener.onAnimationEnd(animator, z);
                ajsz.ak(ahokVarF, (java.lang.Throwable) null);
                return;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak(ahokVarF, th);
                    throw th2;
                }
            }
        }
        animatorListener.onAnimationEnd(animator, z);
    }
}
