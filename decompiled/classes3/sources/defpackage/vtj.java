package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vtj implements android.view.animation.Animation.AnimationListener {
    final /* synthetic */ android.view.animation.Animation a;
    final /* synthetic */ com.android.dialer.voicemail.settings.widget.RecordLottieView b;
    final /* synthetic */ defpackage.aprf c;

    public vtj(com.android.dialer.voicemail.settings.widget.RecordLottieView recordLottieView, android.view.animation.Animation animation, defpackage.aprf aprfVar) {
        this.a = animation;
        this.c = aprfVar;
        j$.util.Objects.requireNonNull(recordLottieView);
        this.b = recordLottieView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        this.a.setAnimationListener(null);
        ((com.android.dialer.voicemail.settings.widget.RecordLottieViewContainer) this.c.a).a(5, 0.0f);
        this.b.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(android.view.animation.Animation animation) {
    }
}
