package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afqd implements android.view.View.OnAttachStateChangeListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ dum a;

    public afqd(com.google.android.material.behavior.HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(hideBottomViewOnScrollBehavior);
        this.a = hideBottomViewOnScrollBehavior;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        android.view.accessibility.AccessibilityManager accessibilityManager;
        android.view.accessibility.AccessibilityManager accessibilityManager2;
        int i = this.$cid;
        dum dumVar = this.a;
        if (i != 0) {
            com.google.android.material.behavior.HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (com.google.android.material.behavior.HideBottomViewOnScrollBehavior) dumVar;
            android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = hideBottomViewOnScrollBehavior.b;
            if (touchExplorationStateChangeListener == null || (accessibilityManager2 = hideBottomViewOnScrollBehavior.a) == null) {
                return;
            }
            accessibilityManager2.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
            hideBottomViewOnScrollBehavior.b = null;
            return;
        }
        com.google.android.material.behavior.HideViewOnScrollBehavior hideViewOnScrollBehavior = (com.google.android.material.behavior.HideViewOnScrollBehavior) dumVar;
        android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener2 = hideViewOnScrollBehavior.b;
        if (touchExplorationStateChangeListener2 == null || (accessibilityManager = hideViewOnScrollBehavior.a) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener2);
        hideViewOnScrollBehavior.b = null;
    }

    public afqd(com.google.android.material.behavior.HideViewOnScrollBehavior hideViewOnScrollBehavior, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(hideViewOnScrollBehavior);
        this.a = hideViewOnScrollBehavior;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }
}
