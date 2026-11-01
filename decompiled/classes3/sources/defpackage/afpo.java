package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afpo implements java.lang.Runnable {
    final /* synthetic */ defpackage.afpp a;
    private final androidx.coordinatorlayout.widget.CoordinatorLayout b;
    private final android.view.View c;

    public afpo(defpackage.afpp afppVar, androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
        j$.util.Objects.requireNonNull(afppVar);
        this.a = afppVar;
        this.b = coordinatorLayout;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.afpp afppVar;
        android.widget.OverScroller overScroller;
        android.view.View view = this.c;
        if (view == null || (overScroller = (afppVar = this.a).b) == null) {
            return;
        }
        boolean zComputeScrollOffset = overScroller.computeScrollOffset();
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = this.b;
        if (!zComputeScrollOffset) {
            afppVar.j(coordinatorLayout, view);
        } else {
            afppVar.h(coordinatorLayout, view, afppVar.b.getCurrY(), Integer.MIN_VALUE, Integer.MAX_VALUE);
            view.postOnAnimation(this);
        }
    }
}
