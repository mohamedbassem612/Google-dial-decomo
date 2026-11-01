package com.google.android.material.behavior;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SwipeDismissBehavior extends dum {
    public ecm a;
    public boolean b;
    public defpackage.aprf f;
    private boolean g;
    public int c = 2;
    public float d = 0.0f;
    public float e = 0.5f;
    private final ecl h = new defpackage.afqh(this);

    public static float f(float f) {
        return java.lang.Math.min(java.lang.Math.max(0.0f, f), 1.0f);
    }

    public boolean e(android.view.View view) {
        return true;
    }

    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        boolean zL = this.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zL = coordinatorLayout.l(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.g = zL;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        if (zL) {
            ecm ecmVarB = this.a;
            if (ecmVarB == null) {
                ecmVarB = ecm.b(coordinatorLayout, this.h);
                this.a = ecmVarB;
            }
            if (!this.b && ecmVarB.i(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        if (view.getImportantForAccessibility() != 0) {
            return false;
        }
        view.setImportantForAccessibility(1);
        dzs.g(view, 1048576);
        if (!e(view)) {
            return false;
        }
        dzs.h(view, ebc.k, (java.lang.CharSequence) null, new defpackage.afqi(this));
        return false;
    }

    public final boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (!this.b || motionEvent.getActionMasked() != 3) {
            this.a.e(motionEvent);
        }
        return true;
    }
}
