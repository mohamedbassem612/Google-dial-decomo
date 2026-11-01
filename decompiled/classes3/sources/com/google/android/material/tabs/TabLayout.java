package com.google.android.material.tabs;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@gml
public class TabLayout extends android.widget.HorizontalScrollView {
    private static final int D = 2132085325;
    private static final dxz E = new dyb(16);
    public androidx.viewpager.widget.ViewPager A;
    public int B;
    public defpackage.aftt C;
    private final java.util.ArrayList F;
    private defpackage.agcm G;
    private int H;
    private final int I;
    private final int J;
    private final int K;
    private int L;
    private final java.util.ArrayList M;
    private defpackage.agch N;
    private android.animation.ValueAnimator O;
    private gmi P;
    private android.database.DataSetObserver Q;
    private defpackage.agcn R;
    private defpackage.agcg S;
    private boolean T;
    private final dxz U;
    public int a;
    final defpackage.agcl b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public final int h;
    public int i;
    public android.content.res.ColorStateList j;
    public android.content.res.ColorStateList k;
    public android.graphics.drawable.Drawable l;
    public float m;
    public float n;
    public float o;
    public final int p;
    public int q;
    public int r;
    int s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    int x;
    public boolean y;
    public final android.animation.TimeInterpolator z;

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        defpackage.aftt agccVar;
        int i2 = D;
        super(agdv.a(context, attributeSet, i, i2), attributeSet, i);
        this.a = -1;
        this.F = new java.util.ArrayList();
        this.i = -1;
        this.H = 0;
        this.q = Integer.MAX_VALUE;
        this.x = -1;
        this.M = new java.util.ArrayList();
        this.U = new dya(12);
        android.content.Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        defpackage.agcl agclVar = new defpackage.agcl(this, context2);
        this.b = agclVar;
        super.addView(agclVar, 0, new android.widget.FrameLayout.LayoutParams(-2, -1));
        android.content.res.TypedArray typedArrayA = afvl.a(context2, attributeSet, defpackage.agce.a, i, i2, new int[]{24});
        android.content.res.ColorStateList colorStateListP = agab.P(getBackground());
        if (colorStateListP != null) {
            android.graphics.drawable.Drawable agafVar = new agaf();
            agafVar.R(colorStateListP);
            agafVar.N(context2);
            agafVar.Q(getElevation());
            setBackground(agafVar);
        }
        android.graphics.drawable.Drawable drawableP = agab.p(context2, typedArrayA, 5);
        android.graphics.drawable.Drawable drawableMutate = (drawableP == null ? new android.graphics.drawable.GradientDrawable() : drawableP).mutate();
        this.l = drawableMutate;
        agab.S(drawableMutate, this.H);
        int i3 = this.x;
        agclVar.b(i3 == -1 ? this.l.getIntrinsicHeight() : i3);
        int color = typedArrayA.getColor(8, 0);
        this.H = color;
        agab.S(this.l, color);
        m(false);
        agclVar.b(typedArrayA.getDimensionPixelSize(11, -1));
        int i4 = typedArrayA.getInt(10, 0);
        if (this.t != i4) {
            this.t = i4;
            agclVar.postInvalidateOnAnimation();
        }
        int i5 = typedArrayA.getInt(7, 0);
        if (i5 != 0) {
            if (i5 == 1) {
                agccVar = new defpackage.agcc();
            } else {
                if (i5 != 2) {
                    throw new java.lang.IllegalArgumentException(i5 + " is not a valid TabIndicatorAnimationMode");
                }
                agccVar = new defpackage.agcd();
            }
            this.C = agccVar;
        } else {
            this.C = new defpackage.aftt(null);
        }
        this.w = typedArrayA.getBoolean(9, true);
        agclVar.a();
        agclVar.postInvalidateOnAnimation();
        int dimensionPixelSize = typedArrayA.getDimensionPixelSize(16, 0);
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.d = dimensionPixelSize;
        this.c = dimensionPixelSize;
        this.c = typedArrayA.getDimensionPixelSize(19, dimensionPixelSize);
        this.d = typedArrayA.getDimensionPixelSize(20, this.d);
        this.e = typedArrayA.getDimensionPixelSize(18, this.e);
        this.f = typedArrayA.getDimensionPixelSize(17, this.f);
        this.g = true != agab.B(context2) ? 2130970794 : 2130970841;
        int resourceId = typedArrayA.getResourceId(24, 2132084226);
        this.h = resourceId;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, ef.x);
        try {
            this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.j = agab.o(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayA.hasValue(22)) {
                this.i = typedArrayA.getResourceId(22, resourceId);
            }
            int i6 = this.i;
            if (i6 != -1) {
                android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i6, ef.x);
                try {
                    this.n = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) this.m);
                    android.content.res.ColorStateList colorStateListO = agab.o(context2, typedArrayObtainStyledAttributes2, 3);
                    if (colorStateListO != null) {
                        this.j = q(this.j.getDefaultColor(), colorStateListO.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListO.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (java.lang.Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            }
            if (typedArrayA.hasValue(25)) {
                this.j = agab.o(context2, typedArrayA, 25);
            }
            if (typedArrayA.hasValue(23)) {
                this.j = q(this.j.getDefaultColor(), typedArrayA.getColor(23, 0));
            }
            agab.o(context2, typedArrayA, 3);
            typedArrayA.getInt(4, -1);
            this.k = agab.o(context2, typedArrayA, 21);
            this.s = typedArrayA.getInt(6, 300);
            this.z = agab.C(context2, 2130970071, afpc.b);
            this.I = typedArrayA.getDimensionPixelSize(14, -1);
            this.J = typedArrayA.getDimensionPixelSize(13, -1);
            this.p = typedArrayA.getResourceId(0, 0);
            this.L = typedArrayA.getDimensionPixelSize(1, 0);
            this.u = typedArrayA.getInt(15, 1);
            this.r = typedArrayA.getInt(2, 0);
            this.v = typedArrayA.getBoolean(12, false);
            this.y = typedArrayA.getBoolean(26, false);
            typedArrayA.recycle();
            android.content.res.Resources resources = getResources();
            this.o = resources.getDimensionPixelSize(2131165594);
            this.K = resources.getDimensionPixelSize(2131165592);
            int i7 = this.u;
            agclVar.setPaddingRelative((i7 == 0 || i7 == 2) ? java.lang.Math.max(0, this.L - this.c) : 0, 0, 0, 0);
            int i8 = this.u;
            if (i8 == 0) {
                int i9 = this.r;
                if (i9 == 0) {
                    android.util.Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
                } else if (i9 == 1) {
                    agclVar.setGravity(1);
                } else if (i9 == 2) {
                }
                agclVar.setGravity(8388611);
            } else if (i8 == 1 || i8 == 2) {
                if (this.r == 2) {
                    android.util.Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                agclVar.setGravity(1);
            }
            m(true);
        } catch (java.lang.Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private final int o(int i, float f) {
        defpackage.agcl agclVar;
        android.view.View childAt;
        int i2 = this.u;
        if ((i2 != 0 && i2 != 2) || (childAt = (agclVar = this.b).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        android.view.View childAt2 = i3 < agclVar.getChildCount() ? agclVar.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    private final int p() {
        int i = this.I;
        if (i != -1) {
            return i;
        }
        int i2 = this.u;
        if (i2 == 0 || i2 == 2) {
            return this.K;
        }
        return 0;
    }

    private static android.content.res.ColorStateList q(int i, int i2) {
        return new android.content.res.ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private final void r(android.view.View view) {
        if (!(view instanceof defpackage.agcf)) {
            throw new java.lang.IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        defpackage.agcf agcfVar = (defpackage.agcf) view;
        defpackage.agcm agcmVarD = d();
        java.lang.CharSequence charSequence = agcfVar.a;
        android.graphics.drawable.Drawable drawable = agcfVar.b;
        int i = agcfVar.c;
        if (!android.text.TextUtils.isEmpty(agcfVar.getContentDescription())) {
            agcmVarD.c(agcfVar.getContentDescription());
        }
        f(agcmVarD);
    }

    private final void s(int i) {
        if (i != -1) {
            if (getWindowToken() != null && isLaidOut()) {
                defpackage.agcl agclVar = this.b;
                int childCount = agclVar.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (agclVar.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iO = o(i, 0.0f);
                if (scrollX != iO) {
                    if (this.O == null) {
                        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
                        this.O = valueAnimator;
                        valueAnimator.setInterpolator(this.z);
                        this.O.setDuration(this.s);
                        this.O.addUpdateListener(new defpackage.afvi(this, 6));
                    }
                    this.O.setIntValues(scrollX, iO);
                    this.O.start();
                }
                int i3 = this.s;
                android.animation.ValueAnimator valueAnimator2 = agclVar.a;
                if (valueAnimator2 != null && valueAnimator2.isRunning() && agclVar.b.a != i) {
                    agclVar.a.cancel();
                }
                agclVar.d(true, i, i3);
                return;
            }
            l(i, 0.0f, true, true, true);
        }
    }

    private final void t(int i) {
        defpackage.agcl agclVar = this.b;
        int childCount = agclVar.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                android.view.View childAt = agclVar.getChildAt(i2);
                boolean z = i2 == i;
                boolean zIsSelected = childAt.isSelected();
                if (i2 != i ? !zIsSelected : zIsSelected) {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                } else {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                    if (childAt instanceof defpackage.agco) {
                        ((defpackage.agco) childAt).c();
                    }
                }
                i2++;
            }
        }
    }

    private final void u(android.widget.LinearLayout.LayoutParams layoutParams) {
        if (this.u == 1 && this.r == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private final boolean v() {
        int i = this.u;
        return i == 0 || i == 2;
    }

    public final int a() {
        defpackage.agcm agcmVar = this.G;
        if (agcmVar != null) {
            return agcmVar.c;
        }
        return -1;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(android.view.View view) {
        r(view);
    }

    public final int b() {
        return this.F.size();
    }

    public final defpackage.agcm c(int i) {
        if (i < 0 || i >= b()) {
            return null;
        }
        return (defpackage.agcm) this.F.get(i);
    }

    public final defpackage.agcm d() {
        defpackage.agcm agcmVar = (defpackage.agcm) E.a();
        if (agcmVar == null) {
            agcmVar = new defpackage.agcm();
        }
        agcmVar.f = this;
        dxz dxzVar = this.U;
        defpackage.agco agcoVar = dxzVar != null ? (defpackage.agco) dxzVar.a() : null;
        if (agcoVar == null) {
            agcoVar = new defpackage.agco(this, getContext());
        }
        agcoVar.a(agcmVar);
        agcoVar.setFocusable(true);
        agcoVar.setMinimumWidth(p());
        if (android.text.TextUtils.isEmpty(agcmVar.b)) {
            agcoVar.setContentDescription(agcmVar.a);
        } else {
            agcoVar.setContentDescription(agcmVar.b);
        }
        agcmVar.g = agcoVar;
        if (agcmVar.h != -1) {
            agcmVar.g.setId(0);
        }
        return agcmVar;
    }

    @java.lang.Deprecated
    public final void e(defpackage.agch agchVar) {
        java.util.ArrayList arrayList = this.M;
        if (arrayList.contains(agchVar)) {
            return;
        }
        arrayList.add(agchVar);
    }

    public final void f(defpackage.agcm agcmVar) {
        g(agcmVar, this.F.isEmpty());
    }

    public final void g(defpackage.agcm agcmVar, boolean z) {
        java.util.ArrayList arrayList = this.F;
        int size = arrayList.size();
        if (agcmVar.f != this) {
            throw new java.lang.IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        agcmVar.c = size;
        arrayList.add(size, agcmVar);
        int size2 = arrayList.size();
        int i = -1;
        for (int i2 = size + 1; i2 < size2; i2++) {
            if (((defpackage.agcm) arrayList.get(i2)).c == this.a) {
                i = i2;
            }
            ((defpackage.agcm) arrayList.get(i2)).c = i2;
        }
        this.a = i;
        defpackage.agco agcoVar = agcmVar.g;
        agcoVar.setSelected(false);
        agcoVar.setActivated(false);
        defpackage.agcl agclVar = this.b;
        int i3 = agcmVar.c;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
        u(layoutParams);
        agclVar.addView(agcoVar, i3, layoutParams);
        if (z) {
            agcmVar.a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final void h() {
        int i;
        defpackage.agcl agclVar = this.b;
        for (int childCount = agclVar.getChildCount() - 1; childCount >= 0; childCount--) {
            defpackage.agco agcoVar = (defpackage.agco) agclVar.getChildAt(childCount);
            agclVar.removeViewAt(childCount);
            if (agcoVar != null) {
                agcoVar.a(null);
                agcoVar.setSelected(false);
                this.U.b(agcoVar);
            }
            requestLayout();
        }
        java.util.Iterator it = this.F.iterator();
        while (it.hasNext()) {
            defpackage.agcm agcmVar = (defpackage.agcm) it.next();
            it.remove();
            agcmVar.f = null;
            agcmVar.g = null;
            agcmVar.h = -1;
            agcmVar.a = null;
            agcmVar.b = null;
            agcmVar.c = -1;
            agcmVar.d = null;
            E.b(agcmVar);
        }
        this.G = null;
        gmi gmiVar = this.P;
        if (gmiVar != null) {
            int i2 = gmiVar.i();
            for (int i3 = 0; i3 < i2; i3++) {
                defpackage.agcm agcmVarD = d();
                agcmVarD.d(null);
                g(agcmVarD, false);
            }
            androidx.viewpager.widget.ViewPager viewPager = this.A;
            if (viewPager == null || i2 <= 0 || (i = viewPager.d) == a() || i >= b()) {
                return;
            }
            j(c(i), true);
        }
    }

    @java.lang.Deprecated
    public final void i(defpackage.agch agchVar) {
        this.M.remove(agchVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0045  */
    public final void j(defpackage.agcm agcmVar, boolean z) {
        com.google.android.material.tabs.TabLayout tabLayout;
        defpackage.agcm agcmVar2 = this.G;
        if (agcmVar2 == agcmVar) {
            if (agcmVar2 != null) {
                java.util.ArrayList arrayList = this.M;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((defpackage.agch) arrayList.get(size)).a(agcmVar);
                }
                s(agcmVar.c);
                return;
            }
            return;
        }
        int i = agcmVar != null ? agcmVar.c : -1;
        if (z) {
            if (agcmVar2 != null) {
                if (agcmVar2.c != -1) {
                    tabLayout = this;
                    tabLayout.s(i);
                }
                if (i != -1) {
                    tabLayout.t(i);
                }
            } else {
                agcmVar2 = null;
            }
            if (i != -1) {
                tabLayout = this;
                tabLayout.l(i, 0.0f, true, true, true);
            } else {
                i = -1;
                tabLayout = this;
                tabLayout.s(i);
            }
            if (i != -1) {
                tabLayout.t(i);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.G = agcmVar;
        if (agcmVar2 != null && agcmVar2.f != null) {
            java.util.ArrayList arrayList2 = tabLayout.M;
            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                ((defpackage.agch) arrayList2.get(size2)).c();
            }
        }
        if (agcmVar != null) {
            java.util.ArrayList arrayList3 = tabLayout.M;
            for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                ((defpackage.agch) arrayList3.get(size3)).b(agcmVar);
            }
        }
    }

    public final void k(gmi gmiVar, boolean z) {
        android.database.DataSetObserver dataSetObserver;
        gmi gmiVar2 = this.P;
        if (gmiVar2 != null && (dataSetObserver = this.Q) != null) {
            gmiVar2.a.unregisterObserver(dataSetObserver);
        }
        this.P = gmiVar;
        if (z && gmiVar != null) {
            if (this.Q == null) {
                this.Q = new defpackage.agcj(this);
            }
            gmiVar.a.registerObserver(this.Q);
        }
        h();
    }

    public final void l(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int iRound = java.lang.Math.round(f2);
        if (iRound >= 0) {
            defpackage.agcl agclVar = this.b;
            if (iRound < agclVar.getChildCount()) {
                if (z2) {
                    agclVar.b.a = java.lang.Math.round(f2);
                    android.animation.ValueAnimator valueAnimator = agclVar.a;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        agclVar.a.cancel();
                    }
                    agclVar.c(agclVar.getChildAt(i), agclVar.getChildAt(i + 1), f);
                }
                android.animation.ValueAnimator valueAnimator2 = this.O;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.O.cancel();
                }
                int iO = o(i, f);
                int scrollX = getScrollX();
                boolean z4 = (i < a() && iO >= scrollX) || (i > a() && iO <= scrollX) || i == a();
                if (getLayoutDirection() == 1) {
                    z4 = (i < a() && iO <= scrollX) || (i > a() && iO >= scrollX) || i == a();
                }
                if (z4 || this.B == 1 || z3) {
                    if (i < 0) {
                        iO = 0;
                    }
                    scrollTo(iO, 0);
                }
                if (z) {
                    t(iRound);
                }
            }
        }
    }

    public final void m(boolean z) {
        int i = 0;
        while (true) {
            defpackage.agcl agclVar = this.b;
            if (i >= agclVar.getChildCount()) {
                return;
            }
            android.view.View childAt = agclVar.getChildAt(i);
            childAt.setMinimumWidth(p());
            u((android.widget.LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    public final void n(androidx.viewpager.widget.ViewPager viewPager, boolean z) {
        java.util.List list;
        java.util.List list2;
        androidx.viewpager.widget.ViewPager viewPager2 = this.A;
        if (viewPager2 != null) {
            defpackage.agcn agcnVar = this.R;
            if (agcnVar != null && (list2 = viewPager2.r) != null) {
                list2.remove(agcnVar);
            }
            defpackage.agcg agcgVar = this.S;
            if (agcgVar != null && (list = this.A.s) != null) {
                list.remove(agcgVar);
            }
        }
        defpackage.agch agchVar = this.N;
        if (agchVar != null) {
            i(agchVar);
            this.N = null;
        }
        if (viewPager != null) {
            this.A = viewPager;
            defpackage.agcn agcnVar2 = this.R;
            if (agcnVar2 == null) {
                agcnVar2 = new defpackage.agcn(this);
                this.R = agcnVar2;
            }
            agcnVar2.b = 0;
            agcnVar2.a = 0;
            viewPager.g(agcnVar2);
            defpackage.agcp agcpVar = new defpackage.agcp(viewPager);
            this.N = agcpVar;
            e(agcpVar);
            gmi gmiVar = viewPager.c;
            if (gmiVar != null) {
                k(gmiVar, true);
            }
            defpackage.agcg agcgVar2 = this.S;
            if (agcgVar2 == null) {
                agcgVar2 = new defpackage.agcg(this);
                this.S = agcgVar2;
            }
            agcgVar2.a = true;
            if (viewPager.s == null) {
                viewPager.s = new java.util.ArrayList();
            }
            viewPager.s.add(agcgVar2);
            l(viewPager.d, 0.0f, true, true, true);
        } else {
            this.A = null;
            k(null, false);
        }
        this.T = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        agab.f(this);
        if (this.A == null) {
            android.view.ViewParent parent = getParent();
            if (parent instanceof androidx.viewpager.widget.ViewPager) {
                n((androidx.viewpager.widget.ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.T) {
            n(null, false);
            this.T = false;
        }
    }

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
        defpackage.agco agcoVar;
        android.graphics.drawable.Drawable drawable;
        int i = 0;
        while (true) {
            defpackage.agcl agclVar = this.b;
            if (i >= agclVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            android.view.View childAt = agclVar.getChildAt(i);
            if ((childAt instanceof defpackage.agco) && (drawable = (agcoVar = (defpackage.agco) childAt).c) != null) {
                drawable.setBounds(agcoVar.getLeft(), agcoVar.getTop(), agcoVar.getRight(), agcoVar.getBottom());
                drawable.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new ebd(accessibilityNodeInfo).u(ni.t(1, b(), 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return v() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        java.util.ArrayList arrayList = this.F;
        android.content.Context context = getContext();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
        }
        int iRound = java.lang.Math.round(agab.E(context, 48));
        int mode = android.view.View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = android.view.View.MeasureSpec.makeMeasureSpec(iRound + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && android.view.View.MeasureSpec.getSize(i2) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size2 = android.view.View.MeasureSpec.getSize(i);
        if (android.view.View.MeasureSpec.getMode(i) != 0) {
            int iE = this.J;
            if (iE <= 0) {
                iE = (int) (size2 - agab.E(getContext(), 56));
            }
            this.q = iE;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            android.view.View childAt = getChildAt(0);
            int i4 = this.u;
            if (i4 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i4 != 1) {
                if (i4 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || v()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        agab.e(this, f);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return java.lang.Math.max(0, ((this.b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(android.view.View view, int i) {
        r(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        r(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        r(view);
    }

    public TabLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130970773);
    }

    public TabLayout(android.content.Context context) {
        this(context, null);
    }
}
