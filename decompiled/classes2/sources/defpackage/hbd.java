package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class hbd {
    public defpackage.hgp d;
    private final defpackage.hba e;
    final java.util.List a = new java.util.ArrayList(1);
    public boolean b = false;
    public float c = 0.0f;
    private java.lang.Object f = null;
    private float g = -1.0f;
    private float h = -1.0f;

    public hbd(java.util.List list) {
        defpackage.hba hbcVar;
        if (list.isEmpty()) {
            hbcVar = new defpackage.haz();
        } else {
            hbcVar = list.size() == 1 ? new defpackage.hbc(list) : new defpackage.hbb(list);
        }
        this.e = hbcVar;
    }

    private final float k() {
        float f = this.g;
        if (f != -1.0f) {
            return f;
        }
        float fB = this.e.b();
        this.g = fB;
        return fB;
    }

    public float a() {
        float f = this.h;
        if (f != -1.0f) {
            return f;
        }
        float fA = this.e.a();
        this.h = fA;
        return fA;
    }

    public final float b() {
        android.view.animation.Interpolator interpolator;
        defpackage.hgn hgnVarD = d();
        if (hgnVarD == null || hgnVarD.f() || (interpolator = hgnVarD.d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(c());
    }

    final float c() {
        if (!this.b) {
            defpackage.hgn hgnVarD = d();
            if (!hgnVarD.f()) {
                return (this.c - hgnVarD.c()) / (hgnVarD.b() - hgnVarD.c());
            }
        }
        return 0.0f;
    }

    public final defpackage.hgn d() {
        return this.e.c();
    }

    public java.lang.Object e() {
        android.view.animation.Interpolator interpolator;
        float fC = c();
        if (this.d == null && this.e.d(fC)) {
            return this.f;
        }
        defpackage.hgn hgnVarD = d();
        android.view.animation.Interpolator interpolator2 = hgnVarD.e;
        java.lang.Object objF = (interpolator2 == null || (interpolator = hgnVarD.f) == null) ? f(hgnVarD, b()) : g(hgnVarD, fC, interpolator2.getInterpolation(fC), interpolator.getInterpolation(fC));
        this.f = objF;
        return objF;
    }

    public abstract java.lang.Object f(defpackage.hgn hgnVar, float f);

    protected java.lang.Object g(defpackage.hgn hgnVar, float f, float f2, float f3) {
        throw new java.lang.UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public final void h(defpackage.hay hayVar) {
        this.a.add(hayVar);
    }

    public void i() {
        int i = 0;
        while (true) {
            java.util.List list = this.a;
            if (i >= list.size()) {
                return;
            }
            ((defpackage.hay) list.get(i)).d();
            i++;
        }
    }

    public void j(float f) {
        defpackage.hba hbaVar = this.e;
        if (hbaVar.e()) {
            return;
        }
        if (f < k()) {
            f = k();
        } else if (f > a()) {
            f = a();
        }
        if (f != this.c) {
            this.c = f;
            if (hbaVar.f(f)) {
                i();
            }
        }
    }
}
