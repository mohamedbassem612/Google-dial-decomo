package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kz {
    public android.support.v7.widget.RecyclerView b;
    public kp c;
    public boolean d;
    public boolean e;
    public android.view.View f;
    public boolean g;
    protected android.graphics.PointF j;
    private final android.util.DisplayMetrics n;
    private float p;
    public int a = -1;
    private final defpackage.kx m = new defpackage.kx();
    protected final android.view.animation.LinearInterpolator h = new android.view.animation.LinearInterpolator();
    protected final android.view.animation.DecelerateInterpolator i = new android.view.animation.DecelerateInterpolator();
    private boolean o = false;
    protected int k = 0;
    protected int l = 0;

    public kz(android.content.Context context) {
        this.n = context.getResources().getDisplayMetrics();
    }

    public static int e(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            return i4 - i2;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 >= 0) {
            return 0;
        }
        return i7;
    }

    public static final int f(android.view.View view) {
        ld ldVarI = android.support.v7.widget.RecyclerView.i(view);
        if (ldVarI != null) {
            return ldVarI.c();
        }
        return -1;
    }

    private static int g(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    public final android.graphics.PointF a(int i) {
        ky kyVar = this.c;
        if (kyVar instanceof ky) {
            return kyVar.P(i);
        }
        android.util.Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement ".concat(java.lang.String.valueOf(ky.class.getCanonicalName())));
        return null;
    }

    final void b(int i, int i2) {
        int i3;
        int iE;
        android.graphics.PointF pointFA;
        android.support.v7.widget.RecyclerView recyclerView = this.b;
        int i4 = -1;
        if (this.a == -1 || recyclerView == null) {
            c();
        }
        if (this.d && this.f == null && this.c != null && (pointFA = a(this.a)) != null && (pointFA.x != 0.0f || pointFA.y != 0.0f)) {
            recyclerView.V((int) java.lang.Math.signum(pointFA.x), (int) java.lang.Math.signum(pointFA.y), (int[]) null);
        }
        int iE2 = 0;
        this.d = false;
        android.view.View view = this.f;
        if (view != null) {
            if (f(view) == this.a) {
                android.view.View view2 = this.f;
                la laVar = recyclerView.L;
                defpackage.kx kxVar = this.m;
                android.graphics.PointF pointF = this.j;
                if (pointF == null || pointF.x == 0.0f) {
                    i3 = 0;
                } else {
                    i3 = this.j.x > 0.0f ? 1 : -1;
                }
                kp kpVar = this.c;
                if (kpVar == null || !kpVar.ah()) {
                    iE = 0;
                } else {
                    kq layoutParams = view2.getLayoutParams();
                    iE = e(kp.bx(view2) - layoutParams.leftMargin, kp.by(view2) + layoutParams.rightMargin, kpVar.getPaddingLeft(), kpVar.C - kpVar.getPaddingRight(), i3);
                }
                android.graphics.PointF pointF2 = this.j;
                if (pointF2 == null || pointF2.y == 0.0f) {
                    i4 = 0;
                } else if (this.j.y > 0.0f) {
                    i4 = 1;
                }
                kp kpVar2 = this.c;
                if (kpVar2 != null && kpVar2.ai()) {
                    kq layoutParams2 = view2.getLayoutParams();
                    iE2 = e(kp.bz(view2) - layoutParams2.topMargin, kp.bw(view2) + layoutParams2.bottomMargin, kpVar2.getPaddingTop(), kpVar2.D - kpVar2.getPaddingBottom(), i4);
                }
                int iCeil = (int) java.lang.Math.ceil(((double) d((int) java.lang.Math.sqrt((iE * iE) + (iE2 * iE2)))) / 0.3356d);
                if (iCeil > 0) {
                    kxVar.b(-iE, -iE2, iCeil, this.i);
                }
                kxVar.a(recyclerView);
                c();
            } else {
                android.util.Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            la laVar2 = recyclerView.L;
            defpackage.kx kxVar2 = this.m;
            if (this.b.n.aw() == 0) {
                c();
            } else {
                int iG = g(this.k, i);
                this.k = iG;
                int iG2 = g(this.l, i2);
                this.l = iG2;
                if (iG == 0 && iG2 == 0) {
                    android.graphics.PointF pointFA2 = a(this.a);
                    if (pointFA2 == null || (pointFA2.x == 0.0f && pointFA2.y == 0.0f)) {
                        kxVar2.a = this.a;
                        c();
                    } else {
                        float fSqrt = (float) java.lang.Math.sqrt((pointFA2.x * pointFA2.x) + (pointFA2.y * pointFA2.y));
                        pointFA2.x /= fSqrt;
                        pointFA2.y /= fSqrt;
                        this.j = pointFA2;
                        this.k = (int) (pointFA2.x * 10000.0f);
                        this.l = (int) (pointFA2.y * 10000.0f);
                        kxVar2.b((int) (this.k * 1.2f), (int) (this.l * 1.2f), (int) (d(10000) * 1.2f), this.h);
                    }
                }
            }
            int i5 = kxVar2.a;
            kxVar2.a(recyclerView);
            if (i5 < 0 || !this.e) {
                return;
            }
            this.d = true;
            recyclerView.I.b();
        }
    }

    public final void c() {
        if (this.e) {
            this.e = false;
            this.l = 0;
            this.k = 0;
            this.j = null;
            this.b.L.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            kp kpVar = this.c;
            if (kpVar.t == this) {
                kpVar.t = null;
            }
            this.c = null;
            this.b = null;
        }
    }

    protected final int d(int i) {
        float fAbs = java.lang.Math.abs(i);
        if (!this.o) {
            this.p = 25.0f / this.n.densityDpi;
            this.o = true;
        }
        return (int) java.lang.Math.ceil(fAbs * this.p);
    }
}
