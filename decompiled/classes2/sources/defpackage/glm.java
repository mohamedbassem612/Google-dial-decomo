package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class glm extends android.animation.AnimatorListenerAdapter implements defpackage.gkw {
    private final android.view.View b;
    private final int c;
    private final android.view.ViewGroup d;
    private boolean f;
    boolean a = false;
    private final boolean e = true;

    public glm(android.view.View view, int i) {
        this.b = view;
        this.c = i;
        this.d = (android.view.ViewGroup) view.getParent();
        i(true);
    }

    private final void h() {
        if (!this.a) {
            android.view.View view = this.b;
            int i = this.c;
            int i2 = defpackage.gll.b;
            fn$.ExternalSyntheticApiModelOutline0.m(view, i);
            android.view.ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        i(false);
    }

    private final void i(boolean z) {
        android.view.ViewGroup viewGroup;
        if (!this.e || this.f == z || (viewGroup = this.d) == null) {
            return;
        }
        this.f = z;
        fn$.ExternalSyntheticApiModelOutline0.m(viewGroup, z);
    }

    @Override // defpackage.gkw
    public final void b(gkz gkzVar) {
        throw null;
    }

    @Override // defpackage.gkw
    public final void c() {
        i(false);
        if (this.a) {
            return;
        }
        android.view.View view = this.b;
        int i = this.c;
        int i2 = defpackage.gll.b;
        fn$.ExternalSyntheticApiModelOutline0.m(view, i);
    }

    @Override // defpackage.gkw
    public final void d() {
        i(true);
        if (this.a) {
            return;
        }
        android.view.View view = this.b;
        int i = defpackage.gll.b;
        fn$.ExternalSyntheticApiModelOutline0.m(view, 0);
    }

    @Override // defpackage.gkw
    public final /* synthetic */ void e(gkz gkzVar) {
        gkzVar.I(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.a = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator, boolean z) {
        if (z) {
            android.view.View view = this.b;
            int i = defpackage.gll.b;
            fn$.ExternalSyntheticApiModelOutline0.m(view, 0);
            android.view.ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }

    @Override // defpackage.gkw
    public final void f() {
    }

    @Override // defpackage.gkw
    public final void a(gkz gkzVar) {
    }

    @Override // defpackage.gkw
    public final /* synthetic */ void g(gkz gkzVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
    }
}
