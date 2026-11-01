package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class md implements defpackage.kr {
    final /* synthetic */ defpackage.mj a;

    public md(defpackage.mj mjVar) {
        this.a = mjVar;
    }

    @Override // defpackage.kr
    public final void c(boolean z) {
        if (z) {
            this.a.g(null, 0);
        }
    }

    @Override // defpackage.kr
    public final boolean j(android.view.MotionEvent motionEvent) {
        int iFindPointerIndex;
        defpackage.mj mjVar = this.a;
        mjVar.s.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        defpackage.mi miVar = null;
        if (actionMasked == 0) {
            mjVar.k = motionEvent.getPointerId(0);
            mjVar.c = motionEvent.getX();
            mjVar.d = motionEvent.getY();
            android.view.VelocityTracker velocityTracker = mjVar.r;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            mjVar.r = android.view.VelocityTracker.obtain();
            if (mjVar.b == null) {
                java.util.List list = mjVar.n;
                if (!list.isEmpty()) {
                    android.view.View viewC = mjVar.c(motionEvent);
                    for (int size = list.size() - 1; size >= 0; size--) {
                        defpackage.mi miVar2 = (defpackage.mi) list.get(size);
                        if (miVar2.h.a == viewC) {
                            miVar = miVar2;
                            break;
                        }
                    }
                }
                if (miVar != null) {
                    mjVar.c -= miVar.l;
                    mjVar.d -= miVar.m;
                    ld ldVar = miVar.h;
                    mjVar.e(ldVar, true);
                    if (mjVar.a.remove(ldVar.a)) {
                        defpackage.mf.f(ldVar);
                    }
                    mjVar.g(ldVar, miVar.i);
                    mjVar.h(motionEvent, mjVar.m, 0);
                }
            }
        } else if (actionMasked == 3 || actionMasked == 1) {
            mjVar.k = -1;
            mjVar.g(null, 0);
        } else {
            int i = mjVar.k;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                mjVar.d(actionMasked, motionEvent, iFindPointerIndex);
            }
        }
        android.view.VelocityTracker velocityTracker2 = mjVar.r;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return mjVar.b != null;
    }

    @Override // defpackage.kr
    public final void k(android.view.MotionEvent motionEvent) {
        defpackage.mj mjVar = this.a;
        mjVar.s.onTouchEvent(motionEvent);
        android.view.VelocityTracker velocityTracker = mjVar.r;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (mjVar.k != -1) {
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(mjVar.k);
            if (iFindPointerIndex >= 0) {
                mjVar.d(actionMasked, motionEvent, iFindPointerIndex);
            }
            if (mjVar.b != null) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        if (iFindPointerIndex >= 0) {
                            mjVar.h(motionEvent, mjVar.m, iFindPointerIndex);
                            mjVar.j();
                            java.lang.Runnable runnable = mjVar.q;
                            mjVar.p.removeCallbacks(runnable);
                            runnable.run();
                            mjVar.p.invalidate();
                            return;
                        }
                        return;
                    }
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (motionEvent.getPointerId(actionIndex) == mjVar.k) {
                                mjVar.k = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                mjVar.h(motionEvent, mjVar.m, actionIndex);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    android.view.VelocityTracker velocityTracker2 = mjVar.r;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                }
                mjVar.g(null, 0);
                mjVar.k = -1;
            }
        }
    }
}
