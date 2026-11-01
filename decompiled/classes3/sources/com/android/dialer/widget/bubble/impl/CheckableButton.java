package com.android.dialer.widget.bubble.impl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class CheckableButton extends hj implements android.widget.Checkable {
    private static final int[] c = {android.R.attr.state_checked};
    public boolean b;

    public CheckableButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.imageButtonStyle);
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.b;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.b) {
            mergeDrawableStates(iArrOnCreateDrawableState, c);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.b != z) {
            this.b = z;
            refreshDrawableState();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.b);
    }

    public CheckableButton(android.content.Context context) {
        this(context, null);
    }

    public CheckableButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
