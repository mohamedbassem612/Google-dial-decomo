package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afxb extends defpackage.emo {
    final /* synthetic */ com.google.android.material.navigation.NavigationView a;
    private java.lang.ref.WeakReference b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afxb(com.google.android.material.navigation.NavigationView navigationView) {
        super(null);
        j$.util.Objects.requireNonNull(navigationView);
        this.a = navigationView;
        this.b = null;
    }

    private final void k() {
        android.app.Activity activityO;
        if (this.b == null) {
            com.google.android.material.navigation.NavigationView navigationView = this.a;
            android.view.View currentFocus = null;
            if (!navigationView.hasFocus() && (activityO = defpackage.agab.O(navigationView.getContext())) != null) {
                currentFocus = activityO.getCurrentFocus();
            }
            this.b = new java.lang.ref.WeakReference(currentFocus);
        }
    }

    private static final boolean l(android.view.View view) {
        return view.isAttachedToWindow() && !view.isInTouchMode();
    }

    @Override // defpackage.emo
    public final void d(android.view.View view) {
        java.lang.ref.WeakReference weakReference;
        if (view != this.a || (weakReference = this.b) == null) {
            return;
        }
        android.view.View view2 = (android.view.View) weakReference.get();
        if (view2 == null || !l(view2)) {
            j();
        } else {
            view2.requestFocus();
            j();
        }
    }

    @Override // defpackage.emo
    public final void e(android.view.View view) {
        if (view == this.a) {
            k();
            if (l(view)) {
                view.requestFocus();
            }
        }
    }

    @Override // defpackage.emo
    public final void f(android.view.View view) {
        if (view == this.a) {
            if ((view.getParent() instanceof androidx.drawerlayout.widget.DrawerLayout) && ((androidx.drawerlayout.widget.DrawerLayout) view.getParent()).o(view)) {
                return;
            }
            k();
        }
    }

    public final void j() {
        this.b = null;
    }
}
