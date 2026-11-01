package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aa extends defpackage.ch {
    public final defpackage.y a;
    private android.animation.AnimatorSet b;

    public aa(defpackage.y yVar) {
        aooh.f(yVar, "animatorInfo");
        this.a = yVar;
    }

    @Override // defpackage.ch
    public final void a(android.view.ViewGroup viewGroup) {
        aooh.f(viewGroup, "container");
        android.animation.AnimatorSet animatorSet = this.b;
        defpackage.y yVar = this.a;
        if (animatorSet == null) {
            yVar.a.f(this);
            return;
        }
        cj cjVar = yVar.a;
        if (cjVar.d) {
            aa$.ExternalSyntheticApiModelOutline0.m(animatorSet);
        } else {
            animatorSet.end();
        }
        if (bo.Z(2)) {
            android.util.Log.v("FragmentManager", "Animator from operation " + cjVar + " has been canceled" + (true != cjVar.d ? "." : " with seeking.") + ' ');
        }
    }

    @Override // defpackage.ch
    public final void b(android.view.ViewGroup viewGroup) {
        aooh.f(viewGroup, "container");
        cj cjVar = this.a.a;
        android.animation.AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            cjVar.f(this);
            return;
        }
        animatorSet.start();
        if (bo.Z(2)) {
            android.util.Log.v("FragmentManager", a.bg(cjVar, "Animator from operation ", " has started."));
        }
    }

    @Override // defpackage.ch
    public final void c(defpackage.mk mkVar, android.view.ViewGroup viewGroup) {
        aooh.f(viewGroup, "container");
        cj cjVar = this.a.a;
        android.animation.AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            cjVar.f(this);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 34 || !cjVar.a.t) {
            return;
        }
        if (bo.Z(2)) {
            java.util.Objects.toString(cjVar);
            android.util.Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation ".concat(java.lang.String.valueOf(cjVar)));
        }
        long jM = aa$.ExternalSyntheticApiModelOutline1.m(animatorSet);
        long j = (long) (mkVar.b * jM);
        if (j == 0) {
            j = 1;
        }
        if (j == jM) {
            j = (-1) + jM;
        }
        if (bo.Z(2)) {
            android.util.Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + cjVar);
        }
        aa$.ExternalSyntheticApiModelOutline0.m(animatorSet, j);
    }

    @Override // defpackage.ch
    public final void d(android.view.ViewGroup viewGroup) {
        defpackage.aa aaVar;
        aooh.f(viewGroup, "container");
        defpackage.y yVar = this.a;
        if (yVar.b()) {
            return;
        }
        android.content.Context context = viewGroup.getContext();
        aooh.c(context);
        vx vxVarA = yVar.a(context);
        this.b = (android.animation.AnimatorSet) (vxVarA != null ? vxVarA.b : null);
        cj cjVar = yVar.a;
        aw awVar = cjVar.a;
        boolean z = cjVar.h == 3;
        android.view.View view = awVar.Q;
        viewGroup.startViewTransition(view);
        android.animation.AnimatorSet animatorSet = this.b;
        if (animatorSet != null) {
            aaVar = this;
            animatorSet.addListener(new defpackage.z(viewGroup, view, z, cjVar, aaVar));
        } else {
            aaVar = this;
        }
        android.animation.AnimatorSet animatorSet2 = aaVar.b;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }

    @Override // defpackage.ch
    public final boolean e() {
        return true;
    }
}
