package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afqo extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior a;

    public afqo(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior) {
        j$.util.Objects.requireNonNull(bottomSheetBehavior);
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.a;
        bottomSheetBehavior.u(5);
        java.lang.ref.WeakReference weakReference = bottomSheetBehavior.C;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((android.view.View) bottomSheetBehavior.C.get()).requestLayout();
    }
}
