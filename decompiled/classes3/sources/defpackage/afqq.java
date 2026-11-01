package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afqq extends ecl {
    final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior a;

    public afqq(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior) {
        j$.util.Objects.requireNonNull(bottomSheetBehavior);
        this.a = bottomSheetBehavior;
    }

    public final void d(int i) {
        if (i == 1) {
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior.x) {
                bottomSheetBehavior.u(1);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    public final void e(android.view.View view, float f, float f2) {
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.a;
        int i = 6;
        if (f2 < 0.0f) {
            if (bottomSheetBehavior.a) {
                i = 3;
            } else {
                int top = view.getTop();
                android.os.SystemClock.uptimeMillis();
                if (top <= bottomSheetBehavior.r) {
                    i = 3;
                }
            }
        } else if (bottomSheetBehavior.v && bottomSheetBehavior.B(view, f2)) {
            if ((java.lang.Math.abs(f) < java.lang.Math.abs(f2) && f2 > bottomSheetBehavior.b) || view.getTop() > (bottomSheetBehavior.B + bottomSheetBehavior.e()) / 2) {
                i = 5;
            } else if (bottomSheetBehavior.a || java.lang.Math.abs(view.getTop() - bottomSheetBehavior.e()) < java.lang.Math.abs(view.getTop() - bottomSheetBehavior.r)) {
                i = 3;
            }
        } else if (f2 == 0.0f || java.lang.Math.abs(f) > java.lang.Math.abs(f2)) {
            int top2 = view.getTop();
            if (!bottomSheetBehavior.a) {
                int i2 = bottomSheetBehavior.r;
                if (top2 < i2) {
                    if (top2 < java.lang.Math.abs(top2 - bottomSheetBehavior.t)) {
                        i = 3;
                    }
                } else if (java.lang.Math.abs(top2 - i2) >= java.lang.Math.abs(top2 - bottomSheetBehavior.t)) {
                    i = 4;
                }
            } else if (java.lang.Math.abs(top2 - bottomSheetBehavior.q) < java.lang.Math.abs(top2 - bottomSheetBehavior.t)) {
                i = 3;
            } else {
                i = 4;
            }
        } else if (bottomSheetBehavior.a) {
            i = 4;
        } else {
            int top3 = view.getTop();
            if (java.lang.Math.abs(top3 - bottomSheetBehavior.r) >= java.lang.Math.abs(top3 - bottomSheetBehavior.t)) {
                i = 4;
            }
        }
        this.a.w(view, i, true);
    }

    public final boolean f(android.view.View view, int i) {
        android.view.View viewG;
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.a;
        int i2 = bottomSheetBehavior.y;
        if (i2 == 1 || bottomSheetBehavior.J) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.H == i) {
            if (bottomSheetBehavior.c) {
                java.lang.ref.WeakReference weakReference = bottomSheetBehavior.I;
                viewG = weakReference != null ? (android.view.View) weakReference.get() : null;
            } else {
                viewG = bottomSheetBehavior.g();
            }
            if (viewG != null && viewG.canScrollVertically(-1)) {
                return false;
            }
        }
        android.os.SystemClock.uptimeMillis();
        java.lang.ref.WeakReference weakReference2 = bottomSheetBehavior.C;
        return weakReference2 != null && weakReference2.get() == view;
    }

    public final int g(android.view.View view, int i) {
        return view.getLeft();
    }

    public final int h(android.view.View view, int i) {
        return dzk.B(i, this.a.e(), i());
    }

    public final int i() {
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.a;
        return bottomSheetBehavior.y() ? bottomSheetBehavior.B : bottomSheetBehavior.t;
    }

    public final void l(android.view.View view, int i, int i2) {
        this.a.k(i2);
    }
}
