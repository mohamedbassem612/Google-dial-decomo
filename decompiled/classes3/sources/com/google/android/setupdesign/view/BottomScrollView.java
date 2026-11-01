package com.google.android.setupdesign.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class BottomScrollView extends android.widget.ScrollView {
    private final java.lang.Runnable a;

    public BottomScrollView(android.content.Context context) {
        super(context);
        this.a = new fvl(this, 19);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.a);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.getMeasuredHeight();
            getPaddingBottom();
        }
        if (i4 - i2 > 0) {
            post(this.a);
        }
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    public BottomScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new fvl(this, 19);
    }

    public BottomScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new fvl(this, 19);
    }
}
