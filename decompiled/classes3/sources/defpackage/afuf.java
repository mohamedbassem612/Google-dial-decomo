package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class afuf extends android.view.ViewGroup {
    public int c;
    public int d;
    public boolean e;
    public int f;

    public afuf(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = false;
        b(context, attributeSet);
    }

    private static int a(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return java.lang.Math.min(i3, i);
    }

    private final void b(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, afuy.a, 0, 0);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int paddingRight;
        int marginEnd;
        int marginStart;
        int i5 = 0;
        if (getChildCount() == 0) {
            this.f = 0;
            return;
        }
        boolean z2 = true;
        this.f = 1;
        boolean z3 = getLayoutDirection() == 1;
        if (z3) {
            paddingLeft = getPaddingRight();
            paddingRight = getPaddingLeft();
        } else {
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i6 = 0;
        int measuredWidth = paddingLeft;
        int i7 = paddingTop;
        while (i6 < getChildCount()) {
            android.view.View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(2131428811, -1);
            } else {
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = i5;
                    marginStart = marginEnd;
                }
                int measuredWidth2 = measuredWidth + marginStart + childAt.getMeasuredWidth();
                int i8 = i3 - i;
                int i9 = i8 - paddingRight;
                if (!this.e && measuredWidth2 > i9) {
                    measuredWidth2 = paddingLeft + marginStart + childAt.getMeasuredWidth();
                    i7 = paddingTop + this.c;
                    this.f++;
                    measuredWidth = paddingLeft;
                }
                childAt.setTag(2131428811, java.lang.Integer.valueOf(this.f - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i7;
                if (z3) {
                    childAt.layout(i8 - measuredWidth2, i7, (i8 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(measuredWidth + marginStart, i7, measuredWidth2, measuredHeight);
                }
                measuredWidth += marginStart + marginEnd + childAt.getMeasuredWidth() + this.d;
                paddingTop = measuredHeight;
            }
            i6++;
            z2 = z2;
            i5 = 0;
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int paddingLeft;
        int size = android.view.View.MeasureSpec.getSize(i);
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i3 = size;
        } else if (mode == 1073741824) {
            mode = 1073741824;
            i3 = size;
        } else {
            i3 = Integer.MAX_VALUE;
        }
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i3 - getPaddingRight();
        int i6 = paddingTop;
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            android.view.View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin;
                    i5 = marginLayoutParams.rightMargin;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                int i9 = paddingLeft2;
                if (paddingLeft2 + i4 + childAt.getMeasuredWidth() <= paddingRight || this.e) {
                    paddingLeft = i9;
                } else {
                    paddingLeft = getPaddingLeft();
                    i6 = this.c + paddingTop;
                }
                int measuredWidth = paddingLeft + i4 + childAt.getMeasuredWidth();
                int measuredHeight = i6 + childAt.getMeasuredHeight();
                if (measuredWidth > i7) {
                    i7 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i4 + i5 + childAt.getMeasuredWidth() + this.d;
                if (i8 == getChildCount() - 1) {
                    i7 += i5;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(a(size, mode, i7 + getPaddingRight()), a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public afuf(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public afuf(android.content.Context context) {
        this(context, null);
    }

    public afuf(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = false;
        b(context, attributeSet);
    }
}
