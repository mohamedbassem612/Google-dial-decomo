package com.google.android.material.behavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@java.lang.Deprecated
public class HideBottomViewOnScrollBehavior extends dum {
    public android.view.accessibility.AccessibilityManager a;
    public android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener b;
    public int c;
    public android.view.ViewPropertyAnimator d;
    private final java.util.LinkedHashSet e;
    private int f;
    private int g;
    private android.animation.TimeInterpolator h;
    private android.animation.TimeInterpolator i;
    private int j;
    private int k;
    private int l;

    public HideBottomViewOnScrollBehavior() {
        this.e = new java.util.LinkedHashSet();
        this.j = 0;
        this.c = 2;
        this.k = 0;
        this.l = 0;
    }

    private final void g(android.view.View view, int i, long j, android.animation.TimeInterpolator timeInterpolator) {
        this.d = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new defpackage.afpx(this, view));
    }

    private final void h(android.view.View view, int i) {
        this.c = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.k = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.l = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.k);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.l);
            }
        }
        java.util.Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((defpackage.afpy) it.next()).a();
        }
    }

    public final boolean e() {
        return this.c == 1;
    }

    public final void f(android.view.View view) {
        if (this.c != 2) {
            h(view, 2);
            android.view.ViewPropertyAnimator viewPropertyAnimator = this.d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            g(view, 0, this.f, this.h);
        }
    }

    public final boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        this.j = view.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f = agab.u(view.getContext(), 2130970055, 225);
        this.g = agab.u(view.getContext(), 2130970061, 175);
        this.h = agab.C(view.getContext(), 2130970071, afpc.d);
        this.i = agab.C(view.getContext(), 2130970071, afpc.c);
        android.view.accessibility.AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager == null) {
            accessibilityManager = (android.view.accessibility.AccessibilityManager) view.getContext().getSystemService(android.view.accessibility.AccessibilityManager.class);
            this.a = accessibilityManager;
        }
        if (accessibilityManager == null || this.b != null) {
            return false;
        }
        defpackage.afqc afqcVar = new defpackage.afqc(this, view, 1);
        this.b = afqcVar;
        this.a.addTouchExplorationStateChangeListener(afqcVar);
        view.addOnAttachStateChangeListener(new defpackage.afqd(this, 1));
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
                h(view, 1);
                g(view, this.j, this.g, this.i);
            }
        }
    }

    public final boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new java.util.LinkedHashSet();
        this.j = 0;
        this.c = 2;
        this.k = 0;
        this.l = 0;
    }
}
