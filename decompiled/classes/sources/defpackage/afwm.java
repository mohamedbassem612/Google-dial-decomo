package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class afwm extends android.widget.FrameLayout implements defpackage.afwp {
    private float A;
    private float B;
    private float C;
    private int D;
    private boolean E;
    private final android.widget.LinearLayout F;
    private final android.widget.FrameLayout G;
    private final android.widget.TextView H;
    private final android.widget.TextView I;
    private final android.widget.TextView J;
    private final android.widget.TextView K;
    private com.google.android.material.internal.BaselineLayout L;
    private int M;
    private int N;
    private int O;
    private int P;
    private android.content.res.ColorStateList Q;
    private boolean R;
    private android.content.res.ColorStateList S;
    private android.graphics.drawable.Drawable T;
    private android.graphics.drawable.Drawable U;
    private android.animation.ValueAnimator V;
    private boolean W;
    public boolean a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private defpackage.agab ak;
    android.graphics.drawable.Drawable b;
    public final android.widget.LinearLayout c;
    public final android.view.View d;
    public final android.widget.ImageView e;
    public final com.google.android.material.internal.BaselineLayout f;
    public final com.google.android.material.internal.BaselineLayout g;
    public defpackage.fv h;
    public float i;
    public int j;
    public int k;
    public boolean l;
    public int m;
    public defpackage.afpu n;
    public int o;
    public boolean p;
    public android.graphics.Rect q;
    private android.content.res.ColorStateList s;
    private int t;
    private int u;
    private int v;
    private int w;
    private float x;
    private float y;
    private float z;
    private static final int[] r = {android.R.attr.state_checked};
    private static final defpackage.agab ai = new defpackage.agab();
    private static final defpackage.agab aj = new defpackage.afwl();

    public afwm(android.content.Context context) {
        super(context);
        this.a = false;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.R = false;
        this.ak = ai;
        this.i = 0.0f;
        this.W = false;
        this.j = 0;
        this.aa = 0;
        this.k = -2;
        this.ab = 0;
        this.l = false;
        this.m = 0;
        this.ac = 0;
        this.ad = 0;
        this.ae = 49;
        this.af = false;
        this.p = false;
        this.ag = false;
        this.ah = false;
        this.q = new android.graphics.Rect();
        android.view.LayoutInflater.from(context).inflate(c(), (android.view.ViewGroup) this, true);
        this.F = (android.widget.LinearLayout) findViewById(2131428564);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(2131428567);
        this.c = linearLayout;
        this.d = findViewById(2131428563);
        this.G = (android.widget.FrameLayout) findViewById(2131428565);
        this.e = (android.widget.ImageView) findViewById(2131428566);
        com.google.android.material.internal.BaselineLayout baselineLayout = (com.google.android.material.internal.BaselineLayout) findViewById(2131428568);
        this.f = baselineLayout;
        android.widget.TextView textView = (android.widget.TextView) findViewById(2131428570);
        this.H = textView;
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(2131428569);
        this.I = textView2;
        float dimension = getResources().getDimension(2131165547);
        float dimension2 = getResources().getDimension(2131165546);
        com.google.android.material.internal.BaselineLayout baselineLayout2 = new com.google.android.material.internal.BaselineLayout(getContext());
        this.g = baselineLayout2;
        baselineLayout2.setVisibility(8);
        baselineLayout2.setDuplicateParentStateEnabled(true);
        baselineLayout2.a = this.ag;
        android.widget.TextView textView3 = new android.widget.TextView(getContext());
        this.J = textView3;
        textView3.setMaxLines(1);
        textView3.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView3.setDuplicateParentStateEnabled(true);
        textView3.setIncludeFontPadding(false);
        textView3.setGravity(16);
        textView3.setTextSize(dimension);
        android.widget.TextView textView4 = new android.widget.TextView(getContext());
        this.K = textView4;
        textView4.setMaxLines(1);
        textView4.setEllipsize(android.text.TextUtils.TruncateAt.END);
        textView4.setDuplicateParentStateEnabled(true);
        textView4.setVisibility(4);
        textView4.setIncludeFontPadding(false);
        textView4.setGravity(16);
        textView4.setTextSize(dimension2);
        baselineLayout2.addView(textView3);
        baselineLayout2.addView(textView4);
        this.L = baselineLayout;
        setBackgroundResource(2131231871);
        this.t = getResources().getDimensionPixelSize(b());
        this.u = baselineLayout.getPaddingBottom();
        this.v = 0;
        this.w = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        textView3.setImportantForAccessibility(2);
        textView4.setImportantForAccessibility(2);
        setFocusable(true);
        P();
        this.ab = getResources().getDimensionPixelSize(2131166777);
        linearLayout.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: afwj
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                defpackage.afwm afwmVar = this.a;
                android.widget.ImageView imageView = afwmVar.e;
                if (imageView.getVisibility() == 0 && afwmVar.O()) {
                    defpackage.afsq.g(afwmVar.n, imageView);
                }
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) afwmVar.c.getLayoutParams();
                int i9 = (i3 - i) + layoutParams.rightMargin + layoutParams.leftMargin;
                int i10 = (i4 - i2) + layoutParams.topMargin + layoutParams.bottomMargin;
                boolean z = true;
                if (afwmVar.o == 1 && afwmVar.k == -2) {
                    android.view.View view2 = afwmVar.d;
                    android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) view2.getLayoutParams();
                    if (afwmVar.k != -2 || view2.getMeasuredWidth() == i9) {
                        z = false;
                    } else {
                        layoutParams2.width = java.lang.Math.max(i9, java.lang.Math.min(afwmVar.j, afwmVar.getMeasuredWidth() - (afwmVar.m << 1)));
                    }
                    if (view2.getMeasuredHeight() < i10) {
                        layoutParams2.height = i10;
                    } else if (!z) {
                        return;
                    }
                    view2.setLayoutParams(layoutParams2);
                }
            }
        });
    }

    private final void P() {
        android.widget.TextView textView = this.I;
        float textSize = this.H.getTextSize();
        float textSize2 = textView.getTextSize();
        this.x = textSize - textSize2;
        this.y = textSize2 / textSize;
        this.z = textSize / textSize2;
        android.widget.TextView textView2 = this.K;
        float textSize3 = this.J.getTextSize();
        float textSize4 = textView2.getTextSize();
        this.A = textSize3 - textSize4;
        this.B = textSize4 / textSize3;
        this.C = textSize3 / textSize4;
    }

    private final void Q() {
        defpackage.fv fvVar = this.h;
        if (fvVar != null) {
            r(fvVar.isChecked());
        }
    }

    private final void R() {
        android.graphics.drawable.Drawable drawableA = this.b;
        boolean z = true;
        android.graphics.drawable.Drawable drawable = null;
        drawable = null;
        drawable = null;
        if (this.s != null) {
            android.graphics.drawable.Drawable background = this.d.getBackground();
            if (this.W && background != null) {
                android.content.res.ColorStateList colorStateListValueOf = this.s;
                int i = defpackage.afzc.a;
                if (colorStateListValueOf == null) {
                    colorStateListValueOf = android.content.res.ColorStateList.valueOf(0);
                }
                android.graphics.drawable.RippleDrawable rippleDrawable = new android.graphics.drawable.RippleDrawable(colorStateListValueOf, null, background);
                com.google.android.material.focus.FocusRingDrawable.c(getContext(), rippleDrawable, background instanceof defpackage.agaf ? (defpackage.agaf) background : null);
                drawable = rippleDrawable;
                z = false;
            } else if (drawableA == null) {
                drawableA = com.google.android.material.focus.FocusRingDrawable.a(getContext(), new android.graphics.drawable.RippleDrawable(defpackage.afzc.a(this.s), null, null));
            }
        }
        android.widget.FrameLayout frameLayout = this.G;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setForeground(drawable);
        setBackground(drawableA);
        aa$.ExternalSyntheticApiModelOutline0.m(this, z);
    }

    private final void S() {
        int i = this.e.getLayoutParams().width > 0 ? this.w : 0;
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.g.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i : 0;
        }
    }

    private final void T(android.view.View view, android.view.View view2, float f, float f2) {
        W(this.F, this.o == 0 ? (int) (this.t + f2) : 0, 0, this.ae);
        W(this.c, this.o == 0 ? 0 : this.q.top, this.o == 0 ? 0 : this.q.bottom, this.o == 0 ? 17 : 8388627);
        com.google.android.material.internal.BaselineLayout baselineLayout = this.f;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), this.u);
        this.L.setVisibility(0);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setVisibility(0);
        view2.setScaleX(f);
        view2.setScaleY(f);
        view2.setVisibility(4);
    }

    private final void U() {
        int i = this.t;
        W(this.F, i, i, this.o == 0 ? 17 : this.ae);
        W(this.c, 0, 0, 17);
        com.google.android.material.internal.BaselineLayout baselineLayout = this.f;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), 0);
        this.L.setVisibility(8);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    private final void V(android.widget.TextView textView, int i) {
        int iRound;
        if (this.ah) {
            textView.setTextAppearance(i);
            return;
        }
        textView.setTextAppearance(i);
        android.content.Context context = textView.getContext();
        if (i != 0) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, defpackage.ef.x);
            android.util.TypedValue typedValue = new android.util.TypedValue();
            boolean value = typedArrayObtainStyledAttributes.getValue(0, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (value) {
                int complexUnit = typedValue.getComplexUnit();
                int i2 = typedValue.data;
                iRound = complexUnit == 2 ? java.lang.Math.round(android.util.TypedValue.complexToFloat(i2) * context.getResources().getDisplayMetrics().density) : android.util.TypedValue.complexToDimensionPixelSize(i2, context.getResources().getDisplayMetrics());
            } else {
                iRound = 0;
            }
        } else {
            iRound = 0;
        }
        if (iRound != 0) {
            textView.setTextSize(0, iRound);
        }
    }

    private static void W(android.view.View view, int i, int i2, int i3) {
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    private final void X(android.view.View view) {
        if (O()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                defpackage.afpu afpuVar = this.n;
                if (afpuVar != null) {
                    if (afpuVar.c() != null) {
                        afpuVar.c().setForeground(null);
                    } else {
                        view.getOverlay().remove(afpuVar);
                    }
                }
            }
            this.n = null;
        }
    }

    private final void Y() {
        android.widget.TextView textView = this.I;
        textView.setTypeface(textView.getTypeface(), this.R ? 1 : 0);
        android.widget.TextView textView2 = this.K;
        textView2.setTypeface(textView2.getTypeface(), this.R ? 1 : 0);
    }

    private final void Z(android.widget.TextView textView, int i) {
        if (textView != null) {
            V(textView, i);
            P();
            textView.setMinimumHeight(defpackage.agab.t(textView.getContext(), i));
            android.content.res.ColorStateList colorStateList = this.Q;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            Y();
        }
    }

    private final void aa(android.widget.TextView textView, int i) {
        if (textView != null) {
            V(textView, i);
            P();
            textView.setMinimumHeight(defpackage.agab.t(textView.getContext(), i));
            android.content.res.ColorStateList colorStateList = this.Q;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    private final boolean ab() {
        return this.l && this.D == 2;
    }

    private static final void ac(android.widget.TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    public final void A(int i) {
        if (this.u != i) {
            this.u = i;
            Q();
        }
    }

    public final void B(int i) {
        if (this.t != i) {
            this.t = i;
            Q();
        }
    }

    public final void C(android.content.res.ColorStateList colorStateList) {
        this.s = colorStateList;
        R();
    }

    public final void D(boolean z) {
        this.ah = z;
        I(this.M);
        K(this.N);
        s(this.O);
        t(this.P);
    }

    public final void E(int i) {
        android.widget.TextView textView = this.H;
        textView.setMaxLines(i);
        android.widget.TextView textView2 = this.I;
        textView2.setMaxLines(i);
        this.J.setMaxLines(i);
        this.K.setMaxLines(i);
        if (android.os.Build.VERSION.SDK_INT > 34) {
            textView.setGravity(17);
            textView2.setGravity(17);
        } else if (i > 1) {
            textView.setEllipsize(null);
            textView2.setEllipsize(null);
            textView.setGravity(17);
            textView2.setGravity(17);
        } else {
            textView.setGravity(16);
            textView2.setGravity(16);
        }
        requestLayout();
    }

    public final void F(int i) {
        if (this.D != i) {
            this.D = i;
            if (ab()) {
                this.ak = aj;
            } else {
                this.ak = ai;
            }
            M(getWidth());
            Q();
        }
    }

    public final void G(boolean z) {
        this.ag = z;
        this.f.a = z;
        this.H.setIncludeFontPadding(z);
        this.I.setIncludeFontPadding(z);
        this.g.a = z;
        this.J.setIncludeFontPadding(z);
        this.K.setIncludeFontPadding(z);
        requestLayout();
    }

    public final void H(boolean z) {
        if (this.E != z) {
            this.E = z;
            Q();
        }
    }

    public final void I(int i) {
        this.M = i;
        Z(this.I, i);
    }

    public final void J(boolean z) {
        this.R = z;
        I(this.M);
        s(this.O);
        Y();
    }

    public final void K(int i) {
        this.N = i;
        aa(this.H, i);
    }

    public final void L(android.content.res.ColorStateList colorStateList) {
        this.Q = colorStateList;
        if (colorStateList != null) {
            this.H.setTextColor(colorStateList);
            this.I.setTextColor(colorStateList);
            this.J.setTextColor(colorStateList);
            this.K.setTextColor(colorStateList);
        }
    }

    public final void M(int i) {
        if (i > 0 || getVisibility() != 0) {
            int iMin = java.lang.Math.min(this.j, i - (this.m << 1));
            int iMax = this.aa;
            if (this.o == 1) {
                int measuredWidth = i - (this.ac << 1);
                int i2 = this.k;
                if (i2 != -1) {
                    measuredWidth = i2 == -2 ? this.F.getMeasuredWidth() : java.lang.Math.min(i2, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = java.lang.Math.max(this.ab, this.c.getMeasuredHeight());
            }
            android.view.View view = this.d;
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
            if (true == ab()) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = java.lang.Math.max(0, iMin);
            view.setLayoutParams(layoutParams);
        }
    }

    public final void N() {
        defpackage.fv fvVar = this.h;
        if (fvVar != null) {
            int i = 8;
            if (fvVar.isVisible() && (this.af || !this.p)) {
                i = 0;
            }
            setVisibility(i);
        }
    }

    public final boolean O() {
        return this.n != null;
    }

    @Override // defpackage.gf
    public final defpackage.fv a() {
        return this.h;
    }

    protected int b() {
        throw null;
    }

    protected abstract int c();

    public final void d() {
        X(this.e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.W) {
            this.G.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // defpackage.gf
    public final boolean e() {
        return false;
    }

    @Override // defpackage.gf
    public final void f(defpackage.fv fvVar) {
        this.h = fvVar;
        fvVar.isCheckable();
        refreshDrawableState();
        r(fvVar.isChecked());
        setEnabled(fvVar.isEnabled());
        android.graphics.drawable.Drawable icon = fvVar.getIcon();
        if (icon != this.T) {
            this.T = icon;
            if (icon != null) {
                android.graphics.drawable.Drawable.ConstantState constantState = icon.getConstantState();
                if (constantState != null) {
                    icon = constantState.newDrawable();
                }
                icon = icon.mutate();
                this.U = icon;
                android.content.res.ColorStateList colorStateList = this.S;
                if (colorStateList != null) {
                    icon.setTintList(colorStateList);
                }
            }
            this.e.setImageDrawable(icon);
        }
        java.lang.CharSequence charSequence = fvVar.d;
        this.H.setText(charSequence);
        this.I.setText(charSequence);
        this.J.setText(charSequence);
        this.K.setText(charSequence);
        defpackage.fv fvVar2 = this.h;
        if (fvVar2 == null || android.text.TextUtils.isEmpty(fvVar2.m)) {
            setContentDescription(charSequence);
        }
        defpackage.fv fvVar3 = this.h;
        if (fvVar3 != null && !android.text.TextUtils.isEmpty(fvVar3.n)) {
            charSequence = this.h.n;
        }
        aa$.ExternalSyntheticApiModelOutline0.m(this, charSequence);
        setId(fvVar.a);
        if (!android.text.TextUtils.isEmpty(fvVar.m)) {
            setContentDescription(fvVar.m);
        }
        aa$.ExternalSyntheticApiModelOutline0.m(this, !android.text.TextUtils.isEmpty(fvVar.n) ? fvVar.n : fvVar.d);
        N();
        this.a = true;
    }

    @Override // defpackage.afwp
    public final void fi(boolean z) {
        this.af = z;
        N();
    }

    public final void g(android.graphics.drawable.Drawable drawable) {
        this.d.setBackground(drawable);
        R();
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        android.widget.LinearLayout linearLayout = this.F;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        return linearLayout.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        if (this.o == 1) {
            android.widget.LinearLayout linearLayout = this.c;
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            return linearLayout.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        com.google.android.material.internal.BaselineLayout baselineLayout = this.f;
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
        int measuredWidth = layoutParams2.leftMargin + baselineLayout.getMeasuredWidth() + layoutParams2.rightMargin;
        defpackage.afpu afpuVar = this.n;
        int minimumWidth = afpuVar == null ? 0 : afpuVar.getMinimumWidth() - this.n.c.g();
        android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) this.G.getLayoutParams();
        return java.lang.Math.max(java.lang.Math.max(minimumWidth, layoutParams3.leftMargin) + this.e.getMeasuredWidth() + java.lang.Math.max(minimumWidth, layoutParams3.rightMargin), measuredWidth);
    }

    public final void h(boolean z) {
        this.W = z;
        R();
        this.d.setVisibility(true != z ? 8 : 0);
        requestLayout();
    }

    public final void i(int i) {
        this.ab = i;
        M(getWidth());
    }

    public final void j(int i) {
        this.ac = i;
        if (this.o == 1) {
            setPadding(i, 0, i, 0);
        }
        M(getWidth());
    }

    public final void k(int i) {
        this.k = i;
        M(getWidth());
    }

    public final void l(int i) {
        this.aa = i;
        M(getWidth());
    }

    public final void m(int i) {
        if (this.v != i) {
            this.v = i;
            ((android.widget.LinearLayout.LayoutParams) this.f.getLayoutParams()).topMargin = i;
            com.google.android.material.internal.BaselineLayout baselineLayout = this.g;
            if (baselineLayout.getLayoutParams() != null) {
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
                if (getLayoutDirection() == 1) {
                    i = 0;
                }
                layoutParams.leftMargin = i;
                requestLayout();
            }
        }
    }

    public final void n(int i) {
        this.m = i;
        M(getWidth());
    }

    public final void o(float f, float f2) {
        defpackage.agab agabVar = this.ak;
        android.animation.TimeInterpolator timeInterpolator = defpackage.afpc.a;
        android.view.View view = this.d;
        view.setScaleX((0.6f * f) + 0.4f);
        view.setScaleY(agabVar.a(f));
        view.setAlpha(defpackage.afpc.a(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
        this.i = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        defpackage.fv fvVar = this.h;
        if (fvVar != null && fvVar.isCheckable() && fvVar.isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, r);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        android.content.Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        defpackage.afpu afpuVar = this.n;
        if (afpuVar != null && afpuVar.isVisible()) {
            defpackage.fv fvVar = this.h;
            java.lang.CharSequence charSequence = fvVar.d;
            if (!android.text.TextUtils.isEmpty(fvVar.m)) {
                charSequence = this.h.m;
            }
            java.lang.String strValueOf = java.lang.String.valueOf(charSequence);
            defpackage.afpu afpuVar2 = this.n;
            java.lang.Object quantityString = null;
            if (afpuVar2.isVisible()) {
                if (afpuVar2.l()) {
                    quantityString = afpuVar2.c.b.o;
                    if (quantityString == null) {
                        quantityString = afpuVar2.d();
                    }
                } else if (afpuVar2.k()) {
                    afpv afpvVar = afpuVar2.c;
                    if (afpvVar.f() != 0 && (context = (android.content.Context) afpuVar2.a.get()) != null) {
                        int i = afpuVar2.d;
                        quantityString = (i == -2 || afpuVar2.b() <= i) ? context.getResources().getQuantityString(afpvVar.f(), afpuVar2.b(), java.lang.Integer.valueOf(afpuVar2.b())) : context.getString(afpvVar.b.r, java.lang.Integer.valueOf(i));
                    }
                } else {
                    quantityString = afpuVar2.c.b.p;
                }
            }
            accessibilityNodeInfo.setContentDescription(strValueOf + ", " + java.lang.String.valueOf(quantityString));
        }
        ebd ebdVar = new ebd(accessibilityNodeInfo);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i2 = 0;
        for (int i3 = 0; i3 < iIndexOfChild; i3++) {
            android.view.View childAt = viewGroup.getChildAt(i3);
            if ((childAt instanceof defpackage.afwm) && childAt.getVisibility() == 0) {
                i2++;
            }
        }
        ebdVar.v(ni.r(0, 1, i2, 1, false, isSelected()));
        if (isSelected()) {
            ebdVar.t(false);
            ebdVar.ad(ebc.c);
        }
        ebdVar.L(getResources().getString(2132019136));
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new defpackage.kjo(this, i, 3));
    }

    public final void p(int i) {
        this.j = i;
        M(getWidth());
    }

    public final void q(defpackage.afpu afpuVar) {
        android.widget.ImageView imageView;
        if (this.n != afpuVar) {
            if (O() && (imageView = this.e) != null) {
                android.util.Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
                X(imageView);
            }
            this.n = afpuVar;
            int i = this.ad;
            afpv afpvVar = afpuVar.c;
            if (afpvVar.l != i) {
                afpvVar.l = i;
                afpuVar.j();
            }
            android.widget.ImageView imageView2 = this.e;
            if (imageView2 == null || !O()) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            defpackage.afpu afpuVar2 = this.n;
            defpackage.afsq.g(afpuVar2, imageView2);
            if (afpuVar2.c() != null) {
                afpuVar2.c().setForeground(afpuVar2);
            } else {
                imageView2.getOverlay().add(afpuVar2);
            }
        }
    }

    public final void r(boolean z) {
        android.widget.TextView textView = this.I;
        ac(textView);
        android.widget.TextView textView2 = this.H;
        ac(textView2);
        android.widget.TextView textView3 = this.K;
        ac(textView3);
        android.widget.TextView textView4 = this.J;
        ac(textView4);
        boolean z2 = this.W;
        float f = true != z ? 0.0f : 1.0f;
        if (z2 && this.a && isAttachedToWindow()) {
            android.animation.ValueAnimator valueAnimator = this.V;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.V = null;
            }
            android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(this.i, f);
            this.V = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new afwk(this, f));
            this.V.setInterpolator(defpackage.agab.C(getContext(), 2130970071, defpackage.afpc.b));
            this.V.setDuration(defpackage.agab.v(getContext().getTheme(), 2130970055, getResources().getInteger(2131492995)));
            this.V.start();
        } else {
            o(f, f);
        }
        float f2 = this.x;
        float f3 = this.y;
        float f4 = this.z;
        if (this.o == 1) {
            f2 = this.A;
            f3 = this.B;
            f4 = this.C;
            textView = textView3;
            textView2 = textView4;
        }
        int i = this.D;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        U();
                    }
                } else if (z) {
                    T(textView, textView2, f3, f2);
                    z = true;
                } else {
                    T(textView2, textView, f4, 0.0f);
                    z = false;
                }
            } else if (z) {
                T(textView, textView2, f3, 0.0f);
                z = true;
            } else {
                U();
                z = false;
            }
        } else if (this.E) {
            if (z) {
                T(textView, textView2, f3, 0.0f);
                z = true;
            } else {
                U();
                z = false;
            }
        } else if (z) {
            T(textView, textView2, f3, f2);
            z = true;
        } else {
            T(textView2, textView, f4, 0.0f);
            z = false;
        }
        refreshDrawableState();
        setSelected(z);
    }

    public final void s(int i) {
        this.O = i;
        if (i == 0) {
            i = this.M;
        }
        Z(this.K, i);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.H.setEnabled(z);
        this.I.setEnabled(z);
        this.J.setEnabled(z);
        this.K.setEnabled(z);
        this.e.setEnabled(z);
    }

    public final void t(int i) {
        this.P = i;
        if (i == 0) {
            i = this.N;
        }
        aa(this.J, i);
    }

    public final void u(int i) {
        if (this.w != i) {
            this.w = i;
            S();
            requestLayout();
        }
    }

    public final void v(int i) {
        android.widget.ImageView imageView = this.e;
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
        S();
    }

    public final void w(android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable;
        this.S = colorStateList;
        if (this.h == null || (drawable = this.U) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.U.invalidateSelf();
    }

    public final void x(int i) {
        android.graphics.drawable.Drawable drawable = i == 0 ? null : getContext().getDrawable(i);
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.b = drawable;
        R();
    }

    public final void y(int i) {
        this.ae = i;
        requestLayout();
    }

    public final void z(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.o != i) {
            this.o = i;
            this.ad = 0;
            com.google.android.material.internal.BaselineLayout baselineLayout = this.f;
            this.L = baselineLayout;
            int i8 = 8;
            if (i == 1) {
                com.google.android.material.internal.BaselineLayout baselineLayout2 = this.g;
                if (baselineLayout2.getParent() == null) {
                    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    this.c.addView(baselineLayout2, layoutParams);
                    S();
                }
                i3 = this.q.left;
                i4 = this.q.right;
                i5 = this.q.top;
                i6 = this.q.bottom;
                this.ad = 1;
                i2 = this.ac;
                this.L = baselineLayout2;
                i7 = 0;
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i7 = 8;
                i8 = 0;
            }
            baselineLayout.setVisibility(i8);
            this.g.setVisibility(i7);
            ((android.widget.FrameLayout.LayoutParams) this.F.getLayoutParams()).gravity = this.ae;
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) this.c.getLayoutParams();
            layoutParams2.leftMargin = i3;
            layoutParams2.rightMargin = i4;
            layoutParams2.topMargin = i5;
            layoutParams2.bottomMargin = i6;
            setPadding(i2, 0, i2, 0);
            M(getWidth());
            R();
        }
    }
}
