package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mj extends defpackage.kj {
    float c;
    float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public final defpackage.mf l;
    int m;
    public int o;
    public android.support.v7.widget.RecyclerView p;
    android.view.VelocityTracker r;
    public android.view.GestureDetector s;
    public defpackage.mg t;
    public android.graphics.Rect v;
    public long w;
    public final java.util.List a = new java.util.ArrayList();
    private final float[] x = new float[2];
    public ld b = null;
    int k = -1;
    private int y = 0;
    public final java.util.List n = new java.util.ArrayList();
    public final java.lang.Runnable q = new defpackage.jd(this, 9);
    public final defpackage.kr u = new defpackage.md(this);

    public mj(defpackage.mf mfVar) {
        this.l = mfVar;
    }

    private final void k(float[] fArr) {
        if ((this.m & 12) != 0) {
            fArr[0] = (this.i + this.g) - this.b.a.getLeft();
        } else {
            fArr[0] = this.b.a.getTranslationX();
        }
        if ((this.m & 3) != 0) {
            fArr[1] = (this.j + this.h) - this.b.a.getTop();
        } else {
            fArr[1] = this.b.a.getTranslationY();
        }
    }

    private static boolean t(android.view.View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    private final int u(int i) {
        if ((i & 12) != 0) {
            int i2 = this.g > 0.0f ? 8 : 4;
            android.view.VelocityTracker velocityTracker = this.r;
            if (velocityTracker != null && this.k >= 0) {
                velocityTracker.computeCurrentVelocity(1000, this.f);
                float xVelocity = this.r.getXVelocity(this.k);
                float yVelocity = this.r.getYVelocity(this.k);
                int i3 = xVelocity <= 0.0f ? 4 : 8;
                float fAbs = java.lang.Math.abs(xVelocity);
                if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.e && fAbs > java.lang.Math.abs(yVelocity)) {
                    return i3;
                }
            }
            float width = this.p.getWidth();
            if ((i & i2) != 0) {
                if (java.lang.Math.abs(this.g) > width * 0.5f) {
                    return i2;
                }
            }
        }
        return 0;
    }

    private final int v(int i) {
        if ((i & 3) != 0) {
            int i2 = this.h > 0.0f ? 2 : 1;
            android.view.VelocityTracker velocityTracker = this.r;
            if (velocityTracker != null && this.k >= 0) {
                velocityTracker.computeCurrentVelocity(1000, this.f);
                float xVelocity = this.r.getXVelocity(this.k);
                float yVelocity = this.r.getYVelocity(this.k);
                int i3 = yVelocity <= 0.0f ? 1 : 2;
                float fAbs = java.lang.Math.abs(yVelocity);
                if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.e && fAbs > java.lang.Math.abs(xVelocity)) {
                    return i3;
                }
            }
            float height = this.p.getHeight();
            if ((i & i2) != 0) {
                if (java.lang.Math.abs(this.h) > height * 0.5f) {
                    return i2;
                }
            }
        }
        return 0;
    }

    @Override // defpackage.kj
    public final void a(android.graphics.Rect rect, android.view.View view, android.support.v7.widget.RecyclerView recyclerView, la laVar) {
        rect.setEmpty();
    }

    @Override // defpackage.kj
    public final void b(android.graphics.Canvas canvas, android.support.v7.widget.RecyclerView recyclerView) {
        float f;
        if (this.b != null) {
            float[] fArr = this.x;
            k(fArr);
            f = fArr[0];
        } else {
            f = 0.0f;
        }
        defpackage.mf mfVar = this.l;
        ld ldVar = this.b;
        java.util.List list = this.n;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.mi miVar = (defpackage.mi) list.get(i);
            float f2 = miVar.d;
            float f3 = miVar.f;
            if (f2 == f3) {
                miVar.l = miVar.h.a.getTranslationX();
            } else {
                miVar.l = f2 + (miVar.p * (f3 - f2));
            }
            float f4 = miVar.e;
            float f5 = miVar.g;
            if (f4 == f5) {
                miVar.m = miVar.h.a.getTranslationY();
            } else {
                miVar.m = f4 + (miVar.p * (f5 - f4));
            }
            int iSave = canvas.save();
            ld ldVar2 = miVar.h;
            float f6 = miVar.l;
            float f7 = miVar.m;
            int i2 = miVar.i;
            mfVar.e(ldVar2, f6);
            canvas.restoreToCount(iSave);
        }
        if (ldVar != null) {
            int iSave2 = canvas.save();
            mfVar.e(ldVar, f);
            canvas.restoreToCount(iSave2);
        }
    }

    final android.view.View c(android.view.MotionEvent motionEvent) {
        defpackage.mi miVar;
        android.view.View view;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        ld ldVar = this.b;
        if (ldVar != null) {
            float f = this.i + this.g;
            float f2 = this.j + this.h;
            android.view.View view2 = ldVar.a;
            if (t(view2, x, y, f, f2)) {
                return view2;
            }
        }
        java.util.List list = this.n;
        int size = list.size();
        do {
            size--;
            if (size >= 0) {
                miVar = (defpackage.mi) list.get(size);
                view = miVar.h.a;
            } else {
                android.support.v7.widget.RecyclerView recyclerView = this.p;
                int iA = recyclerView.h.a();
                while (true) {
                    iA--;
                    if (iA < 0) {
                        return null;
                    }
                    android.view.View viewD = recyclerView.h.d(iA);
                    float translationX = viewD.getTranslationX();
                    float translationY = viewD.getTranslationY();
                    if (x >= viewD.getLeft() + translationX && x <= viewD.getRight() + translationX && y >= viewD.getTop() + translationY && y <= viewD.getBottom() + translationY) {
                        return viewD;
                    }
                }
            }
        } while (!t(view, x, y, miVar.l, miVar.m));
        return view;
    }

    final void d(int i, android.view.MotionEvent motionEvent, int i2) {
        int iB;
        android.view.View viewC;
        if (this.b == null && i == 2) {
            android.support.v7.widget.RecyclerView recyclerView = this.p;
            if (recyclerView.F != 1) {
                kp kpVar = recyclerView.n;
                int i3 = this.k;
                ld ldVarH = null;
                if (i3 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(iFindPointerIndex) - this.c;
                    float y = motionEvent.getY(iFindPointerIndex) - this.d;
                    float fAbs = java.lang.Math.abs(x);
                    float fAbs2 = java.lang.Math.abs(y);
                    float f = this.o;
                    if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !kpVar.ah()) && ((fAbs2 <= fAbs || !kpVar.ai()) && (viewC = c(motionEvent)) != null))) {
                        ldVarH = this.p.h(viewC);
                    }
                }
                if (ldVarH == null || (iB = this.l.b(this.p, ldVarH) >> 8) == 0) {
                    return;
                }
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                float f2 = x2 - this.c;
                float f3 = y2 - this.d;
                float fAbs3 = java.lang.Math.abs(f2);
                float fAbs4 = java.lang.Math.abs(f3);
                float f4 = this.o;
                if (fAbs3 >= f4 || fAbs4 >= f4) {
                    if (fAbs3 > fAbs4) {
                        if (f2 < 0.0f && (iB & 4) == 0) {
                            return;
                        }
                        if (f2 > 0.0f && (iB & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f3 < 0.0f && (iB & 1) == 0) {
                            return;
                        }
                        if (f3 > 0.0f && (iB & 2) == 0) {
                            return;
                        }
                    }
                    this.h = 0.0f;
                    this.g = 0.0f;
                    this.k = motionEvent.getPointerId(0);
                    g(ldVarH, 1);
                }
            }
        }
    }

    public final void e(ld ldVar, boolean z) {
        defpackage.mi miVar;
        java.util.List list = this.n;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return;
            } else {
                miVar = (defpackage.mi) list.get(size);
            }
        } while (miVar.h != ldVar);
        miVar.n |= z;
        if (!miVar.o) {
            miVar.a();
        }
        list.remove(size);
    }

    public final void f() {
        android.view.VelocityTracker velocityTracker = this.r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.r = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    public final void g(ld ldVar, int i) {
        defpackage.mj mjVar;
        boolean z;
        int i2;
        float fSignum;
        float fSignum2;
        int iV;
        if (ldVar == this.b && i == this.y) {
            return;
        }
        this.w = Long.MIN_VALUE;
        int i3 = this.y;
        e(ldVar, true);
        this.y = i;
        ld ldVar2 = this.b;
        int i4 = 1 << ((i << 3) + 8);
        if (ldVar2 != null) {
            if (ldVar2.a.getParent() != null) {
                int iC = this.l.c(ldVar2);
                int iG = defpackage.mf.g(iC, this.p.getLayoutDirection()) >> 8;
                if (iG != 0) {
                    int i5 = iC >> 8;
                    if (java.lang.Math.abs(this.g) > java.lang.Math.abs(this.h)) {
                        iV = u(iG);
                        if (iV <= 0) {
                            iV = v(iG);
                            if (iV <= 0) {
                                i2 = 0;
                            }
                        } else if ((i5 & iV) == 0) {
                            iV = defpackage.mf.a(iV, this.p.getLayoutDirection());
                        }
                        i2 = iV;
                    } else {
                        iV = v(iG);
                        if (iV <= 0) {
                            iV = u(iG);
                            if (iV <= 0) {
                                i2 = 0;
                            } else if ((i5 & iV) == 0) {
                                iV = defpackage.mf.a(iV, this.p.getLayoutDirection());
                            }
                        }
                        i2 = iV;
                    }
                } else {
                    i2 = 0;
                }
                f();
                if (i2 == 1 || i2 == 2) {
                    fSignum = java.lang.Math.signum(this.h) * this.p.getHeight();
                    fSignum2 = 0.0f;
                } else if (i2 == 4 || i2 == 8 || i2 == 16 || i2 == 32) {
                    fSignum2 = java.lang.Math.signum(this.g) * this.p.getWidth();
                    fSignum = 0.0f;
                } else {
                    fSignum2 = 0.0f;
                    fSignum = 0.0f;
                }
                float[] fArr = this.x;
                k(fArr);
                mjVar = this;
                defpackage.me meVar = new defpackage.me(mjVar, ldVar2, i3, fArr[0], fArr[1], fSignum2, fSignum, i2, ldVar2);
                long j = mjVar.p.E == null ? 250L : 120L;
                android.animation.ValueAnimator valueAnimator = meVar.j;
                valueAnimator.setDuration(j);
                mjVar.n.add(meVar);
                meVar.h.n(false);
                valueAnimator.start();
                z = true;
            } else {
                mjVar = this;
                defpackage.mf.f(ldVar2);
                z = false;
            }
            mjVar.b = null;
        } else {
            mjVar = this;
            z = false;
        }
        if (ldVar != null) {
            mjVar.m = (mjVar.l.b(mjVar.p, ldVar) & (i4 - 1)) >> (mjVar.y << 3);
            android.view.View view = ldVar.a;
            mjVar.i = view.getLeft();
            mjVar.j = view.getTop();
            mjVar.b = ldVar;
        }
        android.view.ViewParent parent = mjVar.p.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(mjVar.b != null);
        }
        if (!z) {
            mjVar.p.n.aX();
        }
        mjVar.p.invalidate();
    }

    final void h(android.view.MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float fMax = x - this.c;
        this.g = fMax;
        this.h = y - this.d;
        if ((i & 4) == 0) {
            fMax = java.lang.Math.max(0.0f, fMax);
            this.g = fMax;
        }
        if ((i & 8) == 0) {
            this.g = java.lang.Math.min(0.0f, fMax);
        }
        if ((i & 1) == 0) {
            this.h = java.lang.Math.max(0.0f, this.h);
        }
        if ((i & 2) == 0) {
            this.h = java.lang.Math.min(0.0f, this.h);
        }
    }

    @Override // defpackage.kj
    public final void i(android.graphics.Canvas canvas, android.support.v7.widget.RecyclerView recyclerView) {
        if (this.b != null) {
            k(this.x);
        }
        ld ldVar = this.b;
        java.util.List list = this.n;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            defpackage.mi miVar = (defpackage.mi) list.get(i);
            int iSave = canvas.save();
            ld ldVar2 = miVar.h;
            float f = miVar.l;
            float f2 = miVar.m;
            int i2 = miVar.i;
            canvas.restoreToCount(iSave);
        }
        if (ldVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            defpackage.mi miVar2 = (defpackage.mi) list.get(size);
            if (!miVar2.o) {
                z = true;
            } else if (!miVar2.k) {
                list.remove(size);
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final void j() {
        this.p.isLayoutRequested();
    }
}
