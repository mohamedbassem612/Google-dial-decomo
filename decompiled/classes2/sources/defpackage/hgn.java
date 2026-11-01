package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class hgn {
    private final defpackage.gzh a;
    public final java.lang.Object b;
    public java.lang.Object c;
    public final android.view.animation.Interpolator d;
    public final android.view.animation.Interpolator e;
    public final android.view.animation.Interpolator f;
    public final float g;
    public java.lang.Float h;
    public float i;
    public float j;
    public int k;
    public android.graphics.PointF l;
    public android.graphics.PointF m;
    private int n;
    private float o;
    private float p;

    public hgn(java.lang.Object obj) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.n = 784923401;
        this.k = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.l = null;
        this.m = null;
        this.a = null;
        this.b = obj;
        this.c = obj;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = java.lang.Float.valueOf(Float.MAX_VALUE);
    }

    public final float b() {
        defpackage.gzh gzhVar = this.a;
        if (gzhVar == null) {
            return 1.0f;
        }
        float f = this.p;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        if (this.h == null) {
            this.p = 1.0f;
            return 1.0f;
        }
        float fC = c() + ((this.h.floatValue() - this.g) / gzhVar.b());
        this.p = fC;
        return fC;
    }

    public final float c() {
        defpackage.gzh gzhVar = this.a;
        if (gzhVar == null) {
            return 0.0f;
        }
        float f = this.o;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        float fB = (this.g - gzhVar.j) / gzhVar.b();
        this.o = fB;
        return fB;
    }

    public final int d() {
        int i = this.n;
        if (i != 784923401) {
            return i;
        }
        int iIntValue = ((java.lang.Integer) this.b).intValue();
        this.n = iIntValue;
        return iIntValue;
    }

    public final boolean e(float f) {
        return f >= c() && f < b();
    }

    public final boolean f() {
        return this.d == null && this.e == null && this.f == null;
    }

    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.b);
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.c);
        android.view.animation.Interpolator interpolator = this.d;
        return "Keyframe{startValue=" + strValueOf + ", endValue=" + strValueOf2 + ", startFrame=" + this.g + ", endFrame=" + this.h + ", interpolator=" + java.lang.String.valueOf(interpolator) + '}';
    }

    public hgn(defpackage.gzh gzhVar, java.lang.Object obj, java.lang.Object obj2, android.view.animation.Interpolator interpolator, android.view.animation.Interpolator interpolator2, float f) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.n = 784923401;
        this.k = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.l = null;
        this.m = null;
        this.a = gzhVar;
        this.b = obj;
        this.c = obj2;
        this.d = null;
        this.e = interpolator;
        this.f = interpolator2;
        this.g = f;
        this.h = null;
    }

    protected hgn(defpackage.gzh gzhVar, java.lang.Object obj, java.lang.Object obj2, android.view.animation.Interpolator interpolator, android.view.animation.Interpolator interpolator2, android.view.animation.Interpolator interpolator3, float f, java.lang.Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.n = 784923401;
        this.k = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.l = null;
        this.m = null;
        this.a = gzhVar;
        this.b = obj;
        this.c = obj2;
        this.d = interpolator;
        this.e = interpolator2;
        this.f = interpolator3;
        this.g = f;
        this.h = f2;
    }

    public hgn(defpackage.gzh gzhVar, java.lang.Object obj, java.lang.Object obj2, android.view.animation.Interpolator interpolator, float f, java.lang.Float f2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.n = 784923401;
        this.k = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.l = null;
        this.m = null;
        this.a = gzhVar;
        this.b = obj;
        this.c = obj2;
        this.d = interpolator;
        this.e = null;
        this.f = null;
        this.g = f;
        this.h = f2;
    }

    public hgn(java.lang.Object obj, java.lang.Object obj2) {
        this.i = -3987645.8f;
        this.j = -3987645.8f;
        this.n = 784923401;
        this.k = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.l = null;
        this.m = null;
        this.a = null;
        this.b = obj;
        this.c = obj2;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.MIN_VALUE;
        this.h = java.lang.Float.valueOf(Float.MAX_VALUE);
    }
}
