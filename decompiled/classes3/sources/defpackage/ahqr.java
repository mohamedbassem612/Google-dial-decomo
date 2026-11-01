package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahqr extends android.animation.AnimatorListenerAdapter {
    private final android.animation.Animator.AnimatorListener a;
    private final android.animation.Animator.AnimatorPauseListener b;
    private ahpj c;

    public ahqr(android.animation.Animator.AnimatorListener animatorListener, android.animation.Animator.AnimatorPauseListener animatorPauseListener) {
        this.a = animatorListener;
        this.b = animatorPauseListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        aooh.f(animator, "animator");
        this.c = null;
        this.a.onAnimationCancel(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        aooh.f(animator, "animator");
        ahpj ahpjVar = this.c;
        this.c = null;
        if (ahns.q() || ahpjVar == null) {
            this.a.onAnimationEnd(animator);
            return;
        }
        ahpe ahpeVarA = ahns.a();
        ahpj ahpjVarD = ahns.d(ahpeVarA, ahpjVar);
        try {
            this.a.onAnimationEnd(animator);
            ahns.d(ahpeVarA, ahpjVarD);
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahnn.b(th);
                throw th;
            } catch (java.lang.Throwable th2) {
                ahns.d(ahpeVarA, ahpjVarD);
                throw th2;
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(android.animation.Animator animator) {
        aooh.f(animator, "animator");
        this.c = null;
        android.animation.Animator.AnimatorPauseListener animatorPauseListener = this.b;
        if (animatorPauseListener != null) {
            animatorPauseListener.onAnimationPause(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
        aooh.f(animator, "animator");
        this.c = null;
        this.a.onAnimationRepeat(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(android.animation.Animator animator) {
        aooh.f(animator, "animator");
        this.c = ahns.c(false);
        android.animation.Animator.AnimatorPauseListener animatorPauseListener = this.b;
        if (animatorPauseListener != null) {
            animatorPauseListener.onAnimationResume(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        aooh.f(animator, "animator");
        this.c = ahns.c(false);
        this.a.onAnimationStart(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator, boolean z) {
        aooh.f(animator, "animator");
        this.c = ahns.c(false);
        this.a.onAnimationStart(animator, z);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator, boolean z) {
        aooh.f(animator, "animator");
        ahpj ahpjVar = this.c;
        this.c = null;
        if (!ahns.q() && ahpjVar != null) {
            ahpe ahpeVarA = ahns.a();
            ahpj ahpjVarD = ahns.d(ahpeVarA, ahpjVar);
            try {
                this.a.onAnimationEnd(animator, z);
                ahns.d(ahpeVarA, ahpjVarD);
                return;
            } catch (java.lang.Throwable th) {
                try {
                    defpackage.ahnn.b(th);
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ahns.d(ahpeVarA, ahpjVarD);
                    throw th2;
                }
            }
        }
        this.a.onAnimationEnd(animator, z);
    }
}
