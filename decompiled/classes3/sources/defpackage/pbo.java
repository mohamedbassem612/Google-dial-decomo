package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pbo implements android.view.animation.Animation.AnimationListener {
    final /* synthetic */ android.view.View a;

    public pbo(android.view.View view) {
        this.a = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        aooh.f(animation, "animation");
        this.a.findViewById(2131428449);
        throw null;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(android.view.animation.Animation animation) {
        aooh.f(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(android.view.animation.Animation animation) {
        aooh.f(animation, "animation");
    }
}
