package com.google.android.material.bottomsheet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class BottomSheetBehavior extends dum implements afvt {
    int A;
    public int B;
    public java.lang.ref.WeakReference C;
    java.lang.ref.WeakReference D;
    java.lang.ref.WeakReference E;
    final java.util.List F;
    defpackage.afvy G;
    public int H;
    public java.lang.ref.WeakReference I;
    public boolean J;
    final android.util.SparseIntArray K;
    final android.util.SparseIntArray L;
    final android.util.SparseIntArray M;
    private int N;
    private float O;
    private boolean P;
    private int Q;
    private int R;
    private android.content.res.ColorStateList S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private agal X;
    private boolean Y;
    private final defpackage.afqu Z;
    public boolean a;
    private android.animation.ValueAnimator aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private int af;
    private boolean ag;
    private final float ah;
    private int ai;
    private final java.util.ArrayList aj;
    private android.view.VelocityTracker ak;
    private int al;
    private java.util.Map am;
    private final android.graphics.Rect an;
    private final ecl ao;
    public int b;
    public boolean c;
    public int d;
    public agaf e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    int p;
    public int q;
    public int r;
    float s;
    public int t;
    float u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public ecm z;

    public BottomSheetBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.N = 0;
        this.a = true;
        this.f = -1;
        this.T = -1;
        this.Z = new defpackage.afqu(this);
        this.s = 0.5f;
        this.u = -1.0f;
        this.x = true;
        this.ab = true;
        this.ad = true;
        this.y = 4;
        this.ah = 0.1f;
        this.F = new java.util.ArrayList();
        this.aj = new java.util.ArrayList();
        this.al = -1;
        this.K = new android.util.SparseIntArray();
        this.L = new android.util.SparseIntArray();
        this.M = new android.util.SparseIntArray();
        this.an = new android.graphics.Rect();
        this.ao = new defpackage.afqq(this);
        this.R = context.getResources().getDimensionPixelSize(2131167139);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.afre.a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.S = agab.o(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            this.X = new agal(agal.m(context, attributeSet, 2130968754, 2132085319));
        }
        if (this.X != null) {
            agaf agafVar = new agaf(this.X);
            this.e = agafVar;
            agafVar.N(context);
            android.content.res.ColorStateList colorStateList = this.S;
            if (colorStateList != null) {
                this.e.R(colorStateList);
            } else {
                android.util.TypedValue typedValue = new android.util.TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.e.setTint(typedValue.data);
            }
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(E(), 1.0f);
        this.aa = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.aa.addUpdateListener(new defpackage.afvi(this, 1));
        this.u = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        android.util.TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(12);
        if (typedValuePeekValue == null || typedValuePeekValue.data != -1) {
            C(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            C(typedValuePeekValue.data);
        }
        s(typedArrayObtainStyledAttributes.getBoolean(10, false));
        this.U = typedArrayObtainStyledAttributes.getBoolean(16, false);
        r(typedArrayObtainStyledAttributes.getBoolean(8, true));
        this.w = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.x = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.ab = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.N = typedArrayObtainStyledAttributes.getInt(13, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(9, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw new java.lang.IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.s = f;
        if (this.C != null) {
            J();
        }
        android.util.TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(7);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            q(typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0));
        } else {
            q(typedValuePeekValue2.data);
        }
        this.b = typedArrayObtainStyledAttributes.getInt(14, 500);
        this.c = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.ad = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.h = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.i = typedArrayObtainStyledAttributes.getBoolean(21, false);
        this.j = typedArrayObtainStyledAttributes.getBoolean(22, false);
        this.V = typedArrayObtainStyledAttributes.getBoolean(23, true);
        this.k = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.l = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.m = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.W = typedArrayObtainStyledAttributes.getBoolean(26, true);
        typedArrayObtainStyledAttributes.recycle();
        this.O = android.view.ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private final float E() {
        java.lang.ref.WeakReference weakReference;
        android.view.WindowInsets rootWindowInsets;
        if (this.e != null && (weakReference = this.C) != null && weakReference.get() != null && android.os.Build.VERSION.SDK_INT >= 31) {
            android.view.View view = (android.view.View) this.C.get();
            if (R() && (rootWindowInsets = view.getRootWindowInsets()) != null) {
                return java.lang.Math.max(U(this.e.B(), rootWindowInsets.getRoundedCorner(0)), U(this.e.C(), rootWindowInsets.getRoundedCorner(1)));
            }
        }
        return 0.0f;
    }

    private final int F(android.view.View view, int i, int i2) {
        return dzs.a(view, view.getResources().getString(i), new defpackage.afqr(this, i2));
    }

    private final int G() {
        int iMin;
        int i;
        int i2;
        if (this.P) {
            iMin = java.lang.Math.min(java.lang.Math.max(this.Q, this.B - ((this.A * 9) / 16)), this.ai);
            i = this.n;
        } else {
            if (!this.U && !this.h && (i2 = this.g) > 0) {
                return java.lang.Math.max(this.d, i2 + this.R);
            }
            iMin = this.d;
            i = this.n;
        }
        return iMin + i;
    }

    private final int H(int i) {
        if (i == 3) {
            return e();
        }
        if (i == 4) {
            return this.t;
        }
        if (i == 5) {
            return this.B;
        }
        if (i == 6) {
            return this.r;
        }
        throw new java.lang.IllegalArgumentException(a.bj(i, "Invalid state to get top offset: "));
    }

    private final void I() {
        int iG = G();
        boolean z = this.a;
        int i = this.B - iG;
        if (z) {
            this.t = java.lang.Math.max(i, this.q);
        } else {
            this.t = i;
        }
    }

    private final void J() {
        this.r = (int) (this.B * (1.0f - this.s));
    }

    private final void K(android.view.View view, int i) {
        if (view != null) {
            dzs.g(view, 1048576);
            dzs.g(view, 524288);
            dzs.g(view, 262144);
            android.util.SparseIntArray sparseIntArray = this.L;
            int i2 = sparseIntArray.get(i, -1);
            if (i2 != -1) {
                dzs.g(view, i2);
                sparseIntArray.delete(i);
            }
            android.util.SparseIntArray sparseIntArray2 = this.K;
            int i3 = sparseIntArray2.get(i, -1);
            if (i3 != -1) {
                dzs.g(view, i3);
                sparseIntArray2.delete(i);
            }
            android.util.SparseIntArray sparseIntArray3 = this.M;
            int i4 = sparseIntArray3.get(i, -1);
            if (i4 != -1) {
                dzs.g(view, i4);
                sparseIntArray3.delete(i);
            }
        }
    }

    private final void L() {
        this.H = -1;
        this.al = -1;
        this.I = null;
        android.view.VelocityTracker velocityTracker = this.ak;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ak = null;
        }
    }

    private final void M() {
        if (this.C != null) {
            if (!A()) {
                N((android.view.View) this.C.get(), 0);
            } else {
                N((android.view.View) this.D.get(), 1);
                K((android.view.View) this.C.get(), 0);
            }
        }
    }

    private final void N(android.view.View view, int i) {
        if (view != null) {
            K(view, i);
            if (!this.a && this.y != 6) {
                this.K.put(i, F(view, 2132017601, 6));
            }
            if (this.v && this.y != 5) {
                dzs.h(view, ebc.k, (java.lang.CharSequence) null, new defpackage.afqr(this, 5));
            }
            int i2 = this.y;
            if (i2 == 3) {
                if (z()) {
                    this.M.put(i, F(view, 2132017597, 4));
                }
            } else if (i2 == 4) {
                this.L.put(i, F(view, 2132017599, 3));
            } else if (i2 == 6) {
                if (z()) {
                    this.M.put(i, F(view, 2132017597, 4));
                }
                this.L.put(i, F(view, 2132017599, 3));
            }
        }
    }

    private final void O(int i, boolean z) {
        android.animation.ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z2 = this.y == 3 && (this.W || R());
            if (this.Y == z2 || this.e == null) {
                return;
            }
            this.Y = z2;
            if (!z || (valueAnimator = this.aa) == null) {
                android.animation.ValueAnimator valueAnimator2 = this.aa;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.aa.cancel();
                }
                this.e.S(this.Y ? E() : 1.0f);
                return;
            }
            if (valueAnimator.isRunning()) {
                this.aa.reverse();
            } else {
                this.aa.setFloatValues(this.e.q.k, z2 ? E() : 1.0f);
                this.aa.start();
            }
        }
    }

    private final void P(boolean z) {
        java.lang.ref.WeakReference weakReference = this.C;
        if (weakReference != null) {
            androidx.coordinatorlayout.widget.CoordinatorLayout parent = ((android.view.View) weakReference.get()).getParent();
            if (parent instanceof androidx.coordinatorlayout.widget.CoordinatorLayout) {
                androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.am != null) {
                        return;
                    } else {
                        this.am = new java.util.HashMap(childCount);
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    android.view.View childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.C.get() && z) {
                        this.am.put(childAt, java.lang.Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (z) {
                    return;
                }
                this.am = null;
            }
        }
    }

    private final boolean Q() {
        java.util.Iterator it = this.F.iterator();
        while (it.hasNext()) {
            if (((java.lang.ref.WeakReference) it.next()).get() != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean R() {
        java.lang.ref.WeakReference weakReference = this.C;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((android.view.View) this.C.get()).getLocationOnScreen(iArr);
        return iArr[1] == 0;
    }

    private final boolean S(android.view.View view) {
        java.util.Iterator it = this.F.iterator();
        while (it.hasNext()) {
            if (((java.lang.ref.WeakReference) it.next()).get() == view) {
                return true;
            }
        }
        return false;
    }

    private final boolean T() {
        if (this.z != null) {
            return this.x || this.y == 1;
        }
        return false;
    }

    private static final float U(float f, android.view.RoundedCorner roundedCorner) {
        if (roundedCorner == null) {
            return 0.0f;
        }
        float radius = roundedCorner.getRadius();
        if (radius <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return radius / f;
    }

    private static final int V(int i, int i2, int i3, int i4) {
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = android.view.View.MeasureSpec.getMode(childMeasureSpec);
        int size = android.view.View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = java.lang.Math.min(size, i3);
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public static com.google.android.material.bottomsheet.BottomSheetBehavior h(android.view.View view) {
        dup layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof dup)) {
            throw new java.lang.IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        dum dumVar = layoutParams.a;
        if (dumVar instanceof com.google.android.material.bottomsheet.BottomSheetBehavior) {
            return (com.google.android.material.bottomsheet.BottomSheetBehavior) dumVar;
        }
        throw new java.lang.IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public final boolean A() {
        java.lang.ref.WeakReference weakReference = this.D;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public final boolean B(android.view.View view, float f) {
        if (this.w) {
            return true;
        }
        if (view.getTop() >= this.t) {
            if (java.lang.Math.abs((view.getTop() + (f * this.ah)) - this.t) / G() > 0.5f) {
                return true;
            }
        }
        return false;
    }

    public final void C(int i) {
        boolean z = this.P;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.P = true;
            }
        } else {
            if (!z && this.d == i) {
                return;
            }
            this.P = false;
            this.d = java.lang.Math.max(0, i);
        }
        D();
    }

    public final void D() {
        android.view.View view;
        if (this.C != null) {
            I();
            if (this.y != 4 || (view = (android.view.View) this.C.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    public final int e() {
        if (this.a) {
            return this.q;
        }
        return java.lang.Math.max(this.p, this.V ? 0 : this.o);
    }

    final android.view.View f(android.view.View view) {
        if (view.getVisibility() == 0) {
            if (view.isNestedScrollingEnabled()) {
                return view;
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    android.view.View viewF = f(viewGroup.getChildAt(i));
                    if (viewF != null) {
                        return viewF;
                    }
                }
            }
        }
        return null;
    }

    public final android.view.View g() {
        java.util.List list = this.F;
        if (list.isEmpty()) {
            return null;
        }
        return (android.view.View) ((java.lang.ref.WeakReference) list.get(0)).get();
    }

    public final void i(defpackage.afqs afqsVar) {
        java.util.ArrayList arrayList = this.aj;
        if (arrayList.contains(afqsVar)) {
            return;
        }
        arrayList.add(afqsVar);
    }

    public final void j() {
        defpackage.afvy afvyVar = this.G;
        if (afvyVar != null) {
            afvyVar.f();
        }
    }

    public final void k(int i) {
        android.view.View view = (android.view.View) this.C.get();
        if (view != null) {
            java.util.ArrayList arrayList = this.aj;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.t;
            if (i <= i2 && i2 != e()) {
                e();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((defpackage.afqs) arrayList.get(i3)).b(view);
            }
        }
    }

    public final void l() {
        defpackage.afvy afvyVar = this.G;
        if (afvyVar != null) {
            mk mkVarC = afvyVar.c();
            if (mkVarC == null || android.os.Build.VERSION.SDK_INT < 34) {
                t(true == this.v ? 5 : 4);
                return;
            }
            boolean z = this.v;
            defpackage.afvy afvyVar2 = this.G;
            if (!z) {
                android.animation.Animator animatorE = afvyVar2.e();
                animatorE.setDuration(afpc.b(afvyVar2.b, afvyVar2.c, mkVarC.b));
                animatorE.start();
                t(4);
                return;
            }
            defpackage.afqo afqoVar = new defpackage.afqo(this);
            android.view.View view = afvyVar2.a;
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, view.getHeight() * view.getScaleY());
            objectAnimatorOfFloat.setInterpolator(new emd());
            objectAnimatorOfFloat.setDuration(afpc.b(afvyVar2.b, afvyVar2.c, mkVarC.b));
            objectAnimatorOfFloat.addListener(new defpackage.afvx(afvyVar2));
            objectAnimatorOfFloat.addListener(afqoVar);
            objectAnimatorOfFloat.start();
        }
    }

    final void m(android.view.View view) {
        if (view.getVisibility() == 0) {
            if (view.isNestedScrollingEnabled()) {
                this.F.add(new java.lang.ref.WeakReference(view));
                return;
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m(viewGroup.getChildAt(i));
                }
            }
        }
    }

    public final void n(defpackage.afqs afqsVar) {
        this.aj.remove(afqsVar);
    }

    final void o(android.view.View view) {
        java.lang.ref.WeakReference weakReference;
        if (view != null || (weakReference = this.D) == null) {
            this.D = new java.lang.ref.WeakReference(view);
            M();
        } else {
            K((android.view.View) weakReference.get(), 1);
            this.D = null;
            M();
        }
    }

    public final void onAttachedToLayoutParams(dup dupVar) {
        this.C = null;
        this.z = null;
        this.G = null;
    }

    public final void onDetachedFromLayoutParams() {
        this.C = null;
        this.z = null;
        this.G = null;
    }

    public final boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.View view2;
        android.view.View viewG;
        int i;
        java.lang.ref.WeakReference weakReference;
        ecm ecmVar;
        if (view.isShown() && this.x) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                L();
                actionMasked = 0;
            }
            android.view.VelocityTracker velocityTrackerObtain = this.ak;
            if (velocityTrackerObtain == null) {
                velocityTrackerObtain = android.view.VelocityTracker.obtain();
                this.ak = velocityTrackerObtain;
            }
            velocityTrackerObtain.addMovement(motionEvent);
            if (actionMasked == 0) {
                int x = (int) motionEvent.getX();
                this.al = (int) motionEvent.getY();
                int x2 = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                java.util.List list = this.F;
                if (!list.isEmpty()) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            view2 = null;
                            break;
                        }
                        view2 = (android.view.View) ((java.lang.ref.WeakReference) it.next()).get();
                        if (view2 != null && coordinatorLayout.l(view2, x2, y)) {
                            break;
                        }
                    }
                } else {
                    view2 = null;
                    break;
                }
                java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(view2);
                this.I = weakReference2;
                if (this.y != 2 && weakReference2.get() != null) {
                    this.H = motionEvent.getPointerId(motionEvent.getActionIndex());
                    int i2 = this.al;
                    java.lang.ref.WeakReference weakReference3 = this.E;
                    android.view.View view3 = weakReference3 != null ? (android.view.View) weakReference3.get() : null;
                    if (view3 == null || !coordinatorLayout.l(view3, x, i2)) {
                        this.J = true;
                    }
                }
                this.ae = this.H == -1 && !coordinatorLayout.l(view, x, this.al);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.J = false;
                this.I = null;
                this.H = -1;
                if (this.ae) {
                    this.ae = false;
                }
            }
            if (!this.ae && (ecmVar = this.z) != null && ecmVar.i(motionEvent)) {
                return true;
            }
            if (actionMasked == 2 && Q() && !this.ae && this.y != 1 && (!this.c ? (viewG = g()) == null || !coordinatorLayout.l(viewG, (int) motionEvent.getX(), (int) motionEvent.getY()) : (weakReference = this.I) == null || weakReference.get() == null) && this.z != null && (i = this.al) != -1) {
                if (java.lang.Math.abs(i - motionEvent.getY()) > this.z.b) {
                    return true;
                }
            }
        } else {
            this.ae = true;
        }
        return false;
    }

    public final boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.C == null) {
            this.Q = coordinatorLayout.getResources().getDimensionPixelSize(2131165563);
            boolean z = (this.U || this.P) ? false : true;
            if (this.h || this.i || this.j || this.k || this.l || this.m) {
                agab.J(view, new defpackage.afqp(this, z));
            } else if (z) {
                z = true;
                agab.J(view, new defpackage.afqp(this, z));
            }
            afrd afrdVar = new afrd(view);
            int i3 = dzs.a;
            eae.a(view, afrdVar);
            this.C = new java.lang.ref.WeakReference(view);
            this.G = new defpackage.afvy(view);
            agaf agafVar = this.e;
            if (agafVar != null) {
                view.setBackground(agafVar);
                agaf agafVar2 = this.e;
                float elevation = this.u;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                agafVar2.Q(elevation);
            } else {
                android.content.res.ColorStateList colorStateList = this.S;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            M();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.z == null) {
            this.z = ecm.b(coordinatorLayout, this.ao);
        }
        int top = view.getTop();
        coordinatorLayout.j(view, i);
        this.A = coordinatorLayout.getWidth();
        this.B = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.ai = height;
        int i4 = this.B;
        int i5 = i4 - height;
        int i6 = this.o;
        if (i5 < i6) {
            boolean z2 = this.V;
            int i7 = this.T;
            if (z2) {
                height = i7 == -1 ? i4 : java.lang.Math.min(i4, i7);
                this.ai = height;
            } else {
                int i8 = i4 - i6;
                height = i7 != -1 ? java.lang.Math.min(i8, i7) : i8;
                this.ai = height;
            }
        }
        this.q = java.lang.Math.max(0, this.B - height);
        J();
        I();
        int i9 = this.y;
        if (i9 == 3) {
            int iE = e();
            int i10 = dzs.a;
            view.offsetTopAndBottom(iE);
        } else if (i9 == 6) {
            int i11 = this.r;
            int i12 = dzs.a;
            view.offsetTopAndBottom(i11);
        } else if (this.v && i9 == 5) {
            int i13 = this.B;
            int i14 = dzs.a;
            view.offsetTopAndBottom(i13);
        } else if (i9 == 4) {
            int i15 = this.t;
            int i16 = dzs.a;
            view.offsetTopAndBottom(i15);
        } else if (i9 == 1 || i9 == 2) {
            int top2 = top - view.getTop();
            int i17 = dzs.a;
            view.offsetTopAndBottom(top2);
        }
        O(this.y, false);
        java.util.List list = this.F;
        list.clear();
        if (this.c) {
            m(view);
        } else {
            list.add(new java.lang.ref.WeakReference(f(view)));
        }
        while (true) {
            java.util.ArrayList arrayList = this.aj;
            if (i2 >= arrayList.size()) {
                return true;
            }
            ((defpackage.afqs) arrayList.get(i2)).c(view);
            i2++;
        }
    }

    public final boolean onMeasureChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3, int i4) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(V(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f, marginLayoutParams.width), V(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.T, marginLayoutParams.height));
        return true;
    }

    public final boolean onNestedPreFling(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, float f, float f2) {
        return Q() && S(view2) && this.y != 3 && !this.ac;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r4 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, int r5, int r6, int[] r7, int r8) {
        /*
            r1 = this;
            r2 = 1
            if (r8 == r2) goto L92
            boolean r5 = r1.S(r4)
            if (r5 == 0) goto L92
            int r5 = r3.getTop()
            int r8 = r5 - r6
            if (r6 <= 0) goto L47
            boolean r0 = r1.ag
            if (r0 != 0) goto L1f
            boolean r0 = r1.ab
            if (r0 != 0) goto L1f
            boolean r4 = r4.canScrollVertically(r2)
            if (r4 != 0) goto L58
        L1f:
            int r4 = r1.e()
            if (r8 >= r4) goto L37
            int r4 = r1.e()
            int r5 = r5 - r4
            r7[r2] = r5
            int r4 = dzs.a
            int r4 = -r5
            r3.offsetTopAndBottom(r4)
            r4 = 3
            r1.u(r4)
            goto L84
        L37:
            boolean r4 = r1.x
            if (r4 == 0) goto L92
            r7[r2] = r6
            int r4 = -r6
            int r5 = dzs.a
            r3.offsetTopAndBottom(r4)
            r1.u(r2)
            goto L84
        L47:
            if (r6 >= 0) goto L84
            r0 = -1
            boolean r4 = r4.canScrollVertically(r0)
            boolean r0 = r1.ag
            if (r0 != 0) goto L5b
            boolean r0 = r1.ab
            if (r0 != 0) goto L5b
            if (r4 == 0) goto L5d
        L58:
            r1.ac = r2
            goto L92
        L5b:
            if (r4 != 0) goto L84
        L5d:
            int r4 = r1.t
            if (r8 <= r4) goto L75
            boolean r8 = r1.y()
            if (r8 != 0) goto L75
            int r5 = r5 - r4
            r7[r2] = r5
            int r4 = dzs.a
            int r4 = -r5
            r3.offsetTopAndBottom(r4)
            r4 = 4
            r1.u(r4)
            goto L84
        L75:
            boolean r4 = r1.x
            if (r4 == 0) goto L92
            r7[r2] = r6
            int r4 = -r6
            int r5 = dzs.a
            r3.offsetTopAndBottom(r4)
            r1.u(r2)
        L84:
            int r3 = r3.getTop()
            r1.k(r3)
            r1.af = r6
            r1.ag = r2
            r2 = 0
            r1.ac = r2
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int, int[], int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r4.bottom <= r2.bottom) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onRequestChildRectangleOnScreen(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.graphics.Rect r4, boolean r5) {
        /*
            r1 = this;
            boolean r2 = r1.ad
            if (r2 == 0) goto L41
            boolean r2 = r3.isInTouchMode()
            if (r2 != 0) goto L41
            int r2 = r1.y
            r5 = 4
            if (r2 == r5) goto L12
            r5 = 6
            if (r2 != r5) goto L41
        L12:
            android.graphics.Rect r2 = r1.an
            boolean r5 = r3.getLocalVisibleRect(r2)
            if (r5 == 0) goto L3b
            int r5 = dzs.a
            eax r3 = dzl.a(r3)
            if (r3 == 0) goto L2f
            int r5 = r2.bottom
            r0 = 519(0x207, float:7.27E-43)
            dwn r3 = r3.f(r0)
            int r3 = r3.e
            int r5 = r5 - r3
            r2.bottom = r5
        L2f:
            int r3 = r4.top
            int r5 = r2.top
            if (r3 < r5) goto L3b
            int r3 = r4.bottom
            int r2 = r2.bottom
            if (r3 <= r2) goto L41
        L3b:
            r2 = 3
            r1.t(r2)
            r1 = 1
            goto L42
        L41:
            r1 = 0
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.onRequestChildRectangleOnScreen(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.graphics.Rect, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onRestoreInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.os.Parcelable parcelable) {
        com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState savedState = (com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState) parcelable;
        android.os.Parcelable parcelable2 = ((androidx.customview.view.AbsSavedState) savedState).d;
        int i = this.N;
        int i2 = 4;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.d = savedState.b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.a = savedState.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.v = savedState.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.w = savedState.g;
            }
        }
        int i3 = savedState.a;
        if (i3 != 1 && i3 != 2) {
            i2 = i3;
        }
        this.y = i2;
    }

    public final android.os.Parcelable onSaveInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
        return new com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState(super.onSaveInstanceState(coordinatorLayout, view), this);
    }

    public final boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i, int i2) {
        this.af = 0;
        this.ag = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x007b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0089  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    public final void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i) {
        int top;
        int top2;
        int i2;
        int i3;
        float yVelocity;
        int i4 = 3;
        if (view.getTop() == e()) {
            u(3);
            return;
        }
        if (S(view2) && this.ag) {
            if (this.af > 0) {
                if (!this.a && view.getTop() > this.r) {
                    i4 = 6;
                }
            } else if (this.v) {
                android.view.VelocityTracker velocityTracker = this.ak;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.O);
                    yVelocity = this.ak.getYVelocity(this.H);
                }
                if (B(view, yVelocity)) {
                    i4 = 5;
                } else if (this.af == 0) {
                    top2 = view.getTop();
                    if (this.a) {
                        i2 = this.r;
                        i3 = this.t;
                        if (top2 < i2) {
                            if (top2 >= java.lang.Math.abs(top2 - i3)) {
                            }
                        } else if (java.lang.Math.abs(top2 - i2) < java.lang.Math.abs(top2 - i3)) {
                            i4 = 4;
                        }
                        i4 = 6;
                    } else if (java.lang.Math.abs(top2 - this.q) >= java.lang.Math.abs(top2 - this.t)) {
                        i4 = 4;
                    }
                } else {
                    if (!this.a) {
                        top = view.getTop();
                        if (java.lang.Math.abs(top - this.r) < java.lang.Math.abs(top - this.t)) {
                            i4 = 6;
                        }
                    }
                    i4 = 4;
                }
            } else if (this.af == 0) {
                top2 = view.getTop();
                if (this.a) {
                    i2 = this.r;
                    i3 = this.t;
                    if (top2 < i2) {
                        if (top2 >= java.lang.Math.abs(top2 - i3)) {
                        }
                    } else if (java.lang.Math.abs(top2 - i2) < java.lang.Math.abs(top2 - i3)) {
                        i4 = 4;
                    }
                    i4 = 6;
                } else if (java.lang.Math.abs(top2 - this.q) >= java.lang.Math.abs(top2 - this.t)) {
                    i4 = 4;
                }
            } else {
                if (!this.a) {
                    top = view.getTop();
                    if (java.lang.Math.abs(top - this.r) < java.lang.Math.abs(top - this.t)) {
                        i4 = 6;
                    }
                }
                i4 = 4;
            }
            w(view, i4, false);
            this.ag = false;
        }
    }

    public final boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.y != 1 || actionMasked != 0) {
            if (T()) {
                this.z.e(motionEvent);
            }
            if (actionMasked == 0) {
                L();
            }
            android.view.VelocityTracker velocityTrackerObtain = this.ak;
            if (velocityTrackerObtain == null) {
                velocityTrackerObtain = android.view.VelocityTracker.obtain();
                this.ak = velocityTrackerObtain;
            }
            velocityTrackerObtain.addMovement(motionEvent);
            if (T() && actionMasked == 2 && !this.ae) {
                float fAbs = java.lang.Math.abs(this.al - motionEvent.getY());
                ecm ecmVar = this.z;
                if (fAbs > ecmVar.b) {
                    ecmVar.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
                }
            }
            if (this.ae) {
                return false;
            }
        }
        return true;
    }

    final void p(com.google.android.material.bottomsheet.BottomSheetDragHandleView bottomSheetDragHandleView) {
        this.E = bottomSheetDragHandleView != null ? new java.lang.ref.WeakReference(bottomSheetDragHandleView) : null;
    }

    public final void q(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.p = i;
        O(this.y, true);
    }

    public final void r(boolean z) {
        if (this.a != z) {
            this.a = z;
            if (this.C != null) {
                I();
            }
            u((this.a && this.y == 6) ? 3 : this.y);
            O(this.y, true);
            M();
        }
    }

    public final void s(boolean z) {
        if (this.v != z) {
            this.v = z;
            if (!z && this.y == 5) {
                t(4);
            }
            M();
        }
    }

    public final void t(int i) {
        if (i == 1 || i == 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("STATE_");
            sb.append(i == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (!this.v && i == 5) {
            android.util.Log.w("BottomSheetBehavior", "Cannot set state: 5");
            return;
        }
        int i2 = (i == 6 && this.a && H(6) <= this.q) ? 3 : i;
        java.lang.ref.WeakReference weakReference = this.C;
        if (weakReference == null || weakReference.get() == null) {
            u(i);
            return;
        }
        android.view.View view = (android.view.View) this.C.get();
        mo moVar = new mo(this, view, i2, 13);
        android.view.ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(moVar);
        } else {
            moVar.run();
        }
    }

    public final void u(int i) {
        android.view.View view;
        if (this.y == i) {
            return;
        }
        this.y = i;
        int i2 = 4;
        if (i != 4 && i != 3 && i != 6 && this.v && i == 5) {
            i = 5;
        }
        java.lang.ref.WeakReference weakReference = this.C;
        if (weakReference == null || (view = (android.view.View) weakReference.get()) == null) {
            return;
        }
        int i3 = 0;
        if (i == 3) {
            P(true);
        } else {
            if (i == 6 || i == 5) {
                i2 = i;
            } else if (i == 4) {
            }
            P(false);
            i = i2;
        }
        O(i, true);
        while (true) {
            java.util.ArrayList arrayList = this.aj;
            if (i3 >= arrayList.size()) {
                M();
                return;
            } else {
                ((defpackage.afqs) arrayList.get(i3)).a(view, i);
                i3++;
            }
        }
    }

    public final void v(mk mkVar) {
        defpackage.afvy afvyVar = this.G;
        if (afvyVar != null) {
            ((afvs) afvyVar).e = mkVar;
        }
    }

    public final void w(android.view.View view, int i, boolean z) {
        int iH = H(i);
        ecm ecmVar = this.z;
        if (ecmVar == null || (!z ? ecmVar.j(view, view.getLeft(), iH) : ecmVar.h(view.getLeft(), iH))) {
            u(i);
            return;
        }
        u(2);
        O(i, true);
        this.Z.a(i);
    }

    public final void x(mk mkVar) {
        defpackage.afvy afvyVar = this.G;
        if (afvyVar != null) {
            afvyVar.h(mkVar);
        }
    }

    public final boolean y() {
        return this.v;
    }

    final boolean z() {
        return (this.w && this.v) ? false : true;
    }

    /* JADX INFO: compiled from: PG */
    public class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.afqt(0);
        final int a;
        final int b;
        final boolean e;
        final boolean f;
        final boolean g;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.e = parcel.readInt() == 1;
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1;
        }

        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public SavedState(android.os.Parcelable parcelable, com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.a = bottomSheetBehavior.y;
            this.b = bottomSheetBehavior.d;
            this.e = bottomSheetBehavior.a;
            this.f = bottomSheetBehavior.v;
            this.g = bottomSheetBehavior.w;
        }
    }

    public final void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public BottomSheetBehavior() {
        this.N = 0;
        this.a = true;
        this.f = -1;
        this.T = -1;
        this.Z = new defpackage.afqu(this);
        this.s = 0.5f;
        this.u = -1.0f;
        this.x = true;
        this.ab = true;
        this.ad = true;
        this.y = 4;
        this.ah = 0.1f;
        this.F = new java.util.ArrayList();
        this.aj = new java.util.ArrayList();
        this.al = -1;
        this.K = new android.util.SparseIntArray();
        this.L = new android.util.SparseIntArray();
        this.M = new android.util.SparseIntArray();
        this.an = new android.graphics.Rect();
        this.ao = new defpackage.afqq(this);
    }
}
