package android.support.v7.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ActionBarOverlayLayout extends android.view.ViewGroup implements defpackage.iq, dyv, dyw {
    static final int[] a = {2130968582, android.R.attr.windowContentOverlay};
    private static final eax k;
    private static final android.graphics.Rect l;
    private eax A;
    private eax B;
    private android.widget.OverScroller C;
    private final java.lang.Runnable D;
    private final java.lang.Runnable E;
    private final dyx F;
    private final defpackage.gv G;
    private defpackage.ly H;
    public int b;
    public android.support.v7.widget.ActionBarContainer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public defpackage.gt h;
    public android.view.ViewPropertyAnimator i;
    public final android.animation.AnimatorListenerAdapter j;
    private int m;
    private android.support.v7.widget.ContentFrameLayout n;
    private android.graphics.drawable.Drawable o;
    private boolean p;
    private int q;
    private final android.graphics.Rect r;
    private final android.graphics.Rect s;
    private final android.graphics.Rect t;
    private final android.graphics.Rect u;
    private final android.graphics.Rect v;
    private boolean w;
    private boolean x;
    private eax y;
    private eax z;

    static {
        eak eahVar;
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            eahVar = new eak();
        } else if (android.os.Build.VERSION.SDK_INT >= 35) {
            eahVar = new eaj();
        } else if (android.os.Build.VERSION.SDK_INT >= 34) {
            eahVar = new eai();
        } else {
            eahVar = android.os.Build.VERSION.SDK_INT >= 31 ? new eah() : new eag();
        }
        eahVar.c(new dwn(0, 1, 0, 1));
        k = eahVar.a();
        l = new android.graphics.Rect();
    }

    public ActionBarOverlayLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.r = new android.graphics.Rect();
        this.s = new android.graphics.Rect();
        this.t = new android.graphics.Rect();
        this.u = new android.graphics.Rect();
        this.v = new android.graphics.Rect();
        this.w = true;
        this.x = false;
        eax eaxVar = eax.a;
        this.y = eaxVar;
        this.z = eaxVar;
        this.A = eaxVar;
        this.B = eaxVar;
        this.j = new defpackage.gs(this);
        this.D = new ae(this, 20, (byte[]) null);
        this.E = new defpackage.jd(this, 1);
        v(context);
        this.F = new dyx();
        defpackage.gv gvVar = new defpackage.gv(context);
        this.G = gvVar;
        addView(gvVar);
    }

    private final void v(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.o = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.C = new android.widget.OverScroller(context);
    }

    private static final boolean w(android.view.View view, int i, int i2, int i3, int i4) {
        boolean z;
        defpackage.gu guVar = (defpackage.gu) view.getLayoutParams();
        if (guVar.leftMargin != i) {
            guVar.leftMargin = i;
            z = true;
        } else {
            z = false;
        }
        if (guVar.topMargin != i2) {
            guVar.topMargin = i2;
            z = true;
        }
        if (guVar.rightMargin != i3) {
            guVar.rightMargin = i3;
            z = true;
        }
        if (guVar.bottomMargin == i4) {
            return z;
        }
        guVar.bottomMargin = i4;
        return true;
    }

    @Override // defpackage.iq
    public final void a() {
        i();
        this.H.d();
    }

    public final void b() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.iq
    public final void c(int i) {
        i();
        if (i == 2) {
            android.util.Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            android.util.Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 109) {
            this.d = true;
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof defpackage.gu;
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        if (this.o != null) {
            int bottom = this.c.getVisibility() == 0 ? (int) (this.c.getBottom() + this.c.getTranslationY() + 0.5f) : 0;
            this.o.setBounds(0, bottom, getWidth(), this.o.getIntrinsicHeight() + bottom);
            this.o.draw(canvas);
        }
    }

    public final void e(android.view.View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public final void f(android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(view, i, i2, i3, i4, i5);
    }

    public final void g(android.view.View view, android.view.View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new defpackage.gu();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.gu(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.F.a();
    }

    public final void h(android.view.View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    final void i() {
        if (this.n == null) {
            this.n = findViewById(2131427399);
            this.c = (android.support.v7.widget.ActionBarContainer) findViewById(2131427401);
            android.support.v7.widget.Toolbar toolbarFindViewById = findViewById(2131427398);
            if (!(toolbarFindViewById instanceof android.support.v7.widget.Toolbar)) {
                throw new java.lang.IllegalStateException("Can't make a decor toolbar out of ".concat(java.lang.String.valueOf(toolbarFindViewById.getClass().getSimpleName())));
            }
            this.H = toolbarFindViewById.C();
        }
    }

    public final void j(int i) {
        b();
        this.c.setTranslationY(-java.lang.Math.max(0, java.lang.Math.min(i, this.c.getHeight())));
    }

    public final void k(boolean z) {
        if (z != this.p) {
            this.p = z;
            if (z) {
                return;
            }
            b();
            j(0);
        }
    }

    @Override // defpackage.iq
    public final void l(android.view.Menu menu, gd gdVar) {
        i();
        defpackage.ly lyVar = this.H;
        hb hbVar = lyVar.f;
        if (hbVar == null) {
            lyVar.f = new hb(lyVar.a.getContext());
            hbVar = lyVar.f;
            ((fk) hbVar).g = 2131427421;
        }
        ((fk) hbVar).e = gdVar;
        android.support.v7.widget.Toolbar toolbar = lyVar.a;
        if (menu == null && toolbar.a == null) {
            return;
        }
        toolbar.n();
        ft ftVar = toolbar.a.a;
        if (ftVar != menu) {
            if (ftVar != null) {
                ftVar.o(toolbar.v);
                ftVar.o(toolbar.w);
            }
            if (toolbar.w == null) {
                toolbar.w = new lt(toolbar);
            }
            hbVar.q();
            if (menu != null) {
                ft ftVar2 = (ft) menu;
                ftVar2.h(hbVar, toolbar.i);
                ftVar2.h(toolbar.w, toolbar.i);
            } else {
                hbVar.c(toolbar.i, (ft) null);
                toolbar.w.c(toolbar.i, (ft) null);
                hbVar.f(true);
                toolbar.w.f(true);
            }
            toolbar.a.j(toolbar.j);
            toolbar.a.k(hbVar);
            toolbar.v = hbVar;
            toolbar.ev();
        }
    }

    @Override // defpackage.iq
    public final void m() {
        i();
        this.H.g();
    }

    @Override // defpackage.iq
    public final void n(android.view.Window.Callback callback) {
        i();
        this.H.d = callback;
    }

    @Override // defpackage.iq
    public final void o(java.lang.CharSequence charSequence) {
        i();
        this.H.j(charSequence);
    }

    @Override // android.view.View
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets windowInsets) {
        boolean zW;
        i();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        int i = windowSystemUiVisibility & 256;
        int i2 = windowSystemUiVisibility & 1536;
        eax eaxVar = k;
        int i3 = dzs.a;
        defpackage.gv gvVar = this.G;
        android.graphics.Rect rect = this.v;
        dzk.n(gvVar, eaxVar, rect);
        boolean zEquals = rect.equals(l);
        this.w = !zEquals;
        boolean z = true;
        boolean z2 = i != 0;
        boolean z3 = zEquals || (z2 && i2 != 0);
        this.x = z3;
        defpackage.gt gtVar = this.h;
        if (gtVar != null) {
            ((defpackage.ee) gtVar).j = (z2 || z3) ? false : true;
        }
        eax eaxVarQ = eax.q(windowInsets, this);
        dwn dwnVarI = eaxVarQ.i();
        android.graphics.Rect rect2 = this.u;
        int i4 = dwnVarI.b;
        int i5 = dwnVarI.c;
        int i6 = dwnVarI.d;
        rect2.set(i4, i5, i6, dwnVarI.e);
        if (this.x) {
            dwn dwnVarF = eaxVarQ.f(2);
            int i7 = dwnVarF.b;
            int i8 = dwnVarF.d;
            this.c.setPadding(i4 - i7, i5, i6 - i8, 0);
            zW = w(this.c, i7, 0, i8, 0);
        } else {
            this.c.setPadding(0, 0, 0, 0);
            zW = w(this.c, i4, i5, i6, 0);
        }
        android.graphics.Rect rect3 = this.r;
        dzk.n(this, eaxVarQ, rect3);
        eax eaxVarO = eaxVarQ.o(rect3.left, rect3.top, rect3.right, rect3.bottom);
        this.y = eaxVarO;
        if (this.z.equals(eaxVarO)) {
            z = zW;
        } else {
            this.z = this.y;
        }
        android.graphics.Rect rect4 = this.s;
        if (rect4.equals(rect3)) {
            if (z) {
            }
            return eaxVarQ.l().n().m().e();
        }
        rect4.set(rect3);
        requestLayout();
        return eaxVarQ.l().n().m().e();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        int i = dzs.a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            android.view.View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                defpackage.gu guVar = (defpackage.gu) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = guVar.leftMargin + paddingLeft;
                int i7 = guVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredHeight;
        eak eahVar;
        i();
        measureChildWithMargins(this.c, i, 0, i2, 0);
        defpackage.gu guVar = (defpackage.gu) this.c.getLayoutParams();
        int iMax = java.lang.Math.max(0, this.c.getMeasuredWidth() + guVar.leftMargin + guVar.rightMargin);
        int iMax2 = java.lang.Math.max(0, this.c.getMeasuredHeight() + guVar.topMargin + guVar.bottomMargin);
        int iCombineMeasuredStates = android.view.View.combineMeasuredStates(0, this.c.getMeasuredState());
        int i3 = dzs.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.m;
            if (this.x) {
                measuredHeight += this.u.top;
            }
        } else {
            measuredHeight = this.c.getVisibility() != 8 ? this.c.getMeasuredHeight() : 0;
        }
        android.graphics.Rect rect = this.t;
        rect.set(this.r);
        eax eaxVar = this.y;
        this.A = eaxVar;
        if (this.d || z || !this.w) {
            dwn dwnVarD = this.x ? dwn.d(eaxVar.b(), java.lang.Math.max(this.A.d(), measuredHeight), this.A.c(), java.lang.Math.max(this.A.a(), 0)) : dwn.d(eaxVar.b(), this.A.d() + measuredHeight, this.A.c(), this.A.a());
            eax eaxVar2 = this.A;
            if (android.os.Build.VERSION.SDK_INT >= 36) {
                eahVar = new eak(eaxVar2);
            } else if (android.os.Build.VERSION.SDK_INT >= 35) {
                eahVar = new eaj(eaxVar2);
            } else if (android.os.Build.VERSION.SDK_INT >= 34) {
                eahVar = new eai(eaxVar2);
            } else {
                eahVar = android.os.Build.VERSION.SDK_INT >= 31 ? new eah(eaxVar2) : new eag(eaxVar2);
            }
            eahVar.c(dwnVarD);
            this.A = eahVar.a();
        } else {
            if (this.x) {
                rect.top = java.lang.Math.max(rect.top, measuredHeight);
                rect.bottom = java.lang.Math.max(rect.bottom, 0);
            } else {
                rect.top += measuredHeight;
                rect.bottom = rect.bottom;
            }
            this.A = this.A.o(0, measuredHeight, 0, 0);
        }
        w(this.n, rect.left, rect.top, rect.right, rect.bottom);
        if (!this.B.equals(this.A)) {
            eax eaxVar3 = this.A;
            this.B = eaxVar3;
            dzs.d(this.n, eaxVar3);
        }
        measureChildWithMargins(this.n, i, 0, i2, 0);
        defpackage.gu guVar2 = (defpackage.gu) this.n.getLayoutParams();
        int iMax3 = java.lang.Math.max(iMax, this.n.getMeasuredWidth() + guVar2.leftMargin + guVar2.rightMargin);
        int iMax4 = java.lang.Math.max(iMax2, this.n.getMeasuredHeight() + guVar2.topMargin + guVar2.bottomMargin);
        int iCombineMeasuredStates2 = android.view.View.combineMeasuredStates(iCombineMeasuredStates, this.n.getMeasuredState());
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), android.view.View.resolveSizeAndState(java.lang.Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View view, float f, float f2, boolean z) {
        if (!this.p || !z) {
            return false;
        }
        this.C.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY);
        if (this.C.getFinalY() > this.c.getHeight()) {
            b();
            this.E.run();
        } else {
            b();
            this.D.run();
        }
        this.f = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4) {
        int i5 = this.q + i2;
        this.q = i5;
        j(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i) {
        defpackage.ee eeVar;
        defpackage.fg fgVar;
        this.F.b(i, 0);
        android.support.v7.widget.ActionBarContainer actionBarContainer = this.c;
        this.q = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        b();
        defpackage.gt gtVar = this.h;
        if (gtVar == null || (fgVar = (eeVar = (defpackage.ee) gtVar).l) == null) {
            return;
        }
        fgVar.a();
        eeVar.l = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i) {
        if ((i & 2) == 0 || this.c.getVisibility() != 0) {
            return false;
        }
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View view) {
        if (!this.p || this.f) {
            return;
        }
        if (this.q <= this.c.getHeight()) {
            b();
            postDelayed(this.D, 600L);
        } else {
            b();
            postDelayed(this.E, 600L);
        }
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        i();
        int i2 = this.g ^ i;
        this.g = i;
        defpackage.gt gtVar = this.h;
        if (gtVar != null) {
            boolean z = (i & 256) != 0;
            int i3 = i & 4;
            defpackage.ee eeVar = (defpackage.ee) gtVar;
            eeVar.j = (z || this.x) ? false : true;
            if (i3 == 0 || !z) {
                if (eeVar.k) {
                    eeVar.k = false;
                    eeVar.x(true);
                }
            } else if (!eeVar.k) {
                eeVar.k = true;
                eeVar.x(true);
            }
        }
        if ((i2 & 256) == 0 || this.h == null) {
            return;
        }
        int i4 = dzs.a;
        requestApplyInsets();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        defpackage.gt gtVar = this.h;
        if (gtVar != null) {
            ((defpackage.ee) gtVar).i = i;
        }
    }

    @Override // defpackage.iq
    public final boolean p() {
        android.support.v7.widget.ActionMenuView actionMenuView;
        i();
        android.support.v7.widget.Toolbar toolbar = this.H.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.b;
    }

    @Override // defpackage.iq
    public final boolean q() {
        i();
        return this.H.l();
    }

    @Override // defpackage.iq
    public final boolean r() {
        hb hbVar;
        i();
        android.support.v7.widget.ActionMenuView actionMenuView = this.H.a.a;
        if (actionMenuView == null || (hbVar = actionMenuView.c) == null) {
            return false;
        }
        return hbVar.n != null || hbVar.m();
    }

    @Override // defpackage.iq
    public final boolean s() {
        i();
        return this.H.m();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean t(android.view.View view, android.view.View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.iq
    public final boolean u() {
        i();
        return this.H.n();
    }

    @Override // android.view.ViewGroup
    protected final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new defpackage.gu(layoutParams);
    }

    public ActionBarOverlayLayout(android.content.Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View view, int i, int i2, int[] iArr) {
    }

    public final void d(android.view.View view, int i, int i2, int[] iArr, int i3) {
    }
}
