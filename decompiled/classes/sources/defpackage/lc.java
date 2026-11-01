package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lc implements java.lang.Runnable {
    public android.widget.OverScroller a;
    android.view.animation.Interpolator b;
    final /* synthetic */ android.support.v7.widget.RecyclerView c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;

    public lc(android.support.v7.widget.RecyclerView recyclerView) {
        this.c = recyclerView;
        android.view.animation.Interpolator interpolator = android.support.v7.widget.RecyclerView.c;
        this.b = interpolator;
        this.f = false;
        this.g = false;
        this.a = new android.widget.OverScroller(recyclerView.getContext(), interpolator);
    }

    private final void e() {
        android.support.v7.widget.RecyclerView recyclerView = this.c;
        recyclerView.removeCallbacks(this);
        int i = defpackage.dzs.a;
        recyclerView.postOnAnimation(this);
    }

    public final void a(int i, int i2) {
        android.support.v7.widget.RecyclerView recyclerView = this.c;
        recyclerView.ab(2);
        this.e = 0;
        this.d = 0;
        android.view.animation.Interpolator interpolator = this.b;
        android.view.animation.Interpolator interpolator2 = android.support.v7.widget.RecyclerView.c;
        if (interpolator != interpolator2) {
            this.b = interpolator2;
            this.a = new android.widget.OverScroller(recyclerView.getContext(), interpolator2);
        }
        this.a.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    final void b() {
        if (this.f) {
            this.g = true;
        } else {
            e();
        }
    }

    public final void c(int i, int i2, int i3, android.view.animation.Interpolator interpolator) {
        if (i3 == Integer.MIN_VALUE) {
            int iAbs = java.lang.Math.abs(i);
            int iAbs2 = java.lang.Math.abs(i2);
            boolean z = iAbs > iAbs2;
            android.support.v7.widget.RecyclerView recyclerView = this.c;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (true != z) {
                iAbs = iAbs2;
            }
            i3 = java.lang.Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = android.support.v7.widget.RecyclerView.c;
        }
        if (this.b != interpolator) {
            this.b = interpolator;
            this.a = new android.widget.OverScroller(this.c.getContext(), interpolator);
        }
        this.e = 0;
        this.d = 0;
        this.c.ab(2);
        this.a.startScroll(0, 0, i, i2, i4);
        b();
    }

    public final void d() {
        this.c.removeCallbacks(this);
        this.a.abortAnimation();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cf A[PHI: r1
      0x00cf: PHI (r1v11 int) = (r1v10 int), (r1v23 int) binds: [B:35:0x00c8, B:37:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        android.support.v7.widget.RecyclerView recyclerView = this.c;
        if (recyclerView.n == null) {
            d();
            return;
        }
        this.g = false;
        this.f = true;
        recyclerView.x();
        android.widget.OverScroller overScroller = this.a;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.d;
            int i7 = currY - this.e;
            this.d = currX;
            this.e = currY;
            int iAo = android.support.v7.widget.RecyclerView.ao(i6, recyclerView.A, recyclerView.C, recyclerView.getWidth());
            int iAo2 = android.support.v7.widget.RecyclerView.ao(i7, recyclerView.B, recyclerView.D, recyclerView.getHeight());
            int[] iArr = recyclerView.R;
            iArr[0] = 0;
            iArr[1] = 0;
            if (recyclerView.ai(iAo, iAo2, iArr, null, 1)) {
                iAo -= iArr[0];
                iAo2 -= iArr[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.w(iAo, iAo2);
            }
            if (recyclerView.m != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                recyclerView.V(iAo, iAo2, iArr);
                int i8 = iArr[0];
                i3 = iArr[1];
                iAo -= i8;
                int i9 = iAo2 - i3;
                kz kzVar = recyclerView.n.t;
                if (kzVar != null && !kzVar.d && kzVar.e) {
                    int iA = recyclerView.L.a();
                    if (iA == 0) {
                        kzVar.c();
                    } else if (kzVar.a >= iA) {
                        kzVar.a = iA - 1;
                        kzVar.b(i8, i3);
                    } else {
                        kzVar.b(i8, i3);
                    }
                }
                i = i9;
                i2 = i8;
            } else {
                i = iAo2;
                i2 = 0;
                i3 = 0;
            }
            if (!recyclerView.p.isEmpty()) {
                recyclerView.invalidate();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int i10 = iAo;
            int i11 = i2;
            int i12 = i3;
            recyclerView.eo(i11, i12, i10, i, null, 1, iArr);
            int i13 = i;
            int i14 = i10 - iArr[0];
            int i15 = i13 - iArr[1];
            if (i11 == 0) {
                i11 = 0;
                if (i12 == 0) {
                    i4 = 0;
                } else {
                    recyclerView.C(i11, i12);
                    i4 = i12;
                }
            } else {
                recyclerView.C(i11, i12);
                i4 = i12;
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            int currX2 = overScroller.getCurrX();
            int finalX = overScroller.getFinalX();
            int currY2 = overScroller.getCurrY();
            int finalY = overScroller.getFinalY();
            if (overScroller.isFinished()) {
                z = true;
            } else if (currX2 != finalX && i14 == 0) {
                z = false;
                i14 = 0;
            } else if (currY2 == finalY || i15 != 0) {
                z = true;
            } else {
                z = false;
                i15 = 0;
            }
            kz kzVar2 = recyclerView.n.t;
            if ((kzVar2 == null || !kzVar2.d) && z) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i14 < 0) {
                        i5 = -currVelocity;
                    } else {
                        i5 = i14 > 0 ? currVelocity : 0;
                    }
                    if (i15 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i15 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.E();
                        if (recyclerView.A.isFinished()) {
                            recyclerView.A.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.F();
                        if (recyclerView.C.isFinished()) {
                            recyclerView.C.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.G();
                        if (recyclerView.B.isFinished()) {
                            recyclerView.B.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.D();
                        if (recyclerView.D.isFinished()) {
                            recyclerView.D.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                recyclerView.K.b();
            } else {
                b();
                defpackage.jl jlVar = recyclerView.J;
                if (jlVar != null) {
                    jlVar.a(recyclerView, i11, i4);
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                kj.l(recyclerView, java.lang.Math.abs(overScroller.getCurrVelocity()));
            }
        }
        kz kzVar3 = recyclerView.n.t;
        if (kzVar3 != null && kzVar3.d) {
            kzVar3.b(0, 0);
        }
        this.f = false;
        if (this.g) {
            e();
        } else {
            recyclerView.ab(0);
            recyclerView.af(1);
        }
    }
}
