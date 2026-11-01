package com.google.android.material.navigation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class NavigationView extends defpackage.afvc implements defpackage.afvt {
    private static final int[] o = {android.R.attr.state_checked};
    private static final int[] p = {-16842910};
    private final defpackage.emo A;
    public final defpackage.aful g;
    public final defpackage.afuw h;
    public final int[] i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final defpackage.aogc n;
    private final int q;
    private android.view.MenuInflater r;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener s;
    private int t;
    private final boolean u;
    private final int v;
    private final defpackage.agax w;
    private defpackage.agal x;
    private final defpackage.afwd y;
    private final defpackage.afxb z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public NavigationView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int i2;
        int iN;
        super(defpackage.agdv.b(context, attributeSet, i, 2132085322, new int[0]), attributeSet, i);
        int i3 = defpackage.agdv.a;
        defpackage.afuw afuwVar = new defpackage.afuw();
        this.h = afuwVar;
        this.i = new int[2];
        this.j = true;
        this.k = true;
        this.l = true;
        this.m = true;
        this.t = 0;
        this.w = android.os.Build.VERSION.SDK_INT >= 33 ? new defpackage.agbb(this) : new agaz(this);
        this.y = new defpackage.afwd(this);
        this.n = new defpackage.aogc(this);
        this.A = new defpackage.afwy(this);
        this.z = new defpackage.afxb(this);
        android.content.Context context2 = getContext();
        defpackage.aful afulVar = new defpackage.aful(context2);
        this.g = afulVar;
        int[] iArr = defpackage.afxc.c;
        defpackage.afvl.b(context2, attributeSet, i, 2132085322);
        defpackage.afvl.d(context2, attributeSet, iArr, i, 2132085322, new int[0]);
        defpackage.ajxw ajxwVar = new defpackage.ajxw(context2, context2.obtainStyledAttributes(attributeSet, iArr, i, 2132085322));
        if (ajxwVar.z(1)) {
            setBackground(ajxwVar.t(1));
        }
        int iN2 = ajxwVar.n(7, 0);
        this.t = iN2;
        this.u = iN2 == 0;
        this.v = getResources().getDimensionPixelSize(2131166775);
        android.graphics.drawable.Drawable background = getBackground();
        android.content.res.ColorStateList colorStateListP = defpackage.agab.P(background);
        if (background == null || colorStateListP != null) {
            defpackage.agaf agafVar = new defpackage.agaf(new defpackage.agal(defpackage.agal.k(context2, attributeSet, i, 2132085322, new defpackage.afzw(0.0f))));
            if (colorStateListP != null) {
                agafVar.R(colorStateListP);
            }
            agafVar.N(context2);
            setBackground(agafVar);
        }
        if (ajxwVar.z(8)) {
            setElevation(ajxwVar.n(8, 0));
        }
        setFitsSystemWindows(ajxwVar.y(2, false));
        this.q = ajxwVar.n(3, 0);
        android.content.res.ColorStateList colorStateListS = ajxwVar.z(33) ? ajxwVar.s(33) : null;
        int iR = ajxwVar.z(36) ? ajxwVar.r(36, 0) : 0;
        if (iR == 0) {
            colorStateListS = colorStateListS == null ? c(android.R.attr.textColorSecondary) : colorStateListS;
            iR = 0;
        }
        android.content.res.ColorStateList colorStateListS2 = ajxwVar.z(15) ? ajxwVar.s(15) : c(android.R.attr.textColorSecondary);
        int iR2 = ajxwVar.z(25) ? ajxwVar.r(25, 0) : 0;
        boolean zY = ajxwVar.y(26, true);
        if (ajxwVar.z(14) && afuwVar.r != (iN = ajxwVar.n(14, 0))) {
            afuwVar.r = iN;
            afuwVar.w = true;
            afuwVar.p();
        }
        android.content.res.ColorStateList colorStateListS3 = ajxwVar.z(27) ? ajxwVar.s(27) : null;
        if (iR2 == 0) {
            colorStateListS3 = colorStateListS3 == null ? c(android.R.attr.textColorPrimary) : colorStateListS3;
            iR2 = 0;
        }
        android.graphics.drawable.Drawable drawableT = ajxwVar.t(11);
        if (drawableT == null && (ajxwVar.z(18) || ajxwVar.z(19))) {
            drawableT = f(ajxwVar, defpackage.agab.av(getContext(), ajxwVar, 20));
            android.content.res.ColorStateList colorStateListAv = defpackage.agab.av(context2, ajxwVar, 17);
            if (colorStateListAv != null) {
                android.graphics.drawable.Drawable drawableF = f(ajxwVar, null);
                int i4 = defpackage.afzc.a;
                android.graphics.drawable.RippleDrawable rippleDrawable = new android.graphics.drawable.RippleDrawable(colorStateListAv, null, drawableF);
                com.google.android.material.focus.FocusRingDrawable focusRingDrawableC = com.google.android.material.focus.FocusRingDrawable.c(context2, rippleDrawable, null);
                if (focusRingDrawableC != null) {
                    focusRingDrawableC.e(this.x);
                }
                afuwVar.n = rippleDrawable;
                afuwVar.p();
            }
        }
        if (ajxwVar.z(12)) {
            i2 = 0;
            afuwVar.o = ajxwVar.n(12, 0);
            afuwVar.p();
        } else {
            i2 = 0;
        }
        if (ajxwVar.z(28)) {
            afuwVar.p = ajxwVar.n(28, i2);
            afuwVar.p();
        }
        afuwVar.s = ajxwVar.n(6, i2);
        afuwVar.m();
        afuwVar.t = ajxwVar.n(5, i2);
        afuwVar.m();
        afuwVar.u = ajxwVar.n(35, i2);
        afuwVar.o();
        afuwVar.v = ajxwVar.n(34, i2);
        afuwVar.o();
        this.j = ajxwVar.y(37, this.j);
        this.k = ajxwVar.y(4, this.k);
        this.l = ajxwVar.y(32, this.l);
        this.m = ajxwVar.y(9, this.m);
        int iN3 = ajxwVar.n(13, 0);
        afuwVar.y = ajxwVar.o(16, 1);
        afuwVar.p();
        afulVar.b = new defpackage.afwz(this);
        afuwVar.d = 1;
        afuwVar.c(context2, afulVar);
        if (iR != 0) {
            afuwVar.g = iR;
            afuwVar.o();
        }
        afuwVar.h = colorStateListS;
        afuwVar.o();
        afuwVar.l = colorStateListS2;
        afuwVar.p();
        afuwVar.k(getOverScrollMode());
        if (iR2 != 0) {
            afuwVar.i = iR2;
            afuwVar.p();
        }
        afuwVar.j = zY;
        afuwVar.p();
        afuwVar.k = colorStateListS3;
        afuwVar.p();
        afuwVar.m = drawableT;
        afuwVar.p();
        afuwVar.q = iN3;
        afuwVar.p();
        afulVar.g(afuwVar);
        if (afuwVar.a == null) {
            afuwVar.a = (com.google.android.material.internal.NavigationMenuView) afuwVar.f.inflate(2131624137, (android.view.ViewGroup) this, false);
            afuwVar.a.X(new defpackage.afuu(afuwVar, afuwVar.a));
            if (afuwVar.e == null) {
                afuwVar.e = new defpackage.afup(afuwVar);
                afuwVar.e.r(true);
            }
            int i5 = afuwVar.B;
            if (i5 != -1) {
                afuwVar.a.setOverScrollMode(i5);
            }
            afuwVar.b = (android.widget.LinearLayout) afuwVar.f.inflate(2131624134, (android.view.ViewGroup) afuwVar.a, false);
            afuwVar.b.setImportantForAccessibility(2);
            afuwVar.a.Y(afuwVar.e);
        }
        addView(afuwVar.a);
        ?? r7 = 0;
        if (ajxwVar.z(29)) {
            int iR3 = ajxwVar.r(29, 0);
            afuwVar.l(true);
            if (this.r == null) {
                this.r = new defpackage.fe(getContext());
            }
            this.r.inflate(iR3, afulVar);
            r7 = 0;
            afuwVar.l(false);
            afuwVar.f(false);
        }
        if (ajxwVar.z(10)) {
            afuwVar.b.addView(afuwVar.f.inflate(ajxwVar.r(10, r7), afuwVar.b, (boolean) r7));
            com.google.android.material.internal.NavigationMenuView navigationMenuView = afuwVar.a;
            navigationMenuView.setPadding(r7, r7, r7, navigationMenuView.getPaddingBottom());
        }
        ajxwVar.x();
        this.s = new defpackage.afxa(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.s);
    }

    private final android.content.res.ColorStateList c(int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            android.content.res.ColorStateList colorStateListD = defpackage.dvx.d(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(2130969072, typedValue, true)) {
                int i2 = typedValue.data;
                int defaultColor = colorStateListD.getDefaultColor();
                int[] iArr = p;
                return new android.content.res.ColorStateList(new int[][]{iArr, o, EMPTY_STATE_SET}, new int[]{colorStateListD.getColorForState(iArr, defaultColor), i2, defaultColor});
            }
        }
        return null;
    }

    private final android.util.Pair d() {
        android.view.ViewParent parent = getParent();
        boolean z = parent instanceof androidx.drawerlayout.widget.DrawerLayout;
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (z && (layoutParams instanceof defpackage.ejg)) {
            return new android.util.Pair((androidx.drawerlayout.widget.DrawerLayout) parent, (defpackage.ejg) layoutParams);
        }
        throw new java.lang.IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    private final void e(int i, int i2) {
        if ((getParent() instanceof androidx.drawerlayout.widget.DrawerLayout) && (getLayoutParams() instanceof defpackage.ejg)) {
            if ((this.t > 0 || this.u) && (getBackground() instanceof defpackage.agaf)) {
                int absoluteGravity = android.view.Gravity.getAbsoluteGravity(((defpackage.ejg) getLayoutParams()).a, getLayoutDirection());
                defpackage.agaf agafVar = (defpackage.agaf) getBackground();
                defpackage.aguv aguvVar = new defpackage.aguv(agafVar.es());
                aguvVar.k(this.t);
                if (absoluteGravity == 3) {
                    aguvVar.i(0.0f);
                    aguvVar.g(0.0f);
                } else {
                    aguvVar.j(0.0f);
                    aguvVar.h(0.0f);
                }
                defpackage.agal agalVar = new defpackage.agal(aguvVar);
                agafVar.q(agalVar);
                defpackage.agax agaxVar = this.w;
                agaxVar.b = agalVar;
                agaxVar.b();
                agaxVar.a(this);
                agaxVar.c = new android.graphics.RectF(0.0f, 0.0f, i, i2);
                agaxVar.b();
                agaxVar.a(this);
                agaxVar.a = true;
                agaxVar.a(this);
            }
        }
    }

    private final android.graphics.drawable.Drawable f(defpackage.ajxw ajxwVar, android.content.res.ColorStateList colorStateList) {
        int[] iArr = defpackage.afxc.a;
        this.x = new defpackage.agal(defpackage.agal.j(getContext(), ajxwVar.r(18, 0), ajxwVar.r(19, 0), new defpackage.afzw(0.0f)));
        defpackage.agaf agafVar = new defpackage.agaf(this.x);
        agafVar.R(colorStateList);
        return new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) agafVar, ajxwVar.n(23, 0), ajxwVar.n(24, 0), ajxwVar.n(22, 0), ajxwVar.n(21, 0));
    }

    @Override // defpackage.afvc
    protected final void a(defpackage.eax eaxVar) {
        defpackage.afuw afuwVar = this.h;
        int iD = eaxVar.d();
        if (afuwVar.z != iD) {
            afuwVar.z = iD;
            afuwVar.q();
        }
        com.google.android.material.internal.NavigationMenuView navigationMenuView = afuwVar.a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, eaxVar.a());
        defpackage.dzs.d(afuwVar.b, eaxVar);
    }

    public final void b() {
        if (!this.u || this.t == 0) {
            return;
        }
        this.t = 0;
        e(getWidth(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) {
        defpackage.agax agaxVar = this.w;
        if (agaxVar.c()) {
            android.graphics.Path path = agaxVar.d;
            if (!path.isEmpty()) {
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // defpackage.afvt
    public final void j() {
        d();
        this.y.e();
        b();
    }

    @Override // defpackage.afvt
    public final void l() {
        int i;
        android.util.Pair pairD = d();
        androidx.drawerlayout.widget.DrawerLayout drawerLayout = (androidx.drawerlayout.widget.DrawerLayout) pairD.first;
        defpackage.afwd afwdVar = this.y;
        mk mkVarC = afwdVar.c();
        if (mkVarC == null || android.os.Build.VERSION.SDK_INT < 34) {
            drawerLayout.g(this, true);
            return;
        }
        int i2 = ((defpackage.ejg) pairD.second).a;
        int i3 = afwh.a;
        android.animation.Animator.AnimatorListener afwgVar = new afwg(drawerLayout, this);
        android.animation.ValueAnimator.AnimatorUpdateListener mhVar = new mh(drawerLayout, 16, (byte[]) null);
        boolean zH = afwdVar.h(i2);
        android.view.View view = afwdVar.a;
        float width = view.getWidth() * view.getScaleX();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            i = zH ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
        } else {
            i = 0;
        }
        float f = width + i;
        android.util.Property property = android.view.View.TRANSLATION_X;
        if (zH) {
            f = -f;
        }
        boolean z = mkVarC.c == 0;
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) property, f);
        objectAnimatorOfFloat.addUpdateListener(mhVar);
        objectAnimatorOfFloat.setInterpolator(new defpackage.emd());
        objectAnimatorOfFloat.setDuration(defpackage.afpc.b(afwdVar.b, afwdVar.c, mkVarC.b));
        objectAnimatorOfFloat.addListener(new afwc(afwdVar, z, i2));
        objectAnimatorOfFloat.addListener(afwgVar);
        objectAnimatorOfFloat.start();
    }

    @Override // defpackage.afvc, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        defpackage.agab.f(this);
        android.view.ViewParent parent = getParent();
        if (parent instanceof androidx.drawerlayout.widget.DrawerLayout) {
            androidx.drawerlayout.widget.DrawerLayout drawerLayout = (androidx.drawerlayout.widget.DrawerLayout) parent;
            defpackage.afxb afxbVar = this.z;
            afxbVar.j();
            drawerLayout.w(afxbVar);
            drawerLayout.v(afxbVar);
            defpackage.aogc aogcVar = this.n;
            if (aogcVar.b != null) {
                defpackage.emo emoVar = this.A;
                drawerLayout.w(emoVar);
                drawerLayout.v(emoVar);
                if (drawerLayout.o(this)) {
                    aogcVar.I(true);
                }
            }
        }
    }

    @Override // defpackage.afvc, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.s);
        android.view.ViewParent parent = getParent();
        if (parent instanceof androidx.drawerlayout.widget.DrawerLayout) {
            androidx.drawerlayout.widget.DrawerLayout drawerLayout = (androidx.drawerlayout.widget.DrawerLayout) parent;
            drawerLayout.w(this.A);
            drawerLayout.w(this.z);
        }
        this.n.J();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int mode = android.view.View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(android.view.View.MeasureSpec.getSize(i), this.q), 1073741824);
        } else if (mode == 0) {
            i = android.view.View.MeasureSpec.makeMeasureSpec(this.q, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.navigation.NavigationView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.google.android.material.navigation.NavigationView.SavedState savedState = (com.google.android.material.navigation.NavigationView.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        this.g.j(savedState.a);
    }

    @Override // android.view.View
    protected final android.os.Parcelable onSaveInstanceState() {
        com.google.android.material.navigation.NavigationView.SavedState savedState = new com.google.android.material.navigation.NavigationView.SavedState(super.onSaveInstanceState());
        savedState.a = new android.os.Bundle();
        this.g.k(savedState.a);
        return savedState;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        e(i, i2);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        defpackage.agab.e(this, f);
    }

    @Override // android.view.View
    public final void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        defpackage.afuw afuwVar = this.h;
        if (afuwVar != null) {
            afuwVar.k(i);
        }
    }

    @Override // defpackage.afvt
    public final void v(mk mkVar) {
        d();
        this.y.e = mkVar;
    }

    @Override // defpackage.afvt
    public final void x(mk mkVar) {
        int i = ((defpackage.ejg) d().second).a;
        defpackage.afwd afwdVar = this.y;
        afwdVar.f(mkVar, i);
        if (this.u) {
            this.t = defpackage.afpc.b(0, this.v, afwdVar.a(mkVar.b));
            e(getWidth(), getHeight());
        }
    }

    /* JADX INFO: compiled from: PG */
    public class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new afqt(6);
        public android.os.Bundle a;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.a);
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130970109);
    }

    public NavigationView(android.content.Context context) {
        this(context, null);
    }
}
