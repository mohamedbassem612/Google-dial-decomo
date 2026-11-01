package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class afwq extends android.view.ViewGroup implements defpackage.gg {
    public int A;
    public int B;
    public int C;
    public defpackage.agal D;
    public boolean E;
    public android.content.res.ColorStateList F;
    public defpackage.afws G;
    public defpackage.afwo H;
    public boolean I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public final android.graphics.Rect O;
    private final android.view.View.OnClickListener Q;
    private defpackage.dxz R;
    private final android.util.SparseArray S;
    private android.content.res.ColorStateList T;
    private final android.content.res.ColorStateList U;
    private int V;
    private android.view.MenuItem W;
    public final defpackage.glh b;
    public int c;
    public int d;
    public defpackage.afwp[] e;
    public int f;
    public int g;
    public int h;
    public android.content.res.ColorStateList i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public android.content.res.ColorStateList o;
    public int p;
    public final android.util.SparseArray q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public int z;
    private static final int[] a = {android.R.attr.state_checked};
    private static final int[] P = {-16842910};

    public afwq(android.content.Context context) {
        super(context);
        this.S = new android.util.SparseArray();
        this.f = -1;
        this.g = -1;
        this.q = new android.util.SparseArray();
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.C = 49;
        this.E = false;
        this.K = 1;
        this.V = 0;
        this.W = null;
        this.M = 7;
        this.N = false;
        this.O = new android.graphics.Rect();
        this.U = k();
        if (isInEditMode()) {
            this.b = null;
        } else {
            defpackage.glh glhVar = new defpackage.glh(null);
            this.b = glhVar;
            glhVar.U(0);
            glhVar.H(android.widget.TextView.class);
            glhVar.K(defpackage.agab.v(getContext().getTheme(), 2130970061, getResources().getInteger(2131492995)));
            glhVar.L(defpackage.agab.C(getContext(), 2130970074, defpackage.afpc.b));
            glhVar.S(new defpackage.afvj());
        }
        this.Q = new defpackage.afun(this, 2);
        setImportantForAccessibility(1);
    }

    private final defpackage.afwm l(int i, defpackage.fv fvVar, boolean z, boolean z2) {
        defpackage.afpu afpuVar;
        this.G.b = true;
        fvVar.setCheckable(true);
        this.G.b = false;
        defpackage.dxz dxzVar = this.R;
        defpackage.afwm afwmVarB = dxzVar != null ? (defpackage.afwm) dxzVar.a() : null;
        if (afwmVarB == null) {
            afwmVarB = b(getContext());
        }
        afwmVarB.H(z);
        afwmVarB.E(this.K);
        afwmVarB.w(this.T);
        afwmVarB.v(this.h);
        afwmVarB.L(this.U);
        afwmVarB.K(this.j);
        afwmVarB.I(this.k);
        afwmVarB.t(this.l);
        afwmVarB.s(this.m);
        afwmVarB.J(this.n);
        afwmVarB.L(this.i);
        int i2 = this.r;
        if (i2 != -1) {
            afwmVarB.B(i2);
        }
        int i3 = this.s;
        if (i3 != -1) {
            afwmVarB.A(i3);
        }
        afwmVarB.G(this.I);
        afwmVarB.D(this.J);
        int i4 = this.t;
        if (i4 != -1) {
            afwmVarB.m(i4);
        }
        int i5 = this.u;
        if (i5 != -1) {
            afwmVarB.u(i5);
        }
        afwmVarB.p(this.w);
        afwmVarB.l(this.x);
        afwmVarB.k(this.y);
        afwmVarB.i(this.z);
        afwmVarB.n(this.A);
        afwmVarB.y(this.C);
        afwmVarB.q = this.O;
        afwmVarB.j(this.B);
        afwmVarB.g(d());
        afwmVarB.l = this.E;
        afwmVarB.h(this.v);
        afwmVarB.x(this.p);
        afwmVarB.C(this.o);
        afwmVarB.F(this.c);
        afwmVarB.z(this.d);
        afwmVarB.p = z2;
        afwmVarB.N();
        afwmVarB.fi(this.L);
        afwmVarB.f(fvVar);
        int i6 = fvVar.a;
        afwmVarB.setOnTouchListener((android.view.View.OnTouchListener) this.S.get(i6));
        afwmVarB.setOnClickListener(this.Q);
        int i7 = this.f;
        if (i7 != 0 && i6 == i7) {
            this.g = i;
        }
        int id = afwmVarB.getId();
        if (id != -1 && (afpuVar = (defpackage.afpu) this.q.get(id)) != null) {
            afwmVarB.q(afpuVar);
        }
        return afwmVarB;
    }

    @Override // defpackage.gg
    public final void a(defpackage.ft ftVar) {
        this.H = new defpackage.afwo(ftVar);
    }

    protected abstract defpackage.afwm b(android.content.Context context);

    public final int c() {
        return this.L ? this.H.c : java.lang.Math.min(this.M, this.H.d);
    }

    public final android.graphics.drawable.Drawable d() {
        if (this.D == null || this.F == null) {
            return null;
        }
        defpackage.agaf agafVar = new defpackage.agaf(this.D);
        agafVar.R(this.F);
        return agafVar;
    }

    public final defpackage.afwm e(int i) {
        defpackage.afwp[] afwpVarArr = this.e;
        if (afwpVarArr != null) {
            for (defpackage.afwp afwpVar : afwpVarArr) {
                if (afwpVar instanceof defpackage.afwm) {
                    defpackage.afwm afwmVar = (defpackage.afwm) afwpVar;
                    if (afwmVar.getId() == i) {
                        return afwmVar;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        afwi afwiVarL;
        removeAllViews();
        defpackage.afwp[] afwpVarArr = this.e;
        if (afwpVarArr != null && this.R != null) {
            for (defpackage.afwp afwpVar : afwpVarArr) {
                if (afwpVar instanceof defpackage.afwm) {
                    defpackage.afwm afwmVar = (defpackage.afwm) afwpVar;
                    this.R.b(afwmVar);
                    afwmVar.d();
                    afwmVar.h = null;
                    afwmVar.i = 0.0f;
                    afwmVar.a = false;
                }
            }
        }
        this.G.b = true;
        this.H.c();
        this.G.b = false;
        int i = this.H.b;
        if (i == 0) {
            this.f = 0;
            this.g = 0;
            this.e = null;
            this.R = null;
            return;
        }
        if (this.R == null || this.V != i) {
            this.V = i;
            this.R = new defpackage.dyb(i);
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i2 = 0; i2 < this.H.a(); i2++) {
            hashSet.add(java.lang.Integer.valueOf(this.H.b(i2).getItemId()));
        }
        int i3 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.q;
            if (i3 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i3);
            if (!hashSet.contains(java.lang.Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i3++;
        }
        int iA = this.H.a();
        this.e = new defpackage.afwp[iA];
        boolean zJ = j(this.c, c());
        int i4 = 0;
        int size = 0;
        for (int i5 = 0; i5 < iA; i5++) {
            android.view.MenuItem menuItemB = this.H.b(i5);
            boolean z = menuItemB instanceof defpackage.afwf;
            if (z) {
                afwiVarL = new afwi(getContext());
                afwiVarL.a = true;
                afwiVarL.d();
                afwiVarL.b(this.N);
            } else if (menuItemB.hasSubMenu()) {
                if (size > 0) {
                    throw new java.lang.IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
                afwiVarL = new afwu(getContext());
                int i6 = this.m;
                if (i6 == 0) {
                    i6 = this.k;
                }
                android.widget.TextView textView = ((afwu) afwiVarL).a;
                textView.setTextAppearance(i6);
                android.content.res.ColorStateList colorStateList = ((afwu) afwiVarL).c;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                android.content.res.ColorStateList colorStateList2 = this.i;
                ((afwu) afwiVarL).c = colorStateList2;
                if (colorStateList2 != null) {
                    textView.setTextColor(colorStateList2);
                }
                ((afwu) afwiVarL).b = true;
                afwiVarL.b();
                afwiVarL.f((defpackage.fv) menuItemB);
                size = menuItemB.getSubMenu().size();
            } else if (size > 0) {
                afwiVarL = l(i5, (defpackage.fv) menuItemB, zJ, true);
                size--;
            } else {
                afwiVarL = l(i5, (defpackage.fv) menuItemB, zJ, i4 >= this.M);
                i4++;
            }
            if (!z && menuItemB.isCheckable() && this.g == -1) {
                this.g = i5;
            }
            this.e[i5] = afwiVarL;
            addView(afwiVarL);
        }
        int iMin = java.lang.Math.min(iA - 1, this.g);
        this.g = iMin;
        g(this.e[iMin].a());
    }

    public final void g(android.view.MenuItem menuItem) {
        if (this.W == menuItem || !menuItem.isCheckable()) {
            return;
        }
        android.view.MenuItem menuItem2 = this.W;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.W.setChecked(false);
        }
        menuItem.setChecked(true);
        this.W = menuItem;
    }

    public final void h(android.content.res.ColorStateList colorStateList) {
        this.T = colorStateList;
        defpackage.afwp[] afwpVarArr = this.e;
        if (afwpVarArr != null) {
            for (defpackage.afwp afwpVar : afwpVarArr) {
                if (afwpVar instanceof defpackage.afwm) {
                    ((defpackage.afwm) afwpVar).w(colorStateList);
                }
            }
        }
    }

    public final void i(int i) {
        this.C = i;
        defpackage.afwp[] afwpVarArr = this.e;
        if (afwpVarArr != null) {
            for (defpackage.afwp afwpVar : afwpVarArr) {
                if (afwpVar instanceof defpackage.afwm) {
                    ((defpackage.afwm) afwpVar).y(i);
                }
            }
        }
    }

    protected final boolean j(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    public final android.content.res.ColorStateList k() {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (getContext().getTheme().resolveAttribute(android.R.attr.textColorSecondary, typedValue, true)) {
            android.content.Context context = getContext();
            android.content.res.ColorStateList colorStateListA = defpackage.dwk.a(context.getResources(), typedValue.resourceId, context.getTheme());
            if (getContext().getTheme().resolveAttribute(2130969072, typedValue, true)) {
                int i = typedValue.data;
                int defaultColor = colorStateListA.getDefaultColor();
                int[] iArr = P;
                return new android.content.res.ColorStateList(new int[][]{iArr, a, EMPTY_STATE_SET}, new int[]{colorStateListA.getColorForState(iArr, defaultColor), i, defaultColor});
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new ebd(accessibilityNodeInfo).u(ni.t(1, c(), 1));
    }
}
