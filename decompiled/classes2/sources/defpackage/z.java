package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class z extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ android.view.ViewGroup a;
    final /* synthetic */ android.view.View b;
    final /* synthetic */ boolean c;
    final /* synthetic */ cj d;
    final /* synthetic */ defpackage.aa e;

    public z(android.view.ViewGroup viewGroup, android.view.View view, boolean z, cj cjVar, defpackage.aa aaVar) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = cjVar;
        this.e = aaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        aooh.f(animator, "anim");
        android.view.View view = this.b;
        android.view.ViewGroup viewGroup = this.a;
        viewGroup.endViewTransition(view);
        if (this.c || this.d.h == 3) {
            int i = this.d.h;
            aooh.c(view);
            den.bR(i, view, viewGroup);
        }
        defpackage.aa aaVar = this.e;
        aaVar.a.a.f(aaVar);
        if (bo.Z(2)) {
            android.util.Log.v("FragmentManager", "Animator from operation " + this.d + " has ended.");
        }
    }
}
