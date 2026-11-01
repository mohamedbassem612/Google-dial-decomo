package com.google.android.setupdesign.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class StickyHeaderRecyclerView extends com.google.android.setupdesign.view.HeaderRecyclerView {
    private android.view.View ac;
    private int ad;
    private final android.graphics.RectF ae;

    public StickyHeaderRecyclerView(android.content.Context context) {
        super(context);
        this.ad = 0;
        this.ae = new android.graphics.RectF();
    }

    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.graphics.RectF rectF = this.ae;
        if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.offsetLocation(-rectF.left, -rectF.top);
        return this.ab.dispatchTouchEvent(motionEvent);
    }

    public final void draw(android.graphics.Canvas canvas) {
        int top;
        super.draw(canvas);
        if (this.ac != null) {
            android.view.View view = this.ab;
            int iSave = canvas.save();
            android.view.View view2 = this.ac;
            if (view != null) {
                top = view2.getTop();
            } else {
                view = view2;
                top = 0;
            }
            if (view.getTop() + top < this.ad || !view.isShown()) {
                android.graphics.RectF rectF = this.ae;
                rectF.set(0.0f, (-top) + this.ad, view.getWidth(), (view.getHeight() - top) + this.ad);
                canvas.translate(0.0f, rectF.top);
                canvas.clipRect(0, 0, view.getWidth(), view.getHeight());
                view.draw(canvas);
            } else {
                this.ae.setEmpty();
            }
            canvas.restoreToCount(iSave);
        }
    }

    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.ad = windowInsets.getSystemWindowInsetTop();
            windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.view.View view;
        android.view.View view2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.ac == null && (view2 = this.ab) != null) {
            this.ac = view2.findViewWithTag("sticky");
        }
        if (this.ac == null || (view = this.ab) == null || view.getHeight() != 0) {
            return;
        }
        view.layout(0, -view.getMeasuredHeight(), view.getMeasuredWidth(), 0);
    }

    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.ac != null) {
            measureChild(this.ab, i, i2);
        }
    }

    public StickyHeaderRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ad = 0;
        this.ae = new android.graphics.RectF();
    }

    public StickyHeaderRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ad = 0;
        this.ae = new android.graphics.RectF();
    }
}
