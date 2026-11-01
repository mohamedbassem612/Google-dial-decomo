package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gqx implements android.view.View.OnAttachStateChangeListener {
    private final defpackage.gqy a;
    private final java.lang.ref.WeakReference b;

    public gqx(defpackage.gqy gqyVar, android.app.Activity activity) {
        this.a = gqyVar;
        this.b = new java.lang.ref.WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        aooh.f(view, "view");
        view.removeOnAttachStateChangeListener(this);
        android.app.Activity activity = (android.app.Activity) this.b.get();
        android.os.IBinder iBinderV = defpackage.fsu.v(activity);
        if (activity == null || iBinderV == null) {
            return;
        }
        this.a.b(iBinderV, activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        aooh.f(view, "view");
    }
}
