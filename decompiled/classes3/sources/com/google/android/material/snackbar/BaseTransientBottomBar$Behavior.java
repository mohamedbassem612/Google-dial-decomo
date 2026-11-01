package com.google.android.material.snackbar;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class BaseTransientBottomBar$Behavior extends com.google.android.material.behavior.SwipeDismissBehavior {
    public final defpackage.amdx g = new defpackage.amdx((com.google.android.material.behavior.SwipeDismissBehavior) this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean e(android.view.View view) {
        return view instanceof defpackage.agbu;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        defpackage.amdx amdxVar = this.g;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                defpackage.agcb.a().f((defpackage.aprf) amdxVar.a);
            }
        } else if (coordinatorLayout.l(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            defpackage.agcb.a().e((defpackage.aprf) amdxVar.a);
        }
        return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
    }
}
