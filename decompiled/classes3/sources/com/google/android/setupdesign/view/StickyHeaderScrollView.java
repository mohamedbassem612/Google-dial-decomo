package com.google.android.setupdesign.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class StickyHeaderScrollView extends com.google.android.setupdesign.view.BottomScrollView {
    private android.view.View a;
    private android.view.View b;
    private int c;

    public StickyHeaderScrollView(android.content.Context context) {
        super(context);
        this.c = 0;
    }

    private final void a() {
        int top;
        android.view.View view = this.a;
        if (view != null) {
            android.view.View view2 = this.b;
            if (view2 != null) {
                top = view.getTop();
            } else {
                view2 = view;
                top = 0;
            }
            if ((view2.getTop() - getScrollY()) + top < this.c || !view2.isShown()) {
                view2.setTranslationY(getScrollY() - top);
            } else {
                view2.setTranslationY(0.0f);
            }
        }
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        if (!getFitsSystemWindows()) {
            return windowInsets;
        }
        this.c = windowInsets.getSystemWindowInsetTop();
        return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
    }

    @Override // com.google.android.setupdesign.view.BottomScrollView, android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a == null) {
            this.a = findViewWithTag("sticky");
            this.b = findViewWithTag("stickyContainer");
        }
        a();
    }

    @Override // com.google.android.setupdesign.view.BottomScrollView, android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        a();
    }

    public StickyHeaderScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
    }

    public StickyHeaderScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 0;
    }
}
