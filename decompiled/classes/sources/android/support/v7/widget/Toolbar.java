package android.support.v7.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class Toolbar extends android.view.ViewGroup implements defpackage.dys {
    public final defpackage.aogc A;
    private android.widget.ImageButton B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private android.content.res.ColorStateList I;
    private android.content.res.ColorStateList J;
    private boolean K;
    private boolean L;
    private final java.util.ArrayList M;
    private final int[] N;
    private ly O;
    private android.window.OnBackInvokedCallback P;
    private android.window.OnBackInvokedDispatcher Q;
    private final java.lang.Runnable R;
    private final defpackage.apnt S;
    public android.support.v7.widget.ActionMenuView a;
    public android.widget.TextView b;
    public android.widget.TextView c;
    public android.widget.ImageView d;
    public android.graphics.drawable.Drawable e;
    public java.lang.CharSequence f;
    public android.widget.ImageButton g;
    public android.view.View h;
    public android.content.Context i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public defpackage.lh p;
    public java.lang.CharSequence q;
    public java.lang.CharSequence r;
    public final java.util.ArrayList s;
    public java.util.ArrayList t;
    public defpackage.lv u;
    public defpackage.hb v;
    public defpackage.lt w;
    public defpackage.gd x;
    public defpackage.fr y;
    public boolean z;

    public Toolbar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.H = 8388627;
        this.M = new java.util.ArrayList();
        this.s = new java.util.ArrayList();
        this.N = new int[2];
        this.A = new defpackage.aogc(new defpackage.am(this, 17));
        this.t = new java.util.ArrayList();
        this.S = new defpackage.apnt(this, (byte[]) null);
        this.R = new defpackage.am(this, 18, null);
        android.content.Context context2 = getContext();
        int[] iArr = defpackage.ef.y;
        defpackage.ajxw ajxwVar = new defpackage.ajxw(context2, context2.obtainStyledAttributes(attributeSet, iArr, i, 0));
        java.lang.Object obj = ajxwVar.b;
        int i2 = defpackage.dzs.a;
        defpackage.dzp.b(this, context, iArr, attributeSet, (android.content.res.TypedArray) obj, i, 0);
        this.k = ajxwVar.r(28, 0);
        this.l = ajxwVar.r(19, 0);
        this.H = ajxwVar.p(0, this.H);
        this.m = ajxwVar.p(2, 48);
        int iM = ajxwVar.m(22, 0);
        iM = ajxwVar.z(27) ? ajxwVar.m(27, iM) : iM;
        this.E = iM;
        this.D = iM;
        this.o = iM;
        this.n = iM;
        int iM2 = ajxwVar.m(25, -1);
        if (iM2 >= 0) {
            this.n = iM2;
        }
        int iM3 = ajxwVar.m(24, -1);
        if (iM3 >= 0) {
            this.o = iM3;
        }
        int iM4 = ajxwVar.m(26, -1);
        if (iM4 >= 0) {
            this.D = iM4;
        }
        int iM5 = ajxwVar.m(23, -1);
        if (iM5 >= 0) {
            this.E = iM5;
        }
        this.C = ajxwVar.n(13, -1);
        int iM6 = ajxwVar.m(9, Integer.MIN_VALUE);
        int iM7 = ajxwVar.m(5, Integer.MIN_VALUE);
        int iN = ajxwVar.n(7, 0);
        int iN2 = ajxwVar.n(8, 0);
        m();
        defpackage.lh lhVar = this.p;
        lhVar.h = false;
        if (iN != Integer.MIN_VALUE) {
            lhVar.e = iN;
            lhVar.a = iN;
        }
        if (iN2 != Integer.MIN_VALUE) {
            lhVar.f = iN2;
            lhVar.b = iN2;
        }
        if (iM6 != Integer.MIN_VALUE || iM7 != Integer.MIN_VALUE) {
            lhVar.a(iM6, iM7);
        }
        this.F = ajxwVar.m(10, Integer.MIN_VALUE);
        this.G = ajxwVar.m(6, Integer.MIN_VALUE);
        this.e = ajxwVar.t(4);
        this.f = ajxwVar.v(3);
        java.lang.CharSequence charSequenceV = ajxwVar.v(21);
        if (!android.text.TextUtils.isEmpty(charSequenceV)) {
            x(charSequenceV);
        }
        java.lang.CharSequence charSequenceV2 = ajxwVar.v(18);
        if (!android.text.TextUtils.isEmpty(charSequenceV2)) {
            w(charSequenceV2);
        }
        this.i = getContext();
        v(ajxwVar.r(17, 0));
        android.graphics.drawable.Drawable drawableT = ajxwVar.t(16);
        if (drawableT != null) {
            t(drawableT);
        }
        java.lang.CharSequence charSequenceV3 = ajxwVar.v(15);
        if (!android.text.TextUtils.isEmpty(charSequenceV3)) {
            r(charSequenceV3);
        }
        android.graphics.drawable.Drawable drawableT2 = ajxwVar.t(11);
        if (drawableT2 != null) {
            p(drawableT2);
        }
        java.lang.CharSequence charSequenceV4 = ajxwVar.v(12);
        if (!android.text.TextUtils.isEmpty(charSequenceV4)) {
            if (!android.text.TextUtils.isEmpty(charSequenceV4)) {
                L();
            }
            android.widget.ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setContentDescription(charSequenceV4);
            }
        }
        if (ajxwVar.z(29)) {
            android.content.res.ColorStateList colorStateListS = ajxwVar.s(29);
            this.I = colorStateListS;
            android.widget.TextView textView = this.b;
            if (textView != null) {
                textView.setTextColor(colorStateListS);
            }
        }
        if (ajxwVar.z(20)) {
            android.content.res.ColorStateList colorStateListS2 = ajxwVar.s(20);
            this.J = colorStateListS2;
            android.widget.TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setTextColor(colorStateListS2);
            }
        }
        if (ajxwVar.z(14)) {
            o(ajxwVar.r(14, 0));
        }
        ajxwVar.x();
    }

    protected static defpackage.lu D(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof defpackage.lu) {
            return new defpackage.lu((defpackage.lu) layoutParams);
        }
        if (layoutParams instanceof defpackage.cn) {
            return new defpackage.lu((defpackage.cn) layoutParams);
        }
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new defpackage.lu((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new defpackage.lu(layoutParams);
    }

    private final int E(int i) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    private final int F(android.view.View view, int i) {
        defpackage.lu luVar = (defpackage.lu) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = luVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.H & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - luVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (iMax < luVar.topMargin) {
            iMax = luVar.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            if (i4 < luVar.bottomMargin) {
                iMax = java.lang.Math.max(0, iMax - (luVar.bottomMargin - i4));
            }
        }
        return paddingTop + iMax;
    }

    private final int G(android.view.View view, int i, int[] iArr, int i2) {
        defpackage.lu luVar = (defpackage.lu) view.getLayoutParams();
        int i3 = luVar.leftMargin - iArr[0];
        int iMax = i + java.lang.Math.max(0, i3);
        iArr[0] = java.lang.Math.max(0, -i3);
        int iF = F(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iF, iMax + measuredWidth, view.getMeasuredHeight() + iF);
        return iMax + measuredWidth + luVar.rightMargin;
    }

    private final int H(android.view.View view, int i, int[] iArr, int i2) {
        defpackage.lu luVar = (defpackage.lu) view.getLayoutParams();
        int i3 = luVar.rightMargin - iArr[1];
        int iMax = i - java.lang.Math.max(0, i3);
        iArr[1] = java.lang.Math.max(0, -i3);
        int iF = F(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iF, iMax, view.getMeasuredHeight() + iF);
        return iMax - (measuredWidth + luVar.leftMargin);
    }

    private final int I(android.view.View view, int i, int i2, int i3, int i4, int[] iArr) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = java.lang.Math.max(0, i5) + java.lang.Math.max(0, i6);
        iArr[0] = java.lang.Math.max(0, -i5);
        iArr[1] = java.lang.Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private final void J(java.util.List list, int i) {
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (layoutDirection != 1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = getChildAt(i2);
                defpackage.lu luVar = (defpackage.lu) childAt.getLayoutParams();
                if (luVar.b == 0 && O(childAt) && E(luVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            android.view.View childAt2 = getChildAt(childCount);
            defpackage.lu luVar2 = (defpackage.lu) childAt2.getLayoutParams();
            if (luVar2.b == 0 && O(childAt2) && E(luVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private final void K(android.view.View view, boolean z) {
        defpackage.lu luVarD;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            luVarD = new defpackage.lu();
        } else {
            luVarD = !checkLayoutParams(layoutParams) ? D(layoutParams) : (defpackage.lu) layoutParams;
        }
        luVarD.b = 1;
        if (!z || this.h == null) {
            addView(view, luVarD);
        } else {
            view.setLayoutParams(luVarD);
            this.s.add(view);
        }
    }

    private final void L() {
        if (this.d == null) {
            this.d = new android.support.v7.widget.AppCompatImageView(getContext());
        }
    }

    private final void M() {
        if (this.B == null) {
            this.B = new defpackage.hr(getContext(), null, 2130970932);
            defpackage.lu luVar = new defpackage.lu();
            luVar.a = (this.m & 112) | 8388611;
            this.B.setLayoutParams(luVar);
        }
    }

    private final boolean N(android.view.View view) {
        return view.getParent() == this || this.s.contains(view);
    }

    private final boolean O(android.view.View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private final void P(android.view.View view, int i, int i2, int i3, int i4) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = android.view.View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = java.lang.Math.min(android.view.View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean A() {
        android.support.v7.widget.ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.m();
    }

    public final ly C() {
        ly lyVar = this.O;
        if (lyVar != null) {
            return lyVar;
        }
        ly lyVar2 = new ly(this, true);
        this.O = lyVar2;
        return lyVar2;
    }

    public final int a() {
        defpackage.lh lhVar = this.p;
        if (lhVar != null) {
            return lhVar.g ? lhVar.a : lhVar.b;
        }
        return 0;
    }

    public final int c() {
        defpackage.ft ftVar;
        android.support.v7.widget.ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (ftVar = actionMenuView.a) == null || !ftVar.hasVisibleItems()) ? a() : java.lang.Math.max(a(), java.lang.Math.max(this.G, 0));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof defpackage.lu);
    }

    public final int d() {
        return e() != null ? java.lang.Math.max(et(), java.lang.Math.max(this.F, 0)) : et();
    }

    public final android.graphics.drawable.Drawable e() {
        android.widget.ImageButton imageButton = this.B;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public final int et() {
        defpackage.lh lhVar = this.p;
        if (lhVar != null) {
            return lhVar.g ? lhVar.b : lhVar.a;
        }
        return 0;
    }

    public final boolean eu() {
        defpackage.hb hbVar;
        android.support.v7.widget.ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (hbVar = actionMenuView.c) == null || !hbVar.o()) ? false : true;
    }

    public final void ev() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            android.window.OnBackInvokedDispatcher onBackInvokedDispatcherM = ae$.ExternalSyntheticApiModelOutline0.m(this);
            if (!z() || onBackInvokedDispatcherM == null || !isAttachedToWindow() || !this.z) {
                android.window.OnBackInvokedDispatcher onBackInvokedDispatcher = this.Q;
                if (onBackInvokedDispatcher != null) {
                    ae$.ExternalSyntheticApiModelOutline0.m(onBackInvokedDispatcher, this.P);
                    this.Q = null;
                    return;
                }
                return;
            }
            if (this.Q == null) {
                if (this.P == null) {
                    jd jdVar = new jd(this, 8, (byte[]) null);
                    j$.util.Objects.requireNonNull(jdVar);
                    this.P = new ls(jdVar, 0);
                }
                ae$.ExternalSyntheticApiModelOutline0.m(onBackInvokedDispatcherM, 1000000, this.P);
                this.Q = onBackInvokedDispatcherM;
            }
        }
    }

    public final android.view.Menu f() {
        n();
        android.support.v7.widget.ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            android.view.Menu menuG = actionMenuView.g();
            if (this.w == null) {
                this.w = new defpackage.lt(this);
            }
            this.a.c.q();
            ((defpackage.ft) menuG).h(this.w, this.i);
            ev();
        }
        return this.a.g();
    }

    public final android.view.MenuInflater g() {
        return new defpackage.fe(getContext());
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new defpackage.lu();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.lu(getContext(), attributeSet);
    }

    public final java.lang.CharSequence h() {
        android.widget.ImageButton imageButton = this.B;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public java.lang.CharSequence i() {
        return this.q;
    }

    public final java.util.ArrayList j() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.view.Menu menuF = f();
        for (int i = 0; i < menuF.size(); i++) {
            arrayList.add(menuF.getItem(i));
        }
        return arrayList;
    }

    public final void k() {
        defpackage.lt ltVar = this.w;
        defpackage.fv fvVar = ltVar == null ? null : ltVar.b;
        if (fvVar != null) {
            fvVar.collapseActionView();
        }
    }

    public final void l() {
        android.support.v7.widget.ActionMenuView actionMenuView = this.a;
        if (actionMenuView != null) {
            actionMenuView.h();
        }
    }

    public final void m() {
        if (this.p == null) {
            this.p = new defpackage.lh();
        }
    }

    public final void n() {
        if (this.a == null) {
            android.support.v7.widget.ActionMenuView actionMenuView = new android.support.v7.widget.ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.j(this.j);
            android.support.v7.widget.ActionMenuView actionMenuView2 = this.a;
            actionMenuView2.e = this.S;
            actionMenuView2.i(this.x, new defpackage.lr(this, 0));
            defpackage.lu luVar = new defpackage.lu();
            luVar.a = (this.m & 112) | 8388613;
            this.a.setLayoutParams(luVar);
            K(this.a, false);
        }
    }

    public void o(int i) {
        g().inflate(i, f());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ev();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.R);
        ev();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.L = false;
            actionMasked = 9;
        }
        if (this.L) {
            i = actionMasked;
        } else {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked != 9) {
                i = actionMasked;
            } else if (!zOnHoverEvent) {
                this.L = true;
            }
        }
        if (i == 10 || i == 3) {
            this.L = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0232 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0234  */
    /* JADX WARN: Code duplicated, block: B:102:0x0239  */
    /* JADX WARN: Code duplicated, block: B:105:0x024e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0271  */
    /* JADX WARN: Code duplicated, block: B:108:0x0274  */
    /* JADX WARN: Code duplicated, block: B:109:0x0298  */
    /* JADX WARN: Code duplicated, block: B:111:0x029b  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:115:0x02af A[LOOP:0: B:114:0x02ad->B:115:0x02af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x02c7 A[LOOP:1: B:117:0x02c5->B:118:0x02c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:121:0x02e8 A[LOOP:2: B:120:0x02e6->B:121:0x02e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:124:0x0327 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0329  */
    /* JADX WARN: Code duplicated, block: B:126:0x032d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0335 A[LOOP:3: B:128:0x0333->B:129:0x0335, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c  */
    /* JADX WARN: Code duplicated, block: B:54:0x010f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0127  */
    /* JADX WARN: Code duplicated, block: B:57:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x012d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0130  */
    /* JADX WARN: Code duplicated, block: B:60:0x0136  */
    /* JADX WARN: Code duplicated, block: B:62:0x013a  */
    /* JADX WARN: Code duplicated, block: B:63:0x013d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0171  */
    /* JADX WARN: Code duplicated, block: B:77:0x0175  */
    /* JADX WARN: Code duplicated, block: B:79:0x0185  */
    /* JADX WARN: Code duplicated, block: B:80:0x018c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0198  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:95:0x0200  */
    /* JADX WARN: Code duplicated, block: B:96:0x0226  */
    /* JADX WARN: Code duplicated, block: B:98:0x0229  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iG;
        int iH;
        int iD;
        int iC;
        boolean z2;
        int iMax;
        int iMin;
        boolean zO;
        boolean zO2;
        int measuredHeight;
        android.widget.TextView textView;
        int iMax2;
        java.util.ArrayList arrayList;
        int size;
        int iG2;
        int i5;
        int size2;
        int i6;
        int size3;
        int i7;
        int i8;
        int i9;
        int measuredWidth;
        int i10;
        int i11;
        int size4;
        int i12;
        android.widget.TextView textView2;
        defpackage.lu luVar;
        defpackage.lu luVar2;
        boolean z3;
        int i13;
        int paddingTop;
        int i14;
        boolean z4;
        int iMax3;
        int i15;
        int i16;
        int i17;
        boolean z5;
        int i18;
        int i19;
        int iMax4;
        int i20;
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        android.view.View view4;
        int layoutDirection = getLayoutDirection();
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i21 = width - paddingRight;
        int[] iArr = this.N;
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        iArr[1] = 0;
        iArr[0] = 0;
        int i22 = defpackage.dzs.a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? java.lang.Math.min(minimumHeight, i4 - i2) : 0;
        boolean z6 = layoutDirection == 1;
        if (O(this.B)) {
            android.view.View view5 = this.B;
            if (z6) {
                iH = H(view5, i21, iArr, iMin2);
                iG = paddingLeft;
            } else {
                iG = G(view5, paddingLeft, iArr, iMin2);
            }
            if (O(this.g)) {
                view4 = this.g;
                if (z6) {
                    iH = H(view4, iH, iArr, iMin2);
                } else {
                    iG = G(view4, iG, iArr, iMin2);
                }
            }
            if (O(this.a)) {
                view3 = this.a;
                if (z6) {
                    iG = G(view3, iG, iArr, iMin2);
                } else {
                    iH = H(view3, iH, iArr, iMin2);
                }
            }
            if (getLayoutDirection() == 1) {
                iD = c();
            } else {
                iD = d();
            }
            if (getLayoutDirection() == 1) {
                iC = d();
            } else {
                iC = c();
            }
            z2 = z6;
            iArr[0] = java.lang.Math.max(0, iD - iG);
            iArr[1] = java.lang.Math.max(0, iC - (i21 - iH));
            iMax = java.lang.Math.max(iG, iD);
            iMin = java.lang.Math.min(iH, i21 - iC);
            if (O(this.h)) {
                view2 = this.h;
                if (z2) {
                    iMin = H(view2, iMin, iArr, iMin2);
                } else {
                    iMax = G(view2, iMax, iArr, iMin2);
                }
            }
            if (O(this.d)) {
                view = this.d;
                if (z2) {
                    iMin = H(view, iMin, iArr, iMin2);
                } else {
                    iMax = G(view, iMax, iArr, iMin2);
                }
            }
            zO = O(this.b);
            zO2 = O(this.c);
            if (zO) {
                defpackage.lu luVar3 = (defpackage.lu) this.b.getLayoutParams();
                measuredHeight = luVar3.bottomMargin + luVar3.topMargin + this.b.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            if (zO2) {
                defpackage.lu luVar4 = (defpackage.lu) this.c.getLayoutParams();
                measuredHeight += luVar4.topMargin + this.c.getMeasuredHeight() + luVar4.bottomMargin;
            }
            if (!zO) {
                if (zO2) {
                    textView = this.c;
                } else {
                    iMax2 = iMax;
                    width = width;
                }
                arrayList = this.M;
                J(arrayList, 3);
                size = arrayList.size();
                iG2 = iMax2;
                for (i5 = 0; i5 < size; i5++) {
                    iG2 = G((android.view.View) arrayList.get(i5), iG2, iArr, iMin2);
                }
                J(arrayList, 5);
                size2 = arrayList.size();
                for (i6 = 0; i6 < size2; i6++) {
                    iMin = H((android.view.View) arrayList.get(i6), iMin, iArr, iMin2);
                }
                J(arrayList, 1);
                int i23 = iArr[0];
                int i24 = iArr[1];
                size3 = arrayList.size();
                i7 = i24;
                i8 = i23;
                i9 = 0;
                measuredWidth = 0;
                while (i9 < size3) {
                    android.view.View view6 = (android.view.View) arrayList.get(i9);
                    defpackage.lu luVar5 = (defpackage.lu) view6.getLayoutParams();
                    int i25 = luVar5.leftMargin - i8;
                    int i26 = luVar5.rightMargin - i7;
                    int iMax5 = java.lang.Math.max(0, i25);
                    int iMax6 = java.lang.Math.max(0, i26);
                    int iMax7 = java.lang.Math.max(0, -i25);
                    int iMax8 = java.lang.Math.max(0, -i26);
                    measuredWidth += iMax5 + view6.getMeasuredWidth() + iMax6;
                    i9++;
                    i7 = iMax8;
                    i8 = iMax7;
                }
                i10 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (measuredWidth / 2);
                i11 = measuredWidth + i10;
                if (i10 >= iG2) {
                    if (i11 > iMin) {
                        iG2 = i10 - (i11 - iMin);
                    } else {
                        iG2 = i10;
                    }
                }
                size4 = arrayList.size();
                for (i12 = 0; i12 < size4; i12++) {
                    iG2 = G((android.view.View) arrayList.get(i12), iG2, iArr, iMin2);
                }
                arrayList.clear();
            }
            textView = this.b;
            if (zO2) {
                textView2 = this.c;
            } else {
                textView2 = this.b;
            }
            luVar = (defpackage.lu) textView.getLayoutParams();
            luVar2 = (defpackage.lu) textView2.getLayoutParams();
            z3 = (!zO && this.b.getMeasuredWidth() > 0) || (zO2 && this.c.getMeasuredWidth() > 0);
            i13 = this.H & 112;
            if (i13 != 48) {
                paddingTop = getPaddingTop() + luVar.topMargin + this.D;
            } else if (i13 != 80) {
                iMax4 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                if (iMax4 < luVar.topMargin + this.D) {
                    iMax4 = luVar.topMargin + this.D;
                } else {
                    i20 = (((height - paddingBottom) - measuredHeight) - iMax4) - paddingTop2;
                    if (i20 < luVar.bottomMargin + this.E) {
                        iMax4 = java.lang.Math.max(0, iMax4 - ((luVar2.bottomMargin + this.E) - i20));
                    }
                }
                paddingTop = paddingTop2 + iMax4;
            } else {
                paddingTop = (((height - paddingBottom) - luVar2.bottomMargin) - this.E) - measuredHeight;
            }
            if (z2) {
                if (z3) {
                    i17 = this.n;
                    z5 = true;
                } else {
                    i17 = 0;
                    z5 = false;
                }
                int i27 = i17 - iArr[1];
                iMin -= java.lang.Math.max(0, i27);
                iArr[1] = java.lang.Math.max(0, -i27);
                if (zO) {
                    defpackage.lu luVar6 = (defpackage.lu) this.b.getLayoutParams();
                    int measuredWidth2 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                    i18 = measuredWidth2 - this.o;
                    paddingTop = measuredHeight2 + luVar6.bottomMargin;
                } else {
                    i18 = iMin;
                }
                if (zO2) {
                    defpackage.lu luVar7 = (defpackage.lu) this.c.getLayoutParams();
                    int i28 = paddingTop + luVar7.topMargin;
                    this.c.layout(iMin - this.c.getMeasuredWidth(), i28, iMin, this.c.getMeasuredHeight() + i28);
                    i19 = iMin - this.o;
                    int i29 = luVar7.bottomMargin;
                } else {
                    i19 = iMin;
                }
                if (z5) {
                    iMin = java.lang.Math.min(i18, i19);
                }
                iMax2 = iMax;
            } else {
                if (z3) {
                    i14 = this.n;
                    z4 = true;
                } else {
                    i14 = 0;
                    z4 = false;
                }
                int i30 = i14 - iArr[0];
                iMax3 = iMax + java.lang.Math.max(0, i30);
                iArr[0] = java.lang.Math.max(0, -i30);
                if (zO) {
                    defpackage.lu luVar8 = (defpackage.lu) this.b.getLayoutParams();
                    int measuredWidth3 = this.b.getMeasuredWidth() + iMax3;
                    int measuredHeight3 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax3, paddingTop, measuredWidth3, measuredHeight3);
                    i15 = measuredWidth3 + this.o;
                    paddingTop = measuredHeight3 + luVar8.bottomMargin;
                } else {
                    i15 = iMax3;
                }
                if (zO2) {
                    defpackage.lu luVar9 = (defpackage.lu) this.c.getLayoutParams();
                    int i31 = paddingTop + luVar9.topMargin;
                    int measuredWidth4 = this.c.getMeasuredWidth() + iMax3;
                    this.c.layout(iMax3, i31, measuredWidth4, this.c.getMeasuredHeight() + i31);
                    i16 = measuredWidth4 + this.o;
                    int i32 = luVar9.bottomMargin;
                } else {
                    i16 = iMax3;
                }
                if (z4) {
                    iMax2 = java.lang.Math.max(i15, i16);
                } else {
                    iMax2 = iMax3;
                }
            }
            arrayList = this.M;
            J(arrayList, 3);
            size = arrayList.size();
            iG2 = iMax2;
            while (i5 < size) {
                iG2 = G((android.view.View) arrayList.get(i5), iG2, iArr, iMin2);
            }
            J(arrayList, 5);
            size2 = arrayList.size();
            while (i6 < size2) {
                iMin = H((android.view.View) arrayList.get(i6), iMin, iArr, iMin2);
            }
            J(arrayList, 1);
            int i210 = iArr[0];
            int i211 = iArr[1];
            size3 = arrayList.size();
            i7 = i211;
            i8 = i210;
            i9 = 0;
            measuredWidth = 0;
            while (i9 < size3) {
                android.view.View view7 = (android.view.View) arrayList.get(i9);
                defpackage.lu luVar10 = (defpackage.lu) view7.getLayoutParams();
                int i212 = luVar10.leftMargin - i8;
                int i213 = luVar10.rightMargin - i7;
                int iMax9 = java.lang.Math.max(0, i212);
                int iMax10 = java.lang.Math.max(0, i213);
                int iMax11 = java.lang.Math.max(0, -i212);
                int iMax12 = java.lang.Math.max(0, -i213);
                measuredWidth += iMax9 + view7.getMeasuredWidth() + iMax10;
                i9++;
                i7 = iMax12;
                i8 = iMax11;
            }
            i10 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (measuredWidth / 2);
            i11 = measuredWidth + i10;
            if (i10 >= iG2) {
                if (i11 > iMin) {
                    iG2 = i10 - (i11 - iMin);
                } else {
                    iG2 = i10;
                }
            }
            size4 = arrayList.size();
            while (i12 < size4) {
                iG2 = G((android.view.View) arrayList.get(i12), iG2, iArr, iMin2);
            }
            arrayList.clear();
        }
        iG = paddingLeft;
        iH = i21;
        if (O(this.g)) {
            view4 = this.g;
            if (z6) {
                iH = H(view4, iH, iArr, iMin2);
            } else {
                iG = G(view4, iG, iArr, iMin2);
            }
        }
        if (O(this.a)) {
            view3 = this.a;
            if (z6) {
                iG = G(view3, iG, iArr, iMin2);
            } else {
                iH = H(view3, iH, iArr, iMin2);
            }
        }
        if (getLayoutDirection() == 1) {
            iD = c();
        } else {
            iD = d();
        }
        if (getLayoutDirection() == 1) {
            iC = d();
        } else {
            iC = c();
        }
        z2 = z6;
        iArr[0] = java.lang.Math.max(0, iD - iG);
        iArr[1] = java.lang.Math.max(0, iC - (i21 - iH));
        iMax = java.lang.Math.max(iG, iD);
        iMin = java.lang.Math.min(iH, i21 - iC);
        if (O(this.h)) {
            view2 = this.h;
            if (z2) {
                iMin = H(view2, iMin, iArr, iMin2);
            } else {
                iMax = G(view2, iMax, iArr, iMin2);
            }
        }
        if (O(this.d)) {
            view = this.d;
            if (z2) {
                iMin = H(view, iMin, iArr, iMin2);
            } else {
                iMax = G(view, iMax, iArr, iMin2);
            }
        }
        zO = O(this.b);
        zO2 = O(this.c);
        if (zO) {
            defpackage.lu luVar11 = (defpackage.lu) this.b.getLayoutParams();
            measuredHeight = luVar11.bottomMargin + luVar11.topMargin + this.b.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (zO2) {
            defpackage.lu luVar12 = (defpackage.lu) this.c.getLayoutParams();
            measuredHeight += luVar12.topMargin + this.c.getMeasuredHeight() + luVar12.bottomMargin;
        }
        if (!zO) {
            if (zO2) {
                textView = this.c;
            } else {
                iMax2 = iMax;
                width = width;
            }
            arrayList = this.M;
            J(arrayList, 3);
            size = arrayList.size();
            iG2 = iMax2;
            while (i5 < size) {
                iG2 = G((android.view.View) arrayList.get(i5), iG2, iArr, iMin2);
            }
            J(arrayList, 5);
            size2 = arrayList.size();
            while (i6 < size2) {
                iMin = H((android.view.View) arrayList.get(i6), iMin, iArr, iMin2);
            }
            J(arrayList, 1);
            int i214 = iArr[0];
            int i215 = iArr[1];
            size3 = arrayList.size();
            i7 = i215;
            i8 = i214;
            i9 = 0;
            measuredWidth = 0;
            while (i9 < size3) {
                android.view.View view8 = (android.view.View) arrayList.get(i9);
                defpackage.lu luVar13 = (defpackage.lu) view8.getLayoutParams();
                int i216 = luVar13.leftMargin - i8;
                int i217 = luVar13.rightMargin - i7;
                int iMax13 = java.lang.Math.max(0, i216);
                int iMax14 = java.lang.Math.max(0, i217);
                int iMax15 = java.lang.Math.max(0, -i216);
                int iMax16 = java.lang.Math.max(0, -i217);
                measuredWidth += iMax13 + view8.getMeasuredWidth() + iMax14;
                i9++;
                i7 = iMax16;
                i8 = iMax15;
            }
            i10 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (measuredWidth / 2);
            i11 = measuredWidth + i10;
            if (i10 >= iG2) {
                if (i11 > iMin) {
                    iG2 = i10 - (i11 - iMin);
                } else {
                    iG2 = i10;
                }
            }
            size4 = arrayList.size();
            while (i12 < size4) {
                iG2 = G((android.view.View) arrayList.get(i12), iG2, iArr, iMin2);
            }
            arrayList.clear();
        }
        textView = this.b;
        if (zO2) {
            textView2 = this.c;
        } else {
            textView2 = this.b;
        }
        luVar = (defpackage.lu) textView.getLayoutParams();
        luVar2 = (defpackage.lu) textView2.getLayoutParams();
        if (zO) {
        }
        i13 = this.H & 112;
        if (i13 != 48) {
            paddingTop = getPaddingTop() + luVar.topMargin + this.D;
        } else if (i13 != 80) {
            iMax4 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
            if (iMax4 < luVar.topMargin + this.D) {
                iMax4 = luVar.topMargin + this.D;
            } else {
                i20 = (((height - paddingBottom) - measuredHeight) - iMax4) - paddingTop2;
                if (i20 < luVar.bottomMargin + this.E) {
                    iMax4 = java.lang.Math.max(0, iMax4 - ((luVar2.bottomMargin + this.E) - i20));
                }
            }
            paddingTop = paddingTop2 + iMax4;
        } else {
            paddingTop = (((height - paddingBottom) - luVar2.bottomMargin) - this.E) - measuredHeight;
        }
        if (z2) {
            if (z3) {
                i17 = this.n;
                z5 = true;
            } else {
                i17 = 0;
                z5 = false;
            }
            int i218 = i17 - iArr[1];
            iMin -= java.lang.Math.max(0, i218);
            iArr[1] = java.lang.Math.max(0, -i218);
            if (zO) {
                defpackage.lu luVar14 = (defpackage.lu) this.b.getLayoutParams();
                int measuredWidth5 = iMin - this.b.getMeasuredWidth();
                int measuredHeight4 = this.b.getMeasuredHeight() + paddingTop;
                this.b.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                i18 = measuredWidth5 - this.o;
                paddingTop = measuredHeight4 + luVar14.bottomMargin;
            } else {
                i18 = iMin;
            }
            if (zO2) {
                defpackage.lu luVar15 = (defpackage.lu) this.c.getLayoutParams();
                int i219 = paddingTop + luVar15.topMargin;
                this.c.layout(iMin - this.c.getMeasuredWidth(), i219, iMin, this.c.getMeasuredHeight() + i219);
                i19 = iMin - this.o;
                int i220 = luVar15.bottomMargin;
            } else {
                i19 = iMin;
            }
            if (z5) {
                iMin = java.lang.Math.min(i18, i19);
            }
            iMax2 = iMax;
        } else {
            if (z3) {
                i14 = this.n;
                z4 = true;
            } else {
                i14 = 0;
                z4 = false;
            }
            int i33 = i14 - iArr[0];
            iMax3 = iMax + java.lang.Math.max(0, i33);
            iArr[0] = java.lang.Math.max(0, -i33);
            if (zO) {
                defpackage.lu luVar16 = (defpackage.lu) this.b.getLayoutParams();
                int measuredWidth6 = this.b.getMeasuredWidth() + iMax3;
                int measuredHeight5 = this.b.getMeasuredHeight() + paddingTop;
                this.b.layout(iMax3, paddingTop, measuredWidth6, measuredHeight5);
                i15 = measuredWidth6 + this.o;
                paddingTop = measuredHeight5 + luVar16.bottomMargin;
            } else {
                i15 = iMax3;
            }
            if (zO2) {
                defpackage.lu luVar17 = (defpackage.lu) this.c.getLayoutParams();
                int i34 = paddingTop + luVar17.topMargin;
                int measuredWidth7 = this.c.getMeasuredWidth() + iMax3;
                this.c.layout(iMax3, i34, measuredWidth7, this.c.getMeasuredHeight() + i34);
                i16 = measuredWidth7 + this.o;
                int i35 = luVar17.bottomMargin;
            } else {
                i16 = iMax3;
            }
            if (z4) {
                iMax2 = java.lang.Math.max(i15, i16);
            } else {
                iMax2 = iMax3;
            }
        }
        arrayList = this.M;
        J(arrayList, 3);
        size = arrayList.size();
        iG2 = iMax2;
        while (i5 < size) {
            iG2 = G((android.view.View) arrayList.get(i5), iG2, iArr, iMin2);
        }
        J(arrayList, 5);
        size2 = arrayList.size();
        while (i6 < size2) {
            iMin = H((android.view.View) arrayList.get(i6), iMin, iArr, iMin2);
        }
        J(arrayList, 1);
        int i2110 = iArr[0];
        int i2111 = iArr[1];
        size3 = arrayList.size();
        i7 = i2111;
        i8 = i2110;
        i9 = 0;
        measuredWidth = 0;
        while (i9 < size3) {
            android.view.View view9 = (android.view.View) arrayList.get(i9);
            defpackage.lu luVar18 = (defpackage.lu) view9.getLayoutParams();
            int i2112 = luVar18.leftMargin - i8;
            int i2113 = luVar18.rightMargin - i7;
            int iMax17 = java.lang.Math.max(0, i2112);
            int iMax18 = java.lang.Math.max(0, i2113);
            int iMax19 = java.lang.Math.max(0, -i2112);
            int iMax110 = java.lang.Math.max(0, -i2113);
            measuredWidth += iMax17 + view9.getMeasuredWidth() + iMax18;
            i9++;
            i7 = iMax110;
            i8 = iMax19;
        }
        i10 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (measuredWidth / 2);
        i11 = measuredWidth + i10;
        if (i10 >= iG2) {
            if (i11 > iMin) {
                iG2 = i10 - (i11 - iMin);
            } else {
                iG2 = i10;
            }
        }
        size4 = arrayList.size();
        while (i12 < size4) {
            iG2 = G((android.view.View) arrayList.get(i12), iG2, iArr, iMin2);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        android.support.v7.widget.Toolbar toolbar;
        int i3;
        int i4;
        int marginStart;
        int iMax;
        int iCombineMeasuredStates;
        int marginStart2;
        int i5;
        int layoutDirection = getLayoutDirection();
        int iMax2 = 0;
        if (O(this.B)) {
            toolbar = this;
            i3 = i;
            i4 = i2;
            toolbar.P(this.B, i3, 0, i4, this.C);
            int measuredWidth = toolbar.B.getMeasuredWidth();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) toolbar.B.getLayoutParams();
            marginStart = measuredWidth + marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
            int measuredHeight = toolbar.B.getMeasuredHeight();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) toolbar.B.getLayoutParams();
            iMax = java.lang.Math.max(0, measuredHeight + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(0, toolbar.B.getMeasuredState());
        } else {
            toolbar = this;
            i3 = i;
            i4 = i2;
            marginStart = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (toolbar.O(toolbar.g)) {
            toolbar.P(toolbar.g, i3, 0, i4, toolbar.C);
            int measuredWidth2 = toolbar.g.getMeasuredWidth();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) toolbar.g.getLayoutParams();
            marginStart = measuredWidth2 + marginLayoutParams3.getMarginStart() + marginLayoutParams3.getMarginEnd();
            int measuredHeight2 = toolbar.g.getMeasuredHeight();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = (android.view.ViewGroup.MarginLayoutParams) toolbar.g.getLayoutParams();
            iMax = java.lang.Math.max(iMax, measuredHeight2 + marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin);
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, toolbar.g.getMeasuredState());
        }
        int[] iArr = toolbar.N;
        char c = layoutDirection == 1 ? (char) 1 : (char) 0;
        int iD = toolbar.d();
        int iMax3 = java.lang.Math.max(iD, marginStart);
        iArr[c] = java.lang.Math.max(0, iD - marginStart);
        if (toolbar.O(toolbar.a)) {
            toolbar.P(toolbar.a, i3, iMax3, i4, toolbar.C);
            int measuredWidth3 = toolbar.a.getMeasuredWidth();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = (android.view.ViewGroup.MarginLayoutParams) toolbar.a.getLayoutParams();
            marginStart2 = measuredWidth3 + marginLayoutParams5.getMarginStart() + marginLayoutParams5.getMarginEnd();
            int measuredHeight3 = toolbar.a.getMeasuredHeight();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams6 = (android.view.ViewGroup.MarginLayoutParams) toolbar.a.getLayoutParams();
            iMax = java.lang.Math.max(iMax, measuredHeight3 + marginLayoutParams6.topMargin + marginLayoutParams6.bottomMargin);
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, toolbar.a.getMeasuredState());
        } else {
            marginStart2 = 0;
        }
        int iC = toolbar.c();
        int iMax4 = iMax3 + java.lang.Math.max(iC, marginStart2);
        iArr[c ^ 1] = java.lang.Math.max(0, iC - marginStart2);
        if (toolbar.O(toolbar.h)) {
            iMax4 += toolbar.I(toolbar.h, i3, iMax4, i4, 0, iArr);
            int measuredHeight4 = toolbar.h.getMeasuredHeight();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams7 = (android.view.ViewGroup.MarginLayoutParams) toolbar.h.getLayoutParams();
            iMax = java.lang.Math.max(iMax, measuredHeight4 + marginLayoutParams7.topMargin + marginLayoutParams7.bottomMargin);
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, toolbar.h.getMeasuredState());
        }
        if (toolbar.O(toolbar.d)) {
            iMax4 += toolbar.I(toolbar.d, i3, iMax4, i4, 0, iArr);
            int measuredHeight5 = toolbar.d.getMeasuredHeight();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams8 = (android.view.ViewGroup.MarginLayoutParams) toolbar.d.getLayoutParams();
            iMax = java.lang.Math.max(iMax, measuredHeight5 + marginLayoutParams8.topMargin + marginLayoutParams8.bottomMargin);
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, toolbar.d.getMeasuredState());
        }
        int childCount = toolbar.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = toolbar.getChildAt(i6);
            if (((defpackage.lu) childAt.getLayoutParams()).b == 0 && toolbar.O(childAt)) {
                iMax4 += toolbar.I(childAt, i3, iMax4, i4, 0, iArr);
                int measuredHeight6 = childAt.getMeasuredHeight();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams9 = (android.view.ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                iMax = java.lang.Math.max(iMax, measuredHeight6 + marginLayoutParams9.topMargin + marginLayoutParams9.bottomMargin);
                iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            } else {
                iMax4 = iMax4;
            }
        }
        int i7 = iMax4;
        int i8 = toolbar.D + toolbar.E;
        int i9 = toolbar.n + toolbar.o;
        if (toolbar.O(toolbar.b)) {
            toolbar.I(toolbar.b, i3, i7 + i9, i4, i8, iArr);
            int measuredWidth4 = toolbar.b.getMeasuredWidth();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams10 = (android.view.ViewGroup.MarginLayoutParams) toolbar.b.getLayoutParams();
            iMax2 = measuredWidth4 + marginLayoutParams10.getMarginStart() + marginLayoutParams10.getMarginEnd();
            int measuredHeight7 = toolbar.b.getMeasuredHeight();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams11 = (android.view.ViewGroup.MarginLayoutParams) toolbar.b.getLayoutParams();
            i5 = measuredHeight7 + marginLayoutParams11.topMargin + marginLayoutParams11.bottomMargin;
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, toolbar.b.getMeasuredState());
        } else {
            i5 = 0;
        }
        if (toolbar.O(toolbar.c)) {
            iMax2 = java.lang.Math.max(iMax2, toolbar.I(toolbar.c, i3, i7 + i9, i4, i5 + i8, iArr));
            int measuredHeight8 = toolbar.c.getMeasuredHeight();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams12 = (android.view.ViewGroup.MarginLayoutParams) toolbar.c.getLayoutParams();
            i5 += measuredHeight8 + marginLayoutParams12.topMargin + marginLayoutParams12.bottomMargin;
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, toolbar.c.getMeasuredState());
        }
        if (toolbar.O(toolbar.b) || toolbar.O(toolbar.c)) {
            i5 += i8;
        }
        toolbar.setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(i7 + iMax2 + toolbar.getPaddingLeft() + toolbar.getPaddingRight(), toolbar.getSuggestedMinimumWidth()), i3, (-16777216) & iCombineMeasuredStates), android.view.View.resolveSizeAndState(java.lang.Math.max(java.lang.Math.max(iMax, i5) + toolbar.getPaddingTop() + toolbar.getPaddingBottom(), toolbar.getSuggestedMinimumHeight()), i4, iCombineMeasuredStates << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.MenuItem menuItemFindItem;
        if (!(parcelable instanceof android.support.v7.widget.Toolbar.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        android.support.v7.widget.Toolbar.SavedState savedState = (android.support.v7.widget.Toolbar.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        android.support.v7.widget.ActionMenuView actionMenuView = this.a;
        defpackage.ft ftVar = actionMenuView != null ? actionMenuView.a : null;
        int i = savedState.a;
        if (i != 0 && this.w != null && ftVar != null && (menuItemFindItem = ftVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.b) {
            java.lang.Runnable runnable = this.R;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0033  */
    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        int i2;
        super.onRtlPropertiesChanged(i);
        m();
        defpackage.lh lhVar = this.p;
        boolean z = lhVar.g;
        boolean z2 = i == 1;
        if (z2 != z) {
            lhVar.g = z2;
            if (!lhVar.h) {
                lhVar.a = lhVar.e;
                lhVar.b = lhVar.f;
                return;
            }
            if (z2) {
                int i3 = lhVar.d;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = lhVar.e;
                }
                lhVar.a = i3;
                i2 = lhVar.c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = lhVar.f;
                }
            } else {
                int i4 = lhVar.c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = lhVar.e;
                }
                lhVar.a = i4;
                i2 = lhVar.d;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = lhVar.f;
                }
            }
            lhVar.b = i2;
        }
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        defpackage.fv fvVar;
        android.support.v7.widget.Toolbar.SavedState savedState = new android.support.v7.widget.Toolbar.SavedState(super.onSaveInstanceState());
        defpackage.lt ltVar = this.w;
        if (ltVar != null && (fvVar = ltVar.b) != null) {
            savedState.a = fvVar.a;
        }
        savedState.b = A();
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.K = false;
            actionMasked = 0;
        }
        if (!this.K) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!zOnTouchEvent) {
                    this.K = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.K = false;
        }
        return true;
    }

    public final void p(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            L();
            if (!N(this.d)) {
                K(this.d, true);
            }
        } else {
            android.widget.ImageView imageView = this.d;
            if (imageView != null && N(imageView)) {
                removeView(this.d);
                this.s.remove(this.d);
            }
        }
        android.widget.ImageView imageView2 = this.d;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public final void q(int i) {
        r(i != 0 ? getContext().getText(i) : null);
    }

    public final void r(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            M();
        }
        android.widget.ImageButton imageButton = this.B;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            aa$.ExternalSyntheticApiModelOutline0.m(this.B, charSequence);
        }
    }

    public final void s(int i) {
        t(defpackage.lg.e().c(getContext(), i));
    }

    public void t(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            M();
            if (!N(this.B)) {
                K(this.B, true);
            }
        } else {
            android.widget.ImageButton imageButton = this.B;
            if (imageButton != null && N(imageButton)) {
                removeView(this.B);
                this.s.remove(this.B);
            }
        }
        android.widget.ImageButton imageButton2 = this.B;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void u(android.view.View.OnClickListener onClickListener) {
        M();
        this.B.setOnClickListener(onClickListener);
    }

    public final void v(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new android.view.ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void w(java.lang.CharSequence charSequence) {
        boolean zIsEmpty = android.text.TextUtils.isEmpty(charSequence);
        android.widget.TextView textView = this.c;
        if (!zIsEmpty) {
            if (textView == null) {
                android.content.Context context = getContext();
                android.support.v7.widget.AppCompatTextView appCompatTextView = new android.support.v7.widget.AppCompatTextView(context);
                this.c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.c.setEllipsize(android.text.TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                android.content.res.ColorStateList colorStateList = this.J;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!N(this.c)) {
                K(this.c, true);
            }
        } else if (textView != null && N(textView)) {
            removeView(this.c);
            this.s.remove(this.c);
        }
        android.widget.TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.r = charSequence;
    }

    public void x(java.lang.CharSequence charSequence) {
        boolean zIsEmpty = android.text.TextUtils.isEmpty(charSequence);
        android.widget.TextView textView = this.b;
        if (!zIsEmpty) {
            if (textView == null) {
                android.content.Context context = getContext();
                android.support.v7.widget.AppCompatTextView appCompatTextView = new android.support.v7.widget.AppCompatTextView(context);
                this.b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.b.setEllipsize(android.text.TextUtils.TruncateAt.END);
                int i = this.k;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                android.content.res.ColorStateList colorStateList = this.I;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!N(this.b)) {
                K(this.b, true);
            }
        } else if (textView != null && N(textView)) {
            removeView(this.b);
            this.s.remove(this.b);
        }
        android.widget.TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.q = charSequence;
    }

    public final boolean z() {
        defpackage.lt ltVar = this.w;
        return (ltVar == null || ltVar.b == null) ? false : true;
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return D(layoutParams);
    }

    /* JADX INFO: compiled from: PG */
    public class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.kw(2);
        int a;
        boolean b;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
            this.b = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b ? 1 : 0);
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130970933);
    }

    public Toolbar(android.content.Context context) {
        this(context, null);
    }
}
