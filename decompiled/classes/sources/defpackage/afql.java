package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afql extends defpackage.afwq {
    private final int P;
    private final int Q;
    private final int R;
    private final int S;
    private final java.util.List T;
    public boolean a;

    public afql(android.content.Context context) {
        super(context);
        this.T = new java.util.ArrayList();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        android.content.res.Resources resources = getResources();
        this.P = resources.getDimensionPixelSize(2131165555);
        this.Q = resources.getDimensionPixelSize(2131165556);
        this.R = resources.getDimensionPixelSize(2131165549);
        this.S = resources.getDimensionPixelSize(2131165550);
    }

    @Override // defpackage.afwq
    protected final defpackage.afwm b(android.content.Context context) {
        return new defpackage.afqk(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int measuredWidth = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int i6 = i4 - i2;
                if (getLayoutDirection() == 1) {
                    int i7 = (i3 - i) - measuredWidth;
                    childAt.layout(i7 - childAt.getMeasuredWidth(), 0, i7, i6);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i6);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredWidth;
        int iMax;
        int i3;
        int i4;
        int size = android.view.View.MeasureSpec.getSize(i);
        int iC = c();
        int childCount = getChildCount();
        java.util.List list = this.T;
        list.clear();
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i2), Integer.MIN_VALUE);
        int i5 = 0;
        if (this.d == 0) {
            if (j(this.c, iC) && this.a) {
                android.view.View childAt = getChildAt(this.g);
                int iMax2 = this.S;
                if (childAt.getVisibility() != 8) {
                    childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.R, Integer.MIN_VALUE), iMakeMeasureSpec);
                    iMax2 = java.lang.Math.max(iMax2, childAt.getMeasuredWidth());
                }
                int i6 = iC - (childAt.getVisibility() != 8 ? 1 : 0);
                int iMin = java.lang.Math.min(size - (this.Q * i6), java.lang.Math.min(iMax2, this.R));
                int i7 = size - iMin;
                int iMin2 = java.lang.Math.min(i7 / (i6 != 0 ? i6 : 1), this.P);
                int i8 = i7 - (i6 * iMin2);
                int i9 = 0;
                while (i9 < childCount) {
                    if (getChildAt(i9).getVisibility() != 8) {
                        i4 = i9 == this.g ? iMin : iMin2;
                        if (i8 > 0) {
                            i4++;
                            i8--;
                        }
                    } else {
                        i4 = 0;
                    }
                    list.add(java.lang.Integer.valueOf(i4));
                    i9++;
                }
            } else {
                int iMin3 = java.lang.Math.min(size / (iC != 0 ? iC : 1), this.R);
                int i10 = size - (iC * iMin3);
                for (int i11 = 0; i11 < childCount; i11++) {
                    if (getChildAt(i11).getVisibility() == 8) {
                        i3 = 0;
                    } else if (i10 > 0) {
                        i3 = iMin3 + 1;
                        i10--;
                    } else {
                        i3 = iMin3;
                    }
                    list.add(java.lang.Integer.valueOf(i3));
                }
            }
            measuredWidth = 0;
            iMax = 0;
            while (i5 < childCount) {
                android.view.View childAt2 = getChildAt(i5);
                if (childAt2.getVisibility() != 8) {
                    childAt2.measure(android.view.View.MeasureSpec.makeMeasureSpec(((java.lang.Integer) list.get(i5)).intValue(), 1073741824), iMakeMeasureSpec);
                    childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                    measuredWidth += childAt2.getMeasuredWidth();
                    iMax = java.lang.Math.max(iMax, childAt2.getMeasuredHeight());
                }
                i5++;
            }
        } else {
            if (iC == 0) {
                iC = 1;
            }
            float f = size;
            float fMin = java.lang.Math.min((iC + 3) / 10.0f, 0.9f) * f;
            float f2 = iC;
            float f3 = f / f2;
            int iRound = java.lang.Math.round(fMin / f2);
            int iRound2 = java.lang.Math.round(f3);
            int measuredWidth2 = 0;
            int iMax3 = 0;
            while (i5 < childCount) {
                android.view.View childAt3 = getChildAt(i5);
                if (childAt3.getVisibility() != 8) {
                    childAt3.measure(android.view.View.MeasureSpec.makeMeasureSpec(iRound2, Integer.MIN_VALUE), iMakeMeasureSpec);
                    if (childAt3.getMeasuredWidth() < iRound) {
                        childAt3.measure(android.view.View.MeasureSpec.makeMeasureSpec(iRound, 1073741824), iMakeMeasureSpec);
                    }
                    measuredWidth2 += childAt3.getMeasuredWidth();
                    iMax3 = java.lang.Math.max(iMax3, childAt3.getMeasuredHeight());
                }
                i5++;
            }
            measuredWidth = measuredWidth2;
            iMax = iMax3;
        }
        setMeasuredDimension(measuredWidth, java.lang.Math.max(iMax, getSuggestedMinimumHeight()));
    }
}
