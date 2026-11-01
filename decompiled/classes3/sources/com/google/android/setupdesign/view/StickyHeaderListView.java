package com.google.android.setupdesign.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class StickyHeaderListView extends android.widget.ListView {
    private android.view.View a;
    private android.view.View b;
    private int c;
    private final android.graphics.RectF d;

    public StickyHeaderListView(android.content.Context context) {
        super(context);
        this.c = 0;
        this.d = new android.graphics.RectF();
        a(null, android.R.attr.listViewStyle);
    }

    private final void a(android.util.AttributeSet attributeSet, int i) {
        if (isInEditMode()) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.aggy.x, i, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getBoolean(1, false);
        if (resourceId != 0) {
            addHeaderView(android.view.LayoutInflater.from(getContext()).inflate(resourceId, (android.view.ViewGroup) this, false), null, false);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.graphics.RectF rectF = this.d;
        if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.offsetLocation(-rectF.left, -rectF.top);
        return this.b.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView, android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        int top;
        super.draw(canvas);
        if (this.a != null) {
            int iSave = canvas.save();
            android.view.View view = this.b;
            android.view.View view2 = this.a;
            if (view != null) {
                top = view2.getTop();
            } else {
                view = view2;
                top = 0;
            }
            if (view.getTop() + top < this.c || !view.isShown()) {
                android.graphics.RectF rectF = this.d;
                rectF.set(0.0f, (-top) + this.c, view.getWidth(), (view.getHeight() - top) + this.c);
                canvas.translate(0.0f, rectF.top);
                canvas.clipRect(0, 0, view.getWidth(), view.getHeight());
                view.draw(canvas);
            } else {
                this.d.setEmpty();
            }
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        if (getFitsSystemWindows()) {
            this.c = windowInsets.getSystemWindowInsetTop();
            windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        int i = this.a != null ? 1 : 0;
        accessibilityEvent.setItemCount(accessibilityEvent.getItemCount() - i);
        accessibilityEvent.setFromIndex(java.lang.Math.max(accessibilityEvent.getFromIndex() - i, 0));
        accessibilityEvent.setToIndex(java.lang.Math.max(accessibilityEvent.getToIndex() - i, 0));
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a == null) {
            this.a = findViewWithTag("sticky");
            this.b = findViewWithTag("stickyContainer");
        }
    }

    public StickyHeaderListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        this.d = new android.graphics.RectF();
        a(attributeSet, android.R.attr.listViewStyle);
    }

    public StickyHeaderListView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = 0;
        this.d = new android.graphics.RectF();
        a(attributeSet, i);
    }
}
