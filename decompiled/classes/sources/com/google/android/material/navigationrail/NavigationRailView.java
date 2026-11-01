package com.google.android.material.navigationrail;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class NavigationRailView extends defpackage.afwx {
    private static final android.animation.TimeInterpolator h = new android.view.animation.PathInterpolator(0.38f, 1.21f, 0.22f, 1.0f);
    public java.lang.Boolean e;
    public java.lang.Boolean f;
    public java.lang.Boolean g;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;
    private boolean n;
    private android.view.View o;
    private afxi p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private afxe z;

    public NavigationRailView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = null;
        this.f = null;
        this.g = null;
        this.q = false;
        this.s = -1;
        this.t = 0;
        this.u = 49;
        android.content.Context context2 = getContext();
        this.y = getContext().getResources().getDimensionPixelSize(2131166791);
        this.x = 8388627;
        this.w = 1;
        defpackage.ajxw ajxwVarF = defpackage.afvl.f(context2, attributeSet, afxj.a, i, i2, new int[0]);
        this.i = ajxwVarF.n(1, getResources().getDimensionPixelSize(2131167154));
        this.j = ajxwVarF.n(7, getResources().getDimensionPixelSize(2131167154));
        this.m = ajxwVarF.y(14, false);
        boolean zY = ajxwVarF.y(17, false);
        if (this.n != zY) {
            this.n = zY;
            afxg afxgVarK = k();
            if (afxgVarK.N != zY) {
                afxgVarK.N = zY;
                afwi[] afwiVarArr = afxgVarK.e;
                if (afwiVarArr != null) {
                    for (afwi afwiVar : afwiVarArr) {
                        if (afwiVar instanceof afwi) {
                            afwiVar.b(zY);
                        }
                    }
                }
            }
        }
        defpackage.afwq afwqVar = this.b;
        afxe afxeVar = new afxe(getContext());
        this.z = afxeVar;
        afxeVar.a = this.i;
        afxeVar.b = this.m;
        afxeVar.setClipChildren(false);
        this.z.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        afwqVar.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        this.z.addView(afwqVar);
        if (this.m) {
            afxi afxiVar = new afxi(getContext());
            this.p = afxiVar;
            afxiVar.setVerticalScrollBarEnabled(false);
            this.p.addView(this.z);
            this.p.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            addView(this.p);
        } else {
            addView(this.z);
        }
        int iR = ajxwVarF.r(6, 0);
        if (iR != 0) {
            android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(iR, (android.view.ViewGroup) this, false);
            android.view.View view = this.o;
            if (view != null) {
                this.z.removeView(view);
            }
            this.o = viewInflate;
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.bottomMargin = this.j;
            this.z.addView(viewInflate, 0, layoutParams);
        }
        int iO = ajxwVarF.o(10, 49);
        afxg afxgVarK2 = k();
        if (afxgVarK2.a.gravity != iO) {
            afxgVarK2.a.gravity = iO;
            afxgVarK2.setLayoutParams(afxgVarK2.a);
        }
        int iN = ajxwVarF.n(8, -1);
        int iN2 = ajxwVarF.n(8, -1);
        iN = ajxwVarF.z(0) ? ajxwVarF.n(0, -1) : iN;
        iN2 = ajxwVarF.z(3) ? ajxwVarF.n(3, -1) : iN2;
        this.s = iN;
        if (!this.q) {
            this.b.l(iN);
        }
        this.v = iN2;
        if (this.q) {
            this.b.l(iN2);
        }
        this.k = ajxwVarF.n(5, context2.getResources().getDimensionPixelSize(2131166806));
        this.l = ajxwVarF.n(4, context2.getResources().getDimensionPixelSize(2131166805));
        if (ajxwVarF.z(13)) {
            this.e = java.lang.Boolean.valueOf(ajxwVarF.y(13, false));
        }
        if (ajxwVarF.z(11)) {
            this.f = java.lang.Boolean.valueOf(ajxwVarF.y(11, false));
        }
        if (ajxwVarF.z(12)) {
            this.g = java.lang.Boolean.valueOf(ajxwVarF.y(12, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131166803);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(2131166801);
        float fA = defpackage.afpc.a(0.0f, 1.0f, 0.3f, 1.0f, defpackage.agab.k(context2) - 1.0f);
        float fB = defpackage.afpc.b(this.b.r, dimensionPixelOffset, fA);
        float fB2 = defpackage.afpc.b(this.b.s, dimensionPixelOffset2, fA);
        g(java.lang.Math.round(fB));
        f(java.lang.Math.round(fB2));
        int iN3 = ajxwVarF.n(9, 0);
        this.r = iN3;
        if (!this.q) {
            k().m(iN3);
        }
        l(ajxwVarF.y(2, false));
        ajxwVarF.x();
        defpackage.agab.J(this, new afxh(this));
    }

    private final afxg k() {
        return this.b;
    }

    private final void l(boolean z) {
        if (this.q != z) {
            if (isLaidOut()) {
                defpackage.gkm gkmVar = new defpackage.gkm();
                gkmVar.b = 500L;
                gkmVar.c = h;
                defpackage.gko gkoVar = new defpackage.gko();
                gkoVar.b = 100L;
                defpackage.gko gkoVar2 = new defpackage.gko();
                gkoVar2.b = 100L;
                defpackage.gkz afxdVar = new afxd();
                defpackage.gko gkoVar3 = new defpackage.gko();
                gkoVar3.b = 100L;
                int childCount = k().getChildCount();
                for (int i = 0; i < childCount; i++) {
                    android.view.View childAt = k().getChildAt(i);
                    if (childAt instanceof defpackage.afwm) {
                        defpackage.afwm afwmVar = (defpackage.afwm) childAt;
                        com.google.android.material.internal.BaselineLayout baselineLayout = afwmVar.f;
                        gkmVar.G(baselineLayout);
                        com.google.android.material.internal.BaselineLayout baselineLayout2 = afwmVar.g;
                        gkmVar.G(baselineLayout2);
                        if (this.q) {
                            gkoVar2.F(baselineLayout2);
                            gkoVar.F(baselineLayout);
                        } else {
                            gkoVar2.F(baselineLayout);
                            gkoVar.F(baselineLayout2);
                        }
                        afxdVar.F(baselineLayout2);
                    }
                    gkoVar3.F(childAt);
                }
                defpackage.glh glhVar = new defpackage.glh();
                glhVar.U(0);
                glhVar.S(gkmVar);
                glhVar.S(gkoVar);
                glhVar.S(afxdVar);
                if (!this.q) {
                    glhVar.S(gkoVar3);
                }
                defpackage.glh glhVar2 = new defpackage.glh();
                glhVar2.U(0);
                glhVar2.S(gkoVar2);
                if (this.q) {
                    glhVar2.S(gkoVar3);
                }
                defpackage.glh glhVar3 = new defpackage.glh();
                glhVar3.U(1);
                glhVar3.S(glhVar2);
                glhVar3.S(glhVar);
                defpackage.gld.b((android.view.ViewGroup) getParent(), glhVar3);
            }
            this.q = z;
            int i2 = this.t;
            int i3 = this.r;
            int i4 = this.s;
            int i5 = this.u;
            if (z) {
                i2 = this.w;
                i3 = this.y;
                i4 = this.v;
                i5 = this.x;
            }
            k().i(i5);
            super.e(i2);
            k().m(i3);
            k().l(i4);
            afxg afxgVarK = k();
            afxgVarK.L = z;
            defpackage.afwp[] afwpVarArr = afxgVarK.e;
            if (afwpVarArr != null) {
                for (defpackage.afwp afwpVar : afwpVarArr) {
                    afwpVar.fi(z);
                }
            }
        }
    }

    @Override // defpackage.afwx
    public final int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.afwx
    protected final /* synthetic */ defpackage.afwq b(android.content.Context context) {
        return new afxg(context);
    }

    @Override // defpackage.afwx
    public final int c() {
        return 7;
    }

    @Override // defpackage.afwx
    public final void d(int i) {
        this.u = i;
        this.x = i;
        super.d(i);
    }

    @Override // defpackage.afwx
    public final void e(int i) {
        this.t = i;
        this.w = i;
        super.e(i);
    }

    @Override // defpackage.afwx
    protected final boolean h() {
        return true;
    }

    @Override // defpackage.afwx
    public final boolean i() {
        return true;
    }

    public final boolean j(java.lang.Boolean bool) {
        return bool != null ? bool.booleanValue() : getFitsSystemWindows();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int iMakeMeasureSpec = (android.view.View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumWidth <= 0) ? i : android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(android.view.View.MeasureSpec.getSize(i), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
        if (this.q) {
            measureChild(k(), i, i2);
            android.view.View view = this.o;
            if (view != null) {
                measureChild(view, i, i2);
            }
            int childCount = k().getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                android.view.View childAt = k().getChildAt(i3);
                if (childAt.getVisibility() != 8 && !(childAt instanceof afwi)) {
                    iMax = java.lang.Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            int iMin = java.lang.Math.min(this.k, android.view.View.MeasureSpec.getSize(i));
            if (android.view.View.MeasureSpec.getMode(i) != 1073741824) {
                int iMax2 = java.lang.Math.max(iMax, iMin);
                android.view.View view2 = this.o;
                if (view2 != null) {
                    iMax2 = java.lang.Math.max(iMax2, view2.getMeasuredWidth());
                }
                i = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(getSuggestedMinimumWidth(), java.lang.Math.min(iMax2, this.l)), 1073741824);
            }
            if (this.b.y == -1) {
                afxg afxgVarK = k();
                int size = android.view.View.MeasureSpec.getSize(i);
                defpackage.afwp[] afwpVarArr = afxgVarK.e;
                if (afwpVarArr != null) {
                    for (defpackage.afwp afwpVar : afwpVarArr) {
                        if (afwpVar instanceof defpackage.afwm) {
                            ((defpackage.afwm) afwpVar).M(size);
                        }
                    }
                }
            }
            iMakeMeasureSpec = i;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (this.z.getMeasuredHeight() < getMeasuredHeight()) {
            measureChild(this.z, iMakeMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
    }

    @Override // defpackage.afwx, android.view.View
    protected final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.os.Parcelable parcelable2;
        if (!(parcelable instanceof com.google.android.material.navigationrail.NavigationRailView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.navigationrail.NavigationRailView.SavedState savedState = (com.google.android.material.navigationrail.NavigationRailView.SavedState) parcelable;
        super.onRestoreInstanceState(savedState);
        l(savedState.b);
        afxi afxiVar = this.p;
        if (afxiVar == null || (parcelable2 = savedState.e) == null) {
            return;
        }
        afxiVar.onRestoreInstanceState(parcelable2);
    }

    @Override // defpackage.afwx, android.view.View
    protected final android.os.Parcelable onSaveInstanceState() {
        android.os.Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        com.google.android.material.navigationrail.NavigationRailView.SavedState savedState = new com.google.android.material.navigationrail.NavigationRailView.SavedState(((androidx.customview.view.AbsSavedState) parcelableOnSaveInstanceState).d);
        savedState.a = ((com.google.android.material.navigation.NavigationBarView$SavedState) parcelableOnSaveInstanceState).a;
        savedState.b = this.q;
        afxi afxiVar = this.p;
        savedState.e = afxiVar != null ? afxiVar.onSaveInstanceState() : null;
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public NavigationRailView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130970108);
    }

    public NavigationRailView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 2132086135);
    }

    public NavigationRailView(android.content.Context context) {
        this(context, null);
    }
}
