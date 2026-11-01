package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afqh extends ecl {
    final /* synthetic */ com.google.android.material.behavior.SwipeDismissBehavior a;
    private int b;
    private int c;

    public afqh(com.google.android.material.behavior.SwipeDismissBehavior swipeDismissBehavior) {
        j$.util.Objects.requireNonNull(swipeDismissBehavior);
        this.a = swipeDismissBehavior;
        this.c = -1;
    }

    public final int a(android.view.View view) {
        return view.getWidth();
    }

    public final void c(android.view.View view, int i) {
        this.c = i;
        this.b = view.getLeft();
        android.view.ViewParent parent = view.getParent();
        if (parent != null) {
            com.google.android.material.behavior.SwipeDismissBehavior swipeDismissBehavior = this.a;
            swipeDismissBehavior.b = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.b = false;
        }
    }

    public final void d(int i) {
        defpackage.aprf aprfVar = this.a.f;
        if (aprfVar != null) {
            if (i != 0) {
                defpackage.agcb.a().e(((defpackage.agbv) aprfVar.a).v);
            } else {
                defpackage.agcb.a().f(((defpackage.agbv) aprfVar.a).v);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    public final void e(android.view.View view, float f, float f2) {
        int i;
        int left;
        int i2;
        defpackage.aprf aprfVar;
        this.c = -1;
        int width = view.getWidth();
        boolean z = true;
        if (f != 0.0f) {
            int layoutDirection = view.getLayoutDirection();
            int i3 = this.a.c;
            if (i3 != 2 && (i3 != 0 ? layoutDirection != 1 ? f >= 0.0f : f <= 0.0f : layoutDirection != 1 ? f <= 0.0f : f >= 0.0f)) {
                i = this.b;
                z = false;
            } else if (f >= 0.0f) {
                left = view.getLeft();
                i2 = this.b;
                if (left >= i2) {
                    i = i2 + width;
                } else {
                    i = this.b - width;
                }
            } else {
                i = this.b - width;
            }
        } else {
            if (java.lang.Math.abs(view.getLeft() - this.b) < java.lang.Math.round(view.getWidth() * 0.5f)) {
                i = this.b;
                z = false;
            } else if (f >= 0.0f) {
                left = view.getLeft();
                i2 = this.b;
                if (left >= i2) {
                    i = i2 + width;
                } else {
                    i = this.b - width;
                }
            } else {
                i = this.b - width;
            }
        }
        com.google.android.material.behavior.SwipeDismissBehavior swipeDismissBehavior = this.a;
        if (swipeDismissBehavior.a.h(i, view.getTop())) {
            view.postOnAnimation(new defpackage.afqj(swipeDismissBehavior, view, z));
        } else {
            if (!z || (aprfVar = swipeDismissBehavior.f) == null) {
                return;
            }
            aprfVar.l(view);
        }
    }

    public final boolean f(android.view.View view, int i) {
        int i2 = this.c;
        return (i2 == -1 || i2 == i) && this.a.e(view);
    }

    public final int g(android.view.View view, int i) {
        int width;
        int width2;
        int width3;
        int layoutDirection = view.getLayoutDirection();
        int i2 = this.a.c;
        if (i2 == 0) {
            width = this.b;
            if (layoutDirection == 1) {
                width -= view.getWidth();
                width2 = this.b;
            } else {
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 == 1) {
            width = this.b;
            if (layoutDirection == 1) {
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width -= view.getWidth();
                width2 = this.b;
            }
        } else {
            width = this.b - view.getWidth();
            width2 = this.b + view.getWidth();
        }
        return java.lang.Math.min(java.lang.Math.max(width, i), width2);
    }

    public final int h(android.view.View view, int i) {
        return view.getTop();
    }

    public final void l(android.view.View view, int i, int i2) {
        float width = view.getWidth();
        com.google.android.material.behavior.SwipeDismissBehavior swipeDismissBehavior = this.a;
        float f = width * swipeDismissBehavior.d;
        float width2 = view.getWidth() * swipeDismissBehavior.e;
        float fAbs = java.lang.Math.abs(i - this.b);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(com.google.android.material.behavior.SwipeDismissBehavior.f(1.0f - ((fAbs - f) / (width2 - f))));
        }
    }
}
