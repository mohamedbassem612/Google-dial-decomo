package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class afyf extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable {
    private static final android.util.Property a = new defpackage.afye(java.lang.Float.class);
    private android.animation.ValueAnimator b;
    private android.animation.ValueAnimator c;
    private float e;
    final android.content.Context i;
    final defpackage.afxn j;
    public java.util.List k;
    public boolean l;
    public int n;
    private final float d = -1.0f;
    final android.graphics.Paint m = new android.graphics.Paint();
    final android.graphics.Rect o = new android.graphics.Rect();
    final defpackage.aftt p = new defpackage.aftt();

    public afyf(android.content.Context context, defpackage.afxn afxnVar) {
        this.i = context;
        this.j = afxnVar;
        setAlpha(255);
    }

    private final void a(android.animation.ValueAnimator... valueAnimatorArr) {
        boolean z = this.l;
        this.l = true;
        valueAnimatorArr[0].end();
        this.l = z;
    }

    public boolean e(boolean z, boolean z2, boolean z3) {
        android.animation.ValueAnimator valueAnimator;
        android.animation.ValueAnimator valueAnimator2;
        if (this.b == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<defpackage.afyf, java.lang.Float>) a, 0.0f, 1.0f);
            this.b = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.b.setInterpolator(afpc.b);
            android.animation.ValueAnimator valueAnimator3 = this.b;
            if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                throw new java.lang.IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.b = valueAnimator3;
            valueAnimator3.addListener(new defpackage.afyc(this));
        }
        if (this.c == null) {
            android.animation.ObjectAnimator objectAnimatorOfFloat2 = android.animation.ObjectAnimator.ofFloat(this, (android.util.Property<defpackage.afyf, java.lang.Float>) a, 1.0f, 0.0f);
            this.c = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.c.setInterpolator(afpc.b);
            android.animation.ValueAnimator valueAnimator4 = this.c;
            if (valueAnimator4 != null && valueAnimator4.isRunning()) {
                throw new java.lang.IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.c = valueAnimator4;
            valueAnimator4.addListener(new defpackage.afyd(this));
        }
        if (!isVisible() && !z) {
            return false;
        }
        if (z) {
            valueAnimator = this.b;
            valueAnimator2 = this.c;
        } else {
            valueAnimator = this.c;
            valueAnimator2 = this.b;
        }
        if (!z3) {
            if (valueAnimator2.isRunning()) {
                boolean z4 = this.l;
                this.l = true;
                valueAnimator2.cancel();
                this.l = z4;
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                a(valueAnimator);
            }
            return super.setVisible(z, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z5 = !z || super.setVisible(true, false);
        defpackage.afxn afxnVar = this.j;
        if (!(z ? afxnVar.e() : afxnVar.d())) {
            a(valueAnimator);
        } else if (z2 || !valueAnimator.isPaused()) {
            valueAnimator.start();
        } else {
            valueAnimator.resume();
        }
        return z5;
    }

    final float f() {
        defpackage.afxn afxnVar = this.j;
        if (afxnVar.e() || afxnVar.d()) {
            return this.e;
        }
        return 1.0f;
    }

    final float g() {
        int i;
        float f = this.d;
        if (f > 0.0f) {
            return f;
        }
        defpackage.afxn afxnVar = this.j;
        boolean z = this instanceof defpackage.afyb;
        if (afxnVar.c(z) && (i = afxnVar.m) != 0) {
            float fE = defpackage.aftt.e(this.i.getContentResolver());
            if (fE > 0.0f) {
                int i2 = (int) ((((z ? afxnVar.j : afxnVar.k) * 1000.0f) / i) * fE);
                float fUptimeMillis = (android.os.SystemClock.uptimeMillis() % ((long) i2)) / i2;
                return fUptimeMillis < 0.0f ? (fUptimeMillis % 1.0f) + 1.0f : fUptimeMillis;
            }
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h(gls glsVar) {
        if (this.k == null) {
            this.k = new java.util.ArrayList();
        }
        if (this.k.contains(glsVar)) {
            return;
        }
        this.k.add(glsVar);
    }

    final void i(float f) {
        if (this.e != f) {
            this.e = f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return k() || j();
    }

    public final boolean j() {
        android.animation.ValueAnimator valueAnimator = this.c;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final boolean k() {
        android.animation.ValueAnimator valueAnimator = this.b;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final boolean l(boolean z, boolean z2, boolean z3) {
        float fE = defpackage.aftt.e(this.i.getContentResolver());
        boolean z4 = false;
        if (z3 && fE > 0.0f) {
            z4 = true;
        }
        return e(z, z2, z4);
    }

    public final void n(gls glsVar) {
        java.util.List list = this.k;
        if (list == null || !list.contains(glsVar)) {
            return;
        }
        this.k.remove(glsVar);
        if (this.k.isEmpty()) {
            this.k = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.n = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.m.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return l(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        e(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        e(false, true, false);
    }
}
