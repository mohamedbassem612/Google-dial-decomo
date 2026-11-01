package com.google.android.material.appbar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class AppBarLayout extends android.widget.LinearLayout implements dul {
    public boolean a;
    public int b;
    public eax c;
    public boolean d;
    public boolean e;
    public final java.util.List f;
    public final java.util.LinkedHashSet g;
    public int h;
    public android.graphics.drawable.Drawable i;
    public java.lang.Integer j;
    public final float k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private android.content.res.ColorStateList q;
    private int r;
    private java.lang.ref.WeakReference s;
    private android.animation.ValueAnimator t;
    private android.animation.ValueAnimator.AnimatorUpdateListener u;
    private final long v;
    private final android.animation.TimeInterpolator w;
    private int[] x;
    private com.google.android.material.appbar.AppBarLayout.Behavior y;

    public AppBarLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(agdv.a(context, attributeSet, i, 2132085317), attributeSet, i);
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.b = 0;
        this.f = new java.util.ArrayList();
        this.g = new java.util.LinkedHashSet();
        android.content.Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == android.view.ViewOutlineProvider.BACKGROUND) {
            int[] iArr = defpackage.afpt.a;
            setOutlineProvider(android.view.ViewOutlineProvider.BOUNDS);
        }
        int[] iArr2 = defpackage.afpt.a;
        android.content.Context context3 = getContext();
        android.content.res.TypedArray typedArrayA = afvl.a(context3, attributeSet, defpackage.afpt.a, i, 2132085317, new int[0]);
        try {
            if (typedArrayA.hasValue(0)) {
                setStateListAnimator(android.animation.AnimatorInflater.loadStateListAnimator(context3, typedArrayA.getResourceId(0, 0)));
            }
            typedArrayA.recycle();
            android.content.res.TypedArray typedArrayA2 = afvl.a(context2, attributeSet, defpackage.afpr.a, i, 2132085317, new int[0]);
            this.q = agab.o(context2, typedArrayA2, 6);
            this.v = agab.u(context2, 2130970059, getResources().getInteger(2131492867));
            this.w = agab.C(context2, 2130970077, afpc.a);
            if (typedArrayA2.hasValue(4)) {
                k(typedArrayA2.getBoolean(4, false), false, false);
            }
            if (typedArrayA2.hasValue(3)) {
                defpackage.afpt.a(this, typedArrayA2.getDimensionPixelSize(3, 0));
            }
            setBackground(typedArrayA2.getDrawable(0));
            if (typedArrayA2.hasValue(2)) {
                setKeyboardNavigationCluster(typedArrayA2.getBoolean(2, false));
            }
            if (typedArrayA2.hasValue(1)) {
                setTouchscreenBlocksFocus(typedArrayA2.getBoolean(1, false));
            }
            this.k = getResources().getDimension(2131165548);
            this.e = typedArrayA2.getBoolean(5, false);
            this.r = typedArrayA2.getResourceId(7, -1);
            android.graphics.drawable.Drawable drawable = typedArrayA2.getDrawable(8);
            android.graphics.drawable.Drawable drawable2 = this.i;
            if (drawable2 != drawable) {
                java.lang.Integer numValueOf = null;
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                android.graphics.drawable.Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
                this.i = drawableMutate;
                if (drawableMutate instanceof agaf) {
                    numValueOf = java.lang.Integer.valueOf(((agaf) drawableMutate).x);
                } else {
                    android.content.res.ColorStateList colorStateListP = agab.P(drawableMutate);
                    if (colorStateListP != null) {
                        numValueOf = java.lang.Integer.valueOf(colorStateListP.getDefaultColor());
                    }
                }
                this.j = numValueOf;
                android.graphics.drawable.Drawable drawable3 = this.i;
                if (drawable3 != null) {
                    if (drawable3.isStateful()) {
                        this.i.setState(getDrawableState());
                    }
                    this.i.setLayoutDirection(getLayoutDirection());
                    this.i.setVisible(getVisibility() == 0, false);
                    this.i.setCallback(this);
                }
                l();
                postInvalidateOnAnimation();
            }
            typedArrayA2.recycle();
            ebx ebxVar = new ebx(this, 10);
            int i2 = dzs.a;
            dzk.o(this, ebxVar);
        } catch (java.lang.Throwable th) {
            typedArrayA.recycle();
            throw th;
        }
    }

    protected static final afpm n(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
            return new afpm((android.widget.LinearLayout.LayoutParams) layoutParams);
        }
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new afpm((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new afpm(layoutParams);
    }

    private final void p() {
        com.google.android.material.appbar.AppBarLayout.Behavior behavior = this.y;
        com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState savedStateI = null;
        if (behavior != null && this.m != -1 && this.b == 0) {
            savedStateI = behavior.i(androidx.customview.view.AbsSavedState.c, this);
        }
        this.m = -1;
        this.n = -1;
        this.o = -1;
        if (savedStateI != null) {
            this.y.k(savedStateI, false);
        }
    }

    private final void q(float f, float f2) {
        android.animation.ValueAnimator valueAnimator = this.t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(f, f2);
        this.t = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.v);
        this.t.setInterpolator(this.w);
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.u;
        if (animatorUpdateListener != null) {
            this.t.addUpdateListener(animatorUpdateListener);
        }
        this.t.start();
    }

    private final boolean r() {
        return this.i != null && e() > 0;
    }

    private final boolean s() {
        if (getChildCount() <= 0) {
            return false;
        }
        android.view.View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || childAt.getFitsSystemWindows()) ? false : true;
    }

    public final dum a() {
        com.google.android.material.appbar.AppBarLayout.Behavior behavior = new com.google.android.material.appbar.AppBarLayout.Behavior();
        this.y = behavior;
        return behavior;
    }

    public final int b() {
        int iMin;
        int minimumHeight;
        int i = this.n;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            android.view.View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                afpm layoutParams = childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = layoutParams.a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = layoutParams.topMargin + layoutParams.bottomMargin;
                    if ((i3 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else {
                        if ((i3 & 2) != 0) {
                            minimumHeight = measuredHeight - childAt.getMinimumHeight();
                        } else {
                            iMin = i4 + measuredHeight;
                        }
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = java.lang.Math.min(iMin, measuredHeight - e());
                        }
                        i2 += iMin;
                    }
                    iMin = i4 + minimumHeight;
                    if (childCount == 0) {
                        iMin = java.lang.Math.min(iMin, measuredHeight - e());
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = java.lang.Math.max(0, i2);
        this.n = iMax;
        return iMax;
    }

    final int c() {
        int i = this.o;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int minimumHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                afpm layoutParams = childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                int i3 = layoutParams.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
        }
        int iMax = java.lang.Math.max(0, minimumHeight);
        this.o = iMax;
        return iMax;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof afpm;
    }

    public final int d() {
        int iE = e();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i = (minimumHeight << 1) + iE;
            if (i < getHeight()) {
                return i;
            }
        } else {
            int childCount = getChildCount();
            minimumHeight = childCount > 0 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
            int i2 = (minimumHeight << 1) + iE;
            if (i2 < getHeight()) {
                return i2;
            }
        }
        return minimumHeight + iE;
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        if (r()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.l);
            this.i.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        android.graphics.drawable.Drawable drawable = this.i;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    final int e() {
        eax eaxVar = this.c;
        if (eaxVar != null) {
            return eaxVar.d();
        }
        return 0;
    }

    public final int f() {
        int i = this.m;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (i2 < childCount) {
            android.view.View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                afpm layoutParams = childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = layoutParams.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight + layoutParams.topMargin + layoutParams.bottomMargin;
                if (i2 == 0) {
                    if (childAt.getFitsSystemWindows()) {
                        minimumHeight -= e();
                    }
                    i2 = 0;
                }
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = java.lang.Math.max(0, minimumHeight);
        this.m = iMax;
        return iMax;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final afpm generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new afpm(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new afpm();
    }

    public final void h(afpn afpnVar) {
        this.g.add(afpnVar);
    }

    final void i(int i) {
        this.l = i;
        if (willNotDraw()) {
            return;
        }
        postInvalidateOnAnimation();
    }

    public final void j(boolean z) {
        k(z, isLaidOut(), true);
    }

    public final void k(boolean z, boolean z2, boolean z3) {
        this.b = (true != z ? 2 : 1) | (true != z2 ? 0 : 4) | (true == z3 ? 8 : 0);
        requestLayout();
    }

    public final void l() {
        setWillNotDraw(!r());
    }

    final boolean m(android.view.View view) {
        int i;
        if (this.s == null && (i = this.r) != -1) {
            android.view.View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof android.view.ViewGroup)) {
                viewFindViewById = ((android.view.ViewGroup) getParent()).findViewById(this.r);
            }
            if (viewFindViewById != null) {
                this.s = new java.lang.ref.WeakReference(viewFindViewById);
            }
        }
        java.lang.ref.WeakReference weakReference = this.s;
        android.view.View view2 = weakReference != null ? (android.view.View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final boolean o(boolean z) {
        if (this.d == z) {
            return false;
        }
        this.d = z;
        refreshDrawableState();
        if (!(getBackground() instanceof agaf)) {
            return true;
        }
        float f = 0.0f;
        if (this.q != null) {
            q(true != z ? 1.0f : 0.0f, true == z ? 1.0f : 0.0f);
            return true;
        }
        if (!this.e) {
            return true;
        }
        float f2 = this.k;
        if (z) {
            f = f2;
            f2 = 0.0f;
        }
        q(f2, f);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        agab.f(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArr = this.x;
        if (iArr == null) {
            iArr = new int[4];
            this.x = iArr;
        }
        int length = iArr.length;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 4);
        boolean z = this.p;
        boolean z2 = false;
        iArr[0] = true != z ? -2130970455 : 2130970455;
        int i2 = -2130970456;
        if (!z) {
            z2 = true;
        } else if (this.d) {
            i2 = 2130970456;
        }
        iArr[1] = i2;
        iArr[2] = true != z2 ? 2130970451 : -2130970451;
        int i3 = -2130970450;
        if (z && this.d) {
            i3 = 2130970450;
        }
        iArr[3] = i3;
        return mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        java.lang.ref.WeakReference weakReference = this.s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.s = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getFitsSystemWindows() && s()) {
            int iE = e();
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                android.view.View childAt = getChildAt(childCount);
                int i5 = dzs.a;
                childAt.offsetTopAndBottom(iE);
            }
        }
        p();
        boolean z2 = false;
        this.a = false;
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            if (getChildAt(i6).getLayoutParams().c != null) {
                this.a = true;
                break;
            }
        }
        android.graphics.drawable.Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), e());
        }
        if (this.e) {
            z2 = true;
            break;
        }
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            int i8 = getChildAt(i7).getLayoutParams().a;
            if ((i8 & 1) == 1 && (i8 & 10) != 0) {
                z2 = true;
                break;
            }
        }
        if (this.p != z2) {
            this.p = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = android.view.View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && s()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = dzk.B(getMeasuredHeight() + e(), 0, android.view.View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += e();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        p();
    }

    @Override // android.view.View
    public final void setBackground(android.graphics.drawable.Drawable drawable) {
        final android.graphics.drawable.Drawable drawable2;
        boolean z = drawable instanceof agaf;
        android.content.Context context = getContext();
        if (z) {
            drawable2 = (agaf) drawable;
        } else {
            android.content.res.ColorStateList colorStateListP = agab.P(drawable);
            if (colorStateListP == null) {
                drawable2 = null;
            } else {
                android.graphics.drawable.Drawable agafVar = new agaf();
                agafVar.R(colorStateListP);
                drawable2 = agafVar;
            }
        }
        if (drawable2 != null && drawable2.H() != null) {
            this.h = drawable2.H().getDefaultColor();
            final android.content.res.ColorStateList colorStateList = this.q;
            if (colorStateList != null) {
                android.content.Context context2 = getContext();
                android.util.TypedValue typedValueX = agab.x(context2.getTheme(), 2130969105);
                final java.lang.Integer numValueOf = typedValueX != null ? java.lang.Integer.valueOf(agab.ac(context2, typedValueX)) : null;
                this.u = new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: afpj
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                        java.lang.Integer num;
                        float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                        android.content.res.ColorStateList colorStateList2 = colorStateList;
                        com.google.android.material.appbar.AppBarLayout appBarLayout = this.a;
                        int iAb = agab.ab(appBarLayout.h, colorStateList2.getDefaultColor(), fFloatValue);
                        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(iAb);
                        agaf agafVar2 = drawable2;
                        agafVar2.R(colorStateListValueOf);
                        if (appBarLayout.i != null && (num = appBarLayout.j) != null && num.equals(numValueOf)) {
                            appBarLayout.i.setTint(iAb);
                        }
                        java.util.List<defpackage.rai> list = appBarLayout.f;
                        if (!list.isEmpty()) {
                            for (defpackage.rai raiVar : list) {
                                if (agafVar2.H() != null) {
                                    raiVar.d(iAb);
                                }
                            }
                        }
                        java.util.LinkedHashSet linkedHashSet = appBarLayout.g;
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        java.util.Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            ((afpn) it.next()).a(iAb, fFloatValue);
                        }
                    }
                };
            } else {
                drawable2.N(context);
                this.u = new defpackage.wer((java.lang.Object) this, (agaf) drawable2, 4);
            }
            drawable = drawable2;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        agab.e(this, f);
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (i != 1) {
            throw new java.lang.IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(1);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        android.graphics.drawable.Drawable drawable = this.i;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.i;
    }

    /* JADX INFO: compiled from: PG */
    public class BaseBehavior extends defpackage.afpp {
        public int a;
        private int c;
        private android.animation.ValueAnimator d;
        private com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState e;
        private java.lang.ref.WeakReference f;

        public BaseBehavior() {
        }

        public static final android.view.View m(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = coordinatorLayout.getChildAt(i);
                if (childAt.getLayoutParams().a instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private final void r(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout) {
            int i = dzs.a;
            if (dzp.a(coordinatorLayout) == null) {
                dzs.i(coordinatorLayout, new defpackage.afpk(this, appBarLayout, coordinatorLayout));
            }
        }

        private final void s(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout) {
            int iE = appBarLayout.e() + appBarLayout.getPaddingTop();
            int iG = g() - iE;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                android.view.View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                afpm layoutParams = childAt.getLayoutParams();
                if (t(layoutParams.a, 32)) {
                    top -= layoutParams.topMargin;
                    bottom += layoutParams.bottomMargin;
                }
                int i2 = -iG;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                android.view.View childAt2 = appBarLayout.getChildAt(i);
                afpm layoutParams2 = childAt2.getLayoutParams();
                int i3 = layoutParams2.a;
                if ((i3 & 17) == 17) {
                    int iE2 = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        iE2 -= appBarLayout.e();
                    }
                    if (t(i3, 2)) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if (t(i3, 5)) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iG < minimumHeight2) {
                            iE2 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (t(i3, 32)) {
                        iE2 += layoutParams2.topMargin;
                        minimumHeight -= layoutParams2.bottomMargin;
                    }
                    if (iG < (minimumHeight + iE2) / 2) {
                        iE2 = minimumHeight;
                    }
                    u(coordinatorLayout, appBarLayout, dzk.B(iE2 + iE, -appBarLayout.f(), 0));
                }
            }
        }

        private static boolean t(int i, int i2) {
            return (i & i2) == i2;
        }

        private final void u(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, int i) {
            int iAbs = (int) (((java.lang.Math.abs(g() - i) / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iG = g();
            android.animation.ValueAnimator valueAnimator = this.d;
            if (iG == i) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.d.cancel();
                return;
            }
            if (valueAnimator == null) {
                android.animation.ValueAnimator valueAnimator2 = new android.animation.ValueAnimator();
                this.d = valueAnimator2;
                valueAnimator2.setInterpolator(afpc.e);
                this.d.addUpdateListener(new defpackage.agck(this, coordinatorLayout, appBarLayout, 1));
            } else {
                valueAnimator.cancel();
            }
            this.d.setDuration(java.lang.Math.min(iAbs, 600));
            this.d.setIntValues(iG, i);
            this.d.start();
        }

        private static final android.view.View v(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof dyt) || (childAt instanceof android.widget.AbsListView) || (childAt instanceof android.widget.ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0059  */
        private static final void w(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, int i, int i2, boolean z) {
            android.view.View childAt;
            boolean zM;
            int iAbs = java.lang.Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    childAt = null;
                    break;
                }
                childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (childAt != null) {
                int i4 = childAt.getLayoutParams().a;
                if ((i4 & 1) != 0) {
                    int minimumHeight = childAt.getMinimumHeight();
                    zM = true;
                    if (i2 <= 0 || (i4 & 12) == 0 ? (i4 & 2) == 0 || (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.e() : (-i) < (childAt.getBottom() - minimumHeight) - appBarLayout.e()) {
                        zM = false;
                    }
                } else {
                    zM = false;
                }
            } else {
                zM = false;
            }
            if (appBarLayout.e) {
                zM = appBarLayout.m(v(coordinatorLayout));
            }
            boolean zO = appBarLayout.o(zM);
            if (!z) {
                if (zO) {
                    java.util.ArrayList arrayListJ = coordinatorLayout.h.J(appBarLayout);
                    java.util.List arrayList = arrayListJ != null ? new java.util.ArrayList(arrayListJ) : null;
                    if (arrayList == null) {
                        arrayList = java.util.Collections.EMPTY_LIST;
                    }
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        dum dumVar = ((android.view.View) arrayList.get(i5)).getLayoutParams().a;
                        if (dumVar instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) {
                            if (((com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) dumVar).d == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        @Override // defpackage.afpp
        public final /* bridge */ /* synthetic */ int e(android.view.View view) {
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view;
            return (-appBarLayout.c()) + appBarLayout.e();
        }

        @Override // defpackage.afpp
        public final /* synthetic */ int f(android.view.View view) {
            return ((com.google.android.material.appbar.AppBarLayout) view).f();
        }

        @Override // defpackage.afpp
        public final int g() {
            return p() + this.a;
        }

        @Override // defpackage.afpp
        public final /* bridge */ /* synthetic */ int h(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3) {
            int iSignum;
            int iE;
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view;
            int iG = g();
            int i4 = 0;
            if (i2 == 0 || iG < i2 || iG > i3) {
                this.a = 0;
            } else {
                int iB = dzk.B(i, i2, i3);
                if (iG != iB) {
                    if (!appBarLayout.a) {
                        iSignum = iB;
                        break;
                    }
                    int iAbs = java.lang.Math.abs(iB);
                    int childCount = appBarLayout.getChildCount();
                    int i5 = 0;
                    while (true) {
                        if (i5 < childCount) {
                            android.view.View childAt = appBarLayout.getChildAt(i5);
                            afpm layoutParams = childAt.getLayoutParams();
                            android.view.animation.Interpolator interpolator = layoutParams.c;
                            if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                                i5++;
                            } else if (interpolator != null) {
                                int i6 = layoutParams.a;
                                if ((i6 & 1) != 0) {
                                    iE = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
                                    if ((i6 & 2) != 0) {
                                        iE -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    iE = 0;
                                }
                                if (childAt.getFitsSystemWindows()) {
                                    iE -= appBarLayout.e();
                                }
                                if (iE > 0) {
                                    float f = iE;
                                    iSignum = java.lang.Integer.signum(iB) * (childAt.getTop() + java.lang.Math.round(f * interpolator.getInterpolation((iAbs - childAt.getTop()) / f)));
                                    break;
                                }
                            }
                        }
                        iSignum = iB;
                        break;
                    }
                    boolean zQ = q(iSignum);
                    int i7 = iG - iB;
                    this.a = iB - iSignum;
                    if (zQ) {
                        for (int i8 = 0; i8 < appBarLayout.getChildCount(); i8++) {
                            afpm layoutParams2 = appBarLayout.getChildAt(i8).getLayoutParams();
                            defpackage.afpl afplVar = layoutParams2.b;
                            if (afplVar != null && (layoutParams2.a & 1) != 0) {
                                android.view.View childAt2 = appBarLayout.getChildAt(i8);
                                float fP = p();
                                android.graphics.Rect rect = (android.graphics.Rect) afplVar.a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.e());
                                float fAbs = rect.top - java.lang.Math.abs(fP);
                                if (fAbs <= 0.0f) {
                                    float fA = 1.0f - dzk.A(java.lang.Math.abs(fAbs / rect.height()), 0.0f, 1.0f);
                                    float fHeight = (-fAbs) - ((rect.height() * 0.3f) * (1.0f - (fA * fA)));
                                    childAt2.setTranslationY(fHeight);
                                    android.graphics.Rect rect2 = (android.graphics.Rect) afplVar.b;
                                    childAt2.getDrawingRect(rect2);
                                    rect2.offset(0, (int) (-fHeight));
                                    if (fHeight >= rect2.height()) {
                                        childAt2.setAlpha(0.0f);
                                    } else {
                                        childAt2.setAlpha(1.0f);
                                    }
                                    childAt2.setClipBounds(rect2);
                                } else {
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(0.0f);
                                    childAt2.setAlpha(1.0f);
                                }
                            }
                        }
                    } else if (appBarLayout.a) {
                        coordinatorLayout.b(appBarLayout);
                    }
                    appBarLayout.i(p());
                    w(coordinatorLayout, appBarLayout, iB, iB < iG ? -1 : 1, false);
                    i4 = i7;
                }
            }
            r(coordinatorLayout, appBarLayout);
            return i4;
        }

        final com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState i(android.os.Parcelable parcelable, com.google.android.material.appbar.AppBarLayout appBarLayout) {
            int iP = p();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iP;
                if (childAt.getTop() + iP <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = androidx.customview.view.AbsSavedState.c;
                    }
                    com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState savedState = new com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState(parcelable);
                    boolean z = iP == 0;
                    savedState.b = z;
                    savedState.a = !z && (-iP) >= appBarLayout.f();
                    savedState.e = i;
                    savedState.g = bottom == childAt.getMinimumHeight() + appBarLayout.e();
                    savedState.f = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        @Override // defpackage.afpp
        public final /* bridge */ /* synthetic */ void j(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view;
            s(coordinatorLayout, appBarLayout);
            if (appBarLayout.e) {
                appBarLayout.o(appBarLayout.m(v(coordinatorLayout)));
            }
        }

        final void k(com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState savedState, boolean z) {
            if (this.e == null || z) {
                this.e = savedState;
            }
        }

        @Override // defpackage.afpp
        public final /* bridge */ /* synthetic */ boolean l(android.view.View view) {
            java.lang.ref.WeakReference weakReference = this.f;
            if (weakReference == null) {
                return true;
            }
            android.view.View view2 = (android.view.View) weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0026  */
        public final void n(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, int i, int[] iArr) {
            com.google.android.material.appbar.AppBarLayout appBarLayout2;
            int i2;
            int iB;
            if (i == 0) {
                appBarLayout2 = appBarLayout;
            } else {
                if (i < 0) {
                    i2 = -appBarLayout.f();
                    iB = appBarLayout.b() + i2;
                } else {
                    i2 = -appBarLayout.f();
                    iB = 0;
                }
                int i3 = i2;
                int i4 = iB;
                if (i3 != i4) {
                    appBarLayout2 = appBarLayout;
                    iArr[1] = o(coordinatorLayout, appBarLayout2, i, i3, i4);
                } else {
                    appBarLayout2 = appBarLayout;
                }
            }
            if (appBarLayout2.e) {
                appBarLayout2.o(appBarLayout2.m(view));
            }
        }

        @Override // defpackage.afps
        public final /* bridge */ /* synthetic */ boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
            com.google.android.material.appbar.AppBarLayout.BaseBehavior baseBehavior;
            androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout2;
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view;
            super.onLayoutChild(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.b;
            com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState savedState = this.e;
            if (savedState == null || (i2 & 8) != 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                if (i2 != 0) {
                    int i3 = i2 & 4;
                    if ((i2 & 2) != 0) {
                        int i4 = -appBarLayout.f();
                        if (i3 != 0) {
                            baseBehavior.u(coordinatorLayout2, appBarLayout, i4);
                        } else {
                            baseBehavior.h(coordinatorLayout2, appBarLayout, i4, Integer.MIN_VALUE, Integer.MAX_VALUE);
                        }
                    } else if ((i2 & 1) != 0) {
                        if (i3 != 0) {
                            baseBehavior.u(coordinatorLayout2, appBarLayout, 0);
                        } else {
                            baseBehavior.h(coordinatorLayout2, appBarLayout, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
                        }
                    }
                }
            } else if (savedState.a) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                baseBehavior.h(coordinatorLayout2, appBarLayout, -appBarLayout.f(), Integer.MIN_VALUE, Integer.MAX_VALUE);
            } else {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                if (savedState.b) {
                    baseBehavior.h(coordinatorLayout2, appBarLayout, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
                } else {
                    android.view.View childAt = appBarLayout.getChildAt(savedState.e);
                    baseBehavior.h(coordinatorLayout2, appBarLayout, (-childAt.getBottom()) + (baseBehavior.e.g ? childAt.getMinimumHeight() + appBarLayout.e() : java.lang.Math.round(childAt.getHeight() * baseBehavior.e.f)), Integer.MIN_VALUE, Integer.MAX_VALUE);
                }
            }
            appBarLayout.b = 0;
            baseBehavior.e = null;
            baseBehavior.q(dzk.B(baseBehavior.p(), -appBarLayout.f(), 0));
            w(coordinatorLayout2, appBarLayout, baseBehavior.p(), 0, true);
            appBarLayout.i(baseBehavior.p());
            baseBehavior.r(coordinatorLayout2, appBarLayout);
            return true;
        }

        public final /* bridge */ /* synthetic */ boolean onMeasureChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3, int i4) {
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view;
            if (appBarLayout.getLayoutParams().height != -2) {
                return false;
            }
            coordinatorLayout.k(appBarLayout, i, i2, 0, i4);
            return true;
        }

        public final /* bridge */ /* synthetic */ void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i, int i2, int[] iArr, int i3) {
            n(coordinatorLayout, (com.google.android.material.appbar.AppBarLayout) view, view2, i2, iArr);
        }

        public final /* bridge */ /* synthetic */ void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            int i6;
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view;
            if (i4 < 0) {
                i6 = i4;
                iArr[1] = o(coordinatorLayout, appBarLayout, i6, -appBarLayout.c(), 0);
            } else {
                i6 = i4;
            }
            if (i6 == 0) {
                r(coordinatorLayout, appBarLayout);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final /* bridge */ /* synthetic */ void onRestoreInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.os.Parcelable parcelable) {
            if (!(parcelable instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState)) {
                this.e = null;
            } else {
                k((com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState) parcelable, true);
                android.os.Parcelable parcelable2 = ((androidx.customview.view.AbsSavedState) this.e).d;
            }
        }

        public final /* bridge */ /* synthetic */ android.os.Parcelable onSaveInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view;
            android.os.Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState(coordinatorLayout, appBarLayout);
            androidx.customview.view.AbsSavedState absSavedStateI = i(parcelableOnSaveInstanceState, appBarLayout);
            return absSavedStateI != null ? absSavedStateI : parcelableOnSaveInstanceState;
        }

        public final /* bridge */ /* synthetic */ boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i, int i2) {
            android.animation.ValueAnimator valueAnimator;
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view;
            boolean z = false;
            if ((i & 2) != 0 && (appBarLayout.e || appBarLayout.d || (appBarLayout.f() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()))) {
                z = true;
            }
            if (z && (valueAnimator = this.d) != null) {
                valueAnimator.cancel();
            }
            this.f = null;
            this.c = i2;
            return z;
        }

        public final /* bridge */ /* synthetic */ void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i) {
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view;
            if (this.c == 0 || i == 1) {
                s(coordinatorLayout, appBarLayout);
                if (appBarLayout.e) {
                    appBarLayout.o(appBarLayout.m(view2));
                }
            }
            this.f = new java.lang.ref.WeakReference(view2);
        }

        public BaseBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: compiled from: PG */
        public class SavedState extends androidx.customview.view.AbsSavedState {
            public static final android.os.Parcelable.Creator CREATOR = new defpackage.afqt(1);
            boolean a;
            boolean b;
            int e;
            float f;
            boolean g;

            public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                super(parcel, classLoader);
                this.a = parcel.readByte() != 0;
                this.b = parcel.readByte() != 0;
                this.e = parcel.readInt();
                this.f = parcel.readFloat();
                this.g = parcel.readByte() != 0;
            }

            public final void writeToParcel(android.os.Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.e);
                parcel.writeFloat(this.f);
                parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            }

            public SavedState(android.os.Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    /* JADX INFO: compiled from: PG */
    public class Behavior extends com.google.android.material.appbar.AppBarLayout.BaseBehavior {
        public Behavior() {
        }

        public Behavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new afpm();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return n(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return n(layoutParams);
    }

    /* JADX INFO: compiled from: PG */
    public class ScrollingViewBehavior extends defpackage.afpq {
        public ScrollingViewBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.afpr.d);
            this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        static final com.google.android.material.appbar.AppBarLayout h(java.util.List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                android.view.View view = (android.view.View) list.get(i);
                if (view instanceof com.google.android.material.appbar.AppBarLayout) {
                    return (com.google.android.material.appbar.AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.afpq
        public final float e(android.view.View view) {
            int i;
            if (view instanceof com.google.android.material.appbar.AppBarLayout) {
                com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view;
                int iF = appBarLayout.f();
                int iB = appBarLayout.b();
                dum dumVar = appBarLayout.getLayoutParams().a;
                int iG = dumVar instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior ? ((com.google.android.material.appbar.AppBarLayout.BaseBehavior) dumVar).g() : 0;
                if ((iB == 0 || iF + iG > iB) && (i = iF - iB) != 0) {
                    return (iG / i) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // defpackage.afpq
        public final int f(android.view.View view) {
            return ((com.google.android.material.appbar.AppBarLayout) view).f();
        }

        @Override // defpackage.afpq
        public final /* bridge */ /* synthetic */ android.view.View g(java.util.List list) {
            return h(list);
        }

        public final boolean layoutDependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            return view2 instanceof com.google.android.material.appbar.AppBarLayout;
        }

        public boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            dum dumVar = view2.getLayoutParams().a;
            if (dumVar instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((com.google.android.material.appbar.AppBarLayout.BaseBehavior) dumVar).a) + this.c) - i(view2);
                int i = dzs.a;
                view.offsetTopAndBottom(bottom);
            }
            if (!(view2 instanceof com.google.android.material.appbar.AppBarLayout)) {
                return false;
            }
            com.google.android.material.appbar.AppBarLayout appBarLayout = (com.google.android.material.appbar.AppBarLayout) view2;
            if (!appBarLayout.e) {
                return false;
            }
            appBarLayout.o(appBarLayout.m(view));
            return false;
        }

        public final void onDependentViewRemoved(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
            if (view2 instanceof com.google.android.material.appbar.AppBarLayout) {
                dzs.i(coordinatorLayout, (dye) null);
            }
        }

        @Override // defpackage.afps
        public /* bridge */ /* synthetic */ boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
            super.onLayoutChild(coordinatorLayout, view, i);
            return true;
        }

        public final boolean onRequestChildRectangleOnScreen(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.graphics.Rect rect, boolean z) {
            com.google.android.material.appbar.AppBarLayout appBarLayoutH = h(coordinatorLayout.a(view));
            if (appBarLayoutH == null) {
                return false;
            }
            android.graphics.Rect rect2 = new android.graphics.Rect(rect);
            rect2.offset(view.getLeft(), view.getTop());
            android.graphics.Rect rect3 = this.a;
            rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
            if (rect3.contains(rect2)) {
                return false;
            }
            appBarLayoutH.k(false, !z, true);
            return true;
        }

        public ScrollingViewBehavior() {
        }
    }

    public AppBarLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130968652);
    }

    public AppBarLayout(android.content.Context context) {
        this(context, null);
    }
}
