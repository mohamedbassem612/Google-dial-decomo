package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class jp extends android.view.ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    public int f;
    public android.graphics.drawable.Drawable g;
    public int h;
    private float i;
    private boolean j;
    private int[] k;
    private int[] l;
    private int m;
    private int n;
    private int o;

    public jp(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = true;
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.f = 8388659;
        int[] iArr = defpackage.ef.o;
        defpackage.ajxw ajxwVar = new defpackage.ajxw(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
        java.lang.Object obj = ajxwVar.b;
        int i2 = defpackage.dzs.a;
        defpackage.dzp.b(this, context, iArr, attributeSet, (android.content.res.TypedArray) obj, i, 0);
        int iO = ajxwVar.o(1, -1);
        if (iO >= 0) {
            r(iO);
        }
        int iO2 = ajxwVar.o(0, -1);
        if (iO2 >= 0 && this.f != iO2) {
            iO2 = (8388615 & iO2) == 0 ? iO2 | 8388611 : iO2;
            this.f = (iO2 & 112) == 0 ? iO2 | 48 : iO2;
            requestLayout();
        }
        if (!ajxwVar.y(2, true)) {
            t();
        }
        this.i = ((android.content.res.TypedArray) ajxwVar.b).getFloat(4, -1.0f);
        this.b = ajxwVar.o(3, -1);
        this.j = ajxwVar.y(7, false);
        android.graphics.drawable.Drawable drawableT = ajxwVar.t(5);
        if (drawableT != this.g) {
            this.g = drawableT;
            if (drawableT != null) {
                this.h = drawableT.getIntrinsicWidth();
                this.m = drawableT.getIntrinsicHeight();
                z = false;
            } else {
                this.h = 0;
                this.m = 0;
            }
            setWillNotDraw(z);
            requestLayout();
        }
        this.n = ajxwVar.o(8, 0);
        this.o = ajxwVar.n(6, 0);
        ajxwVar.x();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof defpackage.jo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public defpackage.jo generateDefaultLayoutParams() {
        int i = this.d;
        if (i == 0) {
            return new defpackage.jo(-2);
        }
        if (i == 1) {
            return new defpackage.jo(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: fk */
    public defpackage.jo generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.jo(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: fl, reason: merged with bridge method [inline-methods] */
    public defpackage.jo generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof defpackage.jo) {
            return new defpackage.jo((android.view.ViewGroup.MarginLayoutParams) layoutParams);
        }
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new defpackage.jo((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new defpackage.jo(layoutParams);
    }

    @Override // android.view.View
    public final int getBaseline() {
        int i;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.b;
        if (childCount <= i2) {
            throw new java.lang.RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        android.view.View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.b == 0) {
                return -1;
            }
            throw new java.lang.RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.c;
        if (this.d == 1 && (i = this.f & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.e) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.e;
            }
        }
        return bottom + ((defpackage.jo) childAt.getLayoutParams()).topMargin + baseline;
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        int right;
        int left;
        int i;
        int bottom;
        if (this.g != null) {
            int i2 = 0;
            if (this.d == 1) {
                int childCount = getChildCount();
                while (i2 < childCount) {
                    android.view.View childAt = getChildAt(i2);
                    if (childAt != null && childAt.getVisibility() != 8 && s(i2)) {
                        p(canvas, (childAt.getTop() - ((defpackage.jo) childAt.getLayoutParams()).topMargin) - this.m);
                    }
                    i2++;
                }
                if (s(childCount)) {
                    android.view.View childAt2 = getChildAt(childCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.m;
                    } else {
                        bottom = childAt2.getBottom() + ((defpackage.jo) childAt2.getLayoutParams()).bottomMargin;
                    }
                    p(canvas, bottom);
                    return;
                }
                return;
            }
            int childCount2 = getChildCount();
            boolean zBK = defpackage.den.bK(this);
            while (i2 < childCount2) {
                android.view.View childAt3 = getChildAt(i2);
                if (childAt3 != null && childAt3.getVisibility() != 8 && s(i2)) {
                    defpackage.jo joVar = (defpackage.jo) childAt3.getLayoutParams();
                    q(canvas, zBK ? childAt3.getRight() + joVar.rightMargin : (childAt3.getLeft() - joVar.leftMargin) - this.h);
                }
                i2++;
            }
            if (s(childCount2)) {
                android.view.View childAt4 = getChildAt(childCount2 - 1);
                if (childAt4 != null) {
                    defpackage.jo joVar2 = (defpackage.jo) childAt4.getLayoutParams();
                    if (zBK) {
                        left = childAt4.getLeft() - joVar2.leftMargin;
                        i = this.h;
                        right = left - i;
                    } else {
                        right = childAt4.getRight() + joVar2.rightMargin;
                    }
                } else if (zBK) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i = this.h;
                    right = left - i;
                }
                q(canvas, right);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.support.v7.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0154  */
    /* JADX WARN: Code duplicated, block: B:61:0x0158  */
    /* JADX WARN: Code duplicated, block: B:63:0x015c  */
    /* JADX WARN: Code duplicated, block: B:64:0x015e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0166  */
    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x0177  */
    /* JADX WARN: Code duplicated, block: B:70:0x017e  */
    /* JADX WARN: Code duplicated, block: B:74:0x018f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0194  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        int baseline;
        int i9;
        int i10;
        int i11;
        int measuredHeight;
        int i12;
        int paddingTop;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        char c = 2;
        if (this.d == 1) {
            int i17 = i3 - i;
            int paddingLeft2 = getPaddingLeft();
            int paddingRight = i17 - getPaddingRight();
            int paddingRight2 = (i17 - paddingLeft2) - getPaddingRight();
            int childCount = getChildCount();
            int i18 = this.f;
            int i19 = i18 & 112;
            int i20 = i18 & 8388615;
            if (i19 != 16) {
                paddingTop = i19 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.e;
            } else {
                paddingTop = (((i4 - i2) - this.e) / 2) + getPaddingTop();
            }
            int i21 = 0;
            while (i21 < childCount) {
                android.view.View childAt = getChildAt(i21);
                if (childAt != null && childAt.getVisibility() != i16) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    defpackage.jo joVar = (defpackage.jo) childAt.getLayoutParams();
                    int i22 = joVar.gravity;
                    if (i22 < 0) {
                        i22 = i20;
                    }
                    int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i22, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            i15 = joVar.leftMargin + paddingLeft2;
                        } else {
                            i13 = paddingRight - measuredWidth;
                            i14 = joVar.rightMargin;
                        }
                        if (s(i21)) {
                            paddingTop += this.m;
                        }
                        int i23 = paddingTop + joVar.topMargin;
                        childAt.layout(i15, i23, measuredWidth + i15, i23 + measuredHeight2);
                        paddingTop = i23 + measuredHeight2 + joVar.bottomMargin;
                    } else {
                        i13 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + joVar.leftMargin;
                        i14 = joVar.rightMargin;
                    }
                    i15 = i13 - i14;
                    if (s(i21)) {
                        paddingTop += this.m;
                    }
                    int i24 = paddingTop + joVar.topMargin;
                    childAt.layout(i15, i24, measuredWidth + i15, i24 + measuredHeight2);
                    paddingTop = i24 + measuredHeight2 + joVar.bottomMargin;
                }
                i21++;
                c = c;
                i16 = 8;
            }
            return;
        }
        int i25 = i4 - i2;
        int layoutDirection = getLayoutDirection();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = i25 - getPaddingBottom();
        int paddingBottom2 = (i25 - paddingTop2) - getPaddingBottom();
        int childCount2 = getChildCount();
        int i26 = this.f;
        int i27 = 8388615 & i26;
        int i28 = i26 & 112;
        boolean z2 = this.a;
        int[] iArr = this.k;
        int[] iArr2 = this.l;
        int absoluteGravity2 = android.view.Gravity.getAbsoluteGravity(i27, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.e;
        } else {
            paddingLeft = (((i3 - i) - this.e) / 2) + getPaddingLeft();
        }
        if (layoutDirection == 1) {
            i6 = childCount2 - 1;
            i5 = -1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i29 = 0;
        while (i29 < childCount2) {
            int i30 = i6 + (i5 * i29);
            android.view.View childAt2 = getChildAt(i30);
            if (childAt2 != null) {
                i7 = paddingBottom2;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    defpackage.jo joVar2 = (defpackage.jo) childAt2.getLayoutParams();
                    if (z2) {
                        i8 = paddingLeft;
                        baseline = joVar2.height != -1 ? childAt2.getBaseline() : -1;
                        i9 = joVar2.gravity;
                        if (i9 < 0) {
                            i9 = i28;
                        }
                        i10 = i9 & 112;
                        if (i10 != 16) {
                            if (i10 != 48) {
                                i11 = joVar2.topMargin + paddingTop2;
                                if (baseline != -1) {
                                    i11 += iArr[1] - baseline;
                                }
                            } else if (i10 != 80) {
                                i11 = paddingTop2;
                            } else {
                                i11 = (paddingBottom - measuredHeight3) - joVar2.bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            if (s(i30)) {
                                i12 = i8 + this.h;
                            } else {
                                i12 = i8;
                            }
                            int i31 = i12 + joVar2.leftMargin;
                            childAt2.layout(i31, i11, i31 + measuredWidth2, i11 + measuredHeight3);
                            paddingLeft = i31 + measuredWidth2 + joVar2.rightMargin;
                        } else {
                            i11 = ((i7 - measuredHeight3) / 2) + paddingTop2 + joVar2.topMargin;
                            measuredHeight = joVar2.bottomMargin;
                        }
                        i11 -= measuredHeight;
                        if (s(i30)) {
                            i12 = i8 + this.h;
                        } else {
                            i12 = i8;
                        }
                        int i32 = i12 + joVar2.leftMargin;
                        childAt2.layout(i32, i11, i32 + measuredWidth2, i11 + measuredHeight3);
                        paddingLeft = i32 + measuredWidth2 + joVar2.rightMargin;
                    } else {
                        i8 = paddingLeft;
                    }
                    i9 = joVar2.gravity;
                    if (i9 < 0) {
                        i9 = i28;
                    }
                    i10 = i9 & 112;
                    if (i10 != 16) {
                        if (i10 != 48) {
                            i11 = joVar2.topMargin + paddingTop2;
                            if (baseline != -1) {
                                i11 += iArr[1] - baseline;
                            }
                        } else if (i10 != 80) {
                            i11 = paddingTop2;
                        } else {
                            i11 = (paddingBottom - measuredHeight3) - joVar2.bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (s(i30)) {
                            i12 = i8 + this.h;
                        } else {
                            i12 = i8;
                        }
                        int i33 = i12 + joVar2.leftMargin;
                        childAt2.layout(i33, i11, i33 + measuredWidth2, i11 + measuredHeight3);
                        paddingLeft = i33 + measuredWidth2 + joVar2.rightMargin;
                    } else {
                        i11 = ((i7 - measuredHeight3) / 2) + paddingTop2 + joVar2.topMargin;
                        measuredHeight = joVar2.bottomMargin;
                    }
                    i11 -= measuredHeight;
                    if (s(i30)) {
                        i12 = i8 + this.h;
                    } else {
                        i12 = i8;
                    }
                    int i34 = i12 + joVar2.leftMargin;
                    childAt2.layout(i34, i11, i34 + measuredWidth2, i11 + measuredHeight3);
                    paddingLeft = i34 + measuredWidth2 + joVar2.rightMargin;
                }
                i29++;
                paddingBottom2 = i7;
                i6 = i6;
            } else {
                i7 = paddingBottom2;
            }
            paddingLeft = paddingLeft;
            i29++;
            paddingBottom2 = i7;
            i6 = i6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:216:0x049c  */
    /* JADX WARN: Code duplicated, block: B:219:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:221:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:223:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:224:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:226:0x04de  */
    /* JADX WARN: Code duplicated, block: B:232:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:235:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:238:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:239:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:351:0x073b  */
    /* JADX WARN: Code duplicated, block: B:352:0x073e  */
    /* JADX WARN: Code duplicated, block: B:372:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:375:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:377:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:379:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:381:0x080b  */
    /* JADX WARN: Code duplicated, block: B:415:0x081c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x081c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0180  */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int[] iArr;
        int[] iArr2;
        int iMax;
        int i3;
        boolean z;
        int i4;
        int i5;
        int iMax2;
        int i6;
        int i7;
        int i8;
        int baseline;
        int i9;
        int iMakeMeasureSpec;
        int i10;
        android.view.View childAt;
        defpackage.jo joVar;
        int i11;
        int i12;
        int i13;
        byte b;
        int i14;
        defpackage.jo joVar2;
        boolean z2;
        boolean z3;
        int i15;
        int measuredHeight;
        boolean z4;
        int iCombineMeasuredStates;
        int i16;
        boolean z5;
        int iMax3;
        int baseline2;
        int i17;
        int[] iArr3;
        boolean z6;
        int i18;
        int i19;
        boolean z7;
        int i20;
        int i21;
        android.view.View childAt2;
        int i22;
        int i23;
        boolean z8;
        int i24;
        int i25;
        byte b2;
        boolean z9;
        defpackage.jp jpVar = this;
        int i26 = -2;
        byte b3 = -2147483648;
        int i27 = 8;
        int i28 = 1073741824;
        if (jpVar.d == 1) {
            jpVar.e = 0;
            int childCount = jpVar.getChildCount();
            int mode = android.view.View.MeasureSpec.getMode(i);
            int mode2 = android.view.View.MeasureSpec.getMode(i2);
            int i29 = jpVar.b;
            boolean z10 = jpVar.j;
            int i30 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z11 = false;
            boolean z12 = false;
            int iMax6 = 0;
            int iCombineMeasuredStates2 = 0;
            boolean z13 = true;
            float f = 0.0f;
            int iMax7 = 0;
            while (i30 < childCount) {
                int i31 = mode;
                android.view.View childAt3 = jpVar.getChildAt(i30);
                if (childAt3 == null || childAt3.getVisibility() == i27) {
                    i22 = mode2;
                    i23 = i29;
                    z8 = z10;
                    i24 = i30;
                    i25 = i31;
                    iCombineMeasuredStates2 = iCombineMeasuredStates2;
                    iMax6 = iMax6;
                } else {
                    if (jpVar.s(i30)) {
                        jpVar.e += jpVar.m;
                    }
                    defpackage.jo joVar3 = (defpackage.jo) childAt3.getLayoutParams();
                    f += joVar3.weight;
                    if (mode2 == i28 && joVar3.height == 0 && joVar3.weight > 0.0f) {
                        int i32 = jpVar.e;
                        jpVar.e = java.lang.Math.max(i32, joVar3.topMargin + i32 + joVar3.bottomMargin);
                        i22 = mode2;
                        i23 = i29;
                        z8 = z10;
                        i24 = i30;
                        i25 = i31;
                        z11 = true;
                    } else {
                        if (joVar3.height != 0 || joVar3.weight <= 0.0f) {
                            b2 = b3;
                        } else {
                            joVar3.height = i26;
                            b2 = 0;
                        }
                        i22 = mode2;
                        z8 = z10;
                        i23 = i29;
                        i24 = i30;
                        i25 = i31;
                        jpVar.measureChildWithMargins(childAt3, i, 0, i2, f == 0.0f ? jpVar.e : 0);
                        if (b2 != b3) {
                            joVar3.height = 0;
                        }
                        int measuredHeight2 = childAt3.getMeasuredHeight();
                        int i33 = jpVar.e;
                        jpVar.e = java.lang.Math.max(i33, i33 + measuredHeight2 + joVar3.topMargin + joVar3.bottomMargin);
                        if (z8) {
                            iMax7 = java.lang.Math.max(measuredHeight2, iMax7);
                        }
                    }
                    if (i23 >= 0 && i23 == i24 + 1) {
                        jpVar.c = jpVar.e;
                    }
                    if (i24 < i23 && joVar3.weight > 0.0f) {
                        throw new java.lang.RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (i25 == 1073741824 || joVar3.width != -1) {
                        z9 = false;
                    } else {
                        z9 = true;
                        z12 = true;
                    }
                    int i34 = joVar3.leftMargin + joVar3.rightMargin;
                    int measuredWidth = childAt3.getMeasuredWidth() + i34;
                    iMax6 = java.lang.Math.max(iMax6, measuredWidth);
                    iCombineMeasuredStates2 = android.view.View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState());
                    boolean z14 = z13 && joVar3.width == -1;
                    if (true != z9) {
                        i34 = measuredWidth;
                    }
                    if (joVar3.weight > 0.0f) {
                        iMax5 = java.lang.Math.max(iMax5, i34);
                    } else {
                        iMax4 = java.lang.Math.max(iMax4, i34);
                    }
                    z13 = z14;
                }
                i30 = i24 + 1;
                i29 = i23;
                mode = i25;
                z10 = z8;
                mode2 = i22;
                i26 = -2;
                b3 = -2147483648;
                i27 = 8;
                i28 = 1073741824;
            }
            int i35 = mode;
            int i36 = mode2;
            boolean z15 = z10;
            int iMax8 = iMax6;
            int iCombineMeasuredStates3 = iCombineMeasuredStates2;
            if (jpVar.e > 0 && jpVar.s(childCount)) {
                jpVar.e += jpVar.m;
            }
            int i37 = i36;
            if (z15) {
                if (i37 == Integer.MIN_VALUE) {
                    jpVar.e = 0;
                    for (i21 = 0; i21 < childCount; i21++) {
                        childAt2 = jpVar.getChildAt(i21);
                        if (childAt2 == null && childAt2.getVisibility() != 8) {
                            defpackage.jo joVar4 = (defpackage.jo) childAt2.getLayoutParams();
                            int i38 = jpVar.e;
                            jpVar.e = java.lang.Math.max(i38, i38 + iMax7 + joVar4.topMargin + joVar4.bottomMargin);
                        }
                    }
                } else if (i37 == 0) {
                    i37 = 0;
                    jpVar.e = 0;
                    while (i21 < childCount) {
                        childAt2 = jpVar.getChildAt(i21);
                        if (childAt2 == null) {
                        }
                    }
                }
                z6 = true;
            } else {
                z6 = false;
            }
            int paddingTop = jpVar.e + jpVar.getPaddingTop() + jpVar.getPaddingBottom();
            jpVar.e = paddingTop;
            int iResolveSizeAndState = android.view.View.resolveSizeAndState(java.lang.Math.max(paddingTop, jpVar.getSuggestedMinimumHeight()), i2, 0);
            int i39 = (iResolveSizeAndState & 16777215) - jpVar.e;
            if (z11 || (i39 != 0 && f > 0.0f)) {
                float f2 = jpVar.i;
                if (f2 > 0.0f) {
                    f = f2;
                }
                jpVar.e = 0;
                for (int i40 = 0; i40 < childCount; i40++) {
                    android.view.View childAt4 = jpVar.getChildAt(i40);
                    if (childAt4.getVisibility() != 8) {
                        defpackage.jo joVar5 = (defpackage.jo) childAt4.getLayoutParams();
                        float f3 = joVar5.weight;
                        if (f3 > 0.0f) {
                            float f4 = (i39 * f3) / f;
                            f -= f3;
                            int i41 = (int) f4;
                            i39 -= i41;
                            int childMeasureSpec = getChildMeasureSpec(i, jpVar.getPaddingLeft() + jpVar.getPaddingRight() + joVar5.leftMargin + joVar5.rightMargin, joVar5.width);
                            if (joVar5.height == 0) {
                                i20 = 1073741824;
                                if (i37 == 1073741824) {
                                    if (i41 <= 0) {
                                        i41 = 0;
                                    }
                                    childAt4.measure(childMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(i41, 1073741824));
                                }
                                iCombineMeasuredStates3 = android.view.View.combineMeasuredStates(iCombineMeasuredStates3, childAt4.getMeasuredState() & (-256));
                            } else {
                                i20 = 1073741824;
                            }
                            int measuredHeight3 = childAt4.getMeasuredHeight() + i41;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt4.measure(childMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight3, i20));
                            iCombineMeasuredStates3 = android.view.View.combineMeasuredStates(iCombineMeasuredStates3, childAt4.getMeasuredState() & (-256));
                        }
                        int i42 = joVar5.leftMargin + joVar5.rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i42;
                        iMax8 = java.lang.Math.max(iMax8, measuredWidth2);
                        if (i35 != 1073741824) {
                            i18 = iCombineMeasuredStates3;
                            i19 = -1;
                            if (joVar5.width != -1) {
                            }
                            int iMax9 = java.lang.Math.max(iMax4, i42);
                            if (z13 || joVar5.width != i19) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            int i43 = jpVar.e;
                            jpVar.e = java.lang.Math.max(i43, childAt4.getMeasuredHeight() + i43 + joVar5.topMargin + joVar5.bottomMargin);
                            z13 = z7;
                            iMax4 = iMax9;
                            iCombineMeasuredStates3 = i18;
                        } else {
                            i18 = iCombineMeasuredStates3;
                            i19 = -1;
                        }
                        i42 = measuredWidth2;
                        int iMax10 = java.lang.Math.max(iMax4, i42);
                        if (z13) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        int i44 = jpVar.e;
                        jpVar.e = java.lang.Math.max(i44, childAt4.getMeasuredHeight() + i44 + joVar5.topMargin + joVar5.bottomMargin);
                        z13 = z7;
                        iMax4 = iMax10;
                        iCombineMeasuredStates3 = i18;
                    }
                }
                jpVar.e += jpVar.getPaddingTop() + jpVar.getPaddingBottom();
            } else {
                iMax4 = java.lang.Math.max(iMax4, iMax5);
                if (z6 && i37 != 1073741824) {
                    for (int i45 = 0; i45 < childCount; i45++) {
                        android.view.View childAt5 = jpVar.getChildAt(i45);
                        if (childAt5 != null && childAt5.getVisibility() != 8 && ((defpackage.jo) childAt5.getLayoutParams()).weight > 0.0f) {
                            childAt5.measure(android.view.View.MeasureSpec.makeMeasureSpec(childAt5.getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(iMax7, 1073741824));
                        }
                    }
                }
            }
            int i46 = iMax8;
            if (z13 || i35 == 1073741824) {
                iMax4 = i46;
            }
            jpVar.setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(iMax4 + jpVar.getPaddingLeft() + jpVar.getPaddingRight(), jpVar.getSuggestedMinimumWidth()), i, iCombineMeasuredStates3), iResolveSizeAndState);
            if (z12) {
                int iMakeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(jpVar.getMeasuredWidth(), 1073741824);
                for (int i47 = 0; i47 < childCount; i47++) {
                    android.view.View childAt6 = jpVar.getChildAt(i47);
                    if (childAt6.getVisibility() != 8) {
                        defpackage.jo joVar6 = (defpackage.jo) childAt6.getLayoutParams();
                        if (joVar6.width == -1) {
                            int i48 = joVar6.height;
                            joVar6.height = childAt6.getMeasuredHeight();
                            jpVar.measureChildWithMargins(childAt6, iMakeMeasureSpec2, 0, i2, 0);
                            joVar6.height = i48;
                        }
                    }
                }
                return;
            }
            return;
        }
        i = i;
        jpVar.e = 0;
        int childCount2 = jpVar.getChildCount();
        int mode3 = android.view.View.MeasureSpec.getMode(i);
        int mode4 = android.view.View.MeasureSpec.getMode(i2);
        int[] iArr4 = jpVar.k;
        if (iArr4 == null || (iArr3 = jpVar.l) == null) {
            int[] iArr5 = new int[4];
            jpVar.k = iArr5;
            int[] iArr6 = new int[4];
            jpVar.l = iArr6;
            iArr = iArr6;
            iArr2 = iArr5;
        } else {
            iArr2 = iArr4;
            iArr = iArr3;
        }
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        boolean z16 = jpVar.a;
        boolean z17 = jpVar.j;
        float f5 = 0.0f;
        int i49 = 0;
        int i50 = 0;
        int i51 = 0;
        int iMax11 = 0;
        int iMax12 = 0;
        int iCombineMeasuredStates4 = 0;
        boolean z18 = false;
        boolean z19 = true;
        boolean z20 = false;
        while (i49 < childCount2) {
            android.view.View childAt7 = jpVar.getChildAt(i49);
            if (childAt7 == null) {
                i11 = i50;
                i12 = i51;
            } else {
                int i52 = i50;
                int i53 = i51;
                if (childAt7.getVisibility() != 8) {
                    if (jpVar.s(i49)) {
                        jpVar.e += jpVar.h;
                    }
                    defpackage.jo joVar7 = (defpackage.jo) childAt7.getLayoutParams();
                    f5 += joVar7.weight;
                    if (mode3 == 1073741824) {
                        if (joVar7.width != 0 || joVar7.weight <= 0.0f) {
                            i13 = 1073741824;
                        } else {
                            i49 = i49;
                            jpVar.e += joVar7.leftMargin + joVar7.rightMargin;
                            if (z16) {
                                childAt7.measure(0, 0);
                                z2 = true;
                            } else {
                                z2 = false;
                                z20 = true;
                            }
                            i = i;
                            i14 = iMax11;
                            z17 = z17;
                            joVar2 = joVar7;
                        }
                        if (mode4 == 1073741824 && joVar2.height == -1) {
                            z3 = true;
                            z18 = true;
                        } else {
                            z3 = false;
                        }
                        i15 = joVar2.topMargin + joVar2.bottomMargin;
                        measuredHeight = childAt7.getMeasuredHeight() + i15;
                        z4 = z2;
                        iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates4, childAt7.getMeasuredState());
                        if (z4) {
                            baseline2 = childAt7.getBaseline();
                            i16 = iCombineMeasuredStates;
                            if (baseline2 != -1) {
                                if (joVar2.gravity < 0) {
                                    i17 = jpVar.f;
                                } else {
                                    i17 = joVar2.gravity;
                                }
                                int i54 = (i17 & 112) >> 5;
                                iArr2[i54] = java.lang.Math.max(iArr2[i54], baseline2);
                                iArr[i54] = java.lang.Math.max(iArr[i54], measuredHeight - baseline2);
                            }
                        } else {
                            i16 = iCombineMeasuredStates;
                        }
                        int iMax13 = java.lang.Math.max(i52, measuredHeight);
                        if (z19 || joVar2.height != -1) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (true != z3) {
                            i15 = measuredHeight;
                        }
                        if (joVar2.weight > 0.0f) {
                            iMax11 = java.lang.Math.max(i14, i15);
                            iMax3 = i53;
                        } else {
                            iMax3 = java.lang.Math.max(i53, i15);
                            iMax11 = i14;
                        }
                        i12 = iMax3;
                        z19 = z5;
                        iCombineMeasuredStates4 = i16;
                        i50 = iMax13;
                    } else {
                        i13 = mode3;
                    }
                    if (joVar7.width != 0 || joVar7.weight <= 0.0f) {
                        b = -2147483648;
                    } else {
                        joVar7.width = -2;
                        b = 0;
                    }
                    iArr2 = iArr2;
                    z16 = z16;
                    i52 = i52;
                    i14 = iMax11;
                    z18 = z18;
                    int i55 = i13;
                    z17 = z17;
                    i = i;
                    joVar2 = joVar7;
                    jpVar.measureChildWithMargins(childAt7, i, f5 == 0.0f ? jpVar.e : 0, i2, 0);
                    if (b != -2147483648) {
                        joVar2.width = 0;
                    }
                    int measuredWidth3 = childAt7.getMeasuredWidth();
                    int i56 = jpVar.e;
                    childAt7 = childAt7;
                    if (i55 == 1073741824) {
                        jpVar.e = i56 + joVar2.leftMargin + measuredWidth3 + joVar2.rightMargin;
                    } else {
                        jpVar.e = java.lang.Math.max(i56, i56 + measuredWidth3 + joVar2.leftMargin + joVar2.rightMargin);
                    }
                    if (z17) {
                        iMax12 = java.lang.Math.max(measuredWidth3, iMax12);
                    }
                    z2 = z16;
                    if (mode4 == 1073741824) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    i15 = joVar2.topMargin + joVar2.bottomMargin;
                    measuredHeight = childAt7.getMeasuredHeight() + i15;
                    z4 = z2;
                    iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates4, childAt7.getMeasuredState());
                    if (z4) {
                        baseline2 = childAt7.getBaseline();
                        i16 = iCombineMeasuredStates;
                        if (baseline2 != -1) {
                            if (joVar2.gravity < 0) {
                                i17 = jpVar.f;
                            } else {
                                i17 = joVar2.gravity;
                            }
                            int i57 = (i17 & 112) >> 5;
                            iArr2[i57] = java.lang.Math.max(iArr2[i57], baseline2);
                            iArr[i57] = java.lang.Math.max(iArr[i57], measuredHeight - baseline2);
                        }
                    } else {
                        i16 = iCombineMeasuredStates;
                    }
                    int iMax14 = java.lang.Math.max(i52, measuredHeight);
                    if (z19) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (true != z3) {
                        i15 = measuredHeight;
                    }
                    if (joVar2.weight > 0.0f) {
                        iMax11 = java.lang.Math.max(i14, i15);
                        iMax3 = i53;
                    } else {
                        iMax3 = java.lang.Math.max(i53, i15);
                        iMax11 = i14;
                    }
                    i12 = iMax3;
                    z19 = z5;
                    iCombineMeasuredStates4 = i16;
                    i50 = iMax14;
                } else {
                    i11 = i52;
                    i12 = i53;
                }
                z18 = z18;
                i49++;
                i51 = i12;
                iArr = iArr;
                z16 = z16;
                z17 = z17;
                iArr2 = iArr2;
            }
            i50 = i11;
            iMax11 = iMax11;
            z18 = z18;
            i49++;
            i51 = i12;
            iArr = iArr;
            z16 = z16;
            z17 = z17;
            iArr2 = iArr2;
        }
        int[] iArr7 = iArr2;
        int[] iArr8 = iArr;
        boolean z21 = z16;
        boolean z22 = z17;
        boolean z23 = z18;
        int i58 = i50;
        int i59 = i51;
        int i60 = iMax11;
        if (jpVar.e > 0 && jpVar.s(childCount2)) {
            jpVar.e += jpVar.h;
        }
        int i61 = iArr7[1];
        if (i61 != -1) {
            iMax = java.lang.Math.max(i58, java.lang.Math.max(iArr7[3], java.lang.Math.max(iArr7[0], java.lang.Math.max(i61, iArr7[2]))) + java.lang.Math.max(iArr8[3], java.lang.Math.max(iArr8[0], java.lang.Math.max(iArr8[1], iArr8[2]))));
        } else if (iArr7[0] == -1 && iArr7[2] == -1 && iArr7[3] == -1) {
            iMax = i58;
        } else {
            i61 = -1;
            iMax = java.lang.Math.max(i58, java.lang.Math.max(iArr7[3], java.lang.Math.max(iArr7[0], java.lang.Math.max(i61, iArr7[2]))) + java.lang.Math.max(iArr8[3], java.lang.Math.max(iArr8[0], java.lang.Math.max(iArr8[1], iArr8[2]))));
        }
        if (z22) {
            if (mode3 != Integer.MIN_VALUE) {
                if (mode3 == 0) {
                    i3 = 0;
                    mode3 = 0;
                } else {
                    i3 = mode3;
                }
                z = true;
            } else {
                i3 = mode3;
            }
            jpVar.e = 0;
            int i62 = 0;
            while (i62 < childCount2) {
                android.view.View childAt8 = jpVar.getChildAt(i62);
                if (childAt8 != null && childAt8.getVisibility() != 8) {
                    defpackage.jo joVar8 = (defpackage.jo) childAt8.getLayoutParams();
                    int i63 = jpVar.e;
                    jpVar.e = java.lang.Math.max(i63, i63 + iMax12 + joVar8.leftMargin + joVar8.rightMargin);
                }
                i62++;
                i3 = i3;
            }
            z = true;
        } else {
            i3 = mode3;
            z = false;
        }
        int paddingLeft = jpVar.e + jpVar.getPaddingLeft() + jpVar.getPaddingRight();
        jpVar.e = paddingLeft;
        int iResolveSizeAndState2 = android.view.View.resolveSizeAndState(java.lang.Math.max(paddingLeft, jpVar.getSuggestedMinimumWidth()), i, 0);
        int i64 = (iResolveSizeAndState2 & 16777215) - jpVar.e;
        if (z20 || (i64 != 0 && f5 > 0.0f)) {
            float f6 = jpVar.i;
            if (f6 > 0.0f) {
                f5 = f6;
            }
            iArr7[3] = -1;
            iArr7[2] = -1;
            iArr7[1] = -1;
            iArr7[0] = -1;
            iArr8[3] = -1;
            iArr8[2] = -1;
            iArr8[1] = -1;
            iArr8[0] = -1;
            jpVar.e = 0;
            int i65 = 0;
            int iMax15 = -1;
            while (i65 < childCount2) {
                android.view.View childAt9 = jpVar.getChildAt(i65);
                if (childAt9 == null || childAt9.getVisibility() == 8) {
                    i6 = i65;
                } else {
                    defpackage.jo joVar9 = (defpackage.jo) childAt9.getLayoutParams();
                    float f7 = joVar9.weight;
                    if (f7 > 0.0f) {
                        float f8 = (i64 * f7) / f5;
                        f5 -= f7;
                        int i66 = (int) f8;
                        i64 -= i66;
                        int childMeasureSpec2 = getChildMeasureSpec(i2, jpVar.getPaddingTop() + jpVar.getPaddingBottom() + joVar9.topMargin + joVar9.bottomMargin, joVar9.height);
                        if (joVar9.width == 0) {
                            i7 = 1073741824;
                            i6 = i65;
                            if (mode3 == 1073741824) {
                                childAt9.measure(android.view.View.MeasureSpec.makeMeasureSpec(i66 > 0 ? i66 : 0, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates4 = android.view.View.combineMeasuredStates(iCombineMeasuredStates4, childAt9.getMeasuredState() & (-16777216));
                        } else {
                            i7 = 1073741824;
                            i6 = i65;
                        }
                        int measuredWidth4 = childAt9.getMeasuredWidth() + i66;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt9.measure(android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth4, i7), childMeasureSpec2);
                        iCombineMeasuredStates4 = android.view.View.combineMeasuredStates(iCombineMeasuredStates4, childAt9.getMeasuredState() & (-16777216));
                    } else {
                        i6 = i65;
                        i7 = 1073741824;
                    }
                    int i67 = jpVar.e;
                    if (i3 == i7) {
                        jpVar.e = i67 + childAt9.getMeasuredWidth() + joVar9.leftMargin + joVar9.rightMargin;
                    } else {
                        jpVar.e = java.lang.Math.max(i67, childAt9.getMeasuredWidth() + i67 + joVar9.leftMargin + joVar9.rightMargin);
                    }
                    boolean z24 = mode4 != 1073741824 && joVar9.height == -1;
                    int i68 = joVar9.topMargin + joVar9.bottomMargin;
                    int measuredHeight4 = childAt9.getMeasuredHeight() + i68;
                    iMax15 = java.lang.Math.max(iMax15, measuredHeight4);
                    if (true != z24) {
                        i68 = measuredHeight4;
                    }
                    int iMax16 = java.lang.Math.max(i59, i68);
                    if (z19) {
                        i8 = -1;
                        boolean z25 = joVar9.height == -1;
                        if (z21 && (baseline = childAt9.getBaseline()) != i8) {
                            if (joVar9.gravity < 0) {
                                i9 = jpVar.f;
                            } else {
                                i9 = joVar9.gravity;
                            }
                            int i69 = (i9 & 112) >> 5;
                            iArr7[i69] = java.lang.Math.max(iArr7[i69], baseline);
                            iArr8[i69] = java.lang.Math.max(iArr8[i69], measuredHeight4 - baseline);
                        }
                        i59 = iMax16;
                        z19 = z25;
                    } else {
                        i8 = -1;
                    }
                    if (z21) {
                        if (joVar9.gravity < 0) {
                            i9 = jpVar.f;
                        } else {
                            i9 = joVar9.gravity;
                        }
                        int i610 = (i9 & 112) >> 5;
                        iArr7[i610] = java.lang.Math.max(iArr7[i610], baseline);
                        iArr8[i610] = java.lang.Math.max(iArr8[i610], measuredHeight4 - baseline);
                    }
                    i59 = iMax16;
                    z19 = z25;
                }
                i65 = i6 + 1;
                i3 = i3;
            }
            i4 = -16777216;
            jpVar.e += jpVar.getPaddingLeft() + jpVar.getPaddingRight();
            int i70 = iArr7[1];
            if (i70 == -1) {
                if (iArr7[0] == -1 && iArr7[2] == -1 && iArr7[3] == -1) {
                    iMax = iMax15;
                    iMax2 = i59;
                } else {
                    i70 = -1;
                }
            }
            i5 = 0;
            iMax = java.lang.Math.max(iMax15, java.lang.Math.max(iArr7[3], java.lang.Math.max(iArr7[0], java.lang.Math.max(i70, iArr7[2]))) + java.lang.Math.max(iArr8[3], java.lang.Math.max(iArr8[0], java.lang.Math.max(iArr8[1], iArr8[2]))));
            iMax2 = i59;
            if (z19 || mode4 == 1073741824) {
                iMax2 = iMax;
            }
            jpVar.setMeasuredDimension(iResolveSizeAndState2 | (iCombineMeasuredStates4 & i4), android.view.View.resolveSizeAndState(java.lang.Math.max(iMax2 + jpVar.getPaddingTop() + jpVar.getPaddingBottom(), jpVar.getSuggestedMinimumHeight()), i2, iCombineMeasuredStates4 << 16));
            if (z23) {
                iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(jpVar.getMeasuredHeight(), 1073741824);
                i10 = i5;
                while (i10 < childCount2) {
                    childAt = jpVar.getChildAt(i10);
                    if (childAt.getVisibility() != 8) {
                        joVar = (defpackage.jo) childAt.getLayoutParams();
                        if (joVar.height == -1) {
                            int i71 = joVar.width;
                            joVar.width = childAt.getMeasuredWidth();
                            jpVar.measureChildWithMargins(childAt, i, 0, iMakeMeasureSpec, 0);
                            joVar.width = i71;
                        }
                    }
                    i10++;
                    jpVar = this;
                }
            }
        }
        iMax2 = java.lang.Math.max(i59, i60);
        if (z && mode3 != 1073741824) {
            for (int i72 = 0; i72 < childCount2; i72++) {
                android.view.View childAt10 = jpVar.getChildAt(i72);
                if (childAt10 != null && childAt10.getVisibility() != 8 && ((defpackage.jo) childAt10.getLayoutParams()).weight > 0.0f) {
                    childAt10.measure(android.view.View.MeasureSpec.makeMeasureSpec(iMax12, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                }
            }
        }
        i4 = -16777216;
        i5 = 0;
        if (z19) {
            iMax2 = iMax;
        } else {
            iMax2 = iMax;
        }
        jpVar.setMeasuredDimension(iResolveSizeAndState2 | (iCombineMeasuredStates4 & i4), android.view.View.resolveSizeAndState(java.lang.Math.max(iMax2 + jpVar.getPaddingTop() + jpVar.getPaddingBottom(), jpVar.getSuggestedMinimumHeight()), i2, iCombineMeasuredStates4 << 16));
        if (z23) {
            iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(jpVar.getMeasuredHeight(), 1073741824);
            i10 = i5;
            while (i10 < childCount2) {
                childAt = jpVar.getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    joVar = (defpackage.jo) childAt.getLayoutParams();
                    if (joVar.height == -1) {
                        int i73 = joVar.width;
                        joVar.width = childAt.getMeasuredWidth();
                        jpVar.measureChildWithMargins(childAt, i, 0, iMakeMeasureSpec, 0);
                        joVar.width = i73;
                    }
                }
                i10++;
                jpVar = this;
            }
        }
    }

    final void p(android.graphics.Canvas canvas, int i) {
        this.g.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.m + i);
        this.g.draw(canvas);
    }

    final void q(android.graphics.Canvas canvas, int i) {
        this.g.setBounds(i, getPaddingTop() + this.o, this.h + i, (getHeight() - getPaddingBottom()) - this.o);
        this.g.draw(canvas);
    }

    public final void r(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    protected final boolean s(int i) {
        if (i != 0) {
            int childCount = getChildCount();
            int i2 = this.n;
            if (i == childCount) {
                if ((i2 & 4) == 0) {
                    return false;
                }
            } else {
                if ((i2 & 2) == 0) {
                    return false;
                }
                do {
                    i--;
                    if (i < 0) {
                        return false;
                    }
                } while (getChildAt(i).getVisibility() == 8);
            }
        } else if ((this.n & 1) == 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t() {
        this.a = false;
    }

    public jp(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public jp(android.content.Context context) {
        this(context, null);
    }
}
