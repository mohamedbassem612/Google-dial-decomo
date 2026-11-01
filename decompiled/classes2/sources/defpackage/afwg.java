package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class afwg extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ androidx.drawerlayout.widget.DrawerLayout a;
    final /* synthetic */ android.view.View b;

    public afwg(androidx.drawerlayout.widget.DrawerLayout drawerLayout, android.view.View view) {
        this.a = drawerLayout;
        this.b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.a;
        drawerLayout.g(this.b, false);
        drawerLayout.k(-1728053248);
    }
}
