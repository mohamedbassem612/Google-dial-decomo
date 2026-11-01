package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class x extends defpackage.ch {
    public final defpackage.y a;

    public x(defpackage.y yVar) {
        aooh.f(yVar, "animationInfo");
        this.a = yVar;
    }

    @Override // defpackage.ch
    public final void a(android.view.ViewGroup viewGroup) {
        aooh.f(viewGroup, "container");
        cj cjVar = this.a.a;
        android.view.View view = cjVar.a.Q;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        cjVar.f(this);
        if (bo.Z(2)) {
            android.util.Log.v("FragmentManager", a.bg(cjVar, "Animation from operation ", " has been cancelled."));
        }
    }

    @Override // defpackage.ch
    public final void b(android.view.ViewGroup viewGroup) {
        java.lang.Object obj;
        aooh.f(viewGroup, "container");
        defpackage.y yVar = this.a;
        if (yVar.b()) {
            yVar.a.f(this);
            return;
        }
        android.content.Context context = viewGroup.getContext();
        cj cjVar = yVar.a;
        android.view.View view = cjVar.a.Q;
        aooh.c(context);
        vx vxVarA = yVar.a(context);
        if (vxVarA == null || (obj = vxVarA.a) == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        if (cjVar.h != 1) {
            view.startAnimation((android.view.animation.Animation) obj);
            cjVar.f(this);
            return;
        }
        viewGroup.startViewTransition(view);
        defpackage.ba baVar = new defpackage.ba((android.view.animation.Animation) obj, viewGroup, view);
        baVar.setAnimationListener(new defpackage.w(cjVar, viewGroup, view, this));
        view.startAnimation(baVar);
        if (bo.Z(2)) {
            android.util.Log.v("FragmentManager", a.bg(cjVar, "Animation from operation ", " has started."));
        }
    }
}
