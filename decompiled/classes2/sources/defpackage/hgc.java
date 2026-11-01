package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class hgc extends android.animation.ValueAnimator {
    private final java.util.Set c = new java.util.concurrent.CopyOnWriteArraySet();
    public final java.util.Set a = new java.util.concurrent.CopyOnWriteArraySet();
    public final java.util.Set b = new java.util.concurrent.CopyOnWriteArraySet();

    final void a(boolean z) {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            aa$.ExternalSyntheticApiModelOutline0.m((android.animation.Animator.AnimatorListener) it.next(), this, z);
        }
    }

    @Override // android.animation.Animator
    public final void addListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.a.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(android.animation.Animator.AnimatorPauseListener animatorPauseListener) {
        this.b.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.c.add(animatorUpdateListener);
    }

    public final void b() {
        java.util.Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((android.animation.ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new java.lang.UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.a.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.c.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.a.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(android.animation.Animator.AnimatorPauseListener animatorPauseListener) {
        this.b.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.c.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final android.animation.ValueAnimator setDuration(long j) {
        throw new java.lang.UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(android.animation.TimeInterpolator timeInterpolator) {
        throw new java.lang.UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        throw new java.lang.UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}
