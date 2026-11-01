package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class afqc implements android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ android.view.View a;
    public final /* synthetic */ dum b;

    public /* synthetic */ afqc(dum dumVar, android.view.View view, int i) {
        this.$cid = i;
        this.b = dumVar;
        this.a = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        if (this.$cid != 0) {
            if (z) {
                com.google.android.material.behavior.HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (com.google.android.material.behavior.HideBottomViewOnScrollBehavior) this.b;
                if (hideBottomViewOnScrollBehavior.e()) {
                    hideBottomViewOnScrollBehavior.f(this.a);
                    return;
                }
                return;
            }
            return;
        }
        if (z) {
            com.google.android.material.behavior.HideViewOnScrollBehavior hideViewOnScrollBehavior = (com.google.android.material.behavior.HideViewOnScrollBehavior) this.b;
            if (hideViewOnScrollBehavior.e()) {
                hideViewOnScrollBehavior.f(this.a);
            }
        }
    }
}
