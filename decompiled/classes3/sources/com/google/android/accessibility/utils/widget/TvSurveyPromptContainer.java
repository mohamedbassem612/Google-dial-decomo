package com.google.android.accessibility.utils.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class TvSurveyPromptContainer extends android.widget.FrameLayout {
    public boolean a;

    public TvSurveyPromptContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        setOnHierarchyChangeListener(new defpackage.yla(this));
    }

    public final boolean a(android.view.View view) {
        if (this.a || view.getWidth() == 0) {
            return false;
        }
        if (view.requestFocus()) {
            this.a = true;
            getRootView().findViewById(2131428714).setImportantForAccessibility(4);
            getRootView().findViewById(2131427401).setImportantForAccessibility(4);
        }
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.View focusSearch(android.view.View view, int i) {
        android.view.View viewFocusSearch = super.focusSearch(view, i);
        if (viewFocusSearch != null) {
            for (android.view.ViewParent parent = viewFocusSearch.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == this) {
                    return viewFocusSearch;
                }
            }
        }
        return null;
    }
}
