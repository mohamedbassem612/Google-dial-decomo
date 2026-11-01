package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahqp extends android.animation.AnimatorListenerAdapter {
    private final android.animation.AnimatorListenerAdapter a;
    private final ahpj b = ahns.c(false);

    public ahqp(android.animation.AnimatorListenerAdapter animatorListenerAdapter) {
        this.a = animatorListenerAdapter;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        aooh.f(animator, "animation");
        ahpe ahpeVarA = ahns.a();
        ahpj ahpjVarD = ahns.d(ahpeVarA, this.b);
        try {
            this.a.onAnimationCancel(animator);
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

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        aooh.f(animator, "animation");
        ahpe ahpeVarA = ahns.a();
        ahpj ahpjVarD = ahns.d(ahpeVarA, this.b);
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
        aooh.f(animator, "animation");
        ahpe ahpeVarA = ahns.a();
        ahpj ahpjVarD = ahns.d(ahpeVarA, this.b);
        try {
            this.a.onAnimationPause(animator);
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

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
        aooh.f(animator, "animation");
        ahpe ahpeVarA = ahns.a();
        ahpj ahpjVarD = ahns.d(ahpeVarA, this.b);
        try {
            this.a.onAnimationRepeat(animator);
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
    public final void onAnimationResume(android.animation.Animator animator) {
        aooh.f(animator, "animation");
        ahpe ahpeVarA = ahns.a();
        ahpj ahpjVarD = ahns.d(ahpeVarA, this.b);
        try {
            this.a.onAnimationResume(animator);
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

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        aooh.f(animator, "animation");
        ahpe ahpeVarA = ahns.a();
        ahpj ahpjVarD = ahns.d(ahpeVarA, this.b);
        try {
            this.a.onAnimationStart(animator);
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
}
