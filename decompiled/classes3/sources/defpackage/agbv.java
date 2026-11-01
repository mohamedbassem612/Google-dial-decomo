package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class agbv {
    private final android.animation.TimeInterpolator A;
    private defpackage.agbs B;
    private java.util.List D;
    private final android.view.accessibility.AccessibilityManager E;
    public final int c;
    public final int d;
    public final int e;
    public final android.animation.TimeInterpolator f;
    public final android.animation.TimeInterpolator g;
    public final android.view.ViewGroup h;
    public final android.content.Context i;
    public final defpackage.agbu j;
    public int k;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public com.google.android.material.snackbar.BaseTransientBottomBar$Behavior t;
    public final com.google.android.material.snackbar.SnackbarContentLayout u;
    private static final android.animation.TimeInterpolator w = afpc.b;
    private static final android.animation.TimeInterpolator x = afpc.a;
    private static final android.animation.TimeInterpolator y = afpc.d;
    private static final int[] z = {2130970407};
    public static final java.lang.String b = "agbv";
    static final android.os.Handler a = new android.os.Handler(android.os.Looper.getMainLooper(), new defpackage.agbo());
    public final boolean l = false;
    private final java.lang.Runnable C = new defpackage.aflt(this, 16);
    public final defpackage.aprf v = new defpackage.aprf(this, (byte[]) null);

    protected agbv(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view, com.google.android.material.snackbar.SnackbarContentLayout snackbarContentLayout) {
        if (view == null) {
            throw new java.lang.IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout == null) {
            throw new java.lang.IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.h = viewGroup;
        this.u = snackbarContentLayout;
        this.i = context;
        afvl.e(context, afvl.a, "Theme.AppCompat");
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(z);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        defpackage.agbu agbuVar = (defpackage.agbu) layoutInflaterFrom.inflate(resourceId != -1 ? 2131624328 : 2131624128, viewGroup, false);
        this.j = agbuVar;
        agbuVar.a = this;
        float f = agbuVar.d;
        if (f != 1.0f) {
            com.google.android.material.snackbar.SnackbarContentLayout snackbarContentLayout2 = (com.google.android.material.snackbar.SnackbarContentLayout) view;
            snackbarContentLayout2.b.setTextColor(agab.ab(agab.X(view, 2130969105), snackbarContentLayout2.b.getCurrentTextColor(), f));
        }
        ((com.google.android.material.snackbar.SnackbarContentLayout) view).d = agbuVar.e;
        agbuVar.addView(view);
        agbuVar.setAccessibilityLiveRegion(1);
        agbuVar.setImportantForAccessibility(1);
        agbuVar.setFitsSystemWindows(true);
        defpackage.agbp agbpVar = new defpackage.agbp(this);
        int i = dzs.a;
        dzk.o(agbuVar, agbpVar);
        dzs.i(agbuVar, new defpackage.agbq(this));
        this.E = (android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility");
        this.e = agab.u(context, 2130970055, 250);
        this.c = agab.u(context, 2130970055, 150);
        this.d = agab.u(context, 2130970058, 75);
        this.A = agab.C(context, 2130970071, x);
        this.g = agab.C(context, 2130970071, y);
        this.f = agab.C(context, 2130970071, w);
    }

    public int a() {
        throw null;
    }

    public final int b() {
        defpackage.agbu agbuVar = this.j;
        int height = agbuVar.getHeight();
        android.view.ViewGroup.LayoutParams layoutParams = agbuVar.getLayoutParams();
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? height + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public final android.animation.ValueAnimator c(float... fArr) {
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.A);
        valueAnimatorOfFloat.addUpdateListener(new defpackage.afvi(this, 2));
        return valueAnimatorOfFloat;
    }

    public final android.view.View d() {
        defpackage.agbs agbsVar = this.B;
        if (agbsVar == null) {
            return null;
        }
        return (android.view.View) agbsVar.a.get();
    }

    public final void e(int i) {
        defpackage.agcb agcbVarA = defpackage.agcb.a();
        java.lang.Object obj = agcbVarA.a;
        defpackage.aprf aprfVar = this.v;
        synchronized (obj) {
            if (agcbVarA.g(aprfVar)) {
                agcbVarA.d(agcbVarA.c, i);
            } else if (agcbVarA.h(aprfVar)) {
                agcbVarA.d(agcbVarA.d, i);
            }
        }
    }

    public final void f(int i) {
        defpackage.agcb agcbVarA = defpackage.agcb.a();
        java.lang.Object obj = agcbVarA.a;
        defpackage.aprf aprfVar = this.v;
        synchronized (obj) {
            if (agcbVarA.g(aprfVar)) {
                agcbVarA.c = null;
                if (agcbVarA.d != null) {
                    agcbVarA.c();
                }
            }
        }
        java.util.List list = this.D;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((defpackage.aftt) this.D.get(size)).a(this, i);
                }
            }
        }
        defpackage.agbu agbuVar = this.j;
        android.view.ViewParent parent = agbuVar.getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(agbuVar);
        }
    }

    final void g() {
        defpackage.agcb agcbVarA = defpackage.agcb.a();
        java.lang.Object obj = agcbVarA.a;
        defpackage.aprf aprfVar = this.v;
        synchronized (obj) {
            if (agcbVarA.g(aprfVar)) {
                agcbVarA.b(agcbVarA.c);
            }
        }
        java.util.List list = this.D;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((defpackage.aftt) this.D.get(size)).b(this);
            }
        }
    }

    public final void h() {
        defpackage.agcb agcbVarA = defpackage.agcb.a();
        java.lang.Object obj = agcbVarA.a;
        int iA = a();
        defpackage.aprf aprfVar = this.v;
        synchronized (obj) {
            if (agcbVarA.g(aprfVar)) {
                defpackage.agca agcaVar = agcbVarA.c;
                agcaVar.a = iA;
                agcbVarA.b.removeCallbacksAndMessages(agcaVar);
                agcbVarA.b(agcbVarA.c);
                return;
            }
            if (agcbVarA.h(aprfVar)) {
                agcbVarA.d.a = iA;
            } else {
                agcbVarA.d = new defpackage.agca(iA, aprfVar);
            }
            defpackage.agca agcaVar2 = agcbVarA.c;
            if (agcaVar2 == null || !agcbVarA.d(agcaVar2, 4)) {
                agcbVarA.c = null;
                agcbVarA.c();
            }
        }
    }

    public final void i() {
        boolean zL = l();
        defpackage.agbu agbuVar = this.j;
        if (zL) {
            agbuVar.post(new defpackage.aflt(this, 18, (char[]) null));
            return;
        }
        if (agbuVar.getParent() != null) {
            agbuVar.setVisibility(0);
        }
        g();
    }

    public final void j() {
        defpackage.agbu agbuVar = this.j;
        android.view.ViewGroup.LayoutParams layoutParams = agbuVar.getLayoutParams();
        if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            android.util.Log.w(b, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (agbuVar.f == null) {
            android.util.Log.w(b, "Unable to update margins because original view margins are not set");
            return;
        }
        if (agbuVar.getParent() != null) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            int i = agbuVar.f.bottom + (d() != null ? this.p : this.m);
            int i2 = agbuVar.f.left + this.n;
            int i3 = agbuVar.f.right + this.o;
            int i4 = agbuVar.f.top;
            if (marginLayoutParams.bottomMargin != i || marginLayoutParams.leftMargin != i2 || marginLayoutParams.rightMargin != i3 || marginLayoutParams.topMargin != i4) {
                marginLayoutParams.bottomMargin = i;
                marginLayoutParams.leftMargin = i2;
                marginLayoutParams.rightMargin = i3;
                marginLayoutParams.topMargin = i4;
                agbuVar.requestLayout();
            } else if (this.r == this.q) {
                return;
            }
            if (this.q > 0) {
                dup layoutParams2 = agbuVar.getLayoutParams();
                if ((layoutParams2 instanceof dup) && (layoutParams2.a instanceof com.google.android.material.behavior.SwipeDismissBehavior) && d() == null) {
                    java.lang.Runnable runnable = this.C;
                    agbuVar.removeCallbacks(runnable);
                    agbuVar.post(runnable);
                }
            }
        }
    }

    public final boolean k() {
        boolean z2;
        defpackage.agcb agcbVarA = defpackage.agcb.a();
        java.lang.Object obj = agcbVarA.a;
        defpackage.aprf aprfVar = this.v;
        synchronized (obj) {
            z2 = true;
            if (!agcbVarA.g(aprfVar) && !agcbVarA.h(aprfVar)) {
                z2 = false;
            }
        }
        return z2;
    }

    final boolean l() {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.E;
        if (accessibilityManager == null) {
            return true;
        }
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final void m(android.view.View view) {
        defpackage.agbs agbsVar;
        defpackage.agbs agbsVar2 = this.B;
        if (agbsVar2 != null) {
            agbsVar2.a();
        }
        if (view == null) {
            agbsVar = null;
        } else {
            defpackage.agbs agbsVar3 = new defpackage.agbs(this, view);
            if (view.isAttachedToWindow()) {
                agab.I(view, agbsVar3);
            }
            view.addOnAttachStateChangeListener(agbsVar3);
            agbsVar = agbsVar3;
        }
        this.B = agbsVar;
    }

    public final void n(defpackage.aftt afttVar) {
        if (this.D == null) {
            this.D = new java.util.ArrayList();
        }
        this.D.add(afttVar);
    }
}
