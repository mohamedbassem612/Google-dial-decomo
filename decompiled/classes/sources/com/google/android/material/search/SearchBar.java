package com.google.android.material.search;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class SearchBar extends android.support.v7.widget.Toolbar {
    public final android.widget.TextView B;
    public final android.widget.TextView C;
    public final int D;
    public final android.content.res.ColorStateList E;
    public android.view.View F;
    public int G;
    public defpackage.agaf H;
    public int I;
    public int J;
    public final defpackage.agab K;
    private final android.widget.FrameLayout L;
    private boolean M;
    private final boolean N;
    private final boolean O;
    private final android.graphics.drawable.Drawable P;
    private final boolean Q;
    private final boolean R;
    private java.lang.Integer S;
    private android.graphics.drawable.Drawable T;
    private boolean U;
    private boolean V;
    private int W;
    private final boolean aa;
    private final int ab;
    private android.support.v7.widget.ActionMenuView ac;
    private android.widget.ImageButton ad;
    private final defpackage.afpn ae;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        boolean z;
        super(defpackage.agdv.b(context, attributeSet, i, 2132085948, new int[0]), attributeSet, i);
        int i2 = defpackage.agdv.a;
        this.G = -1;
        this.ae = new defpackage.afze(this);
        android.content.Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") != null) {
                throw new java.lang.UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                throw new java.lang.UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
            }
        }
        this.ab = getResources().getDimensionPixelSize(2131166822);
        android.graphics.drawable.Drawable drawableC = defpackage.lg.e().c(context2, 2131231751);
        this.P = drawableC;
        this.K = new defpackage.agab(null, null);
        int[] iArr = defpackage.afzd.a;
        defpackage.afvl.b(context2, attributeSet, i, 2132085948);
        defpackage.afvl.d(context2, attributeSet, iArr, i, 2132085948, new int[0]);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, 2132085948);
        defpackage.agal agalVar = new defpackage.agal(defpackage.agal.k(context2, attributeSet, i, 2132085948, new defpackage.afzw(0.0f)));
        int color = typedArrayObtainStyledAttributes.getColor(5, 0);
        this.D = color;
        this.E = defpackage.agab.o(context2, typedArrayObtainStyledAttributes, 13);
        float dimension = typedArrayObtainStyledAttributes.getDimension(8, 0.0f);
        this.O = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.U = typedArrayObtainStyledAttributes.getBoolean(7, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.R = typedArrayObtainStyledAttributes.getBoolean(10, false);
        this.Q = typedArrayObtainStyledAttributes.getBoolean(19, true);
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            this.S = java.lang.Integer.valueOf(typedArrayObtainStyledAttributes.getColor(14, -1));
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        java.lang.String string = typedArrayObtainStyledAttributes.getString(2);
        java.lang.String string2 = typedArrayObtainStyledAttributes.getString(3);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(17, -1.0f);
        int color2 = typedArrayObtainStyledAttributes.getColor(16, 0);
        this.V = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.M = typedArrayObtainStyledAttributes.getBoolean(12, false);
        this.W = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        this.aa = typedArrayObtainStyledAttributes.getBoolean(4, false);
        this.I = typedArrayObtainStyledAttributes.getResourceId(15, -1);
        this.J = typedArrayObtainStyledAttributes.getResourceId(9, -1);
        typedArrayObtainStyledAttributes.recycle();
        if (z2) {
            z = true;
        } else {
            t(e() != null ? e() : drawableC);
            z = true;
            L(true);
        }
        setClickable(z);
        setFocusable(z);
        android.view.LayoutInflater.from(context2).inflate(2131624331, this);
        this.N = z;
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131428625);
        this.B = textView;
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(2131428624);
        this.C = textView2;
        this.L = (android.widget.FrameLayout) findViewById(2131428626);
        setElevation(dimension);
        if (resourceId != -1) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
        }
        J(string);
        textView.setHint(string2);
        boolean z3 = this.V;
        if (textView != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) textView.getLayoutParams();
            if (z3) {
                layoutParams.gravity = 1;
                textView.setGravity(1);
            } else {
                layoutParams.gravity = 0;
                textView.setGravity(0);
            }
            textView.setLayoutParams(layoutParams);
            textView2.setLayoutParams(layoutParams);
        }
        defpackage.agaf agafVar = new defpackage.agaf(agalVar);
        this.H = agafVar;
        agafVar.N(getContext());
        this.H.Q(dimension);
        if (dimension2 >= 0.0f) {
            this.H.W(dimension2, color2);
        }
        int iAc = defpackage.agab.ac(getContext(), defpackage.agab.y(getContext(), 2130968945, getClass().getCanonicalName()));
        this.H.R(android.content.res.ColorStateList.valueOf(color));
        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(iAc);
        defpackage.agaf agafVar2 = this.H;
        android.graphics.drawable.RippleDrawable rippleDrawable = new android.graphics.drawable.RippleDrawable(colorStateListValueOf, agafVar2, agafVar2);
        com.google.android.material.focus.FocusRingDrawable.c(getContext(), rippleDrawable, this.H);
        setBackground(rippleDrawable);
    }

    private final void K() {
        int width;
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            int right = 0;
            boolean z = getLayoutDirection() == 1;
            android.widget.ImageButton imageButtonB = defpackage.afvm.b(this);
            if (imageButtonB == null || !imageButtonB.isClickable()) {
                width = 0;
            } else {
                width = z ? getWidth() - imageButtonB.getLeft() : imageButtonB.getRight();
            }
            android.support.v7.widget.ActionMenuView actionMenuViewA = defpackage.afvm.a(this);
            if (actionMenuViewA != null) {
                right = z ? actionMenuViewA.getRight() : getWidth() - actionMenuViewA.getLeft();
            }
            int i = true != z ? width : right;
            if (true != z) {
                width = right;
            }
            setHandwritingBoundsOffsets(-i, 0.0f, -width, 0.0f);
        }
    }

    private final void L(boolean z) {
        android.widget.ImageButton imageButtonB = defpackage.afvm.b(this);
        if (imageButtonB != null) {
            boolean z2 = !z;
            imageButtonB.setClickable(z2);
            imageButtonB.setFocusable(z2);
            android.graphics.drawable.Drawable background = imageButtonB.getBackground();
            if (background != null) {
                this.T = background;
            }
            imageButtonB.setBackgroundDrawable(z ? null : this.T);
            K();
        }
    }

    private static final int M(int i, int i2) {
        return i == 0 ? i2 : i;
    }

    public final float E() {
        return this.H.B();
    }

    public final com.google.android.material.appbar.AppBarLayout F() {
        for (android.view.ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof com.google.android.material.appbar.AppBarLayout) {
                return (com.google.android.material.appbar.AppBarLayout) parent;
            }
        }
        return null;
    }

    public final java.lang.CharSequence G() {
        return this.B.getHint();
    }

    public final java.lang.CharSequence H() {
        return this.B.getText();
    }

    final void I(java.lang.String str) {
        this.C.setText(str);
    }

    public final void J(java.lang.CharSequence charSequence) {
        this.B.setText(charSequence);
        this.C.setText(charSequence);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (this.N && this.F == null && !(view instanceof android.support.v7.widget.ActionMenuView)) {
            this.F = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.support.v7.widget.Toolbar
    public final void o(int i) {
        super.o(i);
        this.G = i;
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        com.google.android.material.appbar.AppBarLayout appBarLayoutF;
        super.onAttachedToWindow();
        defpackage.agab.h(this, this.H);
        if (this.O && (getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
            android.content.res.Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(2131166818);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(2131166819);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = M(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = M(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = M(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = M(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
        if (getLayoutParams() instanceof defpackage.afpm) {
            defpackage.afpm afpmVar = (defpackage.afpm) getLayoutParams();
            if (this.U) {
                if (afpmVar.a == 0) {
                    afpmVar.a = 53;
                }
            } else if (afpmVar.a == 53) {
                afpmVar.a = 0;
            }
        }
        if (!this.M || (appBarLayoutF = F()) == null || this.E == null) {
            return;
        }
        appBarLayoutF.h(this.ae);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.google.android.material.appbar.AppBarLayout appBarLayoutF = F();
        if (appBarLayoutF != null) {
            appBarLayoutF.g.remove(this.ae);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        java.lang.CharSequence charSequenceH = H();
        boolean zIsEmpty = android.text.TextUtils.isEmpty(charSequenceH);
        aa$.ExternalSyntheticApiModelOutline0.m(accessibilityNodeInfo, G());
        aa$.ExternalSyntheticApiModelOutline0.m(accessibilityNodeInfo, zIsEmpty);
        if (zIsEmpty) {
            charSequenceH = G();
        }
        accessibilityNodeInfo.setText(charSequenceH);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.view.View view;
        super.onLayout(z, i, i2, i3, i4);
        android.view.View view2 = this.F;
        if (view2 != null) {
            int measuredWidth = view2.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i5 = measuredWidth + measuredWidth2;
            int measuredHeight = view2.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            int i6 = measuredHeight + measuredHeight2;
            if (getLayoutDirection() == 1) {
                view2.layout(getMeasuredWidth() - i5, measuredHeight2, getMeasuredWidth() - measuredWidth2, i6);
            } else {
                view2.layout(measuredWidth2, measuredHeight2, i5, i6);
            }
        }
        K();
        android.widget.TextView textView = this.B;
        if (textView == null || !this.V) {
            return;
        }
        int measuredWidth3 = getMeasuredWidth() / 2;
        android.widget.FrameLayout frameLayout = this.L;
        int measuredWidth4 = measuredWidth3 - (frameLayout.getMeasuredWidth() / 2);
        int measuredWidth5 = frameLayout.getMeasuredWidth() + measuredWidth4;
        int measuredHeight3 = (getMeasuredHeight() / 2) - (frameLayout.getMeasuredHeight() / 2);
        int measuredHeight4 = frameLayout.getMeasuredHeight() + measuredHeight3;
        int layoutDirection = getLayoutDirection();
        android.support.v7.widget.ActionMenuView actionMenuView = this.ac;
        if (actionMenuView == null) {
            view = actionMenuView;
            android.support.v7.widget.ActionMenuView actionMenuViewA = defpackage.afvm.a(this);
            this.ac = actionMenuViewA;
            view = actionMenuViewA;
        }
        view = actionMenuView;
        android.widget.ImageButton imageButtonB = this.ad;
        if (imageButtonB == null) {
            imageButtonB = defpackage.afvm.b(this);
            this.ad = imageButtonB;
        }
        int measuredWidth6 = (frameLayout.getMeasuredWidth() / 2) - (textView.getMeasuredWidth() / 2);
        int measuredWidth7 = textView.getMeasuredWidth() + measuredWidth6;
        int i7 = measuredWidth6 + measuredWidth4;
        int i8 = measuredWidth7 + measuredWidth4;
        android.view.View view3 = layoutDirection == 1 ? view : imageButtonB;
        if (layoutDirection == 1) {
            view = imageButtonB;
        }
        int iMax = view3 != null ? java.lang.Math.max(view3.getRight() - i7, 0) : 0;
        int i9 = i7 + iMax;
        int i10 = i8 + iMax;
        int iMax2 = view != null ? java.lang.Math.max(i10 - view.getLeft(), 0) : 0;
        int i11 = i9 - iMax2;
        int i12 = i10 - iMax2;
        int paddingLeft = getPaddingLeft() - i11;
        defpackage.lh lhVar = this.p;
        int iMax3 = java.lang.Math.max(paddingLeft, (lhVar != null ? lhVar.a : 0) - i11);
        int measuredWidth8 = i12 - (getMeasuredWidth() - getPaddingRight());
        int measuredWidth9 = getMeasuredWidth();
        defpackage.lh lhVar2 = this.p;
        int iMax4 = ((iMax - iMax2) + java.lang.Math.max(iMax3, 0)) - java.lang.Math.max(java.lang.Math.max(measuredWidth8, i12 - (measuredWidth9 - (lhVar2 != null ? lhVar2.b : 0))), 0);
        frameLayout.layout(measuredWidth4 + iMax4, measuredHeight3, measuredWidth5 + iMax4, measuredHeight4);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int size = android.view.View.MeasureSpec.getSize(i);
        int mode = android.view.View.MeasureSpec.getMode(i);
        int i4 = this.W;
        if (i4 >= 0 && size > i4) {
            i = android.view.View.MeasureSpec.makeMeasureSpec(i4, mode);
        } else if (this.aa && size > (i3 = this.ab)) {
            i = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(i3, java.lang.Math.round(size * 0.5f)), mode);
        }
        super.onMeasure(i, i2);
        android.view.View view = this.F;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.search.SearchBar.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.search.SearchBar.SavedState savedState = (com.google.android.material.search.SearchBar.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        J(savedState.a);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.search.SearchBar.SavedState savedState = new com.google.android.material.search.SearchBar.SavedState(super.onSaveInstanceState());
        java.lang.CharSequence charSequenceH = H();
        savedState.a = charSequenceH == null ? null : charSequenceH.toString();
        return savedState;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        defpackage.agaf agafVar = this.H;
        if (agafVar != null) {
            agafVar.Q(f);
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public final void t(android.graphics.drawable.Drawable drawable) {
        int iAc;
        if (this.Q && drawable != null) {
            java.lang.Integer num = this.S;
            if (num != null) {
                iAc = num.intValue();
            } else {
                iAc = defpackage.agab.ac(getContext(), defpackage.agab.y(getContext(), drawable == this.P ? 2130969057 : 2130969053, getClass().getCanonicalName()));
            }
            drawable = drawable.mutate();
            drawable.setTint(iAc);
        }
        super.t(drawable);
    }

    @Override // android.support.v7.widget.Toolbar
    public final void u(android.view.View.OnClickListener onClickListener) {
        if (this.R) {
            return;
        }
        super.u(onClickListener);
        L(false);
    }

    /* JADX INFO: compiled from: PG */
    public class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.kw(8);
        java.lang.String a;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public final void w(java.lang.CharSequence charSequence) {
    }

    @Override // android.support.v7.widget.Toolbar
    public final void x(java.lang.CharSequence charSequence) {
    }

    public SearchBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130969888);
    }

    public SearchBar(android.content.Context context) {
        this(context, null);
    }
}
