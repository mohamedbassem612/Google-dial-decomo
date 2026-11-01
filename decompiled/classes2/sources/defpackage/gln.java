package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gln extends android.animation.AnimatorListenerAdapter implements defpackage.gkw {
    final /* synthetic */ glp a;
    private final android.view.ViewGroup b;
    private final android.view.View c;
    private final android.view.View d;
    private boolean e = true;

    public gln(glp glpVar, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2) {
        this.a = glpVar;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
    }

    private final void h() {
        this.d.setTag(2131428859, null);
        this.b.getOverlay().remove(this.c);
        this.e = false;
    }

    @Override // defpackage.gkw
    public final void a(gkz gkzVar) {
        if (this.e) {
            h();
        }
    }

    @Override // defpackage.gkw
    public final void b(gkz gkzVar) {
        throw null;
    }

    @Override // defpackage.gkw
    public final /* synthetic */ void e(gkz gkzVar) {
        gkzVar.I(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(android.animation.Animator animator) {
        this.b.getOverlay().remove(this.c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(android.animation.Animator animator) {
        android.view.View view = this.c;
        if (view.getParent() == null) {
            dzs.f(this.b, view);
        } else {
            this.a.n();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator, boolean z) {
        if (z) {
            android.view.View view = this.d;
            android.view.View view2 = this.c;
            view.setTag(2131428859, view2);
            dzs.f(this.b, view2);
            this.e = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        h();
    }

    @Override // defpackage.gkw
    public final void c() {
    }

    @Override // defpackage.gkw
    public final void d() {
    }

    @Override // defpackage.gkw
    public final void f() {
    }

    @Override // defpackage.gkw
    public final /* synthetic */ void g(gkz gkzVar) {
    }
}
