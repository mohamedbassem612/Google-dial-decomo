package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dey extends android.view.ViewGroup {
    public final java.util.HashMap a;
    public final java.util.HashMap b;

    public dey(android.content.Context context) {
        super(context);
        setClipChildren(false);
        this.a = new java.util.HashMap();
        this.b = new java.util.HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (defpackage.dqc dqcVar : this.a.keySet()) {
            dqcVar.layout(dqcVar.getLeft(), dqcVar.getTop(), dqcVar.getRight(), dqcVar.getBottom());
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        if (android.view.View.MeasureSpec.getMode(i) != 1073741824) {
            cwh.c("widthMeasureSpec should be EXACTLY");
        }
        if (android.view.View.MeasureSpec.getMode(i2) != 1073741824) {
            cwh.c("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), android.view.View.MeasureSpec.getSize(i2));
        for (defpackage.dqc dqcVar : this.a.keySet()) {
            int i4 = dqcVar.u;
            if (i4 != Integer.MIN_VALUE && (i3 = dqcVar.v) != Integer.MIN_VALUE) {
                dqcVar.measure(i4, i3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            dbk dbkVar = (dbk) this.a.get(childAt);
            if (childAt.isLayoutRequested() && dbkVar != null) {
                dbkVar.W(false, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(android.view.View view, android.view.View view2) {
    }
}
