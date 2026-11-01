package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oyf implements android.view.View.OnTouchListener {
    public boolean b;
    public android.animation.Animator c;
    private final ems d;
    private final android.view.View e;
    private final defpackage.oye f;
    private android.view.VelocityTracker g;
    private final defpackage.oxp h;
    private float j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private final float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private boolean t;
    private final float u;
    private final float v;
    private final float w;
    public boolean a = true;
    private boolean i = true;

    private oyf(ems emsVar, android.view.View view, defpackage.oye oyeVar) {
        this.d = emsVar;
        this.e = view;
        this.f = oyeVar;
        android.content.Context context = view.getContext();
        this.o = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.h = new defpackage.oxp(context);
        this.u = context.getResources().getDimension(2131165774);
        this.v = context.getResources().getDimension(2131165267);
        this.w = context.getResources().getDimension(2131167315);
    }

    public static defpackage.oyf e(ems emsVar, android.view.View view, defpackage.oye oyeVar) {
        defpackage.oyf oyfVar = new defpackage.oyf(emsVar, view, oyeVar);
        view.setOnTouchListener(oyfVar);
        return oyfVar;
    }

    private final float f(float f) {
        float f2 = this.s;
        boolean z = f > f2;
        return mni.cz(((f - f2) / ((z ? this.r : this.q) - f2)) * (true == z ? -1 : 1), -1.0f, 1.0f);
    }

    private final void g() {
        android.animation.Animator animator = this.c;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:52:0x0102  */
    /* JADX WARN: Code duplicated, block: B:53:0x0113  */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0169  */
    /* JADX WARN: Code duplicated, block: B:61:0x016e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0172  */
    /* JADX WARN: Code duplicated, block: B:64:0x0183  */
    /* JADX WARN: Code duplicated, block: B:69:0x019a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v22, types: [android.animation.TimeInterpolator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7, types: [android.animation.TimeInterpolator, java.lang.Object] */
    private final void h(android.view.MotionEvent motionEvent, float f, boolean z) {
        android.view.VelocityTracker velocityTracker;
        float yVelocity;
        float fCopySign;
        boolean z2;
        float f2;
        android.animation.ValueAnimator valueAnimatorOfFloat;
        defpackage.oxp oxpVar;
        float fAbs;
        float fAbs2;
        float f3;
        android.view.animation.PathInterpolator pathInterpolator;
        float f4;
        float f5;
        float fAbs3;
        float fAbs4;
        float f6;
        float f7;
        int i = -1;
        this.n = -1;
        if (this.b && this.l) {
            velocityTracker = this.g;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(1000);
                yVelocity = this.g.getYVelocity();
                fCopySign = java.lang.Math.copySign((float) java.lang.Math.hypot(this.g.getXVelocity(), this.g.getYVelocity()), yVelocity);
            } else {
                yVelocity = 0.0f;
                fCopySign = 0.0f;
            }
            z2 = this.t;
            if (z2) {
                i = 0;
            } else {
                i = 0;
            }
            f2 = i;
            valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(this.j, f2);
            valueAnimatorOfFloat.addUpdateListener(new mh(this, 6));
            oxpVar = this.h;
            if (i == 0) {
                float f8 = -this.j;
                double dSqrt = java.lang.Math.sqrt(java.lang.Math.abs(f8) / java.lang.Math.abs(f8)) * 0.6000000238418579d;
                fAbs3 = java.lang.Math.abs(f8);
                fAbs4 = java.lang.Math.abs(yVelocity);
                f6 = (2.857143f * fAbs3) / fAbs4;
                f7 = (float) dSqrt;
                if (f6 <= f7) {
                    oxpVar.d.a = oxpVar.a;
                } else {
                    if (fAbs4 >= oxpVar.b) {
                        defpackage.oxo oxoVar = new defpackage.oxo(f7, fAbs4, fAbs3);
                        defpackage.amdx amdxVar = oxpVar.d;
                        android.view.animation.Interpolator interpolator = oxpVar.a;
                        amdxVar.a = new defpackage.oxn(oxoVar, interpolator, interpolator);
                    } else {
                        oxpVar.d.a = defpackage.oyk.b;
                    }
                    f6 = f7;
                }
                defpackage.amdx amdxVar2 = oxpVar.d;
                valueAnimatorOfFloat.setDuration((long) (f6 * 1000.0f));
                valueAnimatorOfFloat.setInterpolator(amdxVar2.a);
                if (!z2) {
                    yVelocity = 0.0f;
                }
            } else {
                float f9 = f2 - this.j;
                double dPow = java.lang.Math.pow(java.lang.Math.abs(f9), 0.5d) * 0.6000000238418579d;
                fAbs = java.lang.Math.abs(f9);
                fAbs2 = java.lang.Math.abs(yVelocity);
                f3 = oxpVar.b;
                float fMax = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, (fAbs2 - f3) / (oxpVar.c - f3)));
                float f10 = ((1.0f - fMax) * 0.4f) + (fMax * 0.5f);
                pathInterpolator = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.5f, f10);
                f4 = ((f10 / 0.5f) * fAbs) / fAbs2;
                f5 = (float) dPow;
                if (f4 <= f5) {
                    oxpVar.d.a = pathInterpolator;
                } else {
                    if (fAbs2 >= f3) {
                        oxpVar.d.a = new defpackage.oxn(new defpackage.oxo(f5, fAbs2, fAbs), pathInterpolator, oxpVar.a);
                    } else {
                        oxpVar.d.a = defpackage.oyk.a;
                    }
                    f4 = f5;
                }
                defpackage.amdx amdxVar3 = oxpVar.d;
                valueAnimatorOfFloat.setDuration((long) (f4 * 1000.0f));
                valueAnimatorOfFloat.setInterpolator(amdxVar3.a);
            }
            if (yVelocity == 0.0f) {
                valueAnimatorOfFloat.setDuration(wsc.bp(this.e.getContext(), defpackage.urp.DURATION_MEDIUM_3));
            }
            valueAnimatorOfFloat.addListener(hrz.a(this.d, new defpackage.oxr(this, 7)));
            this.c = valueAnimatorOfFloat;
            valueAnimatorOfFloat.start();
            j();
        } else {
            if (java.lang.Math.abs(f - this.p) > this.o || motionEvent.getActionMasked() == 3 || z) {
                velocityTracker = this.g;
                if (velocityTracker != null) {
                    velocityTracker.computeCurrentVelocity(1000);
                    yVelocity = this.g.getYVelocity();
                    fCopySign = java.lang.Math.copySign((float) java.lang.Math.hypot(this.g.getXVelocity(), this.g.getYVelocity()), yVelocity);
                } else {
                    yVelocity = 0.0f;
                    fCopySign = 0.0f;
                }
                z2 = this.t;
                if (z2 || !this.l || z || motionEvent.getActionMasked() == 3) {
                    i = 0;
                } else {
                    float f11 = f(f);
                    float f12 = this.h.b;
                    if (fCopySign > 0.0f) {
                        f12 += f12;
                    }
                    if (this.i && java.lang.Math.abs(fCopySign) >= f12) {
                        int i2 = (fCopySign > 0.0f ? 1 : (fCopySign == 0.0f ? 0 : -1));
                        if ((i2 >>> 31) != (f11 <= 0.0f ? 0 : 1) && java.lang.Math.abs(f11) >= 0.1f) {
                            i = 0;
                        } else if (i2 < 0) {
                            i = 1;
                        }
                    } else if (java.lang.Math.abs(f11) <= 0.8f) {
                        i = 0;
                    } else if (f11 > 0.0f) {
                        i = 1;
                    }
                }
                f2 = i;
                valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(this.j, f2);
                valueAnimatorOfFloat.addUpdateListener(new mh(this, 6));
                oxpVar = this.h;
                if (i == 0) {
                    float f13 = -this.j;
                    double dSqrt2 = java.lang.Math.sqrt(java.lang.Math.abs(f13) / java.lang.Math.abs(f13)) * 0.6000000238418579d;
                    fAbs3 = java.lang.Math.abs(f13);
                    fAbs4 = java.lang.Math.abs(yVelocity);
                    f6 = (2.857143f * fAbs3) / fAbs4;
                    f7 = (float) dSqrt2;
                    if (f6 <= f7) {
                        oxpVar.d.a = oxpVar.a;
                    } else {
                        if (fAbs4 >= oxpVar.b) {
                            defpackage.oxo oxoVar2 = new defpackage.oxo(f7, fAbs4, fAbs3);
                            defpackage.amdx amdxVar4 = oxpVar.d;
                            android.view.animation.Interpolator interpolator2 = oxpVar.a;
                            amdxVar4.a = new defpackage.oxn(oxoVar2, interpolator2, interpolator2);
                        } else {
                            oxpVar.d.a = defpackage.oyk.b;
                        }
                        f6 = f7;
                    }
                    defpackage.amdx amdxVar5 = oxpVar.d;
                    valueAnimatorOfFloat.setDuration((long) (f6 * 1000.0f));
                    valueAnimatorOfFloat.setInterpolator(amdxVar5.a);
                    if (!z2) {
                        yVelocity = 0.0f;
                    }
                } else {
                    float f14 = f2 - this.j;
                    double dPow2 = java.lang.Math.pow(java.lang.Math.abs(f14), 0.5d) * 0.6000000238418579d;
                    fAbs = java.lang.Math.abs(f14);
                    fAbs2 = java.lang.Math.abs(yVelocity);
                    f3 = oxpVar.b;
                    float fMax2 = java.lang.Math.max(0.0f, java.lang.Math.min(1.0f, (fAbs2 - f3) / (oxpVar.c - f3)));
                    float f15 = ((1.0f - fMax2) * 0.4f) + (fMax2 * 0.5f);
                    pathInterpolator = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.5f, f15);
                    f4 = ((f15 / 0.5f) * fAbs) / fAbs2;
                    f5 = (float) dPow2;
                    if (f4 <= f5) {
                        oxpVar.d.a = pathInterpolator;
                    } else {
                        if (fAbs2 >= f3) {
                            oxpVar.d.a = new defpackage.oxn(new defpackage.oxo(f5, fAbs2, fAbs), pathInterpolator, oxpVar.a);
                        } else {
                            oxpVar.d.a = defpackage.oyk.a;
                        }
                        f4 = f5;
                    }
                    defpackage.amdx amdxVar6 = oxpVar.d;
                    valueAnimatorOfFloat.setDuration((long) (f4 * 1000.0f));
                    valueAnimatorOfFloat.setInterpolator(amdxVar6.a);
                }
                if (yVelocity == 0.0f) {
                    valueAnimatorOfFloat.setDuration(wsc.bp(this.e.getContext(), defpackage.urp.DURATION_MEDIUM_3));
                }
                valueAnimatorOfFloat.addListener(hrz.a(this.d, new defpackage.oxr(this, 7)));
                this.c = valueAnimatorOfFloat;
                valueAnimatorOfFloat.start();
                j();
            } else {
                j();
                c(0.0f);
                b();
            }
        }
        android.view.VelocityTracker velocityTracker2 = this.g;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.g = null;
        }
    }

    private final void i() {
        this.b = true;
        this.f.d();
    }

    private final void j() {
        this.b = false;
        this.f.e();
    }

    private final void k(float f, boolean z, float f2) {
        this.p = f;
        this.m = false;
        if (f2 <= 0.25d) {
            this.q = f - this.v;
            this.r = java.lang.Math.min(this.e.getHeight(), this.p + this.w);
            this.s = this.p;
        }
        if (z) {
            this.l = true;
            i();
            c(f2);
        }
    }

    private final void l(android.view.MotionEvent motionEvent) {
        android.view.VelocityTracker velocityTracker = this.g;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
    }

    public final void a() {
        g();
        this.a = false;
    }

    public final void b() {
        float f = this.j;
        defpackage.oye oyeVar = this.f;
        if (f == 0.0f) {
            oyeVar.b(!this.m);
        } else {
            oyeVar.a(f > 0.0f);
        }
    }

    public final void c(float f) {
        if (java.lang.Math.abs(f) > 0.1f) {
            this.m = true;
        }
        this.j = f;
        this.f.c(f);
    }

    public final void d() {
        this.i = false;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int pointerId;
        if (!this.a) {
            return false;
        }
        if (this.k && motionEvent.getActionMasked() != 0) {
            return false;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(this.n);
        if (iFindPointerIndex < 0) {
            this.n = motionEvent.getPointerId(0);
            iFindPointerIndex = 0;
        }
        float y = motionEvent.getY(iFindPointerIndex);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.k = false;
            k(y, false, this.j);
            this.t = false;
            this.f.f(motionEvent);
            if (this.g == null) {
                this.g = android.view.VelocityTracker.obtain();
            }
            l(motionEvent);
            g();
            this.l = this.c != null;
            i();
        } else if (actionMasked == 1) {
            l(motionEvent);
            h(motionEvent, y, false);
        } else if (actionMasked == 2) {
            float f = y - this.p;
            if (java.lang.Math.abs(f) > this.o) {
                this.l = true;
            }
            if (java.lang.Math.abs(f) >= this.u) {
                this.t = true;
            }
            c(f(y));
            l(motionEvent);
        } else if (actionMasked == 3) {
            l(motionEvent);
            h(motionEvent, y, false);
        } else {
            if (actionMasked == 5) {
                this.k = true;
                h(motionEvent, y, true);
                return false;
            }
            if (actionMasked == 6 && this.n == (pointerId = motionEvent.getPointerId(motionEvent.getActionIndex()))) {
                int i = motionEvent.getPointerId(0) == pointerId ? 1 : 0;
                float y2 = motionEvent.getY(i);
                this.n = motionEvent.getPointerId(i);
                k(y2, true, this.j);
            }
        }
        return true;
    }
}
