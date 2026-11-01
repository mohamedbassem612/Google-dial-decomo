package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vtm implements android.animation.Animator.AnimatorListener {
    final /* synthetic */ com.android.dialer.voicemail.settings.widget.RecordLottieView a;
    private final defpackage.aprf b;

    public vtm(com.android.dialer.voicemail.settings.widget.RecordLottieView recordLottieView, defpackage.aprf aprfVar) {
        j$.util.Objects.requireNonNull(recordLottieView);
        this.a = recordLottieView;
        this.b = aprfVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.a.f(this);
        com.android.dialer.voicemail.settings.widget.RecordLottieViewContainer recordLottieViewContainer = (com.android.dialer.voicemail.settings.widget.RecordLottieViewContainer) this.b.a;
        recordLottieViewContainer.callOnClick();
        recordLottieViewContainer.a(3, 0.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
