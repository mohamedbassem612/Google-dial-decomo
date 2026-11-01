package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ejz extends defpackage.ejx {
    public eka t;
    private float u;
    private boolean v;

    public ejz(agkk agkkVar) {
        super(agkkVar);
        this.t = null;
        this.u = Float.MAX_VALUE;
        this.v = false;
    }

    @Override // defpackage.ejx
    public final void b() {
        if (!ejk.a().b()) {
            throw new android.util.AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (this.n) {
            super.c(true);
        }
        float f = this.u;
        if (f != Float.MAX_VALUE) {
            eka ekaVar = this.t;
            if (ekaVar == null) {
                this.t = new eka(f);
            } else {
                ekaVar.d(f);
            }
            this.u = Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [android.animation.ValueAnimator$DurationScaleChangeListener, java.lang.Object] */
    @Override // defpackage.ejx
    public final void e() {
        eka ekaVar = this.t;
        if (ekaVar == null) {
            throw new java.lang.UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dA = ekaVar.a();
        if (dA > this.o) {
            throw new java.lang.UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dA < this.p) {
            throw new java.lang.UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = java.lang.Math.abs(this.q * 0.75f);
        ekaVar.c = dAbs;
        ekaVar.d = dAbs * 62.5d;
        if (!ejk.a().b()) {
            throw new android.util.AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.n;
        if (z || z) {
            return;
        }
        this.n = true;
        if (!this.k) {
            this.j = this.m.a(this.l);
        }
        float f = this.j;
        if (f > this.o || f < this.p) {
            throw new java.lang.IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ejk ejkVarA = ejk.a();
        java.util.ArrayList arrayList = ejkVarA.b;
        if (arrayList.size() == 0) {
            ejkVarA.g.u(ejkVarA.c);
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                ejkVarA.e = ae$.ExternalSyntheticApiModelOutline0.m();
                if (ejkVarA.f == null) {
                    ejkVarA.f = new fje(ejkVarA);
                }
                fje fjeVar = ejkVarA.f;
                if (fjeVar.a == null) {
                    fjeVar.a = new agir(fjeVar, 1);
                    ae$.ExternalSyntheticApiModelOutline0.m((android.animation.ValueAnimator.DurationScaleChangeListener) fjeVar.a);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    @Override // defpackage.ejx
    public final boolean f(long j) {
        float f;
        boolean z = this.v;
        float f2 = this.u;
        if (z) {
            if (f2 != Float.MAX_VALUE) {
                this.t.d(f2);
                this.u = Float.MAX_VALUE;
            }
            this.j = this.t.a();
            this.i = 0.0f;
            this.v = false;
            return true;
        }
        eka ekaVar = this.t;
        if (f2 != Float.MAX_VALUE) {
            long j2 = j / 2;
            eju ejuVarB = ekaVar.b(this.j, this.i, j2);
            this.t.d(this.u);
            this.u = Float.MAX_VALUE;
            eju ejuVarB2 = this.t.b(ejuVarB.a, ejuVarB.b, j2);
            f = ejuVarB2.a;
            this.j = f;
            this.i = ejuVarB2.b;
        } else {
            eju ejuVarB3 = ekaVar.b(this.j, this.i, j);
            f = ejuVarB3.a;
            this.j = f;
            this.i = ejuVarB3.b;
        }
        float fMax = java.lang.Math.max(f, this.p);
        this.j = fMax;
        float fMin = java.lang.Math.min(fMax, this.o);
        this.j = fMin;
        float f3 = this.i;
        eka ekaVar2 = this.t;
        if (java.lang.Math.abs(f3) >= ekaVar2.d || java.lang.Math.abs(fMin - ekaVar2.a()) >= ekaVar2.c) {
            return false;
        }
        this.j = this.t.a();
        this.i = 0.0f;
        return true;
    }

    public final void j(float f) {
        if (this.n) {
            this.u = f;
            return;
        }
        eka ekaVar = this.t;
        if (ekaVar == null) {
            ekaVar = new eka(f);
            this.t = ekaVar;
        }
        ekaVar.d(f);
        e();
    }

    public final void k() {
        if (!l()) {
            throw new java.lang.UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!ejk.a().b()) {
            throw new android.util.AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.n) {
            this.v = true;
        }
    }

    public final boolean l() {
        return this.t.b > 0.0d;
    }

    public ejz(java.lang.Object obj, defpackage.ejy ejyVar) {
        super(obj, ejyVar);
        this.t = null;
        this.u = Float.MAX_VALUE;
        this.v = false;
    }
}
