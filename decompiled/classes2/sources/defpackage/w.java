package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class w implements android.view.animation.Animation.AnimationListener {
    public static final /* synthetic */ int e = 0;
    final /* synthetic */ cj a;
    final /* synthetic */ android.view.ViewGroup b;
    final /* synthetic */ android.view.View c;
    final /* synthetic */ defpackage.x d;

    public w(cj cjVar, android.view.ViewGroup viewGroup, android.view.View view, defpackage.x xVar) {
        this.a = cjVar;
        this.b = viewGroup;
        this.c = view;
        this.d = xVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        aooh.f(animation, "animation");
        android.view.ViewGroup viewGroup = this.b;
        viewGroup.post(new defpackage.ac(viewGroup, this.c, this.d, 1));
        if (bo.Z(2)) {
            android.util.Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(android.view.animation.Animation animation) {
        aooh.f(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(android.view.animation.Animation animation) {
        aooh.f(animation, "animation");
        if (bo.Z(2)) {
            android.util.Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
        }
    }
}
