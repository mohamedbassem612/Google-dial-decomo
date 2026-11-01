package android.support.v7.widget;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class RecyclerView extends android.view.ViewGroup implements defpackage.dyt {
    public static final /* synthetic */ int aa = 0;
    private static final java.lang.Class[] ad;
    public static final android.view.animation.Interpolator c;
    static final defpackage.lb d;
    public android.widget.EdgeEffect A;
    public android.widget.EdgeEffect B;
    public android.widget.EdgeEffect C;
    public android.widget.EdgeEffect D;
    public defpackage.km E;
    public int F;
    public float G;
    public float H;
    public final defpackage.lc I;
    public defpackage.jl J;
    public defpackage.jj K;
    public final defpackage.la L;
    public java.util.List M;
    public boolean N;
    public boolean O;
    public boolean P;
    public defpackage.lf Q;
    public final int[] R;
    final java.util.List S;
    boolean T;
    defpackage.dym U;
    public final defpackage.nf V;
    ni W;
    private int aA;
    private final int aB;
    private final int aC;
    private boolean aD;
    private boolean aE;
    private final int[] aF;
    private defpackage.dyu aG;
    private final int[] aH;
    private final int[] aI;
    private java.lang.Runnable aJ;
    private boolean aK;
    private int aL;
    private int aM;
    private final defpackage.dyn aN;
    private defpackage.apnt aO;
    private final defpackage.apnt aP;
    private defpackage.den aQ;
    private final float ae;
    private boolean af;
    private final defpackage.kv ag;
    private final android.graphics.Rect ah;
    private android.graphics.Rect ai;
    private final java.util.ArrayList aj;
    private kr ak;
    private final java.lang.Runnable al;
    private boolean am;
    private boolean an;
    private int ao;
    private boolean ap;
    private int aq;
    private final android.view.accessibility.AccessibilityManager ar;
    private int as;
    private int at;
    private int au;
    private android.view.VelocityTracker av;
    private int aw;
    private int ax;
    private int ay;
    private int az;
    public final defpackage.kt e;
    public android.support.v7.widget.RecyclerView.SavedState f;
    public defpackage.hg g;
    public defpackage.ip h;
    public boolean i;
    public final java.lang.Runnable j;
    public final android.graphics.Rect k;
    public final android.graphics.RectF l;
    public defpackage.kh m;
    public defpackage.kp n;
    public final java.util.List o;
    public final java.util.ArrayList p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public java.util.List x;
    public boolean y;
    boolean z;
    private static final int[] ab = {android.R.attr.nestedScrollingEnabled};
    private static final float ac = 2.3582017f;
    public static final boolean a = true;
    static final boolean b = true;

    static {
        java.lang.Class cls = java.lang.Integer.TYPE;
        ad = new java.lang.Class[]{android.content.Context.class, android.util.AttributeSet.class, cls, cls};
        c = new defpackage.eck(1);
        d = new defpackage.lb();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.support.v7.widget.RecyclerView recyclerView = this;
        recyclerView.af = false;
        recyclerView.ag = new defpackage.kv(recyclerView);
        recyclerView.e = new defpackage.kt(recyclerView);
        recyclerView.V = new defpackage.nf((char[]) null);
        recyclerView.j = new defpackage.am(recyclerView, 15, null);
        recyclerView.k = new android.graphics.Rect();
        recyclerView.ah = new android.graphics.Rect();
        recyclerView.l = new android.graphics.RectF();
        recyclerView.o = new java.util.ArrayList();
        recyclerView.p = new java.util.ArrayList();
        recyclerView.aj = new java.util.ArrayList();
        recyclerView.al = new defpackage.am(recyclerView, 14);
        recyclerView.ao = 0;
        recyclerView.y = false;
        recyclerView.z = false;
        recyclerView.as = 0;
        recyclerView.at = 0;
        recyclerView.aQ = d;
        recyclerView.E = new defpackage.ix();
        recyclerView.F = 0;
        recyclerView.au = -1;
        recyclerView.G = Float.MIN_VALUE;
        recyclerView.H = Float.MIN_VALUE;
        recyclerView.aD = true;
        recyclerView.aE = true;
        recyclerView.I = new defpackage.lc(recyclerView);
        recyclerView.K = new defpackage.jj();
        recyclerView.L = new defpackage.la();
        recyclerView.N = false;
        recyclerView.O = false;
        recyclerView.aO = new defpackage.apnt(recyclerView, (byte[]) null);
        recyclerView.P = false;
        recyclerView.aF = new int[2];
        recyclerView.aH = new int[2];
        recyclerView.aI = new int[2];
        recyclerView.R = new int[2];
        recyclerView.S = new java.util.ArrayList();
        recyclerView.aJ = new defpackage.am(recyclerView, 16, null);
        recyclerView.aL = 0;
        recyclerView.aM = 0;
        recyclerView.aP = new defpackage.apnt(recyclerView, (byte[]) null);
        defpackage.kg kgVar = new defpackage.kg(recyclerView);
        recyclerView.aN = kgVar;
        recyclerView.U = new defpackage.dym(recyclerView.getContext(), kgVar);
        recyclerView.setScrollContainer(true);
        recyclerView.setFocusableInTouchMode(true);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        recyclerView.aA = viewConfiguration.getScaledTouchSlop();
        recyclerView.G = aa$.ExternalSyntheticApiModelOutline0.m(viewConfiguration);
        recyclerView.H = aa$.ExternalSyntheticApiModelOutline0.m$1(viewConfiguration);
        recyclerView.aB = viewConfiguration.getScaledMinimumFlingVelocity();
        recyclerView.aC = viewConfiguration.getScaledMaximumFlingVelocity();
        recyclerView.ae = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        recyclerView.setWillNotDraw(recyclerView.getOverScrollMode() == 2);
        recyclerView.E.h = recyclerView.aO;
        recyclerView.g = new defpackage.hg(new defpackage.apnt(recyclerView, (byte[]) null));
        recyclerView.h = new defpackage.ip(new defpackage.apnt(recyclerView, (byte[]) null));
        int i2 = defpackage.dzs.a;
        if (defpackage.dzn.a(recyclerView) == 0) {
            defpackage.dzn.b(recyclerView, 8);
        }
        if (recyclerView.getImportantForAccessibility() == 0) {
            recyclerView.setImportantForAccessibility(1);
        }
        recyclerView.ar = (android.view.accessibility.AccessibilityManager) recyclerView.getContext().getSystemService("accessibility");
        recyclerView.X(new defpackage.lf(recyclerView));
        int[] iArr = defpackage.ei.a;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        defpackage.dzp.b(recyclerView, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        java.lang.String string = typedArrayObtainStyledAttributes.getString(9);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            recyclerView.setDescendantFocusability(262144);
        }
        recyclerView.i = typedArrayObtainStyledAttributes.getBoolean(1, true);
        recyclerView.aE = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            android.graphics.drawable.StateListDrawable stateListDrawable = (android.graphics.drawable.StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            android.graphics.drawable.StateListDrawable stateListDrawable2 = (android.graphics.drawable.StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            android.graphics.drawable.Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new java.lang.IllegalArgumentException("Trying to set fast scroller without both required drawables.".concat(recyclerView.l()));
            }
            android.content.res.Resources resources = recyclerView.getContext().getResources();
            new jh(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(2131165780), resources.getDimensionPixelSize(2131165782), resources.getDimensionPixelOffset(2131165781));
            recyclerView = this;
        }
        typedArrayObtainStyledAttributes.recycle();
        recyclerView.T = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        recyclerView.aM(context, string, attributeSet, i);
        int[] iArr2 = ab;
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        defpackage.dzp.b(recyclerView, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        recyclerView.setNestedScrollingEnabled(z);
        recyclerView.setTag(2131428422, java.lang.Boolean.TRUE);
    }

    public static void I(android.view.View view, android.graphics.Rect rect) {
        defpackage.kq kqVar = (defpackage.kq) view.getLayoutParams();
        android.graphics.Rect rect2 = kqVar.d;
        rect.set((view.getLeft() - rect2.left) - kqVar.leftMargin, (view.getTop() - rect2.top) - kqVar.topMargin, view.getRight() + rect2.right + kqVar.rightMargin, view.getBottom() + rect2.bottom + kqVar.bottomMargin);
    }

    private final int a(int i, float f) {
        float height = getHeight();
        float width = i / getWidth();
        float f2 = f / height;
        android.widget.EdgeEffect edgeEffect = this.A;
        float f3 = 0.0f;
        if (edgeEffect == null || dzm.d(edgeEffect) == 0.0f) {
            android.widget.EdgeEffect edgeEffect2 = this.C;
            if (edgeEffect2 != null && dzm.d(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                android.widget.EdgeEffect edgeEffect3 = this.C;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fE = dzm.e(edgeEffect3, width, f2);
                    if (dzm.d(this.C) == 0.0f) {
                        this.C.onRelease();
                    }
                    f3 = fE;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            android.widget.EdgeEffect edgeEffect4 = this.A;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f4 = -dzm.e(edgeEffect4, -width, 1.0f - f2);
                if (dzm.d(this.A) == 0.0f) {
                    this.A.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return java.lang.Math.round(f3 * getWidth());
    }

    private final void aA(int[] iArr) {
        int iA = this.h.a();
        if (iA == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < iA; i3++) {
            android.view.View viewD = this.h.d(i3);
            defpackage.ld ldVar = viewD == null ? null : ((defpackage.kq) viewD.getLayoutParams()).c;
            if (!ldVar.A()) {
                int iC = ldVar.c();
                if (iC < i2) {
                    i2 = iC;
                }
                if (iC > i) {
                    i = iC;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i;
    }

    private final void aB(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.au) {
            int i = actionIndex == 0 ? 1 : 0;
            this.au = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.ay = x;
            this.aw = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.az = y;
            this.ax = y;
        }
    }

    private final void aC() {
        boolean z;
        if (this.y) {
            this.g.i();
            if (this.z) {
                this.n.eN();
            }
        }
        boolean zAK = aK();
        defpackage.hg hgVar = this.g;
        if (zAK) {
            hgVar.f();
        } else {
            hgVar.d();
        }
        boolean z2 = this.N || this.O;
        defpackage.la laVar = this.L;
        boolean z3 = this.s && this.E != null && ((z = this.y) || z2 || this.n.u) && (!z || this.m.c);
        laVar.j = z3;
        laVar.k = z3 && z2 && !this.y && aK();
    }

    private final void aD() {
        boolean zIsFinished;
        android.widget.EdgeEffect edgeEffect = this.A;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.A.isFinished();
        } else {
            zIsFinished = false;
        }
        android.widget.EdgeEffect edgeEffect2 = this.B;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.B.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.C;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    private final void aE(android.view.View view, android.view.View view2) {
        android.view.View view3 = view2 != null ? view2 : view;
        android.graphics.Rect rect = this.k;
        rect.set(0, 0, view3.getWidth(), view3.getHeight());
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof defpackage.kq) {
            defpackage.kq kqVar = (defpackage.kq) layoutParams;
            if (!kqVar.e) {
                android.graphics.Rect rect2 = kqVar.d;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        } else {
            view2 = null;
        }
        this.n.bf(this, view, rect, !this.s, view2 == null);
    }

    private final void aF() {
        defpackage.la laVar = this.L;
        laVar.m = -1L;
        laVar.l = -1;
        laVar.n = -1;
    }

    private final void aG() {
        android.view.VelocityTracker velocityTracker = this.av;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        af(0);
        aD();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void aH(int i) {
        boolean zAh = this.n.ah();
        int i2 = zAh;
        if (this.n.ai()) {
            i2 = (zAh ? 1 : 0) | 2;
        }
        ar(i2, i);
    }

    private final void aI() {
        kz kzVar;
        this.I.d();
        defpackage.kp kpVar = this.n;
        if (kpVar == null || (kzVar = kpVar.t) == null) {
            return;
        }
        kzVar.c();
    }

    private final boolean aJ(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = this.aj;
        int action = motionEvent.getAction();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kr krVar = (kr) arrayList.get(i);
            if (krVar.j(motionEvent) && action != 3) {
                this.ak = krVar;
                return true;
            }
        }
        return false;
    }

    private final boolean aK() {
        return this.E != null && this.n.eM();
    }

    private final boolean aL(android.widget.EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fD = dzm.d(edgeEffect) * i2;
        float fAbs = java.lang.Math.abs(-i);
        float f = this.ae * 0.015f;
        double dLog = java.lang.Math.log((fAbs * 0.35f) / f);
        double d2 = ac;
        return ((float) (((double) f) * java.lang.Math.exp((d2 / ((-1.0d) + d2)) * dLog))) < fD;
    }

    private final void aM(android.content.Context context, java.lang.String str, android.util.AttributeSet attributeSet, int i) {
        java.lang.Object[] objArr;
        java.lang.reflect.Constructor constructor;
        if (str != null) {
            java.lang.String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            if (strTrim.charAt(0) == '.') {
                strTrim = java.lang.String.valueOf(context.getPackageName()).concat(java.lang.String.valueOf(strTrim));
            } else if (!strTrim.contains(".")) {
                strTrim = android.support.v7.widget.RecyclerView.class.getPackage().getName() + '.' + strTrim;
            }
            try {
                java.lang.Class<? extends U> clsAsSubclass = java.lang.Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(defpackage.kp.class);
                try {
                    constructor = clsAsSubclass.getConstructor(ad);
                    objArr = new java.lang.Object[]{context, attributeSet, java.lang.Integer.valueOf(i), 0};
                } catch (java.lang.NoSuchMethodException e) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (java.lang.NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new java.lang.IllegalStateException(defpackage.a.bn(strTrim, attributeSet, ": Error creating LayoutManager "), e2);
                    }
                }
                constructor.setAccessible(true);
                aa((defpackage.kp) constructor.newInstance(objArr));
            } catch (java.lang.ClassCastException e3) {
                throw new java.lang.IllegalStateException(defpackage.a.bn(strTrim, attributeSet, ": Class is not a LayoutManager "), e3);
            } catch (java.lang.ClassNotFoundException e4) {
                throw new java.lang.IllegalStateException(defpackage.a.bn(strTrim, attributeSet, ": Unable to find LayoutManager "), e4);
            } catch (java.lang.IllegalAccessException e5) {
                throw new java.lang.IllegalStateException(defpackage.a.bn(strTrim, attributeSet, ": Cannot access non-public constructor "), e5);
            } catch (java.lang.InstantiationException e6) {
                throw new java.lang.IllegalStateException(defpackage.a.bn(strTrim, attributeSet, ": Could not instantiate the LayoutManager: "), e6);
            } catch (java.lang.reflect.InvocationTargetException e7) {
                throw new java.lang.IllegalStateException(defpackage.a.bn(strTrim, attributeSet, ": Could not instantiate the LayoutManager: "), e7);
            }
        }
    }

    private final ni aN() {
        ni niVar = this.W;
        if (niVar != null) {
            return niVar;
        }
        ni niVar2 = new ni(this, (byte[]) null);
        this.W = niVar2;
        return niVar2;
    }

    public static final int ao(int i, android.widget.EdgeEffect edgeEffect, android.widget.EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && dzm.d(edgeEffect) != 0.0f) {
            int iRound = java.lang.Math.round(((-i2) / 4.0f) * dzm.e(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || dzm.d(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = java.lang.Math.round((f / 4.0f) * dzm.e(edgeEffect2, (i * 4.0f) / f, 0.5f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    private final int av(int i, float f) {
        float width = getWidth();
        float height = i / getHeight();
        float f2 = f / width;
        android.widget.EdgeEffect edgeEffect = this.B;
        float f3 = 0.0f;
        if (edgeEffect == null || dzm.d(edgeEffect) == 0.0f) {
            android.widget.EdgeEffect edgeEffect2 = this.D;
            if (edgeEffect2 != null && dzm.d(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                android.widget.EdgeEffect edgeEffect3 = this.D;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fE = dzm.e(edgeEffect3, height, 1.0f - f2);
                    if (dzm.d(this.D) == 0.0f) {
                        this.D.onRelease();
                    }
                    f3 = fE;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            android.widget.EdgeEffect edgeEffect4 = this.B;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f4 = -dzm.e(edgeEffect4, -height, f2);
                if (dzm.d(this.B) == 0.0f) {
                    this.B.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return java.lang.Math.round(f3 * getHeight());
    }

    private final defpackage.dyu aw() {
        defpackage.dyu dyuVar = this.aG;
        if (dyuVar != null) {
            return dyuVar;
        }
        defpackage.dyu dyuVar2 = new defpackage.dyu(this);
        this.aG = dyuVar2;
        return dyuVar2;
    }

    private final void ax() {
        aG();
        ab(0);
    }

    private final void ay() {
        android.view.View viewK;
        defpackage.la laVar = this.L;
        laVar.b(1);
        H(laVar);
        laVar.i = false;
        ad();
        defpackage.nf nfVar = this.V;
        nfVar.m();
        O();
        aC();
        android.view.View focusedChild = (this.aD && hasFocus() && this.m != null) ? getFocusedChild() : null;
        defpackage.ld ldVarH = (focusedChild == null || (viewK = k(focusedChild)) == null) ? null : h(viewK);
        if (ldVarH == null) {
            aF();
        } else {
            laVar.m = this.m.c ? ldVarH.e : -1L;
            laVar.l = this.y ? -1 : ldVarH.v() ? ldVarH.d : ldVarH.a();
            android.view.View focusedChild2 = ldVarH.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof android.view.ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((android.view.ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            laVar.n = id;
        }
        laVar.h = laVar.j && this.O;
        this.O = false;
        this.N = false;
        laVar.g = laVar.k;
        laVar.e = this.m.a();
        aA(this.aF);
        if (laVar.j) {
            int iA = this.h.a();
            for (int i = 0; i < iA; i++) {
                android.view.View viewD = this.h.d(i);
                defpackage.ld ldVar = viewD == null ? null : ((defpackage.kq) viewD.getLayoutParams()).c;
                if (!ldVar.A() && (!ldVar.t() || this.m.c)) {
                    defpackage.km.t(ldVar);
                    ldVar.d();
                    nfVar.l(ldVar, defpackage.km.s(ldVar));
                    if (laVar.h && ldVar.y() && !ldVar.v() && !ldVar.A() && !ldVar.t()) {
                        nfVar.j(d(ldVar), ldVar);
                    }
                }
            }
        }
        if (laVar.k) {
            int iB = this.h.b();
            for (int i2 = 0; i2 < iB; i2++) {
                android.view.View viewE = this.h.e(i2);
                defpackage.ld ldVar2 = viewE == null ? null : ((defpackage.kq) viewE.getLayoutParams()).c;
                if (!ldVar2.A() && ldVar2.d == -1) {
                    ldVar2.d = ldVar2.c;
                }
            }
            boolean z = laVar.f;
            laVar.f = false;
            this.n.p(this.e, laVar);
            laVar.f = z;
            for (int i3 = 0; i3 < this.h.a(); i3++) {
                android.view.View viewD2 = this.h.d(i3);
                defpackage.ld ldVar3 = viewD2 == null ? null : ((defpackage.kq) viewD2.getLayoutParams()).c;
                if (!ldVar3.A()) {
                    defpackage.aec aecVar = (defpackage.aec) nfVar.b;
                    defpackage.mb mbVar = (defpackage.mb) aecVar.get(ldVar3);
                    if (mbVar == null || (mbVar.b & 4) == 0) {
                        defpackage.km.t(ldVar3);
                        boolean zQ = ldVar3.q(8192);
                        ldVar3.d();
                        kl klVarS = defpackage.km.s(ldVar3);
                        if (zQ) {
                            S(ldVar3, klVarS);
                        } else {
                            defpackage.mb mbVarA = (defpackage.mb) aecVar.get(ldVar3);
                            if (mbVarA == null) {
                                mbVarA = defpackage.mb.a();
                                aecVar.put(ldVar3, mbVarA);
                            }
                            mbVarA.b |= 2;
                            mbVarA.c = klVarS;
                        }
                    }
                }
            }
            v();
        } else {
            v();
        }
        P(true);
        ae(false);
        laVar.d = 2;
    }

    private final void az() {
        ad();
        O();
        defpackage.la laVar = this.L;
        laVar.b(6);
        this.g.d();
        laVar.e = this.m.a();
        laVar.c = 0;
        if (this.f != null && this.m.s()) {
            android.os.Parcelable parcelable = this.f.a;
            if (parcelable != null) {
                this.n.ac(parcelable);
            }
            this.f = null;
        }
        laVar.g = false;
        this.n.p(this.e, laVar);
        laVar.f = false;
        laVar.j = laVar.j && this.E != null;
        laVar.d = 4;
        P(true);
        ae(false);
    }

    public static defpackage.ld i(android.view.View view) {
        if (view == null) {
            return null;
        }
        return ((defpackage.kq) view.getLayoutParams()).c;
    }

    public static android.support.v7.widget.RecyclerView j(android.view.View view) {
        if (view instanceof android.view.ViewGroup) {
            if (view instanceof android.support.v7.widget.RecyclerView) {
                return (android.support.v7.widget.RecyclerView) view;
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.support.v7.widget.RecyclerView recyclerViewJ = j(viewGroup.getChildAt(i));
                if (recyclerViewJ != null) {
                    return recyclerViewJ;
                }
            }
        }
        return null;
    }

    public static void u(defpackage.ld ldVar) {
        java.lang.ref.WeakReference weakReference = ldVar.b;
        if (weakReference != null) {
            android.view.View view = (android.view.View) weakReference.get();
            while (view != null) {
                if (view == ldVar.a) {
                    return;
                }
                java.lang.Object parent = view.getParent();
                view = parent instanceof android.view.View ? (android.view.View) parent : null;
            }
            ldVar.b = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:145:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:164:0x0323  */
    /* JADX WARN: Code duplicated, block: B:166:0x0326  */
    /* JADX WARN: Code duplicated, block: B:171:0x0338  */
    /* JADX WARN: Code duplicated, block: B:173:0x0340  */
    /* JADX WARN: Code duplicated, block: B:175:0x0346  */
    /* JADX WARN: Code duplicated, block: B:178:0x034e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0354  */
    /* JADX WARN: Code duplicated, block: B:183:0x035e A[LOOP:4: B:177:0x034c->B:183:0x035e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x036b  */
    /* JADX WARN: Code duplicated, block: B:188:0x0371  */
    /* JADX WARN: Code duplicated, block: B:191:0x037b A[LOOP:5: B:185:0x0369->B:191:0x037b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:193:0x0380  */
    /* JADX WARN: Code duplicated, block: B:231:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x035c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x037e A[EDGE_INSN: B:235:0x037e->B:192:0x037e BREAK  A[LOOP:5: B:185:0x0369->B:191:0x037b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0379 A[SYNTHETIC] */
    final void A() {
        int i;
        long j;
        defpackage.ld ldVar;
        int i2;
        int iA;
        int i3;
        int iMin;
        defpackage.ld ldVarF;
        android.view.View view;
        defpackage.ld ldVarF2;
        android.view.View view2;
        int i4;
        android.view.View viewFindViewById;
        defpackage.ip ipVar;
        android.view.View view3;
        defpackage.kh khVar;
        int i5;
        if (this.m == null) {
            android.util.Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.n == null) {
            android.util.Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        defpackage.la laVar = this.L;
        laVar.i = false;
        boolean z = this.aK && !(this.aL == getWidth() && this.aM == getHeight());
        this.aL = 0;
        this.aM = 0;
        this.aK = false;
        if (laVar.d == 1) {
            ay();
            this.n.aY(this);
            az();
        } else {
            defpackage.hg hgVar = this.g;
            if ((hgVar.b.isEmpty() || hgVar.a.isEmpty()) && !z && this.n.C == getWidth() && this.n.D == getHeight()) {
                this.n.aY(this);
            } else {
                this.n.aY(this);
                az();
            }
        }
        laVar.b(4);
        ad();
        O();
        laVar.d = 1;
        int i6 = -1;
        android.view.View view4 = null;
        if (laVar.j) {
            int iA2 = this.h.a() - 1;
            while (iA2 >= 0) {
                android.view.View viewD = this.h.d(iA2);
                defpackage.ld ldVar2 = viewD == null ? null : ((defpackage.kq) viewD.getLayoutParams()).c;
                if (ldVar2.A()) {
                    i5 = i6;
                } else {
                    long jD = d(ldVar2);
                    kl klVar = new kl();
                    klVar.a(ldVar2);
                    defpackage.nf nfVar = this.V;
                    defpackage.ld ldVar3 = (defpackage.ld) ((defpackage.adb) nfVar.a).d(jD);
                    if (ldVar3 == null || ldVar3.A()) {
                        i5 = i6;
                        nfVar.k(ldVar2, klVar);
                    } else {
                        boolean zP = nfVar.p(ldVar3);
                        boolean zP2 = nfVar.p(ldVar2);
                        if (zP && ldVar3 == ldVar2) {
                            nfVar.k(ldVar2, klVar);
                            i5 = i6;
                        } else {
                            i5 = i6;
                            kl klVarH = nfVar.h(ldVar3, 4);
                            nfVar.k(ldVar2, klVar);
                            kl klVarH2 = nfVar.h(ldVar2, 8);
                            if (klVarH == null) {
                                int iA3 = this.h.a();
                                for (int i7 = 0; i7 < iA3; i7++) {
                                    android.view.View viewD2 = this.h.d(i7);
                                    defpackage.ld ldVar4 = viewD2 == null ? null : ((defpackage.kq) viewD2.getLayoutParams()).c;
                                    if (ldVar4 != ldVar2 && d(ldVar4) == jD) {
                                        defpackage.kh khVar2 = this.m;
                                        if (khVar2 == null || !khVar2.c) {
                                            throw new java.lang.IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + ldVar4 + " \n View Holder 2:" + ldVar2 + l());
                                        }
                                        throw new java.lang.IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + ldVar4 + " \n View Holder 2:" + ldVar2 + l());
                                    }
                                }
                                android.util.Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + ldVar3 + " cannot be found but it is necessary for " + ldVar2 + l());
                            } else {
                                ldVar3.n(false);
                                if (zP) {
                                    r(ldVar3);
                                }
                                if (ldVar3 != ldVar2) {
                                    if (zP2) {
                                        r(ldVar2);
                                    }
                                    ldVar3.h = ldVar2;
                                    r(ldVar3);
                                    this.e.l(ldVar3);
                                    ldVar2.n(false);
                                    ldVar2.i = ldVar3;
                                }
                                if (this.E.o(ldVar3, ldVar2, klVarH, klVarH2)) {
                                    Q();
                                }
                            }
                        }
                    }
                }
                iA2--;
                i6 = i5;
            }
            i = i6;
            defpackage.nf nfVar2 = this.V;
            defpackage.apnt apntVar = this.aP;
            defpackage.aec aecVar = (defpackage.aec) nfVar2.b;
            for (int i8 = aecVar.d - 1; i8 >= 0; i8--) {
                defpackage.ld ldVar5 = (defpackage.ld) aecVar.d(i8);
                defpackage.mb mbVar = (defpackage.mb) aecVar.e(i8);
                int i9 = mbVar.b;
                if ((i9 & 3) == 3) {
                    apntVar.K(ldVar5);
                } else if ((i9 & 1) != 0) {
                    kl klVar2 = mbVar.c;
                    if (klVar2 == null) {
                        apntVar.K(ldVar5);
                    } else {
                        apntVar.J(ldVar5, klVar2, mbVar.d);
                    }
                } else if ((i9 & 14) == 14) {
                    apntVar.I(ldVar5, mbVar.c, mbVar.d);
                } else if ((i9 & 12) == 12) {
                    kl klVar3 = mbVar.c;
                    kl klVar4 = mbVar.d;
                    ldVar5.n(false);
                    android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) apntVar.a;
                    if (recyclerView.y) {
                        if (recyclerView.E.o(ldVar5, ldVar5, klVar3, klVar4)) {
                            recyclerView.Q();
                        }
                    } else if (recyclerView.E.q(ldVar5, klVar3, klVar4)) {
                        recyclerView.Q();
                    }
                } else if ((i9 & 4) != 0) {
                    apntVar.J(ldVar5, mbVar.c, null);
                } else if ((i9 & 8) != 0) {
                    apntVar.I(ldVar5, mbVar.c, mbVar.d);
                }
                defpackage.mb.b(mbVar);
            }
        } else {
            i = -1;
        }
        defpackage.kp kpVar = this.n;
        defpackage.kt ktVar = this.e;
        kpVar.aS(ktVar);
        laVar.b = laVar.e;
        this.y = false;
        this.z = false;
        laVar.j = false;
        laVar.k = false;
        this.n.u = false;
        java.util.ArrayList arrayList = ktVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        defpackage.kp kpVar2 = this.n;
        if (kpVar2.z) {
            kpVar2.y = 0;
            kpVar2.z = false;
            ktVar.m();
        }
        this.n.q(laVar);
        P(true);
        ae(false);
        this.V.m();
        int[] iArr = this.aF;
        int i10 = iArr[0];
        int i11 = iArr[1];
        aA(iArr);
        if (iArr[0] != i10 || iArr[1] != i11) {
            C(0, 0);
        }
        if (this.aD && this.m != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = laVar.m;
                if (j != -1) {
                    khVar = this.m;
                    if (khVar.c) {
                        ldVar = null;
                    } else {
                        ldVar = null;
                    }
                } else {
                    ldVar = null;
                }
                if (ldVar != null) {
                    ipVar = this.h;
                    view3 = ldVar.a;
                    if (ipVar.k(view3)) {
                        if (this.h.a() > 0) {
                            int i12 = laVar.l;
                            if (i12 != i) {
                            }
                            iA = laVar.a();
                            i3 = i2;
                            while (true) {
                                if (i3 < iA) {
                                    ldVarF2 = f(i3);
                                    if (ldVarF2 != null) {
                                        view2 = ldVarF2.a;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i3++;
                                        }
                                    }
                                }
                                while (iMin >= 0) {
                                    ldVarF = f(iMin);
                                    if (ldVarF == null) {
                                        break;
                                        break;
                                    }
                                    view = ldVarF.a;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.h.a() > 0) {
                        int i13 = laVar.l;
                        if (i13 != i) {
                        }
                        iA = laVar.a();
                        i3 = i2;
                        while (true) {
                            if (i3 < iA) {
                                ldVarF2 = f(i3);
                                if (ldVarF2 != null) {
                                    view2 = ldVarF2.a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                ldVarF = f(iMin);
                                if (ldVarF == null) {
                                    break;
                                    break;
                                }
                                view = ldVarF.a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.h.a() > 0) {
                    int i14 = laVar.l;
                    if (i14 != i) {
                    }
                    iA = laVar.a();
                    i3 = i2;
                    while (true) {
                        if (i3 < iA) {
                            ldVarF2 = f(i3);
                            if (ldVarF2 != null) {
                                view2 = ldVarF2.a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        for (iMin = java.lang.Math.min(iA, i2) - 1; iMin >= 0; iMin--) {
                            ldVarF = f(iMin);
                            if (ldVarF == null) {
                                break;
                                break;
                            }
                            view = ldVarF.a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i4 = laVar.n;
                    if (i4 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (this.h.k(getFocusedChild())) {
                j = laVar.m;
                if (j != -1) {
                    khVar = this.m;
                    if (khVar.c || khVar == null) {
                        ldVar = null;
                    } else {
                        int iB = this.h.b();
                        ldVar = null;
                        for (int i15 = 0; i15 < iB; i15++) {
                            android.view.View viewE = this.h.e(i15);
                            defpackage.ld ldVar6 = viewE == null ? null : ((defpackage.kq) viewE.getLayoutParams()).c;
                            if (ldVar6 != null && !ldVar6.v() && ldVar6.e == j) {
                                if (!this.h.k(ldVar6.a)) {
                                    ldVar = ldVar6;
                                    break;
                                }
                                ldVar = ldVar6;
                            }
                        }
                    }
                } else {
                    ldVar = null;
                }
                if (ldVar != null) {
                    ipVar = this.h;
                    view3 = ldVar.a;
                    if (ipVar.k(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (this.h.a() > 0) {
                        int i16 = laVar.l;
                        i2 = i16 != i ? i16 : 0;
                        iA = laVar.a();
                        i3 = i2;
                        while (true) {
                            if (i3 < iA) {
                                ldVarF2 = f(i3);
                                if (ldVarF2 != null) {
                                    view2 = ldVarF2.a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                ldVarF = f(iMin);
                                if (ldVarF == null) {
                                    break;
                                }
                                view = ldVarF.a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.h.a() > 0) {
                    int i17 = laVar.l;
                    if (i17 != i) {
                    }
                    iA = laVar.a();
                    i3 = i2;
                    while (true) {
                        if (i3 < iA) {
                            ldVarF2 = f(i3);
                            if (ldVarF2 != null) {
                                view2 = ldVarF2.a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            ldVarF = f(iMin);
                            if (ldVarF == null) {
                                break;
                                break;
                            }
                            view = ldVarF.a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i4 = laVar.n;
                    if (i4 != -1 && (viewFindViewById = view4.findViewById(i4)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        aF();
    }

    public final void C(int i, int i2) {
        this.at++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        java.util.List list = this.M;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((li) this.M.get(size)).a(this, i, i2);
                }
            }
        }
        this.at--;
    }

    public final void D() {
        if (this.D == null) {
            android.widget.EdgeEffect edgeEffectCg = this.aQ.cg(this);
            this.D = edgeEffectCg;
            if (this.i) {
                edgeEffectCg.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffectCg.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void E() {
        if (this.A == null) {
            android.widget.EdgeEffect edgeEffectCg = this.aQ.cg(this);
            this.A = edgeEffectCg;
            if (this.i) {
                edgeEffectCg.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffectCg.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void F() {
        if (this.C == null) {
            android.widget.EdgeEffect edgeEffectCg = this.aQ.cg(this);
            this.C = edgeEffectCg;
            if (this.i) {
                edgeEffectCg.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffectCg.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void G() {
        if (this.B == null) {
            android.widget.EdgeEffect edgeEffectCg = this.aQ.cg(this);
            this.B = edgeEffectCg;
            if (this.i) {
                edgeEffectCg.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffectCg.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    final void H(defpackage.la laVar) {
        if (this.F != 2) {
            laVar.o = 0;
            laVar.p = 0;
        } else {
            android.widget.OverScroller overScroller = this.I.a;
            laVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            laVar.p = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    final void J() {
        this.D = null;
        this.B = null;
        this.C = null;
        this.A = null;
    }

    public final void K() {
        if (this.p.size() != 0) {
            defpackage.kp kpVar = this.n;
            if (kpVar != null) {
                kpVar.X("Cannot invalidate item decorations during a scroll or layout");
            }
            M();
            requestLayout();
        }
    }

    public final void L(int i) {
        if (this.n != null) {
            ab(2);
            this.n.ae(i);
            awakenScrollBars();
        }
    }

    final void M() {
        int iB = this.h.b();
        for (int i = 0; i < iB; i++) {
            ((defpackage.kq) this.h.e(i).getLayoutParams()).e = true;
        }
        java.util.ArrayList arrayList = this.e.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.kq kqVar = (defpackage.kq) ((defpackage.ld) arrayList.get(i2)).a.getLayoutParams();
            if (kqVar != null) {
                kqVar.e = true;
            }
        }
    }

    public final void N(int i, int i2, boolean z) {
        int i3;
        int iB = this.h.b();
        int i4 = 0;
        while (true) {
            i3 = i + i2;
            if (i4 >= iB) {
                break;
            }
            defpackage.ld ldVarI = i(this.h.e(i4));
            if (ldVarI != null && !ldVarI.A()) {
                int i5 = ldVarI.c;
                if (i5 >= i3) {
                    ldVarI.k(-i2, z);
                    this.L.f = true;
                } else if (i5 >= i) {
                    ldVarI.f(8);
                    ldVarI.k(-i2, z);
                    ldVarI.c = i - 1;
                    this.L.f = true;
                }
            }
            i4++;
        }
        defpackage.kt ktVar = this.e;
        java.util.ArrayList arrayList = ktVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            defpackage.ld ldVar = (defpackage.ld) arrayList.get(size);
            if (ldVar != null) {
                int i6 = ldVar.c;
                if (i6 >= i3) {
                    ldVar.k(-i2, z);
                } else if (i6 >= i) {
                    ldVar.f(8);
                    ktVar.h(size);
                }
            }
        }
    }

    public final void O() {
        this.as++;
    }

    public final void P(boolean z) {
        int i;
        int i2 = this.as - 1;
        this.as = i2;
        if (i2 <= 0) {
            this.as = 0;
            if (z) {
                int i3 = this.aq;
                this.aq = 0;
                if (i3 != 0 && al()) {
                    android.view.accessibility.AccessibilityEvent accessibilityEventObtain = android.view.accessibility.AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                java.util.List list = this.S;
                for (int size = list.size() - 1; size >= 0; size--) {
                    defpackage.ld ldVar = (defpackage.ld) list.get(size);
                    android.view.View view = ldVar.a;
                    if (view.getParent() == this && !ldVar.A() && (i = ldVar.p) != -1) {
                        view.setImportantForAccessibility(i);
                        ldVar.p = -1;
                    }
                }
                list.clear();
            }
        }
    }

    public final void Q() {
        if (this.P || !this.q) {
            return;
        }
        java.lang.Runnable runnable = this.aJ;
        int i = defpackage.dzs.a;
        postOnAnimation(runnable);
        this.P = true;
    }

    public final void R(boolean z) {
        this.z |= z;
        this.y = true;
        int iB = this.h.b();
        int i = 0;
        while (true) {
            if (i >= iB) {
                break;
            }
            android.view.View viewE = this.h.e(i);
            defpackage.ld ldVar = viewE != null ? ((defpackage.kq) viewE.getLayoutParams()).c : null;
            if (ldVar != null && !ldVar.A()) {
                ldVar.f(6);
            }
            i++;
        }
        M();
        defpackage.kt ktVar = this.e;
        java.util.ArrayList arrayList = ktVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.ld ldVar2 = (defpackage.ld) arrayList.get(i2);
            if (ldVar2 != null) {
                ldVar2.f(6);
                ldVar2.e(null);
            }
        }
        defpackage.kh khVar = ktVar.f.m;
        if (khVar == null || !khVar.c) {
            ktVar.g();
        }
    }

    public final void S(defpackage.ld ldVar, kl klVar) {
        ldVar.m(0, 8192);
        if (this.L.h && ldVar.y() && !ldVar.v() && !ldVar.A()) {
            this.V.j(d(ldVar), ldVar);
        }
        this.V.l(ldVar, klVar);
    }

    public final void T() {
        defpackage.km kmVar = this.E;
        if (kmVar != null) {
            kmVar.c();
        }
        defpackage.kp kpVar = this.n;
        if (kpVar != null) {
            defpackage.kt ktVar = this.e;
            kpVar.aR(ktVar);
            this.n.aS(ktVar);
        }
        this.e.c();
    }

    public final void U(kr krVar) {
        this.aj.remove(krVar);
        if (this.ak == krVar) {
            this.ak = null;
        }
    }

    public final void V(int i, int i2, int[] iArr) {
        defpackage.ld ldVar;
        ad();
        O();
        android.os.Trace.beginSection("RV Scroll");
        defpackage.la laVar = this.L;
        H(laVar);
        int iD = i != 0 ? this.n.d(i, this.e, laVar) : 0;
        int iE = i2 != 0 ? this.n.e(i2, this.e, laVar) : 0;
        android.os.Trace.endSection();
        int iA = this.h.a();
        for (int i3 = 0; i3 < iA; i3++) {
            android.view.View viewD = this.h.d(i3);
            defpackage.ld ldVarH = h(viewD);
            if (ldVarH != null && (ldVar = ldVarH.i) != null) {
                int left = viewD.getLeft();
                int top = viewD.getTop();
                android.view.View view = ldVar.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        P(true);
        ae(false);
        if (iArr != null) {
            iArr[0] = iD;
            iArr[1] = iE;
        }
    }

    public final void W(int i) {
        if (this.v) {
            return;
        }
        ag();
        defpackage.kp kpVar = this.n;
        if (kpVar == null) {
            android.util.Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            kpVar.ae(i);
            awakenScrollBars();
        }
    }

    public final void X(defpackage.lf lfVar) {
        this.Q = lfVar;
        defpackage.dzs.i(this, lfVar);
    }

    public void Y(defpackage.kh khVar) {
        suppressLayout(false);
        defpackage.kh khVar2 = this.m;
        if (khVar2 != null) {
            khVar2.v(this.ag);
            this.m.n(this);
        }
        T();
        this.g.i();
        defpackage.kh khVar3 = this.m;
        this.m = khVar;
        if (khVar != null) {
            khVar.u(this.ag);
            khVar.l(this);
        }
        defpackage.kp kpVar = this.n;
        if (kpVar != null) {
            kpVar.br();
        }
        defpackage.kt ktVar = this.e;
        defpackage.kh khVar4 = this.m;
        ktVar.c();
        ktVar.e(khVar3, true);
        defpackage.afab afabVarP = ktVar.p();
        if (khVar3 != null) {
            afabVarP.a--;
        }
        if (afabVarP.a == 0) {
            int i = 0;
            while (true) {
                android.util.SparseArray sparseArray = (android.util.SparseArray) afabVarP.b;
                if (i >= sparseArray.size()) {
                    break;
                }
                java.util.ArrayList arrayList = ((defpackage.ks) sparseArray.valueAt(i)).a;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    defpackage.eaw.b(((defpackage.ld) arrayList.get(i2)).a);
                }
                arrayList.clear();
                i++;
            }
        }
        if (khVar4 != null) {
            afabVarP.a++;
        }
        ktVar.d();
        this.L.f = true;
        R(false);
        requestLayout();
    }

    public final void Z(defpackage.km kmVar) {
        defpackage.km kmVar2 = this.E;
        if (kmVar2 != null) {
            kmVar2.c();
            this.E.h = null;
        }
        this.E = kmVar;
        if (kmVar != null) {
            kmVar.h = this.aO;
        }
    }

    public void aa(defpackage.kp kpVar) {
        if (kpVar != this.n) {
            ag();
            if (this.n != null) {
                defpackage.km kmVar = this.E;
                if (kmVar != null) {
                    kmVar.c();
                }
                defpackage.kp kpVar2 = this.n;
                defpackage.kt ktVar = this.e;
                kpVar2.aR(ktVar);
                this.n.aS(ktVar);
                ktVar.c();
                if (this.q) {
                    this.n.bv(this);
                }
                this.n.bc(null);
                this.n = null;
            } else {
                this.e.c();
            }
            defpackage.ip ipVar = this.h;
            ipVar.a.d();
            java.util.List list = ipVar.b;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ipVar.e.G((android.view.View) list.get(size));
                list.remove(size);
            }
            defpackage.apnt apntVar = ipVar.e;
            int iD = apntVar.D();
            for (int i = 0; i < iD; i++) {
                android.view.View viewF = apntVar.F(i);
                ((android.support.v7.widget.RecyclerView) apntVar.a).z(viewF);
                viewF.clearAnimation();
            }
            ((android.support.v7.widget.RecyclerView) apntVar.a).removeAllViews();
            this.n = kpVar;
            if (kpVar != null) {
                if (kpVar.s != null) {
                    throw new java.lang.IllegalArgumentException("LayoutManager " + kpVar + " is already attached to a RecyclerView:" + kpVar.s.l());
                }
                this.n.bc(this);
                if (this.q) {
                    this.n.aK(this);
                }
            }
            this.e.m();
            requestLayout();
        }
    }

    public final void ab(int i) {
        if (i == this.F) {
            return;
        }
        boolean z = this.af;
        if (i == 1) {
            if (!z) {
                da$.ExternalSyntheticApiModelOutline0.m$1("RecyclerView#drag", java.lang.System.identityHashCode(this));
                this.af = true;
            }
            i = 1;
        } else if (z) {
            da$.ExternalSyntheticApiModelOutline0.m("RecyclerView#drag", java.lang.System.identityHashCode(this));
            this.af = false;
        }
        this.F = i;
        if (i != 2) {
            aI();
        }
        defpackage.kp kpVar = this.n;
        if (kpVar != null) {
            kpVar.aP(i);
        }
        java.util.List list = this.M;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((li) this.M.get(size)).g(this, i);
            }
        }
    }

    public final void ac(int i) {
        if (this.v) {
            return;
        }
        defpackage.kp kpVar = this.n;
        if (kpVar == null) {
            android.util.Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            kpVar.at(this, i);
        }
    }

    public final void ad() {
        int i = this.ao + 1;
        this.ao = i;
        if (i != 1 || this.v) {
            return;
        }
        this.u = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList arrayList, int i, int i2) {
        if (b && isFocusable() && !this.an && (!hasFocus() || this.am)) {
            if (i != 2) {
                if (i == 1) {
                    i = 1;
                }
            }
            if (i == 2) {
                arrayList.add(this);
            }
            super.addFocusables(arrayList, i, i2);
            if (i == 1) {
                arrayList.add(this);
            }
            java.lang.Runnable runnable = this.al;
            removeCallbacks(runnable);
            this.t = true;
            post(runnable);
            return;
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void ae(boolean z) {
        int i = this.ao;
        if (i <= 0) {
            this.ao = 1;
            i = 1;
        }
        if (!z && !this.v) {
            this.u = false;
        }
        if (i == 1) {
            if (z && this.u && !this.v && this.n != null && this.m != null) {
                A();
            }
            if (!this.v) {
                this.u = false;
            }
        }
        this.ao--;
    }

    public final void af(int i) {
        aw().b(i);
    }

    public final void ag() {
        ab(0);
        aI();
    }

    public final boolean ai(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return aw().e(i, i2, iArr, iArr2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public final boolean aj(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int iMax;
        int iMax2;
        float f;
        float f2;
        boolean z;
        defpackage.kp kpVar = this.n;
        if (kpVar == null) {
            android.util.Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.v) {
            return false;
        }
        boolean zAh = kpVar.ah();
        boolean zAi = this.n.ai();
        if (!zAh || java.lang.Math.abs(i) < i3) {
            i = 0;
        }
        if (!zAi || java.lang.Math.abs(i2) < i3) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        if (i == 0) {
            i5 = 0;
        } else {
            android.widget.EdgeEffect edgeEffect = this.A;
            if (edgeEffect == null || dzm.d(edgeEffect) == 0.0f) {
                android.widget.EdgeEffect edgeEffect2 = this.C;
                if (edgeEffect2 == null || dzm.d(edgeEffect2) == 0.0f) {
                    i5 = 0;
                } else if (aL(this.C, i, getWidth())) {
                    this.C.onAbsorb(i);
                    i = 0;
                }
            } else {
                int i7 = -i;
                if (aL(this.A, i7, getWidth())) {
                    this.A.onAbsorb(i7);
                    i = 0;
                }
            }
            i5 = i;
            i = 0;
        }
        if (i2 == 0) {
            i6 = i2;
            i2 = 0;
        } else {
            android.widget.EdgeEffect edgeEffect3 = this.B;
            if (edgeEffect3 == null || dzm.d(edgeEffect3) == 0.0f) {
                android.widget.EdgeEffect edgeEffect4 = this.D;
                if (edgeEffect4 == null || dzm.d(edgeEffect4) == 0.0f) {
                    i6 = i2;
                    i2 = 0;
                } else if (aL(this.D, i2, getHeight())) {
                    this.D.onAbsorb(i2);
                    i2 = 0;
                }
            } else {
                int i8 = -i2;
                if (aL(this.B, i8, getHeight())) {
                    this.B.onAbsorb(i8);
                    i2 = 0;
                }
            }
            i6 = 0;
        }
        if (i5 != 0) {
            int i9 = -i4;
            iMax = java.lang.Math.max(i9, java.lang.Math.min(i5, i4));
            iMax2 = java.lang.Math.max(i9, java.lang.Math.min(i2, i4));
            aH(1);
            this.I.a(iMax, iMax2);
        } else if (i2 != 0) {
            i5 = 0;
            int i10 = -i4;
            iMax = java.lang.Math.max(i10, java.lang.Math.min(i5, i4));
            iMax2 = java.lang.Math.max(i10, java.lang.Math.min(i2, i4));
            aH(1);
            this.I.a(iMax, iMax2);
        } else {
            iMax2 = 0;
            iMax = 0;
        }
        if (i != 0) {
            f = i;
            f2 = i6;
            if (!dispatchNestedPreFling(f, f2)) {
                return false;
            }
            if (!zAh || zAi) {
                z = true;
            } else {
                z = false;
            }
            dispatchNestedFling(f, f2, z);
            if (z) {
                return false;
            }
            int i11 = -i4;
            aH(1);
            this.I.a(java.lang.Math.max(i11, java.lang.Math.min(i, i4)), java.lang.Math.max(i11, java.lang.Math.min(i6, i4)));
        } else if (i6 != 0) {
            i = 0;
            f = i;
            f2 = i6;
            if (!dispatchNestedPreFling(f, f2)) {
                return false;
            }
            if (zAh) {
                z = true;
            } else {
                z = true;
            }
            dispatchNestedFling(f, f2, z);
            if (z) {
                return false;
            }
            int i12 = -i4;
            aH(1);
            this.I.a(java.lang.Math.max(i12, java.lang.Math.min(i, i4)), java.lang.Math.max(i12, java.lang.Math.min(i6, i4)));
        } else if (iMax == 0 && iMax2 == 0) {
            return false;
        }
        return true;
    }

    public final boolean ak() {
        return !this.s || this.y || this.g.k();
    }

    public final boolean al() {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.ar;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean am() {
        return this.as > 0;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0116  */
    /* JADX WARN: Code duplicated, block: B:36:0x013d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0142  */
    /* JADX WARN: Code duplicated, block: B:39:0x0169  */
    /* JADX WARN: Code duplicated, block: B:47:0x017b  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a7  */
    /* JADX WARN: Multi-variable type inference failed */
    final boolean an(int i, int i2, int i3, int i4, android.view.MotionEvent motionEvent, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        int i11;
        int i12;
        int i13;
        float f;
        boolean z2;
        x();
        if (this.m != null) {
            int[] iArr = this.R;
            iArr[0] = 0;
            iArr[1] = 0;
            V(i, i2, iArr);
            int i14 = iArr[0];
            int i15 = iArr[1];
            i8 = i - i14;
            i9 = i2 - i15;
            i7 = i15;
            i6 = i14;
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
        if (!this.p.isEmpty()) {
            invalidate();
        }
        int[] iArr2 = this.R;
        iArr2[0] = 0;
        iArr2[1] = 0;
        int[] iArr3 = this.aH;
        eo(i6, i7, i8, i9, iArr3, i5, iArr2);
        int i16 = iArr2[0];
        int i17 = i8 - i16;
        int i18 = iArr2[1];
        int i19 = i9 - i18;
        boolean z3 = (i16 == 0 && i18 == 0) ? false : true;
        int i20 = this.ay;
        int i21 = iArr3[0];
        this.ay = i20 - i21;
        int i22 = this.az;
        int i23 = iArr3[1];
        this.az = i22 - i23;
        int[] iArr4 = this.aI;
        iArr4[0] = iArr4[0] + i21;
        iArr4[1] = iArr4[1] + i23;
        if (motionEvent != null) {
            if (i6 != 0) {
                aN().p(motionEvent.getDeviceId(), motionEvent.getSource(), i3, i6);
            }
            if (i7 != 0) {
                aN().p(motionEvent.getDeviceId(), motionEvent.getSource(), i4, i7);
            }
        }
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || dzm.b(motionEvent, 8194)) {
                i10 = i6;
                z = true;
                i11 = 0;
            } else {
                float x = motionEvent.getX();
                float f2 = i17;
                float y = motionEvent.getY();
                float f3 = i19;
                if (f2 < 0.0f) {
                    E();
                    f = 0.0f;
                    i10 = i6;
                    dzm.e(this.A, (-f2) / getWidth(), 1.0f - (y / getHeight()));
                    aN().o(motionEvent.getDeviceId(), motionEvent.getSource(), i3, true);
                } else {
                    i10 = i6;
                    f = 0.0f;
                    if (f2 > 0.0f) {
                        F();
                        dzm.e(this.C, f2 / getWidth(), y / getHeight());
                        aN().o(motionEvent.getDeviceId(), motionEvent.getSource(), i3, false);
                    } else {
                        z2 = false;
                    }
                    if (f3 < f) {
                        G();
                        dzm.e(this.B, (-f3) / getHeight(), x / getWidth());
                        z = true;
                        aN().o(motionEvent.getDeviceId(), motionEvent.getSource(), i4, true);
                        i11 = 0;
                    } else {
                        z = true;
                        if (f3 > f) {
                            D();
                            dzm.e(this.D, f3 / getHeight(), 1.0f - (x / getWidth()));
                            i11 = 0;
                            aN().o(motionEvent.getDeviceId(), motionEvent.getSource(), i4, false);
                        } else {
                            i11 = 0;
                            if (!z2 || f2 != f || f3 != f) {
                            }
                            if (android.os.Build.VERSION.SDK_INT >= 31 && dzm.b(motionEvent, 4194304)) {
                                aD();
                            }
                        }
                    }
                    postInvalidateOnAnimation();
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        aD();
                    }
                }
                z2 = true;
                if (f3 < f) {
                    G();
                    dzm.e(this.B, (-f3) / getHeight(), x / getWidth());
                    z = true;
                    aN().o(motionEvent.getDeviceId(), motionEvent.getSource(), i4, true);
                    i11 = 0;
                } else {
                    z = true;
                    if (f3 > f) {
                        D();
                        dzm.e(this.D, f3 / getHeight(), 1.0f - (x / getWidth()));
                        i11 = 0;
                        aN().o(motionEvent.getDeviceId(), motionEvent.getSource(), i4, false);
                    } else {
                        i11 = 0;
                        if (!z2) {
                        }
                        if (android.os.Build.VERSION.SDK_INT >= 31) {
                            aD();
                        }
                    }
                }
                postInvalidateOnAnimation();
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    aD();
                }
            }
            w(i, i2);
        } else {
            i10 = i6;
            z = true;
            i11 = 0;
        }
        if (i10 == 0) {
            if (i7 != 0) {
                i12 = i11;
            } else {
                i13 = i11;
            }
            if (!awakenScrollBars()) {
                invalidate();
            }
            return (z3 && i13 == 0 && i7 == 0) ? i11 : z;
        }
        i12 = i10;
        C(i12, i7);
        i13 = i12;
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (z3) {
        }
    }

    public final void ap(defpackage.ld ldVar, int i) {
        if (!am()) {
            ldVar.a.setImportantForAccessibility(i);
        } else {
            ldVar.p = i;
            this.S.add(ldVar);
        }
    }

    public final void aq(int i, int i2, boolean z) {
        defpackage.kp kpVar = this.n;
        if (kpVar == null) {
            android.util.Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        if (true != kpVar.ah()) {
            i = 0;
        }
        if (true != this.n.ai()) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return;
            } else {
                i = 0;
            }
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            ar(i3, 1);
        }
        this.I.c(i, i2, Integer.MIN_VALUE, null);
    }

    public final void ar(int i, int i2) {
        aw().h(i, i2);
    }

    public final void as(kj kjVar) {
        defpackage.kp kpVar = this.n;
        if (kpVar != null) {
            kpVar.X("Cannot remove item decoration during a scroll  or layout");
        }
        java.util.ArrayList arrayList = this.p;
        arrayList.remove(kjVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        M();
        requestLayout();
    }

    public final void at(kj kjVar) {
        defpackage.kp kpVar = this.n;
        if (kpVar != null) {
            kpVar.X("Cannot add item decoration during a scroll  or layout");
        }
        java.util.ArrayList arrayList = this.p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(kjVar);
        M();
        requestLayout();
    }

    public final void au(li liVar) {
        if (this.M == null) {
            this.M = new java.util.ArrayList();
        }
        this.M.add(liVar);
    }

    public final int c(android.view.View view) {
        defpackage.ld ldVarI = i(view);
        if (ldVarI != null) {
            return ldVarI.a();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof defpackage.kq) && this.n.u((defpackage.kq) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        defpackage.kp kpVar = this.n;
        if (kpVar == null || !kpVar.ah()) {
            return 0;
        }
        return this.n.D(this.L);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        defpackage.kp kpVar = this.n;
        if (kpVar == null || !kpVar.ah()) {
            return 0;
        }
        return this.n.E(this.L);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        defpackage.kp kpVar = this.n;
        if (kpVar == null || !kpVar.ah()) {
            return 0;
        }
        return this.n.F(this.L);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        defpackage.kp kpVar = this.n;
        if (kpVar == null || !kpVar.ai()) {
            return 0;
        }
        return this.n.G(this.L);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        defpackage.kp kpVar = this.n;
        if (kpVar == null || !kpVar.ai()) {
            return 0;
        }
        return this.n.H(this.L);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        defpackage.kp kpVar = this.n;
        if (kpVar == null || !kpVar.ai()) {
            return 0;
        }
        return this.n.I(this.L);
    }

    final long d(defpackage.ld ldVar) {
        return this.m.c ? ldVar.e : ldVar.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        defpackage.kp kpVar = this.n;
        int iA = 0;
        if (kpVar != null) {
            if (kpVar.ai()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        aq(0, measuredHeight, false);
                        return true;
                    }
                    aq(0, -measuredHeight, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zAl = kpVar.al();
                    if (keyCode == 122) {
                        if (zAl) {
                            iA = this.m.a();
                        }
                    } else if (!zAl) {
                        iA = this.m.a();
                    }
                    ac(iA);
                    return true;
                }
            } else if (kpVar.ah()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        aq(measuredWidth, 0, false);
                        return true;
                    }
                    aq(-measuredWidth, 0, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zAl2 = kpVar.al();
                    if (keyCode2 == 122) {
                        if (zAl2) {
                            iA = this.m.a();
                        }
                    } else if (!zAl2) {
                        iA = this.m.a();
                    }
                    ac(iA);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return aw().c(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return aw().d(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return aw().e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return aw().f(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(android.util.SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(android.util.SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        boolean z;
        super.draw(canvas);
        java.util.ArrayList arrayList = this.p;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((kj) arrayList.get(i)).i(canvas, this);
        }
        android.widget.EdgeEffect edgeEffect = this.A;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            android.widget.EdgeEffect edgeEffect2 = this.A;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        android.widget.EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.i) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            android.widget.EdgeEffect edgeEffect4 = this.B;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        android.widget.EdgeEffect edgeEffect5 = this.C;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            android.widget.EdgeEffect edgeEffect6 = this.C;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        android.widget.EdgeEffect edgeEffect7 = this.D;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.i) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            android.widget.EdgeEffect edgeEffect8 = this.D;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if (z || (this.E != null && arrayList.size() > 0 && this.E.h())) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final android.graphics.Rect e(android.view.View view) {
        defpackage.kq kqVar = (defpackage.kq) view.getLayoutParams();
        if (!kqVar.e) {
            return kqVar.d;
        }
        defpackage.la laVar = this.L;
        if (laVar.g && (kqVar.eB() || kqVar.c.t())) {
            return kqVar.d;
        }
        android.graphics.Rect rect = kqVar.d;
        rect.set(0, 0, 0, 0);
        java.util.ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            android.graphics.Rect rect2 = this.k;
            rect2.set(0, 0, 0, 0);
            ((kj) arrayList.get(i)).a(rect2, view, this, laVar);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        kqVar.e = false;
        return rect;
    }

    public final int en(defpackage.ld ldVar) {
        if (ldVar.q(524) || !ldVar.s()) {
            return -1;
        }
        defpackage.hg hgVar = this.g;
        int i = ldVar.c;
        java.util.ArrayList arrayList = hgVar.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            hf hfVar = (hf) arrayList.get(i2);
            int i3 = hfVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = hfVar.b;
                    if (i4 <= i) {
                        int i5 = hfVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = hfVar.b;
                    if (i6 == i) {
                        i = hfVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (hfVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (hfVar.b <= i) {
                i += hfVar.d;
            }
        }
        return i;
    }

    public final void eo(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        aw().f(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void ep(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int i3 = defpackage.dzs.a;
        setMeasuredDimension(defpackage.kp.av(i, paddingLeft, getMinimumWidth()), defpackage.kp.av(i2, getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
    }

    public final defpackage.ld f(int i) {
        defpackage.ld ldVar = null;
        if (this.y) {
            return null;
        }
        int iB = this.h.b();
        for (int i2 = 0; i2 < iB; i2++) {
            defpackage.ld ldVarI = i(this.h.e(i2));
            if (ldVarI != null && !ldVarI.v() && en(ldVarI) == i) {
                if (!this.h.k(ldVarI.a)) {
                    return ldVarI;
                }
                ldVar = ldVarI;
            }
        }
        return ldVar;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0154 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0158 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x015a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0161  */
    /* JADX WARN: Code duplicated, block: B:112:0x017c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0182 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0185  */
    /* JADX WARN: Code duplicated, block: B:119:0x0187  */
    /* JADX WARN: Code duplicated, block: B:120:0x0189  */
    /* JADX WARN: Code duplicated, block: B:123:0x018d  */
    /* JADX WARN: Code duplicated, block: B:124:0x018f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0191  */
    /* JADX WARN: Code duplicated, block: B:127:0x0194  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ff  */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x015e, code lost:
    
        if (r5 > 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x017c, code lost:
    
        if (r14 > 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x017f, code lost:
    
        if (r5 < 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0182, code lost:
    
        if (r14 < 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x018a, code lost:
    
        if ((r14 * r13) <= 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0192, code lost:
    
        if ((r14 * r13) >= 0) goto L127;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:110:0x0161, please report this as an issue */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0035 A[SYNTHETIC] */
    public final defpackage.ld g(int i, boolean z) {
        int iB = this.h.b();
        defpackage.ld ldVar = null;
        for (int i2 = 0; i2 < iB; i2++) {
            defpackage.ld ldVarI = i(this.h.e(i2));
            if (ldVarI != null && !ldVarI.v()) {
                if (z) {
                    if (ldVarI.c != i) {
                        continue;
                    } else {
                        if (this.h.k(ldVarI.a)) {
                            return ldVarI;
                        }
                        ldVar = ldVarI;
                    }
                } else if (ldVarI.c() != i) {
                    continue;
                } else {
                    if (this.h.k(ldVarI.a)) {
                        return ldVarI;
                    }
                    ldVar = ldVarI;
                }
            }
        }
        return ldVar;
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        defpackage.kp kpVar = this.n;
        if (kpVar != null) {
            return kpVar.f();
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager".concat(l()));
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        defpackage.kp kpVar = this.n;
        if (kpVar != null) {
            return kpVar.h(getContext(), attributeSet);
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager".concat(l()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final java.lang.CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        if (this.n != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.i;
    }

    public final defpackage.ld h(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return i(view);
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bi(this, view, "View ", " is not a direct child of "));
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return aw().g(0);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.q;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.v;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return aw().a;
    }

    public final android.view.View k(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof android.view.View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent != this) {
            return null;
        }
        return view;
    }

    public final java.lang.String l() {
        return " " + super.toString() + ", adapter:" + this.m + ", layout:" + this.n + ", context:" + getContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.as = 0;
        this.q = true;
        this.s = this.s && !isLayoutRequested();
        this.e.d();
        defpackage.kp kpVar = this.n;
        if (kpVar != null) {
            kpVar.aK(this);
        }
        this.P = false;
        java.lang.ThreadLocal threadLocal = defpackage.jl.a;
        defpackage.jl jlVar = (defpackage.jl) threadLocal.get();
        this.J = jlVar;
        if (jlVar == null) {
            this.J = new defpackage.jl();
            int i = defpackage.dzs.a;
            android.view.Display display = getDisplay();
            float f = 60.0f;
            if (!isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            defpackage.jl jlVar2 = this.J;
            jlVar2.e = (long) (1.0E9f / f);
            threadLocal.set(jlVar2);
        }
        this.J.c.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        defpackage.km kmVar = this.E;
        if (kmVar != null) {
            kmVar.c();
        }
        ag();
        this.q = false;
        defpackage.kp kpVar = this.n;
        if (kpVar != null) {
            kpVar.bv(this);
        }
        this.S.clear();
        removeCallbacks(this.aJ);
        while (defpackage.mb.a.a() != null) {
        }
        defpackage.kt ktVar = this.e;
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = ktVar.c;
            if (i >= arrayList.size()) {
                break;
            }
            defpackage.eaw.b(((defpackage.ld) arrayList.get(i)).a);
            i++;
        }
        ktVar.e(ktVar.f.m, false);
        java.util.Iterator itA = defpackage.dzl.b(this).a();
        while (itA.hasNext()) {
            defpackage.eaw.f((android.view.View) itA.next()).al();
        }
        defpackage.jl jlVar = this.J;
        if (jlVar != null) {
            jlVar.c.remove(this);
            this.J = null;
        }
        removeCallbacks(this.al);
        this.t = false;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        java.util.ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((kj) arrayList.get(i)).b(canvas, this);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r0v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v0 ??, new type: android.support.v7.widget.RecyclerView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v0 ??, new type: android.support.v7.widget.RecyclerView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v1 ??, new type: android.support.v7.widget.RecyclerView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v4 ??, new type: android.support.v7.widget.RecyclerView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v5 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 'this'  ??, new type: android.support.v7.widget.RecyclerView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v20 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v21 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v22 ??, new type: jl
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v23 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v24 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v26 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v19 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v10 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v13 ??, new type: android.widget.OverScroller
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v19 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r18v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 'this'  ??, new type: android.support.v7.widget.RecyclerView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v15 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.v) {
            return false;
        }
        this.ak = null;
        if (aJ(motionEvent)) {
            ax();
            android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            java.util.ArrayList arrayList = this.aj;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                kr krVar = (kr) arrayList.get(i);
                if (krVar != null && krVar != this.ak) {
                    krVar.j(motionEventObtain);
                }
            }
        } else {
            defpackage.kp kpVar = this.n;
            if (kpVar == null) {
                return false;
            }
            boolean zAh = kpVar.ah();
            boolean zAi = this.n.ai();
            android.view.VelocityTracker velocityTrackerObtain = this.av;
            if (velocityTrackerObtain == null) {
                velocityTrackerObtain = android.view.VelocityTracker.obtain();
                this.av = velocityTrackerObtain;
            }
            velocityTrackerObtain.addMovement(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                if (this.ap) {
                    this.ap = false;
                }
                this.au = motionEvent.getPointerId(0);
                int x = (int) (motionEvent.getX() + 0.5f);
                this.ay = x;
                this.aw = x;
                int y = (int) (motionEvent.getY() + 0.5f);
                this.az = y;
                this.ax = y;
                android.widget.EdgeEffect edgeEffect = this.A;
                if (edgeEffect == null || dzm.d(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                    z = false;
                } else {
                    dzm.e(this.A, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                    z = true;
                }
                android.widget.EdgeEffect edgeEffect2 = this.C;
                if (edgeEffect2 != null && dzm.d(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                    dzm.e(this.C, 0.0f, motionEvent.getY() / getHeight());
                    z = true;
                }
                android.widget.EdgeEffect edgeEffect3 = this.B;
                if (edgeEffect3 != null && dzm.d(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                    dzm.e(this.B, 0.0f, motionEvent.getX() / getWidth());
                    z = true;
                }
                android.widget.EdgeEffect edgeEffect4 = this.D;
                if (edgeEffect4 == null || dzm.d(edgeEffect4) == 0.0f || canScrollVertically(1)) {
                    if (z || this.F == 2) {
                    }
                    int[] iArr = this.aI;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    aH(0);
                } else {
                    dzm.e(this.D, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                ab(1);
                af(1);
                int[] iArr2 = this.aI;
                iArr2[1] = 0;
                iArr2[0] = 0;
                aH(0);
            } else if (actionMasked == 1) {
                this.av.clear();
                af(0);
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.au);
                if (iFindPointerIndex < 0) {
                    android.util.Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.au + " not found. Did any MotionEvents get skipped?");
                    return false;
                }
                float x2 = motionEvent.getX(iFindPointerIndex) + 0.5f;
                float y2 = motionEvent.getY(iFindPointerIndex) + 0.5f;
                if (this.F != 1) {
                    int i2 = (int) y2;
                    int i3 = (int) x2;
                    int i4 = i3 - this.aw;
                    int i5 = i2 - this.ax;
                    if (!zAh || java.lang.Math.abs(i4) <= this.aA) {
                        z2 = false;
                    } else {
                        this.ay = i3;
                        z2 = true;
                    }
                    if (zAi && java.lang.Math.abs(i5) > this.aA) {
                        this.az = i2;
                    } else if (z2) {
                    }
                    ab(1);
                }
            } else if (actionMasked == 3) {
                ax();
            } else if (actionMasked == 5) {
                this.au = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.ay = x3;
                this.aw = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.az = y3;
                this.ax = y3;
            } else if (actionMasked == 6) {
                aB(motionEvent);
            }
            if (this.F != 1) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.os.Trace.beginSection("RV OnLayout");
        A();
        android.os.Trace.endSection();
        this.s = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        defpackage.kp kpVar = this.n;
        if (kpVar == null) {
            ep(i, i2);
            return;
        }
        boolean z = false;
        if (kpVar.aj()) {
            int mode = android.view.View.MeasureSpec.getMode(i);
            int mode2 = android.view.View.MeasureSpec.getMode(i2);
            defpackage.kp kpVar2 = this.n;
            defpackage.la laVar = this.L;
            kpVar2.bt(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.aK = z;
            if (z || this.m == null) {
                return;
            }
            if (laVar.d == 1) {
                ay();
            }
            this.n.aZ(i, i2);
            laVar.i = true;
            az();
            this.n.bb(i, i2);
            if (this.n.an()) {
                this.n.aZ(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                laVar.i = true;
                az();
                this.n.bb(i, i2);
            }
            this.aL = getMeasuredWidth();
            this.aM = getMeasuredHeight();
            return;
        }
        if (this.r) {
            kpVar.bt(i, i2);
            return;
        }
        if (this.w) {
            ad();
            O();
            aC();
            P(true);
            defpackage.la laVar2 = this.L;
            if (laVar2.k) {
                laVar2.g = true;
            } else {
                this.g.d();
                laVar2.g = false;
            }
            this.w = false;
            ae(false);
        } else if (this.L.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        defpackage.kh khVar = this.m;
        defpackage.la laVar3 = this.L;
        if (khVar != null) {
            laVar3.e = khVar.a();
        } else {
            laVar3.e = 0;
        }
        ad();
        defpackage.kp kpVar3 = this.n;
        defpackage.la laVar4 = this.L;
        kpVar3.bt(i, i2);
        ae(false);
        laVar4.g = false;
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, android.graphics.Rect rect) {
        removeCallbacks(this.al);
        this.t = false;
        if (am()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof android.support.v7.widget.RecyclerView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        android.support.v7.widget.RecyclerView.SavedState savedState = (android.support.v7.widget.RecyclerView.SavedState) parcelable;
        this.f = savedState;
        super.onRestoreInstanceState(savedState.d);
        requestLayout();
    }

    @Override // android.view.View
    protected final android.os.Parcelable onSaveInstanceState() {
        android.support.v7.widget.RecyclerView.SavedState savedState = new android.support.v7.widget.RecyclerView.SavedState(super.onSaveInstanceState());
        android.support.v7.widget.RecyclerView.SavedState savedState2 = this.f;
        if (savedState2 != null) {
            savedState.a = savedState2.a;
        } else {
            defpackage.kp kpVar = this.n;
            savedState.a = kpVar != null ? kpVar.Q() : null;
        }
        return savedState;
    }

    public final boolean onScrollToTop(int i) {
        defpackage.kp kpVar;
        if (!this.aE || (kpVar = this.n) == null || !kpVar.ai() || !canScrollVertically(-1)) {
            return false;
        }
        ac(0);
        return true;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        J();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fe  */
    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        int i;
        int iMin;
        int i2 = 0;
        if (this.v || this.ap) {
            return false;
        }
        kr krVar = this.ak;
        if (krVar == null) {
            if (motionEvent.getAction() == 0 || !aJ(motionEvent)) {
                defpackage.kp kpVar = this.n;
                if (kpVar == null) {
                    return false;
                }
                boolean zAh = kpVar.ah();
                boolean zAi = this.n.ai();
                if (this.av == null) {
                    this.av = android.view.VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    int[] iArr = this.aI;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    actionMasked = 0;
                }
                android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
                int[] iArr2 = this.aI;
                motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.av.addMovement(motionEventObtain);
                        android.view.VelocityTracker velocityTracker = this.av;
                        int i3 = this.aC;
                        velocityTracker.computeCurrentVelocity(1000, i3);
                        float f = zAh ? -this.av.getXVelocity(this.au) : 0.0f;
                        float f2 = zAi ? -this.av.getYVelocity(this.au) : 0.0f;
                        if ((f == 0.0f && f2 == 0.0f) || !aj((int) f, (int) f2, this.aB, i3)) {
                            ab(0);
                        }
                        aG();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.au);
                        if (iFindPointerIndex < 0) {
                            android.util.Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.au + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        float x = motionEvent.getX(iFindPointerIndex) + 0.5f;
                        float y = motionEvent.getY(iFindPointerIndex) + 0.5f;
                        int i4 = (int) x;
                        int i5 = this.ay - i4;
                        int i6 = (int) y;
                        int i7 = this.az - i6;
                        if (this.F != 1) {
                            if (zAh) {
                                int i8 = this.aA;
                                int iMax = i5 > 0 ? java.lang.Math.max(0, i5 - i8) : java.lang.Math.min(0, i5 + i8);
                                i5 = iMax;
                                if (iMax != 0) {
                                    zAh = true;
                                } else {
                                    z = false;
                                    zAh = true;
                                }
                                if (zAi) {
                                    i = this.aA;
                                    if (i7 > 0) {
                                        iMin = java.lang.Math.max(0, i7 - i);
                                    } else {
                                        iMin = java.lang.Math.min(0, i7 + i);
                                    }
                                    i7 = iMin;
                                    if (iMin != 0) {
                                        z = true;
                                        zAi = true;
                                    } else {
                                        zAi = true;
                                    }
                                } else {
                                    zAi = false;
                                }
                                if (z) {
                                    ab(1);
                                }
                            } else {
                                zAh = false;
                            }
                            z = zAh;
                            if (zAi) {
                                i = this.aA;
                                if (i7 > 0) {
                                    iMin = java.lang.Math.max(0, i7 - i);
                                } else {
                                    iMin = java.lang.Math.min(0, i7 + i);
                                }
                                i7 = iMin;
                                if (iMin != 0) {
                                    z = true;
                                    zAi = true;
                                } else {
                                    zAi = true;
                                }
                            } else {
                                zAi = false;
                            }
                            if (z) {
                                ab(1);
                            }
                        }
                        boolean z2 = zAh;
                        boolean z3 = zAi;
                        if (this.F == 1) {
                            int[] iArr3 = this.R;
                            iArr3[0] = 0;
                            iArr3[1] = 0;
                            int iA = i5 - a(i5, motionEvent.getY());
                            int iAv = i7 - av(i7, motionEvent.getX());
                            int i9 = true != z2 ? 0 : iA;
                            int i10 = true != z3 ? 0 : iAv;
                            int[] iArr4 = this.aH;
                            if (ai(i9, i10, iArr3, iArr4, 0)) {
                                iA -= iArr3[0];
                                iAv -= iArr3[1];
                                iArr2[0] = iArr2[0] + iArr4[0];
                                iArr2[1] = iArr2[1] + iArr4[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i11 = iAv;
                            this.ay = i4 - iArr4[0];
                            this.az = i6 - iArr4[1];
                            if (an(true != z2 ? 0 : iA, true != z3 ? 0 : i11, 0, 1, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            defpackage.jl jlVar = this.J;
                            if (jlVar != null) {
                                if (iA != 0) {
                                    i2 = iA;
                                } else if (i11 != 0) {
                                }
                                jlVar.a(this, i2, i11);
                            }
                        }
                    } else if (actionMasked == 3) {
                        ax();
                    } else if (actionMasked == 5) {
                        this.au = motionEvent.getPointerId(actionIndex);
                        int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.ay = x2;
                        this.aw = x2;
                        int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.az = y2;
                        this.ax = y2;
                    } else if (actionMasked == 6) {
                        aB(motionEvent);
                    }
                    motionEventObtain.recycle();
                } else {
                    this.au = motionEvent.getPointerId(0);
                    int x3 = (int) (motionEvent.getX() + 0.5f);
                    this.ay = x3;
                    this.aw = x3;
                    int y3 = (int) (motionEvent.getY() + 0.5f);
                    this.az = y3;
                    this.ax = y3;
                    aH(0);
                }
                this.av.addMovement(motionEventObtain);
                motionEventObtain.recycle();
            }
            return true;
        }
        krVar.k(motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.ak = null;
        }
        ax();
        return true;
    }

    public final void r(defpackage.ld ldVar) {
        android.view.View view = ldVar.a;
        android.view.ViewParent parent = view.getParent();
        this.e.l(h(view));
        if (ldVar.x()) {
            this.h.g(view, -1, view.getLayoutParams(), true);
            return;
        }
        defpackage.ip ipVar = this.h;
        if (parent != this) {
            ipVar.f(view, -1, true);
            return;
        }
        int iE = ipVar.e.E(view);
        if (iE < 0) {
            java.util.Objects.toString(view);
            throw new java.lang.IllegalArgumentException("view is not a child, cannot hide ".concat(view.toString()));
        }
        ipVar.a.e(iE);
        ipVar.i(view);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(android.view.View view, boolean z) {
        defpackage.ld ldVarI = i(view);
        if (ldVarI != null) {
            if (ldVarI.x()) {
                ldVarI.j();
            } else if (!ldVarI.A()) {
                throw new java.lang.IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + ldVarI + l());
            }
        }
        view.clearAnimation();
        z(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(android.view.View view, android.view.View view2) {
        if (!this.n.be() && !am() && view2 != null) {
            aE(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z) {
        if (android.os.Build.VERSION.SDK_INT < 36 || li.b() < 3700001) {
            return this.n.bf(this, view, rect, z, false);
        }
        android.graphics.Rect rect2 = this.ai;
        if (rect2 == null) {
            rect2 = new android.graphics.Rect();
            this.ai = rect2;
        }
        android.graphics.Rect rect3 = rect2;
        rect3.set(rect);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof defpackage.kq) {
            defpackage.kq kqVar = (defpackage.kq) layoutParams;
            if (!kqVar.e) {
                android.graphics.Rect rect4 = kqVar.d;
                rect3.offset(-view.getScrollX(), -view.getScrollY());
                if (rect3.left <= 0) {
                    rect3.left -= rect4.left;
                }
                if (rect3.right >= view.getWidth()) {
                    rect3.right += rect4.right;
                }
                if (rect3.top <= 0) {
                    rect3.top -= rect4.top;
                }
                if (rect3.bottom >= view.getHeight()) {
                    rect3.bottom += rect4.bottom;
                }
                rect3.offset(view.getScrollX(), view.getScrollY());
            }
        }
        return this.n.bf(this, view, rect3, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        java.util.ArrayList arrayList = this.aj;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((kr) arrayList.get(i)).c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, android.graphics.Rect rect) {
        if (!this.t) {
            return super.requestFocus(i, rect);
        }
        removeCallbacks(this.al);
        this.t = false;
        android.view.View viewEG = null;
        if (this.m != null && this.n != null && !am() && !this.v) {
            x();
            viewEG = this.n.eG(i, this.e, this.L);
        }
        if ((viewEG != null && viewEG.requestFocus(i, rect)) || super.requestFocus(i, rect)) {
            return true;
        }
        this.an = true;
        try {
            android.view.View viewFocusSearch = super.focusSearch(getRootView().findFocus(), i);
            if (viewFocusSearch != null) {
                viewFocusSearch.requestFocus(i, rect);
            }
            return true;
        } finally {
            this.an = false;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.ao != 0 || this.v) {
            this.u = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(kr krVar) {
        this.aj.add(krVar);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        defpackage.kp kpVar = this.n;
        if (kpVar == null) {
            android.util.Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        boolean zAh = kpVar.ah();
        boolean zAi = this.n.ai();
        if (!zAh) {
            if (!zAi) {
                return;
            } else {
                zAi = true;
            }
        }
        an(true != zAh ? 0 : i, true != zAi ? 0 : i2, -1, -1, null, 0);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        android.util.Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (!am()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.aq |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.i) {
            J();
        }
        this.i = z;
        super.setClipToPadding(z);
        if (this.s) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @java.lang.Deprecated
    public final void setLayoutTransition(android.animation.LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new java.lang.IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        aw().a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return aw().h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        aw().b(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.v) {
            t("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                onTouchEvent(android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.v = true;
                this.ap = true;
                ag();
                return;
            }
            this.v = false;
            if (this.u && this.n != null && this.m != null) {
                requestLayout();
            }
            this.u = false;
        }
    }

    public final void t(java.lang.String str) {
        if (am()) {
            if (str != null) {
                throw new java.lang.IllegalStateException(str);
            }
            throw new java.lang.IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(l()));
        }
        if (this.at > 0) {
            android.util.Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new java.lang.IllegalStateException("".concat(l())));
        }
    }

    final void v() {
        int iB = this.h.b();
        for (int i = 0; i < iB; i++) {
            android.view.View viewE = this.h.e(i);
            defpackage.ld ldVar = viewE == null ? null : ((defpackage.kq) viewE.getLayoutParams()).c;
            if (!ldVar.A()) {
                ldVar.g();
            }
        }
        defpackage.kt ktVar = this.e;
        java.util.ArrayList arrayList = ktVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((defpackage.ld) arrayList.get(i2)).g();
        }
        java.util.ArrayList arrayList2 = ktVar.a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((defpackage.ld) arrayList2.get(i3)).g();
        }
        java.util.ArrayList arrayList3 = ktVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((defpackage.ld) ktVar.b.get(i4)).g();
            }
        }
    }

    public final void w(int i, int i2) {
        android.widget.EdgeEffect edgeEffect = this.A;
        boolean zIsFinished = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.A.onRelease();
            zIsFinished = this.A.isFinished();
        }
        android.widget.EdgeEffect edgeEffect2 = this.C;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.C.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.B.onRelease();
            zIsFinished |= this.B.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.D.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void x() {
        if (!this.s || this.y) {
            android.os.Trace.beginSection("RV FullInvalidate");
            A();
            android.os.Trace.endSection();
            return;
        }
        if (this.g.k()) {
            if (!this.g.j(4) || this.g.j(11)) {
                if (this.g.k()) {
                    android.os.Trace.beginSection("RV FullInvalidate");
                    A();
                    android.os.Trace.endSection();
                    return;
                }
                return;
            }
            android.os.Trace.beginSection("RV PartialInvalidate");
            ad();
            O();
            this.g.f();
            if (!this.u) {
                int iA = this.h.a();
                for (int i = 0; i < iA; i++) {
                    defpackage.ld ldVarI = i(this.h.d(i));
                    if (ldVarI != null && !ldVarI.A() && ldVarI.y()) {
                        A();
                    }
                }
                this.g.c();
            }
            ae(true);
            P(true);
            android.os.Trace.endSection();
        }
    }

    public final void z(android.view.View view) {
        defpackage.ld ldVarI = i(view);
        defpackage.kh khVar = this.m;
        if (khVar != null && ldVarI != null) {
            khVar.p(ldVarI);
        }
        java.util.List list = this.x;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            mj mjVar = (mj) this.x.get(size);
            defpackage.ld ldVarH = mjVar.p.h(view);
            if (ldVarH != null) {
                defpackage.ld ldVar = mjVar.b;
                if (ldVar == null || ldVarH != ldVar) {
                    mjVar.e(ldVarH, false);
                    if (mjVar.a.remove(ldVarH.a)) {
                        mf mfVar = mjVar.l;
                        mf.f(ldVarH);
                    }
                } else {
                    mjVar.g((defpackage.ld) null, 0);
                }
            }
        }
    }

    /* JADX INFO: compiled from: PG */
    public class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.kw(0);
        android.os.Parcelable a;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readParcelable(classLoader == null ? defpackage.kp.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.a, 0);
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        defpackage.kp kpVar = this.n;
        if (kpVar != null) {
            return kpVar.eF(layoutParams);
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager".concat(l()));
    }

    public RecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130970282);
    }

    public RecyclerView(android.content.Context context) {
        this(context, null);
    }
}
