package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class agbs implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public final java.lang.ref.WeakReference a;
    private final java.lang.ref.WeakReference b;

    public agbs(defpackage.agbv agbvVar, android.view.View view) {
        this.b = new java.lang.ref.WeakReference(agbvVar);
        this.a = new java.lang.ref.WeakReference(view);
    }

    private final boolean b() {
        if (this.b.get() != null) {
            return false;
        }
        a();
        return true;
    }

    final void a() {
        java.lang.ref.WeakReference weakReference = this.a;
        if (weakReference.get() != null) {
            ((android.view.View) weakReference.get()).removeOnAttachStateChangeListener(this);
            agab.K((android.view.View) weakReference.get(), this);
        }
        weakReference.clear();
        this.b.clear();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (b()) {
            return;
        }
        defpackage.agbv agbvVar = (defpackage.agbv) this.b.get();
        java.lang.String str = defpackage.agbv.b;
        boolean z = agbvVar.l;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        if (b()) {
            return;
        }
        agab.I(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        if (b()) {
            return;
        }
        agab.K(view, this);
    }
}
