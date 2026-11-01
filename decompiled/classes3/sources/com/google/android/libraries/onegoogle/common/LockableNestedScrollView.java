package com.google.android.libraries.onegoogle.common;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class LockableNestedScrollView extends androidx.core.widget.NestedScrollView {
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockableNestedScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        aooh.f(context, "context");
        this.h = true;
    }

    protected final void measureChild(android.view.View view, int i, int i2) {
        aooh.f(view, "child");
        if (this.h) {
            super.measureChild(view, i, i2);
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            view.measure(androidx.core.widget.NestedScrollView.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutParams.width), androidx.core.widget.NestedScrollView.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), layoutParams.height));
        }
    }

    protected final void measureChildWithMargins(android.view.View view, int i, int i2, int i3, int i4) {
        if (this.h) {
            super.measureChildWithMargins(view, i, i2, i3, i4);
        } else if (view != null) {
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            aooh.d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            view.measure(android.view.ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), android.view.ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        }
    }

    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        aooh.f(motionEvent, "ev");
        return this.h && super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean t(android.view.View view, android.view.View view2, int i, int i2) {
        aooh.f(view, "child");
        aooh.f(view2, "target");
        return this.h && super.t(view, view2, i, i2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LockableNestedScrollView(android.content.Context context) {
        aooh.f(context, "context");
        android.util.AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ LockableNestedScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i, aooc aoocVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
