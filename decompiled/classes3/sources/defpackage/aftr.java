package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aftr extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ com.google.android.material.focus.FocusRingDrawable a;

    public aftr(com.google.android.material.focus.FocusRingDrawable focusRingDrawable) {
        j$.util.Objects.requireNonNull(focusRingDrawable);
        this.a = focusRingDrawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        super.onAnimationCancel(animator);
        com.google.android.material.focus.FocusRingDrawable focusRingDrawable = this.a;
        focusRingDrawable.b = 1.0f;
        focusRingDrawable.invalidateSelf();
    }
}
