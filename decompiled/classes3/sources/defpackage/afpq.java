package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class afpq extends defpackage.afps {
    public final android.graphics.Rect a;
    final android.graphics.Rect b;
    public int c;
    public int d;

    public afpq() {
        this.a = new android.graphics.Rect();
        this.b = new android.graphics.Rect();
        this.c = 0;
    }

    public float e(android.view.View view) {
        throw null;
    }

    public int f(android.view.View view) {
        throw null;
    }

    @Override // defpackage.afps
    protected final void fh(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        android.view.View viewG = g(coordinatorLayout.a(view));
        if (viewG == null) {
            coordinatorLayout.j(view, i);
            this.c = 0;
            return;
        }
        dup layoutParams = view.getLayoutParams();
        android.graphics.Rect rect = this.a;
        rect.set(coordinatorLayout.getPaddingLeft() + layoutParams.leftMargin, viewG.getBottom() + layoutParams.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - layoutParams.rightMargin, ((coordinatorLayout.getHeight() + viewG.getBottom()) - coordinatorLayout.getPaddingBottom()) - layoutParams.bottomMargin);
        eax eaxVar = coordinatorLayout.e;
        if (eaxVar != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += eaxVar.b();
            rect.right -= eaxVar.c();
        }
        android.graphics.Rect rect2 = this.b;
        int i2 = layoutParams.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        android.view.Gravity.apply(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int i3 = i(viewG);
        view.layout(rect2.left, rect2.top - i3, rect2.right, rect2.bottom - i3);
        this.c = rect2.top - viewG.getBottom();
    }

    public abstract android.view.View g(java.util.List list);

    public final int i(android.view.View view) {
        if (this.d == 0) {
            return 0;
        }
        float fE = e(view);
        int i = this.d;
        return dzk.B((int) (fE * i), 0, i);
    }

    protected boolean k() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:19:0x0045  */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public final boolean onMeasureChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3, int i4) {
        android.view.View viewG;
        int size;
        int iF;
        int measuredHeight;
        int i5;
        eax eaxVar;
        int i6 = view.getLayoutParams().height;
        if (i6 == -1) {
            viewG = g(coordinatorLayout.a(view));
            if (viewG != null) {
                size = android.view.View.MeasureSpec.getSize(i3);
                if (size > 0) {
                    size = coordinatorLayout.getHeight();
                } else if (viewG.getFitsSystemWindows() && (eaxVar = coordinatorLayout.e) != null) {
                    size += eaxVar.d() + eaxVar.a();
                }
                iF = size + f(viewG);
                measuredHeight = viewG.getMeasuredHeight();
                if (k()) {
                    view.setTranslationY(-measuredHeight);
                } else {
                    view.setTranslationY(0.0f);
                    iF -= measuredHeight;
                }
                if (i6 == -1) {
                    i5 = 1073741824;
                } else {
                    i5 = Integer.MIN_VALUE;
                }
                coordinatorLayout.k(view, i, i2, android.view.View.MeasureSpec.makeMeasureSpec(iF, i5), i4);
                return true;
            }
        } else if (i6 == -2) {
            i6 = -2;
            viewG = g(coordinatorLayout.a(view));
            if (viewG != null) {
                size = android.view.View.MeasureSpec.getSize(i3);
                if (size > 0) {
                    size = coordinatorLayout.getHeight();
                } else if (viewG.getFitsSystemWindows()) {
                    size += eaxVar.d() + eaxVar.a();
                }
                iF = size + f(viewG);
                measuredHeight = viewG.getMeasuredHeight();
                if (k()) {
                    view.setTranslationY(-measuredHeight);
                } else {
                    view.setTranslationY(0.0f);
                    iF -= measuredHeight;
                }
                if (i6 == -1) {
                    i5 = 1073741824;
                } else {
                    i5 = Integer.MIN_VALUE;
                }
                coordinatorLayout.k(view, i, i2, android.view.View.MeasureSpec.makeMeasureSpec(iF, i5), i4);
                return true;
            }
        }
        return false;
    }

    public afpq(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new android.graphics.Rect();
        this.b = new android.graphics.Rect();
        this.c = 0;
    }
}
