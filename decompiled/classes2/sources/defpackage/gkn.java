package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gkn extends android.animation.AnimatorListenerAdapter implements defpackage.gkw {
    private final android.view.View a;
    private boolean b = false;

    public gkn(android.view.View view) {
        this.a = view;
    }

    @Override // defpackage.gkw
    public final void c() {
        float fM;
        android.view.View view = this.a;
        if (view.getVisibility() == 0) {
            int i = defpackage.gll.b;
            fM = fn$.ExternalSyntheticApiModelOutline0.m(view);
        } else {
            fM = 0.0f;
        }
        view.setTag(2131429318, java.lang.Float.valueOf(fM));
    }

    @Override // defpackage.gkw
    public final void d() {
        this.a.setTag(2131429318, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        int i = defpackage.gll.b;
        fn$.ExternalSyntheticApiModelOutline0.m(this.a, 1.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator, boolean z) {
        if (this.b) {
            this.a.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        android.view.View view = this.a;
        int i = defpackage.gll.b;
        fn$.ExternalSyntheticApiModelOutline0.m(view, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        android.view.View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // defpackage.gkw
    public final void f() {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // defpackage.gkw
    public final void a(gkz gkzVar) {
    }

    @Override // defpackage.gkw
    public final void b(gkz gkzVar) {
    }

    @Override // defpackage.gkw
    public final /* synthetic */ void e(gkz gkzVar) {
    }

    @Override // defpackage.gkw
    public final void g(gkz gkzVar) {
    }
}
