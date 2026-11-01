package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hgg extends defpackage.hgc implements android.view.Choreographer.FrameCallback {
    public defpackage.gzh j;
    public float c = 1.0f;
    private boolean m = false;
    public long d = 0;
    public float e = 0.0f;
    public float f = 0.0f;
    public int g = 0;
    public float h = -2.1474836E9f;
    public float i = 2.1474836E9f;
    public boolean k = false;
    public boolean l = false;

    public final float c() {
        defpackage.gzh gzhVar = this.j;
        if (gzhVar == null) {
            return 0.0f;
        }
        float f = this.f;
        float f2 = gzhVar.j;
        return (f - f2) / (gzhVar.k - f2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((android.animation.Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        a(l());
        h(true);
    }

    public final float d() {
        defpackage.gzh gzhVar = this.j;
        if (gzhVar == null) {
            return 0.0f;
        }
        float f = this.i;
        return f == 2.1474836E9f ? gzhVar.k : f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        g();
        defpackage.gzh gzhVar = this.j;
        if (gzhVar == null || !this.k) {
            return;
        }
        long j2 = this.d;
        long j3 = j2 != 0 ? j - j2 : 0L;
        float fAbs = (1.0E9f / gzhVar.l) / java.lang.Math.abs(this.c);
        float f = this.e;
        float f2 = j3 / fAbs;
        if (l()) {
            f2 = -f2;
        }
        float f3 = f + f2;
        float fE = e();
        float fD = d();
        int i = defpackage.hgh.a;
        boolean z = f3 >= fE && f3 <= fD;
        float f4 = this.e;
        float fMax = java.lang.Math.max(e(), java.lang.Math.min(d(), f3));
        this.e = fMax;
        if (this.l) {
            fMax = (float) java.lang.Math.floor(fMax);
        }
        this.f = fMax;
        this.d = j;
        if (!this.l || this.e != f4) {
            b();
        }
        if (!z) {
            if (getRepeatCount() == -1 || this.g < getRepeatCount()) {
                java.util.Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((android.animation.Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.g++;
                if (getRepeatMode() == 2) {
                    this.m = !this.m;
                    i();
                } else {
                    float fD2 = l() ? d() : e();
                    this.e = fD2;
                    this.f = fD2;
                }
                this.d = j;
            } else {
                float fE2 = this.c < 0.0f ? e() : d();
                this.e = fE2;
                this.f = fE2;
                h(true);
                a(l());
            }
        }
        if (this.j != null) {
            float f5 = this.f;
            float f6 = this.h;
            if (f5 < f6 || f5 > this.i) {
                throw new java.lang.IllegalStateException(java.lang.String.format("Frame must be [%f,%f]. It is %f", java.lang.Float.valueOf(f6), java.lang.Float.valueOf(this.i), java.lang.Float.valueOf(this.f)));
            }
        }
    }

    public final float e() {
        defpackage.gzh gzhVar = this.j;
        if (gzhVar == null) {
            return 0.0f;
        }
        float f = this.h;
        return f == -2.1474836E9f ? gzhVar.j : f;
    }

    public final void f() {
        h(true);
        a(l());
    }

    public final void g() {
        if (this.k) {
            h(false);
            android.view.Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fD;
        float fE;
        if (this.j == null) {
            return 0.0f;
        }
        if (l()) {
            fD = d();
            fE = this.f;
        } else {
            fD = this.f;
            fE = e();
        }
        return (fD - fE) / (d() - e());
    }

    @Override // android.animation.ValueAnimator
    public final java.lang.Object getAnimatedValue() {
        return java.lang.Float.valueOf(c());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        defpackage.gzh gzhVar = this.j;
        if (gzhVar == null) {
            return 0L;
        }
        return (long) gzhVar.a();
    }

    public final void h(boolean z) {
        android.view.Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.k = false;
        }
    }

    public final void i() {
        this.c = -this.c;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.k;
    }

    public final void j(float f) {
        if (this.e != f) {
            float fE = e();
            float fD = d();
            int i = defpackage.hgh.a;
            float fMax = java.lang.Math.max(fE, java.lang.Math.min(fD, f));
            this.e = fMax;
            if (this.l) {
                fMax = (float) java.lang.Math.floor(fMax);
            }
            this.f = fMax;
            this.d = 0L;
            b();
        }
    }

    public final void k(float f, float f2) {
        float f3;
        float f4;
        if (f > f2) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("minFrame (%s) must be <= maxFrame (%s)", java.lang.Float.valueOf(f), java.lang.Float.valueOf(f2)));
        }
        defpackage.gzh gzhVar = this.j;
        if (gzhVar == null) {
            f4 = -3.4028235E38f;
            f3 = Float.MAX_VALUE;
        } else {
            float f5 = gzhVar.j;
            f3 = gzhVar.k;
            f4 = f5;
        }
        int i = defpackage.hgh.a;
        float fMax = java.lang.Math.max(f4, java.lang.Math.min(f3, f));
        float fMax2 = java.lang.Math.max(f4, java.lang.Math.min(f3, f2));
        if (fMax == this.h && fMax2 == this.i) {
            return;
        }
        this.h = fMax;
        this.i = fMax2;
        j((int) java.lang.Math.max(fMax, java.lang.Math.min(fMax2, this.f)));
    }

    public final boolean l() {
        return this.c < 0.0f;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.m) {
            return;
        }
        this.m = false;
        i();
    }
}
