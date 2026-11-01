package com.google.android.setupdesign.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class CheckableLinearLayout extends android.widget.LinearLayout implements android.widget.Checkable {
    private boolean a;

    public CheckableLinearLayout(android.content.Context context) {
        super(context);
        this.a = false;
        setFocusable(true);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        return this.a ? mergeDrawableStates(super.onCreateDrawableState(i + 1), new int[]{android.R.attr.state_checked}) : super.onCreateDrawableState(i);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        this.a = z;
        refreshDrawableState();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.a);
    }

    public CheckableLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = false;
        setFocusable(true);
    }

    public CheckableLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = false;
        setFocusable(true);
    }

    public CheckableLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = false;
        setFocusable(true);
    }
}
