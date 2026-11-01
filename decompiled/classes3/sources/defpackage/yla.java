package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yla implements android.view.ViewGroup.OnHierarchyChangeListener {
    final /* synthetic */ com.google.android.accessibility.utils.widget.TvSurveyPromptContainer a;

    public yla(com.google.android.accessibility.utils.widget.TvSurveyPromptContainer tvSurveyPromptContainer) {
        j$.util.Objects.requireNonNull(tvSurveyPromptContainer);
        this.a = tvSurveyPromptContainer;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(android.view.View view, android.view.View view2) {
        com.google.android.accessibility.utils.widget.TvSurveyPromptContainer tvSurveyPromptContainer = this.a;
        if (tvSurveyPromptContainer.a || tvSurveyPromptContainer.a(view2)) {
            return;
        }
        android.view.ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(new defpackage.ykz(this, view2, viewTreeObserver, 0));
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(android.view.View view, android.view.View view2) {
        com.google.android.accessibility.utils.widget.TvSurveyPromptContainer tvSurveyPromptContainer = this.a;
        if (tvSurveyPromptContainer.a && tvSurveyPromptContainer.getChildCount() == 0) {
            tvSurveyPromptContainer.getRootView().findViewById(2131428714).setImportantForAccessibility(0);
            tvSurveyPromptContainer.getRootView().findViewById(2131427401).setImportantForAccessibility(0);
        }
    }
}
