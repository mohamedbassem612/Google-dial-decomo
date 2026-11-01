package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class afpp extends defpackage.afps {
    private java.lang.Runnable a;
    android.widget.OverScroller b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private android.view.VelocityTracker g;

    public afpp() {
        this.d = -1;
        this.f = -1;
    }

    public int e(android.view.View view) {
        throw null;
    }

    public int f(android.view.View view) {
        throw null;
    }

    public int g() {
        throw null;
    }

    public int h(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3) {
        throw null;
    }

    public void j(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
        throw null;
    }

    public boolean l(android.view.View view) {
        throw null;
    }

    public final int o(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3) {
        return h(coordinatorLayout, view, g() - i, i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0089  */
    public final boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.VelocityTracker velocityTracker;
        int y;
        boolean z;
        android.widget.OverScroller overScroller;
        int iFindPointerIndex;
        if (this.f < 0) {
            this.f = android.view.ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.c) {
            int i = this.d;
            if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                int y2 = (int) motionEvent.getY(iFindPointerIndex);
                if (java.lang.Math.abs(y2 - this.e) > this.f) {
                    this.e = y2;
                    return true;
                }
                if (motionEvent.getActionMasked() == 0) {
                    this.d = -1;
                    int x = (int) motionEvent.getX();
                    y = (int) motionEvent.getY();
                    if (l(view)) {
                        z = false;
                    } else {
                        z = false;
                    }
                    this.c = z;
                    if (z) {
                        this.e = y;
                        this.d = motionEvent.getPointerId(0);
                        if (this.g == null) {
                            this.g = android.view.VelocityTracker.obtain();
                        }
                        overScroller = this.b;
                        if (overScroller != null) {
                            this.b.abortAnimation();
                            return true;
                        }
                    }
                }
                velocityTracker = this.g;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
            }
        } else {
            if (motionEvent.getActionMasked() == 0) {
                this.d = -1;
                int x2 = (int) motionEvent.getX();
                y = (int) motionEvent.getY();
                if (l(view) || !coordinatorLayout.l(view, x2, y)) {
                    z = false;
                } else {
                    z = true;
                }
                this.c = z;
                if (z) {
                    this.e = y;
                    this.d = motionEvent.getPointerId(0);
                    if (this.g == null) {
                        this.g = android.view.VelocityTracker.obtain();
                    }
                    overScroller = this.b;
                    if (overScroller != null && !overScroller.isFinished()) {
                        this.b.abortAnimation();
                        return true;
                    }
                }
            }
            velocityTracker = this.g;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd A[ADDED_TO_REGION] */
    public final boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z;
        android.view.VelocityTracker velocityTracker;
        android.view.VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.d);
                if (iFindPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(iFindPointerIndex);
                int i = this.e - y;
                this.e = y;
                o(coordinatorLayout, view, i, e(view), 0);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i2 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.d = motionEvent.getPointerId(i2);
                    this.e = (int) (motionEvent.getY(i2) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.g;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.c || z;
        }
        android.view.VelocityTracker velocityTracker3 = this.g;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
            this.g.computeCurrentVelocity(1000);
            float yVelocity = this.g.getYVelocity(this.d);
            int i3 = -f(view);
            java.lang.Runnable runnable = this.a;
            if (runnable != null) {
                view.removeCallbacks(runnable);
                this.a = null;
            }
            android.widget.OverScroller overScroller = this.b;
            if (overScroller == null) {
                overScroller = new android.widget.OverScroller(view.getContext());
                this.b = overScroller;
            }
            overScroller.fling(0, p(), 0, java.lang.Math.round(yVelocity), 0, 0, i3, 0);
            if (this.b.computeScrollOffset()) {
                defpackage.afpo afpoVar = new defpackage.afpo(this, coordinatorLayout, view);
                this.a = afpoVar;
                view.postOnAnimation(afpoVar);
            } else {
                j(coordinatorLayout, view);
            }
            z = true;
        }
        this.c = false;
        this.d = -1;
        velocityTracker = this.g;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.g = null;
        }
        velocityTracker2 = this.g;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.c) {
        }
        z = false;
        this.c = false;
        this.d = -1;
        velocityTracker = this.g;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.g = null;
        }
        velocityTracker2 = this.g;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.c) {
        }
    }

    public afpp(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.f = -1;
    }
}
