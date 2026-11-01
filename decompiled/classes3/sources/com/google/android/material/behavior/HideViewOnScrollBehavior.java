package com.google.android.material.behavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class HideViewOnScrollBehavior extends dum {
    public android.view.accessibility.AccessibilityManager a;
    public android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener b;
    public int c;
    public android.view.ViewPropertyAnimator d;
    private defpackage.afqg e;
    private final java.util.LinkedHashSet f;
    private int g;
    private int h;
    private android.animation.TimeInterpolator i;
    private android.animation.TimeInterpolator j;
    private int k;
    private int l;
    private int m;

    public HideViewOnScrollBehavior() {
        this.f = new java.util.LinkedHashSet();
        this.k = 0;
        this.c = 2;
        this.l = 0;
        this.m = 0;
    }

    private final void g(android.view.View view, int i, long j, android.animation.TimeInterpolator timeInterpolator) {
        this.d = this.e.c(view, i).setInterpolator(timeInterpolator).setDuration(j).setListener(new defpackage.afqe(this, view));
    }

    private final void h(int i) {
        defpackage.afqg afqbVar;
        defpackage.afqg afqgVar = this.e;
        if (afqgVar == null || afqgVar.b() != i) {
            if (i != 0) {
                afqbVar = i != 1 ? new defpackage.afqa() : new defpackage.afpz();
            } else {
                afqbVar = new defpackage.afqb();
            }
            this.e = afqbVar;
        }
    }

    private final void i(android.view.View view, int i) {
        this.c = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.l = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.m = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.l);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.m);
            }
        }
        java.util.Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((defpackage.afqf) it.next()).a();
        }
    }

    public final boolean e() {
        return this.c == 1;
    }

    public final void f(android.view.View view) {
        if (this.c != 2) {
            i(view, 2);
            android.view.ViewPropertyAnimator viewPropertyAnimator = this.d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.e.d();
            g(view, 0, this.g, this.i);
        }
    }

    public final boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager == null) {
            accessibilityManager = (android.view.accessibility.AccessibilityManager) view.getContext().getSystemService(android.view.accessibility.AccessibilityManager.class);
            this.a = accessibilityManager;
        }
        if (accessibilityManager != null && this.b == null) {
            defpackage.afqc afqcVar = new defpackage.afqc(this, view, 0);
            this.b = afqcVar;
            this.a.addTouchExplorationStateChangeListener(afqcVar);
            view.addOnAttachStateChangeListener(new defpackage.afqd(this, 0));
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = view.getLayoutParams().c;
        if (i2 == 80 || i2 == 81) {
            h(1);
        } else {
            int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i2, i);
            int i3 = 2;
            if (absoluteGravity != 3 && absoluteGravity != 19) {
                i3 = 0;
            }
            h(i3);
        }
        this.k = this.e.a(view, marginLayoutParams);
        this.g = agab.u(view.getContext(), 2130970055, 225);
        this.h = agab.u(view.getContext(), 2130970061, 175);
        this.i = agab.C(view.getContext(), 2130970071, afpc.d);
        this.j = agab.C(view.getContext(), 2130970071, afpc.c);
        return false;
    }

    public final void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 <= 0) {
            if (i2 < 0) {
                f(view);
            }
        } else {
            if (e()) {
                return;
            }
            android.view.accessibility.AccessibilityManager accessibilityManager = this.a;
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                android.view.ViewPropertyAnimator viewPropertyAnimator = this.d;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                i(view, 1);
                g(view, this.k, this.h, this.j);
            }
        }
    }

    public final boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i, int i2) {
        return i == 2;
    }

    public HideViewOnScrollBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new java.util.LinkedHashSet();
        this.k = 0;
        this.c = 2;
        this.l = 0;
        this.m = 0;
    }
}
